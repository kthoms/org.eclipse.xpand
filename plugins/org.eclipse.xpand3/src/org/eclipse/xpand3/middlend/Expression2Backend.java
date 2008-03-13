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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xpand3.Identifier;
import org.eclipse.xpand3.SyntaxElement;
import org.eclipse.xpand3.analyzation.AnalyzeContext;
import org.eclipse.xpand3.analyzation.GenericsUtil;
import org.eclipse.xpand3.analyzation.TypeSystem;
import org.eclipse.xpand3.expression.AbstractExpression;
import org.eclipse.xpand3.expression.BinaryOperation;
import org.eclipse.xpand3.expression.BooleanLiteral;
import org.eclipse.xpand3.expression.Cast;
import org.eclipse.xpand3.expression.ChainExpression;
import org.eclipse.xpand3.expression.ConstructorCallExpression;
import org.eclipse.xpand3.expression.FeatureCall;
import org.eclipse.xpand3.expression.IntegerLiteral;
import org.eclipse.xpand3.expression.ListLiteral;
import org.eclipse.xpand3.expression.NullLiteral;
import org.eclipse.xpand3.expression.RealLiteral;
import org.eclipse.xpand3.expression.StringLiteral;
import org.eclipse.xpand3.expression.util.ExpressionSwitch;
import org.eclipse.xpand3.staticTypesystem.DeclaredType;
import org.eclipse.xpand3.staticTypesystem.Type;
import org.eclipse.xpand3.util.SyntaxConstants;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.SourcePos;
import org.eclipse.xtend.backend.expr.CreateUncachedExpression;
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

	private BackendTypesystem backendTypes = null;
	private TypeSystem frontendTypes = null;
	private AnalyzeContext ctx = null;

	@Override
	public ExpressionBase caseBinaryOperation(BinaryOperation object) {
		return super.caseBinaryOperation(object);
	}

	@Override
	public ExpressionBase caseBooleanLiteral(BooleanLiteral lit) {
		return new LiteralExpression("true".equals(lit.getLiteralValue()
				.getValue()), getSourcePos(lit));
	}

	@Override
	public ExpressionBase caseIntegerLiteral(IntegerLiteral lit) {
		return new LiteralExpression(
				new Long(lit.getLiteralValue().getValue()), getSourcePos(lit));
	}

	@Override
	public ExpressionBase caseRealLiteral(RealLiteral lit) {
		return new LiteralExpression(new Double(lit.getLiteralValue()
				.getValue()), getSourcePos(lit));
	}

	@Override
	public ExpressionBase caseNullLiteral(NullLiteral lit) {
		return new LiteralExpression(null, getSourcePos(lit));
	}

	@Override
	public ExpressionBase caseCast(Cast object) {
		return doSwitch(object.getTarget());
	}

	@Override
	public ExpressionBase caseListLiteral(ListLiteral lit) {
		final List<ExpressionBase> inner = new ArrayList<ExpressionBase>();

		for (AbstractExpression e : lit.getElements())
			inner.add(doSwitch(e));

		return new ListLiteralExpression(inner, getSourcePos(lit));
	}

	@Override
	public ExpressionBase caseStringLiteral(StringLiteral lit) {
		return new LiteralExpression(lit.getLiteralValue().getValue(),
				getSourcePos(lit));
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
		return new CreateUncachedExpression(backendTypeForName(expr.getType()), getSourcePos(expr));
	}

	/**
	 * @param string
	 * @param expr
	 */
	protected void handleTransformationError(String string,
			SyntaxElement expr) {
		throw new RuntimeException(string);
	}

	public ExpressionBase convert(FeatureCall expr) {
		final SourcePos sourcePos = getSourcePos(expr);
		if (expr.getTarget() == null) {
			// 1. check for a static property
			if (expr.getName().getValue().lastIndexOf(SyntaxConstants.NS_DELIM) != -1) {
//				stat
//				final StaticProperty staticProp = typeConverter
//						.getEnumLiteral(expr.getName());
//				if (staticProp != null)
//					return new LiteralExpression(staticProp.get(), sourcePos);
				throw new UnsupportedOperationException("StaticProperties");
			}
			// 2. check for a local variable
			if (ctx.getVariable(expr.getName().getValue()) != null)
				return new LocalVarEvalExpression(expr.getName().getValue(),
						sourcePos);
			// 3. check for a type literal
			try {
				//TODO
				return new LiteralExpression(backendTypeForName(expr.getName()), sourcePos);
			} catch (IllegalArgumentException exc) {
			} // do nothing - this means
			// it is not a type literal

			// 4. check for "this"
			if (ctx.hasThis()) {
				final ExpressionBase thisExpr = new LocalVarEvalExpression(
						org.eclipse.xtend.backend.common.SyntaxConstants.THIS,
						sourcePos);
				return createPropertyExpression(thisExpr, (Type) ctx.getThis().getValue(), expr
						.getName().getValue(), sourcePos);
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
		//TODO proper analyzation
		return GenericsUtil.typeRef(frontendTypes.typeForName(TypeSystem.OBJECT));
	}

	private ExpressionBase createPropertyExpression(ExpressionBase target, Type type, String varName,
			SourcePos sourcePos) {
		if (isCollectionType(type)) {
			if (CollectionType.INSTANCE.getProperties().keySet().contains(varName))
				return new PropertyOnObjectExpression(target, varName, sourcePos);
			else
				return new PropertyOnCollectionExpression(target, varName, sourcePos);
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
		return name.equals(TypeSystem.COLLECTION) || name.equals(TypeSystem.SET) || name.equals(TypeSystem.LIST);
	}

	/**
	 * @param name
	 * @return
	 */
	private BackendType backendTypeForName(Identifier name) {
		DeclaredType dt = frontendTypes.typeForName(name.getValue());
		if (dt == null) {
			handleTransformationError("Couldn't resolve type for name '"
					+ name.getValue() + "'", name);
		}
		BackendType backendType = backendTypes.findTypeForID(dt.getUniqueID());
		if (backendType == null) {
			handleTransformationError("No backend type found for ID '"
					+ dt.getUniqueID() + "'", name);
		}
		return null;
	}

}
