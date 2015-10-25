/**
 * <copyright>
 *
 * Copyright (c) 2014 dslforge. All rights reserved. 
 *
 * </copyright>
 */
package org.dslforge.authentication;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.operation.ModalContext;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public abstract class AbstractLoginDialog extends TitleAreaDialog implements CallbackHandler {

	private static final long serialVersionUID = 1L;
	
	boolean processCallbacks = false;
	
	boolean isCancelled = false;
	
	private Callback[] callbackArray;

	protected AbstractLoginDialog(Shell parentShell) {
		super(parentShell);
	}

	protected final Callback[] getCallbacks() {
		return this.callbackArray;
	}

	public abstract void internalHandle();

	public boolean isCancelled() {
		return isCancelled;
	}

	@Override
	protected Control createContents(Composite parent) {
		return super.createContents(parent);
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.security.auth.callback.CallbackHandler#handle(javax.security.auth
	 * .callback.Callback[])
	 */
	public void handle(final Callback[] callbacks) throws IOException {
		this.callbackArray = callbacks;
		final Display display = Display.getDefault();
		display.syncExec(new Runnable() {

			public void run() {
				isCancelled = false;
				setBlockOnOpen(false);
				open();
				final Button okButton = getButton(IDialogConstants.OK_ID);
				okButton.setText("Login");
				okButton.addSelectionListener(new SelectionListener() {

					private static final long serialVersionUID = 1L;

					public void widgetSelected(final SelectionEvent event) {
						processCallbacks = true;
					}

					public void widgetDefaultSelected(final SelectionEvent event) {
						// nothing to do
					}
				});
//				final Button cancel = getButton(IDialogConstants.CANCEL_ID);
//				cancel.addSelectionListener(new SelectionListener() {
//
//					private static final long serialVersionUID = 1L;
//
//					public void widgetSelected(final SelectionEvent event) {
//						isCancelled = true;
//						processCallbacks = true;
//					}
//
//					public void widgetDefaultSelected(final SelectionEvent event) {
//						// nothing to do
//					}
//				});
			}
		});
		try {
			ModalContext.setAllowReadAndDispatch(true); // Works for now.
			ModalContext.run(new IRunnableWithProgress() {

				public void run(final IProgressMonitor monitor) {
					// Wait here until OK or cancel is pressed, then let it rip.
					// The event listener is responsible for closing the dialog
					// (in the loginSucceeded event).
					while (!processCallbacks) {
						try {
							Thread.sleep(100);
						} catch (final Exception e) {
							// do nothing
						}
					}
					processCallbacks = false;
					// Call the adapter to handle the callbacks
					if (!isCancelled())
						internalHandle();
				}
			}, true, new NullProgressMonitor(), Display.getDefault());
		} catch (final Exception e) {
			final IOException ioe = new IOException();
			ioe.initCause(e);
			throw ioe;
		}
	}

	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		shell.setText("Login");
	}
}
