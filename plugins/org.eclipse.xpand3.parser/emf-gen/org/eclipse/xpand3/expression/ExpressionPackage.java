/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExpressionPackage.java,v 1.1 2008/03/17 14:39:06 jkohnlein Exp $
 */
package org.eclipse.xpand3.expression;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xpand3.Xpand3Package;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xpand3.expression.ExpressionFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expression";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/m2t/xpand/xpand3/expession";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "expression";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionPackage eINSTANCE = org.eclipse.xpand3.expression.impl.ExpressionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.expression.impl.AbstractExpressionImpl <em>Abstract Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.expression.impl.AbstractExpressionImpl
	 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getAbstractExpression()
	 * @generated
	 */
	int ABSTRACT_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXPRESSION__LINE = Xpand3Package.SYNTAX_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXPRESSION__START = Xpand3Package.SYNTAX_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXPRESSION__END = Xpand3Package.SYNTAX_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXPRESSION__FILE_NAME = Xpand3Package.SYNTAX_ELEMENT__FILE_NAME;

	/**
	 * The number of structural features of the '<em>Abstract Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXPRESSION_FEATURE_COUNT = Xpand3Package.SYNTAX_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.expression.impl.BinaryOperationImpl <em>Binary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.expression.impl.BinaryOperationImpl
	 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getBinaryOperation()
	 * @generated
	 */
	int BINARY_OPERATION = 21;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__LINE = ABSTRACT_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__START = ABSTRACT_EXPRESSION__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__END = ABSTRACT_EXPRESSION__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__FILE_NAME = ABSTRACT_EXPRESSION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__LEFT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__RIGHT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__OPERATOR = ABSTRACT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_FEATURE_COUNT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.expression.impl.BooleanOperationImpl <em>Boolean Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.expression.impl.BooleanOperationImpl
	 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getBooleanOperation()
	 * @generated
	 */
	int BOOLEAN_OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION__LINE = BINARY_OPERATION__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION__START = BINARY_OPERATION__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION__END = BINARY_OPERATION__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION__FILE_NAME = BINARY_OPERATION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION__LEFT = BINARY_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION__RIGHT = BINARY_OPERATION__RIGHT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION__OPERATOR = BINARY_OPERATION__OPERATOR;

	/**
	 * The number of structural features of the '<em>Boolean Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.expression.impl.CastImpl <em>Cast</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.expression.impl.CastImpl
	 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getCast()
	 * @generated
	 */
	int CAST = 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST__LINE = ABSTRACT_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST__START = ABSTRACT_EXPRESSION__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST__END = ABSTRACT_EXPRESSION__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST__FILE_NAME = ABSTRACT_EXPRESSION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST__TYPE = ABSTRACT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST__TARGET = ABSTRACT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_FEATURE_COUNT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.expression.impl.ChainExpressionImpl <em>Chain Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.expression.impl.ChainExpressionImpl
	 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getChainExpression()
	 * @generated
	 */
	int CHAIN_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_EXPRESSION__LINE = ABSTRACT_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_EXPRESSION__START = ABSTRACT_EXPRESSION__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_EXPRESSION__END = ABSTRACT_EXPRESSION__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_EXPRESSION__FILE_NAME = ABSTRACT_EXPRESSION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_EXPRESSION__FIRST = ABSTRACT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_EXPRESSION__NEXT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Chain Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_EXPRESSION_FEATURE_COUNT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.expression.impl.ConstructorCallExpressionImpl <em>Constructor Call Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.expression.impl.ConstructorCallExpressionImpl
	 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getConstructorCallExpression()
	 * @generated
	 */
	int CONSTRUCTOR_CALL_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_CALL_EXPRESSION__LINE = ABSTRACT_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_CALL_EXPRESSION__START = ABSTRACT_EXPRESSION__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_CALL_EXPRESSION__END = ABSTRACT_EXPRESSION__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_CALL_EXPRESSION__FILE_NAME = ABSTRACT_EXPRESSION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_CALL_EXPRESSION__TYPE = ABSTRACT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constructor Call Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_CALL_EXPRESSION_FEATURE_COUNT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.expression.impl.FeatureCallImpl <em>Feature Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.expression.impl.FeatureCallImpl
	 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getFeatureCall()
	 * @generated
	 */
	int FEATURE_CALL = 5;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL__LINE = ABSTRACT_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL__START = ABSTRACT_EXPRESSION__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL__END = ABSTRACT_EXPRESSION__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL__FILE_NAME = ABSTRACT_EXPRESSION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL__TARGET = ABSTRACT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL__NAME = ABSTRACT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_FEATURE_COUNT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.expression.impl.CollectionExpressionImpl <em>Collection Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.expression.impl.CollectionExpressionImpl
	 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getCollectionExpression()
	 * @generated
	 */
	int COLLECTION_EXPRESSION = 6;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION__LINE = FEATURE_CALL__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION__START = FEATURE_CALL__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION__END = FEATURE_CALL__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION__FILE_NAME = FEATURE_CALL__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION__TARGET = FEATURE_CALL__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION__NAME = FEATURE_CALL__NAME;

	/**
	 * The feature id for the '<em><b>Closure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION__CLOSURE = FEATURE_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ele Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION__ELE_NAME = FEATURE_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collection Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION_FEATURE_COUNT = FEATURE_CALL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.expression.impl.OperationCallImpl <em>Operation Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.expression.impl.OperationCallImpl
	 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getOperationCall()
	 * @generated
	 */
	int OPERATION_CALL = 7;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__LINE = FEATURE_CALL__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__START = FEATURE_CALL__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__END = FEATURE_CALL__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__FILE_NAME = FEATURE_CALL__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__TARGET = FEATURE_CALL__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__NAME = FEATURE_CALL__NAME;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__PARAMS = FEATURE_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_FEATURE_COUNT = FEATURE_CALL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.expression.impl.TypeSelectExpressionImpl <em>Type Select Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.expression.impl.TypeSelectExpressionImpl
	 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getTypeSelectExpression()
	 * @generated
	 */
	int TYPE_SELECT_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SELECT_EXPRESSION__LINE = FEATURE_CALL__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SELECT_EXPRESSION__START = FEATURE_CALL__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SELECT_EXPRESSION__END = FEATURE_CALL__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SELECT_EXPRESSION__FILE_NAME = FEATURE_CALL__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SELECT_EXPRESSION__TARGET = FEATURE_CALL__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SELECT_EXPRESSION__NAME = FEATURE_CALL__NAME;

	/**
	 * The feature id for the '<em><b>Type Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SELECT_EXPRESSION__TYPE_LITERAL = FEATURE_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Select Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SELECT_EXPRESSION_FEATURE_COUNT = FEATURE_CALL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.expression.impl.GlobalVarExpressionImpl <em>Global Var Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.expression.impl.GlobalVarExpressionImpl
	 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getGlobalVarExpression()
	 * @generated
	 */
	int GLOBAL_VAR_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_EXPRESSION__LINE = ABSTRACT_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_EXPRESSION__START = ABSTRACT_EXPRESSION__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_EXPRESSION__END = ABSTRACT_EXPRESSION__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_EXPRESSION__FILE_NAME = ABSTRACT_EXPRESSION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Global Var Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_EXPRESSION__GLOBAL_VAR_NAME = ABSTRACT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Global Var Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_EXPRESSION_FEATURE_COUNT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.expression.impl.IfExpressionImpl <em>If Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.expression.impl.IfExpressionImpl
	 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getIfExpression()
	 * @generated
	 */
	int IF_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__LINE = ABSTRACT_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__START = ABSTRACT_EXPRESSION__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__END = ABSTRACT_EXPRESSION__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__FILE_NAME = ABSTRACT_EXPRESSION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__CONDITION = ABSTRACT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__THEN_PART = ABSTRACT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__ELSE_PART = ABSTRACT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION_FEATURE_COUNT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.expression.impl.LetExpressionImpl <em>Let Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.expression.impl.LetExpressionImpl
	 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getLetExpression()
	 * @generated
	 */
	int LET_EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION__LINE = ABSTRACT_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION__START = ABSTRACT_EXPRESSION__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION__END = ABSTRACT_EXPRESSION__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION__FILE_NAME = ABSTRACT_EXPRESSION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Var Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION__VAR_EXPRESSION = ABSTRACT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION__TARGET_EXPRESSION = ABSTRACT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION__VAR_NAME = ABSTRACT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Let Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION_FEATURE_COUNT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.expression.impl.ListLiteralImpl <em>List Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.expression.impl.ListLiteralImpl
	 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getListLiteral()
	 * @generated
	 */
	int LIST_LITERAL = 12;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL__LINE = ABSTRACT_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL__START = ABSTRACT_EXPRESSION__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL__END = ABSTRACT_EXPRESSION__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL__FILE_NAME = ABSTRACT_EXPRESSION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL__ELEMENTS = ABSTRACT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL_FEATURE_COUNT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.expression.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.expression.impl.LiteralImpl
	 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 13;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__LINE = ABSTRACT_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__START = ABSTRACT_EXPRESSION__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__END = ABSTRACT_EXPRESSION__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__FILE_NAME = ABSTRACT_EXPRESSION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Literal Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__LITERAL_VALUE = ABSTRACT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.expression.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.expression.impl.BooleanLiteralImpl
	 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 14;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__LINE = LITERAL__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__START = LITERAL__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__END = LITERAL__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__FILE_NAME = LITERAL__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Literal Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__LITERAL_VALUE = LITERAL__LITERAL_VALUE;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.expression.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.expression.impl.IntegerLiteralImpl
	 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getIntegerLiteral()
	 * @generated
	 */
	int INTEGER_LITERAL = 15;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__LINE = LITERAL__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__START = LITERAL__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__END = LITERAL__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__FILE_NAME = LITERAL__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Literal Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__LITERAL_VALUE = LITERAL__LITERAL_VALUE;

	/**
	 * The number of structural features of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.expression.impl.NullLiteralImpl <em>Null Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.expression.impl.NullLiteralImpl
	 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getNullLiteral()
	 * @generated
	 */
	int NULL_LITERAL = 16;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL__LINE = LITERAL__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL__START = LITERAL__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL__END = LITERAL__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL__FILE_NAME = LITERAL__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Literal Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL__LITERAL_VALUE = LITERAL__LITERAL_VALUE;

	/**
	 * The number of structural features of the '<em>Null Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.expression.impl.RealLiteralImpl <em>Real Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.expression.impl.RealLiteralImpl
	 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getRealLiteral()
	 * @generated
	 */
	int REAL_LITERAL = 17;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL__LINE = LITERAL__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL__START = LITERAL__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL__END = LITERAL__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL__FILE_NAME = LITERAL__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Literal Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL__LITERAL_VALUE = LITERAL__LITERAL_VALUE;

	/**
	 * The number of structural features of the '<em>Real Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.expression.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.expression.impl.StringLiteralImpl
	 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 18;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__LINE = LITERAL__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__START = LITERAL__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__END = LITERAL__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__FILE_NAME = LITERAL__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Literal Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__LITERAL_VALUE = LITERAL__LITERAL_VALUE;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.expression.impl.SwitchExpressionImpl <em>Switch Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.expression.impl.SwitchExpressionImpl
	 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getSwitchExpression()
	 * @generated
	 */
	int SWITCH_EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXPRESSION__LINE = ABSTRACT_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXPRESSION__START = ABSTRACT_EXPRESSION__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXPRESSION__END = ABSTRACT_EXPRESSION__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXPRESSION__FILE_NAME = ABSTRACT_EXPRESSION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Switch Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXPRESSION__SWITCH_EXPR = ABSTRACT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXPRESSION__DEFAULT_EXPR = ABSTRACT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXPRESSION__CASES = ABSTRACT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Switch Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXPRESSION_FEATURE_COUNT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.expression.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.expression.impl.CaseImpl
	 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getCase()
	 * @generated
	 */
	int CASE = 20;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__LINE = Xpand3Package.SYNTAX_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__START = Xpand3Package.SYNTAX_ELEMENT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__END = Xpand3Package.SYNTAX_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__FILE_NAME = Xpand3Package.SYNTAX_ELEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__CONDITION = Xpand3Package.SYNTAX_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__THEN_PART = Xpand3Package.SYNTAX_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FEATURE_COUNT = Xpand3Package.SYNTAX_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.expression.impl.UnaryOperationImpl <em>Unary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.expression.impl.UnaryOperationImpl
	 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getUnaryOperation()
	 * @generated
	 */
	int UNARY_OPERATION = 22;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION__LINE = ABSTRACT_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION__START = ABSTRACT_EXPRESSION__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION__END = ABSTRACT_EXPRESSION__END;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION__FILE_NAME = ABSTRACT_EXPRESSION__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION__OPERATOR = ABSTRACT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION__OPERAND = ABSTRACT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION_FEATURE_COUNT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.expression.AbstractExpression <em>Abstract Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Expression</em>'.
	 * @see org.eclipse.xpand3.expression.AbstractExpression
	 * @generated
	 */
	EClass getAbstractExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.expression.BooleanOperation <em>Boolean Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Operation</em>'.
	 * @see org.eclipse.xpand3.expression.BooleanOperation
	 * @generated
	 */
	EClass getBooleanOperation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.expression.Cast <em>Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cast</em>'.
	 * @see org.eclipse.xpand3.expression.Cast
	 * @generated
	 */
	EClass getCast();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.expression.Cast#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.xpand3.expression.Cast#getType()
	 * @see #getCast()
	 * @generated
	 */
	EReference getCast_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.expression.Cast#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.eclipse.xpand3.expression.Cast#getTarget()
	 * @see #getCast()
	 * @generated
	 */
	EReference getCast_Target();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.expression.ChainExpression <em>Chain Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain Expression</em>'.
	 * @see org.eclipse.xpand3.expression.ChainExpression
	 * @generated
	 */
	EClass getChainExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.expression.ChainExpression#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First</em>'.
	 * @see org.eclipse.xpand3.expression.ChainExpression#getFirst()
	 * @see #getChainExpression()
	 * @generated
	 */
	EReference getChainExpression_First();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.expression.ChainExpression#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see org.eclipse.xpand3.expression.ChainExpression#getNext()
	 * @see #getChainExpression()
	 * @generated
	 */
	EReference getChainExpression_Next();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.expression.ConstructorCallExpression <em>Constructor Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Call Expression</em>'.
	 * @see org.eclipse.xpand3.expression.ConstructorCallExpression
	 * @generated
	 */
	EClass getConstructorCallExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.expression.ConstructorCallExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.xpand3.expression.ConstructorCallExpression#getType()
	 * @see #getConstructorCallExpression()
	 * @generated
	 */
	EReference getConstructorCallExpression_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.expression.FeatureCall <em>Feature Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Call</em>'.
	 * @see org.eclipse.xpand3.expression.FeatureCall
	 * @generated
	 */
	EClass getFeatureCall();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.expression.FeatureCall#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.eclipse.xpand3.expression.FeatureCall#getTarget()
	 * @see #getFeatureCall()
	 * @generated
	 */
	EReference getFeatureCall_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.expression.FeatureCall#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.eclipse.xpand3.expression.FeatureCall#getName()
	 * @see #getFeatureCall()
	 * @generated
	 */
	EReference getFeatureCall_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.expression.CollectionExpression <em>Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Expression</em>'.
	 * @see org.eclipse.xpand3.expression.CollectionExpression
	 * @generated
	 */
	EClass getCollectionExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.expression.CollectionExpression#getClosure <em>Closure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Closure</em>'.
	 * @see org.eclipse.xpand3.expression.CollectionExpression#getClosure()
	 * @see #getCollectionExpression()
	 * @generated
	 */
	EReference getCollectionExpression_Closure();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.expression.CollectionExpression#getEleName <em>Ele Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ele Name</em>'.
	 * @see org.eclipse.xpand3.expression.CollectionExpression#getEleName()
	 * @see #getCollectionExpression()
	 * @generated
	 */
	EReference getCollectionExpression_EleName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.expression.OperationCall <em>Operation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call</em>'.
	 * @see org.eclipse.xpand3.expression.OperationCall
	 * @generated
	 */
	EClass getOperationCall();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.expression.OperationCall#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see org.eclipse.xpand3.expression.OperationCall#getParams()
	 * @see #getOperationCall()
	 * @generated
	 */
	EReference getOperationCall_Params();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.expression.TypeSelectExpression <em>Type Select Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Select Expression</em>'.
	 * @see org.eclipse.xpand3.expression.TypeSelectExpression
	 * @generated
	 */
	EClass getTypeSelectExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.expression.TypeSelectExpression#getTypeLiteral <em>Type Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Literal</em>'.
	 * @see org.eclipse.xpand3.expression.TypeSelectExpression#getTypeLiteral()
	 * @see #getTypeSelectExpression()
	 * @generated
	 */
	EReference getTypeSelectExpression_TypeLiteral();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.expression.GlobalVarExpression <em>Global Var Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Var Expression</em>'.
	 * @see org.eclipse.xpand3.expression.GlobalVarExpression
	 * @generated
	 */
	EClass getGlobalVarExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.expression.GlobalVarExpression#getGlobalVarName <em>Global Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Var Name</em>'.
	 * @see org.eclipse.xpand3.expression.GlobalVarExpression#getGlobalVarName()
	 * @see #getGlobalVarExpression()
	 * @generated
	 */
	EReference getGlobalVarExpression_GlobalVarName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.expression.IfExpression <em>If Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Expression</em>'.
	 * @see org.eclipse.xpand3.expression.IfExpression
	 * @generated
	 */
	EClass getIfExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.expression.IfExpression#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.xpand3.expression.IfExpression#getCondition()
	 * @see #getIfExpression()
	 * @generated
	 */
	EReference getIfExpression_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.expression.IfExpression#getThenPart <em>Then Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Part</em>'.
	 * @see org.eclipse.xpand3.expression.IfExpression#getThenPart()
	 * @see #getIfExpression()
	 * @generated
	 */
	EReference getIfExpression_ThenPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.expression.IfExpression#getElsePart <em>Else Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Part</em>'.
	 * @see org.eclipse.xpand3.expression.IfExpression#getElsePart()
	 * @see #getIfExpression()
	 * @generated
	 */
	EReference getIfExpression_ElsePart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.expression.LetExpression <em>Let Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Let Expression</em>'.
	 * @see org.eclipse.xpand3.expression.LetExpression
	 * @generated
	 */
	EClass getLetExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.expression.LetExpression#getVarExpression <em>Var Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Var Expression</em>'.
	 * @see org.eclipse.xpand3.expression.LetExpression#getVarExpression()
	 * @see #getLetExpression()
	 * @generated
	 */
	EReference getLetExpression_VarExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.expression.LetExpression#getTargetExpression <em>Target Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Expression</em>'.
	 * @see org.eclipse.xpand3.expression.LetExpression#getTargetExpression()
	 * @see #getLetExpression()
	 * @generated
	 */
	EReference getLetExpression_TargetExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.expression.LetExpression#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Var Name</em>'.
	 * @see org.eclipse.xpand3.expression.LetExpression#getVarName()
	 * @see #getLetExpression()
	 * @generated
	 */
	EReference getLetExpression_VarName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.expression.ListLiteral <em>List Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Literal</em>'.
	 * @see org.eclipse.xpand3.expression.ListLiteral
	 * @generated
	 */
	EClass getListLiteral();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.expression.ListLiteral#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.eclipse.xpand3.expression.ListLiteral#getElements()
	 * @see #getListLiteral()
	 * @generated
	 */
	EReference getListLiteral_Elements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.expression.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see org.eclipse.xpand3.expression.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.expression.Literal#getLiteralValue <em>Literal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Literal Value</em>'.
	 * @see org.eclipse.xpand3.expression.Literal#getLiteralValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EReference getLiteral_LiteralValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.expression.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see org.eclipse.xpand3.expression.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.expression.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal</em>'.
	 * @see org.eclipse.xpand3.expression.IntegerLiteral
	 * @generated
	 */
	EClass getIntegerLiteral();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.expression.NullLiteral <em>Null Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Literal</em>'.
	 * @see org.eclipse.xpand3.expression.NullLiteral
	 * @generated
	 */
	EClass getNullLiteral();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.expression.RealLiteral <em>Real Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Literal</em>'.
	 * @see org.eclipse.xpand3.expression.RealLiteral
	 * @generated
	 */
	EClass getRealLiteral();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.expression.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see org.eclipse.xpand3.expression.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.expression.SwitchExpression <em>Switch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Expression</em>'.
	 * @see org.eclipse.xpand3.expression.SwitchExpression
	 * @generated
	 */
	EClass getSwitchExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.expression.SwitchExpression#getSwitchExpr <em>Switch Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Switch Expr</em>'.
	 * @see org.eclipse.xpand3.expression.SwitchExpression#getSwitchExpr()
	 * @see #getSwitchExpression()
	 * @generated
	 */
	EReference getSwitchExpression_SwitchExpr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.expression.SwitchExpression#getDefaultExpr <em>Default Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Expr</em>'.
	 * @see org.eclipse.xpand3.expression.SwitchExpression#getDefaultExpr()
	 * @see #getSwitchExpression()
	 * @generated
	 */
	EReference getSwitchExpression_DefaultExpr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.expression.SwitchExpression#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see org.eclipse.xpand3.expression.SwitchExpression#getCases()
	 * @see #getSwitchExpression()
	 * @generated
	 */
	EReference getSwitchExpression_Cases();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.expression.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see org.eclipse.xpand3.expression.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.expression.Case#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.xpand3.expression.Case#getCondition()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.expression.Case#getThenPart <em>Then Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Part</em>'.
	 * @see org.eclipse.xpand3.expression.Case#getThenPart()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_ThenPart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.expression.BinaryOperation <em>Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Operation</em>'.
	 * @see org.eclipse.xpand3.expression.BinaryOperation
	 * @generated
	 */
	EClass getBinaryOperation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.expression.BinaryOperation#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see org.eclipse.xpand3.expression.BinaryOperation#getLeft()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EReference getBinaryOperation_Left();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.expression.BinaryOperation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see org.eclipse.xpand3.expression.BinaryOperation#getRight()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EReference getBinaryOperation_Right();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.expression.BinaryOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see org.eclipse.xpand3.expression.BinaryOperation#getOperator()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EReference getBinaryOperation_Operator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.expression.UnaryOperation <em>Unary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Operation</em>'.
	 * @see org.eclipse.xpand3.expression.UnaryOperation
	 * @generated
	 */
	EClass getUnaryOperation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.expression.UnaryOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see org.eclipse.xpand3.expression.UnaryOperation#getOperator()
	 * @see #getUnaryOperation()
	 * @generated
	 */
	EReference getUnaryOperation_Operator();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand3.expression.UnaryOperation#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand</em>'.
	 * @see org.eclipse.xpand3.expression.UnaryOperation#getOperand()
	 * @see #getUnaryOperation()
	 * @generated
	 */
	EReference getUnaryOperation_Operand();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExpressionFactory getExpressionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.expression.impl.AbstractExpressionImpl <em>Abstract Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.expression.impl.AbstractExpressionImpl
		 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getAbstractExpression()
		 * @generated
		 */
		EClass ABSTRACT_EXPRESSION = eINSTANCE.getAbstractExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.expression.impl.BooleanOperationImpl <em>Boolean Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.expression.impl.BooleanOperationImpl
		 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getBooleanOperation()
		 * @generated
		 */
		EClass BOOLEAN_OPERATION = eINSTANCE.getBooleanOperation();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.expression.impl.CastImpl <em>Cast</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.expression.impl.CastImpl
		 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getCast()
		 * @generated
		 */
		EClass CAST = eINSTANCE.getCast();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAST__TYPE = eINSTANCE.getCast_Type();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAST__TARGET = eINSTANCE.getCast_Target();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.expression.impl.ChainExpressionImpl <em>Chain Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.expression.impl.ChainExpressionImpl
		 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getChainExpression()
		 * @generated
		 */
		EClass CHAIN_EXPRESSION = eINSTANCE.getChainExpression();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_EXPRESSION__FIRST = eINSTANCE.getChainExpression_First();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_EXPRESSION__NEXT = eINSTANCE.getChainExpression_Next();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.expression.impl.ConstructorCallExpressionImpl <em>Constructor Call Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.expression.impl.ConstructorCallExpressionImpl
		 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getConstructorCallExpression()
		 * @generated
		 */
		EClass CONSTRUCTOR_CALL_EXPRESSION = eINSTANCE.getConstructorCallExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_CALL_EXPRESSION__TYPE = eINSTANCE.getConstructorCallExpression_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.expression.impl.FeatureCallImpl <em>Feature Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.expression.impl.FeatureCallImpl
		 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getFeatureCall()
		 * @generated
		 */
		EClass FEATURE_CALL = eINSTANCE.getFeatureCall();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_CALL__TARGET = eINSTANCE.getFeatureCall_Target();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_CALL__NAME = eINSTANCE.getFeatureCall_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.expression.impl.CollectionExpressionImpl <em>Collection Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.expression.impl.CollectionExpressionImpl
		 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getCollectionExpression()
		 * @generated
		 */
		EClass COLLECTION_EXPRESSION = eINSTANCE.getCollectionExpression();

		/**
		 * The meta object literal for the '<em><b>Closure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_EXPRESSION__CLOSURE = eINSTANCE.getCollectionExpression_Closure();

		/**
		 * The meta object literal for the '<em><b>Ele Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_EXPRESSION__ELE_NAME = eINSTANCE.getCollectionExpression_EleName();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.expression.impl.OperationCallImpl <em>Operation Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.expression.impl.OperationCallImpl
		 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getOperationCall()
		 * @generated
		 */
		EClass OPERATION_CALL = eINSTANCE.getOperationCall();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL__PARAMS = eINSTANCE.getOperationCall_Params();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.expression.impl.TypeSelectExpressionImpl <em>Type Select Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.expression.impl.TypeSelectExpressionImpl
		 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getTypeSelectExpression()
		 * @generated
		 */
		EClass TYPE_SELECT_EXPRESSION = eINSTANCE.getTypeSelectExpression();

		/**
		 * The meta object literal for the '<em><b>Type Literal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_SELECT_EXPRESSION__TYPE_LITERAL = eINSTANCE.getTypeSelectExpression_TypeLiteral();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.expression.impl.GlobalVarExpressionImpl <em>Global Var Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.expression.impl.GlobalVarExpressionImpl
		 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getGlobalVarExpression()
		 * @generated
		 */
		EClass GLOBAL_VAR_EXPRESSION = eINSTANCE.getGlobalVarExpression();

		/**
		 * The meta object literal for the '<em><b>Global Var Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_VAR_EXPRESSION__GLOBAL_VAR_NAME = eINSTANCE.getGlobalVarExpression_GlobalVarName();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.expression.impl.IfExpressionImpl <em>If Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.expression.impl.IfExpressionImpl
		 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getIfExpression()
		 * @generated
		 */
		EClass IF_EXPRESSION = eINSTANCE.getIfExpression();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXPRESSION__CONDITION = eINSTANCE.getIfExpression_Condition();

		/**
		 * The meta object literal for the '<em><b>Then Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXPRESSION__THEN_PART = eINSTANCE.getIfExpression_ThenPart();

		/**
		 * The meta object literal for the '<em><b>Else Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXPRESSION__ELSE_PART = eINSTANCE.getIfExpression_ElsePart();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.expression.impl.LetExpressionImpl <em>Let Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.expression.impl.LetExpressionImpl
		 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getLetExpression()
		 * @generated
		 */
		EClass LET_EXPRESSION = eINSTANCE.getLetExpression();

		/**
		 * The meta object literal for the '<em><b>Var Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET_EXPRESSION__VAR_EXPRESSION = eINSTANCE.getLetExpression_VarExpression();

		/**
		 * The meta object literal for the '<em><b>Target Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET_EXPRESSION__TARGET_EXPRESSION = eINSTANCE.getLetExpression_TargetExpression();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET_EXPRESSION__VAR_NAME = eINSTANCE.getLetExpression_VarName();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.expression.impl.ListLiteralImpl <em>List Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.expression.impl.ListLiteralImpl
		 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getListLiteral()
		 * @generated
		 */
		EClass LIST_LITERAL = eINSTANCE.getListLiteral();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_LITERAL__ELEMENTS = eINSTANCE.getListLiteral_Elements();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.expression.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.expression.impl.LiteralImpl
		 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Literal Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL__LITERAL_VALUE = eINSTANCE.getLiteral_LiteralValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.expression.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.expression.impl.BooleanLiteralImpl
		 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.expression.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.expression.impl.IntegerLiteralImpl
		 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getIntegerLiteral()
		 * @generated
		 */
		EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.expression.impl.NullLiteralImpl <em>Null Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.expression.impl.NullLiteralImpl
		 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getNullLiteral()
		 * @generated
		 */
		EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.expression.impl.RealLiteralImpl <em>Real Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.expression.impl.RealLiteralImpl
		 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getRealLiteral()
		 * @generated
		 */
		EClass REAL_LITERAL = eINSTANCE.getRealLiteral();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.expression.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.expression.impl.StringLiteralImpl
		 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.expression.impl.SwitchExpressionImpl <em>Switch Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.expression.impl.SwitchExpressionImpl
		 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getSwitchExpression()
		 * @generated
		 */
		EClass SWITCH_EXPRESSION = eINSTANCE.getSwitchExpression();

		/**
		 * The meta object literal for the '<em><b>Switch Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_EXPRESSION__SWITCH_EXPR = eINSTANCE.getSwitchExpression_SwitchExpr();

		/**
		 * The meta object literal for the '<em><b>Default Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_EXPRESSION__DEFAULT_EXPR = eINSTANCE.getSwitchExpression_DefaultExpr();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_EXPRESSION__CASES = eINSTANCE.getSwitchExpression_Cases();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.expression.impl.CaseImpl <em>Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.expression.impl.CaseImpl
		 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getCase()
		 * @generated
		 */
		EClass CASE = eINSTANCE.getCase();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__CONDITION = eINSTANCE.getCase_Condition();

		/**
		 * The meta object literal for the '<em><b>Then Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__THEN_PART = eINSTANCE.getCase_ThenPart();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.expression.impl.BinaryOperationImpl <em>Binary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.expression.impl.BinaryOperationImpl
		 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getBinaryOperation()
		 * @generated
		 */
		EClass BINARY_OPERATION = eINSTANCE.getBinaryOperation();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION__LEFT = eINSTANCE.getBinaryOperation_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION__RIGHT = eINSTANCE.getBinaryOperation_Right();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION__OPERATOR = eINSTANCE.getBinaryOperation_Operator();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.expression.impl.UnaryOperationImpl <em>Unary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.expression.impl.UnaryOperationImpl
		 * @see org.eclipse.xpand3.expression.impl.ExpressionPackageImpl#getUnaryOperation()
		 * @generated
		 */
		EClass UNARY_OPERATION = eINSTANCE.getUnaryOperation();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_OPERATION__OPERATOR = eINSTANCE.getUnaryOperation_Operator();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_OPERATION__OPERAND = eINSTANCE.getUnaryOperation_Operand();

	}

} //ExpressionPackage
