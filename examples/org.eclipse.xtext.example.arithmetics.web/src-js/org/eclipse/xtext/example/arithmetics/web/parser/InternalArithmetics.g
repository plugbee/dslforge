grammar InternalArithmetics;

options {
  language=JavaScript;
  output=AST;
  ASTLabelType=CommonTree;
}

@lexer::header {
}

@parser::header {
}

 
rule_Module:
	'module' name=ID imports+=rule_Import* statements+=rule_Statement* EOF!;


rule_Import:
	'import' importednamespace=rule_ImportName;


rule_ImportName:
	ID ('.' '*')?;


rule_Statement:
	rule_Definition | rule_Evaluation;


rule_Definition:
	'def' name=ID ('(' args+=rule_DeclaredParameter (',' args+=rule_DeclaredParameter)* ')')? ':' expr=rule_Expression ';';


rule_DeclaredParameter:
	name=ID;


rule_AbstractDefinition:
	rule_Definition | rule_DeclaredParameter;


rule_Evaluation:
	expression=rule_Expression ';';


rule_Expression:
	rule_Addition;


rule_Addition:
	rule_Multiplication (( '+' |  '-') right=rule_Multiplication)*;


rule_Multiplication:
	rule_PrimaryExpression (( '*' |  '/') right=rule_PrimaryExpression)*;


rule_PrimaryExpression:
	'(' rule_Expression ')' |
	 value=NUMBER |
	 func=ID ('(' args+=rule_Expression (',' args+=rule_Expression)* ')')?;


ID : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;

STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

COMMENT : ('/*' .* '*/' | '//' ~('\r' | '\n')*)   { $channel = HIDDEN; } ;

WS:  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;} ;

NUMBER: ('0'..'9')+ ('.' ('0'..'9')+)?;

