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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.persistence.internal.libraries.asm.ClassWriter;
import org.eclipse.persistence.internal.libraries.asm.Opcodes;

import static org.eclipse.gemini.jpa.GeminiUtil.*;

/**
 * Utility class to do all the work to creating the anchor classes.
 * 
 * Anchor classes can be generated to ensure that when multiple versions 
 * of the domain classes exist then EMF services for an given version of them 
 * will only be visible to clients that import the same version. 
 * 
 * Fragment generation must be enabled in order to be able to allow the anchor 
 * classes to be created and loaded.
 */
public class AnchorClassUtil {

    /*==================*/
    /* Static constants */
    /*==================*/

    // Class name of anchor class in each package
    public static final String ANCHOR_CLASS_NAME = "Jpa$Anchor";

    /*================*/
    /* Instance state */
    /*================*/

    // Whether or not to generate anchor classes
    boolean generateAnchorClasses;

    /*==============*/
    /* Constructors */
    /*==============*/
    
    public AnchorClassUtil(boolean generateAnchors) {
        generateAnchorClasses = generateAnchors;
    }

    /*=============*/
    /* API methods */
    /*=============*/

    /**
     * Return the name of the generated anchor class in each domain package.
     * 
     * @return the unqualified name of each anchor class (will be prefixed by each domain package)
     */
    public String getAnchorClassName() { return ANCHOR_CLASS_NAME; }

    /**
     * Return whether anchor classes will be generated.
     * 
     * @return true if anchor classes will be generated, false otherwise
     */
    public boolean generateAnchorClasses() { return generateAnchorClasses; }


    /**
     * Return a Set of the unique packages in which a JPA managed class exists.
     * The "." characters will be replaced by "/" chars, with a trailing slash.
     *  
     * @param pUnits the collection of p-units in the bundle 
     * 
     * @return a List of unique package names in all p-units in the bundle
     */
    public List<String> uniquePackages(Collection<PUnitInfo> pUnits) {
        
        if (!generateAnchorClasses()) 
            return new ArrayList<String>();

        Set<String> packageNamesInBundle = new HashSet<String>();

        // Iterate through all the p-units in the bundle
        for (PUnitInfo info : pUnits) {
            Set<String> packageNamesInUnit = new HashSet<String>();
            
            // Iterate through each managed class in the p-unit
            for (String classString : info.getClasses()) {
                int idx = classString.lastIndexOf('.');
                String packageName = classString.substring(0,idx);
                String formattedName = formattedPackageString(packageName, '.', '/');
                packageNamesInUnit.add(formattedName);
                packageNamesInBundle.add(formattedName);
            }
            // Convert to a List and set the local p-unit package names in the p-unit info
            List<String> namesInUnit = new ArrayList<String>();
            namesInUnit.addAll(packageNamesInUnit);
            info.setUniquePackageNames(namesInUnit);
        }
        // Convert to a List before returning
        List<String> namesInBundle = new ArrayList<String>();
        namesInBundle.addAll(packageNamesInBundle);
        debug("AnchorUtil - Unique managed class package names: ", namesInBundle);
        return namesInBundle;
    }

    /**
     * Generate an anchor interface for each unique package in which a 
     * JPA managed class exists. The anchors will all get generated as the 
     * specified class name, but in different packages.
     * 
     * @param packageNames the collection of package name strings. They are 
     *                     assumed to be in the format returned by {@link #uniquePackages() uniquePackages}
     * @param className the name of the generated interface
     * 
     * @return an ordered List of bytecode arrays, each being a generated anchor 
     *         interface, in the order that the package names were in
     */
    public List<byte[]> generateAnchorInterfaces(List<String> packageNames) {
        List<byte[]> bytes = new ArrayList<byte[]>();

        if (!generateAnchorClasses()) 
            return bytes;

        // Iterate through the packageNames, generating an interface for each one
        for (String packageName : packageNames) {
            ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
            String fullClassName = formattedPackageString(packageName, '.', '/') + getAnchorClassName();
            debug("AnchorUtil generating anchor interface ", fullClassName);
            final int CLASS_ACCESS = Opcodes.ACC_PUBLIC + Opcodes.ACC_ABSTRACT + Opcodes.ACC_INTERFACE;
            writer.visit(Opcodes.V1_5, CLASS_ACCESS, fullClassName, "java/lang/Object", null, null);
            writer.visitEnd();
            bytes.add(writer.toByteArray());
        }
        return bytes;
    }
    
    /*
     * Load and return the anchor classes that were generated.
     * 
     * @param pUnitInfo the info descriptor for the persistence unit
     * 
     * @return Map of the anchor classes that were generated, keyed by 
     *         the name of the class. An empty Map is returned if anchor 
     *         classes were not generated.
     */
    Map<String, Class<?>> loadAnchorClasses(PUnitInfo pUnitInfo) {

        Map<String, Class<?>> result = new HashMap<String, Class<?>>();

        if (!generateAnchorClasses()) 
            return result;

        for (String packageName : pUnitInfo.getUniquePackageNames()) {
            String className = formattedPackageString(packageName, '/', '.') + 
                                    getAnchorClassName();
            try { 
                debug("AnchorUtil loading anchor class ", className);
                Class<?> cls = pUnitInfo.getBundle().loadClass(className);
                debug("AnchorUtil loaded anchor class ", cls);
                result.put(className, cls);
            } catch (ClassNotFoundException cnfEx) {
                fatalError("Could not load anchor class " + className, cnfEx);
            }
        }
        return result;
    }
}
