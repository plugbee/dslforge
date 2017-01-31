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
package org.dslforge.ace.generator.web.parser

import org.dslforge.ace.generator.util.StringAppendable
import org.dslforge.common.AbstractGenerator
import org.dslforge.common.IWebProjectFactory
import org.eclipse.core.runtime.IProgressMonitor

class GenGrammar extends AbstractGenerator {

	val String indentation = "	"
	val String lineSeparator = "\n"

	new () {
		defaultSlotName = ""
		basePath="WebContent"
		relativePath = "/parser/"
	}
	
	override doGenerate(IWebProjectFactory factory, IProgressMonitor monitor) {
		grammarShortName = factory.input.shortName
		factory.generateFile(defaultSlotName + basePath + relativePath, grammarShortName.toFirstUpper + ".g", translate(), monitor)
	}

	def CharSequence translate() {
		val appendable = createAppendable()
		appendable.append(header).newLine
		appendable.append(body).newLine
		appendable.append(footer).newLine
		return appendable.content
	}
	
	def StringAppendable createAppendable() {
		val appendable = new StringAppendable(indentation, lineSeparator)
		return appendable
	}

	def header() '''
		«fileHeader»
		grammar «grammarShortName.toFirstUpper»;
		
		options {
		  language=JavaScript;
		  output=AST;
		  ASTLabelType=CommonTree;
		}
		
		@lexer::header {
		}
		
		@parser::header {
		}
	'''

	def CharSequence body() '''
		rule_«grammarShortName.toFirstUpper» :
			('Hello' someone+=ID)* 
		 EOF!;
	'''

	def CharSequence footer() '''
		ID : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;
		
		STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');
		
		COMMENT : ('/*' .* '*/' | '//' ~('\r' | '\n')*)   { $channel = HIDDEN; } ;
		
		WS:  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;} ;
		
		INT: ('0'..'9')+;
	'''
}