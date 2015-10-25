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
package org.dslforge.xtext.generator.web.ace.snippets

import org.dslforge.xtext.generator.IWebProjectGenerator
import org.dslforge.xtext.generator.util.GeneratorUtil
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.generator.IFileSystemAccess

class GenSnippets implements IWebProjectGenerator{
	
	val relativePath = "/ace/snippets/"
	var String projectName
	var String grammarShortName
	var String basePath
	var Grammar grammar
	
	override doGenerate(EObject input, IFileSystemAccess fsa) {
		grammar = input as Grammar
		projectName=GeneratorUtil::getProjectName(grammar)
		grammarShortName= GeneratorUtil::getGrammarShortName(grammar)
		basePath=GeneratorUtil::getBasePath(grammar)
		fsa.generateFile(basePath + relativePath + grammarShortName.toFirstLower +".js", "src-js", toJavaScript())
	}
			
	def toJavaScript()'''
define('ace/snippets/«grammarShortName.toFirstLower»', ['require', 'exports', 'module' ], function(require, exports, module) {

exports.snippetText = ''
exports.scope = "«grammarShortName.toFirstLower»";
});
'''

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}