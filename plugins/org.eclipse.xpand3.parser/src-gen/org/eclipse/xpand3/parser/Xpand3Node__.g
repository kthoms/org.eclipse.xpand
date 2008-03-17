lexer grammar Xpand3Node;
@members {
   private boolean xpandMode = false;
}
@header { 	
package org.eclipse.xpand3.parser; 
}

T25 : 'IMPORT' ;
T26 : 'import' ;
T27 : ';' ;
T28 : 'EXTENSION' ;
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
T42 : 'ONCE' ;
T43 : 'ENDFILE' ;
T44 : 'AS' ;
T45 : 'ITERATOR' ;
T46 : 'ENDFOREACH' ;
T47 : 'IF' ;
T48 : 'ENDIF' ;
T49 : 'ELSEIF' ;
T50 : 'ELSE' ;
T51 : 'LET' ;
T52 : 'ENDLET' ;
T53 : 'PROTECT' ;
T54 : 'CSTART' ;
T55 : 'CEND' ;
T56 : 'ID' ;
T57 : 'DISABLE' ;
T58 : 'ENDPROTECT' ;
T59 : 'context' ;
T60 : 'if' ;
T61 : 'WARNING' ;
T62 : ':' ;
T63 : 'around' ;
T64 : '::' ;
T65 : 'private' ;
T66 : 'cached' ;
T67 : 'create' ;
T68 : 'JAVA' ;
T69 : '.' ;
T70 : 'Collection' ;
T71 : 'List' ;
T72 : 'Set' ;
T73 : 'let' ;
T74 : '=' ;
T75 : '->' ;
T76 : '?' ;
T77 : 'then' ;
T78 : 'else' ;
T79 : 'switch' ;
T80 : '{' ;
T81 : 'default' ;
T82 : '}' ;
T83 : 'case' ;
T84 : '||' ;
T85 : '&&' ;
T86 : 'implies' ;
T87 : '==' ;
T88 : '!=' ;
T89 : '>=' ;
T90 : '<=' ;
T91 : '>' ;
T92 : '<' ;
T93 : '+' ;
T94 : '/' ;
T95 : '!' ;
T96 : 'GLOBALVAR' ;
T97 : 'new' ;
T98 : 'false' ;
T99 : 'true' ;
T100 : 'null' ;
T101 : 'typeSelect' ;
T102 : 'collect' ;
T103 : 'select' ;
T104 : 'selectFirst' ;
T105 : 'reject' ;
T106 : 'exists' ;
T107 : 'notExists' ;
T108 : 'sortBy' ;
T109 : 'forAll' ;
T110 : '|' ;
T111 : '[' ;
T112 : ']' ;

// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 461
IntLiteral : 
	 ('0' | '1'..'9' '0'..'9'*) 
;


// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 466
StringLiteral : 
	 '\"' ( EscapeSequence | ~('\\'|'\"') )* '\"'
    |  '\'' ( EscapeSequence | ~('\''|'\\') )* '\'' 
;


// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 472
fragment EscapeSequence : 
	 '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UnicodeEscape
    |   OctalEscape 
;


// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 479
fragment OctalEscape : 
	 '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') 
;


// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 486
fragment UnicodeEscape : 
	 '\\' 'u' HexDigit HexDigit HexDigit HexDigit 
;


// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 491
fragment HexDigit : 
	 ('0'..'9'|'a'..'f'|'A'..'F') 
;


// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 496
DEFINE : 
	 {xpandMode=true;}	 'DEFINE' 
;


// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 501
ENDDEFINE : 
	 'ENDDEFINE' {xpandMode=false;} 
;


// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 506
AROUND : 
	 {xpandMode=true;}'AROUND' 
;


// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 511
ENDAROUND : 
	 'ENDAROUND'{xpandMode=false;} 
;


// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 516
Identifier : 
	 ('^')? Letter (Letter|JavaIDDigit)* 
;


// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 521
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


// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 538
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


// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 559
WS : 
	 (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;} 
;


// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 564
COMMENT : 
	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;} 
;


// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 569
LINE_COMMENT : 
	 '//' ~('\n'|'\r')* ('\r'? '\n'|EOF) {$channel=HIDDEN;} 
;


// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 574
REM_COMMENT_OUT : 
	 {!xpandMode}?=> LG 'REM' RG ( options {greedy=false;} : . )* '\u00ABENDREM' RG {$channel=HIDDEN;} 
;


// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 579
REM_COMMENT : 
	 {xpandMode}?=> 'REM' RG ( options {greedy=false;} : . )* '\u00ABENDREM' {$channel=HIDDEN;} 
;


// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 584
TEXT : 
	 {xpandMode}?=> RG ~(LG)* (LG)? 
;


// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 589
LG : 
	 '\u00AB' 
;


// $ANTLR src "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g" 594
RG : 
	 '\u00BB' 
;


	