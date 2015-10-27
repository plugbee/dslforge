/*******************************************************************************
 * Copyright (c) 2010 Oracle.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution. 
 * The Eclipse Public License is available at
 *     http://www.eclipse.org/legal/epl-v10.html
 * and the Apache License v2.0 is available at 
 *     http://www.opensource.org/licenses/apache2.0.php.
 * You may elect to redistribute this code under either of these licenses.
 *
 * Contributors:
 *     mkeith - Gemini JPA work 
 ******************************************************************************/
package org.eclipse.gemini.jpa.configadmin;

import static org.eclipse.gemini.jpa.GeminiUtil.debug;
import static org.eclipse.gemini.jpa.GeminiUtil.warning;
import static org.eclipse.gemini.jpa.eclipselink.EclipseLinkProvider.ECLIPSELINK_PROVIDER_CLASS_NAME;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.Constants;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedServiceFactory;

import org.eclipse.gemini.jpa.classloader.CompositeClassLoader;
import org.eclipse.gemini.jpa.GeminiManager;
import org.eclipse.gemini.jpa.GeminiPersistenceUnitProperties;
import org.eclipse.gemini.jpa.GeminiUtil;
import org.eclipse.gemini.jpa.PUnitInfo;

/**
 * This singleton class provides functionality to integrate with the 
 * Config Admin service if it is available.
 */
@SuppressWarnings({"rawtypes"})
public class ConfigAdminListener implements ManagedServiceFactory {

    /*==================*/
    /* Static constants */
    /*==================*/
    
    public static String PUNIT_FACTORY_PID = "gemini.jpa.punit";
    public static String SYNTHESIZED_DESC_NAME_PREFIX = "$$$_Synthesized_PUnit_Desc_";
    
    /*=============*/
    /* Local state */
    /*=============*/

    // Pointer back to the mgr
    GeminiManager mgr;
       
    // Our service registration 
    ServiceRegistration configListenerService;
    
    // Incremental Configs we have been notified of. 
    // These DO NOT have a bsn.
    // (Keyed by punit name)
    Map<String,PersistenceUnitConfiguration> configsByName;

    // Standalone Configs we have been notified of.
    // These are assumed to have a bsn.
    // (Keyed by bsn)
    Map<String,PersistenceUnitConfiguration> configsByBsn;

    // Mapping from generated service pid to config
    // This just makes it easier to delete the config on deleted() calls
    Map<String,PersistenceUnitConfiguration> configsByPid;

    // Bundles found by the extender that didn't have a descriptor
    Set<String> inLimbo;
    
    // Synthesized descriptor count
    int descCount = 0;
    
    /*===================*/
    /* Lifecycle methods */
    /*===================*/
    
    public ConfigAdminListener(GeminiManager mgr) { this.mgr = mgr; }
    
    /**
     * Register so that if a config admin service is running then we will 
     * be notified if/when a configuration is available
     */
    public void startListening() {
        
        debug("ConfigAdminListener registering");
        configsByName = new HashMap<String,PersistenceUnitConfiguration>();
        configsByBsn = new HashMap<String,PersistenceUnitConfiguration>();
        configsByPid = new HashMap<String,PersistenceUnitConfiguration>();
        // Service strings
        String[] serviceNames = { ManagedServiceFactory.class.getName() };

        // Store the version of the provider as a service property
        Dictionary<String,String> props = new Hashtable<String,String>();
        props.put(Constants.SERVICE_PID, PUNIT_FACTORY_PID);        
        
        // Register the provider service
        configListenerService = mgr.getBundleContext().registerService(serviceNames, this, props);
        debug("ConfigAdminListener registered");
    }    

    /**
     * Unregister so we will stop receiving config admin notifications 
     */
    public void stopListening() {
        
        debug("ConfigAdminListener unregistering");
        configListenerService.unregister();
        configsByName = null;
        configsByBsn = null;
        debug("ConfigAdminListener unregistered");
    }
    
