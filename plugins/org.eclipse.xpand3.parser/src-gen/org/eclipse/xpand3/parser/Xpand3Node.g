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
	@init{ cn = factory.createFileNode();
	    }
	@after{ cn = normalize(cn); }  :
	(((imp=nsImport { addToChildren(cn, imp); ((FileNode) cn).getImp().add(imp); })))* (((decl=abstractDeclaration { addToChildren(cn, decl); ((FileNode) cn).getDecl().add(decl); })))* (EOF)
;
nsImport returns [CompositeNode cn]
	@init{ cn = factory.createNsImportNode();
	    }  :
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
	@init{ cn = factory.createDefinitionNode();
	    }  :
	(LG { addLeafNodeForToken($cn, null); }) (DEFINE { addLeafNodeForToken($cn, null); }) (name=identifier { addToChildren(cn, name); ((DefinitionNode) cn).setName(name); }) ((('(' { addLeafNodeForToken($cn, null); }) (((unnamed2=declaredParameterList { addToChildren(cn, unnamed2); }) (((',' { addLeafNodeForToken($cn, null); })? ('*' { addLeafNodeForToken($cn, null); })))?
	| ('*' { addLeafNodeForToken($cn, null); })))? (')' { addLeafNodeForToken($cn, null); })))? ('FOR' { addLeafNodeForToken($cn, null); }) (unnamed3=type { addToChildren(cn, unnamed3); }) (unnamed4=sequence { addToChildren(cn, unnamed4); }) (ENDDEFINE { addLeafNodeForToken($cn, null); }) (RG { addLeafNodeForToken($cn, null); })
;
definitionAround returns [CompositeNode cn]
	@init{ cn = factory.createDefinitionAroundNode();
	    }  :
	(LG { addLeafNodeForToken($cn, null); }) (AROUND { addLeafNodeForToken($cn, null); }) (unnamed5=pointcut { addToChildren(cn, unnamed5); }) ((('(' { addLeafNodeForToken($cn, null); }) (((unnamed6=declaredParameterList { addToChildren(cn, unnamed6); }) (((',' { addLeafNodeForToken($cn, null); })? ('*' { addLeafNodeForToken($cn, null); })))?
	| ('*' { addLeafNodeForToken($cn, null); })))? (')' { addLeafNodeForToken($cn, null); })))? ('FOR' { addLeafNodeForToken($cn, null); }) (unnamed7=type { addToChildren(cn, unnamed7); }) (unnamed8=sequence { addToChildren(cn, unnamed8); }) (ENDAROUND { addLeafNodeForToken($cn, null); }) (RG { addLeafNodeForToken($cn, null); })
;
sequence returns [CompositeNode cn]
	@init{ cn = factory.createSequenceNode();
	    }  :
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
	@init{ cn = factory.createTextSequenceNode();
	    }
	@after{ cn = normalize(cn); }  :
	(unnamed12=text { addToChildren(cn, unnamed12); }) (((unnamed13=text { addToChildren(cn, unnamed13); })))*
;
text returns [CompositeNode cn]
	@init{ cn = factory.createTextNode();
	    }  :
	('-' { addLeafNodeForToken($cn, null); })? (TEXT { addLeafNodeForToken($cn, null); })
;
simpleStatement returns [CompositeNode cn]  :
	(errorStatement { $cn = $errorStatement.cn; })
	| (expandStatement { $cn = $expandStatement.cn; })
	| (expressionStmt { $cn = $expressionStmt.cn; })
;
errorStatement returns [CompositeNode cn]
	@init{ cn = factory.createErrorStatementNode();
	    }  :
	('ERROR' { addLeafNodeForToken($cn, null); }) (unnamed14=expression { addToChildren(cn, unnamed14); })
;
expandStatement returns [CompositeNode cn]
	@init{ cn = factory.createExpandStatementNode();
	    }  :
	('EXPAND' { addLeafNodeForToken($cn, null); }) (unnamed15=simpleType { addToChildren(cn, unnamed15); }) ((('(' { addLeafNodeForToken($cn, null); }) (unnamed16=parameterList { addToChildren(cn, unnamed16); }) (')' { addLeafNodeForToken($cn, null); })))? ((((('FOR' { addLeafNodeForToken($cn, null); }) (unnamed17=expression { addToChildren(cn, unnamed17); })))
	| ((('FOREACH' { addLeafNodeForToken($cn, null); }) (unnamed18=expression { addToChildren(cn, unnamed18); }) ((('SEPARATOR' { addLeafNodeForToken($cn, null); }) (unnamed19=expression { addToChildren(cn, unnamed19); })))?))))?
