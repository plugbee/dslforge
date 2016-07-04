/**
 * <copyright>
 *
 * Copyright (c) 2016 PlugBee. All rights reserved.
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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;

import org.apache.log4j.Logger;
import org.dslforge.database.pu.tables.Folder;
import org.dslforge.database.pu.tables.Project;
import org.dslforge.database.pu.tables.Resource;
import org.dslforge.database.pu.tables.User;
import org.dslforge.workspace.internal.DatabaseService;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.swt.widgets.Display;

/**
 * A singleton which wraps a couple of (file system, database) allowing basic
 * interaction with workspaces, such as creating projects, folders, resources,
 * users, etc.
 *
 */
public class WorkspaceManager {

	static final Logger logger = Logger.getLogger(WorkspaceManager.class);
	
	public static WorkspaceManager INSTANCE = new WorkspaceManager();
	private String workspaceRoot;
	
	private WorkspaceManager() {
		setupWorkspace();
	}
	
	private void setupWorkspace() {
		EntityManagerFactory emf = DatabaseService.getInstance().getEmf();
		Map<String, Object> properties = emf.getProperties();
		String dburl = (String) properties.get(IWorkspaceConstants.JAVAX_PERSISTENCE_JDBC_URL);
		String[] split = dburl.split(";");
		String dbPath = split[0].substring(IWorkspaceConstants.JDBC_PREFIX.length(), split[0].length());
		String[] workspacePath = dbPath.split(IWorkspaceConstants.METADATA_FOLDER);
		if (workspacePath==null)
			throw new RuntimeException("The database connection url in persistence.xml is not correctly specified.");
		setWorkspaceRoot(workspacePath[0]);
		File file = new File(getWorkspaceRoot());
		if (!file.exists()) {
			file.mkdirs();
		}
	}

	public String getWorkspaceRoot() {
		return workspaceRoot;
	}

	public File getRootFoler() {
		return new File(workspaceRoot);
	}

	public void setWorkspaceRoot(String workspaceRoot) {
		this.workspaceRoot = workspaceRoot;
	}

	public void createProject(String projectName, String description, String visibility) {
		String userId = (String) RWT.getUISession().getAttribute("user");
		String workspaceRoot = getWorkspaceRoot();
		IPath projectPath = new Path(workspaceRoot).addTrailingSeparator().append(projectName);
		final File file = projectPath.toFile();
		if (!file.exists()) {
			DatabaseService.getInstance().createProject(projectName, description, projectName, userId, visibility);
			Display.getCurrent().syncExec(new Runnable() {
				@Override
				public void run() {
					file.mkdir();
				}
			});
			logger.info(userId + " created project " + file.getAbsolutePath().toString());
		}
	}

	public void createFolder(URI uri) {
		String folderName = computeResourceName(uri);
		String path = computeRelativePath(uri);
		final File file = new File(uri.toFileString());
		if (!file.exists()) {
			DatabaseService.getInstance().createFolder(path, folderName);
			Display.getCurrent().syncExec(new Runnable() {
				@Override
				public void run() {
					file.mkdir();
				}
			});
			String userId = (String) RWT.getUISession().getAttribute("user");
			logger.info(userId + " created folder " + file.getAbsolutePath().toString());
		}
	}

	public void createResource(URI uri) {
		final File file = new File(uri.toFileString());
		if (!file.exists()) {
			String path = computeRelativePath(uri);
			String projectName = computeProjectName(uri);
			DatabaseService.getInstance().createResource(projectName, path);
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
			String userId = (String) RWT.getUISession().getAttribute("user");
			logger.info(userId + " created file " + file.getAbsolutePath().toString());
		}
	}

	public void deleteProject(final File file) {
		if (file.exists()) {
			boolean isDeleted = deleteProject(file.getName());
			if (isDeleted) {
				Display.getCurrent().syncExec(new Runnable() {
					@Override
					public void run() {
						try {
							deleteRecursive(file);
						} catch (IOException ex) {
							logger.info("Project " + file.getName() + " could not be deleted.");
							logger.error(ex.getMessage(), ex);
						}
						logger.info("Project " + file.getName() + " deleted.");
					}
				});
			}
		}
	}

	public boolean deleteFolder(final File file) {
		String path = computeRelativePath(URI.createFileURI(file.getAbsolutePath()));
		Folder folder = DatabaseService.getInstance().getFolder(path);
		if (folder == null) {
			MessageDialog.openInformation(null, "Unexpected Error",
					"Could not find Folder " + file.getAbsolutePath());
			return false;
		}
		if (file.exists()) {
			deleteFolder(file.getAbsolutePath());
			Display.getCurrent().syncExec(new Runnable() {
				@Override
				public void run() {
					file.delete();
				}
			});
			return true;
		}
		return false;
	}

