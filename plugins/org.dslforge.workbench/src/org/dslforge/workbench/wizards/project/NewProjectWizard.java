/**
 * <copyright>
 *
 * Copyright (c) 2015 DSLFORGE. All rights reserved.
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
package org.dslforge.workbench.wizards.project;

import java.lang.reflect.InvocationTargetException;

import org.dslforge.workbench.wizards.AbstractNewResourceWizard;
import org.dslforge.workspace.WorkspaceManager;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.rap.rwt.RWT;


public class NewProjectWizard extends AbstractNewResourceWizard{
	
	protected NewProjectWizardPage page = null;
	
	public NewProjectWizard() {
		setWindowTitle("New Project");
	}
	
	@Override
	public void addPages() {
		page = new NewProjectWizardPage("NewProject");
		page.setTitle("New Project");
		page.setDescription("Create a new project resource");
		addPage(page);
	}
	
	@Override
	public boolean performFinish() {
		final String projectName = page.getProjectName();
		final String description = page.getProjectDescription();
		final String visibility = page.getProjectVisibity();
		if (projectName!=null) {
			Object attribute = RWT.getUISession().getAttribute("user");
			if (attribute instanceof String) {
				final String userName = (String) attribute;				
				IRunnableWithProgress operation = new IRunnableWithProgress() {
					public void run(IProgressMonitor progressMonitor) {
							try {
								WorkspaceManager.INSTANCE.createProject(projectName, description, visibility);
							}
							catch (Exception exception) {
								exception.printStackTrace();
							}
							finally {
								progressMonitor.done();
							}
						}
					};
				try {
					getContainer().run(false, false, operation);
				} catch (InvocationTargetException | InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("[DSLFORGE] - " + userName + " created new project: " + projectName);
				return true;
			}
		}
		return false;
	}

}
