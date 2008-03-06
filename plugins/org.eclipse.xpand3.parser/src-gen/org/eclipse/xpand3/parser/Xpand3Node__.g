lexer grammar Xpand3Node;
@members {
   private boolean xpandMode = false;
}
@header { 	
package org.eclipse.xpand3.parser; 
}

T25 : 'IMPORT' ;
T26 : 'EXTENSION' ;
T27 : 'import' ;
T28 : ';' ;
T29 : 'extension' ;
T30 : 'reexport' ;
T31 : '(' ;
T32 : ',' ;
T33 : '*' ;
T34 : ')' ;
T35 : 'FOR' ;
T36 : '-' ;
T37 : 'ERROR' ;
T38 : 'EXPAND' ;
T39 : 'FOREACH' ;
T40 : 'SEPARATOR' ;
T41 : 'FILE' ;
T42 : 'ENDFILE' ;
T43 : 'AS' ;
T44 : 'ITERATOR' ;
T45 : 'ENDFOREACH' ;
T46 : 'IF' ;
T47 : 'ENDIF' ;
T48 : 'ELSEIF' ;
T49 : 'ELSE' ;
T50 : 'LET' ;
T51 : 'ENDLET' ;
T52 : 'PROTECT' ;
T53 : 'CSTART' ;
T54 : 'CEND' ;
T55 : 'ID' ;
T56 : 'DISABLE' ;
T57 : 'ENDPROTECT' ;
T58 : 'context' ;
T59 : 'if' ;
T60 : 'WARNING' ;
T61 : ':' ;
T62 : 'around' ;
T63 : '::' ;
T64 : 'private' ;
T65 : 'cached' ;
T66 : 'create' ;
T67 : 'JAVA' ;
T68 : '.' ;
T69 : 'Collection' ;
T70 : 'List' ;
T71 : 'Set' ;
T72 : 'let' ;
T73 : '=' ;
T74 : '->' ;
T75 : '?' ;
T76 : 'then' ;
T77 : 'else' ;
T78 : 'switch' ;
T79 : '{' ;
T80 : 'default' ;
T81 : '}' ;
T82 : 'case' ;
T83 : '||' ;
T84 : '&&' ;
T85 : 'implies' ;
T86 : '==' ;
T87 : '!=' ;
T88 : '>=' ;
T89 : '<=' ;
T90 : '>' ;
T91 : '<' ;
T92 : '+' ;
T93 : '/' ;
T94 : '!' ;
T95 : 'GLOBALVAR' ;
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
T110 : '[' ;
T111 : ']' ;

// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 343
IntLiteral : 
	 ('0' | '1'..'9' '0'..'9'*) 
;

// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 347
StringLiteral : 
	 '\"' ( EscapeSequence | ~('\\'|'\"') )* '\"'
    |  '\'' ( EscapeSequence | ~('\''|'\\') )* '\'' 
;

// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 352
fragment EscapeSequence : 
	 '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UnicodeEscape
    |   OctalEscape 
;

// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 358
fragment OctalEscape : 
	 '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') 
;

// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 364
fragment UnicodeEscape : 
	 '\\' 'u' HexDigit HexDigit HexDigit HexDigit 
;

// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 368
fragment HexDigit : 
	 ('0'..'9'|'a'..'f'|'A'..'F') 
;

// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 372
DEFINE : 
	 {xpandMode=true;}	 'DEFINE' 
;

// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 376
ENDDEFINE : 
	 'ENDDEFINE' {xpandMode=false;} 
;

// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 380
AROUND : 
	 {xpandMode=true;}'AROUND' 
;

// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 384
ENDAROUND : 
	 'ENDAROUND'{xpandMode=false;} 
;

// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 388
Identifier : 
	 ('^')? Letter (Letter|JavaIDDigit)* 
;

// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 392
fragment Letter : 
	 '\u0024' |
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

// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 408
fragment JavaIDDigit : 
	
       '\u0030'..'\u0039' |
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

// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 428
WS : 
	 (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;} 
;

// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 432
COMMENT : 
	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;} 
;

// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 436
LINE_COMMENT : 
	 '//' ~('\n'|'\r')* ('\r'? '\n'|EOF) {$channel=HIDDEN;} 
;

// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 440
REM_COMMENT_OUT : 
	 {!xpandMode}?=> LG 'REM' RG ( options {greedy=false;} : . )* '\u00ABENDREM' RG {$channel=HIDDEN;} 
;

// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 444
REM_COMMENT : 
	 {xpandMode}?=> 'REM' RG ( options {greedy=false;} : . )* '\u00ABENDREM' {$channel=HIDDEN;} 
;

// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 448
TEXT : 
	 {xpandMode}?=> RG ~(LG)* (LG)? 
;

// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 452
LG : 
	 '\u00AB' 
;

// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 456
RG : 
	 '\u00BB' 
;

	