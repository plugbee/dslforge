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
package org.dslforge.workbench.wizards.user;

import java.lang.reflect.InvocationTargetException;

import org.dslforge.workbench.wizards.AbstractNewResourceWizard;
import org.dslforge.workspace.WorkspaceManager;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;

public class AddUserWizard extends AbstractNewResourceWizard {

	protected AddUserWizardPage page = null;
	
	@Override
	public void addPages() {
		page = new AddUserWizardPage("NewUser");
		page.setTitle("New User");
		page.setDescription("Ceate new user account");
		addPage(page);
	}
	
	@Override
	public boolean performFinish() {
		final String userName = page.getUserName();
		final String firstName = page.getFirstName();
		final String lastName = page.getLastName();
		final String organization = page.getOrganization();
		final String email = page.getEmail();
		final String pwd = page.getPwd();
		
		IRunnableWithProgress operation = new IRunnableWithProgress() {
			public void run(IProgressMonitor progressMonitor) {
					try {
						WorkspaceManager.INSTANCE.createUser(userName, firstName, lastName, organization, email, pwd);
						MessageDialog.openInformation(getShell(), "DSLFORGE Workbench (Beta)","User successfully added!");
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
