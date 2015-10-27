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

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.DataSource;

import static org.osgi.service.jdbc.DataSourceFactory.*;

/** 
 * An abbreviated/simplified DataSource impl that takes a URL from the client
 * and just returns a thin data source wrapper around the basic JDBC driver.
 */
public class PlainDriverDataSource implements DataSource {

    Driver driver = null;
    Properties properties = null;
    String url = null;
    
    public PlainDriverDataSource(Driver driver, Properties properties) {
        this.driver = driver;
        this.properties = (Properties) properties.clone();
        this.url = properties.getProperty(JDBC_URL);
    }

    public Connection getConnection() throws java.sql.SQLException {
        if (url == null) missingUrlException();
        return driver.connect(url, properties);
    }

    public Connection getConnection(String user, String password) throws java.sql.SQLException {
        if (url == null) missingUrlException();
        Properties localProps = (Properties) properties.clone();
        localProps.put(JDBC_USER, user);
        localProps.put(JDBC_PASSWORD, password);
        return driver.connect(url, localProps);
    }
 
    public boolean isWrapperFor(Class<?> cls) throws SQLException { 
        // Fix for bug #342942
        try {
            // If driver class or subclass passed in then true
            if (driver.getClass().isAssignableFrom(cls)) 
                return true;
            // If driver implements interface passed in then true
            Class<?>[] interfaces = driver.getClass().getInterfaces();
            for (Class<?> i : interfaces)
                if (i == cls) return true;
            // Otherwise we don't
            return false;
        } catch (Exception ex) {
            throw new SQLException("Error checking for wrapper", ex);
        }
    }
    
    public <T> T unwrap(Class<T> cls) throws SQLException {
        try {
            return cls.cast(driver);
        } catch (ClassCastException ccEx) {
            throw new SQLException("Error casting driver class", ccEx);
        }
    }

    public PrintWriter getLogWriter() throws SQLException { return DriverManager.getLogWriter(); }

    public int getLoginTimeout() throws SQLException { return DriverManager.getLoginTimeout(); }

    // Don't support setting log writer or timeout 

    public void setLogWriter(PrintWriter writer) throws SQLException {
        throw new SQLException("Can't set Log Writer on URL data source");
    }
    
    public void setLoginTimeout(int timeout) throws SQLException {
        throw new SQLException("Can't set Login Timeout on URL data source");
    }
    
    public Logger getParentLogger()
            throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    // Helper method
    void missingUrlException() throws SQLException {
        throw new SQLException("URL was not specified");            
    }
 

}