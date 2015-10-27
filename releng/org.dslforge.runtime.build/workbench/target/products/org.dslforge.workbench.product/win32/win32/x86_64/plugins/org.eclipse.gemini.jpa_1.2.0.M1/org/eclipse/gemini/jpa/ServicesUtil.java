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

import static org.eclipse.gemini.jpa.GeminiUtil.bundleVersion;
import static org.eclipse.gemini.jpa.GeminiUtil.debug;
import static org.eclipse.gemini.jpa.GeminiUtil.debugClassLoader;
import static org.eclipse.gemini.jpa.GeminiUtil.fatalError;
import static org.eclipse.gemini.jpa.GeminiUtil.warning;
import static org.eclipse.gemini.jpa.eclipselink.EclipseLinkProvider.ECLIPSELINK_PROVIDER_CLASS_NAME;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.eclipse.gemini.jpa.classloader.BundleProxyClassLoader;
import org.eclipse.gemini.jpa.classloader.CompositeClassLoader;
import org.eclipse.gemini.jpa.proxy.EMFBuilderServiceProxyHandler;
import org.eclipse.gemini.jpa.proxy.EMFServiceProxyHandler;
import org.eclipse.gemini.jpa.weaving.WeavingHookTransformer;
import org.osgi.framework.Bundle;
import org.osgi.framework.ServiceRegistration;
import org.osgi.framework.hooks.weaving.WeavingHook;
import org.osgi.framework.wiring.BundleWiring;


/**
 * This singleton class provides functionality to handle service registration of 
 * persistence units and the provider.
 */
@SuppressWarnings({"rawtypes"})
public class ServicesUtil {

    // Pointer back to the mgr
    GeminiManager mgr;
    
    // Keep this for logging convenience
    String providerClassName;
   
    // PersistenceProvider service
    ServiceRegistration providerService;
    
    public ServicesUtil(GeminiManager mgr) {
        this.mgr = mgr;
        this.providerClassName = ECLIPSELINK_PROVIDER_CLASS_NAME;
    }
    
    /*==================*/
    /* Services methods */
    /*==================*/
    
    /**
     * Register the provider as a persistence provider service.
     * The service registration will be stored locally.
     */
    public void registerProviderService() {
        
        debug("ServicesUtil.RegisterProviderService for ", providerClassName);

        // Service strings
        String[] serviceNames = { javax.persistence.spi.PersistenceProvider.class.getName() };
        // Get a provider JPA SPI instance 
        javax.persistence.spi.PersistenceProvider persistenceProvider = mgr.getProvider();

        // Store the version of the provider as a service property
        String version = bundleVersion(mgr.getBundle());
        Dictionary<String,String> props = new Hashtable<String,String>();
        props.put(GeminiUtil.OSGI_JPA_PROVIDER_VERSION_PROPERTY, version);
        props.put(GeminiUtil.JPA_PROVIDER_PROPERTY, providerClassName);
        
        
        // Register the provider service
        providerService = mgr.getBundleContext().registerService(
                serviceNames, persistenceProvider, props);
        debug("ServicesUtil successfully registered provider service for ", providerClassName);
    }    

    /**
     * Unregister the provider service. 
     */
    public void unregisterProviderService() {

        debug("ServicesUtil.unregisterProviderService for ", providerClassName);
        providerService.unregister();
        providerService = null;
        debug("ServicesUtil successfully un-registered provider service for ", providerClassName);
    }

    /**
     * Register a weaving hook whiteboard service.
     * Called by the GeminiOSGiInitializer.registerTransformer method.
     * The service registration will be stored locally.
     */
    public void registerWeavingHookService(WeavingHookTransformer weaver, PUnitInfo pUnitInfo) {
        
        GeminiUtil.debugWeaving("ServicesUtil.registerWeavingHookService for punit ", pUnitInfo.getUnitName());
        Hashtable<String,Object> props = new Hashtable<String,Object>(); 
        props.put("osgi.unit.name", pUnitInfo.getUnitName());
        
        ServiceRegistration svcReg = mgr.getBundleContext().registerService(WeavingHook.class.getName(), weaver, props);  
        pUnitInfo.setWeavingHookService(svcReg);
        debug("ServicesUtil successfully registered weaving hook for ", pUnitInfo.getUnitName());
    }    

