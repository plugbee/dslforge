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
package org.dslforge.xtext.common.helpers;


public class FileExtension  {

	public static final String PRIMARY_EXTENSION = "one";
	
	public static final String SECONDARY_EXTENSION = "two";

	private static final String[] EXTENSIONS_ARRAY = new String [] { PRIMARY_EXTENSION, SECONDARY_EXTENSION };

	public static String getByName(String name) {
		for (int i = 0; i < EXTENSIONS_ARRAY.length; ++i) {
			String result = EXTENSIONS_ARRAY[i];
			if (result.equals(name)) {
				return result;
			}
		}
		return null;
	}
}