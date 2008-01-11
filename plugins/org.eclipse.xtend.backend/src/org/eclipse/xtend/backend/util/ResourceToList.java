package org.eclipse.xtend.backend.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/**
 * This class converts the contents of a resource to a list. It removes empty lines (i.e. lines containing
 *  only whitespace), and it trims leading and trailing whitespace. It also removes comments, i.e. parts of
 *  a line following a '#' character.<br>
 * 
 * The contents of the file are read using the default locale of the platform.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class ResourceToList {
    final List<String> _result = new ArrayList<String>();
   
    /**
     * @param in may be null, in which case the resulting list is empty.
     */
    public ResourceToList (InputStream in) {
        if (in == null)
            return;
        
        final BufferedReader br = new BufferedReader (new InputStreamReader (in));
        
        String line = null;
        try {
            while ((line = br.readLine()) != null)
                processLine (line);
        }
        catch (IOException e) {
            ErrorHandler.handle(e);
        }
    }
    
    private void processLine (String line) {
        line = stripComment (line);
        line = line.trim ();
        if (line.isEmpty())
            return;
        
        _result.add (line);
    }
    
    private String stripComment (String line) {
        final int startComment = line.indexOf ('#');
        if (startComment < 0)
            return line;
        
        return line.substring (startComment);
    }
    
    public List<String> getResult () {
        return _result;
    }
}
