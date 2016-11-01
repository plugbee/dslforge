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
import org.dslforge.xtext.generator.web.build.GenXtextPluginPomXml;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

public class XtextPluginUpdaterFactory extends AbstractWebProjectFactory implements IWebProjectGenerator {

	static final Logger logger = Logger.getLogger(XtextPluginUpdaterFactory.class);
	
	private final IWebProjectDescriptor configuration;

	public XtextPluginUpdaterFactory(IWebProjectDescriptor configuration) {
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
		final IWebProjectFactory facory = this;
		if (project.exists()) {
			final Display display = Display.getDefault();
			if (display != null) {
				display.syncExec(new Runnable() {
					@Override
					public void run() {
						boolean openConfirm = MessageDialog.openConfirm(display.getActiveShell(),
								this.getClass().getSimpleName(), "The Xtext project " + project.getName()
										+ " will be modified (generation of a pom.xml file), would you like to proceed?");
						if (openConfirm) {
							try {
								doGenerate(facory, progress.newChild(3));
							} finally {
								progress.done();
							}
						}
					}
				});
			}
		}
		return project;
	}

	@Override
	public void doGenerate(IWebProjectFactory factory, IProgressMonitor monitor) {
		SubMonitor progress = SubMonitor.convert(monitor, 17);
		new GenXtextPluginPomXml().doGenerate(factory, progress.newChild(1));
		progress.done();
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
		return Collections.emptyList();
	}

	@Override
	public List<String> getDefaultImportedPackages() {
		return Collections.emptyList();
	}
}
