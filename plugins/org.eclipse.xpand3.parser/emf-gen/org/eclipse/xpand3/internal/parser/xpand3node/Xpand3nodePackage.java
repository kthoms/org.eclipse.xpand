/**
 * <copyright>
 * </copyright>
 *
 * $Id: Xpand3nodePackage.java,v 1.3 2008/03/07 09:39:41 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.tmf.common.node.NodePackage;

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
 * @see org.eclipse.xpand3.internal.parser.xpand3node.Xpand3nodeFactory
 * @model kind="package"
 * @generated
 */
public interface Xpand3nodePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xpand3node";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/tmf/common/Xpand3Node";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xpand3node";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Xpand3nodePackage eINSTANCE = org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.FileNodeImpl <em>File Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.FileNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getFileNode()
	 * @generated
	 */
	int FILE_NODE = 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Imp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NODE__IMP = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decl</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NODE__DECL = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.NsImportNodeImpl <em>Ns Import Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.NsImportNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getNsImportNode()
	 * @generated
	 */
	int NS_IMPORT_NODE = 1;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NS_IMPORT_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NS_IMPORT_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NS_IMPORT_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NS_IMPORT_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Ns</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NS_IMPORT_NODE__NS = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ns Import Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NS_IMPORT_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.DefinitionNodeImpl <em>Definition Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.DefinitionNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getDefinitionNode()
	 * @generated
	 */
	int DEFINITION_NODE = 2;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_NODE__NAME = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Definition Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.DefinitionAroundNodeImpl <em>Definition Around Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.DefinitionAroundNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getDefinitionAroundNode()
	 * @generated
	 */
	int DEFINITION_AROUND_NODE = 3;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_AROUND_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_AROUND_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_AROUND_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_AROUND_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Definition Around Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_AROUND_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.SequenceNodeImpl <em>Sequence Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.SequenceNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getSequenceNode()
	 * @generated
	 */
	int SEQUENCE_NODE = 4;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Sequence Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.TextSequenceNodeImpl <em>Text Sequence Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.TextSequenceNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getTextSequenceNode()
	 * @generated
	 */
	int TEXT_SEQUENCE_NODE = 5;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SEQUENCE_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SEQUENCE_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SEQUENCE_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SEQUENCE_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Text Sequence Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SEQUENCE_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.TextNodeImpl <em>Text Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.TextNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getTextNode()
	 * @generated
	 */
	int TEXT_NODE = 6;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Text Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ErrorStatementNodeImpl <em>Error Statement Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ErrorStatementNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getErrorStatementNode()
	 * @generated
	 */
	int ERROR_STATEMENT_NODE = 7;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATEMENT_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATEMENT_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATEMENT_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATEMENT_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Error Statement Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATEMENT_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ExpandStatementNodeImpl <em>Expand Statement Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ExpandStatementNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getExpandStatementNode()
	 * @generated
	 */
	int EXPAND_STATEMENT_NODE = 8;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_STATEMENT_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_STATEMENT_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_STATEMENT_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_STATEMENT_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Expand Statement Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPAND_STATEMENT_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ExpressionStmtNodeImpl <em>Expression Stmt Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ExpressionStmtNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getExpressionStmtNode()
	 * @generated
	 */
	int EXPRESSION_STMT_NODE = 9;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STMT_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STMT_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STMT_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STMT_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Expression Stmt Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STMT_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.FileStatementNodeImpl <em>File Statement Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.FileStatementNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getFileStatementNode()
	 * @generated
	 */
	int FILE_STATEMENT_NODE = 10;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STATEMENT_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STATEMENT_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STATEMENT_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STATEMENT_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>File Statement Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STATEMENT_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ForeachStatementNodeImpl <em>Foreach Statement Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ForeachStatementNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getForeachStatementNode()
	 * @generated
	 */
	int FOREACH_STATEMENT_NODE = 11;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREACH_STATEMENT_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREACH_STATEMENT_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREACH_STATEMENT_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREACH_STATEMENT_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Foreach Statement Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREACH_STATEMENT_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.IfStatementNodeImpl <em>If Statement Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.IfStatementNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getIfStatementNode()
	 * @generated
	 */
	int IF_STATEMENT_NODE = 12;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>If Statement Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ElseIfStatementNodeImpl <em>Else If Statement Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ElseIfStatementNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getElseIfStatementNode()
	 * @generated
	 */
	int ELSE_IF_STATEMENT_NODE = 13;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_STATEMENT_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_STATEMENT_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_STATEMENT_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_STATEMENT_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Else If Statement Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_STATEMENT_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ElseStatementNodeImpl <em>Else Statement Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ElseStatementNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getElseStatementNode()
	 * @generated
	 */
	int ELSE_STATEMENT_NODE = 14;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_STATEMENT_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_STATEMENT_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_STATEMENT_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_STATEMENT_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Else Statement Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_STATEMENT_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.LetStatementNodeImpl <em>Let Statement Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.LetStatementNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getLetStatementNode()
	 * @generated
	 */
	int LET_STATEMENT_NODE = 15;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_STATEMENT_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_STATEMENT_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_STATEMENT_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_STATEMENT_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Let Statement Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_STATEMENT_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ProtectStatementNodeImpl <em>Protect Statement Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ProtectStatementNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getProtectStatementNode()
	 * @generated
	 */
	int PROTECT_STATEMENT_NODE = 16;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECT_STATEMENT_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECT_STATEMENT_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECT_STATEMENT_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECT_STATEMENT_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Protect Statement Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECT_STATEMENT_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.CheckNodeImpl <em>Check Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.CheckNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getCheckNode()
	 * @generated
	 */
	int CHECK_NODE = 17;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Check Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.AroundNodeImpl <em>Around Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.AroundNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getAroundNode()
	 * @generated
	 */
	int AROUND_NODE = 18;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AROUND_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AROUND_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AROUND_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AROUND_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Around Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AROUND_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.PointcutNodeImpl <em>Pointcut Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.PointcutNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getPointcutNode()
	 * @generated
	 */
	int POINTCUT_NODE = 19;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Pointcut Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ExtensionNodeImpl <em>Extension Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ExtensionNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getExtensionNode()
	 * @generated
	 */
	int EXTENSION_NODE = 20;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_NODE__RETURN_TYPE = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cached</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_NODE__CACHED = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Java Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_NODE__JAVA_NAME = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Private</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_NODE__PRIVATE = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_NODE__NAME = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Extend Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_NODE__EXTEND_BODY = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Create</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_NODE__CREATE = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Param List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_NODE__PARAM_LIST = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Java Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_NODE__JAVA_RETURN_TYPE = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Extension Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.JavaTypeNodeImpl <em>Java Type Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.JavaTypeNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getJavaTypeNode()
	 * @generated
	 */
	int JAVA_TYPE_NODE = 21;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TYPE_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TYPE_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TYPE_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TYPE_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Java Type Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TYPE_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.Test_expressionNodeImpl <em>Test expression Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Test_expressionNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getTest_expressionNode()
	 * @generated
	 */
	int TEST_EXPRESSION_NODE = 22;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_EXPRESSION_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_EXPRESSION_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_EXPRESSION_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_EXPRESSION_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Test expression Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_EXPRESSION_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ExpressionNodeImpl <em>Expression Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ExpressionNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getExpressionNode()
	 * @generated
	 */
	int EXPRESSION_NODE = 23;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Expression Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.LetExpressionNodeImpl <em>Let Expression Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.LetExpressionNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getLetExpressionNode()
	 * @generated
	 */
	int LET_EXPRESSION_NODE = 24;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Let Expression Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXPRESSION_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.CastedExpressionNodeImpl <em>Casted Expression Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.CastedExpressionNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getCastedExpressionNode()
	 * @generated
	 */
	int CASTED_EXPRESSION_NODE = 25;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASTED_EXPRESSION_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASTED_EXPRESSION_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASTED_EXPRESSION_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASTED_EXPRESSION_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Casted Expression Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASTED_EXPRESSION_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ChainExpressionNodeImpl <em>Chain Expression Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ChainExpressionNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getChainExpressionNode()
	 * @generated
	 */
	int CHAIN_EXPRESSION_NODE = 26;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_EXPRESSION_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_EXPRESSION_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_EXPRESSION_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_EXPRESSION_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Chain Expression Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_EXPRESSION_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.IfExpressionNodeImpl <em>If Expression Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.IfExpressionNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getIfExpressionNode()
	 * @generated
	 */
	int IF_EXPRESSION_NODE = 27;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>If Expression Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.SwitchExpressionNodeImpl <em>Switch Expression Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.SwitchExpressionNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getSwitchExpressionNode()
	 * @generated
	 */
	int SWITCH_EXPRESSION_NODE = 28;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXPRESSION_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXPRESSION_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXPRESSION_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXPRESSION_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Switch Expression Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXPRESSION_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.CasePartNodeImpl <em>Case Part Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.CasePartNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getCasePartNode()
	 * @generated
	 */
	int CASE_PART_NODE = 29;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PART_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PART_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PART_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PART_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Case Part Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_PART_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.OrExpressionNodeImpl <em>Or Expression Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.OrExpressionNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getOrExpressionNode()
	 * @generated
	 */
	int OR_EXPRESSION_NODE = 30;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Or Expression Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.AndExpressionNodeImpl <em>And Expression Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.AndExpressionNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getAndExpressionNode()
	 * @generated
	 */
	int AND_EXPRESSION_NODE = 31;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>And Expression Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ImpliesExpressionNodeImpl <em>Implies Expression Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ImpliesExpressionNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getImpliesExpressionNode()
	 * @generated
	 */
	int IMPLIES_EXPRESSION_NODE = 32;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPRESSION_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPRESSION_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPRESSION_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPRESSION_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Implies Expression Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPRESSION_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.RelationalExpressionNodeImpl <em>Relational Expression Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.RelationalExpressionNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getRelationalExpressionNode()
	 * @generated
	 */
	int RELATIONAL_EXPRESSION_NODE = 33;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_NODE__RIGHT_OPERAND = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_NODE__OPERATOR = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_NODE__LEFT_OPERAND = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relational Expression Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.AdditiveExpressionNodeImpl <em>Additive Expression Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.AdditiveExpressionNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getAdditiveExpressionNode()
	 * @generated
	 */
	int ADDITIVE_EXPRESSION_NODE = 34;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_EXPRESSION_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_EXPRESSION_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_EXPRESSION_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_EXPRESSION_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Additive Expression Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_EXPRESSION_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.MultiplicativeExpressionNodeImpl <em>Multiplicative Expression Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.MultiplicativeExpressionNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getMultiplicativeExpressionNode()
	 * @generated
	 */
	int MULTIPLICATIVE_EXPRESSION_NODE = 35;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_EXPRESSION_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_EXPRESSION_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_EXPRESSION_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_EXPRESSION_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Multiplicative Expression Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_EXPRESSION_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.UnaryExpressionNodeImpl <em>Unary Expression Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.UnaryExpressionNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getUnaryExpressionNode()
	 * @generated
	 */
	int UNARY_EXPRESSION_NODE = 36;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Unary Expression Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.InfixExpressionNodeImpl <em>Infix Expression Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.InfixExpressionNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getInfixExpressionNode()
	 * @generated
	 */
	int INFIX_EXPRESSION_NODE = 37;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXPRESSION_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXPRESSION_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXPRESSION_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXPRESSION_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXPRESSION_NODE__CALLS = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXPRESSION_NODE__TARGET = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Infix Expression Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXPRESSION_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.StringLiteralNodeImpl <em>String Literal Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.StringLiteralNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getStringLiteralNode()
	 * @generated
	 */
	int STRING_LITERAL_NODE = 38;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>String Literal Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ParanthesizedExpressionNodeImpl <em>Paranthesized Expression Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ParanthesizedExpressionNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getParanthesizedExpressionNode()
	 * @generated
	 */
	int PARANTHESIZED_EXPRESSION_NODE = 39;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARANTHESIZED_EXPRESSION_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARANTHESIZED_EXPRESSION_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARANTHESIZED_EXPRESSION_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARANTHESIZED_EXPRESSION_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Paranthesized Expression Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARANTHESIZED_EXPRESSION_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.GlobalVarExpressionNodeImpl <em>Global Var Expression Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.GlobalVarExpressionNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getGlobalVarExpressionNode()
	 * @generated
	 */
	int GLOBAL_VAR_EXPRESSION_NODE = 40;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_EXPRESSION_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_EXPRESSION_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_EXPRESSION_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_EXPRESSION_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Global Var Expression Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_EXPRESSION_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.FeatureCallNodeImpl <em>Feature Call Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.FeatureCallNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getFeatureCallNode()
	 * @generated
	 */
	int FEATURE_CALL_NODE = 41;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Param List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_NODE__PARAM_LIST = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_NODE__NAME = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Call Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ListLiteralNodeImpl <em>List Literal Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ListLiteralNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getListLiteralNode()
	 * @generated
	 */
	int LIST_LITERAL_NODE = 42;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>List Literal Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_LITERAL_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ConstructorCallNodeImpl <em>Constructor Call Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ConstructorCallNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getConstructorCallNode()
	 * @generated
	 */
	int CONSTRUCTOR_CALL_NODE = 43;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_CALL_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_CALL_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_CALL_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_CALL_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Constructor Call Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_CALL_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.BooleanLiteralNodeImpl <em>Boolean Literal Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.BooleanLiteralNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getBooleanLiteralNode()
	 * @generated
	 */
	int BOOLEAN_LITERAL_NODE = 44;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Boolean Literal Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.NullLiteralNodeImpl <em>Null Literal Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.NullLiteralNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getNullLiteralNode()
	 * @generated
	 */
	int NULL_LITERAL_NODE = 45;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Null Literal Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.NumberLiteralNodeImpl <em>Number Literal Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.NumberLiteralNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getNumberLiteralNode()
	 * @generated
	 */
	int NUMBER_LITERAL_NODE = 46;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Number Literal Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.CollectionExpressionNodeImpl <em>Collection Expression Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.CollectionExpressionNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getCollectionExpressionNode()
	 * @generated
	 */
	int COLLECTION_EXPRESSION_NODE = 47;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Collection Expression Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.DeclaredParameterListNodeImpl <em>Declared Parameter List Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.DeclaredParameterListNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getDeclaredParameterListNode()
	 * @generated
	 */
	int DECLARED_PARAMETER_LIST_NODE = 48;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER_LIST_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER_LIST_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER_LIST_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER_LIST_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER_LIST_NODE__PARAMS = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Declared Parameter List Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER_LIST_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.DeclaredParameterNodeImpl <em>Declared Parameter Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.DeclaredParameterNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getDeclaredParameterNode()
	 * @generated
	 */
	int DECLARED_PARAMETER_NODE = 49;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Ptype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER_NODE__PTYPE = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER_NODE__NAME = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Declared Parameter Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_PARAMETER_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ParameterListNodeImpl <em>Parameter List Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ParameterListNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getParameterListNode()
	 * @generated
	 */
	int PARAMETER_LIST_NODE = 50;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_NODE__PARAMS = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter List Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.CollectionTypeNodeImpl <em>Collection Type Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.CollectionTypeNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getCollectionTypeNode()
	 * @generated
	 */
	int COLLECTION_TYPE_NODE = 51;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Collection Type Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.SimpleTypeNodeImpl <em>Simple Type Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.SimpleTypeNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getSimpleTypeNode()
	 * @generated
	 */
	int SIMPLE_TYPE_NODE = 52;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_NODE__NAMES = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Type Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.IdentifierNodeImpl <em>Identifier Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.IdentifierNodeImpl
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getIdentifierNode()
	 * @generated
	 */
	int IDENTIFIER_NODE = 53;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_NODE__ALIAS = NodePackage.COMPOSITE_NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_NODE__CHILDREN = NodePackage.COMPOSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_NODE__RULE = NodePackage.COMPOSITE_NODE__RULE;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_NODE__RULE_ID = NodePackage.COMPOSITE_NODE__RULE_ID;

	/**
	 * The number of structural features of the '<em>Identifier Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_NODE_FEATURE_COUNT = NodePackage.COMPOSITE_NODE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.FileNode <em>File Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.FileNode
	 * @generated
	 */
	EClass getFileNode();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.xpand3.internal.parser.xpand3node.FileNode#getDecl <em>Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Decl</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.FileNode#getDecl()
	 * @see #getFileNode()
	 * @generated
	 */
	EReference getFileNode_Decl();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.xpand3.internal.parser.xpand3node.FileNode#getImp <em>Imp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imp</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.FileNode#getImp()
	 * @see #getFileNode()
	 * @generated
	 */
	EReference getFileNode_Imp();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.NsImportNode <em>Ns Import Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ns Import Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.NsImportNode
	 * @generated
	 */
	EClass getNsImportNode();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand3.internal.parser.xpand3node.NsImportNode#getNs <em>Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ns</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.NsImportNode#getNs()
	 * @see #getNsImportNode()
	 * @generated
	 */
	EReference getNsImportNode_Ns();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.DefinitionNode <em>Definition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.DefinitionNode
	 * @generated
	 */
	EClass getDefinitionNode();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand3.internal.parser.xpand3node.DefinitionNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.DefinitionNode#getName()
	 * @see #getDefinitionNode()
	 * @generated
	 */
	EReference getDefinitionNode_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.DefinitionAroundNode <em>Definition Around Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Around Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.DefinitionAroundNode
	 * @generated
	 */
	EClass getDefinitionAroundNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.SequenceNode <em>Sequence Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.SequenceNode
	 * @generated
	 */
	EClass getSequenceNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.TextSequenceNode <em>Text Sequence Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Sequence Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.TextSequenceNode
	 * @generated
	 */
	EClass getTextSequenceNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.TextNode <em>Text Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.TextNode
	 * @generated
	 */
	EClass getTextNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ErrorStatementNode <em>Error Statement Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Statement Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ErrorStatementNode
	 * @generated
	 */
	EClass getErrorStatementNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExpandStatementNode <em>Expand Statement Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expand Statement Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ExpandStatementNode
	 * @generated
	 */
	EClass getExpandStatementNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExpressionStmtNode <em>Expression Stmt Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Stmt Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ExpressionStmtNode
	 * @generated
	 */
	EClass getExpressionStmtNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.FileStatementNode <em>File Statement Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Statement Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.FileStatementNode
	 * @generated
	 */
	EClass getFileStatementNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ForeachStatementNode <em>Foreach Statement Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreach Statement Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ForeachStatementNode
	 * @generated
	 */
	EClass getForeachStatementNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.IfStatementNode <em>If Statement Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.IfStatementNode
	 * @generated
	 */
	EClass getIfStatementNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ElseIfStatementNode <em>Else If Statement Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else If Statement Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ElseIfStatementNode
	 * @generated
	 */
	EClass getElseIfStatementNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ElseStatementNode <em>Else Statement Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else Statement Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ElseStatementNode
	 * @generated
	 */
	EClass getElseStatementNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.LetStatementNode <em>Let Statement Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Let Statement Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.LetStatementNode
	 * @generated
	 */
	EClass getLetStatementNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ProtectStatementNode <em>Protect Statement Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protect Statement Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ProtectStatementNode
	 * @generated
	 */
	EClass getProtectStatementNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.CheckNode <em>Check Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.CheckNode
	 * @generated
	 */
	EClass getCheckNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.AroundNode <em>Around Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Around Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.AroundNode
	 * @generated
	 */
	EClass getAroundNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.PointcutNode <em>Pointcut Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointcut Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.PointcutNode
	 * @generated
	 */
	EClass getPointcutNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode <em>Extension Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode
	 * @generated
	 */
	EClass getExtensionNode();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getCreate <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Create</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getCreate()
	 * @see #getExtensionNode()
	 * @generated
	 */
	EReference getExtensionNode_Create();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getPrivate <em>Private</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Private</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getPrivate()
	 * @see #getExtensionNode()
	 * @generated
	 */
	EReference getExtensionNode_Private();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getParamList <em>Param List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Param List</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getParamList()
	 * @see #getExtensionNode()
	 * @generated
	 */
	EReference getExtensionNode_ParamList();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getExtendBody <em>Extend Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extend Body</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getExtendBody()
	 * @see #getExtensionNode()
	 * @generated
	 */
	EReference getExtensionNode_ExtendBody();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getCached <em>Cached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cached</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getCached()
	 * @see #getExtensionNode()
	 * @generated
	 */
	EReference getExtensionNode_Cached();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getJavaReturnType <em>Java Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Java Return Type</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getJavaReturnType()
	 * @see #getExtensionNode()
	 * @generated
	 */
	EReference getExtensionNode_JavaReturnType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getJavaName <em>Java Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Java Name</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getJavaName()
	 * @see #getExtensionNode()
	 * @generated
	 */
	EReference getExtensionNode_JavaName();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getReturnType()
	 * @see #getExtensionNode()
	 * @generated
	 */
	EReference getExtensionNode_ReturnType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ExtensionNode#getName()
	 * @see #getExtensionNode()
	 * @generated
	 */
	EReference getExtensionNode_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.JavaTypeNode <em>Java Type Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Type Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.JavaTypeNode
	 * @generated
	 */
	EClass getJavaTypeNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.Test_expressionNode <em>Test expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test expression Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.Test_expressionNode
	 * @generated
	 */
	EClass getTest_expressionNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ExpressionNode <em>Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ExpressionNode
	 * @generated
	 */
	EClass getExpressionNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.LetExpressionNode <em>Let Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Let Expression Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.LetExpressionNode
	 * @generated
	 */
	EClass getLetExpressionNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.CastedExpressionNode <em>Casted Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Casted Expression Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.CastedExpressionNode
	 * @generated
	 */
	EClass getCastedExpressionNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ChainExpressionNode <em>Chain Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain Expression Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ChainExpressionNode
	 * @generated
	 */
	EClass getChainExpressionNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.IfExpressionNode <em>If Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Expression Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.IfExpressionNode
	 * @generated
	 */
	EClass getIfExpressionNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.SwitchExpressionNode <em>Switch Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Expression Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.SwitchExpressionNode
	 * @generated
	 */
	EClass getSwitchExpressionNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.CasePartNode <em>Case Part Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Part Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.CasePartNode
	 * @generated
	 */
	EClass getCasePartNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.OrExpressionNode <em>Or Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Expression Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.OrExpressionNode
	 * @generated
	 */
	EClass getOrExpressionNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.AndExpressionNode <em>And Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Expression Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.AndExpressionNode
	 * @generated
	 */
	EClass getAndExpressionNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ImpliesExpressionNode <em>Implies Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implies Expression Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ImpliesExpressionNode
	 * @generated
	 */
	EClass getImpliesExpressionNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.RelationalExpressionNode <em>Relational Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Expression Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.RelationalExpressionNode
	 * @generated
	 */
	EClass getRelationalExpressionNode();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand3.internal.parser.xpand3node.RelationalExpressionNode#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operator</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.RelationalExpressionNode#getOperator()
	 * @see #getRelationalExpressionNode()
	 * @generated
	 */
	EReference getRelationalExpressionNode_Operator();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand3.internal.parser.xpand3node.RelationalExpressionNode#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Operand</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.RelationalExpressionNode#getRightOperand()
	 * @see #getRelationalExpressionNode()
	 * @generated
	 */
	EReference getRelationalExpressionNode_RightOperand();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand3.internal.parser.xpand3node.RelationalExpressionNode#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Operand</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.RelationalExpressionNode#getLeftOperand()
	 * @see #getRelationalExpressionNode()
	 * @generated
	 */
	EReference getRelationalExpressionNode_LeftOperand();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.AdditiveExpressionNode <em>Additive Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additive Expression Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.AdditiveExpressionNode
	 * @generated
	 */
	EClass getAdditiveExpressionNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.MultiplicativeExpressionNode <em>Multiplicative Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicative Expression Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.MultiplicativeExpressionNode
	 * @generated
	 */
	EClass getMultiplicativeExpressionNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.UnaryExpressionNode <em>Unary Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.UnaryExpressionNode
	 * @generated
	 */
	EClass getUnaryExpressionNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.InfixExpressionNode <em>Infix Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infix Expression Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.InfixExpressionNode
	 * @generated
	 */
	EClass getInfixExpressionNode();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.xpand3.internal.parser.xpand3node.InfixExpressionNode#getCalls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Calls</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.InfixExpressionNode#getCalls()
	 * @see #getInfixExpressionNode()
	 * @generated
	 */
	EReference getInfixExpressionNode_Calls();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand3.internal.parser.xpand3node.InfixExpressionNode#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.InfixExpressionNode#getTarget()
	 * @see #getInfixExpressionNode()
	 * @generated
	 */
	EReference getInfixExpressionNode_Target();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.StringLiteralNode <em>String Literal Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.StringLiteralNode
	 * @generated
	 */
	EClass getStringLiteralNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ParanthesizedExpressionNode <em>Paranthesized Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paranthesized Expression Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ParanthesizedExpressionNode
	 * @generated
	 */
	EClass getParanthesizedExpressionNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.GlobalVarExpressionNode <em>Global Var Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Var Expression Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.GlobalVarExpressionNode
	 * @generated
	 */
	EClass getGlobalVarExpressionNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.FeatureCallNode <em>Feature Call Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Call Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.FeatureCallNode
	 * @generated
	 */
	EClass getFeatureCallNode();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand3.internal.parser.xpand3node.FeatureCallNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.FeatureCallNode#getName()
	 * @see #getFeatureCallNode()
	 * @generated
	 */
	EReference getFeatureCallNode_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand3.internal.parser.xpand3node.FeatureCallNode#getParamList <em>Param List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Param List</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.FeatureCallNode#getParamList()
	 * @see #getFeatureCallNode()
	 * @generated
	 */
	EReference getFeatureCallNode_ParamList();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ListLiteralNode <em>List Literal Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Literal Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ListLiteralNode
	 * @generated
	 */
	EClass getListLiteralNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ConstructorCallNode <em>Constructor Call Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Call Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ConstructorCallNode
	 * @generated
	 */
	EClass getConstructorCallNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.BooleanLiteralNode <em>Boolean Literal Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.BooleanLiteralNode
	 * @generated
	 */
	EClass getBooleanLiteralNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.NullLiteralNode <em>Null Literal Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Literal Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.NullLiteralNode
	 * @generated
	 */
	EClass getNullLiteralNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.NumberLiteralNode <em>Number Literal Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Literal Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.NumberLiteralNode
	 * @generated
	 */
	EClass getNumberLiteralNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.CollectionExpressionNode <em>Collection Expression Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Expression Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.CollectionExpressionNode
	 * @generated
	 */
	EClass getCollectionExpressionNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterListNode <em>Declared Parameter List Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Parameter List Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterListNode
	 * @generated
	 */
	EClass getDeclaredParameterListNode();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterListNode#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Params</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterListNode#getParams()
	 * @see #getDeclaredParameterListNode()
	 * @generated
	 */
	EReference getDeclaredParameterListNode_Params();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterNode <em>Declared Parameter Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Parameter Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterNode
	 * @generated
	 */
	EClass getDeclaredParameterNode();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterNode#getName()
	 * @see #getDeclaredParameterNode()
	 * @generated
	 */
	EReference getDeclaredParameterNode_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterNode#getPtype <em>Ptype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ptype</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.DeclaredParameterNode#getPtype()
	 * @see #getDeclaredParameterNode()
	 * @generated
	 */
	EReference getDeclaredParameterNode_Ptype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.ParameterListNode <em>Parameter List Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter List Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ParameterListNode
	 * @generated
	 */
	EClass getParameterListNode();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.xpand3.internal.parser.xpand3node.ParameterListNode#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Params</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.ParameterListNode#getParams()
	 * @see #getParameterListNode()
	 * @generated
	 */
	EReference getParameterListNode_Params();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.CollectionTypeNode <em>Collection Type Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Type Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.CollectionTypeNode
	 * @generated
	 */
	EClass getCollectionTypeNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.SimpleTypeNode <em>Simple Type Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Type Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.SimpleTypeNode
	 * @generated
	 */
	EClass getSimpleTypeNode();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.xpand3.internal.parser.xpand3node.SimpleTypeNode#getNames <em>Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Names</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.SimpleTypeNode#getNames()
	 * @see #getSimpleTypeNode()
	 * @generated
	 */
	EReference getSimpleTypeNode_Names();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.internal.parser.xpand3node.IdentifierNode <em>Identifier Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier Node</em>'.
	 * @see org.eclipse.xpand3.internal.parser.xpand3node.IdentifierNode
	 * @generated
	 */
	EClass getIdentifierNode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Xpand3nodeFactory getXpand3nodeFactory();

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
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.FileNodeImpl <em>File Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.FileNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getFileNode()
		 * @generated
		 */
		EClass FILE_NODE = eINSTANCE.getFileNode();

		/**
		 * The meta object literal for the '<em><b>Decl</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_NODE__DECL = eINSTANCE.getFileNode_Decl();

		/**
		 * The meta object literal for the '<em><b>Imp</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_NODE__IMP = eINSTANCE.getFileNode_Imp();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.NsImportNodeImpl <em>Ns Import Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.NsImportNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getNsImportNode()
		 * @generated
		 */
		EClass NS_IMPORT_NODE = eINSTANCE.getNsImportNode();

		/**
		 * The meta object literal for the '<em><b>Ns</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NS_IMPORT_NODE__NS = eINSTANCE.getNsImportNode_Ns();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.DefinitionNodeImpl <em>Definition Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.DefinitionNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getDefinitionNode()
		 * @generated
		 */
		EClass DEFINITION_NODE = eINSTANCE.getDefinitionNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_NODE__NAME = eINSTANCE.getDefinitionNode_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.DefinitionAroundNodeImpl <em>Definition Around Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.DefinitionAroundNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getDefinitionAroundNode()
		 * @generated
		 */
		EClass DEFINITION_AROUND_NODE = eINSTANCE.getDefinitionAroundNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.SequenceNodeImpl <em>Sequence Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.SequenceNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getSequenceNode()
		 * @generated
		 */
		EClass SEQUENCE_NODE = eINSTANCE.getSequenceNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.TextSequenceNodeImpl <em>Text Sequence Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.TextSequenceNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getTextSequenceNode()
		 * @generated
		 */
		EClass TEXT_SEQUENCE_NODE = eINSTANCE.getTextSequenceNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.TextNodeImpl <em>Text Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.TextNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getTextNode()
		 * @generated
		 */
		EClass TEXT_NODE = eINSTANCE.getTextNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ErrorStatementNodeImpl <em>Error Statement Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ErrorStatementNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getErrorStatementNode()
		 * @generated
		 */
		EClass ERROR_STATEMENT_NODE = eINSTANCE.getErrorStatementNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ExpandStatementNodeImpl <em>Expand Statement Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ExpandStatementNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getExpandStatementNode()
		 * @generated
		 */
		EClass EXPAND_STATEMENT_NODE = eINSTANCE.getExpandStatementNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ExpressionStmtNodeImpl <em>Expression Stmt Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ExpressionStmtNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getExpressionStmtNode()
		 * @generated
		 */
		EClass EXPRESSION_STMT_NODE = eINSTANCE.getExpressionStmtNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.FileStatementNodeImpl <em>File Statement Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.FileStatementNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getFileStatementNode()
		 * @generated
		 */
		EClass FILE_STATEMENT_NODE = eINSTANCE.getFileStatementNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ForeachStatementNodeImpl <em>Foreach Statement Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ForeachStatementNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getForeachStatementNode()
		 * @generated
		 */
		EClass FOREACH_STATEMENT_NODE = eINSTANCE.getForeachStatementNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.IfStatementNodeImpl <em>If Statement Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.IfStatementNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getIfStatementNode()
		 * @generated
		 */
		EClass IF_STATEMENT_NODE = eINSTANCE.getIfStatementNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ElseIfStatementNodeImpl <em>Else If Statement Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ElseIfStatementNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getElseIfStatementNode()
		 * @generated
		 */
		EClass ELSE_IF_STATEMENT_NODE = eINSTANCE.getElseIfStatementNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ElseStatementNodeImpl <em>Else Statement Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ElseStatementNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getElseStatementNode()
		 * @generated
		 */
		EClass ELSE_STATEMENT_NODE = eINSTANCE.getElseStatementNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.LetStatementNodeImpl <em>Let Statement Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.LetStatementNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getLetStatementNode()
		 * @generated
		 */
		EClass LET_STATEMENT_NODE = eINSTANCE.getLetStatementNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ProtectStatementNodeImpl <em>Protect Statement Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ProtectStatementNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getProtectStatementNode()
		 * @generated
		 */
		EClass PROTECT_STATEMENT_NODE = eINSTANCE.getProtectStatementNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.CheckNodeImpl <em>Check Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.CheckNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getCheckNode()
		 * @generated
		 */
		EClass CHECK_NODE = eINSTANCE.getCheckNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.AroundNodeImpl <em>Around Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.AroundNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getAroundNode()
		 * @generated
		 */
		EClass AROUND_NODE = eINSTANCE.getAroundNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.PointcutNodeImpl <em>Pointcut Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.PointcutNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getPointcutNode()
		 * @generated
		 */
		EClass POINTCUT_NODE = eINSTANCE.getPointcutNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ExtensionNodeImpl <em>Extension Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ExtensionNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getExtensionNode()
		 * @generated
		 */
		EClass EXTENSION_NODE = eINSTANCE.getExtensionNode();

		/**
		 * The meta object literal for the '<em><b>Create</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_NODE__CREATE = eINSTANCE.getExtensionNode_Create();

		/**
		 * The meta object literal for the '<em><b>Private</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_NODE__PRIVATE = eINSTANCE.getExtensionNode_Private();

		/**
		 * The meta object literal for the '<em><b>Param List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_NODE__PARAM_LIST = eINSTANCE.getExtensionNode_ParamList();

		/**
		 * The meta object literal for the '<em><b>Extend Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_NODE__EXTEND_BODY = eINSTANCE.getExtensionNode_ExtendBody();

		/**
		 * The meta object literal for the '<em><b>Cached</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_NODE__CACHED = eINSTANCE.getExtensionNode_Cached();

		/**
		 * The meta object literal for the '<em><b>Java Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_NODE__JAVA_RETURN_TYPE = eINSTANCE.getExtensionNode_JavaReturnType();

		/**
		 * The meta object literal for the '<em><b>Java Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_NODE__JAVA_NAME = eINSTANCE.getExtensionNode_JavaName();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_NODE__RETURN_TYPE = eINSTANCE.getExtensionNode_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_NODE__NAME = eINSTANCE.getExtensionNode_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.JavaTypeNodeImpl <em>Java Type Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.JavaTypeNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getJavaTypeNode()
		 * @generated
		 */
		EClass JAVA_TYPE_NODE = eINSTANCE.getJavaTypeNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.Test_expressionNodeImpl <em>Test expression Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Test_expressionNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getTest_expressionNode()
		 * @generated
		 */
		EClass TEST_EXPRESSION_NODE = eINSTANCE.getTest_expressionNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ExpressionNodeImpl <em>Expression Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ExpressionNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getExpressionNode()
		 * @generated
		 */
		EClass EXPRESSION_NODE = eINSTANCE.getExpressionNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.LetExpressionNodeImpl <em>Let Expression Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.LetExpressionNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getLetExpressionNode()
		 * @generated
		 */
		EClass LET_EXPRESSION_NODE = eINSTANCE.getLetExpressionNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.CastedExpressionNodeImpl <em>Casted Expression Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.CastedExpressionNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getCastedExpressionNode()
		 * @generated
		 */
		EClass CASTED_EXPRESSION_NODE = eINSTANCE.getCastedExpressionNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ChainExpressionNodeImpl <em>Chain Expression Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ChainExpressionNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getChainExpressionNode()
		 * @generated
		 */
		EClass CHAIN_EXPRESSION_NODE = eINSTANCE.getChainExpressionNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.IfExpressionNodeImpl <em>If Expression Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.IfExpressionNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getIfExpressionNode()
		 * @generated
		 */
		EClass IF_EXPRESSION_NODE = eINSTANCE.getIfExpressionNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.SwitchExpressionNodeImpl <em>Switch Expression Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.SwitchExpressionNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getSwitchExpressionNode()
		 * @generated
		 */
		EClass SWITCH_EXPRESSION_NODE = eINSTANCE.getSwitchExpressionNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.CasePartNodeImpl <em>Case Part Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.CasePartNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getCasePartNode()
		 * @generated
		 */
		EClass CASE_PART_NODE = eINSTANCE.getCasePartNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.OrExpressionNodeImpl <em>Or Expression Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.OrExpressionNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getOrExpressionNode()
		 * @generated
		 */
		EClass OR_EXPRESSION_NODE = eINSTANCE.getOrExpressionNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.AndExpressionNodeImpl <em>And Expression Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.AndExpressionNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getAndExpressionNode()
		 * @generated
		 */
		EClass AND_EXPRESSION_NODE = eINSTANCE.getAndExpressionNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ImpliesExpressionNodeImpl <em>Implies Expression Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ImpliesExpressionNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getImpliesExpressionNode()
		 * @generated
		 */
		EClass IMPLIES_EXPRESSION_NODE = eINSTANCE.getImpliesExpressionNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.RelationalExpressionNodeImpl <em>Relational Expression Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.RelationalExpressionNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getRelationalExpressionNode()
		 * @generated
		 */
		EClass RELATIONAL_EXPRESSION_NODE = eINSTANCE.getRelationalExpressionNode();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPRESSION_NODE__OPERATOR = eINSTANCE.getRelationalExpressionNode_Operator();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPRESSION_NODE__RIGHT_OPERAND = eINSTANCE.getRelationalExpressionNode_RightOperand();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPRESSION_NODE__LEFT_OPERAND = eINSTANCE.getRelationalExpressionNode_LeftOperand();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.AdditiveExpressionNodeImpl <em>Additive Expression Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.AdditiveExpressionNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getAdditiveExpressionNode()
		 * @generated
		 */
		EClass ADDITIVE_EXPRESSION_NODE = eINSTANCE.getAdditiveExpressionNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.MultiplicativeExpressionNodeImpl <em>Multiplicative Expression Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.MultiplicativeExpressionNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getMultiplicativeExpressionNode()
		 * @generated
		 */
		EClass MULTIPLICATIVE_EXPRESSION_NODE = eINSTANCE.getMultiplicativeExpressionNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.UnaryExpressionNodeImpl <em>Unary Expression Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.UnaryExpressionNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getUnaryExpressionNode()
		 * @generated
		 */
		EClass UNARY_EXPRESSION_NODE = eINSTANCE.getUnaryExpressionNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.InfixExpressionNodeImpl <em>Infix Expression Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.InfixExpressionNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getInfixExpressionNode()
		 * @generated
		 */
		EClass INFIX_EXPRESSION_NODE = eINSTANCE.getInfixExpressionNode();

		/**
		 * The meta object literal for the '<em><b>Calls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFIX_EXPRESSION_NODE__CALLS = eINSTANCE.getInfixExpressionNode_Calls();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFIX_EXPRESSION_NODE__TARGET = eINSTANCE.getInfixExpressionNode_Target();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.StringLiteralNodeImpl <em>String Literal Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.StringLiteralNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getStringLiteralNode()
		 * @generated
		 */
		EClass STRING_LITERAL_NODE = eINSTANCE.getStringLiteralNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ParanthesizedExpressionNodeImpl <em>Paranthesized Expression Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ParanthesizedExpressionNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getParanthesizedExpressionNode()
		 * @generated
		 */
		EClass PARANTHESIZED_EXPRESSION_NODE = eINSTANCE.getParanthesizedExpressionNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.GlobalVarExpressionNodeImpl <em>Global Var Expression Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.GlobalVarExpressionNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getGlobalVarExpressionNode()
		 * @generated
		 */
		EClass GLOBAL_VAR_EXPRESSION_NODE = eINSTANCE.getGlobalVarExpressionNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.FeatureCallNodeImpl <em>Feature Call Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.FeatureCallNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getFeatureCallNode()
		 * @generated
		 */
		EClass FEATURE_CALL_NODE = eINSTANCE.getFeatureCallNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_CALL_NODE__NAME = eINSTANCE.getFeatureCallNode_Name();

		/**
		 * The meta object literal for the '<em><b>Param List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_CALL_NODE__PARAM_LIST = eINSTANCE.getFeatureCallNode_ParamList();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ListLiteralNodeImpl <em>List Literal Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ListLiteralNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getListLiteralNode()
		 * @generated
		 */
		EClass LIST_LITERAL_NODE = eINSTANCE.getListLiteralNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ConstructorCallNodeImpl <em>Constructor Call Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ConstructorCallNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getConstructorCallNode()
		 * @generated
		 */
		EClass CONSTRUCTOR_CALL_NODE = eINSTANCE.getConstructorCallNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.BooleanLiteralNodeImpl <em>Boolean Literal Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.BooleanLiteralNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getBooleanLiteralNode()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL_NODE = eINSTANCE.getBooleanLiteralNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.NullLiteralNodeImpl <em>Null Literal Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.NullLiteralNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getNullLiteralNode()
		 * @generated
		 */
		EClass NULL_LITERAL_NODE = eINSTANCE.getNullLiteralNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.NumberLiteralNodeImpl <em>Number Literal Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.NumberLiteralNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getNumberLiteralNode()
		 * @generated
		 */
		EClass NUMBER_LITERAL_NODE = eINSTANCE.getNumberLiteralNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.CollectionExpressionNodeImpl <em>Collection Expression Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.CollectionExpressionNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getCollectionExpressionNode()
		 * @generated
		 */
		EClass COLLECTION_EXPRESSION_NODE = eINSTANCE.getCollectionExpressionNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.DeclaredParameterListNodeImpl <em>Declared Parameter List Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.DeclaredParameterListNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getDeclaredParameterListNode()
		 * @generated
		 */
		EClass DECLARED_PARAMETER_LIST_NODE = eINSTANCE.getDeclaredParameterListNode();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_PARAMETER_LIST_NODE__PARAMS = eINSTANCE.getDeclaredParameterListNode_Params();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.DeclaredParameterNodeImpl <em>Declared Parameter Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.DeclaredParameterNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getDeclaredParameterNode()
		 * @generated
		 */
		EClass DECLARED_PARAMETER_NODE = eINSTANCE.getDeclaredParameterNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_PARAMETER_NODE__NAME = eINSTANCE.getDeclaredParameterNode_Name();

		/**
		 * The meta object literal for the '<em><b>Ptype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_PARAMETER_NODE__PTYPE = eINSTANCE.getDeclaredParameterNode_Ptype();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.ParameterListNodeImpl <em>Parameter List Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.ParameterListNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getParameterListNode()
		 * @generated
		 */
		EClass PARAMETER_LIST_NODE = eINSTANCE.getParameterListNode();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_LIST_NODE__PARAMS = eINSTANCE.getParameterListNode_Params();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.CollectionTypeNodeImpl <em>Collection Type Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.CollectionTypeNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getCollectionTypeNode()
		 * @generated
		 */
		EClass COLLECTION_TYPE_NODE = eINSTANCE.getCollectionTypeNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.SimpleTypeNodeImpl <em>Simple Type Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.SimpleTypeNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getSimpleTypeNode()
		 * @generated
		 */
		EClass SIMPLE_TYPE_NODE = eINSTANCE.getSimpleTypeNode();

		/**
		 * The meta object literal for the '<em><b>Names</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_TYPE_NODE__NAMES = eINSTANCE.getSimpleTypeNode_Names();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.internal.parser.xpand3node.impl.IdentifierNodeImpl <em>Identifier Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.IdentifierNodeImpl
		 * @see org.eclipse.xpand3.internal.parser.xpand3node.impl.Xpand3nodePackageImpl#getIdentifierNode()
		 * @generated
		 */
		EClass IDENTIFIER_NODE = eINSTANCE.getIdentifierNode();

	}

} //Xpand3nodePackage
