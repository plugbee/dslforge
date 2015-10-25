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
package org.dslforge.workbench.wizards.user;

import java.lang.reflect.InvocationTargetException;

import org.dslforge.workbench.wizards.AbstractNewResourceWizard;
import org.dslforge.workspace.WorkspaceManager;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;

public class RemoveUserWizard extends AbstractNewResourceWizard {

	protected RemoveUserWizardPage page = null;
	
	@Override
	public void addPages() {
		page = new RemoveUserWizardPage("DeleteUser");
		page.setTitle("Delete User");
		page.setDescription("Delete user account");
		addPage(page);
	}
	
	@Override
	public boolean performFinish() {
		final String userName = page.getUserName();
		IRunnableWithProgress operation = new IRunnableWithProgress() {
			public void run(IProgressMonitor progressMonitor) {
					try {
						WorkspaceManager.INSTANCE.deleteUser(userName);
						MessageDialog.openInformation(getShell(), "DSLFORGE Workbench (Beta)","User successfully deleted!");
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
		} catch (InvocationTargetException | InterruptedException e) {
			e.printStackTrace();
		}

		return true;
	}
	

}
