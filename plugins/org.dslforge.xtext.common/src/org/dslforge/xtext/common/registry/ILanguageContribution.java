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
package org.dslforge.xtext.common.registry;

import java.util.List;

import org.eclipse.xtext.generator.IGenerator;

import com.google.inject.Injector;

public interface ILanguageContribution {

	public String getContributor();
	
	public String getLabel();
	
	public String getFileExtension();
	
	public Injector getInjector();
	
	public List<IGenerator> getGenerators();
}
