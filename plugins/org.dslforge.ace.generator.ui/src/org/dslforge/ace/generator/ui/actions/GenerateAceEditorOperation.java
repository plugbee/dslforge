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
package org.dslforge.ace.generator.ui.actions;

import org.apache.log4j.Logger;
import org.dslforge.ace.generator.StaticWebProjectFactory;
import org.dslforge.common.IWebProjectDescriptor;
import org.dslforge.common.IWebProjectFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.part.FileEditorInput;

public class GenerateAceEditorOperation extends WorkspaceModifyOperation {

	static final Logger logger = Logger.getLogger(GenerateAceEditorOperation.class);
	
	final IWebProjectDescriptor configuration;
	
	public GenerateAceEditorOperation(IWebProjectDescriptor configuration) {
		super();
		this.configuration=configuration;
	}

	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException {
		SubMonitor progress = SubMonitor.convert(monitor, 100);
		try {
			IWebProjectFactory factory = createWebProjectFactory();
			IProject project = factory.createProject(progress.newChild(100));
			if (progress.isCanceled())
				throw new OperationCanceledException();
			project.refreshLocal(IResource.DEPTH_INFINITE, progress);
			IPath grammarFilePath = configuration.getGrammar().getFullPath();
			IFile grammarFile = project.getFile(grammarFilePath);
			if (grammarFile!=null && grammarFile.exists()) {
				openGrammarInEditor(grammarFile);
			}
		} catch (OperationCanceledException ex) {
			// do noting for now, forbid propagating exception
		} finally {
			progress.done();
		}
	}
	
	protected IWebProjectFactory createWebProjectFactory() {
		return new StaticWebProjectFactory(configuration);
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