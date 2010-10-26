package org.eclipse.xtend.backend.compiler.util;

public class VarNameGenerator {
	
	public final static VarNameGenerator INSTANCE = new VarNameGenerator();
	
	private Integer varIdx;
	
	private VarNameGenerator() {
		varIdx = new Integer(0);
	}
	
	public String generate (String baseVarName) {
		synchronized (varIdx) {
			varIdx++;		
		}
		final String varName = baseVarName + "_" + varIdx;
		return varName;
	}
	public Integer getNextVarIdx () {
		synchronized (varIdx) {
			varIdx++;
		}
		return varIdx;
	}

}
