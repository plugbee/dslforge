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
package org.dslforge.workbench.internal;

import java.util.List;

import org.dslforge.xtext.common.registry.BasicWorkbenchRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ui.IStartup;

public class WorkbenchStartup implements IStartup {

	@Override
	public void earlyStartup() {
		Job job = new Job("Registering contributions") {
			protected IStatus run(IProgressMonitor monitor) {
				try {
					List<String> metamodels = BasicWorkbenchRegistry.INSTANCE.getMetamodels();
					for (String m : metamodels) {
						System.out.println("[DSLFORGE] - Registering DSL: " + m);
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				return Status.OK_STATUS;
			}
		};
		job.schedule();
	}

}
