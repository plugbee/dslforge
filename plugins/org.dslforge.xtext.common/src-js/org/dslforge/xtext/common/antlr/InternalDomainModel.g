grammar InternalDomainModel;

options {
  language=JavaScript;
  output=AST;
  ASTLabelType=CommonTree;
}

@lexer::header {
}

@parser::header {
}

domainModel:
  imports=importSection?
  (elements+=abstractElement)* 
  EOF!; 
   
abstractElement:
  packageDeclaration | entity;

packageDeclaration:
  'package' name=qualifiedName '{'
    elements+=abstractElement*
  '}';

entity:
  'entity' name=validID ('extends' superType=validID)? '{'
    features+=feature*
  '}';

feature:
  property | operation;

property:
  name=validID ':' type=validID;

operation:
  'op' name=validID '(' (params+=ID (',' params+=ID)*)? ')' (':' type=validID)? 
    body=blockExpression;

blockExpression:
  '{' 'code' '}'
;
  
importSection:
  importDeclarations+=importDeclaration+;

importDeclaration:
  'import' importedNamespace=qualifiedNameWithWildcard ';'?
;

qualifiedName:
  validID ('.' validID)*;

qualifiedNameWithWildcard :
  qualifiedName  '.' '*';
  
validID:
  ID;

ID
  : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*
  ;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_COMMENT : ('/*' .* '*/' | '//' ~('\r' | '\n')*)   { $channel = HIDDEN; } ;

WS:  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;} ;
 