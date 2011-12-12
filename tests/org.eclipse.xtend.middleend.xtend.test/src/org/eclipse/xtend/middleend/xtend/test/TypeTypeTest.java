package org.eclipse.xtend.middleend.xtend.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

import junit.framework.Assert;

import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.backend.BackendFacade;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.common.Property;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.common.StaticProperty;
import org.eclipse.xtend.backend.types.builtin.StringType;
import org.eclipse.xtend.middleend.xtend.XtendBackendFacade;
import org.eclipse.xtend.middleend.xtend.internal.xtendlib.XtendLibNames;
import org.eclipse.xtend.type.impl.java.JavaMetaModel;
import org.eclipse.xtend.typesystem.Operation;
import org.junit.Before;
import org.junit.Test;


public class TypeTypeTest extends JavaXtendTest {

	@Before
	@Override
	public void setUp() throws Exception {
		super.setUp();
		_bc = XtendBackendFacade.createForFile ("org::eclipse::xtend::middleend::xtend::test::expressions", "iso-8859-1", _mms);;
		_ctx = BackendFacade.createExecutionContext (_bc.getFunctionDefContext(), _ts, true);
	}

	@Test
	public void testTypeName () {
		String result = (String)BackendFacade.invoke(_ctx, new QualifiedName ("testTypeName"), Arrays.asList (_person));
		assertEquals("org::eclipse::xtend::middleend::xtend::test::Person", result);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testAllStaticProperties () {
		Set<StaticProperty> result = (Set<StaticProperty>)BackendFacade.invoke(_ctx, new QualifiedName ("testAllStaticProperties"), Arrays.asList (_person));
		assertEquals(1L, result.size());
		for (StaticProperty staticProperty : result) {
			assertEquals("staticProperty", (String)staticProperty.get());
			assertEquals("org::eclipse::xtend::middleend::xtend::test::Person", staticProperty.getOwner().getName());
		}
	}

	@Test
	public void testDocumentation () {
		String result = (String)BackendFacade.invoke(_ctx, new QualifiedName ("testDocumentation"), Arrays.asList (_person));
		assertEquals("", result);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testAllFeatures () {
		Set<Object> result = (Set<Object>)BackendFacade.invoke(_ctx, new QualifiedName ("testAllFeatures"), Arrays.asList (_person));
		Assert.assertTrue(result.size() >= 19);
	}

	@Test
	public void testAllFeaturesNames () {
		Set<Property> result = (Set<Property>)BackendFacade.invoke(_ctx, new QualifiedName ("testAllFeatureNames"), Arrays.asList (_person));
		assertTrue (result.contains("metaType"));
		assertTrue (result.contains("name"));
		assertTrue (result.contains("firstName"));
		assertTrue (result.contains("mother"));
		assertTrue (result.contains("A_STATIC_PROPERTY"));
		assertTrue (result.contains("call"));
		assertTrue (result.contains("equals"));
		assertTrue (result.contains("hashCode"));
		assertTrue (result.contains("retrieveTheFullName"));
		assertTrue (result.contains("setFirstName"));
		assertTrue (result.contains("setName"));
		assertTrue (result.contains("toString"));
		assertTrue (result.contains("!="));
		assertTrue (result.contains("<"));
		assertTrue (result.contains("<="));
		assertTrue (result.contains(">="));
		assertTrue (result.contains(">"));
		assertTrue (result.contains("=="));
		assertTrue (result.contains("compareTo"));
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testAllOperations () {
		Set<NamedFunction> result = (Set<NamedFunction>)BackendFacade.invoke(_ctx, new QualifiedName ("testAllOperations"), Arrays.asList (_person));
		assertTrue(result.size() >= 14);
		for (NamedFunction namedFunction : result) {
			if (namedFunction.getName().getFullQualifiedName().equals(XtendLibNames.OPERATION_NAME))
				fail("There should be no operation " + XtendLibNames.OPERATION_NAME);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testAllOperationNames () {
		Set<String> result = (Set<String>)BackendFacade.invoke(_ctx, new QualifiedName ("testAllOperationNames"), Arrays.asList (_person));
		assertTrue (result.contains("call"));
		assertTrue (result.contains("equals"));
		assertTrue (result.contains("hashCode"));
		assertTrue (result.contains("retrieveTheFullName"));
		assertTrue (result.contains("setFirstName"));
		assertTrue (result.contains("setName"));
		assertTrue (result.contains("toString"));
		assertTrue (result.contains("!="));
		assertTrue (result.contains("<"));
		assertTrue (result.contains("<="));
		assertTrue (result.contains(">="));
		assertTrue (result.contains(">"));
		assertTrue (result.contains("=="));
		assertTrue (result.contains("compareTo"));
		assertFalse (result.contains(XtendLibNames.OPERATION_NAME));
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testAllOperationsOld () {
		XtendFacade facade = XtendFacade.create("org::eclipse::xtend::middleend::xtend::test::expressions");
		facade.registerMetaModel(new JavaMetaModel());
		Set<Operation> result = (Set<Operation>)facade.call("testAllOperations", Arrays.asList (_person));
		assertEquals(18L, result.size());
	}

	@Test
	public void testAllProperties () {
		Set<Property> result = (Set<Property>)BackendFacade.invoke(_ctx, new QualifiedName ("testAllProperties"), Arrays.asList (_person));
		assertEquals(4L, result.size());
	}

	@Test
	public void testAllPropertyNames () {
		Set<String> result = (Set<String>)BackendFacade.invoke(_ctx, new QualifiedName ("testAllPropertyNames"), Arrays.asList (_person));
		assertTrue (result.contains("name"));
		assertTrue (result.contains("firstName"));
		assertTrue (result.contains("mother"));
		assertTrue (result.contains("metaType"));
		assertFalse (result.contains("XtendMetaType"));
	}
	
	@Test
	public void testAllPropertyNamesOld () {
		XtendFacade facade = XtendFacade.create("org::eclipse::xtend::middleend::xtend::test::expressions");
		facade.registerMetaModel(new JavaMetaModel());
		Set<String> result = null;
		try {
			result = (Set<String>)facade.call("testAllPropertyNames", Arrays.asList (_person));
			assertTrue (result.contains("name"));
			assertTrue (result.contains("firstName"));
			assertTrue (result.contains("mother"));
			assertTrue (result.contains("metaType"));
			assertFalse (result.contains("XtendMetaType"));
		} catch (Exception e) {
		}

	}

	@Test
	public void testSuperTypes () {
		Version v = new Version();
		Set<BackendType> result = (Set<BackendType>)BackendFacade.invoke(_ctx, new QualifiedName ("testSuperTypes"), Arrays.asList (v));
		assertEquals(1L, result.size());
		Iterator<BackendType> it = result.iterator();
		assertEquals("org::eclipse::xtend::middleend::xtend::test::Field", it.next().getName());
	}

	@Test
	public void testGetStaticProperty () {
		
	}

	@Test
	public void testGetFeature () {
		NamedFunction result1 = (NamedFunction)BackendFacade.invoke(_ctx, new QualifiedName ("testGetFeature"), Arrays.asList (_person, "call", Arrays.asList(StringType.INSTANCE)));
		assertEquals ("call", result1.getName().getSimpleName());
		Object result2 = BackendFacade.invoke(_ctx, new QualifiedName ("testGetFeature"), Arrays.asList (_person, "name", Arrays.asList()));
		if (result2 instanceof NamedFunction) {
			assertEquals ("name", ((NamedFunction)result2).getName().getSimpleName());
		} else if (result2 instanceof Property) {
			assertEquals ("name", ((Property)result2).getName());
		}
		StaticProperty result3 = (StaticProperty)BackendFacade.invoke(_ctx, new QualifiedName ("testGetFeature"), Arrays.asList (_person, "A_STATIC_PROPERTY", Arrays.asList()));
		assertEquals ("A_STATIC_PROPERTY", result3.getName());
	}

	@Test
	public void testGetOperation () {
		Person p = new Person ();
		p.setName ("Arnold");
		p.setFirstName ("André");
		NamedFunction result1 = (NamedFunction)BackendFacade.invoke(_ctx, new QualifiedName ("testGetOperation"), Arrays.asList (_person));
		assertEquals("called:call", _ctx.getFunctionInvoker().invoke(_ctx, result1.getFunction(), Arrays.asList(_person, "call")));
		Boolean result2 = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testGetOperationLess"), Arrays.asList (p, _person));
		assertTrue(result2);
	}
	@Test
	public void testGetOperationOld () {
		Person p = new Person ();
		p.setName ("Arnold");
		p.setFirstName ("André");
		XtendFacade facade = XtendFacade.create("org::eclipse::xtend::middleend::xtend::test::expressions");
		facade.registerMetaModel(new JavaMetaModel());
		Boolean result = null;
		try {
		result = (Boolean)facade.call("testGetOperationLess", Arrays.asList (p, _person));
		assertNull(result);
		} catch (Exception e) {
			//TODO verify if this is a bug in old Xtend
		}
	}

	@Test
	public void testGetProperty () {
		Property result = (Property)BackendFacade.invoke(_ctx, new QualifiedName ("testGetProperty"), Arrays.asList (_person, "name"));
		assertEquals ("name", result.getName());
		assertEquals("Testerossa", result.get(_ctx, _person));
	}
	
	@Test
	public void testIsInstance() {
		boolean result = (Boolean) BackendFacade.invoke (_ctx, new QualifiedName ("testIsInstance"), Arrays.asList (_person));
		assertTrue (result);
	}

	@Test
	public void testNewInstance () {
		Object result = BackendFacade.invoke (_ctx, new QualifiedName ("testNewInstance"), Arrays.asList (_person));
		assertTrue (result instanceof Person);
	}

	@Test
	public void testIsAssignableFrom () {
		Version v = new Version();
		Field f = new Field();
		boolean result1 = (Boolean) BackendFacade.invoke (_ctx, new QualifiedName ("testIsAssignableFrom"), Arrays.asList (f, v));
		assertTrue (result1);
		boolean result2 = (Boolean) BackendFacade.invoke (_ctx, new QualifiedName ("testIsAssignableFrom"), Arrays.asList (v, f));
		assertFalse (result2);
	}
	
}
