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

package org.eclipse.xtend.shared.ui.core.builder;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.filebuffers.FileBuffers;
import org.eclipse.core.filebuffers.ITextFileBuffer;
import org.eclipse.core.filebuffers.ITextFileBufferManager;
import org.eclipse.core.filebuffers.LocationKind;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.Messages;
import org.eclipse.xtend.shared.ui.internal.XtendLog;

public class XtendXpandMarkerManager {

	private static final String MARKER_FACTORY_ID = "org.eclipse.xtend.shared.ui.markerFactory";
	
	private static IMarkerFactory markerFactory;
	
	private static Map<IFile, Set<MarkerObject>> markers = new HashMap<IFile, Set<MarkerObject>>();
	
    public static final String getMARKER_TYPE() {
        return Activator.getId() + ".problem";
    }

    public static void addMarker(final IFile file, final AnalysationIssue issue) {
            final int severity = issue.isError() ? IMarker.SEVERITY_ERROR : IMarker.SEVERITY_WARNING;
            int start = -1, end = -1;
            if (issue.getElement() != null) {
                start = issue.getElement().getStart();
                end = issue.getElement().getEnd();
            }
            internalAddMarker(file, issue.getMessage(), severity, start, end, issue.getType().toString());
    }

    public static void addErrorMarker(final IFile file, final String message, final int severity, final int start,
            final int end) {
            internalAddMarker(file, message, severity, start, end, null);
    }

    public static void addErrorMarker(final IFile file, final String message, final int severity, final int start,
            final int end, String issueType) {
            internalAddMarker(file, message, severity, start, end, issueType);
    }
    
    public static void addWarningMarker(final IFile file, final String message, final int severity, final int start,
            final int end) {
            internalAddMarker(file, message, severity, start, end, null);
    }

    
    private final static void internalAddMarker(final IFile file, final String message,
            final int severity, final int start, final int end, String issueType) {
    	MarkerObject mo = new MarkerObject(message, severity, start, end, issueType);
    	if (markers.get(file)==null){
    			Set<MarkerObject> mos = new HashSet<MarkerObject>();
    			mos.add(mo);
    			markers.put(file, mos);
    	}else {
    		markers.get(file).add(mo);
    	}
    }
    
    public static void finishBuild(){
    	for (IFile file : markers.keySet()) {
			createMarkersForFile(file,markers.get(file));
		}
    	markers.clear();
    }
    

	private static void createMarkersForFile(final IFile iFile, final Set<MarkerObject> mos) {
		try {
			new WorkspaceModifyOperation() {

				@Override
				protected void execute(final IProgressMonitor monitor) throws CoreException, InvocationTargetException,
						InterruptedException {

						iFile.deleteMarkers(getMARKER_TYPE(), true, IResource.DEPTH_INFINITE);
						final ITextFileBufferManager mgr = FileBuffers.getTextFileBufferManager();
						final IPath location = iFile.getFullPath();
						if (mgr != null) {
							try {
								mgr.connect(location, LocationKind.NORMALIZE, new NullProgressMonitor());
								final ITextFileBuffer buff = mgr.getTextFileBuffer(iFile.getFullPath(),
										LocationKind.NORMALIZE);
								if (buff != null) {
									final IDocument doc = buff.getDocument();
									for (MarkerObject markerObject : mos) {
										int line =0;
										try {
											line = doc.getLineOfOffset(markerObject.getStart());
										}
										catch (BadLocationException e) {
											XtendLog.logError(e);
										}
										//call markerFactory and create the marker
										getMarkerFactory().createMarker(iFile, markerObject.getMessage(),
												markerObject.getSeverity(), markerObject.getStart(),
												markerObject.getEnd(), line,
												Messages.XtendXpandMarkerManager_Line + line, markerObject.getIssueType());
									}
								}
							}catch (final CoreException e) {
								XtendLog.logError(e);
							}
							finally {
								mgr.disconnect(location, LocationKind.NORMALIZE, new NullProgressMonitor());
							}
						}
					
				}

			}.run(new NullProgressMonitor());
		}
		catch (final Exception e) {
			XtendLog.logError(e);
		}
	}

	public static void deleteMarkers(final IResource file) {
        try {
        	if (file.exists()) {
                new WorkspaceModifyOperation() {

                    @Override
                    protected void execute(final IProgressMonitor monitor) throws CoreException,
                            InvocationTargetException, InterruptedException {
                        file.deleteMarkers(getMARKER_TYPE(), true, IResource.DEPTH_INFINITE);
                    }

                }.run(new NullProgressMonitor());
            }
        } catch (final Exception ce) {
            XtendLog.logError(ce);
        }
    }

	/**
	 * getting MarkerFactory from ExtensionPoint
	 */
	private static synchronized IMarkerFactory getMarkerFactory() {
		if (markerFactory == null){
			IExtensionRegistry extRegistry = Platform.getExtensionRegistry();
			IExtensionPoint extPoint = extRegistry.getExtensionPoint(MARKER_FACTORY_ID);
			if (extPoint != null){									  
				IExtension[] extensions = extPoint.getExtensions();
				if (extensions.length>=1){
					IExtension extension = extensions[0];
					IConfigurationElement[] configElements = extension.getConfigurationElements();
					if (configElements.length>=1){
						try {
							markerFactory = (IMarkerFactory)configElements[0].createExecutableExtension("class");
						}
						catch (CoreException e) {
							markerFactory = new IMarkerFactory.Default();
							XtendLog.logError("Problem with extension \""+configElements[0].getName()+"\" using default implementation instead", e);
						}
					} if (configElements.length > 1){
						XtendLog.logInfo("more than one MarkerFactory defined. Taking\""+configElements[0].getName()+"\"");
					}
				}if (extensions.length>1){
					XtendLog.logInfo("more than one MarkerFactory defined. Taking\""+extensions[0].getExtensionPointUniqueIdentifier()+"\"");
				}if (extensions.length==0){
					markerFactory=new IMarkerFactory.Default();
					XtendLog.logInfo("No MarkerFactory defined. Taking default implementation");
				}
			}else {
				markerFactory=new IMarkerFactory.Default();
				XtendLog.logInfo("No MarkerFactory defined. Taking default implementation");
			}
		}
		return markerFactory;
	}
	
}
