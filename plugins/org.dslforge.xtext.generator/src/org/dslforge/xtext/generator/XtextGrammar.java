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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.dslforge.common.IGrammar;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe2.language.mwe2.Assignment;
import org.eclipse.emf.mwe2.language.mwe2.Component;
import org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.mwe2.PlainString;
import org.eclipse.emf.mwe2.language.mwe2.StringLiteral;
import org.eclipse.emf.mwe2.language.mwe2.StringPart;
import org.eclipse.emf.mwe2.language.mwe2.Value;
import org.eclipse.emf.mwe2.language.mwe2.impl.ComponentImplCustom;
import org.eclipse.emf.mwe2.language.resource.MweResourceSetProvider;
import org.eclipse.emf.mwe2.language.scoping.Mwe2ScopeProvider;
import org.eclipse.emf.mwe2.language.ui.internal.Mwe2Activator;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;

import com.google.inject.Injector;

public class XtextGrammar implements IGrammar {

	public static final String PLUGIN_SUFFIX = "web";
	private final Grammar grammar;
	private final Resource workflow;

	public XtextGrammar(Grammar grammar) {
		this.grammar = grammar;
		this.workflow = loadWorkflowResource();
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
		return lookupFileExtension(m);
	}

	private String lookupFileExtension(Module m) {
		Injector injector = Mwe2Activator.getInstance().getInjector("org.eclipse.emf.mwe2.language.Mwe2");
		Mwe2ScopeProvider scopeProvider = (Mwe2ScopeProvider) injector.getInstance(IScopeProvider.class);
		IQualifiedNameConverter qualifiedNameConverter = injector.getInstance(IQualifiedNameConverter.class);
		ComponentImplCustom root = (ComponentImplCustom) m.getRoot();
		for (Assignment assignment : root.getAssignment()) {
			ComponentImplCustom value = (ComponentImplCustom) assignment.getValue();				
			IScope componentFeaturesScope = scopeProvider.createComponentFeaturesScope(value);
			for (IEObjectDescription description : componentFeaturesScope.getAllElements()) {
				String featureName = qualifiedNameConverter.toString(description.getName());
				if (featureName.equals("language")) {
					EList<Assignment> children = value.getAssignment();
					for (Assignment child: children) {
						if(child.getValue() instanceof Component) {
							Component childValue = (Component) child.getValue() ;
							IScope childComponentFeaturesScope = scopeProvider.createComponentFeaturesScope(childValue);
							for (IEObjectDescription desc : childComponentFeaturesScope.getAllElements()) {
								if ((qualifiedNameConverter.toString(desc.getName())).equals("fileExtensions")) {
									ICompositeNode languageNode = NodeModelUtils.findActualNodeFor(childValue);
									Pattern fileExtensionPattern = Pattern.compile("fileExtensions(.+)", Pattern.MULTILINE);
									Matcher match = fileExtensionPattern.matcher(languageNode.getText());
									if (match.find()) {
										return match.group(1).replaceAll("=", "").replaceAll("\"", "").trim();
									}
								}
							}	
						}
					}
				}
			}
		}
		throw new UnsupportedOperationException("[DSLFORGE] Could not localize file extensions.");
	}

	private Resource loadWorkflowResource() {
		Injector injector = Mwe2Activator.getInstance().getInjector("org.eclipse.emf.mwe2.language.Mwe2");
		MweResourceSetProvider casted = injector.getInstance(MweResourceSetProvider.class);
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(getDslProjectName());
		IJavaProject javaProject = JavaCore.create(project);
		XtextResourceSet mwe2ResourceSet = casted.get();
		mwe2ResourceSet.setClasspathURIContext(javaProject);
		URI uri = EcoreUtil.getURI(grammar).trimFragment();
		URI workflowFileURI = uri.trimSegments(1).appendSegment("Generate" + getShortName() + ".mwe2");
		Resource resource = null;
		try {
			resource = mwe2ResourceSet.getResource(workflowFileURI, true);
		} catch (Exception ex) {
			//fall back.
		} finally {
			if (resource == null) {
				workflowFileURI = uri.trimSegments(1).appendSegment(getShortName() + ".mwe2");
				resource = mwe2ResourceSet.getResource(workflowFileURI, true);
			}
		}
		return resource;
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