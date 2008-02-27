/**
 * <copyright>
 * </copyright>
 *
 * $Id: LexedToken.java,v 1.1 2008/02/27 13:21:09 sefftinge Exp $
 */
package org.eclipse.xpand3.node;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lexed Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.node.LexedToken#isHidden <em>Hidden</em>}</li>
 *   <li>{@link org.eclipse.xpand3.node.LexedToken#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.xpand3.node.LexedToken#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.xpand3.node.LexedToken#getLine <em>Line</em>}</li>
 *   <li>{@link org.eclipse.xpand3.node.LexedToken#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.xpand3.node.LexedToken#getTokenType <em>Token Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand3.node.NodePackage#getLexedToken()
 * @model
 * @generated
 */
public interface LexedToken extends EObject {
	/**
	 * Returns the value of the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hidden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden</em>' attribute.
	 * @see #setHidden(boolean)
	 * @see org.eclipse.xpand3.node.NodePackage#getLexedToken_Hidden()
	 * @model
	 * @generated
	 */
	boolean isHidden();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.node.LexedToken#isHidden <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hidden</em>' attribute.
	 * @see #isHidden()
	 * @generated
	 */
	void setHidden(boolean value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(int)
	 * @see org.eclipse.xpand3.node.NodePackage#getLexedToken_Start()
	 * @model
	 * @generated
	 */
	int getStart();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.node.LexedToken#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(int value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(int)
	 * @see org.eclipse.xpand3.node.NodePackage#getLexedToken_End()
	 * @model
	 * @generated
	 */
	int getEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.node.LexedToken#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(int value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(int)
	 * @see org.eclipse.xpand3.node.NodePackage#getLexedToken_Line()
	 * @model
	 * @generated
	 */
	int getLine();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.node.LexedToken#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(int value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.eclipse.xpand3.node.NodePackage#getLexedToken_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.node.LexedToken#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Token Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Type</em>' attribute.
	 * @see #setTokenType(String)
	 * @see org.eclipse.xpand3.node.NodePackage#getLexedToken_TokenType()
	 * @model
	 * @generated
	 */
	String getTokenType();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand3.node.LexedToken#getTokenType <em>Token Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Type</em>' attribute.
	 * @see #getTokenType()
	 * @generated
	 */
	void setTokenType(String value);

} // LexedToken
