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
	    }  :
	(((f_imports=r_nsImport { addToChildren(cn, f_imports); ((FileNode) cn).getImports().add(f_imports); })))* (((f_declarations=r_abstractDeclaration { addToChildren(cn, f_declarations); ((FileNode) cn).getDeclarations().add(f_declarations); })))* (EOF)
;

r_nsImport returns [CompositeNode cn]  :
	(r_import { $cn = $r_import.cn; })
	| (r_extensionImport { $cn = $r_extensionImport.cn; })
;

r_import returns [CompositeNode cn]
	@init{ cn = factory.createImportNode();
	    }  :
	(((LG { addLeafNodeForToken($cn, null); }) ('IMPORT' { addLeafNodeForToken($cn, null); }) (f_namespace=r_simpleType { addToChildren(cn, f_namespace); ((ImportNode) cn).setNamespace(f_namespace); }) (RG { addLeafNodeForToken($cn, null); })))
	| ('import' { addLeafNodeForToken($cn, null); }) (f_type=r_type { addToChildren(cn, f_type); ((ImportNode) cn).setType(f_type); }) (';' { addLeafNodeForToken($cn, null); })
;

r_extensionImport returns [CompositeNode cn]
	@init{ cn = factory.createExtensionImportNode();
	    }  :
	(((LG { addLeafNodeForToken($cn, null); }) ('EXTENSION' { addLeafNodeForToken($cn, null); }) (f_namespace=r_simpleType { addToChildren(cn, f_namespace); ((ExtensionImportNode) cn).setNamespace(f_namespace); }) (RG { addLeafNodeForToken($cn, null); })))
	| ('extension' { addLeafNodeForToken($cn, null); }) (f_type=r_type { addToChildren(cn, f_type); ((ExtensionImportNode) cn).setType(f_type); }) ('reexport' { addLeafNodeForToken($cn, null); })? (';' { addLeafNodeForToken($cn, null); })
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
	(LG { addLeafNodeForToken($cn, null); }) (DEFINE { addLeafNodeForToken($cn, null); }) (f_name=r_identifier { addToChildren(cn, f_name); ((DefinitionNode) cn).setName(f_name); }) ((('(' { addLeafNodeForToken($cn, null); }) (((f_paramList=r_declaredParameterList { addToChildren(cn, f_paramList); ((DefinitionNode) cn).setParamList(f_paramList); }) (((',' { addLeafNodeForToken($cn, null); })? ('*' { addLeafNodeForToken($cn, null); })))?
	| ('*' { addLeafNodeForToken($cn, null); })))? (')' { addLeafNodeForToken($cn, null); })))? ('FOR' { addLeafNodeForToken($cn, null); }) (f_type=r_type { addToChildren(cn, f_type); ((DefinitionNode) cn).setType(f_type); }) (f_sequence=r_sequence { addToChildren(cn, f_sequence); ((DefinitionNode) cn).setSequence(f_sequence); }) (ENDDEFINE { addLeafNodeForToken($cn, null); }) (RG { addLeafNodeForToken($cn, null); })
;

r_definitionAround returns [CompositeNode cn]
	@init{ cn = factory.createDefinitionAroundNode();
	    }  :
	(LG { addLeafNodeForToken($cn, null); }) (AROUND { addLeafNodeForToken($cn, null); }) (f_pointcut=r_pointcut { addToChildren(cn, f_pointcut); ((DefinitionAroundNode) cn).setPointcut(f_pointcut); }) ((('(' { addLeafNodeForToken($cn, null); }) (((f_paramList=r_declaredParameterList { addToChildren(cn, f_paramList); ((DefinitionAroundNode) cn).setParamList(f_paramList); }) (((',' { addLeafNodeForToken($cn, null); })? ('*' { addLeafNodeForToken($cn, null); })))?
	| ('*' { addLeafNodeForToken($cn, null); })))? (')' { addLeafNodeForToken($cn, null); })))? ('FOR' { addLeafNodeForToken($cn, null); }) (f_type=r_type { addToChildren(cn, f_type); ((DefinitionAroundNode) cn).setType(f_type); }) (f_sequence=r_sequence { addToChildren(cn, f_sequence); ((DefinitionAroundNode) cn).setSequence(f_sequence); }) (ENDAROUND { addLeafNodeForToken($cn, null); }) (RG { addLeafNodeForToken($cn, null); })
