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
package org.dslforge.workbench.navigator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.dslforge.workbench.navigator.util.NavigatorUtil;
import org.dslforge.workspace.IWorkspaceListener;
import org.dslforge.workspace.WorkspaceEventWatcher;
import org.dslforge.workspace.WorkspaceManager;
import org.dslforge.xtext.common.BasicXtextEditor;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.rap.rwt.service.ServerPushSession;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IPartService;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionGroup;
import org.eclipse.ui.internal.navigator.NavigatorSafeRunnable;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.navigator.CommonViewer;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheet;
import org.eclipse.ui.views.properties.PropertySheetPage;

public class BasicWokspaceNavigator extends CommonNavigator implements IWorkspaceListener, IPartListener{
	
	private List<PropertySheetPage> propertySheetPages = new ArrayList<PropertySheetPage>();
	
	private WorkspaceEventWatcher directoryWatcher;
	
	private ServerPushSession pushSession;
	
	private ISelectionChangedListener selectionListener = new ISelectionChangedListener() {
		@Override
		public void selectionChanged(SelectionChangedEvent event) {
			workspaceChanged(null);
		}
	};

	@Override
	public void init(IViewSite site) throws PartInitException {
		super.init(site);
		site.getPage().addPartListener(this);
	}
	
	@Override
	protected ActionGroup createCommonActionGroup() {
		 return new BasicWorkspaceNavigatorActionGroup(this, getCommonViewer(), getLinkHelperService());
	}
	
	@Override
	public void createPartControl(Composite aParent) {
		super.createPartControl(aParent);
		
		getCommonViewer().setSorter(new BasicWorkspaceSorter());
		getCommonViewer().setComparator(new BasicViewerComparator());
	    String workspaceRoot = getWorkspaceRoot();
		directoryWatcher = new WorkspaceEventWatcher(Paths.get(workspaceRoot));
	    try {
			directoryWatcher.start();
		} catch (IOException e) {
			e.printStackTrace();
		}			    
	    directoryWatcher.addListener(this);	   
		pushSession = new ServerPushSession();
		pushSession.start();
		
		IWorkbench workbench = PlatformUI.getWorkbench();
		IPartService partService = workbench.getActiveWorkbenchWindow().getPartService();
		partService.addPartListener(this);
		
		getCommonViewer().addSelectionChangedListener(selectionListener);
		getCommonViewer().addFilter(new BasicWorkspaceFilter());
	}

	@Override
	protected Object getInitialInput() {
		File file = new File(getWorkspaceRoot());
		return file;
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class adapter) {
		if (adapter.equals(IPropertySheetPage.class)) {
			return getPropertySheetPage();
		}
		return super.getAdapter(adapter);
	}
	
	public IPropertySheetPage getPropertySheetPage() {
		PropertySheetPage propertySheetPage = new PropertySheetPage() {};
		propertySheetPage.setPropertySourceProvider(new FilePropertySourceProvider());
		propertySheetPages.add(propertySheetPage);
		return propertySheetPage;
	}

	@Override
	protected void handleDoubleClick(DoubleClickEvent anEvent) {
		IAction openHandler = getViewSite().getActionBars().getGlobalActionHandler("org.eclipse.ui.actionSet.openFiles");
		if (openHandler == null) {
			IStructuredSelection selection = (IStructuredSelection) anEvent.getSelection();
			Object element = selection.getFirstElement();
			if (element instanceof File) {
				File f = (File) element;
				if (f.exists()) {
					String absolutePath = f.getAbsolutePath();
					URI uri = URI.createFileURI(absolutePath);
					if (!WorkspaceManager.INSTANCE.isLocked(uri)) {
						IWorkbench workbench = PlatformUI.getWorkbench();
						try {
							if (NavigatorUtil.openEditor(workbench, uri)!=null) {
								WorkspaceManager.INSTANCE.lockResource(uri);	
							}
						}catch(Exception ex) {
							ex.printStackTrace();
							WorkspaceManager.INSTANCE.unlockResource(uri);	
						}
					} else {
						final String currentUser = (String) RWT.getUISession().getAttribute("user");
						IWorkbench workbench = PlatformUI.getWorkbench();
						String lockerId = WorkspaceManager.INSTANCE.getLockerId(uri);
						if (lockerId==null || lockerId.equals(currentUser)) {
							if (NavigatorUtil.openEditor(workbench, uri)!=null) {
								WorkspaceManager.INSTANCE.lockResource(uri);	
							}
						} else{
							MessageDialog.openInformation(workbench.getActiveWorkbenchWindow().getShell()
									, "Forbidden Operation"
									, "File " + uri.lastSegment()  + " is currently locked by " + lockerId);	
						}
					}
					//refresh viewer
					workspaceChanged(null);
				}
			}
		}
	}

	@Override
	public void workspaceChanged(Object e) {
		final CommonViewer commonViewer = getCommonViewer();
		Control control = commonViewer.getControl();
		if (!control.isDisposed()) {
			Display display = control.getDisplay();
			display.asyncExec(new Runnable() {
				@Override
				public void run() {
					SafeRunner.run(new NavigatorSafeRunnable() {
						public void run() throws Exception {
							commonViewer.refresh();
						}
					});

				}
			});
		}
	}
	
