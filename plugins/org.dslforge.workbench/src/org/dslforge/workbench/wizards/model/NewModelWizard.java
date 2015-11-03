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
package org.dslforge.workbench.wizards.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;

public class NewModelWizard extends AbstractNewModelWizard{

	@Override
	protected EObject createInitialModel() {
//		EClass eClass = (EClass)domainmodelPackage.getEClassifier(initialObjectCreationPage.getInitialObjectName());
//		EObject rootObject = domainmodelFactory.create(eClass);
//		return rootObject;
		return null;
	}

	@Override
	public void addPages() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDslPackage(EcorePackage dslPackage) {
	//	EcorePlugin.
	//	dslPackage = DomainmodelPackage.eINSTANCE;
	}

}
