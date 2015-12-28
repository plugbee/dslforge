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
package org.dslforge.xtext.generator.ui.factories;

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

public class WebPluginProjectFactory extends PluginProjectFactory implements IWebProjectFactory{

	private final Grammar grammar;

	public WebPluginProjectFactory(Grammar grammar) {
		super();
		workspace = ResourcesPlugin.getWorkspace();
		workbench = PlatformUI.getWorkbench();
		this.grammar = grammar;
	}

	@Override
	protected void enhanceProject(IProject project, SubMonitor subMonitor, Shell shell) throws CoreException {
		super.enhanceProject(project, subMonitor, shell);
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
		content.append("<!-- @generated dslforge -->\n");
		content.append("<plugin>\n");
		content.append("      <extension\n");
		content.append("         point=\"org.eclipse.rap.ui.resources\">\n");
		content.append("      <resource\n");
		content.append("          class=\"" + project.getName() + ".editor.widget." + grammarShortName + "Resource\">\n");
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
		content.append("   <extension point=\"org.eclipse.ui.editors\">\n");
		content.append("      <editor\n");
		content.append("            id=\"" + project.getName() + ".editor"+"\"\n");
		content.append("            name=\"" + grammarShortName + " Model Editor\"\n");
		content.append("		            extensions=\"" + fileExtension + "\"\n");
		content.append("           class=\"" + project.getName() + ".editor."+ grammarShortName + "Editor\"\n");
		content.append("            contributorClass=\"" + project.getName() + ".editor." + grammarShortName + "ActionBarContributor\">\n");
		content.append("      </editor>\n");
		content.append("   </extension>\n");
		content.append("   <extension\n");		
		content.append("     point=\"org.dslforge.xtext.common.contribution\">\n");
		content.append("  <contribution\n");
		content.append("       class=\"" + project.getName() + "." + grammarShortName + "ExecutableExtensionFactory\"\n");
		content.append("         extension=\"" + fileExtension + "\"\n");
		content.append("        label=\""+ grammar.getName() + "\">\n");
		content.append("  </contribution>\n");
		content.append("</extension>\n");		
		content.append("</plugin>\n");
		SubMonitor subMonitor = SubMonitor.convert(progressMonitor, 2);
		try {
			createFile("plugin.xml", project, content.toString(), subMonitor.newChild(1));
		} finally {
			subMonitor.done();
		}
	}

	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
}
