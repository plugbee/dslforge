/**
 * <copyright>
 *
 * Copyright (c) 2017 PlugBee. All rights reserved.
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
		methods : ["setSelection", "addMarker", "removeMarker", "clearMarkers", "insertText", "removeText", "setProposals", "moveCursorFileStart","moveCursorFileEnd"]
	});

	rwt.qx.Class.define("org.dslforge.styledtext.BasicText", {
		extend : rwt.widgets.Composite,
		construct : function(properties) {
			this.base(arguments);
			bindAll(this, [ "layout", "onReady", "onSend", "onRender" ]);
			this.parent = rap.getObject(properties.parent);
			var area = this.parent.getClientArea();			
			this.element = document.createElement("pre");
			this.element.id = "editor";
			this.element.style.position = "absolute";
			this.element.style.left = area[0] + "px";
			this.element.style.top = area[1] + "px";
			this.element.style.width = area[2] + 'px';
			this.element.style.height = area[3] + 'px';
			this.parent.append(this.element);
			this.flush();
			this.parent.addListener("Resize", this.layout);	
			rap.on( "render", this.onRender);
		},

		destruct : function() {
			rap.off("send", this.onSend);
			this.editor.destroy();
			if(this.element.parentNode)
				this.element.parentNode.removeChild(this.element);
		},
		
		members : {
			ready: false,
			editor: null,
			editable: true,
			selection: null,
			isFocused: false,
			initialContent: true,
			langTools: null,
			annotations: [],
			markers: [],
			scope: [],
			proposals: [],
			completers: null,
			backendCompleter: null,
			useSharedWorker: true,
			
			onReady : function() {
				this.ready = true;
				this.layout();				
				if (this.url) {
					this.setUrl(this.url);
					delete this.url;
				}
				if (this.editable) {
					this.setEditable(this.editable);
					delete this.editable;
				}
				if (this.text) {
					this.editor.setValue(this.text);
					this.editor.clearSelection(); 
					this.editor.getSelection().moveCursorFileStart();
					delete this.text;
				}
				if (this.font) {
					this.setFont(this.font);
					delete this.font;
				}
				if (this.url) {
					this.setUrl(this.url);
					delete this.url;
				}
				if (this.selection) {
					this.setSelection(this.selection);
					delete this.selection;
				}
				if (this.annotations) {
					this.setAnnotations(this.annotations);
					delete this.annotations;
				}
				if (this.markers) {
					this.setMarkers(this.markers);
					delete this.markers;
				}
				if (this.backgroundColor) {
					this.setBackground(this.backgroundColor);
					delete this.backgroundColor;
				}
				if (this.scope) {
					this.setScope(this.scope);
					delete this.scope;
				}
				if (this.proposals) {
					this.setProposals(this.proposals);
					delete this.proposals;
				}
			},

			destroy : function() {
				rap.off("send", this.onSend);
				this.editor.destroy();
				this.element.parentNode.removeChild(this.element);
			},
			
			onAppear: function() {},

			onFocus: function() {
				this.isFocused = true;
				var remoteObject = rap.getRemoteObject(this);
				if (remoteObject) {
					remoteObject.notify("FocusIn", { value : this.editor.getCursorPosition()});
					this.onChangeCursor();
				}
			},
			
			onBlur: function() {
				this.isFocused = false;
				var remoteObject = rap.getRemoteObject(this);
				if (remoteObject) {
					remoteObject.notify("FocusOut", { value : this.editor.getValue()});					
					var range = this.editor.getSelection().getRange();
					if (range.start.row != range.end.row || range.start.column !=range.end.column) {
						remoteObject.notify("Selection", {
							value: this.editor.getSession().doc.getTextRange(range),
							rowStart: range.start.row, 
							rowEnd: range.end.row,
							columnStart: range.start.column,
							columnEnd: range.end.column 
						});
					}
				}
				this.proposals= [];
			},

			onRender : function() {
				if (this.element.parentNode) {
					rap.off("render", this.onRender);
					this.createEditor();
					this.editor.on("instanceReady", this.onReady);
					rap.on("send", this.onSend);
				}
			},

			onSend : function() {},
			
			onChangeCursor: function() {
				var remoteObject = rap.getRemoteObject(this);
				if (remoteObject) {
					remoteObject.notify("CaretEvent", { value : this.editor.getCursorPosition()});
				}				
			},

			onCompletionRequest : function(pos, prefix, callback) {
				if (this.isFocused) {
					var remoteObject = rap.getRemoteObject(this);
					if (remoteObject) {
						remoteObject.call("getProposals", { value : this.editor.getValue(), pos : pos, prefix : prefix});
					}	
					var proposals = this.proposals;		
			        var wordList = Object.keys(proposals);
			        var self = this;
			        callback(null, wordList.map(function(word) {
			            return {
			            	iconClass: " " + self.typeToIcon(proposals[word].type),
			                name: word,
			                value: proposals[word].replacement,
			                score: 1,
			                meta: "[" + proposals[word].type + "]"
			            };
			        }));	
				}
			},
			
			onModify : function() {
				var remoteObject = rap.getRemoteObject(this);
				if (remoteObject && !this.initialContent) {
					remoteObject.notify("TextChanged", { value : this.editor.getValue()});
				} else {
					if (this.editable) {
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
				this.url = url;
			},	
			
			setText : function(text) {
				if (this.ready) {
					this.editor.setValue(text);	
					this.editor.clearSelection(); 
					this.editor.getSelection().moveCursorFileStart();
				}
				else {
			        this.text = text;
			    }
			},
		
			setEditable : function(editable) {
			   	if (this.ready) {
			   		this.editable = editable;
			   		this.editor.setReadOnly(!editable);
				} else {
					this.editable = editable;
				}
			},
			
			setSelection : function(selection) {
				if (this.ready) {
					var Range = ace.require("ace/range").Range;		
					var range = new Range(selection.rowStart, selection.rowEnd, selection.columnStart, selection.columnEnd);
					this.editor.getSelection().setSelectionRange(range);
				}
				else {
			        this.selection = selection;
			    }
			},
			
			setStatus : function(status) {
			   	if (this.ready) {
			   		if (this.status=="invalid") {
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
					this.status = status;
				}
			},

			setAnnotations : function(newAnnotations) {
				if (this.ready) {
					//remove old server annotations
					var annotations = this.editor.session.getAnnotations();
					for (var i = annotations.length; i--;) {
						annotations.pop(annotations[i]);
					}
					//add new server annotations
					if (newAnnotations.length>0) {	
						for (var i = newAnnotations.length; i--;) {
							var annotation = newAnnotations[i];
							for (var key in annotation) {
								var positions = annotation[key].match(/\d+/g);
								if (key=="ERROR")
									annotations.push({row:Math.max(positions[0]-1,0) ,column: 0, text: annotation[key], type:"error", server: true});
								else if (key=="WARNING")
									annotations.push({row:Math.max(positions[0]-1,0) ,column: 0, text: annotation[key], type:"warning", server: true});
								else if (key=="INFO")
									annotations.push({row:Math.max(positions[0]-1,0) ,column: 0, text: annotation[key], type:"info", server: true});
							}
						}
						this.editor.session.setAnnotations(annotations);
					}
				} else {
					this.annotations = newAnnotations;
				}
			},

			setScope : function(scope) {
				if (this.ready) {
					this.scope = scope;	
			    	if(this.worker!=null) {
			        	this.worker.port.postMessage({
			            	message: this.editor.getValue(), 
			            	guid: this.url, 
			            	index: this.scope
			            });     
			    	}	
				} else {
					 this.scope = scope;	
				}
			},

			setProposals : function(proposals) {
				this.proposals = proposals;	
			},

			setFont : function(font) {
				if (this.ready) {
					this.editor.setOptions({
						fontFamily: "Menlo, monospace",
						fontSize: font + "pt"
					});
				}
				else {
			        this.font = font;
			    }
			},

			setBackground : function(color) {
				if (this.ready) {
			        this.backgroundColor = color;
					ace.require("ace/lib/dom").importCssString('.ace-eclipse {\
						    background-color: rgb('+color.R+', '+color.G+', '+color.B+');\
						}');
				}
				else {
			        this.backgroundColor = color;
			    }
			},
			
			setDirty : function(dirty) {
				if (this.ready) {
					if (!dirty && this.editable) {
						this.editor.getSession().getUndoManager().markClean();
					}
				}
			},

			clearMarkers : function(markers) {
				if (this.ready) {
					var markers = this.editor.getSession().getMarkers(false);					 
			        Object.keys(markers).forEach(function(key) {
			        	if (markers[key].clazz ==="ace_debug_line")
							this.editor.getSession().removeMarker(markers[key].id);
			        }, this);
				}
			},
			
			setMarkers : function(markers) {
				if (this.ready) {					
					this.markers = markers;
					for (var i = this.markers.length; i--;) {
						var marker = this.markers[i];
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
			        this.markers = markers;
			    }
			},
			
			addMarker : function(marker) {
				if(this.ready) {
					var Range = ace.require("ace/range").Range;
					var range = new Range(marker.rowStart,0,marker.columnStart,1);	
					this.editor.getSession().addMarker(range, "ace_debug_line", "fullLine");					
					ace.require("ace/lib/dom").importCssString('.ace_debug_line {\
					    background-color: aquamarine;\
					    position: absolute;\
					}');	
				}
			},
			
			removeMarker : function(marker) {
				if (this.ready) {
					var markers = this.editor.getSession().getMarkers(false);					 
			        Object.keys(markers).forEach(function(key) {
			        	if (markers[key].id === marker.id)
			        		this.editor.getSession().removeMarker(markers[key].id);
			        }, this);
				}
			},

			insertText : function(properties) {
				if (this.ready) {
					var position = { row:properties.rowStart, column:properties.columnStart};
					var text = properties.text;
					this.editor.getSession().insert(position, text);
				}
			},

			removeText : function(properties) {
				if (this.ready) {			        
					var range = this.editor.getSelectionRange();
					if (range.start.row != range.end.row || range.start.column !=range.end.column) {
			            this.editor.getSession().remove(range);
			            this.editor.clearSelection();
			        }
				}
			},
			
			moveCursorFileStart : function(properties) {
				if (this.ready) {		
					this.editor.getSelection().moveCursorFileStart();
				}
			},
			
			moveCursorFileEnd : function(properties) {
				if (this.ready) {		
					this.editor.getSelection().moveCursorFileEnd();
				}
			},
			
			createEditor : function() {
				var basePath = 'rwt-resources/src-js/org/dslforge/styledtext/ace';
				ace.require("ace/config").set("basePath", basePath);
				var workerPath = 'rwt-resources/src-js/org/dslforge/styledtext/ace';
				ace.require("ace/config").set("workerPath", workerPath);
				var themePath = 'rwt-resources/src-js/org/dslforge/styledtext/ace';
				ace.require("ace/config").set("themePath", themePath);
				var modePath = 'rwt-resources/src-js/org/dslforge/styledtext/ace';
				ace.require("ace/config").set("modePath", modePath);
				var editor = this.editor = ace.edit(this.element);
				if (editor != null) {
					var editable = this.editable;
					var guid = this.url;	
			        ace.config.loadModule("ace/ext/language_tools", function (module) {
						editor.setTheme("ace/theme/basic");
			        	editor.setOptions({
				            enableBasicAutocompletion: false,
				            enableTextCompleter: false,
				            enableSnippets: false,
						    useWorker: false
			            });
			        });
					editor.setShowPrintMargin(false);
					editor.setBehavioursEnabled(true);
					editor.setWrapBehavioursEnabled(true);
					editor.setReadOnly(!editable);							
					editor.$blockScrolling = Infinity;				
					editor.setFontSize(12);
					editor.getSession().setUseWrapMode(true);
				    editor.getSession().setTabSize(4);
				    editor.getSession().setUseSoftTabs(true);
					editor.getSession().getUndoManager().reset();
					//initialize if server not ready
					if (this.annotations==null) this.annotations=[];
					if (this.scope==null) this.scope=[];
					if (this.proposals==null) this.proposals=[];
					var self = this;
				 	//Index
				 	index = this.scope;
				 	proposals = this.proposals;	
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
			},
			
			computeWorkerPath : function (path) {
				//Remove domain name and rebuild path
				path = path.replace(/^[a-z]+:\/\/[^\/]+/, "");
		        path = location.protocol + "//" + location.host
		            + (path.charAt(0) == "/" ? "" : location.pathname.replace(/\/[^\/]*$/, ""))
		            + "/" + path.replace(/^[\/]+/, "");
		        return path;
		    },
		    
			typeToIcon : function(item) {
				var type = item;
				if (item.type) type = item.type;
				if (item.meta) type = item.meta;
				var cls = "ace-";
				var suffix;
				if (type.indexOf("[") ==0  && type.indexOf("]") == type.length-1)
					type = type.substring(1, type.length-1);	
				var typeToHex = function(type) {
				    var hex = '';
				    for(var i=0;i<type.length;i++)
				        hex += ''+type.charCodeAt(i).toString(16);
				    var color  = '#' + ("000000" + hex.slice(2, 8).toUpperCase()).slice(-6);
				    return color;
				};
				var typeToColor = function(type) {
					if (type==="keyword")
						return "#78002D";
					if (type==="identifier")
						return "#c66";
					if (type==="snippet")
						return 	"#9ACD32";
					var hash = 0;
					for (var i = 0; i < type.length; i++)
						hash = type.charCodeAt(i) + ((hash << 5) - hash);
					var color = '#';
					for (var i = 0; i < 3; i++) {
						var value = (hash >> (i * 8)) & 0xFF;
						color += ('00' + value.toString(16)).substr(-2);
					}
					return color;
				};
				var cssClass = ".ace-completion-" + type + ":before { content:'" + type.charAt(0).toUpperCase() + "'; background: " + typeToColor(type) + "; }";
				ace.require("ace/lib/dom").importCssString(cssClass);
				return cls + "completion " + cls + "completion-" + type;
			}
		}
	});

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
    
}());