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
	| ('create')))* (returnType=type)? (name=identifier) ('(') (paramList=declaredParameterList)? (')') (':') ((('JAVA') (javaReturnType=javaType) ('.') (javaName=identifier) ('(') (((unnamed52=javaType) (((',') (unnamed53=javaType)))*))? (')')
	| (extendBody=expression))) (';')
;
javaType  :
	(unnamed54=identifier) ((('.') (((unnamed55=identifier)
	| ('Collection')
	| ('List')
	| ('Set')))))*
;
test_expression  :
	(unnamed56=expression) (EOF)
;
expression  :
	(unnamed57=letExpression)
;
letExpression  :
	('let') (unnamed58=identifier) ('=') (unnamed59=castedExpression) (':') (unnamed60=expression)
	| (unnamed61=castedExpression)
;
castedExpression  :
	('(' type ')' chainExpression)=>(('(') (unnamed62=type) (')') (unnamed63=chainExpression))
	| (unnamed64=chainExpression)
;
chainExpression  :
	(unnamed65=ifExpression) ((('->') (unnamed66=ifExpression)))*
;
ifExpression  :
	(unnamed67=switchExpression) ((('?') (unnamed68=expression) (':') (unnamed69=switchExpression)))?
	| ('if') (unnamed70=expression) ('then') (unnamed71=switchExpression) ((('else') (unnamed72=switchExpression)))?
;
switchExpression  :
	('switch') ((('(') (unnamed73=orExpression) (')')))? ('{') (unnamed74=casePart)* ('default') (':') (unnamed75=orExpression) ('}')
	| (unnamed76=orExpression)
;
casePart  :
	('case') (unnamed77=expression) (':') (unnamed78=expression)
;
orExpression  :
	(unnamed79=andExpression) ((('||') (unnamed80=andExpression)))*
;
andExpression  :
	(unnamed81=impliesExpression) ((('&&') (unnamed82=impliesExpression)))*
;
impliesExpression  :
	(unnamed83=relationalExpression) ((('implies') (unnamed84=relationalExpression)))*
;
relationalExpression  :
	(leftOperand=additiveExpression) (((operator=booleanOperator) (rightOperand=additiveExpression)))*
;
booleanOperator  :
	('==')
	| ('!=')
	| ('>=')
	| ('<=')
	| ('>')
	| ('<')
;
additiveExpression  :
	(unnamed85=multiplicativeExpression) ((((('+')
	| ('-'))) (unnamed86=multiplicativeExpression)))*
;
multiplicativeExpression  :
	(unnamed87=unaryExpression) ((((('*')
	| ('/'))) (unnamed88=unaryExpression)))*
;
unaryExpression  :
	(unnamed89=infixExpression)
	| ('!') (unnamed90=infixExpression)
	| ('-') (unnamed91=infixExpression)
;
infixExpression  :
	(target=primaryExpression) ((('.') (calls=featureCall)))*
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
	('(') (unnamed92=expression) (')')
;
globalVarExpression  :
	('GLOBALVAR') (unnamed93=identifier)
;
featureCall  :
	(name=identifier) ('(') (((paramList=parameterList)))? (')')
	| (unnamed94=type)
	| (unnamed95=collectionExpression)
;
listLiteral  :
	('{') (((unnamed96=expression) (((',') (unnamed97=expression)))*))? ('}')
;
constructorCall  :
	('new') (unnamed98=simpleType)
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
	('typeSelect') ('(') (unnamed99=type) (')')
	| ((('collect')
	| ('select')
	| ('selectFirst')
	| ('reject')
	| ('exists')
	| ('notExists')
	| ('sortBy')
	| ('forAll'))) ('(') (((unnamed100=identifier) ('|')))? (unnamed101=expression) (')')
;
declaredParameterList  :
	(params=declaredParameter) (((',') (params=declaredParameter)))*
;
declaredParameter  :
	(ptype=type) (name=identifier)
;
parameterList  :
	(params=expression) (((',') (params=expression)))*
;
type  :
	(collectionType)
	| (simpleType)
;
collectionType  :
	((('Collection')
	| ('List')
	| ('Set'))) ((('[') (unnamed102=simpleType) (']')))?
;
simpleType  :
	(names=identifier) ((('::') (names=identifier)))*
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

	