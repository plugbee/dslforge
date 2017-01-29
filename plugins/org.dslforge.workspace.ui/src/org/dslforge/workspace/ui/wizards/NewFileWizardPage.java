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

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.dslforge.workspace.ui.internal.IFileExtensionHandler;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class NewFileWizardPage extends AbstractNewResourceWizardPage {

	private static final long serialVersionUID = 1L;
	
	private final Map<String, String> languageToFileExtension = new HashMap<String, String>();
	private Text fileNameText;
	private Combo languageCombo;
	private String languageName = null;

	protected String getSelectedFileExtension() {
		return IFileExtensionHandler.getAavailableFileExtensions().get(languageCombo.getText());
	}
	
	protected ModifyListener validator = new ModifyListener() {

		private static final long serialVersionUID = 1L;

		public void modifyText(ModifyEvent e) {
			setPageComplete(validatePage());
		}
	};
	
	protected NewFileWizardPage(String pageName) {
		super(pageName);
	}

	@Override
	protected void viewerSelectionChanged(SelectionChangedEvent event) {
		super.viewerSelectionChanged(event);
		validatePage();
	}

	protected boolean validatePage() {
		String fileName = fileNameText.getText();
		if (fileName.length()==0) {
			setErrorMessage("File name cannot be empty.");
			return false;
		}
		setErrorMessage(null);			
		IPath filePath = getFilePath();
		if (filePath.toFile().exists()) {
			setErrorMessage("A file with equal name already exists in the workspace.");
			return false;
		}
		final int selectionIndex = IFileExtensionHandler.getSelectionIndex(fileName);
		if (selectionIndex >= 0) {
			languageCombo.select(selectionIndex);
			return true;
		}
		return false;
	}

	protected void initializeLanguageCombo() {
		if (languageName == null) {
			for (String fileExtension : IFileExtensionHandler.getAavailableFileExtensions().keySet()) {
				languageCombo.add(IFileExtensionHandler.getLanguageName(fileExtension));
			}
		} else {
			languageCombo.add(languageName);
			languageCombo.setEnabled(false);
		}
		if (languageCombo.getItemCount() == 1) {
			languageCombo.select(0);
		}
	}

	public IPath getFilePath() {
		IStructuredSelection iStructuredSelection = getInitialElementSelections().get(0);
		Path containerPath = new Path(iStructuredSelection.getFirstElement().toString());
		if(!containerPath.toFile().isDirectory()) {
			File parentFile = containerPath.toFile().getParentFile();
			containerPath = new Path(parentFile.getAbsolutePath());
		}
		return containerPath.append(fileNameText.getText());
	}
	
	@Override
	public void createControl(Composite parent) {
		Composite workArea = new Composite(parent, SWT.NONE);
		setControl(workArea);
		workArea.setLayout(new GridLayout());
		workArea.setLayoutData(new GridData(SWT.BORDER | GridData.FILL_HORIZONTAL));
		createContainerArea(workArea);
		createInfoArea(workArea);
	}

	@SuppressWarnings("serial")
	private void createInfoArea(Composite workArea) {
		Group group = new Group(workArea, SWT.NONE);
		group.setLayout(new GridLayout());
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		group.setText("File Information");

		Composite folderInfoComposite = new Composite(group, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		layout.marginWidth = 0;
		layout.makeColumnsEqualWidth = false;
		folderInfoComposite.setLayout(layout);
		folderInfoComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		Label projectNameLabel = new Label(folderInfoComposite, SWT.NONE);
		projectNameLabel.setLayoutData(new GridData(160, SWT.DEFAULT));
		projectNameLabel.setText("&File Name:");
		
		fileNameText = new Text(folderInfoComposite, SWT.BORDER);
		GridData layoutData = new GridData();
		layoutData.horizontalAlignment = GridData.FILL;
		layoutData.grabExcessHorizontalSpace = true;
		fileNameText.setLayoutData(layoutData);
		fileNameText.setFocus();
		fileNameText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent event) {
				updateWidgetEnablements();
			}
		});

		Label dslNameLabel = new Label(folderInfoComposite, SWT.NONE);
		dslNameLabel.setLayoutData(new GridData(160, SWT.DEFAULT));
		dslNameLabel.setText("&Language:");
		
		languageCombo = new Combo(folderInfoComposite, SWT.BORDER | SWT.READ_ONLY);
		GridData data = new GridData();
		data.horizontalAlignment = GridData.FILL;
		data.grabExcessHorizontalSpace = true;
		languageCombo.setLayoutData(data);
		languageCombo.setToolTipText("Select the language");
		initializeLanguageCombo();

		languageCombo.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				String fileName = fileNameText.getText();
				if (fileName.length()>0)
					fileNameText.setText(recomputeFileName());
				setPageComplete(validatePage());
			}

			private String recomputeFileName() {
				String oldFileName = fileNameText.getText();
				int extensionIndex = oldFileName.lastIndexOf(".");
				if (extensionIndex>0)
					oldFileName = oldFileName.substring(0, extensionIndex);
				return oldFileName + "." + getSelectedFileExtension();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		languageCombo.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent event) {
				//setPageComplete(validatePage());
			}
		});
		
		setPageComplete(validatePage());
	}

	protected void updateWidgetEnablements() {
		setPageComplete(validatePage());
	}

	public String getFolderName() {
		return fileNameText.getText();
	}

	public Map<String, String> getLanguageToFileExtension() {
		return languageToFileExtension;
	}
}