/**
 * <copyright>
 *
 * Copyright (c) 2015 DSLFORGE. All rights reserved.
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
package org.dslforge.xtext.common.scoping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dslforge.xtext.common.helpers.ResourceHelper;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;

/**
 * 
 * @author Amine Lajmi
 * 
 */
public class BasicTextGlobalScopeProvider extends DefaultGlobalScopeProvider {

	@Inject
	IResourceServiceProvider.Registry registry;

	@Inject
	IResourceDescription.Manager descriptionManager;

	@Override
	protected IScope getScope(IScope parent, final Resource context,
			boolean ignoreCase, EClass type,
			Predicate<IEObjectDescription> filter) {
		ResourceSet resourceSet = context.getResourceSet();
		Iterable<IEObjectDescription> exportedObjects = Collections.emptyList();
		IScope result = parent;
		List<IContainer> containers = getVisibleContainers(context);
		Iterator<IContainer> iter = containers.iterator();
		while (iter.hasNext()) {
			IContainer container = iter.next();
			if (container instanceof BasicTextContainer) {
				result = createVpspecContainerScope(context, result, container,
						filter, type, ignoreCase);
			}
		}
		return BasicTextMultimapBasedScope.createScope(result, exportedObjects,
				ignoreCase, getAllResourceURs(resourceSet));
	}

	protected IScope createVpspecContainerScope(Resource eResource,
			IScope parent, IContainer container,
			Predicate<IEObjectDescription> filter, EClass type,
			boolean ignoreCase) {
		Iterable<IEObjectDescription> exportedObjects = Collections.emptyList();
		ResourceSet resourceSet = eResource.getResourceSet();
		exportedObjects = getAllAspectsObjectDescriptions(resourceSet,
				exportedObjects);
		return BasicTextMultimapBasedScope.createScope(parent, exportedObjects,
				ignoreCase, getAllResourceURs(resourceSet));
	}

	private List<URI> getAllResourceURs(ResourceSet resourceSet) {
		List<URI> list = new ArrayList<>();
		EList<Resource> resources = resourceSet.getResources();
		for (Resource r : resources) {
			URI uri = r.getURI();
			list.add(uri);
		}
		return list;
	}

	private Iterable<IEObjectDescription> getAllAspectsObjectDescriptions(
			ResourceSet resourceSet,
			Iterable<IEObjectDescription> exportedObjects) {
		EList<Resource> resources = resourceSet.getResources();
		for (Resource r : resources) {
			URI uri = r.getURI();
			IResourceDescription.Manager manager = getResourceDescriptionManager(uri);
			IResourceDescription description = manager
					.getResourceDescription(r);
			exportedObjects = Iterables.concat(exportedObjects,
					description.getExportedObjects());
		}
		return exportedObjects;
	}

	private IResourceDescription.Manager getResourceDescriptionManager(URI uri) {
		Map<String, Object> extensionToFactoryMap = registry
				.getExtensionToFactoryMap();
		IResourceServiceProvider resourceServiceProvider = ResourceHelper
				.getServiceProvider(uri, extensionToFactoryMap,
						ResourceHelper.getFileExtension(uri));
		return resourceServiceProvider != null ? resourceServiceProvider
				.getResourceDescriptionManager() : null;
	}

}