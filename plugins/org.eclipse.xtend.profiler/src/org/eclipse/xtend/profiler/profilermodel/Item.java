/**
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * $Id: Item.java,v 1.1 2009/09/08 09:39:40 hbehrens Exp $
 */
package org.eclipse.xtend.profiler.profilermodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.Item#getItemName <em>Item Name</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.Item#getItemTime <em>Item Time</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.Item#getCallCount <em>Call Count</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.Item#getSubroutines <em>Subroutines</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.Item#getInvocations <em>Invocations</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.Item#getCycle <em>Cycle</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.Item#getInboundInvocations <em>Inbound Invocations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends Callable {
	/**
	 * Returns the value of the '<em><b>Item Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Name</em>' attribute.
	 * @see #setItemName(String)
	 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getItem_ItemName()
	 * @model default=""
	 * @generated
	 */
	String getItemName();

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.profiler.profilermodel.Item#getItemName <em>Item Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Name</em>' attribute.
	 * @see #getItemName()
	 * @generated
	 */
	void setItemName(String value);

	/**
	 * Returns the value of the '<em><b>Item Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Time</em>' attribute.
	 * @see #setItemTime(long)
	 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getItem_ItemTime()
	 * @model default="0"
	 * @generated
	 */
	long getItemTime();

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.profiler.profilermodel.Item#getItemTime <em>Item Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Time</em>' attribute.
	 * @see #getItemTime()
	 * @generated
	 */
	void setItemTime(long value);

	/**
	 * Returns the value of the '<em><b>Call Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Count</em>' attribute.
	 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getItem_CallCount()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getCallCount();

	/**
	 * Returns the value of the '<em><b>Subroutines</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.xtend.profiler.profilermodel.CallGroup}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtend.profiler.profilermodel.CallGroup#getInvoker <em>Invoker</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subroutines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subroutines</em>' reference list.
	 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getItem_Subroutines()
	 * @see org.eclipse.xtend.profiler.profilermodel.CallGroup#getInvoker
	 * @model opposite="Invoker"
	 * @generated
	 */
	EList<CallGroup> getSubroutines();

	/**
	 * Returns the value of the '<em><b>Invocations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.xtend.profiler.profilermodel.CallGroup}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtend.profiler.profilermodel.CallGroup#getSubroutine <em>Subroutine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invocations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocations</em>' reference list.
	 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getItem_Invocations()
	 * @see org.eclipse.xtend.profiler.profilermodel.CallGroup#getSubroutine
	 * @model opposite="Subroutine"
	 * @generated
	 */
	EList<CallGroup> getInvocations();

	/**
	 * Returns the value of the '<em><b>Cycle</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtend.profiler.profilermodel.Cycle#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cycle</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cycle</em>' reference.
	 * @see #setCycle(Cycle)
	 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getItem_Cycle()
	 * @see org.eclipse.xtend.profiler.profilermodel.Cycle#getItems
	 * @model opposite="Items"
	 * @generated
	 */
	Cycle getCycle();

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.profiler.profilermodel.Item#getCycle <em>Cycle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cycle</em>' reference.
	 * @see #getCycle()
	 * @generated
	 */
	void setCycle(Cycle value);

	/**
	 * Returns the value of the '<em><b>Inbound Invocations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.xtend.profiler.profilermodel.CallGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inbound Invocations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inbound Invocations</em>' reference list.
	 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getItem_InboundInvocations()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<CallGroup> getInboundInvocations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isSameCycle(Item item);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int getCallCountInCycle(Cycle cycle);

} // Item
