/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.shared.ui.core.builder;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.xtend.shared.ui.Messages;

/**
 * @author Benedikt Niehues - Initial contribution and API
 */
public interface IMarkerFactory {

	
	/**
	 * this method is called before the marker will be set to the resource. 
	 * Implementations should only create the IMarker, set Attributes as needed and do the rest of their needs.
	 * Setting it to the Resource should not be done.  
	 * 
	 */
	public IMarker createMarker(IResource resource, String message, int severity, int start, int end) throws CoreException;
	
	/**
	 * this method is called before the marker will be set to the resource. 
	 * Implementations should only create the IMarker, set Attributes as needed and do the rest of their needs.
	 * Setting it to the Resource should not be done.  
	 * 
	 */
	public IMarker createMarker(IResource resource, String message, int severity, int start, int end, int line, String location) throws CoreException;

	/**
	 * this method is called before the marker will be set to the resource. 
	 * Implementations should only create the IMarker, set Attributes as needed and do the rest of their needs.
	 * Setting it to the Resource should not be done.  
	 * 
	 */
	public IMarker createMarker(IResource resource, String message, int severity, int start, int end, int line, String location, String issueType) throws CoreException;

	
	/**
	 * this method is called before the marker will be set to the resource. 
	 * Implementations should only create the IMarker, set Attributes as needed and do the rest of their needs.
	 * Setting it to the Resource should not be done.  
	 * 
	 */
	public IMarker createMarker(IResource resource, String message, int severity, int line) throws CoreException;
	
	/**
	 * this method is called before markers will be deleted from resource.
	 * Implementors can handle their needs before markers will be deleted from resource 
	 */
	public void preDeleteMarkers(IResource resource);
	
	public static class Default implements IMarkerFactory{

		public IMarker createMarker(IResource resource, String message, int severity, int start, int end) throws CoreException {
			IMarker marker = resource.createMarker(XtendXpandMarkerManager.getMARKER_TYPE());
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.SEVERITY, severity);
			int s = start;
			if (start == -1) {
				s = 1;
			}
			int e = end;
			if (end <= start) {
				e = start + 1;
			}
			marker.setAttribute(IMarker.CHAR_START, s);
			marker.setAttribute(IMarker.CHAR_END, e);
			
			return marker;
		}

		public IMarker createMarker(IResource resource, String message, int severity, int line) throws CoreException {
			IMarker marker = resource.createMarker(XtendXpandMarkerManager.getMARKER_TYPE());
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.SEVERITY, severity);
			marker.setAttribute(IMarker.LINE_NUMBER, line);
			return marker;
		}

		public void preDeleteMarkers(IResource resource) {
			// nothing to do
			
		}

		public IMarker createMarker(IResource resource, String message, int severity, int start, int end, int line,
				String location) throws CoreException {
			IMarker marker = resource.createMarker(XtendXpandMarkerManager.getMARKER_TYPE());
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.SEVERITY, severity);
			int s = start;
			if (start == -1) {
				s = 1;
			}
			int e = end;
			if (end <= start) {
				e = start + 1;
			}
			marker.setAttribute(IMarker.CHAR_START, s);
			marker.setAttribute(IMarker.CHAR_END, e);
			if (line > 0) {
				marker.setAttribute(IMarker.LINE_NUMBER, line);
				marker.setAttribute(IMarker.LOCATION, Messages.XtendXpandMarkerManager_Line
						+ line);
			}
			
			return marker;
		}
		
		
		public IMarker createMarker(IResource resource, String message, int severity, int start, int end, int line,
				String location, String issueType) throws CoreException {
			IMarker marker = resource.createMarker(XtendXpandMarkerManager.getMARKER_TYPE());
			marker.setAttribute(IMarker.MESSAGE, message);

			marker.setAttribute(IMarker.SEVERITY, severity);
			marker.setAttribute("issueType", issueType);
			int s = start;
			if (start == -1) {
				s = 1;
			}
			int e = end;
			if (end <= start) {
				e = start + 1;
			}
			marker.setAttribute(IMarker.CHAR_START, s);
			marker.setAttribute(IMarker.CHAR_END, e);
			if (line > 0) {
				marker.setAttribute(IMarker.LINE_NUMBER, line);
				marker.setAttribute(IMarker.LOCATION, Messages.XtendXpandMarkerManager_Line
						+ line);
			}
			
			return marker;
		}
		
	}
	
	
}
