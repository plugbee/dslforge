package org.dslforge.workspace.ui.commands;

import java.io.File;

import org.apache.log4j.Logger;
import org.dslforge.workspace.ui.wizards.NewFolderWizard;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;

public class NewFolderCommand extends AbstractWorkspaceCommand {

	static final Logger logger = Logger.getLogger(NewFileCommand.class);

	public NewFolderCommand() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell activeShell = getWindow().getShell();
		File file = unwrap(event, File.class);
		if (file != null) {
			StructuredSelection selection = new StructuredSelection(file);
			NewFolderWizard wizard = new NewFolderWizard(selection.getFirstElement().toString());
			wizard.init(getWindow().getWorkbench(), (IStructuredSelection) selection);
			WizardDialog wizardDialog = new WizardDialog(activeShell, wizard);
			wizardDialog.create();
			setSizeAndLocation(wizardDialog);
			return wizardDialog.open();
		}
		return null;
	}
}