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

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

import static org.eclipse.gemini.jpa.GeminiUtil.*;

/**
 * Utility class to do all the work to create and install a fragment, 
 * including manifest generation.
 */
public class FragmentUtil {

    /*==================*/
    /* Static constants */
    /*==================*/
    
    // Fragment prefix of generated fragment 
    public static final String FRAGMENT_PREFIX = "jpa$fragment.";
    
    /*================*/
    /* Instance state */
    /*================*/

    // Fragment will be installed using provider context
    Bundle providerBundle;
    
    /*==============*/
    /* Constructors */
    /*==============*/
    
    public FragmentUtil(Bundle providerBundle) {
        this.providerBundle = providerBundle;
    }

    /*=============*/
    /* API methods */
    /*=============*/

    /**
     * Generate a set of anchor interfaces for the packages in the p-units if 
     * generation is enabled.
     * Create a fragment and install the fragment, attaching it to the 
     * persistence unit bundle.
     * 
     * @param b the persistence unit bundle
     * @param infos the collection of metadata for all of the persistence units
     * 
     * @return The bundle object of the installed fragment
     */
    public Bundle generateAndInstallFragment(Bundle b, Collection<PUnitInfo> infos, AnchorClassUtil anchorUtil) {

        debug("FragmentUtil generating fragment");
        // If anchor classes are disabled then the result of the anchor class calls are empty
        List<String> packageNames = anchorUtil.uniquePackages(infos);
        List<byte[]> generatedClasses = anchorUtil.generateAnchorInterfaces(packageNames);
        Manifest manifest = generateFragmentManifest(b);
        byte[] fragment = createFragment(manifest, packageNames, anchorUtil.getAnchorClassName(), generatedClasses);
        debug("FragmentUtil finished generating fragment");
        Bundle installedFragment = installFragment(b, providerBundle, fragment);
        debug("FragmentUtil installed fragment bundle: ", installedFragment);
        // PackageAdmin admin = GeminiUtil.getPackageAdmin(providerBundle.getBundleContext());
        // boolean result = admin.resolveBundles(new Bundle[] { installedFragment });        
        // debug("FragmentUtil resolved fragment bundle ", installedFragment);
        // debug("Resolve result: ", result);
        return installedFragment;
    }
    
    /*================*/
    /* Helper methods */
    /*================*/
    
    /**
     * Generate a manifest for the fragment. No additional imports or exports have been added.
     * 
     * @param pUnitBundle the persistence unit bundle collection of package name strings. They are 
     * 
     * @return a Manifest with its headers appropriately filled in
     */
    public Manifest generateFragmentManifest(Bundle pUnitBundle){
        Manifest manifest = new Manifest();
        Attributes attrs = manifest.getMainAttributes();
        debug("Creating manifest "); 
        
        // Standard manifest versions
        attrs.putValue("Manifest-Version", "1.0");
        attrs.putValue("Bundle-ManifestVersion", "2");
        
        // Informational Entries
        attrs.putValue("Bundle-Name", "JPA Fragment");
        attrs.putValue("Bundle-Description", "Generated JPA Fragment");

        // Use a mapping from the p-unit bundle name to the fragment name 
        String fragmentName = fragmentSymbolicName(pUnitBundle);
        attrs.putValue("Bundle-SymbolicName", fragmentName);

        // Import the org.osgi.service.jpa package to allow access to the EMFBuilder class
        String packageImport = "org.osgi.service.jpa,javax.persistence";
        attrs.putValue("Import-Package", packageImport);

        // Adopt the version of the persistence unit bundle so it is unique
        String hostVersion = bundleVersion(pUnitBundle);
        attrs.putValue("Bundle-Version", hostVersion);

        // Lock this fragment to the symbolic name and version of the persistence unit bundle
        String fragmentHost = pUnitBundle.getSymbolicName() + ";bundle-version=" + hostVersion; 
        attrs.putValue("Fragment-Host", fragmentHost);

        debug("FragmentUtil created manifest for ", fragmentName); 
        for ( Map.Entry<Object,Object> e : manifest.getMainAttributes().entrySet()) {
            debug("Manifest header: " + e.getKey(), ", value=" + e.getValue()); 
        }
        return manifest;
    }
   
    // Out of the blue...
    public static final int ESTIMATED_FRAGMENT_SIZE = 2000;
    
    /**
     * Create and return a fragment bundle as a byte array. The manifest and generated classes 
     * that were passed in are written to the fragment.
     *  
     * @param manifest the manifest to use in the fragment 
     * @param packageNames the names of the packages in which interfaces were generated  
     * @param className the name of the interfaces that were generated 
     * @param generatedClasses the byte arrays of generated interfaces
     * 
     * @return a byte array of the fragment bundle data
     */    
    public byte[] createFragment(
            Manifest manifest, 
            List<String> packageNames,
            String className,
            List<byte[]> generatedClasses) {
        
        debug("Creating fragment "); 
        ByteArrayOutputStream baos = new ByteArrayOutputStream(ESTIMATED_FRAGMENT_SIZE);
        BufferedOutputStream bos = new BufferedOutputStream(baos);
        JarOutputStream jos = null;
        try { 
            jos = new JarOutputStream(bos, manifest);
            // If no anchor classes were generated then no package names will be present
            for (String p : packageNames) {
                JarEntry entry = new JarEntry(
                        formattedPackageString(p, '.', '/') + className + ".class");
                jos.putNextEntry(entry);
                jos.write(generatedClasses.remove(0));
            }
            debug("Successfully created fragment ");
            jos.close();
            return baos.toByteArray();
        } catch (Exception ex) { 
            fatalError("Error creating fragment: ", ex); 
        } finally { 
            close(jos);
            close(bos);
            close(baos);
        }
        return null;
    }    

    /**
     * Install the fragment into the framework. Return the installed bundle if the fragment 
     * was successfully installed, or null if it could not be installed.
     *  
     * @param pUnitBundle the persistence unit bundle 
     * @param providerBundle the bundle of the provider
     * @param bundleData the byte array that represents the fragment bundle 
     * 
     * @return the bundle that was created or null if none was able to be created
     */    
    public Bundle installFragment(Bundle pUnitBundle, Bundle providerBundle, byte[] bundleData) { 
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bundleData);
        String locationUrl = null;
        Bundle fragmentBundle = null;
        try {
            locationUrl = fragmentLocation(pUnitBundle);
            debug("Installing fragment: ", locationUrl);
            // Use the provider bundle ctx to install the fragment
            BundleContext ctx = providerBundle.getBundleContext();
            fragmentBundle = ctx.installBundle(locationUrl, bais);
        } catch (Exception ex) { 
            fatalError("Could not install fragment: " + locationUrl + ": ", ex);
        }
        return fragmentBundle;
    }
        
    // Function to create a unique fragment location identifier from a p-unit bundle
    public String fragmentLocation(Bundle pUnitBundle) {
        return fragmentSymbolicName(pUnitBundle) + "_" + bundleVersion(pUnitBundle);
    }

    // Function to create a symbolic name of the fragment based on the symbolic name of the p-unit bundle
    public String fragmentSymbolicName(Bundle b) {
        return FRAGMENT_PREFIX + b.getSymbolicName();
    }
}
