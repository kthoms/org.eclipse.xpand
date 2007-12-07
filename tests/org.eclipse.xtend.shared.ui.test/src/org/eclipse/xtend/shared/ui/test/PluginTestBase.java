package org.eclipse.xtend.shared.ui.test;

import java.util.HashMap;

import junit.framework.TestCase;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

public abstract class PluginTestBase  extends TestCase {
    protected TestEnvironment env;

    public void setUp() throws Exception {
        env = new TestEnvironment();
    }

    public void tearDown() throws Exception {
        env.resetWorkspace();
    }
    
    /**
     * Asserts that no markers with severity ERROR are attached to a file
     * @param tpl Path to the file
     */
    public void assertNoErrorMarkers (final IPath tpl) {
        final IMarker[] markers = env.getMarkersFor(tpl);
        for (IMarker marker : markers) {
        	try {
        		if (marker.isSubtypeOf(IMarker.PROBLEM)) {
        			fail(getDescription(marker));
        		}
			} catch (CoreException e) {
				throw new RuntimeException(e);
			}
        }
    }
    
    /**
     * Prints out the markers attached to a file
     * @param tpl Path to the file
     */
    protected void dumpMarkers(final IPath tpl) {
        final IMarker[] markers = env.getMarkersFor(tpl);
        for (int i = 0; i < markers.length; i++) {
            final IMarker marker = markers[i];
            System.out.println(getDescription(marker));
        }
    }
    
    /**
     * Gets a string representation of marker
     * @param marker The marker instance
     * @return Readable description of the marker
     */
	protected String getDescription (IMarker marker) {
    	try {
	    	HashMap<String, Object> map = new HashMap<String, Object>();
	    	map.put("resource",marker.getResource().getName());
	    	map.put("type", marker.getType());
	    	map.put("attributes", new HashMap(marker.getAttributes()).toString());
	    	return map.toString();
    	} catch (CoreException e) {
    		throw new RuntimeException(e);
    	}
    }

}
