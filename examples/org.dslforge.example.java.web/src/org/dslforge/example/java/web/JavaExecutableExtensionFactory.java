package org.dslforge.example.java.web;

import org.dslforge.example.java.web.internal.Activator;
import org.dslforge.xtext.common.guice.AbstractGuiceAwareWebExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class JavaExecutableExtensionFactory extends AbstractGuiceAwareWebExecutableExtensionFactory {

	@Override
	public Bundle getBundle() {
		return Activator.getInstance().getBundle();
	}
	
	@Override
	public Injector getInjector() {
		return Activator.getInstance().getInjector(Activator.LANGUAGE_NAME);
	}
	
}
