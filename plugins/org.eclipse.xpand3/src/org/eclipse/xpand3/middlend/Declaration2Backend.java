/**
 * <copyright> 
 *
 * Copyright (c) 2002-2007 itemis AG and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   itemis AG - Initial API and implementation
 *
 * </copyright>
 *
 */
package org.eclipse.xpand3.middlend;

import static org.eclipse.xpand3.middlend.BackendAstUtil.getSourcePos;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xpand3.DeclaredParameter;
import org.eclipse.xpand3.SyntaxElement;
import org.eclipse.xpand3.declaration.AbstractAspect;
import org.eclipse.xpand3.declaration.AbstractDeclaration;
import org.eclipse.xpand3.declaration.AbstractNamedDeclaration;
import org.eclipse.xpand3.declaration.Advice;
import org.eclipse.xpand3.declaration.Check;
import org.eclipse.xpand3.declaration.CreateExtensionStatement;
import org.eclipse.xpand3.declaration.Definition;
import org.eclipse.xpand3.declaration.DefinitionAspect;
import org.eclipse.xpand3.declaration.Extension;
import org.eclipse.xpand3.declaration.ExtensionAspect;
import org.eclipse.xpand3.declaration.JavaExtensionStatement;
import org.eclipse.xpand3.declaration.util.DeclarationSwitch;
import org.eclipse.xpand3.statement.AbstractStatement;
import org.eclipse.xtend.backend.aop.AroundAdvice;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.expr.SequenceExpression;
import org.eclipse.xtend.backend.functions.SourceDefinedFunction;
import org.eclipse.xtend.backend.util.Pair;

/**
 * @author Jan Köhnlein
 * 
 */
public class Declaration2Backend extends DeclarationSwitch<Object> {

	private Xpand3MiddleEnd xpand3MiddleEnd;

	public Declaration2Backend(Xpand3MiddleEnd xpand3MiddleEnd) {
		this.xpand3MiddleEnd = xpand3MiddleEnd;
	}

	private Expression2Backend getExpression2Backend() {
		return xpand3MiddleEnd.getExpression2Backend();
	}

	private Statement2Backend getStatement2Backend() {
		return xpand3MiddleEnd.getStatement2Backend();
	}

	private Function createSourceDefinedFunctionFromAbstractDeclaration(
			AbstractDeclaration declaration, String name, ExpressionBase body,
			boolean isCached, Pair<String, BackendType>... additionalParameters) {
		EList<DeclaredParameter> declaredParams = declaration.getParams();
		int numDeclaredParams = declaredParams.size();
		List<String> paramNames = new ArrayList<String>(numDeclaredParams
				+ additionalParameters.length);
		List<BackendType> paramBackendTypes = new ArrayList<BackendType>(
				numDeclaredParams + additionalParameters.length);
		for (Pair<String, BackendType> additionalParameter : additionalParameters) {
			paramNames.add(additionalParameter.getFirst());
			paramBackendTypes.add(additionalParameter.getSecond());
		}
		for (int i = 0; i < numDeclaredParams; ++i) {
			DeclaredParameter declaredParam = declaredParams.get(i);
			paramNames.add(declaredParam.getName().getValue());
			paramBackendTypes.add(xpand3MiddleEnd
					.backendTypeForName(declaredParam.getType()));
		}
		ExpressionBase guard = getExpression2Backend().doSwitch(
				declaration.getGuard());
		return new SourceDefinedFunction(name, paramNames, paramBackendTypes,
				body, isCached, guard);
	}

	private SequenceExpression createSequenceExpressionFromStatementBody(
			Definition object) {
		List<ExpressionBase> bodyExpressions = new ArrayList<ExpressionBase>(
				object.getBody().size());
		for (AbstractStatement bodyStatement : object.getBody()) {
			bodyExpressions.add(getStatement2Backend().doSwitch(bodyStatement));
		}
		// TODO: what exactly is source position?
		SequenceExpression sequenceExpression = new SequenceExpression(
				bodyExpressions, getSourcePos(object));
		return sequenceExpression;
	}

	/*
	 * Overriden switch methods
	 */

	@Override
	public Object caseCheck(Check check) {
		ExpressionBase body = getExpression2Backend().doSwitch(
				check.getConstraint());
		// TODO: how to handle errorSeverity, message and feature
		return createSourceDefinedFunctionFromAbstractDeclaration(check, "",
				body, false);
	}

	@Override
	public Object caseCreateExtensionStatement(
			CreateExtensionStatement createExtension) {
		ExpressionBase body = getExpression2Backend().doSwitch(
				createExtension.getBody());
		// TODO: return type (currently not in frontend AST model)
		return createSourceDefinedFunctionFromAbstractDeclaration(
				createExtension, createExtension.getName().getValue(), body,
				true);
	}

	@Override
	public Object caseDefinition(Definition definition) {
		SequenceExpression sequenceExpression = createSequenceExpressionFromStatementBody(definition);
		return createSourceDefinedFunctionFromAbstractDeclaration(definition,
				definition.getName().getValue(), sequenceExpression, false);
	}

	@Override
	public AroundAdvice caseDefinitionAspect(DefinitionAspect object) {
		throw new RuntimeException("Not implemented yet");
		// TODO
	}

	@Override
	public Function caseExtension(Extension extension) {
		ExpressionBase body = getExpression2Backend().doSwitch(
				extension.getBody());
		boolean isCached = extension.isCached();
		// TODO: return type (currently not in frontend AST model)
		return createSourceDefinedFunctionFromAbstractDeclaration(extension,
				extension.getName().getValue(), body, isCached);
	}

	@Override
	public AroundAdvice caseExtensionAspect(ExtensionAspect object) {
		throw new RuntimeException("Not implemented yet");
		// TODO
		// ExpressionBase body =
		// getExpression2Backend().doSwitch(object.getExpression());
		// return new AroundAdvice(body);
	}

	@Override
	public Object caseJavaExtensionStatement(JavaExtensionStatement object) {
		throw new RuntimeException("Not implemented yet");
		// TODO
	}

	/*
	 * The following methods are either belong to abstract superclasses or
	 * deprecated classes
	 */

	@Override
	public Object caseAbstractAspect(AbstractAspect object) {
		xpand3MiddleEnd.handleTransformationError(
				"Method should never be called", null);
		return null;
	}

	@Override
	public Object caseAbstractDeclaration(AbstractDeclaration object) {
		xpand3MiddleEnd.handleTransformationError(
				"Method should never be called", null);
		return null;
	}

	@Override
	public Object caseAbstractNamedDeclaration(AbstractNamedDeclaration object) {
		xpand3MiddleEnd.handleTransformationError(
				"Method should never be called", null);
		return null;
	}

	@Override
	public Object caseAdvice(Advice object) {
		xpand3MiddleEnd.handleTransformationError(
				"Method should never be called", null);
		return null;
	}

	@Override
	public Object caseSyntaxElement(SyntaxElement object) {
		xpand3MiddleEnd.handleTransformationError(
				"Method should never be called", null);
		return null;
	}

}
