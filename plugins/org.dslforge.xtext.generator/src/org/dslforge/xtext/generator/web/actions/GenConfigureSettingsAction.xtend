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
package org.dslforge.xtext.generator.web.actions

import org.dslforge.xtext.generator.IWebProjectGenerator
import org.dslforge.xtext.generator.util.GeneratorUtil
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.generator.IFileSystemAccess

class GenConfigureSettingsAction implements IWebProjectGenerator{
	
	val relativePath = "/actions/"
	var String projectName
	var String grammarShortName
	var String basePath
	
	override doGenerate(EObject input, IFileSystemAccess fsa) {
		var grammar = input as Grammar
		projectName=GeneratorUtil::getProjectName(grammar)
		grammarShortName= GeneratorUtil::getGrammarShortName(grammar)
		basePath=GeneratorUtil::getBasePath(grammar)
		fsa.generateFile(basePath + relativePath + "ConfigureSettingsAction.java", "src", toJava())
	}
	
	def toJava()'''
package «projectName».actions;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.Event;

public class ConfigureSettingsAction extends Action {

	private static final long serialVersionUID = 1L;

	public ConfigureSettingsAction() {
		setId("configure settings");
		setEnabled(true);
		setText("Settings...");
	}

	@Override
	public void runWithEvent(Event event) {
	}
}

	'''

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}