    /**
     * Unregister the weaving hook whiteboard service.
     */
    public void unregisterWeavingHookService(PUnitInfo pUnitInfo) {

        debug("ServicesUtil.unregisterWeavingHookService for ", pUnitInfo.getUnitName());
        ServiceRegistration svcReg = pUnitInfo.getWeavingHookService();
        if (svcReg != null) {
            svcReg.unregister();
            pUnitInfo.setWeavingHookService(null);
            debug("ServicesUtil successfully un-registered weaving hook for ", pUnitInfo.getUnitName());
        }
    }

    /**
     * Register the EMF and EMFBuilder services.
     */
    public void registerEMFServices(PUnitInfo pUnitInfo) {

        debug("ServicesUtil.registerEMFServices for ", pUnitInfo.getUnitName());

        // Map of generated anchor classes keyed by class name
        Map<String, Class<?>> anchorClasses; 
        
        // Will be empty if anchor classes not generated
        anchorClasses = mgr.getAnchorUtil().loadAnchorClasses(pUnitInfo);

        // Create the properties used for both services
        Dictionary<String,String> props = buildServiceProperties(pUnitInfo);
        
        // Try to register the EMF service (it will only occur if data source is available)
        tryToRegisterEMFService(pUnitInfo, anchorClasses, props);                

        // Create a builder service in any case
        registerEMFBuilderService(pUnitInfo, anchorClasses, props);
    }

    /**
     * Unregister whatever EMF and EMFBuilder services are registered.
     */
    public void unregisterEMFServices(PUnitInfo pUnitInfo) {

        unregisterEMFService(pUnitInfo);
        unregisterEMFBuilderService(pUnitInfo);
    }

    /** 
     * Register the EMF service if we have a hope of connecting to the DB 
     * 
     * @param pUnitInfo The metadata info for the persistence unit
     * @param anchorClasses Set of classes to be proxied and the service is to be registered against 
     * @param serviceProps Service properties to use when registering the service
     */
    public void tryToRegisterEMFService(PUnitInfo pUnitInfo,
                                        Map<String,Class<?>> anchorClasses,
                                        Dictionary<String,String> serviceProps) {

        debug("ServicesUtil.tryToRegisterEMF service for ", pUnitInfo.getUnitName());
        // Array of classes being proxied by EMF proxy
        Collection<Class<?>> proxiedClasses = new ArrayList<Class<?>>();

        // Load the EMF class
        Class<?> emfClass = GeminiUtil.loadClassFromBundle("javax.persistence.EntityManagerFactory",
                                                           mgr.getBundle());
        
        // Add EMF class and anchor classes to the proxied class collection for EMF proxy
        proxiedClasses.addAll(anchorClasses.values());
        proxiedClasses.add(emfClass);
        Class<?>[] classArray = proxiedClasses.toArray(new Class[0]);
        debug("ServicesUtil EMF proxy class array: ", classArray);
        
        // Get a loader to load the proxy classes
        ClassLoader loader = proxyLoader(pUnitInfo, anchorClasses, emfClass);

        // Create proxy impl object for EMF service
        Object emfServiceProxy = createEMFProxy(pUnitInfo, loader, classArray);

        // Do we create an EMF service?
        String driverClassName = pUnitInfo.getDriverClassName();
        String nonJtaDataSource = pUnitInfo.getNonJtaDataSource();
        
        if ((driverClassName == null) && (nonJtaDataSource == null)) {
            debug("ServicesUtil - No driver class or data source specified so no EMF service created");
            return;
        } 
        // Either a driver class or a data source was specified
        // (If both then non-jta data source overrides)
        
        if (nonJtaDataSource != null) {
            // We must have a non-jta data source string
            DataSource ds = mgr.getJndiUtil().lookupDataSource(nonJtaDataSource);
            if (ds == null) {
                warning("Non-JTA data source " + nonJtaDataSource + " was not found. EMF service not registered.");
                return;
            } else {
                pUnitInfo.setJndiDataSource(ds);
            }
        } else {
            // We must have a driver class. 
            // Either a DSF service exists for the driver or the driver is local
            if (!mgr.getDataSourceUtil().trackDataSourceFactory(pUnitInfo)) {
                // DSF service was not found.
                debug("DataSourceFactory service for " + driverClassName + " not found.");
                // Driver may be local (packaged in with the p-unit) -- try loading it
                try {
                    pUnitInfo.getBundle().loadClass(driverClassName);
                    debug("JDBC driver " + driverClassName + " found locally.");
                    // We found the driver in the punit. Stop tracking DBAccess service and revert to direct access
                    mgr.getDataSourceUtil().stopTrackingDataSourceFactory(pUnitInfo);
                } catch (ClassNotFoundException cnfEx) {
                    // Driver not local, bail and wait for the tracker to detect DBAccess service
                    debug("JDBC driver " + driverClassName + " was not found locally.");
                    warning("DataSourceFactory service for " + driverClassName + " was not found. EMF service not registered.");
                    return;
                }
            }
        }
        
        /* === We have some kind of data source or factory. === */ 
        /* === Go ahead and register the EMF service.       === */
        
        // Convert array of classes to class name strings
        String[] classNameArray = new String[classArray.length];
        for (int i=0; i<classArray.length; i++)
            classNameArray[i] = classArray[i].getName();

        // Register the EMF service (using p-unit context) and set registration in PUnitInfo
        ServiceRegistration emfService = null;
        try {
            emfService = pUnitInfo.getBundle().getBundleContext()
                           .registerService(classNameArray, emfServiceProxy, serviceProps);
            debug("ServicesUtil EMF service: ", emfService);
        } catch (Exception e) {
            fatalError("ServicesUtil could not register EMF service for " + pUnitInfo.getUnitName(), e);
        }
        pUnitInfo.setEmfService(emfService);
    }
    
