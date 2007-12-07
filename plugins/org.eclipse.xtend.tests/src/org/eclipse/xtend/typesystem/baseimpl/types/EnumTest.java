package org.eclipse.xtend.typesystem.baseimpl.types;

import junit.framework.TestCase;

import org.eclipse.internal.xtend.type.impl.java.JavaMetaModel;
import org.eclipse.internal.xtend.type.impl.java.beans.JavaBeansStrategy;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.ExpressionFacade;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.Type;

public class EnumTest extends TestCase {
	private JavaMetaModel mm;
	private ExecutionContextImpl ctx;
	private ExpressionFacade ec;

	protected void setUp() throws Exception {
        mm = new JavaMetaModel ();
        mm.setTypeStrategy(new JavaBeansStrategy ());
		
		ctx = new ExecutionContextImpl();
		ctx.registerMetaModel(mm);
		ec = new ExpressionFacade(ctx);
	}

	public final void testSimple() {
		Object obj = new MyClass ();
        
		ec = ec.cloneWithVariable(new Variable("obj", obj));
        
        assertNull (ec.evaluate("obj.myStringAttribute"));
        ec.evaluate ("obj.setMyStringAttribute ('Hello')");
        assertEquals ("Hello", ec.evaluate("obj.myStringAttribute"));
        
		ec.evaluate("obj.setMyEnum(org::eclipse::xtend::typesystem::baseimpl::types::MyEnum::ONE)");
		assertEquals(Boolean.TRUE, ec.evaluate("obj.myEnum == org::eclipse::xtend::typesystem::baseimpl::types::MyEnum::ONE"));
		assertEquals(Boolean.TRUE, ec.evaluate("obj.myEnum != org::eclipse::xtend::typesystem::baseimpl::types::MyEnum::TWO"));
		ec.evaluate("obj.setMyEnum(org::eclipse::xtend::typesystem::baseimpl::types::MyEnum::TWO)");
		assertEquals(Boolean.TRUE, ec.evaluate("obj.myEnum == org::eclipse::xtend::typesystem::baseimpl::types::MyEnum::TWO"));
		assertEquals(Boolean.TRUE, ec.evaluate("obj.myEnum != org::eclipse::xtend::typesystem::baseimpl::types::MyEnum::ONE"));

		Type t = ec.getExecContext().getType(ec.evaluate("org::eclipse::xtend::typesystem::baseimpl::types::MyEnum::ONE"));
		assertEquals("org::eclipse::xtend::typesystem::baseimpl::types::MyEnum", t.getName());
	}
}