;
expressionStmt returns [CompositeNode cn]
	@init{ cn = factory.createExpressionStmtNode();
	    }  :
	(unnamed20=expression { addToChildren(cn, unnamed20); })
;
fileStatement returns [CompositeNode cn]
	@init{ cn = factory.createFileStatementNode();
	    }  :
	('FILE' { addLeafNodeForToken($cn, null); }) (unnamed21=expression { addToChildren(cn, unnamed21); }) (((unnamed22=identifier { addToChildren(cn, unnamed22); })))? (unnamed23=sequence { addToChildren(cn, unnamed23); }) ('ENDFILE' { addLeafNodeForToken($cn, null); })
;
foreachStatement returns [CompositeNode cn]
	@init{ cn = factory.createForeachStatementNode();
	    }  :
	('FOREACH' { addLeafNodeForToken($cn, null); }) (unnamed24=expression { addToChildren(cn, unnamed24); }) ('AS' { addLeafNodeForToken($cn, null); }) (unnamed25=identifier { addToChildren(cn, unnamed25); }) ((('ITERATOR' { addLeafNodeForToken($cn, null); }) (unnamed26=identifier { addToChildren(cn, unnamed26); })))? ((('SEPARATOR' { addLeafNodeForToken($cn, null); }) (unnamed27=expression { addToChildren(cn, unnamed27); })))? (unnamed28=sequence { addToChildren(cn, unnamed28); }) ('ENDFOREACH' { addLeafNodeForToken($cn, null); })
;
ifStatement returns [CompositeNode cn]
	@init{ cn = factory.createIfStatementNode();
	    }  :
	('IF' { addLeafNodeForToken($cn, null); }) (unnamed29=expression { addToChildren(cn, unnamed29); }) (unnamed30=sequence { addToChildren(cn, unnamed30); }) (unnamed31=elseIfStatement { addToChildren(cn, unnamed31); })* (unnamed32=elseStatement { addToChildren(cn, unnamed32); })? ('ENDIF' { addLeafNodeForToken($cn, null); })
;
elseIfStatement returns [CompositeNode cn]
	@init{ cn = factory.createElseIfStatementNode();
	    }  :
	('ELSEIF' { addLeafNodeForToken($cn, null); }) (unnamed33=expression { addToChildren(cn, unnamed33); }) (unnamed34=sequence { addToChildren(cn, unnamed34); })
;
elseStatement returns [CompositeNode cn]
	@init{ cn = factory.createElseStatementNode();
	    }  :
	('ELSE' { addLeafNodeForToken($cn, null); }) (unnamed35=sequence { addToChildren(cn, unnamed35); })
;
letStatement returns [CompositeNode cn]
	@init{ cn = factory.createLetStatementNode();
	    }  :
	('LET' { addLeafNodeForToken($cn, null); }) (unnamed36=expression { addToChildren(cn, unnamed36); }) ('AS' { addLeafNodeForToken($cn, null); }) (unnamed37=identifier { addToChildren(cn, unnamed37); }) (unnamed38=sequence { addToChildren(cn, unnamed38); }) ('ENDLET' { addLeafNodeForToken($cn, null); })
;
protectStatement returns [CompositeNode cn]
	@init{ cn = factory.createProtectStatementNode();
	    }  :
	('PROTECT' { addLeafNodeForToken($cn, null); }) ('CSTART' { addLeafNodeForToken($cn, null); }) (unnamed39=expression { addToChildren(cn, unnamed39); }) ('CEND' { addLeafNodeForToken($cn, null); }) (unnamed40=expression { addToChildren(cn, unnamed40); }) ('ID' { addLeafNodeForToken($cn, null); }) (unnamed41=expression { addToChildren(cn, unnamed41); }) ('DISABLE' { addLeafNodeForToken($cn, null); })? (unnamed42=sequence { addToChildren(cn, unnamed42); }) ('ENDPROTECT' { addLeafNodeForToken($cn, null); })
