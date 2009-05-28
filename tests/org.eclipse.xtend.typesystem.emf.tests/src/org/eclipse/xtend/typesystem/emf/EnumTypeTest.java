/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.typesystem.emf;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.ExpressionFacade;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.Type;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;

public class EnumTypeTest extends TestCase {
	private EmfRegistryMetaModel mm;
	private ExecutionContextImpl ctx;
	private ExpressionFacade ec;

	@Override
    protected void setUp() throws Exception {
		super.setUp();
		EPackage pack = EcoreFactory.eINSTANCE.createEPackage();
		pack.setName("test1");
		pack.setNsURI("http://test/ecore");
		
		EClass clazz = EcoreFactory.eINSTANCE.createEClass();
		clazz.setName("AClass");
		
		EEnum eenum = EcoreFactory.eINSTANCE.createEEnum();
		eenum.setName("MyEnum");
		
		EEnumLiteral lit1 = EcoreFactory.eINSTANCE.createEEnumLiteral();
		lit1.setName("ONE");
		eenum.getELiterals().add(lit1);
		EEnumLiteral lit2 = EcoreFactory.eINSTANCE.createEEnumLiteral();
		lit2.setName("TWO");
		eenum.getELiterals().add(lit2);
		pack.getEClassifiers().add(clazz);
		pack.getEClassifiers().add(eenum);
		EAttribute attr = EcoreFactory.eINSTANCE.createEAttribute();
		attr.setName("enum");
		attr.setEType(eenum);
		clazz.getEStructuralFeatures().add(attr);
		EPackage.Registry.INSTANCE.put(pack.getNsURI(), pack);
		
		mm = new EmfRegistryMetaModel();
		ctx = new ExecutionContextImpl();
		ctx.registerMetaModel(mm);
		ec = new ExpressionFacade(ctx);
	}

	public final void testSimple() {
		EObject obj = (EObject) ec.evaluate("test1::AClass.newInstance()");
		assertNotNull(obj);
		ec = (ExpressionFacade) ec.cloneWithVariable(new Variable("obj", obj));
		System.out.println(EPackage.Registry.INSTANCE.values());
		ec.evaluate("obj.setEnum(test1::MyEnum::ONE)");
		assertEquals(Boolean.TRUE, ec.evaluate("obj.enum == test1::MyEnum::ONE"));
		assertEquals(Boolean.TRUE, ec.evaluate("obj.enum != test1::MyEnum::TWO"));
		ec.evaluate("obj.setEnum(test1::MyEnum::TWO)");
		assertEquals(Boolean.TRUE, ec.evaluate("obj.enum == test1::MyEnum::TWO"));
		assertEquals(Boolean.TRUE, ec.evaluate("obj.enum != test1::MyEnum::ONE"));

		Type t = ec.getExecContext().getType(ec.evaluate("test1::MyEnum::ONE"));
		assertEquals("test1::MyEnum", t.getName());

	}
	
	public void testMetaType() throws Exception {
		Type a = (Type) ec.evaluate("test1::MyEnum::ONE.metaType");
		Type b = (Type) ec.evaluate("test1::MyEnum");
		assertTrue(a==b);
	}
}
