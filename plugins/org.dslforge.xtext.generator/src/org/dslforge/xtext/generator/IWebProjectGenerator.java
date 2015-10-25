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
package org.dslforge.xtext.generator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

public interface IWebProjectGenerator extends IGenerator{

	/**
	 * @param input - the input for which to generate resources
	 * @param fsa - file system access to be used to generate files
	 */
	public void doGenerate(EObject input, IFileSystemAccess fsa);
}
