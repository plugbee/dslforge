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
package org.dslforge.texteditor;

import java.io.File;
import java.util.Date;

import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;

public class URIEditorPropertySource implements IPropertySource {

	private URIEditorInput editorInput;
	
	public URIEditorPropertySource(URIEditorInput handle) {
		this.editorInput = handle;
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
			return editorInput.getURI().toFileString();
		else if ("path".equals(id))
			return editorInput.getURI().lastSegment();
		else if ("lastModified".equals(id)) {
			return new Date(new File(editorInput.getURI().toFileString()).lastModified());
		} else if ("size".equals(id))
			return new File(editorInput.getURI().toFileString()).length() + " bytes";
		else if ("editable".equals(id))
			return true;
		return null;
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