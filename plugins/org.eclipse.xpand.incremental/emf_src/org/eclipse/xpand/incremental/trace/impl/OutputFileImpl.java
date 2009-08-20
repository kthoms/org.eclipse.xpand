/**
 * Copyright (c) 2005, 2009 eXXcellent solution gmbh and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Achim Demelt - initial API and implementation
 *
 * $Id: OutputFileImpl.java,v 1.1 2009/08/20 12:04:23 ademelt Exp $
 */
package org.eclipse.xpand.incremental.trace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xpand.incremental.trace.InputElement;
import org.eclipse.xpand.incremental.trace.OutputFile;
import org.eclipse.xpand.incremental.trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpand.incremental.trace.impl.OutputFileImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.eclipse.xpand.incremental.trace.impl.OutputFileImpl#getInputElements <em>Input Elements</em>}</li>
 *   <li>{@link org.eclipse.xpand.incremental.trace.impl.OutputFileImpl#getTargetObject <em>Target Object</em>}</li>
 *   <li>{@link org.eclipse.xpand.incremental.trace.impl.OutputFileImpl#getOutlet <em>Outlet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputFileImpl extends EObjectImpl implements OutputFile {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2009 eXXcellent solution gmbh and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n     Achim Demelt - initial API and implementation";

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputElements() <em>Input Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputElements()
	 * @generated
	 * @ordered
	 */
	protected EList<InputElement> inputElements;

	/**
	 * The cached value of the '{@link #getTargetObject() <em>Target Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetObject()
	 * @generated
	 * @ordered
	 */
	protected EObject targetObject;

	/**
	 * The default value of the '{@link #getOutlet() <em>Outlet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutlet()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTLET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutlet() <em>Outlet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutlet()
	 * @generated
	 * @ordered
	 */
	protected String outlet = OUTLET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.OUTPUT_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TracePackage.OUTPUT_FILE__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputElement> getInputElements() {
		if (inputElements == null) {
			inputElements = new EObjectContainmentEList<InputElement>(
					InputElement.class, this,
					TracePackage.OUTPUT_FILE__INPUT_ELEMENTS);
		}
		return inputElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTargetObject() {
		if (targetObject != null && targetObject.eIsProxy()) {
			InternalEObject oldTargetObject = (InternalEObject) targetObject;
			targetObject = eResolveProxy(oldTargetObject);
			if (targetObject != oldTargetObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TracePackage.OUTPUT_FILE__TARGET_OBJECT,
							oldTargetObject, targetObject));
			}
		}
		return targetObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetTargetObject() {
		return targetObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetObject(EObject newTargetObject) {
		EObject oldTargetObject = targetObject;
		targetObject = newTargetObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TracePackage.OUTPUT_FILE__TARGET_OBJECT, oldTargetObject,
					targetObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutlet() {
		return outlet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutlet(String newOutlet) {
		String oldOutlet = outlet;
		outlet = newOutlet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TracePackage.OUTPUT_FILE__OUTLET, oldOutlet, outlet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TracePackage.OUTPUT_FILE__INPUT_ELEMENTS:
			return ((InternalEList<?>) getInputElements()).basicRemove(
					otherEnd, msgs);
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
		case TracePackage.OUTPUT_FILE__FILE_NAME:
			return getFileName();
		case TracePackage.OUTPUT_FILE__INPUT_ELEMENTS:
			return getInputElements();
		case TracePackage.OUTPUT_FILE__TARGET_OBJECT:
			if (resolve)
				return getTargetObject();
			return basicGetTargetObject();
		case TracePackage.OUTPUT_FILE__OUTLET:
			return getOutlet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TracePackage.OUTPUT_FILE__FILE_NAME:
			setFileName((String) newValue);
			return;
		case TracePackage.OUTPUT_FILE__INPUT_ELEMENTS:
			getInputElements().clear();
			getInputElements().addAll(
					(Collection<? extends InputElement>) newValue);
			return;
		case TracePackage.OUTPUT_FILE__TARGET_OBJECT:
			setTargetObject((EObject) newValue);
			return;
		case TracePackage.OUTPUT_FILE__OUTLET:
			setOutlet((String) newValue);
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
		case TracePackage.OUTPUT_FILE__FILE_NAME:
			setFileName(FILE_NAME_EDEFAULT);
			return;
		case TracePackage.OUTPUT_FILE__INPUT_ELEMENTS:
			getInputElements().clear();
			return;
		case TracePackage.OUTPUT_FILE__TARGET_OBJECT:
			setTargetObject((EObject) null);
			return;
		case TracePackage.OUTPUT_FILE__OUTLET:
			setOutlet(OUTLET_EDEFAULT);
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
		case TracePackage.OUTPUT_FILE__FILE_NAME:
			return FILE_NAME_EDEFAULT == null ? fileName != null
					: !FILE_NAME_EDEFAULT.equals(fileName);
		case TracePackage.OUTPUT_FILE__INPUT_ELEMENTS:
			return inputElements != null && !inputElements.isEmpty();
		case TracePackage.OUTPUT_FILE__TARGET_OBJECT:
			return targetObject != null;
		case TracePackage.OUTPUT_FILE__OUTLET:
			return OUTLET_EDEFAULT == null ? outlet != null : !OUTLET_EDEFAULT
					.equals(outlet);
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fileName: ");
		result.append(fileName);
		result.append(", outlet: ");
		result.append(outlet);
		result.append(')');
		return result.toString();
	}

} //OutputFileImpl
