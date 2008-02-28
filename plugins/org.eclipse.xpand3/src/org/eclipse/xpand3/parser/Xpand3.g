grammar Xpand3;
@lexer::members {
   private boolean xpandMode = false;
}

@parser::header { 	
package org.eclipse.xpand3.parser; 
}

@lexer::header { 	
package org.eclipse.xpand3.parser; 
}




r_file  :
	(r_nsImport)*
	(r_abstractDeclaration )*
	 EOF
;

r_nsImport :
	LG 'IMPORT' r_type RG |
	LG 'EXTENSION' r_type RG |
	'import' r_type  ';' | 
	'extension' r_type ('reexport')? ';' 
;

r_abstractDeclaration :
	r_check |
	r_around |
	r_extension |
	r_definition |
	r_definitionAround
;

// XPAND start

r_definition :
	LG DEFINE r_identifier ('(' (r_declaredParameterList (','? '*')? | '*')? ')')? 'FOR' r_type
	r_sequence
	ENDDEFINE RG
;
	
r_definitionAround :	
	LG AROUND r_pointcut ('(' (r_declaredParameterList (','? '*')? | '*')? ')')? 'FOR' r_type
	r_sequence
	ENDAROUND RG
;	

r_sequence :
	 r_textSequence 
	 (r_statement 
	  r_textSequence)*		
;

r_statement :
  r_simpleStatement 
| r_fileStatement 
| r_foreachStatement 
| r_ifStatement 
| r_letStatement 
| r_protectStatement
;
	
r_textSequence :
	r_text (r_text)*
;

r_text :
	'-'? TEXT
;

r_simpleStatement :
  r_errorStatement
| r_expandStatement
| r_expressionStmt
;

r_errorStatement :
  'ERROR' r_expression
;

r_expandStatement :
  'EXPAND' r_simpleType ('(' r_parameterList ')')? (('FOR' r_expression)
  | ('FOREACH'r_expression ('SEPARATOR' r_expression)?))?
;

r_expressionStmt  :
	r_expression
;

r_fileStatement :
	'FILE' r_expression (r_identifier)?
		r_sequence 
	'ENDFILE'
;
	
r_foreachStatement :
	 'FOREACH' r_expression 'AS' r_identifier ('ITERATOR' r_identifier)? ('SEPARATOR' r_expression)?
  		r_sequence 
	 'ENDFOREACH'
;

r_ifStatement : 
     'IF' r_expression
		r_sequence 
	 r_elseIfStatement*
	 r_elseStatement?
	 'ENDIF'
;

r_elseIfStatement :
	'ELSEIF' r_expression
		r_sequence 
;
	
r_elseStatement :
	'ELSE'
		r_sequence
;
	
r_letStatement :
	 'LET' r_expression 'AS' r_identifier
  		r_sequence 
	 'ENDLET'
;
	
r_protectStatement :
	'PROTECT' 
		'CSTART' r_expression 
		'CEND' r_expression 
         	'ID' r_expression 'DISABLE'?
 		r_sequence 
	'ENDPROTECT'
;

// Xtend start

r_check :
	'context' r_type ('if' r_expression)? ('ERROR'|'WARNING') r_expression ':'
		r_expression ';'	
;

r_around  :
    'around' r_pointcut '(' (r_declaredParameterList (','? '*')? | '*')? ')' ':'
    	r_expression ';'
;
    
r_pointcut  :
	( '*' 
	 |r_identifier)
	  ( '*' 
	   |r_identifier 
	   |'::' )*
;

r_extension  :
	('private'|'cached'|'create')* r_type? r_identifier r_identifier? '(' r_declaredParameterList? ')' ':'
		('JAVA' r_javaType '.' r_identifier '('(r_javaType (',' r_javaType )*)? ')'|	
			r_expression )';'
;

r_javaType  :
	r_identifier  
	('.' (r_identifier |'Collection' | 
	'List' |'Set'))*
;

//
// Expressions
//
r_expression :
	r_letExpression 
;

r_letExpression  :
   'let' r_identifier '=' r_castedExpression ':' r_expression 
|  r_castedExpression 
;

r_castedExpression :
    ('(' r_type ')' r_castedExpression)=>
	'(' r_type ')' r_chainExpression 
	| r_chainExpression 
;

r_chainExpression  :
	r_ifExpression  ( '->' r_ifExpression )*
;

r_ifExpression  :
	r_switchExpression ('?' r_expression ':' r_switchExpression )?
|	'if' r_expression 'then' r_switchExpression ('else' r_switchExpression)? 
;

