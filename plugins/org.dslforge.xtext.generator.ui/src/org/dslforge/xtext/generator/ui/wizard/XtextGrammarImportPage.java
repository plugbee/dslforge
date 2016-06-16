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
import org.dslforge.common.IWebProjectDescriptor.EditorType;
import org.dslforge.common.WebProjectDescriptor;
import org.dslforge.common.ui.internal.Activator;
import org.dslforge.common.ui.internal.CommonImageProvider;
import org.dslforge.xtext.generator.XtextGrammar;
import org.dslforge.xtext.generator.util.GeneratorUtil;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.util.BidiUtils;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.xtext.Grammar;

public class XtextGrammarImportPage extends WizardPage {

	private static final int SIZING_TEXT_FIELD_WIDTH = 250;

	private Text grammarPathField;
	private Text grammarNameField;
	private Text runtimeProjectNameField;
	private Text entryRuleNameField;
	private Button browseWorkspace;

	private Grammar grammar;
	private IWebProjectDescriptor descriptor;
	
	protected XtextGrammarImportPage(String pageName) {
		super(pageName);
		setImageDescriptor(Activator.getImageDescriptor(CommonImageProvider.DSLFORGE_IMG));
	}

	@Override
	public void createControl(Composite parent) {
        Composite composite = new Composite(parent, SWT.NULL);
        composite.setLayout(new GridLayout());
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		createLanguageGroup(composite);
		setPageComplete(validatePage());
		setErrorMessage(null);
		setMessage(null);
        setControl(composite);
        Dialog.applyDialogFont(composite);
	}

