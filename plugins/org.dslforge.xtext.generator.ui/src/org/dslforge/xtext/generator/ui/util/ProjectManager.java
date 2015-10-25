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
package org.dslforge.xtext.generator.ui.util;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;

public class ProjectManager {

	public static ProjectManager INSTANCE = new ProjectManager();

	public static final String BUILD_MECHANISM = "nant";
	public static String PROJECT_NAME ;
	public static String BUILD_FILE_NAME;
	public static final String SRC_FOLDER = "src";
	public static final String BIN_FOLDER = "bin";
	public static final String COPY_RIGHT = "Amine Lajmi, 2012 - All rights reserved.";
	public static final String TARGET_FRAMEWORK = "Microsoft-2.0";
	
	
	
	public IProject getOrCreateProject(String unitOperationShortName, String unitOperationProjectName, IProgressMonitor monitor) {
		PROJECT_NAME = unitOperationShortName;
		BUILD_FILE_NAME = unitOperationShortName + "." + "build";
		// This method prepares the creation of the project 
		final IProject projectHandle = ResourcesPlugin.getWorkspace().getRoot().getProject(unitOperationProjectName);
		if (!projectHandle.exists()) {
			 return prepareAndCreateProject(unitOperationShortName, unitOperationProjectName, monitor);
		}
		return projectHandle;
	}
	
	public IProject prepareAndCreateProject(String unitOperationShortName, String unitOperationProjectName, IProgressMonitor monitor) {
		PROJECT_NAME = unitOperationShortName;
		BUILD_FILE_NAME = unitOperationShortName + "." + "build";
		// This method prepares the creation of the project 
		final IProject newProjectHandle = ResourcesPlugin.getWorkspace().getRoot().getProject(unitOperationProjectName);
		// get a project descriptor
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IProjectDescription description =	workspace.newProjectDescription(newProjectHandle.getName());
		// create the new project operation
		createProject(description, newProjectHandle, monitor);
		return newProjectHandle;
	}

	protected void createProject(IProjectDescription description, IProject projectHandle, IProgressMonitor monitor) {
		monitor.done();
	
	}

}