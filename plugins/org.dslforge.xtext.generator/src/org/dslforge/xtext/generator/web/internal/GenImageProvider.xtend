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
package org.dslforge.xtext.generator.web.internal

import org.dslforge.common.AbstractGenerator
import org.dslforge.common.IWebProjectFactory
import org.dslforge.xtext.generator.XtextGrammar
import org.eclipse.core.runtime.IProgressMonitor

class GenImageProvider extends AbstractGenerator {

	val relativePath = "/internal/"
	var String grammarShortName
	var XtextGrammar grammar

	override doGenerate(IWebProjectFactory factory, IProgressMonitor monitor) {
		grammar = factory.input as XtextGrammar
		basePath = grammar.getBasePath()
		projectName = grammar.getProjectName()
		grammarShortName = grammar.getShortName()
		factory.generateFile("src-gen/" + basePath + relativePath, grammarShortName.toFirstUpper + "ImageProvider.java",
			toJava(projectName), monitor)
	}

	def toJava(String projectName) '''
	«fileHeader»
	package «projectName».internal;
	
	public class «grammarShortName.toFirstUpper»ImageProvider {
	
		public static final String FILE = "icons/model.png";
		public static final String WIZARD = "icons/wizard.png";
	}'''
}
