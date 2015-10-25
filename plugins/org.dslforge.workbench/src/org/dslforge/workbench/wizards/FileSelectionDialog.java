/**
 * <copyright>
 *
 * Copyright (c) 2015 DSLFORGE. All rights reserved.
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
package org.dslforge.workbench.wizards;

import org.dslforge.workbench.navigator.FileSystemContentProvider;
import org.dslforge.workbench.navigator.FileSystemLabelProvider;
import org.dslforge.workspace.WorkspaceManager;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.SelectionDialog;

public class FileSelectionDialog extends SelectionDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private TreeViewer fViewer;

	private IStructuredSelection selected;

	// sizing constants
	private final static int SIZING_SELECTION_WIDGET_HEIGHT = 300;
	private final static int SIZING_SELECTION_WIDGET_WIDTH = 500;

	protected FileSelectionDialog(Shell parentShell) {
		super(parentShell);
		setTitle("Select Container");
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);

		initializeDialogUnits(composite);
		Composite result = new Composite(composite, SWT.NONE);
		result.setLayout(new GridLayout());

		fViewer = createViewer(result);
		GridData data = new GridData(GridData.FILL_BOTH);
		data.heightHint = SIZING_SELECTION_WIDGET_HEIGHT;
		data.widthHint = SIZING_SELECTION_WIDGET_WIDTH;
		result.setLayoutData(data);
		fViewer.getControl().setLayoutData(data);

		StructuredSelection initialSelection = (StructuredSelection) getInitialElementSelections().get(0);
		fViewer.setSelection(initialSelection);
		fViewer.setExpandedElements(new Object[] { initialSelection.getFirstElement() });
		fViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				viewerSelectionChanged(event);
			}
		});
		Dialog.applyDialogFont(result);

		return composite;
	}

	private TreeViewer createViewer(Composite parent) {
		TreeViewer treeViewer = new TreeViewer(parent, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.widthHint = convertWidthInCharsToPixels(40);
		gd.heightHint = convertHeightInCharsToPixels(15);
		treeViewer.getTree().setLayoutData(gd);
		treeViewer.setLabelProvider(new FileSystemLabelProvider());
		treeViewer.setContentProvider(new FileSystemContentProvider());
		//treeViewer.setComparator(new JavaElementComparator());
		treeViewer.setInput(WorkspaceManager.INSTANCE.getRootFoler());
		return treeViewer;
	}

	private void viewerSelectionChanged(SelectionChangedEvent event) {
		ISelection selection = event.getSelection();
		if (!(selection instanceof IStructuredSelection)) {
			return;
		}
		selected = (IStructuredSelection) selection;
	}

	protected TreeViewer getTreeViewer() {
		return fViewer;
	}

	private ISelection getSelection() {
		if (fViewer == null) {
			return StructuredSelection.EMPTY;
		}
		return selected;
	}

	public IPath getWorkflowFilePath() {
		IPath fullPath = null;
		StructuredSelection result = (StructuredSelection) getSelection();
		if (result != null) {
			Object firstElement = result.getFirstElement();

		}
		return fullPath;
	}
}