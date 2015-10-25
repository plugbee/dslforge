package org.eclipse.xtext.example.fowlerdsl.web.internal;

import java.net.URL;
import java.util.Collections;
import java.util.Map;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.example.fowlerdsl.web.module.WebStatemachineStandaloneSetup;
import org.osgi.framework.BundleContext;

import com.google.common.collect.Maps;
import com.google.inject.Injector;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	public static final String LANGUAGE_NAME = "org.eclipse.xtext.example.fowlerdsl.Statemachine";

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.xtext.example.fowlerdsl.web"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	private Map<String, Injector> injectors = Collections.synchronizedMap(Maps.<String, Injector> newHashMapWithExpectedSize(1));
	
	public Injector getInjector(String language) {
		synchronized (injectors) {
			Injector injector = injectors.get(language);
			if (injector == null) {
				injectors.put(language, injector = new WebStatemachineStandaloneSetup().createInjector(LANGUAGE_NAME));
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
		addImageFilePath(StatemachineImageProvider.FILE);
		addImageFilePath(StatemachineImageProvider.WIZARD);
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