grammar Xpand3Node;


options {
	superClass=AbstractNodeParser;
}

@parser::header { 	
package org.eclipse.xpand3.parser; 

import org.eclipse.tmf.common.node.*;
import org.eclipse.xpand3.internal.parser.xpand3node.*;

}

@parser::members {
	protected Xpand3nodeFactory factory = Xpand3nodeFactory.eINSTANCE;
}

@lexer::header { 	
package org.eclipse.xpand3.parser; 
}


@lexer::members {
   private boolean xpandMode = false;
}

file returns [CompositeNode cn]
	@init{ cn = factory.createFileNode(); cn.setRule("file"); }
	@after{ cn = normalize(cn); }  :
	(((imp=nsImport { addToChildren(cn, imp); ((FileNode) cn).getImp().add(imp); })))* (((decl=abstractDeclaration { addToChildren(cn, decl); ((FileNode) cn).getDecl().add(decl); })))* (EOF)
;
nsImport returns [CompositeNode cn]
	@init{ cn = factory.createNsImportNode(); cn.setRule("nsImport"); }  :
	(LG { addLeafNodeForToken($cn, null); }) ('IMPORT' { addLeafNodeForToken($cn, null); }) (ns=simpleType { addToChildren(cn, ns); ((NsImportNode) cn).setNs(ns); }) (RG { addLeafNodeForToken($cn, null); })
	| (LG { addLeafNodeForToken($cn, null); }) ('EXTENSION' { addLeafNodeForToken($cn, null); }) (ns=simpleType { addToChildren(cn, ns); ((NsImportNode) cn).setNs(ns); }) (RG { addLeafNodeForToken($cn, null); })
	| ('import' { addLeafNodeForToken($cn, null); }) (unnamed0=type { addToChildren(cn, unnamed0); }) (';' { addLeafNodeForToken($cn, null); })
	| ('extension' { addLeafNodeForToken($cn, null); }) (unnamed1=type { addToChildren(cn, unnamed1); }) ((('reexport' { addLeafNodeForToken($cn, null); })))? (';' { addLeafNodeForToken($cn, null); })
;
abstractDeclaration returns [CompositeNode cn]  :
	(check { $cn = $check.cn; })
	| (around { $cn = $around.cn; })
	| (extension { $cn = $extension.cn; })
	| (definition { $cn = $definition.cn; })
	| (definitionAround { $cn = $definitionAround.cn; })
;
definition returns [CompositeNode cn]
	@init{ cn = factory.createDefinitionNode(); cn.setRule("definition"); }  :
	(LG { addLeafNodeForToken($cn, null); }) (DEFINE { addLeafNodeForToken($cn, null); }) (name=identifier { addToChildren(cn, name); ((DefinitionNode) cn).setName(name); }) ((('(' { addLeafNodeForToken($cn, null); }) (((unnamed2=declaredParameterList { addToChildren(cn, unnamed2); }) (((',' { addLeafNodeForToken($cn, null); })? ('*' { addLeafNodeForToken($cn, null); })))?
	| ('*' { addLeafNodeForToken($cn, null); })))? (')' { addLeafNodeForToken($cn, null); })))? ('FOR' { addLeafNodeForToken($cn, null); }) (unnamed3=type { addToChildren(cn, unnamed3); }) (unnamed4=sequence { addToChildren(cn, unnamed4); }) (ENDDEFINE { addLeafNodeForToken($cn, null); }) (RG { addLeafNodeForToken($cn, null); })
