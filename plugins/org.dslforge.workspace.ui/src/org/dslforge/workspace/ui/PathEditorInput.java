package org.dslforge.workspace.ui;

import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IPathEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.PlatformUI;

/**
 * Editor input that stores a path.
 */
public class PathEditorInput implements IPathEditorInput {
	private IPath fPath;
	
	/**
	 * Creates an editor input based of the given file resource.
	 *
	 * @param path the file
	 */
	public PathEditorInput(IPath path) {
		if (path == null) {
			throw new IllegalArgumentException();
		}
		this.fPath = path;
	}
	
	/*
	 * @see java.lang.Object#hashCode()
	 */
	@Override
    public int hashCode() {
		return fPath.hashCode();
	}
	
	/*
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
    public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof PathEditorInput))
			return false;
		PathEditorInput other = (PathEditorInput) obj;
		return fPath.equals(other.fPath);
	}
	
	/*
	 * @see org.eclipse.ui.IEditorInput#exists()
	 */
	public boolean exists() {
		return fPath.toFile().exists();
	}
	
	/*
	 * @see org.eclipse.ui.IEditorInput#getImageDescriptor()
	 */
	public ImageDescriptor getImageDescriptor() {
		return PlatformUI.getWorkbench().getEditorRegistry().getImageDescriptor(fPath.toString());
	}
	
	/*
	 * @see org.eclipse.ui.IEditorInput#getName()
	 */
	public String getName() {
		return fPath.toString();
	}
	
	/*
	 * @see org.eclipse.ui.IEditorInput#getToolTipText()
	 */
	public String getToolTipText() {
		return fPath.makeRelative().toOSString();
	}
	
	/*
	 * @see org.eclipse.ui.IPathEditorInput#getPath()
	 */
	public IPath getPath() {
		return fPath;
	}

	/*
	 * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
	 */
	public Object getAdapter(Class adapter) {
		return null;
	}

	/*
	 * @see org.eclipse.ui.IEditorInput#getPersistable()
	 */
	public IPersistableElement getPersistable() {
		// no persistence
		return null;
	}
}

