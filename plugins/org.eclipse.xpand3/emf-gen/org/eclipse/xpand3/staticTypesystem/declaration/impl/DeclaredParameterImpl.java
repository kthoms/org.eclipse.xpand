/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclaredParameterImpl.java,v 1.1 2008/03/04 10:53:02 sefftinge Exp $
 */
package org.eclipse.xpand3.staticTypesystem.declaration.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.xpand3.staticTypesystem.declaration.DeclarationPackage;
import org.eclipse.xpand3.staticTypesystem.declaration.DeclaredParameter;

import org.eclipse.xpand3.staticTypesystem.impl.AbstractNamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declared Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DeclaredParameterImpl extends AbstractNamedElementImpl implements DeclaredParameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclaredParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.DECLARED_PARAMETER;
	}

} //DeclaredParameterImpl
