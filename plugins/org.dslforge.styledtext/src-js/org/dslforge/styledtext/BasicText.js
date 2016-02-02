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
	rap.registerTypeHandler("org.dslforge.styledtext.BasicText", {
		factory : function(properties) {
			return new org.dslforge.styledtext.BasicText(properties);
		},
		destructor : "destroy",	 
		properties : [ "url", "text", "editable", "status", "annotations", "scope", "proposals", "font", "dirty", "markers", "background"],
		events : ["Modify", "TextChanged", "Save", "FocusIn", "FocusOut", "Selection", "CaretEvent", "ContentAssist"],
		methods : ["addMarker", "insertText", "removeText", "setProposals"]
	});

	rwt.qx.Class.define("org.dslforge.styledtext.BasicText", {
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
			completers: null,
			globalScope: null,
			selectionStart:0,
			selectionEnd:0,
			useSharedWorker:true,
			
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
				if (this._markers) {
					this.setMarkers(this._markers);
					delete this._markers;
				}
				if (this._backgroundColor) {
					this.setBackground(this._backgroundColor);
					delete this._backgroundColor;
				}
				if (this._scope) {
					this.setScope(this._scope);
					delete this._scope;
				}
				if (this._proposals) {
					this.setProposals(this._proposals);
					delete this._proposals;
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
				this.isFocused = true;
				var remoteObject = rap.getRemoteObject(this);
				if (remoteObject) {
					remoteObject.notify("FocusIn", { value : this.editor.getCursorPosition()});
					this.onChangeCursor();
				}
			},

			onChangeCursor: function() {
				var remoteObject = rap.getRemoteObject(this);
				if (remoteObject) {
					remoteObject.notify("CaretEvent", { value : this.editor.getCursorPosition()});
				}				
			},
			
			onBlur: function() {
				this.isFocused = false;
				var remoteObject = rap.getRemoteObject(this);
				if (remoteObject) {
					remoteObject.notify("FocusOut", { value : this.editor.getValue()});					
					var range = this.editor.getSelection().getRange();
					if (range.start.row != range.end.row || range.start.column !=range.end.column) {
						//there is a selection
						remoteObject.notify("Selection", {
							value: this.editor.getSession().doc.getTextRange(range),
							rowStart: range.start.row, 
							rowEnd: range.end.row,
							columnStart: range.start.column,
							columnEnd: range.end.column 
						});
					}
				}
			},

			onRender : function() {
				if (this.element.parentNode) {
					rap.off("render", this.onRender);
					this.createEditor();
					this.editor.on("instanceReady", this.onReady);
					rap.on("send", this.onSend);
				}
			},

			onSend : function() {
				//nothing to do.
			},
			
			onCompletionRequest : function(pos, prefix, callback) {
				var remoteObject = rap.getRemoteObject(this);
				if (remoteObject) {
					remoteObject.call("getProposals", { value : this.editor.getValue(), pos : pos, prefix : prefix});
				}
				var proposals = this._proposals==null?[]:this._proposals;		
			    var wordList = Object.keys(proposals);
			    callback(null, wordList.map(function(word) {
			          return {
			           	iconClass: " " + typeToIcon(word[0]),
			               name: word,
			               value: proposals[word],
			               score: 1,
			              meta: "[" + "keyword" + "]"
			          };
			      }));
			},
			
			onModify : function() {
				var remoteObject = rap.getRemoteObject(this);
				if (remoteObject && !this.initialContent) {
					remoteObject.notify("TextChanged", { value : this.editor.getValue()});
				} else {
					if (this.editable) {
						//initial setting, avoid notify back the server.
						this.initialContent=false;
						this.editor.getSession().getUndoManager().reset();		
					}
				}
			},
			
			getOffset: function(properties) {
				var row = properties.row;
				var column = properties.column;
				var offset = 0;
				for (i=0;i<row;i++) {
					offset+= this.editor.getSession().getLine(i).length;
				}
				return offset + column - 1;
			},

			onSave: function() {
				var remoteObject = rap.getRemoteObject(this);
				if (remoteObject && this.editable) {
					remoteObject.set("text",this.editor.getValue());
					remoteObject.notify("Save", { value : this.editor.getValue()});
				}
			},

			setUrl : function(url) {
				this._url = url;
			},	
			
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
					if (annotations.length>0) {
						this._annotations = [];
						//keep client-side annotations
						var editorAnnotations = this.editor.session.getAnnotations();
						for (var i = 0; i < editorAnnotations.length; i++) {
			   				if (!editorAnnotations[i].server) {
			   					this._annotations.push(editorAnnotations[i])
			   				}
			   			}
						//recompute server-side annotations
						for (var i = annotations.length; i--;) {
							var annotation = annotations[i];
							for (var key in annotation) {
								var positions = annotation[key].match(/\d+/g);
								if (key=="error")
									this._annotations.push({row:Math.max(positions[0]-1,0) ,column: 0, text: annotation[key], type:"error", server: true});
								else if (key=="warning")
									this._annotations.push({row:Math.max(positions[0]-1,0) ,column: 0, text: annotation[key], type:"warning", server: true});
								else if (key=="info")
									this._annotations.push({row:Math.max(positions[0]-1,0) ,column: 0, text: annotation[key], type:"info", server: true});
							}	
			           }
						this.editor.session.setAnnotations(this._annotations);
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
				} else {
					 this._scope = scope;	
				}
			},

			setProposals : function(proposals) {
				this._proposals = proposals;	
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

			setBackground : function(color) {
				if (this.ready) {
			        this._backgroundColor = color;
					ace.require("ace/lib/dom").importCssString('.ace-eclipse {\
						    background-color: rgb('+color.R+', '+color.G+', '+color.B+');\
						}');
				}
				else {
			        this._backgroundColor = color;
			    }
			},
			
			setDirty : function(dirty) {
				if (this.ready) {
					if (!dirty && this._editable) {
						this.editor.getSession().getUndoManager().markClean();
					}
				}
			},
			
			setMarkers : function(markers) {
				if (this.ready) {
					this._markers = markers;
					for (var i = this._markers.length; i--;) {
						var marker = this._markers[i];
						var Range = ace.require("ace/range").Range;
						var range = new Range(marker.rowStart, marker.rowEnd, marker.columnStart, marker.columnEnd);
						this.editor.getSession().addMarker(range, "ace_debug_line", "line");
						ace.require("ace/lib/dom").importCssString('.ace_debug_line {\
						    background-color: aquamarine;\
						    position: absolute;\
						}');
		           }
				}
				else {
			        this._markers = markers;
			    }
			},
			
			addMarker : function(marker) {
				if(this.editor) {
					var Range = ace.require("ace/range").Range;
					var range = new Range(marker.rowStart,marker.rowEnd,marker.columnStart,marker.columnEnd);	
					this.editor.getSession().addMarker(range,"ace_selected_word", "text");
					//this.editor.getSession().addMarker(range, "ace_debug_line", "line");
					ace.require("ace/lib/dom").importCssString('.ace_debug_line {\
					    background-color: aquamarine;\
					    position: absolute;\
					}');	
				}
			},

			insertText : function(properties) {
				if (this.editor) {
					var position = { row:properties.rowStart, column:properties.columnStart};
					var text = properties.text;
					this.editor.getSession().insert(position, text); //where position is an object of the form {row:number, column:number}
				}
			},

			removeText : function(properties) {
				if (this.editor) {			        
					var range = this.editor.getSelectionRange();
					if (range.start.row != range.end.row || range.start.column !=range.end.column) {
			            this.editor.getSession().remove(range);
			            this.editor.clearSelection();
			        }
				}
			},
			
			createEditor : function() {
				var editor = this.editor = ace.edit(this.element);
				var editable = this.editable;
				if (editor != null) {
					
					//set language mode
					editor.getSession().setMode("ace/mode/language");	
					
					//Set theme
					editor.setTheme("ace/theme/eclipse");
					
					//Default settings
					editor.getSession().setUseWrapMode(true);
				    editor.getSession().setTabSize(4);
				    editor.getSession().setUseSoftTabs(true);
					editor.getSession().getUndoManager().reset();
					editor.setShowPrintMargin(false);		 
					editor.setReadOnly(!editable);							
					editor.$blockScrolling = Infinity;
					
					//Load content assist module
					this.langTools = ace.require("ace/ext/language_tools");
					this.langTools.completers = [];
					
					//Set the Id of this editor
					var guid = this._url;
					
					//Initialize the global index
					if (this._scope==null)
						this._scope=[];
					
					//Initialize the completion proposals
					if (this._proposals==null) 
						this._proposals=[];
					
					var self = this;
					this.globalScope = {	
						getCompletions: function(editor, session, pos, prefix, callback) {
							self.onCompletionRequest(pos, prefix, callback);	
						}
					}
					//Add completer and enable content assist
					this.langTools.addCompleter(this.globalScope);			
					editor.setOptions({
					    enableBasicAutocompletion: true,
					    enableSnippets: true
					});
					
					//Add documentation hover
					var TokenTooltip = ace.require("ace/ext/tooltip").TokenTooltip;	
					editor.tokenTooltip = new TokenTooltip(editor);
				 	
				 	//Initialize the index
				 	index = this._scope;

				 	//Initialize the completion proposals
				 	proposals = this._proposals;
					
					if (this.useSharedWorker) {
						if (typeof SharedWorker == 'undefined') {	
							alert("Your browser does not support JavaScript Shared Workers.");
						} else {
							//create the shared worker
							var filePath = 'rwt-resources/src-js/org/dslforge/styledtext/global-index.js';
							var httpURL = computeWorkerPath(filePath);
							var worker = this.worker = new SharedWorker(httpURL);	 			
							editor.on("change", function(event) {					        
						        worker.port.postMessage({
						           	message: editor.getValue(), 
						           	guid: guid, 
						           	index: index
						        });
					        });											
						 	worker.port.onmessage = function(e) {
						 		//update the index reference
						 		index = e.data.index;
					        };	
					 	}
					}
					
				 	//On focus get event
					editor.on("focus", function() {
				 		self.onFocus();
				 	});
					
					//On focus lost event
				 	editor.on("blur", function() {
				 		self.onBlur();
				 	});
				 	
				 	//On input event
				 	editor.on("input", function() {
						if (!editor.getSession().getUndoManager().isClean())
							self.onModify();
				 	});
				 	
				 	//On mouse down event
				 	editor.on("mousedown", function() { 
				 	    // Store the Row/column values 
				 	}) 

				 	//On cursor move event
				 	editor.getSession().getSelection().on('changeCursor', function() { 
				 	    if (editor.$mouseHandler.isMousePressed)  {
				 	      // the cursor changed using the mouse
				 	    }
				 	    // the cursor changed
				 	    self.onChangeCursor();
				 	});
				 	editor.getSession().on('changeCursor', function() { 
				 	    if (editor.$mouseHandler.isMousePressed)  {
				 	      // remove last stored values 
				 	    }
				 	    // Store the Row/column values 
				 	}); 

				 	//On text change event
					editor.on("change", function(event) {					        
						//implement in subclasses						
			        });
					
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