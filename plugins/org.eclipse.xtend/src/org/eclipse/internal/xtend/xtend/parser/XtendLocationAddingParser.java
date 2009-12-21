/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.internal.xtend.xtend.parser;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.eclipse.internal.xtend.expression.ast.DeclaredParameter;
import org.eclipse.internal.xtend.expression.ast.Expression;
import org.eclipse.internal.xtend.expression.ast.FeatureCall;
import org.eclipse.internal.xtend.expression.ast.GlobalVarExpression;
import org.eclipse.internal.xtend.expression.ast.Identifier;
import org.eclipse.internal.xtend.expression.ast.SyntaxElement;
import org.eclipse.internal.xtend.xtend.ast.AbstractExtension;
import org.eclipse.internal.xtend.xtend.ast.Around;
import org.eclipse.internal.xtend.xtend.ast.Check;
import org.eclipse.internal.xtend.xtend.ast.Extension;
import org.eclipse.internal.xtend.xtend.ast.ExtensionFile;
import org.eclipse.internal.xtend.xtend.ast.ExtensionImportStatement;
import org.eclipse.internal.xtend.xtend.ast.NamespaceImportStatement;

public class XtendLocationAddingParser extends XtendParser {

	public XtendLocationAddingParser(TokenStream stream) {
		this(stream, new ExtensionFactory());
	}

	public XtendLocationAddingParser(TokenStream stream, String fileName) {
		this(stream, new ExtensionFactory(fileName));
	}

	public XtendLocationAddingParser(TokenStream stream, ExtensionFactory factory) {
		super(stream, factory);
	}
	
	@Override
	public Extension extension() throws RecognitionException {
		return addLocation(start(), (AbstractExtension) super.extension(), end());
	}
	
	@Override
	public Identifier javaType() throws RecognitionException {
		return addLocation(start(), super.javaType(), end());
	}
	

	@Override
	public Expression additiveExpression() throws RecognitionException {
		return addLocation(start(), super.additiveExpression(), end());
	}
	
	@Override
	public Check check() throws RecognitionException {
		return addLocation(start(), super.check(), end());
	}

	@Override
	public Expression andExpression() throws RecognitionException {
		return addLocation(start(), super.andExpression(), end());
	}

	@Override
	public Around around() throws RecognitionException {
		return addLocation(start(), super.around(), end());
	}

	@Override
	public Expression booleanLiteral() throws RecognitionException {
		return addLocation(start(), super.booleanLiteral(), end());
	}

	@Override
	public Expression castedExpression() throws RecognitionException {
		return addLocation(start(), super.castedExpression(), end());
	}

	@Override
	public Expression chainExpression() throws RecognitionException {
		return addLocation(start(), super.chainExpression(), end());
	}

	@Override
	public FeatureCall collectionExpression() throws RecognitionException {
		return addLocation(start(), super.collectionExpression(), end());
	}

	@Override
	public org.eclipse.internal.xtend.expression.ast.Identifier collectionType()
			throws RecognitionException {
		return addLocation(start(), super.collectionType(), end());
	}

	@Override
	public Expression constructorCall() throws RecognitionException {
		return addLocation(start(), super.constructorCall(), end());
	}

	@Override
	public DeclaredParameter declaredParameter() throws RecognitionException {
		return addLocation(start(), super.declaredParameter(), end());
	}

	@Override
	public Expression expression() throws RecognitionException {
		return addLocation(start(), super.expression(), end());
	}

	@Override
	public ExtensionImportStatement extImport() throws RecognitionException {
		return addLocation(start(), super.extImport(), end());
	}

	@Override
	public FeatureCall featureCall() throws RecognitionException {
		return addLocation(start(), super.featureCall(), end());
	}

	@Override
	public GlobalVarExpression globalVarExpression()
			throws RecognitionException {
		return addLocation(start(), super.globalVarExpression(), end());
	}

	@Override
	public Expression ifExpression() throws RecognitionException {
		return addLocation(start(), super.ifExpression(), end());
	}

	@Override
	public Expression impliesExpression() throws RecognitionException {
		return addLocation(start(), super.impliesExpression(), end());
	}

	@Override
	public Expression infixExpression() throws RecognitionException {
		return addLocation(start(), super.infixExpression(), end());
	}

	@Override
	public Expression numberLiteral() throws RecognitionException {
		return addLocation(start(), super.numberLiteral(), end());
	}

	@Override
	public Expression letExpression() throws RecognitionException {
		return addLocation(start(), super.letExpression(), end());
	}

	@Override
	public Expression listLiteral() throws RecognitionException {
		return addLocation(start(), super.listLiteral(), end());
	}

	@Override
	public Expression multiplicativeExpression() throws RecognitionException {
		return addLocation(start(), super.multiplicativeExpression(), end());
	}

	@Override
	public NamespaceImportStatement nsImport() throws RecognitionException {
		return addLocation(start(), super.nsImport(), end());
	}

	@Override
	public Expression nullLiteral() throws RecognitionException {
		return addLocation(start(), super.nullLiteral(), end());
	}

	@Override
	public Expression orExpression() throws RecognitionException {
		return addLocation(start(), super.orExpression(), end());
	}

	@Override
	public Expression paranthesizedExpression() throws RecognitionException {
		return addLocation(start(), super.paranthesizedExpression(), end());
	}

	@Override
	public org.eclipse.internal.xtend.expression.ast.Identifier pointcut()
			throws RecognitionException {
		return addLocation(start(), super.pointcut(), end());
	}

	@Override
	public Expression primaryExpression() throws RecognitionException {
		return addLocation(start(), super.primaryExpression(), end());
	}

	@Override
	public Expression relationalExpression() throws RecognitionException {
		return addLocation(start(), super.relationalExpression(), end());
	}

	@Override
	public org.eclipse.internal.xtend.expression.ast.Identifier simpleType()
			throws RecognitionException {
		return addLocation(start(), super.simpleType(), end());
	}

	@Override
	public ExtensionFile file() throws RecognitionException {
		return addLocation(start(), super.file(), end());
	}

	@Override
	public Expression switchExpression() throws RecognitionException {
		return addLocation(start(), super.switchExpression(), end());
	}

	@Override
	public org.eclipse.internal.xtend.expression.ast.Identifier type()
			throws RecognitionException {
		return addLocation(start(), super.type(), end());
	}

	@Override
	public Expression unaryExpression() throws RecognitionException {
		return addLocation(start(), super.unaryExpression(), end());
	}

	private static <T extends SyntaxElement> T addLocation(int[] startAndLine,
			T ele, int end) {
		if (ele != null) {
			ele.setStart(startAndLine[0]);
			ele.setLine(startAndLine[1]);
			ele.setEnd(end);
		}
		return ele;
	}

	private int[] start() {
		CommonToken t = (CommonToken) input.LT(1);
		if (t == null) {
			return new int[] { 0, 0 };
		}
		return new int[] { t.getStartIndex(), t.getLine() };
	}

	private int end() {
		CommonToken t = (CommonToken) input.LT(-1);
		if (t == null) {
			return -1;
		}
		return t.getStopIndex() + 1;
	}

	@Override
	public void reportError(RecognitionException e) {
		System.out.println(super.getErrorMessage(e, tokenNames));
		throw new RuntimeException(e);
	}

}
