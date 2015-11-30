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
package org.eclipse.rap.incubator.styledtext;

import org.eclipse.core.runtime.IPath;
import org.eclipse.ui.IEditorPart;

public interface IBasicTextEditor extends IEditorPart {

	/**
	 * Returns the file path backed by this editor
	 * 
	 * @return the file path
	 */
	IPath getFilePath();

	/**
	 * Returns the text widget of this editor
	 * 
	 * @return the text widget
	 */
	BasicText getWidget();
	
}
