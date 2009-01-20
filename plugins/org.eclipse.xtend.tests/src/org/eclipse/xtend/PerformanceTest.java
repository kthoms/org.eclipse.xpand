package org.eclipse.xtend;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class PerformanceTest extends TestCase {
	@SuppressWarnings("unchecked")
	public void testPerformance() throws Exception {
		final XtendFacade f = XtendFacade.create("org::eclipse::xtend::Performance");
		
		List<Object> strings = new ArrayList<Object>();
		
		for (int i = 0; i < 200000; i++) {
			if (i%2==0) {
				strings.add(i);
			} else {
				strings.add("string"+i);
			}
		}
		long before = System.currentTimeMillis();
		List<Object> result = (List<Object>) f.call("doStuff", new Object[] { strings });
		long after = System.currentTimeMillis();
		long time = after-before;
		System.out.println(time);
		assertTrue(time<9000);
		assertEquals(strings,result);
	}
}
