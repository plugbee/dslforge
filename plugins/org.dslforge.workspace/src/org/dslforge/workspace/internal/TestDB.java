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
package org.dslforge.workspace.internal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.dslforge.database.pu.tables.Project;
import org.dslforge.database.pu.tables.Resource;
import org.dslforge.database.pu.tables.User;
import org.dslforge.workspace.IWorkspaceConstants;
import org.eclipse.persistence.config.PersistenceUnitProperties;

public class TestDB {

    public static Map<String,Object> defaultProperties() {
        Map<String,Object> props = new HashMap<String,Object>();
        props.put("javax.persistence.jdbc.driver", IWorkspaceConstants.JDBC_TEST_DRIVER);
        props.put("javax.persistence.jdbc.url", IWorkspaceConstants.JDBC_TEST_URL);
        props.put("javax.persistence.jdbc.user", IWorkspaceConstants.JDBC_TEST_USER);
        props.put("javax.persistence.jdbc.password", IWorkspaceConstants.JDBC_TEST_PASSWORD);
        props.put("eclipselink.logging.level", "FINE");
        props.put(PersistenceUnitProperties.CLASSLOADER,  TestDB.class.getClass().getClassLoader());    
    //    props.put(PersistenceUnitProperties.WEAVING, "false");
   //     props.put(GeminiSystemProperties.REFRESH_BUNDLES_PROPERTY, "FALSE");
        return props;
    }
	
	private static EntityManagerFactory factory;

	private static final String PATH_SEPARATOR = "\\";
	
