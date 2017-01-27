/**
 * @Generated
 */
package org.eclipse.xtext.example.domainmodel.web;

import org.dslforge.xtext.common.guice.AbstractGuiceAwareWebExecutableExtensionFactory;
import org.eclipse.xtext.example.domainmodel.web.internal.Activator;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

public class DomainmodelExecutableExtensionFactory extends AbstractGuiceAwareWebExecutableExtensionFactory {

	@Override
	public Bundle getBundle() {
		return Activator.getInstance().getBundle();
	}
	
	@Override
	public Injector getInjector() {
		return Activator.getInstance().getInjector(Activator.ORG_ECLIPSE_XTEXT_EXAMPLE_DOMAINMODEL_DOMAINMODEL);
	}
	
}
