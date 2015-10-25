define('ace/snippets/domainmodel', ['require', 'exports', 'module' ], function(require, exports, module) {

exports.snippetText = '\
# EmptyEntity\nsnippet Empty Entity\n	entity ${1:name} { \n		${2://body}\n	}\n\
# EntityWithAttribute\nsnippet Entity With Attribute\n	entity ${1:name} { \n		${2://Attributes}\n		${3:name} : ${4:type}\n	}\n\
# EntityWithFunction\nsnippet Entity With Function\n	entity ${1:name} { \n		${2://Functions}\n		op ${3:name}(${4:param_x}, ${5:param_y}) : ${4:return_type}\n	}\n\
'
exports.scope = "domainmodel";
});