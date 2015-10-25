(function() {
	rap.registerTypeHandler("org.xtext.example.conf.web.editor.widget.Conf", {
		factory : function(properties) {
			return new org.xtext.example.conf.web.editor.widget.Conf(properties);
		},
		properties : [ "text", "command" ]
	});

	rwt.qx.Class.define("org.xtext.example.conf.web.editor.widget.Conf", {
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
			this.element.style.fontSize = '12pt';
			
			this.parent.append(this.element);
			this.flush();
			this.parent.addListener("Resize", this.layout);
			rap.on( "render", this.onRender );
		},

		destruct : function() {
			rap.off("send", this.onSend);
			this.editor.destroy();
			this.element.parentNode.removeChild(this.element);
		},
		
		members : {
			
			ready: false,
			
			editor: null,
			
			onModify : function() {
				alert("on Modify");
			},	

			onReady : function() {
				this.ready = true;
				this.layout();
				if (this._text) {
					this.editor.setValue(this._text);
					delete this._text;
				}
				if (this._font) {
					delete this._font;
				}
				if (this._command) {
					//delete this._command;
				}
			},
			
			onAppear: function() {
				alert("on Appear");	
			},

			onRender : function() {
				//alert("on Render");
				if (this.element.parentNode) {
					rap.off("render", this.onRender);
					this.addEditor();
					this.editor.on("instanceReady", this.onReady);
					rap.on("send", this.onSend);
				}
			},

			onSend : function() {
				rap.getRemoteObject(this).set("text",this.editor.getValue());
				rap.getRemoteObject(this).set("command",this._command);
			},
			
			onSave: function() {
				alert("on Save!");
				rap.getRemoteObject(this).set("text",this.editor.getValue());
				rap.getRemoteObject(this).set("command","save");
			},
			
			addEditor : function() {
				var index = [];		
				var editor = this.editor = ace.edit(this.element);
				if (editor != null) {					
					editor.setTheme("ace/theme/eclipse");				
					//editor.getSession().setUseWorker(true);
					editor.getSession().setMode("ace/mode/conf");					

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
					//Add completer and enable content assist
					langTools.addCompleter(globalScope);
					editor.setOptions({
					    enableBasicAutocompletion: true
					});
					
					//GLOBAL INDEX
					if (typeof SharedWorker == 'undefined') {	
						alert("Your current browser does not support JavaScript shared workers.");
					} else {
						
						//Compute worker's http URL
					    var filePath = 'rwt-resources/src-js/org/xtext/example/conf/web/global-index.js';
					    var httpURL = computeWorkerPath(filePath);

						//Create the index
						var worker = new SharedWorker(httpURL);
					    
					 	//TODO: validate references against index on focus
					 	editor.on("focus", function() {
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
					    	var keywords = ['Description','Dates','Organizers','Topics','Notifications','Location','ExtendedNotifications','Name','Year','HeldInConjuctionWith','Web','CameraReady','ProgramCommittee','PreviousEditions','Acronym','ExtendedSubmissions','Submissions','SubmissionDetails','Conference'];				    		
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
							rap.getRemoteObject(this).set("text",this.editor.getValue());
							rap.getRemoteObject(this).set("command",this._command);
						}
					});
					
					//Done
			        this.onReady();
				}
			},

			setText : function(text) {
				if (this.ready) {
					//alert("[dslforge] - setting text: editor ready!");
					this.editor.setValue(text);	
				}
				else {
					//alert("[dslforge] - setting text: editor not ready");
			        this._text = text;
			    }
			},
			
			setCommand : function(command) {
			   this._command = command;
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
				//alert("layout");
				if (this.ready) {
					var area = this.parent.getClientArea();
					this.element.style.left = area[0] + "px";
					this.element.style.top = (area[1]-10) + "px";
					this.element.style.width = area[2] + 'px';
					this.element.style.height = (area[3]-5) + 'px';		
					this.element.style.fontSize = '12pt';
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
