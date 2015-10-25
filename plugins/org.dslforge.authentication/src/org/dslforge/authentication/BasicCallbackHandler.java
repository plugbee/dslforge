/**
 * <copyright>
 *
 * Copyright (c) 2014 dslforge. All rights reserved. 
 *
 * </copyright>
 */
package org.dslforge.authentication;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.TextOutputCallback;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * Handles the callbacks to show a RCP/RAP UI for the LoginModule.
 */
public class BasicCallbackHandler extends AbstractLoginDialog {

	private static final long serialVersionUID = 1L;

	public BasicCallbackHandler() {
		this(Display.getDefault().getActiveShell());
	}

	protected BasicCallbackHandler(Shell parentShell) {
		super(parentShell);
	}

	protected Point getInitialSize() {
		return new Point(460, 260);
	}

	protected Control createDialogArea(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		layout.marginWidth = 10;
		layout.makeColumnsEqualWidth = false;
		composite.setLayout(layout);
		composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		createCallbackHandlers(composite);
		return composite;
	}

	@Override
	protected Control createButtonBar(Composite parent) {
	  	Composite composite = new Composite(parent, SWT.NONE);
    	GridLayout layout = new GridLayout();
    	layout.marginHeight = 0;
    	layout.marginWidth = 0;
    	layout.horizontalSpacing = 0;
    	composite.setLayout(layout);
    	composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
    	composite.setFont(parent.getFont());

		// create help control if needed
        if (isHelpAvailable()) {
        	Control helpControl = createHelpControl(composite);
        	((GridData) helpControl.getLayoutData()).horizontalIndent = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
		}
        Control buttonSection = super.createButtonBar(composite);
        ((GridData) buttonSection.getLayoutData()).grabExcessHorizontalSpace = true;
        return composite;
	}
	
	protected void createButtonsForButtonBar(Composite parent) {
		// create OK and Cancel buttons by default
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.get().OK_LABEL,true);
	}
	
	private void createCallbackHandlers(Composite composite) {
		Callback[] callbacks = getCallbacks();
		for (int i = 0; i < callbacks.length; i++) {
			Callback callback = callbacks[i];
			if (callback instanceof TextOutputCallback) {
				createTextOutputHandler(composite, (TextOutputCallback) callback);
			} else if (callback instanceof NameCallback) {
				createNameHandler(composite, (NameCallback) callback);
			} else if (callback instanceof PasswordCallback) {
				createPasswordHandler(composite, (PasswordCallback) callback);
			}
		}
	}

	private void createPasswordHandler(Composite composite, final PasswordCallback callback) {
		Label label = new Label(composite, SWT.NONE);
		label.setText(callback.getPrompt());
		label.setLayoutData( new GridData( 140, SWT.DEFAULT ) );
		
		final Text passwordText = new Text(composite, SWT.SINGLE | SWT.LEAD | SWT.PASSWORD | SWT.BORDER);
		GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
		passwordText.setLayoutData(layoutData);
		
		passwordText.addModifyListener(new ModifyListener() {
			private static final long serialVersionUID = 1L;
			public void modifyText(ModifyEvent event) {
				callback.setPassword(passwordText.getText().toCharArray());
			}
		});
	}

	private void createNameHandler(Composite composite, final NameCallback callback) {
		Label label = new Label(composite, SWT.NONE);
		label.setText(callback.getPrompt());
		label.setLayoutData( new GridData( 140, SWT.DEFAULT ) );
		
		final Text text = new Text(composite, SWT.SINGLE | SWT.LEAD | SWT.BORDER);
		GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
		text.setLayoutData(layoutData);
		
		text.addModifyListener(new ModifyListener() {
			private static final long serialVersionUID = 1L;
			public void modifyText(ModifyEvent event) {
				callback.setName(text.getText());
			}
		});
		
		text.setFocus();
	}

	private void createTextOutputHandler(Composite composite, TextOutputCallback callback) {
		int messageType = callback.getMessageType();
		int dialogMessageType = IMessageProvider.NONE;
		switch (messageType) {
		case TextOutputCallback.INFORMATION:
			dialogMessageType = IMessageProvider.INFORMATION;
			break;
		case TextOutputCallback.WARNING:
			dialogMessageType = IMessageProvider.WARNING;
			break;
		case TextOutputCallback.ERROR:
			dialogMessageType = IMessageProvider.ERROR;
			break;
		}
		setMessage(callback.getMessage(), dialogMessageType);
	}

	public void internalHandle() {
	}
}