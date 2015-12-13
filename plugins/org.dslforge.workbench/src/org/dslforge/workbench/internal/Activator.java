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
package org.dslforge.workbench.internal;

import java.net.URL;
import java.util.List;

import org.dslforge.xtext.common.registry.BasicWorkbenchRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin /*implements ServiceTrackerCustomizer*/ {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.dslforge.rap.workbench"; //$NON-NLS-1$
	
	private static BundleContext bundleContext;
	  
	// The shared instance
	private static Activator plugin;

	public static Activator getInstance() {
		return plugin;
	}

	/**
	 * The constructor
	 */
	public Activator() {
	}
	
    public static final int MAX_EVENT_COLLISION_TRIES = 3;
    
    //ServiceTracker emfTracker;
    
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		System.out.println("[DSLFORGE] " + plugin.getBundle().getSymbolicName() + " : started!");

	    bundleContext = context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);		
	    bundleContext = context;
		System.out.println("[DSLFORGE] " + "org.dslforge.workbench : stopped!");		
	}
	
	public static BundleContext getBundleContext() {
		return bundleContext;
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
		System.out.println("[DSLFORGE] Adding images to registry");
		addImageFilePath(BasicWorkbenchImageProvider.USER);
		addImageFilePath(BasicWorkbenchImageProvider.FILE);
		addImageFilePath(BasicWorkbenchImageProvider.MODEL);
		addImageFilePath(BasicWorkbenchImageProvider.FOLDER);
		addImageFilePath(BasicWorkbenchImageProvider.PROJECT);
		addImageFilePath(BasicWorkbenchImageProvider.UNKNOWN);
		addImageFilePath(BasicWorkbenchImageProvider.DELETE_RESOURCE);
		addImageFilePath(BasicWorkbenchImageProvider.RUN_EXEC);
		addImageFilePath(BasicWorkbenchImageProvider.COMPILE);
		addImageFilePath(BasicWorkbenchImageProvider.JAVA);
		addImageFilePath(BasicWorkbenchImageProvider.BINARY);		
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