;

r_sequence returns [CompositeNode cn]
	@init{ cn = factory.createSequenceNode();
	    }  :
	(f_textSequences=r_textSequence { addToChildren(cn, f_textSequences); ((SequenceNode) cn).getTextSequences().add(f_textSequences); }) (((f_statements=r_statement { addToChildren(cn, f_statements); ((SequenceNode) cn).getStatements().add(f_statements); }) (f_textSequences=r_textSequence { addToChildren(cn, f_textSequences); ((SequenceNode) cn).getTextSequences().add(f_textSequences); })))*
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
	(f_texts=r_text { addToChildren(cn, f_texts); ((TextSequenceNode) cn).getTexts().add(f_texts); }) (((f_texts=r_text { addToChildren(cn, f_texts); ((TextSequenceNode) cn).getTexts().add(f_texts); })))*
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
	('ERROR' { addLeafNodeForToken($cn, null); }) (f_expression=r_expression { addToChildren(cn, f_expression); ((ErrorStatementNode) cn).setExpression(f_expression); })
;

r_expandStatement returns [CompositeNode cn]
	@init{ cn = factory.createExpandStatementNode();
	    }  :
	('EXPAND' { addLeafNodeForToken($cn, null); }) (f_name=r_simpleType { addToChildren(cn, f_name); ((ExpandStatementNode) cn).setName(f_name); }) ((('(' { addLeafNodeForToken($cn, null); }) (f_paramList=r_parameterList { addToChildren(cn, f_paramList); ((ExpandStatementNode) cn).setParamList(f_paramList); }) (')' { addLeafNodeForToken($cn, null); })))? ((((('FOR' { addLeafNodeForToken($cn, null); }) (f_forExpression=r_expression { addToChildren(cn, f_forExpression); ((ExpandStatementNode) cn).setForExpression(f_forExpression); })))
	| ((('FOREACH' { addLeafNodeForToken($cn, null); }) (f_forEachExpression=r_expression { addToChildren(cn, f_forEachExpression); ((ExpandStatementNode) cn).setForEachExpression(f_forEachExpression); }) ((('SEPARATOR' { addLeafNodeForToken($cn, null); }) (f_separator=r_expression { addToChildren(cn, f_separator); ((ExpandStatementNode) cn).setSeparator(f_separator); })))?))))?
;

r_expressionStmt returns [CompositeNode cn]
	@init{ cn = factory.createExpressionStmtNode();
	    }  :
	(f_expression=r_expression { addToChildren(cn, f_expression); ((ExpressionStmtNode) cn).setExpression(f_expression); })
;

r_fileStatement returns [CompositeNode cn]
	@init{ cn = factory.createFileStatementNode();
	    }  :
	('FILE' { addLeafNodeForToken($cn, null); }) (f_nameExpression=r_expression { addToChildren(cn, f_nameExpression); ((FileStatementNode) cn).setNameExpression(f_nameExpression); }) ((('ONCE' { addLeafNodeForToken($cn, null); })))? (((f_identifier=r_identifier { addToChildren(cn, f_identifier); ((FileStatementNode) cn).setIdentifier(f_identifier); })))? (f_sequence=r_sequence { addToChildren(cn, f_sequence); ((FileStatementNode) cn).setSequence(f_sequence); }) ('ENDFILE' { addLeafNodeForToken($cn, null); })
;

