package org.eclipse.sphinx.examples.xtext.hummingbird.web.module;

import org.dslforge.xtext.common.scoping.BasicTextContainerManager;
import org.dslforge.xtext.common.scoping.BasicTextGlobalScopeProvider;
import org.dslforge.xtext.common.scoping.BasicTextLinkingService;
import org.eclipse.xtext.linking.ILinkingService;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;

import com.google.inject.AbstractModule;

public class WebHummingbirdRuntimeModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(ILinkingService.class).to(BasicTextLinkingService.class);
		bind(IGlobalScopeProvider.class).to(BasicTextGlobalScopeProvider.class);
		bind(org.eclipse.xtext.resource.IContainer.Manager.class).to(BasicTextContainerManager.class);
		System.out.println("[DSLFORGE] - Configuring module " + this.getClass().getName());
	}
}
