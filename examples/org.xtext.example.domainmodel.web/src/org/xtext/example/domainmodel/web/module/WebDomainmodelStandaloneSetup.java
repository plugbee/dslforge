package org.xtext.example.domainmodel.web.module;

import org.eclipse.xtext.util.Modules2;
import org.xtext.example.DomainmodelRuntimeModule;
import org.xtext.example.DomainmodelStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

public class WebDomainmodelStandaloneSetup extends DomainmodelStandaloneSetup {

	public static void doSetup() {
		new DomainmodelStandaloneSetup().createInjectorAndDoEMFRegistration();
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
		DomainmodelRuntimeModule original = new DomainmodelRuntimeModule();
		WebDomainmodelRuntimeModule module = new WebDomainmodelRuntimeModule();
		Module mergedModule = Modules2.mixin((Module) original, module);
		return mergedModule;
	}
}
