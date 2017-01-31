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
package org.dslforge.xtext.generator.web.parser

import java.util.Arrays
import java.util.HashSet
import java.util.Iterator
import java.util.List
import java.util.Set
import java.util.regex.Matcher
import java.util.regex.Pattern
import org.dslforge.common.AbstractGenerator
import org.dslforge.common.IWebProjectFactory
import org.dslforge.xtext.generator.XtextGrammar
import org.dslforge.xtext.generator.util.StringAppendable
import org.eclipse.core.runtime.IProgressMonitor
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
import org.eclipse.xtext.TerminalRule
import org.eclipse.xtext.XtextFactory
import org.eclipse.xtext.resource.SaveOptions
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.RuleCall

class GenGrammar extends AbstractGenerator {

	val String indentation = "	"
	val String lineSeparator = "\n"
	var Grammar grammar

	new() {
		defaultSlotName = "src-js"
		relativePath = "/parser/"
	}

	override doGenerate(IWebProjectFactory factory, IProgressMonitor monitor) {
		var wrapped = factory.input as XtextGrammar
		grammar = wrapped.grammar
		basePath = wrapped.getBasePath()
		projectName = wrapped.getProjectName()
		grammarShortName = wrapped.getShortName()
		factory.generateFile(defaultSlotName + "/" + basePath + relativePath, grammarShortName + ".g",
			translate(), monitor)
	}

	def CharSequence translate() {
		val appendable = createAppendable()
		appendable.append(header).newLine
		appendable.append(body).newLine
		appendable.append(footer).newLine
		return appendable.content
	}

	def header() '''
		«fileHeader»
		grammar «grammarShortName»;
		
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
		val appendable = createAppendable()
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
		for (ParserRule pr : parserRules) {
			// rules are untyped
			println(pr)
			pr.setType(null)	
			//semantic predicates
			var List<AbstractElement> elements = GrammarUtil::containedAbstractElements(pr)
			for (AbstractElement e: elements)
				e.predicated = false	
			// actions
			val alternatives = pr.alternatives
			if (alternatives instanceof Group) {
				var List<AbstractElement> objs = (alternatives as Group).elements
				var Iterator<AbstractElement> i = objs.iterator();
				while (i.hasNext()) {
					var o = i.next()
					// actions
					if (o instanceof Action) {
						if (o.feature!=null)
							i.remove();
					}
				}
			}
			// assignments
			val assignments = GrammarUtil::containedAssignments(pr)
			for (Assignment a : assignments) {
				val terminal = a.terminal
				a.setFeature(a.feature.toLowerCase+ "_"+assignments.indexOf(a))
				var operator = a.operator
				if (operator.equals("?=")) {
					a.setOperator("=")
				}
				// cross references
				if (terminal instanceof CrossReference) {
					var call = XtextFactory::eINSTANCE.createRuleCall
					var replacement = XtextFactory::eINSTANCE.createTerminalRule
					val allTerminalRules = GrammarUtil::allTerminalRules(grammar)
					for (TerminalRule t: allTerminalRules) {
						var x = terminal.terminal
						if (x instanceof RuleCall) {
							var rule = (x as RuleCall).rule
							if (t.name==rule.name)
								replacement=t		
						}

					}
					call.setRule(replacement)
					a.setTerminal(call)
				}
			}
			var text = grammarDefinition.serializer.serialize(pr, SaveOptions::defaultOptions)		
			// {Pattern.current=xxx}			 	 
			val Pattern p = Pattern::compile("\\{(.+?)\\}")
			val Matcher m = p.matcher(text)
			while (m.find()) {
				val group = m.group
				if (!(group.substring(1, 2) == '\''))
					text = text.replace(group, "")
			}			
			//EOF
			if (rules.get(0).equals(pr))
				text = text.substring(0, text.length - 1) + " EOF!" + ";"
			text = text.replaceAll("\"", "'")
			appendable.newLine.append(text + "\n")
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
			appendable.newLine.append(builder + "\n")
		}	
		// Manage terminals
		var terminalRules = GrammarUtil::allTerminalRules(grammar);
		var Set<String> covered = new HashSet<String>(Arrays.asList("ID", "STRING", "COMMENT", "WS", "INT", "ML_COMMENT", "SL_COMMENT", "ANY_OTHER"));
		for (TerminalRule terminal : terminalRules) {
			if (!covered.contains(terminal.name)) {
				var text = grammarDefinition.serializer.serialize(terminal, SaveOptions::defaultOptions)
				text = text.replace("terminal ", "");
				// ! => ~
				val Pattern p = Pattern::compile("!\\(.+\\)")
				val Matcher m = p.matcher(text)
				while (m.find()) {
					val group = m.group
					text = text.replace(group, group.replaceFirst("!", "~"))
				}
				appendable.newLine.append(text + "\n");	
			}
		}
		return appendable.content
	}

	def CharSequence footer() '''
		ID : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;
		
		STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');
		
		COMMENT : ('/*' .* '*/' | '//' ~('\r' | '\n')*)   { $channel = HIDDEN; } ;
		
		WS:  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;} ;
		
		INT: ('0'..'9')+;
	'''

	def StringAppendable createAppendable() {
		val appendable = new StringAppendable(indentation, lineSeparator)
		return appendable
	}
}