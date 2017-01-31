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
package org.dslforge.xtext.generator.web

import org.dslforge.common.AbstractGenerator
import org.dslforge.common.IWebProjectFactory
import org.dslforge.xtext.generator.XtextGrammar
import org.eclipse.core.runtime.IProgressMonitor

class GenExecutableExtensionFactory extends AbstractGenerator {

	var XtextGrammar grammar

	new (){
		relativePath = "/"
	}
	
	override doGenerate(IWebProjectFactory factory, IProgressMonitor monitor) {
		grammar = factory.input as XtextGrammar
		projectName = grammar.getProjectName() 
		grammarShortName = grammar.getShortName()
		basePath = grammar.getBasePath()
		factory.generateFile("src-gen/" + basePath + relativePath, grammarShortName + "ExecutableExtensionFactory.java",
			toJava(), monitor)
	}

	def toJava() '''
«fileHeader»
package «projectName»;

import org.dslforge.xtext.common.guice.AbstractGuiceAwareWebExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import «projectName».internal.Activator;

import com.google.inject.Injector;

public class «grammarShortName.toFirstUpper»ExecutableExtensionFactory extends AbstractGuiceAwareWebExecutableExtensionFactory {

	@Override
	public Bundle getBundle() {
		return Activator.getInstance().getBundle();
	}
	
	@Override
	public Injector getInjector() {
		return Activator.getInstance().getInjector(Activator.«grammar.name.toUpperCase.replace(".", "_")»);
	}
}
	'''
}
