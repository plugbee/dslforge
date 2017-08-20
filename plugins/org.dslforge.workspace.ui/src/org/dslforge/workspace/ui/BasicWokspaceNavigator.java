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
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.dslforge.workspace.IWorkspaceListener;
import org.dslforge.workspace.WorkspaceManager;
import org.dslforge.workspace.internal.WorkspaceActivator;
import org.dslforge.workspace.ui.util.EditorUtil;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.rap.rwt.service.ServerPushSession;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IPartService;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionGroup;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.navigator.CommonViewer;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;

/**
 * A basic implementation of the CNF based on java.io.File
 *
 */
public class BasicWokspaceNavigator extends CommonNavigator implements IWorkspaceListener, IPartListener {

	static final Logger logger = Logger.getLogger(BasicWokspaceNavigator.class);

	private static final IPath rootPath = WorkspaceActivator.getDefault().getWorkspace().getWorkspaceRootPath();

	private List<PropertySheetPage> propertySheetPages = new ArrayList<PropertySheetPage>();

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
		serverPushSessionOn(getWorkspaceRoot());
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
		IWorkbench workbench = PlatformUI.getWorkbench();
		IPartService partService = workbench.getActiveWorkbenchWindow().getPartService();
		partService.addPartListener(this);
		getCommonViewer().addSelectionChangedListener(selectionListener);
		getCommonViewer().addFilter(new BasicWorkspaceFilter());
		getCommonViewer().setContentProvider(new FileSystemContentProvider());
		getCommonViewer().setLabelProvider(new FileSystemLabelProvider());
		getCommonViewer().setInput(new File(workspaceRoot));
	}

	private void serverPushSessionOn(String workspaceRoot) {
		if (WorkspaceManager.INSTANCE.isRunning()) {
			WorkspaceManager.INSTANCE.addWorkspaceListener(this);
			pushSession = new ServerPushSession();
			pushSession.start();
			logger.info("Starting server push session...");
		}
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
		PropertySheetPage propertySheetPage = new PropertySheetPage();
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
				final File file = (File) element;
				if (file.exists() && !file.isDirectory()) {
					final Display display = PlatformUI.getWorkbench().getDisplay();
					display.asyncExec(new Runnable() {
						@Override
						public void run() {
							// Double click a file
							String absolutePath = file.getAbsolutePath();
							IWorkbench workbench = PlatformUI.getWorkbench();
							if (EditorUtil.openEditor(workbench, new Path(absolutePath)) != null) {
								logger.info("Double click on file " + absolutePath);
							}
							workspaceChanged(null);
						}
					});

				} else if (file.exists() && file.isDirectory()) {
					// Double click a folder
					Object eventSource = anEvent.getSource();
					if (eventSource instanceof TreeViewer) {
						TreeViewer treeViewer = (TreeViewer) eventSource;
						Widget widget = treeViewer.testFindItem(file);
						if (widget != null && widget instanceof TreeItem) {
							TreeItem item = (TreeItem) widget;
							boolean toExpand = !item.getExpanded();
							item.setExpanded(toExpand);
							if (toExpand) {
								treeViewer.expandToLevel(item, 0);
							} else {
								treeViewer.collapseToLevel(item, 0);
							}
							treeViewer.refresh(item.getData());
						}
					}
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
			display.syncExec(new Runnable() {
				@Override
				public void run() {
					if (!commonViewer.isBusy())
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
		if (pushSession!=null) {
			pushSession.stop();
			WorkspaceManager.INSTANCE.removeWorkspaceListener(this);
			logger.info("Stopping server push session.");
		}
	}

	public static String getWorkspaceRoot() {
		return rootPath.toString();
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
}