package org.xtext.example.conf.web.actions;

import org.eclipse.emf.common.ui.action.WorkbenchWindowActionDelegate;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;


public class AboutAction extends WorkbenchWindowActionDelegate  {

	//@Override
	public void run(IAction action) {
		MessageDialog.openInformation(getWindow().getShell()
				, "Conf Application"
				, "Write something here...");
	}
}
