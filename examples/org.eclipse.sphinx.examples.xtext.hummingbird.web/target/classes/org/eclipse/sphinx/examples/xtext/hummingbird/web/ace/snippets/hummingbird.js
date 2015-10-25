define('ace/snippets/hummingbird', ['require', 'exports', 'module' ], function(require, exports, module) {

exports.snippetText = '\
# ComponentType\nsnippet ComponentType {...}\n	ComponentType ${1:name} { \n		${2://ports}\n		ports{\n		\t//add port...\n		}\n		${3://parameters}\n		parameters{\n		\t//add parameter...\n		}\n	}\n\
# Port\nsnippet Port {...}\n	Port ${1:port_name} { minProviderCount ${2:0} maxProviderCount ${3:-1} requiredInterface ${4:Interface_ref} }\n\
# Parameter\nsnippet Parameter {...}\n	Parameter ${1:param_name} { dataType \"${2:type}\" }\n\
# Interface\nsnippet Interface {...}\n	Interface ${1:itf_name} {}\n\
'
exports.scope = "hummingbird";

});