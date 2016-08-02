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
package org.dslforge.workspace.ui.wizards;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;

import org.apache.log4j.Logger;
import org.dslforge.workspace.WorkspaceManager;
import org.dslforge.workspace.ui.PathEditorInput;
import org.dslforge.workspace.ui.util.EditorUtil;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;

public class NewFileWizard extends AbstractNewResourceWizard{

	static final Logger logger = Logger.getLogger(NewFileWizard.class);

	protected NewFileWizardPage page = null;

	public NewFileWizard(File container) {
		super(container);
		setWindowTitle("New File");
	}
	
	@Override
	public void addPages() {
		page = new NewFileWizardPage("NewFile");
		page.setTitle("New File");
		page.setDescription("Create a new file resource");
		page.setInitialElementSelections(Collections.singletonList(getSelection()));
		addPage(page);
	}

	@Override
	public boolean performFinish() {
		final IPath filePath = computeFilePath();
		IStructuredSelection selection = getSelection();
		File container = new File(selection.toString());
		if (container.exists() && !container.isDirectory()) {
			MessageDialog
			.openQuestion(
					getShell(),
					"Question",
					"The selected container is not valid, please select where the file should be located.");

			return false;
		}
		if (filePath.toFile().exists()) {
			if (!MessageDialog
					.openQuestion(
							getShell(),
							"Question",
							"The file "
									+ filePath
									+ " already exists.  Do you want to replace the existing file?")) {
				return false;
			}
		}

		IRunnableWithProgress operation = new IRunnableWithProgress() {
			public void run(IProgressMonitor progressMonitor) {
					try {
						WorkspaceManager.INSTANCE.createResource(filePath);
					}
					catch (Exception ex) {
						logger.error(ex.getMessage(), ex);
					}
					finally {	
						progressMonitor.done();
					}
				}
			};

		try {
			getContainer().run(false, false, operation);
		} catch (InvocationTargetException ex) {
			logger.error(ex.getMessage(), ex);
		} catch (InterruptedException ex) {
			logger.error(ex.getMessage(), ex);
		}
		final String currentUser = (String) RWT.getUISession().getAttribute("user");
		logger.info(currentUser + " created new model: " + filePath);
		return openEditor(getWorkbench(), filePath);		
	}

	public static boolean openEditor(IWorkbench workbench, IPath path) {
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		IEditorDescriptor editorDescriptor = EditorUtil.getDefaultEditor(path);
		if (editorDescriptor == null) {
			MessageDialog.openError(workbenchWindow.getShell()
				,"Error"
				,"There is no editor registered for the file " + path.lastSegment());
			return false;
		}
		else {
			try {
				page.openEditor(new PathEditorInput(path), editorDescriptor.getId());
			}
			catch (PartInitException exception) {
				MessageDialog.openError(
					workbenchWindow.getShell()
					,"Open Editor"
					,exception.getMessage());
				return false;
			}
		}
		return true;
	}
	
	private IPath computeFilePath() {
		return page.getFilePath();
	}
}