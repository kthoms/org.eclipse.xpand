/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.xtend.typesystem.emf;

import java.io.IOException;
import java.util.Collections;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.typesystem.Operation;
import org.eclipse.xtend.typesystem.ParameterizedType;
import org.eclipse.xtend.typesystem.Property;
import org.eclipse.xtend.typesystem.Type;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;

public class EmfMetaModelTest extends TestCase {
	@Override
	protected void setUp() throws Exception {
		new StandaloneSetup().setPlatformUri("..");
	}
	
	public final void testEClassType() {
		final ExecutionContextImpl ctx = new ExecutionContextImpl();
		final EmfRegistryMetaModel mm = new EmfRegistryMetaModel();
		ctx.registerMetaModel(mm);
		final Type t = mm.getTypeForName("ecore::EClass");
		assertNotNull(t);
		assertEquals("ecore::EClass", t.getName());
		Property prop = t.getProperty("name");
		assertNotNull(prop);
		assertEquals(ctx.getStringType(), prop.getReturnType());

		prop = t.getProperty("eAllOperations");
		assertNotNull(prop);
		assertTrue(prop.getReturnType() instanceof ParameterizedType);
		assertEquals(mm.getTypeForName("ecore::EOperation"),
				((ParameterizedType) prop.getReturnType()).getInnerType());

		final Operation op = t.getOperation("getEStructuralFeature",
				new Type[] { ctx.getIntegerType() });
		assertNotNull(op);
		assertEquals(mm.getTypeForName("ecore::EStructuralFeature"), op
				.getReturnType());
	}

	public final void testEEnumType() {
		final ExecutionContextImpl ctx = new ExecutionContextImpl();
		final EPackage pack = EcoreFactory.eINSTANCE.createEPackage();
		pack.setName("test");
		pack.setNsPrefix("testMM");
		pack.setNsURI("http://ups/stuff");

		final EClass metaType = EcoreFactory.eINSTANCE.createEClass();
		metaType.setName("MetaType");

		final EEnum metaEnum = EcoreFactory.eINSTANCE.createEEnum();
		metaEnum.setName("MetaEnum");

		final EEnumLiteral lit = EcoreFactory.eINSTANCE.createEEnumLiteral();
		lit.setName("START");
		lit.setValue(1);
		metaEnum.getELiterals().add(lit);

		final EEnumLiteral lit1 = EcoreFactory.eINSTANCE.createEEnumLiteral();
		lit1.setName("END");
		lit1.setValue(2);
		metaEnum.getELiterals().add(lit1);

		EAttribute attr = EcoreFactory.eINSTANCE.createEAttribute();
		attr.setName("aProp");
		attr.setEType(metaEnum);
		metaType.getEStructuralFeatures().add(attr);

		attr = EcoreFactory.eINSTANCE.createEAttribute();
		attr.setName("aProp2");
		attr.setEType(EcorePackage.eINSTANCE.getEShort());
		metaType.getEStructuralFeatures().add(attr);

		pack.getEClassifiers().add(metaType);
		pack.getEClassifiers().add(metaEnum);

		// register mm
		EPackage.Registry.INSTANCE.put(pack.getNsURI(), pack);

		final EmfRegistryMetaModel mm = new EmfRegistryMetaModel();
		ctx.registerMetaModel(mm);
		assertNotNull(mm.getTypeForName("ecore::EClass"));
		final Type t = mm.getTypeForName("test::MetaType");
		assertNotNull(t);

		Property prop = t.getProperty("aProp");
		assertNotNull(prop);

		final EObject obj = (EObject) t.newInstance();
		assertNotNull(obj);
		prop.set(obj, lit);

		prop = t.getProperty("aProp2");
		assertNotNull(prop);
		prop.set(obj, new Long(4));

		assertEquals(mm.getTypeForEClassifier(metaEnum), mm.getType(lit));
		assertEquals(new Short((short) 4), prop.get(obj));

	}

	public final void testGetTypeForName() {
		final ExecutionContextImpl ctx = new ExecutionContextImpl();
		final EmfRegistryMetaModel mm = new EmfRegistryMetaModel();
		ctx.registerMetaModel(mm);
		assertNotNull(ctx.getTypeForName("ecore::EOperation"));
	}

	public final void testLoadMetaModelFile() throws IOException {
		final ExecutionContextImpl ctx = new ExecutionContextImpl();
		registerEPackagesOfModel("org.eclipse.xtend.typesystem.emf.tests/metamodels/subdir/model.xmi");
		EmfRegistryMetaModel mm = new EmfRegistryMetaModel();
		ctx.registerMetaModel(mm);
//		assertNotNull(ctx.getTypeForName("base::BaseType"));
		assertNotNull(ctx.getTypeForName("referee::SubAndReferring"));
		assertNotNull(ctx.getTypeForName("ecore::EClass"));
		assertNotNull(ctx.getTypeForName("nested::SubA"));

	}

	private void registerEPackagesOfModel(String string) throws IOException {
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.createResource(URI.createURI("platform:/plugin/"+string));
		r.load(Collections.EMPTY_MAP);
		EcoreUtil.resolveAll(rs);
		EPackage.Registry.INSTANCE.putAll(rs.getPackageRegistry());
	}
	
}
