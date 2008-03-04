/**
 * <copyright> 
 *
 * Copyright (c) 2002-2007 Kolbware and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Kolbware, Bernd Kolb - Initial API and implementation
 *
 * </copyright>
 *
 */
package org.eclipse.xtend.middleend.internal.xpand3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.xand3.analyzation.AnalyzeContext;
import org.eclipse.xpand3.SyntaxElement;
import org.eclipse.xpand3.expression.AbstractExpression;
import org.eclipse.xpand3.expression.BooleanLiteral;
import org.eclipse.xpand3.expression.Case;
import org.eclipse.xpand3.expression.Cast;
import org.eclipse.xpand3.expression.ChainExpression;
import org.eclipse.xpand3.expression.CollectionExpression;
import org.eclipse.xpand3.expression.ConstructorCallExpression;
import org.eclipse.xpand3.expression.FeatureCall;
import org.eclipse.xpand3.expression.GlobalVarExpression;
import org.eclipse.xpand3.expression.IfExpression;
import org.eclipse.xpand3.expression.IntegerLiteral;
import org.eclipse.xpand3.expression.LetExpression;
import org.eclipse.xpand3.expression.ListLiteral;
import org.eclipse.xpand3.expression.Literal;
import org.eclipse.xpand3.expression.NullLiteral;
import org.eclipse.xpand3.expression.OperationCall;
import org.eclipse.xpand3.expression.RealLiteral;
import org.eclipse.xpand3.expression.StringLiteral;
import org.eclipse.xpand3.expression.SwitchExpression;
import org.eclipse.xpand3.expression.TypeSelectExpression;
import org.eclipse.xpand3.staticTypesystem.AbstractTypeReference;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.SourcePos;
import org.eclipse.xtend.backend.common.StaticProperty;
import org.eclipse.xtend.backend.expr.CreateUncachedExpression;
import org.eclipse.xtend.backend.expr.HidingLocalVarDefExpression;
import org.eclipse.xtend.backend.expr.InitClosureExpression;
import org.eclipse.xtend.backend.expr.InvocationOnCollectionExpression;
import org.eclipse.xtend.backend.expr.InvocationOnObjectExpression;
import org.eclipse.xtend.backend.expr.InvocationOnWhateverExpression;
import org.eclipse.xtend.backend.expr.ListLiteralExpression;
import org.eclipse.xtend.backend.expr.LiteralExpression;
import org.eclipse.xtend.backend.expr.LocalVarEvalExpression;
import org.eclipse.xtend.backend.expr.NewLocalVarDefExpression;
import org.eclipse.xtend.backend.expr.PropertyOnCollectionExpression;
import org.eclipse.xtend.backend.expr.PropertyOnObjectExpression;
import org.eclipse.xtend.backend.expr.PropertyOnWhateverExpression;
import org.eclipse.xtend.backend.expr.SequenceExpression;
import org.eclipse.xtend.backend.syslib.SysLibNames;
import org.eclipse.xtend.backend.types.builtin.CollectionType;
import org.eclipse.xtend.backend.types.builtin.ObjectType;
import org.eclipse.xtend.backend.util.CollectionHelper;
import org.eclipse.xtend.backend.util.Pair;

/**
 * @author Bernd Kolb
 * 
 */
public class XtendFrontendASTConverter {

	private String extensionName;
	private final BackendTypeConverter typeConverter;
	private AnalyzeContext ctx;

	public XtendFrontendASTConverter(AnalyzeContext ctx, BackendTypeConverter typeConverter, String extensionName) {
		this.ctx = ctx;
		this.typeConverter = typeConverter;
		this.extensionName = extensionName;
	}

	public ExpressionBase convert(SyntaxElement ele) {
		throw new UnsupportedOperationException("Call for abstract class 'SyntaxElement'");
	}

	public ExpressionBase convert(Literal ele) {
		throw new UnsupportedOperationException("Call for abstract class 'Literal'");
	}

	public ExpressionBase convert(BooleanLiteral lit) {
		return new LiteralExpression("true".equals(lit.getLiteralValue().getValue()), getSourcePos(lit));
	}

	public ExpressionBase convert(IntegerLiteral lit) {
		return new LiteralExpression(new Long(lit.getLiteralValue().getValue()), getSourcePos(lit));
	}

	public ExpressionBase convert(RealLiteral lit) {
		return new LiteralExpression(new Double(lit.getLiteralValue().getValue()), getSourcePos(lit));
	}

