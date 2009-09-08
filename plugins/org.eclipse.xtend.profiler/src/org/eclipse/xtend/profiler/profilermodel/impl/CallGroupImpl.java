/**
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtend.profiler.profilermodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.xtend.profiler.profilermodel.CallGroup;
import org.eclipse.xtend.profiler.profilermodel.Item;
import org.eclipse.xtend.profiler.profilermodel.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.impl.CallGroupImpl#getInvoker <em>Invoker</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.impl.CallGroupImpl#getSubroutine <em>Subroutine</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.impl.CallGroupImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.impl.CallGroupImpl#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallGroupImpl extends EObjectImpl implements CallGroup {
	/**
	 * The cached value of the '{@link #getInvoker() <em>Invoker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoker()
	 * @generated
	 * @ordered
	 */
	protected Item invoker;

	/**
	 * The cached value of the '{@link #getSubroutine() <em>Subroutine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubroutine()
	 * @generated
	 * @ordered
	 */
	protected Item subroutine;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected int count = COUNT_EDEFAULT;

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
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected long time = TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CALL_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item getInvoker() {
		if (invoker != null && invoker.eIsProxy()) {
			InternalEObject oldInvoker = (InternalEObject)invoker;
			invoker = (Item)eResolveProxy(oldInvoker);
			if (invoker != oldInvoker) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CALL_GROUP__INVOKER, oldInvoker, invoker));
			}
		}
		return invoker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item basicGetInvoker() {
		return invoker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvoker(Item newInvoker, NotificationChain msgs) {
		Item oldInvoker = invoker;
		invoker = newInvoker;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.CALL_GROUP__INVOKER, oldInvoker, newInvoker);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoker(Item newInvoker) {
		if (newInvoker != invoker) {
			NotificationChain msgs = null;
			if (invoker != null)
				msgs = ((InternalEObject)invoker).eInverseRemove(this, ModelPackage.ITEM__SUBROUTINES, Item.class, msgs);
			if (newInvoker != null)
				msgs = ((InternalEObject)newInvoker).eInverseAdd(this, ModelPackage.ITEM__SUBROUTINES, Item.class, msgs);
			msgs = basicSetInvoker(newInvoker, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CALL_GROUP__INVOKER, newInvoker, newInvoker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item getSubroutine() {
		if (subroutine != null && subroutine.eIsProxy()) {
			InternalEObject oldSubroutine = (InternalEObject)subroutine;
			subroutine = (Item)eResolveProxy(oldSubroutine);
			if (subroutine != oldSubroutine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CALL_GROUP__SUBROUTINE, oldSubroutine, subroutine));
			}
		}
		return subroutine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item basicGetSubroutine() {
		return subroutine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubroutine(Item newSubroutine, NotificationChain msgs) {
		Item oldSubroutine = subroutine;
		subroutine = newSubroutine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.CALL_GROUP__SUBROUTINE, oldSubroutine, newSubroutine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubroutine(Item newSubroutine) {
		if (newSubroutine != subroutine) {
			NotificationChain msgs = null;
			if (subroutine != null)
				msgs = ((InternalEObject)subroutine).eInverseRemove(this, ModelPackage.ITEM__INVOCATIONS, Item.class, msgs);
			if (newSubroutine != null)
				msgs = ((InternalEObject)newSubroutine).eInverseAdd(this, ModelPackage.ITEM__INVOCATIONS, Item.class, msgs);
			msgs = basicSetSubroutine(newSubroutine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CALL_GROUP__SUBROUTINE, newSubroutine, newSubroutine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(int newCount) {
		int oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CALL_GROUP__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(long newTime) {
		long oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CALL_GROUP__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.CALL_GROUP__INVOKER:
				if (invoker != null)
					msgs = ((InternalEObject)invoker).eInverseRemove(this, ModelPackage.ITEM__SUBROUTINES, Item.class, msgs);
				return basicSetInvoker((Item)otherEnd, msgs);
			case ModelPackage.CALL_GROUP__SUBROUTINE:
				if (subroutine != null)
					msgs = ((InternalEObject)subroutine).eInverseRemove(this, ModelPackage.ITEM__INVOCATIONS, Item.class, msgs);
				return basicSetSubroutine((Item)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.CALL_GROUP__INVOKER:
				return basicSetInvoker(null, msgs);
			case ModelPackage.CALL_GROUP__SUBROUTINE:
				return basicSetSubroutine(null, msgs);
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
			case ModelPackage.CALL_GROUP__INVOKER:
				if (resolve) return getInvoker();
				return basicGetInvoker();
			case ModelPackage.CALL_GROUP__SUBROUTINE:
				if (resolve) return getSubroutine();
				return basicGetSubroutine();
			case ModelPackage.CALL_GROUP__COUNT:
				return getCount();
			case ModelPackage.CALL_GROUP__TIME:
				return getTime();
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
			case ModelPackage.CALL_GROUP__INVOKER:
				setInvoker((Item)newValue);
				return;
			case ModelPackage.CALL_GROUP__SUBROUTINE:
				setSubroutine((Item)newValue);
				return;
			case ModelPackage.CALL_GROUP__COUNT:
				setCount((Integer)newValue);
				return;
			case ModelPackage.CALL_GROUP__TIME:
				setTime((Long)newValue);
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
			case ModelPackage.CALL_GROUP__INVOKER:
				setInvoker((Item)null);
				return;
			case ModelPackage.CALL_GROUP__SUBROUTINE:
				setSubroutine((Item)null);
				return;
			case ModelPackage.CALL_GROUP__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case ModelPackage.CALL_GROUP__TIME:
				setTime(TIME_EDEFAULT);
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
			case ModelPackage.CALL_GROUP__INVOKER:
				return invoker != null;
			case ModelPackage.CALL_GROUP__SUBROUTINE:
				return subroutine != null;
			case ModelPackage.CALL_GROUP__COUNT:
				return count != COUNT_EDEFAULT;
			case ModelPackage.CALL_GROUP__TIME:
				return time != TIME_EDEFAULT;
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
		result.append(" (Count: ");
		result.append(count);
		result.append(", Time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //CallGroupImpl