	/**
	 * Creates the language name specification controls.
	 *
	 * @param parent
	 *            the parent composite
	 */
	private final void createLanguageGroup(Composite parent) {
		Group group = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		group.setLayout(layout);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		group.setText("Language Specification");

		//Label
		Label xtextGrammarLabel = new Label(group, SWT.NONE);
		xtextGrammarLabel.setLayoutData(new GridData(160, SWT.DEFAULT));
		xtextGrammarLabel.setText("&Xtext grammar:");
		
		//Text
		grammarPathField = new Text(group, SWT.BORDER);
		GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
		layoutData.grabExcessHorizontalSpace = true;
		grammarPathField.setLayoutData(layoutData);
		grammarPathField.setEditable(false);
		
		// Button
		browseWorkspace = new Button(group, SWT.PUSH);
		browseWorkspace.setText("&Browse...");
		setButtonLayoutData(browseWorkspace);
		browseWorkspace.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowseFileSystem();
			}
		});
		
		//Label
		Label languageLabel = new Label(group, SWT.NONE);
		languageLabel.setLayoutData(new GridData(160, SWT.DEFAULT));
		languageLabel.setText("&Short Name:");
		languageLabel.setFont(parent.getFont());
		
		//Text
		grammarNameField = new Text(group, SWT.BORDER);
		GridData languageData = new GridData(GridData.FILL_HORIZONTAL);
		languageData.widthHint = SIZING_TEXT_FIELD_WIDTH;
		grammarNameField.setLayoutData(languageData);
		languageData.grabExcessHorizontalSpace = true;
		languageData.horizontalSpan = 2;
		grammarNameField.setFont(parent.getFont());
		grammarNameField.setText("");
		grammarNameField.setEditable(false);
		BidiUtils.applyBidiProcessing(grammarNameField, BidiUtils.BTD_DEFAULT);

		//Label
		Label projectLabel = new Label(group, SWT.NONE);
		projectLabel.setLayoutData(new GridData(160, SWT.DEFAULT));
		projectLabel.setText("&Runtime Project:");
		projectLabel.setFont(parent.getFont());
		
		//Text
		runtimeProjectNameField = new Text(group, SWT.BORDER);
		GridData projectData = new GridData(GridData.FILL_HORIZONTAL);
		projectData.widthHint = SIZING_TEXT_FIELD_WIDTH;
		projectData.grabExcessHorizontalSpace = true;
		projectData.horizontalSpan = 2;
		runtimeProjectNameField.setLayoutData(projectData);
		runtimeProjectNameField.setFont(parent.getFont());
		runtimeProjectNameField.setEditable(false);
		BidiUtils.applyBidiProcessing(runtimeProjectNameField, BidiUtils.BTD_DEFAULT);
		
		//Label
		Label entryRuleLabel = new Label(group, SWT.NONE);
		entryRuleLabel.setLayoutData(new GridData(160, SWT.DEFAULT));
		entryRuleLabel.setText("&Entry rule:");
		entryRuleLabel.setFont(parent.getFont());
		
		//Text
		entryRuleNameField = new Text(group, SWT.BORDER);
		GridData entryRuleData = new GridData(GridData.FILL_HORIZONTAL);
		entryRuleData.widthHint = SIZING_TEXT_FIELD_WIDTH;
		entryRuleData.grabExcessHorizontalSpace = true;
		entryRuleData.horizontalSpan = 2;
		entryRuleNameField.setLayoutData(entryRuleData);
		entryRuleNameField.setFont(parent.getFont());
		entryRuleNameField.setText("");
		entryRuleNameField.setEditable(false);
		BidiUtils.applyBidiProcessing(entryRuleNameField, BidiUtils.BTD_DEFAULT);
	}
	
	protected List<String> getFileExtensions() {
		return Arrays.asList(new String[] { IXtextGrammarConstants.XTEXT_FILE_EXTENSION });
	}

	private void handleBrowseFileSystem() {
		XtextGrammarSelectionDialog selectionDialog = new XtextGrammarSelectionDialog(getShell(), true,
				ResourcesPlugin.getWorkspace().getRoot(), IResource.FILE);
		selectionDialog.setTitle("Xtext Grammar Selection Dialog");
		selectionDialog.setInitialPattern(IXtextGrammarConstants.XTEXT_FILE_EXTENSION_FILTER);
		if (selectionDialog.open() == Window.OK) {
			IFile xtextGrammarFile = selectionDialog.getGrammarFile();
			grammar = GeneratorUtil.loadXtextGrammar(xtextGrammarFile);
			runtimeProjectNameField.setText(GeneratorUtil.getDslProjectName(grammar));
			grammarPathField.setText(xtextGrammarFile.getLocation().toString());
			grammarNameField.setText(xtextGrammarFile.getLocation().removeFileExtension().lastSegment());
			entryRuleNameField.setText(grammar.getRules().get(0).getName());
			createWebProjectDescriptor();
			setPageComplete(validatePage());
		}
	}

	protected boolean validatePage() {
		if (getLanguageNameFieldValue().equals("")) {
			setErrorMessage(null);
			setMessage("The language name cannot not be empty.");
			return false;
		}
		return true;
	}

	public String getLanguageName() {
		if (grammarNameField == null) {
			return "";
		}
		return getLanguageNameFieldValue();
	}

	public String getGrammarPath() {
		if (grammarPathField == null) {
			return "";
		}
		return getGrammarPathFieldValue();
	}

	public String getGrammarPathFieldValue() {
		if (grammarPathField == null) {
			return "";
		}
		return grammarPathField.getText().trim();
	}

	public String getLanguageNameFieldValue() {
		if (grammarNameField == null) {
			return "";
		}
		return grammarNameField.getText().trim();
	}

	public String getRuntimeProjectNameFieldValue() {
		if (runtimeProjectNameField == null) {
			return "";
		}
		return runtimeProjectNameField.getText().trim();
	}
	
	public IWebProjectDescriptor getWebProjectDescriptor() {
		if (descriptor==null && grammar!=null) {
			createWebProjectDescriptor();
		}
		return descriptor;
	}

	private final void createWebProjectDescriptor() {
		XtextGrammar wrapped = new XtextGrammar(grammar);
		String projectName = wrapped.getProjectName();
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		descriptor = new WebProjectDescriptor(project, wrapped);
		descriptor.setEditorType(EditorType.RAP);
	}

	public IProject getProjectHandle() {
		if (descriptor!=null)
			return descriptor.getProject();
		return null;
	}
}