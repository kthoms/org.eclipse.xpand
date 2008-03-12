grammar debugMeWithAntLR;


@lexer::members {
   private boolean xpandMode = false;
}

r_file  :
	(((f_imports=r_nsImport)))* (((f_declarations=r_abstractDeclaration)))* (EOF)
;

r_nsImport  :
	(r_import)
	| (r_extensionImport)
;

r_import  :
	(((LG) ('IMPORT') (f_namespace=r_simpleType) (RG)))
	| ('import') (f_type=r_type) (';')
;

r_extensionImport  :
	(((LG) ('EXTENSION') (f_namespace=r_simpleType) (RG)))
	| ('extension') (f_type=r_type) ('reexport')? (';')
;

r_abstractDeclaration  :
	(r_check)
	| (r_around)
	| (r_extension)
	| (r_definition)
	| (r_definitionAround)
;

r_definition  :
	(LG) (DEFINE) (f_name=r_identifier) ((('(') (((f_paramList=r_declaredParameterList) (((',')? ('*')))?
	| ('*')))? (')')))? ('FOR') (f_type=r_type) (f_sequence=r_sequence) (ENDDEFINE) (RG)
;

r_definitionAround  :
	(LG) (AROUND) (f_pointcut=r_pointcut) ((('(') (((f_paramList=r_declaredParameterList) (((',')? ('*')))?
	| ('*')))? (')')))? ('FOR') (f_type=r_type) (f_sequence=r_sequence) (ENDAROUND) (RG)
;

r_sequence  :
	(f_textSequences=r_textSequence) (((f_statements=r_statement) (f_textSequences=r_textSequence)))*
;

r_statement  :
	(r_simpleStatement)
	| (r_fileStatement)
	| (r_foreachStatement)
	| (r_ifStatement)
	| (r_letStatement)
	| (r_protectStatement)
;

r_textSequence  :
	(f_text=r_text) (((f_text=r_text)))*
;

r_text  :
	('-')? (TEXT)
;

r_simpleStatement  :
	(r_errorStatement)
	| (r_expandStatement)
	| (r_expressionStmt)
;

r_errorStatement  :
	('ERROR') (f_expression=r_expression)
;

r_expandStatement  :
	('EXPAND') (f_name=r_simpleType) ((('(') (f_paramList=r_parameterList) (')')))? ((((('FOR') (f_forExpression=r_expression)))
	| ((('FOREACH') (f_forExpression=r_expression) ((('SEPARATOR') (f_separator=r_expression)))?))))?
;

r_expressionStmt  :
	(f_expression=r_expression)
;

r_fileStatement  :
	('FILE') (f_nameExpression=r_expression) ((('ONCE')))? (((f_identifier=r_identifier)))? (f_sequence=r_sequence) ('ENDFILE')
;

r_foreachStatement  :
	('FOREACH') (f_forExpression=r_expression) ('AS') (f_identifier=r_identifier) ((('ITERATOR') (f_iterator=r_identifier)))? ((('SEPARATOR') (f_separatorExpression=r_expression)))? (f_sequence=r_sequence) ('ENDFOREACH')
;

r_ifStatement  :
	('IF') (f_expression=r_expression) (f_sequence=r_sequence) (f_elseIf=r_elseIfStatement)* (f_else=r_elseStatement)? ('ENDIF')
;

r_elseIfStatement  :
	('ELSEIF') (f_expression=r_expression) (f_sequence=r_sequence)
;

r_elseStatement  :
	('ELSE') (f_sequence=r_sequence)
;

r_letStatement  :
	('LET') (f_expression=r_expression) ('AS') (f_name=r_identifier) (f_sequence=r_sequence) ('ENDLET')
;

r_protectStatement  :
	('PROTECT') ('CSTART') (f_cstart=r_expression) ('CEND') (f_cend=r_expression) ('ID') (f_id=r_expression) ('DISABLE')? (f_sequence=r_sequence) ('ENDPROTECT')
;

r_check  :
	('context') (f_unnamed0=r_type) ((('if') (f_unnamed1=r_expression)))? ((('ERROR')
	| ('WARNING'))) (f_unnamed2=r_expression) (':') (f_unnamed3=r_expression) (';')
