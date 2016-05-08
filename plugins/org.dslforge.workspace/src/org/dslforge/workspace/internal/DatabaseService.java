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

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.dslforge.database.pu.tables.Folder;
import org.dslforge.database.pu.tables.Project;
import org.dslforge.database.pu.tables.Resource;
import org.dslforge.database.pu.tables.User;
import org.dslforge.workspace.IWorkspaceConstants;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.util.SafeRunnable;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

@SuppressWarnings({ "unchecked", "serial" })
public class DatabaseService {
	
	static final Logger logger = Logger.getLogger(DatabaseService.class);
	
	private BundleContext context;
	private EntityManagerFactory entityManagerFactory;
	private static DatabaseService INSTANCE;

	public static synchronized DatabaseService getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new DatabaseService();
		}
		return INSTANCE;
	}

	private DatabaseService() {
		logger.info("Starting DatabaseService...");
	}

	public void setEntityManagerFactory(EntityManagerFactory emf) {
		this.entityManagerFactory = emf;
	}

	public void setContext(BundleContext context) {
		this.context = context;
	}

	public EntityManagerFactory getEmf() {
		if (entityManagerFactory == null) {
			entityManagerFactory = lookupEntityManagerFactory(IWorkspaceConstants.PERSISTENCE_UNIT_NAME);
		}
		return entityManagerFactory;
	}

	public EntityManagerFactory lookupEntityManagerFactory(String puName) {
		String filter = "(osgi.unit.name=" + puName + ")";
		@SuppressWarnings("rawtypes")
		ServiceReference[] refs = null;
		try {
			refs = context.getServiceReferences(EntityManagerFactory.class.getName(), filter);
		} catch (InvalidSyntaxException isEx) {
			new RuntimeException("[ERROR] - Bad filter", isEx);
		}
		return (refs == null) ? null : (EntityManagerFactory) context.getService(refs[0]);
	}

	//////////////////////////////////////////
	// USERS
	//////////////////////////////////////////
	public void createUser(final String userName, final String firstName, final String lastName,
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

	//////////////////////////////////////////
	// PROJECTS
	//////////////////////////////////////////

	public void createProject(final String projectName, final String description, final String path,
			final String userName, final String visibility) {
		SafeRunnable.run(new SafeRunnable() {
			public void run() {
				Project project = new Project();
				project.setId(EcoreUtil.generateUUID());
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

	public void createFolder(final String folderPath, final String folderName) {
		SafeRunnable.run(new SafeRunnable() {
			public void run() {
				EntityManager em = getEmf().createEntityManager();
				Folder folder = new Folder();
				folder.setId(EcoreUtil.generateUUID());
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

	//////////////////////////////////////////
	// RESOURCES
	//////////////////////////////////////////
	public void createResource(final String projectName, final String path) {
		SafeRunnable.run(new SafeRunnable() {
			public void run() {
				Resource resource = new Resource();
				resource.setGuid(EcoreUtil.generateUUID());
				resource.setPath(path);
				resource.setStatus(IWorkspaceConstants.UNLOCKED);
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

	public User getUser(String userName) {
		EntityManager em = getEmf().createEntityManager();
		User user = em.find(User.class, userName);
		em.close();
		return user;
	}

	public User getUser(String firstName, String lastName) {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery(
				"select u from User u where u.firstName = '" + firstName + "' and u.lastName = '" + lastName + "'");
		List<User> users = q.getResultList();
		if (users.size() > 1)
			throw new RuntimeException("Duplicate user with name: " + firstName + " " + lastName);
		em.close();
		return users.get(0);
	}

	public User getUserById(String userId) {
		EntityManager em = getEmf().createEntityManager();
		User user = em.find(User.class, userId);
		if (user == null)
			throw new RuntimeException("Could not find user with id: " + userId);
		em.close();
		return user;
	}

	public List<User> getAllUsers() {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery("select u from User u");
		List<User> usersList = q.getResultList();
		em.close();
		return usersList;
	}

	public Project getProject(String projectName) {
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

	public List<Project> getAllProjects() {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery("select p from Project p");
		List<Project> projects = q.getResultList();
		em.close();
		return projects;
	}

	public List<Project> getAllProjectsForUser(String userName) {
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

	public Folder getFolder(String path) {
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

	public List<Folder> getAllFolders() {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery("select f from Folder f");
		List<Folder> folders = q.getResultList();
		em.close();
		return folders;
	}

	public List<Folder> getAllFoldersInProject(String projectName) {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery("select r from Folder r where r.path like '" + projectName + "%'");
		List<Folder> resources = q.getResultList();
		em.close();
		return resources;
	}

	public Resource getResource(String projectName, String path) {
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

	public List<Resource> getAllResources() {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery("select r from Resource r");
		List<Resource> resources = q.getResultList();
		em.close();
		return resources;
	}

	public List<Resource> getAllResourcesInProject(String projectName) {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery("select r from Resource r where r.project in (select p from Project p where p.name = '"
				+ projectName + "')");
		List<Resource> resources = q.getResultList();
		em.close();
		return resources;
	}

	public void deleteUser(String userName) {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery("delete from User u where u.id ='" + userName + "'");
		em.getTransaction().begin();
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
		dumpDatabase();
	}

	public void deleteUser(String firstName, String lastName) {
		EntityManager em = getEmf().createEntityManager();
		Query q = em.createQuery(
				"delete from User u where u.firstName ='" + firstName + "' and u.lastName='" + lastName + "'");
		em.getTransaction().begin();
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
		dumpDatabase();
	}

	public void deleteAllUsers() {
		EntityManager em = getEmf().createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("delete from User");
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
	}

	public void deleteProject(String projectName) {
		EntityManager em = getEmf().createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("delete from Project p where p.name ='" + projectName + "'");
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
		dumpDatabase();
	}

	public void deleteAllProjects() {
		EntityManager em = getEmf().createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("delete from Project");
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
	}

	public void deleteFolder(String projectName, String path) {
		EntityManager em = getEmf().createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("delete from Folder p where p.path ='" + path + "'");
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
		dumpDatabase();
	}

	public void deleteAllFolders() {
		EntityManager em = getEmf().createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("delete from Folder");
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
	}

	public void deleteResource(String projectName, String path) {
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

	public void deleteAllResources() {
		EntityManager em = getEmf().createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("delete from Resource");
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
	}

	public User authenticateUser(String login, String password) {
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

	public User changePwd(String userName, String pwd) {
		EntityManagerFactory emf = getEmf();
		EntityManager em = emf.createEntityManager();
		// dumpUsers();
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

	public void lockResource(String userName, String projectName, String path) {
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
		resource.setStatus(IWorkspaceConstants.LOCKED);

		User user = em.find(User.class, userName);
		resource.setLocker(user);

		em.getTransaction().begin();
		em.persist(resource);
		em.getTransaction().commit();
		em.close();
		dumpDatabase();
	}

	public void unlockResource(String userId, String projectName, String path) {
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
		resource.setStatus(IWorkspaceConstants.UNLOCKED);

		q = em.createQuery(
				"update Resource r set r.status ='" + IWorkspaceConstants.UNLOCKED + "' where r.path = '" + path + "'");
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
		dumpDatabase();
	}

	public void unlockAll(String userId) {
		EntityManager em = getEmf().createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("update Resource r set r.status ='" + IWorkspaceConstants.UNLOCKED
				+ "' where r.locker in (select u from User u where u.id = '" + userId + "')");
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
		dumpDatabase();
	}

	public User getLocker(String projectName, String path) {
		Resource resource = getResource(projectName, path);
		return resource.getLocker();
	}

	public boolean isLocked(String projectName, String path) {
		Resource resource = getResource(projectName, path);
		// ignore resources out of database scope
		if (resource == null) {
			return false;
		}
		if (resource.getStatus().equals(IWorkspaceConstants.LOCKED))
			return true;
		return false;
	}

	public void dumpDatabase() {
		dumpUsers();
		dumpProjects();
		dumpFolders();
		dumpResources();
	}

	public void dumpUsers() {
		List<User> users = getAllUsers();
		for (User user : users) {
			logger.info(user);
		}
	}

	public void dumpProjects() {
		List<Project> projectsList = getAllProjects();
		for (Project project : projectsList) {
			logger.info(project);
		}
	}

	public void dumpFolders() {
		List<Folder> folderList = getAllFolders();
		for (Folder folder : folderList) {
			logger.info(folder);
		}
	}

	public void dumpResources() {
		List<Resource> resources = getAllResources();
		for (Resource resource : resources) {
			if (resource != null) {
				logger.info(resource);
			}
		}
	}
}