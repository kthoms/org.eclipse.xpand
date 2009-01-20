package org.eclipse.xpand.internal.tests;

import junit.framework.Assert;

import org.eclipse.xpand2.XpandUtil;
import org.junit.Test;

public class XpandUtilTest {

	@Test
	public void testWithoutLastSegment () {
		final String[][] TEST = {
				{null, null},
				{"", null},
				{"org", null},
				{"org::eclipse", "org"},
				{"org::eclipse::xpand2", "org::eclipse"}
		};
		
		for (String[] data : TEST) {
			Assert.assertEquals(data[1], XpandUtil.withoutLastSegment(data[0]));
		}
	}

	@Test
	public void testGetLastSegment () {
		final String[][] TEST = {
				{null, null},
				{"", ""},
				{"org", "org"},
				{"org::eclipse", "eclipse"},
				{"org::eclipse::xpand2", "xpand2"}
		};
		
		for (String[] data : TEST) {
			Assert.assertEquals(data[1], XpandUtil.getLastSegment(data[0]));
		}
	}
}
