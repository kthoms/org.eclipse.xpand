/*******************************************************************************
 * Copyright (c) 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.xtend.middleend.xpand.internal.xpandlib.pr;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtend.backend.util.Base64Codec;
import org.eclipse.xtend.backend.util.FileHelper;
import org.eclipse.xtend.backend.util.GenericFileFilter;

public class XpandProtectedRegionResolver {

    public static final String XPAND_PROTECTED_REGION_RESOLVER = "XpandProtectedRegionResolver";

    private static final String PROTECT_AFTER_ID = ")";

    private static final String PROTECT_B64_AFTER_ID = "]";

    private static final String PROTECT_B64_BEFORE_ID = "[";

    private static final String PROTECT_BEFORE_ID = "(";

    private static final String PROTECT_BEGIN = "PROTECTED REGION ID";

    private static final String PROTECT_END = "PROTECTED REGION END";

    private static final String PROTECT_START_END = "START";

    private static final String ENABLED = "ENABLED";
	
	
	private Map<String, XpandProtectedRegion> _regions;

	private String _ignoreList;

	private boolean _defaultExcludes;

	private File[] _srcPaths;

	private HashSet<String> _usedSet;
	
	private Log log = LogFactory.getLog(XpandProtectedRegionResolver.class);

	private String _fileEncoding;

	private boolean _useBase64;
	
	
	
	public class XpandProtectedRegion {
		
		private final String _id;
		
		private final int _startPos;
		
		private final int _endPos;
		
		private final File _file;
		
		private final String _encoding;
		
		private final boolean _disabled;
		
		private final boolean _isBase64;
		
		private final SoftReference<String> _body;
		
		
		public XpandProtectedRegion(final String id, final int startPos, final int endPos,
				final File file, final String encoding, boolean disabled, boolean useBase64,
				final String body) {
			super();
			_id = id;
			_startPos = startPos;
			_endPos = endPos;
			_file = file;
			_encoding = encoding;
			_disabled = disabled;
			_isBase64 = useBase64;
			_body = new SoftReference<String> (body);
		}
		
		public String getBody () {
			return _body.get();
		}
		
		public String getBody (final String startComment, final String endComment) throws XpandProtectedRegionSyntaxException {
            String body = _body.get();

            if (body == null) {
                try {
                    body = FileHelper.read (_file, _encoding).substring(_startPos, _endPos);
                } catch (final IOException e) {
                    throw new RuntimeException ("Unexpected I/O exception (source files removed?)", e);
                }
            }

            final int endCommentPos = body.indexOf (endComment);

            if ((endCommentPos < 0) || (body.substring (0, endCommentPos).trim().length() > 0))
                throw new XpandProtectedRegionSyntaxException("Start of protected region " + _id
                        + " does not end with comment " + endComment);

            final int startCommentPos = body.lastIndexOf (startComment);

            if ((startCommentPos < 0)
                    || (body.substring(startCommentPos + startComment.length()).trim().length() > 0))
                throw new XpandProtectedRegionSyntaxException("End of protected region " + _id
                        + " does not start with comment " + startComment + " \"" +body.substring(startCommentPos + startComment.length()).trim() + "\"");

            return body.substring(endCommentPos + endComment.length(), startCommentPos);
		}

		public String getId() {
			return _id;
		}

		public File getFile() {
			return _file;
		}

		public String getStartString(final String startComment, final String endComment) {
            if (_isBase64) {
                try {
                    return (startComment + PROTECT_BEGIN + PROTECT_B64_BEFORE_ID + Base64Codec.toString(_id)
                            + PROTECT_B64_AFTER_ID + " " + (!_disabled ? ENABLED + " " : "") + PROTECT_START_END + endComment);
                } catch (final IOException ie) {
                    // fallback to old style if BASE64Encoder fails
                }
            }

            return (startComment + PROTECT_BEGIN + PROTECT_BEFORE_ID + _id + PROTECT_AFTER_ID + " "
                    + (!_disabled ? ENABLED + " " : "") + PROTECT_START_END + endComment);
        }

        public String getEndString(final String startComment, final String endComment) {
            return startComment + PROTECT_END + endComment;
        }
		
	}
	
	public XpandProtectedRegionResolver () {
		super();
	}
	
    public XpandProtectedRegionResolver (String ignoreList,
			boolean defaultExcludes, List<Outlet> outlets, String fileEncoding,
			boolean useBase64) {
		super();
		_ignoreList = ignoreList;
		_defaultExcludes = defaultExcludes;
		_srcPaths = new File [outlets.size()];
		for (int i = 0; i < _srcPaths.length; i++) {
			_srcPaths[i] = new File (outlets.get(i).getPath());
		}
		_fileEncoding = fileEncoding;
		_useBase64 = useBase64;
	}

    /**
     * Initializes the XpandProtectedRegionResolver. This starts the scan over all configured paths (property 'srcPaths').
     * <p>
     * A second call (already initialized) to this method will return immediately. The method should be called lazily. 
     * 
     * @throws DuplicateXpandProtectedRegionException If a Protected Region Id is detected the second time, i.e. it is not unique.
     */
    public void init() throws DuplicateXpandProtectedRegionException {
    	// Already initialized?
        if (_regions != null) {
            return;
        }

        // Initialize the Protected Region map        
        _regions = new HashMap<String, XpandProtectedRegion> ();
        _usedSet = new HashSet<String> ();

        if (_srcPaths==null) {
        	log.warn ("No source paths configured for scanning.");
        	// abort 
        	return;
        }
        
        long time = 0;
        long fileCount = 0;

        if (log.isInfoEnabled ()) {
            log.info ("Source scan started ...");
            time = System.currentTimeMillis();
        }

        // create the file filter 
        final GenericFileFilter filter = new GenericFileFilter(_ignoreList, _defaultExcludes);

        // Scan all configured paths 
        for (int i = 0; i < _srcPaths.length; i += 1) {
            try {
            	// retrieve (recursive) all files from a path matching the configured filter 
                final File[] files = FileHelper.getAllFiles (_srcPaths[i], filter);

                fileCount += files.length;

                // scan all files
                for (int j = 0; j < files.length; j += 1) {
                	// retrieve the Protected Regions from the current file
                    final Iterator<XpandProtectedRegion> regions = retrieveProtectedRegions (files[j], _fileEncoding, _useBase64).iterator();

                    while (regions.hasNext()) {
                        final XpandProtectedRegion region = regions.next ();
                        register (region);
                    }
                }
            } catch (final IOException e) {
                throw new RuntimeException ("Unexpected I/O exception", e);
            } catch (final XpandProtectedRegionSyntaxException e) {
                throw new RuntimeException (e.getMessage (), e);
            }
        }

        if (log.isInfoEnabled()) {
            time = System.currentTimeMillis () - time;

            log.info("Source scan finished in " + (time / 1000.0) + "s");
            log.info("Files scanned: " + fileCount);
            log.info("Regions found: " + _regions.size());
        }

    }
	
	public XpandProtectedRegion getProtectedRegion (final String id) {
		try {
			init ();
		} catch (DuplicateXpandProtectedRegionException e) {
			log.warn (e.getMessage (), e);
		}
        if (!_usedSet.add(id)) {
        	// id was not added to usedSet -> id was already queried before! 
            log.warn ("Protected region with ID '" + id + "' referenced more than once");
        }
		return _regions.get (id);
	}

	/**
	 * Factory method to create an XpandProtectedRegion
	 */
    public XpandProtectedRegion createProtectedRegion(final String id, final boolean disabled) {
        return new XpandProtectedRegion(id, 0, 0, null, null, disabled, _useBase64, null);
    }
	
    /**
     * Register a protected region under it's ID
     * @param region
     */
	public void register (final XpandProtectedRegion region) throws DuplicateXpandProtectedRegionException {
		if (!isRegistered(region)) {
			_regions.put (region.getId(), region);
		} else {
			final String id = region.getId();
			throw new DuplicateXpandProtectedRegionException ("The protected region Id '" + id + "' occuring in files " + region.getFile ()
					+ " and " + _regions.get (id).getFile ()
					+ " is not unique");
		}
	}
	
	public boolean isRegistered (final XpandProtectedRegion region) {
		return _regions.containsKey (region.getId());
	}
	
    /**
     * Retrieves all Protected Regions from a source file.
     * @param file The source file to scan.
     * @return All found Protected Regions in the specified file.
     * @throws XpandProtectedRegionSyntaxException If one of the Protected Regions in the file is incomplete or invalid.
     * @throws IOException On errors occuring when reading the file
     */
    private Collection<XpandProtectedRegion> retrieveProtectedRegions (final File file, final String encoding, final boolean useBASE64) throws XpandProtectedRegionSyntaxException, IOException {
        final List<XpandProtectedRegion> regions = new ArrayList<XpandProtectedRegion>();

        final String source = FileHelper.read(file, encoding);

        final int beginLength = PROTECT_BEGIN.length();
        final int startEndLength = PROTECT_START_END.length();
        final int idBeginLength = PROTECT_BEFORE_ID.length();
        final int idEndLength = PROTECT_AFTER_ID.length();

        int start = source.indexOf (PROTECT_BEGIN);

        while (start >= 0) {
            final int blockStart = start + beginLength;

            boolean isB64 = false;
            int idStart = source.indexOf (PROTECT_BEFORE_ID, blockStart);

            if (idStart != blockStart) {
                idStart = source.indexOf (PROTECT_B64_BEFORE_ID, blockStart);
                isB64 = true;
            }
            idStart += idBeginLength;

            final int end = source.indexOf (PROTECT_END, idStart);
            final int next = source.indexOf (PROTECT_BEGIN, idStart);

            if ((end < 0) || ((next >= 0) && (next < end)))
                throw new XpandProtectedRegionSyntaxException ("Protected region at index " + start + " in file '" + file
                        + "' is incomplete");

            final int idEnd = source.indexOf (isB64 ? PROTECT_B64_AFTER_ID : PROTECT_AFTER_ID, idStart);

            if ((idEnd <= idStart) || (end < idEnd))
                throw new XpandProtectedRegionSyntaxException ("Protected region Id at index " + start + " in file '" + file
                        + "' is incomplete");

            String id = new String(source.substring (idStart, idEnd));

            if (isB64) {
                try {
                    id = new String (Base64Codec.toByteArray(id));
                } catch (final IOException ie) {
                    throw new XpandProtectedRegionSyntaxException ("Protected region Id at index " + start + " in file '"
                            + file + "' is incomplete", ie);
                }
            }

            final int startEnd = source.indexOf (PROTECT_START_END, idEnd + idEndLength);

            if (end < startEnd)
                throw new XpandProtectedRegionSyntaxException ("Protected region start at index " + start + " in file '"
                        + file + "' is incomplete");

            final String type = new String(source.substring (idEnd + idEndLength, startEnd).trim().toUpperCase());

            if (!(type.equals("") || type.equals(ENABLED)))
                throw new XpandProtectedRegionSyntaxException ("Protected region start at index " + start + " in file "
                        + file + " has illegal type '" + type+ "'");
            if (type.equals(ENABLED)) {
                final String body = new String (source.substring (startEnd + startEndLength, end));
                regions.add (new XpandProtectedRegion (id, startEnd + startEndLength, end, file, encoding, false, useBASE64, body));
            }
            start = next;
        }

        return regions;
    }

    /**
     * Dumps all known protected regions to files. For each protected region a file is created. 
     * @param dumpPath Directory where the dump files are created within.
     */
    public void reportRegions(final File dumpPath) {
        final int unused = _regions.size() - _usedSet.size();

        if (unused > 0) {
            log.warn("There are " + unused + " unused Regions:");

            if (dumpPath != null) {
                dumpPath.mkdirs ();
            }

            for (final Iterator<XpandProtectedRegion> regions = _regions.values().iterator(); regions.hasNext();) {
                final XpandProtectedRegion region = regions.next ();

                final String id = region.getId ();

                if (!_usedSet.contains (id)) {
                    log.warn ("File: " + region.getFile ());
                    log.warn ("ID: " + id);

                    try {
                        if (dumpPath != null) {
                            final File file = new File (dumpPath, Base64Codec.toString(id));

                            Writer writer;

                            if (_fileEncoding == null) {
                                writer = new FileWriter (file);
                            } else {
                                writer = new OutputStreamWriter (new FileOutputStream (file), _fileEncoding);
                            }

                            writer.write(region.getStartString("", ""));
                            writer.write(region.getBody("", ""));
                            writer.write(region.getEndString("", ""));

                            writer.close();
                        }
                    } catch (final IOException e) {
                        throw new RuntimeException ("Unexpected I/O exception", e);
                    } catch (final XpandProtectedRegionSyntaxException e) {
                        log.error(e.getMessage(), e);
                    }
                }
            }
        }
    }

    /**
     * This flag determines whether default file exclusion patterns should be used.
     * @param defaultExcludes <code>true</code>: Use default file exclusion patterns, <code>false</code>: ignore them, just use
     * the patterns specified by {@link #setIgnoreList(String) ignoreList}
     * @see Xpand reference manual 
     */
    public void setDefaultExcludes(final boolean defaultExcludes) {
        _defaultExcludes = defaultExcludes;
    }

    /**
     * Sets the file encoding to be used when reading files.
     * @param encoding A valid encoding string.
     */
    public void setFileEncoding(final String encoding) {
        _fileEncoding = encoding;
    }

    /**
     * Sets a custom list of file patterns that should be filtered during scanning of source files 
     * and directories.
     * @param ignoreList A comma separated list of file patterns to ignore during scan.
     */
    public void setIgnoreList(final String ignoreList) {
        _ignoreList = ignoreList;
    }

    /**
     * Sets the source paths that should be scanned. 
     * @param srcPathsAsString A comma separated list of directory paths.
     * @throws IllegalArgumentException If one of the passed arguments is not a directory or does not exist
     */
    public void setSrcPathes(final String srcPathsAsString) throws IllegalArgumentException {
    	// Split the paths and initialize the
    	// file array 'srcPaths' from it
        if ("".equals(srcPathsAsString)) {
            _srcPaths =  new File[0];
        } else {
	        final String[] s = srcPathsAsString.split(",");
	        _srcPaths = new File[s.length];
	        for (int i = 0; i < _srcPaths.length; i++) {
	            _srcPaths[i] = new File(s[i].trim());
	            // The configured path must point to an existing directory
	            if (!_srcPaths[i].isDirectory()) {
	                throw new IllegalArgumentException("Source path component " + _srcPaths[i]
	                        + " not found or no directory");
	            }
	        }
	        
        }
    }

    public void setUseBASE64(final boolean useBASE64) {
        _useBase64 = useBASE64;
    }
	
	
}
