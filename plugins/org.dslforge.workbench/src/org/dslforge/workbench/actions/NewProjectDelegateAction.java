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

import org.dslforge.workbench.wizards.project.NewProjectWizard;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;

public class NewProjectDelegateAction extends AbstractWorkbenchActionDelegate {

	@Override
	public void run(IAction action) {
		NewProjectWizard wizard = new NewProjectWizard();
		wizard.init(getWindow().getWorkbench(), StructuredSelection.EMPTY);
		WizardDialog wizardDialog = new WizardDialog(getWindow().getShell(), wizard);
		wizardDialog.open();
	}
}
