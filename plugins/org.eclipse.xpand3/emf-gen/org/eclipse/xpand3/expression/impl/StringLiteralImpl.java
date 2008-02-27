/**
 * <copyright>
 * </copyright>
 *
 * $Id: StringLiteralImpl.java,v 1.1 2008/02/27 13:21:08 sefftinge Exp $
 */
package org.eclipse.xpand3.expression.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.xpand3.expression.ExpressionPackage;
import org.eclipse.xpand3.expression.StringLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StringLiteralImpl extends LiteralImpl implements StringLiteral {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.STRING_LITERAL;
	}

} //StringLiteralImpl
