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

import java.io.File;

import org.dslforge.workbench.wizards.file.NewFileWizard;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;


public class NewModelCommandHandler extends AbstractHandler {

	public NewModelCommandHandler() {
	}
	
	@Override
	public boolean isEnabled() {
		return true;
	}
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell activeShell = Display.getDefault().getActiveShell();
		File file = CommandUtil.unwrap(event, File.class);
		if (file!=null) {
			NewFileWizard wizard = new NewFileWizard(file);
			if (event instanceof ExecutionEvent) {
				Object object = HandlerUtil.getCurrentSelection((ExecutionEvent) event);
				if (object instanceof IStructuredSelection) {
					wizard.init(PlatformUI.getWorkbench(), (IStructuredSelection) object);
				}	
			}
			WizardDialog wizardDialog = new WizardDialog(activeShell, wizard);
			wizardDialog.setPageSize(400, 400);
			wizardDialog.open();
		} else {
			MessageDialog.openInformation(activeShell, "DSLFORGE Workbench (Beta)","Please select the container where the model should be created!");
		}
		
		return null;
	}
}
