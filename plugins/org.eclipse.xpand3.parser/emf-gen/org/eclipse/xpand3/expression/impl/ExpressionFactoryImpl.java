/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExpressionFactoryImpl.java,v 1.2 2008/03/20 10:15:42 jkohnlein Exp $
 */
package org.eclipse.xpand3.expression.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xpand3.expression.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionFactoryImpl extends EFactoryImpl implements ExpressionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExpressionFactory init() {
		try {
			ExpressionFactory theExpressionFactory = (ExpressionFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/m2t/xpand/xpand3/expression"); 
			if (theExpressionFactory != null) {
				return theExpressionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExpressionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionFactoryImpl() {
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
			case ExpressionPackage.BOOLEAN_OPERATION: return createBooleanOperation();
			case ExpressionPackage.CAST: return createCast();
			case ExpressionPackage.CHAIN_EXPRESSION: return createChainExpression();
			case ExpressionPackage.CONSTRUCTOR_CALL_EXPRESSION: return createConstructorCallExpression();
			case ExpressionPackage.FEATURE_CALL: return createFeatureCall();
			case ExpressionPackage.COLLECTION_EXPRESSION: return createCollectionExpression();
			case ExpressionPackage.OPERATION_CALL: return createOperationCall();
			case ExpressionPackage.TYPE_SELECT_EXPRESSION: return createTypeSelectExpression();
			case ExpressionPackage.GLOBAL_VAR_EXPRESSION: return createGlobalVarExpression();
			case ExpressionPackage.IF_EXPRESSION: return createIfExpression();
			case ExpressionPackage.LET_EXPRESSION: return createLetExpression();
			case ExpressionPackage.LIST_LITERAL: return createListLiteral();
			case ExpressionPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
			case ExpressionPackage.INTEGER_LITERAL: return createIntegerLiteral();
			case ExpressionPackage.NULL_LITERAL: return createNullLiteral();
			case ExpressionPackage.REAL_LITERAL: return createRealLiteral();
			case ExpressionPackage.STRING_LITERAL: return createStringLiteral();
			case ExpressionPackage.SWITCH_EXPRESSION: return createSwitchExpression();
			case ExpressionPackage.CASE: return createCase();
			case ExpressionPackage.BINARY_OPERATION: return createBinaryOperation();
			case ExpressionPackage.UNARY_OPERATION: return createUnaryOperation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperation createBooleanOperation() {
		BooleanOperationImpl booleanOperation = new BooleanOperationImpl();
		return booleanOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cast createCast() {
		CastImpl cast = new CastImpl();
		return cast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainExpression createChainExpression() {
		ChainExpressionImpl chainExpression = new ChainExpressionImpl();
		return chainExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructorCallExpression createConstructorCallExpression() {
		ConstructorCallExpressionImpl constructorCallExpression = new ConstructorCallExpressionImpl();
		return constructorCallExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureCall createFeatureCall() {
		FeatureCallImpl featureCall = new FeatureCallImpl();
		return featureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionExpression createCollectionExpression() {
		CollectionExpressionImpl collectionExpression = new CollectionExpressionImpl();
		return collectionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCall createOperationCall() {
		OperationCallImpl operationCall = new OperationCallImpl();
		return operationCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSelectExpression createTypeSelectExpression() {
		TypeSelectExpressionImpl typeSelectExpression = new TypeSelectExpressionImpl();
		return typeSelectExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVarExpression createGlobalVarExpression() {
		GlobalVarExpressionImpl globalVarExpression = new GlobalVarExpressionImpl();
		return globalVarExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfExpression createIfExpression() {
		IfExpressionImpl ifExpression = new IfExpressionImpl();
		return ifExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetExpression createLetExpression() {
		LetExpressionImpl letExpression = new LetExpressionImpl();
		return letExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListLiteral createListLiteral() {
		ListLiteralImpl listLiteral = new ListLiteralImpl();
		return listLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerLiteral createIntegerLiteral() {
		IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
		return integerLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullLiteral createNullLiteral() {
		NullLiteralImpl nullLiteral = new NullLiteralImpl();
		return nullLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealLiteral createRealLiteral() {
		RealLiteralImpl realLiteral = new RealLiteralImpl();
		return realLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchExpression createSwitchExpression() {
		SwitchExpressionImpl switchExpression = new SwitchExpressionImpl();
		return switchExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case createCase() {
		CaseImpl case_ = new CaseImpl();
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperation createBinaryOperation() {
		BinaryOperationImpl binaryOperation = new BinaryOperationImpl();
		return binaryOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperation createUnaryOperation() {
		UnaryOperationImpl unaryOperation = new UnaryOperationImpl();
		return unaryOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionPackage getExpressionPackage() {
		return (ExpressionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExpressionPackage getPackage() {
		return ExpressionPackage.eINSTANCE;
	}

} //ExpressionFactoryImpl
