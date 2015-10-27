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
 *    ssmith - A ClassLoader that aggregates multiple ClassLoaders
 *    mkeith - Added support for private resources
 ******************************************************************************/  
package org.eclipse.gemini.jpa.classloader;

import static org.eclipse.gemini.jpa.GeminiUtil.debugClassLoader;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

@SuppressWarnings({"deprecation"})
public class CompositeClassLoader extends ClassLoader {

    // Static Map of private resources keyed by resource name.
    // Instances should check here first and return them directly if these resources
    // are being looked up.
    private static Map<String,String> privateResources = new HashMap<String,String>();
    
    // List of classloaders to delegate to for class and resource loading
    private List<ClassLoader> classLoaders = new ArrayList<ClassLoader>();
    
    /**
     * Return a class loader that will delegate to both the punit bundle 
     * and the provider bundle 
     */
    public static CompositeClassLoader createCompositeLoader(BundleContext providerCtx, Bundle pUnitBundle) {
        ClassLoader pUnitLoader = new BundleProxyClassLoader(pUnitBundle);
        debugClassLoader("PUnit bundle proxy loader created: ", pUnitLoader);
        ClassLoader providerLoader = new BundleProxyClassLoader(providerCtx.getBundle());
        debugClassLoader("Provider bundle proxy loader created: ", providerLoader);
        List<ClassLoader> loaders = new ArrayList<ClassLoader>();
        loaders.add(pUnitLoader);
        loaders.add(providerLoader);
        CompositeClassLoader compositeLoader = new CompositeClassLoader(loaders);
        debugClassLoader("Composite loader created: ", compositeLoader);
        return compositeLoader;
    }
    
    /**
     *  Add a private resource 
     */
    public static void addPrivateResource(String resourceName, String resource) {
        synchronized (privateResources) {
            privateResources.put(resourceName, resource);
        }
    }

    /**
     *  Remove a private resource
     */
    public static String removePrivateResource(String resourceName) {
        synchronized (privateResources) {
            return privateResources.remove(resourceName);
        }
    }

    /**
     *  Create a CompositeClassLoader with two class loaders 
     */
    public CompositeClassLoader(ClassLoader loader1, ClassLoader loader2) {
        classLoaders.add(loader1);
        classLoaders.add(loader2);
    }

    /** 
     * Create a CompositeClassLoader from a list of class loaders 
     */
    public CompositeClassLoader(List<ClassLoader> loaders) {
        classLoaders.addAll(loaders);
    }

    /** 
     * Get the contained class loaders 
     */
    public List<ClassLoader> getClassLoaders() {
        return classLoaders;
    }

    /**
     * Sets the default assertion status for this class loader to
     * <tt>false</tt> and discards any package defaults or class assertion
     * on all contained class loaders.
     */
    @Override
    public synchronized void clearAssertionStatus() {
        for (ClassLoader classLoader : getClassLoaders()) {
            classLoader.clearAssertionStatus();
        }
    }

    /**
     * Finds the resource with the given name.  Contained class 
     * loaders are queried until one returns the requested
     * resource or <tt>null</tt> if not found. 
     */
    @Override
    public URL getResource(String name) {
        if (privateResources.containsKey(name)) {
            debugClassLoader("getResource()- Found resource ", name, " locally");
            return newPrivateResourceURL(name);
            // throw new RuntimeException("Don't know how to create URL for local resource!!! ");
        }
        for (ClassLoader classLoader : getClassLoaders()) {
            debugClassLoader("Attempting getResource(", name,") on ", classLoader.toString());
            URL resource = classLoader.getResource(name);
            if (resource != null) {
                debugClassLoader("Found resource(", name,") from ", classLoader.toString());
                return resource;
            }
        }
        return null;
    }

    /**
     * Returns an input stream for reading the specified resource.
     * Contained class loaders are queried until one returns the 
     * requested resource stream or <tt>null</tt> if not found.
     */ 
    @Override
    public InputStream getResourceAsStream(String name) {
        if (privateResources.containsKey(name)) {
            debugClassLoader("getResourceAsStream() - Found resource ", name, " locally");
            return new StringBufferInputStream(privateResources.get(name));
        }
        for (ClassLoader classLoader : getClassLoaders()) {
            debugClassLoader("Attempting getResourceAsStream(", name, ") on ", classLoader.toString());
            InputStream stream = classLoader.getResourceAsStream(name);
            if (stream != null) {
                debugClassLoader("Found resource(", name, ")");
                return stream;
            }
        }
        return null;
    }

