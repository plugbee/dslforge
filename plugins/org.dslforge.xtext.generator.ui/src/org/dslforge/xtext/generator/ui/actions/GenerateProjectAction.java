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
package org.dslforge.xtext.generator.ui.actions;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.dslforge.xtext.generator.ui.operations.GenerateWebProjectOperation;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

public class GenerateProjectAction extends BaseSelectionListenerAction implements IObjectActionDelegate {

	protected ISelection selection;
	
	public GenerateProjectAction() {
		super("Generate Web Editor");
	}

	@Override
	public void run(IAction action) {
		IStructuredSelection structuredSelection = (IStructuredSelection)selection;
		Object obj = structuredSelection.getFirstElement();
		IFile file = (IFile) Platform.getAdapterManager().getAdapter(obj, IFile.class);
		//default values
		Map<String, Object> settings = new HashMap<String, Object>();
		settings.put("Grammar", file);
		settings.put("Outputs", file.getProject());
		settings.put("UseNavigator", IGenerateProjectConstants.USE_NAVIGATOR);
		settings.put("NavigatorRoot", IGenerateProjectConstants.NAVIGATOR_ROOT_PATH);
		settings.put("UseGenerator", IGenerateProjectConstants.USE_GENERATOR);
		try {
			PlatformUI.getWorkbench().getProgressService().run(true, true, new GenerateWebProjectOperation(settings));
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			ErrorDialog.openError(PlatformUI.getWorkbench().getDisplay().getActiveShell(), "Error:", e.toString(), null);
		}
	}
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		selection = targetPart.getSite().getWorkbenchWindow().getSelectionService().getSelection();	
	}
}