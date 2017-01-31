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
package org.dslforge.xtext.generator.web.editor.widget

import org.dslforge.common.AbstractGenerator
import org.dslforge.common.IWebProjectFactory
import org.dslforge.xtext.generator.XtextGrammar
import org.eclipse.core.runtime.IProgressMonitor

class GenWidgetResource extends AbstractGenerator {

	val relativePath = "/editor/widget/"
	var XtextGrammar grammar

	override doGenerate(IWebProjectFactory factory, IProgressMonitor monitor) {
		grammar = factory.input as XtextGrammar
		projectName = grammar.getProjectName()
		grammarShortName = grammar.getShortName()
		basePath = grammar.getBasePath()
		factory.generateFile("src-gen/" + basePath + relativePath, grammarShortName + "Resource.java", toJava(), monitor)
	}

	def toJava() '''
	«fileHeader»
	package «projectName».editor.widget;
	
	import org.eclipse.rap.ui.resources.IResource;
	
	public final class «grammarShortName»Resource implements IResource {
	
	  public String getCharset() {
	    return "UTF-8";
	  }
	
	  public ClassLoader getLoader() {
	    return this.getClass().getClassLoader();
	  }
	
	  public String getLocation() { 	
	    return "src-js/«basePath»/«grammarShortName».js"; //$NON-NLS-1$
	  }
	  
	  public boolean isExternal() {
	    return false;
	  }
	
	  public boolean isJSLibrary() {
	    return true;
	  }
	
	  public boolean isAccessible() {
	    return false;
	  }
	}
	'''
}
