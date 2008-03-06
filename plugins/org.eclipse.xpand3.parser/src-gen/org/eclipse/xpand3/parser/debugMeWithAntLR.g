grammar debugMeWithAntLR;


@lexer::members {
   private boolean xpandMode = false;
}

file  :
	(((imp=nsImport)))* (((decl=abstractDeclaration)))* (EOF)
;
nsImport  :
	(LG) ('IMPORT') (ns=simpleType) (RG)
	| (LG) ('EXTENSION') (ns=simpleType) (RG)
	| ('import') (unnamed0=type) (';')
	| ('extension') (unnamed1=type) ((('reexport')))? (';')
;
abstractDeclaration  :
	(check)
	| (around)
	| (extension)
	| (definition)
	| (definitionAround)
;
definition  :
	(LG) (DEFINE) (name=identifier) ((('(') (((unnamed2=declaredParameterList) (((',')? ('*')))?
	| ('*')))? (')')))? ('FOR') (unnamed3=type) (unnamed4=sequence) (ENDDEFINE) (RG)
;
definitionAround  :
	(LG) (AROUND) (unnamed5=pointcut) ((('(') (((unnamed6=declaredParameterList) (((',')? ('*')))?
	| ('*')))? (')')))? ('FOR') (unnamed7=type) (unnamed8=sequence) (ENDAROUND) (RG)
;
sequence  :
	(unnamed9=textSequence) (((unnamed10=statement) (unnamed11=textSequence)))*
;
statement  :
	(simpleStatement)
	| (fileStatement)
	| (foreachStatement)
	| (ifStatement)
	| (letStatement)
	| (protectStatement)
;
textSequence  :
	(unnamed12=text) (((unnamed13=text)))*
;
text  :
	('-')? (TEXT)
;
simpleStatement  :
	(errorStatement)
	| (expandStatement)
	| (expressionStmt)
;
errorStatement  :
	('ERROR') (unnamed14=expression)
;
expandStatement  :
	('EXPAND') (unnamed15=simpleType) ((('(') (unnamed16=parameterList) (')')))? ((((('FOR') (unnamed17=expression)))
	| ((('FOREACH') (unnamed18=expression) ((('SEPARATOR') (unnamed19=expression)))?))))?
;
expressionStmt  :
	(unnamed20=expression)
;
fileStatement  :
	('FILE') (unnamed21=expression) (((unnamed22=identifier)))? (unnamed23=sequence) ('ENDFILE')
;
foreachStatement  :
	('FOREACH') (unnamed24=expression) ('AS') (unnamed25=identifier) ((('ITERATOR') (unnamed26=identifier)))? ((('SEPARATOR') (unnamed27=expression)))? (unnamed28=sequence) ('ENDFOREACH')
;
ifStatement  :
	('IF') (unnamed29=expression) (unnamed30=sequence) (unnamed31=elseIfStatement)* (unnamed32=elseStatement)? ('ENDIF')
;
elseIfStatement  :
	('ELSEIF') (unnamed33=expression) (unnamed34=sequence)
;
elseStatement  :
	('ELSE') (unnamed35=sequence)
;
letStatement  :
	('LET') (unnamed36=expression) ('AS') (unnamed37=identifier) (unnamed38=sequence) ('ENDLET')
;
protectStatement  :
	('PROTECT') ('CSTART') (unnamed39=expression) ('CEND') (unnamed40=expression) ('ID') (unnamed41=expression) ('DISABLE')? (unnamed42=sequence) ('ENDPROTECT')
;
check  :
	('context') (unnamed43=type) ((('if') (unnamed44=expression)))? ((('ERROR')
	| ('WARNING'))) (unnamed45=expression) (':') (unnamed46=expression) (';')
;
around  :
	('around') (unnamed47=pointcut) ('(') (((unnamed48=declaredParameterList) (((',')? ('*')))?
	| ('*')))? (')') (':') (unnamed49=expression) (';')
;
pointcut  :
	((('*')
	| (unnamed50=identifier))) ((('*')
	| (unnamed51=identifier)
	| ('::')))*
;
extension  :
	((('private')
	| ('cached')
	| ('create')))* (unnamed52=type)? (unnamed53=identifier) (unnamed54=identifier)? ('(') (unnamed55=declaredParameterList)? (')') (':') ((('JAVA') (unnamed56=javaType) ('.') (unnamed57=identifier) ('(') (((unnamed58=javaType) (((',') (unnamed59=javaType)))*))? (')')
	| (unnamed60=expression))) (';')
