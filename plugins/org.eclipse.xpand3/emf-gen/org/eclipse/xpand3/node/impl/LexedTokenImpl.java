/**
 * <copyright>
 * </copyright>
 *
 * $Id: LexedTokenImpl.java,v 1.1 2008/02/27 13:21:10 sefftinge Exp $
 */
package org.eclipse.xpand3.node.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.xpand3.node.LexedToken;
import org.eclipse.xpand3.node.NodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lexed Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.node.impl.LexedTokenImpl#isHidden <em>Hidden</em>}</li>
 *   <li>{@link org.eclipse.xpand3.node.impl.LexedTokenImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.xpand3.node.impl.LexedTokenImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.xpand3.node.impl.LexedTokenImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.eclipse.xpand3.node.impl.LexedTokenImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.xpand3.node.impl.LexedTokenImpl#getTokenType <em>Token Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LexedTokenImpl extends EObjectImpl implements LexedToken {
	/**
	 * The default value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHidden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDDEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHidden()
	 * @generated
	 * @ordered
	 */
	protected boolean hidden = HIDDEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final int START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected int start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final int END_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected int end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected int line = LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTokenType() <em>Token Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenType()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTokenType() <em>Token Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenType()
	 * @generated
	 * @ordered
	 */
	protected String tokenType = TOKEN_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LexedTokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NodePackage.Literals.LEXED_TOKEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHidden() {
		return hidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHidden(boolean newHidden) {
		boolean oldHidden = hidden;
		hidden = newHidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodePackage.LEXED_TOKEN__HIDDEN, oldHidden, hidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(int newStart) {
		int oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodePackage.LEXED_TOKEN__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(int newEnd) {
		int oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodePackage.LEXED_TOKEN__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(int newLine) {
		int oldLine = line;
		line = newLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodePackage.LEXED_TOKEN__LINE, oldLine, line));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodePackage.LEXED_TOKEN__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTokenType() {
		return tokenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenType(String newTokenType) {
		String oldTokenType = tokenType;
		tokenType = newTokenType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodePackage.LEXED_TOKEN__TOKEN_TYPE, oldTokenType, tokenType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NodePackage.LEXED_TOKEN__HIDDEN:
				return isHidden() ? Boolean.TRUE : Boolean.FALSE;
			case NodePackage.LEXED_TOKEN__START:
				return new Integer(getStart());
			case NodePackage.LEXED_TOKEN__END:
				return new Integer(getEnd());
			case NodePackage.LEXED_TOKEN__LINE:
				return new Integer(getLine());
			case NodePackage.LEXED_TOKEN__TEXT:
				return getText();
			case NodePackage.LEXED_TOKEN__TOKEN_TYPE:
				return getTokenType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NodePackage.LEXED_TOKEN__HIDDEN:
				setHidden(((Boolean)newValue).booleanValue());
				return;
			case NodePackage.LEXED_TOKEN__START:
				setStart(((Integer)newValue).intValue());
				return;
			case NodePackage.LEXED_TOKEN__END:
				setEnd(((Integer)newValue).intValue());
				return;
			case NodePackage.LEXED_TOKEN__LINE:
				setLine(((Integer)newValue).intValue());
				return;
			case NodePackage.LEXED_TOKEN__TEXT:
				setText((String)newValue);
				return;
			case NodePackage.LEXED_TOKEN__TOKEN_TYPE:
				setTokenType((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NodePackage.LEXED_TOKEN__HIDDEN:
				setHidden(HIDDEN_EDEFAULT);
				return;
			case NodePackage.LEXED_TOKEN__START:
				setStart(START_EDEFAULT);
				return;
			case NodePackage.LEXED_TOKEN__END:
				setEnd(END_EDEFAULT);
				return;
			case NodePackage.LEXED_TOKEN__LINE:
				setLine(LINE_EDEFAULT);
				return;
			case NodePackage.LEXED_TOKEN__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case NodePackage.LEXED_TOKEN__TOKEN_TYPE:
				setTokenType(TOKEN_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NodePackage.LEXED_TOKEN__HIDDEN:
				return hidden != HIDDEN_EDEFAULT;
			case NodePackage.LEXED_TOKEN__START:
				return start != START_EDEFAULT;
			case NodePackage.LEXED_TOKEN__END:
				return end != END_EDEFAULT;
			case NodePackage.LEXED_TOKEN__LINE:
				return line != LINE_EDEFAULT;
			case NodePackage.LEXED_TOKEN__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case NodePackage.LEXED_TOKEN__TOKEN_TYPE:
				return TOKEN_TYPE_EDEFAULT == null ? tokenType != null : !TOKEN_TYPE_EDEFAULT.equals(tokenType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (hidden: ");
		result.append(hidden);
		result.append(", start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(", line: ");
		result.append(line);
		result.append(", text: ");
		result.append(text);
		result.append(", tokenType: ");
		result.append(tokenType);
		result.append(')');
		return result.toString();
	}

} //LexedTokenImpl