r_foreachStatement returns [CompositeNode cn]
	@init{ cn = factory.createForeachStatementNode();
	    }  :
	('FOREACH' { addLeafNodeForToken($cn, null); }) (f_forExpression=r_expression { addToChildren(cn, f_forExpression); ((ForeachStatementNode) cn).setForExpression(f_forExpression); }) ('AS' { addLeafNodeForToken($cn, null); }) (f_identifier=r_identifier { addToChildren(cn, f_identifier); ((ForeachStatementNode) cn).setIdentifier(f_identifier); }) ((('ITERATOR' { addLeafNodeForToken($cn, null); }) (f_iterator=r_identifier { addToChildren(cn, f_iterator); ((ForeachStatementNode) cn).setIterator(f_iterator); })))? ((('SEPARATOR' { addLeafNodeForToken($cn, null); }) (f_separatorExpression=r_expression { addToChildren(cn, f_separatorExpression); ((ForeachStatementNode) cn).setSeparatorExpression(f_separatorExpression); })))? (f_sequence=r_sequence { addToChildren(cn, f_sequence); ((ForeachStatementNode) cn).setSequence(f_sequence); }) ('ENDFOREACH' { addLeafNodeForToken($cn, null); })
;

r_ifStatement returns [CompositeNode cn]
	@init{ cn = factory.createIfStatementNode();
	    }  :
	('IF' { addLeafNodeForToken($cn, null); }) (f_expression=r_expression { addToChildren(cn, f_expression); ((IfStatementNode) cn).setExpression(f_expression); }) (f_sequence=r_sequence { addToChildren(cn, f_sequence); ((IfStatementNode) cn).setSequence(f_sequence); }) (f_elseIfs=r_elseIfStatement { addToChildren(cn, f_elseIfs); ((IfStatementNode) cn).getElseIfs().add(f_elseIfs); })* (f_else=r_elseStatement { addToChildren(cn, f_else); ((IfStatementNode) cn).setElse(f_else); })? ('ENDIF' { addLeafNodeForToken($cn, null); })
;

r_elseIfStatement returns [CompositeNode cn]
	@init{ cn = factory.createElseIfStatementNode();
	    }  :
	('ELSEIF' { addLeafNodeForToken($cn, null); }) (f_expression=r_expression { addToChildren(cn, f_expression); ((ElseIfStatementNode) cn).setExpression(f_expression); }) (f_sequence=r_sequence { addToChildren(cn, f_sequence); ((ElseIfStatementNode) cn).setSequence(f_sequence); })
;

r_elseStatement returns [CompositeNode cn]
	@init{ cn = factory.createElseStatementNode();
	    }  :
	('ELSE' { addLeafNodeForToken($cn, null); }) (f_sequence=r_sequence { addToChildren(cn, f_sequence); ((ElseStatementNode) cn).setSequence(f_sequence); })
;

r_letStatement returns [CompositeNode cn]
	@init{ cn = factory.createLetStatementNode();
	    }  :
	('LET' { addLeafNodeForToken($cn, null); }) (f_expression=r_expression { addToChildren(cn, f_expression); ((LetStatementNode) cn).setExpression(f_expression); }) ('AS' { addLeafNodeForToken($cn, null); }) (f_name=r_identifier { addToChildren(cn, f_name); ((LetStatementNode) cn).setName(f_name); }) (f_sequence=r_sequence { addToChildren(cn, f_sequence); ((LetStatementNode) cn).setSequence(f_sequence); }) ('ENDLET' { addLeafNodeForToken($cn, null); })
;

r_protectStatement returns [CompositeNode cn]
	@init{ cn = factory.createProtectStatementNode();
	    }  :
	('PROTECT' { addLeafNodeForToken($cn, null); }) ('CSTART' { addLeafNodeForToken($cn, null); }) (f_cstart=r_expression { addToChildren(cn, f_cstart); ((ProtectStatementNode) cn).setCstart(f_cstart); }) ('CEND' { addLeafNodeForToken($cn, null); }) (f_cend=r_expression { addToChildren(cn, f_cend); ((ProtectStatementNode) cn).setCend(f_cend); }) ('ID' { addLeafNodeForToken($cn, null); }) (f_id=r_expression { addToChildren(cn, f_id); ((ProtectStatementNode) cn).setId(f_id); }) ('DISABLE' { addLeafNodeForToken($cn, null); })? (f_sequence=r_sequence { addToChildren(cn, f_sequence); ((ProtectStatementNode) cn).setSequence(f_sequence); }) ('ENDPROTECT' { addLeafNodeForToken($cn, null); })