;
definitionAround returns [CompositeNode cn]
	@init{ cn = factory.createDefinitionAroundNode(); cn.setRule("definitionAround"); }  :
	(LG { addLeafNodeForToken($cn, null); }) (AROUND { addLeafNodeForToken($cn, null); }) (unnamed5=pointcut { addToChildren(cn, unnamed5); }) ((('(' { addLeafNodeForToken($cn, null); }) (((unnamed6=declaredParameterList { addToChildren(cn, unnamed6); }) (((',' { addLeafNodeForToken($cn, null); })? ('*' { addLeafNodeForToken($cn, null); })))?
	| ('*' { addLeafNodeForToken($cn, null); })))? (')' { addLeafNodeForToken($cn, null); })))? ('FOR' { addLeafNodeForToken($cn, null); }) (unnamed7=type { addToChildren(cn, unnamed7); }) (unnamed8=sequence { addToChildren(cn, unnamed8); }) (ENDAROUND { addLeafNodeForToken($cn, null); }) (RG { addLeafNodeForToken($cn, null); })
;
sequence returns [CompositeNode cn]
	@init{ cn = factory.createSequenceNode(); cn.setRule("sequence"); }  :
	(unnamed9=textSequence { addToChildren(cn, unnamed9); }) (((unnamed10=statement { addToChildren(cn, unnamed10); }) (unnamed11=textSequence { addToChildren(cn, unnamed11); })))*
;
statement returns [CompositeNode cn]  :
	(simpleStatement { $cn = $simpleStatement.cn; })
	| (fileStatement { $cn = $fileStatement.cn; })
	| (foreachStatement { $cn = $foreachStatement.cn; })
	| (ifStatement { $cn = $ifStatement.cn; })
	| (letStatement { $cn = $letStatement.cn; })
	| (protectStatement { $cn = $protectStatement.cn; })
;
textSequence returns [CompositeNode cn]
	@init{ cn = factory.createTextSequenceNode(); cn.setRule("textSequence"); }
	@after{ cn = normalize(cn); }  :
	(unnamed12=text { addToChildren(cn, unnamed12); }) (((unnamed13=text { addToChildren(cn, unnamed13); })))*
;
text returns [CompositeNode cn]
	@init{ cn = factory.createTextNode(); cn.setRule("text"); }  :
	('-' { addLeafNodeForToken($cn, null); })? (TEXT { addLeafNodeForToken($cn, null); })
;
simpleStatement returns [CompositeNode cn]  :
	(errorStatement { $cn = $errorStatement.cn; })
	| (expandStatement { $cn = $expandStatement.cn; })
	| (expressionStmt { $cn = $expressionStmt.cn; })
;
errorStatement returns [CompositeNode cn]
	@init{ cn = factory.createErrorStatementNode(); cn.setRule("errorStatement"); }  :
	('ERROR' { addLeafNodeForToken($cn, null); }) (unnamed14=expression { addToChildren(cn, unnamed14); })
;
expandStatement returns [CompositeNode cn]
	@init{ cn = factory.createExpandStatementNode(); cn.setRule("expandStatement"); }  :
	('EXPAND' { addLeafNodeForToken($cn, null); }) (unnamed15=simpleType { addToChildren(cn, unnamed15); }) ((('(' { addLeafNodeForToken($cn, null); }) (unnamed16=parameterList { addToChildren(cn, unnamed16); }) (')' { addLeafNodeForToken($cn, null); })))? ((((('FOR' { addLeafNodeForToken($cn, null); }) (unnamed17=expression { addToChildren(cn, unnamed17); })))
	| ((('FOREACH' { addLeafNodeForToken($cn, null); }) (unnamed18=expression { addToChildren(cn, unnamed18); }) ((('SEPARATOR' { addLeafNodeForToken($cn, null); }) (unnamed19=expression { addToChildren(cn, unnamed19); })))?))))?
;
expressionStmt returns [CompositeNode cn]
	@init{ cn = factory.createExpressionStmtNode(); cn.setRule("expressionStmt"); }  :
	(unnamed20=expression { addToChildren(cn, unnamed20); })
;
fileStatement returns [CompositeNode cn]
	@init{ cn = factory.createFileStatementNode(); cn.setRule("fileStatement"); }  :
	('FILE' { addLeafNodeForToken($cn, null); }) (unnamed21=expression { addToChildren(cn, unnamed21); }) (((unnamed22=identifier { addToChildren(cn, unnamed22); })))? (unnamed23=sequence { addToChildren(cn, unnamed23); }) ('ENDFILE' { addLeafNodeForToken($cn, null); })
