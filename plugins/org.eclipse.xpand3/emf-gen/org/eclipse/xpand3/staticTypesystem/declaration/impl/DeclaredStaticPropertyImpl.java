/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclaredStaticPropertyImpl.java,v 1.1 2008/03/04 10:53:02 sefftinge Exp $
 */
package org.eclipse.xpand3.staticTypesystem.declaration.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.xpand3.staticTypesystem.declaration.DeclarationPackage;
import org.eclipse.xpand3.staticTypesystem.declaration.DeclaredStaticProperty;

import org.eclipse.xpand3.staticTypesystem.impl.AbstractNamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declared Static Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DeclaredStaticPropertyImpl extends AbstractNamedElementImpl implements DeclaredStaticProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclaredStaticPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.DECLARED_STATIC_PROPERTY;
	}

} //DeclaredStaticPropertyImpl
