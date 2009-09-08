/**
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * $Id: Callable.java,v 1.1 2009/09/08 09:39:40 hbehrens Exp $
 */
package org.eclipse.xtend.profiler.profilermodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Callable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.Callable#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.Callable#getTime <em>Time</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.Callable#getChildTime <em>Child Time</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.Callable#getSelfTime <em>Self Time</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.Callable#getOutboundChildTime <em>Outbound Child Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getCallable()
 * @model abstract="true"
 * @generated
 */
public interface Callable extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getCallable_Name()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

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
	 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getCallable_Time()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	long getTime();

	/**
	 * Returns the value of the '<em><b>Child Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Time</em>' attribute.
	 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getCallable_ChildTime()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	long getChildTime();

	/**
	 * Returns the value of the '<em><b>Self Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Self Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self Time</em>' attribute.
	 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getCallable_SelfTime()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	long getSelfTime();

	/**
	 * Returns the value of the '<em><b>Outbound Child Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outbound Child Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outbound Child Time</em>' attribute.
	 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getCallable_OutboundChildTime()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	long getOutboundChildTime();

} // Callable
