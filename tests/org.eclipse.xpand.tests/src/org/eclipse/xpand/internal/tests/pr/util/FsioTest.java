/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xpand.internal.tests.pr.util;

import java.io.BufferedOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import junit.framework.TestCase;

import org.eclipse.internal.xpand2.pr.util.FSIO;

/**
 * @author Niko Stotz - Initial contribution and API 
 * @author Karsten Thoms - backport to JUnit 3
 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=356959
 */
public class FsioTest extends TestCase {

	public void testReadSingleFileFileString() throws IOException {
		File file = File.createTempFile("testReadSingleFileFileString", "tmp");
		file.deleteOnExit();
		BufferedOutputStream outputStream = new BufferedOutputStream(
				new FileOutputStream(file));
		long length = 0xfffff;
		outputStream.write(new byte[(int) length]);
		outputStream.close();

		long loopCount = 2 + Integer.MAX_VALUE / length;
		for (long i = 0; i < loopCount; i++) {
			try {
				FSIO.readSingleFile(file, "utf-8");
			} catch (NegativeArraySizeException ex) {
				fail("Found NegativeArraySizeException");
			}
		}

		assertTrue(true);
	}
	public void testReadSingleFileReader() throws IOException {
		long length = 0xfffff;

		long loopCount = 2 + Integer.MAX_VALUE / length;
		for (long i = 0; i < loopCount; i++) {
			try {
				CharArrayReader reader = new CharArrayReader(
						new char[(int) length]);
				FSIO.readSingleFile(reader);
			} catch (NegativeArraySizeException ex) {
				fail("Found NegativeArraySizeException");
			}
		}

		assertTrue(true);
	}
	public void testWriteSingleFileWriterReader() throws IOException {
		long length = 0xfffff;

		long loopCount = 2 + Integer.MAX_VALUE / length;
		for (long i = 0; i < loopCount; i++) {
			CharArrayReader reader = new CharArrayReader(new char[(int) length]);
			CharArrayWriter writer = new CharArrayWriter((int) length);
			FSIO.writeSingleFile(writer, reader);
		}
		try {
			CharArrayReader secondReader = new CharArrayReader(
					new char[(int) length]);
			FSIO.readSingleFile(secondReader);
		} catch (NegativeArraySizeException ex) {
			fail("Found NegativeArraySizeException");
		}

		assertTrue(true);
	}
}
