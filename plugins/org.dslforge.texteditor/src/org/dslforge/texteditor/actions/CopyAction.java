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
package org.dslforge.texteditor.actions;

import org.dslforge.styledtext.BasicText;
import org.dslforge.styledtext.IBasicTextEditor;
import org.dslforge.styledtext.ITextSelection;
import org.dslforge.styledtext.TextSelection;
import org.dslforge.styledtext.TextSelectionListenerAction;
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
