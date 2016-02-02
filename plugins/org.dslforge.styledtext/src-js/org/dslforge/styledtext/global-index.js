var counter = 0;
var connections = [];
var index = [];

onconnect = function(e) {
	if(e) {
	   var port = e.ports[0];  
	   port.onmessage = function(j) {
		   counter++;	    
		   var guid = j.data.guid;
		   var content = j.data.message;
		   var contribution = j.data.index;   
		   for (var i=0; i < connections.length; i++) {
	           connections[i].postMessage({
	        	   counter: counter,
	               message: "index",
	               guid: guid,
	               index: contribution
	           });           
	       }
	   }
	   port.start();
	   connections.push(port);		
	}
}
