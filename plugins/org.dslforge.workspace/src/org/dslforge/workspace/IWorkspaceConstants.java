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
package org.dslforge.workspace;

public interface IWorkspaceConstants {
	
	//DEV DSLFORGE
	public static final String DEFAULT_WORKING_DIRECTORY = "D:\\dev\\www\\home\\clean\\workspace";
//	public static final String JDBC_TEST_URL = "jdbc:derby:D:/www/dslforge/database;create=true";
	
	//PROD DSLFORGE
//	public static final String DEFAULT_WORKING_DIRECTORY = "D:\\www\\dslforge\\workspace";  
	public static final String JDBC_TEST_URL = "jdbc:derby:D:/www/dslforge/database;create=true";
	
	public static final boolean INJECT_USERS = false;
    public static final String JDBC_TEST_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	public static final String PERSISTENCE_UNIT_NAME = "dslforge";
    public static final String JDBC_TEST_USER = "admin";
    public static final String JDBC_TEST_PASSWORD = "admin";
}
