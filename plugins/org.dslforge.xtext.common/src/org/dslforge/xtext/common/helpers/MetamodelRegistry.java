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
package org.dslforge.xtext.common.helpers;

import java.util.regex.Pattern;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class MetamodelRegistry {
	
	public static final String ECORE = "http://www.eclipse.org/emf/2002/Ecore";

	public static final Pattern NAMESPACE_PATTERN = Pattern.compile("http://www.dsllforge.com/language/(one|two)");
}