;

r_check returns [CompositeNode cn]
	@init{ cn = factory.createCheckNode();
	    }  :
	('context' { addLeafNodeForToken($cn, null); }) (f_type=r_type { addToChildren(cn, f_type); ((CheckNode) cn).setType(f_type); }) ((('if' { addLeafNodeForToken($cn, null); }) (f_ifExpression=r_expression { addToChildren(cn, f_ifExpression); ((CheckNode) cn).setIfExpression(f_ifExpression); })))? ((('ERROR' { addLeafNodeForToken($cn, "error"); })
	| ('WARNING' { addLeafNodeForToken($cn, "warning"); }))) (f_message=r_expression { addToChildren(cn, f_message); ((CheckNode) cn).setMessage(f_message); }) (':' { addLeafNodeForToken($cn, null); }) (f_constraint=r_expression { addToChildren(cn, f_constraint); ((CheckNode) cn).setConstraint(f_constraint); }) (';' { addLeafNodeForToken($cn, null); })
;

r_around returns [CompositeNode cn]
	@init{ cn = factory.createAroundNode();
	    }  :
	('around' { addLeafNodeForToken($cn, null); }) (f_unnamed0=r_pointcut { addToChildren(cn, f_unnamed0); }) ('(' { addLeafNodeForToken($cn, null); }) (((f_unnamed1=r_declaredParameterList { addToChildren(cn, f_unnamed1); }) (((',' { addLeafNodeForToken($cn, null); })? ('*' { addLeafNodeForToken($cn, null); })))?
	| ('*' { addLeafNodeForToken($cn, null); })))? (')' { addLeafNodeForToken($cn, null); }) (':' { addLeafNodeForToken($cn, null); }) (f_unnamed2=r_expression { addToChildren(cn, f_unnamed2); }) (';' { addLeafNodeForToken($cn, null); })
;

r_pointcut returns [CompositeNode cn]
	@init{ cn = factory.createPointcutNode();
	    }  :
	((('*' { addLeafNodeForToken($cn, null); })
	| (f_unnamed3=r_identifier { addToChildren(cn, f_unnamed3); }))) ((('*' { addLeafNodeForToken($cn, null); })
	| (f_unnamed4=r_identifier { addToChildren(cn, f_unnamed4); })
	| ('::' { addLeafNodeForToken($cn, null); })))*
;

r_extension returns [CompositeNode cn]
	@init{ cn = factory.createExtensionNode();
	    }  :
	((('private' { addLeafNodeForToken($cn, "private"); })
	| ('cached' { addLeafNodeForToken($cn, "cached"); })
	| ('create' { addLeafNodeForToken($cn, "create"); })))* (f_returnType=r_type { addToChildren(cn, f_returnType); ((ExtensionNode) cn).setReturnType(f_returnType); })? (f_name=r_identifier { addToChildren(cn, f_name); ((ExtensionNode) cn).setName(f_name); }) ('(' { addLeafNodeForToken($cn, null); }) (f_paramList=r_declaredParameterList { addToChildren(cn, f_paramList); ((ExtensionNode) cn).setParamList(f_paramList); })? (')' { addLeafNodeForToken($cn, null); }) (':' { addLeafNodeForToken($cn, null); }) ((('JAVA' { addLeafNodeForToken($cn, null); }) (f_javaReturnType=r_javaType { addToChildren(cn, f_javaReturnType); ((ExtensionNode) cn).setJavaReturnType(f_javaReturnType); }) ('.' { addLeafNodeForToken($cn, null); }) (f_javaName=r_identifier { addToChildren(cn, f_javaName); ((ExtensionNode) cn).setJavaName(f_javaName); }) ('(' { addLeafNodeForToken($cn, null); }) (((f_unnamed5=r_javaType { addToChildren(cn, f_unnamed5); }) (((',' { addLeafNodeForToken($cn, null); }) (f_unnamed6=r_javaType { addToChildren(cn, f_unnamed6); })))*))? (')' { addLeafNodeForToken($cn, null); })
	| (f_extendBody=r_expression { addToChildren(cn, f_extendBody); ((ExtensionNode) cn).setExtendBody(f_extendBody); }))) (';' { addLeafNodeForToken($cn, null); })
