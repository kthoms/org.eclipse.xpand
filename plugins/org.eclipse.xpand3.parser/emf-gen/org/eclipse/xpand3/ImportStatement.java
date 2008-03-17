/**
 * <copyright>
 * </copyright>
 *
 * $Id: ImportStatement.java,v 1.1 2008/03/17 14:39:13 jkohnlein Exp $
 */
package org.eclipse.xpand3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.ImportStatement#getImportedId <em>Imported Id</em>}</li>
 *   <li>{@link org.eclipse.xpand3.ImportStatement#isExported <em>Exported</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.Xpand3Package#getImportStatement()
 * @model
 * @generated
 */
public interface ImportStatement extends SyntaxElement {
	/**
	 * Returns the value of the '<em><b>Imported Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Id</em>' containment reference.
	 * @see #setImportedId(Identifier)
	 * @see org.eclipse.xpand3.Xpand3Package#getImportStatement_ImportedId()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getImportedId();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.ImportStatement#getImportedId <em>Imported Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Id</em>' containment reference.
	 * @see #getImportedId()
	 * @generated
	 */
	void setImportedId(Identifier value);

	/**
	 * Returns the value of the '<em><b>Exported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exported</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exported</em>' attribute.
	 * @see #setExported(boolean)
	 * @see org.eclipse.xpand3.Xpand3Package#getImportStatement_Exported()
	 * @model
	 * @generated
	 */
	boolean isExported();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.ImportStatement#isExported <em>Exported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exported</em>' attribute.
	 * @see #isExported()
	 * @generated
	 */
	void setExported(boolean value);

} // ImportStatement
