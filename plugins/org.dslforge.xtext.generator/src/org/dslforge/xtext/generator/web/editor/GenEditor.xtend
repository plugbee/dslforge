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
	
	override doGenerate(EObject input, IFileSystemAccess fsa) {
		grammar = input as Grammar
		projectName=GeneratorUtil::getProjectName(grammar)
		grammarShortName= GeneratorUtil::getGrammarShortName(grammar)
		basePath=GeneratorUtil::getBasePath(grammar)
		fsa.generateFile(basePath + relativePath + grammarShortName + "Editor.java", "src", toJava())
	}

	def toJava()'''
package «projectName».editor;

import org.dslforge.xtext.common.BasicXtextEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import «projectName».editor.widget.«grammarShortName»;
import «projectName».internal.Activator;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class «grammarShortName»Editor extends BasicXtextEditor {

	private «grammarShortName» «grammarShortName.toFirstLower»Widget;

	@Inject
	private Injector injector;

	public «grammarShortName»Editor() {
		super();
		setLanguageName("«grammar.name»");
		injector = Activator.getInstance().getInjector(getLanguageName());
		injector.injectMembers(this);
	}
	
	@Override
	protected void createWidget(Composite parent, Font font) {
		«grammarShortName.toFirstLower»Widget = new «grammarShortName»(parent, SWT.FILL);
		GridData textLayoutData = new GridData();
		textLayoutData.horizontalAlignment = SWT.FILL;
		textLayoutData.verticalAlignment = SWT.FILL;
		textLayoutData.grabExcessHorizontalSpace = true;
		textLayoutData.grabExcessVerticalSpace = true;
		getWidget().setLayoutData(textLayoutData);
		getWidget().setFont(font);
		getWidget().addSaveListener(this);
		getWidget().addValidationListener(this);
	}

	@Override
	protected «grammarShortName» getWidget() {
		return «grammarShortName.toFirstLower»Widget;
	}
}
'''

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}