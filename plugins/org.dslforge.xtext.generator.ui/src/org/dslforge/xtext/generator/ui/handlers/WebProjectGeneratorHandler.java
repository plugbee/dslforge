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

import static com.google.common.collect.Maps.uniqueIndex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.dslforge.xtext.generator.IWebProjectGenerator;
import org.dslforge.xtext.generator.WebProjectGenerator;
import org.dslforge.xtext.generator.util.GeneratorUtil;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.util.PluginProjectFactory;

import com.google.common.base.Charsets;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

public class WebProjectGeneratorHandler extends AbstractGeneratorHandler {

	protected static final String PLUGIN_SUFFIX = "web";
	protected static final String SRC = "src";
	protected static final String SRC_JS = "src-js";
	protected static final String DATA = "data";
	protected static final List<String> SRC_FOLDER_LIST = ImmutableList.of(SRC, SRC_JS);
	
	protected static final String[] DSL_PROJECT_NATURES = new String[] { 
		"org.eclipse.pde.PluginNature",
		"org.eclipse.jdt.core.javanature",
		"org.deved.antlride.core.nature"
	};
	
	protected static final String[] BUILDERS = new String[] { 
		JavaCore.BUILDER_ID, 
		"org.eclipse.dltk.core.scriptbuilder",
		"org.eclipse.pde.ManifestBuilder",
		"org.eclipse.pde.SchemaBuilder"
	};
	
	private List<String> getProjectRequiredBundles() {
		String dslProjectName = GeneratorUtil.getDslProjectName(grammar);
		requiredBundles = Lists.newArrayList(
				"org.eclipse.rap.ui",
				"org.eclipse.rap.ui.navigator",
				"org.eclipse.emf.rap.common.ui", 
				"org.eclipse.emf.rap.edit.ui",
				"org.eclipse.emf.common", 
				"org.eclipse.emf.ecore",
				"com.google.inject",
				"org.eclipse.xtext", 
				"org.dslforge.workbench",
				"org.dslforge.workspace",
				"org.dslforge.xtext.common",
				dslProjectName);
		return requiredBundles;
	}
	 
	protected IWebProjectGenerator projectGenerator = null;
	
	private ArrayList<String> requiredBundles;
	
	public WebProjectGeneratorHandler() {
		super();
		projectGenerator = (IWebProjectGenerator) getInstance();
	}

	public void doGenerate(IFile file) {
		EObject root = loadGrammar(file);
		if (root instanceof Grammar) {
			setGrammar((Grammar)root);
			generateProject();
		}
	}

	private void generateProject() {
		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow window = wb.getActiveWorkbenchWindow();
		WebProjectGeneratorWizard wizard = new WebProjectGeneratorWizard(this);
		WizardDialog wizardDialog = new WizardDialog(window.getShell(), wizard);
		wizardDialog.open();
	}
	
	//path	/org.xtext.example.domainmodel.web/src/org/xtext/example/domainmodel/web/actions/AboutAction.java
	protected void setOutputs(IProject project) {	
		IFolder javaSource = project.getFolder(SRC);
		outlets.put(SRC, javaSource.getLocation().toString());
		IFolder javaScriptSource = project.getFolder(SRC_JS);
		outlets.put(SRC_JS, javaScriptSource.getLocation().toString());
		IFolder dataFolder = project.getFolder(DATA);
		outlets.put(DATA, dataFolder.getLocation().toString());
	}
	
	protected IFileSystemAccess getConfiguredFileSystemAccess() {
		final JavaIoFileSystemAccess configuredFileSystemAccess = xtextInjector.getInstance(JavaIoFileSystemAccess.class);
		configuredFileSystemAccess.setOutputConfigurations(getOutputConfigurations());
		for (Entry<String, String> outs : outlets.entrySet()) {
			configuredFileSystemAccess.setOutputPath(outs.getKey(),	outs.getValue());
		}
		return configuredFileSystemAccess;
	}

	protected Map<String, OutputConfiguration> getOutputConfigurations() {
		Set<OutputConfiguration> configurations = getDefaultOutputConfigurations();
		return uniqueIndex(configurations,
				new Function<OutputConfiguration, String>() {
					public String apply(OutputConfiguration from) {
						return from.getName();
					}
				});
	}

	protected Set<OutputConfiguration> getDefaultOutputConfigurations() {
		Set<OutputConfiguration> outputs = new HashSet<OutputConfiguration>();
		for (String outlet: outlets.keySet()) {
			OutputConfiguration config = new OutputConfiguration(outlet);
			config.setDescription("Output folder " + outlets.get(outlet));
			config.setOutputDirectory(outlets.get(outlet));
			config.setOverrideExistingResources(true);
			config.setCreateOutputDirectory(true);
			config.setCleanUpDerivedResources(true);
			config.setSetDerivedProperty(true);
			outputs.add(config);
		}
		return outputs;
	}
	
	public void setUseNavigator(boolean value) {
		if (projectGenerator instanceof WebProjectGenerator) {
			((WebProjectGenerator)projectGenerator).useNavigator(value);
		}
	}
	
	public void setUseGenerator(boolean value) {
		if (projectGenerator instanceof WebProjectGenerator) {
			((WebProjectGenerator)projectGenerator).useGenerator(value);
		}
	}
	
	public void setNavigatorRoot(String navigatorRoot) {
		if (projectGenerator instanceof WebProjectGenerator) {
			((WebProjectGenerator)projectGenerator).setNavigatorRoot(navigatorRoot);
		}
	}
	
	/**
	 * FIXME: avoid cast to concrete class
	 * 
	 * @param project
	 */
	protected void generateCode(IProject project) {
		IFileSystemAccess fsa = getConfiguredFileSystemAccess();
		projectGenerator.doGenerate(grammar, fsa);
		try {
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (CoreException ex) {
			ex.printStackTrace();
		}
	}
	
	private EObject loadGrammar(IFile file) {
		IPath filePath = file.getFullPath();
		URI uri = URI.createPlatformResourceURI(filePath.toString(), false);
		XtextResourceSet resourceSet = getXtextInjector().getInstance(XtextResourceSet.class);
		Resource resource = resourceSet.getResource(uri, true);
		EObject root = resource.getContents().get(0);
		return root;
	}
	
	
	public IProject createProject(final IProgressMonitor monitor) throws CoreException {
		final WebProjectFactory factory = new WebProjectFactory(grammar);
		configureProjectFactory(factory);
		List<String> requiredBundles = getProjectRequiredBundles();
		factory.setProjectName(GeneratorUtil.getProjectName(grammar));
		factory.addProjectNatures(getProjectNatures());
		factory.addRequiredBundles(requiredBundles);
		factory.setLocation(getProjectLocation());
		factory.setProjectDefaultCharset(Charsets.UTF_8.name());
		return factory.createProject(monitor, null);
	}

	private IPath getProjectLocation() {
		String projectName = EcoreUtil.getURI(grammar).segments()[1];
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		IPath location = project.getLocation();
		IPath rootPath = location.removeLastSegments(1);
		return rootPath.append(GeneratorUtil.getProjectName(grammar));
	}

	private String[] getProjectNatures() {
		return DSL_PROJECT_NATURES;
	}
	 
	private void configureProjectFactory(PluginProjectFactory factory) {
		factory.addBuilderIds(getBuilderIDs());
		factory.addImportedPackages(getImportedPackages());
		factory.addFolders(getAllFolders());
	}

	private List<String> getAllFolders() {
		return SRC_FOLDER_LIST;
	}

	private List<String> getImportedPackages() {
		return Collections.emptyList();
	}

	private String[] getBuilderIDs() {
		return BUILDERS;
	}

}