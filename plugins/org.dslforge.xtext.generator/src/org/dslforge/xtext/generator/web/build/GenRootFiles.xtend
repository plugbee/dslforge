/**
 * <copyright>
 * 
 * Copyright (c) 2015 PlugBee. All rights reserved.
 * 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Amine Lajmi - Initial API and implementation
 * 
 * </copyright>
 */
package org.dslforge.xtext.generator.web.build

import org.dslforge.common.AbstractGenerator
import org.dslforge.common.IWebProjectFactory
import org.dslforge.xtext.generator.XtextGrammar
import org.eclipse.core.runtime.IProgressMonitor

class GenRootFiles extends AbstractGenerator {

	var XtextGrammar grammar

	new() {
		basePath = ""
	}

	override doGenerate(IWebProjectFactory factory, IProgressMonitor monitor) {
		grammar = factory.input as XtextGrammar
		projectName = factory.project.name
		grammarShortName = grammar.getShortName()
		relativePath = grammarShortName.toLowerCase + "/rootfiles/WEB-INF/"
		factory.generateFile(relativePath, "launch.ini", toTxt(), monitor)
		factory.generateFile(relativePath, "web.xml", toXml(), monitor)
	}

	def toTxt() '''
# Eclipse Runtime Configuration Overrides
# These properties are loaded prior to starting the framework and can also be used to override System Properties
# @null is a special value used to override and clear the framework's copy of a System Property prior to starting the framework
# "*" can be used together with @null to clear System Properties that match a prefix name. 

osgi.*=@null
org.osgi.*=@null
eclipse.*=@null
org.eclipse.*=@null

osgi.parentClassloader=app
osgi.contextClassLoaderParent=app
	'''
	
	def toXml() '''
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE web-app PUBLIC "-//Sun Microsystems, Inc.//DTD Web Application 2.2//EN" "http://java.sun.com/j2ee/dtds/web-app_2_2.dtd">
<web-app id="WebApp">
  <servlet id="bridge">
    <servlet-name>equinoxbridgeservlet</servlet-name>
    <display-name>Equinox Bridge Servlet</display-name>
    <description>Equinox Bridge Servlet</description>
    <servlet-class>org.eclipse.equinox.servletbridge.BridgeServlet</servlet-class>

    <init-param>
      <param-name>commandline</param-name>
      <param-value> -registryMultiLanguage -console 10001 -consoleLog</param-value>
    </init-param>

    <init-param>
      <param-name>enableFrameworkControls</param-name>
      <param-value>true</param-value>
    </init-param>

    <!--
      When the framework is deployed, an extension bundle must be present to allow the Servlet API to
      be exported by the container.  Typically, this extension bundle is created at deploy time by the
      FrameworkLauncher.  If, however, an extension bundle (with id 'org.eclipse.equinox.servletbridge.extensionbundle') is
      already present in the 'plugins' area, then preference is given to the existing bundle.
      If this param is set to 'true', then the existing extension bundle with be *overridden* and
      the one created by the FrameworkLauncher will replace any existing one.  The default is 'false'
      (giving preference to the existing extension bundle if present).

      default: false
    <init-param>
      <param-name>overrideAndReplaceExtensionBundle</param-name>
      <param-value>false</param-value>
    </init-param>
    -->

    <load-on-startup>1</load-on-startup>
  </servlet>

  <servlet-mapping>
    <servlet-name>equinoxbridgeservlet</servlet-name>
    <url-pattern>/*</url-pattern>
  </servlet-mapping>

  <!-- session timeout in minutes -->
  <session-config>
    <session-timeout>20</session-timeout>
  </session-config>

</web-app>
	'''
}
