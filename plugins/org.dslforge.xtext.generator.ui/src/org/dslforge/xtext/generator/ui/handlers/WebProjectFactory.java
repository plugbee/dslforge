/**
 * <copyright>
 *
 * Copyright (c) 2015 PlugBee. All rights reserved.
 * 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Amine Lajmi - Initial API and implementation
 *
 * </copyright>
 */
package org.dslforge.xtext.generator.ui.handlers;

import java.util.Iterator;

import org.dslforge.xtext.generator.util.GeneratorUtil;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ui.util.PluginProjectFactory;

public class WebProjectFactory extends PluginProjectFactory{

	Grammar grammar;
	
	//We don't care about injection
	public WebProjectFactory(Grammar grammar) {
		super();
		workspace = ResourcesPlugin.getWorkspace();
		workbench = PlatformUI.getWorkbench();
		this.grammar = grammar;
	}

	@Override
	protected void enhanceProject(IProject project, SubMonitor subMonitor, Shell shell) throws CoreException {
		super.enhanceProject(project, subMonitor, shell);
		//setActivatorClassName(project.getName()+ ".internal.Activator");
		createPluginXml(project, subMonitor.newChild(1));
	}

	@Override
	protected void createManifest(IProject project, IProgressMonitor progressMonitor) throws CoreException {
		final StringBuilder content = new StringBuilder("Manifest-Version: 1.0\n");
		content.append("Bundle-ManifestVersion: 2\n");
		content.append("Bundle-Name: " + projectName + "\n");
		content.append("Bundle-Vendor: My Company\n");
		content.append("Bundle-Version: 1.0.0.qualifier\n");
		content.append("Bundle-SymbolicName: " + projectName + "; singleton:=true\n");
		if (null != activatorClassName) {
			content.append("Bundle-Activator: " + activatorClassName + "\n");
		}
		content.append("Bundle-ActivationPolicy: lazy\n");
		content.append("Bundle-Activator: "+ getActivatorClassName() + "\n");

		addToContent(content, requiredBundles, "Require-Bundle");
		addToContent(content, exportedPackages, "Export-Package");
		addToContent(content, importedPackages, "Import-Package");

		content.append("Bundle-RequiredExecutionEnvironment: JavaSE-1.7\n");

		final IFolder metaInf = project.getFolder("META-INF");
		SubMonitor subMonitor = SubMonitor.convert(progressMonitor, 2);
		try {
			if (metaInf.exists())
				metaInf.delete(false, progressMonitor);
			metaInf.create(false, true, subMonitor.newChild(1));
			createFile("MANIFEST.MF", metaInf, content.toString(), subMonitor.newChild(1));
		} finally {
			subMonitor.done();
		}
	}
	
    protected String getActivatorClassName() {
        return projectName + ".internal" + ".Activator";
    }
	

	@Override
	protected void createBuildProperties(IProject project, IProgressMonitor progressMonitor) {
		final StringBuilder content = new StringBuilder("source.. = ");
		for (final Iterator<String> iterator = folders.iterator(); iterator.hasNext();) {
			content.append(iterator.next()).append('/');
			if (iterator.hasNext()) {
				content.append(",\\\n");
				//              source.. =
				content.append("          ");
			}
		}
		content.append("\n");
		content.append("bin.includes = META-INF/,\\\n");
		content.append("               .,\\\n");
		content.append("               plugin.xml,\\");
		content.append("			   src-js/\n");
		content.append("               data/,\\\n");
		content.append("               theme/");
		createFile("build.properties", project, content.toString(), progressMonitor);
	}
	
