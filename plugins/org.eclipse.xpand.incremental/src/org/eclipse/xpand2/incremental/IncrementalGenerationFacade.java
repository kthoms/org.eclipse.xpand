package org.eclipse.xpand2.incremental;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.utils.FileCopy;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.emf.mwe.utils.Writer;
import org.eclipse.internal.xtend.expression.ast.SyntaxElement;
import org.eclipse.xpand2.incremental.compare.EmfCompare;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtend.expression.ExecutionContext;

public class IncrementalGenerationFacade extends IncrementalGenerationCallback {
	private static final String NEWMODEL_SLOT = "model";
	private static final String OLDMODEL_SLOT = "__OLDMODEL";
	private static final String OLDTRACE_SLOT = "__OLDTRACE";
	private static final String NEWTRACE_SLOT = "__NEWTRACE";
	private static final String DIFF_SLOT = "__DIFF";
	private String newModelFile;
	private String oldModelFile;
	private String traceModelFile;
	private List<Outlet> outlets = new ArrayList<Outlet>();
	private SyntaxElement firstExpression;
	private Reader oldModelReader;
	private Reader newModelReader;
	private Reader traceModelReader;
	private Writer traceModelWriter;
	private EmfCompare modelComparer;
	private FileCleaner cleaner;
	private FileCopy copier;
	private WorkflowContext workflowContext;
	private Issues issues;

	public String getNewModelFile() {
		return newModelFile;
	}

	public void setNewModelFile(String newModelFile) {
		this.newModelFile = newModelFile;
	}

	public String getOldModelFile() {
		return oldModelFile;
	}

	public void setOldModelFile(String oldModelFile) {
		this.oldModelFile = oldModelFile;
	}

	public String getTraceModelFile() {
		return traceModelFile;
	}

	public void setTraceModelFile(String traceModelFile) {
		this.traceModelFile = traceModelFile;
	}

	public void addOutlet(Outlet outlet) {
		if (outlet == null) {
			return;
		}
		outlets.add(outlet);
	}

	@Override
	protected void checkConfigurationInternal(Issues issues) {
		if (getOldModelFile() == null) {
			issues.addError("No oldModelFile given. Cannot do incremental generation.");
		}
		if (getNewModelFile() == null) {
			issues.addError("No newModelFile given. Cannot do incremental generation.");
		}
		if (getTraceModelFile() == null) {
			issues.addError("No traceModelFile given. Cannot do incremental generation.");
		}
		if (outlets.isEmpty()) {
			issues.addError("No outlets given.");
		}
		
		// let callback check its configuration
		setDiffModelSlot(DIFF_SLOT);
		setNewTraceModelSlot(NEWTRACE_SLOT);
		setOldTraceModelSlot(OLDTRACE_SLOT);
		super.checkConfigurationInternal(issues);
	}

	@Override
	public void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		this.workflowContext = ctx;
		this.issues = issues;
		
		prepareComponents();
		
		// invoke owned components
		newModelReader.invoke(ctx, monitor, issues);
		oldModelReader.invoke(ctx, monitor, issues);
		modelComparer.invoke(ctx, monitor, issues);
		traceModelReader.invoke(ctx, monitor, issues);

		// now invoke the callback itself
		super.invokeInternal(ctx, monitor, issues);
	}

	private void prepareComponents() {
		// reader for old model
		oldModelReader = new Reader();
		oldModelReader.setUri(oldModelFile);
		oldModelReader.setModelSlot(OLDMODEL_SLOT);
		oldModelReader.setIgnoreMissingModel(true);
		oldModelReader.setFirstElementOnly(true);

		// reader for new model
		newModelReader = new Reader();
		newModelReader.setUri(newModelFile);
		newModelReader.setModelSlot(NEWMODEL_SLOT);
		newModelReader.setFirstElementOnly(true);

		// reader for old trace model
		traceModelReader = new Reader();
		traceModelReader.setUri(traceModelFile);
		traceModelReader.setModelSlot(OLDTRACE_SLOT);
		traceModelReader.setIgnoreMissingModel(true);
		traceModelReader.setFirstElementOnly(true);
		
		// writer for new trace model
		traceModelWriter = new Writer();
		traceModelWriter.setUri(traceModelFile);
		traceModelWriter.setModelSlot(NEWTRACE_SLOT);
		traceModelWriter.setIgnoreEmptySlot(true);
		
		// EMFCompare
		modelComparer = new EmfCompare();
		modelComparer.setOldModelSlot(OLDMODEL_SLOT);
		modelComparer.setNewModelSlot(NEWMODEL_SLOT);
		modelComparer.setDiffModelSlot(DIFF_SLOT);
		
		// cleaner
		cleaner = new FileCleaner();
		cleaner.setOldTraceModelSlot(OLDTRACE_SLOT);
		cleaner.setNewTraceModelSlot(NEWTRACE_SLOT);
		for (Outlet o : outlets) {
			cleaner.addOutlet(o);
		}
		
		// copier
		copier = new FileCopy();
		copier.setSourceFile(newModelFile);
		copier.setTargetFile(oldModelFile);
	}

	@Override
	public boolean pre(SyntaxElement element, ExecutionContext ctx) {
		// remember first invoked element
		if (firstExpression == null) {
			this.firstExpression = element;
		}

		return super.pre(element, ctx);
	}

	@Override
	public void post(SyntaxElement element, ExecutionContext ctx,	Object expressionResult) {
		super.post(element, ctx, expressionResult);

		// do cleanup work after actual generation
		if (element == firstExpression) {
			NullProgressMonitor nullMonitor = new NullProgressMonitor();
			cleaner.invoke(workflowContext, nullMonitor, issues);
			traceModelWriter.invoke(workflowContext, nullMonitor, issues);
			copier.invoke(workflowContext, nullMonitor, issues);
		}
	}
}
