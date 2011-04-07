package org.eclipse.xtend.backend.compiler.model;

import java.util.List;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.common.QualifiedName;

public class NamedFunctionModel {
	
	private QualifiedName name;
	
	private Function function;
	
	public NamedFunctionModel(QualifiedName name, Function function) {
		super();
		this.name = name;
		this.function = function;
	}

	/**
	 * @return the name
	 */
	public QualifiedName getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(QualifiedName name) {
		this.name = name;
	}

	/**
	 * @return the function
	 */
	public Function getFunction() {
		return function;
	}

	/**
	 * @param function the function to set
	 */
	public void setFunction(Function function) {
		this.function = function;
	}
	
	public List<? extends BackendType> getParameterTypes () {
		return function.getParameterTypes();
	}
	
	public BackendType getReturnType () {
		return function.getReturnType();
	}

	public ExpressionBase getGuard () {
		return function.getGuard();
	}
	
	public boolean isCached () {
		return function.isCached();
		
	}
}
