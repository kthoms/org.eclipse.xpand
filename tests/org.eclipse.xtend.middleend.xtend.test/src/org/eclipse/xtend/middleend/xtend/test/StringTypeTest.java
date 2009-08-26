package org.eclipse.xtend.middleend.xtend.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.eclipse.xtend.backend.BackendFacade;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.middleend.xtend.XtendBackendFacade;
import org.junit.Before;
import org.junit.Test;


public class StringTypeTest extends JavaXtendTest {
	
	@Before
	@Override
	public void setUp() throws Exception {
		super.setUp();
		_bc = XtendBackendFacade.createForFile ("org::eclipse::xtend::middleend::xtend::test::expressions", "iso-8859-1", _mms);;
		_ctx = BackendFacade.createExecutionContext (_bc.getFunctionDefContext(), _ts, true);
	}

	@Test
	public void testStringLength () {
		Long result = (Long)BackendFacade.invoke(_ctx, new QualifiedName ("testStringLength"), Arrays.asList ("Hello"));
		assertEquals(5L, result.longValue());
	}
	
	@Test
		public void testStringToLowerCase () {
			String result = (String)BackendFacade.invoke(_ctx, new QualifiedName ("testStringToLowerCase"), Arrays.asList ("This_IS_aLL_lowerCASE"));
			assertEquals("this_is_all_lowercase", result);
	}
	
	@Test
	public void testStringOpPlus () {
		CharSequence result = (CharSequence)BackendFacade.invoke(_ctx, new QualifiedName ("testStringOpPlus"), Arrays.asList ("con", "cat"));
		assertEquals("concat", result.toString());
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testStringToCharList () {
		List<String> result = (List<String>)BackendFacade.invoke(_ctx, new QualifiedName ("testStringToCharList"), Arrays.asList ("hello"));
		assertEquals(5L, result.size());
		assertEquals("h", result.get (0));
		assertEquals("e", result.get (1));
		assertEquals("l", result.get (2));
		assertEquals("l", result.get (3));
		assertEquals("o", result.get (4));
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testStringToFirstUpper () {
		String result = (String)BackendFacade.invoke(_ctx, new QualifiedName ("testStringToFirstUpper"), Arrays.asList ("hello"));
		assertEquals("Hello", result);
	}
	
	@Test
	public void testStringSubString () {
		String result = (String)BackendFacade.invoke(_ctx, new QualifiedName ("testStringSubString"), Arrays.asList ("HelloWorld", 2L, 8L));
		assertEquals("lloWor", result);
	}
	@Test
	public void testStringTrim () {
		String result = (String)BackendFacade.invoke(_ctx, new QualifiedName ("testStringTrim"), Arrays.asList ("\thello \n"));
		assertEquals("hello", result);
	}

	@Test
	public void testStringToFirstLower () {
		String result = (String)BackendFacade.invoke(_ctx, new QualifiedName ("testStringToFirstLower"), Arrays.asList ("Hello"));
		assertEquals("hello", result);
	}

	@Test
	public void testStringToUpperCase () {
		String result = (String)BackendFacade.invoke(_ctx, new QualifiedName ("testStringToUpperCase"), Arrays.asList ("This_IS_aLL_uPpErCASE"));
		assertEquals("THIS_IS_ALL_UPPERCASE", result);
	}
	@Test
	public void testStringSplit () {
		List<String> result = (List<String>)BackendFacade.invoke(_ctx, new QualifiedName ("testStringSplit"), Arrays.asList ("Say hello world!", "\\shello "));
		assertEquals(2L, result.size());
		assertEquals("Say", result.get (0));
		assertEquals("world!", result.get (1));
	}
	
	@Test
	public void testStringStartsWith () {
		Boolean result = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testStringStartsWith"), Arrays.asList ("Say hello world!", "Say"));
		assertTrue(result);
	}
	
	@Test
	public void testStringMatches () {
		Boolean result = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testStringMatches"), Arrays.asList ("Say hello world!", "Say\\s.*world!"));
		assertTrue(result);
	}
	
	@Test
	public void testStringAsInteger () {
		Long result = (Long)BackendFacade.invoke(_ctx, new QualifiedName ("testStringAsInteger"), Arrays.asList ("4"));
		assertEquals(4L, result.longValue());
	}
	
	@Test
	public void testStringContains () {
		Boolean result = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testStringContains"), Arrays.asList ("Say hello world!", "hello"));
		assertTrue(result);
	}
	
	@Test
	public void testStringEndsWith () {
		Boolean result = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testStringEndsWith"), Arrays.asList ("Say hello world!", "world!"));
		assertTrue(result);
	}
	
	@Test
	public void testStringReplaceFirst () {
		String result = (String)BackendFacade.invoke(_ctx, new QualifiedName ("testStringReplaceFirst"), Arrays.asList ("Say hello world!", "\\s", "_"));
		assertEquals ("Say_hello world!", result);
	}
	
	@Test
	public void testStringReplaceAll () {
		String result = (String)BackendFacade.invoke(_ctx, new QualifiedName ("testStringReplaceAll"), Arrays.asList ("Say hello world!", "\\s", "_"));
		assertEquals ("Say_hello_world!", result);
	}

}