	public ExpressionBase convert(NullLiteral lit) {
		return new LiteralExpression(null, getSourcePos(lit));
	}

	public ExpressionBase convert(ListLiteral lit) {
		final List<ExpressionBase> inner = new ArrayList<ExpressionBase>();

		for (AbstractExpression e : lit.getElements())
			inner.add(convert(e));

		return new ListLiteralExpression(inner, getSourcePos(lit));
	}

	public ExpressionBase convert(StringLiteral lit) {
		return new LiteralExpression(lit.getLiteralValue().getValue(), getSourcePos(lit));
	}

	public ExpressionBase convert(ChainExpression expr) {
		return new SequenceExpression(getInner(expr), getSourcePos(expr));
	}

	public ExpressionBase convert(Cast expr) {
		return convert(expr.getTarget());
	}

	public ExpressionBase convert(ConstructorCallExpression expr) {
		return new CreateUncachedExpression(typeConverter.convertToBackendType(expr.getType()), getSourcePos(expr));
	}

	public ExpressionBase convert(FeatureCall expr) {
		final SourcePos sourcePos = getSourcePos(expr);

		if (expr.getTarget() == null) {
			// 1. check for a static property
			final StaticProperty staticProp = typeConverter.getEnumLiteral(expr.getName());
			if (staticProp != null)
				return new LiteralExpression(staticProp.get(), sourcePos);

			// 2. check for a local variable
			if (ctx.getLocalVars().containsKey(expr.getName().getValue()))
				return new LocalVarEvalExpression(expr.getName().getValue(), sourcePos);

			// 3. check for a type literal
			try {
				return new LiteralExpression(typeConverter.convertToBackendType(expr.getName()), sourcePos);
			} catch (IllegalArgumentException exc) {
			} // do nothing - this means
			// it is not a type literal

			// 4. check for "this"
			if (ctx.hasThis()) {
				final ExpressionBase thisExpr = new LocalVarEvalExpression(
						org.eclipse.xtend.backend.common.SyntaxConstants.THIS, sourcePos);
				return createPropertyExpression(thisExpr, ctx.getThis(), expr.getName().getValue(), sourcePos);
			}

			throw new IllegalArgumentException("feature call " + expr.toString() + " does not match any feature: "
					+ sourcePos);
		} else {
			// evaluate the target and evaluate the property on the result
			return createPropertyExpression(convert(expr.getTarget()), analyze(expr.getTarget()), expr.getName()
					.getValue(), sourcePos);
		}
	}

	public ExpressionBase convert(CollectionExpression expr) {
		final SourcePos sourcePos = getSourcePos(expr);

		final String functionName = expr.getName().getValue();

		final AnalyzeContext oldCtx = ctx;
		ctx = ctx.cloneWithVariable(expr.getEleName(), null /*
		 * TODO ObjectType
		 */);
		final ExpressionBase bodyExpr = convert(expr.getClosure());
		ctx = oldCtx;

		final InitClosureExpression closureExpr = new InitClosureExpression(
				Arrays.asList(expr.getEleName().getValue()), Arrays.asList(ObjectType.INSTANCE), bodyExpr, sourcePos);

		if (expr.getTarget() == null) {
			if (!ctx.hasThis())
				throw new IllegalStateException(functionName + " with neither a target nor an implicit 'this'");

			final ExpressionBase thisExpr = new LocalVarEvalExpression(
					org.eclipse.xtend.backend.common.SyntaxConstants.THIS, sourcePos);
			return new InvocationOnObjectExpression(functionName, Arrays.asList(thisExpr, closureExpr), true, sourcePos);
		} else
			return new InvocationOnObjectExpression(functionName,
					Arrays.asList(convert(expr.getTarget()), closureExpr), true, sourcePos);
	}

	public ExpressionBase convert(TypeSelectExpression expr) {
		final SourcePos sourcePos = getSourcePos(expr);

		final AbstractExpression t = ctx.getTypeForName(expr.getTypeLiteral());
		final ExpressionBase typeExpr = new LiteralExpression(typeConverter.convertToBackendType(t), sourcePos);

		if (expr.getTarget() == null) {
			if (!ctx.hasThis())
				throw new IllegalStateException("typeSelect with neither a target nor an implicit 'this'");

			final ExpressionBase thisExpr = new LocalVarEvalExpression(
					org.eclipse.xtend.backend.common.SyntaxConstants.THIS, sourcePos);
			return new InvocationOnObjectExpression(SysLibNames.TYPE_SELECT, Arrays.asList(thisExpr, typeExpr), true,
					sourcePos);
		} else
			return new InvocationOnObjectExpression(SysLibNames.TYPE_SELECT, Arrays.asList(convert(expr.getTarget()),
					typeExpr), false, sourcePos);
	}

