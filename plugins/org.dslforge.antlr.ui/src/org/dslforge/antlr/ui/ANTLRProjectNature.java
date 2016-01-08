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
package org.dslforge.antlr.ui;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

/**
 * ANTLR v3 nature.
 */
public class ANTLRProjectNature implements IProjectNature {

	private IProject project;
	
	public void configure() throws CoreException {
		IProjectDescription description = project.getDescription();
		ICommand[] commands = description.getBuildSpec();
		for (int i = 0; i < commands.length; ++i) {
			if (commands[i].getBuilderName().equals(ANTLRBuilder.BUILDER_ID)) {
				return;
			}
		}
		ICommand[] newCommands = new ICommand[commands.length + 1];
		// add ANTLR build command
		System.arraycopy(commands, 0, newCommands, 0, commands.length);
		ICommand command = description.newCommand();
		command.setBuilderName(ANTLRBuilder.BUILDER_ID);
		newCommands[newCommands.length - 1] = command;
		description.setBuildSpec(newCommands);
		project.setDescription(description, null);
	}

	public void deconfigure() throws CoreException {
		//TODO
	}

	public IProject getProject() {
		return project;
	}
	
	public void setProject(IProject project_p) {
		this.project = project_p;
	}
}