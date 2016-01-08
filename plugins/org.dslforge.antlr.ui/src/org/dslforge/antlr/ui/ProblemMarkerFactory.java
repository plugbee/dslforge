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
package org.dslforge.antlr.ui;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;

public class ProblemMarkerFactory implements IProblemMarkerFactory {

	public static final String MARKER_ID = "org.dslforge.antlr.problem.marker";

	public void createMarker(IResource resource_p, Diagnostic diagnostic_p) throws CoreException {
		createMarker(resource_p, diagnostic_p, MARKER_ID);
	}

	public void createMarker(IResource resource_p, Diagnostic diagnostic_p, String markerType_p) throws CoreException {
		Map<String, Object> attributes = new HashMap<String, Object>();
		IMarker marker = resource_p.createMarker(markerType_p);
		List<?> data = diagnostic_p.getData();
		if (!data.isEmpty()) {
			EObject eObject = (EObject) data.get(0);
			attributes.put(IMarker.LOCATION, eObject.eResource().getURI().toFileString());
		}
		attributes.put(IMarker.SEVERITY, Integer.valueOf(convertSeverity(diagnostic_p.getSeverity())));
		attributes.put(IMarker.MESSAGE, diagnostic_p.getMessage());
		marker.setAttributes(attributes);
	}

	public void deleteMarkers(IResource resource_p) throws CoreException {
		deleteMarkers(resource_p, MARKER_ID);
	}

	public void deleteMarkers(IResource resource_p, String markerType_p) throws CoreException {
		IMarker[] markers = resource_p.findMarkers(markerType_p, true, IResource.DEPTH_INFINITE);
		for (IMarker marker: markers) {
			marker.delete();
		}
	}

	private int convertSeverity(int severity_p) {
		if (severity_p == Diagnostic.ERROR)
			return IMarker.SEVERITY_ERROR;
		if (severity_p == Diagnostic.WARNING)
			return IMarker.SEVERITY_WARNING;
		if (severity_p == Diagnostic.INFO)
			return IMarker.SEVERITY_INFO;
		return 0;
	}
}