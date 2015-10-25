grammar InternalDomainmodel;

options {
  language     = JavaScript;
  output       = AST;
  ASTLabelType = CommonTree;
}

@lexer::header {

}

@parser::header {

}

rule_domainModel
  :
  importsection=rule_importSection? elements+=rule_abstractElement* EOF!
  ;

rule_abstractElement
  :
  rule_packageDeclaration
  | rule_entity
  ;

rule_packageDeclaration
  :
  'package' name=rule_qualifiedName '{' elements+=rule_abstractElement* '}'
  ;

rule_entity
  :
  'entity' name=rule_validID ('extends' supertype=rule_qualifiedName)? '{' features+=rule_feature* '}'
  ;

rule_feature
  :
  rule_property
  | rule_operation
  ;

rule_property
  :
  name=rule_validID ':' type=rule_qualifiedName
  ;

rule_operation
  :
  'op' name=rule_validID '(' (params+=ID (',' params+=ID)*)? ')' (':' type=rule_qualifiedName)? /*body=rule_blockExpression*/
  ;

rule_blockExpression
  :
  '{' (expresison+=rule_expression';')* '}'
  ;

rule_expression
  :
  rule_addition
  ;

rule_addition
  :
  rule_multiplication
  (
    (

      '+'
      | 
      '-'
    )
    right=rule_multiplication
  )*
  ;

rule_multiplication
  :
  rule_primaryExpression
  (
    (
      '*'
      | 
      '/'
    )
    right=rule_primaryExpression
  )*
  ;

rule_primaryExpression
  :
  '(' rule_expression ')'
  | 
  value=NUMBER
  | 
  func=ID ('(' args+=rule_expression (',' args+=rule_expression)* ')')?
  ;



rule_importSection
  :
  importdeclarations+=rule_importDeclaration+
  ;

rule_importDeclaration
  :
  'import' importednamespace=rule_qualifiedNameWithWildcard ';'?
  ;

rule_qualifiedName
  :
  rule_validID ('.' rule_validID)*
  ;

rule_qualifiedNameWithWildcard
  :
  rule_qualifiedName '.' '*'
  ;

rule_validID
  :
  ID
  ;

ID
  :
  (
    'a'..'z'
    | 'A'..'Z'
    | '_'
  )
  (
    'a'..'z'
    | 'A'..'Z'
    | '_'
    | '0'..'9'
  )*
  ;

INT
  :
  ('0'..'9')+
  ;

STRING
  :
  (
    '"'
    (
      '\\'
      (
        'b'
        | 't'
        | 'n'
        | 'f'
        | 'r'
        | 'u'
        | '"'
        | '\''
        | '\\'
      )
      |
      ~(
        (
          '\\'
          | '"'
        )
       )
    )*
    '"'
    | '\''
    (
      '\\'
      (
        'b'
        | 't'
        | 'n'
        | 'f'
        | 'r'
        | 'u'
        | '"'
        | '\''
        | '\\'
      )
      |
      ~(
        (
          '\\'
          | '\''
        )
       )
    )*
    '\''
  )
  ;

COMMENT
  :
  (
    '/*' .* '*/'
    | '//'
    ~(
      '\r'
      | '\n'
     )*
  )
  
   {
    $channel = HIDDEN;
   }
  ;

WS
  :
  (
    ' '
    | '\r'
    | '\t'
    | '\u000C'
    | '\n'
  )
  
   {
    $channel=HIDDEN;
   }
  ;

  NUMBER: ('0'..'9')+ ('.' ('0'..'9')+)?;