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
package org.dslforge.xtext.generator.web.wizards

import org.dslforge.xtext.generator.IWebProjectGenerator
import org.dslforge.xtext.generator.util.GeneratorUtil
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.generator.IFileSystemAccess

class GenNewWizard implements IWebProjectGenerator{
	
	val relativePath = "/wizards/"
	var String projectName
	var String dslProjectName
	var String grammarShortName
	var String basePath
	var String fileExtension
	var String metamodelPackage
	var Grammar grammar
	
	override doGenerate(EObject input, IFileSystemAccess fsa) {
		grammar = input as Grammar
		projectName=GeneratorUtil::getProjectName(grammar)
		dslProjectName=GeneratorUtil::getDslProjectName(grammar)
		grammarShortName= GeneratorUtil::getGrammarShortName(grammar)
		basePath=GeneratorUtil::getBasePath(grammar)
		fileExtension = GeneratorUtil::getFileExtension(grammar)
		metamodelPackage = GeneratorUtil::getMetamodelPackage(grammar)
		fsa.generateFile(basePath + relativePath + "New"+grammarShortName + "Wizard.java", "src", toJava())
	}
	
	def toJava()'''
package «projectName».wizards;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;

import org.dslforge.rap.workspace.WorkspaceManager;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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
import org.eclipse.xtext.resource.XtextResource;
import «grammar.name»StandaloneSetup;
import «metamodelPackage».«grammarShortName»Factory;
import «metamodelPackage».«grammarShortName»Package;
import «projectName».«grammarShortName»WorkbenchAdvisor;
import «projectName».internal.Activator;

public class New«grammarShortName»Wizard extends Wizard implements INewWizard{

	/**
	 * The supported extensions for created files.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<String> FILE_EXTENSIONS =
		Collections.unmodifiableList(Arrays.asList("«fileExtension»".split("\\s*,\\s*")));

	/**
	 * A formatted list of supported file extensions, suitable for display.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String FORMATTED_FILE_EXTENSIONS = "«fileExtension»".replaceAll("\\s*,\\s*", ", ");

	/**
	 * This caches an instance of the model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected «grammarShortName»Package «grammarShortName.toLowerCase»Package = «grammarShortName»Package.eINSTANCE;

	/**
	 * This caches an instance of the model factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected «grammarShortName»Factory «grammarShortName.toLowerCase»Factory = «grammarShortName.toLowerCase»Package.get«grammarShortName»Factory();

	/**
	 * This is the initial object creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected «grammarShortName»ModelWizardInitialObjectCreationPage initialObjectCreationPage;

	/**
	 * Remember the selection during initialization for populating the default container.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IWorkbench workbench;

	/**
	 * Caches the names of the types that can be created as the root object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected List<String> initialObjectNames;

	/**
	 * This just records the information.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle("New");
		setDefaultPageImageDescriptor(Activator.getImageDescriptor("full/wizban/NewBasicModel"));
	}

	/**
	 * Returns the names of the types that can be created as the root object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<String> getInitialObjectNames() {
		if (initialObjectNames == null) {
			initialObjectNames = new ArrayList<String>();
			for (EClassifier eClassifier : «grammarShortName.toLowerCase»Package.getEClassifiers()) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EObject createInitialModel() {
		EClass eClass = (EClass)«grammarShortName.toLowerCase»Package.getEClassifier(initialObjectCreationPage.getInitialObjectName());
		EObject rootObject = «grammarShortName.toLowerCase»Factory.create(eClass);
		return rootObject;
	}

	/**
	 * Do the work after everything is specified.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean performFinish() {
		try {
			// Get the URI of the model file.
			//
			URI fileURI = getModelURI();
			String baseURI = WorkspaceManager.getInstance().getWorkspaceRoot();
			final URI absoluteURI = URI.createFileURI(baseURI + "/" + fileURI.path());
			if (new File(absoluteURI.devicePath()).exists()) {
				if (!MessageDialog.openQuestion
						(getShell(),
						"Question",
						"The file " + absoluteURI.devicePath() + " already exists.  Do you want to replace the existing file?"
						)) {
					initialObjectCreationPage.selectFileField();
					return false;
				}
			}
			
			// Do the work within an operation.
			//
			IRunnableWithProgress operation = new IRunnableWithProgress() {
				public void run(IProgressMonitor progressMonitor) {
						try {
							// Create a resource set
							//
							new «grammarShortName»StandaloneSetup().createInjectorAndDoEMFRegistration();
							ResourceSet resourceSet = new ResourceSetImpl();

							// Create a resource for this file.
							//
							/*
							XtextResource resource = (XtextResource) resourceSet.createResource(fileURI);
							if (resource !=null) {
								try {
									resource.getContents().add(createInitialModel());
									Map<Object, Object> options = new HashMap<Object, Object>();
									//TODO: put something in the map!
									resource.save(options);
								} catch (IOException ex) {
									ex.printStackTrace();
								}
							}*/
							File file = new File(absoluteURI.devicePath());
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

			return openEditor(workbench, absoluteURI);			
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class «grammarShortName»ModelWizardInitialObjectCreationPage extends WizardPage {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Text fileField;

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Combo initialObjectField;

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Combo encodingField;

		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public «grammarShortName»ModelWizardInitialObjectCreationPage(String pageId) {
			super(pageId);
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
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

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected ModifyListener validator =
			new ModifyListener() {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				public void modifyText(ModifyEvent e) {
					setPageComplete(validatePage());
				}
			};

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
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
			return true /*getInitialObjectName() != null*/;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			if (visible) {
				initialObjectField.clearSelection();
				fileField.setFocus();
			}
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public String getInitialObjectName() {
			String label = initialObjectField.getText();

			for (String name : getInitialObjectNames()) {
				if (getLabel(name).equals(label)) {
					return name;
				}
			}
			return null;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public String getEncoding() {
			return encodingField.getText();
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public URI getFileURI() {
			try {
				return URI.createFileURI(fileField.getText());
			}
			catch (Exception exception) {
				// Ignore
			}
			return null;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public void selectFileField() {
				initialObjectField.clearSelection();
				encodingField.clearSelection();
				fileField.selectAll();
				fileField.setFocus();
		}		

		/**
		 * Returns the label for the specified type name.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
		@Override
	public void addPages() {
		initialObjectCreationPage = new «grammarShortName»ModelWizardInitialObjectCreationPage("Whatever2");
		initialObjectCreationPage.setTitle("«grammarShortName» Model");
		initialObjectCreationPage.setDescription("Specify a file name and select a model object to create");
		addPage(initialObjectCreationPage);
	}

	/**
	 * Get the URI from the page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getModelURI() {
		String defaultWorkingDirectory = WorkspaceManager.getInstance().getWorkspaceRoot();
		URI rootURI = URI.createFileURI(defaultWorkingDirectory);
		URI relativePath = initialObjectCreationPage.getFileURI();
		String path = rootURI.toFileString();
		String string = path + "\\" + relativePath.toFileString();
		URI absoluteFileURI = URI.createFileURI(string);
		return absoluteFileURI;
	}
}
	'''

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}