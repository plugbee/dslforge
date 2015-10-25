package org.xtext.example.domainmodel.web.actions;

import java.io.File;

import org.dslforge.workspace.WorkspaceManager;
import org.dslforge.workbench.wizards.file.NewFileWizard;
import org.eclipse.emf.common.ui.action.WorkbenchWindowActionDelegate;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;


public class NewDomainmodelAction extends WorkbenchWindowActionDelegate  {

	@Override
	public void run(IAction action) {		
		File rootFoler = WorkspaceManager.INSTANCE.getRootFoler();
		StructuredSelection selection = new StructuredSelection(rootFoler);
		if (!selection.isEmpty()) {
			Object firstElement = ((IStructuredSelection)selection).getFirstElement();
			NewFileWizard wizard = new NewFileWizard(firstElement.toString(), "Domainmodel", "dmodel");
			wizard.init(getWindow().getWorkbench(), (IStructuredSelection)selection);
			wizard.setWindowTitle("New Domainmodel Model");
			WizardDialog wizardDialog = new WizardDialog(getWindow().getShell(), wizard);
			wizardDialog.setPageSize(400, 400);
			wizardDialog.open();
		}
	}
}