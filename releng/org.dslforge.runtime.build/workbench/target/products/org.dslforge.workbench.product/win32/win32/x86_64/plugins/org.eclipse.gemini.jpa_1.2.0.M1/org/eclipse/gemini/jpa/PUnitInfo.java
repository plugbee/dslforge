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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.eclipse.gemini.jpa.ProviderWrapper;
import org.eclipse.gemini.jpa.proxy.EMFBuilderServiceProxyHandler;
import org.eclipse.gemini.jpa.proxy.EMFServiceProxyHandler;
import org.eclipse.gemini.jpa.xml.PersistenceDescriptorHandler;
import org.osgi.framework.Bundle;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Runtime structure containing the information about a persistence unit.
 * Two parts of it:
 * 
 * 1) Runtime state
 * This is the state that accumulates as a persistence unit is processed by Gemini JPA.
 * It includes many of the runtime objects that play a role in the persistence unit
 * during its lifecycle and regular use.
 *
 * 2) Descriptor state
 * 
 * This is the configuration state extracted from the persistence descriptor.
 * Note that only the state that is relevant to the runtime is extracted. The rest
 * of the configuration state in the persistence descriptor is ignored.
 * 
 */
@SuppressWarnings({"rawtypes"})
public class PUnitInfo {
    
    /*===============*/
    /* Runtime state */
    /*===============*/
    
    /** 
     * Persistence unit bundle - set by extender
     * @see PersistenceBundleExtender 
     */
    Bundle bundle;

    /** 
     * The provider instance servicing this p-unit - set by extender
     * @see PersistenceBundleExtender 
     */
    ProviderWrapper assignedProvider;
    
    /** 
     * Info about the persistence descriptor this data came from - set by bundleUtil
     * @see PersistenceUnitBundleUtil
     */
    PersistenceDescriptorInfo descriptorInfo;

    /** 
     * Package names of all managed classes in the p-unit - set by bundleUtil
     * @see PersistenceUnitBundleUtil
     */
    List<String> uniquePackageNames;
    
    /** 
     * EMF Service state - set by servicesUtil
     * @see ServicesUtil
     */
    EMFServiceProxyHandler emfHandler;
    ServiceRegistration emfService;

    /** 
     * EMF Builder Service state - set by ServicesUtil
     * @see ServicesUtil
     */
    EMFBuilderServiceProxyHandler emfBuilderHandler;
    ServiceRegistration emfBuilderService;

    /** 
     * Shared EMF - set/unset by EMF[Builder]ServiceProxyHandler
     * @see EMFServiceProxyHandler
     * @see EMFBuilderServiceProxyHandler
     */
    EntityManagerFactory emf;

    /** 
     * Flag to indicate whether the EMF was set by the Builder or not
     *      - set by EMFServiceProxyHandler or EMFBuilderServiceProxyHandler
     * @see EMFServiceProxyHandler
     * @see EMFBuilderServiceProxyHandler
     */
    boolean emfSetByBuilderService;

    /** 
     * DataSourceFactory service used to indicate that a data source factory service was found and can be used
     *          - set by ServicesUtil
     * @see ServicesUtil
     */
    ServiceReference dsfService;

    /** 
     * For tracking the data source factory - set by DataSourceUtil
     * @see DataSourceUtil 
     */
    ServiceTracker dsfTracker;
    
    /** 
     * Data source looked up from JNDI. Alternative to the DSF - set by ServicesUtil
     * @see ServicesUtil 
     */
    DataSource jndiDataSource;
    
    /** 
     * Weaving hook whiteboard service - set by ServicesUtil
     * @see ServicesUtil
     */
    ServiceRegistration weavingHookService;
    
    /** 
     * Additional properties from a config object 
     *      - set by the config when invoked by mgr before registering the punit
     * @see PersistenceUnitConfiguration 
     */
    Map<String, Object> configProperties;

    /*==============================*/
    /* Persistence descriptor state */
    /*==============================*/

    /**
     * The following state is typically set by the XML parser,
     * but may end up being written by the config if config admin is used
     * @see PersistenceDescriptorHandler 
     * @see PersistenceUnitConfiguration
     */
    String unitName;
    String provider;
    String nonJtaDataSource;
    String jtaDataSource; // not currently used
    Set<String> classes = new HashSet<String>();
    String driverClassName;
    String driverUrl;
    String driverUser;
    String driverPassword;
    String driverVersion;

    /*=============================*/
    /* Accessors for runtime state */
    /*=============================*/
    
    public Bundle getBundle() { return bundle; }
    public void setBundle(Bundle b) { this.bundle = b; }
    
    public ProviderWrapper getAssignedProvider() { return assignedProvider; }
    public void setAssignedProvider(ProviderWrapper p) { this.assignedProvider = p; }

    public PersistenceDescriptorInfo getDescriptorInfo() { return descriptorInfo; }
    public void setDescriptorInfo(PersistenceDescriptorInfo info) { this.descriptorInfo = info; }

    public List<String> getUniquePackageNames() { return uniquePackageNames; }
    public void setUniquePackageNames(List<String> names) { this.uniquePackageNames = names; }

    public EMFServiceProxyHandler getEmfHandler() { return emfHandler; }
    public void setEmfHandler(EMFServiceProxyHandler emfHandler) { this.emfHandler = emfHandler; }

    public ServiceRegistration getEmfService() { return emfService; }
    public void setEmfService(ServiceRegistration emfService) { this.emfService = emfService; }

    public EMFBuilderServiceProxyHandler getEmfBuilderHandler() { return emfBuilderHandler; }
    public void setEmfBuilderHandler(EMFBuilderServiceProxyHandler emfBuilderHandler) { this.emfBuilderHandler = emfBuilderHandler; }

