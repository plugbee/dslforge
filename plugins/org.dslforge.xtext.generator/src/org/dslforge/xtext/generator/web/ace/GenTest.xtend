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
package org.dslforge.xtext.generator.web.ace

import org.dslforge.xtext.generator.IWebProjectGenerator
import org.dslforge.xtext.generator.util.GeneratorUtil
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.generator.IFileSystemAccess

class GenTest implements IWebProjectGenerator{
	
	val relativePath = "/"
	var String projectName
	var String grammarShortName
	var String basePath
	var String keywordList
	var Grammar grammar
	
	override doGenerate(EObject input, IFileSystemAccess fsa) {
		grammar = input as Grammar
		projectName=GeneratorUtil::getProjectName(grammar)
		grammarShortName= GeneratorUtil::getGrammarShortName(grammar)
		basePath=GeneratorUtil::getBasePath(grammar)
		keywordList = GeneratorUtil::getKeywords(grammar, ",", true)
		fsa.generateFile(basePath + relativePath +"test.html", "src-js", toJavaScript())
	}
	
	def toJavaScript()'''
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>«grammarShortName» Web Editor</title>
    <style>
        #editor { 
                position: absolute;
                top: 50px;
                right: 10px;
                bottom: 10px;
                left: 10px;
            }
    </style>
</head>
<body>
	<button id="Reset">Reset index</button>

    <div id="editor">
    </div>

    <script src="ace/ace.js" type="text/javascript"></script>
    <script src="ace/theme-eclipse.js" type="text/javascript"></script>
    <script src="ace/ext-language_tools.js"></script>
    <script src="ace/mode-«grammarShortName.toLowerCase».js" type="text/javascript"></script>
    <script src="ace/worker-«grammarShortName.toLowerCase».js" type="text/javascript"></script>
   
    <script type="text/javascript">

  		var index = [];
	    var editor = ace.edit("editor");
	    editor.setTheme("ace/theme/eclipse");
	    editor.getSession().setMode("ace/mode/«grammarShortName.toLowerCase»");
        
	    //the guid associated to this editor
        var guid = Math.round(Math.random() * 1000);
    	
        var langTools = ace.require("ace/ext/language_tools");
	    var globalScope = {
	    		getCompletions: function(editor, session, pos, prefix, callback) {
	    	 	   for (var i=0; i < index.length; i++) {
	    			   if (index[i].indexOf(guid)>-1) {
	    				  index.splice(i, 1);
	    				  i--;
	    			   }
	    		   }	    	
	    	    	// remove the reference prefixes
		            for (var i=0;i<index.length;i++) {
		            	index[i] = index[i].substring(index[i].indexOf("#")+1, index[i].length);
		            }
		            var wordList = index;
	    	    	callback(null, wordList.map(function(word) {
		                return {
		                    name: word,
		                    value: word,
		                    score: 1,
		                    meta: "global"
		                };
		            }));
	    	    }   
	        }
	    langTools.addCompleter(globalScope);
	    
	    editor.setOptions({
		    enableBasicAutocompletion: true
		});
		
		//use --allow-file-access-from-files
	    var fileURL = 'global-index.js';
	    
	    //create the shared worker
	 	var worker = new SharedWorker(fileURL);
	 	
	 	worker.port.onmessage = function(e) {
	 		console.log(
	 			"call number: " + e.data.counter + "\n"+
	 			"message: " + e.data.message + "\n" +
	 			"editor Id: " + e.data.guid + "\n" +
	 			"index: " + e.data.index
	 		);
	 		//update the index reference
	 		index = e.data.index;
        };   
	 		 	
	 	//TODO: validate references against index on focus
	 	editor.on("focus", function() {
	 		//validate cross references
	    	/*
	    	editor.getSession().setAnnotations([{
				row: 1,
				column: 1,
				text: "hello",
				type: "error"
			}]);*/
	 	});
	 		 	
	    editor.on("change", function() {
        	var splitRegex = /[^a-zA-Z_0-9\$\-]+/;
        	var session = editor.getSession();
        	var words = session.getValue().split(splitRegex);
        	//Remove keywords from the list
            var keywords = [«keywordList»];
            var filtered = [];
            var found = false;
            var k = 0;
        	for (var i=0; i<words.length;i++) {
        		if (words[i].length>0){
        			for (var j=0; j<keywords.length;j++) {
        				if (words[i]==keywords[j]) {
        					found=true;
        				}
        			}
        			if (!found) {
            			//Append the editor id to the ID
            			filtered[k] = guid + "#" + words[i];
            			k++;
        			}
        		}
    			found=false;
        	}
            worker.port.postMessage({
            	message: editor.getValue(), 
            	guid: guid, 
            	index: filtered
            	});
        });
        
        //TODO: manual flushing of the index
        $("#Reset").on('click', function() { 	
        	var splitRegex = /[^a-zA-Z_0-9\$\-]+/;
        	var session = editor.getSession();
        	var words = session.getValue().split(splitRegex);
            worker.port.postMessage({
            	message: editor.getValue(), 
            	guid: guid, 
            	index: []
            	});
        });

    </script>
</body>
</html>
	'''

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}