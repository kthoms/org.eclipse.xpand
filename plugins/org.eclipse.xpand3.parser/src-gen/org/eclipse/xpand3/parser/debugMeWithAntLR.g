grammar debugMeWithAntLR;


@lexer::members {
   private boolean xpandMode = false;
}

r_file  :
	(((imp=r_nsImport)))* (((decl=r_abstractDeclaration)))* (EOF)
;
r_nsImport  :
	(LG) ('IMPORT') (ns=r_simpleType) (RG)
	| (LG) ('EXTENSION') (ns=r_simpleType) (RG)
	| ('import') (unnamed0=r_type) (';')
	| ('extension') (unnamed1=r_type) ((('reexport')))? (';')
;
r_abstractDeclaration  :
	(r_check)
	| (r_around)
	| (r_extension)
	| (r_definition)
	| (r_definitionAround)
;
r_definition  :
	(LG) (DEFINE) (name=r_identifier) ((('(') (((unnamed2=r_declaredParameterList) (((',')? ('*')))?
	| ('*')))? (')')))? ('FOR') (unnamed3=r_type) (unnamed4=r_sequence) (ENDDEFINE) (RG)
;
r_definitionAround  :
	(LG) (AROUND) (unnamed5=r_pointcut) ((('(') (((unnamed6=r_declaredParameterList) (((',')? ('*')))?
	| ('*')))? (')')))? ('FOR') (unnamed7=r_type) (unnamed8=r_sequence) (ENDAROUND) (RG)
;
r_sequence  :
	(unnamed9=r_textSequence) (((unnamed10=r_statement) (unnamed11=r_textSequence)))*
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
	(unnamed12=r_text) (((unnamed13=r_text)))*
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
	('ERROR') (unnamed14=r_expression)
;
r_expandStatement  :
	('EXPAND') (unnamed15=r_simpleType) ((('(') (unnamed16=r_parameterList) (')')))? ((((('FOR') (unnamed17=r_expression)))
	| ((('FOREACH') (unnamed18=r_expression) ((('SEPARATOR') (unnamed19=r_expression)))?))))?
;
r_expressionStmt  :
	(unnamed20=r_expression)
;
r_fileStatement  :
	('FILE') (unnamed21=r_expression) (((unnamed22=r_identifier)))? (unnamed23=r_sequence) ('ENDFILE')
;
r_foreachStatement  :
	('FOREACH') (unnamed24=r_expression) ('AS') (unnamed25=r_identifier) ((('ITERATOR') (unnamed26=r_identifier)))? ((('SEPARATOR') (unnamed27=r_expression)))? (unnamed28=r_sequence) ('ENDFOREACH')
;
r_ifStatement  :
	('IF') (unnamed29=r_expression) (unnamed30=r_sequence) (unnamed31=r_elseIfStatement)* (unnamed32=r_elseStatement)? ('ENDIF')
;
r_elseIfStatement  :
	('ELSEIF') (unnamed33=r_expression) (unnamed34=r_sequence)
;
r_elseStatement  :
	('ELSE') (unnamed35=r_sequence)
;
r_letStatement  :
	('LET') (unnamed36=r_expression) ('AS') (unnamed37=r_identifier) (unnamed38=r_sequence) ('ENDLET')
;
r_protectStatement  :
	('PROTECT') ('CSTART') (unnamed39=r_expression) ('CEND') (unnamed40=r_expression) ('ID') (unnamed41=r_expression) ('DISABLE')? (unnamed42=r_sequence) ('ENDPROTECT')
;
r_check  :
	('context') (unnamed43=r_type) ((('if') (unnamed44=r_expression)))? ((('ERROR')
	| ('WARNING'))) (unnamed45=r_expression) (':') (unnamed46=r_expression) (';')
;
r_around  :
	('around') (unnamed47=r_pointcut) ('(') (((unnamed48=r_declaredParameterList) (((',')? ('*')))?
	| ('*')))? (')') (':') (unnamed49=r_expression) (';')
;
r_pointcut  :
	((('*')
	| (unnamed50=r_identifier))) ((('*')
	| (unnamed51=r_identifier)
	| ('::')))*
;
r_extension  :
	((('private')
	| ('cached')
	| ('create')))* (returnType=r_type)? (name=r_identifier) ('(') (paramList=r_declaredParameterList)? (')') (':') ((('JAVA') (javaReturnType=r_javaType) ('.') (javaName=r_identifier) ('(') (((unnamed52=r_javaType) (((',') (unnamed53=r_javaType)))*))? (')')
	| (extendBody=r_expression))) (';')
