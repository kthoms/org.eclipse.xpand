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