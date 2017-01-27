/**
 * @Generated
 */
package org.eclipse.xtext.example.arithmetics.web.module;

import org.apache.log4j.Logger;

import com.google.inject.Binder;

public class WebArithmeticsRuntimeModule extends AbstractWebArithmeticsRuntimeModule {

	static final Logger logger = Logger.getLogger(WebArithmeticsRuntimeModule.class);
	
	/**
	 * Add Custom bindings here
	 */
	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		logger.debug("Configuring language module " + this.getClass().getName());
	}
}
