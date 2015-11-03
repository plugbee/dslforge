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

import org.dslforge.database.pu.tables.Folder;
import org.dslforge.database.pu.tables.Project;
import org.dslforge.database.pu.tables.Resource;
import org.dslforge.database.pu.tables.User;
import org.dslforge.workspace.IWorkspaceConstants;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

@SuppressWarnings("unchecked")
public class DatabaseService {

	public BundleContext context;

    private EntityManagerFactory emf;
    
	public static final String LOCKED = "locked";
	public static final String UNLOCKED = "unlocked";
    	
    private static DatabaseService INSTANCE;
	
    public static synchronized DatabaseService getInstance() {
    	if (INSTANCE==null) {
    		INSTANCE = new DatabaseService();
    	}
    	return INSTANCE;
    }
    
	private DatabaseService() {
		System.out.println("[DSLFORGE] Starting DatabaseService...");
	}
    
    public void setEntityManagerFactory(EntityManagerFactory emf) {
    	this.emf = emf;
    }
    
    public void setContext(BundleContext context) {
    	this.context = context;
    }

	public EntityManagerFactory getEmf() {
		if (emf==null) {
			emf = lookupEntityManagerFactory(IWorkspaceConstants.PERSISTENCE_UNIT_NAME);
		}
		return emf;
	}

    public EntityManagerFactory lookupEntityManagerFactory(String puName) {
        String filter = "(osgi.unit.name="+puName+")";
		@SuppressWarnings("rawtypes")
		ServiceReference[] refs = null;
        try {
            refs = context.getServiceReferences(EntityManagerFactory.class.getName(), filter);
        } catch (InvalidSyntaxException isEx) {
            new RuntimeException("[DSLFORGE] Bad filter", isEx);
        }
        System.out.println("[DSLFORGE] EMF Service refs looked up from registry: " + refs);
        return (refs == null) ? null : (EntityManagerFactory) context.getService(refs[0]);
    }
    
