/*******************************************************************************
 * Copyright (c) 2005 - 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.xtend.typesystem.xsd.tests.xmlreader;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend.typesystem.xsd.tests.AbstractTestCase;

/**
 * @author Moritz Eysholdt - Initial contribution
 */
public class XMLReaderTest extends AbstractTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		Iterator<String> i = EPackage.Registry.INSTANCE.keySet().iterator();
		while (i.hasNext())
			if (i.next().contains("www.eclipse.org/modeling/xpand/example"))
				i.remove();
	}

	@SuppressWarnings("unchecked")
	public void testSimpleWorkflow() {
		Map<String, String> params = createWFParams();
		params.put("file", getSrcDir() + "/Wash.xml");
		params.put("useDocRoot", "false");
		Object model = runWorkflow("Workflow-Simple.oaw", "model", params);
		assertWashXML((EObject) model);
	}

	// TODO: This throws a NPE because the reference from device to loadcurve
	// can not be resolved correctly. Stupid emf ignores that, which leads to an
	// object being an proxy instead of the desired EObject.

	// to resolve this, 'src/model' must be added to something like a "search
	// path"

	// public void testEcoreWorkflow() {
	// WorkflowRunner runner = new WorkflowRunner();
	// HashMap<String, String> params = new HashMap<String, String>();
	// params.put("file", "src/model/wash.xml");
	// params.put("useDocRoot", "false");
	// assertTrue(runner.run("workflow/workflow-ecore.oaw",
	// new NullProgressMonitor(), params, null));
	// Object model = runner.getContext().get("model");
	// assertWashXML((EObject) model);
	// }

	@SuppressWarnings("unchecked")
	public void testSimpleWorkflowWithDocroot() {
		Map<String, String> params = createWFParams();
		params.put("file", getSrcDir() + "/Wash.xml");
		params.put("useDocRoot", "true");
		EObject model = (EObject) runWorkflow("Workflow-Simple.oaw", "model",
				params);
		assertEquals(model.eClass().getName(), "DeviceDocumentRoot");
		EStructuralFeature dev = model.eClass().getEStructuralFeature("device");
		assertWashXML((EObject) model.eGet(dev));
	}

	@SuppressWarnings("unchecked")
	public void testPackageName1() {
		Map<String, String> params = createWFParams();
		params.put("file", getSrcDir() + "/Wash.xml");
		params.put("useDocRoot", "false");
		EObject model = (EObject) runWorkflow("Workflow-Simple.oaw", "model",
				params);
		assertWashXML(model);
		EPackage pkg = model.eClass().getEPackage();
		assertEquals(pkg.getName(), "device");
	}

	@SuppressWarnings("unchecked")
	public void testPackageNameSchemaimportSimple() {
		Map<String, String> params = createWFParams();
		params.put("file", getSrcDir() + "/Loadcurve-Schemalocation.xml");
		EObject model = (EObject) runWorkflow("Workflow-Schemalocation.oaw",
				"model", params);
		EPackage pkg = model.eClass().getEPackage();
		assertEquals("loadcurve", pkg.getName());
	}

	@SuppressWarnings("unchecked")
	public void testPackageNameSchemaimportDouble() {
		Map<String, String> params = createWFParams();
		params.put("file", getSrcDir()+ "/Wash-Schemalocation.xml");
		EObject model = (EObject) runWorkflow("Workflow-Schemalocation.oaw",
				"model", params);
		assertWashXML(model);
		EPackage pkg = model.eClass().getEPackage();
		assertEquals("device", pkg.getName());
		assertCorrectReferenceInDevicePkg(pkg);
	}

	private void assertCorrectReferenceInDevicePkg(EPackage dev) {
		final String MSG = "The reference 'loadCurve' from Class 'OperationalMode' has the wrong type.";
		EClass om = (EClass) dev.getEClassifier("OperationalMode");
		EStructuralFeature feat = om.getEStructuralFeature("loadCurve");
		assertTrue(MSG, feat instanceof EReference);
		EReference lc = (EReference) feat;
		EClass ref = lc.getEReferenceType();
		assertEquals(MSG, ref.getName(), "LoadCurve");
	}

	private void assertWashXML(EObject model) {
		EStructuralFeature namef = model.eClass().getEStructuralFeature("name");
		assertEquals(model.eGet(namef), "Magicwash");
	}

}
