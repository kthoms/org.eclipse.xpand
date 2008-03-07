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

r_file returns [CompositeNode cn]
	@init{ cn = factory.createFileNode();
	    }
	@after{ cn = normalize(cn); }  :
	(((imp=r_nsImport { addToChildren(cn, imp); ((FileNode) cn).getImp().add(imp); })))* (((decl=r_abstractDeclaration { addToChildren(cn, decl); ((FileNode) cn).getDecl().add(decl); })))* (EOF)
;

r_nsImport returns [CompositeNode cn]
	@init{ cn = factory.createNsImportNode();
	    }  :
	(LG { addLeafNodeForToken($cn, null); }) ('IMPORT' { addLeafNodeForToken($cn, null); }) (ns=r_simpleType { addToChildren(cn, ns); ((NsImportNode) cn).setNs(ns); }) (RG { addLeafNodeForToken($cn, null); })
	| (LG { addLeafNodeForToken($cn, null); }) ('EXTENSION' { addLeafNodeForToken($cn, null); }) (ns=r_simpleType { addToChildren(cn, ns); ((NsImportNode) cn).setNs(ns); }) (RG { addLeafNodeForToken($cn, null); })
	| ('import' { addLeafNodeForToken($cn, null); }) (unnamed0=r_type { addToChildren(cn, unnamed0); }) (';' { addLeafNodeForToken($cn, null); })
	| ('extension' { addLeafNodeForToken($cn, null); }) (unnamed1=r_type { addToChildren(cn, unnamed1); }) ((('reexport' { addLeafNodeForToken($cn, null); })))? (';' { addLeafNodeForToken($cn, null); })
;

r_abstractDeclaration returns [CompositeNode cn]  :
	(r_check { $cn = $r_check.cn; })
	| (r_around { $cn = $r_around.cn; })
	| (r_extension { $cn = $r_extension.cn; })
	| (r_definition { $cn = $r_definition.cn; })
	| (r_definitionAround { $cn = $r_definitionAround.cn; })
;

r_definition returns [CompositeNode cn]
	@init{ cn = factory.createDefinitionNode();
	    }  :
	(LG { addLeafNodeForToken($cn, null); }) (DEFINE { addLeafNodeForToken($cn, null); }) (name=r_identifier { addToChildren(cn, name); ((DefinitionNode) cn).setName(name); }) ((('(' { addLeafNodeForToken($cn, null); }) (((unnamed2=r_declaredParameterList { addToChildren(cn, unnamed2); }) (((',' { addLeafNodeForToken($cn, null); })? ('*' { addLeafNodeForToken($cn, null); })))?
	| ('*' { addLeafNodeForToken($cn, null); })))? (')' { addLeafNodeForToken($cn, null); })))? ('FOR' { addLeafNodeForToken($cn, null); }) (unnamed3=r_type { addToChildren(cn, unnamed3); }) (unnamed4=r_sequence { addToChildren(cn, unnamed4); }) (ENDDEFINE { addLeafNodeForToken($cn, null); }) (RG { addLeafNodeForToken($cn, null); })
;

r_definitionAround returns [CompositeNode cn]
	@init{ cn = factory.createDefinitionAroundNode();
	    }  :
	(LG { addLeafNodeForToken($cn, null); }) (AROUND { addLeafNodeForToken($cn, null); }) (unnamed5=r_pointcut { addToChildren(cn, unnamed5); }) ((('(' { addLeafNodeForToken($cn, null); }) (((unnamed6=r_declaredParameterList { addToChildren(cn, unnamed6); }) (((',' { addLeafNodeForToken($cn, null); })? ('*' { addLeafNodeForToken($cn, null); })))?
	| ('*' { addLeafNodeForToken($cn, null); })))? (')' { addLeafNodeForToken($cn, null); })))? ('FOR' { addLeafNodeForToken($cn, null); }) (unnamed7=r_type { addToChildren(cn, unnamed7); }) (unnamed8=r_sequence { addToChildren(cn, unnamed8); }) (ENDAROUND { addLeafNodeForToken($cn, null); }) (RG { addLeafNodeForToken($cn, null); })
;

r_sequence returns [CompositeNode cn]
	@init{ cn = factory.createSequenceNode();
	    }  :
	(unnamed9=r_textSequence { addToChildren(cn, unnamed9); }) (((unnamed10=r_statement { addToChildren(cn, unnamed10); }) (unnamed11=r_textSequence { addToChildren(cn, unnamed11); })))*
