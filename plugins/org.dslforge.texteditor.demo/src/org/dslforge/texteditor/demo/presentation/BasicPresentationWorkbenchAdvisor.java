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
package org.dslforge.texteditor.demo.presentation;

import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;

public class BasicPresentationWorkbenchAdvisor extends WorkbenchAdvisor {

	public void initialize(IWorkbenchConfigurer configurer) {
		getWorkbenchConfigurer().setSaveAndRestore(true);
		super.initialize(configurer);
	}

	public String getInitialWindowPerspectiveId() {
		return "org.dslforge.workbench.ui.parts.perspective";
	}
}