	public void inject() {
		System.out.println("[DSLFORGE] ----------------------------------------- [DSLFORGE]");
		System.out.println("[DSLFORGE]      DATABASE RECOVERY BATCH MODULE       [DSLFORGE]");
		System.out.println("[DSLFORGE]                                           [DSLFORGE]");
		System.out.println("[DSLFORGE]                                           [DSLFORGE]");
		System.out.println("[DSLFORGE] (c) Copyright DSLFORGE.COM     2011-2014  [DSLFORGE]");
		System.out.println("[DSLFORGE] ----------------------------------------- [DSLFORGE]");		
		System.out.println("[DSLFORGE] Dumping database...                       [DSLFORGE]");
		
		dumpDatabase();
		System.out.println("[DSLFORGE] ------------------------------------------[DSLFORGE]");
		System.out.println("[DSLFORGE] Injecting users...                        [DSLFORGE]");
		
		
		User user = getUser("admin");
		if (user==null) {
			createUser("admin", "admin", "admin", "dslforge", "admin@dslforge.com", "admin");		
		}
		User user1 = getUser("amine");
		if (user1==null) {
			createUser("amine", "amine", "lajmi", "dslforge", "amine.lajmi@dslforge.com", "lajmi");		
		}
		User user2 = getUser("jabier");
		if (user2==null) {
			createUser("jabier", "jabier", "martinez", "lip6", "jabimail@gmail.com", "martinez");		
		}
		User user3 = getUser("tewfik");
		if (user3==null) {
			createUser("tewfik", "tewfik", "ziadi", "lip6", "tewfik.ziadi@lip6.fr", "ziadi");		
		}
		User user4 = getUser("skander");
		if (user4==null) {
			createUser("skander", "skander", "turki", "NaN", "skander.turki@gmail.com", "turki");		
		}
		User user5 = getUser("tarek");
		if (user5==null) {
			createUser("tarek", "tarek", "turki", "NaN", "tarek.turki@gmail.com", "turki");		
		}
		User user6 = getUser("hamza");
		if (user6==null) {
			createUser("hamza", "hamza", "ben mansour", "NaN", "hamza.benmansour@gmail.com", "ben mansour");		
		}
		User user7 = getUser("cristina");
		if (user7==null) {
			createUser("cristina", "cristina", "ferreira", "Total", "ferreira.cls@gmail.com", "ferreira");		
		}
		User user8 = getUser("matthieu");
		if (user8==null) {
			createUser("matthieu", "matthieu", "helleboid", "Thales", "matthieu.helleboid@thales.com", "helleboid");		
		}
		User user9 = getUser("samir");
		if (user9==null) {
			createUser("samir", "touzani", "touzani", "Berkley", "samir.touzani@outlook.com", "touzani");		
		}
		User user10 = getUser("paul");
		if (user10==null) {
			createUser("paul", "feuto", "feuto", "GDE", "paul@blabla.com", "feuto");		
		}
		User user11 = getUser("idrissa");
		if (user11==null) {
			createUser("idrissa", "dieng", "dieng", "itemis", "idieng@blabla.com", "dieng");		
		}
		User user13 = getUser("ali");
		if (user13==null) {
			createUser("ali", "akar", "akar", "itemis", "ali@blabla.com", "akar");		
		}
		User user14 = getUser("klaus");
		if (user14==null) {
			createUser("klaus", "birken", "birken", "itemis", "klaus.birken@itemis.com", "birken");		
		}
		User user15 = getUser("benoit");
		if (user15==null) {
			createUser("benoit", "langlois", "langlois", "Thales", "benoit.langlois@thalesgroup.com", "langlois");		
		}
		User user16 = getUser("omar");
		if (user16==null) {
			createUser("omar", "merroune", "merroune", "independant", "omar.merroune@blabla.com", "merroune");		
		}
		User user17 = getUser("michele");
		if (user17==null) {
			createUser("michele", "dibiase", "dibiase", "unknown", "omar.@blabla.com", "merroune");		
		}
		User user18 = getUser("sven");
		if (user18==null) {
			createUser("sven", "eftinge", "eftinge", "itemis", "sven.eftinge@itemis.com", "eftinge");		
		}
		User user19 = getUser("frank");
		if (user19==null) {
			createUser("frank", "tagne", "tagne", "Obeo", "tagne.frank@obeo.fr", "tagne");		
		}	
		User user20 = getUser("franz");
		if (user20==null) {
			createUser("franz", "becker", "becker", "itemis", "franz.becker@itemis.com", "becker");		
		}
		User user21 = getUser("mohamed");
		if (user21==null) {
			createUser("mohamed", "lamine", "lamine", "Obeo", "mohamed.lamine@obeo.fr", "lamine");		
		}
		User user22 = getUser("mohamed");
		if (user22==null) {
			createUser("john", "unknown", "unknown", "unknown", "johnemail@mailinator.com", "unknown");		
		}
		User user23 = getUser("klark");
		if (user23==null) {
			createUser("klark", "unknown", "unknown", "unknown", "derby451@hotmail.com", "unknown");		
		}

		System.out.println("[DSLFORGE] ----------------------------------------- [DSLFORGE]");
		System.out.println("[DSLFORGE] Metadata successfully recovered           [DSLFORGE] ");
		System.out.println("[DSLFORGE] ----------------------------------------- [DSLFORGE]");
	}
	
	public void stop() {
		System.out.println("[DSLFORGE] ----------------------------------------- [DSLFORGE]");
		System.out.println("[DSLFORGE]             STOPPING DATABASE             [DSLFORGE] ");
		System.out.println("[DSLFORGE] ----------------------------------------- [DSLFORGE]");
	}
	
	public void dumpDatabase() {
		dumpUsers();
		dumpProjects();
		dumpFolders();
		dumpResources();
	}
	
	public void clean() {
		deleteAllResources();
		deleteAllProjects();
		deleteAllFolders();
		deleteAllUsers();
	}
	
//////////////////////////////////////////
//USERS
//////////////////////////////////////////
	public void createUser(String userName, String firstName, String lastName, String organization, String email, String pwd) {
		User user = new User();
		user.setId(userName);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setOrganization(organization);
		user.setEmail(email);
		user.setPassword(pwd);
		
		EntityManager em=getEmf().createEntityManager();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
		dumpDatabase();
	}
	
	public User getUser(String userName) {
		EntityManager em=getEmf().createEntityManager();
		User user = em.find(User.class, userName);
		em.close();
		return user;
	}