	public ExpressionBase convert(OperationCall expr) {
		final SourcePos sourcePos = getSourcePos(expr);
		final String functionName = transformFunctionName(expr.getName().getValue());

		final List<ExpressionBase> params = new ArrayList<ExpressionBase>();
		for (AbstractExpression e : expr.getParams())
			params.add(convert(e));

		final List<AbstractTypeReference> paramTypes = new ArrayList<AbstractTypeReference>();
		for (AbstractExpression e : expr.getParams())
			paramTypes.add(analyze(e));

		if (expr.getTarget() == null) {
			if (ctx.hasThis()) {
				// if a function matches directly (i.e. without implicitly
				// passing 'this' as a first parameter), that
				// has precedence in matching
				if (hasMatchingOperationCall(functionName, paramTypes.toArray(new AbstractTypeReference[0])))
					return new InvocationOnObjectExpression(functionName, params, false, sourcePos);
				else {
					final ExpressionBase thisExpression = new LocalVarEvalExpression(
							org.eclipse.xtend.backend.common.SyntaxConstants.THIS, sourcePos);
					final AbstractTypeReference thisType = ctx.getVariable(AnalyzeContext.IMPLICIT_VARIABLE);
					return createInvocationOnTargetExpression(functionName, thisExpression, thisType, params,
							paramTypes, true, sourcePos);
				}
			} else
				return new InvocationOnObjectExpression(functionName, params, false, sourcePos);
		} else
			return createInvocationOnTargetExpression(functionName, convert(expr.getTarget()),
					analyze(expr.getTarget()), params, paramTypes, true, sourcePos);
	}

