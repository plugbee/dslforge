package org.eclipse.xtext.example.arithmetics.web.module;

import org.eclipse.xtext.util.Modules2;
import org.eclipse.xtext.example.arithmetics.ArithmeticsRuntimeModule;
import org.eclipse.xtext.example.arithmetics.ArithmeticsStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

public class WebArithmeticsStandaloneSetup extends ArithmeticsStandaloneSetup {

	public static void doSetup() {
		new ArithmeticsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	public Injector createInjector(String language) {
		try {
			Module runtimeModule = getRuntimeModule();
			Injector injector = Guice.createInjector(runtimeModule);
			register(injector);
			return injector;
		} catch (Exception e) {
			System.err.println("Failed to create injector for " + language);
			throw new RuntimeException("Failed to create injector for "
					+ language, e);
		}
	}

	private Module getRuntimeModule() {
		org.eclipse.xtext.common.TerminalsStandaloneSetup.doSetup();
		ArithmeticsRuntimeModule original = new ArithmeticsRuntimeModule();
		WebArithmeticsRuntimeModule module = new WebArithmeticsRuntimeModule();
		Module mergedModule = Modules2.mixin(original, module);
		return mergedModule;
	}
}
