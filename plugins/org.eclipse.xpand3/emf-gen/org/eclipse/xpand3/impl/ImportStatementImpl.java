/**
 * <copyright>
 * </copyright>
 *
 * $Id: ImportStatementImpl.java,v 1.1 2008/02/27 13:21:07 sefftinge Exp $
 */
package org.eclipse.xpand3.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xpand3.Identifier;
import org.eclipse.xpand3.ImportStatement;
import org.eclipse.xpand3.Xpand3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand3.impl.ImportStatementImpl#getImportedId <em>Imported Id</em>}</li>
 *   <li>{@link org.eclipse.xpand3.impl.ImportStatementImpl#isExported <em>Exported</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportStatementImpl extends SyntaxElementImpl implements ImportStatement {
	/**
	 * The cached value of the '{@link #getImportedId() <em>Imported Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedId()
	 * @generated
	 * @ordered
	 */
	protected Identifier importedId;

	/**
	 * The default value of the '{@link #isExported() <em>Exported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExported()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPORTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExported() <em>Exported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExported()
	 * @generated
	 * @ordered
	 */
	protected boolean exported = EXPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xpand3Package.Literals.IMPORT_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getImportedId() {
		return importedId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedId(Identifier newImportedId, NotificationChain msgs) {
		Identifier oldImportedId = importedId;
		importedId = newImportedId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xpand3Package.IMPORT_STATEMENT__IMPORTED_ID, oldImportedId, newImportedId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedId(Identifier newImportedId) {
		if (newImportedId != importedId) {
			NotificationChain msgs = null;
			if (importedId != null)
				msgs = ((InternalEObject)importedId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xpand3Package.IMPORT_STATEMENT__IMPORTED_ID, null, msgs);
			if (newImportedId != null)
				msgs = ((InternalEObject)newImportedId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xpand3Package.IMPORT_STATEMENT__IMPORTED_ID, null, msgs);
			msgs = basicSetImportedId(newImportedId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3Package.IMPORT_STATEMENT__IMPORTED_ID, newImportedId, newImportedId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExported() {
		return exported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExported(boolean newExported) {
		boolean oldExported = exported;
		exported = newExported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xpand3Package.IMPORT_STATEMENT__EXPORTED, oldExported, exported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Xpand3Package.IMPORT_STATEMENT__IMPORTED_ID:
				return basicSetImportedId(null, msgs);
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
			case Xpand3Package.IMPORT_STATEMENT__IMPORTED_ID:
				return getImportedId();
			case Xpand3Package.IMPORT_STATEMENT__EXPORTED:
				return isExported() ? Boolean.TRUE : Boolean.FALSE;
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
			case Xpand3Package.IMPORT_STATEMENT__IMPORTED_ID:
				setImportedId((Identifier)newValue);
				return;
			case Xpand3Package.IMPORT_STATEMENT__EXPORTED:
				setExported(((Boolean)newValue).booleanValue());
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
			case Xpand3Package.IMPORT_STATEMENT__IMPORTED_ID:
				setImportedId((Identifier)null);
				return;
			case Xpand3Package.IMPORT_STATEMENT__EXPORTED:
				setExported(EXPORTED_EDEFAULT);
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
			case Xpand3Package.IMPORT_STATEMENT__IMPORTED_ID:
				return importedId != null;
			case Xpand3Package.IMPORT_STATEMENT__EXPORTED:
				return exported != EXPORTED_EDEFAULT;
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
		result.append(" (exported: ");
		result.append(exported);
		result.append(')');
		return result.toString();
	}

} //ImportStatementImpl
