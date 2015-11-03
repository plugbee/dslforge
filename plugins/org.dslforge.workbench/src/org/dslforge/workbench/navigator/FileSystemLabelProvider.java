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
package org.dslforge.workbench.navigator;

import java.io.File;

import org.dslforge.workbench.internal.Activator;
import org.dslforge.workbench.internal.BasicWorkbenchImageProvider;
import org.dslforge.workspace.WorkspaceManager;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

public class FileSystemLabelProvider implements ILabelProvider {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public Image getImage(Object element){
		if (element instanceof File){
			File file = (File) element;
			if (WorkspaceManager.INSTANCE.isProject(file)) {
				return Activator.getImageDescriptor(BasicWorkbenchImageProvider.PROJECT).createImage();
			}
			if (file.isDirectory()) {
				return Activator.getImageDescriptor(BasicWorkbenchImageProvider.FOLDER).createImage();
			}
	
			String fileName = file.getName();
			int i = fileName.lastIndexOf('.');
			if (i > 0) {
			    String extension = fileName.substring(i+1);
			    if (extension.equals("java")) {
			    	return Activator.getImageDescriptor(BasicWorkbenchImageProvider.JAVA).createImage();
			    } else if(extension.equals("class")) {
			    	return Activator.getImageDescriptor(BasicWorkbenchImageProvider.BINARY).createImage();	
			    } else if (extension.equals("txt")) {
			    	return Activator.getImageDescriptor(BasicWorkbenchImageProvider.FILE).createImage();	 	
			    }
			}
			return Activator.getImageDescriptor(BasicWorkbenchImageProvider.MODEL).createImage();
		}
		return Activator.getImageDescriptor(BasicWorkbenchImageProvider.UNKNOWN).createImage();
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
			if (WorkspaceManager.INSTANCE.isLocked(file)) {
				String userName = WorkspaceManager.INSTANCE.getLocker(file); 
				label = label + " [" + userName + "]";
			}
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