;

r_statement returns [CompositeNode cn]  :
	(r_simpleStatement { $cn = $r_simpleStatement.cn; })
	| (r_fileStatement { $cn = $r_fileStatement.cn; })
	| (r_foreachStatement { $cn = $r_foreachStatement.cn; })
	| (r_ifStatement { $cn = $r_ifStatement.cn; })
	| (r_letStatement { $cn = $r_letStatement.cn; })
	| (r_protectStatement { $cn = $r_protectStatement.cn; })
;

r_textSequence returns [CompositeNode cn]
	@init{ cn = factory.createTextSequenceNode();
	    }
	@after{ cn = normalize(cn); }  :
	(unnamed12=r_text { addToChildren(cn, unnamed12); }) (((unnamed13=r_text { addToChildren(cn, unnamed13); })))*
;

r_text returns [CompositeNode cn]
	@init{ cn = factory.createTextNode();
	    }  :
	('-' { addLeafNodeForToken($cn, null); })? (TEXT { addLeafNodeForToken($cn, null); })
;

r_simpleStatement returns [CompositeNode cn]  :
	(r_errorStatement { $cn = $r_errorStatement.cn; })
	| (r_expandStatement { $cn = $r_expandStatement.cn; })
	| (r_expressionStmt { $cn = $r_expressionStmt.cn; })
;

r_errorStatement returns [CompositeNode cn]
	@init{ cn = factory.createErrorStatementNode();
	    }  :
	('ERROR' { addLeafNodeForToken($cn, null); }) (unnamed14=r_expression { addToChildren(cn, unnamed14); })
;

r_expandStatement returns [CompositeNode cn]
	@init{ cn = factory.createExpandStatementNode();
	    }  :
	('EXPAND' { addLeafNodeForToken($cn, null); }) (unnamed15=r_simpleType { addToChildren(cn, unnamed15); }) ((('(' { addLeafNodeForToken($cn, null); }) (unnamed16=r_parameterList { addToChildren(cn, unnamed16); }) (')' { addLeafNodeForToken($cn, null); })))? ((((('FOR' { addLeafNodeForToken($cn, null); }) (unnamed17=r_expression { addToChildren(cn, unnamed17); })))
	| ((('FOREACH' { addLeafNodeForToken($cn, null); }) (unnamed18=r_expression { addToChildren(cn, unnamed18); }) ((('SEPARATOR' { addLeafNodeForToken($cn, null); }) (unnamed19=r_expression { addToChildren(cn, unnamed19); })))?))))?
;

r_expressionStmt returns [CompositeNode cn]
	@init{ cn = factory.createExpressionStmtNode();
	    }  :
	(unnamed20=r_expression { addToChildren(cn, unnamed20); })
;

r_fileStatement returns [CompositeNode cn]
	@init{ cn = factory.createFileStatementNode();
	    }  :
	('FILE' { addLeafNodeForToken($cn, null); }) (unnamed21=r_expression { addToChildren(cn, unnamed21); }) (((unnamed22=r_identifier { addToChildren(cn, unnamed22); })))? (unnamed23=r_sequence { addToChildren(cn, unnamed23); }) ('ENDFILE' { addLeafNodeForToken($cn, null); })
;

r_foreachStatement returns [CompositeNode cn]
	@init{ cn = factory.createForeachStatementNode();
	    }  :
	('FOREACH' { addLeafNodeForToken($cn, null); }) (unnamed24=r_expression { addToChildren(cn, unnamed24); }) ('AS' { addLeafNodeForToken($cn, null); }) (unnamed25=r_identifier { addToChildren(cn, unnamed25); }) ((('ITERATOR' { addLeafNodeForToken($cn, null); }) (unnamed26=r_identifier { addToChildren(cn, unnamed26); })))? ((('SEPARATOR' { addLeafNodeForToken($cn, null); }) (unnamed27=r_expression { addToChildren(cn, unnamed27); })))? (unnamed28=r_sequence { addToChildren(cn, unnamed28); }) ('ENDFOREACH' { addLeafNodeForToken($cn, null); })
;

