package org.eclipse.xtend.middleend.xtend.internal.xtendlib;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.types.builtin.ObjectType;
import org.eclipse.xtend.middleend.javaannotations.AbstractExecutionContextAware;
import org.eclipse.xtend.middleend.javaannotations.M2tCached;

public class XtendBuiltinOperations extends AbstractExecutionContextAware {

	@M2tCached
	public BackendType XtendMetaType (Object o) {
        return _ctx.getTypesystem().findType(o);
	}
	
	@M2tCached
	public String XtendStringReplaceFirst (String s, String regex, String replacement) {
        return s.replaceFirst(regex, replacement);
	}
	
	@M2tCached
	public List XtendUpto (Long target, Long v) {
        final List result = new ArrayList();
        Long l1 = target;
        while (l1.compareTo(v) <= 0) {
            result.add(l1);
            l1 = l1++;
        }
        return result;
	}
	
	@M2tCached
	public List XtendUpto (Integer target, Integer v) {
        final List result = new ArrayList();
        Integer l1 = target;
        while (l1.compareTo(v) <= 0) {
            result.add(l1);
            l1++;
        }
        return result;
	}
	
	@M2tCached
	public List XtendUpto (Long target, Long v, Long inc) {
        final List result = new ArrayList();
        Long l1 = target;
        while (l1.compareTo(v) <= 0) {
            result.add(l1);
            l1 = l1 + inc;
        }
        return result;
	}
	
	@M2tCached
	public List XtendUpto (Integer target, Integer v, Integer inc) {
        final List result = new ArrayList();
        Integer l1 = target;
        while (l1.compareTo(v) <= 0) {
            result.add(l1);
            l1 = l1 + inc;
        }
        return result;
	}
}
