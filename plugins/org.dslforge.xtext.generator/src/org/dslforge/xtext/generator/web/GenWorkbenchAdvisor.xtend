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

import org.dslforge.xtext.generator.IWebProjectGenerator
import org.dslforge.xtext.generator.util.GeneratorUtil
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.generator.IFileSystemAccess

class GenWorkbenchAdvisor implements IWebProjectGenerator{
	
	val relativePath = "/"
	var String projectName
	var String grammarShortName
	var String basePath
		
	override doGenerate(EObject input, IFileSystemAccess fsa) {
		var grammar = input as Grammar
		projectName=GeneratorUtil::getProjectName(grammar)
		grammarShortName= GeneratorUtil::getGrammarShortName(grammar)
		basePath=GeneratorUtil::getBasePath(grammar)
		fsa.generateFile(basePath + relativePath +grammarShortName+"WorkbenchAdvisor.java", "src", toJava())
	}
	
	def toJava()'''
package «projectName»;

import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

/**
 * This workbench advisor creates the window advisor, and specifies
 * the perspective id for the initial window.
 */
public class «grammarShortName»WorkbenchAdvisor extends WorkbenchAdvisor {

	private static final String PERSPECTIVE_ID = "org.dslforge.core.ui.parts.perspective";

	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
		return new «grammarShortName»WorkbenchWindowAdvisor(configurer);
	}

	public String getInitialWindowPerspectiveId() {
		return PERSPECTIVE_ID;
	}

	public static boolean openEditor(IWorkbench workbench, URI fileURI) {
		// TODO Auto-generated method stub
		return false;
	}
}
	'''

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}