r_ifStatement returns [CompositeNode cn]
	@init{ cn = factory.createIfStatementNode();
	    }  :
	('IF' { addLeafNodeForToken($cn, null); }) (unnamed29=r_expression { addToChildren(cn, unnamed29); }) (unnamed30=r_sequence { addToChildren(cn, unnamed30); }) (unnamed31=r_elseIfStatement { addToChildren(cn, unnamed31); })* (unnamed32=r_elseStatement { addToChildren(cn, unnamed32); })? ('ENDIF' { addLeafNodeForToken($cn, null); })
;

r_elseIfStatement returns [CompositeNode cn]
	@init{ cn = factory.createElseIfStatementNode();
	    }  :
	('ELSEIF' { addLeafNodeForToken($cn, null); }) (unnamed33=r_expression { addToChildren(cn, unnamed33); }) (unnamed34=r_sequence { addToChildren(cn, unnamed34); })
;

r_elseStatement returns [CompositeNode cn]
	@init{ cn = factory.createElseStatementNode();
	    }  :
	('ELSE' { addLeafNodeForToken($cn, null); }) (unnamed35=r_sequence { addToChildren(cn, unnamed35); })
;

r_letStatement returns [CompositeNode cn]
	@init{ cn = factory.createLetStatementNode();
	    }  :
	('LET' { addLeafNodeForToken($cn, null); }) (unnamed36=r_expression { addToChildren(cn, unnamed36); }) ('AS' { addLeafNodeForToken($cn, null); }) (unnamed37=r_identifier { addToChildren(cn, unnamed37); }) (unnamed38=r_sequence { addToChildren(cn, unnamed38); }) ('ENDLET' { addLeafNodeForToken($cn, null); })
;

r_protectStatement returns [CompositeNode cn]
	@init{ cn = factory.createProtectStatementNode();
	    }  :
	('PROTECT' { addLeafNodeForToken($cn, null); }) ('CSTART' { addLeafNodeForToken($cn, null); }) (unnamed39=r_expression { addToChildren(cn, unnamed39); }) ('CEND' { addLeafNodeForToken($cn, null); }) (unnamed40=r_expression { addToChildren(cn, unnamed40); }) ('ID' { addLeafNodeForToken($cn, null); }) (unnamed41=r_expression { addToChildren(cn, unnamed41); }) ('DISABLE' { addLeafNodeForToken($cn, null); })? (unnamed42=r_sequence { addToChildren(cn, unnamed42); }) ('ENDPROTECT' { addLeafNodeForToken($cn, null); })
;

r_check returns [CompositeNode cn]
	@init{ cn = factory.createCheckNode();
	    }  :
	('context' { addLeafNodeForToken($cn, null); }) (unnamed43=r_type { addToChildren(cn, unnamed43); }) ((('if' { addLeafNodeForToken($cn, null); }) (unnamed44=r_expression { addToChildren(cn, unnamed44); })))? ((('ERROR' { addLeafNodeForToken($cn, null); })
	| ('WARNING' { addLeafNodeForToken($cn, null); }))) (unnamed45=r_expression { addToChildren(cn, unnamed45); }) (':' { addLeafNodeForToken($cn, null); }) (unnamed46=r_expression { addToChildren(cn, unnamed46); }) (';' { addLeafNodeForToken($cn, null); })
;

r_around returns [CompositeNode cn]
	@init{ cn = factory.createAroundNode();
	    }  :
	('around' { addLeafNodeForToken($cn, null); }) (unnamed47=r_pointcut { addToChildren(cn, unnamed47); }) ('(' { addLeafNodeForToken($cn, null); }) (((unnamed48=r_declaredParameterList { addToChildren(cn, unnamed48); }) (((',' { addLeafNodeForToken($cn, null); })? ('*' { addLeafNodeForToken($cn, null); })))?
	| ('*' { addLeafNodeForToken($cn, null); })))? (')' { addLeafNodeForToken($cn, null); }) (':' { addLeafNodeForToken($cn, null); }) (unnamed49=r_expression { addToChildren(cn, unnamed49); }) (';' { addLeafNodeForToken($cn, null); })
;

r_pointcut returns [CompositeNode cn]
	@init{ cn = factory.createPointcutNode();
	    }  :
	((('*' { addLeafNodeForToken($cn, null); })
	| (unnamed50=r_identifier { addToChildren(cn, unnamed50); }))) ((('*' { addLeafNodeForToken($cn, null); })
	| (unnamed51=r_identifier { addToChildren(cn, unnamed51); })
	| ('::' { addLeafNodeForToken($cn, null); })))*
