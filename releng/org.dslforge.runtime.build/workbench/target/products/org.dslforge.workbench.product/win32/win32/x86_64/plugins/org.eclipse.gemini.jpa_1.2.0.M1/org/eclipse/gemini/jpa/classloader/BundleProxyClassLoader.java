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
 *     ssmith - inspired by http://wiki.eclipse.org/index.php/BundleProxyClassLoader_recipe
 ******************************************************************************/  
package org.eclipse.gemini.jpa.classloader;

import static org.eclipse.gemini.jpa.GeminiUtil.debugClassLoader;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import org.osgi.framework.Bundle;

@SuppressWarnings({"rawtypes","unchecked"})
public class BundleProxyClassLoader extends ClassLoader {

    private Bundle bundle;
    private EclipseDotClasspathHelper classpathHelper = new EclipseDotClasspathHelper();
        
    public BundleProxyClassLoader(Bundle bundle) {
        this.bundle = bundle;
    }
    
    @Override
    public Enumeration<URL> findResources(String name) throws IOException {
        try {
            List<URL> resourceURLs = new ArrayList<URL>(1);
            URL entry = getEntry(name);
            if (entry != null){
                resourceURLs.add(entry);
            }
            return new ListEnumeration(resourceURLs);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public URL findResource(String name) {
         return getEntry(name);
    }

    @Override
    public URL getResource(String name) {
        try {
            if ((bundle.getState() == Bundle.INSTALLED) ||
                (bundle.getState() == Bundle.UNINSTALLED)){
                // bundle has no classloader yet so resort to getEntry
                debugClassLoader("Bundle has no classloader so getResource(", name ,
                    ") calling findResource");
                return findResource(name);
            } else {
                // bundle has classloader so forward getResource
                return bundle.getResource(name);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Enumeration<URL> getResources(String name) throws IOException {
        try {
            if ((bundle.getState() == Bundle.INSTALLED) ||
                (bundle.getState() == Bundle.UNINSTALLED)){
               // bundle has no classloader
                debugClassLoader("Bundle has no classloader so getResources(", name ,
                    ") calling findResources");
                return findResources(name);
            } else {
                return bundle.getResources(name);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public java.lang.Class<?> loadClass(String name) throws ClassNotFoundException {
        if ((bundle.getState() == Bundle.INSTALLED) ||
            (bundle.getState() == Bundle.UNINSTALLED)){
            // Bundle has no classloader and bundle.loadClass
            // may result in attempt to resolve bundle which we
            // don't want as a side effect.
            debugClassLoader("Bundle has no classloader so loadClass(", name,
                ") is returning null");
            return null;
        } else {
            return bundle.loadClass(name);
        }
    }
    
    protected URL getEntry(String name) {
        URL entry = bundle.getEntry(name);
        if (entry == null) {
            entry = getEclipseProjectEntry(name, entry);
        }
        return entry;
    }

    protected URL getEclipseProjectEntry(String name, URL entry) {
        String binPath = classpathHelper.getBinPath(bundle);
        if (binPath != null) {
            entry = bundle.getEntry(binPath + File.separator + name);
        }
        return entry;
    }

    private final class ListEnumeration implements Enumeration {
        private Iterator iterator;

        public ListEnumeration(List<?> list) {
            this.iterator = list.iterator();
        }

        public boolean hasMoreElements() {
            return iterator.hasNext();
        }

        public Object nextElement() {
            return iterator.next();
        }
    }

    @Override
    public String toString() {
    	return super.toString() + "(" + this.bundle.getSymbolicName() + ")";
    }

}

