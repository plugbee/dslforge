package org.eclipse.rap.incubator.texteditor.actions;

import org.eclipse.rap.incubator.styledtext.BasicText;
import org.eclipse.rap.incubator.styledtext.IBasicTextEditor;
import org.eclipse.rap.incubator.styledtext.ITextSelection;
import org.eclipse.rap.incubator.styledtext.TextSelection;
import org.eclipse.rap.incubator.styledtext.TextSelectionListenerAction;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.actions.ActionFactory;

public class CopyAction extends TextSelectionListenerAction {

	private static final long serialVersionUID = 1L;
	private IBasicTextEditor activeEditor;

	public CopyAction(String text) {
		super(text);
	}
	
	@Override
	public String getId() {
		return ActionFactory.COPY.getId();
	}
	
	@Override
	public void run() {
		if (activeEditor != null) {

			// FIXME: To copy text from editor, call editor.getCopyText() after
			// selecting the content to copy.

			BasicText widget = activeEditor.getWidget();
			TextSelection selection = widget.getSelection();
			activeEditor.performCopy(selection);
		}
	}
	
	@Override
	public boolean updateSelection(ITextSelection selection) {
		// TODO Auto-generated method stub
		return super.updateSelection(selection);
	}

	public void setActiveWorkbenchPart(IEditorPart activeEditor) {
		if (activeEditor instanceof IBasicTextEditor)
			this.activeEditor = (IBasicTextEditor) activeEditor;
	}

}
