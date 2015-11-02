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
import org.dslforge.workbench.tools.DynamicClassRunner;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.StructuredSelection;

public class RunAction extends AbstractWorkbenchAction {
	
	private DynamicClassRunner runner;
	
	public RunAction() {
		this.runner = new DynamicClassRunner(IWorkbenchConstants.BOOT_CLASS_PATH);
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
			final File classFile = file;
			runner.doRun(classFile, "run");
		}
	}
}