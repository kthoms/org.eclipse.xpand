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
import org.eclipse.xpand3.declaration.Check;
import org.eclipse.xpand3.declaration.CreateExtension;
import org.eclipse.xpand3.declaration.Definition;
import org.eclipse.xpand3.declaration.DefinitionAspect;
import org.eclipse.xpand3.declaration.Extension;
import org.eclipse.xpand3.declaration.ExtensionAspect;
import org.eclipse.xpand3.declaration.JavaExtension;
import org.eclipse.xpand3.declaration.util.DeclarationSwitch;
import org.eclipse.xpand3.statement.AbstractStatement;
import org.eclipse.xtend.backend.aop.AdviceParamType;
import org.eclipse.xtend.backend.aop.AroundAdvice;
import org.eclipse.xtend.backend.aop.ExecutionPointcut;
import org.eclipse.xtend.backend.aop.Pointcut;
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

	private Pointcut createPointcutFromAspect(AbstractAspect aspect) {
		String functionNamePattern = aspect.getPointcut().getValue();
		EList<DeclaredParameter> declaredParams = aspect.getParams();
		int numDeclaredParams = declaredParams.size();
		List<Pair<String, AdviceParamType>> params = new ArrayList<Pair<String, AdviceParamType>>(
				numDeclaredParams);
		for (DeclaredParameter declaredParam : declaredParams) {
			String paramName = declaredParam.getName().getValue();
			BackendType backendType = xpand3MiddleEnd
					.backendTypeForName(declaredParam.getType());
			AdviceParamType adviceParamType = new AdviceParamType(backendType,
					true);
			// TODO: including subtypes
			params.add(new Pair<String, AdviceParamType>(paramName,
					adviceParamType));
		}
		Pointcut pointcut = new ExecutionPointcut(functionNamePattern, params,
				false, null);
		return pointcut;
	}

	private Function createFunctionFromDeclaration(
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
		ExpressionBase guard = null;
		if (declaration.getGuard() != null) {
			guard = getExpression2Backend().doSwitch(declaration.getGuard());
		}
		return new SourceDefinedFunction(name, paramNames, paramBackendTypes,
				body, isCached, guard);
	}

	private SequenceExpression createSequenceExpressionFromStatements(
			SyntaxElement object, List<AbstractStatement> statements) {
		List<ExpressionBase> expressions = new ArrayList<ExpressionBase>(
				statements.size());
		for (AbstractStatement bodyStatement : statements) {
			expressions.add(getStatement2Backend().doSwitch(bodyStatement));
		}
		// TODO: what exactly is source position?
		SequenceExpression sequenceExpression = new SequenceExpression(
				expressions, getSourcePos(object));
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
		return createFunctionFromDeclaration(check, "", body, false);
	}

	@Override
	public Object caseCreateExtension(CreateExtension createExtension) {
		ExpressionBase body = getExpression2Backend().doSwitch(
				createExtension.getBody());
		// TODO: return type (currently not in frontend AST model)
		return createFunctionFromDeclaration(createExtension, createExtension
				.getName().getValue(), body, true);
	}

	@Override
	public Object caseDefinition(Definition definition) {
		SequenceExpression sequenceExpression = createSequenceExpressionFromStatements(
				definition, definition.getBody());
		return createFunctionFromDeclaration(definition, definition.getName()
				.getValue(), sequenceExpression, false);
	}

	@Override
	public AroundAdvice caseDefinitionAspect(DefinitionAspect definitionAspect) {
		Pointcut pointcut = createPointcutFromAspect(definitionAspect);
		// TODO isCached, varargs
		SequenceExpression body = createSequenceExpressionFromStatements(
				definitionAspect, definitionAspect.getBody());
		return new AroundAdvice(body, pointcut, false);
	}

	@Override
	public Function caseExtension(Extension extension) {
		ExpressionBase body = getExpression2Backend().doSwitch(
				extension.getBody());
		boolean isCached = extension.isCached();
		// TODO: return type (currently not in frontend AST model)
		return createFunctionFromDeclaration(extension, extension.getName()
				.getValue(), body, isCached);
	}

	@Override
	public AroundAdvice caseExtensionAspect(ExtensionAspect extensionAspect) {
		ExpressionBase body = getExpression2Backend().doSwitch(
				extensionAspect.getExpression());
		Pointcut pointcut = createPointcutFromAspect(extensionAspect);
		// TODO isCached, varargs
		return new AroundAdvice(body, pointcut, false);
	}

	@Override
	public Object caseJavaExtension(JavaExtension object) {
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
	public Object caseSyntaxElement(SyntaxElement object) {
		xpand3MiddleEnd.handleTransformationError(
				"Method should never be called", null);
		return null;
	}

}
