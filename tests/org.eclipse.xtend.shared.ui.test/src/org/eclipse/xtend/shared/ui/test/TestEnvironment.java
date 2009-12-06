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

package org.eclipse.xtend.shared.ui.test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceDescription;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.internal.xpand2.pr.util.FSIO;
import org.eclipse.jdt.core.IAccessRule;
import org.eclipse.jdt.core.IClasspathAttribute;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaModelMarker;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.ClasspathEntry;
import org.eclipse.jdt.internal.core.JavaProject;
import org.eclipse.ui.dialogs.IOverwriteQuery;
import org.eclipse.ui.wizards.datatransfer.ImportOperation;
import org.eclipse.ui.wizards.datatransfer.ZipFileStructureProvider;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.core.IModelMarker;

public class TestEnvironment {
	private boolean fIsOpen = false;

	private boolean fWasBuilt = false;

	private IWorkspace fWorkspace = null;

	private Hashtable<String, IProject> fProjects = null;

	private void addBuilderSpecs(final String projectName) {
		try {
			final IProject project = getProject(projectName);
			final IProjectDescription description = project.getDescription();
			description.setNatureIds(new String[] { JavaCore.NATURE_ID, Activator.getNatureId() });

			project.setDescription(description, null);
		}
		catch (final CoreException e) {
			handleCoreException(e);
		}
	}

	/**
	 * Adds a binary class with the given contents to the given package in the
	 * workspace. The package is created if necessary. If a class with the same
	 * name already exists, it is replaced. A workspace must be open, and the
	 * given class name must not end with ".class". Returns the path of the
	 * added class.
	 */
	public IPath addBinaryClass(final IPath packagePath, final String className, final byte[] contents) {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		final IPath classPath = packagePath.append(className + ".class"); //$NON-NLS-1$
		createFile(classPath, contents);
		return classPath;
	}

	/**
	 * Adds a binary class with the given contents to the given package in the
	 * workspace. The package is created if necessary. If a class with the same
	 * name already exists, it is replaced. A workspace must be open, and the
	 * given class name must not end with ".class". Returns the path of the
	 * added class.
	 */
	public IPath addBinaryClass(final IPath packageFragmentRootPath, final String packageName, final String className,
			final byte[] contents) {
		/* make sure the package exists */
		if (packageName != null && packageName.length() > 0) {
			final IPath packagePath = addPackage(packageFragmentRootPath, packageName);

			return addBinaryClass(packagePath, className, contents);
		}
		return addBinaryClass(packageFragmentRootPath, className, contents);

	}

	/**
	 * Adds a class with the given contents to the given package in the
	 * workspace. The package is created if necessary. If a class with the same
	 * name already exists, it is replaced. A workspace must be open, and the
	 * given class name must not end with ".java". Returns the path of the added
	 * class.
	 */
	public IPath addClass(final IPath packagePath, final String className, final String contents) {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		final IPath classPath = packagePath.append(className + ".java"); //$NON-NLS-1$
		createFile(classPath, contents.getBytes());
		return classPath;
	}

	/**
	 * Adds a class with the given contents to the given package in the
	 * workspace. The package is created if necessary. If a class with the same
	 * name already exists, it is replaced. A workspace must be open, and the
	 * given class name must not end with ".java". Returns the path of the added
	 * class.
	 */
	public IPath addClass(final IPath packageFragmentRootPath, final String packageName, final String className,
			final String contents) {
		/* make sure the package exists */
		if (packageName != null && packageName.length() > 0) {
			final IPath packagePath = addPackage(packageFragmentRootPath, packageName);

			return addClass(packagePath, className, contents);
		}
		return addClass(packageFragmentRootPath, className, contents);
	}

	/**
	 * Adds a package to the given package fragment root in the workspace. The
	 * package fragment root is created if necessary. If a package with the same
	 * name already exists, it is not replaced. A workspace must be open.
	 * Returns the path of the added package.
	 */
	public IPath addPackage(final IPath packageFragmentRootPath, final String packageName) {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		final IPath path = packageFragmentRootPath.append(packageName.replace('.', IPath.SEPARATOR));
		createFolder(path);
		return path;
	}

	public IPath addPackageFragmentRoot(final IPath projectPath, final String sourceFolderName)
			throws JavaModelException {
		return addPackageFragmentRoot(projectPath, sourceFolderName, null, null);
	}

