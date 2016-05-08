package org.dslforge.xtext.generator.util;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
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
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.dslforge.common.IWebProjectFactory;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

public class GeneratorUtil {

	static final Logger logger = Logger.getLogger(GeneratorUtil.class);

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
		for (int i = 1; i < split.length; i++) {
			path += "/" + split[i];
		}
		return path + "/" + PLUGIN_SUFFIX;
	}

	public static String getGrammarShortName(Grammar grammar) {
		String[] split = grammar.getName().split("\\.");
		Assert.isTrue(split.length >= 1);
		return split[split.length - 1];
	}

	public static String getFileExtension(Grammar grammar) {
		URI uri = EcoreUtil.getURI(grammar).trimFragment();
		URI tailSegment = uri.trimSegments(1);
		URI workflowFileURI = tailSegment.appendSegment("Generate" + getGrammarShortName(grammar) + ".mwe2");
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = null;
		try {
			resource = resourceSet.getResource(workflowFileURI, true);
		} catch (Exception ex) {
			if (resource == null) {
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
					StringPart stringPart = ((StringLiteral) v).getParts().get(0);
					if (stringPart != null) {
						String extension = ((PlainString) stringPart).getValue();
						return extension;
					}
				}
			}
		}
		throw new UnsupportedOperationException("[DSLFORGE] Could not localize file extensions.");
	}

	public static String getKeywords(Grammar grammar, String separator, boolean quoted) {
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

	public static String getMetamodelPackage(Grammar grammar) {
		String grammarName = grammar.getName();
		String[] split = grammarName.split("\\.");
		String path = split[0];
		for (int i = 1; i < split.length; i++) {
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
		for (AbstractRule r : rules) {
			if (r instanceof ParserRule) {
				ParserRule pr = (ParserRule) r;
				if (rules.get(0).equals(pr))
					return pr.getName();
			}
		}
		throw new UnsupportedOperationException("[DSLFORGE] Could not find entry rule in current grammar");
	}

	public static String getVersionNumber(IProject project) {
		IFolder container = project.getFolder(new Path("META-INF"));
		String version = "";
		byte[] data;
		try {
			data = readFile(container, "MANIFEST.MF");
			String content = new String(data);
			Pattern versionNumberPattern = Pattern.compile("Bundle-Version: (.+)", Pattern.MULTILINE);
			Matcher m = versionNumberPattern.matcher(content);
			if (m.find()) {
				version = m.group(1);
			}
		} catch (FileNotFoundException ex) {
			logger.error(ex.getMessage(), ex);
		} catch (IOException ex) {
			logger.error(ex.getMessage(), ex);
		}
		return version.replace(".qualifier", "") + "-SNAPSHOT";
	}

	public static Grammar loadGrammar(IFile file, Injector injector) {
		IPath filePath = file.getFullPath();
		URI uri = URI.createPlatformResourceURI(filePath.toString(), false);
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		Resource resource = resourceSet.getResource(uri, true);
		EObject root = resource.getContents().get(0);
		return (Grammar) root;
	}

	public static Grammar loadXtextGrammar(IFile file) {
		Injector xtextInjector = new XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet instance = xtextInjector.getInstance(XtextResourceSet.class);
		String path = computeResourcePath(file);
		Resource resource = instance.getResource(URI.createPlatformResourceURI(path, true), true);
		EObject eObject = resource.getContents().get(0);
		return (Grammar) eObject;
	}

	private static String computeResourcePath(final IFile file) {
		final IProject project = file.getProject();
		if (project.exists()) {
			try {
				if (project.hasNature(IWebProjectFactory.XTEXT_NATURE_ID)) {
					return computeResourcePathFromXtextPlugin(file);
				} else if (project.hasNature(IWebProjectFactory.DSLFORGE_ANTLR_PROJECT_NATURE)) {
					return computeResourcePathFromWebPlugin(file);
				}
			} catch (CoreException ex) {
				logger.error(ex.getMessage(), ex);
			}
		}
		throw new RuntimeException("could not find plugin.xml file of project: " + project.getName());
	}

	private static String computeResourcePathFromXtextPlugin(final IFile file) {
		return file.getFullPath().toString();
	}

	private static String computeResourcePathFromWebPlugin(final IFile file) {
		IFile pluginXml =  file.getProject().getFile("plugin.xml");
		if (pluginXml.exists()) {
			try {
				byte[] data = readFile(file.getProject(), "plugin.xml");
				String content = new String(data);
				Pattern p = Pattern.compile("</extension>", Pattern.MULTILINE);
				Matcher m = p.matcher(content);
				int index = 0;
				StringBuffer buffer = null;
				while (m.find()) {
					String current = content.substring(index, m.start());
					if (current.contains("org.dslforge.xtext.common.contribution")) {
						buffer = new StringBuffer(current).append("</extension>");
						break;
					}
					index = m.end();
				}
				if (buffer == null)
					throw new RuntimeException("Could not localize model reuse extension of deleted resource: ");

				Pattern p2 = Pattern.compile("path=\"(.+)\"", Pattern.MULTILINE);
				Matcher m2 = p2.matcher(buffer);
				if (m2.find()) {
					return m2.group(1);
				}
			} catch (FileNotFoundException e) {
				logger.error(e.getMessage(), e);
			} catch (IOException e) {
				logger.error(e.getMessage(), e);
			}
		}
		return null;
	}

	public static byte[] readFile(IContainer container, String fileName) throws FileNotFoundException, IOException {
		IPath location = container.getLocation();
		IPath filePath = location.append("/" + fileName);
		File file = filePath.toFile();
		long size = (long) file.length();
		if (size > 0) {
			byte buff[] = new byte[(int) size];
			FileInputStream fis = new FileInputStream(file);
			DataInputStream dis = new DataInputStream(fis);
			dis.readFully(buff);
			dis.close();
			return buff;
		} else {
			throw new RuntimeException("could not find plugin.xml file in: " + container.getName());
		}
	}

	public static String getFileContent(InputStream fis) {
		StringBuilder sb = new StringBuilder();
		Reader r;
		try {
			if (fis instanceof FileInputStream) {
				r = new InputStreamReader(fis, "UTF-8");
				int ch = r.read();
				while (ch >= 0) {
					sb.append(ch);
					ch = r.read();
				}
			}
		} catch (UnsupportedEncodingException e) {
			logger.error(e.getMessage(), e);
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}
		return sb.toString();
	}
}
