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
package org.dslforge.ace.generator.web

import org.dslforge.common.AbstractGenerator
import org.dslforge.common.IGrammar
import org.dslforge.common.IWebProjectDescriptor.EditorType
import org.dslforge.common.IWebProjectFactory
import org.eclipse.core.runtime.IProgressMonitor

class GenGlobalIndex extends AbstractGenerator{
 
 	var IGrammar grammar
 	
	new() {
		defaultSlotName = ""
		basePath="WebContent"
		relativePath = "/"
	}

	override doGenerate(IWebProjectFactory factory, IProgressMonitor monitor) {
		grammar = factory.input
		if (factory.editorType==EditorType::RAP){
			defaultSlotName = "src-js/"
			basePath = grammar.getBasePath()
			relativePath = "/"
		}
		factory.generateFile(defaultSlotName + basePath + relativePath, "global-index.js", toJavaScript(), monitor)
	}
	
	def toJavaScript()'''
	«fileHeader»
	var counter = 0;
	var connections = [];
	var index = [];
	
	onconnect = function(e) {
		if(e) {
		   var port = e.ports[0];  
		   port.onmessage = function(j) {
			   counter++;	    
			   var guid = j.data.guid;
			   var content = j.data.message;
			   var contribution = j.data.index;   
			   for (var i=0; i < connections.length; i++) {
		           connections[i].postMessage({
		        	   counter: counter,
		               message: "index",
		               guid: guid,
		               index: contribution
		           });           
		       }
		   }
		   port.start();
		   connections.push(port);		
		}
	}
	'''
}