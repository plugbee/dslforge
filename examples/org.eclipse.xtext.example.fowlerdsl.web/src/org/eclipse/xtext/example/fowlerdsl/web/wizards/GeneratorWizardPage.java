package org.eclipse.xtext.example.fowlerdsl.web.wizards;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.dslforge.workspace.WorkspaceManager;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

public class GeneratorWizardPage extends WizardPage {

	private static final long serialVersionUID = 1L;
	
	private String initialPath;
	
	private Combo fileName;
    
    private static final int COMBO_HISTORY_LENGTH = 5;
    
	// Keep track of the directory that we browsed to last time the wizard was invoked.
	private static String previouslyBrowsedDirectory = "";
	
	protected GeneratorWizardPage(String pageName) {
		super(pageName);
		setInitialPath(WorkspaceManager.INSTANCE.getWorkspaceRoot());
	}

	public String getInitialPath() {
		return initialPath;
	}

	public void setInitialPath(String initialPath) {
		this.initialPath = initialPath;
	}

	@Override
	public void createControl(Composite parent) {
		Composite workArea = new Composite(parent, SWT.NONE);
		setControl(workArea);	
		workArea.setLayout(new GridLayout());
		workArea.setLayoutData(new GridData(SWT.BORDER | GridData.FILL_HORIZONTAL));		
		createOutputDirectoryControl(workArea);
		restoreWidgetValues();
	}

	private void createOutputDirectoryControl(Composite workArea) {
		Group group = new Group( workArea, SWT.NONE );
		group.setLayout( new GridLayout() );
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		group.setText( "Enter directory where code is generated" );
		   
		Composite directoryComposite = new Composite(group, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		layout.marginWidth = 0;
		layout.makeColumnsEqualWidth = false;
		directoryComposite.setLayout(layout);
		directoryComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		//Output directory label
		Label label = new Label(directoryComposite, SWT.NONE);
		label.setLayoutData( new GridData( 160, SWT.DEFAULT ) );
		label.setText("&Output Directory:");
		
		fileName = new Combo(directoryComposite, SWT.BORDER);
		GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
		layoutData.grabExcessHorizontalSpace=true;
		layoutData.horizontalSpan=2;
		fileName.setLayoutData(layoutData);
		fileName.addModifyListener(new ModifyListener() {			

			private static final long serialVersionUID = 1L;

			@Override
			public void modifyText(ModifyEvent event) {
				previouslyBrowsedDirectory = fileName.getText();
			}
		});
	}
	
	private void createLogoImageControl(final Composite workArea) {
		
	   Group group = new Group( workArea, SWT.NONE );
	   group.setLayout( new GridLayout() );
	   group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	   group.setText( "Configure application style" );
		
		Composite logoImageComposite = new Composite(group, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		layout.marginWidth = 0;
		layout.makeColumnsEqualWidth = false;
		logoImageComposite.setLayout(layout);
		logoImageComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		// Image label
		Label logoImageLabel = new Label(logoImageComposite, SWT.NONE);
		logoImageLabel.setLayoutData( new GridData( 160, SWT.DEFAULT ) );
		logoImageLabel.setText("&Logo Image:");

		// Path combo
		Combo imagePathField = new Combo(logoImageComposite, SWT.BORDER);
		GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
		layoutData.grabExcessHorizontalSpace=true;
		imagePathField.setLayoutData(layoutData);
		
		// browse button
		Button browseFileSystem = new Button(logoImageComposite, SWT.PUSH);
		browseFileSystem.setText("&Browse...");
		setButtonLayoutData(browseFileSystem);

		browseFileSystem.addSelectionListener(new SelectionAdapter() {

			private static final long serialVersionUID = 1L;

			public void widgetSelected(SelectionEvent e) {
				//handleBrowseFileSystem(workArea);
			}
		});

		// Template label
		Label templateLabel = new Label(logoImageComposite, SWT.NONE);
		templateLabel.setLayoutData( new GridData( 160, SWT.DEFAULT ) );
		templateLabel.setText("&Template:");

		// Template combo
		Combo templateField = new Combo(logoImageComposite, SWT.BORDER);
		GridData templateLayoutData = new GridData(GridData.FILL_HORIZONTAL);
		templateLayoutData.grabExcessHorizontalSpace=true;
		templateField.setLayoutData(templateLayoutData);
		templateField.add("Default");
		templateField.add("Fancy");
		templateField.add("Business");
	}
	
	/**
	 * 
	 * File upload Add-on, see: http://wiki.eclipse.org/RAP/Add-Ons See:
	 * http://eclipsesource.com/blogs/2011/06/23/uploading-files-with-rap-14/
	 * 
	 * https://eclipse.googlesource.com/rap/incubator/org.eclipse.rap.incubator.
	 * fileupload
	 * /+/f66db7dd4778dc91e4be6821cf94ffe7349f972e/bundles/org.eclipse.
	 * rap.rwt.supplemental
	 * .filedialog.demo/src/org/eclipse/rap/examples/demo/fileupload
	 * /FileUploadExamplePage.java
	 * 
	 * @param parent
	 */
	protected void handleBrowseFileSystem(Composite parent) {
//		FileDialog fileDialog = new FileDialog(parent.getShell(), SWT.TITLE	| SWT.MULTI);
//		fileDialog.setText("Upload Files");
//		fileDialog.open();
//		String[] fileNames = fileDialog.getFileNames();
//		System.out.println("[dslforge] - files uploaded.");
//		// TODO: clean Temp file, move file to target location
//		// see: https://bugs.eclipse.org/bugs/show_bug.cgi?id=362924
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
            restoreFromHistory(settings, GeneratorWizard.STORE_DIRECTORIES, fileName);
		}

		// if we do have an initial path, set the proper path to the initial
		// value. Move cursor to the end of the path so user can see the most
		// relevant part (directory)
		if (initialPath != null) {
			boolean dir = new File(initialPath).isDirectory();
			if (dir) {
				fileName.setText(initialPath);
				fileName.setSelection(new Point(initialPath.length(), initialPath.length()));
				fileName.setFocus();
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
	
	public String getTargetDirectory() {
		return fileName.getText();
	}
	
	/**
	 * Since Finish was pressed, write widget values to the dialog store so that
	 * they will persist into the next invocation of this wizard page.
	 */
	protected void saveWidgetValues() {
		IDialogSettings settings = getDialogSettings();
		if (settings != null) {
            saveInHistory(settings, GeneratorWizard.STORE_DIRECTORIES, fileName.getText());
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

