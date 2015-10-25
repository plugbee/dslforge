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

//var counter = 0;
//var connections = [];
//var index = [];
//
//onconnect = function(e) {
//	if (e) {
//	   var port = e.ports[0];  
//	   port.onmessage = function(j) {    
//		   counter++;	    
//		   var guid = j.data.guid;
//		   var content = j.data.message;
//		   var contribution = j.data.index;   aùm
//		   for (var i=0; i < index.length; i++) {
//			   //if the reference contains the prefix of the calling editor
//			   if (index[i].indexOf(guid)>-1) {
//				   //remove that reference
//				  index.splice(i, 1);
//				  i--;
//			   }
//		   }       
//		   //add the new references contributed by the calling editor
//		   for (var j = 0; j < contribution.length; j++) {
//			   index.push(contribution[j]);
//		   }
//		   
//	       for (var i=0; i < connections.length; i++) {
//	           connections[i].postMessage({
//	        	   counter: counter,
//	               message: "index",
//	               guid: guid,
//	               index: index
//	           });           
//	       }
//	   }
//	   port.start();
//	   connections.push(port);			
//	}
//}