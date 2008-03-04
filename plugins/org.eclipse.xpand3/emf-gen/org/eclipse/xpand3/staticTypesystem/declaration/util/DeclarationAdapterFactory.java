/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclarationAdapterFactory.java,v 1.1 2008/03/04 10:53:03 sefftinge Exp $
 */
package org.eclipse.xpand3.staticTypesystem.declaration.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xpand3.staticTypesystem.AbstractNamedElement;

import org.eclipse.xpand3.staticTypesystem.declaration.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclarationPackage
 * @generated
 */
public class DeclarationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DeclarationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DeclarationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclarationSwitch<Adapter> modelSwitch =
		new DeclarationSwitch<Adapter>() {
			@Override
			public Adapter caseDeclaredType(DeclaredType object) {
				return createDeclaredTypeAdapter();
			}
			@Override
			public Adapter caseDeclaredOperation(DeclaredOperation object) {
				return createDeclaredOperationAdapter();
			}
			@Override
			public Adapter caseDeclaredFunction(DeclaredFunction object) {
				return createDeclaredFunctionAdapter();
			}
			@Override
			public Adapter caseDeclaredProperty(DeclaredProperty object) {
				return createDeclaredPropertyAdapter();
			}
			@Override
			public Adapter caseDeclaredStaticProperty(DeclaredStaticProperty object) {
				return createDeclaredStaticPropertyAdapter();
			}
			@Override
			public Adapter caseDeclaredTypeParameter(DeclaredTypeParameter object) {
				return createDeclaredTypeParameterAdapter();
			}
			@Override
			public Adapter caseDeclaredParameter(DeclaredParameter object) {
				return createDeclaredParameterAdapter();
			}
			@Override
			public Adapter caseAbstractNamedElement(AbstractNamedElement object) {
				return createAbstractNamedElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredType <em>Declared Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclaredType
	 * @generated
	 */
	public Adapter createDeclaredTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredOperation <em>Declared Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclaredOperation
	 * @generated
	 */
	public Adapter createDeclaredOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredFunction <em>Declared Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclaredFunction
	 * @generated
	 */
	public Adapter createDeclaredFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredProperty <em>Declared Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclaredProperty
	 * @generated
	 */
	public Adapter createDeclaredPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredStaticProperty <em>Declared Static Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclaredStaticProperty
	 * @generated
	 */
	public Adapter createDeclaredStaticPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredTypeParameter <em>Declared Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclaredTypeParameter
	 * @generated
	 */
	public Adapter createDeclaredTypeParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.staticTypesystem.declaration.DeclaredParameter <em>Declared Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclaredParameter
	 * @generated
	 */
	public Adapter createDeclaredParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.staticTypesystem.AbstractNamedElement <em>Abstract Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.staticTypesystem.AbstractNamedElement
	 * @generated
	 */
	public Adapter createAbstractNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DeclarationAdapterFactory
