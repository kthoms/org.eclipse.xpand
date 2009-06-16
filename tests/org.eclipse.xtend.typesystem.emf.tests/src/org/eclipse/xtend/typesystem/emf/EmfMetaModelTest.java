/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.xtend.typesystem.emf;

import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.ExpressionFacade;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.Operation;
import org.eclipse.xtend.typesystem.ParameterizedType;
import org.eclipse.xtend.typesystem.Property;
import org.eclipse.xtend.typesystem.Type;

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
		assertEquals(mm.getTypeForName("ecore::EOperation"), ((ParameterizedType) prop.getReturnType()).getInnerType());

		final Operation op = t.getOperation("getEStructuralFeature", new Type[] { ctx.getIntegerType() });
		assertNotNull(op);
		assertEquals(mm.getTypeForName("ecore::EStructuralFeature"), op.getReturnType());
	}

	public void testSettingMultiValueDataType() throws Exception {
		EcoreFactory f = EcoreFactory.eINSTANCE;
		final EPackage pack = f.createEPackage();
		pack.setName("test");

		EClass clazz = f.createEClass();
		clazz.setName("AClass");
		pack.getEClassifiers().add(clazz);

		EAttribute attr = f.createEAttribute();
		attr.setName("multiString");
		attr.setEType(EcorePackage.eINSTANCE.getEString());
		attr.setUpperBound(-1);
		clazz.getEStructuralFeatures().add(attr);

		final ExecutionContextImpl ctx = new ExecutionContextImpl();
		final EmfRegistryMetaModel mm = new EmfRegistryMetaModel() {
			@Override
			protected EPackage[] allPackages() {
				return new EPackage[] { pack };
			}
		};
		ctx.registerMetaModel(mm);

		Type aClassType = mm.getTypeForName("test::AClass");
		assertNotNull(aClassType);
		Operation op = aClassType.getOperation("setMultiString", new Type[] { ctx.getListType(ctx.getStringType()) });
		assertNotNull(op);

		EObject aClassInstance = EcoreUtil.create(clazz);
		ExpressionFacade facade = new ExpressionFacade(ctx);
		facade = facade.cloneWithVariable(new Variable("aClassInstance", aClassInstance));
		assertEquals("0", "" + facade.evaluate("aClassInstance.multiString.size"));
		facade.evaluate("aClassInstance.multiString.add('foo')");
		assertEquals("1", "" + facade.evaluate("aClassInstance.multiString.size"));
		assertEquals("foo", "" + facade.evaluate("aClassInstance.multiString.first()"));
	}

	@SuppressWarnings("unchecked")
	public void testSetList() {
		EcoreFactory f = EcoreFactory.eINSTANCE;
		final EPackage pack = f.createEPackage();
		pack.setName("test");

		EClass clazz = f.createEClass();
		clazz.setName("AClass");
		pack.getEClassifiers().add(clazz);

		EAttribute attr = f.createEAttribute();
		attr.setName("multiA");
		attr.setEType(clazz);
		attr.setUpperBound(-1);
		clazz.getEStructuralFeatures().add(attr);

		final ExecutionContextImpl ctx = new ExecutionContextImpl();
		final EmfRegistryMetaModel mm = new EmfRegistryMetaModel() {
			@Override
			protected EPackage[] allPackages() {
				return new EPackage[] { pack };
			}
		};
		ctx.registerMetaModel(mm);

		Type aClassType = mm.getTypeForName("test::AClass");
		Operation op2 = aClassType.getOperation("setMultiA", new Type[] { ctx.getListType(aClassType) });
		assertNotNull(op2);

		EObject aObject = (EObject) aClassType.newInstance();
		Type listType = ctx.getListType(aClassType);
		final List<Object> l = (List<Object>) listType.newInstance();
		for (int i = 0; i < 5; i++) {
			l.add(aClassType.newInstance());
		}
		Object params[] = { l };
		op2.evaluate(aObject, params);
		
		List<Object> theList = (List<Object>) aObject.eGet(attr);
		assertEquals(5, theList.size());
		
		final List<Object> yetAnotherList = (List<Object>) listType.newInstance();
		for (int i = 0; i < 2; i++) {
			yetAnotherList.add(aClassType.newInstance());
		}
		Object params2[] = { yetAnotherList };
		op2.evaluate(aObject, params2);
		
		List<Object> anotherList = (List<Object>) aObject.eGet(attr);
		assertEquals(2, anotherList.size());

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

}
