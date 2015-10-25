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
package org.dslforge.workspace;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceException;

import org.dslforge.database.pu.tables.Folder;
import org.dslforge.database.pu.tables.Project;
import org.dslforge.database.pu.tables.Resource;
import org.dslforge.database.pu.tables.User;
import org.dslforge.workspace.internal.DatabaseService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.swt.widgets.Display;

public class WorkspaceManager {

	public static final String PATH_SEPARATOR = "\\";
	
	private String workspaceRoot = null;
    
	public static final String LOCKED = "locked";
	public static final String UNLOCKED = "unlocked";
	
	public static final WorkspaceManager INSTANCE = new WorkspaceManager();

	private WorkspaceManager() {
		setWorkspaceRoot(IWorkspaceConstants.DEFAULT_WORKING_DIRECTORY);
	}

	public String getWorkspaceRoot() {
		return workspaceRoot;
	}

	public void clean() {
		DatabaseService.getInstance().clean();
	}

	public void stop() {
		DatabaseService.getInstance().stop();
	}

	public File getRootFoler() {
		return new File(workspaceRoot);
	}

	public void setWorkspaceRoot(String workspaceRoot) {
		this.workspaceRoot = workspaceRoot;
	}
	
	public void dumpDatabase() {
		DatabaseService.getInstance().dumpDatabase();
	}

	private String computeResourceName(URI absoluteURI) {
		URI rootURI = URI.createFileURI(getWorkspaceRoot() + PATH_SEPARATOR);
		URI relativeURI = absoluteURI.deresolve(rootURI);
		
		String[] segments = relativeURI.segments();
		if (segments.length==0) {
			throw new RuntimeException("Problem when computing relative path for " + absoluteURI);
		}
		if (segments.length==1) {
			return segments[0];
		}
		else {
			//more than one segment
			String segment = relativeURI.segment(segments.length-1);
			return segment;
		}
	}

	private String computeRelativePath(URI absoluteURI) {
		URI rootURI = URI.createFileURI(getWorkspaceRoot() + PATH_SEPARATOR);
		URI relativeURI = absoluteURI.deresolve(rootURI);
		String[] segments = relativeURI.segments();
		if (segments.length==0) {
			throw new RuntimeException("Problem when computing relative path for " + absoluteURI);
		}
		return relativeURI.toString();
	}
	
	private String computeProjectName(URI absoluteURI) {
		URI rootURI = URI.createFileURI(getWorkspaceRoot() + PATH_SEPARATOR);
		URI relativeURI = absoluteURI.deresolve(rootURI);
		String[] segments = relativeURI.segments();
		if (segments.length==0) {
			throw new RuntimeException("Problem when computing relative path for " + absoluteURI);
		}
		String projectName = relativeURI.segment(0);
		return projectName;
	}
	
	public void createProject(String projectName, String description, String visibility) {
		String userId = (String) RWT.getUISession().getAttribute("user");
		String workspaceRoot = getWorkspaceRoot();
		String projectPath = workspaceRoot + PATH_SEPARATOR + projectName;
		final File file = new File(projectPath);
		if (!file.exists()) {
			createProject(projectName, description, PATH_SEPARATOR + projectName, userId, visibility);
			Display.getCurrent().syncExec(new Runnable() {	
				@Override
				public void run() {
					file.mkdir();
				}
			});
		}
		System.out.println("[dslforge] " + userId + " created project " + file.getAbsolutePath().toString());
	}
	
	private void createProject(String projectName, String description, String path, String userName, String visibility) {
		DatabaseService.getInstance().createProject(projectName, description, path, userName, visibility);
	}
	
	public boolean isProject(File file) {
		return (file.isDirectory() && file.getParent()!=null && file.getParent().equals(getWorkspaceRoot()));
	}
	
	public void deleteProject(final File file) {
		if (file.exists()) {
//			if(file.list().length==0){
//				//project is empty
//				boolean x = file.delete();
//				System.out.println("[DSLFORGE] - Project " + x  + " deleted.");
//			} else {
				boolean isDeleted = deleteProject(file.getName());
				if (isDeleted) {
					Display.getCurrent().syncExec(new Runnable() {
						@Override
						public void run() {
							try {
								delete(file);
							} catch (IOException e) {
								e.printStackTrace();
								System.out.println("[DSLFORGE] - Project " + file.getName()  + " cold not be deleted.");
							}
							System.out.println("[DSLFORGE] - Project " + file.getName()  + " deleted.");
						}
					});
				}
			}
//		}
	}
	
