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

public class LanguageContribution implements ILanguageContribution {

	private String label;
	
	private String fileExtension;
	
	private String contributor;
	
	private Injector injector;
	
	private List<IGenerator> generators;
	
	public LanguageContribution(String label, String fileExtension, Injector injector, List<IGenerator> generators) {
		this.label = label;
		this.fileExtension = fileExtension;
		this.injector = injector;
		this.generators = generators;
	}

	@Override
	public String getFileExtension() {
		return fileExtension;
	}

	@Override
	public Injector getInjector() {
		return injector;
	}

	@Override
	public List<IGenerator> getGenerators() {
		return generators;
	}

	@Override
	public String getLabel() {
		return label;
	}

	@Override
	public String getContributor() {
		return contributor;
	}
}