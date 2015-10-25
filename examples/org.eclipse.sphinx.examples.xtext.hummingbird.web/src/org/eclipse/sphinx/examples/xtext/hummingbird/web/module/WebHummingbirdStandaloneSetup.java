package org.eclipse.sphinx.examples.xtext.hummingbird.web.module;

import org.eclipse.xtext.util.Modules2;
import org.eclipse.sphinx.examples.xtext.hummingbird.HummingbirdRuntimeModule;
import org.eclipse.sphinx.examples.xtext.hummingbird.HummingbirdStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

public class WebHummingbirdStandaloneSetup extends HummingbirdStandaloneSetup {

	public static void doSetup() {
		new HummingbirdStandaloneSetup().createInjectorAndDoEMFRegistration();
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
		HummingbirdRuntimeModule original = new HummingbirdRuntimeModule();
		WebHummingbirdRuntimeModule module = new WebHummingbirdRuntimeModule();
		Module mergedModule = Modules2.mixin(original, module);
		return mergedModule;
	}
}
