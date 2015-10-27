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
package org.eclipse.gemini.jpa.xml;

import java.util.HashSet;
import java.util.Set;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


import org.eclipse.gemini.jpa.GeminiUtil;
import org.eclipse.gemini.jpa.PUnitInfo;

import static org.eclipse.gemini.jpa.GeminiUtil.*;


/**
 * Parser handler for parsing the persistence descriptors.
 * This class does not parse the descriptors in their entirety,
 * but saves only a portion of the content in order for the OSGi
 * integration to know whether a given persistence unit can be
 * assigned to a particular provider.
 */
public class PersistenceDescriptorHandler extends DefaultHandler {
    
    // The current element
    String currentElement;
    
    // The current persistence unit being processed
    PUnitInfo currentPUnit;
        
    // Set of persistence unit info in the persistence descriptor
    Set<PUnitInfo> pUnits = new HashSet<PUnitInfo>();
    
    public Set<PUnitInfo> getPersistenceUnitInfo() { return pUnits; }

    /*========================*/
    /* DefaultHandler methods */
    /*========================*/

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        debugXml("<<< startElement localName: ", localName, " qName: ", qName);

        currentElement = localName;
        if (nullOrEmpty(currentElement)) {
            if (nullOrEmpty(qName))
                GeminiUtil.fatalError("No element returned", null);
            String[] comps = qName.split(":");
            currentElement = comps[comps.length - 1];
        }
        debugXml("currentElement: ", currentElement);
        
        // Beginning of p-unit
        if (currentElement.equals("persistence-unit")) {
            String unitName = attributes.getValue("name");
            debugXml("unit name: ", unitName);
            if (nullOrEmpty(unitName)) 
                GeminiUtil.fatalError("No unit name found" , null);
            
            currentPUnit = new PUnitInfo();
            currentPUnit.setUnitName(unitName);
            pUnits.add(currentPUnit);
            
        // Look for Driver properties
        } else if (currentElement.equals("property")) {
            String propName = attributes.getValue("name");
            debugXml("prop name: ", propName);
            if (nullOrEmpty(propName))
                GeminiUtil.fatalError("Invalid 'name' for persistence descriptor <property>" , null);
            String propValue = attributes.getValue("value");
            debugXml("prop value: ", propValue);
            // If no value then set to empty string
            if (propValue == null)
                propValue = "";

            if (propName.equals(GeminiUtil.JPA_JDBC_DRIVER_PROPERTY))
                currentPUnit.setDriverClassName(propValue);
            else if (propName.equals(GeminiUtil.JPA_JDBC_URL_PROPERTY))
                currentPUnit.setDriverUrl(propValue);
            else if (propName.equals(GeminiUtil.JPA_JDBC_USER_PROPERTY))
                currentPUnit.setDriverUser(propValue);
            else if (propName.equals(GeminiUtil.JPA_JDBC_PASSWORD_PROPERTY))
                currentPUnit.setDriverPassword(propValue);
            else if (propName.equals(GeminiUtil.OSGI_JDBC_DRIVER_VERSION_PROPERTY))
                currentPUnit.setDriverVersion(propValue);
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        currentElement = null;
        debugXml(">>> EndElement,  localName: ", localName, "  qName: ", qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (currentElement == null) return;
        if (currentElement.equals("provider")) {
            currentPUnit.setProvider(contentFromChars(ch, start, length));
            debugXml("provider: ", currentPUnit.getProvider());
        } else if (currentElement.equals("non-jta-data-source")) {
                currentPUnit.setNonJtaDataSource(contentFromChars(ch, start, length));
                debugXml("nonJtaDataSource: ", currentPUnit.getNonJtaDataSource());
        } else if (currentElement.equals("jta-data-source")) {
            currentPUnit.setJtaDataSource(contentFromChars(ch, start, length));
            debugXml("jtaDataSource: ", currentPUnit.getJtaDataSource());
        } else if (currentElement.equals("class")) {
            String classString = contentFromChars(ch, start, length);
            currentPUnit.addClass(classString);
            debugXml("class: ", classString);
        }
    }

    /*================*/
    /* Helper methods */
    /*================*/
    
    protected boolean nullOrEmpty(String s) { return s == null || s.length() == 0; }

    protected String contentFromChars(char[] chars, int start, int length) {
        StringBuilder s = new StringBuilder(length);
        for (int idx=start; idx<(start+length); idx++) s.append(chars[idx]);
        // Bug 327908 - Trim to remove whitespace
        return s.toString().trim();
    }
}
