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
package org.dslforge.workspace.ui.actions;

import org.dslforge.workspace.ui.wizards.NewFolderWizard;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;

public class NewFolderAction extends AbstractWorkspaceAction {

	@Override
	public void run(IAction action) {
		ISelection selection = getSelection();
		if (!selection.isEmpty()) {
			Object firstElement = ((IStructuredSelection)selection).getFirstElement();
			NewFolderWizard wizard = new NewFolderWizard(firstElement.toString());
			wizard.init(getWindow().getWorkbench(), (IStructuredSelection)selection);
			WizardDialog wizardDialog = new WizardDialog(getWindow().getShell(), wizard);
			wizardDialog.create();
			setSizeAndLocation(wizardDialog);
			wizardDialog.open();
		}
	}
}