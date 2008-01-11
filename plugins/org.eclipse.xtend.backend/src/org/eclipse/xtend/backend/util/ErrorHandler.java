package org.eclipse.xtend.backend.util;


/**
 * This class serves as the single handler for dealing with exceptions that prevent
 *  continued execution and can not be meaningfully handled locally.
 *  
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class ErrorHandler {
    public static void handle (Exception exc) {
        if (exc instanceof FatalException)
            throw (FatalException) exc;
        
        throw new FatalException (exc);
    }
    
    public static void handle (String msg, Exception exc) {
        if (exc instanceof FatalException) {
            final FatalException fe = (FatalException) exc;
            fe.addMessage(msg);
            throw fe;
        }
        
        throw new FatalException (msg, exc);
    }
}
