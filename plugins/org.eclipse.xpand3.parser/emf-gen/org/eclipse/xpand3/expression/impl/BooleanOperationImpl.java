/**
 * <copyright>
 * </copyright>
 *
 * $Id: BooleanOperationImpl.java,v 1.1 2008/03/17 14:39:10 jkohnlein Exp $
 */
package org.eclipse.xpand3.expression.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.xpand3.expression.BooleanOperation;
import org.eclipse.xpand3.expression.ExpressionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BooleanOperationImpl extends BinaryOperationImpl implements BooleanOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.BOOLEAN_OPERATION;
	}

} //BooleanOperationImpl
