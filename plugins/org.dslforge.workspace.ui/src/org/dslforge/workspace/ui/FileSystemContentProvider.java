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
package org.dslforge.workspace.ui;

import java.io.File;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class FileSystemContentProvider implements ITreeContentProvider {

	private static final long serialVersionUID = 1L;

	private File rootDirectory;

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof File) {
			rootDirectory = (File) inputElement;
			return getChildren(rootDirectory);
		}
		return null;
	}

	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (newInput instanceof File) {
			rootDirectory = (File) newInput;
		}
	}

	/**
	 * @param parentElement
	 * @return Object[]
	 */
	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof File) {
			File file = (File) parentElement;
			if (file.isDirectory()) {
				return file.listFiles();
			}
		}
		return new Object[] {};
	}

	/**
	 * @param element
	 * @return Object
	 */
	@Override
	public Object getParent(Object element) {
		if (element instanceof File) {
			File file = (File) element;
			if (file.getParent() != null)
				return new File(file.getParent());
		}
		return null;
	}

	/**
	 * @param element
	 * @return boolean
	 */
	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof File) {
			File file = (File) element;
			if (file.isDirectory()) {
				if (file.list().length > 0)
					return true;
			}
		}
		return false;
	}
}