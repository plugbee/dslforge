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
import org.eclipse.rap.json.JsonValue;

/**
 * ACE Editor Annotation, for example:
 * annotations.push({row:Math.max(positions[0]-1,0) ,column: 0, text:
 * annotation[key], type:"error", server: true});
 */
public class Annotation {
	final AceSeverity type;
	final int row;
	final int column;
	final String text;

	public Annotation(AceSeverity type, int row, int column, String text) {
		this.type = type;
		this.row = row;
		this.column = column;
		this.text = text;
	}

	public JsonValue getValue() {
		JsonObject jsIssue = new JsonObject();
		jsIssue.add(type.name(), row + ":" + text);
		return jsIssue;
	}
	
	public enum AceSeverity {
		ERROR, 
		INFO, 
		WARNING,
	}

}
