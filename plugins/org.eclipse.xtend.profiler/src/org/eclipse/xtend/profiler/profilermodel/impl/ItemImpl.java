/**
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtend.profiler.profilermodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.xtend.profiler.profilermodel.CallGroup;
import org.eclipse.xtend.profiler.profilermodel.Cycle;
import org.eclipse.xtend.profiler.profilermodel.Item;
import org.eclipse.xtend.profiler.profilermodel.ModelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Item</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.impl.ItemImpl#getItemName <em>Item Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.impl.ItemImpl#getItemTime <em>Item Time</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.impl.ItemImpl#getCallCount <em>Call Count</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.impl.ItemImpl#getSubroutines <em>Subroutines</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.impl.ItemImpl#getInvocations <em>Invocations</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.impl.ItemImpl#getCycle <em>Cycle</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.impl.ItemImpl#getInboundInvocations <em>Inbound Invocations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemImpl extends CallableImpl implements Item {
	/**
	 * The default value of the '{@link #getItemName() <em>Item Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getItemName()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getItemName() <em>Item Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getItemName()
	 * @generated
	 * @ordered
	 */
	protected String itemName = ITEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getItemTime() <em>Item Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemTime()
	 * @generated
	 * @ordered
	 */
	protected static final long ITEM_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getItemTime() <em>Item Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemTime()
	 * @generated
	 * @ordered
	 */
	protected long itemTime = ITEM_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCallCount() <em>Call Count</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCallCount()
	 * @generated
	 * @ordered
	 */
	protected static final int CALL_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSubroutines() <em>Subroutines</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSubroutines()
	 * @generated
	 * @ordered
	 */
	protected EList<CallGroup> subroutines;

	/**
	 * The cached value of the '{@link #getInvocations() <em>Invocations</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInvocations()
	 * @generated
	 * @ordered
	 */
	protected EList<CallGroup> invocations;

	/**
	 * The cached value of the '{@link #getCycle() <em>Cycle</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCycle()
	 * @generated
	 * @ordered
	 */
	protected Cycle cycle;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ITEM;
	}

	@Override
	public String getName() {
		return getItemName()
				+ (getCycle() == null ? "" : " <" + getCycle().getName() + ">");
	}
	
	@Override
	public long getBruttoTime() {
		return getItemTime();
	}
	
	@Override
	public long getTime() {
		return getSelfTime() + getOutboundChildTime();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemName(String newItemName) {
		String oldItemName = itemName;
		itemName = newItemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__ITEM_NAME, oldItemName, itemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getItemTime() {
		return itemTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemTime(long newItemTime) {
		long oldItemTime = itemTime;
		itemTime = newItemTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__ITEM_TIME, oldItemTime, itemTime));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int getCallCount() {
		int result = 0;
		for (CallGroup invocation : getInvocations()) {
			result += invocation.getCount();
		}
		return result;
	}
	
	@Override
	public long getOutboundChildTime() {
		long result = 0;
		for (CallGroup g : getSubroutines()) {
			Item s = g.getSubroutine();
			if (!s.isSameCycle(this))
				result += g.getTime();
		}
		return result ;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public long getChildTime() {
		long result = 0;
		for (CallGroup sub : getSubroutines()) {
			result += sub.getTime();
//			Item routine = sub.getSubroutine();
//			if (!isSameCycle(routine))
//				result += routine.getTime() / routine.getCallCount()
//						* sub.getCount();
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallGroup> getSubroutines() {
		if (subroutines == null) {
			subroutines = new EObjectWithInverseResolvingEList<CallGroup>(CallGroup.class, this, ModelPackage.ITEM__SUBROUTINES, ModelPackage.CALL_GROUP__INVOKER);
		}
		return subroutines;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallGroup> getInvocations() {
		if (invocations == null) {
			invocations = new EObjectWithInverseResolvingEList<CallGroup>(CallGroup.class, this, ModelPackage.ITEM__INVOCATIONS, ModelPackage.CALL_GROUP__SUBROUTINE);
		}
		return invocations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Cycle getCycle() {
		if (cycle != null && cycle.eIsProxy()) {
			InternalEObject oldCycle = (InternalEObject)cycle;
			cycle = (Cycle)eResolveProxy(oldCycle);
			if (cycle != oldCycle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ITEM__CYCLE, oldCycle, cycle));
			}
		}
		return cycle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Cycle basicGetCycle() {
		return cycle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCycle(Cycle newCycle,
			NotificationChain msgs) {
		Cycle oldCycle = cycle;
		cycle = newCycle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__CYCLE, oldCycle, newCycle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCycle(Cycle newCycle) {
		if (newCycle != cycle) {
			NotificationChain msgs = null;
			if (cycle != null)
				msgs = ((InternalEObject)cycle).eInverseRemove(this, ModelPackage.CYCLE__ITEMS, Cycle.class, msgs);
			if (newCycle != null)
				msgs = ((InternalEObject)newCycle).eInverseAdd(this, ModelPackage.CYCLE__ITEMS, Cycle.class, msgs);
			msgs = basicSetCycle(newCycle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ITEM__CYCLE, newCycle, newCycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<CallGroup> getInboundInvocations() {
		EList<CallGroup> result = new BasicEList<CallGroup>();
		for(CallGroup g : getInvocations())
			if(!g.getInvoker().isSameCycle(this))
				result.add(g);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isSameCycle(Item item) {
		return (getCycle() != null) && getCycle().equals(item.getCycle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getCallCountInCycle(Cycle cycle) {
		int result = 0;
		for(CallGroup invocation: getInvocations())
			if(cycle.equals(invocation.getInvoker().getCycle()))
				result += invocation.getCount();
			
		return result ;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ITEM__SUBROUTINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubroutines()).basicAdd(otherEnd, msgs);
			case ModelPackage.ITEM__INVOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInvocations()).basicAdd(otherEnd, msgs);
			case ModelPackage.ITEM__CYCLE:
				if (cycle != null)
					msgs = ((InternalEObject)cycle).eInverseRemove(this, ModelPackage.CYCLE__ITEMS, Cycle.class, msgs);
				return basicSetCycle((Cycle)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ITEM__SUBROUTINES:
				return ((InternalEList<?>)getSubroutines()).basicRemove(otherEnd, msgs);
			case ModelPackage.ITEM__INVOCATIONS:
				return ((InternalEList<?>)getInvocations()).basicRemove(otherEnd, msgs);
			case ModelPackage.ITEM__CYCLE:
				return basicSetCycle(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ITEM__ITEM_NAME:
				return getItemName();
			case ModelPackage.ITEM__ITEM_TIME:
				return getItemTime();
			case ModelPackage.ITEM__CALL_COUNT:
				return getCallCount();
			case ModelPackage.ITEM__SUBROUTINES:
				return getSubroutines();
			case ModelPackage.ITEM__INVOCATIONS:
				return getInvocations();
			case ModelPackage.ITEM__CYCLE:
				if (resolve) return getCycle();
				return basicGetCycle();
			case ModelPackage.ITEM__INBOUND_INVOCATIONS:
				return getInboundInvocations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.ITEM__ITEM_NAME:
				setItemName((String)newValue);
				return;
			case ModelPackage.ITEM__ITEM_TIME:
				setItemTime((Long)newValue);
				return;
			case ModelPackage.ITEM__SUBROUTINES:
				getSubroutines().clear();
				getSubroutines().addAll((Collection<? extends CallGroup>)newValue);
				return;
			case ModelPackage.ITEM__INVOCATIONS:
				getInvocations().clear();
				getInvocations().addAll((Collection<? extends CallGroup>)newValue);
				return;
			case ModelPackage.ITEM__CYCLE:
				setCycle((Cycle)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.ITEM__ITEM_NAME:
				setItemName(ITEM_NAME_EDEFAULT);
				return;
			case ModelPackage.ITEM__ITEM_TIME:
				setItemTime(ITEM_TIME_EDEFAULT);
				return;
			case ModelPackage.ITEM__SUBROUTINES:
				getSubroutines().clear();
				return;
			case ModelPackage.ITEM__INVOCATIONS:
				getInvocations().clear();
				return;
			case ModelPackage.ITEM__CYCLE:
				setCycle((Cycle)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.ITEM__ITEM_NAME:
				return ITEM_NAME_EDEFAULT == null ? itemName != null : !ITEM_NAME_EDEFAULT.equals(itemName);
			case ModelPackage.ITEM__ITEM_TIME:
				return itemTime != ITEM_TIME_EDEFAULT;
			case ModelPackage.ITEM__CALL_COUNT:
				return getCallCount() != CALL_COUNT_EDEFAULT;
			case ModelPackage.ITEM__SUBROUTINES:
				return subroutines != null && !subroutines.isEmpty();
			case ModelPackage.ITEM__INVOCATIONS:
				return invocations != null && !invocations.isEmpty();
			case ModelPackage.ITEM__CYCLE:
				return cycle != null;
			case ModelPackage.ITEM__INBOUND_INVOCATIONS:
				return !getInboundInvocations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ItemName: ");
		result.append(itemName);
		result.append(", ItemTime: ");
		result.append(itemTime);
		result.append(')');
		return result.toString();
	}

} // ItemImpl
