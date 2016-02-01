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

public class TextRange {

	int rowStart;
	int columnStart;
	int rowEnd;
	int columnEnd;
	
	public TextRange(int rowStart, int columnStart, int rowEnd, int columnEnd) {
		this.rowStart = rowStart;
		this.columnStart = columnStart;
		this.rowEnd = rowEnd;
		this.columnEnd = columnEnd;
	}

	public JsonObject getValue() {	
		JsonObject properties = new JsonObject();
		properties.add("rowStart", rowStart);
		properties.add("rowEnd", rowEnd);
		properties.add("columnStart", columnStart);
		properties.add("columnEnd", columnEnd);	
		return properties;
	}
}
