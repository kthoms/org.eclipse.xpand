package org.eclipse.internal.xtend.xtend.ast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.internal.xtend.expression.ast.DeclaredParameter;
import org.eclipse.internal.xtend.expression.ast.Expression;
import org.eclipse.internal.xtend.expression.ast.Identifier;
import org.eclipse.internal.xtend.expression.ast.SyntaxElement;
import org.eclipse.internal.xtend.xtend.XtendFile;
import org.eclipse.internal.xtend.xtend.types.AdviceContextType;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.Type;

public class Around extends SyntaxElement {

	public static final String CONTEXT_PARAM_NAME = "ctx";
	private Identifier pointcut;
	private List<DeclaredParameter> params;
	private boolean wildparams;
	private Expression expression;

	public Around(Identifier pointcut, List<DeclaredParameter> params, boolean wildparams, Expression expr) {
		this.pointcut = pointcut;
		this.params = params;
		this.wildparams = wildparams;
		this.expression = expr;
	}

	public Identifier getPointCut() {
		return pointcut;
	}
	
	public boolean isWildparams() {
		return wildparams;
	}
	
	public Expression getExpression() {
		return expression;
	}
	
	public List<DeclaredParameter> getParams() {
		return params;
	}
	
	private XtendFile parent = null;
	private Pattern p;
	public void setParent(XtendFile parent) {
		this.parent = parent;
	}
	
	public XtendFile getParent() {
		return parent;
	}
	
	public List<Type> getParamTypes(ExecutionContext ctx) {
		ctx = ctx.cloneWithResource(getParent());
		List<Type> result = new ArrayList<Type>();
		for (DeclaredParameter p : getParams()) {
			result.add(ctx.getTypeForName(p.getType().getValue()));
		}
		return result;
	}

	public boolean nameMatches(String fqn) {
        if (p == null) {
            p = Pattern.compile(pointcut.getValue().replaceAll("\\*", ".*"));
        }
        final Matcher m = p.matcher(fqn);
        return m.matches();
    }
	
	public void analyze(ExecutionContext ctx, final Set<AnalysationIssue> issues) {
		ctx = ctx.cloneWithoutVariables();
        ctx = ctx.cloneWithResource(getParent());
        for (DeclaredParameter p : getParams()) {
            final String name = p.getName().getValue();
            if (name.equals(CONTEXT_PARAM_NAME))
            	issues.add(new AnalysationIssue(AnalysationIssue.SYNTAX_ERROR,"The variable name 'ctx' is not allowed here!",p.getName()));
            final Type t = ctx.getTypeForName(p.getType().getValue());
            ctx = ctx.cloneWithVariable(new Variable(name, t));
        }
        ctx = ctx.cloneWithVariable(new Variable(CONTEXT_PARAM_NAME,ctx.getTypeForName(AdviceContextType.TYPE_NAME)));
        expression.analyze(ctx, issues);
	}
	
	@Override
	public String toString() {
		return " around "+pointcut+"("+paramsToString()+(isWildparams()?" * ":"")+") from "+getParent().getFullyQualifiedName();
	}

	private String paramsToString() {
		StringBuffer b = new StringBuffer("");
		for (Iterator<DeclaredParameter> iter = getParams().iterator();iter.hasNext();) {
			DeclaredParameter p = iter.next();
			b.append(p.getType()+" "+p.getName());
			if (iter.hasNext())
				b.append(",");
		}
		return b.toString();
	}

}