;
foreachStatement returns [CompositeNode cn]
	@init{ cn = factory.createForeachStatementNode(); cn.setRule("foreachStatement"); }  :
	('FOREACH' { addLeafNodeForToken($cn, null); }) (unnamed24=expression { addToChildren(cn, unnamed24); }) ('AS' { addLeafNodeForToken($cn, null); }) (unnamed25=identifier { addToChildren(cn, unnamed25); }) ((('ITERATOR' { addLeafNodeForToken($cn, null); }) (unnamed26=identifier { addToChildren(cn, unnamed26); })))? ((('SEPARATOR' { addLeafNodeForToken($cn, null); }) (unnamed27=expression { addToChildren(cn, unnamed27); })))? (unnamed28=sequence { addToChildren(cn, unnamed28); }) ('ENDFOREACH' { addLeafNodeForToken($cn, null); })
;
ifStatement returns [CompositeNode cn]
	@init{ cn = factory.createIfStatementNode(); cn.setRule("ifStatement"); }  :
	('IF' { addLeafNodeForToken($cn, null); }) (unnamed29=expression { addToChildren(cn, unnamed29); }) (unnamed30=sequence { addToChildren(cn, unnamed30); }) (unnamed31=elseIfStatement { addToChildren(cn, unnamed31); })* (unnamed32=elseStatement { addToChildren(cn, unnamed32); })? ('ENDIF' { addLeafNodeForToken($cn, null); })
;
elseIfStatement returns [CompositeNode cn]
	@init{ cn = factory.createElseIfStatementNode(); cn.setRule("elseIfStatement"); }  :
	('ELSEIF' { addLeafNodeForToken($cn, null); }) (unnamed33=expression { addToChildren(cn, unnamed33); }) (unnamed34=sequence { addToChildren(cn, unnamed34); })
;
elseStatement returns [CompositeNode cn]
	@init{ cn = factory.createElseStatementNode(); cn.setRule("elseStatement"); }  :
	('ELSE' { addLeafNodeForToken($cn, null); }) (unnamed35=sequence { addToChildren(cn, unnamed35); })
;
letStatement returns [CompositeNode cn]
	@init{ cn = factory.createLetStatementNode(); cn.setRule("letStatement"); }  :
	('LET' { addLeafNodeForToken($cn, null); }) (unnamed36=expression { addToChildren(cn, unnamed36); }) ('AS' { addLeafNodeForToken($cn, null); }) (unnamed37=identifier { addToChildren(cn, unnamed37); }) (unnamed38=sequence { addToChildren(cn, unnamed38); }) ('ENDLET' { addLeafNodeForToken($cn, null); })
;
protectStatement returns [CompositeNode cn]
	@init{ cn = factory.createProtectStatementNode(); cn.setRule("protectStatement"); }  :
	('PROTECT' { addLeafNodeForToken($cn, null); }) ('CSTART' { addLeafNodeForToken($cn, null); }) (unnamed39=expression { addToChildren(cn, unnamed39); }) ('CEND' { addLeafNodeForToken($cn, null); }) (unnamed40=expression { addToChildren(cn, unnamed40); }) ('ID' { addLeafNodeForToken($cn, null); }) (unnamed41=expression { addToChildren(cn, unnamed41); }) ('DISABLE' { addLeafNodeForToken($cn, null); })? (unnamed42=sequence { addToChildren(cn, unnamed42); }) ('ENDPROTECT' { addLeafNodeForToken($cn, null); })
