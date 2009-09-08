/**
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * $Id: ProfilingResult.java,v 1.1 2009/09/08 09:39:40 hbehrens Exp $
 */
package org.eclipse.xtend.profiler.profilermodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profiling Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.ProfilingResult#getItems <em>Items</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.ProfilingResult#getTime <em>Time</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.ProfilingResult#getCycles <em>Cycles</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.ProfilingResult#getRootItems <em>Root Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getProfilingResult()
 * @model
 * @generated
 */
public interface ProfilingResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtend.profiler.profilermodel.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getProfilingResult_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getItems();

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getProfilingResult_Time()
	 * @model default="0" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	long getTime();

	/**
	 * Returns the value of the '<em><b>Cycles</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtend.profiler.profilermodel.Cycle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cycles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cycles</em>' containment reference list.
	 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getProfilingResult_Cycles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cycle> getCycles();

	/**
	 * Returns the value of the '<em><b>Root Items</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.xtend.profiler.profilermodel.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Items</em>' reference list.
	 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getProfilingResult_RootItems()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	EList<Item> getRootItems();

} // ProfilingResult
