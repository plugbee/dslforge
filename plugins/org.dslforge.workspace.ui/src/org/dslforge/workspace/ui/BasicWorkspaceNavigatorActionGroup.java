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
package org.dslforge.workspace.ui;

import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.ui.internal.navigator.CommonNavigatorActionGroup;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.navigator.CommonViewer;
import org.eclipse.ui.navigator.LinkHelperService;

@SuppressWarnings("restriction")
public class BasicWorkspaceNavigatorActionGroup extends CommonNavigatorActionGroup {

	private static final String UP_ACTION_ID = "org.eclipse.ui.framelist.up"; //$NON-NLS-1$
	
	public BasicWorkspaceNavigatorActionGroup(CommonNavigator aNavigator, CommonViewer aViewer, LinkHelperService linkHelperService) {
		super(aNavigator, aViewer, linkHelperService);
	}

	@Override
	protected void fillToolBar(IToolBarManager toolBar) {
		super.fillToolBar(toolBar);
		toolBar.remove(UP_ACTION_ID);
	}
}
