lexer grammar Xpand;
@header { 	
package org.eclipse.internal.xpand2.parser; 
	
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import org.eclipse.internal.xtend.expression.ast.*;
import org.eclipse.internal.xpand2.ast.*;
}

T21 : 'IMPORT' ;
T22 : 'EXTENSION' ;
T23 : 'AROUND' ;
T24 : '(' ;
T25 : ',' ;
T26 : '*' ;
T27 : ')' ;
T28 : 'FOR' ;
T29 : 'ENDAROUND' ;
T30 : '::' ;
T31 : 'DEFINE' ;
T32 : 'ENDDEFINE' ;
T33 : '-' ;
T34 : 'ERROR' ;
T35 : 'EXPAND' ;
T36 : 'FOREACH' ;
T37 : 'SEPARATOR' ;
T38 : 'ONFILECLOSE' ;
T39 : 'FILE' ;
T40 : 'ENDFILE' ;
T41 : 'AS' ;
T42 : 'ITERATOR' ;
T43 : 'ENDFOREACH' ;
T44 : 'IF' ;
T45 : 'ENDIF' ;
T46 : 'ELSEIF' ;
T47 : 'ELSE' ;
T48 : 'LET' ;
T49 : 'ENDLET' ;
T50 : 'PROTECT' ;
T51 : 'CSTART' ;
T52 : 'CEND' ;
T53 : 'ID' ;
T54 : 'DISABLE' ;
T55 : 'ENDPROTECT' ;
T56 : 'let' ;
T57 : '=' ;
T58 : ':' ;
T59 : '->' ;
T60 : '?' ;
T61 : 'if' ;
T62 : 'then' ;
T63 : 'else' ;
T64 : 'switch' ;
T65 : '{' ;
T66 : 'case' ;
T67 : 'default' ;
T68 : '}' ;
T69 : '||' ;
T70 : '&&' ;
T71 : 'implies' ;
T72 : '==' ;
T73 : '!=' ;
T74 : '>=' ;
T75 : '<=' ;
T76 : '>' ;
T77 : '<' ;
T78 : '+' ;
T79 : '/' ;
T80 : '!' ;
T81 : '.' ;
T82 : 'GLOBALVAR' ;
T83 : 'new' ;
T84 : 'false' ;
T85 : 'true' ;
T86 : 'null' ;
T87 : 'typeSelect' ;
T88 : 'collect' ;
T89 : 'select' ;
T90 : 'selectFirst' ;
T91 : 'reject' ;
T92 : 'exists' ;
T93 : 'notExists' ;
T94 : 'sortBy' ;
T95 : 'forAll' ;
T96 : '|' ;
T97 : 'Collection' ;
T98 : 'List' ;
T99 : 'Set' ;
T100 : '[' ;
T101 : ']' ;

// $ANTLR src "src/org/eclipse/internal/xpand2/parser/Xpand.g" 373
IntLiteral : ('0' | '1'..'9' '0'..'9'*) ;

// $ANTLR src "src/org/eclipse/internal/xpand2/parser/Xpand.g" 375
StringLiteral
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    |  '\'' ( EscapeSequence | ~('\''|'\\') )* '\''
    ;

// $ANTLR src "src/org/eclipse/internal/xpand2/parser/Xpand.g" 380
fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UnicodeEscape
    |   OctalEscape
    ;

// $ANTLR src "src/org/eclipse/internal/xpand2/parser/Xpand.g" 387
fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

// $ANTLR src "src/org/eclipse/internal/xpand2/parser/Xpand.g" 394
fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;
// $ANTLR src "src/org/eclipse/internal/xpand2/parser/Xpand.g" 398
fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;

// $ANTLR src "src/org/eclipse/internal/xpand2/parser/Xpand.g" 401
Identifier 
    :   ('^')? Letter (Letter|JavaIDDigit)*
    ;

// $ANTLR src "src/org/eclipse/internal/xpand2/parser/Xpand.g" 405
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

// $ANTLR src "src/org/eclipse/internal/xpand2/parser/Xpand.g" 422
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

// $ANTLR src "src/org/eclipse/internal/xpand2/parser/Xpand.g" 441
WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;}
    ;

// $ANTLR src "src/org/eclipse/internal/xpand2/parser/Xpand.g" 444
ML_COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

// $ANTLR src "src/org/eclipse/internal/xpand2/parser/Xpand.g" 448
LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;

// $ANTLR src "src/org/eclipse/internal/xpand2/parser/Xpand.g" 452
LG  : '\u00AB';
// $ANTLR src "src/org/eclipse/internal/xpand2/parser/Xpand.g" 453
fragment
RG: '\u00BB';

// comments
// $ANTLR src "src/org/eclipse/internal/xpand2/parser/Xpand.g" 457
COMMENT :
	'REM' RG ( options {greedy=false;} : . )* '\u00ABENDREM'
;

// $ANTLR src "src/org/eclipse/internal/xpand2/parser/Xpand.g" 461
TEXT :
  RG ~(LG)* (LG)?
;

// a dummy rule to force vocabulary to be all characters (except special
// ones that ANTLR uses internally (0 to 2) and the guillemot characters
// $ANTLR src "src/org/eclipse/internal/xpand2/parser/Xpand.g" 467
fragment
VOCAB :
	('\3'..'\u00aa'|'\u00ac'..'\u00ba'|'\u00bc'..'\ufffe')
;
