/*******************************************************************************
 * Copyright (c) 2000, 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.dslforge.styledtext.jface;

import org.dslforge.styledtext.BasicText;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;

/**
 * A text viewer connects a text widget with a document.
 */
public interface ITextViewer {

	/**
	 * Returns this viewer's SWT control, <code>null</code> if the control is disposed.
	 *
	 * @return the SWT control or <code>null</code>
	 */
	BasicText getTextWidget();

	/**
	 * Sets the given document as the text viewer's model and updates the
	 * presentation accordingly.
	 *
	 * @param document the viewer's new input document <code>null</code> if none
	 */
	void setDocument(IDocument document);

	/**
	 * Set the text viewer's text content.
	 * 
	 * @param text the text to set
	 */
	public void setText(String text);

	/**
	 * Returns the text viewer's input document.
	 *
	 * @return the viewer's input document or <code>null</code> if none
	 */
	IDocument getDocument();

	/**
	 * Sets the editable state.
	 *
	 * @param editable the editable state
	 */
	void setEditable(boolean editable);

	/**
	 * Returns whether the shown text can be manipulated.
	 *
	 * @return the viewer's editable state
	 */
	boolean isEditable();

	/**
	 * Returns a selection provider dedicated to this viewer. Subsequent
	 * calls to this method return always the same selection provider.
	 *
	 * @return this viewer's selection provider
	 */
	ISelectionProvider getSelectionProvider();

	/**
	 * Selects the text delimited by the textSelection
	 * 
	 * @param textSelection
	 */
	void setSelection(ISelection textSelection);
}