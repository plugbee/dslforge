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
package org.eclipse.gemini.jpa.datasource;

import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

import org.eclipse.gemini.jpa.PUnitInfo;
import org.eclipse.gemini.jpa.GeminiUtil;

/**
 *  Detect when an existing DataSourceFactory service goes offline.
 *  Created and started when a registered DSF service was discovered 
 *  at EMF service registration time.
 */
@SuppressWarnings("rawtypes")
public class DSFOfflineTracker implements ServiceTrackerCustomizer {

    // The unit this tracker belongs to
    private PUnitInfo pUnitInfo;
    
    // The util to notify when the service goes away
    private DataSourceUtil dataSourceUtil;

    public DSFOfflineTracker(PUnitInfo pUnitInfo, DataSourceUtil dataSourceUtil) {
        this.pUnitInfo = pUnitInfo;
        this.dataSourceUtil = dataSourceUtil;
    }
    
    @Override
    public Object addingService(ServiceReference ref) {
        GeminiUtil.debug("OfflineTracker.addingService - not concerned with added service ", ref);
        return null;
    }

    @Override
    public void modifiedService(ServiceReference ref, Object service) {}

    @Override
    public void removedService(ServiceReference ref, Object service) {
        GeminiUtil.debug("OfflineTracker.removingService ", ref);
        dataSourceUtil.dataSourceFactoryOffline(pUnitInfo, ref);
    }
}
