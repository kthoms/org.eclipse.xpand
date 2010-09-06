package org.eclipse.xtend.backend.compiler;

import java.util.Map;
import java.util.Set;

import org.eclipse.xtend.backend.common.FunctionDefContext;

public class FdcHolder {
	
	private Map<String, FunctionDefContext> _fdcs;
	
	
	public FdcHolder(Map<String, FunctionDefContext> fdcs) {
		super();
		_fdcs = fdcs;
	}
	
	public Set<String> getResources() {
		return _fdcs.keySet();
	}

	public FunctionDefContext getFdc(String resource) {
		return _fdcs.get(resource);
	}

}
