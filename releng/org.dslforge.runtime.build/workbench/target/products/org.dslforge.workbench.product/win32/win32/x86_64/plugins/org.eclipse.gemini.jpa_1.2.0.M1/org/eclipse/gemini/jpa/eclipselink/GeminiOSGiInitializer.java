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
 *     ssmith - EclipseLink integration
 *     mkeith - rework to use weaving hooks
 ******************************************************************************/
package org.eclipse.gemini.jpa.eclipselink;

import static org.eclipse.gemini.jpa.GeminiUtil.debug;
import static org.eclipse.gemini.jpa.GeminiUtil.fatalError;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.spi.ClassTransformer;
import javax.persistence.spi.PersistenceUnitInfo;

import org.eclipse.gemini.jpa.GeminiManager;
import org.eclipse.gemini.jpa.GeminiUtil;
import org.eclipse.gemini.jpa.PUnitInfo;
import org.eclipse.gemini.jpa.weaving.WeavingHookTransformer;
import org.eclipse.persistence.internal.jpa.deployment.JPAInitializer;
import org.eclipse.persistence.internal.jpa.deployment.PersistenceUnitProcessor;
import org.eclipse.persistence.jpa.Archive;
import org.eclipse.persistence.logging.AbstractSessionLog;
import org.eclipse.persistence.logging.SessionLog;
import org.osgi.framework.Bundle;

@SuppressWarnings("rawtypes")
public class GeminiOSGiInitializer extends JPAInitializer {
   
    static GeminiManager mgr;
    Collection<PUnitInfo> pUnits;
   
    /**
     * Constructor used when registering bundles.
     */
    public GeminiOSGiInitializer() {}

    /** 
     * Constructor used by PersistenceProvider$PersistenceInitializationHelper
     * @param loader
     */
    GeminiOSGiInitializer(ClassLoader loader) {
        this.initializationClassloader = loader;
    }

    /*=============*/
    /* New methods */
    /*=============*/

    /**
     * Set the manager so transform method can access pUnitInfo state.
     */
    static void setManager(GeminiManager manager) {
        mgr =  manager;
    }
    
    /**
     * Initialize the p-units in the bundle passed in (there may be multiple p-units).
	 * This is called by the manager during preResolve.
     * 
     * @param mgr Main GeminiManager
     * @param bundleLoader Used to load resources and classes from provider and p-unit bundle
     * @param pUnits Collection of p-units found in the bundle
     */
    public void initializeFromBundle(ClassLoader bundleLoader, 
                                     Collection<PUnitInfo> pUnits) {
        this.initializationClassloader = bundleLoader;
        this.pUnits = pUnits;
        
        // Get all the unique archives in which the p-units are stored
        List<Archive> pars = new ArrayList<Archive>();
        Set<String> archivePaths = new HashSet<String>();
        for (PUnitInfo pUnitInfo : pUnits) {
            String pUnitDescPath = pUnitInfo.getDescriptorInfo().fullDescriptorPath();
            if (!archivePaths.contains(pUnitDescPath)){
                pars.addAll(PersistenceUnitProcessor.findPersistenceArchives(bundleLoader, pUnitDescPath));
                archivePaths.add(pUnitDescPath);
            }
        }        
        // Initialize all of the archives
        try {
            for (Archive archive: pars) {
                AbstractSessionLog.getLog().log(SessionLog.FINER, "cmp_init_initialize", archive);
                // This will call us back via #registerTransformer() method
                initPersistenceUnits(archive, new HashMap<String, Object>());
            }
        } finally {
            for (Archive archive: pars) {
                archive.close();
            }
        }
    }

    /*====================*/
    /* Overridden methods */
    /*====================*/

    /**
     * Indicates whether puName uniquely defines the persistence unit.
     */
    @Override
    public boolean isPersistenceUnitUniquelyDefinedByName() {
        // TODO isPersistenceUnitUniquelyDefinedByName should be false
        // but PU creation fails for embedded PUs
        return true;
    }
    
    /**
     * Check whether weaving is possible and update the properties and variable as appropriate
     * 
     * @param properties The list of properties to check for weaving and update if weaving is not needed
     */
    @Override
    public void checkWeaving(Map properties){}
    
    /**
     * This should not be used in OSGi
     */
    @Override
    protected ClassLoader createTempLoader(Collection col, boolean shouldOverrideLoadClassForCollectionMembers) {
        return Thread.currentThread().getContextClassLoader();
    }

    /**
	 * In OSGi we don't need a temp loader so use the loader built for the bundle.
	 */
    @Override
	protected ClassLoader createTempLoader(Collection col) {
	    return this.initializationClassloader;
	}
    
    /**
     * Override the parent impl to do nothing since in Gemini the initialization 
     * happens in the #initializeFromBundle() above, called from 
     * EclipseLinkOSGiProvider#preResolve()
     */
    @Override    
    public void initialize(Map m) {}
    
    
    /**
     * Register a weaving hook for a given persistence unit.
     * Note that if multiple p-units exist within a bundle a
     * hook will be registered for each one of them. 
     * Shared classes could be a problem...
     * 
     * @param transformer Native EclipseLink transformer
     * @param persistenceUnitInfo Metadata describing the p-unit
     * @param properties Additional config and state to assist with weaving
     */
    @Override
    public void registerTransformer(ClassTransformer transformer, PersistenceUnitInfo persistenceUnitInfo, Map properties) {
        String unitName = persistenceUnitInfo.getPersistenceUnitName();
        GeminiUtil.debugWeaving("GeminiInitializer.registerTransformer for - ", unitName);

        if (transformer != null) {
            // Get the p-unit we are registering the transformer for
            PUnitInfo pUnitInfo = null;
            // We may get called during preResolve... when our pUnits state will be set
            if (pUnits != null) {
                for (PUnitInfo info : pUnits) {
                    if (info.getUnitName().equals(unitName)) {
                        pUnitInfo = info;
                        debug("RegisterTransformer found unitInfo in punits for ", unitName);
                        break;
                    }
                }
            // Or we may get instantiated later on and need to get the state from the mgr
            } else {
                pUnitInfo = mgr.getPUnitsByName().get(unitName);
                debug("RegisterTransformer looked in manager to find unitInfo for ", unitName);
            }
            if (pUnitInfo == null) {
                fatalError("RegisterTransformer could not find unitInfo for " + unitName, null);
            }
            
            Bundle b = pUnitInfo.getBundle();
            // Create the weaver and pass it to be registered as a service if no service exists for it yet
            if (pUnitInfo.getWeavingHookService() == null) {
                debug("RegisterTransformer - no weaving service exists yet for ", unitName);                
                WeavingHookTransformer weaver = new WeavingHookTransformer(transformer, b.getSymbolicName(), b.getVersion());
                mgr.getServicesUtil().registerWeavingHookService(weaver, pUnitInfo);
            } else {
                debug("RegisterTransformer - weaving service already existed for ", unitName);                
            }
        } else {
            GeminiUtil.debugWeaving("Null Transformer passed into registerTransformer for punit ", unitName);
        }
    }
}