    /*===============================*/
    /* ManagedServiceFactory methods */
    /*===============================*/

    @Override
    public void updated(String pid, Dictionary dict) throws ConfigurationException {
        debug("ConfigAdminListener.updated(), pid: ", pid);
        if (dict == null) 
            return;
        
        // Create a config out of the dictionary entries
        PersistenceUnitConfiguration config = new PersistenceUnitConfiguration(dict); 
        debug("ConfigAdminListener created Configuration object: ", config);
        
        if (config.getUnitName() == null) {
            GeminiUtil.warning("Configuration ignored because it did not contain persistence unit name property ",
                               GeminiPersistenceUnitProperties.PUNIT_NAME);
            return;
        }

        // Store against the generated pid so we can find it in case of a deleted() call
        synchronized (configsByPid) { configsByPid.put(config.getServicePid(), config); }
        
        // If it has a BSN then store it against its bsn, otherwise store it against its name
        if (config.getBsn() != null) {
            synchronized (configsByBsn) { configsByBsn.put(config.getBsn(), config); }
            // If it has a bsn then it is a standalone config (persistence bundle has no persistence descriptor).
            // If this is the case then synthesize a descriptor and squirrel it away in the classloader
            generateAndStashPersistenceDescriptor(config);
        } else {
            // No bsn. Must be an incremental config - persistence bundle will have an existing descriptor
            synchronized (configsByName) { configsByName.put(config.getUnitName(), config); }
        }
        // Determine if we need to refresh the bundle and then refresh it if necessary
        refreshPersistenceUnitIfNecessary(config, false);
    }
    
    @Override
    public void deleted(String pid) { 
        debug("ConfigAdminListener.deleted()", " pid ", pid);
        
        PersistenceUnitConfiguration config = configsByPid.remove(pid);
        if (config != null) {
            debug("ConfigAdminListener.deleted(), ", "pid ", pid, " was found stored, being removed");
            // Remove from whichever map it may be contained in
            configsByName.remove(config.getUnitName());
            configsByBsn.remove(config.getBsn());            
            // Refresh the persistence unit bundle
            refreshPersistenceUnitIfNecessary(config, true);
        }
    }

    @Override
    public String getName() { return "Gemini JPA Persistence Unit Configuration"; }
    
    /*================*/
    /* Helper methods */
    /*================*/

    // Called by the manager to get the additional config before registering the JPA services
    public PersistenceUnitConfiguration configForPersistenceUnitName(String unitName) {
        return configsByName.get(unitName);
    }

    // Called by PersistenceBundleExtender to get the generated config descriptor name 
    public PersistenceUnitConfiguration configForBundle(String bsn) {
        return configsByBsn.get(bsn);
    }

    // Generate a persistence descriptor and squirrel it away so loader.getResource() call can find it
    protected void generateAndStashPersistenceDescriptor(PersistenceUnitConfiguration config) {

        // Create a unique name and store it in the config
        String descriptorName = SYNTHESIZED_DESC_NAME_PREFIX + descCount++;
        config.setDescriptorName(descriptorName);
        debug("ConfigAdminListener generating desc ", descriptorName);

        // Generate a descriptor and stash it in the config and the classloader as a private resource
        String descriptor = generateDescriptorFromConfig(config);
        config.setDescriptor(descriptor);
        CompositeClassLoader.addPrivateResource(descriptorName, descriptor);
    }

