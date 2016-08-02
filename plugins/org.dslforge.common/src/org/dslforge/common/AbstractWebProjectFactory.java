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
 * </copyright>
 */
package org.dslforge.common;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;

public abstract class AbstractWebProjectFactory implements IWebProjectFactory {

	static final Logger logger = Logger.getLogger(AbstractWebProjectFactory.class);
	
	@Override
	public void createContainer(IContainer container, IProgressMonitor monitor) {
		if (!container.exists()) {
			if (!container.getParent().exists())
				createContainer(container.getParent(), monitor);
			if (container instanceof IFolder) {
				try {
					((IFolder) container).create(true, true, monitor);
					monitor.worked(1);
				} catch (CoreException e) {
					logger.error(e.getMessage(), e);
				}
			}
		}
		monitor.done();
	}

	@Override
	public IFolder createFolder(String folderName, IProgressMonitor monitor) {
		SubMonitor progress = SubMonitor.convert(monitor, 1);
		IProject project = getProject();
		IFolder folder = project.getFolder(folderName);
		if (folder != null && !folder.exists()) {
			try {
				folder.create(true, true, progress.newChild(1));
			} catch (CoreException e) {
				logger.error(e.getMessage(), e);
			} finally {
				progress.worked(1);
			}
		}
		return folder;
	}
	
	@Override
	public IFile createFile(final String fileName, final IContainer container, final String content, final IProgressMonitor monitor) {
		final IFile file = container.getFile(new Path(fileName));
		createContainer(file.getParent(), monitor);
		SubMonitor progress = SubMonitor.convert(monitor, 1);
		try {
			final InputStream stream = new ByteArrayInputStream(content.getBytes(file.getCharset()));
			if (file.exists()) {
				file.setContents(stream, true, true, progress.newChild(1));
			} else {
				file.create(stream, true, progress.newChild(1));
			}
			stream.close();
		} catch (Exception ex) {
			logger.error(ex.getMessage(), ex);
		} finally {
			progress.worked(1);
			progress.done();
		}
		return file;
	}
	
	@Override
	public IFile generateFile(final String containerPath, final String fileName, final CharSequence content, final IProgressMonitor monitor) {
		final IContainer container = containerPath.length()>0?getProject().getFolder(containerPath):getProject();
		final IFile file = container.getFile(new Path(fileName));
		createContainer(file.getParent(), monitor);
		SubMonitor progress = SubMonitor.convert(monitor, 1);
		try {
			final InputStream stream = new ByteArrayInputStream(content.toString().getBytes());
			if (file.exists()) {
				file.setContents(stream, true, true, progress.newChild(1));
			} else {
				file.create(stream, true, progress.newChild(1));
			}
			stream.close();
		} catch (Exception ex) {
			logger.error(ex.getMessage(), ex);
		}
		return file;
	}
}
