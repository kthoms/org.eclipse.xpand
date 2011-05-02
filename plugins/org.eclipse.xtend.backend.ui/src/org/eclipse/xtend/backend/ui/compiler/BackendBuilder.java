package org.eclipse.xtend.backend.ui.compiler;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.ProgressMonitorWrapper;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.compiler.BackendCompilerFacade;
import org.eclipse.xtend.backend.compiler.templates.java5.Java5CompilerFacade;
import org.eclipse.xtend.backend.types.CompositeTypesystemFactory;
import org.eclipse.xtend.backend.ui.Activator;
import org.eclipse.xtend.backend.ui.middleend.LanguageSpecificMiddleEndConfigurer;

public class BackendBuilder extends IncrementalProjectBuilder {

	public static final String BUILDER_ID = "org.eclipse.xtend.backend.compiler.BackendBuilder";
	
	private final static Log _log = LogFactory.getLog (BackendBuilder.class);
	
	@Override
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
			throws CoreException {
		try {
			if (monitor != null) {
				final String taskName = "Compiling project " + getProject ().getName();
				monitor = new ProgressMonitorWrapper (monitor) {
					@Override
					public void subTask (String name) {
						super.subTask (taskName + name);
					}
				};
			}
			SubMonitor progress = SubMonitor.convert (monitor, 1);
			if (kind == FULL_BUILD) {
				doFullBuild (progress.newChild (1));
			} else if (kind == INCREMENTAL_BUILD) {
				// TODO implement incremental compilation
			}
		} finally {
			if (monitor != null)
				monitor.done();
		}
		return null;
	}
	
	private void doFullBuild (SubMonitor progress) {
		try {
			final IJavaProject jp = JavaCore.create(getProject());
			final IPackageFragmentRoot[] roots = jp.getPackageFragmentRoots();
			List<IPath> resources = new LinkedList<IPath> ();
			String defaultCharset = getProject().getDefaultCharset();
			for (IPackageFragmentRoot iPackageFragmentRoot : roots) {
				if (! iPackageFragmentRoot.getPath().equals (getOutputFolder(progress))) {
					getAllResourcePaths (iPackageFragmentRoot, iPackageFragmentRoot.getResource(), resources);
//					defaultCharset = iPackageFragmentRoot.getResource().getProject().getDefaultCharset();
				}
			}
			Set<String> resNames = new HashSet<String> (resources.size());
			
			for (IPath res : resources) {
				resNames.add (res.toOSString());
			}

			Map<Class<?>, Object> specificParams = new HashMap<Class<?>, Object>();
			List<LanguageSpecificMiddleEndConfigurer> configurers = Activator.getInstance().getMiddleEndConfigurers();
			Set<String> btsQualifiers = new HashSet<String> ();
			for (LanguageSpecificMiddleEndConfigurer c : configurers) {
				c.getMiddleEndName();
				Map<Class<?>, Object> params = c.getSpecificParams (jp);
				specificParams.putAll(params);
				btsQualifiers.addAll (c.getConfiguredTypeSystems (jp));
			}
			
			BackendTypesystem bts = CompositeTypesystemFactory.INSTANCE.createTypesystem (btsQualifiers);

			if (!resNames.isEmpty()) {
				compile (progress, resNames, specificParams, bts, defaultCharset);
			}
			
		} catch (CoreException e) {
			_log.error("Error doing full build", e);
		} catch (Exception e) {
			_log.error (e);
		}
	}

	private void compile(SubMonitor progress, Set<String> resNames,
			Map<Class<?>, Object> specificParams, BackendTypesystem bts, String fileEncoding)
			throws CoreException {
		BackendCompilerFacade compiler = new Java5CompilerFacade (bts);
		final String middleEndPackage = "org.example";
		final String middleEndName = getMiddleendName();
		final String outputDir = getOutputFolder (progress).getRawLocation().toOSString();
		_log.info ("Do a full build for " + resNames.toString());
		compiler.compile (resNames, middleEndPackage, middleEndName, outputDir, specificParams, fileEncoding);
	}
	

	private void getAllResourcePaths (IPackageFragmentRoot root, IResource res, List<IPath> resources) {
		if (res instanceof IFile && ! res.isHidden()) {
			IPath filePath = res.getFullPath();
			IPath srcRootPath = root.getResource().getFullPath();
			IPath relFilePath = filePath.makeRelativeTo (srcRootPath);
			resources.add (relFilePath);
		} else if (res instanceof IFolder) {
			try {
				for (IResource r : ((IFolder) res).members()) {
					getAllResourcePaths(root, r, resources);
				}
			} catch (CoreException e) {
				_log.error("Error collecting resources for full build", e);
			} catch (Exception e) {
				_log.error("Error collecting resources for full build", e);
			}
		}
	}

	private String getMiddleendName() {
		return NamingHelper.toMiddleEndClassName (getProject ().getName(), null);
	}

	private IFolder getOutputFolder(SubMonitor monitor) throws CoreException {
		IFolder genFolder = getProject().getFolder("src-gen-m2t");
		if (! genFolder.exists())
			genFolder.create(true, true, monitor);
		return genFolder;
	}	

}
