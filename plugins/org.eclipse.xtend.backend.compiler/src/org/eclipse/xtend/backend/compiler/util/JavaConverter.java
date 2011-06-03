package org.eclipse.xtend.backend.compiler.util;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.expr.LiteralExpression;

public class JavaConverter {
	
	public static String toJavaLiteral (LiteralExpression e) {
		if (e.getValue() instanceof String) {
			String resStr = String.valueOf (e.getValue()).replaceAll("\n", "\\\\n");
			resStr = resStr.replaceAll("\t", "\\\\t");
			return "\"" + resStr + "\"";
		}
		if (e.getValue() instanceof Boolean) {
			Boolean bool = (Boolean)e.getValue();
			if (bool.booleanValue()) {
				return "\"true\"";
			} else {
				return "\"false\"";
			}
		}
		if (e.getValue() instanceof BackendType) {
			return "_ctx.getTypesystem().findType (\"" + ((BackendType)e.getValue()).getUniqueRepresentation() + "\")";
		}
		if (e.getValue() != null)
			return e.getValue().toString();
		else
			return "null";
	}

}
