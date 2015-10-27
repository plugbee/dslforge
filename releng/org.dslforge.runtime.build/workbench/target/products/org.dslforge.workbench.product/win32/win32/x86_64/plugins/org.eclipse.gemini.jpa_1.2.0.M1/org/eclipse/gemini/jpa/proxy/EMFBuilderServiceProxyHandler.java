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
package org.eclipse.gemini.jpa.proxy;

import static org.eclipse.gemini.jpa.GeminiUtil.JPA_JDBC_DRIVER_PROPERTY;
import static org.eclipse.gemini.jpa.GeminiUtil.JPA_JDBC_URL_PROPERTY;
import static org.eclipse.gemini.jpa.GeminiUtil.debug;
import static org.eclipse.gemini.jpa.GeminiUtil.warning;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;

import org.eclipse.gemini.jpa.PUnitInfo;
import org.eclipse.gemini.jpa.eclipselink.EclipseLinkProvider;

/**
 * Dynamic proxy class to proxy the EMFBuilder service
 */
@SuppressWarnings({"unchecked"})
public class EMFBuilderServiceProxyHandler extends EMFServiceProxyHandler
                                           implements InvocationHandler {

    // Keep around a copy of the props used to create an EMF through the EMF builder
    Map<String,Object> emfProps = new HashMap<String,Object>();
            
    public EMFBuilderServiceProxyHandler(PUnitInfo pUnitInfo,
                                         EMFServiceProxyHandler emfService) {
        super(pUnitInfo);
    }

    /*=========================*/
    /* InvocationProxy methods */
    /*=========================*/

    // Will only get calls for the method on the EntityManagerFactoryBuilder interface
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        debug("EMFBuilderProxy invocation on method ", method.getName());

        if (method.getName().equals("hashCode"))
            return this.hashCode();
        if (method.getName().equals("equals"))
            return this.equals(args[0]);
        if (method.getName().equals("toString"))
            return this.toString();

        // Must be a createEntityManagerFactory(Map) call

        // The first arg should be the properties Map
        Map<String,Object> props = null;
        try {
            props = (Map<String,Object>)args[0];
        } catch (ClassCastException ccEx) {
            // Was some unexpected call, return null
            warning("EMFBuilderProxy cannot handle method ", method.getName());
            return null;
        }
        
        // If EclipseLink SESSION_NAME property specified then just create and return an EMF
        // NOTE: This will return an EMF that is not managed by Gemini.
        //       The caller will be responsible for managing it.
        if (EclipseLinkProvider.containsSessionName(props)) {
                // Let EclipseLink do its thing and create an EMF. Just return it.
                debug("EMFBuilder found Eclipselink session name property - returning unmanaged EMF for props ", props);
                return super.createEMF(props);
        }
        
        // If we have an EMF and it has already been closed, discard it
        EntityManagerFactory emf;
        synchronized (pUnitInfo) {
            emf = pUnitInfo.getEmf();
            if ((emf != null) && (!emf.isOpen())) {
                syncUnsetEMF();
                emfProps.clear();
                emf = null;
            }
        }
        
        // Check if an EMF already exists 
        if (emf != null) {

            // Verify the JDBC properties match the ones that may have been previously passed in
            verifyJDBCProperties((String) emfProps.get(JPA_JDBC_DRIVER_PROPERTY),
                                 (String) emfProps.get(JPA_JDBC_URL_PROPERTY),
                                 props);

            // If it was created using the builder service then just return it
            if (pUnitInfo.isEmfSetByBuilderService()) {
                return emf;
            }

            // It was created using the EMF service.
            // Verify the JDBC properties match the ones in the descriptor.
            verifyJDBCProperties(pUnitInfo.getDriverClassName(), 
                                 pUnitInfo.getDriverUrl(), 
                                 props);
            return emf;
        } else {
            // No EMF service existed; create another 
            return syncGetEMFAndSetIfAbsent(true, props);
        }
    }

    /*================*/
    /* Helper methods */
    /*================*/
    
    public EntityManagerFactory createEMF(Map<String,Object> props) {

        emfProps = props;
        return super.createEMF(props);
    }

    // Local method to compare properties passed in Map to ones in persistence descriptor or in previously set props
    protected void verifyJDBCProperties(String driver, String driverUrl, Map<String,Object> props) {

        if (driver != null) {
            String propDriver = (String) props.get(JPA_JDBC_DRIVER_PROPERTY);
            if ((propDriver != null) && !driver.equals(propDriver)) {
                throw new IllegalArgumentException();
            }
        }
        if (driverUrl != null) {
            String propUrl = (String) props.get(JPA_JDBC_URL_PROPERTY);
            if ((propUrl != null) && !driverUrl.equals(propUrl)) {
                throw new IllegalArgumentException();
            }
        }
    }
}        
