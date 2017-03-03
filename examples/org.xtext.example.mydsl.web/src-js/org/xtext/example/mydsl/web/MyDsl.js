/**
 * @Generated
 */
(function() {
	rap.registerTypeHandler("org.xtext.example.mydsl.web.editor.widget.MyDsl", {
		factory : function(properties) {
			return new org.xtext.example.mydsl.web.editor.widget.MyDsl(properties);
		},
		destructor : "destroy",
		properties : [ "url", "text", "editable", "status", "annotations", "scope", "proposals", "font", "dirty", "markers", "background"],
		events : ["Modify", "TextChanged", "Save", "FocusIn", "FocusOut", "Selection", "CaretEvent", "ContentAssist"],
		methods : ["setSelection", "addMarker", "removeMarker", "clearMarkers", "insertText", "removeText", "setProposals", "moveCursorFileStart","moveCursorFileEnd"]
	});
	rwt.qx.Class.define("org.xtext.example.mydsl.web.editor.widget.MyDsl", {
		extend :org.dslforge.styledtext.BasicText,
		construct : function(properties) {
			this.base(arguments, properties);
		},
		members : {
			createEditor : function() {
				var basePath = 'rwt-resources/src-js/org/dslforge/styledtext/ace';
				ace.require("ace/config").set("basePath", basePath);
				var workerPath = 'rwt-resources/src-js/org/xtext/example/mydsl/web/ace';
				ace.require("ace/config").set("workerPath", workerPath);
				var themePath = 'rwt-resources/src-js/org/xtext/example/mydsl/web/ace';
				ace.require("ace/config").set("themePath", themePath);
				var modePath = 'rwt-resources/src-js/org/xtext/example/mydsl/web/ace';
				ace.require("ace/config").set("modePath", modePath);
				var editor = this.editor = ace.edit(this.element);
				if (editor != null) {
					var editable = this.editable;
					var guid = this.url;
					var self = this;
					//Language settings
			        ace.config.loadModule("ace/ext/language_tools", function (module) {
			        	var session = editor.getSession();
			        	session.id = self.url;
						session.setMode("ace/mode/mydsl");
						editor.setValue(self.text);
						editor.setOptions({
				            enableBasicAutocompletion: true,
				            enableTextCompleter: false,
				            enableKeyWordCompleter: true,
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
						editor.setTheme("ace/theme/mydsl");
			        });
					//Default settings
					editor.getSession().setUseWrapMode(true);
				    editor.getSession().setTabSize(4);
				    editor.getSession().setUseSoftTabs(true);
					editor.getSession().getUndoManager().reset();
					editor.setShowPrintMargin(false);
					editor.setBehavioursEnabled(true);
					editor.setWrapBehavioursEnabled(true);
					editor.setReadOnly(!editable);
					editor.$blockScrolling = Infinity;
					this.setFont(10);
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
