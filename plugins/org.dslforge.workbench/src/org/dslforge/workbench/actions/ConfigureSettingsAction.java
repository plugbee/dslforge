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
package org.dslforge.workbench.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.Event;

public class ConfigureSettingsAction extends Action {

	private static final long serialVersionUID = 1L;

	public ConfigureSettingsAction() {
		setId("configure settings");
		setEnabled(false);
		setText("Settings...");
	}

	@Override
	public void runWithEvent(Event event) {
	}
}

