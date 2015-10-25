/**
 * <copyright>
 *
 * Copyright (c) 2015 DSLFORGE. All rights reserved.
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
package org.dslforge.xtext.common.scoping;

import org.dslforge.xtext.common.BasicText;
import org.eclipse.rap.json.JsonObject;
import org.eclipse.rap.json.JsonValue;
import org.eclipse.rap.rwt.remote.AbstractOperationHandler;

public class BasicTextOperationHandler extends AbstractOperationHandler {

	private static final long serialVersionUID = -1969648842286086557L;

	private BasicText widget;
	
	public BasicTextOperationHandler(BasicText widget) {
		this.widget = widget;
	}
	
	@Override
	public void handleSet(JsonObject properties) {
		JsonValue textValue = properties.get("text");
		if (textValue != null) {
			widget.setText(textValue.asString());
		}
	}
}
