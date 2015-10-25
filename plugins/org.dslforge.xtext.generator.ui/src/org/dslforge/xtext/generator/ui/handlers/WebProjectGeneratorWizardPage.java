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
package org.dslforge.xtext.generator.ui.handlers;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;

public class WebProjectGeneratorWizardPage extends WizardPage {
	
	private String initialPath;
    
	private Button includeNavigatorButton;
	private Button includeProductButton;
	private Button includeGeneratorButton;
	
	private Combo generatorResourceField;
	private Combo navigatorRootField;
	
	private Button browseFileSystem; 
	private Button browseFileSystem2; 
	
    private static final int COMBO_HISTORY_LENGTH = 5;
	private static String previouslyBrowsedDirectory = "";
	private static String previouslySelectedFile = "";
	
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
		return includeNavigatorButton.getSelection();
	}

	public String getCodeGenerator() {
		return generatorResourceField.getText();
	}
	
	public boolean getWarProductOption() {
		return includeProductButton.getSelection();
	}

	public String getNavigatorRoot() {
		String p = navigatorRootField.getText();
		p = p.replaceAll("\\\\", "\\\\\\\\");
		return p;
	}

	@Override
	public void createControl(Composite parent) {
		Composite workArea = new Composite(parent, SWT.NONE);
		setControl(workArea);	
		workArea.setLayout(new GridLayout());
		workArea.setLayoutData(new GridData(SWT.BORDER | GridData.FILL_HORIZONTAL));		
		createCodeGeneratorControl(workArea);
		createGeneratorExtensions(workArea);
		createStyleControl(workArea);
		createAuthenticationControl(workArea);
		createDeploymentControl(workArea);
		restoreWidgetValues();
	}

	private void createGeneratorExtensions(final Composite workArea) {
		Group group = new Group( workArea, SWT.NONE );
		group.setLayout( new GridLayout() );
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		group.setText( "Generator extensions" );
		   
		Composite optionsComposite = new Composite(group, SWT.NONE);
		GridLayout optionlayout = new GridLayout();
		optionlayout.numColumns =2;
		optionlayout.marginWidth = 0;
		optionlayout.makeColumnsEqualWidth = false;
		optionsComposite.setLayout(optionlayout);
		optionsComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		//Navigator checkbox
		includeNavigatorButton = new Button(optionsComposite, SWT.CHECK);
		includeNavigatorButton.setSelection(false);
		includeNavigatorButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				boolean selection = includeNavigatorButton.getSelection();
				if (selection) {
					navigatorRootField.setEnabled(true);
					browseFileSystem2.setEnabled(true);
				} else {
					navigatorRootField.setEnabled(false);
					browseFileSystem2.setEnabled(false);
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		
		Label label = new Label(optionsComposite, SWT.NONE);
		label.setLayoutData( new GridData( 300, SWT.DEFAULT ) );
		label.setText("&Include common navigator");
		
		
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
		xtendGeneratorLabel.setText("&Navigator root:");
		// Path combo
		navigatorRootField = new Combo(xtendGeneratorComposite, SWT.BORDER);
		GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
		layoutData.grabExcessHorizontalSpace=true;
		navigatorRootField.setLayoutData(layoutData);	
		// browse button
		browseFileSystem2 = new Button(xtendGeneratorComposite, SWT.PUSH);
		browseFileSystem2.setText("&Browse...");
		setButtonLayoutData(browseFileSystem);
		browseFileSystem2.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleLocationDirectoryButtonPressed(workArea);
			}
		});
		navigatorRootField.setEnabled(false);
		browseFileSystem2.setEnabled(false);	
	}
	
	private void createAuthenticationControl(Composite workArea) {
		Group group = new Group( workArea, SWT.NONE );
		group.setLayout( new GridLayout() );
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		group.setText( "Security" );
		
		Composite securityComposite = new Composite(group, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns =2;
		layout.marginWidth = 0;
		layout.makeColumnsEqualWidth = false;
		securityComposite.setLayout(layout);
		securityComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		Label productLabel = new Label(securityComposite, SWT.NONE);
		productLabel.setLayoutData( new GridData( 300, SWT.DEFAULT ) );
		productLabel.setText("&Include authentication form");		
	}
	 
	private void createDeploymentControl(Composite workArea) {
		Group group = new Group( workArea, SWT.NONE );
		group.setLayout( new GridLayout() );
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		group.setText( "WAR Deployment" );
		   
		Composite optionsComposite = new Composite(group, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns =2;
		layout.marginWidth = 0;
		layout.makeColumnsEqualWidth = false;
		optionsComposite.setLayout(layout);
		optionsComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		//Product Checkbox
		includeProductButton = new Button(optionsComposite, SWT.CHECK);
		includeProductButton.setSelection(false);
		includeProductButton.addSelectionListener(new SelectionListener() {	
			@Override
			public void widgetSelected(SelectionEvent e) {
				includeProductButton.getSelection();
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
		
		Label productLabel = new Label(optionsComposite, SWT.NONE);
		productLabel.setLayoutData( new GridData( 300, SWT.DEFAULT ) );
		productLabel.setText("&Generate a product configuration project");		
	}
	
	private void createCodeGeneratorControl(final Composite workArea) {
		
	   Group group = new Group( workArea, SWT.NONE );
	   group.setLayout( new GridLayout() );
	   group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	   group.setText( "Include existing code generators" );

	   		//include code generators option
			Composite optionComposite = new Composite(group, SWT.NONE);
			GridLayout optionLayout = new GridLayout();
			optionLayout.numColumns = 2;
			optionLayout.marginWidth = 0;
			optionLayout.makeColumnsEqualWidth = false;
			optionComposite.setLayout(optionLayout);
			optionComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));	
			// Include generator checkbox
			includeGeneratorButton = new Button(optionComposite, SWT.CHECK);
			includeGeneratorButton.setSelection(false);
			includeGeneratorButton.addSelectionListener(new SelectionListener() {		
				@Override
				public void widgetSelected(SelectionEvent e) {
					boolean selection = includeGeneratorButton.getSelection();
					if (selection) {
						generatorResourceField.setEnabled(true);
						browseFileSystem.setEnabled(true);
					} else {
						generatorResourceField.setEnabled(false);
						browseFileSystem.setEnabled(false);
					}
				}
				
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
				}
			});	
			Label label = new Label(optionComposite, SWT.NONE);
			label.setLayoutData( new GridData( 300, SWT.DEFAULT ) );
			label.setText("&Include code generators");
	   
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
		xtendGeneratorLabel.setText("&Generator root file:");
		// Path combo
		generatorResourceField = new Combo(xtendGeneratorComposite, SWT.BORDER);
		GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
		layoutData.grabExcessHorizontalSpace=true;
		generatorResourceField.setLayoutData(layoutData);	
		// browse button
		browseFileSystem = new Button(xtendGeneratorComposite, SWT.PUSH);
		browseFileSystem.setText("&Browse...");
		setButtonLayoutData(browseFileSystem);
		browseFileSystem.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowseFileSystem(workArea);
			}
		});
		generatorResourceField.setEnabled(false);
		browseFileSystem.setEnabled(false);	
	}
	
	private void createStyleControl(final Composite workArea) {
		
		   Group group = new Group( workArea, SWT.NONE );
		   group.setLayout( new GridLayout() );
		   group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		   group.setText( "&Appearance" );
			
			Composite styleComposite = new Composite(group, SWT.NONE);
			GridLayout layout = new GridLayout();
			layout.numColumns = 3;
			layout.marginWidth = 0;
			layout.makeColumnsEqualWidth = false;
			styleComposite.setLayout(layout);
			styleComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			
			// Template label
			Label templateLabel = new Label(styleComposite, SWT.NONE);
			templateLabel.setLayoutData( new GridData( 160, SWT.DEFAULT ) );
			templateLabel.setText("&Select template:");

			// Template combo
			Combo templateField = new Combo(styleComposite, SWT.BORDER);
			GridData templateLayoutData = new GridData(GridData.FILL_HORIZONTAL);
			templateLayoutData.grabExcessHorizontalSpace=true;
			templateField.setLayoutData(templateLayoutData);
			templateField.add("Default");
			templateField.add("Fancy");
			templateField.add("Business");
			templateField.select(0);
		}
	
	protected void handleBrowseFileSystem(Composite parent) {
		IWorkspaceRoot rootElement = ResourcesPlugin.getWorkspace().getRoot();
		ResourceSelectionDialog dialog = new ResourceSelectionDialog(parent.getShell(), rootElement, "Select code generators to be integrated to the editor");
		dialog.setTitle( "Include code generators" );
		dialog.open();
		Object[] result = dialog.getResult();
		if (result!=null) {
			for (Object x: result) {
				previouslySelectedFile = x.toString();
				generatorResourceField.add(x.toString());
				generatorResourceField.setText(previouslySelectedFile);
			}
		}
	}
	
	protected void handleLocationDirectoryButtonPressed(Composite parent) {
		DirectoryDialog dialog = new DirectoryDialog(getShell(), SWT.MULTI);
		dialog.setText("Common Navigator Preferences");
		dialog.setMessage("Select a root folder");

		String dirName = navigatorRootField.getText().trim();
		if (dirName.length() == 0) {
			dialog.setFilterPath(ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString());
		} else {
			File path = new File(dirName);
			if (path.exists()) {
				dialog.setFilterPath(new Path(dirName).toOSString());
			}
		}
		String selectedDirectory = dialog.open();
		if (selectedDirectory != null) {
			previouslyBrowsedDirectory = selectedDirectory;
			navigatorRootField.setText(previouslyBrowsedDirectory);
		}
		//dialog.setFilterPath(fileName.getText());	
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
            restoreFromHistory(settings, WebProjectGeneratorWizard.STORE_DIRECTORIES, navigatorRootField);
            restoreFromHistory(settings, WebProjectGeneratorWizard.STORE_FILES, generatorResourceField);
		}

		// if we do have an initial path, set the proper path to the initial
		// value. Move cursor to the end of the path so user can see the most
		// relevant part (directory)
		if (initialPath != null) {
			boolean dir = new File(initialPath).isDirectory();
			if (dir) {
			//	generatorResourceField.setText(initialPath);
			//	generatorResourceField.setSelection(new Point(initialPath.length(), initialPath.length()));
				generatorResourceField.setFocus();
			}
		}
	}
	
	private void restoreFromHistory(IDialogSettings settings, String key, Combo combo) {
		String[] sourceNames = settings.getArray(key);
		if (sourceNames == null) {
			return; // ie.- no values stored, so stop
		}
		for (int i = 0; i < sourceNames.length; i++) {
			combo.add(sourceNames[i]);
		}
	}
	
	/**
	 * Since Finish was pressed, write widget values to the dialog store so that
	 * they will persist into the next invocation of this wizard page.
	 */
	protected void saveWidgetValues() {
		IDialogSettings settings = getDialogSettings();
		if (settings != null) {
            saveInHistory(settings, WebProjectGeneratorWizard.STORE_DIRECTORIES, navigatorRootField.getText());
            saveInHistory(settings, WebProjectGeneratorWizard.STORE_FILES, generatorResourceField.getText());
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