	public void delete(File file) throws IOException {
		if (file.isDirectory()) {
			// directory is empty, then delete it
			if (file.list().length == 0) {
				file.delete();
				System.out.println("Directory is deleted : "+ file.getAbsolutePath());
			} else {

				// list all the directory contents
				String files[] = file.list();
				for (String temp : files) {
					// construct the file structure
					File fileDelete = new File(file, temp);
					// recursive delete
					delete(fileDelete);
				}

				// check the directory again, if empty then delete it
				if (file.list().length == 0) {
					file.delete();
					System.out.println("Directory is deleted : "+ file.getAbsolutePath());
				}
			}

		} else {
			// if file, then delete it
			file.delete();
			System.out.println("File is deleted : " + file.getAbsolutePath());
		}
	}		
	
	public void deleteAllProjects() {
		DatabaseService.getInstance().deleteAllProjects();
	}

	public Project getProject(String projectName) {
		return DatabaseService.getInstance().getProject(projectName);
	}

	public List<Project> getAllProjects() {
		return DatabaseService.getInstance().getAllProjects();
	}

	public List<String> getAllProjectNames() {
		List<String> projectNames = new ArrayList<String>();
		List<Project> allProjects = getAllProjects();
		for (Project project: allProjects) {
			projectNames.add(project.getName());
		}
		return projectNames;
	}
	
	public List<Project> getAllProjectsForUser(String userName) {
		return DatabaseService.getInstance().getAllProjectsForUser(userName);
	}

	private boolean deleteProject(String projectName) {
		Project project = DatabaseService.getInstance().getProject(projectName);
		if (project==null) {
			MessageDialog.openInformation(null
					, "Unexpected Error"
					, "Could not find Project " + projectName);	
			return false;
		}
		User owner = project.getUser();
		if (owner==null) {
			MessageDialog.openInformation(null
					, "Unexpected Error"
					, "Could not find owner of Project " + projectName);	
			return false;
		}
		String currentUser = (String) RWT.getUISession().getAttribute("user");
		if (!owner.getId().equals(currentUser) && !currentUser.equals("admin")) {
			MessageDialog.openInformation(null
					, "Forbidden Operation"
					, "Project " + projectName + " is owned by " + owner.getId() + ", you can delete only projects that you own. ");	
			return false;
		}
		if (projectName.equals("www")) {
			MessageDialog.openInformation(null
					, "Forbidden Operation"
					, "Project " + projectName + " contains public samples, it cannot be deleted ;)");	
			return false;
		}
		try{
			
			//delete files in the porject
			List<Resource> allResourcesInProject = DatabaseService.getInstance().getAllResourcesInProject(projectName);
			for (Resource r: allResourcesInProject) {
				final String filePath = getWorkspaceRoot() + PATH_SEPARATOR + r.getPath().replace("/", "\\");
				final File file = new File(filePath);
				if (file.exists()) {
					if (!isLocked(file)) {
						WorkspaceManager.INSTANCE.deleteResource(projectName, r.getPath());
//						Display.getCurrent().syncExec(new Runnable() {
//							@Override
//							public void run() {
//								boolean isDeleted = file.delete();
//								System.out.println("[DSLFORGE] - Resource " + filePath + " deleted");
//							}
//						});

						String userId = (String) RWT.getUISession().getAttribute("user");
						System.out.println("[dslforge] " + userId + " deleted file " + file.getPath());
					} else {
						MessageDialog.openInformation(null
								, "Forbidden Operation"
								, "Project " + projectName + " contains locked files, make sure files are unlocked before deleting.");	
						return false;
					}
				}
			}
			
			//delete folders in the project
			List<Folder> folders = DatabaseService.getInstance().getAllFoldersInProject(projectName);
			for (Folder folder: folders) {
				final String filePath = getWorkspaceRoot() + PATH_SEPARATOR + folder.getPath().replace("/", "\\");
				final File file = new File(filePath);
				if (file.exists()) {
					if (!isLocked(file)) {
						WorkspaceManager.INSTANCE.deleteFolder(folder.getPath());
//						Display.getCurrent().syncExec(new Runnable() {
//							@Override
//							public void run() {
//								boolean isDeleted = file.delete();
//								System.out.println("[DSLFORGE] - folder " + filePath + " deleted");
//							}
//						});
					}
				}
			}
			
			//now delete the project
			DatabaseService.getInstance().deleteProject(projectName);
			
		} catch(PersistenceException ex) {
			// TODO:  project contains resources, should make sure to delete all the resources inside the project.
			MessageDialog.openInformation(null
					, "Unexpected Error"
					, "Project " + projectName + " could not be deleted, check your user access privileges.");	
			return false;
		}
		return true;
	}

