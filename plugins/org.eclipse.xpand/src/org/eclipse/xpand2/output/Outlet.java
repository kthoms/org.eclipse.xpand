/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xpand2.output;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Outlet {
    
    private boolean append = false;

    private boolean overwrite = true;

    private String path = null;

    private String name = null;

    private String fileEncoding = System.getProperty("file.encoding");
    private boolean hasDefaultEncoding = true;

    public boolean hasDefaultEncoding () {
        return hasDefaultEncoding;
    }
    
    public boolean isAppend() {
        return append;
    }

    public void setAppend(final boolean append) {
        this.append = append;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public boolean isOverwrite() {
        return overwrite;
    }

    public void setOverwrite(final boolean overwrite) {
        this.overwrite = overwrite;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public FileHandleImpl createFileHandle(final String filePath) {
        filesCreated++;
        final File f = new File(path, filePath);
        return new FileHandleImpl(this, f);
    }

    public String getFileEncoding() {
        return fileEncoding;
    }

    public void setFileEncoding(final String fileEncoding) {
        this.fileEncoding = fileEncoding;
        hasDefaultEncoding = false;
    }

    public List<PostProcessor> postprocessors = new ArrayList<PostProcessor>();

    public void addPostprocessor(final PostProcessor b) {
        postprocessors.add(b);
    }
    public List<VetoStrategy> vetoStartegies = new ArrayList<VetoStrategy>();
    
    public void addVetoStrategy(final VetoStrategy b) {
    	vetoStartegies.add(b);
    }

    public void beforeWriteAndClose(final FileHandle impl) {
        filesWrittenAndClosed++;
        for (final Iterator<PostProcessor> iter = postprocessors.iterator(); iter.hasNext();) {
            final PostProcessor b = iter.next();
            b.beforeWriteAndClose(impl);
        }
    }

    public void afterClose(final FileHandle impl) {
        for (final Iterator<PostProcessor> iter = postprocessors.iterator(); iter.hasNext();) {
            final PostProcessor b = iter.next();
            b.afterClose(impl);
        }
    }

    private int filesCreated = 0;

    private int filesWrittenAndClosed = 0;

    public int getFilesCreated() {
        return filesCreated;
    }

    public int getFilesWrittenAndClosed() {
        return filesWrittenAndClosed;
    }

    public Outlet(String path) {
        this.path = path;
    }
    
    public Outlet() {
    }

    public Outlet (boolean append, String encoding, String name, boolean overwrite, String path) {
        this.append = append;
        this.fileEncoding = encoding;
        this.name = name;
        this.overwrite = overwrite;
        this.path = path;
    }
    
	public boolean shouldWrite(FileHandleImpl fileHandleImpl) {
		for (VetoStrategy vs : vetoStartegies) {
			if (vs.hasVeto(fileHandleImpl))
            	return false;
        }
		return true;
	}

}
