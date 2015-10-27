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
 *     ssmith, mkeith 
 ******************************************************************************/
package org.eclipse.gemini.jpa.xml;

import static org.eclipse.gemini.jpa.GeminiUtil.debugXml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


/**
 * Parser handler for parsing the Eclipse .classpath file.
 * This class does not parse the entire file.  We're only
 * interested in the binary "output" directory that contains
 * classes and resources.
 */
public class EclipseDotClasspathHandler extends DefaultHandler {
    
    // The current element
    private String binPath;
    
    /*========================*/
    /* DefaultHandler methods */
    /*========================*/

    protected void setBinPath(String path) {
        this.binPath = path;
    }

    public String getBinPath() {
        return binPath;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        debugXml("<<< startElement localName: ", localName, " qName: ", qName);

        if ("classpathentry".equals(qName)) {
            String kind = attributes.getValue("kind");
            debugXml("kind: ", kind);
            if ("output".equals(kind)) { 
                String path = attributes.getValue("path");
                debugXml("path: ", kind);
                setBinPath(path);
            }            
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        debugXml(">>> EndElement,  localName: ", localName, "  qName: ", qName);
    }

    /*================*/
    /* Helper methods */
    /*================*/
    
    protected boolean nullOrEmpty(String s) { return s == null || s.length() == 0; }

}
