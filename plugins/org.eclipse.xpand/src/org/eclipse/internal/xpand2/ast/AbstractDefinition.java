/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.internal.xpand2.ast;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.internal.xpand2.model.XpandDefinition;
import org.eclipse.internal.xpand2.model.XpandResource;
import org.eclipse.internal.xtend.expression.ast.DeclaredParameter;
import org.eclipse.internal.xtend.expression.ast.Identifier;
import org.eclipse.internal.xtend.expression.ast.SyntaxElement;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.Type;

public abstract class AbstractDefinition extends SyntaxElement implements XpandDefinition {

	private Template owner = null;

	private DeclaredParameter[] params;

	private Identifier name;

	private Identifier type;

	private Statement[] body;

	private String _stringRepresentation = null;

	protected boolean wildParams = false;

	public AbstractDefinition(final Identifier name, final Identifier type, final DeclaredParameter[] params, final Statement[] body) {
		this.name = name;
		this.type = type;
		this.params = params;
		this.body = body;
	}

	public XpandResource getOwner() {
		return owner;
	}

	public void setOwner(final Template owner) {
		this.owner = owner;
	}

	public DeclaredParameter[] getParams() {
		return params;
	}

	public List<DeclaredParameter> getParamsAsList() {
		return Arrays.asList(params);
	}

	public Identifier getType() {
		return type;
	}

	public String getTargetType() {
		return type.getValue();
	}

	public Identifier getDefName() {
		return name;
	}

	public String getName() {
		return name.getValue();
	}

	public String getQualifiedName() {
		if (getFileName() != null) {
			String prefix = getFileName().replaceAll("/", "::");
			prefix = prefix.substring(0, prefix.length() - 4);
			return prefix + "::" + getName();
		}
		return getName();
	}

	public String getParamString(boolean typesOnly) {
		if (params == null || params.length == 0)
			return wildParams ? "(*)" : "";
		final StringBuffer buff = new StringBuffer("(");
		for (int i = 0; i < params.length; i++) {
			final DeclaredParameter p = params[i];
			buff.append(p.getType().getValue());
			if(!typesOnly)
				buff.append(" ").append(p.getName().getValue());
			if (i + 1 < params.length) {
				buff.append(",");
			}
		}
		if (wildParams) {
			buff.append(",*");
		}
		return buff.append(")").toString();
	}

	public Statement[] getBody() {
		return body;
	}

	public List<Statement> getBodyAsList() {
		return Arrays.asList(body);
	}

	public void analyze(XpandExecutionContext ctx, final Set<AnalysationIssue> issues) {
		if (getType()==null) {
			issues.add(new AnalysationIssue(AnalysationIssue.INTERNAL_ERROR, "Invalid definition: " + this.toString(), this));
			return;
		}
		final Type thisType = ctx.getTypeForName(getType().getValue());
		if (thisType == null) {
			issues.add(new AnalysationIssue(AnalysationIssue.TYPE_NOT_FOUND, "Couldn't find " + getType().getValue(), getType()));
		}
		ctx = (XpandExecutionContext) ctx.cloneWithVariable(new Variable(ExecutionContext.IMPLICIT_VARIABLE, thisType));
		for (int i = 0; i < params.length; i++) {
			final DeclaredParameter param = params[i];
			Type paramType = ctx.getTypeForName(param.getType().getValue());
			if (paramType == null) {
				issues.add(new AnalysationIssue(AnalysationIssue.TYPE_NOT_FOUND, "Couldn't find " + param.getType().getValue(), param.getType()));
				paramType = ctx.getObjectType();
			}
			final String name = param.getName().getValue();
			ctx = (XpandExecutionContext) ctx.cloneWithVariable(new Variable(name, paramType));
		}
		for (int i = 0; i < getBody().length; i++) {
			Statement stmt = getBody()[i];
			try {
				stmt.analyze(ctx, issues);
			} catch (RuntimeException ex) {
				Map<String, Object> info = new HashMap<String, Object>();
				info.put("body", stmt);
				ctx.handleRuntimeException(ex, this, info);
			}
		}
	}

	public void evaluate(XpandExecutionContext ctx) {
		ctx = (XpandExecutionContext) ctx.cloneWithResource(getOwner());
		for (int i = 0; i < getBody().length; i++) {
			Statement stmt = getBody()[i];
			try {
				stmt.evaluate(ctx);
			} catch (RuntimeException ex) {
				Map<String, Object> info = new HashMap<String, Object>();
				info.put("body", stmt);
				ctx.handleRuntimeException(ex, this, info);
			}
		}
	}

	@Override
	public String toString() {
		String type = getType()!=null ? getType().getValue() : "null";
		if (_stringRepresentation == null) {
			_stringRepresentation = name.getValue() + getParamString(false) + " : " + type;
		}

		return _stringRepresentation;
	}

}
