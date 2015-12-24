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
import org.dslforge.xtext.generator.web.ace.GenAntlrAll
import org.dslforge.xtext.generator.web.ace.GenGlobalIndex
import org.dslforge.xtext.generator.web.ace.GenGrammar
import org.dslforge.xtext.generator.web.ace.GenGrammarTester
import org.dslforge.xtext.generator.web.ace.GenMode
import org.dslforge.xtext.generator.web.ace.GenTest
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
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

class GenWebProject implements IWebProjectGenerator{
	
	var useNavigator = false
	var useGenerator = false
	var navigatorRoot = "";
	
	//Executable Extension Factory
	GenExecutableExtensionFactory genExecutableExtensionFactory = new GenExecutableExtensionFactory
	
	//Activator
	GenActivator genActivator = new GenActivator
	GenImageProvider genImageProvider = new GenImageProvider
	GenWebRuntimeModule genWebRuntimeModule = new GenWebRuntimeModule
	GenWebStandaloneSetup genWebStandaloneSetup = new GenWebStandaloneSetup

	//Editor
	GenActionBarContributor genActionBarContributor = new GenActionBarContributor
	GenEditor genEditor = new GenEditor
	
	//Editor Widget
	GenWidgetResource genResource = new GenWidgetResource
	GenWidget genWidget = new GenWidget
	
	//ACE
	GenMode genMode = new GenMode
	GenTest genTest = new GenTest
	GenGlobalIndex genGlobalIndex = new GenGlobalIndex
	GenTheme genThemeEclipse = new GenTheme
	GenWorker genWorker = new GenWorker
	GenSnippets genSnippets = new GenSnippets

	//ANTLR
	GenAntlrAll genAntlr = new GenAntlrAll
	GenGrammar genGrammar = new GenGrammar
	GenGrammarTester genGrammarTester = new GenGrammarTester
	
	def useNavigator(boolean value) {
		useNavigator = value
	}
	
	def useGenerator(boolean value) {
		useGenerator = value
	}
	
	def setNavigatorRoot(String value) {
		navigatorRoot = value
	}
		
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		doGenerate(input.getContents().get(0), fsa)
	}
	
	override doGenerate(EObject input, IFileSystemAccess fsa) {
		genActivator.doGenerate(input, fsa)
		genImageProvider.doGenerate(input, fsa)
		genWebRuntimeModule.doGenerate(input, fsa)
		genWebStandaloneSetup.doGenerate(input, fsa)
		genExecutableExtensionFactory.doGenerate(input, fsa)
		genActionBarContributor.doGenerate(input, fsa)
		genEditor.doGenerate(input, fsa)
		genResource.doGenerate(input, fsa)
		genWidget.doGenerate(input, fsa)
		genMode.doGenerate(input, fsa) 
		genTest.doGenerate(input, fsa)
		genGlobalIndex.doGenerate(input, fsa) 
		genThemeEclipse.doGenerate(input, fsa)
		genSnippets.doGenerate(input, fsa)
		genAntlr.doGenerate(input, fsa)
		genGrammar.doGenerate(input, fsa)
		genGrammarTester.doGenerate(input, fsa)
		genWorker.doGenerate(input, fsa) 
	}	
}