/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of M2T/Xpand and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of M2T/Xpand - initial API and implementation
 *******************************************************************************/package org.eclipse.xpand.internal.tests;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.eclipse.xpand2.XpandUtil;

public class XpandUtilTest extends TestCase{

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
