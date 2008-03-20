package org.eclipse.xpand3.middleend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.xpand3.middlend.Xpand3MiddleEndFactory;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.backend.types.CompositeTypesystem;
import org.eclipse.xtend.middleend.MiddleEnd;
import org.eclipse.xtend.middleend.MiddleEndFactory;
import org.eclipse.xtend.middleend.plugins.LanguageSpecificMiddleEnd;
import org.eclipse.xtend.middleend.plugins.LanguageSpecificMiddleEndFactory;

public class MiddleEndTest extends TestCase {

	public void testMiddleEnd() {
		LanguageSpecificMiddleEndFactory xpand3MiddleEndFactory = new Xpand3MiddleEndFactory();
		LanguageSpecificMiddleEnd xpand3MiddleEnd = xpand3MiddleEndFactory
				.create(null);
		BackendTypesystem backendTypesystem = new CompositeTypesystem();
		ArrayList<LanguageSpecificMiddleEnd> langSpecMiddleEnds = new ArrayList<LanguageSpecificMiddleEnd>();
		langSpecMiddleEnds.add(xpand3MiddleEnd);
		MiddleEnd middleEnd = MiddleEndFactory.create(backendTypesystem,
				langSpecMiddleEnds);

		BackendType backendTypeObject = backendTypesystem.getRootTypesystem()
				.findType("{builtin}Object");
		assertNotNull(backendTypeObject);

		FunctionDefContext functionDefContext = middleEnd
				.getFunctions("org/eclipse/xpand3/middleend/test");

		ExecutionContext executionContext = middleEnd.getExecutionContext();
		List<Object> params = Arrays.asList(new Object[] { "x", "y" });
		Object result = functionDefContext.invoke(executionContext, "foo",
				params);
		assertNotNull(result);
		assertFalse(((Boolean) result).booleanValue());

		Function function = functionDefContext.getMatch(executionContext,
				"foo", Arrays.asList(new BackendType[] { backendTypeObject,
						backendTypeObject }));
		assertNotNull(function);
		
		Object result2 = executionContext.getFunctionInvoker().invoke(
				executionContext, function, params);
		assertEquals(result, result2);

	}
}
