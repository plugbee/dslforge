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

import org.dslforge.xtext.generator.IWebProjectGenerator.EditorType;
import org.dslforge.xtext.generator.ui.operations.GenerateProjectOperation;
import org.dslforge.xtext.generator.ui.operations.GenerateStaticWebProjectOperation;
import org.dslforge.xtext.generator.ui.operations.GenerateWebPluginProjectOperation;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.PlatformUI;

public class WebProjectGeneratorWizard extends Wizard {
    
	private WebProjectGeneratorWizardPage page = null;	
	private IFile grammarFile;
	
	public WebProjectGeneratorWizard(IFile grammarFile) {
		setWindowTitle("DSLFORGE Web Editor Generator");
		this.grammarFile = grammarFile;
	}

	@Override
	public void addPages() {
		page = new WebProjectGeneratorWizardPage("GeneratorPreferences");
		page.setTitle("Generator Preferences");
		page.setDescription("Configure web application options");
		addPage(page);
	}
	
	@Override
	public boolean performFinish() {
		page.saveWidgetValues();
		//default values
		Map<String, Object> settings = new HashMap<String, Object>();
		settings.put("Grammar", grammarFile);
		settings.put("Outputs", grammarFile.getProject());
		settings.put("EditorType", page.getEditorType());
		try {
			PlatformUI.getWorkbench().getProgressService().run(true, true, createGenerateProjectOperation(settings));
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			return false;
		} catch (InterruptedException e) {
			ErrorDialog.openError(PlatformUI.getWorkbench().getDisplay().getActiveShell(), "Error:", e.toString(), null);
		}
		return true;		
	}

	private GenerateProjectOperation createGenerateProjectOperation(Map<String, Object> settings) {
		EditorType type = (EditorType) settings.get("EditorType");
		switch (type) {
		case RAP: return new GenerateWebPluginProjectOperation(settings);
		case ACE: return new GenerateStaticWebProjectOperation(settings);
		}
		throw new UnsupportedOperationException("Could not recognize editor type.");
	}
}
