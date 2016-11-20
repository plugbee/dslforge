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
package org.dslforge.xtext.common.scoping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dslforge.xtext.common.util.FileUtil;
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
import com.google.inject.Provider;

/**
 * 
 * @author Amine Lajmi
 * 
 */
public class WebGlobalScopeProvider extends DefaultGlobalScopeProvider {

	@Inject
	IResourceServiceProvider.Registry registry;

	@Inject
	IResourceDescription.Manager descriptionManager;

	@Override
	protected IScope getScope(IScope parent, final Resource context, boolean ignoreCase, EClass type, Predicate<IEObjectDescription> filter) {
		ResourceSet resourceSet = context.getResourceSet();
		Iterable<IEObjectDescription> exportedObjects = Collections.emptyList();
		IScope result = parent;
		List<IContainer> containers = getVisibleContainers(context);
		Iterator<IContainer> iter = containers.iterator();
		while (iter.hasNext()) {
			IContainer container = iter.next();
			if (container instanceof WebContainer) {
				result = createContainerScope(context, result, container, filter, type, ignoreCase);
			}
		}
		return ResourceSetAwareScope.createScope(result, exportedObjects,	ignoreCase, getAllResourceURs(resourceSet));
	}

	protected IScope createContainerScope(Resource eResource, IScope parent, IContainer container, Predicate<IEObjectDescription> filter, EClass type,
			boolean ignoreCase) {
		Iterable<IEObjectDescription> exportedObjects = Collections.emptyList();
		ResourceSet resourceSet = eResource.getResourceSet();
		exportedObjects = getExportedObjects(resourceSet,
				exportedObjects);
		return ResourceSetAwareScope.createScope(parent, exportedObjects,	ignoreCase, getAllResourceURs(resourceSet));
	}

	private List<URI> getAllResourceURs(ResourceSet resourceSet) {
		List<URI> list = new ArrayList<URI>();
		EList<Resource> resources = resourceSet.getResources();
		for (Resource resource : resources) {
			URI uri = resource.getURI();
			list.add(uri);
		}
		return list;
	}

	private Iterable<IEObjectDescription> getExportedObjects(
			ResourceSet resourceSet,
			Iterable<IEObjectDescription> exportedObjects) {
		EList<Resource> resources = resourceSet.getResources();
		for (Resource resource : resources) {
			URI uri = resource.getURI();
			IResourceDescription.Manager manager = getResourceDescriptionManager(uri);
			IResourceDescription description = manager
					.getResourceDescription(resource);
			exportedObjects = Iterables.concat(exportedObjects,
					description.getExportedObjects());
		}
		return exportedObjects;
	}

	private IResourceDescription.Manager getResourceDescriptionManager(URI uri) {
		Map<String, Object> extensionToFactoryMap = registry
				.getExtensionToFactoryMap();
		IResourceServiceProvider resourceServiceProvider = getServiceProvider(uri, extensionToFactoryMap, FileUtil.getFileExtension(uri));
		return resourceServiceProvider != null ? resourceServiceProvider
				.getResourceDescriptionManager() : null;
	}

	/**
	 * Returns the service provider of the resource with the given uri and the given extension from the extension to factory map
	 * 
	 * @param uri
	 * @param extensionToFactoryMap
	 * @param extension
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static IResourceServiceProvider getServiceProvider(URI uri, Map<String, Object> extensionToFactoryMap, String extension) {
		Object object = getFactory(uri, extensionToFactoryMap, extension);
		if (object instanceof Provider<?>) {
			return ((Provider<IResourceServiceProvider>) object).get();
		}
		return (IResourceServiceProvider) object;
	}
	
	/**
	 * Returns the resource factory of the resource with the given uri and the given extension from the extension to factory map
	 * 
	 * @param uri
	 * @param extensionToFactoryMap
	 * @param extension
	 * @return
	 */
	public static Object getFactory (URI uri, Map<String, Object> extensionToFactoryMap, String extension) {
		Object resourceFactory = null;
		boolean extensionToFactoryMapIsEmpty = extensionToFactoryMap.isEmpty();
		if (!extensionToFactoryMapIsEmpty) {
			resourceFactory = extensionToFactoryMap.get(extension);
		}
		if (resourceFactory == null) {
			throw new RuntimeException("Unresolved proxy: " + uri.toString());
		}
		return resourceFactory;
	}
}