    /** 
     * Register the EMFBuilder service.
     */
    public void registerEMFBuilderService(PUnitInfo pUnitInfo,
                                          Map<String,Class<?>> anchorClasses,
                                          Dictionary<String,String> props) {
    
        debug("ServicesUtil.registerEMFBuilder service for ", pUnitInfo.getUnitName());
        // Array of classes being proxied by EMFBuilder proxy
        Collection<Class<?>> proxiedClasses = new ArrayList<Class<?>>();

        // Load the EMFB class
        Class<?> emfBuilderClass = GeminiUtil.loadClassFromBundle("org.osgi.service.jpa.EntityManagerFactoryBuilder",
                                                                  mgr.getBundle());

        // Add EMF class and anchor classes to the proxied class collection for EMF proxy
        proxiedClasses.addAll(anchorClasses.values());
        proxiedClasses.add(emfBuilderClass);
        debug("ServicesUtil EMFBuilder proxied classes: ", proxiedClasses);
        Class<?>[] classArray = proxiedClasses.toArray(new Class[0]);
        
        // Get a loader to load the proxy classes
        ClassLoader loader = proxyLoader(pUnitInfo, anchorClasses, emfBuilderClass);

        // Create proxy impl object for EMF service
        Object emfBuilderServiceProxy = createEMFBuilderProxy(pUnitInfo, loader, classArray);

        // Convert array of classes to class name strings
        String[] classNameArray = new String[classArray.length];
        for (int i=0; i<classArray.length; i++)
            classNameArray[i] = classArray[i].getName();
    
        //Register the EMFBuilder service and set it in the PUnitInfo
        ServiceRegistration emfBuilderService = null;
        try {
            // TODO Should be registered by p-unit context, not provider context
            // emfBuilderService = pUnitInfo.getBundle().getBundleContext()
            emfBuilderService = mgr.getBundleContext()
                    .registerService(classNameArray, emfBuilderServiceProxy, props);
            debug("ServicesUtil EMFBuilder service: ", emfBuilderService);
        } catch (Exception e) {
            fatalError("ServicesUtil could not register EMFBuilder service for " + pUnitInfo.getUnitName(), e);
        }
        pUnitInfo.setEmfBuilderService(emfBuilderService);
    }    

