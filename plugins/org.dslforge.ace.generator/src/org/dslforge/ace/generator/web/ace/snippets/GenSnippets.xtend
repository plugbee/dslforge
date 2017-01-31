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
package org.dslforge.ace.generator.web.ace.snippets

import org.dslforge.common.AbstractGenerator
import org.dslforge.common.IGrammar
import org.dslforge.common.IWebProjectDescriptor.EditorType
import org.dslforge.common.IWebProjectFactory
import org.eclipse.core.runtime.IProgressMonitor

class GenSnippets extends AbstractGenerator{
	
	var IGrammar grammar
		
	new () {
		defaultSlotName = ""
		basePath="WebContent"
		relativePath = "/ace/snippets/"
	}
		
	override doGenerate(IWebProjectFactory factory, IProgressMonitor monitor) {
		grammar = factory.input
		if (factory.editorType==EditorType::RAP){
			defaultSlotName = "src-js/"
			basePath = grammar.getBasePath()
			relativePath = "/ace/snippets/"
		}
		grammarShortName = factory.input.shortName.toLowerCase
		factory.generateFile(defaultSlotName + basePath + relativePath, grammarShortName.toLowerCase +".js", toJavaScript(), monitor)
	}
			
	def toJavaScript()'''
«fileHeader»
define('ace/snippets/«grammarShortName.toLowerCase»', ['require', 'exports', 'module' ], function(require, exports, module) {

exports.snippetText = ''
exports.scope = "«grammarShortName.toLowerCase»";
});
'''
}