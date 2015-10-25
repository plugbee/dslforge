package org.eclipse.xtext.example.fowlerdsl.web.actions;

import java.util.HashMap;
import java.util.Map;

import org.dslforge.xtext.common.BasicXtextEditor;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.example.fowlerdsl.web.wizards.GeneratorWizard;

import com.google.inject.Injector;


public class GenerateAction extends Action  {

	private Injector injector;

	private Map<String, String> outlets = new HashMap<String, String>();
	
	public GenerateAction() {
		setId("generate action");
		setEnabled(true);
		setText("Generate");
	}
	
	@Override
	public void runWithEvent(Event event) {
		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow window = wb.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		IEditorPart editor = page.getActiveEditor();
		if (editor != null) {
			if (editor instanceof BasicXtextEditor) {
				IEditorInput input = ((BasicXtextEditor) editor).getEditorInput();
				if (input instanceof URIEditorInput) {
					URIEditorInput fileURI = (URIEditorInput) input;
					URI uri = fileURI.getURI();
		
					//open configuration window
					GeneratorWizard wizard = new GeneratorWizard();
					wizard.setURI(uri);
					WizardDialog wizardDialog = new WizardDialog(window.getShell(), wizard);
					wizardDialog.open();
				}
			}
		}
	}
}
