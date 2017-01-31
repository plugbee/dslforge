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
package org.dslforge.xtext.generator.web.internal

import org.dslforge.common.AbstractGenerator
import org.dslforge.common.IWebProjectFactory
import org.dslforge.xtext.generator.XtextGrammar
import org.eclipse.core.runtime.IProgressMonitor

class GenActivator extends AbstractGenerator {

	val relativePath = "/internal/"
	var String grammarShortName
	var XtextGrammar grammar

	override doGenerate(IWebProjectFactory factory, IProgressMonitor monitor) {
		grammar = factory.input as XtextGrammar
		basePath = grammar.getBasePath()
		projectName = grammar.getProjectName()
		grammarShortName = grammar.getShortName()
		factory.generateFile("src-gen/" + basePath + relativePath, "Activator.java", toJava(projectName), monitor)
	}

	def toJava(String projectName) '''
		«fileHeader»
		package «projectName».internal;
		
		import java.net.URL;
		import java.util.Collections;
		import java.util.Map;
		
		import org.eclipse.jface.resource.ImageDescriptor;
		import org.eclipse.jface.resource.ImageRegistry;
		import org.eclipse.swt.graphics.Image;
		import org.eclipse.ui.plugin.AbstractUIPlugin;
		import «projectName».module.Web«grammarShortName.toFirstUpper»StandaloneSetup;
		import org.osgi.framework.BundleContext;
		
		import com.google.common.collect.Maps;
		import com.google.inject.Injector;
		
		/**
		 * The activator class controls the plug-in life cycle
		 */
		public class Activator extends AbstractUIPlugin {
		
			// The Language Name
			public static final String «grammar.name.toUpperCase.replace(".", "_")» = "«grammar.name»";
			
			// The plug-in ID
			public static final String PLUGIN_ID = "«projectName»"; //$NON-NLS-1$
		
			// The shared instance
			private static Activator plugin;
			
			private Map<String, Injector> injectors = Collections.synchronizedMap(Maps.<String, Injector> newHashMapWithExpectedSize(1));
			
			public Injector getInjector(String language) {
				synchronized (injectors) {
					Injector injector = injectors.get(language);
					if (injector == null) {
						injectors.put(language, injector = new Web«grammarShortName.toFirstUpper»StandaloneSetup().createInjector(«grammar.name.toUpperCase.replace(".", "_")»));
					}
					return injector;
				}
			}
		
			public static Activator getInstance() {
				return plugin;
			}
		
			/**
			 * The constructor
			 */
			public Activator() {
			}
		
			/*
			 * (non-Javadoc)
			 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
			 */
			public void start(BundleContext context) throws Exception {
				super.start(context);
				plugin = this;
			}
		
			/*
			 * (non-Javadoc)
			 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
			 */
			public void stop(BundleContext context) throws Exception {
				plugin = null;
				super.stop(context);
			}
		
			/**
			 * Returns the shared instance
			 *
			 * @return the shared instance
			 */
			public static Activator getDefault() {
				return plugin;
			}
		
			@Override
			protected void initializeImageRegistry(ImageRegistry reg) {
				addImageFilePath(«grammarShortName.toFirstUpper»ImageProvider.FILE);
				addImageFilePath(«grammarShortName.toFirstUpper»ImageProvider.WIZARD);
			}
		
			private void addImageFilePath(String relativeURL) {
				Image image = plugin.getImageRegistry().get(relativeURL);
				if (image == null) {
					URL imageURL = plugin.getBundle().getEntry(relativeURL);
					ImageDescriptor descriptor = ImageDescriptor.createFromURL(imageURL);
					image = descriptor.createImage();
					plugin.getImageRegistry().put(relativeURL, image);
				}
			}
		
			public static ImageDescriptor getImageDescriptor(String relativeURL) {
				URL entry = plugin.getBundle().getEntry(relativeURL);
				if (entry != null) {
					return ImageDescriptor.createFromURL(entry);
				}
				return null;
			}
		}
	'''
}
