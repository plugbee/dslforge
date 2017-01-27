/**
 * @Generated
 */
package org.codingpark.piraterobot.play.web;

import org.dslforge.xtext.common.guice.AbstractGuiceAwareWebExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.codingpark.piraterobot.play.web.internal.Activator;

import com.google.inject.Injector;

public class PlayExecutableExtensionFactory extends AbstractGuiceAwareWebExecutableExtensionFactory {

	@Override
	public Bundle getBundle() {
		return Activator.getInstance().getBundle();
	}
	
	@Override
	public Injector getInjector() {
		return Activator.getInstance().getInjector(Activator.ORG_CODINGPARK_PIRATEROBOT_PLAY);
	}
}
