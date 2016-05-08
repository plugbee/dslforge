package org.dslforge.common;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;

public interface ICompositeProjectFactory {
	
	public void addDelegate(IWebProjectFactory delegate);
	
	public IWebProjectFactory getDelegate(String name);
	
	public List<IWebProjectFactory> getDelegates();
	
	public List<IProject> createProjects(IProgressMonitor monitor);
}
