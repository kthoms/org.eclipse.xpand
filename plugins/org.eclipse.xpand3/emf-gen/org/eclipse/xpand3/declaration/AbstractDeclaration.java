/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractDeclaration.java,v 1.2 2008/03/07 11:10:53 jkohnlein Exp $
 */
package org.eclipse.xpand3.declaration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xpand3.DeclaredParameter;
import org.eclipse.xpand3.File;
import org.eclipse.xpand3.SyntaxElement;

import org.eclipse.xpand3.expression.AbstractExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.declaration.AbstractDeclaration#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.xpand3.declaration.AbstractDeclaration#getParams <em>Params</em>}</li>
 *   <li>{@link org.eclipse.xpand3.declaration.AbstractDeclaration#isIsPrivate <em>Is Private</em>}</li>
 *   <li>{@link org.eclipse.xpand3.declaration.AbstractDeclaration#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getAbstractDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface AbstractDeclaration extends SyntaxElement {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' containment reference.
	 * @see #setOwner(File)
	 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getAbstractDeclaration_Owner()
	 * @model containment="true" required="true"
	 * @generated
	 */
	File getOwner();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.declaration.AbstractDeclaration#getOwner <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' containment reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(File value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xpand3.DeclaredParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getAbstractDeclaration_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeclaredParameter> getParams();

	/**
	 * Returns the value of the '<em><b>Is Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Private</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Private</em>' attribute.
	 * @see #setIsPrivate(boolean)
	 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getAbstractDeclaration_IsPrivate()
	 * @model
	 * @generated
	 */
	boolean isIsPrivate();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.declaration.AbstractDeclaration#isIsPrivate <em>Is Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Private</em>' attribute.
	 * @see #isIsPrivate()
	 * @generated
	 */
	void setIsPrivate(boolean value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(AbstractExpression)
	 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getAbstractDeclaration_Guard()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getGuard();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.declaration.AbstractDeclaration#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(AbstractExpression value);

} // AbstractDeclaration
