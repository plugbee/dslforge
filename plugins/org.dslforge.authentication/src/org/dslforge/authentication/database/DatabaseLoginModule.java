/**
 * <copyright>
 *
 * Copyright (c) 2014 dslforge. All rights reserved. 
 *
 * </copyright>
 */
package org.dslforge.authentication.database;

import java.util.Map;

import javax.security.auth.Subject;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.TextOutputCallback;
import javax.security.auth.login.LoginException;

import org.dslforge.database.pu.tables.User;
import org.dslforge.rap.workspace.WorkspaceManager;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;

public class DatabaseLoginModule implements javax.security.auth.spi.LoginModule {

	private static final String LOGIN_HINT = "Please sign in with your username and password:";

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
		User user = WorkspaceManager.getInstance().authenticateUser(username, password);
		loggedIn = (user!=null);
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
