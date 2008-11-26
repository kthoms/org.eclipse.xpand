lexer grammar Xtend;
@header { 	
package org.eclipse.internal.xtend.xtend.parser; 
	
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import org.eclipse.internal.xtend.expression.ast.*;
import org.eclipse.internal.xtend.xtend.ast.*;
}

T18 : 'import' ;
T19 : ';' ;
T20 : 'extension' ;
T21 : 'reexport' ;
T22 : 'context' ;
T23 : '#' ;
T24 : 'if' ;
T25 : 'ERROR' ;
T26 : 'WARNING' ;
T27 : ':' ;
T28 : 'around' ;
T29 : '(' ;
T30 : ',' ;
T31 : '*' ;
T32 : ')' ;
T33 : '::' ;
T34 : 'private' ;
T35 : 'cached' ;
T36 : 'JAVA' ;
T37 : '.' ;
T38 : 'create' ;
T39 : 'Collection' ;
T40 : 'List' ;
T41 : 'Set' ;
T42 : 'let' ;
T43 : '=' ;
T44 : '->' ;
T45 : '?' ;
T46 : 'then' ;
T47 : 'else' ;
T48 : 'switch' ;
T49 : '{' ;
T50 : 'case' ;
T51 : 'default' ;
T52 : '}' ;
T53 : '||' ;
T54 : '&&' ;
T55 : 'implies' ;
T56 : '==' ;
T57 : '!=' ;
T58 : '>=' ;
T59 : '<=' ;
T60 : '>' ;
T61 : '<' ;
T62 : '+' ;
T63 : '-' ;
T64 : '/' ;
T65 : '!' ;
T66 : 'GLOBALVAR' ;
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
T81 : '[' ;
T82 : ']' ;

// $ANTLR src "/Users/huebner/Entwicklung/workspace-oaw5/org.eclipse.xtend/bin/org/eclipse/internal/xtend/xtend/parser/Xtend.g" 284
IntLiteral : ('0' | '1'..'9' '0'..'9'*) ;

// $ANTLR src "/Users/huebner/Entwicklung/workspace-oaw5/org.eclipse.xtend/bin/org/eclipse/internal/xtend/xtend/parser/Xtend.g" 286
StringLiteral
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    |  '\'' ( EscapeSequence | ~('\''|'\\') )* '\''
    ;

// $ANTLR src "/Users/huebner/Entwicklung/workspace-oaw5/org.eclipse.xtend/bin/org/eclipse/internal/xtend/xtend/parser/Xtend.g" 291
fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UnicodeEscape
    |   OctalEscape
    ;

// $ANTLR src "/Users/huebner/Entwicklung/workspace-oaw5/org.eclipse.xtend/bin/org/eclipse/internal/xtend/xtend/parser/Xtend.g" 298
fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

// $ANTLR src "/Users/huebner/Entwicklung/workspace-oaw5/org.eclipse.xtend/bin/org/eclipse/internal/xtend/xtend/parser/Xtend.g" 305
fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;
// $ANTLR src "/Users/huebner/Entwicklung/workspace-oaw5/org.eclipse.xtend/bin/org/eclipse/internal/xtend/xtend/parser/Xtend.g" 309
fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;

// $ANTLR src "/Users/huebner/Entwicklung/workspace-oaw5/org.eclipse.xtend/bin/org/eclipse/internal/xtend/xtend/parser/Xtend.g" 312
Identifier 
    :   ('^')? Letter (Letter|JavaIDDigit)*
    ;

// $ANTLR src "/Users/huebner/Entwicklung/workspace-oaw5/org.eclipse.xtend/bin/org/eclipse/internal/xtend/xtend/parser/Xtend.g" 316
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

// $ANTLR src "/Users/huebner/Entwicklung/workspace-oaw5/org.eclipse.xtend/bin/org/eclipse/internal/xtend/xtend/parser/Xtend.g" 333
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

// $ANTLR src "/Users/huebner/Entwicklung/workspace-oaw5/org.eclipse.xtend/bin/org/eclipse/internal/xtend/xtend/parser/Xtend.g" 352
WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;}
    ;

// $ANTLR src "/Users/huebner/Entwicklung/workspace-oaw5/org.eclipse.xtend/bin/org/eclipse/internal/xtend/xtend/parser/Xtend.g" 355
COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

// $ANTLR src "/Users/huebner/Entwicklung/workspace-oaw5/org.eclipse.xtend/bin/org/eclipse/internal/xtend/xtend/parser/Xtend.g" 359
LINE_COMMENT
    : '//' ~('\n'|'\r')* ('\r'? '\n'|EOF) {$channel=HIDDEN;}
    ;
    

// $ANTLR src "/Users/huebner/Entwicklung/workspace-oaw5/org.eclipse.xtend/bin/org/eclipse/internal/xtend/xtend/parser/Xtend.g" 364
XPAND_TAG_OPEN 
	: '\u00AB';
// $ANTLR src "/Users/huebner/Entwicklung/workspace-oaw5/org.eclipse.xtend/bin/org/eclipse/internal/xtend/xtend/parser/Xtend.g" 366
XPAND_TAG_CLOSE
	: '\u00BB';	
