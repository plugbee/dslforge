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
import static org.eclipse.gemini.jpa.GeminiUtil.getPackageAdmin;
import static org.eclipse.gemini.jpa.GeminiUtil.warning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.gemini.jpa.configadmin.InlinedDescriptorInfo;
import org.eclipse.gemini.jpa.configadmin.PersistenceUnitConfiguration;
import org.eclipse.gemini.jpa.eclipselink.EclipseLinkProvider;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.Constants;
import org.osgi.framework.SynchronousBundleListener;
import org.osgi.service.packageadmin.PackageAdmin;

/**
 * The extender listens for persistence unit bundles and pushes them through 
 * the life cycle according to the various conditions.
 * At startup all of the already installed bundles are checked to see if 
 * any persistence bundles have already been resolved.
 * 
 * There are two basic stages:
 * 
 * (1) assignment - Try to assign a persistence unit to this provider
 * 
 * @see tryAssigningPersistenceUnitsInBundle
 * 
 * This generally happens before a persistence bundle has been resolved
 * because weaving requires that a transformer be registered and the classes
 * should not have been loaded yet.
 * If we find a persistence bundle that has not been assigned, but that has 
 * already gotten past the resolve stage then we will normally refresh it
 * in order to reset the bundle to go through the resolve stage again.
 * 
 * In general, the following things will occur in this phase:
 * 
 *  - Look in the persistence descriptors of the bundle and see if provider is specified
 *  - If none, or if we are explicitly listed as the provider then assign the bundle to us
 *  - Call preResolve() on the manager (see GeminiManager.preResolve())
 * 
 * (2) registration - Register the JPA services as appropriate
 * 
 * @see registerPersistenceUnitsInBundle
 * 
 * This will happen after the persistence bundle has been resolved. The various
 * JPA services will be registered as appropriate.
 *
 * In general, the following things will occur in this phase:
 * 
 *  - Call registerPersistenceUnits() on the manager (see GeminiManager.registerPersistenceUnits())
 *  - See if the necessary data source service is available to support the punit
 *  - If the data source support is necessary and available then register an EntityManagerFactory service
 *  - Register an EntityManagerFactoryServiceBuilder service in any case
 *
 */
@SuppressWarnings({"deprecation"})
public class PersistenceBundleExtender implements SynchronousBundleListener  {

    /*================*/
    /* Instance state */
    /*================*/
    
    // Pointer back to the mgr
    GeminiManager mgr;
    
    // Stateless utility class
    PersistenceUnitBundleUtil bundleUtil;
    
    // List of all assigned persistence units by bundle
    // Note: It is a requirement that if one persistence unit is assigned 
    //       to us then they all must be.
    Map<Bundle, List<PUnitInfo>> unitsByBundle = 
        Collections.synchronizedMap(new HashMap<Bundle, List<PUnitInfo>>());
    
    // Map of persistence bundles (keyed by BSN) that have been examined but 
    // didn't have descriptors. These will be refreshed if/when a config admin 
    // configuration comes along.
    Map<String, Bundle> inLimbo = 
        Collections.synchronizedMap(new HashMap<String, Bundle>());
    
    // Bundles marked for lazy activation
    // (Just keep the bundle ids to prevent hard references to the bundles.)
    Set<Long> lazyBundles = new HashSet<Long>();

    // Bundles in the process of being refreshed, or that we have already refreshed
    // but not yet been notified about them having been unresolved
    // (Just keep the bundle ids to prevent hard references to the bundles.)
    Set<Long> refreshingBundles = new HashSet<Long>();
    
    /*==============*/
    /* Constructors */
    /*==============*/
    
    public PersistenceBundleExtender() {}
    public PersistenceBundleExtender(GeminiManager mgr) { 
        this.mgr = mgr;
        this.bundleUtil = new PersistenceUnitBundleUtil();
    }

    /*===============================*/
    /* API methods called by the mgr */
    /*===============================*/

    /**
     * Start listening for bundle events to indicate the presence of 
     * persistence unit bundles. 
     */
    public void startListening() {
        debug("Extender.startListening");
        mgr.getBundleContext().addBundleListener(this);
    }

    /**
     * Stop listening to bundle events. 
     */
    public void stopListening() {
        debug("Extender.stopListening");
        mgr.getBundleContext().removeBundleListener(this);
    }

