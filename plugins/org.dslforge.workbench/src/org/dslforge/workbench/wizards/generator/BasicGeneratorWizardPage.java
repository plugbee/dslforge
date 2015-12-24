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

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.dslforge.workspace.WorkspaceManager;
import org.dslforge.xtext.common.registry.LanguageRegistry;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.xtext.generator.IGenerator;

public class BasicGeneratorWizardPage extends WizardPage {

	private static final long serialVersionUID = 1L;
	
	private String initialPath;

    private static final int COMBO_HISTORY_LENGTH = 5;
    
    private Combo languageNameCombo;
    
    public String getLanguageName() {
		return languageNameCombo.getText();
	}

	private Combo generatorComboField;

	private Button generatorOutputCheck;
	
	private Combo outputDirectoryCombo;
	
	private IStructuredSelection selection;
	
	// Keep track of the directory that we browsed to last time the wizard was invoked.
	private static String previouslyBrowsedDirectory = "";
	
	protected BasicGeneratorWizardPage(String pageName) {
		super(pageName);
		setInitialPath(WorkspaceManager.INSTANCE.getWorkspaceRoot());
	}

	public String getInitialPath() {
		return initialPath;
	}

	public void setInitialPath(String initialPath) {
		this.initialPath = initialPath;
	}

	public void setInitialElementSelections(List<IStructuredSelection> singletonList) {
		selection = singletonList.get(0);
	}
	
	public IStructuredSelection getInitialElementSelection() {
		return selection;
	}

	protected boolean validatePage() {
		if (languageNameCombo!=null) {
			String dslName = languageNameCombo.getText();
			if (dslName == null || dslName.isEmpty()) {
				setErrorMessage("Select target language");
				return false;
			}
			if (generatorComboField.getText()==null) {
				setErrorMessage("Select target artifact generator");
				return false;
			}
			setErrorMessage(null);
			return true;
		}
		return false;
	}

	
	@Override
	public void createControl(Composite parent) {
		Composite workArea = new Composite(parent, SWT.NONE);
		setControl(workArea);	
		workArea.setLayout(new GridLayout());
		workArea.setLayoutData(new GridData(SWT.BORDER | GridData.FILL_HORIZONTAL));		
		createGeneratorOptionsControl(workArea);
		createGeneratorExtensions(workArea);
		restoreWidgetValues();
	}
	
	private void createGeneratorExtensions(final Composite workArea) {
		Group group = new Group( workArea, SWT.NONE );
		group.setLayout(new GridLayout());
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		group.setText("Generator Output Directory");
		   
		Composite optionsComposite = new Composite(group, SWT.NONE);
		GridLayout optionlayout = new GridLayout();
		optionlayout.numColumns =2;
		optionlayout.marginWidth = 0;
		optionlayout.makeColumnsEqualWidth = false;
		optionsComposite.setLayout(optionlayout);
		optionsComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		//Generator output checkbox
		generatorOutputCheck = new Button(optionsComposite, SWT.CHECK);
		generatorOutputCheck.setSelection(false);
		generatorOutputCheck.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				boolean selection = generatorOutputCheck.getSelection();
				if (selection) {
					outputDirectoryCombo.setEnabled(false);
				} else {
					outputDirectoryCombo.setEnabled(true);
				}
				setPageComplete(validatePage());
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		
		generatorOutputCheck.setSelection(true);
		generatorOutputCheck.setEnabled(false);
		
		Label label = new Label(optionsComposite, SWT.NONE);
		label.setLayoutData( new GridData( 300, SWT.DEFAULT ) );
		label.setText("&Use default output (./src-gen)");
		
		//generator root file composite
		Composite xtendGeneratorComposite = new Composite(group, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		layout.marginWidth = 0;
		layout.makeColumnsEqualWidth = false;
		xtendGeneratorComposite.setLayout(layout);
		xtendGeneratorComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));		
		// Xtend generator label
		Label xtendGeneratorLabel = new Label(xtendGeneratorComposite, SWT.NONE);
		xtendGeneratorLabel.setLayoutData( new GridData( 160, SWT.DEFAULT ) );
		xtendGeneratorLabel.setText("&Custom directory:");
		// Path combo
		outputDirectoryCombo = new Combo(xtendGeneratorComposite, SWT.BORDER);
		GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
		layoutData.grabExcessHorizontalSpace=true;
		outputDirectoryCombo.setLayoutData(layoutData);	

		//initialize default output
		outputDirectoryCombo.setText(getDefaultOutput());
		
		outputDirectoryCombo.setEnabled(false);
		
