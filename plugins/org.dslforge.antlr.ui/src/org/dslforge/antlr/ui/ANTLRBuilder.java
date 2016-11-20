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
 * Contributors:
 *     Amine Lajmi - Initial API and implementation
 *
 * </copyright>
 */
package org.dslforge.antlr.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.antlr.grammar.v3.ANTLRv3Lexer;
import org.antlr.grammar.v3.ANTLRv3Parser;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.apache.log4j.Logger;
import org.dslforge.antlr.AntlrTool;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.IOConsoleOutputStream;

public class ANTLRBuilder extends IncrementalProjectBuilder {

	static final Logger logger = Logger.getLogger(ANTLRBuilder.class);
	
	public static final String BUILDER_ID = "org.dslforge.antlr.builder";
	public static final String CONSOLE_ID = "ANTLR Build Console";
	public static final String ANTLR_FILE_EXTENSION = "g";
	private ANTLRConsole console;
	private IProblemMarkerFactory markerFactory;
	private List<String> output;

	public ANTLRBuilder() {
		super();
		setupConsole();
	}
	
	IProblemMarkerFactory getProblemMarkerFactory() {
		if (markerFactory == null) {
			markerFactory = createProblemMarkerFactory();
		}
		return markerFactory;
	}

	IProblemMarkerFactory createProblemMarkerFactory() {
		return new ProblemMarkerFactory();
	}

	void reportError(IFile file, String message) {
		reportProblem(file, message, Diagnostic.ERROR);
	}

	void reportWarning(IFile file, String message) {
		reportProblem(file, message, Diagnostic.WARNING);
	}

	void reportInfo(IFile file, String message) {
		reportProblem(file, message, Diagnostic.INFO);
	}

	void reportProblem(IFile file, String message, int severity) {
		BasicDiagnostic diagnostic = new BasicDiagnostic(severity, file.getName(), 0, message, new Object[] { file });
		try {
			getProblemMarkerFactory().createMarker(file, diagnostic);
		} catch (CoreException e) {
			logger.error(e.getMessage(), e);
		}
	}

	private void setupConsole() {
		console = findConsole();
		output = new ArrayList<String>();
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow activeWorkbenchWindow = workbench.getActiveWorkbenchWindow();
		if (activeWorkbenchWindow != null) {
			IWorkbenchPage activePage = activeWorkbenchWindow.getActivePage();
			String id = IConsoleConstants.ID_CONSOLE_VIEW;
			try {
				IConsoleView view = (IConsoleView) activePage.showView(id);
				view.display(console);
			} catch (PartInitException e) {
				logger.error(e.getMessage(), e);
			}
		}
	}

