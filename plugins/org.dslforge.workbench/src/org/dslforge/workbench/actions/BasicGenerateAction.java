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

import org.dslforge.workbench.wizards.generator.BasicGeneratorWizard;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;

public class BasicGenerateAction extends AbstractWorkbenchAction implements IGenerateAction {
	
	public BasicGenerateAction() {
	}
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		super.selectionChanged(action, selection);
		//action.setEnabled(false);
	}

	@Override
	public void run(IAction action) {
		ISelection selection = getSelection();
		if (!selection.isEmpty()) {
			Object firstElement = ((IStructuredSelection)selection).getFirstElement();
			BasicGeneratorWizard wizard = new BasicGeneratorWizard(firstElement.toString());
			wizard.init(getWindow().getWorkbench(), (IStructuredSelection)selection);
			WizardDialog wizardDialog = new WizardDialog(getWindow().getShell(), wizard);
			wizardDialog.setPageSize(400, 400);
			wizardDialog.open();
		}
	}

	@Override
	public void doGenerate() {
		// TODO Auto-generated method stub
		
	}

}