	public User getUser(String firstName, String lastName) {
		EntityManager em=getEmf().createEntityManager();
		Query q = em.createQuery("select u from User u where u.firstName = '" + firstName + "' and u.lastName = '" + lastName + "'");
		List<User> users = q.getResultList();
		if (users.size()>1)
			throw new RuntimeException("Duplicate user with name: " + firstName + " " + lastName);
		em.close();
		return users.get(0);
	}

	public User getUserById(String userId) {
		EntityManager em=getEmf().createEntityManager();
		User user = em.find(User.class, userId);
		if (user==null)
			throw new RuntimeException("Could not find user with id: " + userId);
		em.close();
		return user;
	}

	public List<User> getAllUsers() {
		EntityManager em=getEmf().createEntityManager();
		Query q = em.createQuery("select u from User u");
		List<User> usersList = q.getResultList();
		em.close();
		return usersList;
	}

	public void deleteUser(String userName) {
		EntityManager em=getEmf().createEntityManager();
		Query q = em.createQuery("delete from User u where u.id ='" + userName + "'");
		em.getTransaction().begin();
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
		dumpDatabase();
	}

	public void deleteUser(String firstName, String lastName) {
		EntityManager em=getEmf().createEntityManager();
		Query q = em.createQuery("delete from User u where u.firstName ='" + firstName + "' and u.lastName='" + lastName + "'");
		em.getTransaction().begin();
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
		dumpDatabase();
	}
	
	public void deleteAllUsers() {
		EntityManager em=getEmf().createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("delete from User");
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
	}
	
	public User authenticateUser(String login, String password) {
		EntityManager em=getEmf().createEntityManager();
		Query q = em.createQuery("select u from User u where u.id = '" + login + "' and u.password = '" + password + "'");
		List<User> users = q.getResultList();
		if (users.size()>1)
			throw new RuntimeException("Duplicate user with the same credentials");
		if(users.isEmpty()) {
			return null;
		}
		em.close();
		return users.get(0);
	}
	
