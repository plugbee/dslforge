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
 *     mkeith - renamed to GeminiSystemProperties - Mar 28/2012
 ******************************************************************************/
package org.eclipse.gemini.jpa;

/**
 * System properties recognized by Gemini.
 */
public class GeminiSystemProperties {
    
    /*==================*/
    /* Static constants */
    /*==================*/
    
    /*=== System properties that can be passed in on the command line or set globally ===*/

    // Set if anchor classes are to be generated and added to 
    // the generated fragment. GENERATE_FRAGMENTS must also be set 
    // for this option to be enabled
    // ### Not supported yet ###
    public static String GENERATE_ANCHOR_CLASSES = "GENERATE_ANCHORS";
    public static String GENERATE_ANCHOR_CLASSES_DEFAULT = "FALSE";
    
    // Set if a fragment is to be generated and attached to each 
    // persistence unit bundle
    // ### Not supported yet ###
    public static String GENERATE_FRAGMENTS = "GENERATE_FRAGMENTS";
    public static String GENERATE_FRAGMENTS_DEFAULT = "FALSE";

    // Set if a fragment is to be generated and attached to each 
    // persistence unit bundle
    public static String REFRESH_BUNDLES = "REFRESH_BUNDLES";
    public static String REFRESH_BUNDLES_DEFAULT = "TRUE";
    
    // Set to debug XML parsing
    public static String DEBUG_XML = "GEMINI_DEBUG_XML";

    // Set to debug weaving
    public static String DEBUG_WEAVING = "GEMINI_DEBUG_WEAVING";
    
    // Set to debug classloading 
    public static String DEBUG_CLASSLOADER = "GEMINI_DEBUG_CLASSLOADER";
        
    // Set to output general debugging info 
    public static String DEBUG = "GEMINI_DEBUG";

    /*==============*/
    /* Static state */
    /*==============*/
    
    protected static Boolean generateAnchorClasses;
    protected static Boolean generateFragments;
    protected static Boolean refreshPersistenceBundles;
    protected static Boolean debugXml;
    protected static Boolean debugClassloader;
    protected static Boolean debugWeaving;
    protected static Boolean debug;
    
    /*==================*/
    /* Property methods */
    /*==================*/

    /* 
     * Return whether anchor classes are to be generated
     */
    public static boolean generateAnchorClasses() { 
        // ### Feature not supported yet. ###
        generateAnchorClasses = false;
        
        if (generateAnchorClasses == null) {
            String value = System.getProperty(GENERATE_ANCHOR_CLASSES, GENERATE_ANCHOR_CLASSES_DEFAULT);
            generateAnchorClasses = Boolean.valueOf(value);
            // If anchors configured to be generated then force fragment gen as well
            if (generateAnchorClasses) 
                generateFragments = true;
        }
        return generateAnchorClasses && generateFragments();
    }

    /* 
     * Set whether anchor classes are to be generated
     */
    public static void setGenerateAnchorClasses(boolean value) { 
        // ### Feature not supported yet. ###
        throw new UnsupportedOperationException("Not supported at this time");
        // generateAnchorClasses = value; 
    }
    
    /*
     * Return whether fragments are to be generated
     */
    public static boolean generateFragments() { 
        // ### Feature not supported yet. ###
        generateFragments = false;
        
        if (generateFragments == null) {
            String value = System.getProperty(GENERATE_FRAGMENTS, GENERATE_FRAGMENTS_DEFAULT);
            generateFragments = Boolean.valueOf(value);
        }
        return generateFragments;
    }

    /*
     * Set whether fragments are to be generated
     */
    public static void setGenerateFragments(boolean value) { 
        // ### Feature not supported yet. ###
        throw new UnsupportedOperationException("Not supported at this time");
        // generateFragments = value; 
    }

    /*
     * Return whether persistence unit bundles that were found to be already installed 
     * should be refreshed. This should only be disabled when the provider does not need 
     * to do anything pre-resolve time (such as weaving).
     */
    public static boolean refreshPersistenceBundles() { 
        if (refreshPersistenceBundles == null) {
            String value = System.getProperty(REFRESH_BUNDLES, REFRESH_BUNDLES_DEFAULT);
            refreshPersistenceBundles = Boolean.valueOf(value);
        }
        return refreshPersistenceBundles;
    }

    /* 
     * Set whether bundles are to be refreshed when already installed
     */
    public static void setRefreshPersistenceBundles(boolean value) { refreshPersistenceBundles = value; }

    /* 
     * Return whether debugging is enabled for XML parsing 
     */
    public static boolean debugXml() { 
        if (debugXml == null) {
            String value = System.getProperty(DEBUG_XML);
            // Any value will cause debugging to be enabled
            debugXml = (value != null);
        }
        return debugXml;
    }

    /* 
     * Set whether debugging is enabled for XML parsing
     */
    public static void setDebugXml(boolean value) { debugXml = value; }

    /* 
     * Return whether debugging is enabled for classloading
     */
    public static boolean debugClassloader() { 
        if (debugClassloader == null) {
            String value = System.getProperty(DEBUG_CLASSLOADER);
            // Any value will cause debugging to be enabled
            debugClassloader = (value != null);
        }
        return debugClassloader;
    }

    /* 
     * Set whether debugging is enabled for classloading
     */
    public static void setDebugClassloader(boolean value) { debugClassloader = value; }

    /* 
     * Return whether debugging is enabled for weaving
     */
    public static boolean debugWeaving() { 
        if (debugWeaving == null) {
            String value = System.getProperty(DEBUG_WEAVING);
            // Any value will cause debugging to be enabled
            debugWeaving = (value != null);
        }
        return debugWeaving;
    }

    /* 
     * Set whether debugging is enabled for weaving
     */
    public static void setDebugWeaving(boolean value) { debugWeaving = value; }

    /* 
     * Return whether general debugging is enabled
     */
    public static boolean debug() { 
        if (debug == null) {
            String value = System.getProperty(DEBUG);
            // Any value will cause debugging to be enabled
            debug = (value != null);
        }
        return debug;
    }

    /* 
     * Set whether general debugging is enabled
     */
    public static void setDebug(boolean value) { debug = value; }

}