;
check returns [CompositeNode cn]
	@init{ cn = factory.createCheckNode(); cn.setRule("check"); }  :
	('context' { addLeafNodeForToken($cn, null); }) (unnamed43=type { addToChildren(cn, unnamed43); }) ((('if' { addLeafNodeForToken($cn, null); }) (unnamed44=expression { addToChildren(cn, unnamed44); })))? ((('ERROR' { addLeafNodeForToken($cn, null); })
	| ('WARNING' { addLeafNodeForToken($cn, null); }))) (unnamed45=expression { addToChildren(cn, unnamed45); }) (':' { addLeafNodeForToken($cn, null); }) (unnamed46=expression { addToChildren(cn, unnamed46); }) (';' { addLeafNodeForToken($cn, null); })
;
around returns [CompositeNode cn]
	@init{ cn = factory.createAroundNode(); cn.setRule("around"); }  :
	('around' { addLeafNodeForToken($cn, null); }) (unnamed47=pointcut { addToChildren(cn, unnamed47); }) ('(' { addLeafNodeForToken($cn, null); }) (((unnamed48=declaredParameterList { addToChildren(cn, unnamed48); }) (((',' { addLeafNodeForToken($cn, null); })? ('*' { addLeafNodeForToken($cn, null); })))?
	| ('*' { addLeafNodeForToken($cn, null); })))? (')' { addLeafNodeForToken($cn, null); }) (':' { addLeafNodeForToken($cn, null); }) (unnamed49=expression { addToChildren(cn, unnamed49); }) (';' { addLeafNodeForToken($cn, null); })
;
pointcut returns [CompositeNode cn]
	@init{ cn = factory.createPointcutNode(); cn.setRule("pointcut"); }  :
	((('*' { addLeafNodeForToken($cn, null); })
	| (unnamed50=identifier { addToChildren(cn, unnamed50); }))) ((('*' { addLeafNodeForToken($cn, null); })
	| (unnamed51=identifier { addToChildren(cn, unnamed51); })
	| ('::' { addLeafNodeForToken($cn, null); })))*
;
extension returns [CompositeNode cn]
	@init{ cn = factory.createExtensionNode(); cn.setRule("extension"); }  :
	((('private' { addLeafNodeForToken($cn, null); })
	| ('cached' { addLeafNodeForToken($cn, null); })
	| ('create' { addLeafNodeForToken($cn, null); })))* (unnamed52=type { addToChildren(cn, unnamed52); })? (unnamed53=identifier { addToChildren(cn, unnamed53); }) (unnamed54=identifier { addToChildren(cn, unnamed54); })? ('(' { addLeafNodeForToken($cn, null); }) (unnamed55=declaredParameterList { addToChildren(cn, unnamed55); })? (')' { addLeafNodeForToken($cn, null); }) (':' { addLeafNodeForToken($cn, null); }) ((('JAVA' { addLeafNodeForToken($cn, null); }) (unnamed56=javaType { addToChildren(cn, unnamed56); }) ('.' { addLeafNodeForToken($cn, null); }) (unnamed57=identifier { addToChildren(cn, unnamed57); }) ('(' { addLeafNodeForToken($cn, null); }) (((unnamed58=javaType { addToChildren(cn, unnamed58); }) (((',' { addLeafNodeForToken($cn, null); }) (unnamed59=javaType { addToChildren(cn, unnamed59); })))*))? (')' { addLeafNodeForToken($cn, null); })
	| (unnamed60=expression { addToChildren(cn, unnamed60); }))) (';' { addLeafNodeForToken($cn, null); })
;
javaType returns [CompositeNode cn]
	@init{ cn = factory.createJavaTypeNode(); cn.setRule("javaType"); }  :
	(unnamed61=identifier { addToChildren(cn, unnamed61); }) ((('.' { addLeafNodeForToken($cn, null); }) (((unnamed62=identifier { addToChildren(cn, unnamed62); })
	| ('Collection' { addLeafNodeForToken($cn, null); })
	| ('List' { addLeafNodeForToken($cn, null); })
	| ('Set' { addLeafNodeForToken($cn, null); })))))*
