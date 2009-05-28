/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.xtend.typesystem.uml2.ui;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.resource.UML22UMLResource;
import org.osgi.framework.BundleContext;

/**
 * The main plugin class to be used in the desktop.
 */
public class Uml2AdapterPlugin extends AbstractUIPlugin {
	// A resource set to store the loaded profiles in
	public static ResourceSet profilesResourceSet = new ResourceSetImpl();
            
    static class ProfileResourceDeltaVisitor implements IResourceDeltaVisitor, IResourceVisitor {
        public boolean visit(IResourceDelta delta) {

            if (delta.getKind() == IResourceDelta.REMOVED) {
                Uml2AdapterPlugin.removeFileModel(delta.getResource());
                return true;
            } else {
                IResource resource = delta.getResource();
                try {
                    return visit(resource);
                } catch (CoreException e) {
                    Uml2AdapterLog.logError(e);
                    return true;
                }
            }
        }

        public boolean visit(IResource resource) throws CoreException {
            if (resource instanceof IFile) {
                IFile f = (IFile) resource;
                if (isValidProfile(f)) {
                    if (JavaCore.create(f.getParent()) != null) {
                        try {
                            URI uri = URI.createURI(f.getFullPath().toString());
                            Profile p = loadProfile(uri);
                            if (p != null) {
                                fileModels.put(f, p);
                            }
                        } catch (Exception e) {
                            Uml2AdapterLog.logError(e);
                        }
                    }
                }
            }
            return true;
        }

        private boolean isValidProfile(IFile f) {
            return !f.isDerived() && f.isAccessible() && !f.isLinked() && (f.getName().endsWith("profile.uml2") || f.getName().endsWith("profile.uml"))&& f.exists();
        }
        
        public synchronized final static Profile loadProfile(URI uri) {
             Resource r = profilesResourceSet.getResource(uri, false);
             if (r == null) {
                 // this resource has not been loaded before...
                 // hence, demandLoad it
                 r = profilesResourceSet.getResource(uri, true);
             } else {
                 if (r.isLoaded()) { // Is this a request to reload the resource?
                     r.unload();
                 }
                 try {
                    r.load(new HashMap<Object,Object>());
                 } catch (IOException e) {
                    throw new RuntimeException(e);
                 }                         
             }
            
            List<EObject> c = r.getContents();
            if (c.isEmpty()) {
               return null;
            }
            if (c.get(0) instanceof Profile) {
               Profile p = (Profile) c.get(0);
               URIConverter.URI_MAP.put(URI.createURI(uri.lastSegment()), uri);
               return p;
            }
            return null;
         }
    }

    final static Map<IResource, Profile> fileModels = new HashMap<IResource, Profile>();

    public final static Map<IResource, Profile> getFileModels() {
        return Collections.unmodifiableMap(fileModels);
    }

    public static void removeFileModel(IResource resource) {
        URI uri = URI.createURI(resource.getFullPath().toString());
             Resource r = profilesResourceSet.getResource(uri, false);
             if (r != null) {
                             if (r.isLoaded()) // Is this a request to reload the resource?
                                             r.unload();
             }
        fileModels.remove(resource);
    }

    // The shared instance.
    private static Uml2AdapterPlugin plugin;

    private static IResourceChangeListener listener = new IResourceChangeListener() {
        public void resourceChanged(IResourceChangeEvent event) {
            // we are only interested in POST_CHANGE events
            if (event.getType() != IResourceChangeEvent.POST_CHANGE)
                return;
            IResourceDelta rootDelta = event.getDelta();
            try {
                rootDelta.accept(new Uml2AdapterPlugin.ProfileResourceDeltaVisitor());
            } catch (CoreException e) {
                Uml2AdapterLog.logError(e);
            }

        }
    };

    protected static List<EObject> loadContents(IFile file) {
        try {
            URI uri = URI.createFileURI(file.getFullPath().toString());
            Resource r = new ResourceSetImpl().createResource(uri);
            r.load(file.getContents(), Collections.EMPTY_MAP);
            return r.getContents();
        } catch (Exception e) {
            Uml2AdapterLog.logError(e);
        }
        return null;
    }

    /**
     * The constructor.
     */
    public Uml2AdapterPlugin() {
        plugin = this;
    }

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("uml2", UML22UMLResource.Factory.INSTANCE);
        try {
            IWorkspace workspace = ResourcesPlugin.getWorkspace();
            workspace.addResourceChangeListener(listener);
            workspace.getRoot().accept(new Uml2AdapterPlugin.ProfileResourceDeltaVisitor());
        } catch (CoreException e) {
            Uml2AdapterLog.logError(e);
        }
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        super.stop(context);
        plugin = null;
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        workspace.removeResourceChangeListener(listener);
    }

    /**
     * Returns the shared instance.
     */
    public static Uml2AdapterPlugin getDefault() {
        return plugin;
    }

    /**
     * Returns an image descriptor for the image file at the given plug-in
     * relative path.
     * 
     * @param path
     *            the path
     * @return the image descriptor
     */
    public static ImageDescriptor getImageDescriptor(String path) {
        return AbstractUIPlugin.imageDescriptorFromPlugin(getId(), path);
    }

    public static String getId() {
        return getDefault().getBundle().getSymbolicName();
    }

}
