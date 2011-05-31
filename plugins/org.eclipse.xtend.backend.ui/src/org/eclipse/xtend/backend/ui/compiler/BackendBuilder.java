package org.eclipse.xtend.backend.ui.compiler;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
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
import org.eclipse.xtend.middleend.MiddleEnd;
import org.eclipse.xtend.middleend.MiddleEndFactory;
import org.eclipse.xtend.middleend.plugins.LanguageSpecificMiddleEnd;

public class BackendBuilder extends IncrementalProjectBuilder {

	public static final String BACKEND_GEN_FOLDER = "backend-gen";

	public static final String BUILDER_ID = "org.eclipse.xtend.backend.compiler.BackendBuilder";
	
	private final static Log _log = LogFactory.getLog (BackendBuilder.class);
	
	private List<LanguageSpecificMiddleEnd> middleends;

	class BackendDeltaVisitor implements IResourceDeltaVisitor, IResourceVisitor {
		private final IProgressMonitor _monitor;
		private List<LanguageSpecificMiddleEnd> _middleends;

		public BackendDeltaVisitor(final IProgressMonitor monitor) {
			this._monitor = monitor;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see
		 * org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse
		 * .core.resources.IResourceDelta)
		 */
		public boolean visit(final IResourceDelta delta) throws CoreException {
			final IResource resource = delta.getResource();
			if (_middleends == null)
				_middleends = createMiddleEnd ().getLanguageSpecificMiddleEnds();
			if (isBackendCompilableResource (resource, _middleends)) {
				switch (delta.getKind()) {
					case IResourceDelta.ADDED:
						// handle added resource
						onAddOrUpdate ((IFile) resource, _monitor);
						break;
					case IResourceDelta.REMOVED:
						// handle removed resource
						onRemoval ((IFile) resource, _monitor);
						break;
					case IResourceDelta.CHANGED:
						// handle changed resource
						onAddOrUpdate ((IFile) resource, _monitor);
						break;
				}
			}
			_monitor.worked(1);
			return true;
		}

		public boolean visit(final IResource resource) {
			if (_middleends == null)
				_middleends = createMiddleEnd ().getLanguageSpecificMiddleEnds();
			if (isBackendCompilableResource (resource, _middleends)) {
				onAddOrUpdate ((IFile) resource, _monitor);
			}
			_monitor.worked(1);
			return true;
		}
		
		

	}

