package org.dslforge.xtext.generator.ui.actions;

import java.lang.reflect.InvocationTargetException;

import org.apache.log4j.Logger;
import org.dslforge.common.IWebProjectDescriptor;
import org.dslforge.common.IWebProjectDescriptor.EditorType;
import org.dslforge.common.IWebProjectFactory;
import org.dslforge.common.WebProjectDescriptor;
import org.dslforge.xtext.generator.XtextGrammar;
import org.dslforge.xtext.generator.util.GeneratorUtil;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.Grammar;

public class GenerateXtextWebEditorHandler extends AbstractHandler {
	
	static final Logger logger = Logger.getLogger(GenerateXtextWebEditorHandler.class);
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IFile file = unwrap(event, IFile.class);
		if (file != null) {
			String webProjectName = computeWebProjectName(file.getProject());
			Grammar grammar = GeneratorUtil.loadXtextGrammar(file);
			XtextGrammar wrapped = new XtextGrammar(grammar);
			IProject webProject = ResourcesPlugin.getWorkspace().getRoot().getProject(webProjectName);
			final WebProjectDescriptor configuration = new WebProjectDescriptor(webProject, wrapped);
			configuration.setEditorType(EditorType.RAP);
			try {
				Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
				ProgressMonitorDialog dialog = new ProgressMonitorDialog(shell);
				dialog.run(true, true, new IRunnableWithProgress() {
					
					@Override
					public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
						GenerateXtextWebEditorOperation operation = createOperation(configuration);
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

	private String computeWebProjectName(IProject project) {
		String webProjectName = project.getName();
		try {
			if (project.hasNature(IWebProjectFactory.XTEXT_NATURE_ID)) {
				webProjectName = webProjectName + IWebProjectFactory.WEB_PROJECT_PREFIX;
			}
		} catch (CoreException e) {
			logger.error(e.getMessage(), e);
		}
		return webProjectName;
	}
	
	private GenerateXtextWebEditorOperation createOperation(IWebProjectDescriptor configuration) {
		return new GenerateXtextWebEditorOperation(configuration);
	}
	
	private <T> T unwrap(ExecutionEvent object, Class<T> type) {
		Object current = object;
		if (current instanceof ExecutionEvent) {
			ExecutionEvent event = (ExecutionEvent) object;
			Object variable = HandlerUtil.getVariable(object, "activeMenuSelection");
			if (variable != null && variable instanceof IStructuredSelection) {
				// from menu selection
				current = HandlerUtil.getCurrentSelection(event);
			} else {
				variable = HandlerUtil.getVariable(object, "activeMenuEditorInput");
				if (variable != null && variable instanceof IStructuredSelection) {
					// from editor
					current = HandlerUtil.getActiveEditorInput(event);
				}
			}
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