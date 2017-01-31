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
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.dslforge.ace.generator.web.ace.GenMode;
import org.dslforge.ace.generator.web.ace.GenTheme;
import org.dslforge.ace.generator.web.ace.GenWorker;
import org.dslforge.ace.generator.web.ace.snippets.GenSnippets;
import org.dslforge.ace.generator.web.parser.GenAntlrAll;
import org.dslforge.common.IGrammar;
import org.dslforge.common.IWebProjectDescriptor;
import org.dslforge.common.IWebProjectDescriptor.EditorType;
import org.dslforge.common.IWebProjectDescriptor.Mode;
import org.dslforge.common.IWebProjectFactory;
import org.dslforge.common.IWebProjectGenerator;
import org.dslforge.xtext.generator.web.GenExecutableExtensionFactory;
import org.dslforge.xtext.generator.web.build.GenWebPluginPomXml;
import org.dslforge.xtext.generator.web.contentassist.GenContentAssistParser;
import org.dslforge.xtext.generator.web.editor.GenActionBarContributor;
import org.dslforge.xtext.generator.web.editor.GenBasicEditor;
import org.dslforge.xtext.generator.web.editor.GenContentAssistEnabledEditor;
import org.dslforge.xtext.generator.web.editor.widget.GenWidget;
import org.dslforge.xtext.generator.web.editor.widget.GenWidgetResource;
import org.dslforge.xtext.generator.web.internal.GenActivator;
import org.dslforge.xtext.generator.web.internal.GenImageProvider;
import org.dslforge.xtext.generator.web.launch.GenLaunchConfig;
import org.dslforge.xtext.generator.web.module.GenWebRuntimeModule;
import org.dslforge.xtext.generator.web.module.GenWebStandaloneSetup;
import org.dslforge.xtext.generator.web.parser.GenGrammar;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.pde.internal.core.ClasspathComputer;
import org.eclipse.swt.widgets.Display;

import com.google.common.collect.Lists;

@SuppressWarnings("restriction")
public class DynamicWebProjectFactory extends AbstractDelegatingWebProjectFactory implements IWebProjectGenerator {

	static final Logger logger = Logger.getLogger(DynamicWebProjectFactory.class);

	private static final String JRE_VERSION = "JavaSE-1.7";
	private static final String XTEXT_BUILDER_ID = "org.eclipse.xtext.ui.shared.xtextBuilder";
	private static final String SRC = "src";
	private static final String SRC_GEN = "src-gen";
	private static final String XTEND_GEN = "xtend-gen";
	private static final String SRC_JS = "src-js";
	private static final String BIN = "bin";
	private static final String[] FOLDERS = new String[] { SRC, SRC_GEN, SRC_JS, XTEND_GEN };
	private static final String[] DSL_PROJECT_NATURES = new String[] { "org.eclipse.pde.PluginNature",
			"org.eclipse.jdt.core.javanature", DSLFORGE_ANTLR_PROJECT_NATURE };
	private static final String[] BUILDERS = new String[] { JavaCore.BUILDER_ID, "org.eclipse.pde.ManifestBuilder",
			"org.eclipse.pde.SchemaBuilder", "org.dslforge.antlr.builder" };
	private static final String[] IMPORTED_PACKAGES = new String[] { "org.apache.log4j" };
	
	private List<String> requiredBundles = Lists.newArrayList();
	private List<String> importedPackages = Lists.newArrayList();
	private List<String> exportedPackages = Lists.newArrayList();
	private List<String> projectNatures = Lists.newArrayList();
	private List<String> builderIds = Lists.newArrayList();
	private boolean isServerSideContentAssist = true;
	private final IWebProjectDescriptor configuration;

