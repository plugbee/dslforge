//minify using as YUI Compressor, Google Closure Compiler, or JSMin. 
(function() {
	rap.registerTypeHandler("org.dslforge.xtext.common.BasicText", {
		factory : function(properties) {
			return new org.dslforge.xtext.common.BasicText(properties);
		},
		
		destructor : "destroy",
		 
		properties : [ "url", "text", "command", "status", "issue", "scope" ],
		
		events : ["Modify", "Save"]
	});

	rwt.qx.Class.define("org.dslforge.xtext.common.BasicText", {
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
			this.element.parentNode.removeChild(this.element);
		},
		
		members : {
			
			ready: false,
			
			editor: null,
			
			isFocused: false,
			
			isDirty: false,
			
			completionInstalled: false,
			
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

			setIssue : function(issue) {
				if (this.ready) {
					if (issue) {
						this._issue = issue;
						var positions = this._issue.match(/\d+/g);
						this.editor.session.setAnnotations([ {row:Math.max(positions[0]-1,0) ,column: 0, text: this._issue, type:"warning"} ]); 						
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
				var editor = this.editor = ace.edit(this.element);
				if (editor != null) {	
					editor.getSession().setUseWorker(false);				
					editor.clearSelection();	
					editor.setFontSize(15);
					editor.setReadOnly(true);
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