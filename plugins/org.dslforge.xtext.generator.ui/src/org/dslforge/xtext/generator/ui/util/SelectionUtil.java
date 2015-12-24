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
package org.dslforge.xtext.generator.ui.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class SelectionUtil {

	public static <T> T unwrap(Object o, Class<T> clazz) {
		if (o instanceof ExecutionEvent) {
			o = HandlerUtil.getCurrentSelection((ExecutionEvent) o);
		}
		if (o instanceof IStructuredSelection) {
			o = ((IStructuredSelection) o).getFirstElement();
		}
		if (o instanceof IAdaptable) {
			o = ((IAdaptable) o).getAdapter(clazz);
		}
		if (clazz.isInstance(o)) {
			return clazz.cast(o);
		}
		return null;
	}
	
	public static <T> List<T> unwrapAll(Object o, Class<T> clazz) {
		if (o instanceof ExecutionEvent) {
			o = HandlerUtil.getCurrentSelection((ExecutionEvent) o);
		}
		if (o instanceof IStructuredSelection) {
			List<T> list = new ArrayList<T>();
			IStructuredSelection selection = (IStructuredSelection) o;
			for (Iterator<?> it = selection.iterator(); it.hasNext();) {
				T next = unwrap(it.next(), clazz);
				if (next != null) {
					list.add(next);
				}
			}
			return list;
		}
		T element = unwrap(o, clazz);
		if (element != null) {
			return Collections.singletonList(element);
		}
		return Collections.emptyList();
	}
}