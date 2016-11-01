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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;

public class WebProjectDescriptor implements IWebProjectDescriptor {

	private IProject project;
	private IGrammar grammar;
	private EditorType editorType;
	private Mode mode;
	private Map<String, Object> options;
	
	public WebProjectDescriptor(IProject project, IGrammar grammar) {
		this.project = project;
		this.grammar = grammar;
		this.mode = Mode.Batch;
		this.options = new HashMap<String, Object>();
	}
	
	public EditorType getEditorType() {
		return editorType;
	}

	public void setEditorType(EditorType editorType) {
		this.editorType = editorType;
	}

	@Override
	public Mode getMode() {
		return this.mode;
	}
	
	public void setMode(Mode mode) {
		this.mode = mode;
	}
	
	@Override
	public IProject getProject() {
		return this.project;
	}

	@Override
	public IGrammar getGrammar() {
		return this.grammar;
	}

	@Override
	public void setProject(IProject project) {
		this.project = project;
	}

	@Override
	public void setGrammar(IGrammar grammar) {
		this.grammar = grammar;
	}
	
	@Override
	public Object getOption(String key) {
		return this.options.get(key);
	}
	
	@Override
	public void setOption(String key, Object value) {
		this.options.put(key, value);
	}
}