		setPageComplete(validatePage());
	}

	private String getDefaultOutput() {
		String output = WorkspaceManager.INSTANCE.getWorkspaceRoot();
		Object firstElement = selection.getFirstElement();
		if (firstElement instanceof File) {
			String parent = ((File)firstElement).getParent();
			output = parent + "\\src-gen";
		}
		return output;
	}

	private void createGeneratorOptionsControl(final Composite workArea) {
	   Group group = new Group( workArea, SWT.NONE );
	   group.setLayout( new GridLayout() );
	   group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	   group.setText( "&Select the generator to run" );
		
		Composite languageNameComposite = new Composite(group, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		layout.marginWidth = 0;
		layout.makeColumnsEqualWidth = false;
		languageNameComposite.setLayout(layout);
		languageNameComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		// DSL label
		Label languageNameLabel = new Label(languageNameComposite, SWT.NONE);
		languageNameLabel.setLayoutData( new GridData( 160, SWT.DEFAULT ) );
		languageNameLabel.setText("&Contributed DSL:");

		// DSL combo
		languageNameCombo = new Combo(languageNameComposite, SWT.BORDER | SWT.READ_ONLY);
		GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
		layoutData.grabExcessHorizontalSpace=true;
		languageNameCombo.setLayoutData(layoutData);
		
		//initialize combo
		File file =(File) getInitialElementSelection().getFirstElement();
		String fileName = file.getName();
		String extension = fileName.substring(fileName.indexOf(".")+1, fileName.length());
	    List<String> metamodels = LanguageRegistry.INSTANCE.getMetamodelsByExtension(extension);
	    if (!metamodels.isEmpty()) {
			for (String m: metamodels) {
				languageNameCombo.add(m);
			}	
	    }
	    
		//set combo dependencies
		languageNameCombo.addSelectionListener(new SelectionListener() {
			private static final long serialVersionUID = 1L;
			@Override
			public void widgetSelected(SelectionEvent e) {
				generatorComboField.removeAll();
				List<IGenerator> generators = LanguageRegistry.INSTANCE.getGeneratorsForMetamodel(languageNameCombo.getText());
				for (IGenerator g: generators) {
					generatorComboField.add(g.getClass().getName());
				}
				generatorComboField.select(0);
				setPageComplete(validatePage());
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

	    //by default select the first one
	    if (languageNameCombo.getItemCount()==1) {
	    	languageNameCombo.select(0);
	    }
	    
		// Generator label
		Label templateLabel = new Label(languageNameComposite, SWT.NONE);
		templateLabel.setLayoutData( new GridData( 160, SWT.DEFAULT ) );
		templateLabel.setText("&Generator:");

		// Generator combo
		generatorComboField = new Combo(languageNameComposite, SWT.BORDER | SWT.READ_ONLY);
		GridData templateLayoutData = new GridData(GridData.FILL_HORIZONTAL);
		templateLayoutData.grabExcessHorizontalSpace=true;
		generatorComboField.setLayoutData(templateLayoutData);

		List<IGenerator> generators = LanguageRegistry.INSTANCE.getGeneratorsForMetamodel(languageNameCombo.getText());
		for (IGenerator g: generators) {
			generatorComboField.add(g.getClass().getName());
		}
		generatorComboField.select(0);
		setPageComplete(validatePage());
	}
	
	/**
	 * 
	 * File upload Add-on, see: http://wiki.eclipse.org/RAP/Add-Ons
	 * See: http://eclipsesource.com/blogs/2011/06/23/uploading-files-with-rap-14/
	 * 
	 * @param parent
	 */
	protected void handleBrowseFileSystem(Composite parent) {
//		FileDialog fileDialog = new FileDialog(parent.getShell(), SWT.TITLE | SWT.MULTI);
//		fileDialog.setText("Upload Files");
//		fileDialog.open();
		// TODO: clean Temp file, move file to target location
		// see: https://bugs.eclipse.org/bugs/show_bug.cgi?id=362924
	}

	/**
	 * Use the dialog store to restore widget values to the values that they
	 * held last time this wizard was used to completion, or alternatively,
	 * if an initial path is specified, use it to select values.
	 */
	private void restoreWidgetValues() {			
		// First, check to see if we have resore settings
		IDialogSettings settings = getDialogSettings();
		if (settings != null) {
            restoreFromHistory(settings, AbstractGeneratorWizard.STORE_DIRECTORIES, outputDirectoryCombo);
		}

		// if we do have an initial path, set the proper path to the initial
		// value. Move cursor to the end of the path so user can see the most
		// relevant part (directory)
		if (initialPath != null) {
			boolean dir = new File(initialPath).isDirectory();
			if (dir) {
				outputDirectoryCombo.setText(getDefaultOutput());
				outputDirectoryCombo.setSelection(new Point(initialPath.length(), initialPath.length()));
				outputDirectoryCombo.setFocus();
			}
		}
	}
	
	private void restoreFromHistory(IDialogSettings settings, String key, Combo combo) {
		String[] sourceNames = settings.getArray(key);
		if (sourceNames == null) {
			return;
		}
		for (int i = 0; i < sourceNames.length; i++) {
			combo.add(sourceNames[i]);
		}
	}
	
	public String getTargetDirectory() {
		return outputDirectoryCombo.getText();
	}
	
	/**
	 * Since Finish was pressed, write widget values to the dialog store so that
	 * they will persist into the next invocation of this wizard page.
	 */
	protected void saveWidgetValues() {
		IDialogSettings settings = getDialogSettings();
		if (settings != null) {
            saveInHistory(settings, AbstractGeneratorWizard.STORE_DIRECTORIES, outputDirectoryCombo.getText());
		}
	}

	private void saveInHistory(IDialogSettings settings, String key, String value) {
		String[] sourceNames = settings.getArray(key);
		if (sourceNames == null) {
			sourceNames = new String[0];
		}
		sourceNames = addToHistory(sourceNames, value);
		settings.put(key, sourceNames);
	}
	
    /**
     * Adds an entry to a history, while taking care of duplicate history items
     * and excessively long histories.
     *
     * @param history the current history
     * @param newEntry the entry to add to the history
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
	protected String[] addToHistory(String[] history, String newEntry) {
        java.util.ArrayList l = new java.util.ArrayList(Arrays.asList(history));
        addToHistory(l, newEntry);
        String[] r = new String[l.size()];
        l.toArray(r);
        return r;
    }
    
    /**
     * Adds an entry to a history, while taking care of duplicate history items
     * and excessively long histories.
     *
     * @param history the current history
     * @param newEntry the entry to add to the history
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
	protected void addToHistory(List history, String newEntry) {
        history.remove(newEntry);
        history.add(0, newEntry);
        // since only one new item was added, we can be over the limit
        // by at most one item
        if (history.size() > COMBO_HISTORY_LENGTH) {
			history.remove(COMBO_HISTORY_LENGTH);
		}
    }
}
