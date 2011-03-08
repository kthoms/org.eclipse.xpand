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
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.Messages;
import org.eclipse.xtend.shared.ui.internal.XtendLog;

public class XtendXpandMarkerManager {

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
            internalAddMarker(file, issue.getMessage(), severity, start, end);
    }

    public static void addErrorMarker(final IFile file, final String message, final int severity, final int start,
            final int end) {
            internalAddMarker(file, message, severity, start, end);
    }

    public static void addWarningMarker(final IFile file, final String message, final int severity, final int start,
            final int end) {
            internalAddMarker(file, message, severity, start, end);
    }

    
    private final static void internalAddMarker(final IFile file, final String message,
            final int severity, final int start, final int end) {
    	MarkerObject mo = new MarkerObject(message, severity, start, end);
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

					try {
						iFile.deleteMarkers(getMARKER_TYPE(), true, IResource.DEPTH_INFINITE);
						for (MarkerObject markerObject : mos) {
							IMarker marker = iFile.createMarker(getMARKER_TYPE());
							marker.setAttribute(IMarker.MESSAGE, markerObject.getMessage());
							marker.setAttribute(IMarker.SEVERITY, markerObject.getSeverity());
							int s = markerObject.getStart();
							if (markerObject.getStart() == -1) {
								s = 1;
							}
							int e = markerObject.getEnd();
							if (markerObject.getEnd() <= markerObject.getStart()) {
								e = markerObject.getStart() + 1;
							}
							marker.setAttribute(IMarker.CHAR_START, s);
							marker.setAttribute(IMarker.CHAR_END, e);
							final ITextFileBufferManager mgr = FileBuffers.getTextFileBufferManager();
							if (mgr != null) {
								final IPath location = iFile.getFullPath();
								try {
									mgr.connect(location, LocationKind.NORMALIZE, new NullProgressMonitor());
									final ITextFileBuffer buff = mgr.getTextFileBuffer(iFile.getFullPath(),
											LocationKind.NORMALIZE);
									if (buff != null) {
										final IDocument doc = buff.getDocument();
										final int line = doc.getLineOfOffset(markerObject.getStart());
										if (line > 0) {
											marker.setAttribute(IMarker.LINE_NUMBER, doc.getLineOfOffset(markerObject.getStart()));
											marker.setAttribute(IMarker.LOCATION, Messages.XtendXpandMarkerManager_Line
													+ line);
										}
									}
								}
								finally {
									mgr.disconnect(location, LocationKind.NORMALIZE, new NullProgressMonitor());
								}
							}
						}
					}
					catch (final CoreException e) {
						XtendLog.logError(e);
					}
					catch (final BadLocationException e) {
						XtendLog.logError(e);
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
}
