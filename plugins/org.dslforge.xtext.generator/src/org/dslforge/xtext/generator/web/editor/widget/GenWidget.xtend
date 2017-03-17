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
package org.dslforge.xtext.generator.web.editor.widget

import org.dslforge.common.AbstractGenerator
import org.dslforge.common.IWebProjectFactory
import org.dslforge.xtext.generator.XtextGrammar
import org.eclipse.core.runtime.IProgressMonitor

class GenWidget extends AbstractGenerator {

	val JavaRelativePath = "/editor/widget/"
	val JsRelativePath = "/"
	var XtextGrammar grammar
	var String keywordList;

	override doGenerate(IWebProjectFactory factory, IProgressMonitor monitor) {
		grammar = factory.input as XtextGrammar
		projectName = grammar.getProjectName()
		grammarShortName = grammar.getShortName()
		basePath = grammar.getBasePath()
		keywordList = grammar.getKeywords(",", true)
		factory.generateFile("src-gen/"+ basePath + JavaRelativePath, grammarShortName + ".java", toJava(), monitor)
		factory.generateFile("src-js/"+ basePath + JsRelativePath, grammarShortName + ".js", toJavaScript(), monitor)
	}

	def toJava() '''
	«fileHeader»
	package «projectName».editor.widget;
	
	import java.util.ArrayList;
	import java.util.List;
	
	import org.dslforge.styledtext.BasicText;
	import org.eclipse.core.runtime.IPath;
	import org.eclipse.core.runtime.Path;
	import org.eclipse.rap.rwt.remote.Connection;
	import org.eclipse.rap.rwt.remote.RemoteObject;
	import org.eclipse.swt.widgets.Composite;
	
	public class «grammarShortName» extends BasicText {
		
		private static final long serialVersionUID = 1L;
		
		private static final String REMOTE_TYPE = "«projectName».editor.widget.«grammarShortName»";
		
		public «grammarShortName»(Composite parent, int style) {
			super(parent, style);
		}
		
		@Override
		protected RemoteObject createRemoteObject(Connection connection) {
			return connection.createRemoteObject(REMOTE_TYPE);
		}
		
		@Override 
		protected void setupClient() {
			super.setupClient();
			List<IPath> languageResources = new ArrayList<IPath>();
			languageResources.add(new Path("src-js/«basePath»/ace/theme-«grammarShortName.toLowerCase».js"));
			languageResources.add(new Path("src-js/«basePath»/ace/mode-«grammarShortName.toLowerCase».js"));
			languageResources.add(new Path("src-js/«basePath»/ace/worker-«grammarShortName.toLowerCase».js"));
			languageResources.add(new Path("src-js/«basePath»/ace/snippets/«grammarShortName.toLowerCase».js"));
			languageResources.add(new Path("src-js/«basePath»/parser/antlr-all-min.js"));
			languageResources.add(new Path("src-js/«basePath»/parser/«grammarShortName»Parser.js"));
			languageResources.add(new Path("src-js/«basePath»/parser/«grammarShortName»Lexer.js"));
			registerJsResources(languageResources, getClassLoader());
			loadJsResources(languageResources);
		}
	
		@Override
		protected ClassLoader getClassLoader() {
			ClassLoader classLoader = «grammarShortName».class.getClassLoader();
			return classLoader;
		}
	}
'''

