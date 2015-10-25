define('ace/snippets/statemachine', ['require', 'exports', 'module' ], function(require, exports, module) {

exports.snippetText = '\
# EmptyState\nsnippet New State...\n	state ${1:name}\n	\t${2://TODO: add actions and transitions}\n	end\n\
# Transition\nsnippet New Transition...\n	${1:from_state} => ${2:to_state}\n	\n\
# Events\nsnippet Declare Events...\n	events\n	\t${1:name}	${2:code}\n	end\n\
# Commands\nsnippet Declare Commands...\n	commands\n	\t${1:name}	${2:code}\n	end\n\
# ResetEvents\nsnippet Declare Reset Events...\n	resetEvents\n	\t${1://reference event}\n	end\n\
'
exports.scope = "statemachine";
});