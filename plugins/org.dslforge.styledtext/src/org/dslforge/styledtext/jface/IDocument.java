/*******************************************************************************
 * Copyright (c) 2000, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.dslforge.styledtext.jface;

public interface IDocument {

	/**
	 * Returns the character at the given document offset in this document.
	 *
	 * @param offset a document offset
	 * @return the character at the offset
	 * @exception BadLocationException if the offset is invalid in this document
	 */
	char getChar(int offset) throws BadLocationException;

	/**
	 * Returns the number of characters in this document.
	 *
	 * @return the number of characters in this document
	 */
	int getLength();

	/**
	 * Returns this document's complete text.
	 *
	 * @return the document's complete text
	 */
	String get();

	/**
	 * Returns this document's text for the specified range.
	 *
	 * @param offset the document offset
	 * @param length the length of the specified range
	 * @return the document's text for the specified range
	 * @exception BadLocationException if the range is invalid in this document
	 */
	String get(int offset, int length) throws BadLocationException;

	/**
	 * Replaces the content of the document with the given text.
	 * Sends a <code>DocumentEvent</code> to all registered <code>IDocumentListener</code>.
	 * This method is a convenience method for <code>replace(0, getLength(), text)</code>.
	 *
	 * @param text the new content of the document
	 *
	 * @see DocumentEvent
	 * @see IDocumentListener
	 */
	void set(String text);

	/**
	 * Substitutes the given text for the specified document range.
	 * Sends a <code>DocumentEvent</code> to all registered <code>IDocumentListener</code>.
	 *
	 * @param offset the document offset
	 * @param length the length of the specified range
	 * @param text the substitution text
	 * @exception BadLocationException if the offset is invalid in this document
	 *
	 * @see DocumentEvent
	 * @see IDocumentListener
	 */
	void replace(int offset, int length, String text) throws BadLocationException;

	/**
	 * Returns the length of the given line including the line's delimiter.
	 *
	 * @param line the line of interest
	 * @return the length of the line
	 * @exception BadLocationException if the line number is invalid in this document
	 */
	int getLineLength(int line) throws BadLocationException;

	/**
	 * Returns the number of the line at which the character of the specified position is located.
	 * The first line has the line number 0. A new line starts directly after a line
	 * delimiter. <code>(offset == document length)</code> is a valid argument although there is no
	 * corresponding character.
	 *
	 * @param offset the document offset
	 * @return the number of the line
	 * @exception BadLocationException if the offset is invalid in this document
	 */
	int getLineOfOffset(int offset) throws BadLocationException;

	/**
	 * Determines the offset of the first character of the given line.
	 *
	 * @param line the line of interest
	 * @return the document offset
	 * @exception BadLocationException if the line number is invalid in this document
	 */
	int getLineOffset(int line) throws BadLocationException;

	/**
	 * Returns the number of lines in this document
	 *
	 * @return the number of lines in this document
	 */
	int getNumberOfLines();

	/**
	 * Returns the number of lines which are occupied by a given text range.
	 *
	 * @param offset the offset of the specified text range
	 * @param length the length of the specified text range
	 * @return the number of lines occupied by the specified range
	 * @exception BadLocationException if specified range is invalid in this tracker
	 */
	int getNumberOfLines(int offset, int length) throws BadLocationException;

	/**
	 * Computes the number of lines in the given text. For a given
	 * implementer of this interface this method returns the same
	 * result as <code>set(text); getNumberOfLines()</code>.
	 *
	 * @param text the text whose number of lines should be computed
	 * @return the number of lines in the given text
	 */
	int computeNumberOfLines(String text);

	/**
	 * Returns the document's legal line delimiters.
	 *
	 * @return the document's legal line delimiters
	 */
	String[] getLegalLineDelimiters();

	/**
	 * Returns the line delimiter of that line or <code>null</code> if the
     * line is not closed with a line delimiter.
	 *
	 * @param line the line of interest
     * @return the line's delimiter or <code>null</code> if line does not have a delimiter
	 * @exception BadLocationException if the line number is invalid in this document
	 */
	String getLineDelimiter(int line) throws BadLocationException;
}