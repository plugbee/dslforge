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
 *     ssmith - EclipseLink integration
 ******************************************************************************/
package org.eclipse.gemini.jpa;

import static org.eclipse.gemini.jpa.GeminiUtil.debug;
import static org.eclipse.gemini.jpa.GeminiUtil.warning;
import static org.eclipse.gemini.jpa.GeminiUtil.fatalError;
import static org.eclipse.gemini.jpa.GeminiUtil.PUNIT_INFO_PROPERTY;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.sql.DataSource;

import javax.persistence.EntityManagerFactory;
import javax.persistence.spi.PersistenceProvider;
import javax.persistence.spi.PersistenceUnitInfo;
import javax.persistence.spi.ProviderUtil;

import org.osgi.framework.BundleContext;

import org.eclipse.persistence.config.PersistenceUnitProperties;

import org.eclipse.gemini.jpa.GeminiManager;
import org.eclipse.gemini.jpa.PUnitInfo;
import org.eclipse.gemini.jpa.classloader.CompositeClassLoader;
import org.eclipse.gemini.jpa.eclipselink.EclipseLinkProvider;


/**
 * Wrapper class to process provider calls and fill in necessary information before passing on
 * to native EclipseLink provider class.
 */
@SuppressWarnings({"rawtypes","unchecked"})
public class ProviderWrapper implements PersistenceProvider {
        
    /*=============*/
    /* Local state */
    /*=============*/
    
    /** Native EclipseLink SPI provider instance */
    EclipseLinkProvider nativeProvider;
    
    /** Pointer back to the manager */
    GeminiManager mgr;

    /*=========================*/
    /* Initialization/shutdown */
    /*=========================*/

    public void initialize(GeminiManager mgr) throws Exception {
        
        this.mgr = mgr; 
        // Create a native EclipseLink provider
        nativeProvider = new EclipseLinkProvider(mgr);
        nativeProvider.initialize();
    }
    
    public void shutdown(BundleContext context) throws Exception {        
        nativeProvider.shutdown();        
    }
    
    /*=============================*/
    /* PersistenceProvider methods */
    /*=============================*/
    
    /**
     * Intercept calls to the EclipseLink JPA provider so we can insert 
     * classloader, data source and descriptor properties that can be used by
     * EclipseLink to sort things out.
     */
    @Override
    public EntityManagerFactory createEntityManagerFactory(String emName, Map properties) {
        
        debug("ProviderWrapper createEMF invoked for p-unit: ", emName, " props: ", properties);

        PUnitInfo unitInfo = mgr.getPUnitsByName().get(emName);
        if (unitInfo == null)
            fatalError("createEntityManagerFactory() called on provider, but punit has not been registered: ", null);

        // Create a new properties map and put all of the properties in it
        Map<String,Object> props = new HashMap<String,Object>();
        // First the props from config admin if any are there
        if (unitInfo.getConfigProperties() != null) {
            props.putAll(unitInfo.getConfigProperties());
        }
        // Now the props passed into this createEMF call (may overwrite config admin props)
        if (properties != null) {
            props.putAll(properties); 
        }
        
        // Create a composite loader that loads from the punit bundle and the provider bundle
        CompositeClassLoader compositeLoader = CompositeClassLoader.createCompositeLoader(
                mgr.getBundleContext(), 
                unitInfo.getBundle());
        // Bug 385170 - If user supplies a classloader then tack it on the front
        if (props.containsKey(PersistenceUnitProperties.CLASSLOADER)) {
            ClassLoader userLoader = (ClassLoader) props.get(PersistenceUnitProperties.CLASSLOADER);
            compositeLoader.getClassLoaders().add(0, userLoader);
        }
        props.put(PersistenceUnitProperties.CLASSLOADER, compositeLoader);

        // Pass in the data source as a property
        DataSource ds = mgr.getDataSourceUtil().acquireDataSource(unitInfo, properties);
        if (ds != null) 
            props.put(PersistenceUnitProperties.NON_JTA_DATASOURCE, ds);
        
        // Specify the name and location of the persistence descriptor
        props.put(PersistenceUnitProperties.ECLIPSELINK_PERSISTENCE_XML, fullDescriptorPath(unitInfo));

        // Put in a private property that we can use later on in the call stack to get the punit info
        props.put(PUNIT_INFO_PROPERTY, unitInfo);

        // Now make the call
        EntityManagerFactory emf = nativeProvider.createEntityManagerFactory(emName, props);
        return emf;
    }

    @Override
    public ProviderUtil getProviderUtil() { 
        debug("ProviderWrapper getProviderUtil invoked");
        return nativeProvider.getProviderUtil(); 
    }

    // @Override - Leave off annotation so can compile against pre-JPA 2.1
    public boolean generateSchema(String unitName, Map properties) {
        debug("ProviderWrapper generateSchema invoked for p-unit: ", unitName, " props: ", properties);
        warning("The generateSchema() method is not currently supported by OSGi JPA");
        return false;
    }

    /**
     * Container SPI methods not supported.
     */
    
    @Override
    public EntityManagerFactory createContainerEntityManagerFactory(PersistenceUnitInfo info, Map properties) {        
        fatalError("Container SPI not supported by OSGi JPA", null);
        return null;
    }

    // @Override - Leave off annotation so can compile against pre-JPA 2.1
    public void generateSchema(PersistenceUnitInfo info, Map properties) {
        fatalError("Container SPI not supported by OSGi JPA", null);        
    }

    /*================*/
    /* Helper methods */
    /*================*/

    // Called during preResolve phase of a persistence bundle
    protected void initializeForWeaving(ClassLoader cl, Collection<PUnitInfo> pUnits) {
        nativeProvider.initializeForWeaving(cl, pUnits);
    }

    protected String fullDescriptorPath(PUnitInfo pUnitInfo) {
        return pUnitInfo.getDescriptorInfo().fullDescriptorPath();
    }
}