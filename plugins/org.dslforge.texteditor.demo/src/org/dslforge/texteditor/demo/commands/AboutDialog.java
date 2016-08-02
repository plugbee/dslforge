package org.dslforge.texteditor.demo.commands;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

public class AboutDialog  extends Dialog {

	private static final long serialVersionUID = 1L;

	private Label aboutLabel;
	private final String title;
	private final String message;
	
	public AboutDialog(Shell parent, String title, String message) {
		super(parent);
		this.title = title;
		this.message = message;
	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		if (title != null) {
			shell.setText(title);
		}
		// Workaround for RWT Text Size Determination
		shell.addListener(SWT.Resize, new Listener() {
			private static final long serialVersionUID = 1L;
			public void handleEvent(Event event) {
				initializeBounds();
			}
		});
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		composite.setLayout(new GridLayout(2, false));
		aboutLabel = new Label(composite, SWT.NONE);
		GridData messageData = new GridData(SWT.FILL, SWT.CENTER, true, false);
		messageData.horizontalSpan = 2;
		aboutLabel.setLayoutData(messageData);
		initilizeDialogArea();
		return composite;
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, "OK", false);
	}

	@Override
	protected void buttonPressed(int buttonId) {
		super.buttonPressed(buttonId);
	}

	private void initilizeDialogArea() {
		if (message != null) {
			aboutLabel.setText(message);
		}
	}
}