    /**
     * Look for persistence unit bundles that were already installed when we came along. 
     */
    public void lookForExistingBundles() {
        
        // Look at the bundles that are already installed
        Bundle[] installedBundles = mgr.getBundleContext().getBundles();
        debug("Extender.lookForExistingBundles: ", installedBundles);
        
        // Check if any are p-unit bundles
        for (Bundle b : installedBundles) {
            if (isPersistenceUnitBundle(b)) {
                // We found a persistence unit bundle.
                if (GeminiSystemProperties.refreshPersistenceBundles()) {
                    // If bundle is active then refresh it and push it through the life cycle again
                    // so it will go through resolving and we can assign it a provider, etc.
                    //  if ((b.getState() != Bundle.INSTALLED) && (b.getState() != Bundle.UNINSTALLED)) {
                    if (b.getState() == Bundle.ACTIVE) {
                        if (isAssigned(b)) {
                            debug("Found existing installed bundle " + b.getSymbolicName(), " but it was already assigned");
                        } else {
                            debug("Found active bundle ", b, " - refreshing to push it back to resolve for processing");
                            refreshBundle(b);
                        }
                    }
                } else {
                    // Refreshing is disabled - go through assigning and registering process w/o events
                    if (b.getState() != Bundle.UNINSTALLED) {
                        // Assign the p-unit
                        // NOTE: With no refresh, assigning may be happening after the bundle has been resolved
                        warning("Extender - Refreshing disabled - entities in bundle " + b.getSymbolicName(), " may not be woven");
                        tryAssigningPersistenceUnitsInBundle(b);
                        // Now if bundle is starting or active then register the p-units in it
                        if ((b.getState() == Bundle.STARTING) || (b.getState() == Bundle.ACTIVE)) {
                            registerPersistenceUnitsInBundle(b);
                        } // Otherwise just let future events take their course 
                    }
                }
            }
        }
    }

    /**
     * Clean up all of our state. 
     * 
     * @return The assigned punit Map 
     */
    public Map<Bundle, List<PUnitInfo>> clearAllPUnitInfos() {
        Map<Bundle, List<PUnitInfo>> pUnitInfos = unitsByBundle;
        unitsByBundle = null;
        lazyBundles = null;
        refreshingBundles = null;
        return pUnitInfos;
    }

    /*============================*/
    /* Additional Support Methods */
    /*============================*/
    
    /**
     * Go through the p-units in a given bundle and assign the ones that do 
     * not have a provider, or have a provider specified as this one.
     * 
     * @param b the bundle to look for p-units in
     */
    public void tryAssigningPersistenceUnitsInBundle(Bundle b) {
        
        debug("Extender.tryAssigningPersistenceUnitsInBundle: ", b);
        // If we have already assigned it then bail
        if (isAssigned(b)) {
            warning("Attempted to assign a bundle that was already assigned: ", b.toString());
            return;
        }

        // Look for all of the persistence descriptor files in the bundle
        List<PersistenceDescriptorInfo> descriptorInfos = bundleUtil.persistenceDescriptorInfos(b);

        if (descriptorInfos.isEmpty()) {
            // There were no descriptors specified in the manifest - check if there is any config from config admin
            PersistenceUnitConfiguration config = mgr.getConfigAdminListener().configForBundle(b.getSymbolicName());
            if (config != null) {
                // There is a config to go with this bundle. 
                // Create a special descriptorInfo with the descriptor string right inside it
                debug("No persistence descriptors, but found a config for bundle ", b);
                descriptorInfos.add(new InlinedDescriptorInfo(config));
            } else {
                // We can't assign it just yet. Add to the limbo list
                warning("No persistence descriptors found in persistence bundle ", b.getSymbolicName());
                debug("Putting bundle ", b, " in limbo");
                inLimbo.put(b.getSymbolicName(), b);
                // The bundle will be removed from being in limbo by the config admin listener when 
                // a config comes along that contains the bsn of this bundle. It will then be refreshed.
                return;
            }
        }

        // Do a partial parse of the descriptors
        Set<PUnitInfo> pUnitInfos = bundleUtil.persistenceUnitInfoFromXmlFiles(descriptorInfos);

        // Cycle through each p-unit info and see if a provider was specified
        for (PUnitInfo info : pUnitInfos) {
            if ((info.getProvider() == null) || (EclipseLinkProvider.ECLIPSELINK_PROVIDER_CLASS_NAME.equals(info.getProvider()))) {
                // We can be the provider; claim the p-unit and add it to our list
                info.setBundle(b);
                info.setAssignedProvider(mgr.getProvider());
                debug("Assigning punit ", info.getUnitName(), " to this provider");
                addToBundleUnits(unitsByBundle, b, info);
            }
        }
        // If we found any that were for us then move on to do the preResolve work
        List<PUnitInfo> unitsFound = unitsByBundle.get(b);
        if ((unitsFound != null) && (unitsFound.size() != 0)) {
            mgr.preResolve(b, unitsByBundle.get(b));
        }
    }
    
