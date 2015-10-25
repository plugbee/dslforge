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

class GenNewAction implements IWebProjectGenerator{
	
	val relativePath = "/actions/"
	var String projectName
	var String grammarShortName
	var String fileExtension
	var String basePath
	
	override doGenerate(EObject input, IFileSystemAccess fsa) {
		var grammar = input as Grammar
		projectName=GeneratorUtil::getProjectName(grammar)
		grammarShortName= GeneratorUtil::getGrammarShortName(grammar)
		basePath=GeneratorUtil::getBasePath(grammar)
		fileExtension= GeneratorUtil::getFileExtension(grammar)
		fsa.generateFile(basePath + relativePath + "New" + grammarShortName + "Action.java", "src", toJava())
	}

	def toJava()'''
package «projectName».actions;

import java.io.File;

import org.dslforge.workspace.WorkspaceManager;
import org.dslforge.workbench.wizards.file.NewFileWizard;
import org.eclipse.emf.common.ui.action.WorkbenchWindowActionDelegate;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;


public class New«grammarShortName»Action extends WorkbenchWindowActionDelegate  {

	@Override
	public void run(IAction action) {
		File rootFoler = WorkspaceManager.INSTANCE.getRootFoler();
		StructuredSelection selection = new StructuredSelection(rootFoler);
		if (!selection.isEmpty()) {
			Object firstElement = ((IStructuredSelection)selection).getFirstElement();
			NewFileWizard wizard = new NewFileWizard(firstElement.toString(), "«grammarShortName»", "«fileExtension»");
			wizard.init(getWindow().getWorkbench(), (IStructuredSelection)selection);
			wizard.setWindowTitle("New «grammarShortName» Model");
			WizardDialog wizardDialog = new WizardDialog(getWindow().getShell(), wizard);
			wizardDialog.setPageSize(400, 400);
			wizardDialog.open();
		}
	}
}
'''

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}