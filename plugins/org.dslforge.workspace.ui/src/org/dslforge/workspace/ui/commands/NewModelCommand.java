package org.dslforge.workspace.ui.commands;

import java.io.File;

import org.apache.log4j.Logger;
import org.dslforge.workspace.ui.commands.AbstractWorkspaceCommand;
import org.dslforge.workspace.ui.wizards.NewModelFileWizard;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;

public class NewModelCommand extends AbstractWorkspaceCommand {

	static final Logger logger = Logger.getLogger(NewModelCommand.class);

	public NewModelCommand() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		File file = unwrap(event, File.class);
		if (file!=null) {
			StructuredSelection selection = new StructuredSelection(file);
			NewModelFileWizard wizard = new NewModelFileWizard(file); 
			wizard.init(getWindow().getWorkbench(), (IStructuredSelection)selection);
			WizardDialog wizardDialog = new WizardDialog(getWindow().getShell(), wizard);
			wizardDialog.create();
			setSizeAndLocation(wizardDialog);
			return wizardDialog.open();	
		}
		return null;
	}
}