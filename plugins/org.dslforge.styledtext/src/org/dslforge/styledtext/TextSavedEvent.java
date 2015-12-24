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

import org.eclipse.swt.events.*;
import org.eclipse.swt.widgets.Event;

/**
 * This event is sent by the StyledTextContent implementor when a save request
 * is sent from the client
 */
public class TextSavedEvent extends TypedEvent {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the TextSavedEvent to be used by the StyledTextContent
	 * implementor.
	 * <p>
	 *
	 * @param source
	 *            the object that will be sending the TextSavedEvent, cannot be
	 *            null
	 */
	public TextSavedEvent(Event source) {
		super(source);
	}
}
