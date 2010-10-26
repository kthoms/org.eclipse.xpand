package org.eclipse.xtend.backend.compiler.templates;

import org.eclipse.xtend.backend.compiler.util.VarNameGenerator;

public class VarNameGeneratorExpressions {
	
	public static String generateVarName (String baseVarName) {
		return VarNameGenerator.INSTANCE.generate(baseVarName);
	}
	public static long getNextVarIdx () {
		return VarNameGenerator.INSTANCE.getNextVarIdx();
	}

}
