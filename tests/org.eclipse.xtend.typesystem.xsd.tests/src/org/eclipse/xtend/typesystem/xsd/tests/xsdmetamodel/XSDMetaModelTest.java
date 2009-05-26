/*******************************************************************************
 * Copyright (c) 2005 - 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.xtend.typesystem.xsd.tests.xsdmetamodel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.internal.xtend.type.baseimpl.types.ListTypeImpl;
import org.eclipse.internal.xtend.type.baseimpl.types.StringTypeImpl;
import org.eclipse.xtend.expression.TypeSystemImpl;
import org.eclipse.xtend.typesystem.Callable;
import org.eclipse.xtend.typesystem.Type;
import org.eclipse.xtend.typesystem.emf.EClassType;
import org.eclipse.xtend.typesystem.xsd.XSDMetaModel;
import org.eclipse.xtend.typesystem.xsd.tests.AbstractTestCase;
import org.eclipse.xtend.typesystem.xsd.type.XMLFeatureMapTypeImpl;

/**
 * @author Moritz Eysholdt - Initial contribution
 */
public class XSDMetaModelTest extends AbstractTestCase {

	private final static String NS_LOADCURVE = "http://www.eclipse.org/modeling/xpand/example/model/loadcurve";
	private final static String NS_DEVICE = "http://www.eclipse.org/modeling/xpand/example/model/device";

	public void testSimpleXSDInClasspath() {
		final XSDMetaModel mm = new XSDMetaModel();
		mm.addSchemaFile(getSrcDir() + "/Loadcurve.xsd");
		assertNSLoaded(mm, NS_LOADCURVE);
	}

	// this is supposed to work as soon as
	// https://bugs.eclipse.org/bugs/show_bug.cgi?id=212661
	// is fixed.
	public void testSimpleXSDInProjectPath() {
		final XSDMetaModel mm = new XSDMetaModel();
		mm.addSchemaFile(getPluginDir() + "/Loadcurve.xsd");
		assertNSLoaded(mm, NS_LOADCURVE);
	}

	public void testTwoXSDsByImportReference() {
		final XSDMetaModel mm = new XSDMetaModel();
		mm.addSchemaFile(getSrcDir() + "/Device.xsd");
		assertNSLoaded(mm, NS_LOADCURVE, NS_DEVICE);
		assertCorrectReferenceInDevicePkg(mm);
	}

	public void testTwoXSDsByList1() {
		final XSDMetaModel mm = new XSDMetaModel();
		mm.addSchemaFile(getSrcDir() + "/Loadcurve.xsd");
		mm.addSchemaFile(getSrcDir() + "/Device-Noschemalocation.xsd");
		assertNSLoaded(mm, NS_LOADCURVE);
		assertCorrectReferenceInDevicePkg(mm);
	}

	public void testTwoXSDsByList2() {
		final XSDMetaModel mm = new XSDMetaModel();
		mm.addSchemaFile(getSrcDir() + "/Loadcurve.xsd");
		mm.addSchemaFile(getSrcDir() + "/Device-Noimport.xsd");
		assertNSLoaded(mm, NS_LOADCURVE, NS_DEVICE);
		assertCorrectReferenceInDevicePkg(mm);
	}

	public void testStringType() {
		final XSDMetaModel mm = new XSDMetaModel();
		mm.setTypeSystem(new TypeSystemImpl());
		mm.addSchemaFile(getSrcDir() + "/Loadcurve.xsd");
		assertNSLoaded(mm, NS_LOADCURVE);
		EPackage pkg = getByNS(mm, NS_LOADCURVE);
		EClass lc = (EClass) pkg.getEClassifier("LoadCurve");
		EAttribute feat = (EAttribute) lc.getEStructuralFeature("description");
		EClassifier ec = feat.getEType();
		Type t = mm.getTypeForEClassifier(ec);
		assertTrue("StringTypeImpl expected, got: " + t.getClass().getName(),
				t instanceof StringTypeImpl);
	}

	public void testTypeMappingForSimpleTypes() {
		final String NS = "http://www.example.org/simpletypes";
		final XSDMetaModel mm = new XSDMetaModel();
		mm.setTypeSystem(new TypeSystemImpl());
		mm.addSchemaFile(getSrcDir() + "/Simpletypes.xsd");
		assertNSLoaded(mm, NS);
		// EPackage pkg = getByNS(mm, NS);
		// TODO: check it the types have been loaded correctly
	}

