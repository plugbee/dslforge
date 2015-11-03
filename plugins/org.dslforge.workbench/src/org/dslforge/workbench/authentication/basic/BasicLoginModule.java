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
package org.dslforge.workbench.authentication.basic;

import java.util.HashMap;
import java.util.Map;

import javax.security.auth.Subject;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.TextOutputCallback;
import javax.security.auth.login.LoginException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;

public class BasicLoginModule implements javax.security.auth.spi.LoginModule {

	private static final String LOGIN_HINT = "Please sign in with your username and password:";

	private static final Map<String, String> USERS = new HashMap<String, String>();
	{
		USERS.put("amine", "lajmi");
		USERS.put("cristina", "ferreira");
		USERS.put("javier", "martinez");
		USERS.put("tewfik", "ziadi");
		USERS.put("user", "models");
	}

	private CallbackHandler callbackHandler;

	private boolean loggedIn;

	private Subject subject;

	public BasicLoginModule() {
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
		String username = nameCallback.getName();
		String password = "";
		if (passwordCallback.getPassword() != null) {
			password = String.valueOf(passwordCallback.getPassword());
		}
		loggedIn = password.equals(USERS.get(username));
		return loggedIn;
	}

	public boolean commit() throws LoginException {
		subject.getPublicCredentials().add(USERS);
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