;
test_expression returns [CompositeNode cn]
	@init{ cn = factory.createTest_expressionNode(); cn.setRule("test_expression"); }
	@after{ cn = normalize(cn); }  :
	(unnamed63=expression { addToChildren(cn, unnamed63); }) (EOF)
;
expression returns [CompositeNode cn]
	@init{ cn = factory.createExpressionNode(); cn.setRule("expression"); }
	@after{ cn = normalize(cn); }  :
	(unnamed64=letExpression { addToChildren(cn, unnamed64); })
;
letExpression returns [CompositeNode cn]
	@init{ cn = factory.createLetExpressionNode(); cn.setRule("letExpression"); }
	@after{ cn = normalize(cn); }  :
	('let' { addLeafNodeForToken($cn, null); }) (unnamed65=identifier { addToChildren(cn, unnamed65); }) ('=' { addLeafNodeForToken($cn, null); }) (unnamed66=castedExpression { addToChildren(cn, unnamed66); }) (':' { addLeafNodeForToken($cn, null); }) (unnamed67=expression { addToChildren(cn, unnamed67); })
	| (unnamed68=castedExpression { addToChildren(cn, unnamed68); })
;
castedExpression returns [CompositeNode cn]
	@init{ cn = factory.createCastedExpressionNode(); cn.setRule("castedExpression"); }
	@after{ cn = normalize(cn); }  :
	('(' type ')' chainExpression)=>(('(' { addLeafNodeForToken($cn, null); }) (unnamed69=type { addToChildren(cn, unnamed69); }) (')' { addLeafNodeForToken($cn, null); }) (unnamed70=chainExpression { addToChildren(cn, unnamed70); }))
	| (unnamed71=chainExpression { addToChildren(cn, unnamed71); })
;
chainExpression returns [CompositeNode cn]
	@init{ cn = factory.createChainExpressionNode(); cn.setRule("chainExpression"); }
	@after{ cn = normalize(cn); }  :
	(unnamed72=ifExpression { addToChildren(cn, unnamed72); }) ((('->' { addLeafNodeForToken($cn, null); }) (unnamed73=ifExpression { addToChildren(cn, unnamed73); })))*
;
ifExpression returns [CompositeNode cn]
	@init{ cn = factory.createIfExpressionNode(); cn.setRule("ifExpression"); }
	@after{ cn = normalize(cn); }  :
	(unnamed74=switchExpression { addToChildren(cn, unnamed74); }) ((('?' { addLeafNodeForToken($cn, null); }) (unnamed75=expression { addToChildren(cn, unnamed75); }) (':' { addLeafNodeForToken($cn, null); }) (unnamed76=switchExpression { addToChildren(cn, unnamed76); })))?
	| ('if' { addLeafNodeForToken($cn, null); }) (unnamed77=expression { addToChildren(cn, unnamed77); }) ('then' { addLeafNodeForToken($cn, null); }) (unnamed78=switchExpression { addToChildren(cn, unnamed78); }) ((('else' { addLeafNodeForToken($cn, null); }) (unnamed79=switchExpression { addToChildren(cn, unnamed79); })))?
;
switchExpression returns [CompositeNode cn]
	@init{ cn = factory.createSwitchExpressionNode(); cn.setRule("switchExpression"); }
	@after{ cn = normalize(cn); }  :
	('switch' { addLeafNodeForToken($cn, null); }) ((('(' { addLeafNodeForToken($cn, null); }) (unnamed80=orExpression { addToChildren(cn, unnamed80); }) (')' { addLeafNodeForToken($cn, null); })))? ('{' { addLeafNodeForToken($cn, null); }) (unnamed81=casePart { addToChildren(cn, unnamed81); })* ('default' { addLeafNodeForToken($cn, null); }) (':' { addLeafNodeForToken($cn, null); }) (unnamed82=orExpression { addToChildren(cn, unnamed82); }) ('}' { addLeafNodeForToken($cn, null); })
	| (unnamed83=orExpression { addToChildren(cn, unnamed83); })
