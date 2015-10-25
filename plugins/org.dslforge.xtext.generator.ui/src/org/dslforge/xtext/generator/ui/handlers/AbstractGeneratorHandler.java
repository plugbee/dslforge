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
package org.dslforge.xtext.generator.ui.handlers;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import org.dslforge.xtext.generator.IWebProjectGenerator;
import org.dslforge.xtext.generator.setup.WebProjectGeneratorSetup;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.generator.IGenerator;

import com.google.inject.Injector;


public abstract class AbstractGeneratorHandler extends AbstractHandler {
	
	protected Injector xtextInjector;

	protected Injector generatorInjector;
	
	protected IWebProjectGenerator instance; 

	protected Grammar grammar;
	
	protected Map<String, String> outlets = newHashMap();

	public AbstractGeneratorHandler() {
	}

	protected Injector getXtextInjector() {
		if (xtextInjector == null)
			xtextInjector = new XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		return xtextInjector;
	}

	protected IGenerator getInstance() {
		if (generatorInjector==null)
			generatorInjector = new WebProjectGeneratorSetup().createInjectorAndDoEMFRegistration();
		return generatorInjector.getInstance(IWebProjectGenerator.class);
	}
	
	public void setGrammar(Grammar object) {
		this.grammar = object;
	}
	
	public Grammar getGrammar() {
		return this.grammar;
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		return null;
	}
}