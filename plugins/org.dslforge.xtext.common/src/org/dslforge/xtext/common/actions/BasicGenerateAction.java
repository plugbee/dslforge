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
package org.dslforge.xtext.common.actions;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.dslforge.workspace.WorkspaceManager;
import org.dslforge.workspace.ui.actions.AbstractWorkspaceAction;
import org.dslforge.xtext.common.registry.LanguageRegistry;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.common.base.Function;
import com.google.common.collect.Maps;
import com.google.inject.ConfigurationException;
import com.google.inject.Injector;
 
public class BasicGenerateAction extends AbstractWorkspaceAction {
	
	private static final String DEFAULT_OUTPUT_FOLDER = "\\src-gen";
	private Injector injector;
	private Map<String, String> outlets = new HashMap<String, String>();

	public BasicGenerateAction() {
		super();
	}

	@Override
	public void run(IAction action) {
		if (!getSelection().isEmpty()) {
			// get the resource uri
			File file = (File) ((IStructuredSelection) getSelection()).getFirstElement();
			String fileName = file.getName();
			String extension = fileName.substring(fileName.indexOf(".") + 1, fileName.length());
			URI fileURI = URI.createFileURI(file.getAbsolutePath());
			// configure the generator output
			String targetDirectory = getDefaultTargetDirectory(fileURI);
			// load the resource
			String languageName = getLanguageName(extension);
			if (languageName != null) {
				injector = LanguageRegistry.INSTANCE.getInjector(languageName);
				XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
				XtextResource resource = (XtextResource) resourceSet.getResource(fileURI, true);
				// launch the generator
				outlets.put("DEFAULT_OUTPUT", targetDirectory);
				IFileSystemAccess fsa = getConfiguredFileSystemAccess();
				IGenerator generator = null;
				try {
					generator = injector.getInstance(IGenerator.class);
				} catch (ConfigurationException ex) {
					// Xtext 2.10: cannot find or create binding, try IGenerator2
					generator = injector.getInstance(GeneratorDelegate.class);
				} finally {
					if (generator!=null) {
						//create the container if it doesn't exist yet
						WorkspaceManager.INSTANCE.createFolder(new Path(targetDirectory));
						//make it happen
						generator.doGenerate(resource, fsa);
					}
				}
			}
		}
	}

	protected String getLanguageName(String fileExtension) {
		List<String> contributions = LanguageRegistry.INSTANCE.getLanguageByExtension(fileExtension);
		if (!contributions.isEmpty()) {
			return contributions.get(0);
		}
		return null;
	}

	protected String getDefaultTargetDirectory(URI fileURI) {
		return getDefaultOutput();
	}
	
	protected String getDefaultOutput() {
		String output = WorkspaceManager.INSTANCE.getWorkspaceRootStringPath();
		Object firstElement = ((IStructuredSelection) getSelection()).getFirstElement();
		if (firstElement instanceof File) {
			String parent = ((File)firstElement).getParent();
			output = parent + DEFAULT_OUTPUT_FOLDER;
		}
		return output;
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
}