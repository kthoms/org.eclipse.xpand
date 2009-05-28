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
//FIXME


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
package org.eclipse.xpand.internal.tests.output;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;

import junit.framework.TestCase;

import org.eclipse.internal.xpand2.pr.util.FSIO;
import org.eclipse.xpand2.output.FileHandle;
import org.eclipse.xpand2.output.FileHandleImpl;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.XmlBeautifier;


public class XmlBeautifierTest extends TestCase {
    public void testIsXmlFile() {
        final XmlBeautifier b = new XmlBeautifier();
        b.setFileExtensions(new String[] { ".foo", ".bar" });

        assertTrue(b.isXmlFile("happe/bappe.foo"));
        assertFalse(b.isXmlFile("happe/bappe.xml"));
        assertTrue(b.isXmlFile("happe/bappe.bar"));
    }
    
    public void testBeautifyIso88591 () {
    	final XmlBeautifier b = new XmlBeautifier();
    	final Outlet outlet = new Outlet ();
    	outlet.setFileEncoding ("iso-8859-1");
    	final FileHandle fh = new FileHandleImpl (outlet, new File ("a.xml"));
    	
    	fh.setBuffer (readInput("test_iso-8859-1.xml", "iso-8859-1"));
    	b.beforeWriteAndClose(fh);
    	String formatted = fh.getBuffer().toString().replace (" standalone=\"no\"", ""); 

    	assertTrue (formatted.startsWith("<?xml version"));
    	// do the actual check without the header line because that depends on the JDK version
    	assertEquals (trim(readInput("test_iso-8859-1_beautified.xml", "iso-8859-1")), trim(formatted));
    }

    public void testBeautifyIso88591WithHeader () {
    	final XmlBeautifier b = new XmlBeautifier();
    	final Outlet outlet = new Outlet ();
    	outlet.setFileEncoding ("iso-8859-1");
    	final FileHandle fh = new FileHandleImpl (outlet, new File ("a.xml"));
    	
    	fh.setBuffer (readInput("test_iso-8859-1_header.xml", outlet.getFileEncoding()));
    	b.beforeWriteAndClose(fh);
    	String formatted = fh.getBuffer().toString().replace (" standalone=\"no\"", ""); 
    	
    	assertTrue (fh.getBuffer().toString().startsWith("<?xml version"));
    	// do the actual check without the header line because that depends on the JDK version
    	assertEquals (trim(readInput("test_iso-8859-1_beautified.xml", "iso-8859-1")), trim(formatted));
    }
    
    public void testBeautifyUtf8 () {
    	final XmlBeautifier b = new XmlBeautifier();
    	final Outlet outlet = new Outlet ();
    	outlet.setFileEncoding ("utf-8");
    	final FileHandle fh = new FileHandleImpl (outlet, new File ("a.xml"));
    	
    	fh.setBuffer (readInput("test_utf8.xml", "utf8"));
    	b.beforeWriteAndClose(fh);
    	String formatted = fh.getBuffer().toString().replace (" standalone=\"no\"", ""); 
    	
    	assertTrue (fh.getBuffer().toString().startsWith("<?xml version"));
    	// do the actual check without the header line because that depends on the JDK version
    	assertEquals (trim(readInput("test_utf8_beautified.xml", "utf8")), trim(formatted));
    }
    
    public void testBeautifyUtf8WithHeader () {
    	final XmlBeautifier b = new XmlBeautifier();
    	final Outlet outlet = new Outlet ();
    	outlet.setFileEncoding ("utf-8");
    	final FileHandle fh = new FileHandleImpl (outlet, new File ("a.xml"));
    	
    	fh.setBuffer (readInput("test_utf8_header.xml", "utf8"));
    	b.beforeWriteAndClose(fh);
    	String formatted = fh.getBuffer().toString().replace (" standalone=\"no\"", ""); 
    	
    	assertTrue (fh.getBuffer().toString().startsWith("<?xml version"));
    	// do the actual check without the header line because that depends on the JDK version
    	assertEquals (trim(readInput("test_utf8_beautified.xml", "utf8")), trim(formatted));
    }
    
    public void testBeautifyDefaultEncoding () {
    	final XmlBeautifier b = new XmlBeautifier();
    	final Outlet outlet = new Outlet ();
    	outlet.setFileEncoding("UTF-8");
    	final FileHandle fh = new FileHandleImpl (outlet, new File ("a.xml"));
    	
    	fh.setBuffer (readInput("test_defaultEncoding.xml", "utf8"));
    	b.beforeWriteAndClose(fh);
    	String formatted = fh.getBuffer().toString().replace (" standalone=\"no\"", ""); 
    	assertTrue (fh.getBuffer().toString().startsWith("<?xml version"));
    	
    	// do the actual check without the header line because that depends on the JDK version
    	assertEquals (readInput("test_defaultEncoding_beautified.xml", "utf8"), trim(formatted));
    }

    // TODO: FIX ME!
    public void testBug193113 () throws Exception {
    	final XmlBeautifier b = new XmlBeautifier();
    	final Outlet outlet = new Outlet ();
    	outlet.setFileEncoding ("utf-8");
    	final FileHandle fh = new FileHandleImpl (outlet, new File ("a.xml"));
    	
    	fh.setBuffer (readInput("bug193113_input.xml", "utf8"));
    	b.beforeWriteAndClose(fh);
    	String output = fh.getBuffer().toString();
    	
    	assertTrue("DOCTYPE got lost: "+output, output.contains("DOCTYPE hibernate-mapping"));
    }
    // TODO: FIX ME!
    public void testBug175488 () throws Exception {
    	final XmlBeautifier b = new XmlBeautifier();
    	final Outlet outlet = new Outlet ();
    	outlet.setFileEncoding ("utf-8");
    	final FileHandle fh = new FileHandleImpl (outlet, new File ("a.xml"));
    	
    	fh.setBuffer (readInput("bug175488_input.xml", "utf8"));
    	String expected = readInput("bug175488_beautified.xml", "utf8");
    	b.beforeWriteAndClose(fh);
    	String output = fh.getBuffer().toString();

    	assertEquals(expected, output);
    }
    
    private String readInput (String filename, String encoding) {
    	try {
	    	Reader r = new InputStreamReader(getClass().getResourceAsStream(filename), encoding);
	    	StringWriter w = new StringWriter();
			FSIO.writeSingleFile(w, r);
			return w.getBuffer().toString();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
    }
    
    private String trim (String s) {
    	return s.trim();    	
    }
}
