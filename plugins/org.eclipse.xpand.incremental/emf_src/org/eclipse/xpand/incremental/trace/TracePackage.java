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
 * $Id: TracePackage.java,v 1.1 2009/08/20 12:04:23 ademelt Exp $
 */
package org.eclipse.xpand.incremental.trace;

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
 * @see org.eclipse.xpand.incremental.trace.TraceFactory
 * @model kind="package"
 * @generated
 */
public interface TracePackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2009 eXXcellent solution gmbh and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n     Achim Demelt - initial API and implementation";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "trace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/m2t/xpand/Trace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "trace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TracePackage eINSTANCE = org.eclipse.xpand.incremental.trace.impl.TracePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.xpand.incremental.trace.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand.incremental.trace.impl.TraceImpl
	 * @see org.eclipse.xpand.incremental.trace.impl.TracePackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 0;

	/**
	 * The feature id for the '<em><b>Output Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__OUTPUT_FILES = 0;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand.incremental.trace.impl.OutputFileImpl <em>Output File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand.incremental.trace.impl.OutputFileImpl
	 * @see org.eclipse.xpand.incremental.trace.impl.TracePackageImpl#getOutputFile()
	 * @generated
	 */
	int OUTPUT_FILE = 1;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FILE__FILE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Input Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FILE__INPUT_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Target Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FILE__TARGET_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Outlet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FILE__OUTLET = 3;

	/**
	 * The number of structural features of the '<em>Output File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FILE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.xpand.incremental.trace.impl.InputElementImpl <em>Input Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpand.incremental.trace.impl.InputElementImpl
	 * @see org.eclipse.xpand.incremental.trace.impl.TracePackageImpl#getInputElement()
	 * @generated
	 */
	int INPUT_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__MODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT__FEATURE = 1;

	/**
	 * The number of structural features of the '<em>Input Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand.incremental.trace.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see org.eclipse.xpand.incremental.trace.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand.incremental.trace.Trace#getOutputFiles <em>Output Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Files</em>'.
	 * @see org.eclipse.xpand.incremental.trace.Trace#getOutputFiles()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_OutputFiles();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand.incremental.trace.OutputFile <em>Output File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output File</em>'.
	 * @see org.eclipse.xpand.incremental.trace.OutputFile
	 * @generated
	 */
	EClass getOutputFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand.incremental.trace.OutputFile#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see org.eclipse.xpand.incremental.trace.OutputFile#getFileName()
	 * @see #getOutputFile()
	 * @generated
	 */
	EAttribute getOutputFile_FileName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpand.incremental.trace.OutputFile#getInputElements <em>Input Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Elements</em>'.
	 * @see org.eclipse.xpand.incremental.trace.OutputFile#getInputElements()
	 * @see #getOutputFile()
	 * @generated
	 */
	EReference getOutputFile_InputElements();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand.incremental.trace.OutputFile#getTargetObject <em>Target Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Object</em>'.
	 * @see org.eclipse.xpand.incremental.trace.OutputFile#getTargetObject()
	 * @see #getOutputFile()
	 * @generated
	 */
	EReference getOutputFile_TargetObject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpand.incremental.trace.OutputFile#getOutlet <em>Outlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outlet</em>'.
	 * @see org.eclipse.xpand.incremental.trace.OutputFile#getOutlet()
	 * @see #getOutputFile()
	 * @generated
	 */
	EAttribute getOutputFile_Outlet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpand.incremental.trace.InputElement <em>Input Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Element</em>'.
	 * @see org.eclipse.xpand.incremental.trace.InputElement
	 * @generated
	 */
	EClass getInputElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand.incremental.trace.InputElement#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Element</em>'.
	 * @see org.eclipse.xpand.incremental.trace.InputElement#getModelElement()
	 * @see #getInputElement()
	 * @generated
	 */
	EReference getInputElement_ModelElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpand.incremental.trace.InputElement#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.eclipse.xpand.incremental.trace.InputElement#getFeature()
	 * @see #getInputElement()
	 * @generated
	 */
	EReference getInputElement_Feature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TraceFactory getTraceFactory();

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
		 * The meta object literal for the '{@link org.eclipse.xpand.incremental.trace.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand.incremental.trace.impl.TraceImpl
		 * @see org.eclipse.xpand.incremental.trace.impl.TracePackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Output Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__OUTPUT_FILES = eINSTANCE.getTrace_OutputFiles();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand.incremental.trace.impl.OutputFileImpl <em>Output File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand.incremental.trace.impl.OutputFileImpl
		 * @see org.eclipse.xpand.incremental.trace.impl.TracePackageImpl#getOutputFile()
		 * @generated
		 */
		EClass OUTPUT_FILE = eINSTANCE.getOutputFile();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_FILE__FILE_NAME = eINSTANCE.getOutputFile_FileName();

		/**
		 * The meta object literal for the '<em><b>Input Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_FILE__INPUT_ELEMENTS = eINSTANCE
				.getOutputFile_InputElements();

		/**
		 * The meta object literal for the '<em><b>Target Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_FILE__TARGET_OBJECT = eINSTANCE
				.getOutputFile_TargetObject();

		/**
		 * The meta object literal for the '<em><b>Outlet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_FILE__OUTLET = eINSTANCE.getOutputFile_Outlet();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpand.incremental.trace.impl.InputElementImpl <em>Input Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpand.incremental.trace.impl.InputElementImpl
		 * @see org.eclipse.xpand.incremental.trace.impl.TracePackageImpl#getInputElement()
		 * @generated
		 */
		EClass INPUT_ELEMENT = eINSTANCE.getInputElement();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_ELEMENT__MODEL_ELEMENT = eINSTANCE
				.getInputElement_ModelElement();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_ELEMENT__FEATURE = eINSTANCE.getInputElement_Feature();

	}

} //TracePackage
