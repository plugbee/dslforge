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
package org.dslforge.workbench.commands;

import org.dslforge.workbench.wizards.project.NewProjectWizard;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

public class NewProjectCommandHandler extends AbstractHandler {

	public NewProjectCommandHandler() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean isEnabled() {
		return true;
	}
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		NewProjectWizard wizard = new NewProjectWizard();
		wizard.init(PlatformUI.getWorkbench(), StructuredSelection.EMPTY);
		Shell activeShell = Display.getDefault().getActiveShell();
		if (activeShell!=null) {
			WizardDialog wizardDialog = new WizardDialog(activeShell, wizard);
			wizardDialog.setPageSize(400, 400);
			wizardDialog.open();	
		}
		return null;
	}

}
