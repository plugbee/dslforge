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

class GenAssembly extends AbstractGenerator {

	var XtextGrammar grammar

	new() {
		relativePath = "/"
		basePath = ""
	}

	override doGenerate(IWebProjectFactory factory, IProgressMonitor monitor) {
		grammar = factory.input as XtextGrammar
		projectName = factory.project.name
		grammarShortName = grammar.getShortName()
		relativePath = "/" + grammarShortName.toLowerCase + "/"
		factory.generateFile(relativePath, "assembly.xml", toXml(), monitor)
	}

	def toXml() '''
<assembly>
  <id>«grammarShortName».war</id>
  <formats>
    <format>war</format>
  </formats>
  <includeBaseDirectory>false</includeBaseDirectory>
  <fileSets>
    <fileSet>
      <directory>${basedir}/target/products/${artifactId}/win32/win32/x86_64</directory>
      <outputDirectory>/WEB-INF</outputDirectory>
      <excludes>
        <exclude>plugins/javax.servlet*.jar</exclude>
      </excludes>
    </fileSet>
    <fileSet>
      <directory>${basedir}/rootfiles</directory>
      <outputDirectory>/</outputDirectory>
    </fileSet>
    <fileSet>
      <directory>${basedir}/target/products/${artifactId}/win32/win32/x86_64/plugins</directory>
      <outputDirectory>/WEB-INF/lib</outputDirectory>
      <includes>
        <include>org.eclipse.equinox.servletbridge_*.jar</include>
      </includes>
    </fileSet>
  </fileSets>
</assembly>
	'''
}
