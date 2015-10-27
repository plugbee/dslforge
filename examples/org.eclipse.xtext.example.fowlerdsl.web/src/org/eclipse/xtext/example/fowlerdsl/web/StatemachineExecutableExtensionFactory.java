package org.eclipse.xtext.example.fowlerdsl.web;

import org.dslforge.xtext.common.guice.AbstractGuiceAwareWebExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.eclipse.xtext.example.fowlerdsl.web.internal.Activator;

import com.google.inject.Injector;

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
