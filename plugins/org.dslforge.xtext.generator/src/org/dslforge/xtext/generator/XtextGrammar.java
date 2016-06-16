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
package org.dslforge.xtext.generator;

import java.util.Set;

import org.dslforge.common.IGrammar;
import org.dslforge.xtext.generator.util.GeneratorUtil;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.mwe2.PlainString;
import org.eclipse.emf.mwe2.language.mwe2.StringLiteral;
import org.eclipse.emf.mwe2.language.mwe2.StringPart;
import org.eclipse.emf.mwe2.language.mwe2.Value;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.ParserRule;

public class XtextGrammar implements IGrammar {

	public static final String PLUGIN_SUFFIX = "web";
	private final Grammar grammar;
	private final Resource workflow;

	public XtextGrammar(Grammar grammar) {
		this.grammar = grammar;
		this.workflow = GeneratorUtil.loadWorkflowResource(this.grammar);
	}

	public Grammar getGrammar() {
		return this.grammar;
	}

	@Override
	public String getShortName() {
		String[] split = grammar.getName().split("\\.");
		Assert.isTrue(split.length >= 1);
		return split[split.length - 1];
	}

	@Override
	public String getName() {
		return grammar.getName();
	}

	@Override
	public String getFileExtension() {
		String extension = null;
		Module m = (Module) workflow.getContents().get(0);
		EcoreUtil.resolveAll(m);
		EList<DeclaredProperty> declaredProperties = m.getDeclaredProperties();
		for (DeclaredProperty p : declaredProperties) {
			String name = p.getName();
			if (name.equals("fileExtensions")) {
				//Xtext 2.8.x
				Value v = p.getDefault();
				if (v instanceof StringLiteral) {
					StringPart stringPart = ((StringLiteral) v).getParts().get(0);
					if (stringPart != null) {
						extension = ((PlainString) stringPart).getValue();
						return extension;
					}
				}
			}
		}
		// Xtext 2.10		
		return GeneratorUtil.lookupFileExtension(m);
	}



	@Override
	public Set<String> getKeywords() {
		return GrammarUtil.getAllKeywords(grammar);
	}

	public String getKeywords(String separator, boolean quoted) {
		Set<String> allKeywords = GrammarUtil.getAllKeywords(grammar);
		String result = "";
		String quote = quoted ? "'" : "";
		for (String key : allKeywords) {
			if (key.length() > 1)
				result = result + separator + quote + key + quote;
		}
		// remove first separator
		if (allKeywords.size() >= 1)
			result = result.substring(1, result.length());
		return result;
	}

	public String getMetamodelPackage() {
		String grammarName = grammar.getName();
		String[] split = grammarName.split("\\.");
		String path = split[0];
		for (int i = 1; i < split.length; i++) {
			path += "." + toFirstLower(split[i]);
		}
		return path;
	}

	@Override
	public IPath getFullPath() {
		URI fileURI = grammar.eResource().getURI();
		return new Path(fileURI.toPlatformString(true));
	}

	public String toFirstLower(String s) {
		if (s == null || s.length() == 0)
			return s;
		if (Character.isLowerCase(s.charAt(0)))
			return s;
		if (s.length() == 1)
			return s.toLowerCase();
		return s.substring(0, 1).toLowerCase() + s.substring(1);
	}

	public String getEntryRule() {
		EList<AbstractRule> rules = grammar.getRules();
		for (AbstractRule r : rules) {
			if (r instanceof ParserRule) {
				ParserRule pr = (ParserRule) r;
				if (rules.get(0).equals(pr))
					return pr.getName();
			}
		}
		throw new UnsupportedOperationException("[DSLFORGE] Could not find entry rule in current grammar");
	}

	public String getBasePath() {
		String[] split = getDslProjectName().split("\\.");
		String path = split[0];
		for (int i = 1; i < split.length; i++) {
			path += "/" + split[i];
		}
		return path + "/" + PLUGIN_SUFFIX;
	}

	public String getProjectName() {
		return getDslProjectName() + "." + PLUGIN_SUFFIX;
	}

	public String getDslProjectName() {
		URI uri = EcoreUtil.getURI(grammar).trimFragment();
		String projectName = uri.segment(1);
		return projectName;
	}
}