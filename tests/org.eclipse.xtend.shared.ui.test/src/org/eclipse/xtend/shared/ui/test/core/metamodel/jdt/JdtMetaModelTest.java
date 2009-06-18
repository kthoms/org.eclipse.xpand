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
package org.eclipse.xtend.shared.ui.test.core.metamodel.jdt;

import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.xtend.expression.ExpressionFacade;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.core.IXtendXpandProject;
import org.eclipse.xtend.shared.ui.core.metamodel.jdt.JdtMetaModel;
import org.eclipse.xtend.shared.ui.core.metamodel.jdt.javabean.JdtJavaBeanTypeStrategy;
import org.eclipse.xtend.shared.ui.expression.XpandPluginExecutionContext;
import org.eclipse.xtend.shared.ui.test.PluginTestBase;
import org.eclipse.xtend.typesystem.Feature;
import org.eclipse.xtend.typesystem.Operation;
import org.eclipse.xtend.typesystem.ParameterizedType;
import org.eclipse.xtend.typesystem.Property;
import org.eclipse.xtend.typesystem.StaticProperty;
import org.eclipse.xtend.typesystem.Type;

/**
 * Tests the {@link JdtMetaModel}.
 * 
 * @author kthoms
 * @since 4.2
 */
public class JdtMetaModelTest extends PluginTestBase {
	private JdtMetaModel mm;
    private XpandPluginExecutionContext ctx;
    private IJavaProject project;
    private ExpressionFacade ef;
    private IPath pPath;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        
        // - Open an empty workspace
        // - create a Java project with standard classpath
        // - register the JdtMetaModel with JdtJavaBeanStrategy
        // - create the ExpressionFacade
        env.openEmptyWorkspace();
        pPath = env.addProject("test-"+System.currentTimeMillis());
        env.addExternalJars(pPath, env.getJavaClassLibs());
        project = env.getJavaProject(pPath);
        final IXtendXpandProject xp = Activator.getExtXptModelManager().findProject(pPath);
        ctx = new XpandPluginExecutionContext(xp);
        mm = new JdtMetaModel("DEFAULT", project, new JdtJavaBeanTypeStrategy(project));
        ctx.registerMetaModel(mm);
        ef = new ExpressionFacade(ctx);
    }

    
	/**
	 * Simple test to find J2SE classes via the JdtMetaModel
	 */
	public void testFindType () throws Exception {
		IType type = mm.findType(project, "java.util.ArrayList");
        assertNotNull(type);
        type = mm.findType(project, "java.net.SocketOptions");
        assertNotNull(type);
	}

	/**
	 * Tests resolving a Java Interface and a constant field from this interface.
	 */
	public void testResolveConstantFromInterface () throws Exception {
		checkConstant("java::net::SocketOptions", "IP_MULTICAST_IF", java.net.SocketOptions.IP_MULTICAST_IF);
	}
	
	public void testResolveProperty() throws Exception {
		Type type = (Type) ef.evaluate("javax::swing::JComponent");
		Property property = type.getProperty("registeredKeyStrokes");
		Type returnType = property.getReturnType();
		assertTrue(returnType instanceof ParameterizedType);
		ParameterizedType pt = (ParameterizedType) returnType;
		
		assertEquals(pt.getInnerType(), ef.evaluate("javax::swing::KeyStroke"));
	}
	
	/**
	 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=182869
	 */
	public void testResolveOperationFromInterface () throws Exception {
		Type type = (Type) ef.evaluate("java::text::StringCharacterIterator");
		Type intType = (Type) ef.evaluate("int");
		assertNotNull("Type 'java.text.StringCharacterIterator' not found", type);
		assertNotNull("int type not found", intType);

		Operation op = type.getOperation("setIndex", new Type[]{intType});
		assertNotNull("Operation 'setIndex' not found in type "+type, op);
	}

	public void testResolveConstantFromClass () throws Exception {
		checkConstant("java::sql::Types", "ARRAY", new Integer(java.sql.Types.ARRAY));
	}
	
	public void testResolveConstantFromEnumType () throws Exception {
		checkConstant("java::lang::annotation::ElementType", "FIELD", java.lang.annotation.ElementType.FIELD.name());
	}
	
	private void checkConstant (String typename, String fieldname, Object expectedValue) {
		Type type = (Type) ef.evaluate(typename);
		assertNotNull("Type '"+typename+"' not found", type);
		StaticProperty prop = type.getStaticProperty(fieldname);
		assertNotNull("Static property could not be resolved", prop);
		Object theConstant = ef.evaluate(typename+"::"+fieldname);
		if (expectedValue!=null) {
			assertNotNull("Evalution result of '"+typename+"::"+fieldname+"' must not be null.", theConstant);
			assertEquals(expectedValue.getClass(), theConstant.getClass());
			assertEquals(expectedValue, theConstant);
		} else {
			assertNull (theConstant);
		}
	}
	
	public void testCharAsIntConstantBug () throws Exception {
		IPath pack = env.addPackage(pPath, "mypack");
		env.addClass(pack, "ClassWithConstant", 
			"package mypack;"
			+"public class ClassWithConstant {"
			+"public static final int INTCONST1 = 2;"
			+"public static final String NULLSTRING;"
			+"public static final int INTCONST2 = '.';"
			+"}");
		env.fullBuild();
		checkConstant("mypack::ClassWithConstant", "INTCONST1", 2);
		checkConstant("mypack::ClassWithConstant", "NULLSTRING", null);

		// This is the bug:
		// The definition of INTCONST2 is valid, but the constant cannot be resolved
		// so the value will be null !!!
		checkConstant("mypack::ClassWithConstant", "INTCONST2", null);
	}
	
	public void testHierarchy() throws Exception {
		IPath pack = env.addPackage(pPath, "mypack");
		env.addClass(pack, "SubType", 
			"package mypack;"
			+"public interface SubType extends Super1, Super2{"
			+"public String getFoo();"
			+"}");
		env.addClass(pack, "Super1", 
				"package mypack;"
				+"public interface Super1 extends Super2 {"
				+"public String getSuper1();"
				+"}");
		env.addClass(pack, "Super2", 
				"package mypack;"
				+"public interface Super2 {"
				+"public String getSuper2();"
				+"}");
		env.fullBuild();
		
//		Type stringType = (Type) ef.evaluate("String");
		Type[] params = new Type[0];
		
		Type subType = (Type) ef.evaluate("mypack::SubType");
		
		assertEquals(2, subType.getSuperTypes().size());
		
		
		assertNotNull(subType.getFeature("foo",params));
		assertNotNull(subType.getFeature("super1",params));
		assertNotNull(subType.getFeature("super2",params));
		
		Type super1 = (Type) ef.evaluate("mypack::Super1");
		
		assertTrue(subType.getSuperTypes().contains(super1));
		assertNotNull(super1.getFeature("super1",params));
		assertNotNull(super1.getFeature("super2",params));
		
		Type super2 = (Type) ef.evaluate("mypack::Super2");
		
		assertTrue(subType.getSuperTypes().contains(super2));
		assertTrue(super1.getSuperTypes().contains(super2));
		assertNotNull(super2.getFeature("super2",params));
	}
	
	public void testParameterizedType() throws Exception {
		IPath pack = env.addPackage(pPath, "mypack");
		env.addClass(pack, "MyType", 
			"package mypack;"
			+"import java.util.HashSet;"
			+"public interface MyType {"
			+" public java.util.ArrayList<String> getList();"
			+" public HashSet<String> getSet();"
			+" public String[] getArray();"
			+"}");
		env.fullBuild();
		
		Type subType = (Type) ef.evaluate("mypack::MyType");
		Type[] params = new Type[0];
		Feature list = (Feature) subType.getFeature("list",params);
		assertEquals("String", ((ParameterizedType)list.getReturnType()).getInnerType().getName());
		Feature set = (Feature) subType.getFeature("set",params);
		assertEquals("String", ((ParameterizedType)set.getReturnType()).getInnerType().getName());
		Feature array = (Feature) subType.getFeature("array",params);
		assertEquals("String", ((ParameterizedType)array.getReturnType()).getInnerType().getName());
	}
	
}