;

r_around  :
	('around') (f_unnamed4=r_pointcut) ('(') (((f_unnamed5=r_declaredParameterList) (((',')? ('*')))?
	| ('*')))? (')') (':') (f_unnamed6=r_expression) (';')
;

r_pointcut  :
	((('*')
	| (f_unnamed7=r_identifier))) ((('*')
	| (f_unnamed8=r_identifier)
	| ('::')))*
;

r_extension  :
	((('private')
	| ('cached')
	| ('create')))* (f_returnType=r_type)? (f_name=r_identifier) ('(') (f_paramList=r_declaredParameterList)? (')') (':') ((('JAVA') (f_javaReturnType=r_javaType) ('.') (f_javaName=r_identifier) ('(') (((f_unnamed9=r_javaType) (((',') (f_unnamed10=r_javaType)))*))? (')')
	| (f_extendBody=r_expression))) (';')
;

r_javaType  :
	(f_unnamed11=r_identifier) ((('.') (((f_unnamed12=r_identifier)
	| ('Collection')
	| ('List')
	| ('Set')))))*
;

r_test_expression  :
	(f_unnamed13=r_expression) (EOF)
;

r_expression  :
	(f_unnamed14=r_letExpression)
;

r_letExpression  :
	('let') (f_unnamed15=r_identifier) ('=') (f_unnamed16=r_castedExpression) (':') (f_unnamed17=r_expression)
	| (f_unnamed18=r_castedExpression)
;

r_castedExpression  :
	('(' r_type ')' r_chainExpression)=>(('(') (f_unnamed19=r_type) (')') (f_unnamed20=r_chainExpression))
	| (f_unnamed21=r_chainExpression)
;

r_chainExpression  :
	(f_unnamed22=r_ifExpression) ((('->') (f_unnamed23=r_ifExpression)))*
;

r_ifExpression  :
	(f_unnamed24=r_switchExpression) ((('?') (f_unnamed25=r_expression) (':') (f_unnamed26=r_switchExpression)))?
	| ('if') (f_unnamed27=r_expression) ('then') (f_unnamed28=r_switchExpression) ((('else') (f_unnamed29=r_switchExpression)))?
;

r_switchExpression  :
	('switch') ((('(') (f_unnamed30=r_orExpression) (')')))? ('{') (f_unnamed31=r_casePart)* ('default') (':') (f_unnamed32=r_orExpression) ('}')
	| (f_unnamed33=r_orExpression)
;

r_casePart  :
	('case') (f_unnamed34=r_expression) (':') (f_unnamed35=r_expression)
;

r_orExpression  :
	(f_unnamed36=r_andExpression) ((('||') (f_unnamed37=r_andExpression)))*
;

r_andExpression  :
	(f_unnamed38=r_impliesExpression) ((('&&') (f_unnamed39=r_impliesExpression)))*
;

r_impliesExpression  :
	(f_unnamed40=r_relationalExpression) ((('implies') (f_unnamed41=r_relationalExpression)))*
;

r_relationalExpression  :
	(f_leftOperand=r_additiveExpression) (((f_operator=r_relationalOperator) (f_rightOperand=r_additiveExpression)))*
;

r_relationalOperator  :
	('==')
	| ('!=')
	| ('>=')
	| ('<=')
	| ('>')
	| ('<')
;

r_additiveExpression  :
	(f_left=r_multiplicativeExpression) ((((('+')
	| ('-'))) (f_right=r_multiplicativeExpression)))*
;

r_multiplicativeExpression  :
	(f_left=r_unaryExpression) ((((('*')
	| ('/'))) (f_right=r_unaryExpression)))*
;

r_unaryExpression  :
	(f_unnamed42=r_infixExpression)
	| ('!') (f_operand=r_infixExpression)
	| ('-') (f_operand=r_infixExpression)
;

r_infixExpression  :
	(f_target=r_primaryExpression) ((('.') (f_calls=r_featureCall)))*
;

