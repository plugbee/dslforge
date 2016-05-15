/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.example.domainmodel.validation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.example.domainmodel.domainmodel.AbstractElement;
import org.eclipse.xtext.example.domainmodel.domainmodel.DomainmodelPackage;
import org.eclipse.xtext.example.domainmodel.domainmodel.Entity;
import org.eclipse.xtext.example.domainmodel.domainmodel.PackageDeclaration;
import org.eclipse.xtext.validation.Check;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class DomainmodelJavaValidator extends AbstractDomainmodelJavaValidator {

	public static String INVALID_NAME = "invalidName";

	@Check
	void checkGreetingStartsWithCapital(Entity entity) {
		if (!Character.isUpperCase(entity.getName().charAt(0))) {
			info("Name should start with a capital", entity, DomainmodelPackage.Literals.TYPE__NAME);
		}
	}

	@Check
	void checkEntityUniquenessWithinPackage(PackageDeclaration declaration) {
		EList<AbstractElement> elements = declaration.getElements();
		ArrayList<AbstractElement> entities = Lists.newArrayList(Iterables.filter(elements, new Predicate<AbstractElement>() {
			@Override
			public boolean apply(AbstractElement input) {
				return input instanceof Entity;
			}
		}));
		Set<String> names = new HashSet<String>();
		for (AbstractElement element : entities) {
			if (!names.add(((Entity) element).getName())) {
				error("Duplicate entity with name \"" + ((Entity) element).getName() + "\"", element, DomainmodelPackage.Literals.TYPE__NAME);
			}
		}
	}
}
