/**
 * <copyright>
 *
 * Copyright (c) 2016 PlugBee. All rights reserved.
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
package org.dslforge.workspace.config;

import org.eclipse.core.runtime.IPath;

public interface IWorkspaceContribution {

	/**
	 * Retursn the workspace root path declared in
	 * org.dslforge.workspace.configuration extension. For example e.g.
	 * D:/www/dslforge/workspace (windows) or /var/lib/tomcat/workspace (linux)
	 * 
	 * @return the workspace root path
	 */
	IPath getRootPath();
}