r_primaryExpression  :
	(r_stringLiteral)
	| (r_featureCall)
	| (r_booleanLiteral)
	| (r_numberLiteral)
	| (r_nullLiteral)
	| (r_listLiteral)
	| (r_constructorCall)
	| (r_globalVarExpression)
	| (r_paranthesizedExpression)
;

r_stringLiteral  :
	(StringLiteral)
;

r_paranthesizedExpression  :
	('(') (f_unnamed43=r_expression) (')')
;

r_globalVarExpression  :
	('GLOBALVAR') (f_unnamed44=r_identifier)
;

r_featureCall  :
	(f_name=r_identifier) ('(') (((f_paramList=r_parameterList)))? (')')
	| (f_type=r_type)
	| (f_unnamed45=r_collectionExpression)
;

r_listLiteral  :
	('{') (((f_unnamed46=r_expression) (((',') (f_unnamed47=r_expression)))*))? ('}')
;

r_constructorCall  :
	('new') (f_unnamed48=r_simpleType)
;

r_booleanLiteral  :
	('false')
	| ('true')
;

r_nullLiteral  :
	('null')
;

r_numberLiteral  :
	(IntLiteral)
	| (IntLiteral) ('.') (IntLiteral)
;

r_collectionExpression  :
	('typeSelect') ('(') (f_unnamed49=r_type) (')')
	| ((('collect')
	| ('select')
	| ('selectFirst')
	| ('reject')
	| ('exists')
	| ('notExists')
	| ('sortBy')
	| ('forAll'))) ('(') (((f_unnamed50=r_identifier) ('|')))? (f_unnamed51=r_expression) (')')
;

r_declaredParameterList  :
	(f_params=r_declaredParameter) (((',') (f_params=r_declaredParameter)))*
;

r_declaredParameter  :
	(f_ptype=r_type) (f_name=r_identifier)
;

r_parameterList  :
	(f_params=r_expression) (((',') (f_params=r_expression)))*
;

r_type  :
	(r_collectionType)
	| (r_simpleType)
;

r_collectionType  :
	((('Collection')
	| ('List')
	| ('Set'))) ((('[') (f_unnamed52=r_simpleType) (']')))?
;

r_simpleType  :
	(f_names=r_identifier) ((('::') (f_names=r_identifier)))*
;

r_identifier  :
	(Identifier)
;


IntLiteral : 
	 ('0' | '1'..'9' '0'..'9'*) 
;


StringLiteral : 
	 '\"' ( EscapeSequence | ~('\\'|'\"') )* '\"'
    |  '\'' ( EscapeSequence | ~('\''|'\\') )* '\'' 
;


fragment EscapeSequence : 
	 '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UnicodeEscape
    |   OctalEscape 
;


fragment OctalEscape : 
	 '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') 
;


fragment UnicodeEscape : 
	 '\\' 'u' HexDigit HexDigit HexDigit HexDigit 
;


fragment HexDigit : 
	 ('0'..'9'|'a'..'f'|'A'..'F') 
;


DEFINE : 
	 {xpandMode=true;}	 'DEFINE' 
;


ENDDEFINE : 
	 'ENDDEFINE' {xpandMode=false;} 
;


AROUND : 
	 {xpandMode=true;}'AROUND' 
;


ENDAROUND : 
	 'ENDAROUND'{xpandMode=false;} 
;


Identifier : 
	 ('^')? Letter (Letter|JavaIDDigit)* 
;


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


WS : 
	 (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;} 
;


COMMENT : 
	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;} 
;


LINE_COMMENT : 
	 '//' ~('\n'|'\r')* ('\r'? '\n'|EOF) {$channel=HIDDEN;} 
;


REM_COMMENT_OUT : 
	 {!xpandMode}?=> LG 'REM' RG ( options {greedy=false;} : . )* '\u00ABENDREM' RG {$channel=HIDDEN;} 
;


REM_COMMENT : 
	 {xpandMode}?=> 'REM' RG ( options {greedy=false;} : . )* '\u00ABENDREM' {$channel=HIDDEN;} 
;


TEXT : 
	 {xpandMode}?=> RG ~(LG)* (LG)? 
;


LG : 
	 '\u00AB' 
;


RG : 
	 '\u00BB' 
;


	