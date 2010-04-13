/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.internal.xtend.xtend.ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.internal.xtend.expression.ast.DeclaredParameter;
import org.eclipse.internal.xtend.expression.ast.Identifier;
import org.eclipse.internal.xtend.expression.ast.SyntaxElement;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.EvaluationException;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.Type;

public abstract class AbstractExtension extends SyntaxElement implements Extension {

	private final Identifier name;

	private final List<DeclaredParameter> formalParameters;

	protected ExtensionFile file;

	protected boolean cached = false;

	private boolean isPrivate = false;

	public AbstractExtension(final Identifier name, final Identifier returnType,
			final List<DeclaredParameter> formalParameters, final boolean cached, final boolean isPrivate) {
		this.name = name;
		this.formalParameters = formalParameters;
		this.returnType = returnType;
		this.cached = cached;
		this.isPrivate = isPrivate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xtend.ast.Extension#getFormalParameters()
	 */
	public List<DeclaredParameter> getFormalParameters() {
		return formalParameters;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xtend.ast.Extension#getName()
	 */
	public String getName() {
		return name.getValue();
	}

	public Identifier getNameIdentifier() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.internal.xtend.xtend.ast.Extension#getReturnType(org.eclipse
	 * .xtend.typesystem.Type[], org.eclipse.xtend.expression.ExecutionContext,
	 * java.util.Set)
	 */
	public final Type getReturnType(final Type[] parameters, ExecutionContext ctx, final Set<AnalysationIssue> issues) {
		ctx = ctx.cloneWithResource(getExtensionFile());
		return internalGetReturnType(parameters, ctx, issues);
	}

	protected abstract Type internalGetReturnType(Type[] parameters, ExecutionContext ctx, Set<AnalysationIssue> issues);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xtend.ast.Extension#analyze(org.eclipse
	 * .expression.ExecutionContext, java.util.Set)
	 */
	public final void analyze(ExecutionContext ctx, final Set<AnalysationIssue> issues) {
		try {
			if (ctx.getCallback() != null) {
				if (!ctx.getCallback().pre(this, ctx)) {
					return;
				}
			}
			final List<DeclaredParameter> params = getFormalParameters();
			final Set<String> usedNames = new HashSet<String>();
			for (final Iterator<DeclaredParameter> iter = params.iterator(); iter.hasNext();) {
				final DeclaredParameter p = iter.next();
				final Type pt = ctx.getTypeForName(p.getType().getValue());
				if (pt == null) {
					issues.add(new AnalysationIssue(AnalysationIssue.TYPE_NOT_FOUND, "Type not found: "
							+ p.getType().getValue(), p.getType()));
				}
				if (!usedNames.add(p.getName().getValue())) {
					issues.add(new AnalysationIssue(AnalysationIssue.SYNTAX_ERROR, "Duplicate parameter name: "
							+ p.getName().getValue(), p.getName()));
				}
				ctx = ctx.cloneWithVariable(new Variable(p.getName().getValue(), pt));
			}
			if (returnType != null) {
				final Type pt = ctx.getTypeForName(returnType.getValue());
				if (pt == null) {
					issues.add(new AnalysationIssue(AnalysationIssue.TYPE_NOT_FOUND, "Type not found: "
							+ returnType.getValue(), returnType));
				}
			}
			try {
				analyzeInternal(ctx, issues);
			}
			catch (final RuntimeException ex) {
				ctx.handleRuntimeException(ex, this, null);
			}
		}
		finally {
			if (ctx.getCallback() != null) {
				ctx.getCallback().post(this, ctx, null);
			}
		}
	}

	protected void analyzeInternal(final ExecutionContext ctx, final Set<AnalysationIssue> issues) {
		checkForAmbiguousDefinitions(ctx, issues);
	}

