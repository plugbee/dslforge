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
package org.dslforge.xtext.generator

import org.dslforge.xtext.generator.web.GenExecutableExtensionFactory
import org.dslforge.xtext.generator.web.GenGlobalIndex
import org.dslforge.xtext.generator.web.GenIndex
import org.dslforge.xtext.generator.web.ace.GenAce
import org.dslforge.xtext.generator.web.ace.GenLanguageTools
import org.dslforge.xtext.generator.web.ace.GenMode
import org.dslforge.xtext.generator.web.ace.GenTheme
import org.dslforge.xtext.generator.web.ace.GenWorker
import org.dslforge.xtext.generator.web.ace.snippets.GenSnippets
import org.dslforge.xtext.generator.web.editor.GenActionBarContributor
import org.dslforge.xtext.generator.web.editor.GenEditor
import org.dslforge.xtext.generator.web.editor.widget.GenWidget
import org.dslforge.xtext.generator.web.editor.widget.GenWidgetResource
import org.dslforge.xtext.generator.web.internal.GenActivator
import org.dslforge.xtext.generator.web.internal.GenImageProvider
import org.dslforge.xtext.generator.web.module.GenWebRuntimeModule
import org.dslforge.xtext.generator.web.module.GenWebStandaloneSetup
import org.dslforge.xtext.generator.web.parser.GenAntlrAll
import org.dslforge.xtext.generator.web.parser.GenGrammar
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.dslforge.xtext.generator.web.ace.GenTooltip
import org.dslforge.xtext.generator.web.ace.GenSearchbox

class GenWebProject implements IWebProjectGenerator {

	var EditorType editorType;

	def setEditorType(EditorType type) {
		editorType = type
	}

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		doGenerate(input.getContents().get(0), fsa)
	}

	override doGenerate(EObject input, IFileSystemAccess fsa) {
		switch (editorType) {
			case ACE: generateAceEditor(input, fsa)
			case RAP: generateXtextRAPEditor(input, fsa)
		}
	}

	/**
	 * Generate ACE editor with client-side ANTLR Parser and Lexer (JavaScript only).
	 */
	def generateAceEditor(EObject input, IFileSystemAccess fsa) {
		new GenIndex(editorType).doGenerate(input, fsa)
		new GenAce(editorType).doGenerate(input, fsa)
		new GenMode(editorType).doGenerate(input, fsa)
		new GenGlobalIndex(editorType).doGenerate(input, fsa)
		new GenTheme(editorType).doGenerate(input, fsa)
		new GenLanguageTools(editorType).doGenerate(input, fsa)
		new GenTooltip(editorType).doGenerate(input, fsa)
		new GenSearchbox(editorType).doGenerate(input, fsa)
		new GenSnippets(editorType).doGenerate(input, fsa)
		new GenAntlrAll(editorType).doGenerate(input, fsa)
		new GenGrammar(editorType).doGenerate(input, fsa)
		new GenWorker(editorType).doGenerate(input, fsa)
	}

	/**
	 * Generate Eclipse RAP editor with both clien-side ANTLR Parser and Lexer and server-side Xtext back-end (Java/JavaSript).
	 */
	def generateXtextRAPEditor(EObject input, IFileSystemAccess fsa) {
		new GenActivator().doGenerate(input, fsa)
		new GenImageProvider().doGenerate(input, fsa)
		new GenWebRuntimeModule().doGenerate(input, fsa)
		new GenWebStandaloneSetup().doGenerate(input, fsa)
		new GenExecutableExtensionFactory().doGenerate(input, fsa)
		new GenActionBarContributor().doGenerate(input, fsa)
		new GenEditor().doGenerate(input, fsa)
		new GenWidget().doGenerate(input, fsa)
		new GenWidgetResource().doGenerate(input, fsa)
		new GenMode().doGenerate(input, fsa)
		new GenGlobalIndex().doGenerate(input, fsa)
		new GenTheme().doGenerate(input, fsa)
		new GenSnippets().doGenerate(input, fsa)
		new GenAntlrAll().doGenerate(input, fsa)
		new GenGrammar().doGenerate(input, fsa)
		new GenWorker().doGenerate(input, fsa)
	}
}