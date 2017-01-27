/**
 * @Generated
 */
package org.eclipse.xtext.example.domainmodel.web.module;

import org.apache.log4j.Logger;

import com.google.inject.Binder;

public class WebDomainmodelRuntimeModule extends AbstractWebDomainmodelRuntimeModule {

	static final Logger logger = Logger.getLogger(WebDomainmodelRuntimeModule.class);
	
	/**
	 * Add Custom bindings here
	 */
	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		logger.debug("Configuring language module " + this.getClass().getName());
	}
}
