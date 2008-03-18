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

import org.eclipse.xpand3.SyntaxElement;
import org.eclipse.xpand3.analyzation.AnalyzeContext;
import org.eclipse.xpand3.analyzation.GenericsUtil;
import org.eclipse.xpand3.analyzation.TypeSystem;
import org.eclipse.xpand3.expression.AbstractExpression;
import org.eclipse.xpand3.expression.BinaryOperation;
import org.eclipse.xpand3.expression.BooleanLiteral;
import org.eclipse.xpand3.expression.BooleanOperation;
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
import org.eclipse.xpand3.expression.UnaryOperation;
import org.eclipse.xpand3.expression.util.ExpressionSwitch;
import org.eclipse.xpand3.staticTypesystem.Type;
import org.eclipse.xpand3.util.SyntaxConstants;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.SourcePos;
import org.eclipse.xtend.backend.expr.CreateUncachedExpression;
import org.eclipse.xtend.backend.expr.InvocationOnWhateverExpression;
import org.eclipse.xtend.backend.expr.ListLiteralExpression;
import org.eclipse.xtend.backend.expr.LiteralExpression;
import org.eclipse.xtend.backend.expr.LocalVarEvalExpression;
import org.eclipse.xtend.backend.expr.PropertyOnCollectionExpression;
import org.eclipse.xtend.backend.expr.PropertyOnObjectExpression;
import org.eclipse.xtend.backend.expr.PropertyOnWhateverExpression;
import org.eclipse.xtend.backend.expr.SequenceExpression;
import org.eclipse.xtend.backend.types.builtin.CollectionType;

/**
 * @author Sven Efftinge
 * @author Bernd Kolb
 */
public class Expression2Backend extends ExpressionSwitch<ExpressionBase> {

	private TypeSystem frontendTypes = null;
	private AnalyzeContext ctx = new AnalyzeContext.AnalyzeContextImpl() {
		// TODO: understand how to handle analyze contexts
		@Override
		public Var getVariable(String varName) {
			return new Var(null);
		}
	};
	private Xpand3MiddleEnd xpand3MiddleEnd;

	public Expression2Backend(Xpand3MiddleEnd xpand3MiddleEnd) {
		this.xpand3MiddleEnd = xpand3MiddleEnd;
	}

	private Statement2Backend getStatement2Backend() {
		return xpand3MiddleEnd.getStatement2Backend();
	}

	private Declaration2Backend getDeclaration2Backend() {
		return xpand3MiddleEnd.getDeclaration2Backend();
	}

	@Override
	public ExpressionBase caseBinaryOperation(BinaryOperation binaryOperation) {
		String operationName = BackendAstUtil.operationName(binaryOperation
				.getOperator());
		List<ExpressionBase> params = new ArrayList<ExpressionBase>(2);
		params.add(doSwitch(binaryOperation.getLeft()));
		params.add(doSwitch(binaryOperation.getRight()));
		InvocationOnWhateverExpression invocationExpression = new InvocationOnWhateverExpression(
				operationName, params, true, getSourcePos(binaryOperation));
		return invocationExpression;
	}

	@Override
	public ExpressionBase caseBooleanLiteral(BooleanLiteral lit) {
		return new LiteralExpression("true".equals(lit.getLiteralValue()
				.getValue()), getSourcePos(lit));
	}

	@Override
	public ExpressionBase caseCast(Cast object) {
		return doSwitch(object.getTarget());
	}

	@Override
	public ExpressionBase caseChainExpression(ChainExpression expr) {
		final List<ExpressionBase> result = new ArrayList<ExpressionBase>();
		ChainExpression x = expr;
		while (x != null) {
			result.add(doSwitch(x.getFirst()));
			if (x.getNext() instanceof ChainExpression) {
				x = (ChainExpression) x.getNext();
			} else {
				result.add(doSwitch(expr.getNext()));
				x = null;
			}
		}
		return new SequenceExpression(result, getSourcePos(expr));
	}

	public ExpressionBase caseConstructorCallExpression(
			ConstructorCallExpression expr) {
		return new CreateUncachedExpression(xpand3MiddleEnd
				.backendTypeForName(expr.getType()), getSourcePos(expr));
	}

	@Override
	public ExpressionBase caseFeatureCall(FeatureCall object) {
		return convert(object);
	}

	@Override
	public ExpressionBase caseIntegerLiteral(IntegerLiteral lit) {
		return new LiteralExpression(
				new Long(lit.getLiteralValue().getValue()), getSourcePos(lit));
	}

	@Override
	public ExpressionBase caseListLiteral(ListLiteral lit) {
		final List<ExpressionBase> inner = new ArrayList<ExpressionBase>();

		for (AbstractExpression e : lit.getElements())
			inner.add(doSwitch(e));

		return new ListLiteralExpression(inner, getSourcePos(lit));
	}

	@Override
	public ExpressionBase caseNullLiteral(NullLiteral lit) {
		return new LiteralExpression(null, getSourcePos(lit));
	}

	@Override
	public ExpressionBase caseOperationCall(OperationCall object) {
		ExpressionBase targetExpression = doSwitch(object.getTarget());
		List<ExpressionBase> beParams = new ArrayList<ExpressionBase>(object
				.getParams().size());
		// TODO: Find out the difference between InvocationOnWhatever and
		// InvocationOnObject
		beParams.add(targetExpression);
		for (AbstractExpression param : object.getParams()) {
			beParams.add(doSwitch(param));
		}
		if (targetExpression instanceof LocalVarEvalExpression) {
			// return new InvocationOnObjectExpression(
			// object.getName().getValue(), beParams, false,
			// getSourcePos(object));
			return new InvocationOnWhateverExpression(object.getName()
					.getValue(), beParams, true, getSourcePos(object));
		} else {
			return new InvocationOnWhateverExpression(object.getName()
					.getValue(), beParams, true, getSourcePos(object));
		}
	}

