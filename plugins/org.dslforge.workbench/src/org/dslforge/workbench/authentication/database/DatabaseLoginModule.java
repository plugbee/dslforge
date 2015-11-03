/**
 * <copyright>
 *
 * Copyright (c) 2015 PlugBee. All rights reserved.
 * 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Amine Lajmi - Initial API and implementation
 *
 * </copyright>
 */
package org.dslforge.workbench.authentication.database;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.security.auth.Subject;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.TextOutputCallback;
import javax.security.auth.login.LoginException;

import org.dslforge.database.pu.tables.User;
import org.dslforge.workbench.mail.MailUtil;
import org.dslforge.workspace.WorkspaceManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;

public class DatabaseLoginModule implements javax.security.auth.spi.LoginModule {

	private static final String LOGIN_HINT = "Sign in with the username and password already\n sent to you by email, or use our invited account\n (login:user/password:pwd).";

	private CallbackHandler callbackHandler;

	private boolean loggedIn;

	private Subject subject;
	
	private String username;
	
	public DatabaseLoginModule() {
	}
	
	@SuppressWarnings("rawtypes")
	public void initialize(Subject subject, CallbackHandler callbackHandler, Map sharedState, Map options) {
		this.subject = subject;
		this.callbackHandler = callbackHandler;
	}

	public boolean login() throws LoginException {
		Callback label = new TextOutputCallback(TextOutputCallback.INFORMATION, LOGIN_HINT);

		NameCallback nameCallback = new NameCallback("Username:");
		PasswordCallback passwordCallback = new PasswordCallback("Password:", false);
		try {
			callbackHandler.handle(new Callback[] { label, nameCallback, passwordCallback });
		} catch (ThreadDeath death) {
			LoginException loginException = new LoginException();
			loginException.initCause(death);
			throw loginException;
		} catch (Exception exception) {
			LoginException loginException = new LoginException();
			loginException.initCause(exception);
			throw loginException;
		}
		username = nameCallback.getName();
		String password = "";
		if (passwordCallback.getPassword() != null) {
			password = String.valueOf(passwordCallback.getPassword());
		}
		
		//authenticate user
		User user = WorkspaceManager.INSTANCE.authenticateUser(username, password);
		loggedIn = (user!=null);
		if (loggedIn) {
			final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			final Date date = new Date();
			System.out.println("[DSLFORGE] "+username + " connected @: " + dateFormat.format(date));
			
			Display.getDefault().asyncExec(new Runnable() {		
				@Override
				public void run() {
					String subject = "[DSLFORGE] " + username + " connected to the Workbench!";
					String from = "postmaster@dslforge.com";
					String to = "aminelajmi@gmail.com";
					String message = "[DSLFORGE] "+username + " connected @: " + dateFormat.format(date);
					MailUtil.sendEMail(from, to, subject,message);
				}
			});
				//kick out the spy guys
			if (username.equals("sven") || username.equals("franz")) {
				System.out.println("[DSLFORGE] "+username + " has been kicked out! " + dateFormat.format(date));
				MessageDialog.openInformation(null, "Ooops, you've been kicked out","It seems you've done something wrong!");
				return false;
			}
			
			
		}
		return loggedIn;
	}

	public boolean commit() throws LoginException {		
		RWT.getUISession().setAttribute("user", username);
		subject.getPrivateCredentials().add(Display.getCurrent());
		subject.getPrivateCredentials().add(SWT.getPlatform());
		return loggedIn;
	}
	
	public boolean abort() throws LoginException {
		loggedIn = false;
		return true;
	}

	public boolean logout() throws LoginException {
		loggedIn = false;
		return true;
	}
}
