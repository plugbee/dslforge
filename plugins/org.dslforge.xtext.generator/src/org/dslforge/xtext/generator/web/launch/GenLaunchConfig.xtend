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
package org.dslforge.xtext.generator.web.launch

import org.dslforge.common.AbstractGenerator
import org.dslforge.common.IWebProjectFactory
import org.dslforge.xtext.generator.XtextGrammar
import org.eclipse.core.runtime.IProgressMonitor

class GenLaunchConfig extends AbstractGenerator {

	var XtextGrammar grammar
	var String versionNumber
	new() {
		relativePath = "/"
		basePath = ""
	}

	override doGenerate(IWebProjectFactory factory, IProgressMonitor monitor) {
		grammar = factory.input as XtextGrammar
		projectName = factory.project.name
		grammarShortName = grammar.getShortName()
		versionNumber = IWebProjectFactory::DSLFORGE_EXAMPLES_VERSION_NUMBER
		factory.generateFile(basePath, grammarShortName.toFirstUpper+"WebEditor.launch", toLaunch(), monitor)
	}

def toLaunch()'''
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<launchConfiguration type="org.eclipse.rap.ui.launch.RAPLauncher">
<booleanAttribute key="append.args" value="true"/>
<booleanAttribute key="askclear" value="false"/>
<booleanAttribute key="automaticAdd" value="false"/>
<booleanAttribute key="automaticValidate" value="false"/>
<stringAttribute key="bootstrap" value=""/>
<stringAttribute key="checked" value="[NONE]"/>
<booleanAttribute key="clearConfig" value="true"/>
<booleanAttribute key="clearws" value="true"/>
<stringAttribute key="configLocation" value="${workspace_loc}/.metadata/.plugins/org.eclipse.pde.core/«grammarShortName.toFirstUpper»WebEditor"/>
<booleanAttribute key="default" value="true"/>
<booleanAttribute key="default_auto_start" value="true"/>
<intAttribute key="default_start_level" value="4"/>
<booleanAttribute key="includeOptional" value="false"/>
<booleanAttribute key="org.eclipse.jdt.launching.ATTR_USE_START_ON_FIRST_THREAD" value="true"/>
<stringAttribute key="org.eclipse.jdt.launching.JRE_CONTAINER" value="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.8"/>
<stringAttribute key="org.eclipse.jdt.launching.PROGRAM_ARGUMENTS" value="-os ${target.os} -ws ${target.ws} -arch ${target.arch} -nl ${target.nl} -consoleLog -console"/>
<stringAttribute key="org.eclipse.jdt.launching.SOURCE_PATH_PROVIDER" value="org.eclipse.pde.ui.workbenchClasspathProvider"/>
<stringAttribute key="org.eclipse.jdt.launching.VM_ARGUMENTS" value="-Declipse.ignoreApp=true -Dosgi.noShutdown=true&#13;&#10;-Dorg.eclipse.equinox.http.jetty.log.stderr.threshold=info"/>
<stringAttribute key="org.eclipse.rap.launch.browserMode" value="EXTERNAL"/>
<stringAttribute key="org.eclipse.rap.launch.contextpath" value="/"/>
<stringAttribute key="org.eclipse.rap.launch.dataLocation" value="${workspace_loc}/.metadata/.plugins/org.eclipse.rap.tools.launch/«grammarShortName.toFirstUpper»WebEditor"/>
<booleanAttribute key="org.eclipse.rap.launch.developmentMode" value="true"/>
<booleanAttribute key="org.eclipse.rap.launch.openBrowser" value="true"/>
<intAttribute key="org.eclipse.rap.launch.port" value="10080"/>
<stringAttribute key="org.eclipse.rap.launch.servletPath" value="/texteditor"/>
<intAttribute key="org.eclipse.rap.launch.sessionTimeout" value="0"/>
<booleanAttribute key="org.eclipse.rap.launch.useDefaultDataLocation" value="true"/>
<booleanAttribute key="org.eclipse.rap.launch.useManualContextPath" value="false"/>
<booleanAttribute key="org.eclipse.rap.launch.useManualPort" value="false"/>
<booleanAttribute key="org.eclipse.rap.launch.useSessionTimeout" value="false"/>
<stringAttribute key="pde.version" value="3.3"/>
<booleanAttribute key="show_selected_only" value="false"/>
<stringAttribute key="target_bundles" value="com.google.guava@default:default,com.google.inject@default:default,com.ibm.icu@default:default,javax.inject@default:default,javax.persistence@default:default,javax.servlet*3.1.0.v201410161800@default:default,javax.xml@default:default,org.antlr.runtime@default:default,org.apache.felix.gogo.command@default:default,org.apache.felix.gogo.runtime@default:default,org.apache.felix.gogo.shell@default:default,org.apache.log4j@default:default,org.dslforge.common.logging@default:false,org.dslforge.styledtext@default:default,org.dslforge.texteditor.demo@default:default,org.dslforge.texteditor@default:default,org.dslforge.workspace.config@4:default,org.dslforge.workspace.jpa@3:default,org.dslforge.workspace.ui@default:default,org.dslforge.workspace@5:default,org.dslforge.xtext.common@default:default,org.eclipse.core.commands@default:default,org.eclipse.core.contenttype@default:default,org.eclipse.core.databinding.observable@default:default,org.eclipse.core.databinding.property@default:default,org.eclipse.core.databinding@default:default,org.eclipse.core.expressions@default:default,org.eclipse.core.jobs@default:default,org.eclipse.core.runtime@default:true,org.eclipse.emf.common@default:default,org.eclipse.emf.ecore.xmi@default:default,org.eclipse.emf.ecore@default:default,org.eclipse.emf.edit@default:default,org.eclipse.emf.rap.common.ui@default:default,org.eclipse.emf.rap.edit.ui@default:default,org.eclipse.equinox.app@default:default,org.eclipse.equinox.cm@default:default,org.eclipse.equinox.common@2:true,org.eclipse.equinox.console@default:default,org.eclipse.equinox.ds@1:true,org.eclipse.equinox.event@default:default,org.eclipse.equinox.http.jetty@default:default,org.eclipse.equinox.http.registry@default:default,org.eclipse.equinox.http.servlet@default:default,org.eclipse.equinox.http.servletbridge@default:default,org.eclipse.equinox.preferences@default:default,org.eclipse.equinox.registry@default:default,org.eclipse.equinox.servletbridge@default:default,org.eclipse.equinox.util@default:default,org.eclipse.gemini.jpa@2:default,org.eclipse.help@default:default,org.eclipse.jetty.continuation@default:default,org.eclipse.jetty.http@default:default,org.eclipse.jetty.io@default:default,org.eclipse.jetty.security@default:default,org.eclipse.jetty.server@default:default,org.eclipse.jetty.servlet@default:default,org.eclipse.jetty.util@default:default,org.eclipse.osgi.services@default:default,org.eclipse.osgi@-1:true,org.eclipse.persistence.antlr@default:default,org.eclipse.persistence.asm@default:default,org.eclipse.persistence.core@default:default,org.eclipse.persistence.jpa.jpql@default:default,org.eclipse.persistence.jpa@default:default,org.eclipse.persistence.nosql@default:false,org.eclipse.persistence.oracle.nosql@default:false,org.eclipse.persistence.oracle@default:false,org.eclipse.rap.jface.databinding@default:default,org.eclipse.rap.jface@default:default,org.eclipse.rap.rwt.osgi@default:default,org.eclipse.rap.rwt@default:default,org.eclipse.rap.ui.navigator@default:default,org.eclipse.rap.ui.views@default:default,org.eclipse.rap.ui.workbench@default:default,org.eclipse.rap.ui@default:default,org.eclipse.xtend.lib.macro@default:default,org.eclipse.xtend.lib@default:default,org.eclipse.xtext.common.types@default:default,org.eclipse.xtext.logging@default:false,org.eclipse.xtext.smap@default:default,org.eclipse.xtext.util@default:default,org.eclipse.xtext.xbase.lib@default:default,org.eclipse.xtext@default:default,org.objectweb.asm@default:default,osgi.enterprise@1:default"/>
<booleanAttribute key="tracing" value="false"/>
<booleanAttribute key="useCustomFeatures" value="false"/>
<booleanAttribute key="useDefaultConfigArea" value="true"/>
<stringAttribute key="workspace_bundles" value="
«grammar.dslProjectName+".web"»@default:default,
«grammar.dslProjectName»@default:default"/>
</launchConfiguration>
'''
}
