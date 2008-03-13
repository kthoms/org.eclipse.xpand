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

import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;

/**
 * @author Sven Efftinge
 * 
 */
public interface Loader {
	public URL getResource(String name);

	public InputStream getResourceAsStream(String name);

	public Enumeration<URL> getResources(String name);

	public Class<?> loadClass(String name);
}