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
package org.dslforge.workspace;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.dslforge.workspace.internal.DefaultPersistencyService;
import org.dslforge.workspace.internal.WorkspaceActivator;
import org.dslforge.workspace.jpa.IPersistencyService;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.swt.widgets.Display;

public class WorkspaceManager {

	static final Logger logger = Logger.getLogger(WorkspaceManager.class);
	
	public static WorkspaceManager INSTANCE = new WorkspaceManager();
	
	private static final IPath rootPath = WorkspaceActivator.getDefault().getWorkspace().getRootPath();
	
	private WorkspaceManager() {
		IPersistencyService dbservice = DefaultPersistencyService.getInstance();
		if (dbservice.isRunning()) {
			logger.info("Database service notified with root path [" + rootPath + "]");
		}
	}

	public String getWorkspaceRootStringPath() {
		return rootPath.toString();
	}

	public IPath getWorkspaceRootPath() {
		return rootPath;
	}
	
	public File getWorkspaceRootFolder() {
		return rootPath.toFile();
	}

	public File createProject(final String projectName, final String description, final String visibility) {
		IPath workspaceRoot = getWorkspaceRootPath();
		IPath projectPath = workspaceRoot.addTrailingSeparator().append(projectName);
		final File file = projectPath.toFile();
		if (!file.exists()) {
			Display.getCurrent().syncExec(new Runnable() {
				@Override
				public void run() {
					file.mkdir();
				}
			});
			String userId = (String) RWT.getUISession().getAttribute("user");
			IPersistencyService dbservice = DefaultPersistencyService.getInstance();
			if (dbservice.isRunning()) {
				dbservice.createProject(projectName, description, projectPath.toString(), userId, visibility);
				logger.info("Project created : " + file.getAbsolutePath());
			}
		}
		return file;
	}

	public File createFolder(final IPath path) {
		final File file = path.toFile();
		if (!file.exists()) {
			Display.getCurrent().syncExec(new Runnable() {
				@Override
				public void run() {
					file.mkdir();
				}
			});
			IPersistencyService dbservice = DefaultPersistencyService.getInstance();
			if (dbservice.isRunning()) {
				dbservice.createFolder(path);
			}
			logger.info("Folder created : " + file.getAbsolutePath());
		}
		return file;
	}

	public File createResource(final IPath path) {
		final File file = path.toFile();
		if (!file.exists()) {
			Display.getCurrent().syncExec(new Runnable() {
				@Override
				public void run() {
					try {
						file.createNewFile();
					} catch (IOException ex) {
						logger.error(ex.getMessage(), ex);
					}
				}
			});
			IPersistencyService dbservice = DefaultPersistencyService.getInstance();
			if (dbservice.isRunning()) {
				dbservice.createResource(path);
			}
			logger.info("Resource created : " + file.getAbsolutePath());
		}
		return file;
	}

	public boolean isProject(final IPath path) {
		File file = path.toFile();
		String parent = file.getParent();
		return (file.isDirectory() && parent!=null && new Path(parent).equals(new Path(getWorkspaceRootStringPath())));
	}

	public boolean deleteProject(final IPath path) {
		if (isProject(path)) {
			Display.getCurrent().syncExec(new Runnable() {
				@Override
				public void run() {
					try {
						delete(path);
					} catch (IOException e) {
						logger.error(e.getMessage(),e);
					} finally {
						IPersistencyService dbservice = DefaultPersistencyService.getInstance();
						if (dbservice.isRunning()) {
							dbservice.deleteProject(path);
						}
						logger.info("Project deleted : " + path);
					}
				}
			});
			return true;
		}
		return false;
	}
	
	public boolean deleteFolder(final IPath path) {
		final File file = path.toFile();
		if (file.exists()) {
			Display.getCurrent().syncExec(new Runnable() {
				@Override
				public void run() {
					file.delete();
				}
			});
			IPersistencyService dbservice = DefaultPersistencyService.getInstance();
			if (dbservice.isRunning()) {
				dbservice.deleteFolder(path);
			}
			logger.info("Folder deleted : " + file.getAbsolutePath());
			return true;
		}
		return false;
	}
	
	public boolean deleteResource(final IPath path) {
		final File file = path.toFile();
		if (file.exists()) {
			Display.getCurrent().syncExec(new Runnable() {
				@Override
				public void run() {
					file.delete();
				}
			});
			IPersistencyService dbservice = DefaultPersistencyService.getInstance();
			if (dbservice.isRunning()) {
				dbservice.deleteResource(path);
			}
			logger.info("Resource deleted : " + file.getAbsolutePath());
			return true;
		}
		MessageDialog.openInformation(null, "Forbidden Operation",
				"File " + file.getPath() + " is currently locked. Please unlock file before deleting it.");
		return false;
	}

	private void delete(final IPath path) throws IOException {
		final File file = path.toFile();
		if (file.isDirectory()) {
			if (file.list().length == 0) {
				file.delete();
				logger.info("Directory deleted : " + file.getAbsolutePath());
			} else {
				String files[] = file.list();
				for (String temp : files) {
					File fileDelete = new File(file, temp);
					delete(new Path(fileDelete.getAbsolutePath()));
				}
				if (file.list().length == 0) {
					file.delete();
					logger.info("Directory deleted : " + file.getAbsolutePath());
				}
			}
		} else {
			file.delete();
			logger.info("File deleted : " + file.getAbsolutePath());
		}
	}
}