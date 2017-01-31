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
package org.dslforge.xtext.generator.web.module

import org.dslforge.common.AbstractGenerator
import org.dslforge.common.IWebProjectFactory
import org.dslforge.xtext.generator.XtextGrammar
import org.eclipse.core.runtime.IProgressMonitor

class GenWebStandaloneSetup extends AbstractGenerator{
	
	var XtextGrammar grammar
	
	new() {
		relativePath = "/module/"
	}
	
	override  doGenerate(IWebProjectFactory factory, IProgressMonitor monitor) {
		grammar = factory.input as XtextGrammar
		basePath=grammar.getBasePath()
		projectName=grammar.getProjectName()
		grammarShortName= grammar.getShortName()
		factory.generateFile("src-gen/" + basePath + relativePath, "Web" + grammarShortName.toFirstUpper + "StandaloneSetup" + ".java", toJava(), monitor)
	}

	def toJava()'''
«fileHeader»
package «projectName».module;

import org.eclipse.xtext.util.Modules2;
import «grammar.name»RuntimeModule;
import «grammar.name»StandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

public class Web«grammarShortName.toFirstUpper»StandaloneSetup extends «grammarShortName.toFirstUpper»StandaloneSetup {

	public static void doSetup() {
		new «grammarShortName.toFirstUpper»StandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	public Injector createInjector(String language) {
		try {
			Module runtimeModule = getRuntimeModule();
			Injector injector = Guice.createInjector(runtimeModule);
			register(injector);
			return injector;
		} catch (Exception e) {
			System.err.println("Failed to create injector for " + language);
			throw new RuntimeException("Failed to create injector for "
					+ language, e);
		}
	}

	private Module getRuntimeModule() {
		org.eclipse.xtext.common.TerminalsStandaloneSetup.doSetup();
		«grammarShortName.toFirstUpper»RuntimeModule original = new «grammarShortName.toFirstUpper»RuntimeModule();
		Web«grammarShortName.toFirstUpper»RuntimeModule module = new Web«grammarShortName.toFirstUpper»RuntimeModule();
		Module mergedModule = Modules2.mixin((Module) original, module);
		return mergedModule;
	}
}
	'''
}