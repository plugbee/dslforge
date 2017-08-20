package org.dslforge.workspace.config;

import java.util.List;

import org.eclipse.core.runtime.IPath;

public interface IPersistencyService {

	public static final String PERSISTENCE_UNIT_NAME = "workspace";
	public static final String JAVAX_PERSISTENCE_JDBC_URL = "javax.persistence.jdbc.url";
	public static final String METADATA_FOLDER = ".metadata";
	public static final String JDBC_PREFIX = "jdbc:derby:";
	public static final String VISIBILITY_PRIVATE = "private";
	public static final String VISIBILITY_PUBLIC = "public";
	public static final String PATH_SEPARATOR = "\\";
	public static final String LOCKED = "locked";
	public static final String UNLOCKED = "unlocked";
	
	boolean isRunning();

	void createProject(String projectName, String description, String path, String userId, String visibility);

	void createFolder(IPath path);

	void createResource(IPath path);

	void deleteProject(IPath path);

	void deleteFolder(IPath path);

	void deleteResource(IPath path);

	List<String> getAllProjectNames();

}
