/**
 * <copyright>
 *
 * Copyright (c) 2016 PlugBee. All rights reserved.
 * 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * </copyright>
 */
package org.dslforge.xtext.generator;

import java.util.ArrayList;
import java.util.List;

import org.dslforge.common.AbstractWebProjectFactory;
import org.dslforge.common.ICompositeProjectFactory;
import org.dslforge.common.IWebProjectFactory;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;


public abstract class AbstractDelegatingWebProjectFactory extends AbstractWebProjectFactory implements ICompositeProjectFactory{
	
	private List<IWebProjectFactory> delegates;
	
	public AbstractDelegatingWebProjectFactory() {
		delegates = new ArrayList<IWebProjectFactory>();
	}
	
	@Override
	public void addDelegate(IWebProjectFactory delegate) {
		delegates.add(delegate);
	}

	@Override
	public IWebProjectFactory getDelegate(String name) {
		for (IWebProjectFactory factory : delegates) {
			if (factory.getProject().getName().equals(name))
				return factory;
		}
		return null;
	}

	@Override
	public List<IWebProjectFactory> getDelegates() {
		return delegates;
	}
	
	@Override
	public List<IProject> createProjects(IProgressMonitor monitor) {
		SubMonitor progress = SubMonitor.convert(monitor, /*delegates.size() * 10 +*/ 110);
		progress.subTask("Generating new web project");
		createProject(progress.newChild(100));
		List<IProject> result = new ArrayList<IProject>();
		for (IWebProjectFactory factory : delegates) {
			progress.subTask("Generating optional artefact (" + Integer.toString(delegates.indexOf(factory) + 1) + "/"
					+ delegates.size() + ")");
			result.add(factory.createProject(progress.newChild(5)));
		}
		return result;
	}
}