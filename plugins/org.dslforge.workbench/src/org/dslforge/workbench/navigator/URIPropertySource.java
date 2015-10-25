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

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;

public class URIPropertySource implements IPropertySource {

	private URIEditorInput editorInput;
	
	public URIPropertySource(IEditorInput handle) {
		Assert.isTrue(handle instanceof URIEditorInput);
		this.editorInput = (URIEditorInput) handle;
	}
	
	@Override
	public Object getEditableValue() {
		return null;
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
			return new IPropertyDescriptor[] {
					new PropertyDescriptor("name", "Name"),
					new PropertyDescriptor("location", "Location"),
					new PropertyDescriptor("path", "Path"),
					new PropertyDescriptor("size", "Size"),
					new PropertyDescriptor("lastModified", "Last Modified"),
					new PropertyDescriptor("editable", "Editable")
			};
	}

	@Override
	public Object getPropertyValue(Object id) {
			if ("name".equals(id)) 
				return editorInput.getURI().lastSegment();
			else if ("location".equals(id)) 
				return editorInput.getURI().path();
//			else if ("path".equals(id)) 
//				return computePath();
//			else if ("lastModified".equals(id))
//				return new File(editorInput.getURI().toFileString()).lastModified();//new Date(editorInput.getURI().path());//file.lastModified());
			else if ("size".equals(id)) 
				return editorInput.getURI().path().length() + " bytes";
			else if ("editable".equals(id))
				return true;

		return null;

	}

//	private Object computePath() {
//		String workspaceRoot = "ROOT"; // WorkspaceManager.INSTANCE.getWorkspaceRoot();
//		Path rootPath = new Path(workspaceRoot);
//		String fileString = editorInput.getURI().toFileString();
//		Path filePath = new Path(fileString);
//		IPath relativePath = filePath.makeRelativeTo(rootPath);
//		return "/" + relativePath;
//	}

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