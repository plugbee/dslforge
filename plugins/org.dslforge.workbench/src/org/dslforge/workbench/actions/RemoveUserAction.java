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
package org.dslforge.workbench.actions;

import org.dslforge.workbench.wizards.user.RemoveUserWizard;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class RemoveUserAction extends Action {

	private static final long serialVersionUID = 1L;

	public RemoveUserAction() {
		setId("remove users");
		final String currentUser = (String) RWT.getUISession().getAttribute("user");
		if (currentUser.equals("admin")) {
			setEnabled(true);
		} else {
			setEnabled(false);
		}
		setText("Remove User");
	}

	@Override
	public void runWithEvent(Event event) {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		RemoveUserWizard wizard = new RemoveUserWizard(); 
		WizardDialog wizardDialog = new WizardDialog(window.getShell(), wizard);
		wizardDialog.setPageSize(400, 400);
		wizardDialog.open();
	}
}

