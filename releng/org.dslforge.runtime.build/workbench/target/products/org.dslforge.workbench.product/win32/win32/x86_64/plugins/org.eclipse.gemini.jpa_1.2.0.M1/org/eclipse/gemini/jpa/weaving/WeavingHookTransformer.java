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
 *     mkeith - Gemini JPA weaving
 ******************************************************************************/
package org.eclipse.gemini.jpa.weaving;

import java.lang.instrument.IllegalClassFormatException;
import java.util.Arrays;
import java.util.List;

import javax.persistence.spi.ClassTransformer;

import org.osgi.framework.Bundle;
import org.osgi.framework.Version;
import org.osgi.framework.hooks.weaving.WeavingHook;
import org.osgi.framework.hooks.weaving.WovenClass;

import org.eclipse.gemini.jpa.GeminiUtil;


/**
 * Hook called by the framework to give weavers a chance to weave a class
 * before the framework loads and defines it.
 */
public class WeavingHookTransformer implements WeavingHook {

    /*==================*/
    /* Static constants */
    /*==================*/

    // List of imports to be added to a woven bundle.
    static public List<String> NEW_IMPORTS = Arrays.asList("org.eclipse.persistence.indirection" + 
                                                                ";bundle-symbolic-name=org.eclipse.persistence.core" +
                                                                ";bundle-version=2.3.0", 
                                                          "org.eclipse.persistence.queries" + 
                                                                ";bundle-symbolic-name=org.eclipse.persistence.core" +
                                                                ";bundle-version=2.3.0", 
                                                          "org.eclipse.persistence.sessions" + 
                                                                ";bundle-symbolic-name=org.eclipse.persistence.core" +
                                                                ";bundle-version=2.3.0", 
                                                          "org.eclipse.persistence.descriptors.changetracking" + 
                                                                ";bundle-symbolic-name=org.eclipse.persistence.core" +
                                                                ";bundle-version=2.3.0", 
                                                          "org.eclipse.persistence.internal.identitymaps" + 
                                                                ";bundle-symbolic-name=org.eclipse.persistence.core" +
                                                                ";bundle-version=2.3.0", 
                                                          "org.eclipse.persistence.internal.descriptors" + 
                                                                ";bundle-symbolic-name=org.eclipse.persistence.core" +
                                                                ";bundle-version=2.3.0", 
                                                          "org.eclipse.persistence.internal.jpa" + 
                                                                ";bundle-symbolic-name=org.eclipse.persistence.core" +
                                                                ";bundle-version=2.3.0", 
                                                          "org.eclipse.persistence.internal.weaving" +
                                                                ";bundle-symbolic-name=org.eclipse.persistence.core" +
                                                                ";bundle-version=2.3.0");
   
    static public String PACKAGE_IMPORT_FROM_EL_2_4_2 =   "org.eclipse.persistence.internal.jpa.rs.metadata.model" +
                                                                ";bundle-symbolic-name=org.eclipse.persistence.core" +
                                                                ";bundle-version=2.4.2";
    
    static public String CLASS_FROM_EL_2_4_2 = "org.eclipse.persistence.internal.jpa.rs.metadata.model.PersistenceUnit";
    
   
    /*================*/
    /* Instance state */
    /*================*/

    // The EclipseLink transformer that does the actual weaving
    private final ClassTransformer transformer;
    
    // The bundle symbolic name of the bundle we are interested in weaving
    private String bsn;
    
    // The version of the bundle we are interested in weaving
    private Version bundleVersion;
    
    // Flag to indicate if we have already added the dynamic imports
    private boolean importsAdded;
    
    /*==============*/
    /* Constructors */
    /*==============*/
    
    public WeavingHookTransformer(ClassTransformer transformer, String bundleName, Version bundleVersion) {
        this.transformer = transformer;
        this.bsn = bundleName;
        this.bundleVersion = bundleVersion;
        this.importsAdded = false;
    }
    
    /*=========================*/
    /* WeavingHook API methods */
    /*=========================*/

    /**
     * Check to see if we should be weaving this class.
     * If the class comes from the bundle we are looking for then
     * pass it to the native transformer to see if it is in its list of
     * classes to weave.
     * 
     * @param cls Metadata for the candidate class to be woven
     */
    public void weave(WovenClass cls) {

        String clsName = cls.getClassName();
        GeminiUtil.debugWeaving("Gemini WeavingHookTransformer.weave() called on class ", clsName);

        Bundle b = cls.getBundleWiring().getBundle();
        ClassLoader loader = cls.getBundleWiring().getClassLoader();
        
        // Only weave if the class came from the bundle and version this weaver is targeting
        if (bsn.equals(b.getSymbolicName()) && bundleVersion.equals(b.getVersion())) {
            try {
                byte[] transformedBytes = transformer.transform(loader, clsName, null, cls.getProtectionDomain(), cls.getBytes());

                if (transformedBytes == null) {
                    GeminiUtil.debugWeaving(clsName + " considered, but not woven by WeavingHookTransformer"); 
                    return;
                }
                // Weaving happened, so set the classfile to be the woven bytes
                cls.setBytes(transformedBytes);
                GeminiUtil.debugWeaving(clsName + " woven by WeavingHookTransformer"); 

                // Add dynamic imports to packages that are being referenced by woven code
                if (!importsAdded) {
                    // Note: Small window for concurrent weavers to add the same imports, causing duplicates
                    importsAdded = true;
                    List<String> currentImports = cls.getDynamicImports();
                    for (String newImport : NEW_IMPORTS) {
                        if (!currentImports.contains(newImport)) {
                            currentImports.add(newImport);
                            GeminiUtil.debugWeaving("Added dynamic import ", newImport); 
                        }
                    }
                    // Bug #408607 - Try to load class that does not exist in releases before EclipseLink v2.4.2
                    try {
                        this.getClass().getClassLoader().loadClass(CLASS_FROM_EL_2_4_2);
                        // If we can load it then we are running with 2.4.2 or higher so add the extra import
                        currentImports.add(PACKAGE_IMPORT_FROM_EL_2_4_2);
                        GeminiUtil.debugWeaving("Added dynamic import ", PACKAGE_IMPORT_FROM_EL_2_4_2); 
                    } catch (ClassNotFoundException cnfEx) {
                        GeminiUtil.debugWeaving("Didn't add 2.4.2 import ", PACKAGE_IMPORT_FROM_EL_2_4_2); 
                        // Do nothing (i.e. don't add import)
                    }
                }
            } catch (IllegalClassFormatException e) {
                GeminiUtil.warning("Invalid classfile format - Could not weave " + clsName, e);
                throw new RuntimeException(e);
            }
        }
    }
}