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
package org.dslforge.xtext.generator.web.editor

import org.dslforge.xtext.generator.IWebProjectGenerator
import org.dslforge.xtext.generator.util.GeneratorUtil
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.generator.IFileSystemAccess

class GenEditor implements IWebProjectGenerator{
	
	val relativePath = "/editor/"
	var String projectName
	var String grammarShortName
	var String basePath
	var Grammar grammar
	var boolean useXtextContentAsssit = false
	
	new(boolean serverSideContentAssist) {
		super()
		useXtextContentAsssit=serverSideContentAssist
	}
	
	override doGenerate(EObject input, IFileSystemAccess fsa) {
		grammar = input as Grammar
		projectName=GeneratorUtil::getProjectName(grammar)
		grammarShortName= GeneratorUtil::getGrammarShortName(grammar)
		basePath=GeneratorUtil::getBasePath(grammar)
		if (!useXtextContentAsssit)	
			fsa.generateFile(basePath + relativePath + "Abstract" + grammarShortName + "Editor.java", "src-gen", toBasicXtextEditor())
		else
			fsa.generateFile(basePath + relativePath + "Abstract" + grammarShortName + "Editor.java", "src-gen", toXtextContentAssistEnabledEditor())
		fsa.generateFile(basePath + relativePath + grammarShortName + "Editor.java", "src", toJavaSrc())
	}
	
	def toBasicXtextEditor()'''
/**
 * @Generated by DSLFORGE
 */
package «projectName».editor;

import org.dslforge.styledtext.BasicText;
import org.dslforge.xtext.common.BasicXtextEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import «projectName».editor.widget.«grammarShortName»;
import «projectName».internal.Activator;

public abstract class Abstract«grammarShortName»Editor extends BasicXtextEditor {

	public Abstract«grammarShortName»Editor() {
		super();
		setLanguageName(Activator.LANGUAGE_NAME);
		setInjector(Activator.getInstance().getInjector(Activator.LANGUAGE_NAME));
	}
	
	@Override
	protected BasicText createTextWidget(Composite parent, int styles) {
		«grammarShortName» «grammarShortName.toFirstLower»Widget = new «grammarShortName»(parent, styles);
		GridData textLayoutData = new GridData();
		textLayoutData.horizontalAlignment = SWT.FILL;
		textLayoutData.verticalAlignment = SWT.FILL;
		textLayoutData.grabExcessHorizontalSpace = true;
		textLayoutData.grabExcessVerticalSpace = true;
		«grammarShortName.toFirstLower»Widget.setLayoutData(textLayoutData);
		«grammarShortName.toFirstLower»Widget.setEditable(true);
		return «grammarShortName.toFirstLower»Widget;
	}
}
	'''

	def toXtextContentAssistEnabledEditor()'''
/**
 * @Generated by DSLFORGE
 */
package «projectName».editor;

import org.dslforge.styledtext.BasicText;
import org.dslforge.xtext.common.XtextContentAssistEnabledEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import «projectName».editor.widget.«grammarShortName»;
import «projectName».internal.Activator;

public abstract class Abstract«grammarShortName»Editor extends XtextContentAssistEnabledEditor {

	public Abstract«grammarShortName»Editor() {
		super();
		setLanguageName(Activator.LANGUAGE_NAME);
		setInjector(Activator.getInstance().getInjector(Activator.LANGUAGE_NAME));
	}
	
	@Override
	protected BasicText createTextWidget(Composite parent, int styles) {
		«grammarShortName» «grammarShortName.toFirstLower»Widget = new «grammarShortName»(parent, styles);
		GridData textLayoutData = new GridData();
		textLayoutData.horizontalAlignment = SWT.FILL;
		textLayoutData.verticalAlignment = SWT.FILL;
		textLayoutData.grabExcessHorizontalSpace = true;
		textLayoutData.grabExcessVerticalSpace = true;
		«grammarShortName.toFirstLower»Widget.setLayoutData(textLayoutData);
		«grammarShortName.toFirstLower»Widget.setEditable(true);
		return «grammarShortName.toFirstLower»Widget;
	}
}
	'''

	def toJavaSrc()'''
/**
 * @Generated by DSLFORGE
 */
package «projectName».editor;

public class «grammarShortName»Editor extends Abstract«grammarShortName»Editor {

	static final String EDITOR_ID = "«projectName».editor";

	public «grammarShortName»Editor() {
		super();
	}
}
'''

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}