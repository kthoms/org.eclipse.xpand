/**
 * <copyright>
 * </copyright>
 *
 * $Id: DeclarationSwitch.java,v 1.2 2008/03/07 11:10:55 jkohnlein Exp $
 */
package org.eclipse.xpand3.declaration.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.xpand3.SyntaxElement;

import org.eclipse.xpand3.declaration.*;

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
 * @see org.eclipse.xpand3.declaration.DeclarationPackage
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
			case DeclarationPackage.ABSTRACT_DECLARATION: {
				AbstractDeclaration abstractDeclaration = (AbstractDeclaration)theEObject;
				T result = caseAbstractDeclaration(abstractDeclaration);
				if (result == null) result = caseSyntaxElement(abstractDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.ABSTRACT_NAMED_DECLARATION: {
				AbstractNamedDeclaration abstractNamedDeclaration = (AbstractNamedDeclaration)theEObject;
				T result = caseAbstractNamedDeclaration(abstractNamedDeclaration);
				if (result == null) result = caseAbstractDeclaration(abstractNamedDeclaration);
				if (result == null) result = caseSyntaxElement(abstractNamedDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.DEFINITION: {
				Definition definition = (Definition)theEObject;
				T result = caseDefinition(definition);
				if (result == null) result = caseAbstractNamedDeclaration(definition);
				if (result == null) result = caseAbstractDeclaration(definition);
				if (result == null) result = caseSyntaxElement(definition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.ADVICE: {
				Advice advice = (Advice)theEObject;
				T result = caseAdvice(advice);
				if (result == null) result = caseAbstractNamedDeclaration(advice);
				if (result == null) result = caseAbstractDeclaration(advice);
				if (result == null) result = caseSyntaxElement(advice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.EXTENSION: {
				Extension extension = (Extension)theEObject;
				T result = caseExtension(extension);
				if (result == null) result = caseAbstractNamedDeclaration(extension);
				if (result == null) result = caseAbstractDeclaration(extension);
				if (result == null) result = caseSyntaxElement(extension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.ABSTRACT_ASPECT: {
				AbstractAspect abstractAspect = (AbstractAspect)theEObject;
				T result = caseAbstractAspect(abstractAspect);
				if (result == null) result = caseSyntaxElement(abstractAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.EXTENSION_ASPECT: {
				ExtensionAspect extensionAspect = (ExtensionAspect)theEObject;
				T result = caseExtensionAspect(extensionAspect);
				if (result == null) result = caseAbstractAspect(extensionAspect);
				if (result == null) result = caseSyntaxElement(extensionAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.DEFINITION_ASPECT: {
				DefinitionAspect definitionAspect = (DefinitionAspect)theEObject;
				T result = caseDefinitionAspect(definitionAspect);
				if (result == null) result = caseAbstractAspect(definitionAspect);
				if (result == null) result = caseSyntaxElement(definitionAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.CHECK: {
				Check check = (Check)theEObject;
				T result = caseCheck(check);
				if (result == null) result = caseAbstractDeclaration(check);
				if (result == null) result = caseSyntaxElement(check);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.CREATE_EXTENSION_STATEMENT: {
				CreateExtensionStatement createExtensionStatement = (CreateExtensionStatement)theEObject;
				T result = caseCreateExtensionStatement(createExtensionStatement);
				if (result == null) result = caseExtension(createExtensionStatement);
				if (result == null) result = caseAbstractNamedDeclaration(createExtensionStatement);
				if (result == null) result = caseAbstractDeclaration(createExtensionStatement);
				if (result == null) result = caseSyntaxElement(createExtensionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.JAVA_EXTENSION_STATEMENT: {
				JavaExtensionStatement javaExtensionStatement = (JavaExtensionStatement)theEObject;
				T result = caseJavaExtensionStatement(javaExtensionStatement);
				if (result == null) result = caseAbstractNamedDeclaration(javaExtensionStatement);
				if (result == null) result = caseAbstractDeclaration(javaExtensionStatement);
				if (result == null) result = caseSyntaxElement(javaExtensionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDeclaration(AbstractDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Named Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Named Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNamedDeclaration(AbstractNamedDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinition(Definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvice(Advice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractAspect(AbstractAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionAspect(ExtensionAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionAspect(DefinitionAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheck(Check object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Extension Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Extension Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateExtensionStatement(CreateExtensionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Extension Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Extension Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaExtensionStatement(JavaExtensionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Syntax Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Syntax Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSyntaxElement(SyntaxElement object) {
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