	/**
	 * Adds a package fragment root to the workspace. If a package fragment root
	 * with the same name already exists, it is not replaced. A workspace must
	 * be open. Returns the path of the added package fragment root.
	 */
	public IPath addPackageFragmentRoot(final IPath projectPath, final String sourceFolderName,
			final IPath[] exclusionPatterns, final String specificOutputLocation) throws JavaModelException {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		final IPath path = getPackageFragmentRootPath(projectPath, sourceFolderName);
		createFolder(path);
		IPath outputPath = null;
		if (specificOutputLocation != null) {
			outputPath = getPackageFragmentRootPath(projectPath, specificOutputLocation);
			createFolder(outputPath);
		}
		final IClasspathEntry entry = JavaCore.newSourceEntry(path, exclusionPatterns == null ? new Path[0]
				: exclusionPatterns, outputPath);
		addEntry(projectPath, entry);
		return path;
	}

	public IPath addProject(final String projectName) throws JavaModelException {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		final IProject project = createProject(projectName);

		return project.getFullPath();
	}

	public void addRequiredProject(final IPath projectPath, final IPath requiredProjectPath) throws JavaModelException {
		addRequiredProject(projectPath, requiredProjectPath, new IPath[] {}/*
																			 * include
																			 * all
																			 */, new IPath[] {}/*
																								 * exclude
																								 * none
																								 */, false);
	}

	/**
	 * Adds a project to the classpath of a project.
	 */
	@SuppressWarnings("restriction")
	public void addRequiredProject(final IPath projectPath, final IPath requiredProjectPath,
			final IPath[] accessibleFiles, final IPath[] nonAccessibleFiles, final boolean isExported)
			throws JavaModelException {
		checkAssertion("required project must not be in project", !projectPath.isPrefixOf(requiredProjectPath)); //$NON-NLS-1$
		final IAccessRule[] accessRules = ClasspathEntry.getAccessRules(accessibleFiles, nonAccessibleFiles);
		addEntry(projectPath, JavaCore.newProjectEntry(requiredProjectPath, accessRules, true,
				new IClasspathAttribute[0], isExported));
	}

	public void addExternalJars(final IPath projectPath, final String[] jars) throws JavaModelException {
		addExternalJars(projectPath, jars, false);
	}

	public void addExternalJar(final IPath projectPath, final String jar) throws JavaModelException {
		addExternalJar(projectPath, jar, false);
	}

	/**
	 * Add the given folder to the list of source folders in the given Java
	 * Projekt
	 * 
	 * @param projectPath
	 *            Project to modify
	 * @param folder
	 *            Folder to add
	 */
	public IClasspathEntry addFolderToSourceFolders(final IPath projectPath, final IPath folder) {
		IClasspathEntry newSourceEntry = null;
		try {
			newSourceEntry = JavaCore.newSourceEntry(folder);
			addEntry(projectPath, newSourceEntry);
		}
		catch (final JavaModelException e) {
			e.printStackTrace();
			checkAssertion("JavaModelException", false); //$NON-NLS-1$
		}
		return newSourceEntry;
	}

