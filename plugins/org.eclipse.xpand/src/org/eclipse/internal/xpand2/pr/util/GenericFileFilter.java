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

package org.eclipse.internal.xpand2.pr.util;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class GenericFileFilter implements FilenameFilter {
    private final Log log = LogFactory.getLog(getClass());

    // ignore list vom csv.
    // See http://www.cvshome.org/docs/manual/cvs-1.11.10/cvs_18.html#SEC156

    public final static String DEFAULTIGNORELIST = "RCS     SCCS    CVS     CVS.adm " + "RCSLOG  cvslog.* "
            + "tags    TAGS " + ".make.state     .nse_depinfo " + "*~      #*      .#*     ,*      _$*     *$ "
            + "*.old   *.bak   *.BAK   *.orig  *.rej   .del-* " + "*.a     *.olb   *.o     *.obj   *.so    *.exe "
            + "*.Z     *.elc   *.ln " + "core "
            + ".svn";

    private String ivIgnoreList;

    private List<GlobbingFileFilter> fileFilters = null;

    public GenericFileFilter(final String aIgnoreList, final boolean aDefaultexcludes) {
        ivIgnoreList = aDefaultexcludes ? DEFAULTIGNORELIST : "";
        if (aIgnoreList != null) {
            ivIgnoreList += aIgnoreList;
        }
        fileFilters = buildFileFilters(ivIgnoreList);
    }

    public GenericFileFilter(final String aIgnoreList) {
        this(aIgnoreList, false);
    }

    public GenericFileFilter() {
        this(null);
    }

    /**
     * Accept all files and directories not included in the ignore list.
     */
    public boolean accept(final File dir, final String name) {
        return accept(new File(dir, name));
    }

    public boolean accept(final File file) {
        if (!file.isFile() && !file.isDirectory())
            return false;

        for (final Iterator<GlobbingFileFilter> iter = fileFilters.iterator(); iter.hasNext();) {
            final FileFilter ffilter = iter.next();
            if (ffilter.accept(file)) {
                if (log.isDebugEnabled()) {
                    log.debug("File " + file + " excluded (pattern: " + ffilter + ").");
                }
                return false;
            }
        }
        if (log.isDebugEnabled()) {
            log.debug("File " + file + " included.");
        }

        return true;
    }

    private List<GlobbingFileFilter> buildFileFilters(final String aIgnoreList) {
        final List<GlobbingFileFilter> fileFilters = new ArrayList<GlobbingFileFilter>();
        for (final StringTokenizer st = new StringTokenizer(aIgnoreList); st.hasMoreTokens();) {
            final String pattern = st.nextToken();
            fileFilters.add(new GlobbingFileFilter(pattern));
        }
        return fileFilters;
    }

    private static class GlobbingFileFilter implements FileFilter {
        private String globvalue;

        public GlobbingFileFilter(final String globvalue) {
            this.globvalue = globvalue;
        }

        public boolean accept(final File pathname) {
            final int pos = globvalue.indexOf("*");
            if (pos == -1)
                // System.out.println("POS == -1 ("+globvalue+"):
                // "+pathname.getName()+":"+
                // pathname.getName().equals(globvalue));
                return pathname.getName().equals(globvalue);
            if (pos != globvalue.lastIndexOf("*"))
                throw new IllegalArgumentException("GlobbingFileFilter does not support multiple stars (" + globvalue
                        + ").");
            if (pos == 0)
                // System.out.println("POS == 0 ("+globvalue+"):
                // "+pathname.getName()+", "+globvalue.substring(pos+1)+":"+
                // pathname.getName().endsWith(globvalue.substring(pos+1)));
                return pathname.getName().endsWith(globvalue.substring(pos + 1));
            if (pos == (globvalue.length() - 1))
                // System.out.println("POS =="+pos+ "("+globvalue+"):
                // "+pathname.getName()+", "+globvalue.substring(0,pos)+":"+
                // pathname.getName().startsWith(globvalue.substring(0,pos)));
                return pathname.getName().startsWith(globvalue.substring(0, pos));
            throw new IllegalArgumentException("GlobbingFileFilter does not support stars in the middle (" + globvalue
                    + ").");
        }

        @Override
        public String toString() {
            return globvalue;
        }
    }

    @Override
    public String toString() {
        return ivIgnoreList;
    }
}