;

r_extension returns [CompositeNode cn]
	@init{ cn = factory.createExtensionNode();
	    }  :
	((('private' { addLeafNodeForToken($cn, "private"); })
	| ('cached' { addLeafNodeForToken($cn, "cached"); })
	| ('create' { addLeafNodeForToken($cn, "create"); })))* (returnType=r_type { addToChildren(cn, returnType); ((ExtensionNode) cn).setReturnType(returnType); })? (name=r_identifier { addToChildren(cn, name); ((ExtensionNode) cn).setName(name); }) ('(' { addLeafNodeForToken($cn, null); }) (paramList=r_declaredParameterList { addToChildren(cn, paramList); ((ExtensionNode) cn).setParamList(paramList); })? (')' { addLeafNodeForToken($cn, null); }) (':' { addLeafNodeForToken($cn, null); }) ((('JAVA' { addLeafNodeForToken($cn, null); }) (javaReturnType=r_javaType { addToChildren(cn, javaReturnType); ((ExtensionNode) cn).setJavaReturnType(javaReturnType); }) ('.' { addLeafNodeForToken($cn, null); }) (javaName=r_identifier { addToChildren(cn, javaName); ((ExtensionNode) cn).setJavaName(javaName); }) ('(' { addLeafNodeForToken($cn, null); }) (((unnamed52=r_javaType { addToChildren(cn, unnamed52); }) (((',' { addLeafNodeForToken($cn, null); }) (unnamed53=r_javaType { addToChildren(cn, unnamed53); })))*))? (')' { addLeafNodeForToken($cn, null); })
	| (extendBody=r_expression { addToChildren(cn, extendBody); ((ExtensionNode) cn).setExtendBody(extendBody); }))) (';' { addLeafNodeForToken($cn, null); })
;

r_javaType returns [CompositeNode cn]
	@init{ cn = factory.createJavaTypeNode();
	    }  :
	(unnamed54=r_identifier { addToChildren(cn, unnamed54); }) ((('.' { addLeafNodeForToken($cn, null); }) (((unnamed55=r_identifier { addToChildren(cn, unnamed55); })
	| ('Collection' { addLeafNodeForToken($cn, null); })
	| ('List' { addLeafNodeForToken($cn, null); })
	| ('Set' { addLeafNodeForToken($cn, null); })))))*
;