	@Override
	public ExpressionBase caseRealLiteral(RealLiteral lit) {
		return new LiteralExpression(new Double(lit.getLiteralValue()
				.getValue()), getSourcePos(lit));
	}

	@Override
	public ExpressionBase caseStringLiteral(StringLiteral lit) {
		return new LiteralExpression(lit.getLiteralValue().getValue(),
				getSourcePos(lit));
	}

	/*
	 * not yet implemented
	 */
	@Override
	public ExpressionBase caseBooleanOperation(BooleanOperation object) {
		throw new RuntimeException("Not implemented yet");
		// TODO
	}

	@Override
	public ExpressionBase caseCase(Case object) {
		throw new RuntimeException("Not implemented yet");
		// TODO
	}

	@Override
	public ExpressionBase caseCollectionExpression(CollectionExpression object) {
		throw new RuntimeException("Not implemented yet");
		// TODO
	}

	@Override
	public ExpressionBase caseGlobalVarExpression(GlobalVarExpression object) {
		throw new RuntimeException("Not implemented yet");
		// TODO
	}

	@Override
	public ExpressionBase caseIfExpression(IfExpression object) {
		throw new RuntimeException("Not implemented yet");
		// TODO
	}

	@Override
	public ExpressionBase caseLetExpression(LetExpression object) {
		throw new RuntimeException("Not implemented yet");
		// TODO
	}

	@Override
	public ExpressionBase caseLiteral(Literal object) {
		throw new RuntimeException("Not implemented yet");
		// TODO
	}

	@Override
	public ExpressionBase caseSwitchExpression(SwitchExpression object) {
		throw new RuntimeException("Not implemented yet");
		// TODO
	}

	@Override
	public ExpressionBase caseSyntaxElement(SyntaxElement object) {
		throw new RuntimeException("Not implemented yet");
		// TODO
	}

	@Override
	public ExpressionBase caseTypeSelectExpression(TypeSelectExpression object) {
		throw new RuntimeException("Not implemented yet");
		// TODO
	}

	@Override
	public ExpressionBase caseUnaryOperation(UnaryOperation object) {
		throw new RuntimeException("Not implemented yet");
		// TODO
	}

	/*
	 * abstract casess
	 */
	@Override
	public ExpressionBase caseAbstractExpression(AbstractExpression object) {
		xpand3MiddleEnd.handleTransformationError(
				"Method should never be called", null);
		return null;
	}

	/**
	 * @param string
	 * @param expr
	 */
	protected void handleTransformationError(String string, SyntaxElement expr) {
		throw new RuntimeException(string);
	}

	public ExpressionBase convert(FeatureCall expr) {
		final SourcePos sourcePos = getSourcePos(expr);
		if (expr.getTarget() == null) {
			// 1. check for a static property
			if (expr.getName().getValue().lastIndexOf(SyntaxConstants.NS_DELIM) != -1) {
				// stat
				// final StaticProperty staticProp = typeConverter
				// .getEnumLiteral(expr.getName());
				// if (staticProp != null)
				// return new LiteralExpression(staticProp.get(), sourcePos);
				throw new UnsupportedOperationException("StaticProperties");
			}
			// 2. check for a local variable
			if (ctx.getVariable(expr.getName().getValue()) != null)
				return new LocalVarEvalExpression(expr.getName().getValue(),
						sourcePos);
			// 3. check for a type literal
			try {
				// TODO
				return new LiteralExpression(xpand3MiddleEnd
						.backendTypeForName(expr.getName()), sourcePos);
			} catch (IllegalArgumentException exc) {
			} // do nothing - this means
			// it is not a type literal

			// 4. check for "this"
			if (ctx.hasThis()) {
				final ExpressionBase thisExpr = new LocalVarEvalExpression(
						org.eclipse.xtend.backend.common.SyntaxConstants.THIS,
						sourcePos);
				return createPropertyExpression(thisExpr, (Type) ctx.getThis()
						.getValue(), expr.getName().getValue(), sourcePos);
			}

			throw new IllegalArgumentException("feature call "
					+ expr.toString() + " does not match any feature: "
					+ sourcePos);
		} else {
			// evaluate the target and evaluate the property on the result
			return createPropertyExpression(doSwitch(expr.getTarget()),
					analyze(expr.getTarget()), expr.getName().getValue(),
					sourcePos);
		}
	}

	/**
	 * @param target
	 * @return
	 */
	private Type analyze(AbstractExpression target) {
		// TODO proper analyzation
		return GenericsUtil.typeRef(frontendTypes
				.typeForName(TypeSystem.OBJECT));
	}

	private ExpressionBase createPropertyExpression(ExpressionBase target,
			Type type, String varName, SourcePos sourcePos) {
		if (isCollectionType(type)) {
			if (CollectionType.INSTANCE.getProperties().keySet().contains(
					varName))
				return new PropertyOnObjectExpression(target, varName,
						sourcePos);
			else
				return new PropertyOnCollectionExpression(target, varName,
						sourcePos);
		}

		if (type.getDeclaredType().getName().equals(TypeSystem.OBJECT))
			return new PropertyOnWhateverExpression(target, varName, sourcePos);

		return new PropertyOnObjectExpression(target, varName, sourcePos);
	}

	/**
	 * @param type
	 * @return
	 */
	private boolean isCollectionType(Type type) {
		String name = type.getDeclaredType().getName();
		return name.equals(TypeSystem.COLLECTION)
				|| name.equals(TypeSystem.SET) || name.equals(TypeSystem.LIST);
	}
}
