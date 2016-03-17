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
package org.dslforge.texteditor;

import org.dslforge.styledtext.ITextSelection;
import org.dslforge.styledtext.TextSelection;
import org.dslforge.texteditor.actions.CopyAction;
import org.dslforge.texteditor.actions.CutAction;
import org.dslforge.texteditor.actions.DeleteAction;
import org.dslforge.texteditor.actions.PasteAction;
import org.dslforge.texteditor.actions.RedoAction;
import org.dslforge.texteditor.actions.UndoAction;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.part.EditorActionBarContributor;

public class BasicTextEditorContributor extends EditorActionBarContributor implements IPropertyListener {

	/**
	 * This keeps track of the current editor part.
	 */
	protected IEditorPart activeEditor;

	/**
	 * This is the action used to implement delete.
	 */
	protected DeleteAction deleteAction;

	/**
	 * This is the action used to implement cut.
	 */
	protected CutAction cutAction;

	/**
	 * This is the action used to implement copy.
	 */
	protected CopyAction copyAction;

	/**
	 * This is the action used to implement paste.
	 */
	protected PasteAction pasteAction;

	/**
	 * This is the action used to implement undo.
	 */
	protected UndoAction undoAction;

	/**
	 * This is the action used to implement redo.
	 */
	protected RedoAction redoAction;

	public BasicTextEditorContributor() {
	}

	public IEditorPart getActiveEditor() {
		return activeEditor;
	}

	@Override
	public void setActiveEditor(IEditorPart part) {
		super.setActiveEditor(part);
		if (part != activeEditor) {
			if (activeEditor != null) {
				deactivate();
			}
			if (part instanceof IBasicTextEditor) {
				activeEditor = part;
				activate();
			}
		}
	}

	@Override
	public void init(IActionBars actionBars) {
		super.init(actionBars);
		ISharedImages sharedImages = PlatformUI.getWorkbench().getSharedImages();
		copyAction = createCopyAction();
		copyAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_COPY));
		actionBars.setGlobalActionHandler(ActionFactory.COPY.getId(), copyAction);

		cutAction = createCutAction();
		cutAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_CUT));
		actionBars.setGlobalActionHandler(ActionFactory.CUT.getId(), cutAction);

		pasteAction = createPasteAction();
		pasteAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_PASTE));
		actionBars.setGlobalActionHandler(ActionFactory.PASTE.getId(), pasteAction);

		undoAction = createUndoAction();
		undoAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_UNDO));
		actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(), undoAction);

		redoAction = createRedoAction();
		redoAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_REDO));
		actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(), redoAction);

	}

	private CopyAction createCopyAction() {
		return new CopyAction("Copy");
	}

	private CutAction createCutAction() {
		return new CutAction("Cut");
	}

	private PasteAction createPasteAction() {
		return new PasteAction("Paste");
	}

	private RedoAction createRedoAction() {
		return new RedoAction("Redo");
	}

	private UndoAction createUndoAction() {
		return new UndoAction("Undo");
	}

	public void deactivate() {
		activeEditor.removePropertyListener(this);

		copyAction.setActiveWorkbenchPart(null);
		cutAction.setActiveWorkbenchPart(null);
		pasteAction.setActiveWorkbenchPart(null);
		undoAction.setActiveWorkbenchPart(null);
		redoAction.setActiveWorkbenchPart(null);

		ISelectionProvider selectionProvider = activeEditor instanceof ISelectionProvider
				? (ISelectionProvider) activeEditor : activeEditor.getEditorSite().getSelectionProvider();

		if (selectionProvider != null) {
			selectionProvider.removeSelectionChangedListener(copyAction);
			selectionProvider.removeSelectionChangedListener(pasteAction);
		}
	}

	public void activate() {
		activeEditor.addPropertyListener(this);
		copyAction.setActiveWorkbenchPart(activeEditor);
		cutAction.setActiveWorkbenchPart(activeEditor);
		pasteAction.setActiveWorkbenchPart(activeEditor);
		undoAction.setActiveWorkbenchPart(activeEditor);
		redoAction.setActiveWorkbenchPart(activeEditor);

		ISelectionProvider selectionProvider = activeEditor instanceof ISelectionProvider
				? (ISelectionProvider) activeEditor : activeEditor.getEditorSite().getSelectionProvider();

		if (selectionProvider != null) {
			selectionProvider.addSelectionChangedListener(copyAction);
			selectionProvider.addSelectionChangedListener(pasteAction);
		}

		update();
	}

	public void update() {
		ISelectionProvider selectionProvider = activeEditor instanceof ISelectionProvider
				? (ISelectionProvider) activeEditor : activeEditor.getEditorSite().getSelectionProvider();

		if (selectionProvider != null) {
			ISelection selection = selectionProvider.getSelection();
			ITextSelection structuredSelection = selection instanceof ITextSelection ? (ITextSelection) selection : TextSelection.emptySelection();
			copyAction.updateSelection(structuredSelection);
			pasteAction.updateSelection(structuredSelection);
		}

		undoAction.update();
		redoAction.update();

	}
	
	/**
	 * Returns the action registered with the given text editor.
	 *
	 * @param editor the editor, or <code>null</code>
	 * @param actionId the action id
	 * @return the action, or <code>null</code> if none
	 */
	protected final IAction getAction(BasicTextEditor editor, String actionId) {
		return (editor == null || actionId == null ? null : getAction(actionId));
	}

	private IAction getAction(String actionId) {
		if (actionId.equals(ActionFactory.COPY.getId()))
			return copyAction;
		if (actionId.equals(ActionFactory.CUT.getId()))
			return cutAction;
		if (actionId.equals(ActionFactory.PASTE.getId()))
			return pasteAction;
		if (actionId.equals(ActionFactory.UNDO.getId()))
			return undoAction;
		if (actionId.equals(ActionFactory.REDO.getId()))
			return redoAction;
		return null;
	}

	@Override
	public void propertyChanged(Object source, int propId) {
	}
}