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

	// Following code is generated (or at least should be)
	@Override
	public void r_abstractDeclaration() throws RecognitionException {
		try {
			ruleStart("r_abstractDeclaration");
			super.r_abstractDeclaration();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_additiveExpression() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_additiveExpression");
			super.r_additiveExpression();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_andExpression() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_andExpression");
			super.r_andExpression();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_around() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_around");
			super.r_around();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_booleanLiteral() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_booleanLiteral");
			super.r_booleanLiteral();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_casePart() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_casePart");
			super.r_casePart();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_castedExpression() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_castedExpression");
			super.r_castedExpression();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_chainExpression() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_chainExpression");
			super.r_chainExpression();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_check() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_check");
			super.r_check();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_collectionExpression() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_collectionExpression");
			super.r_collectionExpression();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_collectionType() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_collectionType");
			super.r_collectionType();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_constructorCall() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_constructorCall");
			super.r_constructorCall();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_declaredParameter() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_declaredParameter");
			super.r_declaredParameter();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_declaredParameterList() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_declaredParameterList");
			super.r_declaredParameterList();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_expression() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_expression");
			super.r_expression();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_extension() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_extension");
			super.r_extension();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_featureCall() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_featureCall");
			super.r_featureCall();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_file() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_file");
			super.r_file();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_globalVarExpression() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_globalVarExpression");
			super.r_globalVarExpression();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_identifier() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_identifier");
			super.r_identifier();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_ifExpression() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_ifExpression");
			super.r_ifExpression();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_impliesExpression() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_impliesExpression");
			super.r_impliesExpression();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_infixExpression() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_infixExpression");
			super.r_infixExpression();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_javaType() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_javaType");
			super.r_javaType();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_letExpression() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_letExpression");
			super.r_letExpression();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_listLiteral() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_listLiteral");
			super.r_listLiteral();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_multiplicativeExpression() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_multiplicativeExpression");
			super.r_multiplicativeExpression();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_nsImport() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_nsImport");
			super.r_nsImport();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_nullLiteral() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_nullLiteral");
			super.r_nullLiteral();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_numberLiteral() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_numberLiteral");
			super.r_numberLiteral();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_orExpression() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_orExpression");
			super.r_orExpression();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_parameterList() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_parameterList");
			super.r_parameterList();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_paranthesizedExpression() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_paranthesizedExpression");
			super.r_paranthesizedExpression();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_pointcut() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_pointcut");
			super.r_pointcut();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_primaryExpression() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_primaryExpression");
			super.r_primaryExpression();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_relationalExpression() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_relationalExpression");
			super.r_relationalExpression();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_simpleType() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_simpleType");
			super.r_simpleType();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_switchExpression() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_switchExpression");
			super.r_switchExpression();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_type() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_type");
			super.r_type();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_unaryExpression() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_unaryExpression");
			super.r_unaryExpression();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_definition() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_definition");
			super.r_definition();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_definitionAround() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_definitionAround");
			super.r_definitionAround();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_elseIfStatement() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_elseIfStatement");
			super.r_elseIfStatement();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_elseStatement() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_elseStatement");
			super.r_elseStatement();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_errorStatement() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_errorStatement");
			super.r_errorStatement();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_expandStatement() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_expandStatement");
			super.r_expandStatement();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_expressionStmt() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_expressionStmt");
			super.r_expressionStmt();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_fileStatement() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_fileStatement");
			super.r_fileStatement();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_foreachStatement() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_foreachStatement");
			super.r_foreachStatement();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_ifStatement() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_ifStatement");
			super.r_ifStatement();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_letStatement() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_letStatement");
			super.r_letStatement();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_protectStatement() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_protectStatement");
			super.r_protectStatement();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_sequence() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_sequence");
			super.r_sequence();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_simpleStatement() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_simpleStatement");
			super.r_simpleStatement();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_statement() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_statement");
			super.r_statement();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_text() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_text");
			super.r_text();
		} finally {
			ruleEnd();
		}
	}

	@Override
	public void r_textSequence() throws RecognitionException {
		// Auto-generated method
		try {
			ruleStart("r_textSequence");
			super.r_textSequence();
		} finally {
			ruleEnd();
		}
	}


}
