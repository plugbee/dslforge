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
 *     mkeith - Gemini JPA 
 ******************************************************************************/
package org.eclipse.gemini.jpa.configadmin;

import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.net.URL;

import org.eclipse.gemini.jpa.PersistenceDescriptorInfo;

@SuppressWarnings("deprecation")
public class InlinedDescriptorInfo extends PersistenceDescriptorInfo {
    
    // Inlined descriptor string
    String descriptor;

    public InlinedDescriptorInfo(PersistenceUnitConfiguration config) {
        this.setDescriptorPath(config.getDescriptorName());
        this.descriptor = config.getDescriptor();
    }
    
    // Not supported by this kind of descriptorInfo
    @Override public URL getUrl() { notSupported(); return null; }
    @Override public void setUrl(URL url) { notSupported(); }
    @Override public String getJarPath() { notSupported(); return null; }
    @Override public void setJarPath(String jarPath) { notSupported(); }
    private void notSupported() { /*throw new UnsupportedOperationException();  */ }

    // Subclass overrides
    @Override public boolean isEmbedded() { 
        return false; 
    }

    @Override public InputStream getDescriptorStream() {
        return new StringBufferInputStream(descriptor);
    }

    @Override public String toString() {
        return "InlinedDescriptorInfo(" + getDescriptorPath() + ")";
    }
}
