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

import org.dslforge.xtext.generator.IWebProjectGenerator.EditorType;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

public class WebProjectGeneratorWizardPage extends WizardPage {
	
	private String initialPath;    
	private Button generateAceEditorButton;	
	private Button generateRAPXtextEditorButton;	
	
	protected WebProjectGeneratorWizardPage(String pageName) {
		super(pageName);
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
		Composite workArea = new Composite(parent, SWT.NONE);
		setControl(workArea);	
		workArea.setLayout(new GridLayout());
		workArea.setLayoutData(new GridData(SWT.BORDER | GridData.FILL_HORIZONTAL));		
		createGeneratorOptions(workArea);
		restoreWidgetValues();
	}
	
	private void createGeneratorOptions(final Composite workArea) {
		
	   Group group = new Group( workArea, SWT.NONE );
	   group.setLayout( new GridLayout() );
	   group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	   group.setText( "Select the type of web integration" );

	   		//include code generators option
			Composite optionComposite = new Composite(group, SWT.NONE);
			GridLayout optionLayout = new GridLayout();
			optionLayout.numColumns = 2;
			optionLayout.marginWidth = 0;
			optionLayout.makeColumnsEqualWidth = false;
			optionComposite.setLayout(optionLayout);
			optionComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));	
			
			// Generate ACE Editor option
			generateAceEditorButton = new Button(optionComposite, SWT.RADIO);
			generateAceEditorButton.setSelection(false);
			generateAceEditorButton.addSelectionListener(new SelectionListener() {		
				@Override
				public void widgetSelected(SelectionEvent e) {
					boolean selection = generateAceEditorButton.getSelection();
					if (selection) {
//						generatorResourceField.setEnabled(true);
//						browseFileSystem.setEnabled(true);
					} else {
//						generatorResourceField.setEnabled(false);
//						browseFileSystem.setEnabled(false);
					}
				}
				
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
				}
			});	
			Label label = new Label(optionComposite, SWT.NONE);
			label.setLayoutData( new GridData( 300, SWT.DEFAULT ) );
			label.setText("&Generate ACE editor");
	   
			// Generate RAP Xtext Editor option
			generateRAPXtextEditorButton = new Button(optionComposite, SWT.RADIO);
			generateRAPXtextEditorButton.setSelection(false);
			generateRAPXtextEditorButton.addSelectionListener(new SelectionListener() {		
				@Override
				public void widgetSelected(SelectionEvent e) {
					boolean selection = generateRAPXtextEditorButton.getSelection();
					if (selection) {
//						generatorResourceField.setEnabled(true);
//						browseFileSystem.setEnabled(true);
					} else {
//						generatorResourceField.setEnabled(false);
//						browseFileSystem.setEnabled(false);
					}
				}
				
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
				}
			});	
			label = new Label(optionComposite, SWT.NONE);
			label.setLayoutData( new GridData( 300, SWT.DEFAULT ) );
			label.setText("&Generate Xtext RAP editor");
	}

	private void restoreWidgetValues() {			
		IDialogSettings settings = getDialogSettings();
		if (settings != null) {
			boolean genAceEditorValue = settings.getBoolean(generateAceEditorButton.getText());
			generateAceEditorButton.setSelection(genAceEditorValue);
			boolean generateRAPXtextEditorValue= settings.getBoolean(generateRAPXtextEditorButton.getText());
			generateRAPXtextEditorButton.setSelection(generateRAPXtextEditorValue);		
		}
	}

	protected void saveWidgetValues() {
		IDialogSettings settings = getDialogSettings();
		if (settings != null) {
			settings.put(generateAceEditorButton.getText(), generateAceEditorButton.getSelection());
			settings.put(generateRAPXtextEditorButton.getText(), generateRAPXtextEditorButton.getSelection());		
		}
	}

	public EditorType getEditorType() {
		if (generateAceEditorButton.getSelection())
			return EditorType.ACE;
		return EditorType.RAP;
	}
}
