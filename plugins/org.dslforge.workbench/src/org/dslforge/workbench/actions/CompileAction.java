/**
 * <copyright>
 *
 * Copyright (c) 2015 DSLFORGE. All rights reserved.
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
package org.dslforge.workbench.actions;

import java.io.File;
import java.util.Iterator;

import org.dslforge.workbench.IWorkbenchConstants;
import org.dslforge.workbench.tools.DynamicCompiler;
import org.dslforge.workbench.tools.ICompiler;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;

public class CompileAction extends AbstractWorkbenchAction {
	
	private org.dslforge.workbench.tools.ICompiler compiler;
	
	public CompileAction() {
		this.compiler = new DynamicCompiler(IWorkbenchConstants.CLASS_PATH);
	}
	
	public CompileAction(ICompiler compiler) {
		this.compiler = compiler;
	}

	@Override
	public void run(IAction action) {
		File file = null;
		Iterator<?> iterator = ((StructuredSelection) getSelection()).iterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();
			if (object instanceof File) {
				file = (File) object;
				break;
			}
		}
		if (file != null) {
			/**
			 * ToolProvider.getSystemJavaCompiler requires that tools.jar is
			 * either on the bootclasspath, or in the jre lib directory. Simply
			 * having tools.jar on the classpath does not work.
			 */		
			final File classFile = file;
			Display display = Display.getCurrent();
			display.asyncExec(new Runnable() {
				@Override
				public void run() {
					try {
						compiler.doCompile(classFile.getAbsolutePath());
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}
}