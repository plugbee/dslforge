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

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Map;
import java.util.HashMap;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.ServiceReference;
import org.osgi.service.packageadmin.PackageAdmin;

/**
 * Utility class containing functions that are generally useful during 
 * development and at runtime.
 */
@SuppressWarnings({"rawtypes","unchecked", "deprecation"})
public class GeminiUtil {
    
    /*==================*/
    /* Static constants */
    /*==================*/
    
    // JPA standard properties
    public static String JPA_PROVIDER_PROPERTY = "javax.persistence.provider";
    public static String JPA_JDBC_DRIVER_PROPERTY = "javax.persistence.jdbc.driver";
    public static String JPA_JDBC_URL_PROPERTY = "javax.persistence.jdbc.url";
    public static String JPA_JDBC_USER_PROPERTY = "javax.persistence.jdbc.user";
    public static String JPA_JDBC_PASSWORD_PROPERTY = "javax.persistence.jdbc.password";

    // OSGi standard properties
    public static String OSGI_JDBC_DRIVER_VERSION_PROPERTY = "osgi.jdbc.driver.version";
    public static String OSGI_JPA_PROVIDER_VERSION_PROPERTY = "osgi.jpa.provider.version";
    
    // Private property used to pass punit info through to provider as a property
    public static String PUNIT_INFO_PROPERTY = "gemini.jpa.punitInfo";
    
    /*============================*/
    /* Helper and Utility methods */
    /*============================*/

    // Function to obtain the version from a bundle
    public static String bundleVersion(Bundle b) {
        return b.getVersion().toString();
    }
    
    // Function to return a package String formatted with "." instead of "/"
    public static String formattedPackageString(String s, char beingReplaced, char replacer) {
        String formatted = s;
        // Replace all instances of character
        if (formatted.indexOf(beingReplaced) >= 0) 
            formatted = formatted.replace(beingReplaced, replacer);
        // Tack on trailing character if needed
        if (formatted.charAt(formatted.length()-1) != replacer) 
            formatted = formatted + replacer;
        return formatted;
    }
    
    // Function to close a closeable (as much as it can be closed)
    public static void close(Closeable c) {
        try { c.close(); } catch (Throwable ex){}
    }
    
    // Obtain and return the PackageAdmin    
    public static PackageAdmin getPackageAdmin(BundleContext ctx) {
        ServiceReference ref = ctx.getServiceReference(PackageAdmin.class.getName());
        return (ref != null) 
            ? (PackageAdmin) ctx.getService(ref)
            : null;
    }
    
    // Strip off preceding slash, if present, and return the resulting string
    public static String stripPrecedingSlash(String s) {
        if (s == null || s.length()==0 || !s.startsWith("/")) 
            return s;
        return (s.length() == 1) 
            ? "" 
            : s.substring(1, s.length());
    }
    
    // Load a class using the specified bundle; fatal exception if not found
    public static Class<?> loadClassFromBundle(String clsName, Bundle b) {

        debug("Loading class ", clsName, " from bundle ", b);
        try {
            return b.loadClass(clsName);
        } catch (ClassNotFoundException cnfEx) {
            fatalError("Could not load class " + clsName + " from bundle " + b, cnfEx);
        }
        return null;
    }
    
    // Return the Map of service properties from a service reference
    public static Map<String, String> serviceProperties(ServiceReference ref) {
        Map props = new HashMap<String,String>();
        for (String s : ref.getPropertyKeys())
            props.put(s, ref.getProperty(s));
        return props;
    }
    
    /*==================*/
    /* Status functions */
    /*==================*/
    
    // Function to throw a runtime exception (throws exception)
    public static void fatalError(String s, Throwable t) { 
        if (t == null) {
            privateDebug("*** FATAL ERROR *** ", s);
        } else {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            t.printStackTrace(new PrintWriter(baos));
            privateDebug("*** FATAL ERROR *** ", s, baos.toString());
        }
        throw new RuntimeException(s,t); 
    }

    // Function to indicate a warning condition (non-terminating)
    public static void warning(String msg) {
        warning(msg, "");
    }

    // Function to indicate a warning condition (non-terminating)
    public static void warning(String msg, Throwable t) {
        String msg2 = (t != null ? (" Exception: " + t) : "");
        warning(msg, msg2);
    }

    // Function to indicate a warning condition (non-terminating)
    public static void warning(String msg, String msg2) {
        privateDebug("WARNING: ", msg, msg2);
    }

    /*=====================*/
    /* Debugging functions */
    /*=====================*/
    
    // Function to print out debug strings for XML parsing purposes
    public static void debugXml(String... msgs) { 
        if (GeminiSystemProperties.debugXml()) {
            privateDebug(msgs);
        }
    }
    