	public boolean deleteResource(final File file) {
		if (file.exists()) {
			if (!isLocked(file)) {
				URI uri = URI.createFileURI(file.getAbsolutePath());
				String relativePath = computeRelativePath(uri);
				String projectName = computeProjectName(uri);
				if (relativePath == null) {
					throw new RuntimeException("Could not compute relative path of file " + file.getAbsolutePath());
				}
				DatabaseService.getInstance().deleteResource(projectName, relativePath);
				Display.getCurrent().syncExec(new Runnable() {
					@Override
					public void run() {
						file.delete();
					}
				});
				String userId = (String) RWT.getUISession().getAttribute("user");
				logger.info(userId + " deleted file " + file.getAbsolutePath());
				return true;
			} else {
				MessageDialog.openInformation(null, "Forbidden Operation",
						"File " + file.getAbsolutePath() + " is currently locked. Please unlock file before deleting it.");
			}
		}
		return false;
	}

	public void deleteUser(String userName) {
		User user = DatabaseService.getInstance().getUser(userName);
		if (user != null) {
			DatabaseService.getInstance().deleteUser(userName);
		}
	}

	public User getUserById(String userId) {
		return DatabaseService.getInstance().getUserById(userId);
	}

	public Project getProject(String projectName) {
		return DatabaseService.getInstance().getProject(projectName);
	}

	public Folder getFolder(URI folderURI) {
		return DatabaseService.getInstance().getFolder(folderURI.toFileString());
	}

	public Resource getResource(String projectName, String path) {
		return DatabaseService.getInstance().getResource(projectName, path);
	}
	
	public List<User> getAllUsers() {
		return DatabaseService.getInstance().getAllUsers();
	}

	public List<Project> getAllProjects() {
		return DatabaseService.getInstance().getAllProjects();
	}

	public List<String> getAllProjectNames() {
		List<String> projectNames = new ArrayList<String>();
		List<Project> allProjects = getAllProjects();
		for (Project project : allProjects) {
			projectNames.add(project.getName());
		}
		return projectNames;
	}

	public List<Project> getAllProjectsForUser(String userName) {
		return DatabaseService.getInstance().getAllProjectsForUser(userName);
	}

	public List<Folder> getAllFolders() {
		return DatabaseService.getInstance().getAllFolders();
	}

	public List<Resource> getAllResources() {
		return DatabaseService.getInstance().getAllResources();
	}

	public List<Resource> getAllResourcesInProject(String projectName) {
		return DatabaseService.getInstance().getAllResourcesInProject(projectName);
	}

	public boolean isProject(File file) {
		String parent = file.getParent();
		boolean result  = new Path(parent).equals(new Path(getWorkspaceRoot()));
		return (file.isDirectory() && parent != null && result);
	}

	public boolean isLocked(File file) {
		String absolutePath = file.getAbsolutePath();
		URI uri = URI.createFileURI(absolutePath);
		return isLocked(uri);
	}

	public boolean isLocked(URI uri) {
		String path = computeRelativePath(uri);
		String projectName = computeProjectName(uri);
		return DatabaseService.getInstance().isLocked(projectName, path);
	}

	public void lockResource(URI uri) {
		String userId = (String) RWT.getUISession().getAttribute("user");
		String projectName = computeProjectName(uri);
		String path = computeRelativePath(uri);
		DatabaseService.getInstance().lockResource(userId, projectName, path);
		logger.info(userId + " locked file " + uri.toFileString());
	}

	public void lockResource(File file) {
		String absolutePath = file.getAbsolutePath();
		URI uri = URI.createFileURI(absolutePath);
		lockResource(uri);
	}

	public void unlockResource(URI uri) {
		String userId = (String) RWT.getUISession().getAttribute("user");
		String projectName = computeProjectName(uri);
		String path = computeRelativePath(uri);
		DatabaseService.getInstance().unlockResource(userId, projectName, path);
		logger.info(userId + " unlocked file " + uri.toFileString());
	}

	public void unlockResource(File file) {
		String absolutePath = file.getAbsolutePath();
		URI uri = URI.createFileURI(absolutePath);
		unlockResource(uri);
	}

	public void unlockAll(String userId) {
		DatabaseService.getInstance().unlockAll(userId);
	}