r_test_expression returns [CompositeNode cn]
	@init{ cn = factory.createTest_expressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(unnamed56=r_expression { addToChildren(cn, unnamed56); }) (EOF)
;

r_expression returns [CompositeNode cn]
	@init{ cn = factory.createExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(unnamed57=r_letExpression { addToChildren(cn, unnamed57); })
;

r_letExpression returns [CompositeNode cn]
	@init{ cn = factory.createLetExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	('let' { addLeafNodeForToken($cn, null); }) (unnamed58=r_identifier { addToChildren(cn, unnamed58); }) ('=' { addLeafNodeForToken($cn, null); }) (unnamed59=r_castedExpression { addToChildren(cn, unnamed59); }) (':' { addLeafNodeForToken($cn, null); }) (unnamed60=r_expression { addToChildren(cn, unnamed60); })
	| (unnamed61=r_castedExpression { addToChildren(cn, unnamed61); })
;

r_castedExpression returns [CompositeNode cn]
	@init{ cn = factory.createCastedExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	('(' r_type ')' r_chainExpression)=>(('(' { addLeafNodeForToken($cn, null); }) (unnamed62=r_type { addToChildren(cn, unnamed62); }) (')' { addLeafNodeForToken($cn, null); }) (unnamed63=r_chainExpression { addToChildren(cn, unnamed63); }))
	| (unnamed64=r_chainExpression { addToChildren(cn, unnamed64); })
;

r_chainExpression returns [CompositeNode cn]
	@init{ cn = factory.createChainExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(unnamed65=r_ifExpression { addToChildren(cn, unnamed65); }) ((('->' { addLeafNodeForToken($cn, null); }) (unnamed66=r_ifExpression { addToChildren(cn, unnamed66); })))*
;

r_ifExpression returns [CompositeNode cn]
	@init{ cn = factory.createIfExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(unnamed67=r_switchExpression { addToChildren(cn, unnamed67); }) ((('?' { addLeafNodeForToken($cn, null); }) (unnamed68=r_expression { addToChildren(cn, unnamed68); }) (':' { addLeafNodeForToken($cn, null); }) (unnamed69=r_switchExpression { addToChildren(cn, unnamed69); })))?
	| ('if' { addLeafNodeForToken($cn, null); }) (unnamed70=r_expression { addToChildren(cn, unnamed70); }) ('then' { addLeafNodeForToken($cn, null); }) (unnamed71=r_switchExpression { addToChildren(cn, unnamed71); }) ((('else' { addLeafNodeForToken($cn, null); }) (unnamed72=r_switchExpression { addToChildren(cn, unnamed72); })))?
;

r_switchExpression returns [CompositeNode cn]
	@init{ cn = factory.createSwitchExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	('switch' { addLeafNodeForToken($cn, null); }) ((('(' { addLeafNodeForToken($cn, null); }) (unnamed73=r_orExpression { addToChildren(cn, unnamed73); }) (')' { addLeafNodeForToken($cn, null); })))? ('{' { addLeafNodeForToken($cn, null); }) (unnamed74=r_casePart { addToChildren(cn, unnamed74); })* ('default' { addLeafNodeForToken($cn, null); }) (':' { addLeafNodeForToken($cn, null); }) (unnamed75=r_orExpression { addToChildren(cn, unnamed75); }) ('}' { addLeafNodeForToken($cn, null); })
	| (unnamed76=r_orExpression { addToChildren(cn, unnamed76); })
;

r_casePart returns [CompositeNode cn]
	@init{ cn = factory.createCasePartNode();
	    }  :
	('case' { addLeafNodeForToken($cn, null); }) (unnamed77=r_expression { addToChildren(cn, unnamed77); }) (':' { addLeafNodeForToken($cn, null); }) (unnamed78=r_expression { addToChildren(cn, unnamed78); })
;

r_orExpression returns [CompositeNode cn]
	@init{ cn = factory.createOrExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(unnamed79=r_andExpression { addToChildren(cn, unnamed79); }) ((('||' { addLeafNodeForToken($cn, null); }) (unnamed80=r_andExpression { addToChildren(cn, unnamed80); })))*
;

r_andExpression returns [CompositeNode cn]
	@init{ cn = factory.createAndExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(unnamed81=r_impliesExpression { addToChildren(cn, unnamed81); }) ((('&&' { addLeafNodeForToken($cn, null); }) (unnamed82=r_impliesExpression { addToChildren(cn, unnamed82); })))*
;

r_impliesExpression returns [CompositeNode cn]
	@init{ cn = factory.createImpliesExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(unnamed83=r_relationalExpression { addToChildren(cn, unnamed83); }) ((('implies' { addLeafNodeForToken($cn, null); }) (unnamed84=r_relationalExpression { addToChildren(cn, unnamed84); })))*
;

r_relationalExpression returns [CompositeNode cn]
	@init{ cn = factory.createRelationalExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(leftOperand=r_additiveExpression { addToChildren(cn, leftOperand); ((RelationalExpressionNode) cn).setLeftOperand(leftOperand); }) (((operator=r_relationalOperator { addToChildren(cn, operator); ((RelationalExpressionNode) cn).setOperator(operator); }) (rightOperand=r_additiveExpression { addToChildren(cn, rightOperand); ((RelationalExpressionNode) cn).setRightOperand(rightOperand); })))*
;

r_relationalOperator returns [CompositeNode cn]
	@init{ cn = factory.createRelationalOperatorNode();
	    }  :
	('==' { addLeafNodeForToken($cn, null); })
	| ('!=' { addLeafNodeForToken($cn, null); })
	| ('>=' { addLeafNodeForToken($cn, null); })
	| ('<=' { addLeafNodeForToken($cn, null); })
	| ('>' { addLeafNodeForToken($cn, null); })
	| ('<' { addLeafNodeForToken($cn, null); })
;

r_additiveExpression returns [CompositeNode cn]
	@init{ cn = factory.createAdditiveExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(unnamed85=r_multiplicativeExpression { addToChildren(cn, unnamed85); }) ((((('+' { addLeafNodeForToken($cn, null); })
	| ('-' { addLeafNodeForToken($cn, null); }))) (unnamed86=r_multiplicativeExpression { addToChildren(cn, unnamed86); })))*
;

r_multiplicativeExpression returns [CompositeNode cn]
	@init{ cn = factory.createMultiplicativeExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(unnamed87=r_unaryExpression { addToChildren(cn, unnamed87); }) ((((('*' { addLeafNodeForToken($cn, null); })
	| ('/' { addLeafNodeForToken($cn, null); }))) (unnamed88=r_unaryExpression { addToChildren(cn, unnamed88); })))*
;

r_unaryExpression returns [CompositeNode cn]
	@init{ cn = factory.createUnaryExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(unnamed89=r_infixExpression { addToChildren(cn, unnamed89); })
	| ('!' { addLeafNodeForToken($cn, null); }) (unnamed90=r_infixExpression { addToChildren(cn, unnamed90); })
	| ('-' { addLeafNodeForToken($cn, null); }) (unnamed91=r_infixExpression { addToChildren(cn, unnamed91); })
;

r_infixExpression returns [CompositeNode cn]
	@init{ cn = factory.createInfixExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(target=r_primaryExpression { addToChildren(cn, target); ((InfixExpressionNode) cn).setTarget(target); }) ((('.' { addLeafNodeForToken($cn, null); }) (calls=r_featureCall { addToChildren(cn, calls); ((InfixExpressionNode) cn).getCalls().add(calls); })))*
;

r_primaryExpression returns [CompositeNode cn]  :
	(r_stringLiteral { $cn = $r_stringLiteral.cn; })
	| (r_featureCall { $cn = $r_featureCall.cn; })
	| (r_booleanLiteral { $cn = $r_booleanLiteral.cn; })
	| (r_numberLiteral { $cn = $r_numberLiteral.cn; })
	| (r_nullLiteral { $cn = $r_nullLiteral.cn; })
	| (r_listLiteral { $cn = $r_listLiteral.cn; })
	| (r_constructorCall { $cn = $r_constructorCall.cn; })
	| (r_globalVarExpression { $cn = $r_globalVarExpression.cn; })
	| (r_paranthesizedExpression { $cn = $r_paranthesizedExpression.cn; })
;

r_stringLiteral returns [CompositeNode cn]
	@init{ cn = factory.createStringLiteralNode();
	    }  :
	(StringLiteral { addLeafNodeForToken($cn, null); })
;

r_paranthesizedExpression returns [CompositeNode cn]
	@init{ cn = factory.createParanthesizedExpressionNode();
	    }  :
	('(' { addLeafNodeForToken($cn, null); }) (unnamed92=r_expression { addToChildren(cn, unnamed92); }) (')' { addLeafNodeForToken($cn, null); })
;

r_globalVarExpression returns [CompositeNode cn]
	@init{ cn = factory.createGlobalVarExpressionNode();
	    }  :
	('GLOBALVAR' { addLeafNodeForToken($cn, null); }) (unnamed93=r_identifier { addToChildren(cn, unnamed93); })
;

r_featureCall returns [CompositeNode cn]
	@init{ cn = factory.createFeatureCallNode();
	    }
	@after{ cn = normalize(cn); }  :
	(name=r_identifier { addToChildren(cn, name); ((FeatureCallNode) cn).setName(name); }) ('(' { addLeafNodeForToken($cn, null); }) (((paramList=r_parameterList { addToChildren(cn, paramList); ((FeatureCallNode) cn).setParamList(paramList); })))? (')' { addLeafNodeForToken($cn, null); })
	| (unnamed94=r_type { addToChildren(cn, unnamed94); })
	| (unnamed95=r_collectionExpression { addToChildren(cn, unnamed95); })
;

r_listLiteral returns [CompositeNode cn]
	@init{ cn = factory.createListLiteralNode();
	    }  :
	('{' { addLeafNodeForToken($cn, null); }) (((unnamed96=r_expression { addToChildren(cn, unnamed96); }) (((',' { addLeafNodeForToken($cn, null); }) (unnamed97=r_expression { addToChildren(cn, unnamed97); })))*))? ('}' { addLeafNodeForToken($cn, null); })
;

r_constructorCall returns [CompositeNode cn]
	@init{ cn = factory.createConstructorCallNode();
	    }  :
	('new' { addLeafNodeForToken($cn, null); }) (unnamed98=r_simpleType { addToChildren(cn, unnamed98); })
;

r_booleanLiteral returns [CompositeNode cn]
	@init{ cn = factory.createBooleanLiteralNode();
	    }  :
	('false' { addLeafNodeForToken($cn, null); })
	| ('true' { addLeafNodeForToken($cn, null); })
;

r_nullLiteral returns [CompositeNode cn]
	@init{ cn = factory.createNullLiteralNode();
	    }  :
	('null' { addLeafNodeForToken($cn, null); })
;

r_numberLiteral returns [CompositeNode cn]
	@init{ cn = factory.createNumberLiteralNode();
	    }  :
	(IntLiteral { addLeafNodeForToken($cn, null); })
	| (IntLiteral { addLeafNodeForToken($cn, null); }) ('.' { addLeafNodeForToken($cn, null); }) (IntLiteral { addLeafNodeForToken($cn, null); })
;

r_collectionExpression returns [CompositeNode cn]
	@init{ cn = factory.createCollectionExpressionNode();
	    }  :
	('typeSelect' { addLeafNodeForToken($cn, null); }) ('(' { addLeafNodeForToken($cn, null); }) (unnamed99=r_type { addToChildren(cn, unnamed99); }) (')' { addLeafNodeForToken($cn, null); })
	| ((('collect' { addLeafNodeForToken($cn, null); })
	| ('select' { addLeafNodeForToken($cn, null); })
	| ('selectFirst' { addLeafNodeForToken($cn, null); })
	| ('reject' { addLeafNodeForToken($cn, null); })
	| ('exists' { addLeafNodeForToken($cn, null); })
	| ('notExists' { addLeafNodeForToken($cn, null); })
	| ('sortBy' { addLeafNodeForToken($cn, null); })
	| ('forAll' { addLeafNodeForToken($cn, null); }))) ('(' { addLeafNodeForToken($cn, null); }) (((unnamed100=r_identifier { addToChildren(cn, unnamed100); }) ('|' { addLeafNodeForToken($cn, null); })))? (unnamed101=r_expression { addToChildren(cn, unnamed101); }) (')' { addLeafNodeForToken($cn, null); })
;

r_declaredParameterList returns [CompositeNode cn]
	@init{ cn = factory.createDeclaredParameterListNode();
	    }  :
	(params=r_declaredParameter { addToChildren(cn, params); ((DeclaredParameterListNode) cn).getParams().add(params); }) (((',' { addLeafNodeForToken($cn, null); }) (params=r_declaredParameter { addToChildren(cn, params); ((DeclaredParameterListNode) cn).getParams().add(params); })))*
;

r_declaredParameter returns [CompositeNode cn]
	@init{ cn = factory.createDeclaredParameterNode();
	    }  :
	(ptype=r_type { addToChildren(cn, ptype); ((DeclaredParameterNode) cn).setPtype(ptype); }) (name=r_identifier { addToChildren(cn, name); ((DeclaredParameterNode) cn).setName(name); })
;

r_parameterList returns [CompositeNode cn]
	@init{ cn = factory.createParameterListNode();
	    }  :
	(params=r_expression { addToChildren(cn, params); ((ParameterListNode) cn).getParams().add(params); }) (((',' { addLeafNodeForToken($cn, null); }) (params=r_expression { addToChildren(cn, params); ((ParameterListNode) cn).getParams().add(params); })))*
;

r_type returns [CompositeNode cn]  :
	(r_collectionType { $cn = $r_collectionType.cn; })
	| (r_simpleType { $cn = $r_simpleType.cn; })
;

r_collectionType returns [CompositeNode cn]
	@init{ cn = factory.createCollectionTypeNode();
	    }  :
	((('Collection' { addLeafNodeForToken($cn, null); })
	| ('List' { addLeafNodeForToken($cn, null); })
	| ('Set' { addLeafNodeForToken($cn, null); }))) ((('[' { addLeafNodeForToken($cn, null); }) (unnamed102=r_simpleType { addToChildren(cn, unnamed102); }) (']' { addLeafNodeForToken($cn, null); })))?
;

r_simpleType returns [CompositeNode cn]
	@init{ cn = factory.createSimpleTypeNode();
	    }  :
	(names=r_identifier { addToChildren(cn, names); ((SimpleTypeNode) cn).getNames().add(names); }) ((('::' { addLeafNodeForToken($cn, null); }) (names=r_identifier { addToChildren(cn, names); ((SimpleTypeNode) cn).getNames().add(names); })))*
;

r_identifier returns [CompositeNode cn]
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


	