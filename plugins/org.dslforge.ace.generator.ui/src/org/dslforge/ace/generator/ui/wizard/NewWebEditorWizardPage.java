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
 * Contributors:
 *     Amine Lajmi - Initial API and implementation
 *
 * </copyright>
 */
package org.dslforge.ace.generator.ui.wizard;

import org.dslforge.ace.generator.ANTLRGrammar;
import org.dslforge.common.IWebProjectDescriptor;
import org.dslforge.common.WebProjectDescriptor;
import org.dslforge.common.ui.internal.Activator;
import org.dslforge.common.ui.internal.CommonImageProvider;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.util.BidiUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class NewWebEditorWizardPage extends WizardNewProjectCreationPage {

	private static final int SIZING_TEXT_FIELD_WIDTH = 250;

	private String initialPath;
	private Text languageNameField;
	private Text grammarPathField;
	private String initialLanguageFieldValue = "Example";
	private String initialGrammarPathFieldValue = "org.dslforge.example.web/WebContent/parser/Example.g";
	private IWebProjectDescriptor descriptor;
			
	private ModifyListener languageNameModifyListener = new ModifyListener() {

		@Override
		public void modifyText(ModifyEvent e) {
		    boolean valid = validatePage();
		    setPageComplete(valid);
		}
	};

	protected NewWebEditorWizardPage(String pageName) {
		super(pageName);
		setImageDescriptor(Activator.getImageDescriptor(CommonImageProvider.DSLFORGE_IMG));
	}

	public String getInitialPath() {
		return initialPath;
	}

	public void setInitialPath(String initialPath) {
		this.initialPath = initialPath;
	}

	public boolean getNavigatorOption() {
		return true;
	}

	public boolean getWarProductOption() {
		return false;
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		Composite control = (Composite) getControl();
		createLanguageGroup(control);
		setPageComplete(validatePage());
        setErrorMessage(null);
        setMessage(null);
	}

	private final void createLanguageGroup(Composite parent) {
		Group group = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		group.setLayout(layout);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		group.setText("Language Specification");

		// new language label
		Label projectLabel = new Label(group, SWT.NONE);
		projectLabel.setText("&Name:");
		projectLabel.setFont(parent.getFont());
		// new language name entry field
		languageNameField = new Text(group, SWT.BORDER);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.widthHint = SIZING_TEXT_FIELD_WIDTH;
		languageNameField.setLayoutData(data);
		languageNameField.setFont(parent.getFont());
		if (initialLanguageFieldValue != null) {
			languageNameField.setText(initialLanguageFieldValue);
		}
		languageNameField.addModifyListener(languageNameModifyListener);
		BidiUtils.applyBidiProcessing(languageNameField, BidiUtils.BTD_DEFAULT);

		// new grammar path label
		Label grammarPathLabel = new Label(group, SWT.NONE);
		grammarPathLabel.setText("&ANTLR file:");
		grammarPathLabel.setFont(parent.getFont());
		// new grammar path entry field
		grammarPathField = new Text(group, SWT.BORDER);
		GridData pathData = new GridData(GridData.FILL_HORIZONTAL);
		pathData.widthHint = SIZING_TEXT_FIELD_WIDTH;
		grammarPathField.setLayoutData(pathData);
		grammarPathField.setFont(parent.getFont());
		grammarPathField.setEditable(false);
		if (grammarPathField != null) {
			grammarPathField.setText(initialGrammarPathFieldValue);
		}
		BidiUtils.applyBidiProcessing(grammarPathField, BidiUtils.BTD_DEFAULT);
	}

	@Override
	protected boolean validatePage() {
		boolean isValid = super.validatePage();
		if (grammarPathField!=null)
			grammarPathField.setText(getProjectName()+ "/WebContent/parser/" + getLanguageName()+ ".g");
        if (getLanguageNameFieldValue().equals("")) { //$NON-NLS-1$
            setErrorMessage(null);
            setMessage("The language name cannot not be empty.");
            return false;
        }
        if( getWebProjectDescriptor()!=null) {
        	updateDescriptor();
        }
        return isValid;
	}

	public String getLanguageName() {
		if (languageNameField == null) {
			return initialLanguageFieldValue;
		}

		return getLanguageNameFieldValue();
	}

	public String getGrammarPath() {
		if (grammarPathField == null) {
			return initialGrammarPathFieldValue;
		}
		return getGrammarPathFieldValue();
	}

	private String getGrammarPathFieldValue() {
		if (grammarPathField == null) {
			return "";
		}
		return grammarPathField.getText().trim();
	}

	private String getLanguageNameFieldValue() {
		if (languageNameField == null) {
			return "";
		}

		return languageNameField.getText().trim();
	}

	public void setInitialLanguageName(String name) {
		if (name == null) {
			initialLanguageFieldValue = null;
		} else {
			initialLanguageFieldValue = name.trim();
		}
	}

	public void setInitialGrammarPath(String name) {
		if (name == null) {
			initialGrammarPathFieldValue = null;
		} else {
			initialGrammarPathFieldValue = name.trim();
		}
	}
	
	public IWebProjectDescriptor getWebProjectDescriptor() {
		if (descriptor ==null) {
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(getProjectName());
			ANTLRGrammar grammar = new ANTLRGrammar(getLanguageName(), new Path(getGrammarPath()));
			descriptor = new WebProjectDescriptor(project, grammar);
		}
		return descriptor;
	}

	private void updateDescriptor() {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(getProjectName());
		ANTLRGrammar grammar = new ANTLRGrammar(getLanguageName(), new Path(getGrammarPath()));
		descriptor.setProject(project);
		descriptor.setGrammar(grammar);
	}
}
