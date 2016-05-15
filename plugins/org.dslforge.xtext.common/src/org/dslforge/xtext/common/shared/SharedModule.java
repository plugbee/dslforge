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
package org.dslforge.xtext.common.shared;

import org.dslforge.xtext.common.IXtextResourceFactory;
import org.dslforge.xtext.common.IXtextResourceSetProvider;
import org.dslforge.xtext.common.XtextResourceFactory;
import org.dslforge.xtext.common.XtextResourceSetProvider;
import org.dslforge.xtext.common.scoping.BasicTextContainerManager;
import org.dslforge.xtext.common.scoping.BasicTextGlobalScopeProvider;
import org.dslforge.xtext.common.scoping.BasicTextLinkingService;
import org.eclipse.xtext.linking.ILinkingService;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.service.AbstractGenericModule;

import com.google.inject.Binder;

public class SharedModule  extends AbstractGenericModule{

	@Override
	public void configure(Binder binder) {
		 bindLinkingService(binder);
		 bindGlobalScopeProvider(binder);
		 bindContainerManager(binder);
		 bindResourceFactory(binder);
		 bindResourceSetProvider(binder);
	}
	
	protected void bindLinkingService(Binder binder) {
		binder.bind(ILinkingService.class).to(BasicTextLinkingService.class);
	}

	protected void bindGlobalScopeProvider(Binder binder) {
		binder.bind(IGlobalScopeProvider.class).to(BasicTextGlobalScopeProvider.class);
	}
	
	protected void bindContainerManager(Binder binder) {
		binder.bind(org.eclipse.xtext.resource.IContainer.Manager.class).to(BasicTextContainerManager.class);
	}
	
	protected void bindResourceFactory(Binder binder) {
		binder.bind(IXtextResourceFactory.class).to(XtextResourceFactory.class);
	}

	protected void bindResourceSetProvider(Binder binder) {
		binder.bind(IXtextResourceSetProvider.class).to(XtextResourceSetProvider.class);
	}
}
