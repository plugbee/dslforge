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
import static org.eclipse.gemini.jpa.GeminiUtil.warning;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

/**
 * Stores metadata about a specific persistence descriptor
 * (e.g. persistence.xml) and its location in the persistence bundle.
 * Also provide some basic operations on the descriptor.
 */
public class PersistenceDescriptorInfo {

    // Url of the descriptor.
    // If embedded in a JAR then this is the url of the JAR.
    URL url;
    
    // If embedded in a JAR then this is the path of the JAR.
    // Should be null if not an embedded descriptor.
    String jarPath;
    
    // Path to the descriptor 
    // If embedded in a JAR then this is only the path from within the JAR
    String descriptorPath;
    
    public PersistenceDescriptorInfo() {}
    public PersistenceDescriptorInfo(URL url, String descPath) {
        this();
        this.url = url;
        this.descriptorPath = descPath;
    }
    public PersistenceDescriptorInfo(URL url, String descPath, String jarPath) {
        this(url, descPath);
        this.jarPath = jarPath;
    }

    public URL getUrl() { return url; }
    public void setUrl(URL url) { this.url = url; }

    public String getJarPath() { return jarPath; }
    public void setJarPath(String jarPath) { this.jarPath = jarPath; }

    public String getDescriptorPath() { return descriptorPath; }
    public void setDescriptorPath(String descriptorPath) { this.descriptorPath = descriptorPath; }

    public boolean isEmbedded() { return jarPath != null; }

    /**
     * Compose the complete descriptor path once again
     * 
     * @return a complete string path including JAR prefix when embedded in a JAR
     */
    public String fullDescriptorPath() {
        return isEmbedded() 
            ? jarPath + "!/" + descriptorPath
            : descriptorPath;
    }
    
    /**
     * Return a stream over the descriptor. The caller should close the stream when done.
     * 
     * @return An input stream to the descriptor file. Return null if
     * the descriptor could not be found.
     */
    public InputStream getDescriptorStream() {
        debug("PersistenceDescriptorInfo.getDescriptorStream - url=", url, 
              " descPath=", descriptorPath, " jarPath=", jarPath);
        InputStream inStream = null;
        try { inStream = url.openStream(); }
        catch (IOException ioEx) {} // inStream will be null

        // If not embedded then return the stream
        // If it failed, the stream will be null so return it anyway
        if (!isEmbedded()  || inStream == null)
            return inStream;

        // At this point we know it is an embedded descriptor and we have 
        // a stream on the JAR file. Use a jar stream to rifle through the JAR
        JarInputStream jarStream = null;
        JarEntry jarEntry = null;
        try {
            jarStream = new JarInputStream(new BufferedInputStream(inStream));
            debug("PersistenceDescriptorInfo.getDescriptorStream - Looking in jar for embedded descriptor: ", descriptorPath);
            do {
                jarEntry = jarStream.getNextJarEntry();
                if (jarEntry != null) {
                    if (jarEntry.getName().equalsIgnoreCase(descriptorPath)) {
                        debug("PersistenceDescriptorInfo.getDescriptorStream - Found jar entry: ", jarEntry.getName());
                        break;
                    } 
                }
            } while (jarEntry != null);
        } catch (IOException ioEx) {
            warning("getDescriptorStream - Received exception looking for embedded descriptor ", ioEx);
            try { jarStream.close(); } catch (Throwable t) {}
            return null;
        }
        return jarStream;
    }

    /**
     * Simple string representation of the descriptor info
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Descriptor: ").append(getDescriptorPath());
        if (isEmbedded()) {
            sb.append(" embedded in ");
            sb.append(jarPath);
        }
       return sb.toString();
    }
}
