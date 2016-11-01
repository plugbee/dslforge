/**
 * <copyright>
 *
 * Copyright (c) 2016 PlugBee. All rights reserved.
 * 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * </copyright>
 */
package org.dslforge.xtext.generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.dslforge.common.AbstractWebProjectFactory;
import org.dslforge.common.IGrammar;
import org.dslforge.common.IWebProjectDescriptor;
import org.dslforge.common.IWebProjectDescriptor.EditorType;
import org.dslforge.common.IWebProjectDescriptor.Mode;
import org.dslforge.common.IWebProjectFactory;
import org.dslforge.common.IWebProjectGenerator;
import org.dslforge.xtext.generator.web.target.GenTarget;
import org.dslforge.xtext.generator.web.target.GenTargetPomXml;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

import com.google.common.collect.Lists;

public class TargetPlatformProjectFactory extends AbstractWebProjectFactory implements IWebProjectGenerator {

	static final Logger logger = Logger.getLogger(TargetPlatformProjectFactory.class);

	private static final String[] PROJECT_NATURES = new String[] { "org.dslforge.antlr.project.nature" };
	private List<String> projectNatures = Lists.newArrayList();
	
	private final IWebProjectDescriptor configuration;

	public TargetPlatformProjectFactory(IWebProjectDescriptor configuration) {
		this.configuration = configuration;
	}

	@Override
	public IProject getProject() {
		return this.configuration.getProject();
	}

	@Override
	public IGrammar getInput() {
		return this.configuration.getGrammar();
	}

	@Override
	public IPath getLocation() {
		return this.configuration.getProject().getLocation();
	}

	@Override
	public IProject createProject(IProgressMonitor monitor) {
		final SubMonitor progress = SubMonitor.convert(monitor, 10);
		final IProject project = this.configuration.getProject();
		if (project.exists()) {
			final Display display = Display.getDefault();
			if (display != null) {
				display.syncExec(new Runnable() {
					@Override
					public void run() {
						boolean openConfirm = MessageDialog.openConfirm(display.getActiveShell(),
								this.getClass().getSimpleName(), "A project called " + project.getName()
										+ " already exist in the workspace. Would you like to proceed anyway?");
						if (openConfirm) {
							try {
								project.delete(true, true, progress.newChild(1));
							} catch (CoreException e) {
								logger.error(e.getMessage(), e);
							}
						}
					}
				});
			}
		}
		// re-check as something might be wrong here.
		if (!project.exists()) {
			try {
				setProjectNatures(getDefaultProjectNatures());
				final IProjectDescription description = createProjectDescription();
				project.create(description, progress);
				project.open(progress);
				doGenerate(this, progress);
				return project;
			} catch (CoreException e) {
				logger.error(e.getMessage(), e);
			}
		}
		return project;
	}

	@Override
	public void doGenerate(IWebProjectFactory factory, IProgressMonitor monitor) {
		SubMonitor progress = SubMonitor.convert(monitor, 2);
		new GenTarget().doGenerate(factory, progress.newChild(1));
		new GenTargetPomXml().doGenerate(factory, progress.newChild(1));
	}

	@Override
	public EditorType getEditorType() {
		return EditorType.RAP;
	}

	@Override
	public Mode getMode() {
		return this.configuration.getMode();
	}
	
	@Override
	public List<String> getProjectNatures() {
		return Collections.emptyList();
	}

	@Override
	public List<String> getBuilderIds() {
		return Collections.emptyList();
	}

	@Override
	public List<String> getDefaultBuilderIds() {
		return Collections.emptyList();
	}

	@Override
	public List<String> getDefaultProjectNatures() {
		return Arrays.asList(PROJECT_NATURES);
	}

	@Override
	public List<String> getDefaultImportedPackages() {
		return Collections.emptyList();
	}
	
	private void setProjectNatures(List<String> projectNatures) {
		this.projectNatures = new ArrayList<String>(projectNatures);
	}
	
	private IProjectDescription createProjectDescription() {
		String projectName = this.configuration.getProject().getName();
		final IProjectDescription projectDescription = ResourcesPlugin.getWorkspace()
				.newProjectDescription(projectName);
		if (!this.projectNatures.isEmpty())
			projectDescription.setNatureIds(this.projectNatures.toArray(new String[this.projectNatures.size()]));
		return projectDescription;
	}
}