;
check returns [CompositeNode cn]
	@init{ cn = factory.createCheckNode();
	    }  :
	('context' { addLeafNodeForToken($cn, null); }) (unnamed43=type { addToChildren(cn, unnamed43); }) ((('if' { addLeafNodeForToken($cn, null); }) (unnamed44=expression { addToChildren(cn, unnamed44); })))? ((('ERROR' { addLeafNodeForToken($cn, null); })
	| ('WARNING' { addLeafNodeForToken($cn, null); }))) (unnamed45=expression { addToChildren(cn, unnamed45); }) (':' { addLeafNodeForToken($cn, null); }) (unnamed46=expression { addToChildren(cn, unnamed46); }) (';' { addLeafNodeForToken($cn, null); })
;
around returns [CompositeNode cn]
	@init{ cn = factory.createAroundNode();
	    }  :
	('around' { addLeafNodeForToken($cn, null); }) (unnamed47=pointcut { addToChildren(cn, unnamed47); }) ('(' { addLeafNodeForToken($cn, null); }) (((unnamed48=declaredParameterList { addToChildren(cn, unnamed48); }) (((',' { addLeafNodeForToken($cn, null); })? ('*' { addLeafNodeForToken($cn, null); })))?
	| ('*' { addLeafNodeForToken($cn, null); })))? (')' { addLeafNodeForToken($cn, null); }) (':' { addLeafNodeForToken($cn, null); }) (unnamed49=expression { addToChildren(cn, unnamed49); }) (';' { addLeafNodeForToken($cn, null); })
;
pointcut returns [CompositeNode cn]
	@init{ cn = factory.createPointcutNode();
	    }  :
	((('*' { addLeafNodeForToken($cn, null); })
	| (unnamed50=identifier { addToChildren(cn, unnamed50); }))) ((('*' { addLeafNodeForToken($cn, null); })
	| (unnamed51=identifier { addToChildren(cn, unnamed51); })
	| ('::' { addLeafNodeForToken($cn, null); })))*
;
extension returns [CompositeNode cn]
	@init{ cn = factory.createExtensionNode();
	    }  :
	((('private' { addLeafNodeForToken($cn, "private"); })
	| ('cached' { addLeafNodeForToken($cn, "cached"); })
	| ('create' { addLeafNodeForToken($cn, "create"); })))* (returnType=type { addToChildren(cn, returnType); ((ExtensionNode) cn).setReturnType(returnType); })? (name=identifier { addToChildren(cn, name); ((ExtensionNode) cn).setName(name); }) ('(' { addLeafNodeForToken($cn, null); }) (paramList=declaredParameterList { addToChildren(cn, paramList); ((ExtensionNode) cn).setParamList(paramList); })? (')' { addLeafNodeForToken($cn, null); }) (':' { addLeafNodeForToken($cn, null); }) ((('JAVA' { addLeafNodeForToken($cn, null); }) (javaReturnType=javaType { addToChildren(cn, javaReturnType); ((ExtensionNode) cn).setJavaReturnType(javaReturnType); }) ('.' { addLeafNodeForToken($cn, null); }) (javaName=identifier { addToChildren(cn, javaName); ((ExtensionNode) cn).setJavaName(javaName); }) ('(' { addLeafNodeForToken($cn, null); }) (((unnamed52=javaType { addToChildren(cn, unnamed52); }) (((',' { addLeafNodeForToken($cn, null); }) (unnamed53=javaType { addToChildren(cn, unnamed53); })))*))? (')' { addLeafNodeForToken($cn, null); })
	| (extendBody=expression { addToChildren(cn, extendBody); ((ExtensionNode) cn).setExtendBody(extendBody); }))) (';' { addLeafNodeForToken($cn, null); })
;
javaType returns [CompositeNode cn]
	@init{ cn = factory.createJavaTypeNode();
	    }  :
	(unnamed54=identifier { addToChildren(cn, unnamed54); }) ((('.' { addLeafNodeForToken($cn, null); }) (((unnamed55=identifier { addToChildren(cn, unnamed55); })
	| ('Collection' { addLeafNodeForToken($cn, null); })
	| ('List' { addLeafNodeForToken($cn, null); })
	| ('Set' { addLeafNodeForToken($cn, null); })))))*
