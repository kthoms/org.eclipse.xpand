/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExpressionAdapterFactory.java,v 1.1 2008/02/27 13:21:10 sefftinge Exp $
 */
package org.eclipse.xpand3.expression.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xpand3.SyntaxElement;

import org.eclipse.xpand3.expression.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xpand3.expression.ExpressionPackage
 * @generated
 */
public class ExpressionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExpressionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExpressionPackage.eINSTANCE;
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
	protected ExpressionSwitch<Adapter> modelSwitch =
		new ExpressionSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractExpression(AbstractExpression object) {
				return createAbstractExpressionAdapter();
			}
			@Override
			public Adapter caseBooleanOperation(BooleanOperation object) {
				return createBooleanOperationAdapter();
			}
			@Override
			public Adapter caseCast(Cast object) {
				return createCastAdapter();
			}
			@Override
			public Adapter caseChainExpression(ChainExpression object) {
				return createChainExpressionAdapter();
			}
			@Override
			public Adapter caseConstructorCallExpression(ConstructorCallExpression object) {
				return createConstructorCallExpressionAdapter();
			}
			@Override
			public Adapter caseFeatureCall(FeatureCall object) {
				return createFeatureCallAdapter();
			}
			@Override
			public Adapter caseCollectionExpression(CollectionExpression object) {
				return createCollectionExpressionAdapter();
			}
			@Override
			public Adapter caseOperationCall(OperationCall object) {
				return createOperationCallAdapter();
			}
			@Override
			public Adapter caseTypeSelectExpression(TypeSelectExpression object) {
				return createTypeSelectExpressionAdapter();
			}
			@Override
			public Adapter caseGlobalVarExpression(GlobalVarExpression object) {
				return createGlobalVarExpressionAdapter();
			}
			@Override
			public Adapter caseIfExpression(IfExpression object) {
				return createIfExpressionAdapter();
			}
			@Override
			public Adapter caseLetExpression(LetExpression object) {
				return createLetExpressionAdapter();
			}
			@Override
			public Adapter caseListLiteral(ListLiteral object) {
				return createListLiteralAdapter();
			}
			@Override
			public Adapter caseLiteral(Literal object) {
				return createLiteralAdapter();
			}
			@Override
			public Adapter caseBooleanLiteral(BooleanLiteral object) {
				return createBooleanLiteralAdapter();
			}
			@Override
			public Adapter caseIntegerLiteral(IntegerLiteral object) {
				return createIntegerLiteralAdapter();
			}
			@Override
			public Adapter caseNullLiteral(NullLiteral object) {
				return createNullLiteralAdapter();
			}
			@Override
			public Adapter caseRealLiteral(RealLiteral object) {
				return createRealLiteralAdapter();
			}
			@Override
			public Adapter caseStringLiteral(StringLiteral object) {
				return createStringLiteralAdapter();
			}
			@Override
			public Adapter caseSwitchExpression(SwitchExpression object) {
				return createSwitchExpressionAdapter();
			}
			@Override
			public Adapter caseCase(Case object) {
				return createCaseAdapter();
			}
			@Override
			public Adapter caseSyntaxElement(SyntaxElement object) {
				return createSyntaxElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.expression.AbstractExpression <em>Abstract Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.expression.AbstractExpression
	 * @generated
	 */
	public Adapter createAbstractExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.expression.BooleanOperation <em>Boolean Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.expression.BooleanOperation
	 * @generated
	 */
	public Adapter createBooleanOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.expression.Cast <em>Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.expression.Cast
	 * @generated
	 */
	public Adapter createCastAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.expression.ChainExpression <em>Chain Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.expression.ChainExpression
	 * @generated
	 */
	public Adapter createChainExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.expression.ConstructorCallExpression <em>Constructor Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.expression.ConstructorCallExpression
	 * @generated
	 */
	public Adapter createConstructorCallExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.expression.FeatureCall <em>Feature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.expression.FeatureCall
	 * @generated
	 */
	public Adapter createFeatureCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.expression.CollectionExpression <em>Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.expression.CollectionExpression
	 * @generated
	 */
	public Adapter createCollectionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.expression.OperationCall <em>Operation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.expression.OperationCall
	 * @generated
	 */
	public Adapter createOperationCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.expression.TypeSelectExpression <em>Type Select Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.expression.TypeSelectExpression
	 * @generated
	 */
	public Adapter createTypeSelectExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.expression.GlobalVarExpression <em>Global Var Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.expression.GlobalVarExpression
	 * @generated
	 */
	public Adapter createGlobalVarExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.expression.IfExpression <em>If Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.expression.IfExpression
	 * @generated
	 */
	public Adapter createIfExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.expression.LetExpression <em>Let Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.expression.LetExpression
	 * @generated
	 */
	public Adapter createLetExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.expression.ListLiteral <em>List Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.expression.ListLiteral
	 * @generated
	 */
	public Adapter createListLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.expression.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.expression.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.expression.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.expression.BooleanLiteral
	 * @generated
	 */
	public Adapter createBooleanLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.expression.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.expression.IntegerLiteral
	 * @generated
	 */
	public Adapter createIntegerLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.expression.NullLiteral <em>Null Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.expression.NullLiteral
	 * @generated
	 */
	public Adapter createNullLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.expression.RealLiteral <em>Real Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.expression.RealLiteral
	 * @generated
	 */
	public Adapter createRealLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.expression.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.expression.StringLiteral
	 * @generated
	 */
	public Adapter createStringLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.expression.SwitchExpression <em>Switch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.expression.SwitchExpression
	 * @generated
	 */
	public Adapter createSwitchExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.expression.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.expression.Case
	 * @generated
	 */
	public Adapter createCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xpand3.SyntaxElement <em>Syntax Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xpand3.SyntaxElement
	 * @generated
	 */
	public Adapter createSyntaxElementAdapter() {
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

} //ExpressionAdapterFactory
