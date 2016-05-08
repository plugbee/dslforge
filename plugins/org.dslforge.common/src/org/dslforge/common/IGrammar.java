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
 * </copyright>
 */
package org.dslforge.common;

import java.util.Set;

import org.eclipse.core.runtime.IPath;

public interface IGrammar {

	String getShortName();
	
	String getName();
	
	Set<String> getKeywords();
	
	IPath getFullPath();

	String getFileExtension();

	String getBasePath();

	String getEntryRule();
	
}
