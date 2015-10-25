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

import org.dslforge.workbench.wizards.AboutDialog;
import org.eclipse.emf.common.ui.action.WorkbenchWindowActionDelegate;
import org.eclipse.jface.action.IAction;
import org.eclipse.swt.widgets.Display;


public class AboutAction extends WorkbenchWindowActionDelegate  {

	//@Override
	public void run(IAction action) {
	    String message = "Built on Eclipse RAP - Copyright (c) PlugBee 2011-2015";
	    message ="DSLFORGE Workbench (beta)\n\n"+
	    "Version: 1.0.2.v20151016-2344\n\n"+
	    "(c) Copyright PlugBee and others 2011, 2015.  All rights reserved.\n"+
	    "Visit http://www.plugbee.com\n\n";
	    final AboutDialog loginDialog = new AboutDialog(Display.getCurrent().getActiveShell(), "About DSLFORGE Workbench", message );
	    loginDialog.open();
	}
}
