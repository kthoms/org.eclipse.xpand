/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractStatementImpl.java,v 1.2 2008/03/07 11:10:35 jkohnlein Exp $
 */
package org.eclipse.xpand3.statement.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.xpand3.impl.SyntaxElementImpl;

import org.eclipse.xpand3.statement.AbstractStatement;
import org.eclipse.xpand3.statement.StatementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class AbstractStatementImpl extends SyntaxElementImpl implements AbstractStatement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementPackage.Literals.ABSTRACT_STATEMENT;
	}

} //AbstractStatementImpl
