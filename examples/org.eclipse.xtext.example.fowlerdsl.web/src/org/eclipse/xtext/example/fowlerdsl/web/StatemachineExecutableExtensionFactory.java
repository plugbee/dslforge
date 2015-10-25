package org.eclipse.xtext.example.fowlerdsl.web;

import org.dslforge.xtext.common.guice.AbstractGuiceAwareWebExecutableExtensionFactory;
import org.eclipse.xtext.example.fowlerdsl.web.internal.Activator;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class StatemachineExecutableExtensionFactory extends AbstractGuiceAwareWebExecutableExtensionFactory {

	@Override
	public Bundle getBundle() {
		return Activator.getInstance().getBundle();
	}
	
	@Override
	public Injector getInjector() {
		return Activator.getInstance().getInjector(Activator.LANGUAGE_NAME);
	}
	
}
