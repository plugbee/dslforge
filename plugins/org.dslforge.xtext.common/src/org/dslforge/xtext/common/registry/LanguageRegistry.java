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

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.dslforge.xtext.common.guice.AbstractGuiceAwareWebExecutableExtensionFactory;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IContributor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.osgi.framework.Bundle;

import com.google.inject.Binding;
import com.google.inject.ConfigurationException;
import com.google.inject.Injector;

public class LanguageRegistry {

	static final Logger logger = Logger.getLogger(LanguageRegistry.class);
	
	public static final LanguageRegistry INSTANCE = new LanguageRegistry();
	
	private static final String WORKBENCH_CONTRIBUTION_EXTENSION_POINT = "org.dslforge.xtext.common.contribution";
	private static final String WORKBENCH_CONTRIBUTION_CONFIG_ELEMENT = "contribution";
	private static final String WORKBENCH_CONTRIBUTION_PATH = "path";
	private static final String WORKBENCH_CONTRIBUTION_FACTORY = "factory";
	private static final String WORKBENCH_CONTRIBUTION_FILE_EXTENSION = "extension";
	
	private static Map<String, LanguageContribution> languageToContributionMap;
	private static Map<String, XtextResourceSet> languageToResourceSetMap = Collections.synchronizedMap(new LinkedHashMap<String, XtextResourceSet>());
	
	public XtextResourceSet getDefaultResourceSet(String fileExtension) {
		List<String> metamodelsByExtension = getLanguageByExtension(fileExtension);
		//assume one language
		if (metamodelsByExtension==null || metamodelsByExtension.isEmpty())
			return new XtextResourceSet();
		//Drawback: cannot handle cross language resource sets!
		String language = metamodelsByExtension.get(0);
		if (language==null)
			return new XtextResourceSet();
		synchronized (languageToResourceSetMap) {
			XtextResourceSet resourceSet = languageToResourceSetMap.get(language);
			if (resourceSet == null) {
				languageToResourceSetMap.put(language, resourceSet = languageToContributionMap.get(language).getInjector().getInstance(XtextResourceSet.class));
			}
			return resourceSet;
		}
	}
	
	public LanguageRegistry() {
		languageToContributionMap = new HashMap<String, LanguageContribution>();
		try {
			initialize();
		} catch (CoreException e) {
			e.printStackTrace();
		}	
	}
	
	public Injector getInjector(String metamodel)  {
		return languageToContributionMap.get(metamodel).getInjector();
	}
	
	public List<IGenerator> getGeneratorsForMetamodel(String metamodel){
		LanguageContribution languageContribution = languageToContributionMap.get(metamodel);
		if(languageContribution==null)
			return Collections.emptyList();
		return languageContribution.getGenerators();
	}
	
	public List<String> getMetamodels() {
		return new ArrayList<String>(languageToContributionMap.keySet());
	}
	
	public String getFileExtensionFor(String metamodel) {
		LanguageContribution languageContribution = languageToContributionMap.get(metamodel);
		if (languageContribution==null) {
			throw new RuntimeException("Could not find the requested language in the registry " + metamodel);
		}
		return languageContribution.getFileExtension();
	}
	
	public List<String> getLanguageByExtension(String extension) {
		List<String> toReturn = new ArrayList<String>();
		Set<String> keySet = languageToContributionMap.keySet();
		for (String key: keySet) {
			LanguageContribution languageContribution = languageToContributionMap.get(key);
			String fileExtension = languageContribution.getFileExtension();
			if(fileExtension.equals(extension)) {
				toReturn.add(languageContribution.getLabel()); 
			}
		}
		return toReturn;
	}
	
	private void initialize() throws CoreException {		
		IConfigurationElement[] configElements =Platform.getExtensionRegistry().getConfigurationElementsFor(WORKBENCH_CONTRIBUTION_EXTENSION_POINT);
		if (configElements.length != 0) {
			for (IConfigurationElement configElement : configElements) {
				try {
					if (configElement.getName().toLowerCase().equals(WORKBENCH_CONTRIBUTION_CONFIG_ELEMENT.toLowerCase())) {	
						//The language name
						String xtextGrammarPath = configElement.getAttribute(WORKBENCH_CONTRIBUTION_PATH); 
						if (languageToContributionMap.containsKey(xtextGrammarPath)) {
							logWarning("Duplicate language contribution found for: " + xtextGrammarPath); //$NON-NLS-1$
							continue;
						}
						//The language file extension
						String fileExtension = configElement.getAttribute(WORKBENCH_CONTRIBUTION_FILE_EXTENSION);			
						//The language injector
						IContributor contributor = configElement.getContributor();
						String webPluginName = contributor.getName();
						Bundle bundle = Platform.getBundle(webPluginName);
						try {
							String factoryName = configElement.getAttribute(WORKBENCH_CONTRIBUTION_FACTORY);
							//String factoryName = attributeAsIs.substring(0, attributeAsIs.indexOf(":"));
							Class<?> clazz = bundle.loadClass(factoryName);
							Object newInstance = clazz.newInstance();
							if (newInstance instanceof AbstractGuiceAwareWebExecutableExtensionFactory) {							
								//Got the injector
								List<IGenerator> generators = new ArrayList<IGenerator>();
								Injector injector = ((AbstractGuiceAwareWebExecutableExtensionFactory)newInstance).getInjector();
								try {
									Binding<IGenerator> binding = injector.getBinding(IGenerator.class);
									if (binding!=null) {
										IGenerator generator = injector.getInstance(IGenerator.class);
										if (generator!=null) {
											generators.add(generator);
										}
									}	
								} catch (ConfigurationException ex) {
									//do nothing, there is no generator contributed.
									logger.debug("There is no generator contributed implementing IGenerator.");
									// Xtext 2.10: try IGenerator2
									GeneratorDelegate delegate = injector.getInstance(GeneratorDelegate.class);
									if (delegate!=null) {
										generators.add(delegate);
									}
								}
								//Done.
								LanguageContribution contribution = new LanguageContribution(xtextGrammarPath, fileExtension, injector, generators);	
								languageToContributionMap.put(xtextGrammarPath, contribution);
							}
						} catch (ClassNotFoundException ex) {
							logger.error(ex.getMessage(), ex);
						} catch (SecurityException ex) {
							logger.error(ex.getMessage(), ex);
						} catch (IllegalAccessException ex) {
							logger.error(ex.getMessage(), ex);
						} catch (IllegalArgumentException ex) {
							logger.error(ex.getMessage(), ex);
						} catch (InstantiationException ex) {
							logger.error(ex.getMessage(), ex);
						}						
					} 
				} catch (Exception ex) {
					logError(ex);
				} 
			}
		}
	}

	private void logWarning(String msg) {
		logger.info("[WARNING] - " + msg);
	}

	private void logError(Throwable t) {
		logger.error(t.getMessage(), t);
	}
}