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
package org.dslforge.workbench.wizards.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.MissingResourceException;

import org.dslforge.workspace.WorkspaceManager;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;

public abstract class AbstractNewModelWizard extends Wizard implements INewWizard{

	private static final String PATH_SEPARATOR = "\\";

	public static final List<String> FILE_EXTENSIONS = Collections.unmodifiableList(Arrays.asList("dsl".split("\\s*,\\s*")));

	/**
	 * A formatted list of supported file extensions, suitable for display.
	 */
	public static final String FORMATTED_FILE_EXTENSIONS = "dsl".replaceAll("\\s*,\\s*", ", ");

	/**
	 * This caches an instance of the model package.
	 */
	protected EcorePackage dslPackage = EcorePackage.eINSTANCE;

	/**
	 * This caches an instance of the model factory.
	 */
	protected EcoreFactory dslFactory = dslPackage.getEcoreFactory();

	/**
	 * This is the initial object creation page.
	 */
	protected ModelWizardInitialObjectCreationPage initialObjectCreationPage;

	/**
	 * Remember the selection during initialization for populating the default container.
	 */
	protected IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization.
	 */
	protected IWorkbench workbench;

	/**
	 * Caches the names of the types that can be created as the root object.
	 */
	protected List<String> initialObjectNames;