;
r_javaType  :
	(unnamed54=r_identifier) ((('.') (((unnamed55=r_identifier)
	| ('Collection')
	| ('List')
	| ('Set')))))*
;
r_test_expression  :
	(unnamed56=r_expression) (EOF)
;
r_expression  :
	(unnamed57=r_letExpression)
;
r_letExpression  :
	('let') (unnamed58=r_identifier) ('=') (unnamed59=r_castedExpression) (':') (unnamed60=r_expression)
	| (unnamed61=r_castedExpression)
;
r_castedExpression  :
	('(' r_type ')' r_chainExpression)=>(('(') (unnamed62=r_type) (')') (unnamed63=r_chainExpression))
	| (unnamed64=r_chainExpression)
;
r_chainExpression  :
	(unnamed65=r_ifExpression) ((('->') (unnamed66=r_ifExpression)))*
;
r_ifExpression  :
	(unnamed67=r_switchExpression) ((('?') (unnamed68=r_expression) (':') (unnamed69=r_switchExpression)))?
	| ('if') (unnamed70=r_expression) ('then') (unnamed71=r_switchExpression) ((('else') (unnamed72=r_switchExpression)))?
;
r_switchExpression  :
	('switch') ((('(') (unnamed73=r_orExpression) (')')))? ('{') (unnamed74=r_casePart)* ('default') (':') (unnamed75=r_orExpression) ('}')
	| (unnamed76=r_orExpression)
;
r_casePart  :
	('case') (unnamed77=r_expression) (':') (unnamed78=r_expression)
;
r_orExpression  :
	(unnamed79=r_andExpression) ((('||') (unnamed80=r_andExpression)))*
;
r_andExpression  :
	(unnamed81=r_impliesExpression) ((('&&') (unnamed82=r_impliesExpression)))*
;
r_impliesExpression  :
	(unnamed83=r_relationalExpression) ((('implies') (unnamed84=r_relationalExpression)))*
;
r_relationalExpression  :
	(leftOperand=r_additiveExpression) ((((('==')
	| ('!=')
	| ('>=')
	| ('<=')
	| ('>')
	| ('<'))) (rightOperand=r_additiveExpression)))*
;
r_additiveExpression  :
	(unnamed85=r_multiplicativeExpression) ((((('+')
	| ('-'))) (unnamed86=r_multiplicativeExpression)))*
;
r_multiplicativeExpression  :
	(unnamed87=r_unaryExpression) ((((('*')
	| ('/'))) (unnamed88=r_unaryExpression)))*
;
r_unaryExpression  :
	(unnamed89=r_infixExpression)
	| ('!') (unnamed90=r_infixExpression)
	| ('-') (unnamed91=r_infixExpression)
;
r_infixExpression  :
	(target=r_primaryExpression) ((('.') (calls=r_featureCall)))*
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
	('(') (unnamed92=r_expression) (')')
;
r_globalVarExpression  :
	('GLOBALVAR') (unnamed93=r_identifier)
;
r_featureCall  :
	(name=r_identifier) ('(') (((paramList=r_parameterList)))? (')')
	| (unnamed94=r_type)
	| (unnamed95=r_collectionExpression)
;
r_listLiteral  :
	('{') (((unnamed96=r_expression) (((',') (unnamed97=r_expression)))*))? ('}')
;
r_constructorCall  :
	('new') (unnamed98=r_simpleType)
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
	('typeSelect') ('(') (unnamed99=r_type) (')')
	| ((('collect')
	| ('select')
	| ('selectFirst')
	| ('reject')
	| ('exists')
	| ('notExists')
	| ('sortBy')
	| ('forAll'))) ('(') (((unnamed100=r_identifier) ('|')))? (unnamed101=r_expression) (')')
;
r_declaredParameterList  :
	(params=r_declaredParameter) (((',') (params=r_declaredParameter)))*
;
r_declaredParameter  :
	(ptype=r_type) (name=r_identifier)
;
r_parameterList  :
	(params=r_expression) (((',') (params=r_expression)))*
;
r_type  :
	(r_collectionType)
	| (r_simpleType)
;
r_collectionType  :
	((('Collection')
	| ('List')
	| ('Set'))) ((('[') (unnamed102=r_simpleType) (']')))?
;
r_simpleType  :
	(names=r_identifier) ((('::') (names=r_identifier)))*
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

	