/**
 * <copyright> 
 *
 * Copyright (c) 2002-2007 itemis AG and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   itemis AG - Initial API and implementation
 *
 * </copyright>
 *
 */
package org.eclipse.xpand3.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;

/**
 * @author Sven Efftinge
 * 
 */
public class ClassLoaderLoaderImpl implements Loader {

	private ClassLoader classLoader;

	/**
	 * @param contextClassLoader
	 */
	public ClassLoaderLoaderImpl(ClassLoader contextClassLoader) {
		this.classLoader = contextClassLoader;
	}

	public URL getResource(String name) {
		return classLoader.getResource(name);
	}

	public InputStream getResourceAsStream(String name) {
		return classLoader.getResourceAsStream(name);
	}

	public Enumeration<URL> getResources(String name) {
		try {
			return classLoader.getResources(name);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public Class<?> loadClass(String name) {
		try {
			return classLoader.loadClass(name);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * @return the class loader
	 */
	public ClassLoader getClassLoader() {
		return classLoader;
	}

}