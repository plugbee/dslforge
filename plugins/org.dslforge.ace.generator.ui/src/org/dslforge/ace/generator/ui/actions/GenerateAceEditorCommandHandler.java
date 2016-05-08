package org.dslforge.ace.generator.ui.actions;

import java.lang.reflect.InvocationTargetException;

import org.apache.log4j.Logger;
import org.dslforge.ace.generator.ANTLRGrammar;
import org.dslforge.common.IWebProjectDescriptor;
import org.dslforge.common.IWebProjectDescriptor.EditorType;
import org.dslforge.common.WebProjectDescriptor;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class GenerateAceEditorCommandHandler extends AbstractHandler {

	static final Logger logger = Logger.getLogger(GenerateAceEditorCommandHandler.class);
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IFile file = unwrap(event, IFile.class);
		if (file != null) {
			IProject project = file.getProject();
			IPath grammarPath = file.getFullPath();
			String grammarShortName = grammarPath.removeFileExtension().lastSegment();
			ANTLRGrammar grammar = new ANTLRGrammar(grammarShortName, grammarPath);
			final WebProjectDescriptor configuration = new WebProjectDescriptor(project, grammar);
			configuration.setEditorType(EditorType.ACE);	
			try {
				Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
				ProgressMonitorDialog dialog = new ProgressMonitorDialog(shell);
				dialog.run(true, true, new IRunnableWithProgress() {
					
					@Override
					public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
						GenerateAceEditorOperation operation = createOperation(configuration);
						operation.run(monitor);	
						monitor.done();
					}
				});
			} catch (InterruptedException ex) {
				// Operation has been canceled by user, do nothing
			} catch (InvocationTargetException ex) {
				throw new ExecutionException(ex.getMessage(), ex);
			}
		}
		return null;
	}
	
	private GenerateAceEditorOperation createOperation(IWebProjectDescriptor configuration) {
		return new GenerateAceEditorOperation(configuration);
	}
	
	<T> T unwrap(Object object, Class<T> type) {
		Object current = object;
		if (current instanceof ExecutionEvent) {
			current = HandlerUtil.getActiveEditorInput((ExecutionEvent) current);
		}
		if (current instanceof IStructuredSelection) {
			current = ((IStructuredSelection) current).getFirstElement();
		}
		if (current instanceof IAdaptable) {
			current = ((IAdaptable) current).getAdapter(type);
		}
		if (type.isInstance(current)) {
			return type.cast(current);
		}
		return null;
	}

}
