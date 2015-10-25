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
package org.dslforge.xtext.generator.web

import org.dslforge.xtext.generator.IWebProjectGenerator
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.Grammar
import org.dslforge.xtext.generator.util.GeneratorUtil
import org.eclipse.emf.ecore.resource.Resource

class GenWorkbench implements IWebProjectGenerator{
	
	val relativePath = "/"
	var String projectName
	var String grammarShortName
	var String basePath
	var boolean authentication
	
	override doGenerate(EObject input, IFileSystemAccess fsa) {
		var grammar = input as Grammar
		projectName=GeneratorUtil::getProjectName(grammar)
		grammarShortName= GeneratorUtil::getGrammarShortName(grammar)
		basePath=GeneratorUtil::getBasePath(grammar)
		fsa.generateFile(basePath + relativePath +grammarShortName+"Workbench.java", "src", toJava())
	}
	
	def setAuthentication(boolean isEnabled) {
		authentication = isEnabled
	}
	
	def toJava()'''
package «projectName»;

import org.eclipse.rap.rwt.application.EntryPoint;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPreferenceConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.internal.util.PrefUtil;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
«IF authentication»
import java.net.URL;
import java.security.PrivilegedAction;
import javax.security.auth.Subject;
import javax.security.auth.login.LoginException;
import org.eclipse.equinox.security.auth.ILoginContext;
import org.eclipse.equinox.security.auth.LoginContextFactory;
import org.osgi.framework.BundleContext;
import «projectName».internal.Activator;
import «projectName».presentation.«grammarShortName.toFirstUpper»PresentationWorkbenchAdvisor;
«ENDIF»
import «projectName».presentation.«grammarShortName»PresentationWorkbenchAdvisor;


public class «grammarShortName»Workbench implements EntryPoint {
	
	private static final String PLATFORM_PRESENTATION = "org.dslforge.core.ui.presentation";
	«IF !authentication»
	public int createUI() {
	    ScopedPreferenceStore prefStore = ( ScopedPreferenceStore )PrefUtil.getAPIPreferenceStore();
	    String keyPresentationId = IWorkbenchPreferenceConstants.PRESENTATION_FACTORY_ID;
	    String presentationId = prefStore.getString( keyPresentationId );
	
	    WorkbenchAdvisor worbenchAdvisor = new «grammarShortName»WorkbenchAdvisor();
	    if( PLATFORM_PRESENTATION.equals( presentationId ) ) {
	      worbenchAdvisor = new «grammarShortName»PresentationWorkbenchAdvisor();
	}
	
	Display display = PlatformUI.createDisplay();
	int result = PlatformUI.createAndRunWorkbench( display, worbenchAdvisor );
	display.dispose();
	return result;
	}
	«ELSE»
	private static final String SECURITY_CONFIG_FILE = "data/config.txt";
		
	public int createUI() {
		String configName = "BASIC";
		BundleContext bundleContext = Activator.getDefault().getBundle().getBundleContext();
		URL configUrl = bundleContext.getBundle().getEntry(SECURITY_CONFIG_FILE);
		ILoginContext secureContext = LoginContextFactory.createContext(configName, configUrl);
		try {
			secureContext.login();
		} catch (LoginException exception) {
			Throwable cause = exception.getCause();
			if (cause != null && cause.getCause() instanceof ThreadDeath) {
				throw (ThreadDeath) cause.getCause();
			}
		}

		Integer result = null;
		Display display = PlatformUI.createDisplay();
		try {
			Subject subject = secureContext.getSubject();
			PrivilegedAction<?> runAction = getRunAction(display);
			result = (Integer) Subject.doAs(subject, runAction);
		} catch (Exception e) {
			e.printStackTrace();
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
				if (PLATFORM_PRESENTATION.equals(presentationId)) {
					new «grammarShortName.toFirstUpper»PresentationWorkbenchAdvisor();
				}
				WorkbenchAdvisor worbenchAdvisor = new «grammarShortName.toFirstUpper»WorkbenchAdvisor();
				int result = PlatformUI.createAndRunWorkbench(display, worbenchAdvisor);
				return new Integer(result);
			}
		};
	}
	«ENDIF»
}
	'''

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}