;
test_expression returns [CompositeNode cn]
	@init{ cn = factory.createTest_expressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(unnamed56=expression { addToChildren(cn, unnamed56); }) (EOF)
;
expression returns [CompositeNode cn]
	@init{ cn = factory.createExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(unnamed57=letExpression { addToChildren(cn, unnamed57); })
;
letExpression returns [CompositeNode cn]
	@init{ cn = factory.createLetExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	('let' { addLeafNodeForToken($cn, null); }) (unnamed58=identifier { addToChildren(cn, unnamed58); }) ('=' { addLeafNodeForToken($cn, null); }) (unnamed59=castedExpression { addToChildren(cn, unnamed59); }) (':' { addLeafNodeForToken($cn, null); }) (unnamed60=expression { addToChildren(cn, unnamed60); })
	| (unnamed61=castedExpression { addToChildren(cn, unnamed61); })
;
castedExpression returns [CompositeNode cn]
	@init{ cn = factory.createCastedExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	('(' type ')' chainExpression)=>(('(' { addLeafNodeForToken($cn, null); }) (unnamed62=type { addToChildren(cn, unnamed62); }) (')' { addLeafNodeForToken($cn, null); }) (unnamed63=chainExpression { addToChildren(cn, unnamed63); }))
	| (unnamed64=chainExpression { addToChildren(cn, unnamed64); })
;
chainExpression returns [CompositeNode cn]
	@init{ cn = factory.createChainExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(unnamed65=ifExpression { addToChildren(cn, unnamed65); }) ((('->' { addLeafNodeForToken($cn, null); }) (unnamed66=ifExpression { addToChildren(cn, unnamed66); })))*
;
ifExpression returns [CompositeNode cn]
	@init{ cn = factory.createIfExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(unnamed67=switchExpression { addToChildren(cn, unnamed67); }) ((('?' { addLeafNodeForToken($cn, null); }) (unnamed68=expression { addToChildren(cn, unnamed68); }) (':' { addLeafNodeForToken($cn, null); }) (unnamed69=switchExpression { addToChildren(cn, unnamed69); })))?
	| ('if' { addLeafNodeForToken($cn, null); }) (unnamed70=expression { addToChildren(cn, unnamed70); }) ('then' { addLeafNodeForToken($cn, null); }) (unnamed71=switchExpression { addToChildren(cn, unnamed71); }) ((('else' { addLeafNodeForToken($cn, null); }) (unnamed72=switchExpression { addToChildren(cn, unnamed72); })))?
;
switchExpression returns [CompositeNode cn]
	@init{ cn = factory.createSwitchExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	('switch' { addLeafNodeForToken($cn, null); }) ((('(' { addLeafNodeForToken($cn, null); }) (unnamed73=orExpression { addToChildren(cn, unnamed73); }) (')' { addLeafNodeForToken($cn, null); })))? ('{' { addLeafNodeForToken($cn, null); }) (unnamed74=casePart { addToChildren(cn, unnamed74); })* ('default' { addLeafNodeForToken($cn, null); }) (':' { addLeafNodeForToken($cn, null); }) (unnamed75=orExpression { addToChildren(cn, unnamed75); }) ('}' { addLeafNodeForToken($cn, null); })
	| (unnamed76=orExpression { addToChildren(cn, unnamed76); })
;
casePart returns [CompositeNode cn]
	@init{ cn = factory.createCasePartNode();
	    }  :
	('case' { addLeafNodeForToken($cn, null); }) (unnamed77=expression { addToChildren(cn, unnamed77); }) (':' { addLeafNodeForToken($cn, null); }) (unnamed78=expression { addToChildren(cn, unnamed78); })
;
orExpression returns [CompositeNode cn]
	@init{ cn = factory.createOrExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(unnamed79=andExpression { addToChildren(cn, unnamed79); }) ((('||' { addLeafNodeForToken($cn, null); }) (unnamed80=andExpression { addToChildren(cn, unnamed80); })))*
;
andExpression returns [CompositeNode cn]
	@init{ cn = factory.createAndExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(unnamed81=impliesExpression { addToChildren(cn, unnamed81); }) ((('&&' { addLeafNodeForToken($cn, null); }) (unnamed82=impliesExpression { addToChildren(cn, unnamed82); })))*
;
impliesExpression returns [CompositeNode cn]
	@init{ cn = factory.createImpliesExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(unnamed83=relationalExpression { addToChildren(cn, unnamed83); }) ((('implies' { addLeafNodeForToken($cn, null); }) (unnamed84=relationalExpression { addToChildren(cn, unnamed84); })))*
;
relationalExpression returns [CompositeNode cn]
	@init{ cn = factory.createRelationalExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(leftOperand=additiveExpression { addToChildren(cn, leftOperand); ((RelationalExpressionNode) cn).setLeftOperand(leftOperand); }) (((operator=booleanOperator { addToChildren(cn, operator); ((RelationalExpressionNode) cn).setOperator(operator); }) (rightOperand=additiveExpression { addToChildren(cn, rightOperand); ((RelationalExpressionNode) cn).setRightOperand(rightOperand); })))*
;
booleanOperator returns [CompositeNode cn]
	@init{ cn = factory.createBooleanOperatorNode();
	    }  :
	('==' { addLeafNodeForToken($cn, null); })
	| ('!=' { addLeafNodeForToken($cn, null); })
	| ('>=' { addLeafNodeForToken($cn, null); })
	| ('<=' { addLeafNodeForToken($cn, null); })
	| ('>' { addLeafNodeForToken($cn, null); })
	| ('<' { addLeafNodeForToken($cn, null); })
;
additiveExpression returns [CompositeNode cn]
	@init{ cn = factory.createAdditiveExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(unnamed85=multiplicativeExpression { addToChildren(cn, unnamed85); }) ((((('+' { addLeafNodeForToken($cn, null); })
	| ('-' { addLeafNodeForToken($cn, null); }))) (unnamed86=multiplicativeExpression { addToChildren(cn, unnamed86); })))*
;
multiplicativeExpression returns [CompositeNode cn]
	@init{ cn = factory.createMultiplicativeExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(unnamed87=unaryExpression { addToChildren(cn, unnamed87); }) ((((('*' { addLeafNodeForToken($cn, null); })
	| ('/' { addLeafNodeForToken($cn, null); }))) (unnamed88=unaryExpression { addToChildren(cn, unnamed88); })))*
;
unaryExpression returns [CompositeNode cn]
	@init{ cn = factory.createUnaryExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(unnamed89=infixExpression { addToChildren(cn, unnamed89); })
	| ('!' { addLeafNodeForToken($cn, null); }) (unnamed90=infixExpression { addToChildren(cn, unnamed90); })
	| ('-' { addLeafNodeForToken($cn, null); }) (unnamed91=infixExpression { addToChildren(cn, unnamed91); })
;
infixExpression returns [CompositeNode cn]
	@init{ cn = factory.createInfixExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(target=primaryExpression { addToChildren(cn, target); ((InfixExpressionNode) cn).setTarget(target); }) ((('.' { addLeafNodeForToken($cn, null); }) (calls=featureCall { addToChildren(cn, calls); ((InfixExpressionNode) cn).getCalls().add(calls); })))*
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
	@init{ cn = factory.createStringLiteralNode();
	    }  :
	(StringLiteral { addLeafNodeForToken($cn, null); })
;
paranthesizedExpression returns [CompositeNode cn]
	@init{ cn = factory.createParanthesizedExpressionNode();
	    }  :
	('(' { addLeafNodeForToken($cn, null); }) (unnamed92=expression { addToChildren(cn, unnamed92); }) (')' { addLeafNodeForToken($cn, null); })
;
globalVarExpression returns [CompositeNode cn]
	@init{ cn = factory.createGlobalVarExpressionNode();
	    }  :
	('GLOBALVAR' { addLeafNodeForToken($cn, null); }) (unnamed93=identifier { addToChildren(cn, unnamed93); })
;
featureCall returns [CompositeNode cn]
	@init{ cn = factory.createFeatureCallNode();
	    }
	@after{ cn = normalize(cn); }  :
	(name=identifier { addToChildren(cn, name); ((FeatureCallNode) cn).setName(name); }) ('(' { addLeafNodeForToken($cn, null); }) (((paramList=parameterList { addToChildren(cn, paramList); ((FeatureCallNode) cn).setParamList(paramList); })))? (')' { addLeafNodeForToken($cn, null); })
	| (unnamed94=type { addToChildren(cn, unnamed94); })
	| (unnamed95=collectionExpression { addToChildren(cn, unnamed95); })
;
listLiteral returns [CompositeNode cn]
	@init{ cn = factory.createListLiteralNode();
	    }  :
	('{' { addLeafNodeForToken($cn, null); }) (((unnamed96=expression { addToChildren(cn, unnamed96); }) (((',' { addLeafNodeForToken($cn, null); }) (unnamed97=expression { addToChildren(cn, unnamed97); })))*))? ('}' { addLeafNodeForToken($cn, null); })
;
constructorCall returns [CompositeNode cn]
	@init{ cn = factory.createConstructorCallNode();
	    }  :
	('new' { addLeafNodeForToken($cn, null); }) (unnamed98=simpleType { addToChildren(cn, unnamed98); })
;
booleanLiteral returns [CompositeNode cn]
	@init{ cn = factory.createBooleanLiteralNode();
	    }  :
	('false' { addLeafNodeForToken($cn, null); })
	| ('true' { addLeafNodeForToken($cn, null); })
;
nullLiteral returns [CompositeNode cn]
	@init{ cn = factory.createNullLiteralNode();
	    }  :
	('null' { addLeafNodeForToken($cn, null); })
;
numberLiteral returns [CompositeNode cn]
	@init{ cn = factory.createNumberLiteralNode();
	    }  :
	(IntLiteral { addLeafNodeForToken($cn, null); })
	| (IntLiteral { addLeafNodeForToken($cn, null); }) ('.' { addLeafNodeForToken($cn, null); }) (IntLiteral { addLeafNodeForToken($cn, null); })
;
collectionExpression returns [CompositeNode cn]
	@init{ cn = factory.createCollectionExpressionNode();
	    }  :
	('typeSelect' { addLeafNodeForToken($cn, null); }) ('(' { addLeafNodeForToken($cn, null); }) (unnamed99=type { addToChildren(cn, unnamed99); }) (')' { addLeafNodeForToken($cn, null); })
	| ((('collect' { addLeafNodeForToken($cn, null); })
	| ('select' { addLeafNodeForToken($cn, null); })
	| ('selectFirst' { addLeafNodeForToken($cn, null); })
	| ('reject' { addLeafNodeForToken($cn, null); })
	| ('exists' { addLeafNodeForToken($cn, null); })
	| ('notExists' { addLeafNodeForToken($cn, null); })
	| ('sortBy' { addLeafNodeForToken($cn, null); })
	| ('forAll' { addLeafNodeForToken($cn, null); }))) ('(' { addLeafNodeForToken($cn, null); }) (((unnamed100=identifier { addToChildren(cn, unnamed100); }) ('|' { addLeafNodeForToken($cn, null); })))? (unnamed101=expression { addToChildren(cn, unnamed101); }) (')' { addLeafNodeForToken($cn, null); })
;
declaredParameterList returns [CompositeNode cn]
	@init{ cn = factory.createDeclaredParameterListNode();
	    }  :
	(params=declaredParameter { addToChildren(cn, params); ((DeclaredParameterListNode) cn).getParams().add(params); }) (((',' { addLeafNodeForToken($cn, null); }) (params=declaredParameter { addToChildren(cn, params); ((DeclaredParameterListNode) cn).getParams().add(params); })))*
;
declaredParameter returns [CompositeNode cn]
	@init{ cn = factory.createDeclaredParameterNode();
	    }  :
	(ptype=type { addToChildren(cn, ptype); ((DeclaredParameterNode) cn).setPtype(ptype); }) (name=identifier { addToChildren(cn, name); ((DeclaredParameterNode) cn).setName(name); })
;
parameterList returns [CompositeNode cn]
	@init{ cn = factory.createParameterListNode();
	    }  :
	(params=expression { addToChildren(cn, params); ((ParameterListNode) cn).getParams().add(params); }) (((',' { addLeafNodeForToken($cn, null); }) (params=expression { addToChildren(cn, params); ((ParameterListNode) cn).getParams().add(params); })))*
;
type returns [CompositeNode cn]  :
	(collectionType { $cn = $collectionType.cn; })
	| (simpleType { $cn = $simpleType.cn; })
;
collectionType returns [CompositeNode cn]
	@init{ cn = factory.createCollectionTypeNode();
	    }  :
	((('Collection' { addLeafNodeForToken($cn, null); })
	| ('List' { addLeafNodeForToken($cn, null); })
	| ('Set' { addLeafNodeForToken($cn, null); }))) ((('[' { addLeafNodeForToken($cn, null); }) (unnamed102=simpleType { addToChildren(cn, unnamed102); }) (']' { addLeafNodeForToken($cn, null); })))?
;
simpleType returns [CompositeNode cn]
	@init{ cn = factory.createSimpleTypeNode();
	    }  :
	(names=identifier { addToChildren(cn, names); ((SimpleTypeNode) cn).getNames().add(names); }) ((('::' { addLeafNodeForToken($cn, null); }) (names=identifier { addToChildren(cn, names); ((SimpleTypeNode) cn).getNames().add(names); })))*
;
identifier returns [CompositeNode cn]
	@init{ cn = factory.createIdentifierNode();
	    }  :
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

	