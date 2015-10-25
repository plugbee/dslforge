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

import java.security.SecureClassLoader;

public class DelegatorClassLoader extends SecureClassLoader {
	private ClassLoader parent;
	private ClassLoader delegate;

	public DelegatorClassLoader(ClassLoader parent, ClassLoader delegate) {
		super(parent);
		this.parent = parent;
		this.delegate = delegate;
	}
/*
	@Override
	protected synchronized Class<?> loadClass(String name, boolean resolve)
			throws ClassNotFoundException {
		Class<?> result = null;
		if (delegate != null) {
			try {
				delegate.loadClass(name);
			} catch (ClassNotFoundException e) {
				System.out.println("not found in delegate");
			}
		}
		if (result == null) {
			parent.loadClass(name);
		}
		return result;
	}*/
	
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		return delegate.loadClass(name);
	}
}
