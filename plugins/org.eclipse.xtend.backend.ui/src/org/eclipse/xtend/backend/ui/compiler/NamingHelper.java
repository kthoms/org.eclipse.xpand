package org.eclipse.xtend.backend.ui.compiler;

public class NamingHelper {
	
	public static String pruneForJava (String name) {
		name = name.replaceAll("\\.", "");
		return name;
	}
	
	public static String toMiddleEndClassName (String name, String packageName) {
		String[] nameParts = name.split("\\.");
		StringBuilder simpleClassName = new StringBuilder();
		for (String p : nameParts) {
			simpleClassName.append (p.substring(0, 1).toUpperCase());
			simpleClassName.append (p.substring(1));
		}
		if (packageName != null) {
			StringBuilder pkgName = new StringBuilder (packageName.replaceAll("::", "."));
			simpleClassName.insert (0, ".");
			simpleClassName.insert (0, pkgName);
		}
		return simpleClassName.toString ();
	}

}
