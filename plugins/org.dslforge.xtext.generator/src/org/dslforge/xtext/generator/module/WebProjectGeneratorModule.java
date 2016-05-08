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
package org.dslforge.xtext.generator.module;

import org.dslforge.common.IWebProjectFactory;
import org.dslforge.xtext.generator.DynamicWebProjectFactory;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

public class WebProjectGeneratorModule extends AbstractGenericResourceRuntimeModule {

	@Override
	protected String getLanguageName() {
		return "org.eclipse.xtext.Xtext";
	}

	@Override
	protected String getFileExtensions() {
		return "xtext";
	}
	
	public Class<? extends IWebProjectFactory> bindWebProjectFactory() {
		return DynamicWebProjectFactory.class;
	}
}