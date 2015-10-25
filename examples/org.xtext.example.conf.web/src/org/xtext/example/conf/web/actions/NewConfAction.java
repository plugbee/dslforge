package org.xtext.example.conf.web.actions;

import org.eclipse.emf.common.ui.action.WorkbenchWindowActionDelegate;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.xtext.example.conf.web.wizards.NewConfWizard;


public class NewConfAction extends WorkbenchWindowActionDelegate  {

	//@Override
	public void run(IAction action) {		
		NewConfWizard wizard = new NewConfWizard();
		wizard.init(getWindow().getWorkbench(), StructuredSelection.EMPTY);
		WizardDialog wizardDialog = new WizardDialog(getWindow().getShell(), wizard);
		wizardDialog.open();
	}
}
