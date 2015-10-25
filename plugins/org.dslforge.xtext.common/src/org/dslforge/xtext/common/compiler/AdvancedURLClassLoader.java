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
package org.dslforge.xtext.common.compiler;

import java.net.URL;
import java.net.URLClassLoader;

public class AdvancedURLClassLoader extends URLClassLoader {
	
	private ClassLoader parent;
	
	public AdvancedURLClassLoader(URL[] urls, ClassLoader parent) {
		super(urls, parent);
		this.parent = parent;
	}
	

/*	
	@Override
	protected synchronized Class<?> loadClass(String name, boolean resolve)
			throws ClassNotFoundException {
		Class<?> result = null;
		try {
			result = parent.loadClass(name);
		}catch(ClassNotFoundException e){
			System.out.println("not found");
		}
		if (result== null){
			result = findClass(name);
		}
		return result;
	}*/

	public Class<?> doDefineClass(String name, byte[] buf, int something, int somethingElse){
		return defineClass(name, buf, something, somethingElse);
	}
}
