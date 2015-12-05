package org.dslforge.workspace.ui;

import java.io.File;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

@SuppressWarnings("serial")
public class BasicWorkspaceFilter extends ViewerFilter {

	public BasicWorkspaceFilter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		if (element instanceof File) {
			String fileName = ((File)element).getName();
			if (fileName.startsWith(".")) {
				return false;
			}
		}
		return true;
	}
}