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
package org.dslforge.texteditor;

import org.dslforge.styledtext.jface.ITextViewer;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.ui.IEditorPart;

public interface IBasicTextEditor extends IEditorPart {
	/**
	 * Returns the text viewer of this editor
	 * 
	 * @return the text viewer
	 */
	ITextViewer getViewer();

	/**
	 * Returns whether the text in this text editor can be changed by the user.
	 *
	 * @return <code>true</code> if it can be edited, and <code>false</code> if it is read-only
	 */
	boolean isEditable();
	
	/**
	 * Returns the action installed under the given action id.
	 *
	 * @param actionId the action id
	 * @return the action, or <code>null</code> if none
	 */
	IAction getAction(String actionId);
	
	/**
	 * Returns this text editor's selection provider.
	 *
	 * @return the selection provider
	 */
	ISelectionProvider getSelectionProvider();
}
