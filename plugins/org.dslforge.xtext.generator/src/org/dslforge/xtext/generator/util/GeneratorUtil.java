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
package org.dslforge.xtext.generator.util;

import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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
public class GeneratorUtil {

	public static final String PLUGIN_SUFFIX = "web";

	public static String getProjectName(Grammar grammar) {
		return getDslProjectName(grammar) + "." + PLUGIN_SUFFIX;
	}

	public static String getDslProjectName(Grammar grammar) {
		URI uri = EcoreUtil.getURI(grammar).trimFragment();
		String projectName = uri.segment(1);
		return projectName;
	}
	
	public static String getBasePath(Grammar grammar) {
		String[] split = getDslProjectName(grammar).split("\\.");
		String path = split[0];
		for (int i = 1; i < split.length/*-1*/; i++) {
			path += "/" + split[i];
		}
		return path+"/"+PLUGIN_SUFFIX;
	}

	public static String getGrammarShortName(Grammar grammar) {
		String[] split = grammar.getName().split("\\.");
		if (split.length<1)
			throw new UnsupportedOperationException("GENERATOR ERROR: gramar qualified name split length should exceed 1." );
		return split[split.length-1];
	}

	public static String getFileExtension(Grammar grammar) {
		URI uri = EcoreUtil.getURI(grammar).trimFragment();
		URI tailSegment = uri.trimSegments(1);
		URI workflowFileURI = tailSegment.appendSegment("Generate" + getGrammarShortName(grammar) + ".mwe2");
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource =null;
		try {
			resource = resourceSet.getResource(workflowFileURI, true);
		} catch(Exception ex) {
			if (resource==null) {
				workflowFileURI = tailSegment.appendSegment(getGrammarShortName(grammar) + ".mwe2");
				resource = resourceSet.getResource(workflowFileURI, true);
			}
		}
		Module m = (Module) resource.getContents().get(0);
		EList<DeclaredProperty> declaredProperties = m.getDeclaredProperties();
		for (DeclaredProperty p : declaredProperties) {
			String name = p.getName();
			if (name.equals("fileExtensions")) {
				Value v = p.getDefault();
				if (v instanceof StringLiteral) {
					StringPart stringPart = ((StringLiteral)v).getParts().get(0);
					if (stringPart!=null) {
						String extension = ((PlainString)stringPart).getValue();
						return extension;
					}
				}
			}
		}
		throw new UnsupportedOperationException("[DSLFORGE] Could not localize file extensions." );
	}

	public static String getKeywords(Grammar grammar, String separator, boolean quoted) {
		Set<String> allKeywords = GrammarUtil.getAllKeywords(grammar);
		String result = "";
		String quote = quoted?"'":"";
		for (String key : allKeywords) {
			if (key.length()>1)
				result = result + separator + quote + key + quote;
		}
		//remove first separator
		result = result.substring(1, result.length());
		return result;
	}
	
	public static String getMetamodelPackage(Grammar grammar) {
		String grammarName = grammar.getName();
		String[] split = grammarName.split("\\.");
		String path = split[0];
		for (int i = 1; i < split.length/*-1*/; i++) {
			path += "." + toFirstLower(split[i]);
		}
		return path;
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

	public static String getEntryRule(Grammar grammar) {
		EList<AbstractRule> rules = grammar.getRules();
		for (AbstractRule r: rules) {
			if (r instanceof ParserRule) {
				ParserRule pr = (ParserRule) r;
				if (rules.get(0).equals(pr))
					return pr.getName();
			}
		}
	  throw new UnsupportedOperationException("[DSLFORGE] Could not find entry rule in current grammar");
	}
}
