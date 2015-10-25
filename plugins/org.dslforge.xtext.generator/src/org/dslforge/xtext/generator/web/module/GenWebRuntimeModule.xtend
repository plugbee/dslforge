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

import org.eclipse.xtext.Grammar
import org.dslforge.xtext.generator.IWebProjectGenerator
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.resource.Resource
import org.dslforge.xtext.generator.util.GeneratorUtil

class GenWebRuntimeModule implements IWebProjectGenerator{
	
	val relativePath = "/module/"
	var String grammarShortName
	var Grammar grammar
	var String projectName
	
	override doGenerate(EObject input, IFileSystemAccess fsa) {
		grammar = input as Grammar
		var basePath=GeneratorUtil::getBasePath(grammar)
		projectName=GeneratorUtil::getProjectName(grammar)
		grammarShortName= GeneratorUtil::getGrammarShortName(grammar)
		fsa.generateFile(basePath + relativePath + "Web" + grammarShortName.toFirstUpper + "RuntimeModule" + ".java", "src", toJava())

	}

	def toJava()'''
package «projectName».module;

import org.dslforge.xtext.common.scoping.BasicTextContainerManager;
import org.dslforge.xtext.common.scoping.BasicTextGlobalScopeProvider;
import org.dslforge.xtext.common.scoping.BasicTextLinkingService;
import org.eclipse.xtext.linking.ILinkingService;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;

import com.google.inject.AbstractModule;

public class Web«grammarShortName.toFirstUpper»RuntimeModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(ILinkingService.class).to(BasicTextLinkingService.class);
		bind(IGlobalScopeProvider.class).to(BasicTextGlobalScopeProvider.class);
		bind(org.eclipse.xtext.resource.IContainer.Manager.class).to(BasicTextContainerManager.class);
		System.out.println("[DSLFORGE] - Configuring module " + this.getClass().getName());
	}
}
	'''
		
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}