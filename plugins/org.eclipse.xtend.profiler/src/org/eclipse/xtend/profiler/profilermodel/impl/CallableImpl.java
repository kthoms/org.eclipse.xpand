/**
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtend.profiler.profilermodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.xtend.profiler.profilermodel.Callable;
import org.eclipse.xtend.profiler.profilermodel.ModelPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Callable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.impl.CallableImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.impl.CallableImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.impl.CallableImpl#getChildTime <em>Child Time</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.impl.CallableImpl#getSelfTime <em>Self Time</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.impl.CallableImpl#getOutboundChildTime <em>Outbound Child Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CallableImpl extends EObjectImpl implements Callable {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getChildTime() <em>Child Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildTime()
	 * @generated
	 * @ordered
	 */
	protected static final long CHILD_TIME_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getSelfTime() <em>Self Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfTime()
	 * @generated
	 * @ordered
	 */
	protected static final long SELF_TIME_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getOutboundChildTime() <em>Outbound Child Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutboundChildTime()
	 * @generated
	 * @ordered
	 */
	protected static final long OUTBOUND_CHILD_TIME_EDEFAULT = 0L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CALLABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		// TODO: implement this method to return the 'Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTime() {
		// TODO: implement this method to return the 'Time' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getChildTime() {
		// TODO: implement this method to return the 'Child Time' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public long getSelfTime() {
		// TODO do a true analysis over the call tree (is this really necessary?)
		return Math.max(0, getBruttoTime() - getChildTime());
	}

	protected abstract long getBruttoTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getOutboundChildTime() {
		// TODO: implement this method to return the 'Outbound Child Time' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.CALLABLE__NAME:
				return getName();
			case ModelPackage.CALLABLE__TIME:
				return getTime();
			case ModelPackage.CALLABLE__CHILD_TIME:
				return getChildTime();
			case ModelPackage.CALLABLE__SELF_TIME:
				return getSelfTime();
			case ModelPackage.CALLABLE__OUTBOUND_CHILD_TIME:
				return getOutboundChildTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.CALLABLE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ModelPackage.CALLABLE__TIME:
				return getTime() != TIME_EDEFAULT;
			case ModelPackage.CALLABLE__CHILD_TIME:
				return getChildTime() != CHILD_TIME_EDEFAULT;
			case ModelPackage.CALLABLE__SELF_TIME:
				return getSelfTime() != SELF_TIME_EDEFAULT;
			case ModelPackage.CALLABLE__OUTBOUND_CHILD_TIME:
				return getOutboundChildTime() != OUTBOUND_CHILD_TIME_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //CallableImpl
