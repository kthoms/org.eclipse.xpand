/**
 * <copyright>
 * </copyright>
 *
 * $Id: NodeFactory.java,v 1.1 2008/02/27 13:21:09 sefftinge Exp $
 */
package org.eclipse.xpand3.node;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xpand3.node.NodePackage
 * @generated
 */
public interface NodeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NodeFactory eINSTANCE = org.eclipse.xpand3.node.impl.NodeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Composite Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Node</em>'.
	 * @generated
	 */
	CompositeNode createCompositeNode();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Leaf Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leaf Node</em>'.
	 * @generated
	 */
	LeafNode createLeafNode();

	/**
	 * Returns a new object of class '<em>Lexed Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lexed Token</em>'.
	 * @generated
	 */
	LexedToken createLexedToken();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NodePackage getNodePackage();

} //NodeFactory
