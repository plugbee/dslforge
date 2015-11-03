/**
 * <copyright>
 *
 * Copyright (c) 2015 PlugBee. All rights reserved.
 * 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Amine Lajmi - Initial API and implementation
 *
 * </copyright>
 */
package org.dslforge.xtext.common;


import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.XtextResource;

public class BasicXtextDocument {

	private XtextResource resource = null;
	
	public void setInput(XtextResource resource) {
		this.resource = resource;
	}
	
	public void disposeInput() {
		// clients may override
	}
	
	private transient Job validationJob;

	public void setValidationJob(Job validationJob) {
		this.validationJob = validationJob;
	}

	public Job getValidationJob() {
		return validationJob;
	}

	public void checkAndUpdateAnnotations() {
		if (validationJob!=null) {
			validationJob.cancel();
			validationJob.schedule();
		}
	}
	
	public URI getResourceURI() {
		if (resource != null)
			return resource.getURI();
		return null;
	}
}
