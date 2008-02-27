lexer grammar Xpand3;
@header { 	
package org.eclipse.xpand3.parser; 
}

T18 : 'import' ;
T19 : ';' ;
T20 : 'extension' ;
T21 : 'reexport' ;
T22 : 'context' ;
T23 : 'if' ;
T24 : 'ERROR' ;
T25 : 'WARNING' ;
T26 : ':' ;
T27 : 'around' ;
T28 : '(' ;
T29 : ',' ;
T30 : '*' ;
T31 : ')' ;
T32 : '::' ;
T33 : 'private' ;
T34 : 'cached' ;
T35 : 'create' ;
T36 : 'JAVA' ;
T37 : '.' ;
T38 : 'Collection' ;
T39 : 'List' ;
T40 : 'Set' ;
T41 : 'let' ;
T42 : '=' ;
T43 : '->' ;
T44 : '?' ;
T45 : 'then' ;
T46 : 'else' ;
T47 : 'switch' ;
T48 : 'default' ;
T49 : '}' ;
T50 : 'case' ;
T51 : '||' ;
T52 : '&&' ;
T53 : 'implies' ;
T54 : '==' ;
T55 : '!=' ;
T56 : '>=' ;
T57 : '<=' ;
T58 : '>' ;
T59 : '<' ;
T60 : '+' ;
T61 : '-' ;
T62 : '/' ;
T63 : '!' ;
T64 : 'GLOBALVAR' ;
T65 : '[' ;
T66 : ']' ;
T67 : 'new' ;
T68 : 'false' ;
T69 : 'true' ;
T70 : 'null' ;
T71 : 'typeSelect' ;
T72 : 'collect' ;
T73 : 'select' ;
T74 : 'selectFirst' ;
T75 : 'reject' ;
T76 : 'exists' ;
T77 : 'notExists' ;
T78 : 'sortBy' ;
T79 : 'forAll' ;
T80 : '|' ;

// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 237
IntLiteral : ('0' | '1'..'9' '0'..'9'*) ;

// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 239
StringLiteral
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    |  '\'' ( EscapeSequence | ~('\''|'\\') )* '\''
    ;

// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 244
fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UnicodeEscape
    |   OctalEscape
    ;

// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 251
fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 258
fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;
// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 262
fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;

// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 265
Identifier 
    :   ('^')? Letter (Letter|JavaIDDigit)*
    ;

// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 269
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

// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 286
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

// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 305
WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;}
    ;

// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 308
COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 312
LINE_COMMENT
    : '//' ~('\n'|'\r')* ('\r'? '\n'|EOF) {$channel=HIDDEN;}
    ;

// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 316
XPAND_TAG_OPEN 
	: '\u00AB';
// $ANTLR src "src/org/eclipse/xpand3/parser/Xpand3.g" 318
XPAND_TAG_CLOSE
	: '\u00BB';	
