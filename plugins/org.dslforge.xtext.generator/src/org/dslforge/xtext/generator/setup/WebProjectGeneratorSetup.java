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
package org.dslforge.xtext.generator.setup;

import org.dslforge.xtext.generator.module.WebProjectGeneratorModule;
import org.eclipse.xtext.ISetup;

import com.google.inject.Guice;
import com.google.inject.Injector;


public class WebProjectGeneratorSetup implements ISetup {

	private Injector injector;
	
	public Injector createInjectorAndDoEMFRegistration() {
		return Guice.createInjector(new WebProjectGeneratorModule());
	}

	public void setInjector(Injector injector) {
		this.injector = injector;
	}

	public Injector getInjector() {
		return injector;
	}
}