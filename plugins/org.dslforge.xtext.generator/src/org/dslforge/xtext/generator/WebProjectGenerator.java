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
package org.dslforge.xtext.generator;

import org.dslforge.xtext.generator.GenWebProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;

public class WebProjectGenerator implements IWebProjectGenerator{

	private GenWebProject genWebProject;
	
	public WebProjectGenerator() {
		genWebProject= new GenWebProject();
	}
	
	public GenWebProject getGenWebProject() {
		return genWebProject;
	}

	public void setEditorType(EditorType value) {
		getGenWebProject().setEditorType(value);
	}
	
	@Override
	public void doGenerate(EObject input, IFileSystemAccess fsa) {
		getGenWebProject().doGenerate(input, fsa);
	}
	
	@Override
	public void doGenerate(Resource input, IFileSystemAccess fsa) {
		getGenWebProject().doGenerate(input, fsa);
	}
}