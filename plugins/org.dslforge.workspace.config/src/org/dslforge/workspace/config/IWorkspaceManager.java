package org.dslforge.workspace.config;

import org.eclipse.core.runtime.IPath;

public interface IWorkspaceManager {
	
	IPath getRootPath();
	
	void createProject(String projectName);

	void createFolder(IPath path);

	void createResource(IPath path);

	boolean isProject(IPath path);
	
	boolean deleteProject(IPath path);
	
	boolean deleteFolder(IPath path);

	boolean deleteResource(IPath path);
}
