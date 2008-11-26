package org.eclipse.emf.editor;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.xtend.shared.ui.Activator;

/**
 * @author Dennis Hübner - Initial contribution and API
 * 
 */
public class MarkerHandler {
	protected static final String MARKER_ID = Activator.getId() + ".problem";

	void deleteMarkers(final IResource resource, IProgressMonitor monitor) {
		checkResource(resource);
		run(new WorkspaceModifyOperation(ResourcesPlugin.getWorkspace().getRuleFactory().markerRule(resource)) {
			@Override
			protected void execute(final IProgressMonitor monitor) throws CoreException, InvocationTargetException,
					InterruptedException {
				resource.deleteMarkers(MARKER_ID, true, IResource.DEPTH_INFINITE);
			}
		}, monitor);
	}

	private void checkResource(final IResource resource) {
		Assert.isLegal(resource != null);
		Assert.isLegal(resource.exists(), "Can't handle Marker for a non existing resource '" + resource.getFullPath()
				+ "'");
		Assert.isLegal(!resource.getResourceAttributes().isReadOnly(), "Can't handle Marker for read only resource'"
				+ resource.getFullPath() + "'");
	}

	private void run(WorkspaceModifyOperation workspaceModifyOperation, IProgressMonitor monitor) {
		try {
			workspaceModifyOperation.run(monitor);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	void addMarker(final IFile file, final String message, final int severity, final String location) {
		checkResource(file);
		run(new WorkspaceModifyOperation() {

			@Override
			protected void execute(final IProgressMonitor monitor) throws CoreException, InvocationTargetException,
					InterruptedException {

				try {
					// FIXME own MarkerType
					IMarker marker = file.createMarker(MARKER_ID);
					marker.setAttribute(IMarker.MESSAGE, message);
					int status = IMarker.SEVERITY_INFO;
					switch (severity) {
						case IMessageProvider.ERROR:
							status = IMarker.SEVERITY_ERROR;
							break;
						case IMessageProvider.WARNING:
							status = IMarker.SEVERITY_WARNING;
							break;
					}
					marker.setAttribute(IMarker.SEVERITY, status);
					if (location != null)
						marker.setAttribute(IMarker.LOCATION, location);
				}
				catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}, new NullProgressMonitor());
	}
}