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

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;

public class BasicTextMultimapBasedScope extends AbstractScope {

	private Multimap<QualifiedName, IEObjectDescription> elements;
	
	private static List<URI> availableResourceURs;
	
	protected BasicTextMultimapBasedScope(IScope parent,
			Multimap<QualifiedName, IEObjectDescription> elements,
			boolean ignoreCase) {
		super(parent, ignoreCase);
		this.elements = elements;
	}
	
	public static IScope createScope(IScope parent, Iterable<IEObjectDescription> descriptions, boolean ignoreCase, List<URI> uris) {
		availableResourceURs = uris;
		Multimap<QualifiedName, IEObjectDescription> map = null;
		for(IEObjectDescription description: descriptions) {
			if (map == null)
				map = LinkedHashMultimap.create(5,2);
			if (ignoreCase)
				map.put(description.getName().toLowerCase(), description);
			else
				map.put(description.getName(), description);
		}
		if (map == null || map.isEmpty()) {
			return parent;
		}
		return new BasicTextMultimapBasedScope(parent, map, ignoreCase);
	}
	
	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		return elements.values();
	}

	/**
	 * Workaround! List of uris, take the last segment which is the name of the file,
	 * concatenate with name and select concatenations which are equals to name
	 */
	@Override
	protected Iterable<IEObjectDescription> getLocalElementsByName(QualifiedName name) {
		Iterable<IEObjectDescription> objectDescriptions = Collections.emptyList();
		String[] segments = (String[]) name.getSegments().toArray();
		List<String> asList = Arrays.asList(segments);
		List<String> modifiableList = Lists.newArrayList();
		modifiableList.addAll(asList);
	
		for (URI uri: availableResourceURs) {
			String fileName = uri.lastSegment();
			String root = fileName.substring(0, fileName.indexOf("."));
			if (root!=null) {
				modifiableList.add(0, root);
			}
			QualifiedName query = QualifiedName.create(modifiableList);
			if (isIgnoreCase()) {
				query = name.toLowerCase();
			}
			if (elements.containsKey(query)) {
				Collection<IEObjectDescription> result = elements.get(query);
				objectDescriptions = Iterables.concat(objectDescriptions, result);
			}
		}
		//objectDescriptions = Iterables.concat(objectDescriptions, getDefaultLocalElementsByName(name));
		objectDescriptions = getDefaultLocalElementsByName(name);
		objectDescriptions =  Iterables.concat(objectDescriptions, super.getLocalElementsByName(name));
		return objectDescriptions;
	}
	
	protected Iterable<IEObjectDescription> getDefaultLocalElementsByName(QualifiedName name) {
		QualifiedName query = name;
		if (isIgnoreCase()) {
			query = name.toLowerCase();
		}
		if (elements.containsKey(query)) {
			Collection<IEObjectDescription> result = elements.get(query);
			return result;
		}
		return Collections.emptyList();
	}
	
	@Override
	protected boolean isShadowed(IEObjectDescription fromParent) {
		QualifiedName name = fromParent.getName();
		if (isIgnoreCase()) {
			name = name.toLowerCase();
		}
		boolean result = elements.containsKey(name);
		return result;
	}
}
