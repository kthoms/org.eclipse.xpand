/**
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * $Id: Cycle.java,v 1.1 2009/09/08 09:39:40 hbehrens Exp $
 */
package org.eclipse.xtend.profiler.profilermodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cycle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.Cycle#getItems <em>Items</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.Cycle#getCallCountInbound <em>Call Count Inbound</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.Cycle#getCallCountReentrant <em>Call Count Reentrant</em>}</li>
 *   <li>{@link org.eclipse.xtend.profiler.profilermodel.Cycle#getOutgoingCallGroups <em>Outgoing Call Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getCycle()
 * @model
 * @generated
 */
public interface Cycle extends Callable {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.xtend.profiler.profilermodel.Item}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtend.profiler.profilermodel.Item#getCycle <em>Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' reference list.
	 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getCycle_Items()
	 * @see org.eclipse.xtend.profiler.profilermodel.Item#getCycle
	 * @model opposite="Cycle"
	 * @generated
	 */
	EList<Item> getItems();

	/**
	 * Returns the value of the '<em><b>Call Count Inbound</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Count Inbound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Count Inbound</em>' attribute.
	 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getCycle_CallCountInbound()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getCallCountInbound();

	/**
	 * Returns the value of the '<em><b>Call Count Reentrant</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Count Reentrant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Count Reentrant</em>' attribute.
	 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getCycle_CallCountReentrant()
	 * @model default="0" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	int getCallCountReentrant();

	/**
	 * Returns the value of the '<em><b>Outgoing Call Groups</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.xtend.profiler.profilermodel.CallGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Call Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Call Groups</em>' reference list.
	 * @see org.eclipse.xtend.profiler.profilermodel.ModelPackage#getCycle_OutgoingCallGroups()
	 * @model changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<CallGroup> getOutgoingCallGroups();

} // Cycle
