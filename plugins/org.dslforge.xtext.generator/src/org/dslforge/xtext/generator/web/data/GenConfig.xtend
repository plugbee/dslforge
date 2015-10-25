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
package org.dslforge.xtext.generator.web.data

import org.dslforge.xtext.generator.IWebProjectGenerator
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.Grammar
import org.dslforge.xtext.generator.util.GeneratorUtil

class GenConfig implements IWebProjectGenerator{
	
	val relativePath = "/"
	var String projectName
	var String grammarShortName
	var Grammar grammar
	
	override doGenerate(EObject input, IFileSystemAccess fsa) {
		grammar = input as Grammar
		projectName=GeneratorUtil::getProjectName(grammar)
		grammarShortName= GeneratorUtil::getGrammarShortName(grammar)
		fsa.generateFile(relativePath + "config.txt", "data", toTxt())
	}
	
		def toTxt() '''
BASIC {
    org.eclipse.equinox.security.auth.module.ExtensionLoginModule required
        extensionId="org.dslforge.rap.security.dummyLoginModule";

};

UNIX {
    org.eclipse.equinox.security.auth.module.ExtensionLoginModule required
        extensionId="«projectName».unixLoginModule";

};


		'''
		
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}