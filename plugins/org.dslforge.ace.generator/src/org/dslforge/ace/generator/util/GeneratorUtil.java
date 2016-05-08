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

import java.util.Set;

import org.dslforge.common.IGrammar;

public class GeneratorUtil {

	public static String getKeywords(IGrammar grammar, String separator, boolean quoted) {
		Set<String> allKeywords = grammar.getKeywords();
		String result = "";
		String quote = quoted?"'":"";
		for (String key : allKeywords) {
			if (key.length()>1)
				result = result + separator + quote + key + quote;
		}
		//remove first separator
		if (allKeywords.size()>=1)
			result = result.substring(1, result.length());
		return result;
	}
	
	public static String toFirstLower(String s) {
		if (s == null || s.length() == 0)
			return s;
		if (Character.isLowerCase(s.charAt(0)))
			return s;
		if (s.length() == 1)
			return s.toLowerCase();
		return s.substring(0, 1).toLowerCase() + s.substring(1);
	}
}
