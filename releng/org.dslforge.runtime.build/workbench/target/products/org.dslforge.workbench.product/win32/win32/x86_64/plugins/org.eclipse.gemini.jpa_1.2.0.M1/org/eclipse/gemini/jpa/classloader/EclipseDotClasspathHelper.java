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
 *     ssmith 
 ******************************************************************************/
package org.eclipse.gemini.jpa.classloader;

import static org.eclipse.gemini.jpa.GeminiUtil.close;
import static org.eclipse.gemini.jpa.GeminiUtil.debugClassLoader;
import static org.eclipse.gemini.jpa.GeminiUtil.fatalError;

import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.gemini.jpa.xml.EclipseDotClasspathHandler;
import org.osgi.framework.Bundle;

public class EclipseDotClasspathHelper {

    private EclipseDotClasspathHandler handler;

    /** 
     * Answer the output path contained in an Eclipse project's
     * .classpath file.  Will only open and parse the file
     * once, if it exists.
     * 
     * @return String
     */
    public String getBinPath(Bundle bundle) {
        if (handler == null) {
            handler = new EclipseDotClasspathHandler();
        } else {
            // if handler is != null then we have already
            // attempted to locate and parse the .classpath
            return handler.getBinPath();
        }
        URL resource = bundle.getEntry(".classpath");
        if (resource == null) {
            return null;
        }
        InputStream in = null;
        try { 
            in = resource.openStream();
            debugClassLoader("Parsing Eclipse .classpath");
            SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
            parser.parse(in, handler);
            String binPath = handler.getBinPath();
            debugClassLoader("Finished parsing Eclipse .classpath: ", binPath);
            return binPath;
        } catch(Throwable ex) {
            fatalError("Could not parse .classpath ", ex);
        } finally {
            close(in);
        }
        return null;
    }

}
