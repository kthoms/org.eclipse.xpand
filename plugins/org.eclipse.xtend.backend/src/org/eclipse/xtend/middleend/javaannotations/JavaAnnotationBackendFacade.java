/*
Copyright (c) 2009 Andr� Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Andr� Arnold - initial API and implementation
 */
package org.eclipse.xtend.middleend.javaannotations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.middleend.LanguageContributor;
import org.eclipse.xtend.middleend.MiddleEnd;
import org.eclipse.xtend.middleend.MiddleEndFactory;
import org.eclipse.xtend.middleend.plugins.LanguageSpecificMiddleEnd;

public class JavaAnnotationBackendFacade {

	private MiddleEnd _middleend;
	private String _className;

	/**
	 * This method calls a function defined in a class.
	 * @param className
	 *            The full qualified class name of class containing the function
	 *            to be called
	 * @param ts
	 *            The type system, i.e. metamodels
	 * @param functionName
	 *            The function to be called
	 * @param params
	 *            The parameters of the function to be called
	 * @return The result of the function call
	 */
	public static Object invokeFunction(String className, BackendTypesystem ts,
			QualifiedName functionName, List<?> params) {
		return createFromClass(className, ts).invokeFunction(functionName,
				params);
	}

	/**
	 * This method calls a function defined in a class applying advices in the given resource.
	 * @param className
	 *            The full qualified class name of class containing the function
	 *            to be called
	 * @param ts
	 *            The type system, i.e. metamodels
	 * @param adviceResource
	 *            The resource containing the advices to be applied to the
	 *            function, i.e. either a fully qualified classname or a
	 *            resource name
	 * @param functionName
	 *            The function to be called
	 * @param params
	 *            The parameters of the function to be called
	 * @return The result of the function call
	 */
	public static Object invokeFunction(String className, BackendTypesystem ts,
			String adviceResource, QualifiedName functionName, List<?> params) {
		JavaAnnotationBackendFacade facade = createFromClass(className, ts,
				adviceResource);
		MiddleEnd me = facade.getMiddleEnd();
		return facade.invokeFunction(functionName, params);
	}

	/**
	 * This method calls a function registered at the middleend
	 * @param functionName
	 *            The function to be called
	 * @param params
	 *            The parameters of the function to be called
	 * @return The result of the function call
	 */
	public Object invokeFunction(QualifiedName functionName, List<?> params) {
		final FunctionDefContext fdc = _middleend.getFunctions(_className);
		final ExecutionContext ctx = _middleend.getExecutionContext();
				//BackendFacade.createExecutionContext(fdc, _middleend.getTypesystem(), true); // TODO configure
		// isLogStacktrace
		Object result = fdc.invoke(ctx, functionName, params);
		return result;
	}

	public static JavaAnnotationBackendFacade createFromClass(String className,
			BackendTypesystem ts) {
		JavaAnnotationBackendFacade facade = new JavaAnnotationBackendFacade (
				className, ts);
		return facade;
	}

	/**
	 * Creates a {@link LanguageSpecificMiddleEnd} for the JavaAnnotations middleend from a class
	 * @param className The fully qualified classname
	 * @param ts The typesystem in use, i.e. the metamodels
	 * @param adviceResource The resource containing the advice (either a fully qualified classname or filename)
	 * @return The LanguageSpecificMiddleEnd
	 */
	public static JavaAnnotationBackendFacade createFromClass (String className,
			BackendTypesystem ts, String adviceResource) {
		return new JavaAnnotationBackendFacade(className, ts, adviceResource);
	}

	private Map<Class<?>, Object> getSpecificParameters() {
		final Map<Class<?>, Object> result = new HashMap<Class<?>, Object>();
		return result;
	}

	public MiddleEnd getMiddleEnd() {
		return _middleend;
	}

	private JavaAnnotationBackendFacade(String className, BackendTypesystem ts) {
		_className = className;
		if (MiddleEndFactory.canCreateFromExtentions()) {
			_middleend = MiddleEndFactory.createFromExtensions(ts,
				getSpecificParameters());
		} else {
			_middleend = MiddleEndFactory.create(ts, LanguageContributor.INSTANCE.getFreshMiddleEnds(getSpecificParameters()));
		}
	}

	private JavaAnnotationBackendFacade(String className, BackendTypesystem ts,
			String adviceClass) {
		_className = className;
		if (MiddleEndFactory.canCreateFromExtentions()) {
			_middleend = MiddleEndFactory.createFromExtensions(ts,
					getSpecificParameters());
		} else {
			_middleend = MiddleEndFactory.create(ts, LanguageContributor.INSTANCE.getFreshMiddleEnds(getSpecificParameters()));
		}
		_middleend.applyAdvice(adviceClass);
	}

}
