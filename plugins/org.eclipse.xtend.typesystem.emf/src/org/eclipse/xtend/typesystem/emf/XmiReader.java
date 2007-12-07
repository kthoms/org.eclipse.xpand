/**
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.xtend.typesystem.emf;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.mwe.core.ConfigurationException;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 */
public class XmiReader extends AbstractWorkflowComponent  {

    protected String modelFile;

    protected String outputSlot = WorkflowContext.DEFAULT_SLOT;

    protected boolean firstElementOnly = true;

    public String getLogMessage() {
    	return "file '"+modelFile+"' => slot '"+outputSlot+"'";
    }
    
    public void setMetaModelFile(final String metaModelFile) {
        new Setup().addEPackageFile(metaModelFile);
    }

    public void setMetaModelPackage(final String metaModelPackage) {
        new Setup().addEPackageClass(metaModelPackage);
    }

    public void setMetaModelDescriptor(final String metaModelDescriptor) {
        new Setup().addEPackageDescriptor(metaModelDescriptor);
    }

    public void setModelFile(final String modelFile) {
        this.modelFile = modelFile;
    }

    public void setOutputSlot(final String outputSlot) {
        this.outputSlot = outputSlot;
    }

    public void setFirstElementOnly(final boolean firstElementOnly) {
        this.firstElementOnly = firstElementOnly;
    }

    public void checkConfiguration(final Issues issues) {
        loadFile(issues);
    }

    @Override
    protected void invokeInternal(final WorkflowContext model, final ProgressMonitor monitor, final Issues issues) {
        final File f = loadFile(issues);
        final URI fileURI = URI.createFileURI(f.getAbsolutePath());

        final Resource r = new ResourceSetImpl().createResource(fileURI);
        try {
            r.load(null);
        } catch (final IOException e) {
            throw new ConfigurationException(e);
        }

        if (firstElementOnly) {
            model.set(outputSlot, r.getContents().get(0));
        } else {
            model.set(outputSlot, r.getContents());
        }
    }

    protected File loadFile(final Issues issues) {
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
        if (modelFile == null) {
            issues.addError("No modelFile specified!");
            return null;
        }
        final URL url = ResourceLoaderFactory.createResourceLoader().getResource(modelFile);
        if ((url == null) || (url.getFile() == null)) {
            issues.addError(this, "cannot find file: " + modelFile);
            return null;
        }
        final File f = new File(URI.decode(url.getFile()));
        if (!f.exists()) {
            issues.addError(this, "cannot find file: " + modelFile);
            return null;
        }
        return f;
    }
	
 
    
}
