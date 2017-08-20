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
package org.dslforge.workspace.internal;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.dslforge.workspace.config.IPersistencyService;
import org.dslforge.workspace.jpa.database.Folder;
import org.dslforge.workspace.jpa.database.Project;
import org.dslforge.workspace.jpa.database.Resource;
import org.dslforge.workspace.jpa.database.User;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.rap.rwt.RWT;

/**
 *	Basic implementation of org.dslforge.workspace.jpa.IPersistencyService based on EclipseLink JPA
 */
@SuppressWarnings("serial")
public class DefaultPersistencyService implements IPersistencyService{
	
	static final Logger logger = Logger.getLogger(DefaultPersistencyService.class);

	private EntityManagerFactory entityManagerFactory;

	private static DefaultPersistencyService INSTANCE;
	
	private static IPath rootPath;
	
	public static synchronized IPersistencyService getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new DefaultPersistencyService();
		}
		return INSTANCE;
	}
	
	@Override
	public boolean isRunning() {
		return (getEmf()!=null);
	}
	
	@Override
	public void createProject(final String projectName, final String description, final String path,
			final String userName, final String visibility) {
		SafeRunnable.run(new SafeRunnable() {
			public void run() {
				Project project = new Project();
				project.setId(UUID.randomUUID().toString());
				project.setName(projectName);
				project.setDescription(description);
				project.setPath(path);
				project.setUser(getUser(userName));
				project.setVisibility(visibility);
				EntityManager em = getEmf().createEntityManager();
				em.getTransaction().begin();
				em.persist(project);
				em.getTransaction().commit();
				em.close();
				dumpDatabase();
			}
		});
	}
	
	@Override
	public void createFolder(IPath path) {
		createFolder(computeRelativePath(path), computeProjectName(path));
	}
	
	@Override
	public void createResource(IPath path) {
		createResource(computeProjectName(path), computeRelativePath(path));
	}
	
	@Override
	public void deleteProject(IPath path) {
		String projectName = computeProjectName(path);
		Project project = getProject(projectName);
		if (project == null) {
			logger.error("Unexpected Error: Could not find Project " + projectName);
		}
		try {
			// delete files in the project
			List<Resource> allResourcesInProject = getAllResources(projectName);
			for (Resource r : allResourcesInProject) {
				final IPath filePath = rootPath.append(new Path(r.getPath()));
				final File file = filePath.toFile();
				if (file.exists()) {
					deleteResource(projectName, r.getPath());
					String userId = (String) RWT.getUISession().getAttribute("user");
					logger.info(userId + " deleted file " + file.getAbsolutePath());
				} else {
					logger.error("Forbidden Operation : Project " + projectName
							+ " contains locked files, make sure files are unlocked before deleting.");
				}
			}
			// delete folders in the project
			List<Folder> folders = getAllFolders(projectName);
			for (Folder folder : folders) {
				final IPath filePath = rootPath.append(new Path(folder.getPath()));
				final File file = filePath.toFile();
				if (file.exists()) {
					deleteFolder(filePath);
				}
			}
			// delete the project
			deleteProject(projectName);
		} catch (PersistenceException ex) {
			// project contains resources, should make sure to delete all
			// the resources inside the project.
			logger.error("Unexpected Error: Project " + projectName
					+ " could not be deleted, check your user access privileges.");
		}
	}

	@Override
	public void deleteFolder(IPath path) {
		deleteFolder(computeProjectName(path), computeRelativePath(path));
	}
	
	@Override
	public void deleteResource(IPath path) {
		deleteResource(computeProjectName(path), computeRelativePath(path));
	}

	public List<String> getAllProjectNames() {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery("select p.name from Project p");
		@SuppressWarnings("unchecked")
		List<String> projects = q.getResultList();
		em.close();
		return projects;
	}

	private EntityManagerFactory getEmf() {
		if (entityManagerFactory == null) {
			entityManagerFactory = WorkspaceActivator.getEntityManagerFactory();
		}
		return entityManagerFactory;
	}

	private DefaultPersistencyService() {
		rootPath = WorkspaceActivator.getDefault().getWorkspace().getWorkspaceRootPath();
		logger.info("Starting Database Service...");
	}

	private void createFolder(final String folderPath, final String folderName) {
		SafeRunnable.run(new SafeRunnable() {
			public void run() {
				EntityManager em = getEmf().createEntityManager();
				Folder folder = new Folder();
				folder.setId(UUID.randomUUID().toString());
				folder.setName(folderName);
				folder.setPath(folderPath);
				em.getTransaction().begin();
				em.persist(folder);
				em.getTransaction().commit();
				em.close();
				dumpDatabase();
			}
		});
	}

	private void createResource(final String projectName, final String path) {
		SafeRunnable.run(new SafeRunnable() {
			public void run() {
				Resource resource = new Resource();
				resource.setGuid(UUID.randomUUID().toString());
				resource.setPath(path);
				resource.setStatus(IPersistencyService.UNLOCKED);
				EntityManager em = getEmf().createEntityManager();
				em.getTransaction().begin();
				Project project = null;
				Query q = em.createQuery("select p from Project p");
				@SuppressWarnings("unchecked")
				List<Project> projects = q.getResultList();
				int i = 0;
				while (i < projects.size()) {
					Project p = projects.get(i);
					if (p.getName().equals(projectName)) {
						project = p;
						break;
					}
					i++;
				}
				if (project == null)
					throw new RuntimeException("Could not find project " + projectName);
				resource.setProject(project);
				project.getResources().add(resource);
				em.persist(resource);
				em.getTransaction().commit();
				em.close();
				dumpDatabase();
			}
		});
	}

	private User getUser(String userName) {
		EntityManager em = getEmf().createEntityManager();
		User user = em.find(User.class, userName);
		em.close();
		return user;
	}
	
	private Project getProject(String projectName) {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery("select p from Project p");
		@SuppressWarnings("unchecked")
		List<Project> projects = q.getResultList();
		int i = 0;
		while (i < projects.size()) {
			Project p = projects.get(i);
			if (p.getName().equals(projectName)) {
				return p;
			}
			i++;
		}
		em.close();
		return null;
	}

	private List<User> getAllUsers() {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery("select u from User u");
		@SuppressWarnings("unchecked")
		List<User> usersList = q.getResultList();
		em.close();
		return usersList;
	}

	private List<Project> getAllProjects() {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery("select p from Project p");
		@SuppressWarnings("unchecked")
		List<Project> projects = q.getResultList();
		em.close();
		return projects;
	}

	private List<Folder> getAllFolders() {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery("select f from Folder f");
		@SuppressWarnings("unchecked")
		List<Folder> folders = q.getResultList();
		em.close();
		return folders;
	}
	
	private List<Folder> getAllFolders(String projectName) {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery("select r from Folder r where r.path like '" + projectName + "%'");
		@SuppressWarnings("unchecked")
		List<Folder> resources = q.getResultList();
		em.close();
		return resources;
	}

	private List<Resource> getAllResources() {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery("select r from Resource r");
		@SuppressWarnings("unchecked")
		List<Resource> resources = q.getResultList();
		em.close();
		return resources;
	}
	
	private List<Resource> getAllResources(String projectName) {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery("select r from Resource r where r.project in (select p from Project p where p.name = '"
				+ projectName + "')");
		@SuppressWarnings("unchecked")
		List<Resource> resources = q.getResultList();
		em.close();
		return resources;
	}

	private void deleteProject(String projectName) {
		SafeRunnable.run(new SafeRunnable() {
			public void run() {
				EntityManager em = getEmf().createEntityManager();
				em.getTransaction().begin();
				Query q = em.createQuery("delete from Project p where p.name ='" + projectName + "'");
				q.executeUpdate();
				em.getTransaction().commit();
				em.close();
				dumpDatabase();
			}
		});
	}

	private void deleteFolder(String projectName, String path) {
		SafeRunnable.run(new SafeRunnable() {
			public void run() {
				EntityManager em = getEmf().createEntityManager();
				em.getTransaction().begin();
				Query q = em.createQuery("delete from Folder p where p.path ='" + path + "'");
				q.executeUpdate();
				em.getTransaction().commit();
				em.close();
				dumpDatabase();
			}
		});
	}

	private void deleteResource(String projectName, String path) {
		SafeRunnable.run(new SafeRunnable() {
			public void run() {
				EntityManager em = getEmf().createEntityManager();
				em.getTransaction().begin();
				Resource resource = null;
				Query q = em.createQuery("select r from Resource r where r.path='" + path + "'");
				@SuppressWarnings("unchecked")
				List<Resource> resources = q.getResultList();
				for (Resource r : resources) {
					Project project = r.getProject();
					if (project.getName().equals(projectName)) {
						resource = r;
						break;
					}
				}
				// verify resource is not null
				if (resource != null) {
					Project project = null;
					q = em.createQuery("select p from Project p");
					@SuppressWarnings("unchecked")
					List<Project> projects = q.getResultList();
					int i = 0;
					while (i < projects.size()) {
						Project p = projects.get(i);
						if (p.getName().equals(projectName)) {
							project = p;
							break;
						}
						i++;
					}
					// verify project is not null
					if (project == null) {
						return;
					}
					// update project
					project.getResources().remove(resource);
					em.persist(project);
					q = em.createQuery("delete from Resource r where r.path ='" + path + "'");
					q.executeUpdate();
				}
				em.getTransaction().commit();
				em.close();
			}
		});
	}

	private void dumpDatabase() {
		//deactivated.
	}
	
	@SuppressWarnings("unused")
	private void dumpUsers() {
		List<User> users = getAllUsers();
		for (User user : users) {
			logger.info(user);
		}
	}

	@SuppressWarnings("unused")
	private void dumpProjects() {
		List<Project> projectsList = getAllProjects();
		for (Project project : projectsList) {
			logger.info(project);
		}
	}

	@SuppressWarnings("unused")
	private void dumpFolders() {
		List<Folder> folderList = getAllFolders();
		for (Folder folder : folderList) {
			logger.info(folder);
		}
	}

	@SuppressWarnings("unused")
	private void dumpResources() {
		List<Resource> resources = getAllResources();
		for (Resource resource : resources) {
			if (resource != null) {
				logger.info(resource);
			}
		}
	}
	
	private String computeProjectName(IPath path) {
		IPath relativePath = path.makeRelativeTo(rootPath);
		String[] segments = relativePath.segments();
		if (segments.length == 0) {
			throw new RuntimeException("Problem when computing relative path for " + path);
		}
		return relativePath.segment(0);
	}
	
	private String computeRelativePath(IPath path) {
		IPath relativePath = path.makeRelativeTo(rootPath);
		String[] segments = relativePath.segments();
		if (segments.length == 0) {
			throw new RuntimeException("Problem when computing relative path for " + path);
		}
		return relativePath.toString();
	}
}