/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclaredTypeParameterImpl.java,v 1.1 2008/03/04 10:53:02 sefftinge Exp $
 */
package org.eclipse.xpand3.staticTypesystem.declaration.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.xpand3.staticTypesystem.declaration.DeclarationPackage;
import org.eclipse.xpand3.staticTypesystem.declaration.DeclaredTypeParameter;

import org.eclipse.xpand3.staticTypesystem.impl.AbstractNamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declared Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DeclaredTypeParameterImpl extends AbstractNamedElementImpl implements DeclaredTypeParameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclaredTypeParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.DECLARED_TYPE_PARAMETER;
	}

} //DeclaredTypeParameterImpl
