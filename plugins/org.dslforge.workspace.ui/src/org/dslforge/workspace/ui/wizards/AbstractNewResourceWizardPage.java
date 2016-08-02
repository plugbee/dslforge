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
package org.dslforge.workspace.ui.wizards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.dslforge.workspace.WorkspaceManager;
import org.dslforge.workspace.ui.BasicWorkspaceFilter;
import org.dslforge.workspace.ui.FileSystemContentProvider;
import org.dslforge.workspace.ui.FileSystemLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

@SuppressWarnings("serial")
public abstract class AbstractNewResourceWizardPage extends WizardPage {

	// the final collection of selected elements, or null if this dialog was
	// canceled
	private Object[] result;

	// a collection of the initially-selected elements
	private List<IStructuredSelection> initialSelections = new ArrayList<IStructuredSelection>();

	private TreeViewer fViewer;

	public TreeViewer getContainerViewer() {
		return fViewer;
	}

	protected AbstractNewResourceWizardPage(String pageName) {
		super(pageName);
	}

	protected TreeViewer createViewer(Composite parent) {
		TreeViewer treeViewer = new TreeViewer(parent, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.widthHint = convertWidthInCharsToPixels(40);
		gd.heightHint = convertHeightInCharsToPixels(15);
		treeViewer.getTree().setLayoutData(gd);
		treeViewer.setLabelProvider(new FileSystemLabelProvider());
		treeViewer.setContentProvider(new FileSystemContentProvider());
		treeViewer.addFilter(new BasicWorkspaceFilter());
		treeViewer.setInput(WorkspaceManager.INSTANCE.getWorkspaceRootFolder());
		return treeViewer;
	}

	protected void createContainerArea(Composite composite) {
		Composite result = new Composite(composite, SWT.NONE);
		result.setLayout(new GridLayout());

		Label label = new Label(result, SWT.NONE);
		label.setText("&Select the parent folder:");

		fViewer = createViewer(result);
		GridData data = new GridData(GridData.FILL_BOTH);
		result.setLayoutData(data);
		fViewer.getControl().setLayoutData(data);

		StructuredSelection initialSelection = (StructuredSelection) getInitialElementSelections().get(0);
		getContainerViewer().setSelection(initialSelection);
		getContainerViewer().setExpandedElements(new Object[] { initialSelection.getFirstElement() });
		getContainerViewer().addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				viewerSelectionChanged(event);
			}
		});
	}

	protected void viewerSelectionChanged(SelectionChangedEvent event) {
		IStructuredSelection selection = (IStructuredSelection) event.getSelection();
		initialSelections = Collections.singletonList(selection);
	}

	/**
	 * Returns the list of initial element selections.
	 * 
	 * @return List
	 */
	protected List<IStructuredSelection> getInitialElementSelections() {
		return initialSelections;
	}

	/**
	 * Sets the initial selection in this selection dialog to the given
	 * elements.
	 * 
	 * @param selectedElements
	 *            the array of elements to select
	 */
	public void setInitialSelections(Object[] selectedElements) {
		initialSelections = new ArrayList<IStructuredSelection>(selectedElements.length);
		for (int i = 0; i < selectedElements.length; i++) {
			initialSelections.add((IStructuredSelection) selectedElements[i]);
		}
	}

	/**
	 * Sets the initial selection in this selection dialog to the given
	 * elements.
	 * 
	 * @param selectedElements
	 *            the List of elements to select
	 */
	public void setInitialElementSelections(List<IStructuredSelection> selectedElements) {
		initialSelections = selectedElements;
	}

	/**
	 * Set the selections made by the user, or <code>null</code> if the
	 * selection was canceled.
	 * 
	 * @param newResult
	 *            list of selected elements, or <code>null</code> if Cancel was
	 *            pressed
	 */
	protected void setResult(List<IStructuredSelection> newResult) {
		if (newResult == null) {
			result = null;
		} else {
			result = new Object[newResult.size()];
			newResult.toArray(result);
		}
	}

	/**
	 * Set the selections made by the user, or <code>null</code> if the
	 * selection was canceled.
	 * <p>
	 * The selections may accessed using <code>getResult</code>.
	 * </p>
	 * 
	 * @param newResult
	 *            - the new values
	 */
	protected void setSelectionResult(Object[] newResult) {
		result = newResult;
	}
}