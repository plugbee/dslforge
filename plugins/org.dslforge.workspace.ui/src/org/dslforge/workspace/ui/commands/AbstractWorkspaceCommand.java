package org.dslforge.workspace.ui.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public abstract class AbstractWorkspaceCommand extends AbstractHandler {

	protected AbstractWorkspaceCommand() {
		super();
	}
	
	@Override
	public boolean isEnabled() {
		return true;
	}

	public static <T> T unwrap(Object object, Class<T> type) {
		if (object instanceof ExecutionEvent) {
			object = HandlerUtil.getCurrentSelection((ExecutionEvent) object);
		}
		if (object instanceof IStructuredSelection) {
			object = ((IStructuredSelection) object).getFirstElement();
		}
		if (object instanceof IAdaptable) {
			object = ((IAdaptable) object).getAdapter(type);
		}
		if (type.isInstance(object)) {
			return type.cast(object);
		}
		return null;
	}
	
	public void setSizeAndLocation(WizardDialog wizardDialog) {
		wizardDialog.getShell().setSize(600, 500);
		Shell activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		Rectangle bounds = activeShell.getBounds();
		Rectangle rect = wizardDialog.getShell().getBounds();
		int x = bounds.x + (bounds.width - rect.width) / 2;
		int y = bounds.y + (bounds.height - rect.height) / 2;
		wizardDialog.getShell().setLocation(x, y);
	}
	
	public IWorkbenchWindow getWindow() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	}
	
}