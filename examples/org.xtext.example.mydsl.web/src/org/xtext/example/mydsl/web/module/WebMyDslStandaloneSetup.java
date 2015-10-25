package org.xtext.example.mydsl.web.module;

import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydsl.MyDslRuntimeModule;
import org.xtext.example.mydsl.MyDslStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

public class WebMyDslStandaloneSetup extends MyDslStandaloneSetup {

	public static void doSetup() {
		new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
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
		MyDslRuntimeModule original = new MyDslRuntimeModule();
		WebMyDslRuntimeModule module = new WebMyDslRuntimeModule();
		Module mergedModule = Modules2.mixin(original, module);
		return mergedModule;
	}
}
