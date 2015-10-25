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
package org.dslforge.xtext.generator.web.presentation

import org.dslforge.xtext.generator.IWebProjectGenerator
import org.dslforge.xtext.generator.util.GeneratorUtil
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.generator.IFileSystemAccess

class GenPresentation implements IWebProjectGenerator{
	
	val relativePath = "/presentation/"
	var String projectName
	var String grammarShortName
	var String basePath
	var Grammar grammar
	
	override doGenerate(EObject input, IFileSystemAccess fsa) {
		grammar = input as Grammar
		projectName=GeneratorUtil::getProjectName(grammar)
		grammarShortName= GeneratorUtil::getGrammarShortName(grammar)
		basePath=GeneratorUtil::getBasePath(grammar)
		fsa.generateFile(basePath + relativePath + grammarShortName + "PresentationWorkbenchAdvisor.java", "src", toJava())
	}
	
	def toJava()'''
package «projectName».presentation;

import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;

public class «grammarShortName»PresentationWorkbenchAdvisor extends WorkbenchAdvisor {

	public void initialize(IWorkbenchConfigurer configurer) {
		getWorkbenchConfigurer().setSaveAndRestore(true);
		super.initialize(configurer);
	}

	public String getInitialWindowPerspectiveId() {
		return "org.dslforge.core.ui.parts.perspective";
	}

//	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(
//			final IWorkbenchWindowConfigurer windowConfigurer) {
//		return new «grammarShortName»PresentationWorkbenchWindowAdvisor(windowConfigurer);
//	}
}
	'''

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}