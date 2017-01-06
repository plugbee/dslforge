package org.dslforge.workspace.ui.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.log4j.Logger;
import org.dslforge.texteditor.PathEditorInput;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.registry.EditorRegistry;

@SuppressWarnings("restriction")
public class EditorUtil {

	static final Logger logger = Logger.getLogger(EditorUtil.class);

	public static IEditorDescriptor getDefaultEditor(String fileName) {
		return fileName != null && fileName.length() != 0
				? getDefaultEditor(fileName, Platform.getContentTypeManager().findContentTypesFor(fileName)) : null;
	}

	public static IEditorDescriptor getDefaultEditor(IPath path) {
		File file = path.toFile();
		String fileName = file.getName();
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			return getDefaultEditor(fileInputStream, fileName);
		} catch (FileNotFoundException e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}
	
	public static IEditorDescriptor getDefaultEditor(InputStream contents, String fileName) {
		if (contents != null) {
			try {
				return getDefaultEditor(fileName, Platform.getContentTypeManager().findContentTypesFor(contents, fileName));
			} catch (IOException e) {
				logger.error(e);
			}
		}
		return getDefaultEditor(fileName);
	}

	public static IEditorDescriptor getDefaultEditor(String fileName, IContentType[] contentTypes) {
		IEditorRegistry editorRegistry = PlatformUI.getWorkbench().getEditorRegistry();
		if (contentTypes.length == 0) {
			return editorRegistry.getDefaultEditor(fileName, null);
		}
		IEditorDescriptor result = null;
		for (int i = 0; result == null && i < contentTypes.length; i++) {
			result = editorRegistry.getDefaultEditor(fileName, contentTypes[i]);
		}
		return result;
	}
	
	public static IEditorPart openEditor(IWorkbench workbench, IPath path) {
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		IEditorDescriptor editorDescriptor = EditorRegistry.getInstance().getDefaultEditor(path.lastSegment());
		if (editorDescriptor == null) {
			MessageDialog.openError(workbenchWindow.getShell(), "Error",
					"There is no editor registered for the file " + path.lastSegment());
			return null;
		} else {
			try {
				return page.openEditor(new PathEditorInput(path), editorDescriptor.getId());
			} catch (PartInitException exception) {
				MessageDialog.openError(workbenchWindow.getShell(), "Open Editor", exception.getMessage());
				return null;
			}
		}
	}
}
