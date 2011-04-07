package org.eclipse.xtend.backend.compiler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.xtend.backend.common.FunctionDefContext;

public class FdcHolder {
	
	private List<CompilationUnit> compilationUnits;
	
	private List<String> resources;
	
	
	public FdcHolder(Map<String, FunctionDefContext> fdcs) {
		compilationUnits = new ArrayList<CompilationUnit> (fdcs.size());
		resources = new ArrayList<String> (fdcs.size());
		for (Entry<String, FunctionDefContext> entry : fdcs.entrySet()) {
			compilationUnits.add (new CompilationUnit (entry.getKey(), entry.getValue()));
		}
	}


	/**
	 * @return the compilationUnits
	 */
	public List<CompilationUnit> getCompilationUnits() {
		return compilationUnits;
	}


	/**
	 * @param compilationUnits the compilationUnits to set
	 */
	public void setCompilationUnits(List<CompilationUnit> compilationUnits) {
		this.compilationUnits = compilationUnits;
	}


	/**
	 * @return the resources
	 */
	public List<String> getResources() {
		return resources;
	}


	/**
	 * @param resources the resources to set
	 */
	public void setResources(List<String> resources) {
		this.resources = resources;
	}
	
}
