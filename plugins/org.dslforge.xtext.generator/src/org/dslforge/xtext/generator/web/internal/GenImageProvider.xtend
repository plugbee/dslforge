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
package org.dslforge.xtext.generator.web.internal

import org.dslforge.xtext.generator.IWebProjectGenerator
import org.dslforge.xtext.generator.util.GeneratorUtil
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.generator.IFileSystemAccess

class GenImageProvider implements IWebProjectGenerator{
	
	val relativePath = "/internal/"
	var String grammarShortName
	var Grammar grammar
	
	override doGenerate(EObject input, IFileSystemAccess fsa) {
		grammar = input as Grammar
		var basePath=GeneratorUtil::getBasePath(grammar)
		var projectName=GeneratorUtil::getProjectName(grammar)
		grammarShortName= GeneratorUtil::getGrammarShortName(grammar)
		fsa.generateFile(basePath + relativePath +grammarShortName.toFirstUpper+"ImageProvider.java", "src", toJava(projectName))
	}
	
	def toJava(String projectName)'''
		package «projectName».internal;
		
		public class «grammarShortName.toFirstUpper»ImageProvider {
		
			public static final String FILE = "icons/model.png";
			public static final String WIZARD = "icons/wizard.png";
		}'''
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}