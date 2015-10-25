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
package org.dslforge.workbench.wizards.file;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;

import org.dslforge.workbench.wizards.AbstractNewResourceWizard;
import org.dslforge.workspace.WorkspaceManager;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
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

	protected NewFileWizardPage page = null;
	
	private Mode mode = null;
	
	private String languageName = null;
	
	private String fileExtension = null;
	
	private enum Mode {
		GENERIC,
		SPECIFIC
	}
	
	public NewFileWizard(File container) {
		super(container);
		setWindowTitle("New Model");
		mode = Mode.GENERIC;
	}

	public NewFileWizard(String containerName, String languageName, String fileExtension) {
		super(containerName);
		this.languageName = languageName;
		this.fileExtension = fileExtension;
		setWindowTitle("New " + languageName + "Model");
		mode = Mode.SPECIFIC;
	}
	
	@Override
	public void addPages() {
		if (mode.equals(Mode.GENERIC)) {
			page = new NewFileWizardPage("NewModelFile");
			page.setTitle("New Model");
			page.setDescription("Create a new file resource");
		} 
		else {
			page = new NewFileWizardPage("New " + languageName + "File", languageName, fileExtension);
			page.setTitle("New "+ languageName + " Model");
			page.setDescription("Create a new " + languageName + " resource");
		}
		page.setInitialElementSelections(Collections.singletonList(getSelection()));
		addPage(page);
	}

	@Override
	public boolean performFinish() {
		// Get the URI of the model file.
		final URI fileURI = computeFileURI();
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
		if (new File(fileURI.devicePath()).exists()) {
			if (!MessageDialog
					.openQuestion(
							getShell(),
							"Question",
							"The file "
									+ fileURI.devicePath()
									+ " already exists.  Do you want to replace the existing file?")) {
				return false;
			}
		}

		IRunnableWithProgress operation = new IRunnableWithProgress() {
			public void run(IProgressMonitor progressMonitor) {
					try {
						//new StatemachineStandaloneSetup().createInjectorAndDoEMFRegistration();
						WorkspaceManager.INSTANCE.createResource(fileURI);
					}
					catch (Exception exception) {
						exception.printStackTrace();
					}
					finally {
						progressMonitor.done();
					}
				}
			};

		try {
			getContainer().run(false, false, operation);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		final String currentUser = (String) RWT.getUISession().getAttribute("user");
		System.out.println("[DSLFORGE] - " + currentUser + " created new model: " + fileURI);
		return openEditor(getWorkbench(), fileURI);		
	}
	
	public static boolean openEditor(IWorkbench workbench, URI uri) {
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		
		IEditorDescriptor editorDescriptor = EditUIUtil.getDefaultEditor(uri, null);
		if (editorDescriptor == null) {
			MessageDialog.openError(workbenchWindow.getShell()
				,"Error"
				,"There is no editor registered for the file " + uri.lastSegment());
			return false;
		}
		else {
			try {
				page.openEditor(new URIEditorInput(uri), editorDescriptor.getId());
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
	
	public URI computeFileURI() {
		URI absoluteFileURI = page.getFileURI();
		return absoluteFileURI;
	}
}
