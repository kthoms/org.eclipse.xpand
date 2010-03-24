package org.eclipse.xtend.backend.types.uml2.helper;

import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.functions.FunctionDefContextInternal;
import org.eclipse.xtend.middleend.MiddleEndFactory;

public class UmlTypesTestHelper {


    public static FunctionDefContextInternal createEmptyFdc (BackendTypesystem ts) {
        return (FunctionDefContextInternal) MiddleEndFactory.create (ts, null).getFunctions ("java/lang/Object");
    }

}
