/*******************************************************************************
 * Copyright (c) 2005 - 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.typesystem.xsd.ui;

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitorAdapter;
import org.eclipse.xtend.typesystem.xsd.builder.XSDManager;
import org.eclipse.xtend.typesystem.xsd.util.Msg;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
public class XSDBuilder extends IncrementalProjectBuilder {

	class XSDResourceVisitor implements IResourceDeltaVisitor, IResourceVisitor {
		private XSDManager man;

		public XSDResourceVisitor(XSDManager man) {
			super();
			this.man = man;
		}

		public boolean visit(IResource resource) {
			if (isXSDResource(resource))
				man.markDirty(getURI(resource));
			return true;
		}

		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
			XSDToolsPlugin.traceLog("visiting " + resource.getFullPath());
			if (isXSDResource(resource))
				switch (delta.getKind()) {
				case IResourceDelta.CHANGED:
				case IResourceDelta.ADDED:
					man.markDirty(getURI(resource));
					break;
				case IResourceDelta.REMOVED:
					man.remove(getURI(resource));
					break;
				}
			return true;
		}
	}

	public final static String ID = "org.eclipse.xtend.typesystem.xsd.ui.xsdBuilder";

//	private Log log = XSDLog.getLog(getClass());

	@SuppressWarnings("unchecked")
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
			throws CoreException {
		XSDManager man = XSDToolsPlugin.getDefault().getXSDStore()
				.getXSDManager(getProject());
		if (man != null) {
			if (kind == FULL_BUILD)
				fullBuild(man, monitor);
			else {
				IResourceDelta delta = getDelta(getProject());
				if (delta == null) {
					fullBuild(man, monitor);
				} else {
					incrementalBuild(man, delta, monitor);
				}
			}
		}
		return null;
	}

	protected void clean(IProgressMonitor monitor) throws CoreException {
		XSDManager man = XSDToolsPlugin.getDefault().getXSDStore()
				.getXSDManager(getProject());
		if (man != null) {
			man.clear();
			man.reloadDirty(new ProgressMonitorAdapter(monitor));
		}
	}

	protected void fullBuild(XSDManager man, final IProgressMonitor monitor)
			throws CoreException {
		try {
			XSDToolsPlugin.traceLog(Msg.create("Running full build on project ").txt(
					getProject().getName()).toString());
			man.clear();
			getProject().accept(new XSDResourceVisitor(man));
			man.reloadDirty(new ProgressMonitorAdapter(monitor));
		} catch (CoreException e) {
//			OawLog.logError(e);
			throw new RuntimeException(e);
		}
	}

	protected URI getURI(IResource res) {
		return URI
				.createPlatformResourceURI(res.getFullPath().toString(), true);
	}

	protected void incrementalBuild(XSDManager man, IResourceDelta delta,
			IProgressMonitor monitor) throws CoreException {
		XSDToolsPlugin.traceLog(Msg.create("Running incremental build on project ").txt(
				getProject().getName()).txt("; delta:").txt(delta.toString()).toString());
		delta.accept(new XSDResourceVisitor(man));
		man.reloadDirty(new ProgressMonitorAdapter(monitor));
	}

	protected boolean isXSDResource(IResource res) {
		String fe = res.getFileExtension();
		return !res.isDerived() && fe != null && fe.toLowerCase().equals("xsd");
	}

	protected void startupOnInitialize() {
		forgetLastBuiltState();
	}

	// protected void loadModelsFromArchive(IPackageFragmentRoot root,
	// IProgressMonitor monitor) throws JavaModelException {
	// String path = ((JarPackageFragmentRoot) root).getPath().toString();
	//
	// if (path.contains("org.eclipse.emf.ecore_")) {
	// localXSDs.registerPackage(EcorePackage.eINSTANCE);
	// localXSDs.registerPackage(XMLNamespacePackage.eINSTANCE);
	// localXSDs.registerPackage(XMLTypePackage.eINSTANCE);
	// } else if (path.contains("org.eclipse.xsd_")) {
	// localXSDs.registerPackage(XSDPackage.eINSTANCE);
	// }
	//
	// // TODO: Scan (and cache) archive contents again
	// // super.loadModelsFromArchive(root, monitor);
	// }
}
