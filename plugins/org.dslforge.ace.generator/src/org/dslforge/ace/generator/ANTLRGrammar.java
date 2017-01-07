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
 * </copyright>
 */
package org.dslforge.ace.generator;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.antlr.tool.Grammar;
import org.antlr.tool.Rule;
import org.dslforge.antlr.AntlrTool;
import org.dslforge.common.IGrammar;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;

public class ANTLRGrammar implements IGrammar {

	private final String shortName;
	private final IPath grammarPath;
	private Grammar grammar;

	public ANTLRGrammar(String shortName, IPath grammarPath) {
		this.shortName = shortName;
		this.grammarPath = grammarPath;
	}
	
	@Override
	public String getShortName() {
		return this.shortName;
	}

	@Override
	public Set<String> getKeywords() {
		Map<String, Integer> stringLiteralToTypeMap = getGrammar().composite.stringLiteralToTypeMap;
		Set<String> keySet = stringLiteralToTypeMap.keySet();
		Set<String> keywords = Sets.newHashSet(Iterables.transform(keySet, new Function<String, String>() {
			@Override
			public String apply(String input) {
				return input.substring(1, input.length() - 1);
			}
		}));
		return keywords;
	}

	@Override
	public IPath getFullPath() {
		return grammarPath;
	}

	@Override
	public String getFileExtension() {
		throw new UnsupportedOperationException("File extensions not supported in static web projects.");
	}

	@Override
	public String getName() {
		return getGrammar().name;
	}

	@Override
	public String getBasePath() {
		return "WebContent";
	}

	@Override
	public String getEntryRule() {
		Collection<Rule> rules = getGrammar().getRules();
		Rule entryRule = rules.iterator().next();
		if (entryRule != null)
			return entryRule.name;
		return "";
	}

	public Grammar getGrammar() {
		if (this.grammar == null)
			this.grammar = loadGrammarObject(grammarPath);
		return this.grammar;
	}

	private Grammar loadGrammarObject(IPath grammarPath) {
		IFile grammarFile = ResourcesPlugin.getWorkspace().getRoot().getFile(grammarPath);
		if (grammarFile.exists()) {
			String grammaFullPath = grammarFile.getLocation().toString();
			String workingDirectory = grammarFile.getParent().getLocation().toString();
			return AntlrTool.createGrammar(workingDirectory, grammaFullPath);
		}
		return null;
	}
}