;
casePart returns [CompositeNode cn]
	@init{ cn = factory.createCasePartNode(); cn.setRule("casePart"); }  :
	('case' { addLeafNodeForToken($cn, null); }) (unnamed84=expression { addToChildren(cn, unnamed84); }) (':' { addLeafNodeForToken($cn, null); }) (unnamed85=expression { addToChildren(cn, unnamed85); })
;
orExpression returns [CompositeNode cn]
	@init{ cn = factory.createOrExpressionNode(); cn.setRule("orExpression"); }
	@after{ cn = normalize(cn); }  :
	(unnamed86=andExpression { addToChildren(cn, unnamed86); }) ((('||' { addLeafNodeForToken($cn, null); }) (unnamed87=andExpression { addToChildren(cn, unnamed87); })))*
;
andExpression returns [CompositeNode cn]
	@init{ cn = factory.createAndExpressionNode(); cn.setRule("andExpression"); }
	@after{ cn = normalize(cn); }  :
	(unnamed88=impliesExpression { addToChildren(cn, unnamed88); }) ((('&&' { addLeafNodeForToken($cn, null); }) (unnamed89=impliesExpression { addToChildren(cn, unnamed89); })))*
;
impliesExpression returns [CompositeNode cn]
	@init{ cn = factory.createImpliesExpressionNode(); cn.setRule("impliesExpression"); }
	@after{ cn = normalize(cn); }  :
	(unnamed90=relationalExpression { addToChildren(cn, unnamed90); }) ((('implies' { addLeafNodeForToken($cn, null); }) (unnamed91=relationalExpression { addToChildren(cn, unnamed91); })))*
;
relationalExpression returns [CompositeNode cn]
	@init{ cn = factory.createRelationalExpressionNode(); cn.setRule("relationalExpression"); }
	@after{ cn = normalize(cn); }  :
	(unnamed92=additiveExpression { addToChildren(cn, unnamed92); }) ((((('==' { addLeafNodeForToken($cn, null); })
	| ('!=' { addLeafNodeForToken($cn, null); })
	| ('>=' { addLeafNodeForToken($cn, null); })
	| ('<=' { addLeafNodeForToken($cn, null); })
	| ('>' { addLeafNodeForToken($cn, null); })
	| ('<' { addLeafNodeForToken($cn, null); }))) (unnamed93=additiveExpression { addToChildren(cn, unnamed93); })))*
;
additiveExpression returns [CompositeNode cn]
	@init{ cn = factory.createAdditiveExpressionNode(); cn.setRule("additiveExpression"); }
	@after{ cn = normalize(cn); }  :
	(unnamed94=multiplicativeExpression { addToChildren(cn, unnamed94); }) ((((('+' { addLeafNodeForToken($cn, null); })
	| ('-' { addLeafNodeForToken($cn, null); }))) (unnamed95=multiplicativeExpression { addToChildren(cn, unnamed95); })))*
;
multiplicativeExpression returns [CompositeNode cn]
	@init{ cn = factory.createMultiplicativeExpressionNode(); cn.setRule("multiplicativeExpression"); }
	@after{ cn = normalize(cn); }  :
	(unnamed96=unaryExpression { addToChildren(cn, unnamed96); }) ((((('*' { addLeafNodeForToken($cn, null); })
	| ('/' { addLeafNodeForToken($cn, null); }))) (unnamed97=unaryExpression { addToChildren(cn, unnamed97); })))*
;
unaryExpression returns [CompositeNode cn]
	@init{ cn = factory.createUnaryExpressionNode(); cn.setRule("unaryExpression"); }
	@after{ cn = normalize(cn); }  :
	(unnamed98=infixExpression { addToChildren(cn, unnamed98); })
	| ('!' { addLeafNodeForToken($cn, null); }) (unnamed99=infixExpression { addToChildren(cn, unnamed99); })
	| ('-' { addLeafNodeForToken($cn, null); }) (unnamed100=infixExpression { addToChildren(cn, unnamed100); })
