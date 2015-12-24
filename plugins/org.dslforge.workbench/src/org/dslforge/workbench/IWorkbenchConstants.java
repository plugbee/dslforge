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

public interface IWorkbenchConstants {
	
	public enum Mode {
		WITH_AUTHENTICATION,
		WITHOUT_AUTHENTICATION
	}
	
	public static final String LEFT = "left";
	public static final String TOP_LEFT = "topLeft";
	public static final String BOTTOM_RIGHT = "bottomRight";
	
	public static final String VISIBILITY_PRIVATE = "private";
	public static final String VISIBILITY_PUBLIC = "public";
	
	public static final String BASIC_WORKBENCH_VIEW_ID = "org.dslforge.workbench.ui.parts.view";	
	public static final String ID_PERSPECTIVE = "org.dslforge.workbench.ui.parts.perspective";
	public static final String NAVIGATOR_VIEW_ID = "org.dslforge.navigator.view";
	public static final String CHAT_CONTENT_VIEW_ID = "org.dslforge.workbench.chat.view";
	public static final String CHEAT_SHEET_VIEW_ID = "org.dslforge.workbench.cheatsheet2";
	
	public static final String PLATFORM_PRESENTATION = "org.eclipse.ui.presentations.default";	
	public static final String SECURITY_CONFIG_FILE = "data/config.txt";
	public static final String DATABASE_AUTHENTICATION = "DATABASE";
	
	
	public static final String TOMCAT_INSTANCE_PATH = "C:\\Program Files\\Apache Software Foundation\\Tomcat 7.0\\";
	public static final String WAR_DEPLOYMENT_PATH=	TOMCAT_INSTANCE_PATH + "webapps\\workbench\\WEB-INF\\";
	public static final String[] COMPILER_CLASSPATH_ENTRIES = new String[] { 
			"org.eclipse.rap.jface.databinding", "org.eclipse.rap.jface", "org.eclipse.rap.rwt.osgi",
			"org.eclipse.rap.rwt", "org.eclipse.rap.ui.cheatsheets", "org.eclipse.rap.ui.forms",
			"org.eclipse.rap.ui.navigator", "org.eclipse.rap.ui.views", "org.eclipse.rap.ui.workbench",
			"org.eclipse.rap.ui", "org.eclipse.core.runtime", "org.eclipse.equinox.common" };

}
