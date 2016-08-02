///**
// * <copyright>
// *
// * Copyright (c) 2015 PlugBee. All rights reserved.
// * 
// * This program and the accompanying materials are made available 
// * under the terms of the Eclipse Public License v1.0 which 
// * accompanies this distribution, and is available at
// * http://www.eclipse.org/legal/epl-v10.html
// *
// * Contributors:
// *     Amine Lajmi - Initial API and implementation
// *
// * </copyright>
// */
//package org.dslforge.workspace.jpa;
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.PersistenceException;
//
//import org.apache.log4j.Logger;
//import org.dslforge.workspace.jpa.database.Folder;
//import org.dslforge.workspace.jpa.database.Project;
//import org.dslforge.workspace.jpa.database.Resource;
//import org.dslforge.workspace.jpa.database.User;
//import org.dslforge.workspace.jpa.internal.InternalDBService;
//import org.eclipse.core.runtime.IPath;
//import org.eclipse.core.runtime.Path;
//import org.eclipse.jface.dialogs.MessageDialog;
//import org.eclipse.rap.rwt.RWT;
//
//public class PersistencyService implements IPersistencyService {
//
//	static final Logger logger = Logger.getLogger(PersistencyService.class);
//	
//	public static PersistencyService INSTANCE = new PersistencyService();
//	private String rootPath;
//	
//	private PersistencyService() {
//		inializeFromPersistencyUnit();
//		File file = new File(getRootPath());
//		if (!file.exists()) {
//			file.mkdirs();
//		}
//	}
//
//	private void inializeFromPersistencyUnit() {
//		EntityManagerFactory emf = InternalDBService.getInstance().getEmf();
//		Map<String, Object> properties = emf.getProperties();
//		String dburl = (String) properties.get(IPersistencyConstants.JAVAX_PERSISTENCE_JDBC_URL);
//		String[] split = dburl.split(";");
//		String dbPath = split[0].substring(IPersistencyConstants.JDBC_PREFIX.length(), split[0].length());
//		String[] workspacePath = dbPath.split(IPersistencyConstants.METADATA_FOLDER);
//		if (workspacePath==null)
//			throw new RuntimeException("The database connection url in persistence.xml is not correctly specified.");
//		setRootPath(workspacePath[0]);
//	}
//
//	@Override
//	public String getRootPath() {
//		return rootPath;
//	}
//
//	public File getWorkspaceFoler() {
//		return new File(rootPath);
//	}
//
//	public void setRootPath(String workspaceRoot) {
//		this.rootPath = workspaceRoot;
//	}
//
//	private String computeResourceName(IPath path) {
//		IPath rootPath = new Path(getRootPath());
//		IPath relativePath = path.makeRelativeTo(rootPath);
//		String[] segments = relativePath.segments();
//		if (segments.length == 0) {
//			throw new RuntimeException("Problem when computing relative path for " + path);
//		}
//		if (segments.length == 1) {
//			return segments[0];
//		}
//		// more than one segment
//		String segment = relativePath.segment(segments.length - 1);
//		return segment;
//	}
//
//	private String computeRelativePath(IPath path) {
//		IPath rootPath = new Path(getRootPath());
//		IPath relativePath = path.makeRelativeTo(rootPath);
//		String[] segments = relativePath.segments();
//		if (segments.length == 0) {
//			throw new RuntimeException("Problem when computing relative path for " + path);
//		}
//		return relativePath.toString();
//	}
//
//	private String computeProjectName(IPath path) {
//		IPath rootPath = new Path(getRootPath());
//		IPath relativePath = path.makeRelativeTo(rootPath);
//		String[] segments = relativePath.segments();
//		if (segments.length == 0) {
//			throw new RuntimeException("Problem when computing relative path for " + path);
//		}
//		String projectName = relativePath.segment(0);
//		return projectName;
//	}
//
//	public void createProject(String projectName, String description, String visibility) {
//		String userId = (String) RWT.getUISession().getAttribute("user");
//		String workspaceRoot = getRootPath();
//		String projectPath = workspaceRoot + projectName;
//		final File file = new File(projectPath);
//		if (!file.exists()) {
//			createProject(projectName, description, projectName, userId, visibility);
//		}
//		logger.info(userId + " created project " + file.getAbsolutePath().toString());
//	}
//
//	private void createProject(String projectName, String description, String path, String userName, String visibility) {
//		InternalDBService.getInstance().createProject(projectName, description, path, userName, visibility);
//	}
//
//	public boolean isProject(File file) {
//		return (file.isDirectory() && file.getParent() != null && file.getParent().equals(getRootPath()));
//	}
//
//	public void deleteProject(final File file) {
//		if (file.exists()) {
//			deleteProject(file.getName());
//		}
//	}
//
//	public Project getProject(String projectName) {
//		return InternalDBService.getInstance().getProject(projectName);
//	}
//
//	public List<Project> getAllProjects() {
//		return InternalDBService.getInstance().getAllProjects();
//	}
//
//	public List<String> getAllProjectNames() {
//		List<String> projectNames = new ArrayList<String>();
//		List<Project> allProjects = getAllProjects();
//		for (Project project : allProjects) {
//			projectNames.add(project.getName());
//		}
//		return projectNames;
//	}
//
//	public List<Project> getAllProjectsForUser(String userName) {
//		return InternalDBService.getInstance().getAllProjectsForUser(userName);
//	}
//
//	private boolean deleteProject(String projectName) {
//		Project project = InternalDBService.getInstance().getProject(projectName);
//		if (project == null) {
//			MessageDialog.openInformation(null, "Unexpected Error", "Could not find Project " + projectName);
//			return false;
//		}
//		try {
//			List<Resource> allResourcesInProject = InternalDBService.getInstance().getAllResourcesInProject(projectName);
//			for (Resource r : allResourcesInProject) {
//				final String filePath = getRootPath() + r.getPath().replace("/", "\\");
//				final File file = new File(filePath);
//				if (file.exists()) {
//					if (!isLocked(file)) {
//						deleteResource(projectName, r.getPath());
//					} else {
//						MessageDialog.openInformation(null, "Forbidden Operation", "Project " + projectName
//								+ " contains locked files, make sure files are unlocked before deleting.");
//						return false;
//					}
//				}
//			}
//
//			// delete folders in the project
//			List<Folder> folders = InternalDBService.getInstance().getAllFoldersInProject(projectName);
//			for (Folder folder : folders) {
//				final String filePath = getRootPath() + folder.getPath().replace("/", "\\");
//				final File file = new File(filePath);
//				if (file.exists()) {
//					if (!isLocked(file)) {
//						deleteFolder(folder.getPath());
//					}
//				}
//			}
//			// delete the project
//			InternalDBService.getInstance().deleteProject(projectName);
//
//		} catch (PersistenceException ex) {
//			// TODO: project contains resources, should make sure to delete all
//			// the resources inside the project.
//			MessageDialog.openInformation(null, "Unexpected Error",
//					"Project " + projectName + " could not be deleted, check your user access privileges.");
//			return false;
//		}
//		return true;
//	}
//
//	public void createFolder(IPath uri) {
//		String folderName = computeResourceName(uri);
//		String path = computeRelativePath(uri);
//		final File file = uri.toFile();
//		if (!file.exists()) {
//			InternalDBService.getInstance().createFolder(path, folderName);
//		}
//	}
//
//	private Folder getFolder(String folderPath) {
//		String path = computeRelativePath(new Path(folderPath));
//		return InternalDBService.getInstance().getFolder(path);
//	}
//
//	public List<Folder> getAllFolders() {
//		return InternalDBService.getInstance().getAllFolders();
//	}
//
//	public boolean deleteFolder(final File file) {
//		Folder folder = getFolder(file.getAbsolutePath());
//		if (folder == null) {
//			MessageDialog.openInformation(null, "Unexpected Error",
//					"Could not find Folder " + file.getAbsolutePath());
//			return false;
//		}
//		if (file.exists()) {
//			deleteFolder(file.getAbsolutePath());
//			return true;
//		}
//		return false;
//	}
//
//	public void deleteAllFolders() {
//		InternalDBService.getInstance().deleteAllFolders();
//	}
//
//	private void deleteFolder(String folderPath) {
//		String projectName = computeProjectName(new Path(folderPath));
//		String path = computeRelativePath(new Path(folderPath));
//		InternalDBService.getInstance().deleteFolder(projectName, path);
//	}
//
//	public void createUser(String userName, String firstName, String lastName, String organization, String email,
//			String pwd) {
//		InternalDBService.getInstance().createUser(userName, firstName, lastName, organization, email, pwd);
//	}
//
//	public void deleteUser(String userName) {
//		User user = getUser(userName);
//		if (user != null) {
//			InternalDBService.getInstance().deleteUser(userName);
//		}
//	}
//
//	public void deleteAllUsers() {
//		InternalDBService.getInstance().deleteAllUsers();
//	}
//
//	public User getUserById(String userId) {
//		return InternalDBService.getInstance().getUserById(userId);
//	}
//
//	private User getUser(String userName) {
//		return InternalDBService.getInstance().getUser(userName);
//	}
//
//	public List<User> getAllUsers() {
//		return InternalDBService.getInstance().getAllUsers();
//	}
//
//	public User authenticateUser(String login, String password) {
//		return InternalDBService.getInstance().authenticateUser(login, password);
//	}
//
//	public User changePwd(String userName, String pwd) {
//		return InternalDBService.getInstance().changePwd(userName, pwd);
//	}
//
//	public void createResource(IPath path) {
//		final File file = path.toFile();
//		if (!file.exists()) {
//			String relativePath = computeRelativePath(path);
//			String projectName = computeProjectName(path);
//			createResource(projectName, relativePath);
//		}
//	}
//
//	private void createResource(String projectName, String path) {
//		InternalDBService.getInstance().createResource(projectName, path);
//	}
//
//	public boolean deleteResource(final File file) {
//		if (file.exists()) {
//			if (!isLocked(file)) {
//				IPath path = new Path(file.getPath());
//				String relativePath = computeRelativePath(path);
//				String projectName = computeProjectName(path);
//				if (relativePath == null) {
//					throw new RuntimeException("Could not compute relative path of file " + file.getPath());
//				}
//				deleteResource(projectName, relativePath);
//				return true;
//			} else {
//				MessageDialog.openInformation(null, "Forbidden Operation",
//						"File " + file.getPath() + " is currently locked. Please unlock file before deleting it.");
//			}
//		}
//		return false;
//	}
//
//	private void deleteResource(String projectName, String path) {
//		InternalDBService.getInstance().deleteResource(projectName, path);
//	}
//
//	public void deleteAllResources() {
//		InternalDBService.getInstance().deleteAllResources();
//	}
//	
//	public List<Resource> getAllResources() {
//		return InternalDBService.getInstance().getAllResources();
//	}
//
//	public List<Resource> getAllResourcesInProject(String projectName) {
//		return InternalDBService.getInstance().getAllResourcesInProject(projectName);
//	}
//
//	public boolean isLocked(IPath path) {
//		String relativePath = computeRelativePath(path);
//		String projectName = computeProjectName(path);
//		return isLocked(projectName, relativePath);
//	}
//
//	public boolean isLocked(File file) {
//		IPath path = new Path(file.getAbsolutePath());
//		return isLocked(path);
//	}
//
//	private boolean isLocked(String projectName, String path) {
//		return InternalDBService.getInstance().isLocked(projectName, path);
//	}
//
//	public void lockResource(IPath path) {
//		String userId = (String) RWT.getUISession().getAttribute("user");
//		String projectName = computeProjectName(path);
//		String relativePath = computeRelativePath(path);
//		lockResource(userId, projectName, relativePath);
//		logger.info(userId + " locked file " + path.toString());
//	}
//
//	public void lockResource(File file) {
//		String absolutePath = file.getAbsolutePath();
//		IPath uri = new Path(absolutePath);
//		lockResource(uri);
//	}
//
//	private void lockResource(String userName, String projectName, String path) {
//		InternalDBService.getInstance().lockResource(userName, projectName, path);
//	}
//
//	public void unlockResource(IPath path) {
//		String userId = (String) RWT.getUISession().getAttribute("user");
//		String projectName = computeProjectName(path);
//		String relativePath = computeRelativePath(path);
//		unlockResource(userId, projectName, relativePath);
//		logger.info(userId + " unlocked file " + path);
//	}
//
//	public void unlockResource(File file) {
//		String absolutePath = file.getAbsolutePath();
//		IPath path = new Path(absolutePath);
//		unlockResource(path);
//	}
//
//	private void unlockResource(String userId, String projectName, String path) {
//		InternalDBService.getInstance().unlockResource(userId, projectName, path);
//	}
//
//	public void unlockAll(String userId) {
//		InternalDBService.getInstance().unlockAll(userId);
//	}
//
//	public User getLocker(IPath absoluteURI) {
//		String projectName = computeProjectName(absoluteURI);
//		String path = computeRelativePath(absoluteURI);
//		return getLocker(projectName, path);
//	}
//
//	public String getLocker(File file) {
//		IPath path = new Path(file.getAbsolutePath());
//		return getLockerId(path);
//	}
//
//	public String getLockerId(IPath path) {
//		User user = getLocker(path);
//		if (user == null) {
//			return null;
//		}
//		return user.getId();
//	}
//
//	private User getLocker(String projectName, String path) {
//		return InternalDBService.getInstance().getLocker(projectName, path);
//	}
//
//	public void dumpResources() {
//		InternalDBService.getInstance().dumpResources();
//	}
//}