    // Generate a persistence descriptor string from the configuration 
    protected String generateDescriptorFromConfig(PersistenceUnitConfiguration config) {

        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n")
          .append("<persistence version=\"1.0\" \n")
          .append("  xmlns=\"http://java.sun.com/xml/ns/persistence\" \n")
          .append("  xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" \n")
          .append("  xsi:schemaLocation=\"http://java.sun.com/xml/ns/persistence  ")
          .append("http://java.sun.com/xml/ns/persistence/persistence_1_0.xsd\"> \n")
          .append(" <persistence-unit")
          .append(" name=\"").append(config.getUnitName()).append("\"")
          .append(" transaction-type=\"RESOURCE_LOCAL\"> \n")
          .append("   <provider>").append(ECLIPSELINK_PROVIDER_CLASS_NAME).append("</provider> \n");
        for (String clsName : config.getClasses()) {
            sb.append("   <class>" + clsName + "</class> \n");
        }
        Object exclude = config.getExcludeUnlistedClasses();
        if (exclude != null) {
            sb.append("   <exclude-unlisted-classes>")
              .append(exclude)
              .append("</exclude-unlisted-classes> \n");
        }
        Map<String,Object> props = config.getProperties();
        if (!props.isEmpty()) {
            sb.append("   <properties> \n");
            for (String key :  props.keySet()) {
                Object value = props.get(key);
                if (value instanceof String) {
                    sb.append("     <property ")
                      .append("name=\"" + key + "\" ")
                      .append("value=\"" + (String)value + "\"")
                      .append("/> \n");
                } else {
                    warning("Configuration descriptor generation skipping non-String property ", key);
                }
            }
            sb.append("   </properties> \n");
        }
        sb.append(" </persistence-unit> \n")
          .append("</persistence> \n");
        String result = sb.toString(); 
        debug("ConfigAdminListener finished generating desc: \n", result);
        return result;
    }
    
    /*
     *  Refresh, if necessary, the bundle containing the given persistence unit.
     *  It will be refreshed if the bundle can be obtained and any of the following
     *  cases apply:
     *  
     *  a) force parameter is true
     *  b) The bundle is in limbo (had no previous descriptor)
     *  c) The bundle did have a descriptor and an EMF was already registered
     *  d) Gemini JPA refresh property was specified with a value of true
     */
    protected void refreshPersistenceUnitIfNecessary(PersistenceUnitConfiguration config, boolean force) {
        Bundle b;
        boolean needsRefresh = false;
        String unitName = config.getUnitName();
        debug("ConfigAdminListener checking if necessary to refresh bundle for punit ", unitName, ", force=", force);

        PUnitInfo unitInfo = mgr.getPUnitsByName().get(unitName);
        if (unitInfo != null) {
            debug("ConfigAdminListener found punit bundle ", unitName, " in set of registered punits");
            b = unitInfo.getBundle();
            
            // If an existing EMF service is already registered or refresh property specified then we need to refresh
            if (force || (unitInfo.getEmfService() != null) || config.getRefreshBundle()) {
                needsRefresh = true;
            }

            if (needsRefresh) {
                // If we will be refreshing, first unregister the JPA services and unassign the bundle
                debug("ConfigAdminListener unregistering and unassigning bundle ", b);
                mgr.getExtender().unregisterPersistenceUnitsInBundle(b);
                mgr.getExtender().unassignPersistenceUnitsInBundle(b);
            } else {
                // Don't refresh. Existing punit (with only EMFBuilder service) 
                // Go ahead and update the unitInfo from the config and then register the EMF service
                config.updatePUnitInfo(unitInfo);
                mgr.getServicesUtil().tryToRegisterEMFService(
                        unitInfo, 
                        new HashMap<String,Class<?>>(), 
                        mgr.getServicesUtil().buildServiceProperties(unitInfo));
            }
        } else {
            // Try looking at the bundles that are in limbo (did not have existing descriptor)
            b = mgr.getExtender().getBundleInLimbo(config.getBsn());
            if (b != null) {
                needsRefresh = true;
                debug("ConfigAdminListener found punit bundle ", unitName, " in limbo");
            }
        }
        // Now look to see if we actually obtained the bundle
        if (b == null) {
            debug("ConfigAdminListener did not find existing bundle to refresh for punit ", unitName);
        } else {
            if (needsRefresh) {
                // Bundle may have an existing descriptor, or it may not have had any
                debug("ConfigAdminListener refreshing punits in bundle ", b);
                mgr.getExtender().refreshBundle(b);
            }
        }
    }
}