	protected void createPluginXml(IProject project, IProgressMonitor progressMonitor) throws CoreException {
		String grammarShortName = GeneratorUtil.getGrammarShortName(grammar);
		String fileExtension = GeneratorUtil.getFileExtension(grammar);
		final StringBuilder content = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		content.append("<?eclipse version=\"3.4\"?>\n");
		content.append("<plugin>\n");
		/*
		content.append("<!-- @generated dslforge -->\n");
		content.append("<extension point=\"org.eclipse.rap.ui.entrypoint\">\n");
		content.append("	<entrypoint\n");
		content.append("		class=\"" + project.getName() + "." + grammarShortName+ "Workbench\"\n");
		content.append("			id=\"org.dslforge.core.ui.entrypoint\"\n");
		content.append("			path=\"/" + grammarShortName.toLowerCase() + "\">\n");
		content.append("		</entrypoint>\n");
		content.append("	</extension>\n");	
		
		content.append("	<!-- @generated dslforge -->\n");
		content.append("	<extension\n");
		content.append("		id=\"org.dslforge.core.ui.application\"\n");
		content.append("				point=\"org.eclipse.core.runtime.applications\">\n");
		content.append("		<application>\n");
		content.append("			<run\n");
		content.append("				class=\"" + project.getName() + "." + grammarShortName+ "Application\">\n");
		content.append("			</run>\n");
		content.append("		</application>\n");
		content.append("	</extension>\n");
		
		content.append("<!-- @generated dslforge -->\n");
		content.append("	<extension\n");
		content.append("		point=\"org.eclipse.ui.perspectives\">\n");
		content.append("		<perspective\n");
		content.append("			name=\"" + grammarShortName + " Perspective\"\n");
		content.append("			class=\"" + project.getName() + ".parts." + grammarShortName+ "Perspective\"\n");
		content.append("				id=\"org.dslforge.core.ui.parts.perspective\">\n");
		content.append("		</perspective>\n");
		content.append("	</extension>\n");	
		
		content.append("	<!-- @generated dslforge -->\n");
		content.append("			<extension\n");
		content.append("				point=\"org.eclipse.ui.views\">\n");
		content.append("		<view\n");
		content.append("			name=\"" + grammarShortName + " View\"\n");
		content.append("			class=\"" + project.getName() + ".parts." + grammarShortName+ "View\"\n");
		content.append("			id=\"org.dslforge.core.ui.parts.view\">\n");
		content.append("		</view>\n");
		content.append("	</extension>\n");	
		
		content.append("	<!-- @generated dslforge -->\n");
		content.append("	<!--\n");
		content.append("	<extension\n");
		content.append("		point=\"org.eclipse.ui.presentationFactories\">\n");
		content.append("		<factory\n");
		content.append("			class=\"" + project.getName() + ".presentation." + grammarShortName+ "Factory\"\n");
		content.append("			id=\"org.dslforge.core.ui.presentation\"\n");
		content.append("			name=\"Platform Presentation\">\n");
		content.append("		</factory>\n");
		content.append("	</extension>\n");
		content.append("	-->\n");		
		
		content.append("	<!-- @generated dslforge -->\n");
		content.append("    <extension point=\"org.eclipse.ui.commands\">\n");
		content.append("    	<command\n");
		content.append("           categoryId=\"org.eclipse.ui.category.file\"\n");
		content.append("          description=\"Opens an Xtext model loading it from a URI\"\n");
		content.append("           id=\"org.dslforge.core.ui.actions.commands.OpenURICommand\"\n");
		content.append("           name=\"Open URI...\"/>\n");
		content.append("   </extension>\n");
		   */
		/*
		content.append("   <!-- @generated dslforge -->\n");
		content.append("   <extension point=\"org.eclipse.ui.actionSets\">\n");
		content.append("      <actionSet\n");
		content.append("            label=\"Basic Action Set\"\n");
		content.append("            visible=\"true\"\n");
		content.append("            id=\"org.dslforge.core.ui.actionset\">\n");
		content.append("         <action\n");
		content.append("               label=\"About...\"\n");
		content.append("               class=\"" + project.getName()+ ".actions.AboutAction\"\n");
		content.append("               menubarPath=\"help/additions\"\n");
		content.append("               id=\"org.dslforge.core.ui.actions.aboutaction\"/>\n");
		content.append("         <action\n");
		content.append("               label=\"Open URI...\"\n");
		content.append("               definitionId=\"org.dslforge.core.ui.actions.commands.OpenURICommand\"\n");
		content.append("               class=\"" + project.getName() + ".actions.OpenURIAction\"\n");
		content.append("               menubarPath=\"file/additions\"\n");
		content.append("               id=\"org.dslforge.core.ui.actions.openuriaction\"/>\n");
		content.append("      </actionSet>\n");
		content.append("   </extension>\n");
		*/   
		/*   
		content.append("   <!-- @generated dslforge -->\n");
		content.append("   <!--\n");
		content.append("   <extension point=\"org.eclipse.ui.actionSets\">\n");
		content.append("      <actionSet\n");
		content.append("            label=\"Basic Model Action Set\"\n");
		content.append("	            visible=\"true\"\n");
		content.append("=\"org.dslforge.core.ui.model.actionset\">\n");
		content.append("         <action\n");
		content.append("               label=\"" + grammarShortName + " Model\"\n");
		content.append("               class=\"org.dslforge.core.ui.actions.NewModelAction\"\n");
		content.append("               menubarPath=\"file/new/additions\"\n");
		content.append("               id=\"org.dslforge.core.ui.actions.newmodelaction\"/>\n");
		content.append("      </actionSet>\n");
		content.append("   </extension>\n");
		content.append("   -->  \n");
		*/
		content.append("      <extension\n");
		content.append("         point=\"org.eclipse.rap.ui.resources\">\n");
		content.append("      <resource\n");
		content.append("          class=\"" + project.getName() + ".editor.widget." + grammarShortName + "Resource\">\n");
		content.append("      </resource>\n");
		content.append("      <resource\n");
		content.append("          class=\"" + project.getName() + ".editor.widget." + "GlobalIndexResource\">\n");
		content.append("      </resource>\n");
		content.append("   </extension>\n");

		content.append("   <extension\n");
		content.append("         point=\"org.eclipse.rap.ui.themeableWidgets\">\n");
		content.append("      <widget\n");
		content.append("            class=\"" + project.getName() + ".editor.widget." + grammarShortName + "\"\n");
		content.append("            id=\"" + project.getName() + ".editor.widget." + grammarShortName +"\"\n");
		content.append("            name=\"" + grammarShortName + "\">\n");
		content.append("      </widget>\n");
		content.append("   </extension>\n");

		content.append("      <!-- @generated dslforge -->\n");
		content.append("   <extension point=\"org.eclipse.ui.editors\">\n");
		content.append("      <editor\n");
		content.append("            id=\"" + project.getName() + ".editor"+"\"\n");
		content.append("            name=\"" + grammarShortName + " Model Editor\"\n");
		content.append("	            icon=\"icons/model.png\"\n");
		content.append("		            extensions=\"" + fileExtension + "\"\n");
		content.append("           class=\"" + project.getName() + ".editor."+ grammarShortName + "Editor\"\n");
		content.append("            contributorClass=\"" + project.getName() + ".editor." + grammarShortName + "ActionBarContributor\">\n");
		content.append("      </editor>\n");
		content.append("   </extension>\n");
		   
		content.append("      <!-- @generated dslforge -->\n");
		content.append("   <extension point=\"org.eclipse.ui.actionSets\">\n");
		content.append("      <actionSet\n");
		content.append("            label=\"" + grammarShortName + " Action Set\"\n");
		content.append("            visible=\"true\"\n");
		content.append("            id=\"org.dslforge.core.ui.model.actionset\">\n");
		content.append("         <action\n");
		content.append("               label=\""+ grammarShortName + " file" + "\"\n");
		content.append("               class=\"" + project.getName() + ".actions.New" + grammarShortName + "Action\"\n");
		content.append("              menubarPath=\"file/new/additions\"\n");
		content.append("               id=\"" + project.getName() + ".wizard.new" + grammarShortName + "Action\"/>\n");
		content.append("      </actionSet>\n");
		content.append("   </extension>\n");
		
		content.append("   <extension\n");
		content.append("     point=\"org.dslforge.workbench.contribution\">\n");
		content.append("  <generator\n");
		content.append("       class=\"" + project.getName() + "." + grammarShortName + "ExecutableExtensionFactory\"\n");
		content.append("         extension=\"" + fileExtension + "\"\n");
		content.append("        label=\""+ grammar.getName() + "\">\n");
		content.append("  </generator>\n");
		content.append("</extension>\n");
		
		
		
		
/*		
		content.append("<!-- Branding -->");

		content.append("<extension\n");
		content.append("     point=\"org.eclipse.rap.ui.branding\">\n");
		content.append("<branding\n");
		content.append("         id=\"" + project.getName()+ ".branding\"\n");
		content.append("         themeId=\"org.eclipse.rap.design.example.business.theme\"\n");
		content.append("/>\n");
		content.append("</extension>\n");

		content.append("  <extension\n");
		content.append("      point=\"org.eclipse.rap.ui.themes\">\n");
		content.append("    <themeContribution\n");
		content.append("        themeId=\"org.eclipse.rap.design.example.business.theme\"\n");
		content.append("        file=\"theme/business.css\" />\n");
		content.append("  </extension>\n");
*/		
		
		content.append("</plugin>\n");

		
		SubMonitor subMonitor = SubMonitor.convert(progressMonitor, 2);
		try {
			createFile("plugin.xml", project, content.toString(), subMonitor.newChild(1));
		} finally {
			subMonitor.done();
		}
	}
}
