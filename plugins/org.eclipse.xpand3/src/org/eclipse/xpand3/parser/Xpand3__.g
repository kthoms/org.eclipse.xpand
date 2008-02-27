lexer grammar Xpand3;
@members {
   private boolean xpandMode = false;
}
@header { 	
package org.eclipse.xpand3.parser; 
}

T24 : 'IMPORT' ;
T25 : 'EXTENSION' ;
T26 : 'import' ;
T27 : ';' ;
T28 : 'extension' ;
T29 : 'reexport' ;
T30 : '(' ;
T31 : ',' ;
T32 : '*' ;
T33 : ')' ;
T34 : 'FOR' ;
T35 : '-' ;
T36 : 'ERROR' ;
T37 : 'EXPAND' ;
T38 : 'FOREACH' ;
T39 : 'SEPARATOR' ;
T40 : 'FILE' ;
T41 : 'ENDFILE' ;
T42 : 'AS' ;
T43 : 'ITERATOR' ;
T44 : 'ENDFOREACH' ;
T45 : 'IF' ;
T46 : 'ENDIF' ;
T47 : 'ELSEIF' ;
T48 : 'ELSE' ;
T49 : 'LET' ;
T50 : 'ENDLET' ;
T51 : 'PROTECT' ;
T52 : 'CSTART' ;
T53 : 'CEND' ;
T54 : 'ID' ;
T55 : 'DISABLE' ;
T56 : 'ENDPROTECT' ;
T57 : 'context' ;
T58 : 'if' ;
T59 : 'WARNING' ;
T60 : ':' ;
T61 : 'around' ;
T62 : '::' ;
T63 : 'private' ;
T64 : 'cached' ;
T65 : 'create' ;
T66 : 'JAVA' ;
T67 : '.' ;
T68 : 'Collection' ;
T69 : 'List' ;
T70 : 'Set' ;
T71 : 'let' ;
T72 : '=' ;
T73 : '->' ;
T74 : '?' ;
T75 : 'then' ;
T76 : 'else' ;
T77 : 'switch' ;
T78 : 'default' ;
T79 : '}' ;
T80 : 'case' ;
T81 : '||' ;
T82 : '&&' ;
T83 : 'implies' ;
T84 : '==' ;
T85 : '!=' ;
T86 : '>=' ;
T87 : '<=' ;
T88 : '>' ;
T89 : '<' ;
T90 : '+' ;
T91 : '/' ;
T92 : '!' ;
T93 : 'GLOBALVAR' ;
T94 : '[' ;
T95 : ']' ;
T96 : 'new' ;
T97 : 'false' ;
T98 : 'true' ;
T99 : 'null' ;
T100 : 'typeSelect' ;
T101 : 'collect' ;
T102 : 'select' ;
T103 : 'selectFirst' ;
T104 : 'reject' ;
T105 : 'exists' ;
T106 : 'notExists' ;
T107 : 'sortBy' ;
T108 : 'forAll' ;
T109 : '|' ;

// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 349
IntLiteral : ('0' | '1'..'9' '0'..'9'*) ;

// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 351
StringLiteral
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    |  '\'' ( EscapeSequence | ~('\''|'\\') )* '\''
    ;

// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 356
fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UnicodeEscape
    |   OctalEscape
    ;

// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 363
fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 370
fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;
// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 374
fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;


// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 378
DEFINE 	: {xpandMode=true;}	 'DEFINE';
// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 379
ENDDEFINE 
	: 'ENDDEFINE' {xpandMode=false;};
	
// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 382
AROUND 	:	{xpandMode=true;}'AROUND';
// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 383
ENDAROUND :	'ENDAROUND'{xpandMode=false;};

// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 385
Identifier 
    :   ('^')? Letter (Letter|JavaIDDigit)*
    ;

// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 389
fragment
Letter
    :  '\u0024' |
       '\u0041'..'\u005a' |
       '\u005f' |
       '\u0061'..'\u007a' |
       '\u00c0'..'\u00d6' |
       '\u00d8'..'\u00f6' |
       '\u00f8'..'\u00ff' |
       '\u0100'..'\u1fff' |
       '\u3040'..'\u318f' |
       '\u3300'..'\u337f' |
       '\u3400'..'\u3d2d' |
       '\u4e00'..'\u9fff' |
       '\uf900'..'\ufaff'
    ;

// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 406
fragment
JavaIDDigit
    :  '\u0030'..'\u0039' |
       '\u0660'..'\u0669' |
       '\u06f0'..'\u06f9' |
       '\u0966'..'\u096f' |
       '\u09e6'..'\u09ef' |
       '\u0a66'..'\u0a6f' |
       '\u0ae6'..'\u0aef' |
       '\u0b66'..'\u0b6f' |
       '\u0be7'..'\u0bef' |
       '\u0c66'..'\u0c6f' |
       '\u0ce6'..'\u0cef' |
       '\u0d66'..'\u0d6f' |
       '\u0e50'..'\u0e59' |
       '\u0ed0'..'\u0ed9' |
       '\u1040'..'\u1049'
   ;

// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 425
WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;}
    ;

// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 428
COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 432
LINE_COMMENT
    : '//' ~('\n'|'\r')* ('\r'? '\n'|EOF) {$channel=HIDDEN;}
    ;
    
// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 436
REM_COMMENT :
	'REM' RG ( options {greedy=false;} : . )* '\u00ABENDREM' {$channel=HIDDEN;}
;


// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 441
TEXT :
  {xpandMode}? RG ~(LG)* (LG)?
;

// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 445
LG 
	: '\u00AB';
// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 447
RG
	: '\u00BB';	