	public User changePwd(String userName, String pwd) {
		EntityManagerFactory emf = getEmf();
		EntityManager em=emf.createEntityManager();
		//dumpUsers();
		Query q = em.createQuery("select u from User u where u.id = '" + userName + "'");
		List<User> users = q.getResultList();
		if (users.size()>1)
			throw new RuntimeException("Duplicate user with the same credentials");
		if(users.isEmpty()) {
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
	
	public User updateUserAccount(String userName, String firstName, String lastName, String organization, String email, String pwd) {
		EntityManagerFactory emf = getEmf();
		EntityManager em=emf.createEntityManager();
		//dumpUsers();
		Query q = em.createQuery("select u from User u where u.id = '" + userName + "'");
		List<User> users = q.getResultList();
		if (users.size()>1)
			throw new RuntimeException("Duplicate user with the same credentials");
		if(users.isEmpty()) {
			return null;
		}
		
		User user = users.get(0);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setOrganization(organization);
		user.setEmail(email);
		user.setPassword(pwd);
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
		return users.get(0);
	}
	
	public void dumpUsers() {
		List<User> users = getAllUsers();
		for (User user : users) {
			System.out.println(user);
		}
		System.out.println("Size: " + users.size());
	}

	
//////////////////////////////////////////
//PROJECTS
//////////////////////////////////////////
	
	public void createProject(String projectName, String description, String path, String userName, String visibility) {
		Project project = new Project();
		project.setId(EcoreUtil.generateUUID());
		project.setName(projectName);
		project.setDescription(description);
		project.setPath(path);
		project.setUser(getUser(userName));
		project.setVisibility(visibility);
		
		EntityManager em=getEmf().createEntityManager();
		em.getTransaction().begin();
		em.persist(project);
		em.getTransaction().commit();
		em.close();
		dumpDatabase();
	}
	
	public Project getProject(String projectName) {
		EntityManager em=getEmf().createEntityManager();
		Query q = em.createQuery("select p from Project p");
		List<Project> projects = q.getResultList();
		int i = 0;
		while(i<projects.size()) {
			Project p = projects.get(i);
			if(p.getName().equals(projectName)) {
				return p;
			}
			i++;
		}
		em.close();
		return null;
	}

	public List<Project> getAllProjects() {
		EntityManager em=getEmf().createEntityManager();
		Query q = em.createQuery("select p from Project p");
		List<Project> projects = q.getResultList();
		em.close();
		return projects;
	}

	public List<Project> getAllProjectsForUser(String userName) {
		List<Project> filtered = new ArrayList<Project>();
		EntityManager em=getEmf().createEntityManager();
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

	public void deleteProject(String projectName) {
		EntityManager em=getEmf().createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("delete from Project p where p.name ='" + projectName + "'");
		q.executeUpdate();	
		em.getTransaction().commit();
		em.close();
		dumpDatabase();
	}

	public void deleteAllProjects() {
		EntityManager em=getEmf().createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("delete from Project");
		q.executeUpdate();	
		em.getTransaction().commit();
		em.close();
	}

	public void dumpProjects() {
		List<Project> projectsList = getAllProjects();
		for (Project project : projectsList) {
			System.out.println(project);
		}
		System.out.println("Size: " + projectsList.size());
	}

	public void createFolder(String folderPath, String folderName) {
		EntityManager em=getEmf().createEntityManager();
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

	public Folder getFolder(String path) {
		EntityManager em=getEmf().createEntityManager();
		Query q = em.createQuery("select f from Folder f where f.path='" + path + "'");
		List<Folder> folders = q.getResultList();
		if (folders.size()>1){
			throw new RuntimeException("Duplicate folder found with path " + path);
		}
		if (folders.isEmpty()){
			return null;
		}
		em.close();
		return folders.get(0);
	}

	public List<Folder> getAllFolders() {
		EntityManager em=getEmf().createEntityManager();
		Query q = em.createQuery("select f from Folder f");
		List<Folder> folders = q.getResultList();
		em.close();
		return folders;
	}

	public List<Folder> getAllFoldersInProject(String projectName) {
		EntityManager em=getEmf().createEntityManager();
		Query q = em.createQuery("select r from Folder r where r.path like '" + projectName + "%'");
		List<Folder> resources = q.getResultList();
		em.close();
		return resources;
	}
	
	public void deleteFolder(String projectName, String path) {
		EntityManager em=getEmf().createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("delete from Folder p where p.path ='" + path + "'");
		q.executeUpdate();	
		em.getTransaction().commit();
		em.close();
		dumpDatabase();
	}
	
	public void deleteAllFolders() {
		EntityManager em=getEmf().createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("delete from Folder");
		q.executeUpdate();	
		em.getTransaction().commit();
		em.close();
	}
	
	public void dumpFolders() {
		List<Folder> folderList = getAllFolders();
		for (Folder folder : folderList) {
			System.out.println(folder);
		}
		System.out.println("Size: " + folderList.size());
	}

	
//////////////////////////////////////////
//				RESOURCES
//////////////////////////////////////////
	public void createResource(String projectName, String path) {
		Resource resource = new Resource();
		resource.setGuid(EcoreUtil.generateUUID());
		resource.setPath(path);
		resource.setStatus(UNLOCKED);
		
		EntityManager em=getEmf().createEntityManager();
		em.getTransaction().begin();
		
		//Project project = getProject(projectName);
		Project project = null;
		Query q = em.createQuery("select p from Project p");
		List<Project> projects = q.getResultList();
		int i = 0;
		while(i<projects.size()) {
			Project p = projects.get(i);
			if(p.getName().equals(projectName)) {
				project = p;
				break;
			}
			i++;
		}
		
		if (project==null)
			throw new RuntimeException("Could not find project " + projectName);
		
		resource.setProject(project);
		project.getResources().add(resource);
		
		//em.persist(project);
		em.persist(resource);
		em.getTransaction().commit();
		
		em.close();
		dumpDatabase();
	}

	public Resource getResource(String projectName, String path) {
		EntityManager em=getEmf().createEntityManager();
		Query q = em.createQuery("select r from Resource r where r.path='" + path + "'");
		List<Resource> resources = q.getResultList();
		for (Resource r: resources) {
			Project project = r.getProject();
			if (project.getName().equals(projectName)) {
				return r;
			}
		}
		em.close();
		return null;
	}

	public List<Resource> getAllResources() {
		EntityManager em=getEmf().createEntityManager();
		Query q = em.createQuery("select r from Resource r");
		List<Resource> resources = q.getResultList();
		em.close();
		return resources;
	}

	public List<Resource> getAllResourcesInProject(String projectName) {
		EntityManager em=getEmf().createEntityManager();
		Query q = em.createQuery("select r from Resource r where r.project in (select p from Project p where p.name = '" + projectName + "')");
		List<Resource> resources = q.getResultList();
		em.close();
		return resources;
	}

	public void deleteResource(String projectName, String path) {
		EntityManager em=getEmf().createEntityManager();
		em.getTransaction().begin();
		
		//Resource r = getResource(projectName, path);
		Resource resource = null;
		Query q = em.createQuery("select r from Resource r where r.path='" + path + "'");
		List<Resource> resources = q.getResultList();
		for (Resource r: resources) {
			Project project = r.getProject();
			if (project.getName().equals(projectName)) {
				resource = r;
				break;
			}
		}
		//verify resource is not null
		if (resource==null) {
			//throw new RuntimeException("Could not find resource " + path);
		} else {
			//Project p = getProject(projectName);
			Project project =null;
			q = em.createQuery("select p from Project p");
			List<Project> projects = q.getResultList();
			int i = 0;
			while(i<projects.size()) {
				Project p = projects.get(i);
				if(p.getName().equals(projectName)) {
					project = p;
					break;
				}
				i++;
			}
			
			//verify project is not null
			if (project==null) {
				return;
			}
			
			//update project
			project.getResources().remove(resource);
			em.persist(project);

			q = em.createQuery("delete from Resource r where r.path ='" + path + "'");
			q.executeUpdate();

		}
		em.getTransaction().commit();
		em.close();
		//dumpDatabase();
	}
	
	public void deleteAllResources() {
		EntityManager em=getEmf().createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("delete from Resource");
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
	}
	
	public void lockResource(String userName, String projectName,  String path) {
		EntityManager em=getEmf().createEntityManager();
		
		//Resource resource = getResource(projectName, path);
		Resource resource = null;
		Query q = em.createQuery("select r from Resource r where r.path='" + path + "'");
		List<Resource> resources = q.getResultList();
		for (Resource r: resources) {
			Project project = r.getProject();
			if (project.getName().equals(projectName)) {
				resource =  r;
				break;
			}
		}
		
		//ignore resources out of scope
		if (resource==null) {
			return;
		}
		resource.setStatus(LOCKED);

		User user = em.find(User.class, userName);		
		resource.setLocker(user);

		em.getTransaction().begin();
		em.persist(resource);
		em.getTransaction().commit();
		em.close();
		dumpDatabase();
	}

	public void unlockResource(String userId, String projectName, String path) {
		EntityManager em=getEmf().createEntityManager();
		em.getTransaction().begin();
		
		//Resource resource = getResource(projectName, path);
		Resource resource = null;
		Query q = em.createQuery("select r from Resource r where r.path='" + path + "'");
		List<Resource> resources = q.getResultList();
		for (Resource r: resources) {
			Project project = r.getProject();
			if (project.getName().equals(projectName)) {
				resource =  r;
				break;
			}
		}
		//resource out of the scope
		if (resource==null) {
			return;
		}
		resource.setStatus(UNLOCKED);		

		q = em.createQuery("update Resource r set r.status ='" + UNLOCKED + "' where r.path = '" + path + "'");
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
		dumpDatabase();
	}

	public void unlockAll(String userId) {
		EntityManager em=getEmf().createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("update Resource r set r.status ='" + UNLOCKED + "' where r.locker in (select u from User u where u.id = '" + userId + "')");
		q.executeUpdate();
		em.getTransaction().commit();
		em.close();
		dumpDatabase();
	}
	
	public User getLocker(String projectName,  String path) {
		Resource resource = getResource(projectName, path);
		return resource.getLocker();
	}
	
	public boolean isLocked(String projectName, String path) {
		Resource resource = getResource(projectName, path);
		//ignore resources out of database scope
		if (resource==null) {
			return false;
		}
		if (resource.getStatus().equals(LOCKED))
			return true;
		return false;
	}

	public void dumpResources() {
		List<Resource> resources = getAllResources();
		for (Resource r : resources) {
			if (r!=null) {
				System.out.println(r);
			}
		}
		System.out.println("Size: " + resources.size());
	}
}