	public DynamicWebProjectFactory(IWebProjectDescriptor configuration) {
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
	public Mode getMode() {
		return this.configuration.getMode();
	}
	
	@Override
	public EditorType getEditorType() {
		return this.configuration.getEditorType();
	}

	@Override
	public List<String> getProjectNatures() {
		return this.projectNatures;
	}

	@Override
	public List<String> getBuilderIds() {
		return this.builderIds;
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
		this.projectNatures = new ArrayList<String>(projectNatures);
	}

	private void addProjectNature(String projectNature) {
		if (this.projectNatures == null)
			this.projectNatures = new ArrayList<String>();
		this.projectNatures.add(projectNature);
	}

	private void setBuilderIds(List<String> builderIds) {
		this.builderIds = new ArrayList<String>(builderIds);
	}

	private void addBuilderId(String builderId) {
		if (this.builderIds == null)
			this.builderIds = new ArrayList<String>();
		this.builderIds.add(builderId);
	}

	private String getActivatorClassName() {
		return configuration.getProject().getName() + ".internal" + ".Activator";
	}

	@Override
	public IProject createProject(IProgressMonitor monitor) {
		final SubMonitor progress = SubMonitor.convert(monitor, 100);
		progress.subTask("Generating Eclipse plugin");
		final IProject project = this.configuration.getProject();
		if (project.exists()) {
			//project exists -> incremental mode
			this.configuration.setMode(Mode.Incremental);
			doGenerate(this, progress.newChild(100));
		} else {
			//create new project -> batch mode
			try {
				setBuilderIds(getDefaultBuilderIds());
				if (this.isServerSideContentAssist)
					addBuilderId(XTEXT_BUILDER_ID);
				setProjectNatures(getDefaultProjectNatures());
				if (this.isServerSideContentAssist)
					addProjectNature(XTEXT_NATURE_ID);
				setImportedPackages(getDefaultImportedPackages());
				final IProjectDescription description = createProjectDescription();
				project.create(description, progress.newChild(1));
				project.open(progress.newChild(1));

				setImportedPackages(getImportedPackages());
				List<String> requiredBundles = getProjectRequiredBundles();
				setRequiredBundles(requiredBundles);
				for (String folder : getDefaultFolders()) {
					createFolder(folder, progress.newChild(1));
				}
				convertToJava(progress.newChild(1));
				createManifest(project, progress.newChild(1));
				createBuildProperties(project, progress.newChild(1));
				createPluginXml(project, progress.newChild(1));
				doGenerate(this, progress.newChild(100));
				return project;
			} catch (CoreException e) {
				logger.error(e.getMessage(), e);
			}
		}
		return project;
	}
	
	public void deleteProject(final IProject project, final IProgressMonitor monitor) {
		//project exists -> ask user
		final Display display = Display.getDefault();
		if (display != null) {
			display.syncExec(new Runnable() {
				@Override
				public void run() {
					boolean openConfirm = MessageDialog.openConfirm(display.getActiveShell(),
							this.getClass().getSimpleName(), "A project called " + project.getName()
									+ " already exists in the workspace. Would you like to proceed anyway?");
					if (openConfirm) {
						try {
							project.delete(true, true, monitor);
						} catch (CoreException e) {
							logger.error(e.getMessage(), e);
						}
					}
				}
			});
		}
	}
	
	public void convertToJava(IProgressMonitor monitor) {
		SubMonitor progress = SubMonitor.convert(monitor, 2);
		try {
			IProject project = this.configuration.getProject();
			IJavaProject javaProject = JavaCore.create(project);
			javaProject.setOutputLocation(project.getFolder(BIN).getFullPath(), progress.newChild(1));
			IClasspathEntry[] entries = new IClasspathEntry[5];
			ClasspathComputer.setComplianceOptions(javaProject, JRE_VERSION);
			entries[0] = ClasspathComputer.createJREEntry(JRE_VERSION);
			entries[1] = ClasspathComputer.createContainerEntry();
			entries[2] = JavaCore.newSourceEntry(project.getFolder(SRC).getFullPath());
			entries[3] = JavaCore.newSourceEntry(project.getFolder(SRC_GEN).getFullPath());
			entries[4] = JavaCore.newSourceEntry(project.getFolder(SRC_JS).getFullPath());
			javaProject.setRawClasspath(entries, progress.newChild(1));
		} catch (CoreException e) {
			logger.error(e.getMessage(), e);
		}
	}

	private IProjectDescription createProjectDescription() {
		String projectName = this.configuration.getProject().getName();
		final IProjectDescription projectDescription = ResourcesPlugin.getWorkspace()
				.newProjectDescription(projectName);
		if (!this.projectNatures.isEmpty())
			projectDescription.setNatureIds(this.projectNatures.toArray(new String[this.projectNatures.size()]));
		if (!this.builderIds.isEmpty())
			setBuilder(projectDescription, this.builderIds.toArray(new String[this.builderIds.size()]));
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

	@Override
	public void doGenerate(IWebProjectFactory factory, IProgressMonitor monitor) {
		SubMonitor progress = SubMonitor.convert(monitor, 100);
		String message = "Generating language artefacts";
		progress.subTask(message);
		logger.debug(message);
		new GenWidget().doGenerate(factory, progress.newChild(1));
		new GenWidgetResource().doGenerate(factory, progress.newChild(1));
		new GenImageProvider().doGenerate(factory, progress.newChild(1));
		new GenActionBarContributor().doGenerate(factory, progress.newChild(1));
		if (this.isServerSideContentAssist){
			new GenContentAssistEnabledEditor().doGenerate(factory, progress.newChild(1));
			new GenContentAssistParser().doGenerate(factory, progress.newChild(100));
		} else {
			new GenBasicEditor().doGenerate(factory, progress.newChild(1));
		}
		new GenGrammar().doGenerate(factory, progress.newChild(1));
		new GenExecutableExtensionFactory().doGenerate(factory, progress.newChild(1));
		new GenWebRuntimeModule().doGenerate(factory, progress.newChild(1));
		new GenWebStandaloneSetup().doGenerate(factory, progress.newChild(1));
		new GenActivator().doGenerate(factory, progress.newChild(1));
		new GenMode().doGenerate(factory, progress.newChild(1));
		new GenTheme().doGenerate(factory, progress.newChild(1));
		new GenSnippets().doGenerate(factory, progress.newChild(1));
		new GenWorker().doGenerate(factory, progress.newChild(1));
		new GenAntlrAll().doGenerate(factory, progress.newChild(1));		
		new GenWebPluginPomXml().doGenerate(factory, progress.newChild(1));
		new GenLaunchConfig().doGenerate(factory, progress.newChild(1));
	}

	private void createPluginXml(IProject project, IProgressMonitor monitor) throws CoreException {
		String grammarShortName = getInput().getShortName();
		String fileExtension = getInput().getFileExtension();
		final StringBuilder content = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		content.append("<?eclipse version=\"3.4\"?>\n");
		content.append("<!-- @generated dslforge -->\n");
		content.append("<plugin>\n");
		content.append("      <extension\n");
		content.append("         point=\"org.eclipse.rap.ui.resources\">\n");
		content.append("      <resource\n");
		content.append(
				"          class=\"" + project.getName() + ".editor.widget." + grammarShortName + "Resource\">\n");
		content.append("		<dependsOn\n");
		content.append("			resourceId=\"org.dslforge.styledtext.basictext\">\n");
		content.append("		</dependsOn>\n");
		content.append("      </resource>\n");
		content.append("   </extension>\n");
		content.append("   <extension\n");
		content.append("         point=\"org.eclipse.rap.ui.themeableWidgets\">\n");
		content.append("      <widget\n");
		content.append("            class=\"" + project.getName() + ".editor.widget." + grammarShortName + "\"\n");
		content.append("            id=\"" + project.getName() + ".editor.widget." + grammarShortName + "\"\n");
		content.append("            name=\"" + grammarShortName + "\">\n");
		content.append("      </widget>\n");
		content.append("   </extension>\n");
		content.append("   <extension point=\"org.eclipse.ui.editors\">\n");
		content.append("      <editor\n");
		content.append("            id=\"" + project.getName() + ".editor" + "\"\n");
		content.append("            name=\"" + grammarShortName + " Model Editor\"\n");
		content.append("		            extensions=\"" + fileExtension + "\"\n");
		content.append("           class=\"" + project.getName() + ".editor." + grammarShortName + "Editor\"\n");
		content.append("            contributorClass=\"" + project.getName() + ".editor." + grammarShortName
				+ "ActionBarContributor\">\n");
		content.append("      </editor>\n");
		content.append("   </extension>\n");
		content.append("   <extension\n");
		content.append("     point=\"org.dslforge.xtext.common.contribution\">\n");
		content.append("  <contribution\n");
		content.append(
				"       factory=\"" + project.getName() + "." + grammarShortName + "ExecutableExtensionFactory\"\n");
		content.append("        path=\"" + getInput().getFullPath() + "\"\n");
		content.append("        extension=\"" + getInput().getFileExtension() + "\">\n");
		content.append("  </contribution>\n");
		content.append("</extension>\n");
		content.append("</plugin>\n");
		SubMonitor progress = SubMonitor.convert(monitor, 1);
		try {
			createFile("plugin.xml", project, content.toString(), progress);
		} finally {
			progress.worked(1);
		}
	}

	private void createBuildProperties(IProject project, IProgressMonitor monitor) {
		final StringBuilder content = new StringBuilder("source.. = ");
		for (final Iterator<String> iterator = getDefaultFolders().iterator(); iterator.hasNext();) {
			content.append(iterator.next()).append('/');
			if (iterator.hasNext()) {
				content.append(",\\\n");
				content.append("          ");					
			}				
		}
		content.append("\n");
		content.append("bin.includes = META-INF/,\\\n");
		content.append("               .,\\\n");
		content.append("               plugin.xml,\\");
		content.append("			   src-js/");
		createFile("build.properties", project, content.toString(), monitor);
	}

	private void createManifest(IProject project, IProgressMonitor monitor) throws CoreException {
		final StringBuilder content = new StringBuilder("Manifest-Version: 1.0\n");
		content.append("Bundle-ManifestVersion: 2\n");
		content.append("Bundle-Name: " + project.getName() + "\n");
		content.append("Bundle-Vendor: My Company\n");
		content.append("Bundle-Version: "+DSLFORGE_EXAMPLES_VERSION_NUMBER+"\n");
		content.append("Bundle-SymbolicName: " + project.getName() + "; singleton:=true\n");
		String activatorClassName = getActivatorClassName();
		if (null != activatorClassName) {
			content.append("Bundle-Activator: " + activatorClassName + "\n");
		}
		content.append("Bundle-ActivationPolicy: lazy\n");
		if (!requiredBundles.isEmpty())
			content.append("Require-Bundle").append(": ").append(requiredBundles.get(0));
		for (int i = 1, x = requiredBundles.size(); i < x; i++) {
			content.append(",\n ").append(requiredBundles.get(i));
		}
		if (!exportedPackages.isEmpty())
			content.append("Export-Package").append(": ").append(exportedPackages.get(0));
		for (int i = 1, x = exportedPackages.size(); i < x; i++) {
			content.append("\n ").append(",\n ").append(exportedPackages.get(i));
		}
		if (!importedPackages.isEmpty())
			content.append("\n").append("Import-Package").append(": ").append(importedPackages.get(0));
		for (int i = 1, x = importedPackages.size(); i < x; i++) {
			content.append(",\n ").append(importedPackages.get(i));
		}
		content.append("\n").append("Bundle-RequiredExecutionEnvironment: " + JRE_VERSION + "\n");
		final IFolder metaInf = project.getFolder("META-INF");
		SubMonitor progress = SubMonitor.convert(monitor, 1);
		try {
			if (metaInf.exists())
				metaInf.delete(false, monitor);
			metaInf.create(false, true, progress);
			createFile("MANIFEST.MF", metaInf, content.toString(), progress.newChild(1));
		} finally {
			progress.worked(1);
		}
	}

	private void setRequiredBundles(List<String> requiredBundles) {
		this.requiredBundles = requiredBundles;
	}

	private List<String> getProjectRequiredBundles() {
		String dslProjectName = ((XtextGrammar) getInput()).getDslProjectName();
		requiredBundles = Lists.newArrayList("org.eclipse.rap.ui", "org.eclipse.rap.ui.navigator",
				"org.eclipse.emf.rap.common.ui", "org.eclipse.emf.rap.edit.ui", "org.eclipse.emf.common",
				"org.eclipse.emf.ecore", "com.google.inject", "org.eclipse.xtext", "org.eclipse.xtend.lib",
				"org.dslforge.workspace", "org.dslforge.xtext.common", "org.dslforge.texteditor",
				"org.dslforge.styledtext", dslProjectName);
		return requiredBundles;
	}

	public void setImportedPackages(List<String> importedPackages) {
		this.importedPackages = importedPackages;
	}

	private List<String> getImportedPackages() {
		return this.importedPackages;
	}
	
	@Override
	public List<String> getDefaultImportedPackages() {
		return Arrays.asList(IMPORTED_PACKAGES);
	}
	
	private List<String> getDefaultFolders() {
		return Arrays.asList(FOLDERS);
	}
}
