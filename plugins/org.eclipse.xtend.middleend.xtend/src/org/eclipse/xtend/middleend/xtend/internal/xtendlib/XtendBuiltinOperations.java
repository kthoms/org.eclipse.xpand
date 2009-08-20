package org.eclipse.xtend.middleend.xtend.internal.xtendlib;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.types.builtin.ObjectType;
import org.eclipse.xtend.middleend.javaannotations.AbstractExecutionContextAware;
import org.eclipse.xtend.middleend.javaannotations.M2tCached;

public class XtendBuiltinOperations extends AbstractExecutionContextAware {

	@M2tCached
	public BackendType XtendMetaType (Object o) {
        return _ctx.getTypesystem().findType(o);
	}
}
