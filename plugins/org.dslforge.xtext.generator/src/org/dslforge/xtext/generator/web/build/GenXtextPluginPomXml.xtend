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
import org.dslforge.xtext.generator.util.GeneratorUtil
import org.eclipse.core.runtime.IProgressMonitor

class GenXtextPluginPomXml extends AbstractGenerator {

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
		versionNumber = GeneratorUtil::getVersionNumber(factory.project)
		factory.generateFile(basePath, "pom.xml", toXml(), monitor)
	}

	def toXml() '''
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	
	<parent>
    <artifactId>«projectName+".web.build"».parent.parent</artifactId>
    <version>1.0.0-SNAPSHOT</version>
    <groupId>dslforge.example</groupId>    
    <relativePath>../«projectName+".web.build"»/parent/parent/pom.xml</relativePath>
 	</parent>
 	
	<groupId>dslforge.example</groupId>
	<artifactId>«projectName»</artifactId>
	<version>«versionNumber»</version>
	<packaging>eclipse-plugin</packaging>
	<name>«projectName»</name>
</project>
	'''
}
