/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclarationSwitch.java,v 1.1 2008/03/04 10:53:03 sefftinge Exp $
 */
package org.eclipse.xpand3.staticTypesystem.declaration.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.xpand3.staticTypesystem.AbstractNamedElement;

import org.eclipse.xpand3.staticTypesystem.declaration.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.xpand3.staticTypesystem.declaration.DeclarationPackage
 * @generated
 */
public class DeclarationSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DeclarationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationSwitch() {
		if (modelPackage == null) {
			modelPackage = DeclarationPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DeclarationPackage.DECLARED_TYPE: {
				DeclaredType declaredType = (DeclaredType)theEObject;
				T result = caseDeclaredType(declaredType);
				if (result == null) result = caseAbstractNamedElement(declaredType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.DECLARED_OPERATION: {
				DeclaredOperation declaredOperation = (DeclaredOperation)theEObject;
				T result = caseDeclaredOperation(declaredOperation);
				if (result == null) result = caseAbstractNamedElement(declaredOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.DECLARED_FUNCTION: {
				DeclaredFunction declaredFunction = (DeclaredFunction)theEObject;
				T result = caseDeclaredFunction(declaredFunction);
				if (result == null) result = caseAbstractNamedElement(declaredFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.DECLARED_PROPERTY: {
				DeclaredProperty declaredProperty = (DeclaredProperty)theEObject;
				T result = caseDeclaredProperty(declaredProperty);
				if (result == null) result = caseAbstractNamedElement(declaredProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.DECLARED_STATIC_PROPERTY: {
				DeclaredStaticProperty declaredStaticProperty = (DeclaredStaticProperty)theEObject;
				T result = caseDeclaredStaticProperty(declaredStaticProperty);
				if (result == null) result = caseAbstractNamedElement(declaredStaticProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.DECLARED_TYPE_PARAMETER: {
				DeclaredTypeParameter declaredTypeParameter = (DeclaredTypeParameter)theEObject;
				T result = caseDeclaredTypeParameter(declaredTypeParameter);
				if (result == null) result = caseAbstractNamedElement(declaredTypeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.DECLARED_PARAMETER: {
				DeclaredParameter declaredParameter = (DeclaredParameter)theEObject;
				T result = caseDeclaredParameter(declaredParameter);
				if (result == null) result = caseAbstractNamedElement(declaredParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declared Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declared Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaredType(DeclaredType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declared Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declared Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaredOperation(DeclaredOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declared Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declared Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaredFunction(DeclaredFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declared Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declared Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaredProperty(DeclaredProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declared Static Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declared Static Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaredStaticProperty(DeclaredStaticProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declared Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declared Type Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaredTypeParameter(DeclaredTypeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declared Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declared Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaredParameter(DeclaredParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNamedElement(AbstractNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //DeclarationSwitch
