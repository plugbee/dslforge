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
package org.dslforge.workbench.commands;

import org.dslforge.workbench.wizards.user.UpdateAccountWizard;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class ChangePasswordHandler extends AbstractHandler {

	public ChangePasswordHandler() {
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		UpdateAccountWizard wizard = new UpdateAccountWizard();
		WizardDialog wizardDialog = new WizardDialog(window.getShell(), wizard);
		wizardDialog.setPageSize(400, 400);
		wizardDialog.open();
		return null;
	}
}