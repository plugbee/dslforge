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

import org.dslforge.xtext.generator.web.ace.GenAce
import org.dslforge.xtext.generator.web.ace.GenGlobalIndex
import org.dslforge.xtext.generator.web.ace.GenLanguageTools
import org.dslforge.xtext.generator.web.ace.GenMode
import org.dslforge.xtext.generator.web.ace.GenTest
import org.dslforge.xtext.generator.web.ace.GenThemeEclipse
import org.dslforge.xtext.generator.web.ace.GenWorker
import org.dslforge.xtext.generator.web.actions.GenGenerateAction
import org.dslforge.xtext.generator.web.actions.GenNewAction
import org.dslforge.xtext.generator.web.antlr.GenAntlr
import org.dslforge.xtext.generator.web.antlr.GenGrammar
import org.dslforge.xtext.generator.web.antlr.GenGrammarTester
import org.dslforge.xtext.generator.web.editor.GenActionBarContributor
import org.dslforge.xtext.generator.web.editor.GenEditor
import org.dslforge.xtext.generator.web.editor.widget.GenGlobalIndexResource
import org.dslforge.xtext.generator.web.editor.widget.GenWidget
import org.dslforge.xtext.generator.web.editor.widget.GenWidgetResource
import org.dslforge.xtext.generator.web.internal.GenActivator
import org.dslforge.xtext.generator.web.internal.GenImageProvider
import org.dslforge.xtext.generator.web.module.GenWebRuntimeModule
import org.dslforge.xtext.generator.web.module.GenWebStandaloneSetup
import org.dslforge.xtext.generator.web.wizards.GenGeneratorWizard
import org.dslforge.xtext.generator.web.wizards.GenGeneratorWizardPage
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.dslforge.xtext.generator.web.ace.GenDocumentation
import org.dslforge.xtext.generator.web.ace.GenTooltip
import org.dslforge.xtext.generator.web.ace.snippets.GenSnippets
import org.dslforge.xtext.generator.web.GenExecutableExtensionFactory

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

	//Actions
	GenNewAction genNewAction = new GenNewAction
	GenGenerateAction genGenerateAction = new GenGenerateAction
	
	//Editor
	GenActionBarContributor genActionBarContributor = new GenActionBarContributor
	GenEditor genEditor = new GenEditor
	
	//Editor Widget
	GenWidgetResource genResource = new GenWidgetResource
	GenGlobalIndexResource genGlobalIndexResource = new GenGlobalIndexResource
	GenWidget genWidget = new GenWidget
	
	//Wizards
	//GenNewWizard genNewWizard = new GenNewWizard
	GenGeneratorWizard genGeneratorWizard = new GenGeneratorWizard
	GenGeneratorWizardPage genGeneratorWizardPage = new GenGeneratorWizardPage
	
	//ACE
	GenAce genAce = new GenAce 
	GenLanguageTools genLanguageTools = new GenLanguageTools
	GenMode genMode = new GenMode
	GenTest genTest = new GenTest
	GenGlobalIndex genGlobalIndex = new GenGlobalIndex
	GenThemeEclipse genThemeEclipse = new GenThemeEclipse
	GenWorker genWorker = new GenWorker
	GenDocumentation genDocumentation = new GenDocumentation
	GenTooltip genTooltip = new GenTooltip
	GenSnippets genSnippets = new GenSnippets

	//ANTLR
	GenAntlr genAntlr = new GenAntlr
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
		//activator & image provider
		genActivator.doGenerate(input, fsa)
		genImageProvider.doGenerate(input, fsa)
		
		//Guice bindings
		genWebRuntimeModule.doGenerate(input, fsa)
		genWebStandaloneSetup.doGenerate(input, fsa)

		//Executable extension factory
		genExecutableExtensionFactory.doGenerate(input, fsa)
		
		genNewAction.doGenerate(input, fsa)
		genActionBarContributor.doGenerate(input, fsa)
		genEditor.doGenerate(input, fsa)
		genResource.doGenerate(input, fsa)
		genGlobalIndexResource.doGenerate(input, fsa)
		genWidget.doGenerate(input, fsa)
		
		//generator option
		if (useGenerator) {
			//generate Generate action and wizards only if option is available
			genGenerateAction.doGenerate(input, fsa)
			genGeneratorWizard.doGenerate(input, fsa)
			genGeneratorWizardPage.doGenerate(input, fsa)
		}

		//ace 
		genAce.doGenerate(input, fsa)
		genLanguageTools.doGenerate(input, fsa) 
		genMode.doGenerate(input, fsa) 
		genTest.doGenerate(input, fsa)
		genGlobalIndex.doGenerate(input, fsa) 
		genThemeEclipse.doGenerate(input, fsa)
		genDocumentation.doGenerate(input, fsa)
		genTooltip.doGenerate(input, fsa)
		genSnippets.doGenerate(input, fsa)
		
		//antlr
		genAntlr.doGenerate(input, fsa)
		genGrammar.doGenerate(input, fsa)
		genGrammarTester.doGenerate(input, fsa)
		genWorker.doGenerate(input, fsa) 
	}	
}