	@Override
	public void dispose() {
		super.dispose();
		pushSession.stop();
		directoryWatcher.stop();
		directoryWatcher.removeListener(this);
		
		IWorkbench workbench = PlatformUI.getWorkbench();
		IPartService partService = workbench.getActiveWorkbenchWindow().getPartService();
		partService.removePartListener(this);
		
		getCommonViewer().removeSelectionChangedListener(selectionListener);
		
		for (PropertySheetPage propertySheetPage : propertySheetPages) {
			propertySheetPage.dispose();
		}
		
		final String currentUser = (String) RWT.getUISession().getAttribute("user");
		Job job = new Job("Cleanning Resources Job") {
			protected IStatus run(IProgressMonitor monitor) {
				try {
					WorkspaceManager.INSTANCE.unlockAll(currentUser);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				return Status.OK_STATUS;
			}
		};
		job.schedule();
	}

	public String getWorkspaceRoot() {
		String workspaceRoot = WorkspaceManager.INSTANCE.getWorkspaceRoot();
		return workspaceRoot;
	}
	
	
	
	@Override
	public void partActivated(IWorkbenchPart part) {
		if (part instanceof PropertySheet) {
//			if (propertySheetPages.contains(((PropertySheet)part).getCurrentPage())) {
//				System.out.println("Hello");
//			}
		}
		else if (part instanceof BasicWokspaceNavigator) {
			workspaceChanged(null);
		}
		else if (part instanceof BasicXtextEditor) {
//			final BasicXtextEditor editor = (BasicXtextEditor)part;
//			for (PropertySheetPage propertySheetPage : propertySheetPages) {
//				propertySheetPage.setPropertySourceProvider(new IPropertySourceProvider() {
//					
//					@Override
//					public IPropertySource getPropertySource(Object object) {
//						return new URIPropertySource(((URIEditorInput)editor.getEditorInput()));
//					}
//				});
//				
//				ISelectionProvider selectionProvider = propertySheetPage.getSite().getSelectionProvider();
//				
//				propertySheetPage.selectionChanged(this,new StructuredSelection(editor.getEditorInput()));
//				propertySheetPage.refresh();
//				propertySheetPage.setFocus();
//				BasicXtextEditor editor = (BasicXtextEditor)part;
//				IEditorInput editorInput = editor.getEditorInput();
//				//selectionProvider.setSelection(new StructuredSelection(editorInput));
//				//setSelectionProvider(editor);
//				//propertySheetPage.dispose();
//			}
		}
		else if (part instanceof IContentOutlinePage) {
			//TODO
		}
	}

	@Override
	public void partBroughtToTop(IWorkbenchPart part) {
	}

	@Override
	public void partClosed(IWorkbenchPart part) {
		if (part instanceof IEditorPart) {
			IEditorPart editor = (IEditorPart) part;
			IEditorInput editorInput = editor.getEditorInput();
			if (editorInput instanceof URIEditorInput) {
				URI uri = ((URIEditorInput)editorInput).getURI();
				if (WorkspaceManager.INSTANCE.isLocked(uri)) {
					workspaceChanged(null);
					WorkspaceManager.INSTANCE.unlockResource(uri);
				}
			}
		}
	}

	@Override
	public void partDeactivated(IWorkbenchPart part) {
		if (part instanceof BasicWokspaceNavigator) {
			
//			for (PropertySheetPage propertySheetPage : propertySheetPages) {
////				final ISelectionProvider selectionProvider = propertySheetPage.getSite().getSelectionProvider();
////				propertySheetPage.setPropertySourceProvider(new IPropertySourceProvider() {
////					
////					@Override
////					public IPropertySource getPropertySource(Object object) {
////						return new URIPropertySource(((URIEditorInput)editor.getEditorInput()));
////					}
////				});
////				
//				StructuredSelection structuredSelection = new StructuredSelection(getInitialInput());
//				propertySheetPage.selectionChanged(this,structuredSelection);
//				propertySheetPage.selectionChanged(this,structuredSelection);
//				propertySheetPage.refresh();
//			}
		}
		else if (part instanceof BasicXtextEditor) {
//			final BasicXtextEditor editor = (BasicXtextEditor)part;
//			final IEditorInput editorInput = editor.getEditorInput();
//			for (PropertySheetPage propertySheetPage : propertySheetPages) {
//				propertySheetPage.setPropertySourceProvider(new IPropertySourceProvider() {
//					
//					@Override
//					public IPropertySource getPropertySource(Object object) {
//						return new URIPropertySource(((URIEditorInput)editor.getEditorInput()));
//					}
//				});
//				
//				StructuredSelection structuredSelection = new StructuredSelection(editor.getEditorInput());
//				propertySheetPage.selectionChanged(this,structuredSelection);
//				propertySheetPage.selectionChanged(this,structuredSelection);
//				propertySheetPage.refresh();
//			}


			//selectionProvider.setSelection(new StructuredSelection(editorInput));
		}
	}

	@Override
	public void partOpened(IWorkbenchPart part) {
		if (part instanceof IEditorPart) {
			IEditorPart editor = (IEditorPart) part;
			IEditorInput editorInput = editor.getEditorInput();
			if (editorInput instanceof URIEditorInput) {
				URI uri = ((URIEditorInput)editorInput).getURI();
				if (!WorkspaceManager.INSTANCE.isLocked(uri)) {
					workspaceChanged(null);
					WorkspaceManager.INSTANCE.lockResource(uri);
				}
			}
		}
	}
	
	
}