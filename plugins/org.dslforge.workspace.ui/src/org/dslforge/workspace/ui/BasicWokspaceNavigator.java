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
package org.dslforge.workspace.ui;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.dslforge.workspace.IWorkspaceListener;
import org.dslforge.workspace.WorkspaceEventWatcher;
import org.dslforge.workspace.WorkspaceManager;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.rap.rwt.service.ServerPushSession;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IPartService;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionGroup;
import org.eclipse.ui.internal.registry.EditorRegistry;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.navigator.CommonViewer;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;

@SuppressWarnings("restriction")
public class BasicWokspaceNavigator extends CommonNavigator implements IWorkspaceListener, IPartListener {

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
		serverPushSessionOn(workspaceRoot);
		IWorkbench workbench = PlatformUI.getWorkbench();
		IPartService partService = workbench.getActiveWorkbenchWindow().getPartService();
		partService.addPartListener(this);
		getCommonViewer().addSelectionChangedListener(selectionListener);
		getCommonViewer().addFilter(new BasicWorkspaceFilter());
	}

	private void serverPushSessionOn(String workspaceRoot) {
		directoryWatcher = new WorkspaceEventWatcher(Paths.get(workspaceRoot));
		try {
			directoryWatcher.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		directoryWatcher.addListener(this);
		pushSession = new ServerPushSession();
		pushSession.start();
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
		PropertySheetPage propertySheetPage = new PropertySheetPage() {
		};
		propertySheetPage.setPropertySourceProvider(new FilePropertySourceProvider());
		propertySheetPages.add(propertySheetPage);
		return propertySheetPage;
	}

	@Override
	protected void handleDoubleClick(DoubleClickEvent anEvent) {
		IAction openHandler = getViewSite().getActionBars()
				.getGlobalActionHandler("org.eclipse.ui.actionSet.openFiles");
		if (openHandler == null) {
			IStructuredSelection selection = (IStructuredSelection) anEvent.getSelection();
			Object element = selection.getFirstElement();
			if (element instanceof File) {
				File file = (File) element;
				if (file.exists()) {
					String absolutePath = file.getAbsolutePath();
					IWorkbench workbench = PlatformUI.getWorkbench();
					if (openEditor(workbench, new Path(absolutePath)) != null) {
						System.out.println("[BasicWorkspaceNavigator] - Opened editor");
					}
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
					commonViewer.refresh();
				}
			});
		}
	}

	@Override
	public void dispose() {
		serverPushSessionOff();
		IWorkbench workbench = PlatformUI.getWorkbench();
		IPartService partService = workbench.getActiveWorkbenchWindow().getPartService();
		partService.removePartListener(this);
		super.dispose();
	}

	private void serverPushSessionOff() {
		pushSession.stop();
		directoryWatcher.stop();
		directoryWatcher.removeListener(this);
	}

	public String getWorkspaceRoot() {
		String workspaceRoot = WorkspaceManager.INSTANCE.getWorkspaceRoot();
		return workspaceRoot;
	}

	@Override
	public void partActivated(IWorkbenchPart part) {
	}

	@Override
	public void partBroughtToTop(IWorkbenchPart part) {
	}

	@Override
	public void partClosed(IWorkbenchPart part) {
	}

	@Override
	public void partDeactivated(IWorkbenchPart part) {
	}

	@Override
	public void partOpened(IWorkbenchPart part) {
	}

	public IEditorPart openEditor(IWorkbench workbench, IPath path) {
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();

		IEditorDescriptor editorDescriptor = EditorRegistry.getInstance().getDefaultEditor(path.lastSegment());
		if (editorDescriptor == null) {
			MessageDialog.openError(workbenchWindow.getShell(), "Error",
					"There is no editor registered for the file " + path.lastSegment());
			return null;
		} else {
			try {
				URI fileURI = URI.createFileURI(path.toOSString());
				return page.openEditor(new URIEditorInput(fileURI), editorDescriptor.getId());
			} catch (PartInitException exception) {
				MessageDialog.openError(workbenchWindow.getShell(), "Open Editor", exception.getMessage());
				return null;
			}
		}
	}
}