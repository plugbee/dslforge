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

class GenParentParentPomXml extends AbstractGenerator {

	var XtextGrammar grammar
	
	new() {
		relativePath = "/"
		basePath = "parent/parent/"
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
	<prerequisites>
		<maven>3.0</maven>
	</prerequisites>
	<groupId>dslforge.example</groupId>
	<artifactId>�projectName�.parent.parent</artifactId>
	<packaging>pom</packaging>
	<properties>
		<tycho.version>0.20.0</tycho.version>
		<tycho.showEclipseLog>true</tycho.showEclipseLog>
		<assembly-version>2.4</assembly-version>
		<replacer-version>1.4.1</replacer-version>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<rap-repository>http://download.eclipse.org/rt/rap/3.0/</rap-repository>
		<rap-incubator-repository>http://download.eclipse.org/rt/rap/incubator/nightly/</rap-incubator-repository>
		<language.name>�grammarShortName.toLowerCase�</language.name>
		<xtext.version>2.10.0</xtext.version>
		<xtend.maven.version>2.9.2</xtend.maven.version>
	</properties>
	<build>
		<sourceDirectory>src</sourceDirectory>
		<plugins>
			<plugin>
				<groupId>org.eclipse.tycho</groupId>
				<artifactId>tycho-maven-plugin</artifactId>
				<version>${tycho.version}</version>
				<extensions>true</extensions>
			</plugin>
			<plugin>
				<groupId>org.eclipse.tycho</groupId>
				<artifactId>target-platform-configuration</artifactId>
				<version>${tycho.version}</version>
				<configuration>
					<target>
						<artifact>
							<groupId>dslforge.example</groupId>
							<artifactId>${language.name}</artifactId>
							<version>1.0.0-SNAPSHOT</version>
						</artifact>
					</target>
					<environments>
						<environment>
							<os>win32</os>
							<ws>win32</ws>
							<arch>x86</arch>
						</environment>
						<environment>
							<os>win32</os>
							<ws>win32</ws>
							<arch>x86_64</arch>
						</environment>
						<environment>
							<os>linux</os>
							<ws>gtk</ws>
							<arch>x86</arch>
						</environment>
						<environment>
							<os>linux</os>
							<ws>gtk</ws>
							<arch>x86_64</arch>
						</environment>
					</environments>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.eclipse.tycho</groupId>
				<artifactId>tycho-source-plugin</artifactId>
				<version>${tycho.version}</version>
				<executions>
					<execution>
						<id>plugin-source</id>
						<goals>
							<goal>plugin-source</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
			<plugin>
				<groupId>org.eclipse.tycho.extras</groupId>
				<artifactId>tycho-source-feature-plugin</artifactId>
				<version>${tycho.version}</version>
				<executions>
					<execution>
						<id>source-feature</id>
						<phase>package</phase>
						<goals>
							<goal>source-feature</goal>
						</goals>
						<configuration>
							<includeBinaryFeature>false</includeBinaryFeature>
							<labelSuffix>Source</labelSuffix>
						</configuration>
					</execution>
				</executions>
			</plugin>
			<plugin>
				<groupId>org.eclipse.tycho</groupId>
				<artifactId>tycho-p2-plugin</artifactId>
				<version>${tycho.version}</version>
				<executions>
					<execution>
						<id>default-p2-metadata-default</id>
						<configuration>
							<attachP2Metadata>false</attachP2Metadata>
						</configuration>
					</execution>
					<execution>
						<id>attach-p2-metadata</id>
						<phase>package</phase>
						<goals>
							<goal>p2-metadata</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
		</plugins>

		<pluginManagement>
			<plugins>
				<plugin>
					<groupId>org.eclipse.tycho</groupId>
					<artifactId>tycho-compiler-plugin</artifactId>
					<version>${tycho.version}</version>
					<configuration>
						<encoding>UTF-8</encoding>
						<source>6.0</source>
						<target>6.0</target>
					</configuration>
				</plugin>
	      		<plugin>
	      			<groupId>org.eclipse.tycho</groupId>
	      			<artifactId>tycho-packaging-plugin</artifactId>
	      			<version>${tycho.version}</version>
	      			<configuration>
	        			<archiveSite>true</archiveSite>
	      			</configuration>
				</plugin>
				<plugin>
					<groupId>org.eclipse.tycho</groupId>
					<artifactId>tycho-surefire-plugin</artifactId>
					<version>${tycho.version}</version>
				</plugin>
				<plugin>
					<groupId>org.eclipse.tycho</groupId>
					<artifactId>maven-osgi-test-plugin</artifactId>
					<version>${tycho.version}</version>
				</plugin>
				<plugin>
					<groupId>org.eclipse.tycho</groupId>
					<artifactId>tycho-p2-repository-plugin</artifactId>
					<version>${tycho.version}</version>
				</plugin>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-resources-plugin</artifactId>
					<version>2.6</version>
					<configuration>
						<encoding>UTF-8</encoding>
					</configuration>
				</plugin>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-antrun-plugin</artifactId>
					<version>1.3</version>
				</plugin>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-surefire-plugin</artifactId>
					<version>2.12.2</version>
				</plugin>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-clean-plugin</artifactId>
					<version>2.4.1</version>
				</plugin>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-assembly-plugin</artifactId>
					<version>2.2-beta-4</version>
				</plugin>
				<plugin>
					<groupId>org.codehaus.mojo</groupId>
					<artifactId>findbugs-maven-plugin</artifactId>
					<version>2.3.2</version>
					<configuration>
						<findbugsXmlOutput>true</findbugsXmlOutput>
						<failOnError>false</failOnError>
					</configuration>
					<executions>
						<execution>
							<goals>
								<goal>check</goal>
							</goals>
						</execution>
					</executions>
				</plugin>
				<plugin>
					<groupId>org.eclipse.dash.maven</groupId>
					<artifactId>eclipse-signing-maven-plugin</artifactId>
					<version>1.0.5</version>
				</plugin>
				<plugin>
					<groupId>org.fornax.toolsupport</groupId>
					<artifactId>fornax-oaw-m2-plugin</artifactId>
					<version>3.3.0</version>
				</plugin>
				<plugin>
					<groupId>org.eclipse.xtend</groupId>
					<artifactId>xtend-maven-plugin</artifactId>
					<version>${xtend.maven.version}</version>
					<executions>
						<execution>
							<goals>
								<goal>compile</goal>
								<goal>xtend-install-debug-info</goal>
								<goal>testCompile</goal>
								<goal>xtend-test-install-debug-info</goal>
							</goals>
						</execution>
					</executions>
					<configuration>
						<outputDirectory>xtend-gen</outputDirectory>
					</configuration>
				</plugin>
			</plugins>
		</pluginManagement>
	</build>
	
	<pluginRepositories>
		<pluginRepository>
			<id>sonatype</id>
			<url>http://repository.sonatype.org/content/groups/sonatype-public-grid/</url>
			<releases>
				<enabled>true</enabled>
			</releases>
			<snapshots>
				<enabled>true</enabled>
			</snapshots>
		</pluginRepository>
		<pluginRepository>
			<id>fornax</id>
			<url>http://www.fornax-platform.org/m2/repository</url>
			<releases>
				<enabled>true</enabled>
			</releases>
			<snapshots>
				<enabled>false</enabled>
			</snapshots>
		</pluginRepository>
		<pluginRepository>
			<id>xtend</id>
			<url>http://build.eclipse.org/common/xtend/maven/</url>
		</pluginRepository>
	</pluginRepositories>

	<profiles>
		<profile>
			<id>�grammarShortName.toLowerCase�</id>
			<properties>
				<language.name>�grammarShortName.toLowerCase�</language.name>
			</properties>
		</profile>
		
		<profile>
			<id>eclipse-sign</id>
			<pluginRepositories>
				<pluginRepository>
					<id>m2e-cbi</id>
					<url>http://download.eclipse.org/technology/m2e/maven/</url>
				</pluginRepository>
			</pluginRepositories>

			<build>
				<plugins>
					<plugin>
						<groupId>org.eclipse.tycho</groupId>
						<artifactId>target-platform-configuration</artifactId>
						<version>${tycho.version}</version>
						<configuration>
							<includePackedArtifacts>true</includePackedArtifacts>
						</configuration>
					</plugin>
					<plugin>
						<groupId>org.eclipse.tycho.extras</groupId>
						<artifactId>tycho-pack200a-plugin</artifactId>
						<version>${tycho.version}</version>
						<executions>
							<execution>
								<id>pack200-normalize</id>
								<goals>
									<goal>normalize</goal>
								</goals>
							</execution>
						</executions>
					</plugin>
					<plugin>
						<groupId>org.eclipse.cbi.maven.plugins</groupId>
						<artifactId>eclipse-jarsigner-plugin</artifactId>
						<version>1.0.1</version>
						<executions>
							<execution>
								<id>sign</id>
								<goals>
									<goal>sign</goal>
								</goals>
							</execution>
						</executions>
					</plugin>
					<plugin>
						<groupId>org.eclipse.tycho.extras</groupId>
						<artifactId>tycho-pack200b-plugin</artifactId>
						<version>${tycho.version}</version>
						<executions>
							<execution>
								<id>pack200-pack</id>
								<goals>
									<goal>pack</goal>
								</goals>
							</execution>
						</executions>
					</plugin>
					<plugin>
						<groupId>org.eclipse.tycho</groupId>
						<artifactId>tycho-p2-plugin</artifactId>
						<version>${tycho.version}</version>
						<executions>
							<execution>
								<id>p2-metadata</id>
								<phase>package</phase>
								<goals>
									<goal>p2-metadata</goal>
								</goals>
							</execution>
						</executions>
						<configuration>
							<defaultP2Metadata>false</defaultP2Metadata>
						</configuration>
					</plugin>
				</plugins>
			</build>
		</profile>
	</profiles>
	<version>1.0.0-SNAPSHOT</version>
</project>
	'''
}