package org.eclipse.xtend.backend.common;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class SourcePos {
    private final String _compilationUnit;
    private final String _callableName;
    private final int _lineNumber;
    
    public SourcePos (String compilationUnit, String callableName, int lineNumber) {
        super();
        _compilationUnit = compilationUnit;
        _callableName = callableName;
        _lineNumber = lineNumber;
    }
    
    public String getCallableName() {
        return _callableName;
    }
    public String getCompilationUnit() {
        return _compilationUnit;
    }
    public int getLineNumber() {
        return _lineNumber;
    }
    
    @Override
    public String toString () {
        return "line " + _lineNumber + "@" + _callableName + " [" + _compilationUnit + "]";
    }
}

