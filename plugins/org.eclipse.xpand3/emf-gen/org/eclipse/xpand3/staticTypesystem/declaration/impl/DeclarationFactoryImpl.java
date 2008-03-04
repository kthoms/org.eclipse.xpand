/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclarationFactoryImpl.java,v 1.1 2008/03/04 10:53:02 sefftinge Exp $
 */
package org.eclipse.xpand3.staticTypesystem.declaration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xpand3.staticTypesystem.declaration.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeclarationFactoryImpl extends EFactoryImpl implements DeclarationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeclarationFactory init() {
		try {
			DeclarationFactory theDeclarationFactory = (DeclarationFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/m2t/xpand3/staticTypesystem/declaration"); 
			if (theDeclarationFactory != null) {
				return theDeclarationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DeclarationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DeclarationPackage.DECLARED_TYPE: return createDeclaredType();
			case DeclarationPackage.DECLARED_OPERATION: return createDeclaredOperation();
			case DeclarationPackage.DECLARED_FUNCTION: return createDeclaredFunction();
			case DeclarationPackage.DECLARED_PROPERTY: return createDeclaredProperty();
			case DeclarationPackage.DECLARED_STATIC_PROPERTY: return createDeclaredStaticProperty();
			case DeclarationPackage.DECLARED_TYPE_PARAMETER: return createDeclaredTypeParameter();
			case DeclarationPackage.DECLARED_PARAMETER: return createDeclaredParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredType createDeclaredType() {
		DeclaredTypeImpl declaredType = new DeclaredTypeImpl();
		return declaredType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredOperation createDeclaredOperation() {
		DeclaredOperationImpl declaredOperation = new DeclaredOperationImpl();
		return declaredOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredFunction createDeclaredFunction() {
		DeclaredFunctionImpl declaredFunction = new DeclaredFunctionImpl();
		return declaredFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredProperty createDeclaredProperty() {
		DeclaredPropertyImpl declaredProperty = new DeclaredPropertyImpl();
		return declaredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredStaticProperty createDeclaredStaticProperty() {
		DeclaredStaticPropertyImpl declaredStaticProperty = new DeclaredStaticPropertyImpl();
		return declaredStaticProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredTypeParameter createDeclaredTypeParameter() {
		DeclaredTypeParameterImpl declaredTypeParameter = new DeclaredTypeParameterImpl();
		return declaredTypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredParameter createDeclaredParameter() {
		DeclaredParameterImpl declaredParameter = new DeclaredParameterImpl();
		return declaredParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationPackage getDeclarationPackage() {
		return (DeclarationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DeclarationPackage getPackage() {
		return DeclarationPackage.eINSTANCE;
	}

} //DeclarationFactoryImpl