	public ExpressionBase convert(GlobalVarExpression expr) {
		// TODO: To be impl
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public ExpressionBase convert(IfExpression expr) {
		final ExpressionBase elseExpr = (expr.getElsePart() != null) ? convert(expr.getElsePart())
				: new LiteralExpression(null, getSourcePos(expr));

		return new org.eclipse.xtend.backend.expr.IfExpression(convert(expr.getCondition()),
				convert(expr.getThenPart()), elseExpr, getSourcePos(expr));
	}

	public ExpressionBase convert(LetExpression expr) {
		final ExpressionBase varExpr = convert(expr.getVarExpression());
		final AbstractTypeReference varType = analyze(expr.getVarExpression());

		final AnalyzeContext oldCtx = ctx;
		ctx = ctx.cloneWithVariable(expr.getVarName(), varType);

		try {
			if (oldCtx.getLocalVars().containsKey(expr.getVarName()))
				return new HidingLocalVarDefExpression(expr.getVarName().getValue(), varExpr, convert(expr
						.getTargetExpression()), getSourcePos(expr));
			else
				return new NewLocalVarDefExpression(expr.getVarName().getValue(), varExpr, convert(expr
						.getTargetExpression()), getSourcePos(expr));
		} finally {
			ctx = oldCtx;
		}
	}

	public ExpressionBase convert(SwitchExpression expr) {
		final List<Pair<ExpressionBase, ExpressionBase>> cases = new ArrayList<Pair<ExpressionBase, ExpressionBase>>();
		for (Case c : expr.getCases())
			cases.add(new Pair<ExpressionBase, ExpressionBase>(convert(c.getCondition()), convert(c.getThenPart())));

		return new org.eclipse.xtend.backend.expr.SwitchExpression(convert(expr.getSwitchExpr()), cases, convert(expr
				.getDefaultExpr()), getSourcePos(expr));
	}

	/**
	 * transform built-in operator names from the old to the new special names
	 */
	private String transformFunctionName(String functionName) {
		if ("+".equals(functionName))
			return SysLibNames.OPERATOR_PLUS;
		if ("-".equals(functionName))
			return SysLibNames.OPERATOR_MINUS;
		if ("*".equals(functionName))
			return SysLibNames.OPERATOR_MULT;
		if ("/".equals(functionName))
			return SysLibNames.OPERATOR_DIV;
		if ("%".equals(functionName))
			return SysLibNames.OPERATOR_MOD;

		if ("==".equals(functionName))
			return SysLibNames.OPERATOR_EQUALS;
		if ("!=".equals(functionName))
			return SysLibNames.OPERATOR_NOT_EQUALS;
		if ("<".equals(functionName))
			return SysLibNames.OPERATOR_LESS;
		if ("<=".equals(functionName))
			return SysLibNames.OPERATOR_LESS_OR_EQUALS;
		if (">=".equals(functionName))
			return SysLibNames.OPERATOR_GREATER_OR_EQUALS;
		if (">".equals(functionName))
			return SysLibNames.OPERATOR_GREATER;

		if ("!".equals(functionName))
			return SysLibNames.OPERATOR_NOT;

		if ("subString".equals(functionName))
			return SysLibNames.SUBSTRING;
		if ("replaceAll".equals(functionName))
			return SysLibNames.REPLACE_ALL_REGEX;

		return functionName;
	}

	private AbstractTypeReference analyze(AbstractExpression target) {
		// TODO: To be impl
		throw new UnsupportedOperationException("Not yet implemented");
	}

	private ExpressionBase createInvocationOnTargetExpression(String functionName, ExpressionBase targetExpression,
			AbstractTypeReference targetType, List<ExpressionBase> params, List<AbstractTypeReference> paramTypes,
			boolean isMethodStyle, SourcePos sourcePos) {
		final List<ExpressionBase> paramsWithoutFirst = params;
		final List<ExpressionBase> allParams = new ArrayList<ExpressionBase>();
		allParams.add(targetExpression);
		allParams.addAll(params);

		if (isCollectionType(targetType)) {
			paramTypes.add(0, targetType);
			final AbstractTypeReference[] paramTypeArray = paramTypes.toArray(new AbstractTypeReference[0]);

			if (hasMatchingOperationCall(functionName, paramTypeArray))
				// check if there is a function that directly matches the
				// collection
				return new InvocationOnObjectExpression(functionName, allParams, true, sourcePos);
			else
				// otherwise, do a 'collect' and call the function on all
				// elements of the collection
				return new InvocationOnCollectionExpression(targetExpression, functionName, paramsWithoutFirst,
						sourcePos);
		}

		if (isObjectType(targetType))
			// if the static type is "Object", we do not know if it is a
			// collection, so we do the logic at runtime
			return new InvocationOnWhateverExpression(functionName, allParams, isMethodStyle, sourcePos);

		// otherwise we know that it is not a collection and can avoid repeating
		// this logic at runtime
		return new InvocationOnObjectExpression(functionName, allParams, true, sourcePos);
	}

	private boolean hasMatchingOperationCall(String functionName, AbstractTypeReference[] paramTypes) {
		if (ctx.getExtensionForTypes(functionName, paramTypes) != null)
			return true;

		if (paramTypes.length == 0)
			return false;

		final AbstractTypeReference target = paramTypes[0];
		return ctx.getOperationFor(target, functionName, CollectionHelper.withoutFirst(paramTypes)) != null;
	}

	private ExpressionBase createPropertyExpression(ExpressionBase target, Object type, String varName,
			SourcePos sourcePos) {
		if (isCollectionType(type)) {
			if (CollectionType.INSTANCE.getProperties().keySet().contains(varName))
				return new PropertyOnObjectExpression(target, varName, sourcePos);
			else
				return new PropertyOnCollectionExpression(target, varName, sourcePos);
		}

		if (isObjectType(type))
			return new PropertyOnWhateverExpression(target, varName, sourcePos);

		return new PropertyOnObjectExpression(target, varName, sourcePos);
	}

	private boolean isObjectType(Object t) {
		// TODO : To be impl
		return true;
		// throw new UnsupportedOperationException("Not yet implemented");
	}

	private boolean isCollectionType(Object t) {
		// TODO : To be impl
		return false;
		// throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * extract the inner expressions as a "flat" list - they are stored as a
	 * binary tree in the ChainExpression...
	 */
	private List<ExpressionBase> getInner(ChainExpression expr) {
		final List<ExpressionBase> result = new ArrayList<ExpressionBase>();

		if (expr.getFirst() instanceof ChainExpression)
			result.addAll(getInner((ChainExpression) expr.getFirst()));
		else
			result.add(convert(expr.getFirst()));

		if (expr.getNext() instanceof ChainExpression)
			result.addAll(getInner((ChainExpression) expr.getNext()));
		else
			result.add(convert(expr.getNext()));

		return result;
	}

	private SourcePos getSourcePos(SyntaxElement lit) {
		return new SourcePos(lit.getFileName(), extensionName, lit.getLine());
	}

}
