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

	public static final String DEFAULT_WORKING_DIRECTORY = "D:\\dev\\www\\home\\clean\\workspace";
	public static final String JDBC_DATABASE_URL = "jdbc:derby:D:/www/dslforge/database;create=true";	
    public static final String JDBC_DATABASE_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	public static final String PERSISTENCE_UNIT_NAME = "dslforge";
    public static final String JDBC_DATABASE_USER = "admin";
    public static final String JDBC_DATABASE_PASSWORD = "admin";
	public static final String VISIBILITY_PRIVATE = "private";
	public static final String VISIBILITY_PUBLIC = "public";
	public static final String PATH_SEPARATOR = "\\";
	public static final String LOCKED = "locked";
	public static final String UNLOCKED = "unlocked";
}
