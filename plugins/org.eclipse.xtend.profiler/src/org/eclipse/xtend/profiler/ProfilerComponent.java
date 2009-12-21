/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtend.profiler;

import java.util.List;

import org.eclipse.emf.mwe.core.ConfigurationException;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.container.CompositeComponent;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.internal.xpand2.ast.AbstractDefinition;
import org.eclipse.internal.xtend.expression.ast.SyntaxElement;
import org.eclipse.internal.xtend.xtend.ast.AbstractExtension;
import org.eclipse.internal.xtend.xtend.ast.Check;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.VetoableCallback;
import org.eclipse.xtend.profiler.profilermodel.ModelFactory;
import org.eclipse.xtend.profiler.profilermodel.ProfilingResult;
import org.eclipse.xtend.typesystem.Type;

/**
 * Use this workflow component to wrap other inside a workflow. Then, refer
 * to this via idref as a callback. In the end a profiling model will be stored
 * in the resultslot and can be used with one of the templates.
 * 
 * <pre><code>
 * 	&lt;component id="profiler" class="org.eclipse.xtend.profiler.ProfilerComponent"&gt;
 *		&lt;resultSlot value="profilingResult" /&gt;
 *		
 *		&lt;component class="org.eclipse.xtend.check.CheckComponent"&gt;
 *			&lt;vetoableCallback idRef="profiler" /&gt;
 *			...
 *		&lt;/component&gt;
 *		&lt;component class="org.eclipse.xtend.XtendComponent"&gt;
 *			&lt;vetoableCallback idRef="profiler" /&gt;
 *			...
 *		&lt;/component&gt;
 *		&lt;component class="org.eclipse.xpand2.Generator"&gt;
 *			&lt;vetoableCallback idRef="profiler" /&gt;
 *			...
 *		&lt;/component&gt;
 *	&lt;/component&gt;
 *	
 *	&lt;component class="org.eclipse.xpand2.Generator" fileEncoding="ISO-8859-1"&gt;
 *		&lt;metaModel idRef="mm"/&gt;
 *		&lt;expand value="org::eclipse::xtend::profiler::templates::Html::Main FOR profilingResult"/&gt; 
 *		&lt;outlet overwrite="true" path="profiling"/&gt;
 *	&lt;/component&gt;
 * </code></pre>
 * 
 * @author Heiko Behrens - Initial contribution and API
 *
 */
public class ProfilerComponent extends CompositeComponent implements VetoableCallback {

	public ProfilerComponent() {
		super("Profiler");
	}
	
	private String resultSlot;

	public void setResultSlot(String resultSlot) {
		this.resultSlot = resultSlot;
	}
	
	public String getResultSlot() {
		return resultSlot;
	}
	
	private Profiler profiler;
	
	public ProfilingResult getProfilingResult() {
		return profiler.getProfilingResult();
	}
	
	@Override
	public void checkConfiguration(Issues issues) throws ConfigurationException {
		super.checkConfiguration(issues);
		if(resultSlot==null)
			issues.addError("resultSlot not specified");
	}
	
	@Override
	public void invoke(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {

		prepareProfiler();
		super.invoke(ctx, monitor, issues);
		finalizeProfiler();
		ctx.set(resultSlot, profiler.getProfilingResult());
	}

	public void finalizeProfiler() {
		// TODO: mark component state as freezed -> no more callbacks allowed
		CycleDetector detector = new CycleDetector(profiler.getProfilingResult());
		detector.detectCycles();
	}

	public void prepareProfiler() {
		profiler = new Profiler(ModelFactory.eINSTANCE.createProfilingResult());
	}

	public boolean pre(SyntaxElement ele, ExecutionContext ctx) {
		String key = findKeyFor(ele, ctx);
		profiler.beginRoutine(key);
		return true;
	}

	public void post(SyntaxElement ele, ExecutionContext ctx,
			Object expressionResult) {
		profiler.endRoutine();
	}

	private String findKeyFor(SyntaxElement element, ExecutionContext ctx) {
		if (element instanceof AbstractDefinition) {
			AbstractDefinition def = (AbstractDefinition) element;
			return "XPD " + def.getQualifiedName() + def.getParamString(true) + " FOR " + def.getTargetType();
		}
		if (element instanceof AbstractExtension) {
			AbstractExtension ext = (AbstractExtension) element;
			return "XTD " + ext.getQualifiedName() + getParamString(ext.getParameterTypes());
		}
		if (element instanceof Check) {
			Check c = (Check) element;
			return "CHK " + c.toString();
		}
		
		return null;
	}

	private String getParamString(List<Type> params) {
		final StringBuffer buff = new StringBuffer("(");
		for (int i = 0; i < params.size(); i++) {
			final Type t = params.get(i);
			buff.append(t.getName());
			if (i + 1 < params.size()) {
				buff.append(",");
			}
		}
		return buff.append(")").toString();
	}

}
