grammar InternalHummingbird;

options {
  language=JavaScript;
  output=AST;
  ASTLabelType=CommonTree;
}

@lexer::header {
}

@parser::header {
}


rule_EntryPoint:
	rule_Application | rule_Platform
 EOF!;


rule_Application:
	'Application'
	name=ID
	'{' ('description' description=rule_Description)? 'components' '{' components+=rule_Component (',' components+=rule_Component)* '}'
    '}';


rule_Component:
	'Component'
	name=ID
	'{' ('type' type=ID)? ('incomingConnections' incomingconnections=ID)? ('description' description=rule_Description)?
	('outgoingConnections' '{' outgoingconnections+=rule_Connection (',' outgoingconnections+=rule_Connection)* '}')?
	('parameterValues' '{' parametervalues+=rule_ParameterValue (',' parametervalues+=rule_ParameterValue)* '}')? '}';


rule_Connection:
	'Connection'
	name=ID
	'{'
		'sourcePort' sourceport=ID 'targetComponent' targetcomponent=ID ('description' description=rule_Description)? '}';


rule_ParameterValue:
	'ParameterValue'
	name=ID
	'{' ('value' value=STRING)? 'type' type=ID ('description' description=rule_Description)? '}';


rule_Platform:
	'Platform'
	name=ID
	'{' ('description' description=rule_Description)? 'componentTypes' '{' componenttypes+=rule_ComponentType (',' componenttypes+=rule_ComponentType)* '}' ('interfaces' '{' interfaces+=rule_Interface (',' interfaces+=rule_Interface)*
	'}')? '}';


rule_ComponentType:
	'ComponentType'
	name=ID
	'{' ('providedInterfaces' '(' providedinterfaces+=ID (',' providedinterfaces+=ID)* ')')? ('description' description=rule_Description)? ('ports' '{' ports+=rule_Port (',' ports+=rule_Port)* '}')? ('parameters' '{' parameters+=rule_Parameter (',' parameters+=rule_Parameter)* '}')? '}';


rule_Interface:
	'Interface'
	name=ID
	'{' ('providingComponentTypes' '(' providingcomponenttypes+=ID (',' providingcomponenttypes+=ID)* ')')?
	('requiringPorts' '(' requiringports+=ID (',' requiringports+=ID)* ')')? ('description' description=rule_Description)? '}';


rule_Port:
	'Port'
	name=ID
	'{'
		'minProviderCount' minprovidercount=rule_Integer
		'maxProviderCount' maxprovidercount=rule_Integer
		'requiredInterface' requiredinterface=ID ('description' description=rule_Description)? '}';


rule_Parameter:
	optional='optional'? 'Parameter'
	name=ID
	'{' ('dataType' datatype=STRING)? ('description' description=rule_Description)? '}';


rule_Integer : 
	'-'? INT;


rule_Boolean :
	'true' | 'false';


rule_Identifiable :
	idantifiable = ( STRING | ID );


rule_Description:
	description = STRING;


ID : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;

STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

COMMENT : ('/*' .* '*/' | '//' ~('\r' | '\n')*)   { $channel = HIDDEN; } ;

WS:  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;} ;

//NUMBER: INT ('.' INT)?;

INT: ('0'..'9')+;

