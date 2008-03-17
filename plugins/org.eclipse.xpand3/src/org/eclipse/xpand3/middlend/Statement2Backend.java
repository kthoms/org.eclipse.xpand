package org.eclipse.xpand3.middlend;

import org.eclipse.xpand3.statement.util.StatementSwitch;
import org.eclipse.xtend.backend.common.ExpressionBase;

/**
 * 
 * @author Jan Köhnlein
 * 
 */
public class Statement2Backend extends StatementSwitch<ExpressionBase> {

	private Xpand3MiddleEnd xpand3MiddleEnd;

	public Statement2Backend(Xpand3MiddleEnd xpand3MiddleEnd) {
		this.xpand3MiddleEnd = xpand3MiddleEnd;
	}

	private Expression2Backend getExpression2Backend() {
		return xpand3MiddleEnd.getExpression2Backend();
	}

	private Declaration2Backend getDeclaration2Backend() {
		return xpand3MiddleEnd.getDeclaration2Backend();
	}
}
