/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractExpressionImpl.java,v 1.2 2008/03/07 11:10:36 jkohnlein Exp $
 */
package org.eclipse.xpand3.expression.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.xpand3.expression.AbstractExpression;
import org.eclipse.xpand3.expression.ExpressionPackage;

import org.eclipse.xpand3.impl.SyntaxElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class AbstractExpressionImpl extends SyntaxElementImpl implements AbstractExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.ABSTRACT_EXPRESSION;
	}

} //AbstractExpressionImpl