r_switchExpression  :
   'switch' ('(' r_orExpression ')')?
	r_casePart*
   'default' ':' r_orExpression
   '}'
|  r_orExpression 
;

r_casePart :
	'case' r_expression ':' r_expression;	

r_orExpression :
  	r_andExpression  ('||' r_andExpression )*	
;

r_andExpression 	:
	r_impliesExpression  ('&&' r_impliesExpression 	)*	
;

r_impliesExpression :
	r_relationalExpression  ('implies' r_relationalExpression 	)*	
;
	
r_relationalExpression :
	r_additiveExpression 
	(('==' | '!=' | '>=' | '<=' | '>' | '<') r_additiveExpression )*
;

r_additiveExpression :
	r_multiplicativeExpression 
   (('+'| '-') r_multiplicativeExpression )*
;

r_multiplicativeExpression :
	r_unaryExpression 
	(('*' | '/') r_unaryExpression )*
;


r_unaryExpression :
	r_infixExpression 
|	'!' r_infixExpression	
|	'-' r_infixExpression	
;

r_infixExpression :
	r_primaryExpression  ( '.' r_featureCall )*
;
	
r_primaryExpression 	 :
   StringLiteral 	
|   r_featureCall 
|   r_booleanLiteral 
|   r_numberLiteral 
|   r_nullLiteral 
|   r_listLiteral 
|   r_constructorCall 
|   r_globalVarExpression 
|   r_paranthesizedExpression 
;

r_paranthesizedExpression :
    '(' r_expression ')' 
;

r_globalVarExpression  :
    'GLOBALVAR' r_identifier ;

r_featureCall  :
    r_identifier '(' (r_parameterList)? ')' 
|   r_type 	
|   r_collectionExpression 
;

r_listLiteral  :
	'['(r_expression (',' r_expression)*)?']'
;

r_constructorCall  :
	'new' r_simpleType
	
;

r_booleanLiteral  :
	'false'|'true'
;

r_nullLiteral  :
	'null'
;

r_numberLiteral  :
  	IntLiteral 
| 	IntLiteral '.' IntLiteral 
;

r_collectionExpression  :
  'typeSelect'
  '(' r_type ')' 
  
  |('collect'
  | 'select' 
  | 'selectFirst' 
  | 'reject' 
  | 'exists'
  | 'notExists'
  | 'sortBy' 
  | 'forAll') '(' (r_identifier '|')? r_expression ')' 
 
;

// helper

r_declaredParameterList  : 
	r_declaredParameter (',' r_declaredParameter )*
;

r_declaredParameter :
	r_type r_identifier 
;

r_parameterList  :
    r_expression  (',' r_expression )* 
;

// type

r_type : 
	r_collectionType |
	r_simpleType 
;
	
r_collectionType  : 
  ( 'Collection' | 'List' | 'Set' ) 
  ('[' r_simpleType ']' )?
;

r_simpleType :
	r_identifier 
	('::' r_identifier  )*
;

r_identifier :
   Identifier 
	;


/////////////////////////////////////////
// LEXER
////////////////////////////////////////

IntLiteral : ('0' | '1'..'9' '0'..'9'*) ;

StringLiteral
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    |  '\'' ( EscapeSequence | ~('\''|'\\') )* '\''
    ;

fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UnicodeEscape
    |   OctalEscape
    ;

fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;
fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;


DEFINE 	: {xpandMode=true;}	 'DEFINE';
ENDDEFINE 
	: 'ENDDEFINE' {xpandMode=false;};
	
AROUND 	:	{xpandMode=true;}'AROUND';
ENDAROUND :	'ENDAROUND'{xpandMode=false;};

Identifier 
    :   ('^')? Letter (Letter|JavaIDDigit)*
    ;

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

WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;}
    ;

COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

LINE_COMMENT
    : '//' ~('\n'|'\r')* ('\r'? '\n'|EOF) {$channel=HIDDEN;}
    ;
    
    
REM_COMMENT_OUT 
	:	{!xpandMode}?=> LG 'REM' RG ( options {greedy=false;} : . )* '\u00ABENDREM' RG {$channel=HIDDEN;}
;
    
REM_COMMENT :
	{xpandMode}?=> 'REM' RG ( options {greedy=false;} : . )* '\u00ABENDREM' {$channel=HIDDEN;}
;


TEXT :
  {xpandMode}?=> RG ~(LG)* (LG)?
;

LG 
	: '\u00AB';
RG
	: '\u00BB';	
