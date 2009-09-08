/**
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * $Id: CallGroup.java,v 1.1 2009/09/08 09:39:40 hbehrens Exp $
 */
package org.eclipse.xtend.profiler.profilermodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.CallGroup#getInvoker <em>Invoker</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.CallGroup#getSubroutine <em>Subroutine</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.CallGroup#getCount <em>Count</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.CallGroup#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getCallGroup()
 * @model
 * @generated
 */
public interface CallGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Invoker</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtend.profiler.profilermodel.Item#getSubroutines <em>Subroutines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoker</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoker</em>' reference.
	 * @see #setInvoker(Item)
	 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getCallGroup_Invoker()
	 * @see org.eclipse.xtend.profiler.profilermodel.Item#getSubroutines
	 * @model opposite="Subroutines"
	 * @generated
	 */
	Item getInvoker();

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.profiler.profilermodel.CallGroup#getInvoker <em>Invoker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoker</em>' reference.
	 * @see #getInvoker()
	 * @generated
	 */
	void setInvoker(Item value);

	/**
	 * Returns the value of the '<em><b>Subroutine</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtend.profiler.profilermodel.Item#getInvocations <em>Invocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subroutine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subroutine</em>' reference.
	 * @see #setSubroutine(Item)
	 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getCallGroup_Subroutine()
	 * @see org.eclipse.xtend.profiler.profilermodel.Item#getInvocations
	 * @model opposite="invocations"
	 * @generated
	 */
	Item getSubroutine();

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.profiler.profilermodel.CallGroup#getSubroutine <em>Subroutine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subroutine</em>' reference.
	 * @see #getSubroutine()
	 * @generated
	 */
	void setSubroutine(Item value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getCallGroup_Count()
	 * @model
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.profiler.profilermodel.CallGroup#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(long)
	 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getCallGroup_Time()
	 * @model
	 * @generated
	 */
	long getTime();

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.profiler.profilermodel.CallGroup#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(long value);

} // CallGroup
