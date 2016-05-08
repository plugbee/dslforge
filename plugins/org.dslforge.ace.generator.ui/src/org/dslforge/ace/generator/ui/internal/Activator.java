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
package org.dslforge.ace.generator.ui.internal;

import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	/**
	 * The plug-in ID
	 */
	public static final String PLUGIN_ID = "org.dslforge.ace.generator.ui";

	// The shared instance
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.
	 * BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.
	 * BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/*
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	@Override
	protected void initializeImageRegistry(ImageRegistry reg_p) {
		super.initializeImageRegistry(reg_p);
		addImageFilePath(ImageProvider.ANTLR_IMG);
	}

	private void addImageFilePath(String imagePath) {
		Image image = plugin.getImageRegistry().get(imagePath);
		if (image == null) {
			URL imageURL = plugin.getBundle().getEntry(imagePath);
			ImageDescriptor descriptor = ImageDescriptor.createFromURL(imageURL);
			image = descriptor.createImage();
			plugin.getImageRegistry().put(imagePath, image);
		}
	}

	public static ImageDescriptor getImageDescriptor(String url_p) {
		URL imageURL = plugin.getBundle().getEntry(url_p);
		if (imageURL != null)
			return ImageDescriptor.createFromURL(imageURL);
		return null;
	}
}