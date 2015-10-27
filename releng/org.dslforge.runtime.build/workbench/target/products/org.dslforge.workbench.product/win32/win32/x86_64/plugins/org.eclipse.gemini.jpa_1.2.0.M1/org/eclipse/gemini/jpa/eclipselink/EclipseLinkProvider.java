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
 ******************************************************************************/
package org.eclipse.gemini.jpa.eclipselink;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.gemini.jpa.GeminiManager;
import org.eclipse.gemini.jpa.PUnitInfo;

import org.eclipse.persistence.config.PersistenceUnitProperties;
import org.eclipse.persistence.internal.jpa.deployment.JPAInitializer;
import org.eclipse.persistence.internal.jpa.deployment.PersistenceUnitProcessor;
import org.eclipse.persistence.logging.AbstractSessionLog;
import org.eclipse.persistence.logging.DefaultSessionLog;
import org.eclipse.persistence.logging.SessionLog;

/**
 * We subclass the actual EclipseLink provider so that Gemini JPA has 
 * a way of hooking in its own initializer.
 */
@SuppressWarnings({"rawtypes"})
public class EclipseLinkProvider extends org.eclipse.persistence.jpa.PersistenceProvider {
    
    /*==================*/
    /* Static constants */
    /*==================*/

    public static final String ECLIPSELINK_PROVIDER_CLASS_NAME = "org.eclipse.persistence.jpa.PersistenceProvider";    

    /*================*/
    /* Instance state */
    /*================*/
    
    /** Pointer back to the manager in case we need it */
    GeminiManager mgr;
   
    /** EclipseLink log file */
    private FileWriter eclipseLinkLog;
    
    /*=========================*/
    /* Initialization/shutdown */
    /*=========================*/

    public EclipseLinkProvider(GeminiManager mgr) {
        super();
        this.mgr = mgr;        
    }

    /**
     * This is our chance to initialize any EclipseLink specific stuff
     */
    public void initialize() {
        // Set the static so initializer instances can get stuff from it
        GeminiOSGiInitializer.setManager(mgr);
        
        // Set to our own archive factory
        PersistenceUnitProcessor.setArchiveFactory(new OSGiArchiveFactoryImpl());
        
        // If EL logging property was specified then open the log now?
        openEclipseLinkLogFileIfSpecified();
    }

    /**
     * This is our chance to clean up any EclipseLink specific stuff
     */
    public void shutdown() {
        closeEclipseLinkLogFileIfNecessary();
    }

    /*=============*/
    /* New methods */
    /*=============*/

    // Called during preResolve phase of a persistence bundle
    public void initializeForWeaving(ClassLoader cl, Collection<PUnitInfo> pUnits) {
        GeminiOSGiInitializer initializer = new GeminiOSGiInitializer();        
        initializer.initializeFromBundle(cl, pUnits);
    }
    
    // EclipseLink-specific logging functions 
    protected void openEclipseLinkLogFileIfSpecified() {
        String loggingFile = System.getProperty(PersistenceUnitProperties.LOGGING_FILE);
        try {
            if (loggingFile != null) {
                eclipseLinkLog = new FileWriter(loggingFile);
                AbstractSessionLog.getLog().setWriter(eclipseLinkLog);
            }
        } catch (IOException e) {
            AbstractSessionLog.getLog().log(SessionLog.WARNING, "cmp_init_default_logging_file_is_invalid",loggingFile,e);
        }
    }
    protected void closeEclipseLinkLogFileIfNecessary() {
        // Reset to default
        AbstractSessionLog.setLog(new DefaultSessionLog());
        try {
            if (eclipseLinkLog != null) {
                eclipseLinkLog.close();
            }
        } catch (IOException e) {}
    }

    /*====================*/
    /* Overridden methods */
    /*====================*/

    /**
     * Return JPAInitializer corresponding to the passed classLoader.
     */
    @Override
    public JPAInitializer getInitializer(String emName, Map m){
        final ClassLoader classLoader = getClassLoader(emName, m);
        return new GeminiOSGiInitializer(classLoader);
    }
    
    /*================*/
    /* Helper methods */
    /*================*/

    // Function to return whether the EclipseLink session-name property is set
    public static boolean containsSessionName(Map<?,?> props) {
        return props.containsKey(PersistenceUnitProperties.SESSION_NAME);
    }
}