	@Override
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
			throws CoreException {
		ClassLoader origCl = Thread.currentThread ().getContextClassLoader();
		try {
			final IJavaProject jp = JavaCore.create (getProject());
			URLClassLoader backendCl = new URLClassLoader (getBuildClasspath (jp), origCl);
			Thread.currentThread ().setContextClassLoader (backendCl);
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
			} else {
				final IResourceDelta delta = getDelta (getProject());
				if (delta == null) {
					doFullBuild (progress.newChild (1));
				}
				else {
					doIncrementalBuild (delta, progress.newChild (1));
				}
			}
		} finally {
			Thread.currentThread ().setContextClassLoader (origCl);
			if (monitor != null)
				monitor.done ();
		}
		return null;
	}

	protected void doFullBuild (SubMonitor progress) {
		try {
			final IJavaProject jp = JavaCore.create(getProject());
			
			final IPackageFragmentRoot[] roots = jp.getPackageFragmentRoots();
			Map<IResource, IPath> resources = new HashMap<IResource, IPath> ();
			String defaultCharset = getProject().getDefaultCharset();
			List<String> srcFolders = new ArrayList<String>(roots.length);
			for (IPackageFragmentRoot iPackageFragmentRoot : roots) {
				if (! iPackageFragmentRoot.getPath().equals (getOutputFolder(progress))) {
					if (iPackageFragmentRoot.getResource() != null && ! iPackageFragmentRoot.isArchive()) {
						srcFolders.add (iPackageFragmentRoot.getResource().getRawLocation().toOSString());
					}
					getAllResources (iPackageFragmentRoot, iPackageFragmentRoot.getResource(), resources);
//					defaultCharset = iPackageFragmentRoot.getResource().getProject().getDefaultCharset();
				}
			}
			Set<String> resNames = new HashSet<String> (resources.size());
			List<LanguageSpecificMiddleEnd> middleends = createMiddleEnd ().getLanguageSpecificMiddleEnds();

			for (Entry<IResource, IPath> res : resources.entrySet()) {
				if (isBackendCompilableResource(res.getKey(), middleends))
				resNames.add (res.getValue().toOSString());
			}

			Map<Class<?>, Object> specificParams = new HashMap<Class<?>, Object>();
			Set<String> btsQualifiers = new HashSet<String> ();
			configureMiddleends (jp, specificParams, btsQualifiers);
			
			BackendTypesystem bts = CompositeTypesystemFactory.INSTANCE.createTypesystem (btsQualifiers);

			if (!resNames.isEmpty()) {
				compile (progress, resNames, specificParams, bts, defaultCharset);
			}
			
		} catch (CoreException e) {
			_log.error ("Error doing full build ", e);
		} catch (Exception e) {
			_log.error (e);
		}
	}
	
	private void doIncrementalBuild(IResourceDelta delta, SubMonitor monitor) throws CoreException {
		final BackendDeltaVisitor visitor = new BackendDeltaVisitor (monitor);
		delta.accept (visitor);
	}
	
	protected void onAddOrUpdate (final IFile resource, IProgressMonitor monitor) {
		if (resource.exists()) {
			final IProject project = getProject();
			if (project != null) {
				try {
					final String charset = resource.getCharset();
					final IJavaProject jp = JavaCore.create(getProject());
					
					Map<Class<?>, Object> specificParams = new HashMap<Class<?>, Object>();
					Set<String> btsQualifiers = new HashSet<String> ();
					configureMiddleends (jp, specificParams, btsQualifiers);
					
					BackendTypesystem bts = CompositeTypesystemFactory.INSTANCE.createTypesystem (btsQualifiers);

					IPath resPath = null;
					final IPackageFragmentRoot[] roots = jp.getPackageFragmentRoots();
					for (int i = 0; i < roots.length; i++) {
						if (roots[i].getResource() != null && ! roots[i].isArchive()) {
							IResource packageRoot = roots[i].getResource();
							if (resource.getRawLocation().toOSString().startsWith(packageRoot.getRawLocation().toOSString())) {
								resPath = resource.getFullPath().makeRelativeTo(packageRoot.getFullPath());
								break;
							}
						}

					}
					
					if (resPath != null) {
						final Collection<String> resNames = Arrays.asList(resPath.toOSString());
						if (!resNames .isEmpty()) {
							if (charset != null)
								compile (SubMonitor.convert (monitor, 1), resNames, specificParams, bts, charset);
							else 
								compile (SubMonitor.convert (monitor, 1), resNames, specificParams, bts, getProject().getDefaultCharset());
						}
					}
				} catch (CoreException e) {
					_log.error("Error building "+ resource.getLocation().toOSString() + " incrementally", e);
				}
			}
		}
	}
	
	protected void onRemoval (final IFile resource, IProgressMonitor monitor) {
	}

	private void compile (SubMonitor progress, Collection<String> resNames, 
			Map<Class<?>, Object> specificParams, BackendTypesystem bts, String fileEncoding)
			throws CoreException {
		BackendCompilerFacade compiler = new Java5CompilerFacade (bts);
		final String middleEndPackage = "org.example";
		final String middleEndName = getMiddleendName();
		final String outputDir = getOutputFolder (progress).getRawLocation().toOSString();
		_log.info ("Compiling M2T Backend executable resources " + resNames.toString());
		compiler.compile (resNames, middleEndPackage, middleEndName, outputDir, specificParams, fileEncoding);
	}

	private void configureMiddleends (final IJavaProject project,
			Map<Class<?>, Object> specificParams, Set<String> btsQualifiers) {
		List<LanguageSpecificMiddleEndConfigurer> configurers = Activator.getInstance().getMiddleEndConfigurers();
		for (LanguageSpecificMiddleEndConfigurer c : configurers) {
			c.getMiddleEndName();
			Map<Class<?>, Object> params = c.getSpecificParams (project);
			specificParams.putAll (params);
			btsQualifiers.addAll (c.getConfiguredTypeSystems (project));
		}
	}
	
	private MiddleEnd createMiddleEnd () {
		final IJavaProject jp = JavaCore.create(getProject());
		Map<Class<?>, Object> specificParams = new HashMap<Class<?>, Object>();
		Set<String> btsQualifiers = new HashSet<String> ();
		configureMiddleends (jp, specificParams, btsQualifiers);		
		BackendTypesystem bts = CompositeTypesystemFactory.INSTANCE.createTypesystem (btsQualifiers);

		if (MiddleEndFactory.canCreateFromExtentions()) {
			return MiddleEndFactory.createFromExtensions(bts, specificParams);
		}
		
		return null;
	}

	private String getMiddleendName() {
		return NamingHelper.toMiddleEndClassName (getProject ().getName(), null);
	}
	
	private void getAllResources (IPackageFragmentRoot root, IResource res, Map<IResource, IPath> resources) {
		if (res instanceof IFile && ! res.isHidden()) {
			IPath filePath = res.getFullPath();
			IPath srcRootPath = root.getResource().getFullPath();
			IPath relFilePath = filePath.makeRelativeTo (srcRootPath);
			resources.put (res, relFilePath);
		} else if (res instanceof IFolder) {
			try {
				for (IResource r : ((IFolder) res).members()) {
					getAllResources(root, r, resources);
				}
			} catch (CoreException e) {
				_log.error ("Error collecting resources for full build", e);
			} catch (Exception e) {
				_log.error ("Error collecting resources for full build", e);
			}
		}
	}

	private IFolder getOutputFolder(SubMonitor monitor) throws CoreException {
		IFolder genFolder = getProject().getFolder (BACKEND_GEN_FOLDER);
		if (! genFolder.exists())
			genFolder.create(true, true, monitor);
		return genFolder;
	}	

	boolean isOnJavaClassPath(final IResource resource) {
		final IJavaProject jp = JavaCore.create(resource.getProject());
		if (jp != null)
			return jp.isOnClasspath(resource);
		return false;
	}

	private boolean isBackendCompilableResource(IResource resource, List<LanguageSpecificMiddleEnd> middleends) {
		final String resourcePath = resource.getLocation().toOSString ();
		if (resource instanceof IFile && 
				!(resourcePath.endsWith (".class") || resourcePath.endsWith(".java")) && 
				isOnJavaClassPath (resource)) 
		{
			for (LanguageSpecificMiddleEnd me : middleends) {
				boolean isCanditate = me.mayHandle (resourcePath);
				if (isCanditate)
					return true;
			}
			return false;
		} else {
			return false;
		}
	}
	

	protected URL[] getBuildClasspath (IJavaProject jp) {
		try {
			List<String> srcFolders = getSourceFolders(jp.getProject(), new LinkedList<String> ());
			URL[] srcUrls = getbuildClasspathUrls(srcFolders);
			return srcUrls;
		} catch (CoreException e) {
			_log.error (e);
		}
		return null;

	}
	
	private List<String> getSourceFolders (IProject project, List<String> srcFolders) throws CoreException {
		IJavaProject jp = JavaCore.create (project);
		final IPackageFragmentRoot[] roots = jp.getPackageFragmentRoots();
		for (IPackageFragmentRoot iPackageFragmentRoot : roots) {
			if (! iPackageFragmentRoot.getPath().equals (jp.getProject().getFolder (BackendBuilder.BACKEND_GEN_FOLDER))) {
				if (iPackageFragmentRoot.getResource() != null && ! iPackageFragmentRoot.isArchive()) {
					srcFolders.add (iPackageFragmentRoot.getResource().getRawLocation().toOSString());
				}
			}
		}
		for (IProject refProject : project.getReferencedProjects()) {
			getSourceFolders (refProject, srcFolders);
		}
		return srcFolders;
	}

	private URL[] getbuildClasspathUrls(List<String> srcFolders) {
		URL[] srcUrls = new URL[srcFolders.size()];
		for (int i = 0; i < srcFolders.size(); i++) {
			StringBuilder urlBuilder = new StringBuilder("file://");
			urlBuilder.append(srcFolders.get(i));
			urlBuilder.append(File.separator);
			try {
				URL currUrl = new URL (urlBuilder.toString());
				srcUrls[i] = currUrl;
			} catch (MalformedURLException e) {
				_log.error(e);
			}
		}
		return srcUrls;
	}


}
