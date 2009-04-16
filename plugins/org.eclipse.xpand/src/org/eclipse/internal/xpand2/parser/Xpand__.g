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
T38 : 'FILE' ;
T39 : 'ENDFILE' ;
T40 : 'AS' ;
T41 : 'ITERATOR' ;
T42 : 'ENDFOREACH' ;
T43 : 'IF' ;
T44 : 'ENDIF' ;
T45 : 'ELSEIF' ;
T46 : 'ELSE' ;
T47 : 'LET' ;
T48 : 'ENDLET' ;
T49 : 'PROTECT' ;
T50 : 'CSTART' ;
T51 : 'CEND' ;
T52 : 'ID' ;
T53 : 'DISABLE' ;
T54 : 'ENDPROTECT' ;
T55 : 'let' ;
T56 : '=' ;
T57 : ':' ;
T58 : '->' ;
T59 : '?' ;
T60 : 'if' ;
T61 : 'then' ;
T62 : 'else' ;
T63 : 'switch' ;
T64 : '{' ;
T65 : 'case' ;
T66 : 'default' ;
T67 : '}' ;
T68 : '||' ;
T69 : '&&' ;
T70 : 'implies' ;
T71 : '==' ;
T72 : '!=' ;
T73 : '>=' ;
T74 : '<=' ;
T75 : '>' ;
T76 : '<' ;
T77 : '+' ;
T78 : '/' ;
T79 : '!' ;
T80 : '.' ;
T81 : 'GLOBALVAR' ;
T82 : 'new' ;
T83 : 'false' ;
T84 : 'true' ;
T85 : 'null' ;
T86 : 'typeSelect' ;
T87 : 'collect' ;
T88 : 'select' ;
T89 : 'selectFirst' ;
T90 : 'reject' ;
T91 : 'exists' ;
T92 : 'notExists' ;
T93 : 'sortBy' ;
T94 : 'forAll' ;
T95 : '|' ;
T96 : 'Collection' ;
T97 : 'List' ;
T98 : 'Set' ;
T99 : '[' ;
T100 : ']' ;

// $ANTLR src "C:\eclipse\workspaces\HEAD\org.eclipse.xpand\src\org\eclipse\internal\xpand2\parser\Xpand.g" 372
IntLiteral : ('0' | '1'..'9' '0'..'9'*) ;

// $ANTLR src "C:\eclipse\workspaces\HEAD\org.eclipse.xpand\src\org\eclipse\internal\xpand2\parser\Xpand.g" 374
StringLiteral
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    |  '\'' ( EscapeSequence | ~('\''|'\\') )* '\''
    ;

// $ANTLR src "C:\eclipse\workspaces\HEAD\org.eclipse.xpand\src\org\eclipse\internal\xpand2\parser\Xpand.g" 379
fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UnicodeEscape
    |   OctalEscape
    ;

// $ANTLR src "C:\eclipse\workspaces\HEAD\org.eclipse.xpand\src\org\eclipse\internal\xpand2\parser\Xpand.g" 386
fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

// $ANTLR src "C:\eclipse\workspaces\HEAD\org.eclipse.xpand\src\org\eclipse\internal\xpand2\parser\Xpand.g" 393
fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;
// $ANTLR src "C:\eclipse\workspaces\HEAD\org.eclipse.xpand\src\org\eclipse\internal\xpand2\parser\Xpand.g" 397
fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;

// $ANTLR src "C:\eclipse\workspaces\HEAD\org.eclipse.xpand\src\org\eclipse\internal\xpand2\parser\Xpand.g" 400
Identifier 
    :   ('^')? Letter (Letter|JavaIDDigit)*
    ;

// $ANTLR src "C:\eclipse\workspaces\HEAD\org.eclipse.xpand\src\org\eclipse\internal\xpand2\parser\Xpand.g" 404
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

// $ANTLR src "C:\eclipse\workspaces\HEAD\org.eclipse.xpand\src\org\eclipse\internal\xpand2\parser\Xpand.g" 421
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

// $ANTLR src "C:\eclipse\workspaces\HEAD\org.eclipse.xpand\src\org\eclipse\internal\xpand2\parser\Xpand.g" 440
WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;}
    ;

// $ANTLR src "C:\eclipse\workspaces\HEAD\org.eclipse.xpand\src\org\eclipse\internal\xpand2\parser\Xpand.g" 443
ML_COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

// $ANTLR src "C:\eclipse\workspaces\HEAD\org.eclipse.xpand\src\org\eclipse\internal\xpand2\parser\Xpand.g" 447
LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;

// $ANTLR src "C:\eclipse\workspaces\HEAD\org.eclipse.xpand\src\org\eclipse\internal\xpand2\parser\Xpand.g" 451
LG  : '\u00AB';
// $ANTLR src "C:\eclipse\workspaces\HEAD\org.eclipse.xpand\src\org\eclipse\internal\xpand2\parser\Xpand.g" 452
fragment
RG: '\u00BB';

// comments
// $ANTLR src "C:\eclipse\workspaces\HEAD\org.eclipse.xpand\src\org\eclipse\internal\xpand2\parser\Xpand.g" 456
COMMENT :
	'REM' RG ( options {greedy=false;} : . )* '\u00ABENDREM'
;

// $ANTLR src "C:\eclipse\workspaces\HEAD\org.eclipse.xpand\src\org\eclipse\internal\xpand2\parser\Xpand.g" 460
TEXT :
  RG ~(LG)* (LG)?
;

// a dummy rule to force vocabulary to be all characters (except special
// ones that ANTLR uses internally (0 to 2) and the guillemot characters
// $ANTLR src "C:\eclipse\workspaces\HEAD\org.eclipse.xpand\src\org\eclipse\internal\xpand2\parser\Xpand.g" 466
fragment
VOCAB :
	('\3'..'\u00aa'|'\u00ac'..'\u00ba'|'\u00bc'..'\ufffe')
;
