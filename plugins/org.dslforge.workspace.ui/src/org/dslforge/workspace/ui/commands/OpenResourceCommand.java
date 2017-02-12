package org.dslforge.workspace.ui.commands;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.apache.log4j.Logger;
import org.dslforge.workspace.ui.util.EditorUtil;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

public class OpenResourceCommand extends AbstractWorkspaceCommand {

	static final Logger logger = Logger.getLogger(OpenResourceCommand.class);

	public OpenResourceCommand() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		File file = unwrap(event, File.class);
		if (!file.isDirectory())
			return openWithEditor(file);
		return false;
	}
	
	public boolean openWithEditor(final File file) {
		IRunnableWithProgress operation = new IRunnableWithProgress() {
			public void run(IProgressMonitor progressMonitor) {
				try {
					if (file.exists() && !file.isDirectory()) {
						String absolutePath = file.getAbsolutePath();
						IWorkbench workbench = PlatformUI.getWorkbench();
						if (EditorUtil.openEditor(workbench, new Path(absolutePath)) != null) {
							logger.info("Opened editor on file " + absolutePath);
						}
					}
				} catch (Exception ex) {
					logger.error(ex.getMessage(), ex);
				} finally {
					progressMonitor.done();
				}
			}
		};
		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().run(false, false, operation);
		} catch (InvocationTargetException ex) {
			logger.error(ex.getMessage(), ex);
			return false;
		} catch (InterruptedException ex) {
			logger.error(ex.getMessage(), ex);
			return false;
		}
		return true;
	}
}