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
package org.dslforge.xtext.generator.web

import org.dslforge.xtext.generator.IWebProjectGenerator
import org.dslforge.xtext.generator.util.GeneratorUtil
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.generator.IFileSystemAccess

class GenGlobalIndex implements IWebProjectGenerator{
	
	val EditorType type
	var defaultSlotName = "src-js"
	val relativePath = "/"
	var String projectName
	var String grammarShortName
	var String basePath
	var String keywordList
	var Grammar grammar
 
	new (EditorType type) {
		switch(this.type=type) {
			case ACE: defaultSlotName = "WebContent"
			case RAP: defaultSlotName="src-js"
		}
	}
	
	new() {
		this(EditorType.RAP)
	}
	
	override doGenerate(EObject input, IFileSystemAccess fsa) {
		grammar = input as Grammar
		if(type==EditorType.RAP) basePath=GeneratorUtil::getBasePath(grammar) else basePath="";
		projectName=GeneratorUtil::getProjectName(grammar)
		grammarShortName= GeneratorUtil::getGrammarShortName(grammar)
		keywordList = GeneratorUtil::getKeywords(grammar, ",", true)
		fsa.generateFile(basePath + relativePath +"global-index.js", defaultSlotName, toJavaScript())
	}
	
	def toJavaScript()'''
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

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}