	public void testTypeFeatureMaps() {
		final String NS = "http://www.example.org/schema";
		final XSDMetaModel mm = new XSDMetaModel();
		mm.setTypeSystem(new TypeSystemImpl());
		mm.addSchemaFile(getSrcDir() + "/Featuremap.xsd");
		assertNSLoaded(mm, NS);
		Type type = mm.getTypeForName("featuremap::BodyType");
		assertTrue(type instanceof EClassType);
		Callable call = ((EClassType) type).getFeature("mixed", new Type[0]);
		assertNotNull(call);
		Type mixed = call.getReturnType();
		assertTrue(mixed instanceof XMLFeatureMapTypeImpl);
		XMLFeatureMapTypeImpl map = (XMLFeatureMapTypeImpl) mixed;
		for (Callable c : map.getAllFeatures())
			System.out.println(c);
	}

	@SuppressWarnings("unchecked")
	public void testReadFeatureMaps() {
		Map<String, String> params = createWFParams();
		params.put("file", getSrcDir() + "/Featuremap.xml");
		params.put("useDocRoot", "false");
		runWorkflow("Workflow-Featuremap.oaw", params);
		// EObject model = (EObject) runner.getContext().get("model");
		// EStructuralFeature bodyf =
		// model.eClass().getEStructuralFeature("Body");
		// System.out.println(model.eClass().getName());
		// assertNotNull(bodyf);
		// EObject body = (EObject) model.eGet(bodyf);
		// System.out.println(body);
		// TODO: implementieren
	}

	@SuppressWarnings("unchecked")
	public void testReadFeatureMapsEmpty() {
		Map<String, String> params = createWFParams();
		params.put("file", getSrcDir() + "/Featuremap.xml");
		params.put("useDocRoot", "false");
		runWorkflow("Workflow-Featuremap-Empty.oaw", params);
		// EObject model = (EObject) runner.getContext().get("model");
		// EStructuralFeature bodyf =
		// model.eClass().getEStructuralFeature("Body");
		// System.out.println(model.eClass().getName());
		// assertNotNull(bodyf);
		// EObject body = (EObject) model.eGet(bodyf);
		// System.out.println(body);
		// TODO: implementieren
	}

	public void testForTypesystemCachingBug() {
		TypeSystemImpl ts = new TypeSystemImpl();
		ts.registerMetaModel(new XSDMetaModel());
		EObject cls = EcoreFactory.eINSTANCE.createEObject();

		Type t1 = ts.getType(new ArrayList<Object>());
		Type t2 = ts.getType(new BasicFeatureMap((InternalEObject) cls, 1));
		assertTrue(t1 instanceof ListTypeImpl);
		assertTrue(t2 instanceof XMLFeatureMapTypeImpl);
		assertTrue(t1 != t2);
	}

	@SuppressWarnings("unchecked")
	public void testRegisterPkgGloballyTrue() {
		Map<String, String> params = createWFParams();
		params.put("global", "true");
		runWorkflow("Workflow-RegPkgGlobally.oaw", params);
		assertTrue(EPackage.Registry.INSTANCE
				.containsKey("http://www.eclipse.org/modeling/xpand/example/model/device"));
	}

	@SuppressWarnings("unchecked")
	public void testRegisterPkgGloballyFalse() {
		Map<String, String> params = createWFParams();
		params.put("global", "false");
		runWorkflow("Workflow-RegPkgGlobally.oaw", params);
		assertFalse(EPackage.Registry.INSTANCE
				.containsKey("http://www.eclipse.org/modeling/xpand/example/model/device"));
	}

	private EPackage getByNS(XSDMetaModel mm, String ns) {
		for (EPackage pkg : mm.allPackages())
			if (pkg.getNsURI().equals(ns))
				return pkg;
		return null;
	}

	private void assertCorrectReferenceInDevicePkg(XSDMetaModel mm) {
		final String MSG = "The reference 'loadCurve' from Class 'OperationalMode' has the wrong type.";
		EPackage dev = getByNS(mm, NS_DEVICE);
		EClass om = (EClass) dev.getEClassifier("OperationalMode");
		EStructuralFeature feat = om.getEStructuralFeature("loadCurve");
		assertTrue(MSG, feat instanceof EReference);
		EReference lc = (EReference) feat;
		EClass ref = lc.getEReferenceType();
		assertEquals(MSG, ref.getName(), "LoadCurve");
	}

	private void assertNSLoaded(XSDMetaModel mm, String... namespaces) {
		ArrayList<String> ns = new ArrayList<String>(Arrays.asList(namespaces));
		for (EPackage e : mm.allPackages())
			if (ns.contains(e.getNsURI()))
				ns.remove(e.getNsURI());
		assertEquals("Packages with these namespaces have not been loaded: "
				+ ns, ns.size(), 0);
	}

}
