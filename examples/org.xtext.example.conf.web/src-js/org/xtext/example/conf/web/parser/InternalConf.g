grammar InternalConf;

options {  
language=JavaScript;  
output=AST;  
ASTLabelType=CommonTree;
}

@lexer::header {}

@parser::header {}

model: info=basicConfInfo		
'Dates' '[' date=dates ']'		
'Description' description = TEXT		
'Topics' topics = TEXT		
'ProgramCommittee' committee=TEXT		
'Organizers' organizers=TEXT		
'SubmissionDetails' submdetails=TEXT		
'PreviousEditions' ('[' previous+=basicConfInfo ']')+
EOF!
;

basicConfInfo : 		
'Name' name=TEXT		
'Acronym' acronym=TEXT		
'Year' year=TEXT ('HeldInConjuctionWith' '[' conjunction=basicConfInfo ']')? 
('Location' location = TEXT)? 
('Web' url=TEXT)?
; 

dates: 	
'Conference' confdates=TEXT	
'Submissions' submdates=TEXT 
('ExtendedSubmissions' extsubmdates=TEXT)? 
'Notifications' notidates=TEXT	
('ExtendedNotifications' extnotidates=TEXT)?  
'CameraReady' camedates=TEXT
;
  
ID  : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*  ;

INT : ('0'..'9')+;

TEXT :  '{' (~('{' | '}' | '[' | ']'))* '}' ;

WS:  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;} ; 

COMMENT : ('/*' .* '*/' | '//' ~('\r' | '\n')*)   { $channel = HIDDEN; } ;

STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

