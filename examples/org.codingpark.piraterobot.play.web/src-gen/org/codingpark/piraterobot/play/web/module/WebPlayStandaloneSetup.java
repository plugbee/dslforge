/**
 * @Generated
 */
package org.codingpark.piraterobot.play.web.module;

import org.eclipse.xtext.util.Modules2;
import org.codingpark.piraterobot.PlayRuntimeModule;
import org.codingpark.piraterobot.PlayStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

public class WebPlayStandaloneSetup extends PlayStandaloneSetup {

	public static void doSetup() {
		new PlayStandaloneSetup().createInjectorAndDoEMFRegistration();
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
		PlayRuntimeModule original = new PlayRuntimeModule();
		WebPlayRuntimeModule module = new WebPlayRuntimeModule();
		Module mergedModule = Modules2.mixin((Module) original, module);
		return mergedModule;
	}
}
