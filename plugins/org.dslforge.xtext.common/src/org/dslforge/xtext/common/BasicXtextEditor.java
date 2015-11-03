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
package org.dslforge.xtext.common;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dslforge.xtext.common.BasicText.ISaveRequestListener;
import org.dslforge.xtext.common.registry.BasicWorkbenchRegistry;
import org.dslforge.xtext.common.scoping.BasicTextGlobalScopeProvider;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.rap.json.JsonObject;
import org.eclipse.rap.json.JsonValue;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Manager;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IConcreteSyntaxValidator;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class BasicXtextEditor extends EditorPart implements ISelectionProvider, ISaveRequestListener {

	protected String languageName;
	
	protected URI uri;

	protected BasicXtextDocument document;
	
	protected XtextResource resource = null;
	
	protected boolean isDirty = false;
	
	@Inject
	private IGlobalScopeProvider scopeProvider;
	
	@Inject
	protected Injector injector;
	
	private Iterable<IEObjectDescription> index;
	
	private ArrayList<String> indexRef;
	
	private XtextResourceSet resourceSet;	
	
	private BasicText textWidget;
	
	private ListenerList listeners = new ListenerList();
	
	private ISelection selection;
	
	private PropertySheetPage propertySheetPage;
	
	public BasicXtextEditor() {
		super();
	}

	@Override
	public void createPartControl(Composite parent) {
		Font font = parent.getFont();
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 1;
		parent.setLayout(gridLayout);
		createWidget(parent, font);
		setInput();
		setDirty(false);
		addListeners();
	}
	
	
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
	    setSite(site);
	    setInputWithNotify(input);
	    setPartName(input.getName());
	    getSite().setSelectionProvider(this);
	}

	/**
	 * This is how the framework determines which interfaces we implement.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class key) {
		if (key.equals(IPropertySheetPage.class)) {
			return getPropertySheetPage();
		}
		return super.getAdapter(key);
	}
	
	public IPropertySheetPage getPropertySheetPage() {
		propertySheetPage = new PropertySheetPage();
		propertySheetPage.setPropertySourceProvider(new IPropertySourceProvider() {

			@Override
			public IPropertySource getPropertySource(Object object) {
				if (object instanceof URIEditorInput)
					return new BasicEditorPropertySource((URIEditorInput) object);
				return null;
			}
		});
		return propertySheetPage;
	}
	
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.add(listener);
	}

	@Override
	public ISelection getSelection() {
		if (selection==null) {
			selection = new StructuredSelection(getEditorInput());
		}
		return selection;
	}

	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.remove(listener);
	}

	@Override
	public void setSelection(ISelection selection) {
		propertySheetPage.selectionChanged(this,selection);
		propertySheetPage.refresh();
		
		Object[] list = listeners.getListeners();  
		for (int i = 0; i < list.length; i++)
			((ISelectionChangedListener)list[i]).selectionChanged(new SelectionChangedEvent(this, selection));  
	}

	
	protected void createWidget(Composite parent, Font font) {
		textWidget = new BasicText(parent, SWT.FILL);
		GridData textLayoutData = new GridData();
		textLayoutData.horizontalAlignment = SWT.FILL;
		textLayoutData.verticalAlignment = SWT.FILL;
		textLayoutData.grabExcessHorizontalSpace = true;
		textLayoutData.grabExcessVerticalSpace = true;
		getWidget().setLayoutData(textLayoutData);
		getWidget().setFont(font);
	}

	protected void setInput() {
		Display display = getWidget().getDisplay();
		if (display!=null) {
			display.asyncExec(new Runnable() {
				@Override
				public void run() {
					if (resourceSet ==null) {
						resourceSet = (XtextResourceSet) getDefaultResourceSet();
						resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
					}
					resource = (XtextResource) resourceSet.getResource(uri, true);
					if (resource.getContents().isEmpty()) {
						setCommand(IWidgetConstants.COMMAND_LOAD);
						//setText(IWidgetConstants.EMPTY_TEXT);
						setScope(new ArrayList<String>());
						pushIndex();
					} else {
						setURI(resource.getURI());
						EObject root = resource.getContents().get(0);
						if (root!=null) {
							if (validateObject(root, resource)) {
								String content = resource.getSerializer().serialize(root);
								setCommand(IWidgetConstants.COMMAND_LOAD);
								setText(content);
								validateResource();
							} else {
								setCommand(IWidgetConstants.COMMAND_LOAD);
								setText(IWidgetConstants.EMPTY_TEXT);
								setStatus(IWidgetConstants.STATUS_INVALID);
								JsonObject jsIssue = new JsonObject().add("problem", IWidgetConstants.VALIDATION_PROBLEM_OCCURED_ON_THE_SERVER);
								setIssue(jsIssue);
							}
							setScope(new ArrayList<String>());
							pushIndex();
						}	
					}
				}
			});	
		}
	}
	
	public XtextResourceSet getDefaultResourceSet() {
		return BasicWorkbenchRegistry.INSTANCE.getDefaultResourceSet(uri.fileExtension());
	}
	
	protected void addListeners() {
		addVerificationKeyListener();
	}

	private void addVerificationKeyListener() {
		if (getWidget()!=null) {
			getWidget().addKeyListener(keyListener);
		}
	}
	
	protected BasicText getWidget() {
		return textWidget;
	}

	@Override
	protected void setInputWithNotify(IEditorInput input) {
		super.setInputWithNotify(input);
		if (input instanceof URIEditorInput) {
			uri = ((URIEditorInput)input).getURI();
		}
	}
	
	@Override
	protected void setInput(IEditorInput input) {
		super.setInput(input);
		if (input instanceof URIEditorInput) {
			uri = ((URIEditorInput)input).getURI();
		}
		
	}
	
	protected void pushIndex() {
		indexRef = new ArrayList<String>();
		index = Collections.emptyList();
		if (scopeProvider instanceof BasicTextGlobalScopeProvider) {
			EList<Resource> resources = resourceSet.getResources();
			for (Resource r : resources) {
				Manager manager = resource.getResourceServiceProvider().getResourceDescriptionManager();
				IResourceDescription resourceDescription = manager.getResourceDescription(r);
				index = Iterables.concat(index,	resourceDescription.getExportedObjects());
			}
			Iterator<IEObjectDescription> iterator = index.iterator();
			while (iterator.hasNext()) {
				IEObjectDescription current = iterator.next();
				indexRef.add(current.getName().toString());
			}
		}
		setScope(indexRef);
		indexRef.clear();
	}
	
	protected void setURI(URI uri) {
		getWidget().setUrl(uri.lastSegment());
	}
	
	protected void setCommand(String command) {
		getWidget().setCommand(command);
	}
	
	protected void setText(String text) {
		getWidget().setText(text);
	}
	
	protected void setStatus(String status) {
		getWidget().setStatus(status);
	}
	
	protected void setIssue(JsonObject issue) {
		getWidget().setIssue(issue);
	}
	
	protected void setScope(List<String> scope) {
		getWidget().setScope(scope);
	}

	protected boolean validateObject(EObject object, XtextResource hostingResource) {
		List<Diagnostic> diagnostics = diagnose(object, hostingResource);
		if (!diagnostics.isEmpty()) {
			return false;
		}
		return true;
	}
	
	protected List<Diagnostic> diagnose(EObject object, XtextResource hostingResource) {
		List<Diagnostic> diagnostics = new ArrayList<Diagnostic>();
		IConcreteSyntaxValidator concreteSyntaxValidator = hostingResource.getConcreteSyntaxValidator();
		concreteSyntaxValidator.validateRecursive(object, new IConcreteSyntaxValidator.DiagnosticListAcceptor(diagnostics), new HashMap<Object, Object>());
		return diagnostics;
	}
	
	@Override
	public void validateResource() {
		Display display = getWidget().getDisplay();
		if (display!=null) {
			display.asyncExec(new Runnable() {
				@Override
				public void run() {
					IResourceValidator resourceValidator = resource.getResourceServiceProvider().getResourceValidator();
					EcoreUtil.resolveAll(resource);
					try {
						List<Issue> issues = resourceValidator.validate(resource, CheckMode.FAST_ONLY, CancelIndicator.NullImpl);
						if (issues.isEmpty()) {
							setStatus(IWidgetConstants.STATUS_VALID);
							JsonObject jsIssue = new JsonObject().add("none", IWidgetConstants.EMPTY_TEXT);
							setIssue(jsIssue);
						} else {
							//JsonObject jsIssue = new JsonObject().add( type, value);
							JsonObject jsIssue = new JsonObject();
							for (Issue issue: issues) {
								if (!issue.isSyntaxError()) {
									Integer line = issue.getLineNumber();
									if (line ==null) {
										//FIXME: what's this ?
										System.err.println("PROBLEM OCCURED DURING VALIDATION");
									}
									int lineNumber = line.intValue();
									String message = issue.getMessage();
									Severity severity = issue.getSeverity();
									setStatus(IWidgetConstants.STATUS_INVALID);
									jsIssue.add(severity.name(), lineNumber + ":" + message);
								}
							}
							setIssue(jsIssue);
						}	
					}catch(Exception ex) {
						if (ex instanceof RuntimeException) {
							System.err.println(ex.getMessage());
						}
					}
				}
			});
		}
	}


	protected KeyAdapter keyListener = new KeyAdapter() {

		private static final long serialVersionUID = 1L;

		public void keyPressed(KeyEvent event) {
			//TODO: filter on character types (ignore CRTL, ALT, SHIFT 
			//http://www.mkyong.com/swt/swt-how-to-capture-keyboard-event/
//			if ((event.stateMask & RWT.ALT) != 0) string += "ALT - keyCode = " + e.keyCode;
//			if ((event.stateMask & SWT.CTRL) != 0) string += "CTRL - keyCode = " + e.keyCode;
//			if ((event.stateMask & SWT.SHIFT) != 0) string += "SHIFT - keyCode = " + e.keyCode;
			
			setDirty(true);
		}
	};
	
	@Override
	public boolean isDirty() {
		return isDirty;
	}
	
	public void setDirty(boolean newValue) {
		this.isDirty = newValue;
		firePropertyChange(IEditorPart.PROP_DIRTY);	
	}
	
	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		if (resource !=null) {
			String text = this.getWidget().getText();
			try {
				resource.reparse(text);
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				//save
				Map<Object, Object> options = new HashMap<Object, Object>();
				boolean hasSyntaxErrors = resource.getParseResult().hasSyntaxErrors();
				if (!hasSyntaxErrors) {
					if(!resource.getContents().isEmpty()) {
						resource.save(options);		
					}	
				} else{
					//FIXME: save as text.
					resource.setValidationDisabled(true);
					//resource.save(options);	
					resource.setValidationDisabled(false);
				}
				
				//call server-side validation
				validateResource();
				pushIndex();
				//update editor status
				Display display = getWidget().getDisplay();
				if (display!=null) {
					display.asyncExec(new Runnable() {
						@Override
						public void run() {
							setDirty(false);
						}
					});	
				}
				
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	@Override
	public void doSaveAs() {
	}
	
	@Override
	public void setFocus() {
	}
	
	@Override
	public void dispose() {
		//unlock resource
		//WorkspaceManager.getInstance().unlockResource(uri);

//		for (PropertySheetPage propertySheetPage : propertySheetPages) {
//			propertySheetPage.dispose();
//		}
		
		//dispose widget
		if (!getWidget().isDisposed()) {
			getWidget().removeKeyListener(keyListener);
			getWidget().removeSaveListener(this);
			getWidget().removeValidationListener(this);
			getWidget().dispose();
		}
		super.dispose();
	}
	
	public void setLanguageName(String name) {
		this.languageName = name;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void reparse(JsonValue value) {
		String text = getWidget().getText();
		try {
			resource.reparse(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void save(JsonValue value) {
		try {
			getWorkbenchWindow().run(false, false, new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor)
						throws InvocationTargetException, InterruptedException {
					doSave(monitor);
				}
			});
		} catch (InvocationTargetException e) {
			throw (RuntimeException) e.getTargetException();
		} catch (InterruptedException e) {
			// do nothing
		}
		Display display = getWidget().getDisplay();
		if (display != null) {
			display.asyncExec(new Runnable() {
				@Override
				public void run() {
					setDirty(false);
				}
			});
		}
	}

	private IWorkbenchWindow getWorkbenchWindow() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	}



//	@Override
//	public void workspaceChanged(Object event) {
//		IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
////		final CommonViewer commonViewer = getCommonViewer();
////		Control control = commonViewer.getControl();
////		if (!control.isDisposed()) {
////			Display display = control.getDisplay();
////			display.asyncExec(new Runnable() {
////				@Override
////				public void run() {
////					commonViewer.refresh();
////				}
////			});
////		}
//	}
}