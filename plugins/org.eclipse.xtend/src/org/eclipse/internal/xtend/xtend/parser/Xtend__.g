lexer grammar Xtend;
@header { 	
package org.eclipse.xtend.xtend.parser; 
	
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import org.eclipse.xtend.expression.ast.*;
import org.eclipse.xtend.xtend.ast.*;
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
T35 : 'JAVA' ;
T36 : '.' ;
T37 : 'create' ;
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
T48 : '{' ;
T49 : 'case' ;
T50 : 'default' ;
T51 : '}' ;
T52 : '||' ;
T53 : '&&' ;
T54 : 'implies' ;
T55 : '==' ;
T56 : '!=' ;
T57 : '>=' ;
T58 : '<=' ;
T59 : '>' ;
T60 : '<' ;
T61 : '+' ;
T62 : '-' ;
T63 : '/' ;
T64 : '!' ;
T65 : 'GLOBALVAR' ;
T66 : 'new' ;
T67 : 'false' ;
T68 : 'true' ;
T69 : 'null' ;
T70 : 'typeSelect' ;
T71 : 'collect' ;
T72 : 'select' ;
T73 : 'selectFirst' ;
T74 : 'reject' ;
T75 : 'exists' ;
T76 : 'notExists' ;
T77 : 'sortBy' ;
T78 : 'forAll' ;
T79 : '|' ;
T80 : '[' ;
T81 : ']' ;

// $ANTLR src "../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g" 284
IntLiteral : ('0' | '1'..'9' '0'..'9'*) ;

// $ANTLR src "../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g" 286
StringLiteral
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    |  '\'' ( EscapeSequence | ~('\''|'\\') )* '\''
    ;

// $ANTLR src "../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g" 291
fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UnicodeEscape
    |   OctalEscape
    ;

// $ANTLR src "../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g" 298
fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

// $ANTLR src "../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g" 305
fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;
// $ANTLR src "../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g" 309
fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;

// $ANTLR src "../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g" 312
Identifier 
    :   ('^')? Letter (Letter|JavaIDDigit)*
    ;

// $ANTLR src "../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g" 316
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

// $ANTLR src "../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g" 333
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

// $ANTLR src "../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g" 352
WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;}
    ;

// $ANTLR src "../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g" 355
COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

// $ANTLR src "../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g" 359
LINE_COMMENT
    : '//' ~('\n'|'\r')* ('\r'? '\n'|EOF) {$channel=HIDDEN;}
    ;
    

// $ANTLR src "../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g" 364
XPAND_TAG_OPEN 
	: '\u00AB';
// $ANTLR src "../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g" 366
XPAND_TAG_CLOSE
	: '\u00BB';	
