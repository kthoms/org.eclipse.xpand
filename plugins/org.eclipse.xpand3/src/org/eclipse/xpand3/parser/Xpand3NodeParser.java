package org.eclipse.xpand3.parser;

import java.util.HashSet;
import java.util.Set;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class Xpand3NodeParser extends AbstractXpand3NodeParser {

	private HashSet<String> normalizableRules;

	public Xpand3NodeParser(TokenStream input) {
		super(input);
		normalizableRules = new HashSet<String>();
		normalizableRules.add("r_abstractDeclaration");
		normalizableRules.add("r_statement");
		normalizableRules.add("r_textSequence");
		normalizableRules.add("r_simpleStatement");
		normalizableRules.add("r_expression");
		normalizableRules.add("r_letExpression");
		normalizableRules.add("r_castedExpression");
		normalizableRules.add("r_chainExpression");
		normalizableRules.add("r_ifExpression");
		normalizableRules.add("r_switchExpression");
		normalizableRules.add("r_orExpression");
		normalizableRules.add("r_andExpression");
		normalizableRules.add("r_impliesExpression");
		normalizableRules.add("r_relationalExpression");
		normalizableRules.add("r_additiveExpression");
		normalizableRules.add("r_multiplicativeExpression");
		normalizableRules.add("r_unaryExpression");
		normalizableRules.add("r_infixExpression");
		normalizableRules.add("r_primaryExpression");
		normalizableRules.add("r_featureCall");
		normalizableRules.add("r_type");
	}
	
	@Override
	protected Set<String> normalizableRules() {
		return normalizableRules;
	}
//
//	// Following code is generated (or at least should be)
//	@Override
//	public r_abstractDeclaration_return r_abstractDeclaration() throws RecognitionException {
//		try {
//			ruleStart("r_abstractDeclaration");
//			return super.r_abstractDeclaration();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_additiveExpression_return r_additiveExpression() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_additiveExpression");
//			return super.r_additiveExpression();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_andExpression_return r_andExpression() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_andExpression");
//			return super.r_andExpression();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_around_return r_around() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_around");
//			return super.r_around();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_booleanLiteral_return r_booleanLiteral() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_booleanLiteral");
//			return super.r_booleanLiteral();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_casePart_return r_casePart() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_casePart");
//			return super.r_casePart();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_castedExpression_return r_castedExpression() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_castedExpression");
//			return super.r_castedExpression();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_chainExpression_return r_chainExpression() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_chainExpression");
//			return super.r_chainExpression();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_check_return r_check() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_check");
//			return super.r_check();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_collectionExpression_return r_collectionExpression() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_collectionExpression");
//			return super.r_collectionExpression();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_collectionType_return r_collectionType() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_collectionType");
//			return super.r_collectionType();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_constructorCall_return r_constructorCall() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_constructorCall");
//			return super.r_constructorCall();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_declaredParameter_return r_declaredParameter() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_declaredParameter");
//			return super.r_declaredParameter();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_declaredParameterList_return r_declaredParameterList() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_declaredParameterList");
//			return super.r_declaredParameterList();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_expression_return r_expression() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_expression");
//			return super.r_expression();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_extension_return r_extension() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_extension");
//			return super.r_extension();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_featureCall_return r_featureCall() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_featureCall");
//			return super.r_featureCall();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_file_return r_file() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_file");
//			return super.r_file();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_globalVarExpression_return r_globalVarExpression() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_globalVarExpression");
//			return super.r_globalVarExpression();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_identifier_return r_identifier() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_identifier");
//			return super.r_identifier();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_ifExpression_return r_ifExpression() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_ifExpression");
//			return super.r_ifExpression();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_impliesExpression_return r_impliesExpression() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_impliesExpression");
//			return super.r_impliesExpression();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_infixExpression_return r_infixExpression() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_infixExpression");
//			return super.r_infixExpression();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_javaType_return r_javaType() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_javaType");
//			return super.r_javaType();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_letExpression_return r_letExpression() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_letExpression");
//			return super.r_letExpression();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_listLiteral_return r_listLiteral() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_listLiteral");
//			return super.r_listLiteral();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_multiplicativeExpression_return r_multiplicativeExpression() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_multiplicativeExpression");
//			return super.r_multiplicativeExpression();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_nsImport_return r_nsImport() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_nsImport");
//			return super.r_nsImport();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_nullLiteral_return r_nullLiteral() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_nullLiteral");
//			return super.r_nullLiteral();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_numberLiteral_return r_numberLiteral() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_numberLiteral");
//			return super.r_numberLiteral();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_orExpression_return r_orExpression() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_orExpression");
//			return super.r_orExpression();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_parameterList_return r_parameterList() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_parameterList");
//			return super.r_parameterList();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_paranthesizedExpression_return r_paranthesizedExpression() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_paranthesizedExpression");
//			return super.r_paranthesizedExpression();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_pointcut_return r_pointcut() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_pointcut");
//			return super.r_pointcut();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_primaryExpression_return r_primaryExpression() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_primaryExpression");
//			return super.r_primaryExpression();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_relationalExpression_return r_relationalExpression() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_relationalExpression");
//			return super.r_relationalExpression();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_simpleType_return r_simpleType() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_simpleType");
//			return super.r_simpleType();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_switchExpression_return r_switchExpression() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_switchExpression");
//			return super.r_switchExpression();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_type_return r_type() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_type");
//			return super.r_type();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_unaryExpression_return r_unaryExpression() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_unaryExpression");
//			return super.r_unaryExpression();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_definition_return r_definition() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_definition");
//			return super.r_definition();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_definitionAround_return r_definitionAround() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_definitionAround");
//			return super.r_definitionAround();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_elseIfStatement_return r_elseIfStatement() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_elseIfStatement");
//			return super.r_elseIfStatement();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_elseStatement_return r_elseStatement() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_elseStatement");
//			return super.r_elseStatement();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_errorStatement_return r_errorStatement() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_errorStatement");
//			return super.r_errorStatement();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_expandStatement_return r_expandStatement() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_expandStatement");
//			return super.r_expandStatement();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_expressionStmt_return r_expressionStmt() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_expressionStmt");
//			return super.r_expressionStmt();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_fileStatement_return r_fileStatement() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_fileStatement");
//			return super.r_fileStatement();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_foreachStatement_return r_foreachStatement() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_foreachStatement");
//			return super.r_foreachStatement();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_ifStatement_return r_ifStatement() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_ifStatement");
//			return super.r_ifStatement();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_letStatement_return r_letStatement() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_letStatement");
//			return super.r_letStatement();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_protectStatement_return r_protectStatement() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_protectStatement");
//			return super.r_protectStatement();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_sequence_return r_sequence() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_sequence");
//			return super.r_sequence();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_simpleStatement_return r_simpleStatement() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_simpleStatement");
//			return super.r_simpleStatement();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_statement_return r_statement() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_statement");
//			return super.r_statement();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_text_return r_text() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_text");
//			return super.r_text();
//		} finally {
//			ruleEnd();
//		}
//	}
//
//	@Override
//	public r_textSequence_return r_textSequence() throws RecognitionException {
//		// Auto-generated method
//		try {
//			ruleStart("r_textSequence");
//			return super.r_textSequence();
//		} finally {
//			ruleEnd();
//		}
//	}


}
