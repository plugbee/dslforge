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

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
    
    /** Main Gemini JPA manager */
    GeminiManager mgr;

    /*=====================*/
    /* Activator functions */
    /*=====================*/
    
    @Override
    public void start(BundleContext context) throws Exception {
        debug("Gemini JPA starting...");
        mgr = new GeminiManager();
        mgr.startup(context);
        debug("Gemini JPA started");
    }
    
    @Override
    public void stop(BundleContext context) throws Exception {
        debug("Gemini JPA stopping...");
        mgr.shutdown(context);
        debug("Gemini JPA stopped");
	}
}