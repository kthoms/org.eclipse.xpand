/**
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtend.profiler.profilermodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.xtend.profiler.profilermodel.CallGroup;
import org.eclipse.xtend.profiler.profilermodel.Cycle;
import org.eclipse.xtend.profiler.profilermodel.Item;
import org.eclipse.xtend.profiler.profilermodel.ModelPackage;
import org.eclipse.xtend.profiler.profilermodel.ProfilingResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cycle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.impl.CycleImpl#getItems <em>Items</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.impl.CycleImpl#getCallCountInbound <em>Call Count Inbound</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.impl.CycleImpl#getCallCountReentrant <em>Call Count Reentrant</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.impl.CycleImpl#getOutgoingCallGroups <em>Outgoing Call Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CycleImpl extends CallableImpl implements Cycle {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> items;

	/**
	 * The default value of the '{@link #getCallCountInbound() <em>Call Count Inbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallCountInbound()
	 * @generated
	 * @ordered
	 */
	protected static final int CALL_COUNT_INBOUND_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getCallCountReentrant() <em>Call Count Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallCountReentrant()
	 * @generated
	 * @ordered
	 */
	protected static final int CALL_COUNT_REENTRANT_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CycleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CYCLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItems() {
		if (items == null) {
			items = new EObjectWithInverseResolvingEList<Item>(Item.class, this, ModelPackage.CYCLE__ITEMS, ModelPackage.ITEM__CYCLE);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getCallCountInbound() {
		int result = 0;
		for(Item i : getItems())
			for(CallGroup invocation: i.getInvocations())
				if(!this.equals(invocation.getInvoker().getCycle()))
					result += invocation.getCount();
		return result ;
	}
	
	@Override
	public long getSelfTime() {
		long result = 0;
		for(Item i : getItems())
			result += i.getSelfTime();
		return result ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getCallCountReentrant() {
		int result = 0;
		for(Item i : getItems())
			for(CallGroup sub : i.getSubroutines())
				if(this.equals(sub.getSubroutine().getCycle()))
					result += sub.getCount();
		return result ; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		int index = ((ProfilingResult)eContainer()).getCycles().indexOf(this) + 1;
		return "cycle " + index;
	}
	
	@Override
	public long getTime() {
		long result = 0;
		for (Item i : getItems()) {
			result += i.getSelfTime() + i.getOutboundChildTime();
		};
		return result;
	}
	
	@Override
	protected long getBruttoTime() {
		return getTime();
	}
	
	@Override
	public long getOutboundChildTime() {
		return getChildTime();
	}
	
	public EList<CallGroup> getOutgoingCallGroups() {
		EList<CallGroup> result = new BasicEList<CallGroup>();
		for (Item i : getItems())
			for (CallGroup sub : i.getSubroutines())
				if(!this.equals(sub.getSubroutine().getCycle()))
					result.add(sub);
		
		return result;
	}
	
	@Override
	public long getChildTime() {
		long result = 0;
		for(CallGroup sub : getOutgoingCallGroups())
			result += sub.getTime();
		return result;
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.CYCLE__ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getItems()).basicAdd(otherEnd, msgs);
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
			case ModelPackage.CYCLE__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.CYCLE__ITEMS:
				return getItems();
			case ModelPackage.CYCLE__CALL_COUNT_INBOUND:
				return getCallCountInbound();
			case ModelPackage.CYCLE__CALL_COUNT_REENTRANT:
				return getCallCountReentrant();
			case ModelPackage.CYCLE__OUTGOING_CALL_GROUPS:
				return getOutgoingCallGroups();
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
			case ModelPackage.CYCLE__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends Item>)newValue);
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
			case ModelPackage.CYCLE__ITEMS:
				getItems().clear();
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
			case ModelPackage.CYCLE__ITEMS:
				return items != null && !items.isEmpty();
			case ModelPackage.CYCLE__CALL_COUNT_INBOUND:
				return getCallCountInbound() != CALL_COUNT_INBOUND_EDEFAULT;
			case ModelPackage.CYCLE__CALL_COUNT_REENTRANT:
				return getCallCountReentrant() != CALL_COUNT_REENTRANT_EDEFAULT;
			case ModelPackage.CYCLE__OUTGOING_CALL_GROUPS:
				return !getOutgoingCallGroups().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CycleImpl
