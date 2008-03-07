/**
 * <copyright>
 * </copyright>
 *
 * $Id: File.java,v 1.2 2008/03/07 11:10:40 jkohnlein Exp $
 */
package org.eclipse.xpand3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xpand3.declaration.AbstractDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.File#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipse.xpand3.File#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.Xpand3Package#getFile()
 * @model
 * @generated
 */
public interface File extends SyntaxElement {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xpand3.ImportStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.eclipse.xpand3.Xpand3Package#getFile_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportStatement> getImports();

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xpand3.declaration.AbstractDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see org.eclipse.xpand3.Xpand3Package#getFile_Declarations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AbstractDeclaration> getDeclarations();

} // File
