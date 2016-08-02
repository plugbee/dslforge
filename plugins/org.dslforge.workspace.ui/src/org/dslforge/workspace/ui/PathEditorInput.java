package org.dslforge.workspace.ui;

import java.io.File;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IPathEditorInput;
import org.eclipse.ui.IPersistableElement;

public class PathEditorInput implements IPathEditorInput {

	private File file;

	public PathEditorInput(File file) {
		this.file = file;
	}
	
	public PathEditorInput(IPath path) {
		this.file = path.toFile();
	}

	@Override
	public <T> T getAdapter(Class<T> adapter) {
		return null;
	}

	@Override
	public boolean exists() {
		return file.exists();
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	@Override
	public String getName() {
		return file.getName();
	}

	@Override
	public IPersistableElement getPersistable() {
		return null;
	}

	@Override
	public String getToolTipText() {
		return file.getAbsolutePath();
	}

	@Override
	public IPath getPath() {
		return new Path(file.getAbsolutePath());
	}

	
}
