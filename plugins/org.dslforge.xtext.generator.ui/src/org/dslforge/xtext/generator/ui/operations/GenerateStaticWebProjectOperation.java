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

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.dslforge.xtext.generator.IWebProjectGenerator;
import org.dslforge.xtext.generator.IWebProjectGenerator.EditorType;
import org.dslforge.xtext.generator.WebProjectGenerator;
import org.dslforge.xtext.generator.ui.factories.StaticWebProjectFactory;
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
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.util.ProjectFactory;

import com.google.common.base.Charsets;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;

public class GenerateStaticWebProjectOperation extends GenerateProjectOperation {

	protected static final String PLUGIN_SUFFIX = "ace";
	protected static final String SRC = "WebContent";
	protected static final List<String> SRC_FOLDER_LIST = ImmutableList.of(SRC);
	
	protected static final String[] DSL_PROJECT_NATURES = new String[] { 
		"org.eclipse.wst.common.project.facet.core.nature",
		"org.eclipse.wst.common.modulecore.ModuleCoreNature",
		"org.eclipse.wst.jsdt.core.jsNature",
		"org.deved.antlride.core.nature"
	};

	protected static final String[] BUILDERS = new String[] { 
			"org.eclipse.wst.jsdt.core.javascriptValidator",
			"org.eclipse.wst.common.project.facet.core.builder",
			"org.eclipse.wst.validation.validationbuilder",
			"org.eclipse.dltk.core.scriptbuilder"
		};

	 
	protected IWebProjectGenerator projectGenerator;

	public GenerateStaticWebProjectOperation(Map<String, Object> settings) {
		super(settings);
		projectGenerator = (IWebProjectGenerator) getInstance();
	}

	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException {
		SubMonitor progress = SubMonitor.convert(monitor, 10);
		final EditorType editorType = (EditorType)settings.get("EditorType");
		final IFile grammarFile = (IFile) settings.get("Grammar");
		try {
			EObject root = loadGrammar(grammarFile, progress.newChild(1));
			if (root!=null && root instanceof Grammar) {
				setGrammar((Grammar) root);
				IProject project = createProject(editorType, progress.newChild(4));
				if (progress.isCanceled())
					throw new OperationCanceledException();
				setOutputs(project);
				setEditorType(editorType);
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
	
	private IProject createProject(EditorType editorType, final IProgressMonitor monitor) throws CoreException {
		return createStaticWebProjectFactory().createProject(monitor, null);
	}

	private ProjectFactory createStaticWebProjectFactory() {
		StaticWebProjectFactory factory = new StaticWebProjectFactory();
		factory.addBuilderIds(getBuilderIDs());
		factory.setProjectName(GeneratorUtil.getProjectName(grammar));
		factory.addProjectNatures(getProjectNatures());
		factory.setLocation(getProjectLocation());
		factory.setProjectDefaultCharset(Charsets.UTF_8.name());
		return factory;
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

	private void setEditorType(EditorType value) {
		if (projectGenerator instanceof WebProjectGenerator) {
			((WebProjectGenerator)projectGenerator).setEditorType(value);
		}
	}

	@Override
	public void doGenerate(IProject project, IProgressMonitor monitor) {
		IFileSystemAccess fsa = getConfiguredFileSystemAccess();
		projectGenerator.doGenerate(grammar, fsa);
		try {
			project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
		} catch (CoreException ex) {
			ex.printStackTrace();
		}
	}

	private String[] getBuilderIDs() {
		return BUILDERS;
	}
}