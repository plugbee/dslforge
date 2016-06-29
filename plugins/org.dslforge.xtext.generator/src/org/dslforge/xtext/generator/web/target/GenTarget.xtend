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
package org.dslforge.xtext.generator.web.target

import org.dslforge.common.AbstractGenerator
import org.dslforge.common.IWebProjectFactory
import org.dslforge.xtext.generator.XtextGrammar
import org.eclipse.core.runtime.IProgressMonitor

class GenTarget extends AbstractGenerator {

	var XtextGrammar grammar

	new() {
		relativePath = "/"
		basePath = "neon/"
	}

	override doGenerate(IWebProjectFactory factory, IProgressMonitor monitor) {
		grammar = factory.input as XtextGrammar
		projectName = factory.project.name
		grammarShortName = grammar.getShortName()
		factory.generateFile(basePath, grammarShortName.toLowerCase+".target", toXml(), monitor)
	}

	def toXml() '''
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<?pde version="3.8"?><target name="«grammarShortName.toLowerCase»" sequenceNumber="1">
<locations>
<location includeAllPlatforms="false" includeConfigurePhase="true" includeMode="slicer" includeSource="true" type="InstallableUnit">
<unit id="org.dslforge.runtime.feature.feature.group" version="0.0.0"/>
<repository location="http://dslforge.org/downloads/runtime/repository"/>
</location>
<location includeAllPlatforms="false" includeConfigurePhase="true" includeMode="slicer" includeSource="true" type="InstallableUnit">
<unit id="org.eclipse.persistence.sdk.feature.group" version="0.0.0"/>
<repository location="http://download.eclipse.org/rt/eclipselink/updates/"/>
</location>
<location includeAllPlatforms="false" includeConfigurePhase="true" includeMode="slicer" includeSource="true" type="InstallableUnit">
<unit id="org.eclipse.rap.tabbed-properties.feature.feature.group" version="0.0.0"/>
<unit id="org.eclipse.rap.cnf.feature.feature.group" version="0.0.0"/>
<repository location="http://download.eclipse.org/rt/rap/incubator/nightly/"/>
</location>
<location includeAllPlatforms="false" includeConfigurePhase="true" includeMode="slicer" includeSource="true" type="InstallableUnit">
<unit id="org.eclipse.gemini.jpa.feature.feature.group" version="0.0.0"/>
<repository location="http://download.eclipse.org/gemini/jpa/updates/"/>
</location>
<location includeAllPlatforms="false" includeConfigurePhase="true" includeMode="slicer" includeSource="true" type="InstallableUnit">
<unit id="com.google.guava" version="15.0.0.v201403281430"/>
<unit id="org.antlr.runtime" version="3.2.0.v201101311130"/>
<unit id="com.google.inject" version="3.0.0.v201605172100"/>
<unit id="org.apache.log4j" version="1.2.15.v201012070815"/>
<unit id="javax.inject" version="1.0.0.v20091030"/>
<unit id="org.apache.commons.logging" version="1.0.4.v201101211617"/>
<unit id="org.objectweb.asm" version="5.0.1.v201404251740"/>
<unit id="osgi.enterprise" version="4.2.0.v201108120515"/>
<unit id="com.ibm.icu" version="0.0.0"/>
<repository location="http://download.eclipse.org/tools/orbit/downloads/drops/R20160520211859/repository/"/>
</location>
<location includeAllPlatforms="false" includeConfigurePhase="true" includeMode="slicer" includeSource="true" type="InstallableUnit">
<unit id="org.eclipse.rap.sdk.feature.feature.group" version="3.1.0.20160527-1719"/>
<unit id="org.eclipse.rap.feature.feature.group" version="3.1.0.20160527-1719"/>
<unit id="org.eclipse.emf.rap.sdk.feature.group" version="2.12.0.v20160526-0356"/>
<unit id="org.eclipse.rap.equinox.target.feature.feature.group" version="3.1.0.20160607-1200"/>
<unit id="org.eclipse.xtend.feature.group" version="0.0.0"/>
<unit id="org.eclipse.xtext.xbase.lib.feature.group" version="0.0.0"/>
<unit id="org.eclipse.xtend.sdk.feature.group" version="0.0.0"/>
<unit id="org.eclipse.emf.mwe2.runtime.sdk.feature.group" version="0.0.0"/>
<unit id="org.eclipse.emf.mwe2.language.sdk.feature.group" version="0.0.0"/>
<unit id="org.eclipse.emf.mwe.core.feature.feature.group" version="0.0.0"/>
<unit id="org.eclipse.emf.mwe2.launcher.feature.group" version="0.0.0"/>
<unit id="org.eclipse.xtext.runtime.feature.group" version="0.0.0"/>
<unit id="org.eclipse.xtext.xbase" version="0.0.0"/>
<unit id="org.eclipse.xtext.xbase.ide" version="0.0.0"/>
<unit id="org.eclipse.emf.codegen.ecore" version="0.0.0"/>
<unit id="org.eclipse.xtext.junit4" version="0.0.0"/>
<unit id="org.eclipse.xtext.xbase.junit" version="0.0.0"/>
<repository location="http://download.eclipse.org/releases/neon"/>
</location>
</locations>
</target>
'''
}
