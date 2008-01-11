package org.eclipse.xtend.backend.types.builtin;

import java.util.Arrays;
import java.util.List;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.types.AbstractType;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class FunctionType extends AbstractType {
    public static final FunctionType INSTANCE = new FunctionType ();
    
    private FunctionType () {
        super ("Function"); 

        register ("invoke", new Function () {
            public List<BackendType> getParameterTypes() {
                return Arrays.asList(new BackendType[] {FunctionType.INSTANCE, ListType.INSTANCE});
            }
            
            public Object invoke (ExecutionContext ctx, Object[] params) {
                return ctx.getFunctionInvoker().invoke(ctx, (Function) params[0], (List<?>) params[1]);
            }
            
            public boolean isCached() {
                return false;
            }
            
            public ExpressionBase getGuard() {
                return null;
            }
        });
    }
    
    public boolean isAssignableFrom (BackendType other) {
        return other == this || other == VoidType.INSTANCE;
    }
}
