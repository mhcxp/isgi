lexer grammar ECL;
@header {
	package com.okooo.osgi.ecl;
}

T8 : ';' ;
T9 : 'update' ;
T10 : 'start' ;
T11 : 'stop' ;
T12 : 'restart' ;
T13 : 'install ' ;
T14 : ',' ;
T15 : '.' ;
T16 : '_' ;
T17 : '-' ;

// $ANTLR src "ECL.g" 88
DIGIT	:	('0'..'9')+
	;
// $ANTLR src "ECL.g" 90
ALPHA	:	'a'..'z' | 'A'..'Z'
	;

// $ANTLR src "ECL.g" 93
NEWLINE	:	'\r'?'\n'
	;

// $ANTLR src "ECL.g" 96
WS	:	(' ' | '\t' | '\r' | '\n')+{skip();}
	;
