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
package org.dslforge.xtext.generator.web.wizards

import org.dslforge.xtext.generator.IWebProjectGenerator
import org.dslforge.xtext.generator.util.GeneratorUtil
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.generator.IFileSystemAccess

class GenGeneratorWizard implements IWebProjectGenerator{
	
	val relativePath = "/wizards/"
	var String projectName
	var String dslProjectName
	var String grammarShortName
	var String basePath
	var String fileExtension
	var String metamodelPackage
	var Grammar grammar

	override doGenerate(EObject input, IFileSystemAccess fsa) {
		grammar = input as Grammar
		projectName=GeneratorUtil::getProjectName(grammar)
		dslProjectName=GeneratorUtil::getDslProjectName(grammar)
		grammarShortName= GeneratorUtil::getGrammarShortName(grammar)
		basePath=GeneratorUtil::getBasePath(grammar)
		fileExtension = GeneratorUtil::getFileExtension(grammar)
		metamodelPackage = GeneratorUtil::getMetamodelPackage(grammar)
		fsa.generateFile(basePath + relativePath + "GeneratorWizard.java", "src", toJava())
	}
	
	def toJava()'''
		package «projectName».wizards;
		
		import java.util.HashMap;
		import java.util.HashSet;
		import java.util.Map;
		import java.util.Map.Entry;
		import java.util.Set;
		
		import org.eclipse.emf.common.util.URI;
		import org.eclipse.emf.ecore.resource.Resource;
		import org.eclipse.jface.dialogs.IDialogSettings;
		import org.eclipse.jface.wizard.Wizard;
		import org.eclipse.ui.internal.WorkbenchPlugin;
		import «dslProjectName».«grammarShortName»StandaloneSetup;
		import «dslProjectName».generator.«grammarShortName»Generator;
		import org.eclipse.xtext.generator.IFileSystemAccess;
		import org.eclipse.xtext.generator.IGenerator;
		import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
		import org.eclipse.xtext.generator.OutputConfiguration;
		import org.eclipse.xtext.resource.XtextResourceSet;
		
		import com.google.common.base.Function;
		import com.google.common.collect.Maps;
		import com.google.inject.Injector;
		
		@SuppressWarnings("restriction")
		public class GeneratorWizard extends Wizard {
		
			// dialog store id constants
		    public final static String STORE_DIRECTORIES = "«grammarShortName»GeneratorPreferences";//$NON-NLS-1$
		    
			private GeneratorWizardPage page = null;
		
			private Injector injector;
		
			private URI fileURI;
			
			private Map<String, String> outlets = new HashMap<String, String>();
			
			public GeneratorWizard() {
				IDialogSettings workbenchSettings = WorkbenchPlugin.getDefault().getDialogSettings();
		        IDialogSettings section = workbenchSettings.getSection(STORE_DIRECTORIES);//$NON-NLS-1$
		        if (section == null) {
					section = workbenchSettings.addNewSection(STORE_DIRECTORIES);//$NON-NLS-1$
				}
		        setDialogSettings(section);
			}
				
			@Override
			public void addPages() {
				page = new GeneratorWizardPage("Whatever2");
				page.setTitle("Generator Preferences");
				page.setDescription("Configure code generation");
				addPage(page);
			}
			
			@Override
			public boolean performFinish() {
				page.saveWidgetValues();
				String targetDirectory = page.getTargetDirectory();
		
				// Load resource
				injector = new «grammarShortName.toFirstUpper»StandaloneSetup().createInjectorAndDoEMFRegistration();
				XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
				Resource resource = resourceSet.getResource(fileURI, true);
		
				// Generate code
				IGenerator compiler = injector.getInstance(IGenerator.class);
				if (compiler instanceof «grammarShortName.toFirstUpper»Generator) {
					outlets.put("DEFAULT_OUTPUT", targetDirectory);
					IFileSystemAccess fsa = getConfiguredFileSystemAccess();
					compiler.doGenerate(resource, fsa);
					return true;
				}
				return false;
			}
		
			public String getTargetDirectory() {
				return page.getTargetDirectory();
			}	
			
			protected IFileSystemAccess getConfiguredFileSystemAccess() {
				final JavaIoFileSystemAccess configuredFileSystemAccess = injector.getInstance(JavaIoFileSystemAccess.class);
				configuredFileSystemAccess.setOutputConfigurations(getOutputConfigurations());
				for (Entry<String, String> outs : outlets.entrySet()) {
					configuredFileSystemAccess.setOutputPath(outs.getKey(), outs.getValue());
				}
				return configuredFileSystemAccess;
			}
		
			protected Map<String, OutputConfiguration> getOutputConfigurations() {
				Set<OutputConfiguration> configurations = getDefaultOutputConfigurations();
				return Maps.uniqueIndex(configurations, new Function<OutputConfiguration, String>() {
					public String apply(OutputConfiguration from) {
						return from.getName();
							}
				});
			}
			
			Set<OutputConfiguration> getDefaultOutputConfigurations() {
				Set<OutputConfiguration> outputs = new HashSet<OutputConfiguration>();
				OutputConfiguration defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
				defaultOutput.setDescription("Output Folder");
				defaultOutput.setOutputDirectory(outlets.get("DEFAULT_OUTPUT"));
				defaultOutput.setOverrideExistingResources(true);
				defaultOutput.setCreateOutputDirectory(true);
				defaultOutput.setCleanUpDerivedResources(true);
				defaultOutput.setSetDerivedProperty(true);
				outputs.add(defaultOutput);		
				return outputs;
			}
		
			public void setURI(URI uri) {
				fileURI = uri;
			}
		}
	'''

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}