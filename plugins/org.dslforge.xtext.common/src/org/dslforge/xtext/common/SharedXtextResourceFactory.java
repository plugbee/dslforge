package org.dslforge.xtext.common;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResource;

public class SharedXtextResourceFactory extends XtextResourceFactory {

	@Override
	protected Resource createResource(URI resourceURI) {
		ResourceSet resourceSet = getDefaultResourceSet(resourceURI);
		XtextResource resource = (XtextResource) resourceSet.getResource(resourceURI, true);
		return resource;
	}
	
	protected ResourceSet getDefaultResourceSet(URI resourceURI) {
		return resourceSetProvider.get(new File(resourceURI.toFileString()));
	}

}
