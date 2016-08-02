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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManagerFactory;

import org.apache.log4j.Logger;
import org.dslforge.workspace.IWorkspaceConstants;
import org.dslforge.workspace.config.IWorkspaceContribution;
import org.dslforge.workspace.config.WorkspaceContribution;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.RegistryFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.jpa.EntityManagerFactoryBuilder;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

/**
 * The activator class controls the plug-in life cycle
 */
@SuppressWarnings("rawtypes")
public class WorkspaceActivator implements BundleActivator, ServiceTrackerCustomizer {

	static final Logger logger = Logger.getLogger(WorkspaceActivator.class);
	
	// The plug-in ID
	public static final String PLUGIN_ID = "org.dslforge.workspace"; //$NON-NLS-1$

	private static final String WORKSPACE_CONTRIBUTION_EXTENSION_POINT = "org.dslforge.workspace.config.configuration";
	private static final String WORKSPACE_CONTRIBUTION_CONFIG_ELEMENT = "contribution";
	private static final String WORKSPACE_CONTRIBUTION_PATH = "path";

	private static List<IWorkspaceContribution> workspaceContributions = new ArrayList<IWorkspaceContribution>();
	
	// The shared instance
	private static WorkspaceActivator plugin;
	
	private static BundleContext ctx;
	private static EntityManagerFactory emf;
	
	private ServiceTracker emfTracker;
	
	public static WorkspaceActivator getDefault() {
		return plugin;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void start(BundleContext context) throws Exception {
		plugin = this;
		ctx = context;
		logger.info(PLUGIN_ID + " started!");
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
		logger.info(PLUGIN_ID + " stopping!");
		plugin = null;
		emfTracker.close();
		if (emf!=null && emf.isOpen())
			emf.close();
		ctx = null;
	}

	@SuppressWarnings("unchecked")
	public Object addingService(ServiceReference ref) {
		IPath workspaceRootPath = getWorkspace().getRootPath();
		Bundle bundle = ref.getBundle();
		final Object service = bundle.getBundleContext().getService(ref);
		String unitName = (String) ref.getProperty(EntityManagerFactoryBuilder.JPA_UNIT_NAME);
		if (unitName.equals(IWorkspaceConstants.PERSISTENCE_UNIT_NAME)) {
			EntityManagerFactoryBuilder entityManagerFactoryBuilder = lookupEntityManagerFactoryBuilder(unitName);
			if (entityManagerFactoryBuilder != null) {
				emf = entityManagerFactoryBuilder.createEntityManagerFactory(overrideConfiguration(workspaceRootPath));
			} else {
				logger.error("Could not retrieve the database service (entity manager factory builder not found).\n"
						+ "This means the plugin is started before the persistency unit has been loaded by Gemini JPA.\n"
						+ "Make sure the startup level of this plugin is higher than org.eclipse.gemini.jpa startup level.");
			}
		}
		return service;
	}
	
	private Map<String, Object> overrideConfiguration(IPath path) {
		Map<String, Object> props = new HashMap<String, Object>();
		props.put(IWorkspaceConstants.JAVAX_PERSISTENCE_JDBC_URL,
				IWorkspaceConstants.JDBC_PREFIX + path.addTrailingSeparator().toString()
						+ IWorkspaceConstants.METADATA_FOLDER + ";create=true");
		return props;
	}
	
	@SuppressWarnings("unchecked")
	public EntityManagerFactoryBuilder lookupEntityManagerFactoryBuilder(String puName) {
		String filter = "(osgi.unit.name=" + puName + ")";
		ServiceReference[] refs = null;
		try {
			refs = ctx.getServiceReferences(EntityManagerFactoryBuilder.class.getName(), filter);
		} catch (InvalidSyntaxException isEx) {
			new RuntimeException("Found bad filter in manifest file.", isEx);
		}
		return (refs == null) ? null : (EntityManagerFactoryBuilder) ctx.getService(refs[0]);
	}

	public void modifiedService(ServiceReference ref, Object service) {
	}

	public void removedService(ServiceReference ref, Object service) {
	}

	private static void setupWorkspace() {
		if (Platform.isRunning()) {
			IExtensionRegistry registry = RegistryFactory.getRegistry();
			IConfigurationElement[] configElements = registry.getConfigurationElementsFor(WORKSPACE_CONTRIBUTION_EXTENSION_POINT);
			if (configElements.length != 0) {
				for (IConfigurationElement configElement : configElements) { 
					try {
						if (configElement.getName().toLowerCase().equals(WORKSPACE_CONTRIBUTION_CONFIG_ELEMENT.toLowerCase())) {	
							String workspaceRootPath = configElement.getAttribute(WORKSPACE_CONTRIBUTION_PATH); 
							if (workspaceContributions.contains(workspaceRootPath)) {
								logger.warn("Duplicate workspace contribution found for: " + workspaceRootPath);
								continue;
							}
							WorkspaceContribution contribution = new WorkspaceContribution(workspaceRootPath);
							workspaceContributions.add(contribution);
						}	
					} catch (Exception ex) {
						logger.error(ex.getMessage(), ex);
					}
				}
			}	
		} 
		else throw new RuntimeException("Platform is not running at this point.");
	}
	
	public IWorkspaceContribution getWorkspace() {
		if (workspaceContributions.isEmpty()) {
			setupWorkspace();
			if (workspaceContributions.size() == 1) {
				return workspaceContributions.get(0);
			} else {
				if (workspaceContributions.isEmpty()) {
					// no workspace contributions, ignore
				} else if (workspaceContributions.size() > 1) {
					logger.error("More than one workspace extension has been registered");
				}
				// use default persistence.xml properties
				workspaceContributions.add(new WorkspaceContribution(IWorkspaceConstants.WORKSPACE_DEFAULT_PATH));
			}
		}
		return workspaceContributions.get(0);
	}

	public static EntityManagerFactory getEntityManagerFactory() {
		return emf;
	}
}