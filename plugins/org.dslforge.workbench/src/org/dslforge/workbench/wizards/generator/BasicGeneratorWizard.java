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
package org.dslforge.workbench.wizards.generator;

import java.util.Collections;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

import com.google.inject.Injector;

public class BasicGeneratorWizard extends AbstractGeneratorWizard {

	private IWorkbench workbench;
	
	private IStructuredSelection selection;
	
	private String selectedFileName;
	
	public BasicGeneratorWizard(String filePath) {
		this.selectedFileName = filePath;
		setWindowTitle("Artifact Generator Preferences");
	}

	@Override
	protected Injector createInjectorAndDoEMFRegistration() {
		// TODO Auto-generated method stub
		return null;
	}
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
	}
	
	public IWorkbench getWorkbench() {
		return workbench;
	}

	public void setWorkbench(IWorkbench workbench) {
		this.workbench = workbench;
	}

	public void setSlection(IStructuredSelection selection) {
		this.selection = selection;
	}

	public IStructuredSelection getSelection() {
		return selection;
	}
	
	@Override
	public void addPages() {
		page = new BasicGeneratorWizardPage("GenerateArtifacts");
		page.setTitle("Generate Artifacts");
		page.setDescription("Generate artifacts from the selected resource"); 
		page.setInitialElementSelections(Collections.singletonList(getSelection()));
		addPage(page);
	}
}