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
package org.dslforge.xtext.generator.ui.operations;

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
import org.dslforge.xtext.generator.ui.factories.WebProjectFactory;
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
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.core.JavaCore;
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

public class GenerateWebProjectOperation extends GenerateProjectOperation {

	protected static final String PLUGIN_SUFFIX = "web";
	protected static final String SRC = "src";
	protected static final String SRC_GEN = "src-gen";
	protected static final String SRC_JS = "src-js";
	protected static final String DATA = "data";
	protected static final List<String> SRC_FOLDER_LIST = ImmutableList.of(SRC, SRC_GEN, SRC_JS);
	
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
				"org.dslforge.workspace",
				"org.dslforge.xtext.common",
				"org.dslforge.texteditor",
				"org.dslforge.styledtext",
				dslProjectName);
		return requiredBundles;
	}
	 
	protected IWebProjectGenerator projectGenerator;
	
	private ArrayList<String> requiredBundles;
	
	public GenerateWebProjectOperation(Map<String, Object> settings) {
		super(settings);
		projectGenerator = (IWebProjectGenerator) getInstance();
	}

	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException {
		SubMonitor progress = SubMonitor.convert(monitor, 20);
		final boolean generatorOption = ((Boolean)settings.get("UseGenerator")).booleanValue();
		final boolean option = ((Boolean) settings.get("UseNavigator")).booleanValue();
		final String navigatorRoot = (String) settings.get("NavigatorRoot");
		final IFile grammarFile = (IFile) settings.get("Grammar");
		try {
			EObject root = loadGrammar(grammarFile, progress.newChild(5));
			if (root!=null && root instanceof Grammar) {
				setGrammar((Grammar) root);
				IProject project = createProject(monitor, progress.newChild(5));
				if (progress.isCanceled())
					throw new OperationCanceledException();
				//setting generator parameters
				setOutputs(project);
				if (option) {
					setUseNavigator(option);
					// if navigator root not specified, use default one
					if (navigatorRoot.length() != 0)
						setNavigatorRoot(navigatorRoot);
				}
				setUseGenerator(generatorOption);
				if (progress.isCanceled())
					throw new OperationCanceledException();
				doGenerate(project, progress.newChild(5));
			}	
		} catch(OperationCanceledException ex) {
			//do noting for now, forbid propagating exception
		} finally {
			progress.done();
		}
	}

	private void setOutputs(IProject project) {	
		IFolder javaSource = project.getFolder(SRC);
		outlets.put(SRC, javaSource.getLocation().toString());
		IFolder javaGeneratedSource = project.getFolder(SRC_GEN);
		outlets.put(SRC_GEN, javaGeneratedSource.getLocation().toString());
		IFolder javaScriptSource = project.getFolder(SRC_JS);
		outlets.put(SRC_JS, javaScriptSource.getLocation().toString());
		IFolder dataFolder = project.getFolder(DATA);
		outlets.put(DATA, dataFolder.getLocation().toString());
	}
	
	private IFileSystemAccess getConfiguredFileSystemAccess() {
		final JavaIoFileSystemAccess configuredFileSystemAccess = xtextInjector.getInstance(JavaIoFileSystemAccess.class);
		configuredFileSystemAccess.setOutputConfigurations(getOutputConfigurations());
		for (Entry<String, String> outs : outlets.entrySet()) {
			configuredFileSystemAccess.setOutputPath(outs.getKey(),	outs.getValue());
		}
		return configuredFileSystemAccess;
	}

	private Map<String, OutputConfiguration> getOutputConfigurations() {
		Set<OutputConfiguration> configurations = getDefaultOutputConfigurations();
		return uniqueIndex(configurations,
				new Function<OutputConfiguration, String>() {
					public String apply(OutputConfiguration from) {
						return from.getName();
					}
				});
	}

	private Set<OutputConfiguration> getDefaultOutputConfigurations() {
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
	
	private EObject loadGrammar(IFile file, SubMonitor subMonitor) {
		IPath filePath = file.getFullPath();
		URI uri = URI.createPlatformResourceURI(filePath.toString(), false);
		XtextResourceSet resourceSet = getXtextInjector().getInstance(XtextResourceSet.class);
		Resource resource = resourceSet.getResource(uri, true);
		EObject root = resource.getContents().get(0);
		return root;
	}
	
	private IProject createProject(final IProgressMonitor monitor, SubMonitor subMonitor) throws CoreException {
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

	private void setUseNavigator(boolean value) {
		if (projectGenerator instanceof WebProjectGenerator) {
			((WebProjectGenerator)projectGenerator).useNavigator(value);
		}
	}
	
	private void setUseGenerator(boolean value) {
		if (projectGenerator instanceof WebProjectGenerator) {
			((WebProjectGenerator)projectGenerator).useGenerator(value);
		}
	}
	
	private void setNavigatorRoot(String navigatorRoot) {
		if (projectGenerator instanceof WebProjectGenerator) {
			((WebProjectGenerator)projectGenerator).setNavigatorRoot(navigatorRoot);
		}
	}

	@Override
	public void doGenerate(IProject project, SubMonitor subMonitor) {
		IFileSystemAccess fsa = getConfiguredFileSystemAccess();
		projectGenerator.doGenerate(grammar, fsa);
		try {
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (CoreException ex) {
			ex.printStackTrace();
		}
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