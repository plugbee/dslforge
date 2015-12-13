package org.eclipse.rap.incubator.texteditor.actions;

import org.eclipse.rap.incubator.styledtext.IBasicTextEditor;
import org.eclipse.rap.incubator.styledtext.ITextSelection;
import org.eclipse.rap.incubator.styledtext.TextSelectionListenerAction;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.actions.ActionFactory;

public class DeleteAction extends TextSelectionListenerAction {

	private static final long serialVersionUID = 1L;
	private IBasicTextEditor activeEditor;

	public DeleteAction(String text) {
		super(text);
	}
	
	@Override
	public String getId() {
		return ActionFactory.DELETE.getId();
	}
	
	@Override
	public void run() {
		super.run();
	}
	
	@Override
	public boolean updateSelection(ITextSelection selection) {
		return super.updateSelection(selection);
	}

	public void setActiveWorkbenchPart(IEditorPart activeEditor) {
		if (activeEditor instanceof IBasicTextEditor)
			this.activeEditor = (IBasicTextEditor) activeEditor;
	}

}