	private ANTLRConsole findConsole() {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++) {
			if (CONSOLE_ID.equals(existing[i].getName())) {
				return (ANTLRConsole) existing[i];
			}
		}
		ANTLRConsole antlrConsole = new ANTLRConsole(CONSOLE_ID, null);
		conMan.addConsoles(new IConsole[] { antlrConsole });
		return antlrConsole;
	}

	@Override
	protected IProject[] build(int kind, Map<String, String> args, IProgressMonitor monitor) throws CoreException {
		monitor.subTask("Generating ANTLR Parser");
		long startTime = System.currentTimeMillis();
		SubMonitor progress = SubMonitor.convert(monitor, 1);
		try {
			if (kind == FULL_BUILD) {
				fullBuild(progress.newChild(1));
			} else {
				IResourceDelta delta = getDelta(getProject());
				if (delta != null) {
					incrementalBuild(delta, progress.newChild(1));
				}
			}
		} catch (OperationCanceledException ex) {
			String message = "Build " + getProject().getName() + " aborted";
			logger.info(message);
		} finally {
			progress.done();
			try {
				getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
			} catch (CoreException ex) {
				logger.error(ex.getMessage(), ex);
			}
			String message = "Build " + getProject().getName() + " in "
					+ (System.currentTimeMillis() - startTime) + " ms";
			logger.info(message);
		}
		return getProject().getReferencedProjects();
	}

	private void incrementalBuild(IResourceDelta delta, IProgressMonitor monitor) {
		final long startBuild = System.currentTimeMillis();
		final SubMonitor progress = SubMonitor.convert(monitor, "Collecting resource deltas", 1);
		progress.subTask("Collecting resource deltas");
		IResourceDeltaVisitor visitor = new IResourceDeltaVisitor() {
			@Override
			public boolean visit(IResourceDelta delta) throws CoreException {
				if (progress.isCanceled())
					throw new OperationCanceledException();
				IResource resource = delta.getResource();
				IPath resourcePath = delta.getProjectRelativePath();
				if (resource instanceof IFile && resource.exists()) {
					if (resourcePath.getFileExtension().equals(ANTLR_FILE_EXTENSION)) {
						final IFile grammarFile = (IFile) resource;
						internalBuild(grammarFile, progress.newChild(1));
						long endBuild = System.currentTimeMillis();
						generateReport(startBuild, grammarFile, endBuild);
					}
				}
				return true;
			}
		};
		try {
			if (delta.getKind() == IResourceDelta.CHANGED) {
				delta.accept(visitor);
			}
		} catch (CoreException e) {
			logger.error(e.getMessage(), e);
		} finally {
			if (monitor != null)
				monitor.done();
		}
	}

	void internalBuild(IFile grammarFile, IProgressMonitor monitor) {
		final SubMonitor progress = SubMonitor.convert(monitor, "Generating parser and lexer", 1);
		output.clear();
		String grammaFullPath = grammarFile.getLocation().toOSString();
		String workingDirectory = grammarFile.getParent().getLocation().toOSString();
		InputStreamReader inputStreamReader =null;
		try {
			inputStreamReader = new InputStreamReader(grammarFile.getContents());
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			StringBuffer buffer = new StringBuffer(10000);
			int c;
			while ((c = bufferedReader.read()) != -1) {
				buffer.append((char) c);
			}
			ANTLRv3Lexer lexer = new ANTLRv3Lexer(new ANTLRStringStream(buffer.toString())) {
				@Override
				public void emitErrorMessage(String msg) {
					logger.error("ANTLR Lexer: " + msg);
					output.add(msg);
				}
			};
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ANTLRv3Parser parser = new ANTLRv3Parser(tokens) {
				@Override
				public void emitErrorMessage(String msg) {
					logger.error("ANTLR Parser: " + msg);
					output.add(msg);
				}
			};
			try {
				parser.grammarDef();
			} catch (RecognitionException e) {
				logger.error(e.getMessage(), e);
			}
		} catch (CoreException e) {
			logger.error(e.getMessage(), e);
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		} finally {
			try {
				inputStreamReader.close();
			} catch (IOException e) {
				logger.error(e.getMessage(), e);
			}
		}
		
		List<String> generatorOutput = AntlrTool.run(workingDirectory, grammaFullPath);
		output.addAll(generatorOutput);
		progress.done();
	}

	private void fullBuild(IProgressMonitor monitor) {
		final SubMonitor progress = SubMonitor.convert(monitor, "Perform full build", 10);
		progress.subTask("Perform full build");
		try {
			getProject().accept(new IResourceVisitor() {
				@Override
				public boolean visit(IResource resource) throws CoreException {
					if (progress.isCanceled())
						throw new OperationCanceledException();
					IPath resourcePath = resource.getProjectRelativePath();
					if (resource instanceof IFile && resource.exists()) {
						if (resourcePath.getFileExtension().equals(ANTLR_FILE_EXTENSION)) {
							internalBuild((IFile) resource, progress.newChild(1));
						}
					}
					return true;
				}
			});
			progress.worked(2);
		} catch (CoreException e) {
			logger.error(e.getMessage(), e);
		} finally {
			progress.done();
		}
	}

	@Override
	protected void clean(IProgressMonitor monitor) throws CoreException {
		if (monitor.isCanceled()) {
			throw new OperationCanceledException();
		}
		if (!isBuildable()) {
			return;
		}
	}

	boolean isBuildable() {
		return true;
	}
	
	private void generateReport(final long startBuild, final IFile grammarFile, long endBuild) {
		final long buildTime = endBuild - startBuild;
		final Display display = Display.getDefault();
		display.syncExec(new Runnable() {

			@Override
			public void run() {
				final IOConsoleOutputStream out = console.newOutputStream();
				try {
					if (output.isEmpty()) {
						out.setColor(display.getSystemColor(SWT.COLOR_BLACK));
						out.write("ANTLR Parser Generator Version 3.3 Nov 30, 2010 11:52:12.\n");
						out.write("Grammar: " + grammarFile.getFullPath()+"\n");
						out.write("BUILD SUCCESS\n");
						out.write("Total time: " + buildTime + " ms\n\n");
					} else {
						out.setColor(display.getSystemColor(SWT.COLOR_RED));
						out.write("ANTLR Parser Generator Version 3.3 Nov 30, 2010 11:52:12.\n");
						out.write("Grammar: " + grammarFile.getFullPath()+"\n");
						for (String line : output) {
							out.write(line+"\n");
						}
						out.write("\n");
					}
				} catch (IOException e) {
					logger.error(e.getMessage(), e);
				}
			}
		});
	}
}