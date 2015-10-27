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
package org.eclipse.gemini.jpa;

import static org.eclipse.gemini.jpa.GeminiUtil.debug;
import static org.eclipse.gemini.jpa.GeminiUtil.warning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

import org.eclipse.gemini.jpa.classloader.CompositeClassLoader;
import org.eclipse.gemini.jpa.datasource.DataSourceUtil;
import org.eclipse.gemini.jpa.jndi.JndiUtil;
import org.eclipse.gemini.jpa.configadmin.ConfigAdminListener;
import org.eclipse.gemini.jpa.configadmin.PersistenceUnitConfiguration;

/*
 * This is the main Gemini JPA class. It contains much of the state 
 * and subsystem instances that play a role in Gemini JPA. 
 * Note that although the major players are referenced by this class 
 * the manager is not really an "actor", except for init and shutdown.
 * The extender is the primary actor that responds to events and calls the 
 * manager and other util classes to do stuff.
 * 
 * When the extender finds a persistence unit there are two distinct phases:
 * 
 * 1) assignment - Try to assign a persistence unit to ourself
 *          - Our preResolve() method is called by extender
 * 
 * 2) registration - Register the JPA services as appropriate
 *          - Our registerPersistenceUnits() method is called by extender
 *
 * See the extender for more information on the life cycle of a persistence unit.
 * 
 * @see PersistenceBundleExtender
 */
public class GeminiManager {
    
    /*==================*/
    /* Static constants */
    /*==================*/

    public static final int MAX_EVENT_COLLISION_TRIES = 3;
    
    /*=====================*/
    /* Global Gemini state */
    /*=====================*/
    
    /** Our bundle context */
    BundleContext ctx;

    /** Map of p-units we have registered */
    Map<String, PUnitInfo> pUnitsByName;

    /** Extender to find and process persistence unit bundles */
    PersistenceBundleExtender extender;

    /** Services utility methods */
    ServicesUtil servicesUtil;
    
    /** DataSource and JDBC utility methods */
    DataSourceUtil dataSourceUtil;
    
    /** JNDI utility methods */
    JndiUtil jndiUtil;
    
    /** Anchor class gen utility methods */
    AnchorClassUtil anchorUtil;    
    
    /** Config admin integration point */
    ConfigAdminListener configAdminListener;    

    /** Our wrapper class over the native EclipseLink provider */
    ProviderWrapper provider;
    
    /*================*/
    /* Getter/setters */
    /*================*/

    public BundleContext getBundleContext() { return ctx; }
    public void setBundleContext(BundleContext ctx) { this.ctx = ctx; }

    public PersistenceBundleExtender getExtender() { return extender; }
    public void setExtender(PersistenceBundleExtender extender) { this.extender = extender; }

    public ServicesUtil getServicesUtil() { return servicesUtil; }
    public void setServicesUtil(ServicesUtil util) { this.servicesUtil = util; }

    public DataSourceUtil getDataSourceUtil() { return dataSourceUtil; }
    public void setDataSourceUtil(DataSourceUtil util) { this.dataSourceUtil = util; }

    public JndiUtil getJndiUtil() { return jndiUtil; }
    public void setJndiUtil(JndiUtil jndiUtil) { this.jndiUtil = jndiUtil; }

    public AnchorClassUtil getAnchorUtil() { return anchorUtil; }
    public void setAnchorUtil(AnchorClassUtil util) { this.anchorUtil = util; }
    
    public ConfigAdminListener getConfigAdminListener() { return configAdminListener; }
    public void setConfigAdminListener(ConfigAdminListener listener) { this.configAdminListener = listener; }

    public ProviderWrapper getProvider() { return provider; }
    public void setProvider(ProviderWrapper provider) { this.provider = provider; }
    
    public Map<String, PUnitInfo> getPUnitsByName() { return pUnitsByName; }
    public void setPUnitsByName(Map<String, PUnitInfo> pUnitsByName) { this.pUnitsByName = pUnitsByName; }

    /*=================================*/
    /* Initialization/shutdown methods */
    /*=================================*/

    /** Initialize Gemini JPA and get it running */
    public void startup(BundleContext context) throws Exception {        
        // Initialize our state
        ctx = context;
        pUnitsByName = Collections.synchronizedMap(new HashMap<String, PUnitInfo>());
        
        provider = new ProviderWrapper();
        provider.initialize(this);

        extender = new PersistenceBundleExtender(this);
        dataSourceUtil = new DataSourceUtil(this);
        jndiUtil = new JndiUtil(this);
        anchorUtil = new AnchorClassUtil(GeminiSystemProperties.generateAnchorClasses());
        servicesUtil = new ServicesUtil(this);
        
        // Register as a provider 
        servicesUtil.registerProviderService();

        // Start listening for config admin to see if any punit config is present
        configAdminListener = new ConfigAdminListener(this);
        configAdminListener.startListening();

        // Kick the extender to go looking for persistence bundles
        extender.startListening();
        extender.lookForExistingBundles();        
    }
    
