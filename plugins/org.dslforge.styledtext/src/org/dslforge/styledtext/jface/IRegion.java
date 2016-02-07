/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.dslforge.styledtext.jface;

/**
 * A region describes a certain range in an indexed text store. Text stores are
 * for example documents or strings. A region is defined by its offset into the
 * text store and its length.
 */
public interface IRegion {

	/**
	 * Returns the length of the region.
	 *
	 * @return the length of the region
	 */
	int getLength();

	/**
	 * Returns the offset of the region.
	 *
	 * @return the offset of the region
	 */
	int getOffset();
}
