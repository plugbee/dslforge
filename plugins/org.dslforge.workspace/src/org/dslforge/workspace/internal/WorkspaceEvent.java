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

import java.nio.file.Path;
import java.nio.file.WatchEvent;

public class WorkspaceEvent {
    
	private final Path eventTarget;  
	private final WatchEvent.Kind<?> type;

    WorkspaceEvent(Path eventTarget, WatchEvent.Kind<?> type) {
        this.eventTarget = eventTarget;
        this.type = type;
    }

    public Path getEventTarget() {
        return eventTarget;
    }

    public WatchEvent.Kind<?> getType() {
        return type;
    }
}