;
infixExpression returns [CompositeNode cn]
	@init{ cn = factory.createInfixExpressionNode(); cn.setRule("infixExpression"); }
	@after{ cn = normalize(cn); }  :
	(unnamed101=primaryExpression { addToChildren(cn, unnamed101); }) ((('.' { addLeafNodeForToken($cn, null); }) (unnamed102=featureCall { addToChildren(cn, unnamed102); })))*
;
primaryExpression returns [CompositeNode cn]  :
	(stringLiteral { $cn = $stringLiteral.cn; })
	| (featureCall { $cn = $featureCall.cn; })
	| (booleanLiteral { $cn = $booleanLiteral.cn; })
	| (numberLiteral { $cn = $numberLiteral.cn; })
	| (nullLiteral { $cn = $nullLiteral.cn; })
	| (listLiteral { $cn = $listLiteral.cn; })
	| (constructorCall { $cn = $constructorCall.cn; })
	| (globalVarExpression { $cn = $globalVarExpression.cn; })
	| (paranthesizedExpression { $cn = $paranthesizedExpression.cn; })
;
stringLiteral returns [CompositeNode cn]
	@init{ cn = factory.createStringLiteralNode(); cn.setRule("stringLiteral"); }  :
	(StringLiteral { addLeafNodeForToken($cn, null); })
;
paranthesizedExpression returns [CompositeNode cn]
	@init{ cn = factory.createParanthesizedExpressionNode(); cn.setRule("paranthesizedExpression"); }  :
	('(' { addLeafNodeForToken($cn, null); }) (unnamed103=expression { addToChildren(cn, unnamed103); }) (')' { addLeafNodeForToken($cn, null); })
;
globalVarExpression returns [CompositeNode cn]
	@init{ cn = factory.createGlobalVarExpressionNode(); cn.setRule("globalVarExpression"); }  :
	('GLOBALVAR' { addLeafNodeForToken($cn, null); }) (unnamed104=identifier { addToChildren(cn, unnamed104); })
;
featureCall returns [CompositeNode cn]
	@init{ cn = factory.createFeatureCallNode(); cn.setRule("featureCall"); }
	@after{ cn = normalize(cn); }  :
	(unnamed105=identifier { addToChildren(cn, unnamed105); }) ('(' { addLeafNodeForToken($cn, null); }) (((unnamed106=parameterList { addToChildren(cn, unnamed106); })))? (')' { addLeafNodeForToken($cn, null); })
	| (unnamed107=type { addToChildren(cn, unnamed107); })
	| (unnamed108=collectionExpression { addToChildren(cn, unnamed108); })
;
listLiteral returns [CompositeNode cn]
	@init{ cn = factory.createListLiteralNode(); cn.setRule("listLiteral"); }  :
	('{' { addLeafNodeForToken($cn, null); }) (((unnamed109=expression { addToChildren(cn, unnamed109); }) (((',' { addLeafNodeForToken($cn, null); }) (unnamed110=expression { addToChildren(cn, unnamed110); })))*))? ('}' { addLeafNodeForToken($cn, null); })
;
constructorCall returns [CompositeNode cn]
	@init{ cn = factory.createConstructorCallNode(); cn.setRule("constructorCall"); }  :
	('new' { addLeafNodeForToken($cn, null); }) (unnamed111=simpleType { addToChildren(cn, unnamed111); })
;
booleanLiteral returns [CompositeNode cn]
	@init{ cn = factory.createBooleanLiteralNode(); cn.setRule("booleanLiteral"); }  :
	('false' { addLeafNodeForToken($cn, null); })
	| ('true' { addLeafNodeForToken($cn, null); })
;
nullLiteral returns [CompositeNode cn]
	@init{ cn = factory.createNullLiteralNode(); cn.setRule("nullLiteral"); }  :
	('null' { addLeafNodeForToken($cn, null); })
