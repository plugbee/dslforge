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

import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ui.IEditorInput;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Inject;

public class XtextResourceFactory implements IXtextResourceFactory {

	@Inject
	private IXtextResourceSetProvider resourceSetProvider;

	public Resource createResource(IEditorInput editorInput) {
		if (editorInput instanceof URIEditorInput) {
			Resource result = createResource((URIEditorInput) editorInput);
			if (result != null)
				return result;
		}
		throw new IllegalArgumentException("Couldn't create resource for input " + editorInput);
	}

	protected Resource createResource(URIEditorInput editorInput) {
		ResourceSet resourceSet = getDefaultResourceSet();
		URI resourceURI = editorInput.getURI();
		XtextResource resource = (XtextResource) resourceSet.getResource(resourceURI, true);
		//resource.setValidationDisabled(false);
		return resource;
	}
	
	protected ResourceSet getDefaultResourceSet() {
		return resourceSetProvider.get(null);
	}

	protected IXtextResourceSetProvider getResourceSetProvider() {
		return resourceSetProvider;
	}
}