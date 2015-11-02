/**
 * <copyright>
 *
 * Copyright (c) 2015 DSLFORGE. All rights reserved.
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

import org.dslforge.workspace.IWorkspaceConstants;

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
	public static final String NAVIGATOR_VIEW_ID = "org.dslforge.rap.navigator.view";
	public static final String CHAT_CONTENT_VIEW_ID = "org.dslforge.workbench.chat.view";
	public static final String CHEAT_SHEET_VIEW_ID = "org.dslforge.rap.workbench.cheatsheet2";
	
	public static final String PLATFORM_PRESENTATION = "org.eclipse.ui.presentations.default";	
	public static final String SECURITY_CONFIG_FILE = "data/config.txt";
	public static final String DATABASE_AUTHENTICATION = "DATABASE";
		
	public static String BOOT_CLASS_PATH = 
	System.getProperty("java.class.path") + ";" +
			IWorkspaceConstants.TOMCAT_PATH +"webapps\\workbench\\WEB-INF\\plugins\\org.eclipse.rap.jface.databinding_3.0.1.20150709-1405.jar;"+
			IWorkspaceConstants.TOMCAT_PATH +"webapps\\workbench\\WEB-INF\\plugins\\org.eclipse.rap.jface_3.0.1.20150709-1405.jar;"+
			IWorkspaceConstants.TOMCAT_PATH +"webapps\\workbench\\WEB-INF\\plugins\\org.eclipse.rap.rwt.osgi_3.0.1.20150709-1405.jar;"+
			IWorkspaceConstants.TOMCAT_PATH +"webapps\\workbench\\WEB-INF\\plugins\\org.eclipse.rap.rwt_3.0.1.20150908-1130.jar;"+
			IWorkspaceConstants.TOMCAT_PATH +"webapps\\workbench\\WEB-INF\\plugins\\org.eclipse.rap.ui.cheatsheets_3.0.1.20150709-1405.jar;"+
			IWorkspaceConstants.TOMCAT_PATH +"webapps\\workbench\\WEB-INF\\plugins\\org.eclipse.rap.ui.forms_3.0.1.20150709-1405.jar;"+
			IWorkspaceConstants.TOMCAT_PATH +"webapps\\workbench\\WEB-INF\\plugins\\org.eclipse.rap.ui.navigator_1.4.0.20120709-1436.jar;"+
			IWorkspaceConstants.TOMCAT_PATH +"webapps\\workbench\\WEB-INF\\plugins\\org.eclipse.rap.ui.views_3.0.1.20150709-1405.jar;"+
			IWorkspaceConstants.TOMCAT_PATH +"webapps\\workbench\\WEB-INF\\plugins\\org.eclipse.rap.ui.workbench_3.0.1.20150709-1405.jar;"+
			IWorkspaceConstants.TOMCAT_PATH +"webapps\\workbench\\WEB-INF\\plugins\\org.eclipse.rap.ui_3.0.1.20150709-1405.jar;"+
			IWorkspaceConstants.TOMCAT_PATH +"webapps\\workbench\\WEB-INF\\plugins\\org.eclipse.core.runtime_3.11.1.v20150903-1804.jar;"+
			IWorkspaceConstants.TOMCAT_PATH +"webapps\\workbench\\WEB-INF\\plugins\\org.eclipse.equinox.common_3.7.0.v20150402-1709.jar"
	;

}
