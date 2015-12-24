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
package org.dslforge.workbench.wizards.file;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dslforge.workbench.wizards.AbstractNewResourceWizardPage;
import org.dslforge.xtext.common.registry.LanguageRegistry;
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

public class NewFileWizardPage extends AbstractNewResourceWizardPage{

	private static final long serialVersionUID = 1L;
	
	public Collection<String> FILE_EXTENSIONS = null;

	public String SELECTED_FILE_EXTENSION = null;
	
	private Text fileNameText;
	
	private Combo languageNameCombo;
	
	private String languageName = null;
	
	private String fileExtension=null;
	
	private final Map<String, String> languageToFileExtension = new HashMap<String, String>();
	
	private List<String> getAvailableDSLNames() {
		List<String> list = LanguageRegistry.INSTANCE.getMetamodels();
		for (String m: list)
			m = tinify(m);
		return list;
	}

	private String tinify(String m) {
		return m.substring(m.lastIndexOf(".") + 1, m.length());
	}

	private Collection<String> getAvailableFileExtensions() {
		return getLanguageToFileExtension().values();
	}
	
	private void initializeLanguageMap() {
		List<String> list = LanguageRegistry.INSTANCE.getMetamodels();
		for (String m : list) {
			languageToFileExtension.put(m, LanguageRegistry.INSTANCE.getFileExtensionFor(m));
		}
	}
	
	protected ModifyListener validator = new ModifyListener() {
		
			private static final long serialVersionUID = 1L;

			public void modifyText(ModifyEvent e) {
				setPageComplete(validatePage());
			}
		};
		
		
	protected NewFileWizardPage(String pageName) {
		super(pageName);
		initializeLanguageMap();
		FILE_EXTENSIONS = Collections.unmodifiableCollection(getAvailableFileExtensions());
		SELECTED_FILE_EXTENSION = "NaN"; //FIXME: initial value should be computed.
	}

	protected NewFileWizardPage(String pageName, String languageName, String fileExtension) {
		super(pageName);
		this.languageName = languageName;
		this.fileExtension = fileExtension;
		FILE_EXTENSIONS = Collections.singletonList(fileExtension);
		SELECTED_FILE_EXTENSION = fileExtension;
	}
	
	@Override
	protected void viewerSelectionChanged(SelectionChangedEvent event) {
		super.viewerSelectionChanged(event);
		validatePage();
	}
	
	protected boolean validatePage() {
		URI fileURI = getFileURI();
		if (fileURI == null || fileURI.isEmpty()) {
			setErrorMessage(null);
			return false;
		}

		List<ISelection> initialElementSelections = getInitialElementSelections();
		if (initialElementSelections==null) {
			setErrorMessage("The model file container is not specified, please select the file container");
			return false;
		}
		ISelection iSelection = initialElementSelections.get(0);
		if (iSelection instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) iSelection).getFirstElement();
			File container = (File)firstElement;
			if (!container.isDirectory()) {
				setErrorMessage("The model file container should be a folder or a project");
				return false;	
			}
		}
		String extension = fileURI.fileExtension();
		if (extension == null || !getSelectedFileExtension().equals(extension)) {
			setErrorMessage("The model file name must have the following extension: " + getSelectedFileExtension());
			return false;
		}

		setErrorMessage(null);
		return true /*getInitialObjectName() != null*/;
	}

	protected String getSelectedFileExtension() {
		return SELECTED_FILE_EXTENSION;
	}

	protected Collection<String> getFileExtensions() {
		return FILE_EXTENSIONS;
	}

	protected URI getFileURI() {
		try {
			IStructuredSelection selection = (IStructuredSelection) getContainerViewer().getSelection();
			String rootPath = selection.getFirstElement().toString();
			String filePath = rootPath + "\\" + fileNameText.getText();
			return URI.createFileURI(filePath);
		}
		catch (Exception exception) {
			// Ignore
		}
		return null;
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
		Group group = new Group( workArea, SWT.NONE );
		group.setLayout( new GridLayout() );
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		group.setText( "File Information" );
		   
		Composite folderInfoComposite = new Composite(group, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		layout.marginWidth = 0;
		layout.makeColumnsEqualWidth = false;
		folderInfoComposite.setLayout(layout);
		folderInfoComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		Label dslNameLabel = new Label(folderInfoComposite, SWT.NONE);
		dslNameLabel.setLayoutData( new GridData( 160, SWT.DEFAULT ) );
		dslNameLabel.setText("&DSL Name:");
		
		languageNameCombo = new Combo(folderInfoComposite, SWT.BORDER | SWT.READ_ONLY);
		GridData data = new GridData();
		data.horizontalAlignment = GridData.FILL;
		data.grabExcessHorizontalSpace = true;
		languageNameCombo.setLayoutData(data);
		languageNameCombo.setToolTipText("Select among the available languages.");
		
		initLanguageCombo();

		languageNameCombo.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				Object source = e.getSource();
				if (source instanceof Combo) {
					SELECTED_FILE_EXTENSION = getLanguageToFileExtension().get(((Combo)source).getText());
				}
				setPageComplete(validatePage());
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				Object source = e.getSource();
				if (source instanceof Combo) {
					SELECTED_FILE_EXTENSION = getLanguageToFileExtension().get(((Combo)source).getText());
				}
			}
		});
		
		languageNameCombo.addModifyListener(new ModifyListener() {	
			@Override
			public void modifyText(ModifyEvent event) {
				setPageComplete(validatePage());
			}
		});

		setPageComplete(validatePage());
		//setControl(composite);
		
		//Folder Name
		Label projectNameLabel = new Label(folderInfoComposite, SWT.NONE);
		projectNameLabel.setLayoutData( new GridData( 160, SWT.DEFAULT ) );
		projectNameLabel.setText("&File Name:");
		
		fileNameText = new Text(folderInfoComposite, SWT.BORDER);
		//GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
		GridData layoutData = new GridData();
		layoutData.horizontalAlignment = GridData.FILL;
		layoutData.grabExcessHorizontalSpace = true;
//		layoutData.grabExcessHorizontalSpace=true;
//		layoutData.horizontalSpan=2;
		fileNameText.setLayoutData(layoutData);
		fileNameText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent event) {
				updateWidgetEnablements();
			}
		});

	}

	public void initLanguageCombo() {
		if (languageName==null) {
			for (String objectName : getAvailableDSLNames()) {
				languageNameCombo.add(objectName);
			}
			if (languageNameCombo.getItemCount() == 1) {
				languageNameCombo.select(0);
			}	
		} 
		else {
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