    /**
     * Unregister the EMF service if there was an EMF service registered.
     * Clean up any resources the service may have allocated.
     * 
     * @param pUnitInfo
     */
    public void unregisterEMFService(PUnitInfo pUnitInfo) {

        debug("ServicesUtil.unregisterEMFService for ", pUnitInfo.getUnitName());

        // If the tracking service is going, stop it
        // Note: By stopping the tracker now we will not be able to handle a 
        //       DSF that comes and goes; only one that comes for the first time
        mgr.getDataSourceUtil().stopTrackingDataSourceFactory(pUnitInfo);

        // If an EMF service is registered then unregister it
        ServiceRegistration emfService = pUnitInfo.getEmfService();
        if (emfService != null) {
            debug("ServicesUtil un-registering EMF service for ", pUnitInfo.getUnitName());
            try { 
                emfService.unregister(); 
            } catch (Exception e) {
                warning("Error unregistering EMF service: ", e);
            }
            debug("ServicesUtil un-registered EMF service for ", pUnitInfo.getUnitName());
            pUnitInfo.setEmfService(null);
        }

        // If an EMF exists because we created one then we close and remove it
        EntityManagerFactory emf = pUnitInfo.getEmf();
        if ((emf != null) && (!pUnitInfo.isEmfSetByBuilderService())) {
            if (emf.isOpen()) emf.close();
            pUnitInfo.getEmfHandler().syncUnsetEMF();
            debug("ServicesUtil EMF service removed EMF: ", emf);
        }
        pUnitInfo.setEmfHandler(null);
        pUnitInfo.setJndiDataSource(null);
    }

    /**
     * Unregister the EMFBuilder service.
     * Clean up any resources the service may have allocated.
     * 
     * @param pUnitInfo
     */
    public void unregisterEMFBuilderService(PUnitInfo pUnitInfo) {

        debug("ServicesUtil.unregisterEMFBuilderService for ", pUnitInfo.getUnitName());

        // Unregister the service
        ServiceRegistration emfBuilderService = pUnitInfo.getEmfBuilderService();
        if (emfBuilderService != null) {
            debug("ServicesUtil un-registering EMFBuilder service for ", pUnitInfo.getUnitName());
            try {
                emfBuilderService.unregister();
            } catch (Exception e) {
                warning("Error un-registering EMFBuilder service: ", e);
            }
            debug("ServicesUtil un-registered EMFBuilder service for ", pUnitInfo.getUnitName());
            pUnitInfo.setEmfBuilderService(null);
        }

        // Close the EMF if one still exists and clear out the handler
        EntityManagerFactory emf = pUnitInfo.getEmf();
        if (emf != null) {
            if (emf.isOpen()) emf.close();
            pUnitInfo.getEmfBuilderHandler().syncUnsetEMF();
            debug("ServicesUtil EMFBuilder service removed emf: ", emf);
        }
        pUnitInfo.setEmfBuilderHandler(null);
    }    
    
    /*================*/
    /* Helper methods */
    /*================*/
        
    /**
     * Get or create a loader to load classes from the punit.
     * A sequence of conditions provides a pattern for obtaining it.
     */
    ClassLoader extractPUnitLoader(PUnitInfo pUnitInfo, 
                                   Map<String, Class<?>> anchorClasses) {
    
        ClassLoader pUnitLoader = null;
        
        // 1. If there are any anchor classes then load one and get its loader
        if (!anchorClasses.isEmpty()) {
            pUnitLoader = anchorClasses.values().iterator().next().getClassLoader();

        // 2. Otherwise, if there are managed JPA classes listed, use one to get the loader
        } else if (!pUnitInfo.getClasses().isEmpty()) {
            try { 
                pUnitLoader = pUnitInfo.getBundle().loadClass((String)(pUnitInfo.getClasses().toArray()[0])).getClassLoader();
            } catch (ClassNotFoundException cnfEx) {
                fatalError("Could not load domain class in p-unit", cnfEx);
            }
            
        // 3. If all else fails just use a proxy loader
        } else {
            pUnitLoader = new BundleProxyClassLoader(pUnitInfo.getBundle());
        }
        debug("ServicesUtil pUnit loader ", pUnitLoader);
        return pUnitLoader;
    }