    /** Shut down Gemini JPA */
    public void shutdown(BundleContext context) throws Exception {

        // Take config admin and extender offline and unregister the provider
        configAdminListener.stopListening();
        extender.stopListening();
        servicesUtil.unregisterProviderService();
        
        // Unregister all of the persistence units that we have registered
        List<PUnitInfo> pUnits = new ArrayList<PUnitInfo>(); // Need a new copy
        pUnits.addAll(pUnitsByName.values());
        unregisterPersistenceUnits(pUnits);
        pUnitsByName = null;
        
        // Unassign all of the persistence units that have been assigned to us
        extender.clearAllPUnitInfos();
        
        // Clean up any provider resources
        provider.shutdown(context);
        
        // Clear our state
        provider = null; 
        extender = null;
        configAdminListener = null;
        dataSourceUtil = null; 
        anchorUtil = null;
        servicesUtil = null;
    }
    
    /*===========================*/
    /* Extender callback methods */
    /*===========================*/
    
    /**
     * This offers us a chance to do anything that must be done 
     * before the bundle is resolved.
     */
    public void preResolve(Bundle b, Collection<PUnitInfo> pUnits) {
        debug("Manager.preResolve, bundle: ", b.getSymbolicName());
        
        if (GeminiSystemProperties.generateFragments()) {
            // Generate a fragment for the p-units
            new FragmentUtil(getBundle())
                    .generateAndInstallFragment(b, pUnits, getAnchorUtil());
        }

        // Create a loader that can load from the persistence bundle as well as from the provider bundle
        ClassLoader compositeLoader = CompositeClassLoader.createCompositeLoader(getBundleContext(), b);
        
        // Process PU and register weaving/transformers
        provider.initializeForWeaving(compositeLoader, pUnits);        
    }

    /**
     * The persistence bundle is resolved. We must register the 
     * persistence unit services in the registry.
     * 
     * @param pUnits Usually, but not always, all in the same bundle
     */
    public void registerPersistenceUnits(Collection<PUnitInfo> pUnits) {
        
        debug("Manager.registerPersistenceUnits: ", pUnits);

        if (pUnits == null) return;

        for (PUnitInfo info : pUnits) {
            String unitName = info.getUnitName();

            if (pUnitsByName.containsKey(unitName)) {
                // Shouldn't be in the map. Race condition - 
                // Either the bundle is already being registered or 
                // it's being unregistered because of being stopped 
                PUnitInfo existingInfo = pUnitsByName.get(unitName);
                if ((existingInfo != null) && 
                    (existingInfo.getBundle() == info.getBundle())) {
                    // It is the same bundle - move along and assume it will be registered
                    continue;
                }
                int attempts = 0;
                while (pUnitsByName.containsKey(unitName) && (attempts < MAX_EVENT_COLLISION_TRIES)) {
                    // The previous entry just hasn't been removed yet. Take a short
                    // break and give a chance for the unregister to occur.
                    try { Thread.sleep(1000); } catch (InterruptedException iEx) {}
                    attempts++;
                } 
                if (pUnitsByName.containsKey(unitName)) {
                    // It's still there. Take matters into our own hands and force the unregister
                    warning("Manager forcing unregister of persistence unit: " + info.getUnitName());
                    Collection<PUnitInfo> units = new ArrayList<PUnitInfo>();
                    units.add(info);
                    unregisterPersistenceUnits(units);
                }
            }
            // See if our config admin listener has been notified about any additional config
            PersistenceUnitConfiguration config = getConfigAdminListener().configForPersistenceUnitName(unitName);
            if (config != null) {
                // If we found a config then update the PUnitInfo with it
                debug("Manager.registerPersistenceUnits found incremental config for punit ", unitName, "\n", config);
                config.updatePUnitInfo(info);
            }
            
            // Keep a local copy of all of the p-units we are registering
            pUnitsByName.put(unitName, info);
                        
            // Do the registering
            servicesUtil.registerEMFServices(info);
        }
    }

    /**
     * In this callback the provider must unregister the persistence unit services 
     * from the registry and clean up any resources.
     * 
     * @param pUnits Usually, but not always, all in the same bundle
     */
    public void unregisterPersistenceUnits(Collection<PUnitInfo> pUnits) {

        debug("Manager.unregisterPersistenceUnits: ", pUnits);

        if (pUnits == null) return;
        
        for (PUnitInfo info : pUnits) {
            
            servicesUtil.unregisterWeavingHookService(info);
            servicesUtil.unregisterEMFServices(info);

            // Remove from our local pUnit copy 
            pUnitsByName.remove(info.getUnitName());
        }
    }

    /*================*/
    /* Helper methods */
    /*================*/

    public Bundle getBundle() { return ctx.getBundle(); }  

}