package org.dslforge.workspace.ui.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

public abstract class AbstractWindowActionDelegate implements IWorkbenchWindowActionDelegate {

	private ISelection selection;
	
	private IWorkbenchWindow window;

	@Override
	public void init(IWorkbenchWindow window) {
		setWindow(window);
		setSelection(window.getSelectionService().getSelection());
	}
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.setSelection(selection);
	}
	
	public ISelection getSelection() {
		return selection;
	}

	public void setSelection(ISelection selection) {
		this.selection = selection;
	}

	public IWorkbenchWindow getWindow() {
		return window;
	}

	public void setWindow(IWorkbenchWindow window) {
		this.window = window;
	}
	
	@Override
	public abstract void run(IAction action);

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}
}
