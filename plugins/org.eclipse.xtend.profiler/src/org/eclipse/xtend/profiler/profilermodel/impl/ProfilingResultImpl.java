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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.xtend.profiler.profilermodel.Callable;
import org.eclipse.xtend.profiler.profilermodel.Cycle;
import org.eclipse.xtend.profiler.profilermodel.Item;
import org.eclipse.xtend.profiler.profilermodel.ModelPackage;
import org.eclipse.xtend.profiler.profilermodel.ProfilingResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profiling Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.impl.ProfilingResultImpl#getItems <em>Items</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.impl.ProfilingResultImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.impl.ProfilingResultImpl#getCycles <em>Cycles</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.impl.ProfilingResultImpl#getRootItems <em>Root Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfilingResultImpl extends EObjectImpl implements ProfilingResult {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> items;

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
	 * The cached value of the '{@link #getCycles() <em>Cycles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycles()
	 * @generated
	 * @ordered
	 */
	protected EList<Cycle> cycles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfilingResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PROFILING_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<Item>(Item.class, this, ModelPackage.PROFILING_RESULT__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public long getTime() {
		long result = 0;
		for(Callable c : getRootCallables())
			result += c.getTime();
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cycle> getCycles() {
		if (cycles == null) {
			cycles = new EObjectContainmentEList<Cycle>(Cycle.class, this, ModelPackage.PROFILING_RESULT__CYCLES);
		}
		return cycles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Item> getRootItems() {
		EList<Item> result = new BasicEList<Item>();
		for(Item i : getItems())
			if(i.getInvocations().isEmpty())
				result.add(i);
		return result ;
	}
	
	private EList<Cycle> getRootCycles() {
		EList<Cycle> result = new BasicEList<Cycle>();
		for(Cycle c : getCycles())
			if(c.getCallCountInbound()==0)
				result.add(c);
		return result ;
	}
	
	private EList<Callable> getRootCallables() {
		EList<Callable> result = new BasicEList<Callable>();
		result.addAll(getRootItems());
		result.addAll(getRootCycles());
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.PROFILING_RESULT__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
			case ModelPackage.PROFILING_RESULT__CYCLES:
				return ((InternalEList<?>)getCycles()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.PROFILING_RESULT__ITEMS:
				return getItems();
			case ModelPackage.PROFILING_RESULT__TIME:
				return getTime();
			case ModelPackage.PROFILING_RESULT__CYCLES:
				return getCycles();
			case ModelPackage.PROFILING_RESULT__ROOT_ITEMS:
				return getRootItems();
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
			case ModelPackage.PROFILING_RESULT__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends Item>)newValue);
				return;
			case ModelPackage.PROFILING_RESULT__CYCLES:
				getCycles().clear();
				getCycles().addAll((Collection<? extends Cycle>)newValue);
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
			case ModelPackage.PROFILING_RESULT__ITEMS:
				getItems().clear();
				return;
			case ModelPackage.PROFILING_RESULT__CYCLES:
				getCycles().clear();
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
			case ModelPackage.PROFILING_RESULT__ITEMS:
				return items != null && !items.isEmpty();
			case ModelPackage.PROFILING_RESULT__TIME:
				return getTime() != TIME_EDEFAULT;
			case ModelPackage.PROFILING_RESULT__CYCLES:
				return cycles != null && !cycles.isEmpty();
			case ModelPackage.PROFILING_RESULT__ROOT_ITEMS:
				return !getRootItems().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProfilingResultImpl
