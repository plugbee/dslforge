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
package org.dslforge.xtext.generator.ui.actions;

import java.util.List;

import org.apache.log4j.Logger;
import org.dslforge.common.IWebProjectDescriptor;
import org.dslforge.common.IWebProjectFactory;
import org.dslforge.xtext.generator.DynamicWebProjectFactory;
import org.dslforge.xtext.generator.XtextGrammar;
import org.dslforge.xtext.generator.setup.WebProjectGeneratorSetup;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.XtextStandaloneSetup;

import com.google.inject.Injector;

public class GenerateXtextWebEditorOperation extends WorkspaceModifyOperation {
	
	static final Logger logger = Logger.getLogger(GenerateXtextWebEditorOperation.class);
	
	private final IWebProjectDescriptor configuration;
	
	protected Injector xtextInjector;

	protected Injector generatorFactory;
	
	public GenerateXtextWebEditorOperation(IWebProjectDescriptor configuration) {
		super();
		this.configuration=configuration;
	}

	protected Injector getXtextInjector() {
		if (xtextInjector == null)
			xtextInjector = new XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		return xtextInjector;
	}

	protected IWebProjectFactory getInstance() {
		if (generatorFactory==null)
			generatorFactory = new WebProjectGeneratorSetup().createInjectorAndDoEMFRegistration();
		return generatorFactory.getInstance(IWebProjectFactory.class);
	}
	
	public void setGrammar(Grammar object) {
		XtextGrammar xtextGrammar = new XtextGrammar(object);
		this.configuration.setGrammar(xtextGrammar);
	}
	
	public XtextGrammar getGrammar() {
		return (XtextGrammar) this.configuration.getGrammar();
	}
	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException {
		SubMonitor progress = SubMonitor.convert(monitor, 10);
		try {
			DynamicWebProjectFactory factory = (DynamicWebProjectFactory) createWebProjectFactory();
			List<IProject> projects = factory.createProjects(progress.newChild(1));
			if (progress.isCanceled())
				throw new OperationCanceledException();
			for (IProject project : projects)
				project.refreshLocal(IResource.DEPTH_INFINITE, progress);
		} catch (OperationCanceledException ex) {
			logger.info(ex.getMessage());
		} finally {
			progress.done();
		}
	}
	
	protected IWebProjectFactory createWebProjectFactory() {
		return new DynamicWebProjectFactory(configuration);
	}

	protected void openGrammarInEditor(IFile modelFile) {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		try {
			page.openEditor(new FileEditorInput(modelFile), PlatformUI.getWorkbench().getEditorRegistry()
					.getDefaultEditor(modelFile.getFullPath().toString()).getId());
		} catch (PartInitException ex) {
			logger.error(ex.getMessage(), ex);
		}
	}
}