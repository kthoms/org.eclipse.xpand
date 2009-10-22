/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.shared.ui.core.internal;

import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.sourcelookup.containers.ZipEntryStorage;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.ExternalPackageFragmentRoot;
import org.eclipse.jdt.internal.core.JarPackageFragmentRoot;
import org.eclipse.xtend.shared.ui.internal.XtendLog;

public class JDTUtil {

	private static final Pattern patternNamespace = Pattern.compile("::");
	private static final Pattern patternSlash = Pattern.compile("/");

	/**
	 * find the path for the oaw name space and extension
	 * 
	 * @param project
	 *            - the javaproject
	 * @param oawns
	 *            - oaw name space (i.e. 'my::xtend::File')
	 * @param ext
	 *            - file extension (i.e. 'ext')
	 * @return
	 */
	@SuppressWarnings("restriction")
	public static IStorage findStorage(IJavaProject project, ResourceID id,
			boolean searchJars) {
		IPath p = path(id);
		try {
			IPackageFragmentRoot[] roots = project.getPackageFragmentRoots();
			for (int i = 0; i < roots.length; i++) {
				IPackageFragmentRoot root = roots[i];
				if (!root.isArchive()) {

					IContainer rootFolder = null;
					IResource correspondingResource = root
							.getCorrespondingResource();
					if (correspondingResource instanceof IContainer) {
						rootFolder = (IFolder) correspondingResource;
					} else if (root instanceof ExternalPackageFragmentRoot) {
						IResource resource = ((ExternalPackageFragmentRoot) root)
								.resource();
						if (resource instanceof IFolder) {
							rootFolder = (IFolder) resource;
							IStorage member = (IStorage) rootFolder.findMember(p);
							if(member != null) {
								return member;
							}
						}
					}
					if (rootFolder != null) {
						IResource r = project.getProject().findMember(
								rootFolder.getProjectRelativePath().append(p));
						if (r instanceof IFile)
							return (IFile) r;
					}
				} else if (searchJars) {
					IStorage storage = loadFromJar(id, root);
					if (storage != null)
						return storage;
				}
			}
		} catch (JavaModelException e) {
			XtendLog.logInfo(e);
		}
		return null;
	}

	@SuppressWarnings("restriction")
	public static IStorage loadFromJar(ResourceID id, IPackageFragmentRoot root)
			throws JavaModelException {
		if (root instanceof JarPackageFragmentRoot) {
			JarPackageFragmentRoot jar = (JarPackageFragmentRoot) root;
			ZipFile zipFile;
			try {
				zipFile = jar.getJar();
			} catch (CoreException e) {
				XtendLog.logError(e);
				return null;
			}
			ZipEntry entry = zipFile.getEntry(id.toFileName());
			if (entry != null && zipFile != null) {
				return new ZipEntryStorage(zipFile, entry);
			}
		}
		return null;
	}

	public static ResourceID findXtendXpandResourceID(IJavaProject project,
			IStorage file) {
		if (file == null)
			return null;
		try {
			IPackageFragmentRoot[] roots = project.getPackageFragmentRoots();
			for (int i = 0; i < roots.length; i++) {
				IPackageFragmentRoot root = roots[i];
				if (root.getPath().isPrefixOf(file.getFullPath())) {
					IPath shortOne = file.getFullPath().removeFirstSegments(
							root.getPath().segmentCount());
					String ns = shortOne.removeFileExtension().toString();
					ns = patternSlash.matcher(ns).replaceAll("::");
					return new ResourceID(ns, shortOne.getFileExtension());
				}
			}
		} catch (JavaModelException e1) {
			XtendLog.logInfo(e1);
		}
		return null;
	}

	public static IJavaProject getJProject(IStorage s) {
		if (s instanceof IFile) {
			return JavaCore.create(((IFile) s).getProject());
		} else {
			IProject[] projects = ResourcesPlugin.getWorkspace().getRoot()
					.getProjects();
			for (int i = 0; i < projects.length; i++) {
				IProject project = projects[i];
				IJavaProject p = JavaCore.create(project);
				if (p.exists()) {
					IPackageFragmentRoot[] roots;
					try {
						roots = p.getPackageFragmentRoots();
						for (int j = 0; j < roots.length; j++) {
							IPackageFragmentRoot root = roots[j];
							if (root.getPath().isPrefixOf(s.getFullPath()))
								return p;
						}
					} catch (JavaModelException e) {
						XtendLog.logError(e);
					}
				}
			}
		}
		return null;
	}

	private static IPath path(ResourceID id) {
		return new Path(patternNamespace.matcher(id.name).replaceAll("/") + "."
				+ id.extension);
	}

	public static String getQualifiedName(IStorage source) {
		ResourceID id = findXtendXpandResourceID(getJProject(source), source);
		if (id != null)
			return id.name;
		return null;
	}

}
