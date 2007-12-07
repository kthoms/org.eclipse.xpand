/* <copyright>
 *
 * Copyright (c) 2007 OAW Team, SD-mda Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Markus Voelter - Initial API and implementation
 *     Jeremie Ratomposon <jratomposon@sdmda.com>
 *
 * </copyright>
 */
package org.eclipse.m2t.common.recipe.astChecks.quickFixers;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.m2t.common.recipe.astChecks.checks.EclipseResourceCheckEvaluator;
import org.eclipse.m2t.common.recipe.core.EvaluationStop;
import org.eclipse.m2t.common.recipe.util.EclipseCheck;

public abstract class QuickFixer {

	//So... QuickFixers are bound to EclipseChecks and EclipseResourceCheckEvaluators
	protected EclipseCheck check=null;	
	protected EclipseResourceCheckEvaluator checkEvaluator=null;	
	
	
	protected QuickFixer(EclipseCheck check,EclipseResourceCheckEvaluator checkEvaluator){
		this.check=check;
		this.checkEvaluator=checkEvaluator;
	}
		
	public IStatus quickFixAndEvaluate(){
		
		if(quickFix().equals(Status.CANCEL_STATUS))
			return Status.CANCEL_STATUS;
		
		// then we update the check and consider the work as done
		try {
			checkEvaluator.evaluate(check);
		} catch (EvaluationStop e) {
			e.printStackTrace();
			return Status.CANCEL_STATUS;
		}
		return Status.OK_STATUS;
	}
	
	protected abstract IStatus quickFix();

}