;
numberLiteral returns [CompositeNode cn]
	@init{ cn = factory.createNumberLiteralNode(); cn.setRule("numberLiteral"); }  :
	(IntLiteral { addLeafNodeForToken($cn, null); })
	| (IntLiteral { addLeafNodeForToken($cn, null); }) ('.' { addLeafNodeForToken($cn, null); }) (IntLiteral { addLeafNodeForToken($cn, null); })
;
collectionExpression returns [CompositeNode cn]
	@init{ cn = factory.createCollectionExpressionNode(); cn.setRule("collectionExpression"); }  :
	('typeSelect' { addLeafNodeForToken($cn, null); }) ('(' { addLeafNodeForToken($cn, null); }) (unnamed112=type { addToChildren(cn, unnamed112); }) (')' { addLeafNodeForToken($cn, null); })
	| ((('collect' { addLeafNodeForToken($cn, null); })
	| ('select' { addLeafNodeForToken($cn, null); })
	| ('selectFirst' { addLeafNodeForToken($cn, null); })
	| ('reject' { addLeafNodeForToken($cn, null); })
	| ('exists' { addLeafNodeForToken($cn, null); })
	| ('notExists' { addLeafNodeForToken($cn, null); })
	| ('sortBy' { addLeafNodeForToken($cn, null); })
	| ('forAll' { addLeafNodeForToken($cn, null); }))) ('(' { addLeafNodeForToken($cn, null); }) (((unnamed113=identifier { addToChildren(cn, unnamed113); }) ('|' { addLeafNodeForToken($cn, null); })))? (unnamed114=expression { addToChildren(cn, unnamed114); }) (')' { addLeafNodeForToken($cn, null); })
;
declaredParameterList returns [CompositeNode cn]
	@init{ cn = factory.createDeclaredParameterListNode(); cn.setRule("declaredParameterList"); }  :
	(unnamed115=declaredParameter { addToChildren(cn, unnamed115); }) (((',' { addLeafNodeForToken($cn, null); }) (unnamed116=declaredParameter { addToChildren(cn, unnamed116); })))*
;
declaredParameter returns [CompositeNode cn]
	@init{ cn = factory.createDeclaredParameterNode(); cn.setRule("declaredParameter"); }  :
	(unnamed117=type { addToChildren(cn, unnamed117); }) (unnamed118=identifier { addToChildren(cn, unnamed118); })
;
parameterList returns [CompositeNode cn]
	@init{ cn = factory.createParameterListNode(); cn.setRule("parameterList"); }  :
	(unnamed119=expression { addToChildren(cn, unnamed119); }) (((',' { addLeafNodeForToken($cn, null); }) (unnamed120=expression { addToChildren(cn, unnamed120); })))*
;
type returns [CompositeNode cn]  :
	(collectionType { $cn = $collectionType.cn; })
	| (simpleType { $cn = $simpleType.cn; })
;
collectionType returns [CompositeNode cn]
	@init{ cn = factory.createCollectionTypeNode(); cn.setRule("collectionType"); }  :
	((('Collection' { addLeafNodeForToken($cn, null); })
	| ('List' { addLeafNodeForToken($cn, null); })
	| ('Set' { addLeafNodeForToken($cn, null); }))) ((('[' { addLeafNodeForToken($cn, null); }) (unnamed121=simpleType { addToChildren(cn, unnamed121); }) (']' { addLeafNodeForToken($cn, null); })))?
;
simpleType returns [CompositeNode cn]
	@init{ cn = factory.createSimpleTypeNode(); cn.setRule("simpleType"); }  :
	(unnamed122=identifier { addToChildren(cn, unnamed122); }) ((('::' { addLeafNodeForToken($cn, null); }) (unnamed123=identifier { addToChildren(cn, unnamed123); })))*
;
identifier returns [CompositeNode cn]
	@init{ cn = factory.createIdentifierNode(); cn.setRule("identifier"); }  :
	(Identifier { addLeafNodeForToken($cn, null); })
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

	