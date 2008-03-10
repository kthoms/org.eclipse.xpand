/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExpressionSwitch.java,v 1.3 2008/03/10 08:25:35 jkohnlein Exp $
 */
package org.eclipse.xpand3.expression.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.xpand3.SyntaxElement;

import org.eclipse.xpand3.expression.*;

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
 * @see org.eclipse.xpand3.expression.ExpressionPackage
 * @generated
 */
public class ExpressionSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExpressionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionSwitch() {
		if (modelPackage == null) {
			modelPackage = ExpressionPackage.eINSTANCE;
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
			case ExpressionPackage.ABSTRACT_EXPRESSION: {
				AbstractExpression abstractExpression = (AbstractExpression)theEObject;
				T result = caseAbstractExpression(abstractExpression);
				if (result == null) result = caseSyntaxElement(abstractExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.BOOLEAN_OPERATION: {
				BooleanOperation booleanOperation = (BooleanOperation)theEObject;
				T result = caseBooleanOperation(booleanOperation);
				if (result == null) result = caseBinaryOperation(booleanOperation);
				if (result == null) result = caseAbstractExpression(booleanOperation);
				if (result == null) result = caseSyntaxElement(booleanOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.CAST: {
				Cast cast = (Cast)theEObject;
				T result = caseCast(cast);
				if (result == null) result = caseAbstractExpression(cast);
				if (result == null) result = caseSyntaxElement(cast);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.CHAIN_EXPRESSION: {
				ChainExpression chainExpression = (ChainExpression)theEObject;
				T result = caseChainExpression(chainExpression);
				if (result == null) result = caseAbstractExpression(chainExpression);
				if (result == null) result = caseSyntaxElement(chainExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.CONSTRUCTOR_CALL_EXPRESSION: {
				ConstructorCallExpression constructorCallExpression = (ConstructorCallExpression)theEObject;
				T result = caseConstructorCallExpression(constructorCallExpression);
				if (result == null) result = caseAbstractExpression(constructorCallExpression);
				if (result == null) result = caseSyntaxElement(constructorCallExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.FEATURE_CALL: {
				FeatureCall featureCall = (FeatureCall)theEObject;
				T result = caseFeatureCall(featureCall);
				if (result == null) result = caseAbstractExpression(featureCall);
				if (result == null) result = caseSyntaxElement(featureCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.COLLECTION_EXPRESSION: {
				CollectionExpression collectionExpression = (CollectionExpression)theEObject;
				T result = caseCollectionExpression(collectionExpression);
				if (result == null) result = caseFeatureCall(collectionExpression);
				if (result == null) result = caseAbstractExpression(collectionExpression);
				if (result == null) result = caseSyntaxElement(collectionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.OPERATION_CALL: {
				OperationCall operationCall = (OperationCall)theEObject;
				T result = caseOperationCall(operationCall);
				if (result == null) result = caseFeatureCall(operationCall);
				if (result == null) result = caseAbstractExpression(operationCall);
				if (result == null) result = caseSyntaxElement(operationCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.TYPE_SELECT_EXPRESSION: {
				TypeSelectExpression typeSelectExpression = (TypeSelectExpression)theEObject;
				T result = caseTypeSelectExpression(typeSelectExpression);
				if (result == null) result = caseFeatureCall(typeSelectExpression);
				if (result == null) result = caseAbstractExpression(typeSelectExpression);
				if (result == null) result = caseSyntaxElement(typeSelectExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.GLOBAL_VAR_EXPRESSION: {
				GlobalVarExpression globalVarExpression = (GlobalVarExpression)theEObject;
				T result = caseGlobalVarExpression(globalVarExpression);
				if (result == null) result = caseAbstractExpression(globalVarExpression);
				if (result == null) result = caseSyntaxElement(globalVarExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.IF_EXPRESSION: {
				IfExpression ifExpression = (IfExpression)theEObject;
				T result = caseIfExpression(ifExpression);
				if (result == null) result = caseAbstractExpression(ifExpression);
				if (result == null) result = caseSyntaxElement(ifExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.LET_EXPRESSION: {
				LetExpression letExpression = (LetExpression)theEObject;
				T result = caseLetExpression(letExpression);
				if (result == null) result = caseAbstractExpression(letExpression);
				if (result == null) result = caseSyntaxElement(letExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.LIST_LITERAL: {
				ListLiteral listLiteral = (ListLiteral)theEObject;
				T result = caseListLiteral(listLiteral);
				if (result == null) result = caseAbstractExpression(listLiteral);
				if (result == null) result = caseSyntaxElement(listLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = caseAbstractExpression(literal);
				if (result == null) result = caseSyntaxElement(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.BOOLEAN_LITERAL: {
				BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
				T result = caseBooleanLiteral(booleanLiteral);
				if (result == null) result = caseLiteral(booleanLiteral);
				if (result == null) result = caseAbstractExpression(booleanLiteral);
				if (result == null) result = caseSyntaxElement(booleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.INTEGER_LITERAL: {
				IntegerLiteral integerLiteral = (IntegerLiteral)theEObject;
				T result = caseIntegerLiteral(integerLiteral);
				if (result == null) result = caseLiteral(integerLiteral);
				if (result == null) result = caseAbstractExpression(integerLiteral);
				if (result == null) result = caseSyntaxElement(integerLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.NULL_LITERAL: {
				NullLiteral nullLiteral = (NullLiteral)theEObject;
				T result = caseNullLiteral(nullLiteral);
				if (result == null) result = caseLiteral(nullLiteral);
				if (result == null) result = caseAbstractExpression(nullLiteral);
				if (result == null) result = caseSyntaxElement(nullLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.REAL_LITERAL: {
				RealLiteral realLiteral = (RealLiteral)theEObject;
				T result = caseRealLiteral(realLiteral);
				if (result == null) result = caseLiteral(realLiteral);
				if (result == null) result = caseAbstractExpression(realLiteral);
				if (result == null) result = caseSyntaxElement(realLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.STRING_LITERAL: {
				StringLiteral stringLiteral = (StringLiteral)theEObject;
				T result = caseStringLiteral(stringLiteral);
				if (result == null) result = caseLiteral(stringLiteral);
				if (result == null) result = caseAbstractExpression(stringLiteral);
				if (result == null) result = caseSyntaxElement(stringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.SWITCH_EXPRESSION: {
				SwitchExpression switchExpression = (SwitchExpression)theEObject;
				T result = caseSwitchExpression(switchExpression);
				if (result == null) result = caseAbstractExpression(switchExpression);
				if (result == null) result = caseSyntaxElement(switchExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.CASE: {
				Case case_ = (Case)theEObject;
				T result = caseCase(case_);
				if (result == null) result = caseSyntaxElement(case_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.BINARY_OPERATION: {
				BinaryOperation binaryOperation = (BinaryOperation)theEObject;
				T result = caseBinaryOperation(binaryOperation);
				if (result == null) result = caseAbstractExpression(binaryOperation);
				if (result == null) result = caseSyntaxElement(binaryOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractExpression(AbstractExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanOperation(BooleanOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cast</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cast</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCast(Cast object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chain Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chain Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChainExpression(ChainExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Call Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorCallExpression(ConstructorCallExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureCall(FeatureCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionExpression(CollectionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationCall(OperationCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Select Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Select Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSelectExpression(TypeSelectExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Var Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Var Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalVarExpression(GlobalVarExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfExpression(IfExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Let Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Let Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLetExpression(LetExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListLiteral(ListLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteral(BooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerLiteral(IntegerLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullLiteral(NullLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealLiteral(RealLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringLiteral(StringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchExpression(SwitchExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCase(Case object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryOperation(BinaryOperation object) {
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

} //ExpressionSwitch