	private void dumpProjects() {
		DatabaseService.getInstance().dumpProjects();
	}

	public void createFolder(File file) {
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
		}
	}

	private void createFolder(String containerPath, String folderName) {
		String folderPath = containerPath + PATH_SEPARATOR + folderName + PATH_SEPARATOR;
		final File file = new File(folderPath);
		if (!file.exists()) {
			createFolder(folderPath, folderName);
			Display.getCurrent().syncExec(new Runnable() {	
				@Override
				public void run() {
					file.mkdir();
				}
			});
		}
	}
	
	public Folder getFolder(URI folderURI) {
		return null;
	}
	
	private Folder getFolder(String folderPath) {
		String path = computeRelativePath(URI.createFileURI(folderPath));
		return DatabaseService.getInstance().getFolder(path);
	}

	public List<Folder> getAllFolders() {
		return DatabaseService.getInstance().getAllFolders();
	}

	public boolean deleteFolder(final File file) {
		Folder folder = getFolder(file.getAbsolutePath());
		if (folder==null) {
			MessageDialog.openInformation(null
					, "Unexpected Error"
					, "Oops, could not find Folder " + file.getAbsolutePath());	
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

	public void deleteFolder(URI uri) {
		System.out.println("deleting...");
	}

	public void deleteAllFolders() {
		DatabaseService.getInstance().deleteAllFolders();
	}

	private void deleteFolder(String folderPath) {
		String projectName = computeProjectName(URI.createFileURI(folderPath));
		String path = computeRelativePath(URI.createFileURI(folderPath));
		DatabaseService.getInstance().deleteFolder(projectName, path);
	}

	private void dumpFolders() {
		DatabaseService.getInstance().dumpFolders();
	}

	public void createUser(String userName, String firstName, String lastName, String organization, String email, String pwd) {
		DatabaseService.getInstance().createUser(userName, firstName, lastName, organization, email, pwd);
	}
	
	public void deleteUser(String userName) {
		User user = getUser(userName);
		if (user!=null) {
			DatabaseService.getInstance().deleteUser(userName);
		}
	}

//	private void deleteUser(String firstName, String lastName) {
//		DatabaseService.getInstance().deleteUser(firstName, lastName);
//	}
	
	public void deleteAllUsers() {
		DatabaseService.getInstance().deleteAllUsers();
	}
	
	public User getUserById(String userId) {
		return DatabaseService.getInstance().getUserById(userId);
	}

	private User getUser(String userName) {
		return DatabaseService.getInstance().getUser(userName);
	}
	
	private User getUser(String firstName, String lastName) {
		return DatabaseService.getInstance().getUser(firstName, lastName);
	}

	public List<User> getAllUsers() {
		return DatabaseService.getInstance().getAllUsers();
	}

	public User authenticateUser(String login, String password) {
		return DatabaseService.getInstance().authenticateUser(login, password);
	}
	
	public User changePwd(String userName, String pwd) { 
		return DatabaseService.getInstance().changePwd(userName, pwd);
	}

	public User updateUserAccount(String userName,String firstName, String lastName, String organization, String email, String pwd){
		return DatabaseService.getInstance().updateUserAccount(userName, firstName, lastName, organization, email, pwd);
	}
	
	private void dumpUsers() {
		DatabaseService.getInstance().dumpUsers();
	}

	public void createResource(URI absoluteURI) {
		final File file = new File(absoluteURI.devicePath());
		if (!file.exists()) {
			String path = computeRelativePath(absoluteURI);
			String projectName = computeProjectName(absoluteURI);
			createResource(projectName, path);
			String userId = (String) RWT.getUISession().getAttribute("user");
			System.out.println("[dslforge] " + userId + " created file " + file.getPath());
			Display.getCurrent().syncExec(new Runnable() {
				@Override
				public void run() {
					try {
						file.createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			});
		}
	}

	public void createResource(File file) {
		
	}
	
	private void createResource(String projectName, String path) {
		DatabaseService.getInstance().createResource(projectName, path);
	}
	
	public boolean deleteResource(URI fileURI) {
		return true;
	}

	public boolean deleteResource(final File file) {
		if (file.exists()) {
			if (!isLocked(file)) {
				URI fileURI = URI.createFileURI(file.getPath());
				String relativePath = computeRelativePath(fileURI);
				String projectName = computeProjectName(fileURI);
				if (relativePath == null) {
					throw new RuntimeException("Could not compute relative path of file " + file.getPath());
				}
				deleteResource(projectName, relativePath);
				Display.getCurrent().syncExec(new Runnable() {
					@Override
					public void run() {
						file.delete();
					}
				});
				String userId = (String) RWT.getUISession().getAttribute("user");
				System.out.println("[dslforge] " + userId + " deleted file " + file.getPath());
				return true;
			} else {
				MessageDialog.openInformation(null, "Forbidden Operation", "File "
										+ file.getPath()
										+ " is currently locked. Please unlock file before deleting it.");
			}
		}
		return false;
	}

	private void deleteResource(String projectName, String path) {
		DatabaseService.getInstance().deleteResource(projectName, path);
	}

	public void deleteAllResources() {
		DatabaseService.getInstance().deleteAllResources();
	}
	
	private Resource getResource(String projectName, String path) {
		return DatabaseService.getInstance().getResource(projectName, path);
	}
	
	public List<Resource> getAllResources() {
		return DatabaseService.getInstance().getAllResources();
	}

	public List<Resource> getAllResourcesInProject(String projectName) {
		return DatabaseService.getInstance().getAllResourcesInProject(projectName);
	}

	public boolean isLocked(URI absoluteURI) {
		String path = computeRelativePath(absoluteURI);
		String projectName = computeProjectName(absoluteURI);
		return isLocked(projectName, path);
	}

	public boolean isLocked(File file) {
		String absolutePath = file.getAbsolutePath();	
		URI uri = URI.createFileURI(absolutePath);
		return isLocked(uri);
	}

	private boolean isLocked(String projectName, String path) {
		return DatabaseService.getInstance().isLocked(projectName, path);
	}

	public void lockResource(URI absoluteURI) {
		String userId = (String) RWT.getUISession().getAttribute("user");
		String projectName = computeProjectName(absoluteURI);
		String path = computeRelativePath(absoluteURI);
		lockResource(userId, projectName, path);
		System.out.println("[DSLFORGE] - " + userId + " locked file " + absoluteURI.toString());
	}

	public void lockResource(File file) {
		String absolutePath = file.getAbsolutePath();	
		URI uri = URI.createFileURI(absolutePath);
		lockResource(uri);
	}

	private void lockResource(String userName, String projectName,  String path) {
		DatabaseService.getInstance().lockResource(userName, projectName, path);
	}

	public void unlockResource(URI absoluteURI) {
		String userId = (String) RWT.getUISession().getAttribute("user");
		String projectName = computeProjectName(absoluteURI);
		String path = computeRelativePath(absoluteURI);
		unlockResource(userId, projectName, path);
		System.out.println("[DSLFORGE] - " + userId + " unlocked file " + absoluteURI.path());
	}

	public void unlockResource(File file) {
		String absolutePath = file.getAbsolutePath();	
		URI uri = URI.createFileURI(absolutePath);
		unlockResource(uri);
	}

	private void unlockResource(String userId, String projectName, String path) {
		DatabaseService.getInstance().unlockResource(userId, projectName, path);
	}

	public void unlockAll(String userId) {
		DatabaseService.getInstance().unlockAll(userId);
	}

	public User getLocker(URI absoluteURI) {
		String projectName = computeProjectName(absoluteURI);
		String path = computeRelativePath(absoluteURI);
		return getLocker(projectName, path);
	}

	public String getLocker(File file) {
		String absolutePath = file.getAbsolutePath();	
		URI uri = URI.createFileURI(absolutePath);
		return getLockerId(uri);
	}

	public String getLockerId(URI uri) {
		User user = getLocker(uri);
		//User not found!
		if (user==null) {
			return null;
		}
		return user.getId();
	}

	public String getLockerId(File file) {
		return null;
	}
	
	private User getLocker(String projectName, String path) {
		return DatabaseService.getInstance().getLocker(projectName, path);
	}

	public void saveResource() {
		//TODO
	}

	public void dumpResources() {
		DatabaseService.getInstance().dumpResources();
	}
}
