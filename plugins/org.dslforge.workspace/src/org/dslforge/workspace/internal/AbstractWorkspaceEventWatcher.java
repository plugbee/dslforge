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
package org.dslforge.workspace.internal;

import java.util.ArrayList;
import java.util.List;

import org.dslforge.workspace.IWorkspaceListener;

public abstract class AbstractWorkspaceEventWatcher implements IWorkspaceEventWatcher {

	private final List<IWorkspaceListener> listeners = new ArrayList<IWorkspaceListener>();

	public void addListener(IWorkspaceListener list) {
		listeners.add(list);
	}

	public void removeListener(IWorkspaceListener list) {
		listeners.remove(list);
	}
	
	public void notifyListeners(Object event) {		
		for (IWorkspaceListener list : listeners){
			list.workspaceChanged(event);
		}
	}
}