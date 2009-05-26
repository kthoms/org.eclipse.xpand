/*******************************************************************************
 * Copyright (c) 2005 - 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.xtend.typesystem.xsd.tests.xmlprocessor;

import java.util.Map;

import org.eclipse.xtend.typesystem.xsd.tests.AbstractTestCase;

/**
 * @author Moritz Eysholdt - Initial contribution
 */
public class XMLProcessorTest extends AbstractTestCase {

	@SuppressWarnings("unchecked")
	public void testBeautify() {
		Map<String, String> p = createWFParams();
		p.put("file", "Loadcurve-Ugly.xml");
		runWorkflow("XMLProcessor-Beautify.oaw", p);
	}

	@SuppressWarnings("unchecked")
	public void testBeautifyXpand() {
		Map<String, String> p = createWFParams();
		p.put("file", "Loadcurve");
		p.put("out", "Loadcurve.xml");
		runWorkflow("XMLBeautifier.oaw", p);
	}

	@SuppressWarnings("unchecked")
	public void testBeautifyXpandIgnored() {
		Map<String, String> p = createWFParams();
		p.put("file", "Loadcurve");
		p.put("out", "Loadcurve.ignored");
		runWorkflow("XMLBeautifier.oaw", p);
	}

	public void testDTDInclusion() {
		runWorkflow("DTDInclusion.oaw");
	}
	
	public void testSchemaInclusion() {
		runWorkflow("SchemaInclusion.oaw");
	}

}
