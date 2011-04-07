package org.eclipse.xtend.backend.compiler;

import java.util.Collections;
import java.util.List;

import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.compiler.model.NamedFunctionModel;

import com.google.common.collect.Lists;

public class CompilationUnit {
	
	private String _resource;
	
	private FunctionDefContext _fdc;
	
	private List<NamedFunctionModel> _publicFunctions;
	
	private List<NamedFunctionModel> _allFunctions;
	
	public CompilationUnit(String resource, FunctionDefContext fdc) {
		_resource = resource;
		_fdc = fdc;
		_allFunctions = Lists.transform(Lists.newArrayList(_fdc.getAllFunctions()), new com.google.common.base.Function<NamedFunction, NamedFunctionModel> () {

			public NamedFunctionModel apply(NamedFunction from) {
				// TODO Auto-generated method stub
				return new NamedFunctionModel(from.getName(), from.getFunction());
			}
			
		});
		_publicFunctions = Lists.transform(Lists.newArrayList(_fdc.getPublicFunctions()), new com.google.common.base.Function<NamedFunction, NamedFunctionModel> () {

			public NamedFunctionModel apply(NamedFunction from) {
				// TODO Auto-generated method stub
				return new NamedFunctionModel(from.getName(), from.getFunction());
			}
			
		});
	}

	/**
	 * @return the _resource
	 */
	public String getResource() {
		return _resource;
	}

	/**
	 * @param _resource the _resource to set
	 */
	public void setResource(String resource) {
		this._resource = resource;
	}

	/**
	 * @return the _fdc
	 */
	public FunctionDefContext getFdc() {
		return _fdc;
	}

	/**
	 * @param _fdc the _fdc to set
	 */
	public void setFdc(FunctionDefContext fdc) {
		this._fdc = fdc;
	}
	
	public List<NamedFunctionModel> getPublicFunctions () {
		return _publicFunctions;
	}
	
	public List<NamedFunctionModel> getAllFunctions () {
		return _allFunctions;
	}
	
}