	public User getLocker(URI uri) {
		String projectName = computeProjectName(uri);
		String path = computeRelativePath(uri);
		return DatabaseService.getInstance().getLocker(projectName, path);
	}

	public String getLocker(File file) {
		String absolutePath = file.getAbsolutePath();
		URI uri = URI.createFileURI(absolutePath);
		return getLockerId(uri);
	}

	public String getLockerId(URI uri) {
		User user = getLocker(uri);
		if (user != null) {
			return user.getId();
		}
		return null;
	}

	private String computeResourceName(URI uri) {
		URI rootURI = URI.createFileURI(getWorkspaceRoot());
		URI relativeURI = uri.deresolve(rootURI);
		String[] segments = relativeURI.segments();
		if (segments.length == 0) {
			throw new RuntimeException("Problem when computing relative path for " + uri);
		}
		if (segments.length == 1) {
			return segments[0];
		}
		// more than one segment
		String segment = relativeURI.segment(segments.length - 1);
		return segment;
	}

	private String computeRelativePath(URI uri) {
		IPath absolutePath = new Path(uri.toFileString());
		IPath relativePath = absolutePath.makeRelativeTo(new Path(getWorkspaceRoot()));
		String[] segments = relativePath.segments();
		if (segments.length == 0) {
			throw new RuntimeException("Problem when computing relative path for " + uri);
		}
		return relativePath.toString();
	}

	private String computeProjectName(URI uri) {
		IPath absolutePath = new Path(uri.toFileString());
		IPath relativePath = absolutePath.makeRelativeTo(new Path(getWorkspaceRoot()));
		String[] segments = relativePath.segments();
		if (segments.length == 0) {
			throw new RuntimeException("Problem when computing relative path for " + uri);
		}
		return relativePath.segment(0);
	}

	private void deleteRecursive(File file) throws IOException {
		if (file.isDirectory()) {
			// directory is empty, then delete it
			if (file.list().length == 0) {
				file.delete();
				logger.info("Directory is deleted : " + file.getAbsolutePath());
			} else {
	
				// list all the directory contents
				String files[] = file.list();
				for (String temp : files) {
					// construct the file structure
					File fileDelete = new File(file, temp);
					// recursive delete
					deleteRecursive(fileDelete);
				}
				// check the directory again, if empty then delete it
				if (file.list().length == 0) {
					file.delete();
					logger.info("Directory is deleted : " + file.getAbsolutePath());
				}
			}
		} else {
			// if file, then delete it
			file.delete();
			logger.info("File is deleted : " + file.getAbsolutePath());
		}
	}

	private boolean deleteProject(String projectName) {
		Project project = DatabaseService.getInstance().getProject(projectName);
		if (project == null) {
			MessageDialog.openInformation(null, "Unexpected Error", "Could not find Project " + projectName);
			return false;
		}
		try {
			// delete files in the project
			List<Resource> allResourcesInProject = DatabaseService.getInstance().getAllResourcesInProject(projectName);
			for (Resource r : allResourcesInProject) {
				final String filePath = getWorkspaceRoot() + r.getPath();
				final File file = new File(filePath);
				if (file.exists()) {
					if (!isLocked(file)) {
						DatabaseService.getInstance().deleteResource(projectName, r.getPath());
						String userId = (String) RWT.getUISession().getAttribute("user");
						logger.info(userId + " deleted file " + file.getAbsolutePath());
					} else {
						MessageDialog.openInformation(null, "Forbidden Operation", "Project " + projectName
								+ " contains locked files, make sure files are unlocked before deleting.");
						return false;
					}
				}
			}
	
			// delete folders in the project
			List<Folder> folders = DatabaseService.getInstance().getAllFoldersInProject(projectName);
			for (Folder folder : folders) {
				final String filePath = getWorkspaceRoot() + folder.getPath();
				final File file = new File(filePath);
				if (file.exists()) {
					if (!isLocked(file)) {
						deleteFolder(folder.getPath());
					}
				}
			}
			// delete the project
			DatabaseService.getInstance().deleteProject(projectName);
	
		} catch (PersistenceException ex) {
			//project contains resources, should make sure to delete all
			// the resources inside the project.
			MessageDialog.openInformation(null, "Unexpected Error",
					"Project " + projectName + " could not be deleted, check your user access privileges.");
			return false;
		}
		return true;
	}

	private void deleteFolder(String folderPath) {
		String projectName = computeProjectName(URI.createFileURI(folderPath));
		String path = computeRelativePath(URI.createFileURI(folderPath));
		DatabaseService.getInstance().deleteFolder(projectName, path);
	}
}