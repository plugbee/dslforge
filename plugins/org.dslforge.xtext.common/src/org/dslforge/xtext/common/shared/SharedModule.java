/**
 * <copyright>
 *
 * Copyright (c) 2015 DSLFORGE. All rights reserved.
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
package org.dslforge.xtext.common.shared;

import org.dslforge.xtext.common.scoping.BasicTextLinkingService;
import org.eclipse.xtext.linking.ILinkingService;
import org.eclipse.xtext.service.AbstractGenericModule;

import com.google.inject.Binder;

public class SharedModule  extends AbstractGenericModule{

	@Override
	public void configure(Binder binder) {
		 binder.bind(ILinkingService.class).to(BasicTextLinkingService.class);
	}
}
