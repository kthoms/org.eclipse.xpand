package org.eclipse.emf.editor.provider;

/**
 * <copyright> 
 *
 * Copyright (c) 2008 itemis AG and others.
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

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.JarPackageFragmentRoot;
import org.eclipse.osgi.baseadaptor.BaseData;
import org.eclipse.osgi.framework.internal.core.BundleHost;
import org.eclipse.osgi.framework.internal.core.BundleURLConnection;
import org.osgi.framework.Bundle;

/**
 * Resolves a classpath URI to a file URI or platform:/resource URI.
 * 
 * A classpath URI has the following form:
 * 
 * <pre>
 *   classpath:/&lt;java package&gt;/&lt;resource file name&gt;
 * &lt;pre&gt;
 * </pre>
 * 
 * A classpath URI can only be resolved in the context of a classpath. This can
 * either be given
 * <ul>
 * <li>by a Java project in workspace
 * <li>by the global classloader of a standalone Java application.
 * </ul>
 * It can only be resolved if the referenced resource file can be located. It
 * does not matter if it is contained in a jar or exists as a plain file.
 * 
 * @author koehnlein
 */
@SuppressWarnings("restriction")
public class ClasspathUriResolver {

	public static final String CLASSPATH_SCHEME = "classpath";

	public URI resolve(ClassLoader classLoader, URI classpathUri) {
		try {
			if (isClasspathUri(classpathUri)) {
				return findResourceOnClasspath(classLoader, classpathUri);
			}
		}
		catch (Exception exc) {
			throw new ClasspathUriResolutionException(exc);
		}
		return classpathUri;
	}

	public URI resolve(IResource resource, URI classpathUri) {
		try {
			if (isClasspathUri(classpathUri)) {
				IProject project = resource.getProject();
				IJavaProject javaProject = JavaCore.create(project);
				return findResourceInWorkspace(javaProject, classpathUri);
			}
		}
		catch (Exception exc) {
			throw new ClasspathUriResolutionException(exc);
		}
		return classpathUri;
	}

	public URI resolve(IJavaElement javaElement, URI classpathUri) {
		try {
			if (isClasspathUri(classpathUri)) {
				IJavaProject javaProject = javaElement.getJavaProject();
				return findResourceInWorkspace(javaProject, classpathUri);
			}
		}
		catch (Exception exc) {
			throw new ClasspathUriResolutionException(exc);
		}
		return classpathUri;
	}

	public URI resolve(Bundle bundle, URI classpathUri) {
		try {
			if (isClasspathUri(classpathUri)) {
				return findResourceInBundle(bundle, classpathUri);
			}
		}
		catch (Exception exc) {
			throw new ClasspathUriResolutionException(exc);
		}
		return classpathUri;
	}

	public static boolean isClasspathUri(URI uri) {
		String scheme = uri.scheme();
		return CLASSPATH_SCHEME.equals(scheme);
	}

	private URI findResourceOnClasspath(ClassLoader classLoader, URI classpathUri) throws URISyntaxException {
		String pathAsString = classpathUri.path();
		if (classpathUri.hasAbsolutePath()) {
			pathAsString = pathAsString.substring(1);
		}
		URL resource = classLoader.getResource(pathAsString);
		URI fileUri = URI.createURI(resource.toURI().toString());
		return fileUri;
	}

	private URI findResourceInBundle(Bundle bundle, URI classpathUri) throws MalformedURLException, IOException {
		Path fullPath = new Path(classpathUri.path());
		if (bundle != null) {
			String projectRelativePath = "/" + fullPath;
			URL resourceUrl = bundle.getResource(projectRelativePath);
			if (resourceUrl != null) {
				String baseUrl = ((BaseData) ((BundleHost) bundle).getBundleData()).getBundleFile().getBaseFile()
						.toURL().toString();
				if (baseUrl.endsWith(".jar")) {
					baseUrl = "jar:" + baseUrl + "!/";
				}
				String localUrl = ((BundleURLConnection) resourceUrl.openConnection()).getLocalURL().toString();
				String platformPluginUri = bundle.getSymbolicName() + "/" + localUrl.substring(baseUrl.length());
				URI normalizedURI = URI.createPlatformPluginURI(platformPluginUri, true);
				return normalizedURI;
			}
		}
		return classpathUri;
	}

	private URI findResourceInWorkspace(IJavaProject javaProject, URI classpathUri) throws JavaModelException,
			CoreException {
		Path fullPath = new Path(classpathUri.path());
		String projectRelativePath = fullPath.toString();
		if (javaProject.exists()) {
			IPackageFragmentRoot[] allPackageFragmentRoots = javaProject.getAllPackageFragmentRoots();
			for (IPackageFragmentRoot packageFragmentRoot : allPackageFragmentRoots) {
				IResource correspondingResource = packageFragmentRoot.getCorrespondingResource();
				if (correspondingResource != null) {
					if (correspondingResource instanceof IFile) {
						// jar file
						JarPackageFragmentRoot jarPackageFragmentRoot = (JarPackageFragmentRoot) JavaCore
								.createJarPackageFragmentRootFrom((IFile) correspondingResource);
						if (jarPackageFragmentRoot != null) {
							ZipFile zipFile = jarPackageFragmentRoot.getJar();
							if (zipFile != null) {
								ZipEntry zipEntry = zipFile.getEntry(projectRelativePath.substring(1));
								if (zipEntry != null) {
									return URI.createURI("jar:" + "platform:/resource"
											+ correspondingResource.getFullPath() + "!" + projectRelativePath, true);
								}
							}
						}
					}
					else {
						// plain file
						IFolder rootFolder = (IFolder) correspondingResource;
						IResource modelFile = rootFolder.findMember(projectRelativePath);
						if (modelFile != null && modelFile.exists() && modelFile instanceof IFile) {
							URI platformResourceUri = URI.createPlatformResourceURI(modelFile.getFullPath().toString(),
									true);
							return platformResourceUri;
						}
					}
				}
			}
		}
		return classpathUri;
	}
}