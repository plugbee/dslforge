//minify using as YUI Compressor, Google Closure Compiler, or JSMin. 
(function() {
	rap.registerTypeHandler("org.eclipse.xtext.example.fowlerdsl.web.editor.widget.Statemachine", {
		factory : function(properties) {
			return new org.eclipse.xtext.example.fowlerdsl.web.editor.widget.Statemachine(properties);
		},
		destructor : "destroy",	 
		properties : [ "url", "text", "editable", "status", "annotations", "scope", "font", "dirty", "markers", "background"],
		events : ["Modify", "TextChanged", "Save", "FocusIn", "FocusOut", "Selection", "CaretEvent"],
		methods : ["addMarker", "insertText", "removeText"]
	});

	rwt.qx.Class.define("org.eclipse.xtext.example.fowlerdsl.web.editor.widget.Statemachine", {
		extend : org.dslforge.styledtext.BasicText,
		construct : function(properties) {
			this.base(arguments, properties);
		},
		
		members : {
			
			setScope : function(scope) {
				this.base(arguments, scope);
			},

			addEditor : function() {
				var guid = this._url;
				var basePath = 'rwt-resources/src-js/org/dslforge/styledtext/ace';
				ace.require("ace/config").set("basePath", basePath);
				var workerPath = 'rwt-resources/src-js/org/eclipse/xtext/example/fowlerdsl/web/ace';
				ace.require("ace/config").set("workerPath", workerPath);
				var themePath = 'rwt-resources/src-js/org/eclipse/xtext/example/fowlerdsl/web/ace';
				ace.require("ace/config").set("themePath", themePath);

				var editor = this.editor = ace.edit(this.element);
				var editable = this.editable;				
				if (editor != null) {
					
					//set language mode
					editor.getSession().setMode("ace/mode/statemachine");	

					//set theme
					editor.setTheme("ace/theme/eclipse");	

					editor.getSession().setUseWrapMode(true);
				    editor.getSession().setTabSize(4);
				    editor.getSession().setUseSoftTabs(true);
					editor.getSession().getUndoManager().reset();
					editor.setShowPrintMargin(false);		 
					editor.setReadOnly(!editable);										
					//editor.$blockScrolling = Infinity;
					
					//bind content assist
					this.langTools = ace.require("ace/ext/language_tools");

					//initialize the index
					if (this._scope==null)
						this._scope=[];
					var index = this._scope;
					//Get this
					var self = this;
					this.globalScope = {	
						getCompletions: function(editor, session, pos, prefix, callback) {
							self.onCompletionRequest();
							var completions = [];
							if (self.isFocused) {
								for (var i = index.length; i--;) {
									var values = index[i].split(":");
							        completions.push({ iconClass: " " + typeToIcon(values[0]),
							        name: values[0], value: values[0], score: 1, meta: "[" + values[1] + "]"
							        });	
						          }	
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
	
					//add documentation hover
					var TokenTooltip = ace.require("ace/ext/tooltip").TokenTooltip;	
					editor.tokenTooltip = new TokenTooltip(editor);		 					
					
					//Get this
					self = this;
					
				 	//init the index
				 	index = this._scope;
				 	
					//Handle the global index
					if (typeof SharedWorker == 'undefined') {	
						alert("Your browser does not support JavaScript shared workers.");
					} else {
						//Compute worker's http URL
						var filePath = 'rwt-resources/src-js/org/dslforge/styledtext/global-index.js';
						var httpURL = computeWorkerPath(filePath);
						//Create the index
						var worker = this.worker = new SharedWorker(httpURL);
					 	
					 	//on focus get
						editor.on("focus", function() {
					 		self.onFocus();
					 	});
						
						//on focus lost
					 	editor.on("blur", function() {
					 		self.onBlur();
					 	});
					 	
					 	//on input
					 	editor.on("input", function() {
							if (!editor.getSession().getUndoManager().isClean())
								self.onModify();
					 	});
					 	
					 	editor.on("mousedown", function() { 
					 	    // Store the Row/column values 
					 		console.log("mouse down");
					 	}) 

					 	editor.getSession().getSelection().on('changeCursor', function() { 
					 	    if (editor.$mouseHandler.isMousePressed)  {
					 	      // the cursor changed using the mouse
					 	      //self.onChangeCursor();
					 	    }
					 	    // the cursor changed
					 	    self.onChangeCursor();
					 	}); 
					 	
					 	editor.getSession().on('changeCursor', function() { 
					 	    if (editor.$mouseHandler.isMousePressed)  {
					 	      // remove last stored values 
					 	     console.log("remove last stored values");
					 	    }
					 	    // Store the Row/column values 
					 	    console.log("store the row/column values");
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
		}
	});
	
	var computeWorkerPath = function (path) {
        path = path.replace(/^[a-z]+:\/\/[^\/]+/, ""); // Remove domain name and rebuild path
        path = location.protocol + "//" + location.host
            + (path.charAt(0) == "/" ? "" : location.pathname.replace(/\/[^\/]*$/, ""))
            + "/" + path.replace(/^[\/]+/, "");
        return path;
    };
    
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
	
}());


