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
import org.dslforge.workspace.ui.util.EditorUtil;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

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
		
		String absolutePath = filePath.toFile().getAbsolutePath();
		IWorkbench workbench = PlatformUI.getWorkbench();
		if (EditorUtil.openEditor(workbench, new Path(absolutePath)) != null) {
			logger.info("Opened editor on file " + absolutePath);
			return true;
		}
		return false;
	}
	
	private IPath computeFilePath() {
		return page.getFilePath();
	}
}