;
javaType  :
	(unnamed61=identifier) ((('.') (((unnamed62=identifier)
	| ('Collection')
	| ('List')
	| ('Set')))))*
;
test_expression  :
	(unnamed63=expression) (EOF)
;
expression  :
	(unnamed64=letExpression)
;
letExpression  :
	('let') (unnamed65=identifier) ('=') (unnamed66=castedExpression) (':') (unnamed67=expression)
	| (unnamed68=castedExpression)
;
castedExpression  :
	('(' type ')' chainExpression)=>(('(') (unnamed69=type) (')') (unnamed70=chainExpression))
	| (unnamed71=chainExpression)
;
chainExpression  :
	(unnamed72=ifExpression) ((('->') (unnamed73=ifExpression)))*
;
ifExpression  :
	(unnamed74=switchExpression) ((('?') (unnamed75=expression) (':') (unnamed76=switchExpression)))?
	| ('if') (unnamed77=expression) ('then') (unnamed78=switchExpression) ((('else') (unnamed79=switchExpression)))?
;
switchExpression  :
	('switch') ((('(') (unnamed80=orExpression) (')')))? ('{') (unnamed81=casePart)* ('default') (':') (unnamed82=orExpression) ('}')
	| (unnamed83=orExpression)
;
casePart  :
	('case') (unnamed84=expression) (':') (unnamed85=expression)
;
orExpression  :
	(unnamed86=andExpression) ((('||') (unnamed87=andExpression)))*
;
andExpression  :
	(unnamed88=impliesExpression) ((('&&') (unnamed89=impliesExpression)))*
;
impliesExpression  :
	(unnamed90=relationalExpression) ((('implies') (unnamed91=relationalExpression)))*
;
relationalExpression  :
	(unnamed92=additiveExpression) ((((('==')
	| ('!=')
	| ('>=')
	| ('<=')
	| ('>')
	| ('<'))) (unnamed93=additiveExpression)))*
;
additiveExpression  :
	(unnamed94=multiplicativeExpression) ((((('+')
	| ('-'))) (unnamed95=multiplicativeExpression)))*
;
multiplicativeExpression  :
	(unnamed96=unaryExpression) ((((('*')
	| ('/'))) (unnamed97=unaryExpression)))*
;
unaryExpression  :
	(unnamed98=infixExpression)
	| ('!') (unnamed99=infixExpression)
	| ('-') (unnamed100=infixExpression)
;
infixExpression  :
	(unnamed101=primaryExpression) ((('.') (unnamed102=featureCall)))*
;
primaryExpression  :
	(stringLiteral)
	| (featureCall)
	| (booleanLiteral)
	| (numberLiteral)
	| (nullLiteral)
	| (listLiteral)
	| (constructorCall)
	| (globalVarExpression)
	| (paranthesizedExpression)
;
stringLiteral  :
	(StringLiteral)
;
paranthesizedExpression  :
	('(') (unnamed103=expression) (')')
;
globalVarExpression  :
	('GLOBALVAR') (unnamed104=identifier)
;
featureCall  :
	(unnamed105=identifier) ('(') (((unnamed106=parameterList)))? (')')
	| (unnamed107=type)
	| (unnamed108=collectionExpression)
;
listLiteral  :
	('{') (((unnamed109=expression) (((',') (unnamed110=expression)))*))? ('}')
;
constructorCall  :
	('new') (unnamed111=simpleType)
;
booleanLiteral  :
	('false')
	| ('true')
;
nullLiteral  :
	('null')
;
numberLiteral  :
	(IntLiteral)
	| (IntLiteral) ('.') (IntLiteral)
;
collectionExpression  :
	('typeSelect') ('(') (unnamed112=type) (')')
	| ((('collect')
	| ('select')
	| ('selectFirst')
	| ('reject')
	| ('exists')
	| ('notExists')
	| ('sortBy')
	| ('forAll'))) ('(') (((unnamed113=identifier) ('|')))? (unnamed114=expression) (')')
;
declaredParameterList  :
	(unnamed115=declaredParameter) (((',') (unnamed116=declaredParameter)))*
;
declaredParameter  :
	(unnamed117=type) (unnamed118=identifier)
;
parameterList  :
	(unnamed119=expression) (((',') (unnamed120=expression)))*
;
type  :
	(collectionType)
	| (simpleType)
;
collectionType  :
	((('Collection')
	| ('List')
	| ('Set'))) ((('[') (unnamed121=simpleType) (']')))?
;
simpleType  :
	(unnamed122=identifier) ((('::') (unnamed123=identifier)))*
;
identifier  :
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

	