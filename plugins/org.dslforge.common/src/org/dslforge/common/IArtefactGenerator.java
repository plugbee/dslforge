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
package org.dslforge.common;

import org.dslforge.common.IWebProjectDescriptor.EditorType;
import org.eclipse.core.resources.IProject;

public interface IArtefactGenerator extends IWebProjectGenerator{
	
	void setEditorType(EditorType type);
	EditorType getEditorType();
	
	void setProject(IProject project);
	IProject getProject();

	void setFileName(String fileName);
	String getFileName();
	
	void setDefaultSlotName(String slotName);
	String getDefaultSlotName();
	
	void setRelativePath(String relativePath);
	String getRelativePath();
	
	void setGrammarShortName(String shortName);
	String getGrammarShortName();
	
	void setBasePath(String basePath);
	String getBasePath();
	
	String getFileHeader();
}
