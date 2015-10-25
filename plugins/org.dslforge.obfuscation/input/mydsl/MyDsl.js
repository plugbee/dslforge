//minify using as YUI Compressor, Google Closure Compiler, or JSMin. 
(function() {
	rap.registerTypeHandler("org.xtext.example.mydsl.web.editor.widget.MyDsl", {
		factory : function(properties) {
			return new org.xtext.example.mydsl.web.editor.widget.MyDsl(properties);
		},
		
		destructor : "destroy",
		 
		properties : [ "url", "text", "command", "status", "issue", "scope" ],
		
		events : ["Modify", "Save"]
 		
	});

	rwt.qx.Class.define("org.xtext.example.mydsl.web.editor.widget.MyDsl", {
		extend : rwt.widgets.Composite,

		construct : function(properties) {
			this.base(arguments);
			bindAll(this, [ "layout", "onModify", "onReady", "onSend", "onRender", "onSave" ]);
			
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
			//console.log("destruct: widget destructed");
			this.editor.destroy();
			this.langTools = null;
			this.element.parentNode.removeChild(this.element);
		},
		
		members : {
			
			ready: false,
			
			editor: null,
			
			isFocused: false,
			
			isDirty: false,
			
			langTools: null,
			
			globalScope: null,
			
			onReady : function() {
				//console.log("on Ready");
				this.ready = true;
				this.layout();
				if (this._url) {
					this.setUrl(this._url);
					delete this._url;
				}
				if (this._command) {
					this.setCommand(this._command);
					delete this._command;
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
				if (this._issue) {
					this.setIssue(this._issue);
					delete this._issue;
				}
				if (this._scope) {
					this.setScope(this._scope);
					delete this._scope;
				}
			},

			destroy : function() {
				rap.off("send", this.onSend);
				//console.log("destroy: widget destructed");
				this.editor.destroy();
				this.element.parentNode.removeChild(this.element);
			},
			
			onAppear: function() {
				//console.log("on Appear");	
			},

			onRender : function() {
				if (this.element.parentNode) {
					//console.log("on Render");
					rap.off("render", this.onRender);
					this.addEditor();
					this.editor.on("instanceReady", this.onReady);
					rap.on("send", this.onSend);
				}
			},

			onModify : function() {
				//console.log("on Modify");
			},

			onSend : function() {
				if(rap) {
					//console.log("on Send");
					var remoteObject = rap.getRemoteObject(this);
					remoteObject.set("text",this.editor.getValue());
					remoteObject.set("command","edit");
				}	
			},
			
			onSave: function() {
				if(rap) {
					//console.log("on Save!");
					var remoteObject = rap.getRemoteObject(this);
					if (remoteObject) {
						remoteObject.set("text",this.editor.getValue());
						remoteObject.set("command","save");
						remoteObject.notify("Modify");
						//remoteObject.call("doSave");
						//remoteObject.notify();
					}
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
		
			setCommand : function(command) {
				this._command = command;
			},
				
			setStatus : function(status) {
			   	if (this.ready) {
			   		if (this._status=="invalid") {
//			   			var annotations = this.editor.session.getAnnotations();
//			   			var filtered = [];
//			   			this.editor.session.clearAnnotations();
//			   			for (var i = 0; i < annotations.length; i++) {
//			   				var annotation = annotations[i];
//			   				var type = annotation.type;
//			   				if (type != "warning") {
//			   					filtered.push(annotation)
//			   				}
//			   			}
//			   			this.editor.session.setAnnotations(filtered);
			   		}
				} else {
					this._status = status;
				}
			},

			setIssue : function(issue) {
				if (this.ready) {
					if (issue) {
						this._issue = issue;
						var annotations = [];
						for (var key in issue) {
							var positions = this._issue[key].match(/\d+/g);
							if (key=="ERROR") {
								annotations.push({row:Math.max(positions[0]-1,0) ,column: 0, text: issue[key], type:"error", server: true});
							} 
							else if (key=="WARNING") {
								annotations.push({row:Math.max(positions[0]-1,0) ,column: 0, text: issue[key], type:"warning", server: true});
							}
							else if (key=="INFO") {
								annotations.push({row:Math.max(positions[0]-1,0) ,column: 0, text: issue[key], type:"info", server: true});
							}
						}
						this.editor.session.setAnnotations(annotations);
					} else {
						 this.editor.session.clearAnnotations();
					}
				} else {
					this._issue = issue;
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

			setFont : function(font) {
				if (this.ready) {
					async(this, function() { // Needed by IE for some reason
						this.editor.document.getBody().setStyle("font", font);
					});
				} else {
					this._font = font;
				}
			},
			
			/**
			 * ENTRYPOINT
			 */
			addEditor : function() {
				//console.log("addEditor");
				var guid = this._url;

				var editor = this.editor = ace.edit(this.element);
				if (editor != null) {					
					editor.setTheme("ace/theme/eclipse");				

					editor.getSession().setUseWrapMode(true);
				    editor.getSession().setTabSize(4);
				    editor.getSession().setUseSoftTabs(true);

					editor.getSession().setMode("ace/mode/mydsl");	
					editor.setFontSize(15);
					editor.getSession().getUndoManager().reset();
					
					editor.setShowPrintMargin(false);
					 
					//editor.$blockScrolling = Infinity;
					
					//bind content assist
					this.langTools = ace.require("ace/ext/language_tools");
					this.langTools.completers = [];
					
					//initialize the index
					var index = this._scope;
					this.globalScope = {	
						getCompletions: function(editor, session, pos, prefix, callback) {
							//alert("inside:" + index);
					        var completions = [];    			        
				            for (var i = index.length; i--;) {
					           	var reference = index[i];
					           	completions.push({
					           		iconClass: " " + typeToIcon(reference),
						           	name: reference,
									value: reference,
									score: 1,
						            meta: /*reference + " - " +*/ "reference"
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
					
					//Only one completer per dsl is needed 
					//FIXME: completers are not relased for some reason
					completers = editor.completers.length;
					if (completers>4) {
						this.langTools.removeCompleter(this.globalScope);
					}
					
					//add documentation hover
					var TokenTooltip = ace.require("ace/ext/tooltip").TokenTooltip;	
					editor.tokenTooltip = new TokenTooltip(editor);
					
					//Handle the index
					if (typeof SharedWorker == 'undefined') {	
						alert("Your current browser does not support JavaScript shared workers.");
					} else {
						//Compute worker's http URL
						var filePath = 'rwt-resources/src-js/org/xtext/example/mydsl/web/global-index.js';					    var httpURL = computeWorkerPath(filePath);
						var httpURL = computeWorkerPath(filePath);
						//Create the index
						var worker = this.worker = new SharedWorker(httpURL);	 	
						
						/*
						editor.on("focus", function() {
					 		this._isFocused=true;
					 	});
					 	editor.on("blur", function() {
					 		this._isFocused=false;
					 	});*/

					 	//update the index
					 	index = this._scope;

						editor.on("change", function() {			
							//editor.session.dirty = true;							
							//alert("editor on change: index: " + index);
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
					 		//console.log("receiving message: index: " + index);
				        };
					}

					//Bind keyboard shorcuts
					var self = this;
					editor.commands.addCommand({
						name: 'saveFile',
						bindKey: {
						win: 'Ctrl-S',
						mac: 'Command-S',
						sender: 'editor|cli'
						},
						exec: function(env, args, request) {
							if(rap) {
								//console.log("Crtl+Save");
								self.onSave();
							}
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
				//console.log("call layout");
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
        path = path.replace(/^[a-z]+:\/\/[^\/]+/, ""); // Remove domain name and rebuild it
        path = location.protocol + "//" + location.host
            + (path.charAt(0) == "/" ? "" : location.pathname.replace(/\/[^\/]*$/, ""))
            + "/" + path.replace(/^[\/]+/, "");
        return path;
    };
    
}());
