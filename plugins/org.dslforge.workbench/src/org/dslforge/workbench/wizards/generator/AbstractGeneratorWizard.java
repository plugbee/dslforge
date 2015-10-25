/**
 * <copyright>
 *
 * Copyright (c) 2015 DSLFORGE. All rights reserved.
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
package org.dslforge.workbench.wizards.generator;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.dslforge.database.pu.tables.Folder;
import org.dslforge.workspace.WorkspaceManager;
import org.dslforge.xtext.common.registry.BasicWorkbenchRegistry;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.common.base.Function;
import com.google.common.collect.Maps;
import com.google.inject.Injector;

@SuppressWarnings("restriction")
public abstract class AbstractGeneratorWizard extends Wizard {

	public final static String STORE_DIRECTORIES = "ConfGeneratorPreferences";//$NON-NLS-1$
    
	protected BasicGeneratorWizardPage page = null;

	private Injector injector;

	private URI fileURI;
	
	private Map<String, String> outlets = new HashMap<String, String>();
	
	public AbstractGeneratorWizard() {
		IDialogSettings workbenchSettings = WorkbenchPlugin.getDefault().getDialogSettings();
        IDialogSettings section = workbenchSettings.getSection(STORE_DIRECTORIES);//$NON-NLS-1$
        if (section == null) {
			section = workbenchSettings.addNewSection(STORE_DIRECTORIES);//$NON-NLS-1$
		}
        setDialogSettings(section);
	}
		
	@Override
	public void addPages() {
		page = new BasicGeneratorWizardPage("Whatever2");
		page.setTitle("Generator Preferences");
		page.setDescription("Configure code generation");
		addPage(page);
	}
	
	@Override
	public boolean performFinish() {
		page.saveWidgetValues();
		String targetDirectory = page.getTargetDirectory();
		URI folderURI = URI.createFileURI(targetDirectory);
		Folder folder = WorkspaceManager.INSTANCE.getFolder(folderURI);
		if (folder==null) {
			WorkspaceManager.INSTANCE.createFolder(folderURI);
		}
		
		String languageName = page.getLanguageName();
		injector = BasicWorkbenchRegistry.INSTANCE.getInjector(languageName);
		IStructuredSelection initialElementSelection = page.getInitialElementSelection();
		File file =(File) initialElementSelection.getFirstElement();
		String fileName = file.getName();
		String extension = fileName.substring(fileName.indexOf(".")+1, fileName.length());

		// Generate code
	//	IGenerator compiler = injector.getInstance(IGenerator.class);
		IGenerator compiler = (IGenerator) BasicWorkbenchRegistry.INSTANCE.getGeneratorsForMetamodel(languageName).get(0);
		
		// Load resource
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		fileURI = URI.createFileURI(file.getAbsolutePath());
		Resource resource = resourceSet.getResource(fileURI, true);
		
		outlets.put("DEFAULT_OUTPUT", targetDirectory);
		IFileSystemAccess fsa = getConfiguredFileSystemAccess();
		compiler.doGenerate(resource, fsa);
		
		//update data base
		WorkspaceManager.INSTANCE.createFolder(folderURI);
		
		//ignore generated files under src-gen
		final String currentUser = (String) RWT.getUISession().getAttribute("user");
		System.out.println("[DSLFORGE] - " + currentUser + " launched code generator on model: " + fileURI);
		return true;
	}

	protected abstract Injector createInjectorAndDoEMFRegistration() ;

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