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
import java.util.HashMap;
import java.util.Map;

import org.dslforge.xtext.generator.ui.factories.WARProjectFactory;
import org.dslforge.xtext.generator.ui.operations.GenerateProjectOperation;
import org.dslforge.xtext.generator.ui.operations.GenerateWebProjectOperation;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.WorkbenchPlugin;

@SuppressWarnings("restriction")
public class WebProjectGeneratorWizard extends Wizard {
    
	private WebProjectGeneratorWizardPage page = null;
	
	private IProject project;
	
	protected WebProjectGeneratorWizard() {
		setWindowTitle("DSLFORGE Web Editor Generator");
		IDialogSettings workbenchSettings = WorkbenchPlugin.getDefault().getDialogSettings();
        IDialogSettings section = workbenchSettings.getSection(page.STORE_DIRECTORIES);//$NON-NLS-1$
        if (section == null) {
			section = workbenchSettings.addNewSection(page.STORE_DIRECTORIES);//$NON-NLS-1$
		}
        setDialogSettings(section);
        
        IDialogSettings section2 = workbenchSettings.getSection(page.STORE_FILES);//$NON-NLS-1$
        if (section2 == null) {
			section2 = workbenchSettings.addNewSection(page.STORE_FILES);//$NON-NLS-1$
		}   
        setDialogSettings(section2);
	}

	@Override
	public void addPages() {
		page = new WebProjectGeneratorWizardPage("GeneratorPreferences");
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
		GenerateProjectOperation operation = createProjectGeneratorOperation(generatorOption, option, navigatorRoot);
		try {
			PlatformUI.getWorkbench().getProgressService().run(true, true, operation);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			result = false;
		} catch (InterruptedException e) {
			ErrorDialog.openError(PlatformUI.getWorkbench().getDisplay().getActiveShell(), "Error:", e.toString(), null);
			result = false;
		}
		return result;
	}

	private GenerateProjectOperation createProjectGeneratorOperation(final boolean generatorOption,
			final boolean option, final String navigatorRoot) {
		Map<String, Object> settings = new HashMap<String, Object>();
		settings.put("Outputs", project);
		settings.put("UseNavigator", option);
		settings.put("NavigatorRoot", navigatorRoot);
		settings.put("UseGenerator", generatorOption);
		GenerateWebProjectOperation operation = new GenerateWebProjectOperation(settings);
		return operation;
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
