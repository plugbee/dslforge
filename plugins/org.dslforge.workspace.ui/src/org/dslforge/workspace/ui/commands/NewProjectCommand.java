package org.dslforge.workspace.ui.commands;

import org.apache.log4j.Logger;
import org.dslforge.workspace.ui.wizards.NewProjectWizard;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;

public class NewProjectCommand extends AbstractWorkspaceCommand {

	static final Logger logger = Logger.getLogger(NewProjectCommand.class);

	public NewProjectCommand() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		NewProjectWizard wizard = new NewProjectWizard();
		wizard.init(getWindow().getWorkbench(), StructuredSelection.EMPTY);
		WizardDialog wizardDialog = new WizardDialog(getWindow().getShell(), wizard);
		wizardDialog.create();
		setSizeAndLocation(wizardDialog);
		return wizardDialog.open();
	}
}