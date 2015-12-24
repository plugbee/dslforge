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
package org.dslforge.texteditor.demo.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchWindow;

public abstract class AbstractWorkbenchActionDelegate implements IViewActionDelegate {

	private ISelection selection;
	
	private IWorkbenchWindow window;

	@Override
	public void init(IViewPart view) {
		IWorkbenchWindow workbenchWindow = view.getSite().getWorkbenchWindow();
		setWindow(workbenchWindow);
		setSelection(workbenchWindow.getSelectionService().getSelection());
	}
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.setSelection(selection);
	}
	
	public ISelection getSelection() {
		return selection;
	}

	public void setSelection(ISelection selection) {
		this.selection = selection;
	}

	public IWorkbenchWindow getWindow() {
		return window;
	}

	public void setWindow(IWorkbenchWindow window) {
		this.window = window;
	}
}