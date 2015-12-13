package org.eclipse.rap.incubator.texteditor;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.rap.incubator.styledtext.IBasicTextEditor;
import org.eclipse.rap.incubator.styledtext.ITextSelection;
import org.eclipse.rap.incubator.styledtext.TextSelection;
import org.eclipse.rap.incubator.texteditor.actions.CopyAction;
import org.eclipse.rap.incubator.texteditor.actions.CutAction;
import org.eclipse.rap.incubator.texteditor.actions.DeleteAction;
import org.eclipse.rap.incubator.texteditor.actions.PasteAction;
import org.eclipse.rap.incubator.texteditor.actions.RedoAction;
import org.eclipse.rap.incubator.texteditor.actions.UndoAction;
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
			ITextSelection structuredSelection = selection instanceof ITextSelection ? (ITextSelection) selection : TextSelection.EMPTY;
			copyAction.updateSelection(structuredSelection);
			pasteAction.updateSelection(structuredSelection);
		}

		undoAction.update();
		redoAction.update();

	}

	@Override
	public void propertyChanged(Object source, int propId) {
		System.out.println("property changed");
	}
}