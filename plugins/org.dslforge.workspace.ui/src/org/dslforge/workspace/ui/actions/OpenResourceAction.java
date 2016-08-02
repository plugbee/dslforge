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
package org.dslforge.workspace.ui.actions;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.dslforge.workspace.ui.util.EditorUtil;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

public class OpenResourceAction extends AbstractWorkspaceAction {

	static final Logger logger = Logger.getLogger(OpenResourceAction.class);

	@Override
	public void run(IAction action) {
		Iterator<?> iterator = ((StructuredSelection) getSelection()).iterator();
		Object object = iterator.next();
		if (object instanceof File) {
			final File file = (File) object;
			IRunnableWithProgress operation = new IRunnableWithProgress() {
				public void run(IProgressMonitor progressMonitor) {
					try {
						if (file.exists() && !file.isDirectory()) {
							String absolutePath = file.getAbsolutePath();
							IWorkbench workbench = PlatformUI.getWorkbench();
							if (EditorUtil.openEditor(workbench, new Path(absolutePath)) != null) {
								logger.info("Opened editor on file " + absolutePath);
							}
						}
					} catch (Exception ex) {
						logger.error(ex.getMessage(), ex);
					} finally {
						progressMonitor.done();
					}
				}
			};
			try {
				getWindow().run(false, false, operation);
			} catch (InvocationTargetException ex) {
				logger.error(ex.getMessage(), ex);
			} catch (InterruptedException ex) {
				logger.error(ex.getMessage(), ex);
			}
			final String currentUser = (String) RWT.getUISession().getAttribute("user");
			logger.info(currentUser + " opened resource: " + file.getAbsolutePath());
		}
	}
}