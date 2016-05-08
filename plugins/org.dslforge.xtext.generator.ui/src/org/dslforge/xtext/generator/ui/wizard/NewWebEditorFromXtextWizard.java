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
package org.dslforge.xtext.generator.ui.wizard;

import java.lang.reflect.InvocationTargetException;

import org.apache.log4j.Logger;
import org.dslforge.common.IWebProjectDescriptor;
import org.dslforge.common.IWebProjectDescriptor.EditorType;
import org.dslforge.common.IWebProjectFactory;
import org.dslforge.common.WebProjectDescriptor;
import org.dslforge.xtext.generator.BuildProjectFactory;
import org.dslforge.xtext.generator.DynamicWebProjectFactory;
import org.dslforge.xtext.generator.TargetPlatformProjectFactory;
import org.dslforge.xtext.generator.XtextGrammar;
import org.dslforge.xtext.generator.XtextPluginUpdaterFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.part.FileEditorInput;

public class NewWebEditorFromXtextWizard extends Wizard implements INewWizard {

	static final Logger logger = Logger.getLogger(NewWebEditorFromXtextWizard.class);

	private XtextGrammarImportPage importPage;
	private NewWebEditorFromXtextWizardPage mainPage;

	public NewWebEditorFromXtextWizard() {
		setWindowTitle("New Web Editor Project");
	}

	public NewWebEditorFromXtextWizard(IFile grammarFile) {
		setWindowTitle("New Web Editor Project");
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setNeedsProgressMonitor(true);
	}

	@Override
	public void addPages() {
		importPage = new XtextGrammarImportPage("XtextGrammarImportPage");
		importPage.setTitle("New Web Editor From Xtext Project");
		importPage.setDescription("Select the Xtext grammar for which to generate the editor");
		addPage(importPage);
		mainPage = new NewWebEditorFromXtextWizardPage(importPage.getWebProjectDescriptor());
		mainPage.setTitle("New Web Editor From Xtext Project");
		mainPage.setDescription("Creates a Web Editor based on an Xtext grammar");
		addPage(mainPage);
	}

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if (page.equals(importPage)) {
			IWebProjectDescriptor descriptor = importPage.getWebProjectDescriptor();
			if (descriptor != null) {
				String initialProjectFieldValue = importPage.getRuntimeProjectNameFieldValue();
				String webProjectName = initialProjectFieldValue + IWebProjectFactory.WEB_PROJECT_PREFIX;
				mainPage.setWebProjectDescriptor(descriptor);
				mainPage.setInitialProjectName(webProjectName);
				XtextGrammar grammar = (XtextGrammar) descriptor.getGrammar();
				mainPage.setAntlrGrammarPath(webProjectName + "/src-js/" + grammar.getBasePath() + "/parser/"
						+ grammar.getShortName() + ".g");
				mainPage.setInitialLanguageName(grammar.getShortName());
				mainPage.setGenerateTargetPlatform(true);
				mainPage.setGenerateBuildProject(true);
			}
		}
		return super.getNextPage(page);
	}

	@Override
	public boolean performFinish() {
		final IWebProjectDescriptor configuration = mainPage.getWebProjectDescriptor();
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {

			@Override
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InvocationTargetException, InterruptedException {	
				SubMonitor progress = SubMonitor.convert(monitor, 10);
				progress.beginTask("Generating artefacts", 10);
				DynamicWebProjectFactory factory = createWebProjectFactory(configuration);
				factory.createProjects(progress);
				progress.done();
			}
		};
		try {
			getContainer().run(true, true, operation);
		} catch (InvocationTargetException e) {
			logger.error(e.getMessage(), e);
		} catch (InterruptedException e) {
			logger.error(e.getMessage(), e);
		}
		XtextGrammar grammar = (XtextGrammar) configuration.getGrammar();
		String grammarStringPath = grammar.getProjectName()+"/src-js/" + grammar.getBasePath()+ "/parser/" + grammar.getShortName() + ".g";
		IPath grammarFilePath = new Path(grammarStringPath);
		IFile grammarFile = ResourcesPlugin.getWorkspace().getRoot().getFile(grammarFilePath);
		if (grammarFile!=null && grammarFile.exists()) {
			openInEditor(grammarFile);
		}
		return true;
	}

	protected DynamicWebProjectFactory createWebProjectFactory(IWebProjectDescriptor configuration) {
		DynamicWebProjectFactory webProjectFactory = new DynamicWebProjectFactory(configuration);
		final Boolean targetOption = (Boolean) configuration.getOption(IWebProjectDescriptor.TARGET_PLATFORM);
		if (targetOption.booleanValue()) {
			String projectName = configuration.getProject().getName() + ".target";
			IProject tpProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			WebProjectDescriptor newDescriptor = new WebProjectDescriptor(tpProject, configuration.getGrammar());
			newDescriptor.setEditorType(EditorType.RAP);
			webProjectFactory.addDelegate(new TargetPlatformProjectFactory(newDescriptor));
		}
		final Boolean buildOption = (Boolean) configuration.getOption(IWebProjectDescriptor.BUILD_PROJECT);
		if (buildOption.booleanValue()) {
			String projectName = configuration.getProject().getName() + ".build";
			IProject tpProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			WebProjectDescriptor newDescriptor = new WebProjectDescriptor(tpProject, configuration.getGrammar());
			newDescriptor.setEditorType(EditorType.RAP);
			webProjectFactory.addDelegate(new BuildProjectFactory(newDescriptor));
			String xtextProjectName = ((XtextGrammar)configuration.getGrammar()).getDslProjectName();
			IProject xtextProject = ResourcesPlugin.getWorkspace().getRoot().getProject(xtextProjectName);
			WebProjectDescriptor xtextDescriptor = new WebProjectDescriptor(xtextProject, configuration.getGrammar());
			xtextDescriptor.setEditorType(EditorType.RAP);
			webProjectFactory.addDelegate(new XtextPluginUpdaterFactory(xtextDescriptor));
		}
		return webProjectFactory;
	}

	protected void openInEditor(IFile modelFile) {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		try {
			page.openEditor(new FileEditorInput(modelFile), PlatformUI.getWorkbench().getEditorRegistry()
					.getDefaultEditor(modelFile.getFullPath().toString()).getId());
		} catch (PartInitException ex) {
			logger.error(ex.getMessage(), ex);
		}
	}
}