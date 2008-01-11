package org.eclipose.xtend.middleend;

import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.functions.FunctionDefContextImpl;
import org.eclipse.xtend.backend.syslib.SyslibContributor;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class FunctionDefContextFactory {
    private final SyslibContributor _syslib;
    
    public FunctionDefContextFactory (BackendTypesystem ts) {
        _syslib = new SyslibContributor (ts);
    }
    
    public FunctionDefContextImpl create () {
        return new FunctionDefContextImpl (_syslib);
    }

}
