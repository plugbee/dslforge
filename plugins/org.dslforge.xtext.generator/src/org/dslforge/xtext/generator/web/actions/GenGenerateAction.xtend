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

class GenGenerateAction implements IWebProjectGenerator{
	
	val relativePath = "/actions/"
	var String projectName
	var String grammarShortName
	var String basePath
	
	override doGenerate(EObject input, IFileSystemAccess fsa) {
		var grammar = input as Grammar
		projectName=GeneratorUtil::getProjectName(grammar)
		grammarShortName= GeneratorUtil::getGrammarShortName(grammar)
		basePath=GeneratorUtil::getBasePath(grammar)
		fsa.generateFile(basePath + relativePath + "GenerateAction.java", "src", toJava())
	}
	
	def toJava()'''
package «projectName».actions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.dslforge.xtext.common.BasicXtextEditor;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import «projectName».wizards.GeneratorWizard;

import com.google.common.base.Function;
import com.google.common.collect.Maps;
import com.google.inject.Injector;


public class GenerateAction extends Action  {

	private Injector injector;

	private Map<String, String> outlets = new HashMap<String, String>();
	
	public GenerateAction() {
		setId("generate action");
		setEnabled(true);
		setText("Generate");
	}
	
	@Override
	public void runWithEvent(Event event) {
		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow window = wb.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		IEditorPart editor = page.getActiveEditor();
		if (editor != null) {
			if (editor instanceof BasicXtextEditor) {
				IEditorInput input = ((BasicXtextEditor) editor).getEditorInput();
				if (input instanceof URIEditorInput) {
					URIEditorInput fileURI = (URIEditorInput) input;
					URI uri = fileURI.getURI();
		
					//open configuration window
					GeneratorWizard wizard = new GeneratorWizard();
					wizard.setURI(uri);
					WizardDialog wizardDialog = new WizardDialog(window.getShell(), wizard);
					wizardDialog.open();
				}
			}
		}
	}
}
	'''

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}