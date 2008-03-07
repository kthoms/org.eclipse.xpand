/**
 * <copyright>
 * </copyright>
 *
 * $Id: Check.java,v 1.2 2008/03/07 11:10:53 jkohnlein Exp $
 */
package org.eclipse.xpand3.declaration;

import org.eclipse.xpand3.expression.AbstractExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.declaration.Check#isErrorSeverity <em>Error Severity</em>}</li>
 *   <li>{@link org.eclipse.xpand3.declaration.Check#getMsg <em>Msg</em>}</li>
 *   <li>{@link org.eclipse.xpand3.declaration.Check#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.eclipse.xpand3.declaration.Check#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getCheck()
 * @model
 * @generated
 */
public interface Check extends AbstractDeclaration {
	/**
	 * Returns the value of the '<em><b>Error Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Severity</em>' attribute.
	 * @see #setErrorSeverity(boolean)
	 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getCheck_ErrorSeverity()
	 * @model
	 * @generated
	 */
	boolean isErrorSeverity();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.declaration.Check#isErrorSeverity <em>Error Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Severity</em>' attribute.
	 * @see #isErrorSeverity()
	 * @generated
	 */
	void setErrorSeverity(boolean value);

	/**
	 * Returns the value of the '<em><b>Msg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg</em>' containment reference.
	 * @see #setMsg(AbstractExpression)
	 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getCheck_Msg()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getMsg();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.declaration.Check#getMsg <em>Msg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg</em>' containment reference.
	 * @see #getMsg()
	 * @generated
	 */
	void setMsg(AbstractExpression value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference.
	 * @see #setConstraint(AbstractExpression)
	 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getCheck_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	AbstractExpression getConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.declaration.Check#getConstraint <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' containment reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(AbstractExpression value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' attribute.
	 * @see #setFeature(String)
	 * @see org.eclipse.xpand3.declaration.DeclarationPackage#getCheck_Feature()
	 * @model
	 * @generated
	 */
	String getFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.declaration.Check#getFeature <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' attribute.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(String value);

} // Check
