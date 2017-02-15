package org.dslforge.xtext.common;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;

public class DirigibleURIConverter extends ExtensibleURIConverterImpl {

	@Override
	public EList<URIHandler> getURIHandlers() {
		EList<URIHandler> handlers = super.getURIHandlers();
		handlers.add(0, new DirigibleWorkspaceHandler());
		return handlers;
	}
}
