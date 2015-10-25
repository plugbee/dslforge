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
package org.dslforge.xtext.generator.ui.handlers;

import java.lang.reflect.InvocationTargetException;

import org.dslforge.xtext.generator.util.GeneratorUtil;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.Wizard;
//import org.eclipse.libra.warproducts.ui.newwizard.BaseWARProductCreationOperation;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.internal.WorkbenchPlugin;

@SuppressWarnings("restriction")
public class WebProjectGeneratorWizard extends Wizard {

	// dialog store id constants
    public final static String STORE_DIRECTORIES = "WebProjectGeneratorWizard";//$NON-NLS-1$
    public final static String STORE_FILES = "WebProjectGeneratorWizardFiles";//$NON-NLS-1$
    
	private WebProjectGeneratorWizardPage page = null;
	
	private WebProjectGeneratorHandler webProjectGeneratorHandler;
	
	private WARProductGeneratorHandler warProductGeneratorHandler;
	
	private IProject project;
	
	public WebProjectGeneratorWizard(WebProjectGeneratorHandler webProjectGeneratorHandler) {
		this();
		this.webProjectGeneratorHandler = webProjectGeneratorHandler;
		setWindowTitle("DSLFORGE Web Editor Generator");
	}
	
	public WebProjectGeneratorWizard() {
		IDialogSettings workbenchSettings = WorkbenchPlugin.getDefault().getDialogSettings();
        IDialogSettings section = workbenchSettings.getSection(STORE_DIRECTORIES);//$NON-NLS-1$
        if (section == null) {
			section = workbenchSettings.addNewSection(STORE_DIRECTORIES);//$NON-NLS-1$
		}
        setDialogSettings(section);
        
        IDialogSettings section2 = workbenchSettings.getSection(STORE_FILES);//$NON-NLS-1$
        if (section2 == null) {
			section2 = workbenchSettings.addNewSection(STORE_FILES);//$NON-NLS-1$
		}   
        setDialogSettings(section2);
	}

	@Override
	public void addPages() {
		page = new WebProjectGeneratorWizardPage("Whatever2");
		page.setTitle("Generator Preferences");
		page.setDescription("Configure target web application options");
		addPage(page);
	}
	
	@Override
	public boolean performFinish() {
		boolean result = true;
		page.saveWidgetValues();
		final boolean generatorOption = (page.getCodeGenerator().length()>0);
		final boolean option = page.getNavigatorOption();
		final String navigatorRoot = page.getNavigatorRoot();
		final boolean deployOption = page.getWarProductOption();
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
			protected void execute(IProgressMonitor monitor) throws CoreException {
				project = webProjectGeneratorHandler.createProject(monitor);
				webProjectGeneratorHandler.setOutputs(project);

				if (option) {
					webProjectGeneratorHandler.setUseNavigator(option);
					//if navigator root not specified, use default one
					if (navigatorRoot.length()!=0)
						webProjectGeneratorHandler.setNavigatorRoot(navigatorRoot);
				}
				webProjectGeneratorHandler.setUseGenerator(generatorOption);
				webProjectGeneratorHandler.generateCode(project);
			}
		};
		try {
			PlatformUI.getWorkbench().getProgressService().run(true, true, operation);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			result = false;
		} catch (InterruptedException e) {
			ErrorDialog.openError(PlatformUI.getWorkbench().getDisplay().getActiveShell(), "Error:", e.toString(), null);
			result = false;
		}
		
		
		if (deployOption) {
			try {
				getContainer().run(false, true, getOperation());
			} catch (final InvocationTargetException e) {
				result = false;
			} catch (final InterruptedException e) {
				result = false;
			}
			IProject warProject = ResourcesPlugin.getWorkspace().getRoot().getProject(getWarProjectName());
			IFile file = warProject.getFile(getWarFileName() + ".warproduct");
			if (file.exists()) {
				warProductGeneratorHandler = new WARProductGeneratorHandler(warProject, webProjectGeneratorHandler.getGrammar());
				warProductGeneratorHandler.doGenerate(file);
			}
		}
		return result;
	}

	private String getWarProjectName() {
		String webProjectName = project.getName();
		return webProjectName + ".product";
	}
	
	private String getWarFileName() {
		return GeneratorUtil.getGrammarShortName(webProjectGeneratorHandler.getGrammar()).toLowerCase();
	}
	
	private IRunnableWithProgress getOperation() {
		IRunnableWithProgress result = null;
		IProject warProject;
//		try {
//			warProject = createProject(getWarProjectName(), new NullProgressMonitor());
//			IFile file = warProject.getFile(getWarFileName() + ".warproduct");
//			if (!file.exists()) {
//				result = new BaseWARProductCreationOperation(file);
//			}
//		} catch (CoreException e) {
//			e.printStackTrace();
//		}
		return result;
	}

	public IProject createProject(String projectName, final IProgressMonitor monitor) throws CoreException {
		WARProjectFactory factory = new WARProjectFactory();
		factory.setProjectName(projectName);
		return factory.createProject(monitor, null);
	}
		
	public String getTargetDirectory() {
		return page.getCodeGenerator();
	}	
}
