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
package org.dslforge.ace.generator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.dslforge.ace.generator.web.GenGlobalIndex;
import org.dslforge.ace.generator.web.GenIndexHtml;
import org.dslforge.ace.generator.web.ace.GenLanguageTools;
import org.dslforge.ace.generator.web.ace.GenMode;
import org.dslforge.ace.generator.web.ace.GenTheme;
import org.dslforge.ace.generator.web.ace.GenTooltip;
import org.dslforge.ace.generator.web.ace.GenWorker;
import org.dslforge.ace.generator.web.ace.snippets.GenSnippets;
import org.dslforge.ace.generator.web.parser.GenAntlrAll;
import org.dslforge.ace.generator.web.parser.GenGrammar;
import org.dslforge.common.AbstractWebProjectFactory;
import org.dslforge.common.IGrammar;
import org.dslforge.common.IWebProjectDescriptor;
import org.dslforge.common.IWebProjectDescriptor.EditorType;
import org.dslforge.common.IWebProjectDescriptor.Mode;
import org.dslforge.common.IWebProjectFactory;
import org.dslforge.common.IWebProjectGenerator;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubMonitor;

import com.google.common.collect.Lists;

public class StaticWebProjectFactory extends AbstractWebProjectFactory implements IWebProjectGenerator{
	
	static final Logger logger = Logger.getLogger(StaticWebProjectFactory.class);
	
	private IWebProjectDescriptor configuration;
	protected List<String> projectNatures;
	protected List<String> builderIds;
	protected IPath location;
	public static final String SRC_FOLDER = "WebContent";
	public static final String ACE_FOLDER = SRC_FOLDER + "/" + "ace";
	public static final String SNIPPETS_FOLDER = SRC_FOLDER + "/" + "ace/snippets";
	public static final String PARSER_FOLDER = SRC_FOLDER + "/" + "parser";
	
	private static final String[] BUILDERS = new String[] { 
			"org.eclipse.wst.jsdt.core.javascriptValidator",
			"org.eclipse.wst.common.project.facet.core.builder",
			"org.eclipse.wst.validation.validationbuilder",
			"org.dslforge.antlr.builder"
		};

	private static final String[] DSL_PROJECT_NATURES = new String[] { 
			"org.eclipse.wst.common.project.facet.core.nature",
			"org.eclipse.wst.common.modulecore.ModuleCoreNature",
			"org.eclipse.wst.jsdt.core.jsNature",
			DSLFORGE_ANTLR_PROJECT_NATURE
		};
	
	public StaticWebProjectFactory(IWebProjectDescriptor configuration) {
		this.configuration = configuration;
		setBuilderIds(getDefaultBuilderIds());
		setProjectNatures(getDefaultProjectNatures());
	}
	
	@Override
	public IProject getProject() {
		return configuration.getProject();
	}

	@Override
	public IGrammar getInput() {
	  return configuration.getGrammar(); 
	}

	@Override
	public IPath getLocation() {
		return location;
	}
	
	@Override
	public EditorType getEditorType() {
		return configuration.getEditorType();
	}
	
	@Override
	public Mode getMode() {
		return configuration.getMode();
	}
	
	
	@Override
	public List<String> getProjectNatures() {
		return projectNatures;
	}

	@Override
	public List<String> getBuilderIds() {
		return builderIds;
	}
	
	@Override
	public List<String> getDefaultBuilderIds() {
		return Arrays.asList(BUILDERS);
	}

	@Override
	public List<String> getDefaultProjectNatures() {
		return Arrays.asList(DSL_PROJECT_NATURES);
	}

	private void setProjectNatures(List<String> projectNatures) {
		this.projectNatures = projectNatures;
	}

	private void setBuilderIds(List<String> builderIds) {
		this.builderIds = builderIds;
	}

	@Override
	public IProject createProject(IProgressMonitor monitor) {
		SubMonitor progress = SubMonitor.convert(monitor, 10);
		final IProjectDescription description = createProjectDescription();
		IProject project = configuration.getProject();
		if (!project.exists()) {
			//new project from scratch
			try {
				project.create(description, progress.newChild(1));
				project.open(progress.newChild(1));
				createProjectSettings(progress.newChild(1), project);
				setProjectNatures(getDefaultProjectNatures());
				setBuilderIds(getDefaultBuilderIds());
				createFolder(SRC_FOLDER, progress.newChild(1));
				createFolder(ACE_FOLDER, progress.newChild(1));
				createFolder(SNIPPETS_FOLDER, progress.newChild(1));
				createFolder(PARSER_FOLDER, progress.newChild(1));		
				doGenerate(this, progress.newChild(3));
				return project;
			} catch (CoreException e) {
				logger.error(e.getMessage(), e);
			} finally {
				progress.done();
			}
		} else {
			//project already generated -> incremental mode
			new GenMode().doGenerate(this, progress.newChild(1));
			new GenWorker().doGenerate(this, progress.newChild(1));
		}
		return project;
	}
	
