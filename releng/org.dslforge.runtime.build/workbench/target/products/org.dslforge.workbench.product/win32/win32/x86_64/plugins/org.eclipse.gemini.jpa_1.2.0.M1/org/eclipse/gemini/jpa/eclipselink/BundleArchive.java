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
 *     tware - initial implementation
 *     ssmith - support for user specified Eclipse project bin path
 *     mkeith - adapted to new property, changed to use gemini debugging
 ******************************************************************************/
package org.eclipse.gemini.jpa.eclipselink;

import static org.eclipse.gemini.jpa.GeminiUtil.debugClassLoader;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

import org.eclipse.gemini.jpa.classloader.EclipseDotClasspathHelper;
import org.eclipse.persistence.internal.jpa.deployment.ArchiveBase;
import org.eclipse.persistence.jpa.Archive;
import org.osgi.framework.Bundle;

/**
 * A bundle archive subclasses from EclipseLink's Bundle framework in order 
 * to allow use of the Bundle API to look inside persistence units.
 */
public class BundleArchive extends ArchiveBase implements Archive {

    protected Bundle bundle = null;
    protected EclipseDotClasspathHelper pdeClasspathHelper = new EclipseDotClasspathHelper();
        
    /** 
     * This is used for Eclipse PDE support.  PDE does not always store entries
     * at the root of the bundle.  We store the size of the path prefix in the bundle when
     * we go looking for resources.  This is used to trim entry sizes in order to build class 
     * names from bundle entries
     */
    protected Integer pathPrefixSize = null;

    public BundleArchive(URL rootUrl, String descriptorLocation, Bundle b)
            throws MalformedURLException {
        super(rootUrl, descriptorLocation);
        this.bundle = b;
    }

    public Iterator<String> getEntries() {
        
        Enumeration<URL> entries = null;
        String binPath = pdeClasspathHelper.getBinPath(bundle);
        if (binPath != null) { // In Eclipse PDE
            entries = bundle.findEntries(binPath,"*.class", true);
            pathPrefixSize = binPath.length() + 2; // leading and trailing separator chars
        } else {
            entries = bundle.findEntries(".","*.class", true);
            pathPrefixSize = 3;
        }
        ArrayList<String> result = new ArrayList<String>();
        while (entries.hasMoreElements()) {
            URL bundleEntry = entries.nextElement();
            try{
                URI bundleUri = bundleEntry.toURI();
                result.add(trimClassName(bundleUri.getPath()));
            } catch (URISyntaxException e){
                e.printStackTrace();
            }
        }
        debugClassLoader("BundleArchive.getEntries() found entries: ",result);
        return result.iterator();
    }
    
    protected String trimClassName(String path){
        return path.substring(pathPrefixSize);
    }
    
    @Override
    public InputStream getEntry(String entryPath) throws IOException {
        InputStream is = null;
        final URL entry = bundle.getEntry(entryPath);
        if (entry != null) {
            is = entry.openStream();
        }
        return is;
    }

    public URL getEntryAsURL(String entryPath) throws IOException {
        return bundle.getEntry(entryPath);
    }

    public void close() {}
}
