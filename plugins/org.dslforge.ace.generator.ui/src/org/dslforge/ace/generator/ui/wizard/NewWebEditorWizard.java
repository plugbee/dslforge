/**
 * <copyright>
 *
 * Copyright (c) 2016 PlugBee. All rights reserved.
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
package org.dslforge.ace.generator.ui.wizard;

import java.lang.reflect.InvocationTargetException;

import org.apache.log4j.Logger;
import org.dslforge.ace.generator.StaticWebProjectFactory;
import org.dslforge.common.IWebProjectDescriptor;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.part.FileEditorInput;

public class NewWebEditorWizard extends Wizard implements INewWizard {

	static final Logger logger = Logger.getLogger(NewWebEditorWizard.class);
	
	private NewWebEditorWizardPage mainPage = null;
	private String initialProjectFieldValue="org.dslforge.example.web";
	
	public NewWebEditorWizard() {
		setWindowTitle("New Web Editor Project");
	}

	public NewWebEditorWizard(IFile grammarFile) {
		setWindowTitle("New Web Editor Project");
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		//do nothing.
	}

	@Override
	public void addPages() {
		mainPage = new NewWebEditorWizardPage("NewWebEditorProject");
		mainPage.setTitle("New Web Editor Project");
		mainPage.setDescription("Creates an ACE Editor packaged into a static web project.");
		mainPage.setInitialProjectName(initialProjectFieldValue);
		addPage(mainPage);
	}

	@Override
	public boolean performFinish() {
		final IWebProjectDescriptor configuration = mainPage.getWebProjectDescriptor();
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {

			@Override
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InvocationTargetException, InterruptedException {
				StaticWebProjectFactory factory = createWebProjectFactory(configuration);
				factory.createProject(monitor);
				if (monitor.isCanceled())
					throw new OperationCanceledException();
				IProject project = configuration.getProject();
				project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
			}
		};

		IWorkbench workbench = PlatformUI.getWorkbench();
		try {
			workbench.getProgressService().run(true, true, operation);
		} catch (InvocationTargetException e) {
			logger.error(e.getMessage(), e);
		} catch (InterruptedException e) {
			logger.error(e.getMessage(), e);
		}
		
		IPath grammarFilePath = configuration.getGrammar().getFullPath();
		IFile grammarFile = ResourcesPlugin.getWorkspace().getRoot().getFile(grammarFilePath);
		if (grammarFile!=null && grammarFile.exists()) {
			openInEditor(grammarFile);
		}
		return true;
	}
	
	protected StaticWebProjectFactory createWebProjectFactory(IWebProjectDescriptor configuration) {
		StaticWebProjectFactory factory = new StaticWebProjectFactory(configuration);
		return factory;
	}
	
	protected void openInEditor(IFile modelFile) {
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
