/**
 * <copyright>
 * </copyright>
 *
 * $Id: IdentifierImpl.java,v 1.1 2008/02/27 13:21:07 sefftinge Exp $
 */
package org.eclipse.xpand3.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.xpand3.Identifier;
import org.eclipse.xpand3.Xpand3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class IdentifierImpl extends SyntaxElementImpl implements Identifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xpand3Package.Literals.IDENTIFIER;
	}

} //IdentifierImpl
