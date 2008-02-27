/**
 * <copyright>
 * </copyright>
 *
 * $Id: Extension.java,v 1.1 2008/02/27 13:21:10 sefftinge Exp $
 */
package org.eclipse.xpand3.declaration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.declaration.Extension#isCached <em>Cached</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getExtension()
 * @model
 * @generated
 */
public interface Extension extends AbstractNamedDeclaration {
	/**
	 * Returns the value of the '<em><b>Cached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cached</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cached</em>' attribute.
	 * @see #setCached(boolean)
	 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getExtension_Cached()
	 * @model
	 * @generated
	 */
	boolean isCached();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.declaration.Extension#isCached <em>Cached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cached</em>' attribute.
	 * @see #isCached()
	 * @generated
	 */
	void setCached(boolean value);

} // Extension
