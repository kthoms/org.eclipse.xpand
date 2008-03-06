/**
 * <copyright>
 * </copyright>
 *
 * $Id: NumberLiteralNodeImpl.java,v 1.1 2008/03/06 08:55:15 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.tmf.common.node.impl.CompositeNodeImpl;

import org.eclipse.xpand3.internal.parser.xpand3node.NumberLiteralNode;
import org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Literal Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NumberLiteralNodeImpl extends CompositeNodeImpl implements NumberLiteralNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberLiteralNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xpand3nodePackage.Literals.NUMBER_LITERAL_NODE;
	}

} //NumberLiteralNodeImpl
