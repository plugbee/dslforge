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
package org.dslforge.xtext.common.jface;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.dslforge.styledtext.BasicText;
import org.eclipse.jface.viewers.ISelectionProvider;

/**
 * A text viewer connects a text widget with an
 * {@link org.dslforge.xtext.common.jface.text.IDocument}. The document is used as the
 * widget's text model.
 * 
 */
public interface ITextViewer {

	/**
	 * Returns this viewer's SWT control, <code>null</code> if the control is disposed.
	 * <p>
	 * <em>Calling API directly on the widget can interfere with features provided
	 * by a text viewer. Clients who call API directly on the widget are responsible
	 * to resolve such conflicts on their side.</em>
	 * </p>
	 *
	 * @return the SWT control or <code>null</code>
	 */
	BasicText getTextWidget();

	/**
	 * Sets the given document as the text viewer's model and updates the
	 * presentation accordingly. An appropriate <code>TextEvent</code> is
	 * issued. This text event does not carry a related document event.
	 *
	 * @param document the viewer's new input document <code>null</code> if none
	 */
	void setDocument(IDocument document);

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
	 * Sets the given document as this viewer's model and
	 * exposes the specified region. An appropriate
	 * <code>TextEvent</code> is issued. The text event does not carry a
	 * related document event. This method is a convenience method for
	 * <code>setDocument(document);setVisibleRegion(offset, length)</code>.
	 *
	 * @param document the new input document or <code>null</code> if none
	 * @param modelRangeOffset the offset of the model range
	 * @param modelRangeLength the length of the model range
	 */
	void setDocument(IDocument document, int modelRangeOffset, int modelRangeLength);

	/**
	 * Applies the given color as text foreground color to this viewer's
	 * selection.
	 *
	 * @param color the color to be applied
	 */
	void setTextColor(Color color);

	/**
	 * Sets the selection to the specified range.
	 *
	 * @param offset the offset of the selection range
	 * @param length the length of the selection range. A negative length places
	 *            the caret at the visual start of the selection.
	 */
	void setSelectedRange(int offset, int length);

	/**
	 * Returns the range of the current selection in coordinates of this viewer's document.
	 *
	 * @return a <code>Point</code> with x as the offset and y as the length of the current selection
	 */
	Point getSelectedRange();

	/**
	 * Returns a selection provider dedicated to this viewer. Subsequent
	 * calls to this method return always the same selection provider.
	 *
	 * @return this viewer's selection provider
	 */
	ISelectionProvider getSelectionProvider();

	/**
	 * Ensures that the given range is visible.
	 *
	 * @param offset the offset of the range to be revealed
	 * @param length the length of the range to be revealed
	 */
	void revealRange(int offset, int length);

	/**
	 * Scrolls the widget so that the given index is the line
	 * with the smallest line number of all visible lines.
	 *
	 * @param index the line which should become the top most line
	 */
	void setTopIndex(int index);

	/**
	 * Returns the visible line with the smallest line number.
	 *
	 * @return the number of the top most visible line
	 */
	int getTopIndex();

	/**
	 * Returns the document offset of the upper left corner of this viewer's view port.
	 *
	 * @return the upper left corner offset
	 */
	int getTopIndexStartOffset();

	/**
	 * Returns the visible line with the highest line number.
	 *
	 * @return the number of the bottom most line
	 */
	int getBottomIndex();

	/**
	 * Returns the document offset of the lower right
	 * corner of this viewer's view port. This is the visible character
	 * with the highest character position. If the content of this viewer
	 * is shorter, the position of the last character of the content is returned.
	 *
	 * @return the lower right corner offset
	 */
	int getBottomIndexEndOffset();

	/**
	 * Returns the vertical offset of the first visible line.
	 *
	 * @return the vertical offset of the first visible line
	 */
	int getTopInset();
}