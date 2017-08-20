package org.dslforge.workspace.config.internal;

import org.apache.log4j.Logger;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	static final Logger logger = Logger.getLogger(Activator.class);
	
	// The plug-in ID
	public static final String PLUGIN_ID = "org.dslforge.workspace.config"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	public static Activator getDefault() {
		return plugin;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		plugin = this;
		logger.info(PLUGIN_ID + " started!");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		logger.info(PLUGIN_ID + " stopping!");
		plugin = null;
	}
}