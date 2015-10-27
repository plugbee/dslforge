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
package org.dslforge.xtext.generator.web.antlr

import java.util.Iterator
import java.util.List
import java.util.regex.Matcher
import java.util.regex.Pattern
import org.dslforge.xtext.generator.IWebProjectGenerator
import org.dslforge.xtext.generator.util.GeneratorUtil
import org.dslforge.xtext.generator.util.StringAppendable
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.AbstractElement
import org.eclipse.xtext.Action
import org.eclipse.xtext.Alternatives
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.CrossReference
import org.eclipse.xtext.EnumLiteralDeclaration
import org.eclipse.xtext.EnumRule
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.Group
import org.eclipse.xtext.ParserRule
import org.eclipse.xtext.XtextFactory
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.resource.XtextResource

class GenGrammar implements IWebProjectGenerator {

	val relativePath = "/parser/"
	var String projectName
	var String grammarShortName
	var String basePath
	var Grammar grammar

	val String indentation = "	"
	val String lineSeparator = "\n"

	override doGenerate(EObject input, IFileSystemAccess fsa) {
		grammar = input as Grammar
		projectName = GeneratorUtil::getProjectName(grammar)
		grammarShortName = GeneratorUtil::getGrammarShortName(grammar)
		basePath = GeneratorUtil::getBasePath(grammar)
		fsa.generateFile(basePath + relativePath + "Internal" + grammarShortName + ".g", "src-js", translate())
	}

	def CharSequence translate() {
		val appendable = createAppendable(grammar)
		appendable.append(header).newLine
		appendable.append(body).newLine
		appendable.append(footer).newLine
		return appendable.content
	}

	def header() '''
		grammar Internal«grammarShortName»;
		
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

	def CharSequence body() {
		val appendable = createAppendable(grammar)
		var grammarDefinition = grammar.eResource as XtextResource
		val rules = grammar.rules
		
		// rename rules
		var List<ParserRule> parserRules = GrammarUtil::allParserRules(grammar);
		for (ParserRule pr : parserRules) {
			pr.setName("rule_" + pr.name.toFirstUpper)
		}
		var List<EnumRule> enumRules = GrammarUtil::allEnumRules(grammar);
		for (EnumRule en : enumRules) {
			en.setName("rule_" + en.name.toFirstUpper)
		}
		parserRules = GrammarUtil::allParserRules(grammar);
		for (ParserRule pr : parserRules) {
			// rules on the client side are untyped
			pr.setType(null)
			// remove the actions (xtext-specific)
			val alternatives = pr.alternatives
			if (alternatives instanceof Group) {
				var List<AbstractElement> objs = (alternatives as Group).elements
				var Iterator<AbstractElement> i = objs.iterator();
				while (i.hasNext()) {
					var o = i.next()
					if (o instanceof Action) {
						i.remove();
					}
				}
			}
			// assignments
			val assignments = GrammarUtil::containedAssignments(pr)
			for (Assignment a : assignments) {
				val terminal = a.terminal
				a.setFeature(a.feature.toLowerCase)
				var operator = a.operator
				if (operator.equals("?=")) {
					a.setOperator("=")
				}
				// cross references are not handled on the client side
				// Assumption: replace cross references in the form "reference=[Type|X]" to "reference=X" where X in {ID, STRING, FQN, ...}
				if (terminal instanceof CrossReference) {
					var call = XtextFactory::eINSTANCE.createRuleCall
					val replacement = XtextFactory::eINSTANCE.createTerminalRule
					replacement.setName("ID") // FQN
					call.setRule(replacement)
					a.setTerminal(call)
				}
			}

			var text = grammarDefinition.serializer.serialize(pr)
			// remove all the {Pattern.current=xxx}			 	 
			val Pattern p = Pattern::compile("\\{(.*?)\\}")
			val Matcher m = p.matcher(text)
			while (m.find()) {
				val group = m.group
				if (!(group.substring(1, 2) == '\''))
					text = text.replace(group, "")
			}

			// append EOF at the end of rule
			if (rules.get(0).equals(pr))
				text = text.substring(0, text.length - 1) + " EOF!" + ";"
			text = text.replaceAll("\"", "'")
			appendable.newLine.append(text + "\n").newLine
		}

		// Manage enumerations
		enumRules = GrammarUtil::allEnumRules(grammar);
		for (EnumRule en : enumRules) {
			var StringBuilder builder = new StringBuilder
			builder.append(en.name).append(":\n\t")
			val Alternatives alternatives = en.alternatives as Alternatives
			val elements = alternatives.elements
			for (AbstractElement e : elements) {
				if (e instanceof EnumLiteralDeclaration) {
					var literal = e as EnumLiteralDeclaration
					var keyWord = literal.literal
					builder.append(keyWord.value.toFirstLower).append("=").append("'" + keyWord.value + "'")
					if (!elements.get(elements.size - 1).equals(e))
						builder.append(" | ")
				}
			}
			builder.append(";")
			appendable.newLine.append(builder + "\n").newLine
		}
		
		return appendable.content
	}

	def CharSequence footer() '''
		ID : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;
		
		STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');
		
		COMMENT : ('/*' .* '*/' | '//' ~('\r' | '\n')*)   { $channel = HIDDEN; } ;
		
		WS:  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;} ;
		
		//NUMBER: INT ('.' INT)?;
		
		INT: ('0'..'9')+;
	'''

	def StringAppendable createAppendable(EObject context) {
		val appendable = new StringAppendable(context, indentation, lineSeparator)
		return appendable
	}

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}