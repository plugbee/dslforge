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

import org.eclipse.rap.json.JsonObject;

public class TextSelection implements ITextSelection {

	int startRow;
	int endRow;
	int startColumn;
	int endColumn;
	String selectedText;
	
    /**
     * The canonical empty selection. This selection should be used instead of
     * <code>null</code>.
     */
    public static final TextSelection EMPTY = new TextSelection();
    
	/**
	 * Creates an empty text selection.
	 */
    TextSelection() {
    	startRow= -1;
    	endRow= -1;
    	startColumn = -1;
    	endColumn = -1;
    	selectedText= "";
	}
	
	/**
	 * Creates a text selection for the given range. This
	 * selection object describes generically a text range and
	 * is intended to be an argument for the <code>setSelection</code>
	 * method of selection providers.
	 *
	 * @param offset the offset of the range, must not be negative
	 * @param length the length of the range, must not be negative
	 */
	public TextSelection(String text, int startRow, int endRow, int startColumn, int endColumn) {
		this.startRow = startRow;
		this.endRow = endRow;
		this.startColumn = startColumn;
		this.endColumn = endColumn;
		this.selectedText =text;
	}
	
	public TextSelection(String text) {
		this();
		this.selectedText= text;
	}

	@Override
	public boolean isEmpty() {
		return this == null || startRow < 0 || startColumn < 0;
	}


	@Override
	public String getText() {
		return selectedText;
	}
	
	public JsonObject getValue() {	
		JsonObject properties = new JsonObject();
		properties.add("startRow", startRow);
		properties.add("endRow", endRow);
		properties.add("startColumn", startColumn);
		properties.add("endColumn", endColumn);
		return properties;
	}

	@Override
	public int getRowStart() {
		return startRow;
	}

	@Override
	public int getRowEnd() {
		return endRow;
	}

	@Override
	public int getColumnStart() {
		return startColumn;
	}

	@Override
	public int getColumnEnd() {
		return endColumn;
	}

	@Override
	public int getLength() {
		return 0;
	}
}
