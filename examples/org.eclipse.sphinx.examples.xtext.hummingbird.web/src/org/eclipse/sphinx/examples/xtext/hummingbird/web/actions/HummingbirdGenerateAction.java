package org.eclipse.sphinx.examples.xtext.hummingbird.web.actions;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class HummingbirdGenerateAction  extends Action  {

	@Inject
	private Injector injector;

	private Map<String, String> outlets = new HashMap<String, String>();
	
	public HummingbirdGenerateAction() {
		setId("Hummingbird generate action");
		setEnabled(false);
		setText("Hummingbird Generator");
	}
	
	@Override
	public void runWithEvent(Event event) {
		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow window = wb.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		IEditorPart editor = page.getActiveEditor();
	}
}
