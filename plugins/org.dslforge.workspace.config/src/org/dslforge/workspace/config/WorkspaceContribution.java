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
import org.eclipse.core.runtime.Path;

public class WorkspaceContribution implements IWorkspaceContribution {

	private IPath rootPath;
	
	public WorkspaceContribution(String stringPath) {
		rootPath = new Path(stringPath);
	}

	@Override
	public IPath getWorkspaceRootPath() {
		return rootPath;
	}
}