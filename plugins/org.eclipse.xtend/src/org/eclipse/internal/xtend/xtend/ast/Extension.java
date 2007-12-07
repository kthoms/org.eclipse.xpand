package org.eclipse.internal.xtend.xtend.ast;

import java.util.List;
import java.util.Set;

import org.eclipse.internal.xtend.expression.ast.DeclaredParameter;
import org.eclipse.internal.xtend.expression.ast.ISyntaxElement;
import org.eclipse.internal.xtend.expression.ast.Identifier;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.typesystem.ParameterizedCallable;
import org.eclipse.xtend.typesystem.Type;

public interface Extension extends ParameterizedCallable, ISyntaxElement {

	public List<DeclaredParameter> getFormalParameters();

	public String getName();

	public Type getReturnType(final Type[] parameters, ExecutionContext ctx,
			final Set<AnalysationIssue> issues);

	public void analyze(ExecutionContext ctx, final Set<AnalysationIssue> issues);

	public Object evaluate(final Object[] parameters, ExecutionContext ctx);

	public ExtensionFile getExtensionFile();

	public List<String> getParameterNames();

	public void init(final ExecutionContext ctx);

	public Type getReturnType();

	public List<Type> getParameterTypes();

	public Identifier getReturnTypeIdentifier();

	public String toString();

	public String toOutlineString();

	public boolean isPrivate();

	public boolean isCached();

	public void setExtensionFile(ExtensionFile file);

	public String getQualifiedName();

}