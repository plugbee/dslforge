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
	
	val EditorType type
	val relativePath = "/ace/snippets/"
	var defaultSlotName = "src-js"
	var String projectName
	var String grammarShortName
	var String basePath
	var Grammar grammar

	new (EditorType type) {
		switch(this.type=type) {
			case ACE: defaultSlotName = "WebContent"
			case RAP: defaultSlotName="src-js"
		}
	}
	
	new() {
		this(EditorType.RAP)
	}
		
	override doGenerate(EObject input, IFileSystemAccess fsa) {
		grammar = input as Grammar
		if(type==EditorType.RAP) basePath=GeneratorUtil::getBasePath(grammar) else basePath="";
		projectName=GeneratorUtil::getProjectName(grammar)
		grammarShortName= GeneratorUtil::getGrammarShortName(grammar)
		fsa.generateFile(basePath + relativePath + grammarShortName.toLowerCase +".js", defaultSlotName, toJavaScript())
	}
			
	def toJavaScript()'''
define('ace/snippets/«grammarShortName.toLowerCase»', ['require', 'exports', 'module' ], function(require, exports, module) {

exports.snippetText = ''
exports.scope = "«grammarShortName.toLowerCase»";
});
'''

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}