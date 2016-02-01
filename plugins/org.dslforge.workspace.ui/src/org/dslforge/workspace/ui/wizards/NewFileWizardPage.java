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
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
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
	public String defaultFileExtension = "txt";
	public Collection<String> availableFileExtensions = Collections.singletonList(defaultFileExtension);
	private final Map<String, String> languageToFileExtension = new HashMap<String, String>();
	private Text fileNameText;
	private Combo languageNameCombo;
	private String languageName = null;

	private Collection<String> getAvailableExtensions() {
		return availableFileExtensions;
	}

	protected ModifyListener validator = new ModifyListener() {

		private static final long serialVersionUID = 1L;

		public void modifyText(ModifyEvent e) {
			setPageComplete(validatePage());
		}
	};

	protected NewFileWizardPage(String pageName) {
		super(pageName);
		availableFileExtensions =getAvailableExtensions();
		defaultFileExtension = availableFileExtensions.isEmpty() ? "NaN" : availableFileExtensions.iterator().next();
	}

	@Override
	protected void viewerSelectionChanged(SelectionChangedEvent event) {
		super.viewerSelectionChanged(event);
		validatePage();
	}

	protected boolean validatePage() {
		if(fileNameText.getText()==null)
			return false;
		URI fileURI = getFileURI();
		if (fileURI == null || fileURI.isEmpty()) {
			setErrorMessage(null);
			return false;
		}
		List<IStructuredSelection> initialElementSelections = getInitialElementSelections();
		if (initialElementSelections == null) {
			setErrorMessage("The file container is not specified, please select the file container");
			return false;
		}
		ISelection iSelection = initialElementSelections.get(0);
		if (iSelection instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) iSelection).getFirstElement();
			File container = (File) firstElement;
			if (!container.isDirectory()) {
				setErrorMessage("The file container should be a folder or a project");
				return false;
			}
		}
		String extension = fileURI.fileExtension();
		if (extension == null || !getSelectedFileExtension().equals(extension)) {
			setErrorMessage("The file name must have the following extension: " + getSelectedFileExtension());
			return false;
		}
		setErrorMessage(null);
		return true;
	}

	protected String getSelectedFileExtension() {
		return defaultFileExtension;
	}

	protected Collection<String> getFileExtensions() {
		return availableFileExtensions;
	}

	protected URI getFileURI() {
		IStructuredSelection selection = (IStructuredSelection) getContainerViewer().getSelection();
		String rootPath = selection.getFirstElement().toString();
		String filePath = rootPath + "\\" + fileNameText.getText();
		return URI.createFileURI(filePath);
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

		Label dslNameLabel = new Label(folderInfoComposite, SWT.NONE);
		dslNameLabel.setLayoutData(new GridData(160, SWT.DEFAULT));
		dslNameLabel.setText("&File Extension:");

		languageNameCombo = new Combo(folderInfoComposite, SWT.BORDER | SWT.READ_ONLY);
		GridData data = new GridData();
		data.horizontalAlignment = GridData.FILL;
		data.grabExcessHorizontalSpace = true;
		languageNameCombo.setLayoutData(data);
		languageNameCombo.setToolTipText("Select among the available languages.");
		initializeLanguageCombo();

		languageNameCombo.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				Object source = e.getSource();
				if (source instanceof Combo) {
					defaultFileExtension = getLanguageToFileExtension().get(((Combo) source).getText());
				}
				setPageComplete(validatePage());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				Object source = e.getSource();
				if (source instanceof Combo) {
					defaultFileExtension = getLanguageToFileExtension().get(((Combo) source).getText());
				}
			}
		});

		languageNameCombo.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent event) {
				setPageComplete(validatePage());
			}
		});
		
		Label projectNameLabel = new Label(folderInfoComposite, SWT.NONE);
		projectNameLabel.setLayoutData(new GridData(160, SWT.DEFAULT));
		projectNameLabel.setText("&File Name:");

		fileNameText = new Text(folderInfoComposite, SWT.BORDER);
		GridData layoutData = new GridData();
		layoutData.horizontalAlignment = GridData.FILL;
		layoutData.grabExcessHorizontalSpace = true;
		fileNameText.setLayoutData(layoutData);
		fileNameText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent event) {
				updateWidgetEnablements();
			}
		});
		setPageComplete(validatePage());
	}

	public void initializeLanguageCombo() {
		if (languageName == null) {
			for (String objectName : getAvailableExtensions()) {
				languageNameCombo.add(objectName);
			}
			if (languageNameCombo.getItemCount() == 1) {
				languageNameCombo.select(0);
			}
		} else {
			languageNameCombo.add(languageName);
			languageNameCombo.select(0);
			languageNameCombo.setEnabled(false);
		}
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