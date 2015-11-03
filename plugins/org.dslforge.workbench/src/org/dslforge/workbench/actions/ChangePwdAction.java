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
package org.dslforge.workbench.actions;

import org.dslforge.workbench.commands.ChangePasswordHandler;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.action.Action;

public class ChangePwdAction extends Action {

	private static final long serialVersionUID = 1L;
	
	public ChangePwdAction() {
		setId("add users");
		setText("Account Settings..");
		setActionDefinitionId("org.dslforge.core.ui.actions.commands.changePwd");
	}

	@Override
	public void run() {
		ChangePasswordHandler handler = new ChangePasswordHandler();
		try {
			handler.execute(null);
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	@Override
//	public void runWithEvent(Event event) {
//		final String userName = (String) RWT.getUISession().getAttribute("user");
//		//User userById = manager.getUserById(userName);	
////		final String pwd = "hello";
////		WorkspaceManager.INSTANCE.changePwd(userName, pwd);	
//		
//		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
//		UpdateAccountWizard wizard = new UpdateAccountWizard();  
//		WizardDialog wizardDialog = new WizardDialog(window.getShell(), wizard);
//		wizardDialog.setPageSize(400, 400);
//		wizardDialog.open();
//	}
}