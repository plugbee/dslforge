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

import org.eclipse.core.resources.IProject;

/**
 * A descriptor of a web editor generator 
 */
public interface IWebProjectDescriptor {
	
	public static enum EditorType {
		/**
		 * ACE editor with client-side ANTLR Parser/Lexer
		 */
		ACE,
		/**
		 * Eclipse RAP editor with client-side ANTLR Parser/Lexer and server-side Xtext back-end
		 */
		RAP, 
	}
	
	public static enum Mode {
		Batch,
		Incremental,
	}
	
	public EditorType getEditorType();

	public void setEditorType(EditorType editorType);
	
	public Mode getMode();
	
	public void setMode(Mode mode);
	
	public IProject getProject();
	
	public IGrammar getGrammar();

	public void setProject(IProject project);
	
	public void setGrammar(IGrammar grammar);

	public Object getOption(String key);
	
	public void setOption(String key, Object value);
	
	public static final String TARGET_PLATFORM= "generate.target.platform";
	public static final String BUILD_PROJECT= "generate.build.project";
	public static final String CLIENT_PARSER= "enable.client.parser";
	public static final String CLIENT_CONTENTASSIST= "enable.client.contentassist";
	public static final String CLIENT_MULTITHREADING= "enable.client.multithreading";
}
