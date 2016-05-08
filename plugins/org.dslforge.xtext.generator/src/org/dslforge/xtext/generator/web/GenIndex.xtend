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

import org.dslforge.common.AbstractGenerator
import org.dslforge.common.IWebProjectFactory
import org.dslforge.xtext.generator.XtextGrammar
import org.eclipse.core.runtime.IProgressMonitor

class GenIndex extends AbstractGenerator {

	var XtextGrammar grammar

	new() {
		defaultSlotName = "src-js"
		relativePath = "/"
	}

	override doGenerate(IWebProjectFactory factory, IProgressMonitor monitor) {
		grammar = factory.input as XtextGrammar
		basePath = grammar.getBasePath()
		projectName = grammar.getProjectName()
		grammarShortName = grammar.getShortName()
		factory.generateFile(defaultSlotName + basePath + relativePath, "index.html", toJavaScript(), monitor)
	}

	def toJavaScript() '''
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
    <div id="editor">
    </div>
    <script src="global-index.js" type="text/javascript"></script>
    <script src="ace/ace.js" type="text/javascript"></script>
    <script src="ace/theme-eclipse.js" type="text/javascript"></script>
    <script src="ace/ext-language_tools.js"></script>
    <script src="ace/ext-tooltip.js"></script>
    <script src="ace/ext-searchbox.js"></script>
    <script src="ace/snippets/«grammarShortName.toLowerCase».js" type="text/javascript"></script>
    <script src="ace/mode-«grammarShortName.toLowerCase».js" type="text/javascript"></script>
    <script src="ace/worker-«grammarShortName.toLowerCase».js" type="text/javascript"></script>
    <script type="text/javascript">
    	//the guid associated to this editor
    	var guid = Math.round(Math.random() * 1000);
  		var index = [];
	    var editor = ace.edit("editor");
		editor.getSession().setUseWrapMode(true);
	    editor.getSession().setTabSize(4); 
	    editor.getSession().setUseSoftTabs(true);
		editor.getSession().getUndoManager().reset();
		
		editor.setShowPrintMargin(false);		 
		editor.setReadOnly(false);			
	    editor.setFontSize(14);   
	    editor.setTheme("ace/theme/eclipse");
	    editor.getSession().setMode("ace/mode/«grammarShortName.toLowerCase»");
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
		    enableBasicAutocompletion: true,
		    enableSnippets: true
		});
		
		//add documentation hover
		var TokenTooltip = ace.require("ace/ext/tooltip").TokenTooltip;	
		editor.tokenTooltip = new TokenTooltip(editor);		 	

	    //create the shared worker
	 	var worker = new SharedWorker("global-index.js");
	 	//"C:\Program Files (x86)\Google\Chrome\Application\chrome.exe" --allow-file-access-from-files
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

	 	//on focus get
		editor.on("focus", function() {
	 		
	 	});
		
		//on focus lost
	 	editor.on("blur", function() {
	 		
	 	});
	 	
	 	//on input
	 	editor.on("input", function() {

	 	});
	 	
	 	//on change
		editor.on("change", function(event) {					        
	        //console.log("posting message: index: " + index);
	        worker.port.postMessage({
	           	message: editor.getValue(), 
	           	guid: guid, 
	           	index: index
	        });
	        
	        index = [];
        });											
	 	worker.port.onmessage = function(e) {
	 		//update the index reference
	 		index = e.data.index;
        };
        
		//Bind keyboard shorcuts
		editor.commands.addCommand({
			name: 'saveFile',
			bindKey: {
			win: 'Ctrl-S',
			mac: 'Command-S',
			sender: 'editor|cli'
			},
			exec: function(env, args, request) {
				//TODO
			}
		});
    </script>
</body>
</html>
	'''
}
