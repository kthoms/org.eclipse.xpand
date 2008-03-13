/**
 * <copyright>
 * </copyright>
 *
 * $Id: FileStatementImpl.java,v 1.4 2008/03/13 11:41:50 sefftinge Exp $
 */
package org.eclipse.xpand3.statement.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xpand3.Identifier;

import org.eclipse.xpand3.expression.AbstractExpression;

import org.eclipse.xpand3.statement.FileStatement;
import org.eclipse.xpand3.statement.StatementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.statement.impl.FileStatementImpl#getFileNameExpression <em>File Name Expression</em>}</li>
 *   <li>{@link org.eclipse.xpand3.statement.impl.FileStatementImpl#getOutletNameIdentifier <em>Outlet Name Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileStatementImpl extends AbstractStatementWithBodyImpl implements FileStatement {
	/**
	 * The cached value of the '{@link #getFileNameExpression() <em>File Name Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileNameExpression()
	 * @generated
	 * @ordered
	 */
	protected AbstractExpression fileNameExpression;

	/**
	 * The cached value of the '{@link #getOutletNameIdentifier() <em>Outlet Name Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutletNameIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier outletNameIdentifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementPackage.Literals.FILE_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExpression getFileNameExpression() {
		return fileNameExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileNameExpression(AbstractExpression newFileNameExpression, NotificationChain msgs) {
		AbstractExpression oldFileNameExpression = fileNameExpression;
		fileNameExpression = newFileNameExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.FILE_STATEMENT__FILE_NAME_EXPRESSION, oldFileNameExpression, newFileNameExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileNameExpression(AbstractExpression newFileNameExpression) {
		if (newFileNameExpression != fileNameExpression) {
			NotificationChain msgs = null;
			if (fileNameExpression != null)
				msgs = ((InternalEObject)fileNameExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.FILE_STATEMENT__FILE_NAME_EXPRESSION, null, msgs);
			if (newFileNameExpression != null)
				msgs = ((InternalEObject)newFileNameExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.FILE_STATEMENT__FILE_NAME_EXPRESSION, null, msgs);
			msgs = basicSetFileNameExpression(newFileNameExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.FILE_STATEMENT__FILE_NAME_EXPRESSION, newFileNameExpression, newFileNameExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getOutletNameIdentifier() {
		return outletNameIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutletNameIdentifier(Identifier newOutletNameIdentifier, NotificationChain msgs) {
		Identifier oldOutletNameIdentifier = outletNameIdentifier;
		outletNameIdentifier = newOutletNameIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.FILE_STATEMENT__OUTLET_NAME_IDENTIFIER, oldOutletNameIdentifier, newOutletNameIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutletNameIdentifier(Identifier newOutletNameIdentifier) {
		if (newOutletNameIdentifier != outletNameIdentifier) {
			NotificationChain msgs = null;
			if (outletNameIdentifier != null)
				msgs = ((InternalEObject)outletNameIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.FILE_STATEMENT__OUTLET_NAME_IDENTIFIER, null, msgs);
			if (newOutletNameIdentifier != null)
				msgs = ((InternalEObject)newOutletNameIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.FILE_STATEMENT__OUTLET_NAME_IDENTIFIER, null, msgs);
			msgs = basicSetOutletNameIdentifier(newOutletNameIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.FILE_STATEMENT__OUTLET_NAME_IDENTIFIER, newOutletNameIdentifier, newOutletNameIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementPackage.FILE_STATEMENT__FILE_NAME_EXPRESSION:
				return basicSetFileNameExpression(null, msgs);
			case StatementPackage.FILE_STATEMENT__OUTLET_NAME_IDENTIFIER:
				return basicSetOutletNameIdentifier(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatementPackage.FILE_STATEMENT__FILE_NAME_EXPRESSION:
				return getFileNameExpression();
			case StatementPackage.FILE_STATEMENT__OUTLET_NAME_IDENTIFIER:
				return getOutletNameIdentifier();
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
			case StatementPackage.FILE_STATEMENT__FILE_NAME_EXPRESSION:
				setFileNameExpression((AbstractExpression)newValue);
				return;
			case StatementPackage.FILE_STATEMENT__OUTLET_NAME_IDENTIFIER:
				setOutletNameIdentifier((Identifier)newValue);
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
			case StatementPackage.FILE_STATEMENT__FILE_NAME_EXPRESSION:
				setFileNameExpression((AbstractExpression)null);
				return;
			case StatementPackage.FILE_STATEMENT__OUTLET_NAME_IDENTIFIER:
				setOutletNameIdentifier((Identifier)null);
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
			case StatementPackage.FILE_STATEMENT__FILE_NAME_EXPRESSION:
				return fileNameExpression != null;
			case StatementPackage.FILE_STATEMENT__OUTLET_NAME_IDENTIFIER:
				return outletNameIdentifier != null;
		}
		return super.eIsSet(featureID);
	}

} //FileStatementImpl
