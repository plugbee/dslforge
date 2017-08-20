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

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.dslforge.workspace.config.IPersistencyService;
import org.dslforge.workspace.jpa.database.Folder;
import org.dslforge.workspace.jpa.database.Project;
import org.dslforge.workspace.jpa.database.Resource;
import org.dslforge.workspace.jpa.database.User;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.util.SafeRunnable;

@SuppressWarnings({ "unchecked", "serial", "unused" })
public class ExtendedMetadataPersistencyService implements IPersistencyService{
	
	static final Logger logger = Logger.getLogger(ExtendedMetadataPersistencyService.class);

	private EntityManagerFactory entityManagerFactory;

	private static ExtendedMetadataPersistencyService INSTANCE;
	private static IPath rootPath;
	
	public static synchronized IPersistencyService getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ExtendedMetadataPersistencyService();
		}
		return INSTANCE;
	}

	private ExtendedMetadataPersistencyService() {
		rootPath = WorkspaceActivator.getDefault().getWorkspace().getWorkspaceRootPath();
		logger.info("Starting Database Service...");
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
		deleteProject(computeProjectName(path));
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

	private void createUser(final String userName, final String firstName, final String lastName,
			final String organization, final String email, final String pwd) {
		SafeRunnable.run(new SafeRunnable() {
			public void run() {
				User user = new User();
				user.setId(userName);
				user.setFirstName(firstName);
				user.setLastName(lastName);
				user.setOrganization(organization);
				user.setEmail(email);
				user.setPassword(pwd);
				EntityManager em = getEmf().createEntityManager();
				em.getTransaction().begin();
				em.persist(user);
				em.getTransaction().commit();
				em.close();
				dumpDatabase();
			}
		});
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

	private User getUser(String firstName, String lastName) {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery(
				"select u from User u where u.firstName = '" + firstName + "' and u.lastName = '" + lastName + "'");
		List<User> users = q.getResultList();
		if (users.size() > 1)
			throw new RuntimeException("Duplicate user with name: " + firstName + " " + lastName);
		em.close();
		return users.get(0);
	}

	private User getUserById(String userId) {
		EntityManager em = getEmf().createEntityManager();
		User user = em.find(User.class, userId);
		if (user == null)
			throw new RuntimeException("Could not find user with id: " + userId);
		em.close();
		return user;
	}

	private List<User> getAllUsers() {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery("select u from User u");
		List<User> usersList = q.getResultList();
		em.close();
		return usersList;
	}

	private Project getProject(String projectName) {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery("select p from Project p");
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

	private List<Project> getAllProjects() {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery("select p from Project p");
		List<Project> projects = q.getResultList();
		em.close();
		return projects;
	}

	private List<Project> getAllProjectsForUser(String userName) {
		List<Project> filtered = new ArrayList<Project>();
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery("select p from Project p");
		List<Project> projects = q.getResultList();
		for (Project p : projects) {
			String candidate = p.getUser().getId();
			if (candidate.equals(userName)) {
				filtered.add(p);
			}
		}
		em.close();
		return projects;
	}

	private Folder getFolder(String path) {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery("select f from Folder f where f.path='" + path + "'");
		List<Folder> folders = q.getResultList();
		if (folders.size() > 1) {
			throw new RuntimeException("Duplicate folder found with path " + path);
		}
		if (folders.isEmpty()) {
			return null;
		}
		em.close();
		return folders.get(0);
	}

	private List<Folder> getAllFolders() {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery("select f from Folder f");
		List<Folder> folders = q.getResultList();
		em.close();
		return folders;
	}

	private List<Folder> getAllFoldersInProject(String projectName) {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery("select r from Folder r where r.path like '" + projectName + "%'");
		List<Folder> resources = q.getResultList();
		em.close();
		return resources;
	}

	private Resource getResource(String projectName, String path) {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery("select r from Resource r where r.path='" + path + "'");
		List<Resource> resources = q.getResultList();
		for (Resource r : resources) {
			Project project = r.getProject();
			if (project.getName().equals(projectName)) {
				return r;
			}
		}
		em.close();
		return null;
	}

	private List<Resource> getAllResources() {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery("select r from Resource r");
		List<Resource> resources = q.getResultList();
		em.close();
		return resources;
	}

	private List<Resource> getAllResourcesInProject(String projectName) {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery("select r from Resource r where r.project in (select p from Project p where p.name = '"
				+ projectName + "')");
		List<Resource> resources = q.getResultList();
		em.close();
		return resources;
	}

	private void deleteUser(String userName) {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery("delete from User u where u.id ='" + userName + "'");
		em.getTransaction().begin();
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
		dumpDatabase();
	}

	private void deleteUser(String firstName, String lastName) {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery(
				"delete from User u where u.firstName ='" + firstName + "' and u.lastName='" + lastName + "'");
		em.getTransaction().begin();
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
		dumpDatabase();
	}

	private void deleteAllUsers() {
		EntityManager em = getEmf().createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("delete from User");
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
	}

	private void deleteProject(String projectName) {
		EntityManager em = getEmf().createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("delete from Project p where p.name ='" + projectName + "'");
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
		dumpDatabase();
	}

	private void deleteAllProjects() {
		EntityManager em = getEmf().createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("delete from Project");
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
	}

	private void deleteFolder(String projectName, String path) {
		EntityManager em = getEmf().createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("delete from Folder p where p.path ='" + path + "'");
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
		dumpDatabase();
	}

	private void deleteAllFolders() {
		EntityManager em = getEmf().createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("delete from Folder");
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
	}

	private void deleteResource(String projectName, String path) {
		EntityManager em = getEmf().createEntityManager();
		em.getTransaction().begin();

		// Resource r = getResource(projectName, path);
		Resource resource = null;
		Query q = em.createQuery("select r from Resource r where r.path='" + path + "'");
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

	private void deleteAllResources() {
		EntityManager em = getEmf().createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("delete from Resource");
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
	}

	private User authenticateUser(String login, String password) {
		EntityManager em = getEmf().createEntityManager();
		Query q = em
				.createQuery("select u from User u where u.id = '" + login + "' and u.password = '" + password + "'");
		List<User> users = q.getResultList();
		if (users.size() > 1)
			throw new RuntimeException("Duplicate user with the same credentials");
		if (users.isEmpty()) {
			return null;
		}
		em.close();
		return users.get(0);
	}

	private User changePwd(String userName, String pwd) {
		EntityManagerFactory emf = getEmf();
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select u from User u where u.id = '" + userName + "'");
		List<User> users = q.getResultList();
		if (users.size() > 1)
			throw new RuntimeException("Duplicate user with the same credentials");
		if (users.isEmpty()) {
			return null;
		}
		User user = users.get(0);
		user.setPassword(pwd);
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
		return users.get(0);
	}

	private void lockResource(String userName, String projectName, String path) {
		EntityManager em = getEmf().createEntityManager();
		Resource resource = null;
		Query q = em.createQuery("select r from Resource r where r.path='" + path + "'");
		List<Resource> resources = q.getResultList();
		for (Resource r : resources) {
			Project project = r.getProject();
			if (project.getName().equals(projectName)) {
				resource = r;
				break;
			}
		}

		// ignore resources out of scope
		if (resource == null) {
			return;
		}
		resource.setStatus(IPersistencyService.LOCKED);

		User user = em.find(User.class, userName);
		resource.setLocker(user);

		em.getTransaction().begin();
		em.persist(resource);
		em.getTransaction().commit();
		em.close();
		dumpDatabase();
	}

	private void unlockResource(String userId, String projectName, String path) {
		EntityManager em = getEmf().createEntityManager();
		em.getTransaction().begin();

		Resource resource = null;
		Query q = em.createQuery("select r from Resource r where r.path='" + path + "'");
		List<Resource> resources = q.getResultList();
		for (Resource r : resources) {
			Project project = r.getProject();
			if (project.getName().equals(projectName)) {
				resource = r;
				break;
			}
		}
		// resource out of the scope
		if (resource == null) {
			return;
		}
		resource.setStatus(IPersistencyService.UNLOCKED);

		q = em.createQuery(
				"update Resource r set r.status ='" + IPersistencyService.UNLOCKED + "' where r.path = '" + path + "'");
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
		dumpDatabase();
	}

	private void unlockAll(String userId) {
		EntityManager em = getEmf().createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("update Resource r set r.status ='" + IPersistencyService.UNLOCKED
				+ "' where r.locker in (select u from User u where u.id = '" + userId + "')");
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
		dumpDatabase();
	}

	private User getLocker(String projectName, String path) {
		Resource resource = getResource(projectName, path);
		return resource.getLocker();
	}

	private boolean isLocked(String projectName, String path) {
		Resource resource = getResource(projectName, path);
		// ignore resources out of database scope
		if (resource == null) {
			return false;
		}
		if (resource.getStatus().equals(IPersistencyService.LOCKED))
			return true;
		return false;
	}

	private void dumpDatabase() {
		dumpUsers();
		dumpProjects();
		dumpFolders();
		dumpResources();
	}

	private void dumpUsers() {
		List<User> users = getAllUsers();
		for (User user : users) {
			logger.info(user);
		}
	}

	private void dumpProjects() {
		List<Project> projectsList = getAllProjects();
		for (Project project : projectsList) {
			logger.info(project);
		}
	}

	private void dumpFolders() {
		List<Folder> folderList = getAllFolders();
		for (Folder folder : folderList) {
			logger.info(folder);
		}
	}

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