	private final Map<List<Object>, Object> cache = new HashMap<List<Object>, Object>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xtend.ast.Extension#evaluate(java.lang.Object[],
	 * org.eclipse.expression.ExecutionContext)
	 */
	public Object evaluate(final Object[] parameters, ExecutionContext ctx) {
		try {
			if (ctx.getCallback() != null) {
				if(!ctx.getCallback().pre(this, ctx)) {
					return null;
				}
			}
			if (cached) {
				final List<Object> l = Arrays.asList(parameters);
				if (cache.containsKey(l))
					return cache.get(l);
			}
			if (getExtensionFile() == null)
				throw new IllegalStateException("No containing file!");
			ctx = ctx.cloneWithResource(getExtensionFile());
			final Object result = evaluateInternal(parameters, ctx);
			if (cached) {
				cache.put(Arrays.asList(parameters), result);
			}
			return result;
		}
		catch (final RuntimeException ex) {
			ctx.handleRuntimeException(ex, this, null);
		}
		finally {
			if (ctx.getCallback() != null) {
				ctx.getCallback().post(this, ctx, null);
			}
		}
		return null;
	}

	public final void setExtensionFile(final ExtensionFile f) {
		file = f;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xtend.ast.Extension#getExtensionFile()
	 */
	public ExtensionFile getExtensionFile() {
		return file;
	}

	protected abstract Object evaluateInternal(Object[] parameters, ExecutionContext ctx);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xtend.ast.Extension#getParameterNames()
	 */
	public List<String> getParameterNames() {
		final List<String> names = new ArrayList<String>();
		for (final Iterator<DeclaredParameter> iter = getFormalParameters().iterator(); iter.hasNext();) {
			names.add(iter.next().getName().getValue());
		}
		return names;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xtend.ast.Extension#init(org.eclipse
	 * .expression.ExecutionContext)
	 */
	public void init(final ExecutionContext ctx) {
		if (parameterTypes == null) {
			try {
				parameterTypes = new ArrayList<Type>();
				for (final Iterator<DeclaredParameter> iter = getFormalParameters().iterator(); iter.hasNext();) {
					final String name = iter.next().getType().getValue();
					final Type t = ctx.getTypeForName(name);
					if (t == null)
						throw new EvaluationException("Couldn't resolve type for '" + name
								+ "'. Did you forget to configure the corresponding metamodel?", this, ctx);
					parameterTypes.add(t);
				}
			}
			catch (final RuntimeException e) {
				parameterTypes = null;
				throw e;
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xtend.ast.Extension#getReturnType()
	 */
	public Type getReturnType() {
		throw new UnsupportedOperationException();
	}

	private List<Type> parameterTypes = null;

	protected Identifier returnType;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xtend.ast.Extension#getParameterTypes()
	 */
	public List<Type> getParameterTypes() {
		return parameterTypes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xtend.ast.Extension#getReturnTypeIdentifier()
	 */
	public Identifier getReturnTypeIdentifier() {
		return returnType;
	}

	private String _stringRepresentation = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xtend.ast.Extension#toString()
	 */
	@Override
	public String toString() {
		if (_stringRepresentation == null) {
			_stringRepresentation = (returnType != null ? returnType.getValue() + " " : "") + getName() + "("
					+ paramsToString() + ")";
		}

		return _stringRepresentation;
	}

	private String _outlineRepresentation = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xtend.ast.Extension#toOutlineString()
	 */
	public String toOutlineString() {
		if (_outlineRepresentation == null) {
			_outlineRepresentation = getName() + "(" + paramsToOutlineString() + ")"
					+ (returnType != null ? ": " + returnType.getValue() : "");
		}
		return _outlineRepresentation;
	}

	private String paramsToString() {
		final StringBuffer buff = new StringBuffer();
		for (final Iterator<DeclaredParameter> iter = getFormalParameters().iterator(); iter.hasNext();) {
			final DeclaredParameter element = iter.next();
			buff.append(element.getType() + " " + element.getName());
			if (iter.hasNext()) {
				buff.append(",");
			}
		}
		return buff.toString();
	}

	private String paramsToOutlineString() {
		final StringBuffer buff = new StringBuffer();
		for (final Iterator<DeclaredParameter> iter = getFormalParameters().iterator(); iter.hasNext();) {
			final DeclaredParameter element = iter.next();
			buff.append(element.getType());
			if (iter.hasNext()) {
				buff.append(", ");
			}
		}
		return buff.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xtend.ast.Extension#isPrivate()
	 */
	public boolean isPrivate() {
		return isPrivate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xtend.ast.Extension#isCached()
	 */
	public boolean isCached() {
		return cached;
	}

	public String getQualifiedName() {
		return getExtensionFile().getFullyQualifiedName() + "::" + getName();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
		result = prime * result + ((parameterTypes == null) ? 0 : parameterTypes.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final AbstractExtension other = (AbstractExtension) obj;
		if (getName() == null) {
			if (other.getName() != null)
				return false;
		}
		else if (!getName().equals(other.getName()))
			return false;
		if (parameterTypes == null) {
			if (other.parameterTypes != null)
				return false;
		}
		else if (!parameterTypes.equals(other.parameterTypes))
			return false;
		return true;
	}

	protected void checkForAmbiguousDefinitions(final ExecutionContext ctx, final Set<AnalysationIssue> issues) {
		final String name = getName();
		for (final Extension ext : ctx.getAllExtensions()) {
			final String otherName = ext.getName();
			if (name.equals(otherName) && (!getFileName().equals(ext.getFileName()) || getLine() != ext.getLine())) {
				if (getParameterTypes().equals(ext.getParameterTypes())) {
					issues.add(new AnalysationIssue(AnalysationIssue.INTERNAL_ERROR, "Duplicate extension definition: "
							+ toOutlineString(), this, false, start));
					issues.add(new AnalysationIssue(AnalysationIssue.INTERNAL_ERROR, "Duplicate extension definition: "
							+ ext.toOutlineString(), (AbstractExtension) ext, false, ext.getStart()));
				}
			}
		}
	}

}
