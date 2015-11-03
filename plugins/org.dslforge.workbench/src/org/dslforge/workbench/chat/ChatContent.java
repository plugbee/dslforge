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
package org.dslforge.workbench.chat;

import java.util.Date;


public final class ChatContent {

	private static ChatContent content;
	
	private StringBuilder sb = new StringBuilder();
	
	public void insert(String text) {
		sb.insert(0, text);
	}

	@Override
	public String toString() {
		return sb.toString();
	}
	
	public void setBuffer(StringBuilder sb) {
		this.sb = sb;
	}

	public long lastChanged = new Date().getTime();

	public static synchronized ChatContent getInstance() {
		if (content != null) {
			return content;
		} else {
			content = new ChatContent();
			return content;
		}
	}

	public void updateLastChanged() {
		lastChanged = new Date().getTime();
	}
}
