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
package org.dslforge.xtext.common;

import org.dslforge.texteditor.PathEditorInput;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ui.IEditorInput;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Inject;

public class XtextResourceFactory implements IXtextResourceFactory {

	@Inject
	protected IXtextResourceSetProvider resourceSetProvider;

	public Resource createResource(IEditorInput editorInput) {
		if (editorInput instanceof PathEditorInput) {
			IPath path = ((PathEditorInput) editorInput).getPath();
			URI fileURI = URI.createFileURI(path.toString());
			Resource result = createResource(fileURI);
			if (result != null)
				return result;
		}
		if (editorInput instanceof URIEditorInput) {
			URI fileURI = ((URIEditorInput) editorInput).getURI();
			Resource result = createResource(fileURI);
			if (result != null)
				return result;
		}
		throw new IllegalArgumentException("Couldn't create resource for input " + editorInput);
	}

	protected Resource createResource(URI resourceURI) {
		ResourceSet resourceSet = getDefaultResourceSet();
		XtextResource resource = (XtextResource) resourceSet.getResource(resourceURI, true);
		return resource;
	}
	
	protected ResourceSet getDefaultResourceSet() {
		return resourceSetProvider.get(null);
	}

	protected IXtextResourceSetProvider getResourceSetProvider() {
		return resourceSetProvider;
	}
}