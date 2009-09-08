/**
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * $Id: ModelPackage.java,v 1.1 2009/09/08 09:39:40 hbehrens Exp $
 */
package org.eclipse.xtend.profiler.profilermodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xtend.profiler.profilermodel.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "profilermodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.xtend.profiler";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.xtend.profiler";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = org.eclipse.xtend.profiler.profilermodel.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.xtend.profiler.profilermodel.impl.ProfilingResultImpl <em>Profiling Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtend.profiler.profilermodel.impl.ProfilingResultImpl
	 * @see org.eclipse.xtend.profiler.profilermodel.impl.ModelPackageImpl#getProfilingResult()
	 * @generated
	 */
	int PROFILING_RESULT = 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILING_RESULT__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILING_RESULT__TIME = 1;

	/**
	 * The feature id for the '<em><b>Cycles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILING_RESULT__CYCLES = 2;

	/**
	 * The feature id for the '<em><b>Root Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILING_RESULT__ROOT_ITEMS = 3;

	/**
	 * The number of structural features of the '<em>Profiling Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILING_RESULT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.xtend.profiler.profilermodel.impl.CallGroupImpl <em>Call Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtend.profiler.profilermodel.impl.CallGroupImpl
	 * @see org.eclipse.xtend.profiler.profilermodel.impl.ModelPackageImpl#getCallGroup()
	 * @generated
	 */
	int CALL_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Invoker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_GROUP__INVOKER = 0;

	/**
	 * The feature id for the '<em><b>Subroutine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_GROUP__SUBROUTINE = 1;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_GROUP__COUNT = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_GROUP__TIME = 3;

	/**
	 * The number of structural features of the '<em>Call Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_GROUP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.xtend.profiler.profilermodel.impl.CallableImpl <em>Callable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtend.profiler.profilermodel.impl.CallableImpl
	 * @see org.eclipse.xtend.profiler.profilermodel.impl.ModelPackageImpl#getCallable()
	 * @generated
	 */
	int CALLABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__TIME = 1;

	/**
	 * The feature id for the '<em><b>Child Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__CHILD_TIME = 2;

	/**
	 * The feature id for the '<em><b>Self Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__SELF_TIME = 3;

	/**
	 * The feature id for the '<em><b>Outbound Child Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__OUTBOUND_CHILD_TIME = 4;

	/**
	 * The number of structural features of the '<em>Callable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.xtend.profiler.profilermodel.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtend.profiler.profilermodel.impl.ItemImpl
	 * @see org.eclipse.xtend.profiler.profilermodel.impl.ModelPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NAME = CALLABLE__NAME;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__TIME = CALLABLE__TIME;

	/**
	 * The feature id for the '<em><b>Child Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__CHILD_TIME = CALLABLE__CHILD_TIME;

	/**
	 * The feature id for the '<em><b>Self Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__SELF_TIME = CALLABLE__SELF_TIME;

	/**
	 * The feature id for the '<em><b>Outbound Child Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__OUTBOUND_CHILD_TIME = CALLABLE__OUTBOUND_CHILD_TIME;

	/**
	 * The feature id for the '<em><b>Item Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ITEM_NAME = CALLABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ITEM_TIME = CALLABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Call Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__CALL_COUNT = CALLABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subroutines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__SUBROUTINES = CALLABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invocations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__INVOCATIONS = CALLABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__CYCLE = CALLABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Inbound Invocations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__INBOUND_INVOCATIONS = CALLABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = CALLABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.xtend.profiler.profilermodel.impl.CycleImpl <em>Cycle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtend.profiler.profilermodel.impl.CycleImpl
	 * @see org.eclipse.xtend.profiler.profilermodel.impl.ModelPackageImpl#getCycle()
	 * @generated
	 */
	int CYCLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE__NAME = CALLABLE__NAME;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE__TIME = CALLABLE__TIME;

	/**
	 * The feature id for the '<em><b>Child Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE__CHILD_TIME = CALLABLE__CHILD_TIME;

	/**
	 * The feature id for the '<em><b>Self Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE__SELF_TIME = CALLABLE__SELF_TIME;

	/**
	 * The feature id for the '<em><b>Outbound Child Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE__OUTBOUND_CHILD_TIME = CALLABLE__OUTBOUND_CHILD_TIME;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE__ITEMS = CALLABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Call Count Inbound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE__CALL_COUNT_INBOUND = CALLABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Call Count Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE__CALL_COUNT_REENTRANT = CALLABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outgoing Call Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE__OUTGOING_CALL_GROUPS = CALLABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Cycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_FEATURE_COUNT = CALLABLE_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.profiler.profilermodel.ProfilingResult <em>Profiling Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profiling Result</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.ProfilingResult
	 * @generated
	 */
	EClass getProfilingResult();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.profiler.profilermodel.ProfilingResult#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.ProfilingResult#getItems()
	 * @see #getProfilingResult()
	 * @generated
	 */
	EReference getProfilingResult_Items();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.profiler.profilermodel.ProfilingResult#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.ProfilingResult#getTime()
	 * @see #getProfilingResult()
	 * @generated
	 */
	EAttribute getProfilingResult_Time();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.profiler.profilermodel.ProfilingResult#getCycles <em>Cycles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cycles</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.ProfilingResult#getCycles()
	 * @see #getProfilingResult()
	 * @generated
	 */
	EReference getProfilingResult_Cycles();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.xtend.profiler.profilermodel.ProfilingResult#getRootItems <em>Root Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Root Items</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.ProfilingResult#getRootItems()
	 * @see #getProfilingResult()
	 * @generated
	 */
	EReference getProfilingResult_RootItems();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.profiler.profilermodel.CallGroup <em>Call Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Group</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.CallGroup
	 * @generated
	 */
	EClass getCallGroup();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtend.profiler.profilermodel.CallGroup#getInvoker <em>Invoker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoker</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.CallGroup#getInvoker()
	 * @see #getCallGroup()
	 * @generated
	 */
	EReference getCallGroup_Invoker();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtend.profiler.profilermodel.CallGroup#getSubroutine <em>Subroutine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subroutine</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.CallGroup#getSubroutine()
	 * @see #getCallGroup()
	 * @generated
	 */
	EReference getCallGroup_Subroutine();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.profiler.profilermodel.CallGroup#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.CallGroup#getCount()
	 * @see #getCallGroup()
	 * @generated
	 */
	EAttribute getCallGroup_Count();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.profiler.profilermodel.CallGroup#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.CallGroup#getTime()
	 * @see #getCallGroup()
	 * @generated
	 */
	EAttribute getCallGroup_Time();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.profiler.profilermodel.Callable <em>Callable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.Callable
	 * @generated
	 */
	EClass getCallable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.profiler.profilermodel.Callable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.Callable#getName()
	 * @see #getCallable()
	 * @generated
	 */
	EAttribute getCallable_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.profiler.profilermodel.Callable#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.Callable#getTime()
	 * @see #getCallable()
	 * @generated
	 */
	EAttribute getCallable_Time();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.profiler.profilermodel.Callable#getChildTime <em>Child Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Child Time</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.Callable#getChildTime()
	 * @see #getCallable()
	 * @generated
	 */
	EAttribute getCallable_ChildTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.profiler.profilermodel.Callable#getSelfTime <em>Self Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Time</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.Callable#getSelfTime()
	 * @see #getCallable()
	 * @generated
	 */
	EAttribute getCallable_SelfTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.profiler.profilermodel.Callable#getOutboundChildTime <em>Outbound Child Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outbound Child Time</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.Callable#getOutboundChildTime()
	 * @see #getCallable()
	 * @generated
	 */
	EAttribute getCallable_OutboundChildTime();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.profiler.profilermodel.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.profiler.profilermodel.Item#getItemName <em>Item Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Name</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.Item#getItemName()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_ItemName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.profiler.profilermodel.Item#getItemTime <em>Item Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Time</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.Item#getItemTime()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_ItemTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.profiler.profilermodel.Item#getCallCount <em>Call Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Call Count</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.Item#getCallCount()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_CallCount();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.xtend.profiler.profilermodel.Item#getSubroutines <em>Subroutines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subroutines</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.Item#getSubroutines()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Subroutines();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.xtend.profiler.profilermodel.Item#getInvocations <em>Invocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invocations</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.Item#getInvocations()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Invocations();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtend.profiler.profilermodel.Item#getCycle <em>Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cycle</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.Item#getCycle()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Cycle();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.xtend.profiler.profilermodel.Item#getInboundInvocations <em>Inbound Invocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inbound Invocations</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.Item#getInboundInvocations()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_InboundInvocations();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.profiler.profilermodel.Cycle <em>Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cycle</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.Cycle
	 * @generated
	 */
	EClass getCycle();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.xtend.profiler.profilermodel.Cycle#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Items</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.Cycle#getItems()
	 * @see #getCycle()
	 * @generated
	 */
	EReference getCycle_Items();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.profiler.profilermodel.Cycle#getCallCountInbound <em>Call Count Inbound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Call Count Inbound</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.Cycle#getCallCountInbound()
	 * @see #getCycle()
	 * @generated
	 */
	EAttribute getCycle_CallCountInbound();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.profiler.profilermodel.Cycle#getCallCountReentrant <em>Call Count Reentrant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Call Count Reentrant</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.Cycle#getCallCountReentrant()
	 * @see #getCycle()
	 * @generated
	 */
	EAttribute getCycle_CallCountReentrant();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.xtend.profiler.profilermodel.Cycle#getOutgoingCallGroups <em>Outgoing Call Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Call Groups</em>'.
	 * @see org.eclipse.xtend.profiler.profilermodel.Cycle#getOutgoingCallGroups()
	 * @see #getCycle()
	 * @generated
	 */
	EReference getCycle_OutgoingCallGroups();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.xtend.profiler.profilermodel.impl.ProfilingResultImpl <em>Profiling Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtend.profiler.profilermodel.impl.ProfilingResultImpl
		 * @see org.eclipse.xtend.profiler.profilermodel.impl.ModelPackageImpl#getProfilingResult()
		 * @generated
		 */
		EClass PROFILING_RESULT = eINSTANCE.getProfilingResult();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILING_RESULT__ITEMS = eINSTANCE.getProfilingResult_Items();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILING_RESULT__TIME = eINSTANCE.getProfilingResult_Time();

		/**
		 * The meta object literal for the '<em><b>Cycles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILING_RESULT__CYCLES = eINSTANCE.getProfilingResult_Cycles();

		/**
		 * The meta object literal for the '<em><b>Root Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILING_RESULT__ROOT_ITEMS = eINSTANCE.getProfilingResult_RootItems();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtend.profiler.profilermodel.impl.CallGroupImpl <em>Call Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtend.profiler.profilermodel.impl.CallGroupImpl
		 * @see org.eclipse.xtend.profiler.profilermodel.impl.ModelPackageImpl#getCallGroup()
		 * @generated
		 */
		EClass CALL_GROUP = eINSTANCE.getCallGroup();

		/**
		 * The meta object literal for the '<em><b>Invoker</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_GROUP__INVOKER = eINSTANCE.getCallGroup_Invoker();

		/**
		 * The meta object literal for the '<em><b>Subroutine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_GROUP__SUBROUTINE = eINSTANCE.getCallGroup_Subroutine();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_GROUP__COUNT = eINSTANCE.getCallGroup_Count();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_GROUP__TIME = eINSTANCE.getCallGroup_Time();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtend.profiler.profilermodel.impl.CallableImpl <em>Callable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtend.profiler.profilermodel.impl.CallableImpl
		 * @see org.eclipse.xtend.profiler.profilermodel.impl.ModelPackageImpl#getCallable()
		 * @generated
		 */
		EClass CALLABLE = eINSTANCE.getCallable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLABLE__NAME = eINSTANCE.getCallable_Name();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLABLE__TIME = eINSTANCE.getCallable_Time();

		/**
		 * The meta object literal for the '<em><b>Child Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLABLE__CHILD_TIME = eINSTANCE.getCallable_ChildTime();

		/**
		 * The meta object literal for the '<em><b>Self Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLABLE__SELF_TIME = eINSTANCE.getCallable_SelfTime();

		/**
		 * The meta object literal for the '<em><b>Outbound Child Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLABLE__OUTBOUND_CHILD_TIME = eINSTANCE.getCallable_OutboundChildTime();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtend.profiler.profilermodel.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtend.profiler.profilermodel.impl.ItemImpl
		 * @see org.eclipse.xtend.profiler.profilermodel.impl.ModelPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Item Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ITEM_NAME = eINSTANCE.getItem_ItemName();

		/**
		 * The meta object literal for the '<em><b>Item Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ITEM_TIME = eINSTANCE.getItem_ItemTime();

		/**
		 * The meta object literal for the '<em><b>Call Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__CALL_COUNT = eINSTANCE.getItem_CallCount();

		/**
		 * The meta object literal for the '<em><b>Subroutines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__SUBROUTINES = eINSTANCE.getItem_Subroutines();

		/**
		 * The meta object literal for the '<em><b>Invocations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__INVOCATIONS = eINSTANCE.getItem_Invocations();

		/**
		 * The meta object literal for the '<em><b>Cycle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__CYCLE = eINSTANCE.getItem_Cycle();

		/**
		 * The meta object literal for the '<em><b>Inbound Invocations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__INBOUND_INVOCATIONS = eINSTANCE.getItem_InboundInvocations();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtend.profiler.profilermodel.impl.CycleImpl <em>Cycle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtend.profiler.profilermodel.impl.CycleImpl
		 * @see org.eclipse.xtend.profiler.profilermodel.impl.ModelPackageImpl#getCycle()
		 * @generated
		 */
		EClass CYCLE = eINSTANCE.getCycle();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYCLE__ITEMS = eINSTANCE.getCycle_Items();

		/**
		 * The meta object literal for the '<em><b>Call Count Inbound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYCLE__CALL_COUNT_INBOUND = eINSTANCE.getCycle_CallCountInbound();

		/**
		 * The meta object literal for the '<em><b>Call Count Reentrant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYCLE__CALL_COUNT_REENTRANT = eINSTANCE.getCycle_CallCountReentrant();

		/**
		 * The meta object literal for the '<em><b>Outgoing Call Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYCLE__OUTGOING_CALL_GROUPS = eINSTANCE.getCycle_OutgoingCallGroups();

	}

} //ModelPackage
