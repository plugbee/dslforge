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

import java.util.Arrays;
import java.util.List;

import org.dslforge.common.IWebProjectDescriptor;
import org.dslforge.common.ui.internal.Activator;
import org.dslforge.common.ui.internal.CommonImageProvider;
import org.dslforge.xtext.generator.XtextGrammar;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.util.BidiUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.internal.ide.IIDEHelpContextIds;

@SuppressWarnings("restriction")
public class NewWebEditorFromXtextWizardPage extends WizardNewProjectCreationPage {

	private static final int SIZING_TEXT_FIELD_WIDTH = 250;

	// widgets
	private Text projectNameField;
	private Text languageNameField;
	private Text grammarPathField;
	private Button generateTarget;
	private Button generateBuild;
	
	private String initialProjectFieldValue;
	private IWebProjectDescriptor descriptor;

	private ModifyListener projectNameModifyListener = new ModifyListener() {

		@Override
		public void modifyText(ModifyEvent e) {
			handleProjectNameModified();
		}
	};

	protected NewWebEditorFromXtextWizardPage(IWebProjectDescriptor descriptor) {
		super("NewWebEditorFromXtextWizardPage");
		setImageDescriptor(Activator.getImageDescriptor(CommonImageProvider.DSLFORGE_IMG));
		this.descriptor = descriptor;
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);
		initializeDialogUnits(parent);
		PlatformUI.getWorkbench().getHelpSystem().setHelp(composite, IIDEHelpContextIds.NEW_PROJECT_WIZARD_PAGE);
		composite.setLayout(new GridLayout());
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		createProjectNameGroup(composite);
		createLanguageGroup(composite);
		setPageComplete(validatePage());
		setErrorMessage(null);
		setMessage(null);
		setControl(composite);
		Dialog.applyDialogFont(composite);
	}

	@Override
	public void setVisible(boolean visible) {
		getControl().setVisible(visible);
	}

	protected void createProjectNameGroup(Composite parent) {
		Composite projectGroup = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		projectGroup.setLayout(layout);
		projectGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// new project field
		Label projectLabel = new Label(projectGroup, SWT.NONE);
		projectLabel.setText(IDEWorkbenchMessages.WizardNewProjectCreationPage_nameLabel);
		projectLabel.setFont(parent.getFont());
		projectNameField = new Text(projectGroup, SWT.BORDER);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.widthHint = SIZING_TEXT_FIELD_WIDTH;
		projectNameField.setLayoutData(data);
		projectNameField.setFont(parent.getFont());
		if (initialProjectFieldValue != null) {
			projectNameField.setText(initialProjectFieldValue);
		}
		projectNameField.addModifyListener(projectNameModifyListener);
		BidiUtils.applyBidiProcessing(projectNameField, BidiUtils.BTD_DEFAULT);
	}

	protected void createLanguageGroup(Composite parent) {
		Group group = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		group.setLayout(layout);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		group.setText("ANTLR Specification");

		// new grammar field
		Label xtextGrammarLabel = new Label(group, SWT.NONE);
		xtextGrammarLabel.setLayoutData(new GridData(160, SWT.DEFAULT));
		xtextGrammarLabel.setText("&Grammar file:");
		grammarPathField = new Text(group, SWT.BORDER);
		GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
		layoutData.grabExcessHorizontalSpace = true;
		grammarPathField.setLayoutData(layoutData);
		grammarPathField.setFont(parent.getFont());
		grammarPathField.setEnabled(false);
		if (descriptor != null)
			grammarPathField.setText(descriptor.getGrammar().getFullPath().toString());

		// new language field
		Label projectLabel = new Label(group, SWT.NONE);
		projectLabel.setText("&Grammar name:");
		projectLabel.setFont(parent.getFont());
		languageNameField = new Text(group, SWT.BORDER);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.widthHint = SIZING_TEXT_FIELD_WIDTH;
		languageNameField.setLayoutData(data);
		languageNameField.setFont(parent.getFont());
		if (descriptor != null)
			languageNameField.setText(descriptor.getGrammar().getName());
		BidiUtils.applyBidiProcessing(languageNameField, BidiUtils.BTD_DEFAULT);

		//Target Platform
		Label targetLabel = new Label(group, SWT.NONE);
		targetLabel.setText("&RAP Target:");
		targetLabel.setFont(parent.getFont());
		generateTarget = new Button(group, SWT.CHECK);
		generateTarget.setSelection(true);
		generateTarget.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				descriptor.setOption(IWebProjectDescriptor.TARGET_PLATFORM, new Boolean(generateTarget.getSelection()));
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				descriptor.setOption(IWebProjectDescriptor.TARGET_PLATFORM, new Boolean(true));
			}
		});
		
		//Packaging Projct
		Label buildLabel = new Label(group, SWT.NONE);
		buildLabel.setText("&WAR Build:");
		buildLabel.setFont(parent.getFont());
		generateBuild = new Button(group, SWT.CHECK);
		generateBuild.setSelection(true);
		generateBuild.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				descriptor.setOption(IWebProjectDescriptor.BUILD_PROJECT, new Boolean(generateBuild.getSelection()));
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				descriptor.setOption(IWebProjectDescriptor.BUILD_PROJECT, new Boolean(true));
			}
		});
	}

	protected List<String> getFileExtensions() {
		return Arrays.asList(new String[] { IXtextGrammarConstants.XTEXT_FILE_EXTENSION });
	}

	protected void handleProjectNameModified() {
		descriptor.setProject(getProjectHandle());
		XtextGrammar grammar = (XtextGrammar) descriptor.getGrammar();
		setAntlrGrammarPath(getProjectNameFieldValue() + "/src-js/" + grammar.getBasePath() + "/parser/"
				+ grammar.getShortName() + ".g");
		setPageComplete(validatePage());
	}

	@Override
	protected boolean validatePage() {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		String projectFieldContents = getProjectNameFieldValue();
		if (projectFieldContents.equals("")) {
			setErrorMessage(null);
			setMessage(IDEWorkbenchMessages.WizardNewProjectCreationPage_projectNameEmpty);
			return false;
		}
		IStatus nameStatus = workspace.validateName(projectFieldContents, IResource.PROJECT);
		if (!nameStatus.isOK()) {
			setErrorMessage(nameStatus.getMessage());
			return false;
		}
		IProject handle = getProjectHandle();
		if (handle.exists()) {
			setErrorMessage(IDEWorkbenchMessages.WizardNewProjectCreationPage_projectExistsMessage);
			return false;
		}
		setErrorMessage(null);
		setMessage(null);
		return true;
	}

	public String getLanguageName() {
		return getLanguageNameFieldValue();
	}

	public String getGrammarPath() {
		return getGrammarPathFieldValue();
	}

	public String getGrammarPathFieldValue() {
		if (grammarPathField == null) {
			return "";
		}
		return grammarPathField.getText().trim();
	}

	public String getLanguageNameFieldValue() {
		if (languageNameField == null) {
			return "";
		}
		return languageNameField.getText().trim();
	}

	public String getProjectNameFieldValue() {
		if (projectNameField == null) {
			return "";
		}
		return projectNameField.getText().trim();
	}

	@Override
	public IProject getProjectHandle() {
		return ResourcesPlugin.getWorkspace().getRoot().getProject(getProjectNameFieldValue());
	}

	@Override
	public void setInitialProjectName(String name) {
		initialProjectFieldValue = name.trim();
		projectNameField.setText(initialProjectFieldValue);
	}

	public void setInitialLanguageName(String name) {
		languageNameField.setText(name.trim());
	}

	public void setAntlrGrammarPath(String name) {
		grammarPathField.setText(name.trim());
	}

	public IWebProjectDescriptor getWebProjectDescriptor() {
		return descriptor;
	}

	public void setWebProjectDescriptor(IWebProjectDescriptor descriptor) {
		this.descriptor = descriptor;
	}

	public void setGenerateTargetPlatform(boolean value) {
		descriptor.setOption(IWebProjectDescriptor.TARGET_PLATFORM, new Boolean(value));
	}
	
	public void setGenerateBuildProject(boolean value) {
		descriptor.setOption(IWebProjectDescriptor.BUILD_PROJECT, new Boolean(value));
	}
}
