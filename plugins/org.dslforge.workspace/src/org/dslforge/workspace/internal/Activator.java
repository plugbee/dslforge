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
package org.dslforge.workspace.internal;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;

import org.dslforge.workspace.IWorkspaceConstants;
import org.eclipse.persistence.config.PersistenceUnitProperties;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.jpa.EntityManagerFactoryBuilder;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

/**
 * The activator class controls the plug-in life cycle
 */
@SuppressWarnings("rawtypes")
public class Activator implements BundleActivator, ServiceTrackerCustomizer {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.dslforge.workspace"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	private static BundleContext ctx;

	private ServiceTracker emfTracker;

	EntityManagerFactory emf;
	
	public static Activator getDefault() {
		return plugin;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void start(BundleContext context) throws Exception {
		plugin = this;

		ctx = context;

		System.out.println("[DSLFORGE] " + "org.dslforge.rap.workspace : started!");
		/*
		 * We are in the same bundle as the persistence unit so the services
		 * should be available when we start up (if nothing bad happened) and
		 * the tracker is really just saving us the lookup, but this is the idea
		 * of how you would listen for a persistence unit coming from another
		 * bundle.
		 */
		emfTracker = new ServiceTracker(ctx, EntityManagerFactory.class.getName(), this);
		emfTracker.open();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("[DSLFORGE] " + "org.dslforge.rap.workspace" + " : stopping!");
		plugin = null;
		emfTracker.close();
		if (emf!=null && emf.isOpen())
			emf.close();
		ctx = null;
	}

	@SuppressWarnings("unchecked")
	public Object addingService(ServiceReference ref) {
		Bundle b = ref.getBundle();
		final Object service = b.getBundleContext().getService(ref);
		String unitName = (String) ref.getProperty(EntityManagerFactoryBuilder.JPA_UNIT_NAME);
		if (unitName.equals(IWorkspaceConstants.PERSISTENCE_UNIT_NAME)) {
			emf = (EntityManagerFactory) service;
			DatabaseService.getInstance().setEntityManagerFactory(emf);
			//DatabaseService.getInstance().dumpDatabase();
		}
		return service;
	}

	public Map<String, Object> defaultProperties() {
		Map<String, Object> props = new HashMap<String, Object>();
		props.put("javax.persistence.jdbc.driver", IWorkspaceConstants.JDBC_TEST_DRIVER);
		props.put("javax.persistence.jdbc.url", IWorkspaceConstants.JDBC_TEST_URL);
		props.put("javax.persistence.jdbc.user", IWorkspaceConstants.JDBC_TEST_USER);
		props.put("javax.persistence.jdbc.password", IWorkspaceConstants.JDBC_TEST_PASSWORD);
		props.put("eclipselink.logging.level", "OFF");
		props.put(PersistenceUnitProperties.CLASSLOADER, this.getClass().getClassLoader());
		props.put(PersistenceUnitProperties.WEAVING, "false");
		return props;
	}

	public void modifiedService(ServiceReference ref, Object service) {
	}

	public void removedService(ServiceReference ref, Object service) {
	}
}