	/**
	 * Adds an external jar to the classpath of a project.
	 */
	public void addExternalJars(final IPath projectPath, final String[] jars, final boolean isExported)
			throws JavaModelException {
		for (final String jar : jars) {
			checkAssertion("file name must end with .zip or .jar", jar.endsWith(".zip") || jar.endsWith(".jar")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			addEntry(projectPath, JavaCore.newLibraryEntry(new Path(jar), null, null, isExported));
		}
	}

	/**
	 * Adds an external jar to the classpath of a project.
	 */
	public void addExternalJar(final IPath projectPath, final String jar, final boolean isExported)
			throws JavaModelException {
		checkAssertion("file name must end with .zip or .jar", jar.endsWith(".zip") || jar.endsWith(".jar")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		addEntry(projectPath, JavaCore.newLibraryEntry(new Path(jar), null, null, isExported));
	}

	private void addEntry(final IPath projectPath, final IClasspathEntry entryPath) throws JavaModelException {
		final IClasspathEntry[] classpath = getClasspath(projectPath);
		final IClasspathEntry[] newClaspath = new IClasspathEntry[classpath.length + 1];
		System.arraycopy(classpath, 0, newClaspath, 0, classpath.length);
		newClaspath[classpath.length] = entryPath;
		setClasspath(projectPath, newClaspath);
	}

	/**
	 * Returns the class path.
	 */
	@SuppressWarnings("restriction")
	public IClasspathEntry[] getClasspath(final IPath projectPath) {
		try {
			checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
			final JavaProject javaProject = (JavaProject) JavaCore.create(getProject(projectPath));
			return javaProject.getExpandedClasspath();
		}
		catch (final JavaModelException e) {
			e.printStackTrace();
			checkAssertion("JavaModelException", false); //$NON-NLS-1$
			return null; // not reachable
		}
	}

	/**
	 * Adds a file.
	 */
	public IPath addFile(final IPath root, final String fileName, final String contents) {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		final IPath filePath = root.append(fileName);
		createFile(filePath, contents.getBytes());
		return filePath;
	}

	/**
	 * Adds a folder.
	 */
	public IPath addFolder(final IPath root, final String folderName) {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		final IPath folderPath = root.append(folderName);
		createFolder(folderPath);
		return folderPath;
	}

	public IPath addInternalJar(final IPath projectPath, final String zipName, final byte[] contents)
			throws JavaModelException {
		return addInternalJar(projectPath, zipName, contents, false);
	}

	/**
	 * Adds a jar with the given contents to the the workspace. If a jar with
	 * the same name already exists, it is replaced. A workspace must be open,
	 * and the given zip name must end with ".zip" or ".jar". Returns the path
	 * of the added jar.
	 */
	public IPath addInternalJar(final IPath projectPath, final String zipName, final byte[] contents,
			final boolean isExported) throws JavaModelException {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		checkAssertion("zipName must end with .zip or .jar", zipName.endsWith(".zip") || zipName.endsWith(".jar")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		final IPath path = projectPath.append(zipName);

		/* remove any existing zip from the java model */
		removeInternalJar(projectPath, zipName);

		createFile(path, contents);
		addEntry(projectPath, JavaCore.newLibraryEntry(path, null, null, isExported));
		return path;
	}

	private void checkAssertion(final String message, final boolean b) {
		if (!b)
			throw new RuntimeException(message);
	}

	/**
	 * Closes the testing environment and frees up any resources. Once the
	 * testing environment is closed, it shouldn't be used any more.
	 */
	public void close() {
		try {
			if (fProjects != null) {
				final Enumeration<String> projectNames = fProjects.keys();
				while (projectNames.hasMoreElements()) {
					final String projectName = projectNames.nextElement();
					getJavaProject(projectName).getJavaModel().close();
				}
			}
			closeWorkspace();
		}
		catch (final JavaModelException e) {
			e.printStackTrace();
		}
		catch (final RuntimeException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Close a project from the workspace.
	 */
	public void closeProject(final IPath projectPath) {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		try {
			getJavaProject(projectPath).getProject().close(null);
		}
		catch (final CoreException e) {
			e.printStackTrace();
		}
	}

	private void closeWorkspace() {
		fIsOpen = false;
		fWasBuilt = false;
	}

	private IFile createFile(final IPath path, final byte[] contents) {
		try {
			final IFile file = fWorkspace.getRoot().getFile(path);

			final ByteArrayInputStream is = new ByteArrayInputStream(contents);
			if (file.exists()) {
				file.setContents(is, true, false, null);
			}
			else {
				file.create(is, true, null);
			}
			return file;
		}
		catch (final CoreException e) {
			handle(e);
		}
		return null;
	}

	private IFolder createFolder(final IPath path) {
		checkAssertion("root", !path.isRoot()); //$NON-NLS-1$

		/* don't create folders for projects */
		if (path.segmentCount() <= 1)
			return null;

		final IFolder folder = fWorkspace.getRoot().getFolder(path);
		if (!folder.exists()) {
			/* create the parent folder if necessary */
			createFolder(path.removeLastSegments(1));

			try {
				folder.create(true, true, null);
			}
			catch (final CoreException e) {
				handle(e);
			}
		}
		return folder;
	}

	public IProject createProject(final String projectName) {
		IProject project = null;
		try {
			project = fWorkspace.getRoot().getProject(projectName);
			project.create(null, null);
			project.open(null);
			fProjects.put(projectName, project);
			addBuilderSpecs(projectName);
		}
		catch (final CoreException e) {
			handle(e);
		}

		return project;
	}

	/**
	 * Batch builds the workspace. A workspace must be open.
	 */
	public void fullBuild() {
		waitForAutoBuild();
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		try {
			getWorkspace().build(IncrementalProjectBuilder.FULL_BUILD, null);
		}
		catch (final CoreException e) {
			handle(e);
		}
		fWasBuilt = true;
	}

	/**
	 * Batch builds a project. A workspace must be open.
	 */
	public void fullBuild(final IPath projectPath) {
		waitForAutoBuild();
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		try {
			getProject(projectPath).build(IncrementalProjectBuilder.FULL_BUILD, null);
		}
		catch (final CoreException e) {
			handle(e);
		}
		fWasBuilt = true;
	}

	/**
	 * Returns the Java Model element for the project.
	 */
	public IJavaProject getJavaProject(final IPath projectPath) {
		final IJavaProject javaProject = JavaCore.create(getProject(projectPath));
		if (javaProject == null)
			throw new NullPointerException("No javaProject for path : " + projectPath.toPortableString());
		return javaProject;
	}

	/**
	 * Returns the Java Model element for the project.
	 */
	public IJavaProject getJavaProject(final String projectName) {
		final IJavaProject javaProject = JavaCore.create(getProject(projectName));
		if (javaProject == null)
			throw new NullPointerException("No javaProject for name : " + projectName);
		return javaProject;
	}

	/**
	 * Return output location for a project.
	 */
	public IPath getOutputLocation(final IPath projectPath) {
		try {
			final IJavaProject javaProject = JavaCore.create(getProject(projectPath));
			return javaProject.getOutputLocation();
		}
		catch (final CoreException e) {
			// ignore
		}
		return null;
	}

	/**
	 * Return all problems with workspace.
	 */
	public IMarker[] getMarkers() {
		return getMarkersFor(getWorkspaceRootPath());
	}

	/**
	 * Return all problems with the specified element.
	 */
	public IMarker[] getMarkersFor(final IPath path) {
		return getMarkersFor(path, false);
	}

	/**
	 * Return all problems with the specified element.
	 */
	public IMarker[] getMarkersFor(final IPath path, final boolean storeRange) {
		IResource resource;
		if (path.equals(getWorkspaceRootPath())) {
			resource = getWorkspace().getRoot();
		}
		else {
			final IProject p = getProject(path);
			if (p != null && path.equals(p.getFullPath())) {
				resource = getProject(path.lastSegment());
			}
			else if (path.getFileExtension() == null) {
				resource = getWorkspace().getRoot().getFolder(path);
			}
			else {
				resource = getWorkspace().getRoot().getFile(path);
			}
		}
		try {
			final ArrayList<IMarker> problems = new ArrayList<IMarker>();
			IMarker[] markers = resource.findMarkers(IModelMarker.PROBLEM, true, IResource.DEPTH_INFINITE);
			problems.addAll(Arrays.asList(markers));
			markers = resource.findMarkers(IModelMarker.WARNING, true, IResource.DEPTH_INFINITE);
			problems.addAll(Arrays.asList(markers));

			return problems.toArray(new IMarker[problems.size()]);
		}
		catch (final CoreException e) {
			// ignore
		}
		return new IMarker[0];
	}

	/**
	 * Return all problems with the specified element.
	 */
	public IMarker[] getTaskMarkersFor(final IPath path) {
		IResource resource = null;
		if (path.equals(getWorkspaceRootPath())) {
			resource = getWorkspace().getRoot();
		}
		else {
			final IProject p = getProject(path);
			if (p != null && path.equals(p.getFullPath())) {
				resource = getProject(path.lastSegment());
			}
			else if (path.getFileExtension() == null) {
				resource = getWorkspace().getRoot().getFolder(path);
			}
			else {
				resource = getWorkspace().getRoot().getFile(path);
			}
		}
		try {
			if (resource != null)
				return resource.findMarkers(IJavaModelMarker.TASK_MARKER, true, IResource.DEPTH_INFINITE);
		}
		catch (final CoreException e) {
			// ignore
		}
		return new IMarker[0];
	}

	/**
	 * Return the path of the package with the given name. A workspace must be
	 * open, and the package must exist.
	 */
	public IPath getPackagePath(final IPath root, final String packageName) {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		if (packageName.length() == 0)
			return root;
		return root.append(packageName.replace('.', IPath.SEPARATOR));
	}

	/**
	 * Return the path of the package fragment root with the given name. A
	 * workspace must be open, and the package fragment root must exist.
	 */
	public IPath getPackageFragmentRootPath(final IPath projectPath, final String name) {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		if (name.length() == 0)
			return projectPath;
		return projectPath.append(name);
	}

	/**
	 * Returns the core project.
	 */
	public IProject getProject(final String projectName) {
		return fProjects.get(projectName);
	}

	/**
	 * Returns the core project.
	 */
	public IProject getProject(final IPath projectPath) {
		return fProjects.get(projectPath.lastSegment());
	}

	/**
	 * Returns the workspace.
	 */
	public IWorkspace getWorkspace() {
		return fWorkspace;
	}

	/**
	 * Returns the path of workspace root.
	 */
	public IPath getWorkspaceRootPath() {
		return getWorkspace().getRoot().getLocation();
	}

	private IPath getJarRootPath(final IPath projectPath) {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		return getProject(projectPath).getFullPath();
	}

	void handle(final Exception e) {
		if (e instanceof CoreException) {
			handleCoreException((CoreException) e);
		}
		else
			throw new RuntimeException(e);
	}

	/**
	 * Handles a core exception thrown during a testing environment operation
	 */
	private void handleCoreException(final CoreException e) {
		e.printStackTrace();
		final IStatus status = e.getStatus();
		String message = e.getMessage();
		if (status.isMultiStatus()) {
			final MultiStatus multiStatus = (MultiStatus) status;
			final IStatus[] children = multiStatus.getChildren();
			final StringBuffer buffer = new StringBuffer();
			for (final IStatus child : children) {
				if (child != null) {
					buffer.append(child.getMessage());
					buffer.append(System.getProperty("line.separator"));//$NON-NLS-1$
				}
			}
			message = String.valueOf(buffer);
		}
		throw new RuntimeException("Core exception in testing environment: " + message, e); //$NON-NLS-1$
	}

	/**
	 * Incrementally builds the workspace. A workspace must be open.
	 */
	public void incrementalBuild() {
		waitForAutoBuild();
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		checkAssertion("the workspace must have been built", fWasBuilt); //$NON-NLS-1$
		try {
			getWorkspace().build(IncrementalProjectBuilder.INCREMENTAL_BUILD, null);
		}
		catch (final CoreException e) {
			handle(e);
		}
	}

	/**
	 * Incrementally builds a project. A workspace must be open.
	 */
	public void incrementalBuild(final IPath projectPath) {
		waitForAutoBuild();
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		checkAssertion("the workspace must have been built", fWasBuilt); //$NON-NLS-1$
		try {
			getProject(projectPath).build(IncrementalProjectBuilder.INCREMENTAL_BUILD, null);
		}
		catch (final CoreException e) {
			handle(e);
		}
	}

	public boolean isAutoBuilding() {
		final IWorkspace w = getWorkspace();
		final IWorkspaceDescription d = w.getDescription();
		return d.isAutoBuilding();
	}

	/**
	 * Open an empty workspace.
	 */
	public void openEmptyWorkspace() {
		close();
		openWorkspace();
		fProjects = new Hashtable<String,IProject>(10);
		setup();
	}

	/**
	 * Close a project from the workspace.
	 */
	public void openProject(final IPath projectPath) {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		try {
			getJavaProject(projectPath).getProject().open(null);
		}
		catch (final CoreException e) {
			e.printStackTrace();
		}
	}

	private void openWorkspace() {
		try {
			closeWorkspace();

			fWorkspace = ResourcesPlugin.getWorkspace();

			// turn off auto-build -- the tests determine when builds occur
			final IWorkspaceDescription description = fWorkspace.getDescription();
			description.setAutoBuilding(false);
			fWorkspace.setDescription(description);
		}
		catch (final Exception e) {
			handle(e);
		}
	}

	/**
	 * Renames a compilation unit int the given package in the workspace. A
	 * workspace must be open.
	 */
	public void renameCU(final IPath packagePath, final String cuName, final String newName) {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		final IFolder packageFolder = fWorkspace.getRoot().getFolder(packagePath);
		try {
			packageFolder.getFile(cuName).move(packageFolder.getFile(newName).getFullPath(), true, null);
		}
		catch (final CoreException e) {
			handle(e);
		}
	}

	/**
	 * Removes a binary class from the given package in the workspace. A
	 * workspace must be open, and the given class name must not end with
	 * ".class".
	 */
	public void removeBinaryClass(final IPath packagePath, String className) {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		className += ".class"; //$NON-NLS-1$
		final IFolder packageFolder = fWorkspace.getRoot().getFolder(packagePath);
		try {
			packageFolder.getFile(className).delete(true, null);
		}
		catch (final CoreException e) {
			handle(e);
		}
	}

	/**
	 * Removes a class from the given package in the workspace. A workspace must
	 * be open, and the given class name must not end with ".java".
	 */
	public void removeClass(final IPath packagePath, String className) {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		className += ".java"; //$NON-NLS-1$
		final IFolder packageFolder = fWorkspace.getRoot().getFolder(packagePath);
		try {
			packageFolder.getFile(className).delete(true, null);
		}
		catch (final CoreException e) {
			handle(e);
		}
	}

	/**
	 * Removes a package from the given package fragment root in the workspace.
	 * A workspace must be open.
	 */
	public void removePackage(final IPath packageFragmentRootPath, final String packageName) {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		final IPath path = packageFragmentRootPath.append(packageName.replace('.', IPath.SEPARATOR));
		final IFolder folder = fWorkspace.getRoot().getFolder(path);
		try {
			folder.delete(false, null);
		}
		catch (final CoreException e) {
			handle(e);
		}
	}

	/**
	 * Removes the given package fragment root from the the workspace. A
	 * workspace must be open.
	 */
	public void removePackageFragmentRoot(final IPath projectPath, final String packageFragmentRootName)
			throws JavaModelException {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		if (packageFragmentRootName.length() > 0) {
			final IFolder folder = getProject(projectPath).getFolder(packageFragmentRootName);
			if (folder.exists()) {
				try {
					folder.delete(false, null);
				}
				catch (final CoreException e) {
					handle(e);
				}
			}
		}
		final IPath rootPath = getPackageFragmentRootPath(projectPath, packageFragmentRootName);
		removeEntry(projectPath, rootPath);
	}

	/**
	 * Remove a project from the workspace.
	 */
	public void removeProject(final IPath projectPath) {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		try {
			getJavaProject(projectPath).close();
		}
		catch (final JavaModelException e) {
			e.printStackTrace();
		}
		final IProject project = getProject(projectPath);
		try {
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			project.delete(true, true, null);
		}
		catch (final CoreException ignore) {
			// handle(e);
		}

	}

	/**
	 * Search the user hard-drive for a Java class library. Returns null if none
	 * could be found.
	 * 
	 * Example of use: [org.eclipse.jdt.core.tests.util.Util.getJavaClassLib()]
	 */
	public String[] getJavaClassLibs() {
		final String jreDir = getJREDirectory();
		if (jreDir == null)
			return new String[] {};
		final String vmName = System.getProperty("java.vm.name");
		if ("J9".equals(vmName))
			return new String[] { toNativePath(jreDir + "/lib/jclMax/classes.zip") };
		else if ("Mac OS X".equals(System.getProperty("os.name")))
			return new String[] { toNativePath(jreDir + "/../Classes/classes.jar") };
		else {
			final File file = new File(jreDir + "/lib/rt.jar");
			if (file.exists())
				return new String[] { toNativePath(jreDir + "/lib/rt.jar") };
			return new String[] { toNativePath(jreDir + "/lib/core.jar"), toNativePath(jreDir + "/lib/security.jar"),
					toNativePath(jreDir + "/lib/graphics.jar") };
		}
	}

	/**
	 * Returns the JRE directory this tests are running on. Returns null if none
	 * could be found.
	 * 
	 * Example of use: [org.eclipse.jdt.core.tests.util.Util.getJREDirectory()]
	 */
	public String getJREDirectory() {
		return System.getProperty("java.home");
	}

	/**
	 * Makes the given path a path using native path separators as returned by
	 * File.getPath() and trimming any extra slash.
	 */
	public String toNativePath(final String path) {
		final String nativePath = path.replace('\\', File.separatorChar).replace('/', File.separatorChar);
		return nativePath.endsWith("/") || nativePath.endsWith("\\") ? nativePath.substring(0, nativePath.length() - 1)
				: nativePath;
	}

	/**
	 * Remove a required project from the classpath
	 */
	public void removeRequiredProject(final IPath projectPath, final IPath requiredProject) throws JavaModelException {
		removeEntry(projectPath, requiredProject);
	}

	/**
	 * Remove all elements in the workspace.
	 */
	public void resetWorkspace() {
		if (fProjects != null) {
			final Enumeration<String> projectNames = fProjects.keys();
			while (projectNames.hasMoreElements()) {
				final String projectName = projectNames.nextElement();
				removeProject(getProject(projectName).getFullPath());
			}
		}
	}

	/**
	 * Remove a given classpath entry from the projects class path
	 * 
	 * @param projectPath
	 *            The project to modify
	 * @param entry
	 *            The entry to remove
	 * @throws JavaModelException
	 */
	public void removeClasspathEntry(final IPath projectPath, final IClasspathEntry entry) throws JavaModelException {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		final IClasspathEntry[] oldEntries = getClasspath(projectPath);
		for (int i = 0; i < oldEntries.length; ++i) {
			if (entry.equals(oldEntries[i])) {
				final IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length - 1];
				System.arraycopy(oldEntries, 0, newEntries, 0, i);
				System.arraycopy(oldEntries, i + 1, newEntries, i, oldEntries.length - i - 1);
				setClasspath(projectPath, newEntries);
				break;
			}
		}
	}

	/**
	 * Removes the given internal jar from the workspace. A workspace must be
	 * open.
	 */
	public void removeInternalJar(final IPath projectPath, final String zipName) throws JavaModelException {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		checkAssertion("zipName must end with .zip or .jar", zipName.endsWith(".zip") || zipName.endsWith(".jar")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

		/* remove zip from the java model (it caches open zip files) */
		final IPath zipPath = getJarRootPath(projectPath).append(zipName);
		try {
			getJavaProject(projectPath).getPackageFragmentRoot(getWorkspace().getRoot().getFile(zipPath)).close();
		}
		catch (final JavaModelException e) {
			e.printStackTrace();
		}
		removePackageFragmentRoot(projectPath, zipName);

		final IFile file = getProject(projectPath).getFile(zipName);
		try {
			file.delete(false, null);
		}
		catch (final CoreException e) {
			handle(e);
		}
	}

	/**
	 * Remove an external jar from the classpath.
	 */
	public void removeExternalJar(final IPath projectPath, final IPath jarPath) throws JavaModelException {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		removeEntry(projectPath, jarPath);
	}

	private void removeEntry(final IPath projectPath, final IPath entryPath) throws JavaModelException {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		final IClasspathEntry[] oldEntries = getClasspath(projectPath);
		for (int i = 0; i < oldEntries.length; ++i) {
			if (oldEntries[i].getPath().equals(entryPath)) {
				final IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length - 1];
				System.arraycopy(oldEntries, 0, newEntries, 0, i);
				System.arraycopy(oldEntries, i + 1, newEntries, i, oldEntries.length - i - 1);
				setClasspath(projectPath, newEntries);
			}
		}
	}

	/**
	 * Remove a file
	 */
	public void removeFile(final IPath filePath) {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		try {
			fWorkspace.getRoot().getFile(filePath).delete(true, null);
		}
		catch (final CoreException e) {
			handle(e);
		}
	}

	/**
	 * Remove a folder
	 */
	public void removeFolder(final IPath folderPath) {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		final IFolder folder = fWorkspace.getRoot().getFolder(folderPath);
		try {
			folder.delete(true, null);
		}
		catch (final CoreException e) {
			handle(e);
		}
	}

	public void setAutoBuilding(final boolean value) {
		try {
			final IWorkspace w = getWorkspace();
			final IWorkspaceDescription d = w.getDescription();
			d.setAutoBuilding(value);
			w.setDescription(d);
		}
		catch (final CoreException e) {
			e.printStackTrace();
			checkAssertion("CoreException", false); //$NON-NLS-1$
		}
	}

	public void setBuildOrder(final String[] projects) {
		try {
			final IWorkspace w = getWorkspace();
			final IWorkspaceDescription d = w.getDescription();
			d.setBuildOrder(projects);
			w.setDescription(d);
		}
		catch (final CoreException e) {
			e.printStackTrace();
			checkAssertion("CoreException", false); //$NON-NLS-1$
		}
	}

	public void setClasspath(final IPath projectPath, final IClasspathEntry[] entries) throws JavaModelException {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		final IJavaProject javaProject = JavaCore.create(getProject(projectPath));
		javaProject.setRawClasspath(entries, null);
	}

	public IPath setExternalOutputFolder(final IPath projectPath, final String name, final IPath externalOutputLocation) {
		IPath result = null;
		try {
			checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
			final IProject p = getProject(projectPath);
			final IFolder f = p.getFolder(name);
			f.createLink(externalOutputLocation, IResource.ALLOW_MISSING_LOCAL, null);

			result = f.getFullPath();
			final IJavaProject javaProject = JavaCore.create(p);
			javaProject.setOutputLocation(result, null);
		}
		catch (final CoreException e) {
			e.printStackTrace();
			checkAssertion("CoreException", false); //$NON-NLS-1$
		}
		return result;
	}

	public IPath setOutputFolder(final IPath projectPath, final String outputFolder) {
		IPath outputPath = null;
		try {
			checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
			final IJavaProject javaProject = JavaCore.create(getProject(projectPath));
			outputPath = projectPath.append(outputFolder);
			javaProject.setOutputLocation(outputPath, null);
		}
		catch (final JavaModelException e) {
			e.printStackTrace();
			checkAssertion("JavaModelException", false); //$NON-NLS-1$
		}
		return outputPath;
	}

	private void setup() {
		fIsOpen = true;
	}

	/**
	 * Wait for autobuild notification to occur
	 */
	public void waitForAutoBuild() {
		checkAssertion("a workspace must be open", fIsOpen); //$NON-NLS-1$
		boolean wasInterrupted = false;
		do {
			try {
				Job.getJobManager().join(ResourcesPlugin.FAMILY_AUTO_BUILD, null);
				wasInterrupted = false;
			}
			catch (final OperationCanceledException e) {
				handle(e);
			}
			catch (final InterruptedException e) {
				wasInterrupted = true;
			}
		} while (wasInterrupted);
		fWasBuilt = true;
	}

	public void moveFile(final IPath root, final IPath tpl) {
		try {
			fWorkspace.getRoot().getFile(tpl).move(root.append(tpl.lastSegment()), true, new NullProgressMonitor());
		}
		catch (final CoreException e) {
			throw new RuntimeException(e);
		}

	}

	public void changeFile(final IPath tpl, final InputStream contents) {
		try {
			fWorkspace.getRoot().getFile(tpl).setContents(contents, true, true, new NullProgressMonitor());
		}
		catch (final CoreException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Imports one or more zipped projects into the workspace. The workspace
	 * must be opened before invoking this method. The Zip file is assumed to
	 * have the following structure:
	 * 
	 * <pre>
	 * /           Zip Root
	 * /Proj1      Project#1 Root
	 *  +-- res1   Resource in Project#1
	 *  +-- res2   &quot;
	 * /Proj2      Project#2 Root
	 * ...
	 * </pre>
	 * 
	 * @param resourceStream
	 *            Stream for reading the Zip File
	 * @return The imported projects
	 * @since 25.07.2007
	 * @author Karsten Thoms
	 */
	public List<IProject> importZippedProject(final InputStream resourceStream) {
		final List<IProject> result = new ArrayList<IProject>();

		try {
			final IPath root = fWorkspace.getRoot().getFullPath();
			final File tempFile = File.createTempFile("extxpttest", "");
			tempFile.deleteOnExit();
			FSIO.writeSingleFile(new FileWriter(tempFile), new BufferedReader(new InputStreamReader(resourceStream)));
			final ZipFile zipFile = new ZipFile(tempFile);
			final ZipFileStructureProvider zipFileStructureProvider = new ZipFileStructureProvider(zipFile);
			final ZipEntry zipRoot = zipFileStructureProvider.getRoot();

			// Assume that the root entry in the ZIP file is named "/"
			if ("/".equals(zipRoot.getName())) {
				// Iterate over the contained projects
				for (final Iterator<?> itProject = zipFileStructureProvider.getChildren(zipRoot).iterator(); itProject
						.hasNext();) {
					final ZipEntry projectEntry = (ZipEntry) itProject.next();
					// The project name has a trailing slash that we need to
					// remove
					final String projectName = projectEntry.getName().substring(0, projectEntry.getName().length() - 1);

					// Create this project
					final IProject proj = createProject(projectName);
					// Iterate over the project's children and import them
					// recursively
					for (final Iterator<?> it2 = zipFileStructureProvider.getChildren(projectEntry).iterator(); it2
							.hasNext();) {
						final ZipEntry projectContent = (ZipEntry) it2.next();
						// We use the ImportOperation to facilitate project
						// import
						final ImportOperation op = new ImportOperation(root, projectContent, zipFileStructureProvider,
								new IOverwriteQuery() {
									public String queryOverwrite(final String pathString) {
										return IOverwriteQuery.ALL;
									}
								});
						op.run(new NullProgressMonitor());
					}
					result.add(proj);
				}
			}
		}
		catch (final RuntimeException e) {
			throw e;
		}
		catch (final Exception e) {
			throw new RuntimeException(e);
		}
		return result;
	}
}