    /**
     * Get or create a loader to use to create a proxy class.
     */
    ClassLoader proxyLoader(PUnitInfo pUnitInfo,
                            Map<String, Class<?>> anchorClasses, 
                            Class<?> jpaClass) {
        
        ClassLoader cl = null;

        // If there are no managed JPA classes listed, return loader used to load the class passed in
        if (pUnitInfo.getClasses().isEmpty()) {
            cl = jpaClass.getClassLoader();
        } else if (!anchorClasses.isEmpty()) {
            // If anchor classes exist then get a loader from one of them
            cl = anchorClasses.values().iterator().next().getClassLoader();
        } else {
            try {
                // We have domain classes, but no anchor classes were generated.
                BundleWiring bw = pUnitInfo.getBundle().adapt(BundleWiring.class);
                // Get the punit loader
                ClassLoader pUnitLoader = (bw != null) 
                        ? bw.getClassLoader()
                        // Last ditch effort - load a domain class and get its loader        
                        : pUnitInfo.getBundle().loadClass((String)(pUnitInfo.getClasses().toArray()[0])).getClassLoader();
                ClassLoader jpaClassLoader = jpaClass.getClassLoader();
                // Combine the punit loader with the provider loader.
                cl = (pUnitLoader == jpaClassLoader) 
                    ? jpaClassLoader 
                    : new CompositeClassLoader(pUnitLoader, jpaClassLoader);
            } catch (ClassNotFoundException cnfEx) {
                fatalError("Could not load domain class in p-unit", cnfEx);
            }
        }
        debugClassLoader("ServicesUtil proxy loader ", cl);
        return cl;
    }

    /** 
     * Create and return a proxy for the EMF (and specified list of classes
     * which must include the EMF class).
     */
    Object createEMFProxy(PUnitInfo pUnitInfo, ClassLoader loader, Class<?>[] clsArray) {

        EMFServiceProxyHandler emfProxyHandler = new EMFServiceProxyHandler(pUnitInfo);
        Object result = null;
        try {
            result = Proxy.newProxyInstance(loader, clsArray, emfProxyHandler);
            debug("ServicesUtil created EMF proxy ");
        } catch (Exception e) { 
            fatalError("ServicesUtil - Failed to create proxy for EMF service: ", e); 
        }
        pUnitInfo.setEmfHandler(emfProxyHandler);
        return result;
    }
    
    /** 
     * Create and return a proxy for the EMFBuilder (and specified list of classes
     * which must include the EMFBuilder class).
     */
    Object createEMFBuilderProxy(PUnitInfo pUnitInfo, 
                                        ClassLoader loader, 
                                        Class<?>[] clsArray) {
        
        // Assume that EMF proxy handler has been created and is stored in pUnitInfo
        EMFBuilderServiceProxyHandler emfBuilderProxyHandler = 
            new EMFBuilderServiceProxyHandler(pUnitInfo, pUnitInfo.getEmfHandler());
        Object result = null;
        try {
            result = Proxy.newProxyInstance(loader, clsArray, emfBuilderProxyHandler);
            debug("ServicesUtil created EMFBuilder proxy ");
        } catch (Exception e) { 
            fatalError("ServicesUtil - Failed to create proxy for EMFBuilder service: ", e); 
        }
        pUnitInfo.setEmfBuilderHandler(emfBuilderProxyHandler);
        return result;
    }
    
    /** 
     * Build the list of service properties for the service.
     */
    public Dictionary<String,String> buildServiceProperties(PUnitInfo pUnitInfo) {

        Bundle pUnitBundle = pUnitInfo.getBundle();
        // Assemble the properties
        Dictionary<String,String> props = new Hashtable<String,String>();
        props.put("osgi.unit.name", pUnitInfo.getUnitName());
        props.put("osgi.unit.version", bundleVersion(pUnitInfo.getBundle()));
        props.put("osgi.unit.provider", providerClassName);
        // For now, only support punits composed of one bundle
        String bundleId = pUnitBundle.getSymbolicName() + "_" + bundleVersion(pUnitBundle);
        props.put("osgi.managed.bundles", bundleId);
        debug("ServicesUtil.buildServiceProps: ", props);
        return props;
    }
}