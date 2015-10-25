grammar InternalMyDsl;

options {
  language     = JavaScript;
  output       = AST;
  ASTLabelType = CommonTree;
}

@lexer::header {

}

@parser::header {

}

rule_Model
  :
  greetings+=rule_Greeting* EOF!
  ;

rule_Greeting
  :
  'Hello' name=ID '!'
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

NUMBER
  :
  ('0'..'9')+ ('.' ('0'..'9')+)?
  ;
