/**
 * @Generated
 */
package org.codingpark.piraterobot.play.web.module;

import org.apache.log4j.Logger;

import com.google.inject.Binder;

public class WebPlayRuntimeModule extends AbstractWebPlayRuntimeModule {

	static final Logger logger = Logger.getLogger(WebPlayRuntimeModule.class);
	
	/**
	 * Add Custom bindings here
	 */
	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		logger.debug("Configuring language module " + this.getClass().getName());
	}
}
