package org.eclipse.xtend.backend.functions.java;


/**
 * This class serves as an abstraction to convert between the internal, canonical representation
 *  of the instances of a type, and a variation thereof needed by a specific operation (specifically,
 *  a Java implementation).<p>
 *  
 * Examples of this are the List <--> Array conversion, int <--> long, float <--> double or 
 *  CharSequence <--> String.
 */
public final class ParameterConverter {
    private final int _index;
    private final JavaBuiltinConverter _inner;
    
    public ParameterConverter (int index, JavaBuiltinConverter inner) {
        _index = index;
        _inner = inner;
    }
    
    public void convert (Object[] params) {
        params [_index] = _inner.backendToJava (params[_index]);
    }
}
