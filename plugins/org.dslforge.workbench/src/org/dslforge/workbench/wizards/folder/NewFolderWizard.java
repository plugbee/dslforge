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
package org.dslforge.workbench.wizards.folder;

import java.lang.reflect.InvocationTargetException;
import java.util.Collections;

import org.dslforge.workbench.wizards.AbstractNewResourceWizard;
import org.dslforge.workspace.WorkspaceManager;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.rap.rwt.RWT;

public class NewFolderWizard extends AbstractNewResourceWizard {

	protected NewFolderWizardPage page = null;
	
	public NewFolderWizard(String containerName) {
		super(containerName);
		setWindowTitle("New Folder");
	}
	
	@Override
	public void addPages() {
		page = new NewFolderWizardPage("NewFolder");
		page.setTitle("New Folder");
		page.setDescription("Create a new folder resource");
		page.setInitialElementSelections(Collections.singletonList(getSelection()));
		addPage(page);
	}
	
	@Override
	public boolean performFinish() {
		final String folderName = page.getFolderName();
		if (folderName!=null) {
			Object attribute = RWT.getUISession().getAttribute("user");
			if (attribute instanceof String) {
				IRunnableWithProgress operation = new IRunnableWithProgress() {
					public void run(IProgressMonitor progressMonitor) {
							try {
								URI folderURI = URI.createFileURI(containerName + WorkspaceManager.PATH_SEPARATOR + folderName);
								WorkspaceManager.INSTANCE.createFolder(folderURI);
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
				return true; 
			}
		}
		return false;
	}
}