    // Function to print out debug strings for classloading purposes
    public static void debugClassLoader(String... msgs) { 
        if (GeminiSystemProperties.debugClassloader()) {
            privateDebug(msgs);
        }
    }

    // Function to print out series of objects for classloading purposes
    public static void debugClassLoader(Object... args) { 
        if (GeminiSystemProperties.debugClassloader()) {
            privateDebug(args);
        }
    }

    // Function to print out debug string and classloader info for classloading debugging
    public static void debugClassLoader(String s, ClassLoader cl) { 
        if (GeminiSystemProperties.debugClassloader()) {
            privateDebug(s, String.valueOf(cl));
            ClassLoader p = cl;
            while (p.getParent() != null) {
                privateDebug("  Parent loader: ", p.getParent());
                p = p.getParent();
            }
        }
    }

    // Function to print out debug strings for weaving purposes
    public static void debugWeaving(String... msgs) { 
        if (GeminiSystemProperties.debugWeaving()) {
            privateDebug(msgs);
        }
    }
    
    // Function to print out series of debug strings
    public static void debug(String... msgs) { 
        if (GeminiSystemProperties.debug()) {
            privateDebug(msgs);
        }
    }

    // Function to print out series of objects
    public static void debug(Object... args) {
        if (GeminiSystemProperties.debug()) {
            privateDebug(args);
        }
    }

    // Function to print out a string and an object.
    // Handles some objects specially and prints out more info
    public static void debug(String msg, Object obj) { 
        if (GeminiSystemProperties.debug()) {
            if (obj == null) {
                privateDebug(msg, String.valueOf(obj));
            } else if ((ClassLoader.class.isAssignableFrom(obj.getClass())) &&
                       (GeminiSystemProperties.debugXml())) {
                debugClassLoader(msg, (ClassLoader)obj);
            } else if (Bundle.class.isAssignableFrom(obj.getClass())) {
                Bundle b = (Bundle) obj;
                privateDebug(msg, " bundle=", b.getSymbolicName(),
                                   " id=", b.getBundleId(),
                                   " state=", stringBundleStateFromInt(b.getState()));
            } else if (BundleEvent.class.isAssignableFrom(obj.getClass())) {
                BundleEvent event = (BundleEvent) obj;
                privateDebug(msg, stringBundleEventFromInt(event.getType()), 
                        "  bundle=", event.getBundle().getSymbolicName()); 
            } else if (obj.getClass().isArray()) {
                privateDebug(msg);
                int len = ((Object[])obj).length;
                for (int i=0; i<len; i++) {
                    privateDebug("  ", String.valueOf(Array.get(obj, i)));                    
                }
            } else if (Dictionary.class.isAssignableFrom(obj.getClass())) {
                privateDebug(msg);
                Dictionary dict = (Dictionary)obj; 
                Enumeration keysEnum = dict.keys();
                Enumeration valsEnum = dict.elements();
                while (keysEnum.hasMoreElements()) { 
                    privateDebug("  key: ", keysEnum.nextElement(), " value: ", valsEnum.nextElement());
                }
            } else {
                privateDebug(msg, String.valueOf(obj));
            }
        }
    }
    
    public static String stringBundleStateFromInt(int bundleState) {
        switch (bundleState) {
            case 1: return "UNINSTALLED";
            case 2: return "INSTALLED";
            case 4: return "RESOLVED";
            case 8: return "STARTING";
            case 16: return "STOPPING";
            case 32: return "ACTIVE";
            default: return "UNDEFINED_STATE: " + bundleState;
        }
    }
    
    public static String stringBundleEventFromInt(int eventType) {
        switch (eventType) {
            case 1: return "INSTALLED";
            case 2: return "STARTED";
            case 4: return "STOPPED";
            case 8: return "UPDATED";
            case 16: return "UNINSTALLED";
            case 32: return "RESOLVED";
            case 64: return "UNRESOLVED";
            case 128: return "STARTING";
            case 256: return "STOPPING";
            case 512: return "LAZY_ACTIVATION";
            default: return "UNDEFINED_EVENT: " + eventType;
        }
    }

    /*===================*/
    /* Private functions */
    /*===================*/
    
    // Private function to print out series of debug strings
    public static void privateDebug(String... msgs) { 
        StringBuilder sb = new StringBuilder();
        for (String msg : msgs) sb.append(msg);
        System.out.println(sb.toString());
        System.out.flush();
    }

    // Private function to print out series of debug objects
    public static void privateDebug(Object... args) { 
        String[] msgs = new String[args.length];
        for (int i=0; i<args.length; i++)
            msgs[i] = String.valueOf(args[i]);
        privateDebug(msgs);
    }
}