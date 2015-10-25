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
package org.dslforge.xtext.generator.web.parts

import org.dslforge.xtext.generator.IWebProjectGenerator
import org.dslforge.xtext.generator.util.GeneratorUtil
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.generator.IFileSystemAccess

class GenPerspective implements IWebProjectGenerator{
	
	val relativePath = "/parts/"
	var String projectName
	var String grammarShortName
	var String basePath
	var Grammar grammar
	var boolean useNavigator = false
	var String navigatorRoot = ""
	
	override doGenerate(EObject input, IFileSystemAccess fsa) {
		grammar = input as Grammar
		projectName=GeneratorUtil::getProjectName(grammar)
		grammarShortName= GeneratorUtil::getGrammarShortName(grammar)
		basePath=GeneratorUtil::getBasePath(grammar)
		fsa.generateFile(basePath + relativePath + grammarShortName + "Perspective.java", "src", toJava())
	}
	
	def toJava()'''
package «projectName».parts;

import org.dslforge.rap.workspace.WorkspaceManager;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * Configures the perspective layout. This class is contributed 
 * through the plugin.xml.
 */
public class «grammarShortName»Perspective implements IPerspectiveFactory {
	
	public static final String ID_PERSPECTIVE = "org.dslforge.core.ui.parts.perspective";
	
	private static final String NAVIGATOR_VIEW_ID = "org.dslforge.rap.navigator.view";
		
	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(true);
		layout.addPerspectiveShortcut(ID_PERSPECTIVE);
		layout.setFixed(true);
		«IF useNavigator && navigatorRoot!=null»
		layout.addStandaloneView(NAVIGATOR_VIEW_ID, true, IPageLayout.LEFT, 0.6f, editorArea);
		«IF navigatorRoot.length>0»
		//set workspace root
		WorkspaceManager.getInstance().setWorkspaceRoot("«navigatorRoot»");
		«ENDIF»
		«ENDIF»
	}
}
	'''

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def setUseNavigator(boolean b) {
		useNavigator = b
	}
	
	def setNavigatorRoot(String value) {
		navigatorRoot = value
	}
	
}