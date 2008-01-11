package org.eclipose.xtend.middleend;

import java.io.InputStream;

import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.types.CompositeTypesystem;
import org.eclipse.xtend.backend.types.emf.EmfTypesystem;
import org.eclipse.xtend.backend.types.java.GlobalJavaBeansTypesystem;
import org.eclipse.xtend.backend.util.ErrorHandler;
import org.eclipse.xtend.backend.util.ResourceToList;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class BackendTypesystemFactory {
    public static final String BACKEND_TYPESYSTEM_RESOURCE = "/xtend.backend.typesystems";
    
    public CompositeTypesystem create () {
        final CompositeTypesystem result = new CompositeTypesystem ();

        final InputStream in = getClass().getResourceAsStream (BACKEND_TYPESYSTEM_RESOURCE);
        if (in == null) {
            result.register (new EmfTypesystem ());
            result.register (new GlobalJavaBeansTypesystem ());
        }
        else {
            for (String s: new ResourceToList (in).getResult()) {
                try {
                    final Class<?> cls = Class.forName (s);
                    final Object o = cls.newInstance();
                    result.register ((BackendTypesystem) o);
                } catch (Exception e) {
                    ErrorHandler.handle(e);
                }
            }
        }
        
        return result;
    }
}
