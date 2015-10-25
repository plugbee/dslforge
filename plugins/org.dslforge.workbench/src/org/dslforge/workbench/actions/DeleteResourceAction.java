/**
 * <copyright>
 *
 * Copyright (c) 2015 DSLFORGE. All rights reserved.
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
package org.dslforge.workbench.actions;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import org.dslforge.workspace.WorkspaceManager;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.rap.rwt.RWT;

public class DeleteResourceAction extends AbstractWorkbenchAction {

	@Override
	public void run(IAction action) {
		Iterator<?> iterator = ((StructuredSelection) getSelection()).iterator();
		// while (iterator.hasNext()) {
		Object object = iterator.next();
		if (object instanceof File) {
			final File file = (File) object;
			IRunnableWithProgress operation = new IRunnableWithProgress() {
				public void run(IProgressMonitor progressMonitor) {
					try {
						if (WorkspaceManager.INSTANCE.isProject(file)) {
							WorkspaceManager.INSTANCE.deleteProject(file);
						} else if (!file.isFile()) {
							WorkspaceManager.INSTANCE.deleteFolder(file);
						} else {
							WorkspaceManager.INSTANCE.deleteResource(file);
						}
					} catch (Exception exception) {
						exception.printStackTrace();
					} finally {
						progressMonitor.done();
					}
				}
			};
			try {
				getWindow().run(false, false, operation);
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			final String currentUser = (String) RWT.getUISession().getAttribute("user");
			System.out.println("[DSLFORGE] - " + currentUser + " deleted resource: " + file.getAbsolutePath());
		}
		// }
	}
}