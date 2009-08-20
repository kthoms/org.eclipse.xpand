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
 * $Id: Trace.java,v 1.1 2009/08/20 12:04:23 ademelt Exp $
 */
package org.eclipse.xpand.incremental.trace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpand.incremental.trace.Trace#getOutputFiles <em>Output Files</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpand.incremental.trace.TracePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2009 eXXcellent solution gmbh and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n     Achim Demelt - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Output Files</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xpand.incremental.trace.OutputFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Files</em>' containment reference list.
	 * @see org.eclipse.xpand.incremental.trace.TracePackage#getTrace_OutputFiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputFile> getOutputFiles();

} // Trace
