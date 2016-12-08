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
package org.dslforge.workspace.ui.wizards;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class NewFolderWizardPage extends AbstractNewResourceWizardPage {

	private static final long serialVersionUID = 1L;
	
	private Text folderNameText;
	
	protected NewFolderWizardPage(String pageName) {
		super(pageName);
	}

	@Override
	public void createControl(Composite parent) {
		Composite workArea = new Composite(parent, SWT.NONE);
		setControl(workArea);	
		workArea.setLayout(new GridLayout());
		workArea.setLayoutData(new GridData(SWT.BORDER | GridData.FILL_HORIZONTAL));
		createContainerArea(workArea);
		createFolderInfoArea(workArea);
	}

	@SuppressWarnings("serial")
	private void createFolderInfoArea(Composite workArea) {
		Group group = new Group( workArea, SWT.NONE );
		group.setLayout( new GridLayout() );
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		group.setText( "Folder Information" );
		   
		Composite folderInfoComposite = new Composite(group, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		layout.marginWidth = 0;
		layout.makeColumnsEqualWidth = false;
		folderInfoComposite.setLayout(layout);
		folderInfoComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		//Folder Name
		Label projectNameLabel = new Label(folderInfoComposite, SWT.NONE);
		projectNameLabel.setLayoutData( new GridData( 160, SWT.DEFAULT ) );
		projectNameLabel.setText("&Name:");
		
		folderNameText = new Text(folderInfoComposite, SWT.BORDER);
		GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
		layoutData.grabExcessHorizontalSpace=true;
		layoutData.horizontalSpan=2;
		folderNameText.setLayoutData(layoutData);
		folderNameText.setFocus();
		folderNameText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent event) {
				updateWidgetEnablements();
			}
		});

	}

	protected void updateWidgetEnablements() {
		// TODO Auto-generated method stub
		
	}

	public String getFolderName() {
		return folderNameText.getText();
	}
}
