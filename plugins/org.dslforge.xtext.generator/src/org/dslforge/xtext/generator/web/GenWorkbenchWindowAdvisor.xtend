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
package org.dslforge.xtext.generator.web

import org.dslforge.xtext.generator.IWebProjectGenerator
import org.dslforge.xtext.generator.util.GeneratorUtil
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.generator.IFileSystemAccess

class GenWorkbenchWindowAdvisor implements IWebProjectGenerator{
	
	val relativePath = "/"
	var String projectName
	var String grammarShortName
	var String basePath
	
	override doGenerate(EObject input, IFileSystemAccess fsa) {
		var grammar = input as Grammar
		projectName=GeneratorUtil::getProjectName(grammar)
		grammarShortName= GeneratorUtil::getGrammarShortName(grammar)
		basePath=GeneratorUtil::getBasePath(grammar)
		fsa.generateFile(basePath + relativePath +grammarShortName+"WorkbenchWindowAdvisor.java", "src", toJava())
	}
	
	def toJava()'''
package «projectName»;

import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

/**
 * Configures the initial size and appearance of a workbench window.
 */
public class «grammarShortName»WorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

	public «grammarShortName»WorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}

	public void preWindowOpen() {
		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
		configurer.setInitialSize(new Point(600, 800));
		configurer.setShowCoolBar(false);
		configurer.setShowStatusLine(true);
		configurer.setTitle("«grammarShortName» Editor");
	//	configurer.setShellStyle(SWT.TITLE | SWT.RESIZE);
	}
	
		@Override
	public void postWindowOpen() {
        IWorkbenchWindowConfigurer configurer = getWindowConfigurer();    
        configurer.getWindow().getShell().setMaximized( true );
	}
	
	public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
		return new «grammarShortName»ActionBarAdvisor(configurer);
	}
}
	'''

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}