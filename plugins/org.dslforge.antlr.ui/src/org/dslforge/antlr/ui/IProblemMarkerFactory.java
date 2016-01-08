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

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.Diagnostic;

public interface IProblemMarkerFactory {

	public void createMarker(IResource resource, Diagnostic diagnostic) throws CoreException;

	public void createMarker(IResource resource, Diagnostic diagnostic, String markerType) throws CoreException;

	public void deleteMarkers(IResource resource) throws CoreException;

	public void deleteMarkers(IResource resource, String markerType) throws CoreException;
}
