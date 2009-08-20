/**
 * Copyright (c) 2005, 2009 eXXcellent solution gmbh and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Achim Demelt - initial API and implementation
 *
 * $Id: OutputFile.java,v 1.1 2009/08/20 12:04:23 ademelt Exp $
 */
package org.eclipse.xpand.incremental.trace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand.incremental.trace.OutputFile#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.eclipse.xpand.incremental.trace.OutputFile#getInputElements <em>Input Elements</em>}</li>
 *   <li>{@link org.eclipse.xpand.incremental.trace.OutputFile#getTargetObject <em>Target Object</em>}</li>
 *   <li>{@link org.eclipse.xpand.incremental.trace.OutputFile#getOutlet <em>Outlet</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand.incremental.trace.TracePackage#getOutputFile()
 * @model
 * @generated
 */
public interface OutputFile extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2009 eXXcellent solution gmbh and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n     Achim Demelt - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see org.eclipse.xpand.incremental.trace.TracePackage#getOutputFile_FileName()
	 * @model required="true"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand.incremental.trace.OutputFile#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Input Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xpand.incremental.trace.InputElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Elements</em>' containment reference list.
	 * @see org.eclipse.xpand.incremental.trace.TracePackage#getOutputFile_InputElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputElement> getInputElements();

	/**
	 * Returns the value of the '<em><b>Target Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Object</em>' reference.
	 * @see #setTargetObject(EObject)
	 * @see org.eclipse.xpand.incremental.trace.TracePackage#getOutputFile_TargetObject()
	 * @model required="true"
	 * @generated
	 */
	EObject getTargetObject();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand.incremental.trace.OutputFile#getTargetObject <em>Target Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Object</em>' reference.
	 * @see #getTargetObject()
	 * @generated
	 */
	void setTargetObject(EObject value);

	/**
	 * Returns the value of the '<em><b>Outlet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outlet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outlet</em>' attribute.
	 * @see #setOutlet(String)
	 * @see org.eclipse.xpand.incremental.trace.TracePackage#getOutputFile_Outlet()
	 * @model
	 * @generated
	 */
	String getOutlet();

	/**
	 * Sets the value of the '{@link org.eclipse.xpand.incremental.trace.OutputFile#getOutlet <em>Outlet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outlet</em>' attribute.
	 * @see #getOutlet()
	 * @generated
	 */
	void setOutlet(String value);

} // OutputFile
