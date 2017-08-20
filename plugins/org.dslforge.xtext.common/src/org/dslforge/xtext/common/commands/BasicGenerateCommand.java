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
package org.dslforge.xtext.common.commands;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.dslforge.xtext.common.registry.LanguageRegistry;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.common.base.Function;
import com.google.common.collect.Maps;
import com.google.inject.ConfigurationException;
import com.google.inject.Injector;

public class BasicGenerateCommand extends AbstractHandler {

	public static final String DEFAULT_OUTPUT_FOLDER = "src-gen";
	private Injector injector;
	private Map<String, String> outlets = new HashMap<String, String>();

	public BasicGenerateCommand() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		File file = unwrap(event, File.class);
		StructuredSelection selection = new StructuredSelection(file);
		if (!selection.isEmpty()) {
			File parent = file.getParentFile();
			String output = new File(parent, DEFAULT_OUTPUT_FOLDER).getAbsolutePath();
			doGenerate(file, new File(output));
		}
		return null;
	}
	
	public static <T> T unwrap(Object object, Class<T> type) {
		if (object instanceof ExecutionEvent) {
			object = HandlerUtil.getCurrentSelection((ExecutionEvent) object);
		}
		if (object instanceof IStructuredSelection) {
			object = ((IStructuredSelection) object).getFirstElement();
		}
		if (object instanceof IAdaptable) {
			object = ((IAdaptable) object).getAdapter(type);
		}
		if (type.isInstance(object)) {
			return type.cast(object);
		}
		return null;
	}
	
	public void setSizeAndLocation(WizardDialog wizardDialog) {
		wizardDialog.getShell().setSize(600, 500);
		Shell activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		Rectangle bounds = activeShell.getBounds();
		Rectangle rect = wizardDialog.getShell().getBounds();
		int x = bounds.x + (bounds.width - rect.width) / 2;
		int y = bounds.y + (bounds.height - rect.height) / 2;
		wizardDialog.getShell().setLocation(x, y);
	}
	
	public IWorkbenchWindow getWindow() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	}

	public void doGenerate(File file, File targetDirectory) {
		String fileName = file.getName();
		String extension = fileName.substring(fileName.lastIndexOf(".") + 1);
		URI fileURI = URI.createFileURI(file.getAbsolutePath());
		// load the resource
		String languageName = getLanguageName(extension);
		if (languageName != null) {
			injector = LanguageRegistry.INSTANCE.getInjector(languageName);
			XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
			XtextResource resource = (XtextResource) resourceSet.getResource(fileURI, true);
			// launch the generator
			outlets.put("DEFAULT_OUTPUT", targetDirectory.getAbsolutePath());
			IFileSystemAccess fsa = getConfiguredFileSystemAccess();
			IGenerator generator = null;
			try {
				generator = injector.getInstance(IGenerator.class);
				// make it happen
				generator.doGenerate(resource, fsa);
			} catch (ConfigurationException ex) {
				// Xtext 2.10: cannot find or create binding, try IGenerator2
				IGenerator2 generator2 = injector.getInstance(IGenerator2.class);
				if (generator2 != null) {
					// make it happen
					generator2.doGenerate(resource, (IFileSystemAccess2) fsa, new GeneratorContext());
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