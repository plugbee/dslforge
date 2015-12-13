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
package org.dslforge.workbench;

import java.net.URL;
import java.security.PrivilegedAction;

import javax.security.auth.Subject;
import javax.security.auth.login.LoginException;

import org.dslforge.workbench.IWorkbenchConstants.Mode;
import org.dslforge.workbench.internal.Activator;
import org.eclipse.equinox.security.auth.ILoginContext;
import org.eclipse.equinox.security.auth.LoginContextFactory;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.rap.rwt.application.EntryPoint;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPreferenceConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.internal.util.PrefUtil;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

/**
 * Basic Workbench UI entry point
 * 
 * @author Amine Lajmi
 *
 */
public class BasicWorkbench implements EntryPoint {
	
	public static final Mode config = Mode.WITH_AUTHENTICATION;
	
	public int createUI() {
		System.out.println("[DSLFORGE] Starting workbench...");
		switch(config) {
		case WITH_AUTHENTICATION:
			return createUIWithAuthentication();
		case WITHOUT_AUTHENTICATION:
			return createUIWithoutAuthentication();
		default:
			return 0;
		}
	}
	
	public int createUIWithoutAuthentication() {
		//ScopedPreferenceStore prefStore = (ScopedPreferenceStore) PrefUtil.getAPIPreferenceStore();
		//String keyPresentationId = IWorkbenchPreferenceConstants.PRESENTATION_FACTORY_ID;
		//String presentationId = prefStore.getString(keyPresentationId);
		WorkbenchAdvisor worbenchAdvisor = new BasicWorkbenchAdvisor();
		// if (IWorkbenchConstants.PLATFORM_PRESENTATION.equals(presentationId))
		// {
		// worbenchAdvisor = new BasicPresentationWorkbenchAdvisor();
		// }
		// set invited mode
		Display display = PlatformUI.createDisplay();
		RWT.getUISession().setAttribute("user", "Debug");
		int result = PlatformUI.createAndRunWorkbench(display, worbenchAdvisor);
		display.dispose();
		return result;
	}

	public int createUIWithAuthentication() {
		String configName = IWorkbenchConstants.DATABASE_AUTHENTICATION;
		Integer result = null;
		URL configUrl = Activator.getInstance().getBundle().getEntry(IWorkbenchConstants.SECURITY_CONFIG_FILE);
		if (configUrl==null) {
			throw new RuntimeException("Could not load data/config.txt: NULL returned!");
		}
		ILoginContext secureContext = LoginContextFactory.createContext(configName, configUrl);
		try {
			secureContext.login();
		} catch (LoginException exception) {
			Throwable cause = exception.getCause();
			if (cause != null && cause.getCause() instanceof ThreadDeath) {
				throw (ThreadDeath) cause.getCause();
			}
		}

		Display display = PlatformUI.createDisplay();
		try {
			Subject subject = secureContext.getSubject();
			PrivilegedAction<?> runAction = getRunAction(display);
			result = (Integer) Subject.doAs(subject, runAction);
		} catch (Exception e) {
			if(e instanceof LoginException) {
				return createUIWithAuthentication();
			} else {
				return createUIWithAuthentication();
				//e.printStackTrace();	
			}
		} finally {
			display.dispose();
			try {
				secureContext.logout();
			} catch (LoginException e) {
				e.printStackTrace();
			}
		}
		return result;
	}	
	
	private PrivilegedAction<?> getRunAction(final Display display) {
		return new PrivilegedAction<Object>() {
			public Object run() {
				ScopedPreferenceStore prefStore = (ScopedPreferenceStore) PrefUtil.getAPIPreferenceStore();
				String keyPresentationId = IWorkbenchPreferenceConstants.PRESENTATION_FACTORY_ID;
				String presentationId = prefStore.getString(keyPresentationId);
				// presentationId="org.eclipse.rap.design.example.fancy.factory";
				// org.dslforge.workbench.branding
				// if
				// (IWorkbenchConstants.PLATFORM_PRESENTATION.equals(presentationId))
				// {
				// new BasicPresentationWorkbenchAdvisor();
				// }
				WorkbenchAdvisor worbenchAdvisor = new BasicWorkbenchAdvisor();
				int result = PlatformUI.createAndRunWorkbench(display, worbenchAdvisor);
				return new Integer(result);
			}
		};
	}
}