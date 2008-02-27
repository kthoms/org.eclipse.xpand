/**
 * <copyright>
 * </copyright>
 *
 * $Id: NodePackage.java,v 1.1 2008/02/27 13:21:09 sefftinge Exp $
 */
package org.eclipse.xpand3.node;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.xpand3.node.NodeFactory
 * @model kind="package"
 * @generated
 */
public interface NodePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "node";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/m2t/xpand/node";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "node";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NodePackage eINSTANCE = org.eclipse.xpand3.node.impl.NodePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.node.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.node.impl.NodeImpl
	 * @see org.eclipse.xpand3.node.impl.NodePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ALIAS = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.node.impl.CompositeNodeImpl <em>Composite Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.node.impl.CompositeNodeImpl
	 * @see org.eclipse.xpand3.node.impl.NodePackageImpl#getCompositeNode()
	 * @generated
	 */
	int COMPOSITE_NODE = 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE__ALIAS = NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE__CHILDREN = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE__RULE = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.node.impl.LeafNodeImpl <em>Leaf Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.node.impl.LeafNodeImpl
	 * @see org.eclipse.xpand3.node.impl.NodePackageImpl#getLeafNode()
	 * @generated
	 */
	int LEAF_NODE = 2;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE__ALIAS = NODE__ALIAS;

	/**
	 * The feature id for the '<em><b>Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE__TOKEN = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Leaf Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand3.node.impl.LexedTokenImpl <em>Lexed Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand3.node.impl.LexedTokenImpl
	 * @see org.eclipse.xpand3.node.impl.NodePackageImpl#getLexedToken()
	 * @generated
	 */
	int LEXED_TOKEN = 3;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXED_TOKEN__HIDDEN = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXED_TOKEN__START = 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXED_TOKEN__END = 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXED_TOKEN__LINE = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXED_TOKEN__TEXT = 4;

	/**
	 * The feature id for the '<em><b>Token Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXED_TOKEN__TOKEN_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Lexed Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEXED_TOKEN_FEATURE_COUNT = 6;


	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.node.CompositeNode <em>Composite Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Node</em>'.
	 * @see org.eclipse.xpand3.node.CompositeNode
	 * @generated
	 */
	EClass getCompositeNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand3.node.CompositeNode#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.xpand3.node.CompositeNode#getChildren()
	 * @see #getCompositeNode()
	 * @generated
	 */
	EReference getCompositeNode_Children();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand3.node.CompositeNode#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule</em>'.
	 * @see org.eclipse.xpand3.node.CompositeNode#getRule()
	 * @see #getCompositeNode()
	 * @generated
	 */
	EAttribute getCompositeNode_Rule();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.node.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.eclipse.xpand3.node.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand3.node.Node#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.eclipse.xpand3.node.Node#getAlias()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Alias();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.node.LeafNode <em>Leaf Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf Node</em>'.
	 * @see org.eclipse.xpand3.node.LeafNode
	 * @generated
	 */
	EClass getLeafNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpand3.node.LeafNode#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Token</em>'.
	 * @see org.eclipse.xpand3.node.LeafNode#getToken()
	 * @see #getLeafNode()
	 * @generated
	 */
	EReference getLeafNode_Token();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand3.node.LexedToken <em>Lexed Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lexed Token</em>'.
	 * @see org.eclipse.xpand3.node.LexedToken
	 * @generated
	 */
	EClass getLexedToken();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand3.node.LexedToken#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see org.eclipse.xpand3.node.LexedToken#isHidden()
	 * @see #getLexedToken()
	 * @generated
	 */
	EAttribute getLexedToken_Hidden();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand3.node.LexedToken#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.eclipse.xpand3.node.LexedToken#getStart()
	 * @see #getLexedToken()
	 * @generated
	 */
	EAttribute getLexedToken_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand3.node.LexedToken#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.eclipse.xpand3.node.LexedToken#getEnd()
	 * @see #getLexedToken()
	 * @generated
	 */
	EAttribute getLexedToken_End();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand3.node.LexedToken#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see org.eclipse.xpand3.node.LexedToken#getLine()
	 * @see #getLexedToken()
	 * @generated
	 */
	EAttribute getLexedToken_Line();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand3.node.LexedToken#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.xpand3.node.LexedToken#getText()
	 * @see #getLexedToken()
	 * @generated
	 */
	EAttribute getLexedToken_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand3.node.LexedToken#getTokenType <em>Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Type</em>'.
	 * @see org.eclipse.xpand3.node.LexedToken#getTokenType()
	 * @see #getLexedToken()
	 * @generated
	 */
	EAttribute getLexedToken_TokenType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NodeFactory getNodeFactory();

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
		 * The meta object literal for the '{@link org.eclipse.xpand3.node.impl.CompositeNodeImpl <em>Composite Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.node.impl.CompositeNodeImpl
		 * @see org.eclipse.xpand3.node.impl.NodePackageImpl#getCompositeNode()
		 * @generated
		 */
		EClass COMPOSITE_NODE = eINSTANCE.getCompositeNode();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_NODE__CHILDREN = eINSTANCE.getCompositeNode_Children();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_NODE__RULE = eINSTANCE.getCompositeNode_Rule();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.node.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.node.impl.NodeImpl
		 * @see org.eclipse.xpand3.node.impl.NodePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ALIAS = eINSTANCE.getNode_Alias();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.node.impl.LeafNodeImpl <em>Leaf Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.node.impl.LeafNodeImpl
		 * @see org.eclipse.xpand3.node.impl.NodePackageImpl#getLeafNode()
		 * @generated
		 */
		EClass LEAF_NODE = eINSTANCE.getLeafNode();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF_NODE__TOKEN = eINSTANCE.getLeafNode_Token();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand3.node.impl.LexedTokenImpl <em>Lexed Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand3.node.impl.LexedTokenImpl
		 * @see org.eclipse.xpand3.node.impl.NodePackageImpl#getLexedToken()
		 * @generated
		 */
		EClass LEXED_TOKEN = eINSTANCE.getLexedToken();

		/**
		 * The meta object literal for the '<em><b>Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEXED_TOKEN__HIDDEN = eINSTANCE.getLexedToken_Hidden();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEXED_TOKEN__START = eINSTANCE.getLexedToken_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEXED_TOKEN__END = eINSTANCE.getLexedToken_End();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEXED_TOKEN__LINE = eINSTANCE.getLexedToken_Line();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEXED_TOKEN__TEXT = eINSTANCE.getLexedToken_Text();

		/**
		 * The meta object literal for the '<em><b>Token Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEXED_TOKEN__TOKEN_TYPE = eINSTANCE.getLexedToken_TokenType();

	}

} //NodePackage