	public static void main(String[] args) {
		System.out.println("[DSLFORGE] ----------------------------------------- [DSLFORGE]");
		System.out.println("[DSLFORGE] 		DATABASE RECOVERY BATCH MODULE       [DSLFORGE]");
		System.out.println("[DSLFORGE]    				v1.0                     [DSLFORGE]");
		System.out.println("[DSLFORGE]                                           [DSLFORGE]");
		System.out.println("[DSLFORGE]                                           [DSLFORGE]");
		System.out.println("[DSLFORGE] (c) Copyright dslforge.com, 2011-2014     [DSLFORGE]");
		System.out.println("[DSLFORGE] ----------------------------------------- [DSLFORGE]");		
		System.out.println("[DSLFORGE] Recovering workspace metadata...          [DSLFORGE]");
		System.out.println("[DSLFORGE]                                           [DSLFORGE]");
		System.out.println("[DSLFORGE] ----------------------------------------- [DSLFORGE]");
		System.out.println("[DSLFORGE] Connecting to database...");
		
		factory = Persistence.createEntityManagerFactory(IWorkspaceConstants.PERSISTENCE_UNIT_NAME);
		DatabaseService.getInstance().setEntityManagerFactory(factory);
		DatabaseService.getInstance().clean();
		
		System.out.println("[DSLFORGE]              SUCCESS                  [DSLFORGE]");
		System.out.println("[DSLFORGE] ------------------------------------- [DSLFORGE]");		
		System.out.println("[DSLFORGE] Dumping database...");
		DatabaseService.getInstance().dumpDatabase();
		
		System.out.println("[DSLFORGE] ------------------------------------- [DSLFORGE]");
		System.out.println("[DSLFORGE] Inserting users...");
		User user = DatabaseService.getInstance().getUser("admin");
		if (user==null) {
			DatabaseService.getInstance().createUser("admin", "admin", "admin", "dslforge", "admin@dslforge.com", "admin");		
		}
		if (user==null) {
			DatabaseService.getInstance().createUser("amine", "lajmi", "admin", "dslforge", "admin@dslforge.com", "admin");		
		}
		User user2 = DatabaseService.getInstance().getUser("jabier");
		if (user2==null) {
			DatabaseService.getInstance().createUser("jabier", "jabier", "martinez", "lip6", "jabimail@gmail.com", "martinez");		
		}
		User user3 = DatabaseService.getInstance().getUser("tewfik");
		if (user3==null) {
			DatabaseService.getInstance().createUser("tewfik", "tewfik", "ziadi", "lip6", "tewfik.ziadi@lip6.fr", "ziadi");		
		}
		User user4 = DatabaseService.getInstance().getUser("skander");
		if (user4==null) {
			DatabaseService.getInstance().createUser("skander", "skander", "turki", "NaN", "skander.turki@gmail.com", "turki");		
		}
		User user5 = DatabaseService.getInstance().getUser("tarek");
		if (user5==null) {
			DatabaseService.getInstance().createUser("tarek", "tarek", "turki", "NaN", "tarek.turki@gmail.com", "turki");		
		}
		User user6 = DatabaseService.getInstance().getUser("hamza");
		if (user6==null) {
			DatabaseService.getInstance().createUser("hamza", "hamza", "ben mansour", "NaN", "hamza.benmansour@gmail.com", "ben mansour");		
		}
		User user7 = DatabaseService.getInstance().getUser("cristina");
		if (user7==null) {
			DatabaseService.getInstance().createUser("cristina", "cristina", "ferreira", "Total", "ferreira.cls@gmail.com", "ferreira");		
		}

		System.out.println("[DSLFORGE] ------------------------------------- [DSLFORGE]");
		System.out.println("[DSLFORGE] Creating projects...");
		User userAdmin = DatabaseService.getInstance().getUser("alajmi");
		DatabaseService.getInstance().createProject("www", "dslforge basic examples", PATH_SEPARATOR, userAdmin.getId(), "public");
		
		System.out.println("[DSLFORGE] ------------------------------------- [DSLFORGE]");
		System.out.println("[DSLFORGE] Dumping database...");
		DatabaseService.getInstance().dumpDatabase();
		
		System.out.println("[DSLFORGE] ------------------------------------- [DSLFORGE]");
		System.out.println("[DSLFORGE] Creating resources...");
		DatabaseService.getInstance().createResource("www", "Device.hbtext");
		DatabaseService.getInstance().createResource("www", "Entities.dmodel");
		DatabaseService.getInstance().createResource("www", "Example.statemachine");
		DatabaseService.getInstance().createResource("www", "Test.calc");
		System.out.println("[DSLFORGE] ------------------------------------- [DSLFORGE]");
		System.out.println("[DSLFORGE] Stopping...");
		DatabaseService.getInstance().stop();

		System.out.println("[DSLFORGE] ------------------------------------------ [DSLFORGE]");
		System.out.println("[DSLFORGE] *Workspace Metadata successfully recovered*");
		System.out.println("[DSLFORGE] ------------------------------------------ [DSLFORGE]");
		
		
		/*
		User userAdmin = DatabaseService.getInstance().getUser("admin");
		if (userAdmin!=null) {
			System.out.println("[DSLFORGE] ------------------------------------- [DSLFORGE]");
			System.out.println("[DSLFORGE] Creating sample project...            [DSLFORGE] ");

			Project www = getProject("www");
			if (www==null) {
				createProject("www", "dslforge basic examples", PATH_SEPARATOR, userAdmin.getId(), "public");
			}

			System.out.println("[DSLFORGE] ------------------------------------- [DSLFORGE]");
			System.out.println("[DSLFORGE] Creating resources...                 [DSLFORGE] ");
			if (getResource("www", "Device.hbtext")==null) {
				System.out.println("[DSLFORGE] Adding Hummingbird model example...   [DSLFORGE]");
				createResource("www", "Device.hbtext");
			}
			if (getResource("www", "Entities.dmodel")==null) {
				System.out.println("[DSLFORGE] Adding Domainmodel model example...   [DSLFORGE]");
				createResource("www", "Entities.dmodel");
			}
			if (getResource("www", "Example.statemachine")==null) {
				System.out.println("[DSLFORGE] Adding Statemachine model example...  [DSLFORGE]");
				createResource("www", "Example.statemachine");
			}
			if (getResource("www", "Test.calc")==null) {
				System.out.println("[DSLFORGE] Adding Arithmetics model example...   [DSLFORGE]");
				createResource("www", "Test.calc");
			}
			System.out.println("[DSLFORGE] ------------------------------------- [DSLFORGE]");
			System.out.println("[DSLFORGE] Dumping database...");
			dumpDatabase();
		}			
		*/
	}

	public static void dumpUsers(EntityManager em) {
		List<User> users = DatabaseService.getInstance().getAllUsers();
		for (User user : users) {
			System.out.println(user);
		}
		System.out.println("Size: " + users.size());
	}
	
	public static void dumpProjects(EntityManager em) {
		List<Project> projectsList = DatabaseService.getInstance().getAllProjects();
		for (Project project : projectsList) {
			System.out.println(project);
		}
		System.out.println("Size: " + projectsList.size());
	}
		
	public static void dumpResources(EntityManager em) {
		List<Resource> resources = DatabaseService.getInstance().getAllResources();
		for (Resource user : resources) {
			System.out.println(user);
		}
		System.out.println("Size: " + resources.size());
	}
	
	public static void createUsers(EntityManager em) {
		DatabaseService.getInstance().createUser("alajmi", "Amine", "Lajmi", "itemis", "amine.lajmi@gmail.com", "lajmi");
		DatabaseService.getInstance().createUser("jmartinez", "Jabier", "Martinez", "LIP6", "jabimail@gmail.com", "martinez");
		DatabaseService.getInstance().createUser("tziadi", "Tewfik", "Ziadi", "LIP6", "tewfik.ziadi@lip6.fr", "ziadi");
		dumpUsers(em);
	}
	
	
	
	
}