    /**
     * Unassign all of the p-units in a given bundle.
     * 
     * @param b the bundle the p-units are in
     */
    public void unassignPersistenceUnitsInBundle(Bundle b) { 
        
        debug("Extender.unassignPersistenceUnitsInBundle: ", b);
        List<PUnitInfo> infos = unitsByBundle.get(b);
        unitsByBundle.remove(b);
        removeFromLazyBundles(b);
        // Uninitialize the state of the p-unit
        for (PUnitInfo info : infos) {
            info.setAssignedProvider(null);
            info.setBundle(null);
        }
    }

    /**
     * Register the p-units of a given bundle.
     * 
     * @param b the bundle the p-units are in
     */
    public void registerPersistenceUnitsInBundle(Bundle b) {
        
        debug("Extender.registerPersistenceUnitsInBundle: ", b);
        if (!isAssigned(b)) {
            warning("Register called on bundle " + b.getSymbolicName(), " but bundle was not assigned");
            return;
        }
        if (areCompatibleBundles(b, mgr.getBundle())) { 
            debug("Extender provider compatible with bundle: ", b);
            
            mgr.registerPersistenceUnits(unitsByBundle.get(b));
            
        } else {
            warning("Cannot support bundle " + b.getSymbolicName() +  
                    " because it is not JPA-compatible with the EclipseLink bundles. " + 
                    "This is because there are multiple bundles exporting javax.persistence " +
                    "and the persistence unit bundle has resolved to a different one than " +
                    "the EclipseLink bundles. " +
                    "\nTo fix this, uninstall one of the bundles containing javax.persistence " +
                    "so that both the persistence unit bundle and the provider bundles resolve " +
                    "to the same javax.persistence package.");
            unassignPersistenceUnitsInBundle(b);
            // No point in updating or refreshing. 
            // It would likely just re-resolve to the same JPA interface package.
        }
    }
    
    /**
     * Unregister the p-units of a given bundle.
     * 
     * @param b the bundle the p-units are in
     */
    public void unregisterPersistenceUnitsInBundle(Bundle b) {
        
        debug("Extender.unregisterPersistenceUnitsInBundle: ", b);
        if (!isAssigned(b)) {
            warning("Unregister called on bundle " + b.getSymbolicName(), " but bundle was not assigned");
            return;
        }
        mgr.unregisterPersistenceUnits(unitsByBundle.get(b));
    }    
    
    /**
     * Refresh the persistence bundle.
     * If persistence units have already been registered they 
     * should have been unregistered before making this refresh call.
     * 
     * @param b the bundle the p-units are in
     */    
    public void refreshBundle(Bundle b) {
        debug("Extender.refreshBundle: ", b);

        // Add the list of currently refreshing bundles. 
        // (It will be removed when the UNRESOLVED event is fired on it)
        addToRefreshingBundles(b);

        // Call refresh on all of the packages
        PackageAdmin admin = getPackageAdmin(mgr.getBundleContext());
        admin.refreshPackages(new Bundle[] { b }); 

        /* New 4.3 code to use to refresh bundle */
        /*
        Bundle systemBundle = mgr.getBundleContext().getBundle(0);
        FrameworkWiring fw = systemBundle.adapt(FrameworkWiring.class);
        fw.refreshBundles(Arrays.asList(b));
        */
    }
    
    public boolean isInLimbo(String bsn) {
        return inLimbo.containsKey(bsn);
    }

    // Remove and return the specified bundle if it is in limbo
    // (i.e. previously found but without a persistence descriptor)
    public Bundle getBundleInLimbo(String bsn) {
        return inLimbo.remove(bsn);
    }


    /*========================*/
    /* BundleListener methods */
    /*========================*/

