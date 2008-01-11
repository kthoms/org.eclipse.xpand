package org.eclipse.xtend.backend.util;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class FatalException extends RuntimeException {
    private String _message = "";
    
    public FatalException (Exception inner) {
        super (inner);
    }
    
    public FatalException (String message, Exception inner) {
        super (inner);
        _message = message;
    }
    
    public void addMessage (String message) {
        if (_message == "")
            _message = message;
        else
            _message = message + ":\n" + _message;
    }
    
    @Override
    public String getMessage () {
        return _message;
    }
}
