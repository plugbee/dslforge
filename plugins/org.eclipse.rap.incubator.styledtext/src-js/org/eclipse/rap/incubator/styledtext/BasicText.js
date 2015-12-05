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
(function() {
	rap.registerTypeHandler("org.eclipse.rap.incubator.styledtext.BasicText", {
		factory : function(properties) {
			return new org.eclipse.rap.incubator.styledtext.BasicText(properties);
		},
		destructor : "destroy",	 
		properties : [ "url", "text", "editable", "status", "annotations", "scope", "font", "dirty" ],
		events : ["Modify", "TextChanged", "Save", "FocusIn", "FocusOut"],
		methods : ["addMarker"]
	});

	rwt.qx.Class.define("org.eclipse.rap.incubator.styledtext.BasicText", {
		extend : rwt.widgets.Composite,
		construct : function(properties) {
			this.base(arguments);
			bindAll(this, [ "layout", "onReady", "onSend", "onRender" ]);
			this.parent = rap.getObject(properties.parent);
			this.element = document.createElement( "pre" );
			this.element.id = "editor";
			this.element.style.position = "absolute";
			var area = this.parent.getClientArea();
			this.element.style.left = area[0] + "px";
			this.element.style.top = (area[1]-10) + "px";
			this.element.style.width = area[2] + 'px';
			this.element.style.height = (area[3]-5) + 'px';
			this.parent.append(this.element);
			this.flush();
			this.parent.addListener("Resize", this.layout);	
			rap.on( "render", this.onRender);
		},

		destruct : function() {
			rap.off("send", this.onSend);
			this.editor.destroy();
			this.langTools = null;
			this.element.parentNode.removeChild(this.element);
		},
		
		members : {
			ready: false,
			editor: null,
			editable: true,
			isFocused: false,
			initialContent: true,
			useCompleter: false,
			langTools: null,
			globalScope: null,
			
			onReady : function() {
				this.ready = true;
				this.layout();
				if (this._url) {
					this.setUrl(this._url);
					delete this._url;
				}
				if (this._editable) {
					this.setEditable(this._editable);
					delete this._editable;
				}
				if (this._text) {
					this.editor.setValue(this._text);
					this.editor.clearSelection(); 
					this.editor.getSelection().moveCursorFileStart();
					delete this._text;
				}
				if (this._font) {
					this.setFont(this._font);
					delete this._font;
				}
				if (this._status) {
					this.setStatus(this._status);
					delete this._status;
				}
				if (this._annotations) {
					this.setAnnotations(this._annotations);
					delete this._annotations;
				}
				if (this._scope) {
					this.setScope(this._scope);
					delete this._scope;
				}
			},

			destroy : function() {
				rap.off("send", this.onSend);
				this.editor.destroy();
				this.element.parentNode.removeChild(this.element);
			},
			
			onAppear: function() {
				//nothing to do.
			},

			onFocus: function() {
				var remoteObject = rap.getRemoteObject(this);
				if (remoteObject) {
					remoteObject.notify("FocusIn", { value : this.editor.getValue()});
				}
			},

			onBlur: function() {
				var remoteObject = rap.getRemoteObject(this);
				if (remoteObject) {
					remoteObject.notify("FocusOut", { value : this.editor.getValue()});
				}
			},

			onRender : function() {
				if (this.element.parentNode) {
					rap.off("render", this.onRender);
					this.addEditor();
					this.editor.on("instanceReady", this.onReady);
					rap.on("send", this.onSend);
				}
			},

			onSend : function() {
				//nothing to do.
			},
			
			onModify : function() {
				var remoteObject = rap.getRemoteObject(this);
				if (remoteObject && !this.initialContent) {
					remoteObject.notify("TextChanged");
				} else {
					if (this.editable) {
						//initial setting, avoid notify back the server.
						this.initialContent=false;
						this.editor.getSession().getUndoManager().reset();		
					}
				}
			},

			onSave: function() {
				var remoteObject = rap.getRemoteObject(this);
				if (remoteObject && this.editable) {
					remoteObject.set("text",this.editor.getValue());
					remoteObject.notify("Save", { value : this.editor.getValue()});
				}
			},

			//TODO: cache issue: http://stackoverflow.com/questions/4390134/failed-to-load-resource-under-chrome
			setText : function(text) {
				if (this.ready) {
					this.editor.setValue(text);	
					this.editor.clearSelection(); 
					this.editor.getSelection().moveCursorFileStart();
				}
				else {
			        this._text = text;
			    }
			},
		
			setEditable : function(editable) {
			   	if (this.ready) {
			   		this._editable = editable;
			   		this.editor.setReadOnly(!editable);
				} else {
					this._editable = editable;
				}
			},
			
			setStatus : function(status) {
			   	if (this.ready) {
			   		if (this._status=="invalid") {
			   			var annotations = this.editor.session.getAnnotations();
			   			var filtered = [];
			   			this.editor.session.clearAnnotations();
			   			for (var i = 0; i < annotations.length; i++) {
			   				var annotation = annotations[i];
			   				var type = annotation.type;
			   				if (type != "warning") {
			   					filtered.push(annotation)
			   				}
			   			}
			   			this.editor.session.setAnnotations(filtered);
			   		}
				} else {
					this._status = status;
				}
			},

			setAnnotations : function(annotations) {
				if (this.ready) {
					if (annotations) {
						this._annotations = annotations;
						var editorAnnotations = this.editor.session.getAnnotations();
						for (var i = this._annotations.length; i--;) {
							var annotation = this._annotations[i];
							for (var key in annotation) {
								var positions = annotation[key].match(/\d+/g);
								if (key=="error")
									editorAnnotations.push({row:Math.max(positions[0]-1,0) ,column: 0, text: annotation[key], type:"error", server: true});
								else if (key=="warning")
									editorAnnotations.push({row:Math.max(positions[0]-1,0) ,column: 0, text: annotation[key], type:"warning", server: true});
								else if (key=="info")
									editorAnnotations.push({row:Math.max(positions[0]-1,0) ,column: 0, text: annotation[key], type:"info", server: true});
							}	
			           }
						this.editor.session.setAnnotations(editorAnnotations);
					} else {
						 this.editor.session.clearAnnotations();
					}
				} else {
					this._annotations = annotations;
				}
			},

			setScope : function(scope) {
				if (this.ready) {
					this._scope = scope;	
			    	if(this.worker!=null) {
			        	this.worker.port.postMessage({
			            	message: this.editor.getValue(), 
			            	guid: this._url, 
			            	index: this._scope
			            });     
			    	}	
				}else {
					 this._scope = scope;	
				}
			},
			
			setUrl : function(url) {
				this._url = url;
			},	

			//'Monaco', 'Menlo', 'Ubuntu Mono', 'Consolas', 'source-code-pro'
			//font = 14px Verdana, "Lucida Sans", Arial, Helvetica, sans-serif
			setFont : function(font) {
				if (this.ready) {
					this.editor.setOptions({fontFamily: "Menlo, monospace"});
					this.editor.setFontSize(16);
				}
				else {
			        this._font = font;
			    }
			},
			
			setDirty : function(dirty) {
				if (this.ready) {
					if (!dirty && this._editable) {
						this.editor.getSession().getUndoManager().markClean();
					}
				}
			},
			
			addMarker : function() {
				console.log("adding marker");
				if(this.editor) {

					
//					var aceRange = require('ace/range').Range;
//					editor.session.addMarker(new aceRange(0,1,2,10), "some_custom_class", "line");
//					require("ace/lib/dom").importCssString('.some_custom_class {\
//					    background-color: aquamarine;\
//					    position: absolute;\
//					}')
					
					//var marker = this.editor.getSession().addMarker(range,"ace_selected_word", "text");
					
						
				}
			},
			
			addEditor : function() {
				var guid = this._url;
				var editor = this.editor = ace.edit(this.element);
				var editable = this.editable;
				
				
				if (editor != null) {					
					editor.setTheme("ace/theme/eclipse");				
					editor.getSession().setUseWrapMode(true);
				    editor.getSession().setTabSize(4);
				    editor.getSession().setUseSoftTabs(true);
					editor.getSession().getUndoManager().reset();
					editor.setShowPrintMargin(false);		 
					editor.setReadOnly(!editable);
										
					editor.$blockScrolling = Infinity;
					
					//bind content assist
					this.langTools = ace.require("ace/ext/language_tools");
					this.langTools.completers = [];
					
					//initialize the index
					var index = this._scope;
					if(index!=null) {
						this.globalScope = {	
							getCompletions: function(editor, session, pos, prefix, callback) {
								var completions = [];
								for (var i = index.length; i--;) {
									var reference = index[i];
							        completions.push({ iconClass: " " + typeToIcon(reference),
							        name: reference, value: reference, score: 1, meta: "reference"
							        });	
					           }
						       callback(null, completions);
							}
						}
						//Add completer and enable content assist
						this.langTools.addCompleter(this.globalScope);
						
						editor.setOptions({
						    enableBasicAutocompletion: true,
						    enableSnippets: true
						});
						
						//FIXME: completers are not relased for some reason
						completers = editor.completers.length;
						//if (completers>4) {
						//	this.langTools.removeCompleter(this.globalScope);
						//}
					}					
					
					//add documentation hover
					var TokenTooltip = ace.require("ace/ext/tooltip").TokenTooltip;	
					editor.tokenTooltip = new TokenTooltip(editor);
		 	
					var Range = ace.require("ace/range").Range;
					var range = new Range(1, 1, 2, 6);
					//this.editor.getSession().addMarker(new Range(1,0,1,2),"ace_active-line","fullLine");
					this.editor.getSession().addMarker(new Range(4,0,0,0), "some_custom_class", "line");
					ace.require("ace/lib/dom").importCssString('.some_custom_class {\
					    background-color: aquamarine;\
					    position: absolute;\
					}')
					
					//Get this
					var self = this;
					
					//Handle the global index
					if (typeof SharedWorker == 'undefined') {	
						alert("Your browser does not support JavaScript shared workers.");
					} else {
						//Compute worker's http URL
						var filePath = 'rwt-resources/src-js/org/eclipse/rap/incubator/styledtext/global-index.js';
						var httpURL = computeWorkerPath(filePath);
						//Create the index
						var worker = this.worker = new SharedWorker(httpURL);	 	
						
					 	//init the index
					 	index = this._scope;
					 	
					 	//on focus get
						editor.on("focus", function() {
					 		this._isFocused=true;
					 		self.onFocus();
					 		
					 	});
						
						//on focus lost
					 	editor.on("blur", function() {
					 		this._isFocused=false;
					 		self.onBlur();
					 	});
					 	
					 	//on input
					 	editor.on("input", function() {
							if (!editor.getSession().getUndoManager().isClean())
								self.onModify();
//					        var delta = event.data;
//					        var range = delta.range;
//					        if(range.start.row !== range.end.row) 
//					        	return;
//					        var lengthDiff;
//					        if(delta.action === "insertText") {
//					        	lengthDiff = range.end.column - range.start.column;
//					        }
//				            else if(delta.action === "removeText") {
//				            	lengthDiff = range.start.column - range.end.column;
//				            }
//					        if (lengthDiff>0)
//					        	self.onModify();
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
					}

					//Bind keyboard shorcuts
					editor.commands.addCommand({
						name: 'saveFile',
						bindKey: {
						win: 'Ctrl-S',
						mac: 'Command-S',
						sender: 'editor|cli'
						},
						exec: function(env, args, request) {
							self.onSave();
						}
					});
					
					//Done
			        this.onReady();
				}
			},

			flush : function(inResponse) {
				if (inResponse) {
					rwt.remote.EventUtil.setSuspended(true);
					rwt.widgets.base.Widget.flushGlobalQueues();
					rwt.remote.EventUtil.setSuspended(false);
				} else {
					rwt.widgets.base.Widget.flushGlobalQueues();
				}	
			},

			layout : function() {
				if (this.ready) {
					var area = this.parent.getClientArea();
					this.element.style.left = area[0] + "px";
					this.element.style.top = (area[1]-10) + "px";
					this.element.style.width = area[2] + 'px';
					this.element.style.height = (area[3]-5) + 'px';
					this.editor.resize();
				}
			}
		}
	});

	var typeToIcon = function(type) {
		var cls = "ace-";
		var suffix;
		if (type == "?") suffix = "unknown";
		else if (type == "number" || type == "string" || type == "bool") suffix = type;
		else if (/^fn\(/.test(type)) suffix = "fn";
		else if (/^\[/.test(type)) suffix = "array";
		else suffix = "object";
		return cls + "completion " + cls + "completion-" + suffix;
	};

	var bind = function(context, method) {
		return function() {
			return method.apply(context, arguments);
		};
	};

	var bindAll = function(context, methodNames) {
		for ( var i = 0; i < methodNames.length; i++) {
			var method = context[methodNames[i]];
			context[methodNames[i]] = bind(context, method);
		}
	};

	var async = function(context, func) {
		window.setTimeout(function() {
			func.apply(context);
		}, 0);
	};

	var computeWorkerPath = function (path) {
        path = path.replace(/^[a-z]+:\/\/[^\/]+/, ""); // Remove domain name and rebuild path
        path = location.protocol + "//" + location.host
            + (path.charAt(0) == "/" ? "" : location.pathname.replace(/\/[^\/]*$/, ""))
            + "/" + path.replace(/^[\/]+/, "");
        return path;
    };
    
}());