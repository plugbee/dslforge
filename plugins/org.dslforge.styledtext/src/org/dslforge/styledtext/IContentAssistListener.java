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
package org.dslforge.styledtext;

import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.internal.SWTEventListener;

@SuppressWarnings("restriction")
public interface IContentAssistListener extends SWTEventListener {
	
	/**
	 * Verifies the key event.
	 *
	 * @param event the verify event
	 * @return <code>true</code> if processing should be continued by additional listeners
	 * @see org.eclipse.swt.custom.VerifyKeyListener#verifyKey(VerifyEvent)
	 */
	public boolean verifyKey(VerifyEvent event);
}