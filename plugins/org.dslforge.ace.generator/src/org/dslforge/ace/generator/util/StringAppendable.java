/**
 * <copyright>
 *
 * Copyright (c) 2016 PlugBee. All rights reserved.
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
package org.dslforge.ace.generator.util;

public class StringAppendable implements IAppendable, CharSequence {

	private final String lineSeparator;
	private StringBuilder builder;
	
	public StringAppendable(String indentation, String lineSeparator) {
		this.lineSeparator = lineSeparator;
		this.builder = new StringBuilder(8*1024);
	}

	public IAppendable append(CharSequence content) {
		this.builder = builder.append(content);
		return this;
	}


	public IAppendable newLine() {
		this.builder = this.builder.append(lineSeparator);
		return this;
	}

	public char charAt(int index) {
		return toString().charAt(index);
	}

	public int length() {
		return toString().length();
	}

	public CharSequence subSequence(int start, int end) {
		return toString().subSequence(start, end);
	}
	
	public String getContent(){
		return this.builder.toString();
	}
}