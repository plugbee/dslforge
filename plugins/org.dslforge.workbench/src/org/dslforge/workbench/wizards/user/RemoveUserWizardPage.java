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
package org.dslforge.workbench.wizards.user;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

@SuppressWarnings("serial")
public class RemoveUserWizardPage extends WizardPage {

	String userName = null;
	String firstName = null;
	String lastName = null;
	String organization = null;
	String email = null;
	String pwd = null;
	
	protected RemoveUserWizardPage(String pageName) {
		super(pageName);
	}

	@Override
	public void createControl(Composite parent) {
		Composite workArea = new Composite(parent, SWT.NONE);
		setControl(workArea);	
		workArea.setLayout(new GridLayout());
		workArea.setLayoutData(new GridData(SWT.BORDER | GridData.FILL_HORIZONTAL));		
		createUserInfoArea(workArea);
	}

	private void createUserInfoArea(Composite workArea) {
		Group group = new Group( workArea, SWT.NONE );
		group.setLayout( new GridLayout() );
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		group.setText( "User Information" );
		   
		Composite projectInfoComposite = new Composite(group, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		layout.marginWidth = 0;
		layout.makeColumnsEqualWidth = false;
		projectInfoComposite.setLayout(layout);
		projectInfoComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		//User Name
		Label userNameLabel = new Label(projectInfoComposite, SWT.NONE);
		userNameLabel.setLayoutData( new GridData( 160, SWT.DEFAULT ) );
		userNameLabel.setText("&userName:");
		
		Text userNameText = new Text(projectInfoComposite, SWT.BORDER);
		GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
		layoutData.grabExcessHorizontalSpace=true;
		layoutData.horizontalSpan=2;
		userNameText.setLayoutData(layoutData);
		userNameText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent event) {
				Text text = (Text) event.widget;
				userName = text.getText();
				updateWidgetEnablements();
			}
		});
		
//		//First Name
//		Label firstNameLabel = new Label(projectInfoComposite, SWT.NONE);
//		firstNameLabel.setLayoutData( new GridData( 160, SWT.DEFAULT ) );
//		firstNameLabel.setText("&First Name:");
//		
//		Text firstNameText = new Text(projectInfoComposite, SWT.BORDER);
//		layoutData = new GridData(GridData.FILL_HORIZONTAL);
//		layoutData.grabExcessHorizontalSpace=true;
//		layoutData.horizontalSpan=2;
//		firstNameText.setLayoutData(layoutData);
//		firstNameText.addModifyListener(new ModifyListener() {
//			@Override
//			public void modifyText(ModifyEvent event) {
//				Text text = (Text) event.widget;
//				firstName = text.getText();
//				updateWidgetEnablements();
//			}
//		});
//		
//		//Last Name
//		Label lastNameLabel = new Label(projectInfoComposite, SWT.NONE);
//		lastNameLabel.setLayoutData( new GridData( 160, SWT.DEFAULT ) );
//		lastNameLabel.setText("&Last Name:");
//		
//		Text lastNameText = new Text(projectInfoComposite, SWT.BORDER);
//		layoutData = new GridData(GridData.FILL_HORIZONTAL);
//		layoutData.grabExcessHorizontalSpace=true;
//		layoutData.horizontalSpan=2;
//		lastNameText.setLayoutData(layoutData);
//		lastNameText.addModifyListener(new ModifyListener() {
//			@Override
//			public void modifyText(ModifyEvent event) {
//				Text text = (Text) event.widget;
//				lastName = text.getText();
//				updateWidgetEnablements();
//			}
//		});
//		
//		
//		//Organization
//		Label organizationLabel = new Label(projectInfoComposite, SWT.NONE);
//		organizationLabel.setLayoutData( new GridData( 160, SWT.DEFAULT ) );
//		organizationLabel.setText("&Organization:");
//		
//		Text organizationText = new Text(projectInfoComposite, SWT.BORDER);
//		layoutData = new GridData(GridData.FILL_HORIZONTAL);
//		layoutData.grabExcessHorizontalSpace=true;
//		layoutData.horizontalSpan=2;
//		organizationText.setLayoutData(layoutData);
//		organizationText.addModifyListener(new ModifyListener() {
//			@Override
//			public void modifyText(ModifyEvent event) {
//				Text text = (Text) event.widget;
//				organization = text.getText();
//				updateWidgetEnablements();
//			}
//		});
//		
//		//Email
//		Label emailLabel = new Label(projectInfoComposite, SWT.NONE);
//		emailLabel.setLayoutData( new GridData( 160, SWT.DEFAULT ) );
//		emailLabel.setText("&Email:");
//		
//		Text emailText = new Text(projectInfoComposite, SWT.BORDER);
//		layoutData = new GridData(GridData.FILL_HORIZONTAL);
//		layoutData.grabExcessHorizontalSpace=true;
//		layoutData.horizontalSpan=2;
//		emailText.setLayoutData(layoutData);
//		emailText.addModifyListener(new ModifyListener() {
//			@Override
//			public void modifyText(ModifyEvent event) {
//				Text text = (Text) event.widget;
//				email = text.getText();
//				updateWidgetEnablements();
//			}
//		});
//		
//		//Pwd
//		Label pwdLabel = new Label(projectInfoComposite, SWT.NONE);
//		pwdLabel.setLayoutData( new GridData( 160, SWT.DEFAULT ) );
//		pwdLabel.setText("&Password:");
//		
//		Text pwdText = new Text(projectInfoComposite, SWT.BORDER);
//		layoutData = new GridData(GridData.FILL_HORIZONTAL);
//		layoutData.grabExcessHorizontalSpace=true;
//		layoutData.horizontalSpan=2;
//		pwdText.setLayoutData(layoutData);
//		pwdText.addModifyListener(new ModifyListener() {
//			@Override
//			public void modifyText(ModifyEvent event) {
//				Text text = (Text) event.widget;
//				pwd = text.getText();
//				updateWidgetEnablements();
//			}
//		});
	}

	protected void updateWidgetEnablements() {
		setUserName(userName);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


}