;

r_javaType returns [CompositeNode cn]
	@init{ cn = factory.createJavaTypeNode();
	    }  :
	(f_unnamed7=r_identifier { addToChildren(cn, f_unnamed7); }) ((('.' { addLeafNodeForToken($cn, null); }) (((f_unnamed8=r_identifier { addToChildren(cn, f_unnamed8); })
	| ('Collection' { addLeafNodeForToken($cn, null); })
	| ('List' { addLeafNodeForToken($cn, null); })
	| ('Set' { addLeafNodeForToken($cn, null); })))))*
;

r_test_expression returns [CompositeNode cn]
	@init{ cn = factory.createTest_expressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(f_unnamed9=r_expression { addToChildren(cn, f_unnamed9); }) (EOF)
;

r_expression returns [CompositeNode cn]  :
	(r_letExpression { $cn = $r_letExpression.cn; })
;

r_letExpression returns [CompositeNode cn]
	@init{ cn = factory.createLetExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	('let' { addLeafNodeForToken($cn, null); }) (f_unnamed10=r_identifier { addToChildren(cn, f_unnamed10); }) ('=' { addLeafNodeForToken($cn, null); }) (f_unnamed11=r_castedExpression { addToChildren(cn, f_unnamed11); }) (':' { addLeafNodeForToken($cn, null); }) (f_unnamed12=r_expression { addToChildren(cn, f_unnamed12); })
	| (f_unnamed13=r_castedExpression { addToChildren(cn, f_unnamed13); })
;

r_castedExpression returns [CompositeNode cn]
	@init{ cn = factory.createCastedExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	('(' r_type ')' r_chainExpression)=>(('(' { addLeafNodeForToken($cn, null); }) (f_type=r_type { addToChildren(cn, f_type); ((CastedExpressionNode) cn).setType(f_type); }) (')' { addLeafNodeForToken($cn, null); }) (f_target=r_chainExpression { addToChildren(cn, f_target); ((CastedExpressionNode) cn).setTarget(f_target); }))
	| (f_unnamed14=r_chainExpression { addToChildren(cn, f_unnamed14); })
;

r_chainExpression returns [CompositeNode cn]
	@init{ cn = factory.createChainExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(f_first=r_ifExpression { addToChildren(cn, f_first); ((ChainExpressionNode) cn).setFirst(f_first); }) ((('->' { addLeafNodeForToken($cn, null); }) (f_nexts=r_ifExpression { addToChildren(cn, f_nexts); ((ChainExpressionNode) cn).getNexts().add(f_nexts); })))*
;

r_ifExpression returns [CompositeNode cn]
	@init{ cn = factory.createIfExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(f_condition0=r_switchExpression { addToChildren(cn, f_condition0); ((IfExpressionNode) cn).setCondition0(f_condition0); }) ((('?' { addLeafNodeForToken($cn, null); }) (f_then=r_expression { addToChildren(cn, f_then); ((IfExpressionNode) cn).setThen(f_then); }) (':' { addLeafNodeForToken($cn, null); }) (f_else=r_switchExpression { addToChildren(cn, f_else); ((IfExpressionNode) cn).setElse(f_else); })))?
	| ('if' { addLeafNodeForToken($cn, null); }) (f_condition1=r_expression { addToChildren(cn, f_condition1); ((IfExpressionNode) cn).setCondition1(f_condition1); }) ('then' { addLeafNodeForToken($cn, null); }) (f_then=r_switchExpression { addToChildren(cn, f_then); ((IfExpressionNode) cn).setThen(f_then); }) ((('else' { addLeafNodeForToken($cn, null); }) (f_else=r_switchExpression { addToChildren(cn, f_else); ((IfExpressionNode) cn).setElse(f_else); })))?
;

r_switchExpression returns [CompositeNode cn]
	@init{ cn = factory.createSwitchExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	('switch' { addLeafNodeForToken($cn, null); }) ((('(' { addLeafNodeForToken($cn, null); }) (f_expression=r_orExpression { addToChildren(cn, f_expression); ((SwitchExpressionNode) cn).setExpression(f_expression); }) (')' { addLeafNodeForToken($cn, null); })))? ('{' { addLeafNodeForToken($cn, null); }) (f_cases=r_casePart { addToChildren(cn, f_cases); ((SwitchExpressionNode) cn).getCases().add(f_cases); })* ('default' { addLeafNodeForToken($cn, null); }) (':' { addLeafNodeForToken($cn, null); }) (f_default=r_orExpression { addToChildren(cn, f_default); ((SwitchExpressionNode) cn).setDefault(f_default); }) ('}' { addLeafNodeForToken($cn, null); })
	| (f_unnamed15=r_orExpression { addToChildren(cn, f_unnamed15); })
;

r_casePart returns [CompositeNode cn]
	@init{ cn = factory.createCasePartNode();
	    }  :
	('case' { addLeafNodeForToken($cn, null); }) (f_condition=r_expression { addToChildren(cn, f_condition); ((CasePartNode) cn).setCondition(f_condition); }) (':' { addLeafNodeForToken($cn, null); }) (f_expression=r_expression { addToChildren(cn, f_expression); ((CasePartNode) cn).setExpression(f_expression); })
;

r_orExpression returns [CompositeNode cn]
	@init{ cn = factory.createOrExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(f_first=r_andExpression { addToChildren(cn, f_first); ((OrExpressionNode) cn).setFirst(f_first); }) ((('||' { addLeafNodeForToken($cn, null); }) (f_nexts=r_andExpression { addToChildren(cn, f_nexts); ((OrExpressionNode) cn).getNexts().add(f_nexts); })))*
;

r_andExpression returns [CompositeNode cn]
	@init{ cn = factory.createAndExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(f_first=r_impliesExpression { addToChildren(cn, f_first); ((AndExpressionNode) cn).setFirst(f_first); }) ((('&&' { addLeafNodeForToken($cn, null); }) (f_nexts=r_impliesExpression { addToChildren(cn, f_nexts); ((AndExpressionNode) cn).getNexts().add(f_nexts); })))*
;

r_impliesExpression returns [CompositeNode cn]
	@init{ cn = factory.createImpliesExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(f_first=r_relationalExpression { addToChildren(cn, f_first); ((ImpliesExpressionNode) cn).setFirst(f_first); }) ((('implies' { addLeafNodeForToken($cn, null); }) (f_nexts=r_relationalExpression { addToChildren(cn, f_nexts); ((ImpliesExpressionNode) cn).getNexts().add(f_nexts); })))*
;

r_relationalExpression returns [CompositeNode cn]
	@init{ cn = factory.createRelationalExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(f_first=r_additiveExpression { addToChildren(cn, f_first); ((RelationalExpressionNode) cn).setFirst(f_first); }) ((((('==' { addLeafNodeForToken($cn, null); })
	| ('!=' { addLeafNodeForToken($cn, null); })
	| ('>=' { addLeafNodeForToken($cn, null); })
	| ('<=' { addLeafNodeForToken($cn, null); })
	| ('>' { addLeafNodeForToken($cn, null); })
	| ('<' { addLeafNodeForToken($cn, null); }))) (f_nexts=r_additiveExpression { addToChildren(cn, f_nexts); ((RelationalExpressionNode) cn).getNexts().add(f_nexts); })))*
;

r_additiveExpression returns [CompositeNode cn]
	@init{ cn = factory.createAdditiveExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(f_first=r_multiplicativeExpression { addToChildren(cn, f_first); ((AdditiveExpressionNode) cn).setFirst(f_first); }) ((((('+' { addLeafNodeForToken($cn, null); })
	| ('-' { addLeafNodeForToken($cn, null); }))) (f_nexts=r_multiplicativeExpression { addToChildren(cn, f_nexts); ((AdditiveExpressionNode) cn).getNexts().add(f_nexts); })))*
;

r_multiplicativeExpression returns [CompositeNode cn]
	@init{ cn = factory.createMultiplicativeExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(f_first=r_unaryExpression { addToChildren(cn, f_first); ((MultiplicativeExpressionNode) cn).setFirst(f_first); }) ((((('*' { addLeafNodeForToken($cn, null); })
	| ('/' { addLeafNodeForToken($cn, null); }))) (f_nexts=r_unaryExpression { addToChildren(cn, f_nexts); ((MultiplicativeExpressionNode) cn).getNexts().add(f_nexts); })))*
;

r_unaryExpression returns [CompositeNode cn]
	@init{ cn = factory.createUnaryExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(f_unnamed16=r_infixExpression { addToChildren(cn, f_unnamed16); })
	| ('!' { addLeafNodeForToken($cn, null); }) (f_operand=r_infixExpression { addToChildren(cn, f_operand); ((UnaryExpressionNode) cn).setOperand(f_operand); })
	| ('-' { addLeafNodeForToken($cn, null); }) (f_operand=r_infixExpression { addToChildren(cn, f_operand); ((UnaryExpressionNode) cn).setOperand(f_operand); })
;

r_infixExpression returns [CompositeNode cn]
	@init{ cn = factory.createInfixExpressionNode();
	    }
	@after{ cn = normalize(cn); }  :
	(f_target=r_primaryExpression { addToChildren(cn, f_target); ((InfixExpressionNode) cn).setTarget(f_target); }) ((('.' { addLeafNodeForToken($cn, null); }) (f_calls=r_featureCall { addToChildren(cn, f_calls); ((InfixExpressionNode) cn).getCalls().add(f_calls); })))*
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
	('(' { addLeafNodeForToken($cn, null); }) (f_expression=r_expression { addToChildren(cn, f_expression); ((ParanthesizedExpressionNode) cn).setExpression(f_expression); }) (')' { addLeafNodeForToken($cn, null); })
;

r_globalVarExpression returns [CompositeNode cn]
	@init{ cn = factory.createGlobalVarExpressionNode();
	    }  :
	('GLOBALVAR' { addLeafNodeForToken($cn, null); }) (f_unnamed17=r_identifier { addToChildren(cn, f_unnamed17); })
;

r_featureCall returns [CompositeNode cn]
	@init{ cn = factory.createFeatureCallNode();
	    }  :
	(f_unnamed18=r_collectionExpression { addToChildren(cn, f_unnamed18); })
	| (f_name=r_identifier { addToChildren(cn, f_name); ((FeatureCallNode) cn).setName(f_name); }) ('(' { addLeafNodeForToken($cn, null); }) (((f_paramList=r_parameterList { addToChildren(cn, f_paramList); ((FeatureCallNode) cn).setParamList(f_paramList); })))? (')' { addLeafNodeForToken($cn, null); })
	| (f_type=r_type { addToChildren(cn, f_type); ((FeatureCallNode) cn).setType(f_type); })
;

r_listLiteral returns [CompositeNode cn]
	@init{ cn = factory.createListLiteralNode();
	    }  :
	('{' { addLeafNodeForToken($cn, null); }) (((f_elements=r_expression { addToChildren(cn, f_elements); ((ListLiteralNode) cn).getElements().add(f_elements); }) (((',' { addLeafNodeForToken($cn, null); }) (f_elements=r_expression { addToChildren(cn, f_elements); ((ListLiteralNode) cn).getElements().add(f_elements); })))*))? ('}' { addLeafNodeForToken($cn, null); })
;

r_constructorCall returns [CompositeNode cn]
	@init{ cn = factory.createConstructorCallNode();
	    }  :
	('new' { addLeafNodeForToken($cn, null); }) (f_unnamed19=r_simpleType { addToChildren(cn, f_unnamed19); })
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
	('typeSelect' { addLeafNodeForToken($cn, null); }) ('(' { addLeafNodeForToken($cn, null); }) (f_type=r_type { addToChildren(cn, f_type); ((CollectionExpressionNode) cn).setType(f_type); }) (')' { addLeafNodeForToken($cn, null); })
	| ((('collect' { addLeafNodeForToken($cn, null); })
	| ('select' { addLeafNodeForToken($cn, null); })
	| ('selectFirst' { addLeafNodeForToken($cn, null); })
	| ('reject' { addLeafNodeForToken($cn, null); })
	| ('exists' { addLeafNodeForToken($cn, null); })
	| ('notExists' { addLeafNodeForToken($cn, null); })
	| ('sortBy' { addLeafNodeForToken($cn, null); })
	| ('forAll' { addLeafNodeForToken($cn, null); }))) ('(' { addLeafNodeForToken($cn, null); }) (((f_variable=r_identifier { addToChildren(cn, f_variable); ((CollectionExpressionNode) cn).setVariable(f_variable); }) ('|' { addLeafNodeForToken($cn, null); })))? (f_expression=r_expression { addToChildren(cn, f_expression); ((CollectionExpressionNode) cn).setExpression(f_expression); }) (')' { addLeafNodeForToken($cn, null); })
;

r_declaredParameterList returns [CompositeNode cn]
	@init{ cn = factory.createDeclaredParameterListNode();
	    }  :
	(f_params=r_declaredParameter { addToChildren(cn, f_params); ((DeclaredParameterListNode) cn).getParams().add(f_params); }) (((',' { addLeafNodeForToken($cn, null); }) (f_params=r_declaredParameter { addToChildren(cn, f_params); ((DeclaredParameterListNode) cn).getParams().add(f_params); })))*
;

r_declaredParameter returns [CompositeNode cn]
	@init{ cn = factory.createDeclaredParameterNode();
	    }  :
	(f_ptype=r_type { addToChildren(cn, f_ptype); ((DeclaredParameterNode) cn).setPtype(f_ptype); }) (f_name=r_identifier { addToChildren(cn, f_name); ((DeclaredParameterNode) cn).setName(f_name); })
;

r_parameterList returns [CompositeNode cn]
	@init{ cn = factory.createParameterListNode();
	    }  :
	(f_params=r_expression { addToChildren(cn, f_params); ((ParameterListNode) cn).getParams().add(f_params); }) (((',' { addLeafNodeForToken($cn, null); }) (f_params=r_expression { addToChildren(cn, f_params); ((ParameterListNode) cn).getParams().add(f_params); })))*
;

r_type returns [CompositeNode cn]  :
	(r_collectionType { $cn = $r_collectionType.cn; })
	| (r_simpleType { $cn = $r_simpleType.cn; })
;

r_collectionType returns [CompositeNode cn]
	@init{ cn = factory.createCollectionTypeNode();
	    }  :
	((('Collection' { addLeafNodeForToken($cn, "collectionType"); })
	| ('List' { addLeafNodeForToken($cn, "collectionType"); })
	| ('Set' { addLeafNodeForToken($cn, "collectionType"); }))) ((('[' { addLeafNodeForToken($cn, null); }) (f_elementType=r_simpleType { addToChildren(cn, f_elementType); ((CollectionTypeNode) cn).setElementType(f_elementType); }) (']' { addLeafNodeForToken($cn, null); })))?
;

r_simpleType returns [CompositeNode cn]
	@init{ cn = factory.createSimpleTypeNode();
	    }  :
	(f_names=r_identifier { addToChildren(cn, f_names); ((SimpleTypeNode) cn).getNames().add(f_names); }) ((('::' { addLeafNodeForToken($cn, null); }) (f_names=r_identifier { addToChildren(cn, f_names); ((SimpleTypeNode) cn).getNames().add(f_names); })))*
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


	