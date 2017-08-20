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

import org.dslforge.workspace.internal.WorkspaceActivator;
import org.dslforge.workspace.ui.internal.Activator;
import org.dslforge.workspace.ui.internal.BasicWorkbenchImageProvider;
import org.dslforge.workspace.ui.internal.IFileExtensionHandler;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

public class FileSystemLabelProvider implements ILabelProvider {
	
	private static final long serialVersionUID = 1L;
	
	private static final IPath rootPath = WorkspaceActivator.getDefault().getWorkspace().getWorkspaceRootPath();
	
	@Override
	public Image getImage(Object element){
		if (element instanceof File){
			File file = (File) element;
			if (isProject(file)) {
				return Activator.getImageDescriptor(BasicWorkbenchImageProvider.PROJECT).createImage();
			}
			if (file.isDirectory()) {
				return Activator.getImageDescriptor(BasicWorkbenchImageProvider.FOLDER).createImage();
			}
			int index = file.getName().lastIndexOf('.');
			if (index > 0) {
				String extension = file.getName().substring(index + 1);
				if (extension.equals(IFileExtensionHandler.JAVA_EXTENSION)) {
					return Activator.getImageDescriptor(BasicWorkbenchImageProvider.JAVA).createImage();
				} else if (extension.equals(IFileExtensionHandler.BINARY_EXTENSION)) {
					return Activator.getImageDescriptor(BasicWorkbenchImageProvider.BINARY).createImage();
				} else if (extension.equals(IFileExtensionHandler.JS_EXTENSION)
						|| extension.equals(IFileExtensionHandler.JSON_EXTENSION)) {
					return Activator.getImageDescriptor(BasicWorkbenchImageProvider.JS).createImage();
				} else if (extension.equals(IFileExtensionHandler.HTML_EXTENSION)) {
					return Activator.getImageDescriptor(BasicWorkbenchImageProvider.HTML).createImage();
				} else if (extension.equals(IFileExtensionHandler.CSS_EXTENSION)) {
					return Activator.getImageDescriptor(BasicWorkbenchImageProvider.CSS).createImage();
				} else if (extension.equals(IFileExtensionHandler.TEXT_EXTENSION)) {
					return Activator.getImageDescriptor(BasicWorkbenchImageProvider.FILE).createImage();
				} else {
					return Activator.getImageDescriptor(BasicWorkbenchImageProvider.MODEL).createImage();
				}
			}
			return Activator.getImageDescriptor(BasicWorkbenchImageProvider.MODEL).createImage();
		}
		return Activator.getImageDescriptor(BasicWorkbenchImageProvider.UNKNOWN).createImage();
	}

	public boolean isProject(final File file) {
		String parent = file.getParent();
		return (file.isDirectory() && parent!=null && new Path(parent).equals(rootPath));
	}
	
	@Override
	public String getText(Object element){
		String label = null;
		if (element instanceof File){
			File file = (File) element;
			label =  file.getName();
			if (file.isDirectory())
				return label;
			//ignore files in src-gen folder
			if (file.getParent().contains("\\src-gen"))
				return label;
			return label;
		}
		return "unknown element";
	}

	@Override
	public void addListener(ILabelProviderListener listener){
		// NOP
	}

	@Override
	public void dispose(){
		// NOP
	}

	@Override
	public boolean isLabelProperty(Object element, String property){
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener){
		// NOP
	}	
}