	@Override
	public void doGenerate(IWebProjectFactory factory, IProgressMonitor monitor) {	
		SubMonitor progress = SubMonitor.convert(monitor, 11);
		new GenAntlrAll().doGenerate(factory, monitor);
		new GenGrammar().doGenerate(factory, progress.newChild(1));
		new GenIndexHtml().doGenerate(factory, progress.newChild(1));
		new GenMode().doGenerate(factory, progress.newChild(1));
		new GenGlobalIndex().doGenerate(factory, progress.newChild(1));
		new GenTheme().doGenerate(factory, progress.newChild(1));
		new GenLanguageTools().doGenerate(factory, progress.newChild(1));
		new GenTooltip().doGenerate(factory, progress.newChild(1));
		new GenSnippets().doGenerate(factory, progress.newChild(1));
		new GenWorker().doGenerate(factory, progress.newChild(1));
		progress.done();
	}
	
	private IFolder createProjectSettings(IProgressMonitor monitor, IProject project) {
		final IFolder settings = project.getFolder(".settings");
		createFile(".jsdtscope", settings, getJsdtScope(), monitor);
		createFile("org.eclipse.wst.common.component", settings, getProjectModules(project.getName()), monitor);
		createFile("org.eclipse.wst.common.project.facet.core.xml", settings, getProjectFacet(), monitor);
		createFile("org.eclipse.wst.jsdt.ui.superType.container", settings, "org.eclipse.wst.jsdt.launching.baseBrowserLibrary", monitor);
		createFile("org.eclipse.wst.jsdt.ui.superType.name", settings, "Window", monitor);
		return settings;
	}
	
	private IProjectDescription createProjectDescription() {
		String projectName = configuration.getProject().getName();
		final IProjectDescription projectDescription = ResourcesPlugin.getWorkspace().newProjectDescription(projectName);
		if (location != null && !Platform.getLocation().equals(location.removeLastSegments(1))) {
			projectDescription.setLocation(location);
		}
		if (projectNatures != null)
			projectDescription.setNatureIds(projectNatures.toArray(new String[projectNatures.size()]));
		if (builderIds != null)
			setBuilder(projectDescription, builderIds.toArray(new String[builderIds.size()]));
		return projectDescription;
	}
	
	private void setBuilder(final IProjectDescription projectDescription, final String[] builders) {
		List<ICommand> commands = Lists.newArrayList();
		for (int i = 0; i < builders.length; i++) {
			ICommand command = projectDescription.newCommand();
			command.setBuilderName(builders[i]);
			commands.add(command);
		}
		projectDescription.setBuildSpec(commands.toArray(new ICommand[commands.size()]));
	}
	
	private String getJsdtScope() {
		final StringBuilder content = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		content.append("<classpath>\n");
		content.append("	<classpathentry excluding=\"*.min.js|node_modules/*|bower_components/*\" kind=\"src\" path=\"WebContent\"/>\n");
		content.append("	<classpathentry kind=\"con\" path=\"org.eclipse.wst.jsdt.launching.JRE_CONTAINER\"/>\n");
		content.append("	<classpathentry kind=\"con\" path=\"org.eclipse.wst.jsdt.launching.WebProject\">\n");
		content.append("		<attributes>\n");
		content.append("			<attribute name=\"hide\" value=\"true\"/>\n");
		content.append("		</attributes>\n");
		content.append("	</classpathentry>\n");
		content.append("	<classpathentry kind=\"con\" path=\"org.eclipse.wst.jsdt.launching.baseBrowserLibrary\"/>\n");
		content.append("	<classpathentry kind=\"output\" path=\"\"/>\n");
		content.append("</classpath>\n");
		return content.toString();
	}
	
	private String getProjectModules(String projectName) {
		final StringBuilder content = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\"?><project-modules id=\"moduleCoreId\" project-version=\"1.5.0\">\n");
		content.append("<wb-module deploy-name=\"" + projectName + "\">\n");
		content.append("	<wb-resource deploy-path=\"/\" source-path=\"/WebContent\"/>\n");
		content.append("	<property name=\"context-root\" value=\"" + projectName + "\"/>\n");
		content.append("</wb-module>\n");
		content.append("</project-modules>\n");
		return content.toString();
	}

	private String getProjectFacet() {
		final StringBuilder content = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		content.append("<faceted-project>\n");
		content.append("	<fixed facet=\"wst.web\"/>\n");
		content.append("	<fixed facet=\"wst.jsdt.web\"/>\n");
		content.append("	<installed facet=\"wst.jsdt.web\" version=\"1.0\"/>\n");
		content.append("	<installed facet=\"wst.web\" version=\"1.0\"/>\n");
		content.append("</faceted-project>\n");
		return content.toString();
	}

	@Override
	public List<String> getDefaultImportedPackages() {
		return Collections.emptyList();
	}
}