define('ace/snippets/mydsl', ['require', 'exports', 'module' ], function(require, exports, module) {

exports.snippetText = '\
# SayHello\nsnippet Say Hello...\n	Hello ${1:name}!\n\
'
exports.scope = "mydsl";

});