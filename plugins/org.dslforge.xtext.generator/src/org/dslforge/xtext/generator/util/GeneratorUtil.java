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

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.dslforge.common.IWebProjectFactory;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe.utils.GenModelHelper;
import org.eclipse.emf.mwe2.language.mwe2.Assignment;
import org.eclipse.emf.mwe2.language.mwe2.Component;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.mwe2.impl.ComponentImplCustom;
import org.eclipse.emf.mwe2.language.resource.MweResourceSetProvider;
import org.eclipse.emf.mwe2.language.scoping.Mwe2ScopeProvider;
import org.eclipse.emf.mwe2.language.ui.internal.Mwe2Activator;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtext.AbstractMetamodelDeclaration;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.ReferencedMetamodel;
import org.eclipse.xtext.XtextPackage;
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.ecore.EcoreSupportStandaloneSetup;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsData;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;

import com.google.common.collect.Lists;
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
		throw new RuntimeException("Could not find entry rule in current grammar");
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
		instance.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		//register referenced ecore/genmodels
		List<String> referencedResources = new ArrayList<String>();
		//initialize instance
		String path = computeResourcePath(file);
		for (String referencedResourceURI: getReferencedResources(file)){
			referencedResources.add(referencedResourceURI);
		}
		initialize(instance, referencedResources);
		Resource resource = (XtextResource) instance.getResource(URI.createPlatformResourceURI(path, true), true);
		EObject eObject = resource.getContents().get(0);
		Grammar grammar = (Grammar) eObject;
		validateAllImports(grammar);
		return (Grammar) eObject;
	}

	public static void initialize(ResourceSet resourceSet, List<String> referencedResources) {
		for (String referencedResource : referencedResources) {
			URI loadedResourceUri = URI.createURI(referencedResource);
			ensureResourceCanBeLoaded(loadedResourceUri, resourceSet);
			resourceSet.getResource(loadedResourceUri, true);
		}
		registerGenModels(resourceSet);
		registerEPackages(resourceSet);
		installIndex(resourceSet);
		EcoreUtil.resolveAll(resourceSet);
	}
	
	private static void installIndex(ResourceSet resourceSet) {
		ResourceDescriptionsData index = new ResourceDescriptionsData(new ArrayList<IResourceDescription>());
		List<Resource> resources = Lists.newArrayList(resourceSet.getResources());
		for (Resource resource : resources) {
			index(resource, resource.getURI(), index);
		}
		ResourceDescriptionsData.ResourceSetAdapter.installResourceDescriptionsData(resourceSet, index);
	}

	private static void index(Resource resource, URI uri, ResourceDescriptionsData index) {
		IResourceServiceProvider serviceProvider = IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(uri);
		if (serviceProvider != null) {
			IResourceDescription resourceDescription = serviceProvider.getResourceDescriptionManager().getResourceDescription(resource);
			if (resourceDescription != null) {
				index.addDescription(uri, resourceDescription);
			}
		}
	}
	
	//copied from org.eclipse.xtext.xtext.generator.XtextGeneratorResourceSetInitializer
	private static void ensureResourceCanBeLoaded(URI loadedResource, ResourceSet resourceSet) {
		String fileExtension = loadedResource.fileExtension();
		if (fileExtension.equals("genmodel")) {
			GenModelPackage.eINSTANCE.getEFactoryInstance();
			IResourceServiceProvider resourceServiceProvider = IResourceServiceProvider.Registry.INSTANCE
					.getResourceServiceProvider(loadedResource);
			if (resourceServiceProvider == null) {
				try {
					Class<?> genModelSupport = Class.forName("org.eclipse.emf.codegen.ecore.xtext.GenModelSupport");
					Object instance = genModelSupport.newInstance();
					genModelSupport.getDeclaredMethod("createInjectorAndDoEMFRegistration").invoke(instance);
				} catch (ClassNotFoundException e) {
					logger.debug(
							"org.eclipse.emf.codegen.ecore.xtext.GenModelSupport not found, GenModels will not be indexed");
				} catch (Exception e) {
					logger.error("Couldn't initialize GenModel support.", e);
				}
			}
		} else if (fileExtension.equals("ecore")) {
			IResourceServiceProvider resourceServiceProvider = IResourceServiceProvider.Registry.INSTANCE
					.getResourceServiceProvider(loadedResource);
			if (resourceServiceProvider == null) {
				EcoreSupportStandaloneSetup.setup();
			}
		}
	}
	
	public static void registerGenModels(ResourceSet resourceSet) {
		for (int i=0; i<resourceSet.getResources().size(); i++) {
			Resource resource = resourceSet.getResources().get(i);
			EObject eObject = resource.getContents().get(0);
			if (eObject instanceof GenModel) {
				register((GenModel) eObject);	
			}
		}
	}

	public static void registerEPackages(ResourceSet resourceSet) {
		for (int i=0; i<resourceSet.getResources().size(); i++) {
			Resource resource = resourceSet.getResources().get(i);
			EObject eObject = resource.getContents().get(0);
			if (eObject instanceof EPackage) {
				register((EPackage)eObject, resourceSet);
			}
		}
	}

	public static void validateAllImports(Grammar grammar) {
		for (AbstractMetamodelDeclaration declaration : GrammarUtil.allMetamodelDeclarations(grammar)) {
			if (declaration instanceof ReferencedMetamodel)
				validateReferencedMetamodel((ReferencedMetamodel)declaration);
		}
	}

	private static List<String> getReferencedResources(IFile file) {
		String path = computeResourcePath(file);
		Injector xtextInjector = new XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet instance = xtextInjector.getInstance(XtextResourceSet.class);
		Resource resource = (XtextResource) instance.getResource(URI.createPlatformResourceURI(path, true), true);
		EObject eObject = resource.getContents().get(0);
		Grammar grammar = (Grammar) eObject;
		List<String> referencedResources = new ArrayList<String>();
		Resource workflow = loadWorkflowResource(grammar);
		if (workflow ==null)
			throw new RuntimeException("Could not locate the grammar workflow file.");
		Module m = (Module) workflow.getContents().get(0);
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
								if ((qualifiedNameConverter.toString(desc.getName())).equals("referencedResource")) {
									ICompositeNode languageNode = NodeModelUtils.findActualNodeFor(childValue);
									Pattern fileExtensionPattern = Pattern.compile("referencedResource(.+)", Pattern.MULTILINE);
									Matcher match = fileExtensionPattern.matcher(languageNode.getText());									
									while (match.find()) {
										referencedResources.add(match.group(1).replaceAll("=", "").replaceAll("\"", "").trim());
									}
								}
							}	
						}
					}
				}
			}
		}
		return referencedResources;
	}

	private static void validateReferencedMetamodel(ReferencedMetamodel ref) {
		if (ref.getEPackage() != null && !ref.getEPackage().eIsProxy()) {
			return;
		}
		EReference eref = XtextPackage.Literals.ABSTRACT_METAMODEL_DECLARATION__EPACKAGE;
		List<INode> nodes = NodeModelUtils.findNodesForFeature(ref, eref);
		String refName = (nodes.isEmpty()) ?"(unknown)": NodeModelUtils.getTokenText(nodes.get(0));
		String grammarName = GrammarUtil.getGrammar(ref).getName();
		String message = "The EPackage " + refName + " in grammar " + grammarName + " could not be found. "
			+ "You might want to register that EPackage in your workflow file.";
		throw new RuntimeException(message);
	}

	public static EPackage loadEPackage(String resourceOrNsURI, ResourceSet resourceSet) {
		if (resourceSet.getPackageRegistry().containsKey(resourceOrNsURI))
			return resourceSet.getPackageRegistry().getEPackage(resourceOrNsURI);
		URI uri = URI.createURI(resourceOrNsURI);
		try {
			if ("http".equalsIgnoreCase(uri.scheme()))
				return null;
			if (uri.fragment() == null) {
				Resource resource = resourceSet.getResource(uri, true);
				if (resource.getContents().isEmpty())
					return null;
				EPackage result = (EPackage) resource.getContents().get(0);
				return result;
			}
			EPackage result = (EPackage) resourceSet.getEObject(uri, true);
			return result;
		} catch (RuntimeException ex) {
			if (uri.isPlatformResource()) {
				String platformString = uri.toPlatformString(true);
				URI platformPluginURI = URI.createPlatformPluginURI(platformString, true);
				return loadEPackage(platformPluginURI.toString(), resourceSet);
			}
			return null;
		}
	}
	
	public static void register(EPackage ePackage, ResourceSet resourceSet) {
		Registry registry = resourceSet.getPackageRegistry();
		if (registry.get(ePackage.getNsURI()) == null) {
			registry.put(ePackage.getNsURI(), ePackage);
		}
	}
	
	public static void register(GenModel genModel) {
		new GenModelHelper().registerGenModel(genModel);
	}

	public static String lookupFileExtension(Module m) {
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
		throw new RuntimeException("Could not localize the gramar file extensions.");
	}

	public static Resource loadWorkflowResource(Grammar grammar) {
		Injector injector = Mwe2Activator.getInstance().getInjector("org.eclipse.emf.mwe2.language.Mwe2");
		MweResourceSetProvider casted = injector.getInstance(MweResourceSetProvider.class);
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(getDslProjectName(grammar));
		IJavaProject javaProject = JavaCore.create(project);
		XtextResourceSet mwe2ResourceSet = casted.get();
		mwe2ResourceSet.setClasspathURIContext(javaProject);
		URI uri = EcoreUtil.getURI(grammar).trimFragment();
		IFile grammarFile = uriToIFile(uri);		
		Resource resource = null;
		IContainer parent = grammarFile.getParent();
		File folder = parent.getLocation().toFile();
		File[] candidateWorkflowFiles = folder.listFiles(new FilenameFilter() {	
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith("mwe2");
			}
		});
		if (candidateWorkflowFiles.length==0) {
			logger.error("Could not localize any workflow file inside in the folder where the grammar is located.\nFolder path: " + parent.getLocation());
		}
		else if (candidateWorkflowFiles.length>1) {
			logger.error("Cannot proceed, multiple workflow files are found in the folder where the grammar is located.\nFolder path: " + parent.getLocation());
		}
		else {
			URI workflowFileURI = URI.createFileURI(candidateWorkflowFiles[0].getPath());
			try {
				resource = mwe2ResourceSet.getResource(workflowFileURI, true);
			} catch (Exception ex) {
				logger.error(ex.getMessage(), ex);
			}
		}
		return resource;
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
		throw new RuntimeException("Could not find plugin.xml file of project: " + project.getName());
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
			throw new RuntimeException("Could not find plugin.xml file in: " + container.getName());
		}
	}

	public static IFile uriToIFile(URI uri) {
		if (uri.isPlatformResource()) {
			String platformString = uri.toPlatformString(true);
			IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(platformString);
			if (resource instanceof IFile)
				return (IFile) resource;
		}
		else if (uri.isFile()) {
			String fileString = uri.toFileString();
			IResource resource = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(fileString));
			if (resource instanceof IFile)
				return (IFile) resource;
		}
		logger.error("Could not retrieve the grammar file from the grammar uri: " + uri);
		return null;
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
