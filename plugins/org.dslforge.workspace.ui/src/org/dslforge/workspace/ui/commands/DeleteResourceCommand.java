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
package org.dslforge.workspace.ui.commands;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.apache.log4j.Logger;
import org.dslforge.workspace.WorkspaceManager;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.rap.rwt.RWT;

public class DeleteResourceCommand extends AbstractWorkspaceCommand {

	static final Logger logger = Logger.getLogger(DeleteResourceCommand.class);
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		File file = unwrap(event, File.class);
		IRunnableWithProgress operation = new IRunnableWithProgress() {
			public void run(IProgressMonitor progressMonitor) {
				try {
					Path filePath = new Path(file.getAbsolutePath());
					if (WorkspaceManager.INSTANCE.isProject(filePath)) {
						WorkspaceManager.INSTANCE.deleteProject(filePath);
					} else if (!file.isFile()) {
						WorkspaceManager.INSTANCE.deleteFolder(filePath);
					} else {
						WorkspaceManager.INSTANCE.deleteResource(filePath);
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
		logger.info(currentUser + " deleted resource: " + file.getAbsolutePath());
		return null;
	}
}