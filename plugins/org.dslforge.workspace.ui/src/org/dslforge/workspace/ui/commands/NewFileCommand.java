package org.dslforge.workspace.ui.commands;

import java.io.File;

import org.apache.log4j.Logger;
import org.dslforge.workspace.ui.wizards.NewFileWizard;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

public class NewFileCommand extends AbstractWorkspaceCommand {

	static final Logger logger = Logger.getLogger(NewFileCommand.class);

	public NewFileCommand() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		File file = unwrap(event, File.class);
		if (file != null) {
			NewFileWizard wizard = new NewFileWizard(file);
			StructuredSelection selection = new StructuredSelection(file);
			wizard.init(PlatformUI.getWorkbench(), selection);
			WizardDialog wizardDialog = new WizardDialog(activeShell, wizard);
			wizardDialog.create();
			setSizeAndLocation(wizardDialog);
			return wizardDialog.open();
		}
		return null;
	}
}