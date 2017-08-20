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
 * </copyright>
 */
package org.dslforge.common

import org.dslforge.common.IWebProjectDescriptor.EditorType
import org.eclipse.core.resources.IProject

abstract class AbstractGenerator implements IArtefactGenerator {
	
	protected var EditorType type
	protected var IProject project
	protected var String grammarShortName
	protected var String defaultSlotName
	protected var String basePath
	protected var String relativePath
	protected var String fileName
	protected var String projectName

	
	override setEditorType(EditorType type) {
		this.type = type
	}
	
	override EditorType getEditorType() {
		return this.type
	}

	override setDefaultSlotName(String slotName) {
		this.defaultSlotName = slotName
	}
	
	override String getDefaultSlotName() {
		return this.defaultSlotName
	}
	
	override setRelativePath(String relativePath) {
		this.relativePath = relativePath
	}
	
	override String getRelativePath() {
		return this.relativePath
	}
	
	override setGrammarShortName(String shortName) {
		this.grammarShortName = shortName	
	}
	
	override String getGrammarShortName() {
		return this.grammarShortName
	}
	
	override setBasePath(String basePath) {
		this.basePath = basePath
	}
	
	override String getBasePath() {
		return this.basePath
	}
	 
	override setProject(IProject project) {
		this.project = project
		this.projectName=project.name
	}
	
	def String getProjectName() {
		return this.projectName
	}
	
	override IProject getProject() {
		return this.project
	}


	override setFileName(String fileName) {
		this.fileName = fileName
	}
	
	override String getFileName() {
		return this.fileName
	}
	
	override getFileHeader() {
		return '''
		/**
		 * @Generated
		 */
		'''
	}
	
}
