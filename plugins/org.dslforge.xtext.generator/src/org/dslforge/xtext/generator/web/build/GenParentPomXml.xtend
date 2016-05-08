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

class GenParentPomXml extends AbstractGenerator {

	var XtextGrammar grammar
	
	new() {
		relativePath = "/"
		basePath = "parent/"
	}

	override doGenerate(IWebProjectFactory factory, IProgressMonitor monitor) {
		grammar = factory.input as XtextGrammar
		projectName = factory.project.name
		grammarShortName = grammar.getShortName()
		factory.generateFile(basePath, "pom.xml", toXml(), monitor)
	}

	def toXml() '''
<?xml version="1.0" encoding="UTF-8"?>
<project
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd"
    xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">

  <modelVersion>4.0.0</modelVersion>

  <parent>
    <groupId>dslforge.example</groupId>
    <artifactId>«projectName».parent.parent</artifactId>
    <version>1.0.0-SNAPSHOT</version>
    <relativePath>parent</relativePath>
  </parent>

  <artifactId>«projectName».parent</artifactId>
  <packaging>pom</packaging>

  <!--
    Two-stage parent pom to work around bug 348045 (equinox servletbridge extensionbundle).
    All settings are defined in the parent of this pom (example.parent.parent).
    This pom (example.parent) removes the problematic extension bundle and serves as parent for all
    modules. Only the feature and the product, which need the extension bundle, have derive from
    the top parent.
  -->

  <build>
    <plugins>

      <!-- Work around bug 348045 (servletbridge.extensionbundle) -->
      <plugin>
        <groupId>org.eclipse.tycho</groupId>
        <artifactId>target-platform-configuration</artifactId>
        <version>${tycho.version}</version>
        <configuration>
          <filters>
            <filter>
              <type>java-package</type>
              <id>javax.servlet</id>
              <restrictTo>
                <type>eclipse-plugin</type>
                <id>javax.servlet</id>
              </restrictTo>
            </filter>
          </filters>
        </configuration>
      </plugin>

    </plugins>
  </build>

</project>
	'''
}
