package org.eclipse.xpand.util.stdlib;

import org.eclipse.internal.xtend.expression.ast.SyntaxElement;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.util.stdlib.TraceComponent;

public class TracingOutput extends OutputImpl {
	
	@Override
	public void pushStatement(SyntaxElement stmt, XpandExecutionContext ctx) {
		super.pushStatement(stmt, ctx);
	}
	
	@Override
	public void openFile(String path, String outletName) {
		super.openFile(path, outletName);
		TraceComponent.reportFileOpen( path );
	}
	
	@Override
	public void closeFile() {
		super.closeFile();
		TraceComponent.reportFileClose();
	}

}
