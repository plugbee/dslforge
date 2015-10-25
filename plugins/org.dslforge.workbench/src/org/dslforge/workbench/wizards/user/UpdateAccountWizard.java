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

import org.dslforge.database.pu.tables.User;
import org.dslforge.workbench.wizards.AbstractNewResourceWizard;
import org.dslforge.workspace.WorkspaceManager;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.rap.rwt.RWT;

public class UpdateAccountWizard extends AbstractNewResourceWizard {

	protected UpdateAccountWizardPage page = null;
	
	User user;
	
	public UpdateAccountWizard() {
		final String userName = (String) RWT.getUISession().getAttribute("user");
		user = WorkspaceManager.INSTANCE.getUserById(userName);
		setWindowTitle("Manage User Account");
	}
	
	@Override
	public void addPages() {
		page = new UpdateAccountWizardPage("ChangePwd", user);
		page.setTitle("User Account Info");
		page.setDescription("Update user account");
		addPage(page);
	}
	
	@Override
	public boolean performFinish() {
		
		//get user data
		final String userName = (String) RWT.getUISession().getAttribute("user");
		final String firstName = page.getFirstName();
		final String lastName = page.getLastName();
		final String organization = page.getOrganization();
		final String email = page.getEmail();
		final String newPwd = page.getPwd();
		
		//update database
		IRunnableWithProgress operation = new IRunnableWithProgress() {
			public void run(IProgressMonitor progressMonitor) {
					try {
						WorkspaceManager.INSTANCE.updateUserAccount(userName, firstName, lastName, organization, email, newPwd);
						//WorkspaceManager.INSTANCE.changePwd(userName, pwd);
						MessageDialog.openInformation(getShell(), "DSLFORGE Workbench (Beta)","User Account successfully updated!");
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
