/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.syslib;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.xtend.backend.common.EfficientLazyString;
import org.eclipse.xtend.backend.common.FutureResultHolder;
import org.eclipse.xtend.backend.util.ErrorHandler;
import org.eclipse.xtend.middleend.javaannotations.AbstractExecutionContextAware;


/**
 * This class provides functions for writing data to files. Since this is part of the core functionality
 *  of a code generator, these functions are in the syslib.<br>
 *  
 * These functions replace the "FILE" construct of XPand. The class makes use of the "single instance per
 *  ExecutionContext" guarantee to store pre-registered "outlets" and allow reuse of predefined
 *  output configurations.
 *  
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class FileIoOperations extends AbstractExecutionContextAware {
    private Map<String, Outlet> _outlets = new HashMap<String, Outlet>();

    public static final String DEFAULT_OUTLET_NAME = "OUT";
    
    ///////////////////////////////////////////////////////////
    // registering the outlets
    ///////////////////////////////////////////////////////////

    public void registerDefaultOutlet (Outlet outlet) {
        _outlets.put (DEFAULT_OUTLET_NAME, outlet);
    }
    
    public void registerDefaultOutlet (String baseDir, String fileEncoding, boolean overwrite) {
        final FileOutlet fo = new FileOutlet ();
        fo.setBaseDir (new File (baseDir));
        fo.setFileEncoding (fileEncoding);
        fo.setOverwrite (overwrite);
        
        registerDefaultOutlet (fo);
    }
    
    public void registerDefaultOutlet (String baseDir, String fileEncoding) {
        registerDefaultOutlet (baseDir, fileEncoding, true);
    }
    
    public void registerDefaultOutlet (String baseDir) {
        registerDefaultOutlet (baseDir, null);
    }
    
    public void registerOutlet (String name, Outlet outlet) {
        _outlets.put (name, outlet);
    }
    
    public void registerOutlet (String name, String baseDir, String fileEncoding, boolean overwrite) {
        final FileOutlet fo = new FileOutlet ();
        fo.setBaseDir (new File (baseDir));
        fo.setFileEncoding (fileEncoding);
        fo.setOverwrite (overwrite);
        
        registerOutlet (name, fo);
    }
    
    public void registerOutlet (String name, String baseDir, String fileEncoding) {
        registerOutlet (name, baseDir, fileEncoding, true);
    }
    
    public void registerOutlet (String name, String baseDir) {
        registerOutlet (name, baseDir, null);
    }
    
    ///////////////////////////////////////////////////////////
    // actually writing to the files
    ///////////////////////////////////////////////////////////
    
    public void writeToFile (String fileName, CharSequence content) {
        writeToFile (DEFAULT_OUTLET_NAME, fileName, false, content);
    }
        
    public void writeToFile (String outletName, String fileName, CharSequence content) {
        writeToFile (outletName, fileName, false, content);
    }
    
    public void writeToFile (String fileName, boolean append, CharSequence content) {
        writeToFile (DEFAULT_OUTLET_NAME, fileName, append, content);
    }

    public void writeToFile (String outletName, String fileName, boolean append, CharSequence content) {
        
        try {
            final Outlet outlet = _outlets.get (outletName);
            if (outlet == null)
                throw new IllegalArgumentException ("no outlet '" + outletName + "' was registered.");

            for (InMemoryPostprocessor pp: outlet.getInMemoryPostprocessors())
                content = pp.process (content, outlet.createUri (fileName));
            
            final Writer w = outlet.createWriter (fileName, append);

            try {
                if (content instanceof EfficientLazyString) 
                    ((EfficientLazyString) content).writeTo (w);
                else 
                    w.write (content.toString()); // content is already a CharSequence --> no handling of overwritten toString() required here
                
            } finally {
                w.close();
            }
            
            for (UriBasedPostprocessor pp: outlet.getUriBasedPostprocessors())
                pp.process (outlet.createUri (fileName));
            
        } catch (IOException exc) {
            ErrorHandler.handle (exc);
        }
    }
    
    public void writeToFile (String fileName, FutureResultHolder content) {
        writeToFile (DEFAULT_OUTLET_NAME, fileName, false, content);
    }
        
    public void writeToFile (String outletName, String fileName, FutureResultHolder content) {
        writeToFile (outletName, fileName, false, content);
    }
    
    public void writeToFile (String fileName, boolean append, FutureResultHolder content) {
        writeToFile (DEFAULT_OUTLET_NAME, fileName, append, content);
    }

    public void writeToFile (String outletName, String fileName, boolean append, FutureResultHolder content) {
        
        try {
            final Outlet outlet = _outlets.get (outletName);
            CharSequence evaluatedContent = null;
            if (content.isReady()) {
            	evaluatedContent = content.toString();
            } else {
            	final Object result = content.evaluate (_ctx);
            	if (result instanceof CharSequence)
            		evaluatedContent = (CharSequence) result;
            }
            if (outlet == null)
                throw new IllegalArgumentException ("no outlet '" + outletName + "' was registered.");

            for (InMemoryPostprocessor pp: outlet.getInMemoryPostprocessors())
                evaluatedContent = pp.process (evaluatedContent, outlet.createUri (fileName));
            
            final Writer w = outlet.createWriter (fileName, append);

            try {
            	if (evaluatedContent != null)
            		w.write (evaluatedContent.toString());
                
            } finally {
                w.close();
            }
            
            for (UriBasedPostprocessor pp: outlet.getUriBasedPostprocessors())
                pp.process (outlet.createUri (fileName));
            
        } catch (IOException exc) {
            ErrorHandler.handle (exc);
        }
    }
}