    public void bundleChanged(BundleEvent event) {

        // Only continue if it is a persistence unit bundle
        Bundle b = event.getBundle();
        debug("Extender - bundle event: ", event);
        if (!isPersistenceUnitBundle(b)) return;

        // Process each event
        int eventType = event.getType();

        if (eventType == BundleEvent.INSTALLED) {
            tryAssigningPersistenceUnitsInBundle(b);

        } else if (eventType == BundleEvent.LAZY_ACTIVATION) {
            if (isAssigned(b)) {
                lazyBundles.add(b.getBundleId()); 
                registerPersistenceUnitsInBundle(b);
            }
        } else if (eventType == BundleEvent.STARTING) {
            if (!isAssigned(b) && !GeminiSystemProperties.refreshPersistenceBundles()) {
                warning("Refreshing disabled - Bundle " + b.getSymbolicName(), " starting - entities may not be woven");
                tryAssigningPersistenceUnitsInBundle(b);
            }
            if (isAssigned(b)) {
                if (!isLazy(b)) {
                    registerPersistenceUnitsInBundle(b);
                }
            }
        } else if (eventType == BundleEvent.STARTED) {
            // If not assigned and not in limbo then this must be the fist time we 
            // have seen it. We need to refresh it to get through our system
            if (!isAssigned(b) && !isInLimbo(b.getSymbolicName())) {
                if (GeminiSystemProperties.refreshPersistenceBundles()) {
                    refreshBundle(b);
                } else {
                    warning("Refreshing disabled - Bundle " + b.getSymbolicName(), " started - entities may not be woven");
                    tryAssigningPersistenceUnitsInBundle(b);
                    if (isAssigned(b) && !isLazy(b)) {
                        registerPersistenceUnitsInBundle(b);
                    }
                }
            }
        } else if (eventType == BundleEvent.STOPPING) {
            if (isAssigned(b)) {
                // Fix for bug #342996
                if (isLazy(b)) {
                    removeFromLazyBundles(b);
                }
                unregisterPersistenceUnitsInBundle(b);
            }
        } else if (eventType == BundleEvent.UNINSTALLED) {
            if (isAssigned(b)) {
                unassignPersistenceUnitsInBundle(b);
            }
        } else if (eventType == BundleEvent.UPDATED) {
            if (isAssigned(b)) {
                unassignPersistenceUnitsInBundle(b);
            }
            tryAssigningPersistenceUnitsInBundle(b);

        } else if (eventType == BundleEvent.UNRESOLVED) {
            if (isRefreshing(b)) {  // assign refreshing bundles
                tryAssigningPersistenceUnitsInBundle(b);
                removeFromRefreshingBundles(b);
            }
        } else {  // RESOLVED, STARTED, STOPPED
            // Do nothing.
        }
    }

    /*================*/
    /* Helper methods */
    /*================*/

    protected boolean isAssigned(Bundle b) {
        return unitsByBundle.containsKey(b);
    }

    protected boolean isLazy(Bundle b) {
        return lazyBundles.contains(b.getBundleId());
    }
    protected boolean addToLazyBundles(Bundle b) {
        return lazyBundles.add(b.getBundleId());
    }
    protected boolean removeFromLazyBundles(Bundle b) {
        return lazyBundles.remove(b.getBundleId());
    }

    protected boolean isRefreshing(Bundle b) {
        return refreshingBundles.contains(b.getBundleId());
    }
    protected void addToRefreshingBundles(Bundle b) {
        refreshingBundles.add(b.getBundleId());
    }
    protected void removeFromRefreshingBundles(Bundle b) {
        refreshingBundles.remove(b.getBundleId());
    }
        
    protected void addToBundleUnits(Map<Bundle,List<PUnitInfo>> map, 
                                    Bundle b, 
                                    PUnitInfo info) {
        synchronized (map) {
            if (!map.containsKey(b))
                map.put(b, new ArrayList<PUnitInfo>());
            List<PUnitInfo> infos = map.get(b);
            if (!infos.contains(info)) 
                infos.add(info);
        }
    }

    public boolean isPersistenceUnitBundle(Bundle b) {
        return b.getHeaders().get("Meta-Persistence") != null;
    }

    public boolean isLazyActivatedBundle(Bundle b) {
        String policy = (String) b.getHeaders().get(Constants.BUNDLE_ACTIVATIONPOLICY);
        return (policy != null) && (policy.equals(Constants.ACTIVATION_LAZY));        
    }
        
    /**
     * Return whether or not the persistence unit bundle
     * has a consistent JPA interface class space with the provider bundle. 
     * This method must be called after both bundles have been resolved.
     */
    public boolean areCompatibleBundles(Bundle pUnitBundle, Bundle providerBundle) {
        try {
            debug("Extender - checking bundle compatibility of: ", pUnitBundle);
            Class<?> pUnitClass = pUnitBundle.loadClass("javax.persistence.Entity");
            Class<?> providerClass = providerBundle.loadClass("javax.persistence.Entity");
            return pUnitClass.getClassLoader() == providerClass.getClassLoader();
        } catch (ClassNotFoundException cnfEx) {
            // If one of the bundles does not have the class in its class space 
            // then by definition the two are consistent w.r.t. that package
            return true;
        } 
    }
}
