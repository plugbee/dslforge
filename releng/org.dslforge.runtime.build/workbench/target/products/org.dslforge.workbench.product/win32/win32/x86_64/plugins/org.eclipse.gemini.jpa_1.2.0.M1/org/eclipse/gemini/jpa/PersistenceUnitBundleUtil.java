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

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.osgi.framework.Bundle;
import org.eclipse.gemini.jpa.xml.PersistenceDescriptorHandler;

import static org.eclipse.gemini.jpa.GeminiUtil.*;

/**
 * Utility class that provides some of the functionality for processing
 * a persistence unit bundle.
 */
public class PersistenceUnitBundleUtil {
    
    public static final String JPA_MANIFEST_HEADER = "Meta-Persistence"; 
    public static final String EMBEDDED_JAR_SEPARATOR = "!/"; 
    public static final String DEFAULT_DESCRIPTOR_PATH = "META-INF/persistence.xml"; 

    /**
     * Return a List of PersistenceDescriptorInfo, each of which contains info about 
     * a persistence descriptor in the bundle. An entry to the default file will be 
     * included if it exists in the bundle.
     * 
     * @param b the persistence unit bundle 
     * 
     * @return a List of PersistenceDescriptorInfo (empty if none were found)
     */
    public List<PersistenceDescriptorInfo> persistenceDescriptorInfos(Bundle pUnitBundle) {
        List<PersistenceDescriptorInfo> descInfos = new ArrayList<PersistenceDescriptorInfo>();
        debug("Looking for persistence descriptors in bundle ", pUnitBundle.getSymbolicName());
        
        // Add default META-INF/persistence.xml if it exists in the bundle
        URL defaultUrl = pUnitBundle.getEntry(DEFAULT_DESCRIPTOR_PATH);
        if (defaultUrl != null) {
            descInfos.add(new PersistenceDescriptorInfo(defaultUrl, DEFAULT_DESCRIPTOR_PATH));
        }

        Object headerEntry = pUnitBundle.getHeaders().get(JPA_MANIFEST_HEADER);
        
        // If entries were specified then go through them
        if (headerEntry != null) {
            // Iterate through all of the specified Meta-Persistence entries
            for (String paddedPath : headerEntry.toString().split(",")) {
                String path = stripPrecedingSlash(paddedPath.trim());
                
                // If standard path was specified ignore it since we already added it above
                if ((path.length() == 0) || path.equals(DEFAULT_DESCRIPTOR_PATH)) {
                    continue;
                }
                // Check if it is an embedded JAR path
                int splitPosition = path.indexOf(EMBEDDED_JAR_SEPARATOR);
                URL url = null;
                if (splitPosition == -1) {
                    // Not an embedded JAR path, just get URL from bundle call
                    url = pUnitBundle.getEntry(path);
                    if (url != null)
                        descInfos.add(new PersistenceDescriptorInfo(url, path));
                    else
                        warning("Could not find JPA descriptor: ", path);
                } else {
                    // It's an embedded JAR path, we need to do some work to get the info
                    String jarPrefixPath = path.substring(0, splitPosition);
                    String descPath = path.substring(splitPosition+2);
                    descPath = stripPrecedingSlash(descPath);
                    debug("Descriptor JAR prefix: ", jarPrefixPath);
                    debug("Embedded descriptor suffix: ", descPath);
                    URL prefixUrl = pUnitBundle.getEntry(jarPrefixPath);
                    debug("Embedded JAR url: ", prefixUrl);
                    if (prefixUrl != null) {
                        descInfos.add(new PersistenceDescriptorInfo(prefixUrl, descPath, jarPrefixPath));
                    } else {
                        warning("Could not find nested JAR: ", jarPrefixPath);                    
                        continue;
                    }
                }
            }
        }
        debug("Found persistence descriptors: ", descInfos);
        
        // Apply any config admin configurations to persistence units
//        List<Dictionary> 
        
        return descInfos;
    }

    /**
     * Process each of the descriptor infos passed in and return a Set of 
     * PartialPersistenceUnitInfo objects, one for each persistence unit.
     * The descriptor infos are expected to be in the same bundle.
     * 
     * @param descInfos a List of PersistenceDescriptorInfo with each 
     *                  referring to a different persistence descriptor file
     * 
     * @return a Set of < partial persistence unit information >
     */
    public Set<PUnitInfo> persistenceUnitInfoFromXmlFiles(List<PersistenceDescriptorInfo> descriptorInfos) {

        // Set of p-unit info
        Set<PUnitInfo> pUnits = new HashSet<PUnitInfo>();
        // Set of p-unit names to ensure no duplicates
        Set<String> pUnitNames = new HashSet<String>();
        
        // Read each of the persistence descriptor files
        InputStream in = null;
        PersistenceDescriptorHandler handler = null;
        for (PersistenceDescriptorInfo info : descriptorInfos) {
            try { 
                debug("Parsing persistence descriptor ", info.getDescriptorPath());
                // Open a stream on the descriptor
                in = info.getDescriptorStream();
                // Create a parser
                SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
                // Parse the file
                handler = new PersistenceDescriptorHandler();
                parser.parse(in, handler);
                debug("Finished parsing persistence descriptor ", info.getUrl());
            } catch(Throwable ex) {
                fatalError("Could not parse XML descriptor ", ex);
            } finally {
                close(in);
            }
            // Get the p-units found in the current descriptor file
            Set<PUnitInfo> newPUnits = handler.getPersistenceUnitInfo();
            debug("Found " + newPUnits.size() + " persistence units");

            // Cycle through the newly found p-units ensuring there are no duplicates
            // and setting the URL
            for (PUnitInfo unitInfo : newPUnits) {
                String unitName = unitInfo.getUnitName();
                if (pUnitNames.contains(unitName)) {
                    fatalError("Persistence unit " + unitName + " already defined ", null);
                }
                pUnitNames.add(unitName);
                // Set the URL 
                unitInfo.setDescriptorInfo(info);
            }
            // Add the new ones to the list of processed p-units
            pUnits.addAll(newPUnits);
        }
        debug("Parsed persistence descriptors: ", pUnits);
        return pUnits;
    }
}