    public ServiceRegistration getEmfBuilderService() { return emfBuilderService; }
    public void setEmfBuilderService(ServiceRegistration emfBuilderService) { this.emfBuilderService = emfBuilderService; }

    public EntityManagerFactory getEmf() { return emf; }
    public void setEmf(EntityManagerFactory emf) { this.emf = emf; }
    
    public boolean isEmfSetByBuilderService() { return emfSetByBuilderService; }
    public void setEmfSetByBuilderService(boolean flag) { emfSetByBuilderService = flag; }
    
    public ServiceReference getDsfService() { return dsfService; }
    public void setDsfService(ServiceReference dsfService) { this.dsfService = dsfService; }

    public ServiceTracker getTracker() { return dsfTracker; }
    public ServiceTracker getDsfTracker() { return dsfTracker; }
    public void setDsfTracker(ServiceTracker dsfTracker) { this.dsfTracker = dsfTracker; }

    public DataSource getJndiDataSource() { return jndiDataSource; }
    public void setJndiDataSource(DataSource jndiDataSource) { this.jndiDataSource = jndiDataSource; }

    public ServiceRegistration getWeavingHookService() { return weavingHookService; }
    public void setWeavingHookService(ServiceRegistration weavingHookService) { this.weavingHookService = weavingHookService; }

    public Map<String, Object> getConfigProperties() { return configProperties; }
    public void setConfigProperties(Map<String, Object> configProperties) { this.configProperties = configProperties; }

    /*============================================*/
    /* Accessors for Persistence descriptor state */
    /*============================================*/

    public String getUnitName() { return unitName; }
    public void setUnitName(String s) { this.unitName = s ; }

    public String getProvider() { return provider; }
    public void setProvider(String s) { this.provider = s; }

    public String getNonJtaDataSource() { return nonJtaDataSource; }
    public void setNonJtaDataSource(String s) { this.nonJtaDataSource = s; }

    public String getJtaDataSource() { return jtaDataSource; }
    public void setJtaDataSource(String s) { this.jtaDataSource = s; }

    public Set<String> getClasses() { return classes; }
    public void addClass(String s) { this.classes.add(s); }

    public String getDriverClassName() { return driverClassName; }
    public void setDriverClassName(String s) { driverClassName = s; }

    public String getDriverUrl() { return driverUrl; }
    public void setDriverUrl(String driverUrl) { this.driverUrl = driverUrl; }

    public String getDriverUser() { return driverUser; }
    public void setDriverUser(String driverUser) { this.driverUser = driverUser; }

    public String getDriverPassword() { return driverPassword; }
    public void setDriverPassword(String driverPassword) { this.driverPassword = driverPassword; }
    
    public String getDriverVersion() { return driverVersion; }
    public void setDriverVersion(String driverVersion) { this.driverVersion = driverVersion; }

    /*=========*/
    /* Methods */
    /*=========*/
    
    @Override
    public int hashCode() { return getUnitName().hashCode(); }
        
    @Override
    public boolean equals(Object o) { 
        return (o instanceof PUnitInfo)
            && (this.getUnitName() != null)
            && (this.getUnitName().equals(((PUnitInfo)o).getUnitName())); 
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nPUnit: ").append(getUnitName())
          .append("\n  --- XML Data ---")
          .append((getProvider()!=null) ? "\n  provider: " + getProvider() : "")
          .append((getNonJtaDataSource()!=null) ? "\n  nonJtaDataSource: " + getNonJtaDataSource() : "")
          .append((getJtaDataSource()!=null) ? "\n  jtaDataSource: " + getJtaDataSource() : "")
          .append((getClasses()!=null) ? "\n  classes: " + getClasses() : "")
          .append((getDriverClassName()!=null) ? "\n  driverClassName: " + getDriverClassName() : "")
          .append((getDriverUrl()!=null) ? "\n  driverUrl: " + getDriverUrl() : "")
          .append((getDriverUser()!=null) ? "\n  driverUser: " + getDriverUser() : "")
          .append((getDriverPassword()!=null) ? "\n  driverPassword: " + getDriverPassword() : "")
          .append((getDriverVersion()!=null) ? "\n  driverVersion: " + getDriverVersion() : "")
          .append("\n  --- Runtime Data ---")
          .append((getBundle()!=null) ? "\n  bundle: " + getBundle().getSymbolicName() : "")
          .append((getAssignedProvider()!=null) ? "\n  assignedProvider: " + getAssignedProvider() : "")
          .append((getDescriptorInfo()!=null) ? "\n  descriptorInfo: " + getDescriptorInfo() : "")
          .append((getDsfTracker()!=null) ? "\n  DSF tracker: " + getDsfTracker() : "")
          .append((getJndiDataSource()!=null) ? "\n  Data source: " + getJndiDataSource() : "");
       return sb.toString();
    }
    
    public Map<String,Object> toMap() {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("unitName", unitName);
        map.put("provider", provider);
        map.put("nonJtaDataSource", nonJtaDataSource);
        map.put("jtaDataSource", jtaDataSource);
        map.put("classes", classes);
        map.put("driverClassName", driverClassName);
        map.put("driverUrl", driverUrl);
        map.put("driverUser", driverUser);
        map.put("driverUser", driverUser);
        map.put("driverPassword", driverPassword);
        map.put("driverVersion", driverVersion);
        map.put("bundle", bundle);
        map.put("assignedProvider", assignedProvider);
        map.put("emfSetByBuilderService", emfSetByBuilderService);
        map.put("descriptorInfo", descriptorInfo);
        map.put("configProps", configProperties);
        map.put("dataSource", jndiDataSource);
        return map;
    }
}