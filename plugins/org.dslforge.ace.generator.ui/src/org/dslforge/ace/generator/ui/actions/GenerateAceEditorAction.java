/**
 * <copyright>
 *
 * Copyright (c) 2016 PlugBee. All rights reserved.
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
package org.dslforge.ace.generator.ui.actions;

import java.lang.reflect.InvocationTargetException;

import org.apache.log4j.Logger;
import org.dslforge.ace.generator.ANTLRGrammar;
import org.dslforge.common.IWebProjectDescriptor;
import org.dslforge.common.IWebProjectDescriptor.EditorType;
import org.dslforge.common.WebProjectDescriptor;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

public class GenerateAceEditorAction extends BaseSelectionListenerAction implements IObjectActionDelegate {

	static final Logger logger = Logger.getLogger(GenerateAceEditorAction.class);

	protected ISelection selection;

	public GenerateAceEditorAction() {
		super("Generate ACE Editor");
	}

	@Override
	public void run(IAction action) {
		IStructuredSelection structuredSelection = (IStructuredSelection) selection;
		Object obj = structuredSelection.getFirstElement();
		IFile file = (IFile) Platform.getAdapterManager().getAdapter(obj, IFile.class);
		// default values
		IProject project = file.getProject();
		IPath grammarPath = file.getFullPath();
		String grammarShortName = grammarPath.removeFileExtension().lastSegment();
		ANTLRGrammar grammar = new ANTLRGrammar(grammarShortName, grammarPath);
		WebProjectDescriptor configuration = new WebProjectDescriptor(project, grammar);
		configuration.setEditorType(EditorType.ACE);
		try {
			PlatformUI.getWorkbench().getProgressService().run(true, true, doCreateOperation(configuration));
		} catch (InvocationTargetException e) {
			logger.error(e.getMessage(), e);
		} catch (InterruptedException e) {
			ErrorDialog.openError(PlatformUI.getWorkbench().getDisplay().getActiveShell(), "Error:", e.toString(),
					null);
		}
	}

	private GenerateAceEditorOperation doCreateOperation(IWebProjectDescriptor configuration) {
		return new GenerateAceEditorOperation(configuration);
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		selection = targetPart.getSite().getWorkbenchWindow().getSelectionService().getSelection();
	}
}