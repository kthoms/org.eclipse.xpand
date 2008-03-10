/**
 * <copyright>
 * </copyright>
 *
 * $Id: BooleanOperationImpl.java,v 1.3 2008/03/10 08:25:34 jkohnlein Exp $
 */
package org.eclipse.xpand3.expression.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xpand3.Identifier;

import org.eclipse.xpand3.expression.AbstractExpression;
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
