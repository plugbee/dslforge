/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.example.arithmetics.ide

import com.google.inject.Guice
import org.eclipse.xtext.example.arithmetics.ArithmeticsRuntimeModule
import org.eclipse.xtext.example.arithmetics.ArithmeticsStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class ArithmeticsIdeSetup extends ArithmeticsStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new ArithmeticsRuntimeModule, new ArithmeticsIdeModule))
	}
	
}