	/**
	 * This just records the information.
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle("New");
	}

	public EcorePackage getDslPackage() {
		return dslPackage;
	}


	public abstract void setDslPackage(EcorePackage dslPackage);


	public EcoreFactory getDslFactory() {
		return dslFactory;
	}

	/**
	 * Returns the names of the types that can be created as the root object.
	 */
	protected Collection<String> getInitialObjectNames() {
		if (initialObjectNames == null) {
			initialObjectNames = new ArrayList<String>();
			for (EClassifier eClassifier : getDslPackage().getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass)eClassifier;
					if (!eClass.isAbstract()) {
						initialObjectNames.add(eClass.getName());
					}
				}
			}
			Collections.sort(initialObjectNames, java.text.Collator.getInstance());
		}
		return initialObjectNames;
	}

	/**
	 * Create a new model.
	 */
	protected abstract EObject createInitialModel();

	/**
	 * Do the work after everything is specified.
	 */
	@Override
	public boolean performFinish() {
		try {
			// Get the URI of the model file.
			final URI fileURI = getModelURI();
			if (new File(fileURI.toFileString()).exists()) {
				if (!MessageDialog.openQuestion
						(getShell(),
						"Question",
						"The file " + fileURI.toFileString() + " already exists.  Do you want to replace the existing file?"
						)) {
					initialObjectCreationPage.selectFileField();
					return false;
				}
			}
			
			// Do the work within an operation.
			IRunnableWithProgress operation = new IRunnableWithProgress() {
				public void run(IProgressMonitor progressMonitor) {
						try {
							File file = new File(fileURI.toFileString());
							if (!file.exists()) {
								try {
									file.createNewFile();
								} catch (IOException e) {
									e.printStackTrace();
								}
							}
						}
						catch (Exception exception) {
							exception.printStackTrace();
						}
						finally {
							progressMonitor.done();
						}
					}
				};

			getContainer().run(false, false, operation);

			return openEditor(workbench, fileURI);			
		}
		catch (Exception exception) {
			exception.printStackTrace();
			return false;
		}
	}
	
	public static boolean openEditor(IWorkbench workbench, URI uri) {
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		
		IEditorDescriptor editorDescriptor = EditUIUtil.getDefaultEditor(uri, null);
		if (editorDescriptor == null) {
			MessageDialog.openError(workbenchWindow.getShell()
				,"Error"
				,"There is no editor registered for the file " + uri.lastSegment());
			return false;
		}
		else {
			try {
				page.openEditor(new URIEditorInput(uri), editorDescriptor.getId());
			}
			catch (PartInitException exception) {
				MessageDialog.openError(
					workbenchWindow.getShell()
					,"Open Editor"
					,exception.getMessage());
				return false;
			}
		}
		return true;
	}
	
	/*
	 *  Set the initial resource text content
	 */
	public String getInitialContent() {
		String fileContent = "";
		return fileContent;
	}	


	/**
	 * This is the page where the type of object to create is selected.
	 */
	public class ModelWizardInitialObjectCreationPage extends WizardPage {
		
		private static final long serialVersionUID = 1L;

		protected Text fileField;

		protected Combo initialObjectField;

		protected Combo encodingField;

		public ModelWizardInitialObjectCreationPage(String pageId) {
			super(pageId);
		}

		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE);
			{
				GridLayout layout = new GridLayout();
				layout.numColumns = 1;
				layout.verticalSpacing = 12;
				composite.setLayout(layout);
				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				composite.setLayoutData(data);
			}
			
			Label resourceURILabel = new Label(composite, SWT.LEFT);
			{
				resourceURILabel.setText("File");
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				resourceURILabel.setLayoutData(data);
			}

			Composite fileComposite = new Composite(composite, SWT.NONE);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.END;
				fileComposite.setLayoutData(data);
				GridLayout layout = new GridLayout();
				data.horizontalAlignment = GridData.FILL;
				layout.marginHeight = 0;
				layout.marginWidth = 0;
				layout.numColumns = 2;
				fileComposite.setLayout(layout);
			}

			fileField = new Text(fileComposite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				data.horizontalSpan = 1;
				fileField.setLayoutData(data);
			}

			fileField.addModifyListener(validator);

			Label containerLabel = new Label(composite, SWT.LEFT);
			{
				containerLabel.setText("Entry Point");
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				containerLabel.setLayoutData(data);
			}

			initialObjectField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				initialObjectField.setLayoutData(data);
			}

			for (String objectName : getInitialObjectNames()) {
				initialObjectField.add(getLabel(objectName));
			}

			if (initialObjectField.getItemCount() == 1) {
				initialObjectField.select(0);
			}
			initialObjectField.addModifyListener(validator);
			
			setPageComplete(validatePage());
			setControl(composite);
		}

		protected ModifyListener validator = new ModifyListener() {
			
			private static final long serialVersionUID = -3833514200598554944L;

			public void modifyText(ModifyEvent e) {
				setPageComplete(validatePage());
			}
		};

		protected boolean validatePage() {
			URI fileURI = getFileURI();
			if (fileURI == null || fileURI.isEmpty()) {
				setErrorMessage(null);
				return false;
			}

			String extension = fileURI.fileExtension();
			if (extension == null || !FILE_EXTENSIONS.contains(extension)) {
				setErrorMessage("The file name must have the following extension:" + FORMATTED_FILE_EXTENSIONS);
				return false;
			}

			setErrorMessage(null);
			return true;
		}

		@Override
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			if (visible) {
				initialObjectField.clearSelection();
				fileField.setFocus();
			}
		}

		public String getInitialObjectName() {
			String label = initialObjectField.getText();
			for (String name : getInitialObjectNames()) {
				if (getLabel(name).equals(label)) {
					return name;
				}
			}
			return null;
		}

		public String getEncoding() {
			return encodingField.getText();
		}

		public URI getFileURI() {
			try {
				return URI.createFileURI(fileField.getText());
			}
			catch (Exception exception) {
				// Ignore
			}
			return null;
		}

		public void selectFileField() {
			initialObjectField.clearSelection();
			encodingField.clearSelection();
			fileField.selectAll();
			fileField.setFocus();
		}

		/**
		 * Returns the label for the specified type name.
		 */
		protected String getLabel(String typeName) {
			try {
				return typeName;
			}
			catch(MissingResourceException mre) {
				mre.printStackTrace();
			}
			return typeName;
		}
	}

	/**
	 * The framework calls this to create the contents of the wizard.
	 */
	@Override
	public abstract void addPages();

	/**
	 * Get the URI from the page.
	 */
	public URI getModelURI() {
		String defaultWorkingDirectory = WorkspaceManager.INSTANCE.getWorkspaceRoot();
		URI rootURI = URI.createFileURI(defaultWorkingDirectory);
		URI relativePath = initialObjectCreationPage.getFileURI();
		String path = rootURI.toFileString();
		String string = path + PATH_SEPARATOR + relativePath.toFileString();
		URI absoluteFileURI = URI.createFileURI(string);
		return absoluteFileURI;
	}
}
