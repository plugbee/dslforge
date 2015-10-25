//package org.dslforge.authentication.internal;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Query;
//
//import org.dslforge.database.pu.tables.User;
//
//public class AuthenticationService {
//
//	private static EntityManager em = null;
//	
//	public void run(EntityManagerFactory service) {
//    	em = service.createEntityManager();
//	}
//
//	public static EntityManager getEm() {
//		return em;
//	}
//	
//	public static User authenticateUser(String login, String password) {
//		Query q = getEm().createQuery("select u from User u where u.id = '" + login + "' and u.password = '" + password + "'");
//		@SuppressWarnings("unchecked")
//		List<User> users = q.getResultList();
//		if (users.size()>1)
//			throw new RuntimeException("Duplicate user with the same credentials");
//		return users.get(0);
//	}
//}