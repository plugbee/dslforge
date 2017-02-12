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
	
	public static final String PERSISTENCE_UNIT_NAME = "workspace";
	public static final String JAVAX_PERSISTENCE_JDBC_URL = "javax.persistence.jdbc.url";
	public static final String METADATA_FOLDER = ".metadata";
	public static final String JDBC_PREFIX = "jdbc:derby:";
	public static final String VISIBILITY_PRIVATE = "private";
	public static final String VISIBILITY_PUBLIC = "public";
	public static final String LOCKED = "locked";
	public static final String UNLOCKED = "unlocked";
	public static final String WORKSPACE_DEFAULT_PATH = "D:/www/dslforge/workbench";
}
