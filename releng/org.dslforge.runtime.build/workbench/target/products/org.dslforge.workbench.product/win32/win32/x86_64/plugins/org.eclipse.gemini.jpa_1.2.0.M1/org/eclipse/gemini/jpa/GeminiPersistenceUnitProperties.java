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

public class GeminiPersistenceUnitProperties {

    /*======================================================================*/
    /* Gemini-specific persistence unit properties that can be configured   */
    /* in the persistence descriptor or passed into an EMF creation method. */
    /*======================================================================*/

    /** 
     * The presence of this property will imply that Gemini JPA will *not* look for
     * the data source, but assume that the provider will connect to it directly. 
     * (Note that no property value is required or processed.)
     * This property should only be used if the provider can access/load the data 
     * source [driver] classes, or the data source is natively supported by the 
     * provider and can be connected to without having to load additional classes. 
     * The connection properties needed by the provider must be supplied either in
     * the persistence descriptor or passed at runtime.(JDBC properties not required)
     * These properties may also be specified in an OSGi Configuration.
     */
    public static String PROVIDER_CONNECTED_DATA_SOURCE = "gemini.jpa.providerConnectedDataSource";

    /*===================================================================*/
    /* Gemini-specific persistence unit properties that can be set in an */
    /* OSGi Configuration object.                                        */
    /*===================================================================*/

    /** 
     * Property specifying the name of the persistence unit.
     * This property MUST be specified when a persistence unit config admin 
     * configuration is being used. The name of the persistence unit must match 
     * the name included in a persistence descriptor in the persistence bundle
     * (where the entity classes are located) if a persistence descriptor exists.
     */
    public static String PUNIT_NAME = "gemini.jpa.punit.name";
    
    /** 
     * Property specifying the Bundle-SymbolicName of the persistence bundle.
     * This property MUST be specified when a persistence unit config admin 
     * configuration is being used and the persistence bundle that contains the 
     * entity classes for this persistence unit does NOT include a persistence 
     * descriptor. It MUST NOT be specified if a persistence descriptor is 
     * included in the persistence bundle.
     */
    public static String PUNIT_BSN = "gemini.jpa.punit.bsn";

    /** 
     * Property that, when set to false, specifies that managed classes (e.g. 
     * entities) of the punit are to be discovered by scanning the persistence bundle.
     * This property may only be specified when a persistence unit config admin 
     * configuration is used and when no persistence descriptor exists in the 
     * persistence bundle (i.e. when PUNIT_BSN has also been specified).
     * It should not be specified if PUNIT_CLASSES has been specified.
     */
    public static String PUNIT_EXCLUDE_UNLISTED_CLASSES = "gemini.jpa.punit.excludeUnlistedClasses";

    /** 
     * Property that specifies the managed classes (e.g. entities) of the punit.
     * The value of the property should be a List of fully-qualified class name Strings.
     * This property may be specified when a persistence unit config admin 
     * configuration is used and when no persistence descriptor exists in the 
     * persistence bundle (i.e. when PUNIT_BSN has also been specified).
     * It should not be specified if PUNIT_EXCLUDE_UNLISTED_CLASSES has been specified.
     */
    public static String PUNIT_CLASSES = "gemini.jpa.punit.classes";

    /** 
     * Property that, when set to true, indicates to Gemini JPA that it must 
     * perform a refresh of the persistence unit bundle to apply incremental config.
     * This property may be specified when a persistence unit config admin 
     * configuration is used and when a persistence descriptor exists in the 
     * persistence bundle (i.e. PUNIT_BSN property has not been specified).
     * This is useful if a property is specified in the configuration 
     * that requires EclipseLink processing at preResolve time, such as if 
     * weaving is enabled (i.e. eclipselink.weaving property is set to true)
     * in the configuration but was not enabled in the persistence descriptor.
     * The default value of this property is false, (i.e. no refreshing).
     * Setting this property to false will have no effect under any circumstances.
     */
    public static String PUNIT_REFRESH = "gemini.jpa.punit.refresh";
    
}