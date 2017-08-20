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
import java.util.Date;

import org.dslforge.workspace.internal.WorkspaceActivator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;

public class FilePropertySource implements IPropertySource {

	private static final IPath rootPath = WorkspaceActivator.getDefault().getWorkspace().getWorkspaceRootPath();

	private File file;
	
	public FilePropertySource(File file) {
		this.file = file;
	}
	
	@Override
	public Object getEditableValue() {
		return null;
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		if (file.isDirectory()) {
			return new IPropertyDescriptor[] {
					new PropertyDescriptor("name", "Name"),
					new PropertyDescriptor("location", "Location"),
					new PropertyDescriptor("path", "Path"),
					new PropertyDescriptor("lastModified", "Last Modified"),
					new PropertyDescriptor("editable", "Editable")
			};			
		} else {
			return new IPropertyDescriptor[] {
					new PropertyDescriptor("name", "Name"),
					new PropertyDescriptor("location", "Location"),
					new PropertyDescriptor("path", "Path"),
					new PropertyDescriptor("size", "Size"),
					new PropertyDescriptor("lastModified", "Last Modified"),
					new PropertyDescriptor("editable", "Editable")
			};
		}

	}

	@Override
	public Object getPropertyValue(Object id) {
		if ("name".equals(id)) 
			return file.getName();
		else if ("location".equals(id)) 
			return file.getAbsolutePath();
		else if ("path".equals(id)) 
			return computePath();
		else if ("lastModified".equals(id))
			return new Date(file.lastModified());
		else if ("size".equals(id)) 
			return file.length() + " bytes";
		else if ("editable".equals(id))
			return file.canWrite();
		return null;
	}

	private Object computePath() {
		Path filePath = new Path(file.getPath());
		IPath relativePath = filePath.makeRelativeTo(rootPath);
		return "/" + relativePath;
	}

	@Override
	public boolean isPropertySet(Object id) {
		return false;
	}

	@Override
	public void resetPropertyValue(Object id) {
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
	}
	
	
}