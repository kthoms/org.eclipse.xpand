/**
 * <copyright>
 * </copyright>
 *
 * $Id: StatementSwitch.java,v 1.2 2008/03/07 11:10:46 jkohnlein Exp $
 */
package org.eclipse.xpand3.statement.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.xpand3.SyntaxElement;

import org.eclipse.xpand3.statement.*;

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
 * @see org.eclipse.xpand3.statement.StatementPackage
 * @generated
 */
public class StatementSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatementPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementSwitch() {
		if (modelPackage == null) {
			modelPackage = StatementPackage.eINSTANCE;
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
			case StatementPackage.ABSTRACT_STATEMENT: {
				AbstractStatement abstractStatement = (AbstractStatement)theEObject;
				T result = caseAbstractStatement(abstractStatement);
				if (result == null) result = caseSyntaxElement(abstractStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.EXPAND_STATEMENT: {
				ExpandStatement expandStatement = (ExpandStatement)theEObject;
				T result = caseExpandStatement(expandStatement);
				if (result == null) result = caseAbstractStatement(expandStatement);
				if (result == null) result = caseSyntaxElement(expandStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.EXPRESSION_STATEMENT: {
				ExpressionStatement expressionStatement = (ExpressionStatement)theEObject;
				T result = caseExpressionStatement(expressionStatement);
				if (result == null) result = caseAbstractStatement(expressionStatement);
				if (result == null) result = caseSyntaxElement(expressionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.ERROR_STATEMENT: {
				ErrorStatement errorStatement = (ErrorStatement)theEObject;
				T result = caseErrorStatement(errorStatement);
				if (result == null) result = caseAbstractStatement(errorStatement);
				if (result == null) result = caseSyntaxElement(errorStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.ABSTRACT_STATEMENT_WITH_BODY: {
				AbstractStatementWithBody abstractStatementWithBody = (AbstractStatementWithBody)theEObject;
				T result = caseAbstractStatementWithBody(abstractStatementWithBody);
				if (result == null) result = caseAbstractStatement(abstractStatementWithBody);
				if (result == null) result = caseSyntaxElement(abstractStatementWithBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.FILE_STATEMENT: {
				FileStatement fileStatement = (FileStatement)theEObject;
				T result = caseFileStatement(fileStatement);
				if (result == null) result = caseAbstractStatementWithBody(fileStatement);
				if (result == null) result = caseAbstractStatement(fileStatement);
				if (result == null) result = caseSyntaxElement(fileStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.FOR_EACH_STATEMENT: {
				ForEachStatement forEachStatement = (ForEachStatement)theEObject;
				T result = caseForEachStatement(forEachStatement);
				if (result == null) result = caseAbstractStatementWithBody(forEachStatement);
				if (result == null) result = caseAbstractStatement(forEachStatement);
				if (result == null) result = caseSyntaxElement(forEachStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.IF_STATEMENT: {
				IfStatement ifStatement = (IfStatement)theEObject;
				T result = caseIfStatement(ifStatement);
				if (result == null) result = caseAbstractStatementWithBody(ifStatement);
				if (result == null) result = caseAbstractStatement(ifStatement);
				if (result == null) result = caseSyntaxElement(ifStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.LET_STATEMENT: {
				LetStatement letStatement = (LetStatement)theEObject;
				T result = caseLetStatement(letStatement);
				if (result == null) result = caseAbstractStatementWithBody(letStatement);
				if (result == null) result = caseAbstractStatement(letStatement);
				if (result == null) result = caseSyntaxElement(letStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.PROTECT_STATEMENT: {
				ProtectStatement protectStatement = (ProtectStatement)theEObject;
				T result = caseProtectStatement(protectStatement);
				if (result == null) result = caseAbstractStatementWithBody(protectStatement);
				if (result == null) result = caseAbstractStatement(protectStatement);
				if (result == null) result = caseSyntaxElement(protectStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementPackage.TEXT_STATEMENT: {
				TextStatement textStatement = (TextStatement)theEObject;
				T result = caseTextStatement(textStatement);
				if (result == null) result = caseAbstractStatement(textStatement);
				if (result == null) result = caseSyntaxElement(textStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractStatement(AbstractStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expand Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expand Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpandStatement(ExpandStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionStatement(ExpressionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorStatement(ErrorStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Statement With Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Statement With Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractStatementWithBody(AbstractStatementWithBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileStatement(FileStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Each Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Each Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForEachStatement(ForEachStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfStatement(IfStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Let Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Let Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLetStatement(LetStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protect Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protect Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtectStatement(ProtectStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextStatement(TextStatement object) {
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

} //StatementSwitch
