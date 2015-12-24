grammar InternalDomainmodel;

options {
  language=JavaScript;
  output=AST;
  ASTLabelType=CommonTree;
}

@lexer::header {
}

@parser::header {
}


rule_DomainModel:
	importsection=rule_ImportSection?
	elements+=rule_AbstractElement* EOF!;


rule_AbstractElement:
	rule_PackageDeclaration | rule_Entity;


rule_PackageDeclaration:
	'package' name=rule_QualifiedName '{'
		elements+=rule_AbstractElement*
	'}';


rule_Entity:
	'entity' name=rule_ValidID ('extends' supertype=ID)? '{'
		features+=rule_Feature*
	'}';


rule_Feature:
	rule_Property | rule_Operation;


rule_Property:
	name=rule_ValidID ':' type=ID;


rule_Operation:
	'op' name=rule_ValidID '(' (params+=ID (',' params+=ID)*)? ')' (':' type=ID)?
/*body=BlockExpression*/;


rule_BlockExpression:
	'{' 'code' '}'
;


rule_ImportSection:
	importdeclarations+=rule_ImportDeclaration+;


rule_ImportDeclaration:
	'import' importednamespace=rule_QualifiedNameWithWildcard ';'?;


rule_QualifiedName:
  rule_ValidID ('.' rule_ValidID)*;


rule_QualifiedNameWithWildcard :
	rule_QualifiedName  '.' '*';


rule_ValidID:
	ID;


ID : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;

STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

COMMENT : ('/*' .* '*/' | '//' ~('\r' | '\n')*)   { $channel = HIDDEN; } ;

WS:  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;} ;

//NUMBER: INT ('.' INT)?;

INT: ('0'..'9')+;

