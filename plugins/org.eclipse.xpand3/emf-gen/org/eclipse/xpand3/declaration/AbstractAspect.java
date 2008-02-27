/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractAspect.java,v 1.1 2008/02/27 13:21:10 sefftinge Exp $
 */
package org.eclipse.xpand3.declaration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xpand3.DeclaredParameter;
import org.eclipse.xpand3.Identifier;
import org.eclipse.xpand3.SyntaxElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.declaration.AbstractAspect#getPointcut <em>Pointcut</em>}</li>
 *   <li>{@link org.eclipse.xpand3.declaration.AbstractAspect#getParams <em>Params</em>}</li>
 *   <li>{@link org.eclipse.xpand3.declaration.AbstractAspect#isWildparams <em>Wildparams</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getAbstractAspect()
 * @model abstract="true"
 * @generated
 */
public interface AbstractAspect extends SyntaxElement {
	/**
	 * Returns the value of the '<em><b>Pointcut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointcut</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointcut</em>' containment reference.
	 * @see #setPointcut(Identifier)
	 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getAbstractAspect_Pointcut()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getPointcut();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.declaration.AbstractAspect#getPointcut <em>Pointcut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointcut</em>' containment reference.
	 * @see #getPointcut()
	 * @generated
	 */
	void setPointcut(Identifier value);

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
	 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getAbstractAspect_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeclaredParameter> getParams();

	/**
	 * Returns the value of the '<em><b>Wildparams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wildparams</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wildparams</em>' attribute.
	 * @see #setWildparams(boolean)
	 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getAbstractAspect_Wildparams()
	 * @model
	 * @generated
	 */
	boolean isWildparams();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.declaration.AbstractAspect#isWildparams <em>Wildparams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wildparams</em>' attribute.
	 * @see #isWildparams()
	 * @generated
	 */
	void setWildparams(boolean value);

} // AbstractAspect
