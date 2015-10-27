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
 *     mkeith - cleaned up, added debugging
 ******************************************************************************/
package org.eclipse.gemini.jpa.eclipselink;

import static org.eclipse.gemini.jpa.GeminiUtil.debugClassLoader;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

import org.eclipse.gemini.jpa.GeminiUtil;
import org.eclipse.gemini.jpa.PUnitInfo;
import org.eclipse.persistence.internal.jpa.deployment.ArchiveFactoryImpl;
import org.eclipse.persistence.internal.jpa.deployment.JarInputStreamURLArchive;
import org.eclipse.persistence.jpa.Archive;

/**
 * Subclass of EclipseLink's ArchiveFactoryImpl.
 * This subclass allows construction of a BundleArchive which can use the Bundle API
 * to extract information out of a persistence unit.
 */
@SuppressWarnings({"rawtypes"})
public class OSGiArchiveFactoryImpl extends ArchiveFactoryImpl{

    @Override
    public Archive createArchive(URL rootUrl, String descriptorLocation, Map properties) throws URISyntaxException, IOException {
        debugClassLoader("ArchiveFactoryImpl.createArchive, url=",rootUrl," descLocation=",descriptorLocation," props=",properties);

        // Pull the bundle out from the PUnitInfo property (set by ProviderWrapper in createEMF call) 
        if (properties != null) {
            PUnitInfo unitInfo = (PUnitInfo)properties.get(GeminiUtil.PUNIT_INFO_PROPERTY);
            if (unitInfo != null) {
                if (isJarInputStream(rootUrl)){
                    debugClassLoader("  returning JarInputStreamURLArchive");
                    return new JarInputStreamURLArchive(rootUrl, descriptorLocation);
                } else {
                    debugClassLoader("  returning BundleArchive, bundle=",unitInfo.getBundle());
                    return new BundleArchive(rootUrl, descriptorLocation, unitInfo.getBundle());
                }
            }
        }
        // If none of that worked out then the call must have been through a different route
        debugClassLoader("  returning default parent archive");
        return super.createArchive(rootUrl, descriptorLocation, properties);
    }
}
