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

import java.util.List;

import org.dslforge.common.IWebProjectDescriptor.EditorType;
import org.dslforge.common.IWebProjectDescriptor.Mode;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;

public interface IWebProjectFactory {

	public static final String WEB_PROJECT_PREFIX = ".web";
	public static final String DSLFORGE_ANTLR_PROJECT_NATURE = "org.dslforge.antlr.project.nature";
	public static final String XTEXT_NATURE_ID = "org.eclipse.xtext.ui.shared.xtextNature";
	public static final String DSLFORGE_EXAMPLES_VERSION_NUMBER = "1.0.0.qualifier";
	
	public IProject getProject();

	public IGrammar getInput();

	public IPath getLocation();

	public EditorType getEditorType();
	
	public Mode getMode();
	
	public List<String> getProjectNatures();
	
	public List<String> getBuilderIds();
	
	public List<String> getDefaultBuilderIds();

	public List<String> getDefaultProjectNatures() ;

	public List<String> getDefaultImportedPackages() ;
	
	public IProject createProject(IProgressMonitor monitor);
	
	public void createContainer(IContainer container, IProgressMonitor monitor);

	public IFolder createFolder(String folderName, IProgressMonitor monitor);
		
	public IFile createFile(final String fileName, final IContainer container, final String content, final IProgressMonitor monitor);
	
	public IFile generateFile(final String filePath, final String slotName, final CharSequence content, final IProgressMonitor monitor);
}
