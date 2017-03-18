package org.dslforge.texteditor;

import java.io.File;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IPathEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.model.IWorkbenchAdapter;

public class PathEditorInput implements IPathEditorInput {

	private final File file;

	public PathEditorInput(File file) {
		this.file = file;
	}
	
	public PathEditorInput(IPath path) {
		this.file = path.toFile();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Class<T> adapter) {
		if (IWorkbenchAdapter.class.equals(adapter)) {
			return (T) new WorkbenchAdapter();
		}
		return Platform.getAdapterManager().getAdapter(this, adapter);
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

	/**
	 * The workbench adapter which simply provides the label.
	 */
	private static class WorkbenchAdapter implements IWorkbenchAdapter {
		@Override
		public Object[] getChildren(Object o) {
			return null;
		}

		@Override
		public ImageDescriptor getImageDescriptor(Object object) {
			return null;
		}

		@Override
		public String getLabel(Object o) {
			return ((PathEditorInput) o).getName();
		}

		@Override
		public Object getParent(Object o) {
			return null;
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof PathEditorInput) {
			return ((PathEditorInput) obj).getPath().equals(getPath());
		}
		return super.equals(obj);
	}
}