    /**
     * Finds all the resources with the given name. Contained class 
     * loaders are queried and the results aggregated into a single
     * Enumeration.
     */
    @Override
    public Enumeration<URL> getResources(String name) throws IOException {
        if (privateResources.containsKey(name)) {
            debugClassLoader("getResources()- Found desc resource ", name, " locally");
            return newPrivateResourceURLEnum(name);
        }
        List<Enumeration<URL>> enumerations = new ArrayList<Enumeration<URL>>(getClassLoaders().size());
        for (ClassLoader classLoader : getClassLoaders()) {
            debugClassLoader("Attempting getResources(", name,") on ", classLoader.toString());
            Enumeration<URL> resources = classLoader.getResources(name);
            if (resources != null) {
                debugClassLoader("Found resources(", name,") from ", classLoader.toString());
                enumerations.add(resources);
            }
        }
        return new CompositeEnumeration<URL>(enumerations); 
    }

   /**
     * Loads the class with the specified <a href="#name">binary name</a>.
     * Contained class loaders are queried until one returns the 
     * requested class.
     */
    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        for (ClassLoader classLoader : getClassLoaders()) {
            debugClassLoader("Attempting loadClass(", name,") on ", classLoader.toString());
            try {
                Class<?> aClass = classLoader.loadClass(name);
                return aClass;
            } catch (ClassNotFoundException e) {
                debugClassLoader("ClassNotFound '", name,"' by ", classLoader.toString());                
            }            
        }
        throw new ClassNotFoundException(name);
    }

    /** 
     * Sets the desired assertion status for the named top-level class.
     */
    @Override
    public synchronized void setClassAssertionStatus(String className,
            boolean enabled) {
        for (ClassLoader classLoader : getClassLoaders()) {
            classLoader.setClassAssertionStatus(className, enabled);
        }
    }

    /**
     * Sets the default assertion status for this class loader. 
     */
    @Override
    public synchronized void setDefaultAssertionStatus(boolean enabled) {
        for (ClassLoader classLoader : getClassLoaders()) {
            classLoader.setDefaultAssertionStatus(enabled);
        }
    }

    /**
     * Sets the package default assertion status for the named package.
     */
    @Override
    public synchronized void setPackageAssertionStatus(String packageName,
            boolean enabled) {
        for (ClassLoader classLoader : getClassLoaders()) {
            classLoader.setPackageAssertionStatus(packageName, enabled);
        }
    }

    URL newPrivateResourceURL(String resourceName) {
        try {
            return new URL("privateresource", 
                    null, // host 
                    -1, // port
                    resourceName, // file 
                    new PrivateResourceURLHandler(this));
        } catch (MalformedURLException muEx) {
            muEx.printStackTrace();
            throw new RuntimeException("MalformedURLException should not happen");
        }

    }

    Enumeration<URL> newPrivateResourceURLEnum(String resourceName) {
        
        URL url = newPrivateResourceURL(resourceName);
        return new UrlEnumeration<URL>(url);
    }

    /*=======================================================*/
    /*  Inner classes to support returning private resources */
    /*=======================================================*/
    public class PrivateResourceURLHandler extends URLStreamHandler {
        CompositeClassLoader cl;
        
        PrivateResourceURLHandler(CompositeClassLoader cl) { this.cl = cl; }
        
        @Override
        public URLConnection openConnection(URL u) throws IOException {
            return cl.new PrivateResourceURLConnection(u, cl);
        }
        @Override
        public URLConnection openConnection(URL u, Proxy p) throws IOException {
            return openConnection(u);
        }
    }

    public class PrivateResourceURLConnection extends URLConnection {
        CompositeClassLoader cl;

        public PrivateResourceURLConnection(URL u) { super(u); }
        public PrivateResourceURLConnection(URL u, CompositeClassLoader cl) { 
            this(u);
            this.cl = cl; 
        }
        @Override public void connect() { 
            connected = true; 
        }
        @Override public InputStream getInputStream() {
            return cl.getResourceAsStream(this.getURL().getFile());
        }    
    }    

    @SuppressWarnings("hiding")
    public class UrlEnumeration<URL> implements Enumeration<URL> {
        URL url;
        boolean atEnd = false;
        
        public UrlEnumeration(URL url) { this.url = url; }
        public boolean hasMoreElements() { return !atEnd; }
        public URL nextElement() {
            if (atEnd) { 
                throw new NoSuchElementException();
            } else {
                atEnd = true;
                return url;
            }
        }
    }
}
