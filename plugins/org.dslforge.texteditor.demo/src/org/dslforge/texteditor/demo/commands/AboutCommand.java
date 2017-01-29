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
 *     PlugBee - Initial API and implementation
 *
 * </copyright>
 */
package org.dslforge.texteditor.demo.commands;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class AboutCommand extends AbstractHandler {

	static final Logger logger = Logger.getLogger(AboutCommand.class);

	public AboutCommand() {
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		String message = "DSL Forge Workbench v0.9.1\n\n"
				+ "Copyright (c) 2016 PlugBee and others.\n\n"
				+ "This program is made available under the terms of\n "
				+ "the Eclipse Public License v1.0 which is available at\n"
				+ " http://www.eclipse.org/legal/epl-v10.html\n";
		Shell activeShell = Display.getCurrent().getActiveShell();
		final AboutDialog loginDialog = new AboutDialog(activeShell, "About", message);
		return loginDialog.open();
	}
}