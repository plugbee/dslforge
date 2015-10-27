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
package org.eclipse.gemini.jpa.jndi;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameNotFoundException;
import javax.sql.DataSource;

import org.eclipse.gemini.jpa.GeminiManager;

import static org.eclipse.gemini.jpa.GeminiUtil.debug;
import static org.eclipse.gemini.jpa.GeminiUtil.fatalError;

/**
 * Utility class containing functions for JNDI integration
 */
public class JndiUtil {

    // Pointer back to manager
    GeminiManager mgr;
    
    public JndiUtil(GeminiManager mgr) {
        this.mgr = mgr;
    }

    /** Do a JNDI lookup for the data source and return the result.
     *  Return the data source if it was found, return null if it was not.
     *  Throw an exception in any other case. 
     */
    public DataSource lookupDataSource(String nameString) {
        Object result = null; 
        try {
            debug("JndiUtil.lookupDataSource - looking up ", nameString);
            Context ctx = new InitialContext();
            result = ctx.lookup(nameString);
            if (result instanceof DataSource) {
                debug("JndiUtil.lookupDataSource - Found data source ", result);
                return (DataSource) result;
            } else if (result instanceof Context) {
                // servicelist format is not supported
                throw new RuntimeException("osgi:servicelist/ data source lookup format not supported");
            } else {
                throw new RuntimeException("Unexpected object binding in JNDI: " + result.toString());                    
            }
        } catch (NameNotFoundException nnfEx) {
            // Nothing was registered under that name
            debug("JndiUtil.lookupDataSource - Name not found for ", nameString);
            return null;
        } catch (Throwable t) {
            fatalError("Lookup for " + nameString + " failed: ", t);
        }
        return null; // Unreachable. (The compiler just can't figure this out...)
    }
}