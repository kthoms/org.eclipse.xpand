/**
 * <copyright>
 * </copyright>
 *
 * $Id: TextStatementImpl.java,v 1.2 2008/03/07 11:10:35 jkohnlein Exp $
 */
package org.eclipse.xpand3.statement.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xpand3.statement.StatementPackage;
import org.eclipse.xpand3.statement.TextStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.statement.impl.TextStatementImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.impl.TextStatementImpl#isDeleteLine <em>Delete Line</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextStatementImpl extends AbstractStatementImpl implements TextStatement {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDeleteLine() <em>Delete Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeleteLine()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DELETE_LINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeleteLine() <em>Delete Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeleteLine()
	 * @generated
	 * @ordered
	 */
	protected boolean deleteLine = DELETE_LINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementPackage.Literals.TEXT_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.TEXT_STATEMENT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeleteLine() {
		return deleteLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteLine(boolean newDeleteLine) {
		boolean oldDeleteLine = deleteLine;
		deleteLine = newDeleteLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.TEXT_STATEMENT__DELETE_LINE, oldDeleteLine, deleteLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatementPackage.TEXT_STATEMENT__VALUE:
				return getValue();
			case StatementPackage.TEXT_STATEMENT__DELETE_LINE:
				return isDeleteLine() ? Boolean.TRUE : Boolean.FALSE;
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
			case StatementPackage.TEXT_STATEMENT__VALUE:
				setValue((String)newValue);
				return;
			case StatementPackage.TEXT_STATEMENT__DELETE_LINE:
				setDeleteLine(((Boolean)newValue).booleanValue());
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
			case StatementPackage.TEXT_STATEMENT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case StatementPackage.TEXT_STATEMENT__DELETE_LINE:
				setDeleteLine(DELETE_LINE_EDEFAULT);
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
			case StatementPackage.TEXT_STATEMENT__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case StatementPackage.TEXT_STATEMENT__DELETE_LINE:
				return deleteLine != DELETE_LINE_EDEFAULT;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", deleteLine: ");
		result.append(deleteLine);
		result.append(')');
		return result.toString();
	}

} //TextStatementImpl
