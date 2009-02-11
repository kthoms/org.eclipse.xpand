/*******************************************************************************
 * Copyright (c) 005, 2007, 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.backend.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtend.backend.common.EfficientLazyString;

/**
 * Ported from org.eclipse.internal.xpand2.pr.util.FSIO to the backend
 * @author André Arnold
 */
public class FileHelper {

	private static final char[] FILE_DELIMITER = { '\\', '/' };

	private static int _cvNumerOfFilesRead = 1;

	private static int _cvSize = 2000;

	private static void getAllFilesInternal(final File aPath,
			final FilenameFilter filter, final List<File> fileList) {
		final File[] allFiles = aPath.listFiles (filter);
		for (int i = 0; i < allFiles.length; i++) {
			if (allFiles[i].isDirectory ())
				getAllFilesInternal (allFiles[i], filter, fileList);
			else
				fileList.add (allFiles[i]);
		}
	}

	public static String read (final String filename) throws IOException {
		if (filename == null)
			throw new IllegalArgumentException(
					"Fileparameter should not be null!");
		return read (new File(filename), null);
	}

	public static String read (final String filename, final String encoding) throws IOException {
		if (filename == null)
			throw new IllegalArgumentException(
					"Fileparameter should not be null!");
		return read (new File(filename), encoding);
	}

	public static String read (final File file, final String encoding) throws IOException {
		if (file == null)
			throw new IllegalArgumentException(
					"Fileparameter should not be null!");

		if (!file.isFile ())
			throw new IOException(file.getPath() + " is not a file!");
		if (!file.canRead ())
			throw new IOException(file.getPath() + " is not a readable!");

		final StringBuffer body = new StringBuffer ();
		Reader fileReader = null;
		{
			if (encoding == null) {
				fileReader = new FileReader (file);
			} else {
				fileReader = new InputStreamReader (new FileInputStream(file),
						encoding);
			}
		}
		final int size = (int) Math.floor ((double) _cvSize
				/ (double) _cvNumerOfFilesRead);
		_cvNumerOfFilesRead++;
		final char[] chars = new char[size];
		int len;
		while ((len = fileReader.read (chars)) != -1) {
			_cvSize += len;
			body.append(chars, 0, len);
		}
		fileReader.close();

		return body.toString();
	}

	/**
	 * 
	 * @param reader
	 * @return
	 * @throws IOException
	 */
	public static String read (final Reader reader) throws IOException {
		if (reader == null)
			throw new IllegalArgumentException("Reader must not be null!");

		final StringBuffer aString = new StringBuffer();

		final int size = (int) Math.floor ((double) _cvSize
				/ (double) _cvNumerOfFilesRead);
		_cvNumerOfFilesRead++;
		final char[] chars = new char[size];
		int len;
		while ((len = reader.read (chars)) != -1) {
			_cvSize += len;
			aString.append (chars, 0, len);
		}
		reader.close();

		return aString.toString();
	}

	/**
	 * 
	 * @param writer
	 * @param text
	 * @throws IOException
	 */
	public static void write (final Writer writer, EfficientLazyString text)
			throws IOException {
		if (writer == null)
			throw new IllegalArgumentException("Writer must not be null!");

		StringReader reader = new StringReader (text.toString());
		write (writer, reader);
	}

	/**
	 * 
	 * @param writer
	 * @param text
	 * @throws IOException
	 */
	public static void write (final Writer writer, CharSequence text)
			throws IOException {
		if (writer == null)
			throw new IllegalArgumentException ("Writer must not be null!");

		StringReader reader = new StringReader (text.toString());
		write (writer, reader);
	}

	/**
	 * 
	 * @param writer
	 * @param text
	 * @throws IOException
	 */
	public static void write (String path, CharSequence text)
			throws IOException {
		if (path == null)
			throw new IllegalArgumentException ("path must not be null!");
		Writer writer = new FileWriter (new File (path));
		StringReader reader = new StringReader (text.toString());
		write (writer, reader);
	}

	/**
	 * 
	 * @param writer
	 * @param text
	 * @throws IOException
	 */
	public static void write (final Writer writer, Reader reader)
			throws IOException {
		if (writer == null)
			throw new IllegalArgumentException("Writer must not be null!");

		final char[] chars = new char[4096];
		int len;
		while ((len = reader.read (chars)) != -1) {
			_cvSize += len;
			writer.write(chars, 0, len);
		}
		reader.close ();
		writer.close ();
	}

	public static File[] getAllFiles (final File file, final FilenameFilter filter) throws IOException {
		if (!file.isDirectory())
			throw new IOException(file.getPath() + " is not a directory!");
		final List<File> returnList = new ArrayList<File>();
		getAllFilesInternal(file, filter, returnList);
		return returnList.toArray(new File[returnList.size()]);
	}

	public static File[] getAllFilesInHierarchy (final String basePath, final FilenameFilter filter) throws IOException {
		return getAllFiles(new File(basePath), filter);
	}

	public static String normalizePath (String filename) {
		for (int i = 0; i < FILE_DELIMITER.length; i++) {
			filename = filename
					.replace(FILE_DELIMITER[i], File.separatorChar);
		}
		return filename;
	}

}