	def toJavaScript() '''
	«fileHeader»
	(function() {
		rap.registerTypeHandler("«projectName».editor.widget.«grammarShortName»", {
			factory : function(properties) {
				return new «projectName».editor.widget.«grammarShortName»(properties);
			},
			destructor : "destroy",
			properties : [ "url", "text", "editable", "status", "annotations", "scope", "proposals", "font", "dirty", "markers", "background"],
			events : ["Modify", "TextChanged", "Save", "FocusIn", "FocusOut", "Selection", "CaretEvent", "ContentAssist"],
			methods : ["setSelection", "addMarker", "removeMarker", "clearMarkers", "insertText", "removeText", "setProposals", "moveCursorFileStart","moveCursorFileEnd"]
		});
		rwt.qx.Class.define("«projectName».editor.widget.«grammarShortName»", {
			extend :org.dslforge.styledtext.BasicText,
			construct : function(properties) {
				this.base(arguments, properties);
			},
			members : {
				createEditor : function() {
					var basePath = 'rwt-resources/src-js/org/dslforge/styledtext/ace';
					ace.require("ace/config").set("basePath", basePath);
					var workerPath = 'rwt-resources/src-js/«basePath»/ace';
					ace.require("ace/config").set("workerPath", workerPath);
					var themePath = 'rwt-resources/src-js/«basePath»/ace';
					ace.require("ace/config").set("themePath", themePath);
					var modePath = 'rwt-resources/src-js/«basePath»/ace';
					ace.require("ace/config").set("modePath", modePath);
					var editor = this.editor = ace.edit(this.element);
					if (editor != null) {
						var editable = this.editable;
						var guid = this.url;
			        	var self = this;
						ace.config.loadModule("ace/ext/language_tools", function (module) {
							editor.getSession().setMode("ace/mode/«grammarShortName.toLowerCase»");
							editor.getSession().id = self.url;	
				        	editor.setOptions({
					            enableBasicAutocompletion: true,
					            enableTextCompleter: false,
					            enableKeyWordCompleter: false,
					            enableSnippets: false,
							    useWorker: true,
				            });	
				        	self.langTools = ace.require("ace/ext/language_tools");
							self.serverCompleter = {
								getMode: function() {
									return editor.getSession().getMode();
								},
								getCompletions: function(editor, session, pos, prefix, callback) {
									self.onCompletionRequest(pos, prefix, callback);
								},
								getDocTooltip: function(item) {
							    	item.docHTML = ["<div class=\"ace_line\" style=\"height:12px\"><span class=\"", self.typeToIcon(item.meta),"\">&nbsp;</span><span class=\"ace_\">","<b>", item.caption, "</b>","</span><span class=\"ace_rightAlignedText\"></span></div>", "<hr></hr>", item.meta].join("");
								}
							};
				        	editor.setOption("enableServerCompleter", self.serverCompleter);
				        	self.completers = editor.completers;
							editor.setTheme("ace/theme/«grammarShortName.toLowerCase»");
							editor.setShowPrintMargin(false);
							editor.setBehavioursEnabled(true);
							editor.setWrapBehavioursEnabled(true);
							editor.setReadOnly(!editable);
							editor.setFontSize(12);
							editor.$blockScrolling = Infinity;
				        });
						//Session settings
						var session = editor.getSession();
						editor.getSession().setUseWrapMode(true);
					    editor.getSession().setTabSize(4);
					    editor.getSession().setUseSoftTabs(true);
						editor.getSession().getUndoManager().reset();
						//Text hover
						var TokenTooltip = ace.require("ace/ext/tooltip").TokenTooltip;
						editor.tokenTooltip = new TokenTooltip(editor);
						//Annotations
						if (this.annotations==null)	this.annotations=[];
						//Index
					 	index = this.scope;
					 	proposals = this.proposals;
					 	if (this.useSharedWorker) {
							if (typeof SharedWorker == 'undefined') {
									console.log("Your browser does not support Javascript shared workers, as a consequence some features will be disabled."
									+ "For a full-featured user experience, the following browsers are supported: Chrome, Firefox, Safari.");
								} else {
								var filePath = 'rwt-resources/src-js/org/dslforge/styledtext/global-index.js';
								var httpURL = this.computeWorkerPath(filePath);
								var worker = this.worker = new SharedWorker(httpURL);
								if (this.ready) {
									editor.on("change", function(event) {
										worker.port.postMessage({
											message: editor.getValue(),
									        guid: guid,
									        index: index
									    });
								    });
								}
								worker.port.onmessage = function(e) {
								 	index = e.data.index;
							    };
							}
					 	}
						editor.on("focus", function() {
					 		self.onFocus();
					 	});
					 	editor.on("blur", function() {
					 		self.onBlur();
					 	});
					 	editor.on("input", function() {
							if (!editor.getSession().getUndoManager().isClean())
								self.onModify();
					 	});
					 	editor.getSession().getSelection().on('changeCursor', function() {
					 	    self.onChangeCursor();
					 	});
						editor.commands.addCommand({
							name: 'saveFile',
							bindKey: {win: 'Ctrl-S', mac: 'Command-S', sender: 'editor|cli'},
							exec: function(env, args, request) {
								self.onSave();
							}
						});
					}
					//Done
			        this.onReady();
				},
				setScope : function(scope) {
					this.base(arguments, scope);
				},
				onCompletionRequest : function(pos, prefix, callback) {
					this.base(arguments, pos, prefix, callback);
				},
				setProposals : function(proposals) {
					this.proposals = proposals;
				},
				onFocus: function() {
					this.base(arguments);
				},
				onBlur: function() {
					this.base(arguments);
				},
				destroy : function() {
					this.base(arguments);
					this.langTools.resetOptions(this.editor);
				}
			}
		});
	}());
	'''
}
