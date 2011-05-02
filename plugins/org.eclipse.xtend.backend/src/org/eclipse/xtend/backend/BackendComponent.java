/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.types.CompositeTypesystemFactory;
import org.eclipse.xtend.middleend.LanguageContributor;
import org.eclipse.xtend.middleend.MiddleEnd;
import org.eclipse.xtend.middleend.MiddleEndFactory;
import org.eclipse.xtend.middleend.plugins.LanguageSpecificMiddleEnd;

/**
 * @author aarnold - Initial contribution and API
 */
public class BackendComponent extends AbstractWorkflowComponent2 {
	protected final Log log = LogFactory.getLog(getClass());
	
	protected String _invoke;
	protected final List<String> _advice = new ArrayList<String>();
	protected String _middleEndClass;
	protected Set<String> _typeSystemClasses;

	private Object outlets;

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		// TODO Auto-generated method stub
		BackendTypesystem ts = createTypesystem();
		MiddleEnd me = MiddleEndFactory.create(ts, createMiddleEnds());
		ExecutionContext execCtx = BackendFacade.createExecutionContext(me.createEmptyFdc(), ts, false);
		List<Object> params = null;
		BackendFacade.invoke (execCtx, new QualifiedName (_invoke), params);
	}
	
	protected BackendTypesystem createTypesystem () {
		
		return CompositeTypesystemFactory.INSTANCE.createTypesystemFromClassNames(_typeSystemClasses);
	}
	
	protected List<LanguageSpecificMiddleEnd> createMiddleEnds () {
		List<LanguageSpecificMiddleEnd> me = null;
		try {
			Class<? extends LanguageSpecificMiddleEnd> middleEndClass = (Class<? extends LanguageSpecificMiddleEnd>)Class.forName(_middleEndClass);
			me = LanguageContributor.INSTANCE.getFreshMiddleEnds (createSpecificParams());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return me;
	}
	
	protected Map<Class<?>, Object> createSpecificParams () {
		return null;
		
	}

}
