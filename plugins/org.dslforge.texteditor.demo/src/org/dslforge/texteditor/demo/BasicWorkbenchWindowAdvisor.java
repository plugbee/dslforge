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
package org.dslforge.texteditor.demo;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

/**
 * Configures the initial size and appearance of a workbench window.
 */
public class BasicWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

	public BasicWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}

	public void preWindowOpen() {
		getWindowConfigurer().setShowPerspectiveBar(true);
		getWindowConfigurer().setShowStatusLine(true);
		getWindowConfigurer().setShowMenuBar( true );
		getWindowConfigurer().setShowCoolBar( true );	
		getWindowConfigurer().setTitle("DSL Forge Workbench v0.9.1");
		getWindowConfigurer().setShellStyle(SWT.TITLE | SWT.MAX);
		Rectangle bounds = Display.getCurrent().getBounds();
		getWindowConfigurer().setInitialSize(new Point(bounds.width, bounds.height));
	}
	
	@Override
	public void postWindowOpen() {
		getWindowConfigurer().getWindow().getShell().setMaximized(true);
	}
	
	public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
		return new BasicWorkbenchActionBarAdvisor(configurer);
	}
}