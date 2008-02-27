/**
 * <copyright>
 * </copyright>
 *
 * $Id: StatementFactory.java,v 1.1 2008/02/27 13:21:09 sefftinge Exp $
 */
package org.eclipse.xpand3.statement;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xpand3.statement.StatementPackage
 * @generated
 */
public interface StatementFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatementFactory eINSTANCE = org.eclipse.xpand3.statement.impl.StatementFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Expand Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expand Statement</em>'.
	 * @generated
	 */
	ExpandStatement createExpandStatement();

	/**
	 * Returns a new object of class '<em>Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Statement</em>'.
	 * @generated
	 */
	ExpressionStatement createExpressionStatement();

	/**
	 * Returns a new object of class '<em>Error Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Statement</em>'.
	 * @generated
	 */
	ErrorStatement createErrorStatement();

	/**
	 * Returns a new object of class '<em>File Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Statement</em>'.
	 * @generated
	 */
	FileStatement createFileStatement();

	/**
	 * Returns a new object of class '<em>For Each Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For Each Statement</em>'.
	 * @generated
	 */
	ForEachStatement createForEachStatement();

	/**
	 * Returns a new object of class '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Statement</em>'.
	 * @generated
	 */
	IfStatement createIfStatement();

	/**
	 * Returns a new object of class '<em>Let Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Let Statement</em>'.
	 * @generated
	 */
	LetStatement createLetStatement();

	/**
	 * Returns a new object of class '<em>Protect Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protect Statement</em>'.
	 * @generated
	 */
	ProtectStatement createProtectStatement();

	/**
	 * Returns a new object of class '<em>Text Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Statement</em>'.
	 * @generated
	 */
	TextStatement createTextStatement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StatementPackage getStatementPackage();

} //StatementFactory
