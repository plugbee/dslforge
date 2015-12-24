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
package org.dslforge.texteditor.demo.commands;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class CommandUtil {

	public static <T> T unwrap(Object object, Class<T> type) {
		if (object instanceof ExecutionEvent) {
			object = HandlerUtil.getCurrentSelection((ExecutionEvent) object);
		}
		if (object instanceof IStructuredSelection) {
			object = ((IStructuredSelection) object).getFirstElement();
		}
		if (object instanceof IAdaptable) {
			object = ((IAdaptable) object).getAdapter(type);
		}
		if (type.isInstance(object)) {
			return type.cast(object);
		}
		return null;
	}
}