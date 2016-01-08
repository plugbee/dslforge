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
package org.dslforge.styledtext;

import org.eclipse.jface.viewers.ISelection;

public interface ITextSelection extends ISelection {

	/**
	 * Returns the row start of the selected text.
	 */
	int getRowStart();

	/**
	 * Returns the length of the selected text.
	 */
	int getLength();

	/**
	 * Returns the row end of the selected text.
	 */
	int getRowEnd();

	/**
	 * Returns the column start of the selected text.
	 */
	int getColumnStart();
	
	/**
	 * Returns the column end of the selected text.
	 */
	int getColumnEnd();

	/**
	 * Returns the selected text.
	 * If the underlying text has been changed between the creation of this
	 * selection object and the call of this method, the value returned might
	 * differ from what it would have been at the point of creation.
	 *
	 * @return the selected text or <code>null</code> if there is no valid text information
	 */
	String getText();

	int getOffset();
}

