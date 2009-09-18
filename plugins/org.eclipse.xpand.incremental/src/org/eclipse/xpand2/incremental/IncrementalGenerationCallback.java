/*******************************************************************************
 * Copyright (c) 2005, 2009 eXXcellent solution gmbh and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Achim Demelt - initial API and implementation
 *******************************************************************************/
package org.eclipse.xpand2.incremental;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.compare.diff.metamodel.AttributeChange;
import org.eclipse.emf.compare.diff.metamodel.ModelElementChangeLeftTarget;
import org.eclipse.emf.compare.diff.metamodel.ModelElementChangeRightTarget;
import org.eclipse.emf.compare.diff.metamodel.ReferenceChange;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.util.EcoreUtil.EqualityHelper;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.internal.xpand2.ast.FileStatement;
import org.eclipse.internal.xtend.expression.ast.FeatureCall;
import org.eclipse.internal.xtend.expression.ast.Identifier;
import org.eclipse.internal.xtend.expression.ast.SyntaxElement;
import org.eclipse.xpand.incremental.trace.InputElement;
import org.eclipse.xpand.incremental.trace.OutputFile;
import org.eclipse.xpand.incremental.trace.Trace;
import org.eclipse.xpand.incremental.trace.TraceFactory;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.VetoableCallback;


public class IncrementalGenerationCallback extends AbstractWorkflowComponent2 implements VetoableCallback {
	private String diffModelSlot;
	private String oldTraceModelSlot;
	private String newTraceModelSlot;
	private EObject diffModel;
	private Trace oldTraceModel;
	private Trace newTraceModel;
	private OutputFile currentOutputFile;
	// an array of EObject[2] where target object at index 0 and feature is at index 1
	private EObject[][] changedElements;
	
	public void setDiffModelSlot(String diffModelSlot) {
		this.diffModelSlot = diffModelSlot;
	}
	
	public void setOldTraceModelSlot(String oldTraceModelSlot) {
		this.oldTraceModelSlot = oldTraceModelSlot;
	}
	
	public void setNewTraceModelSlot(String newTraceModelSlot) {
		this.newTraceModelSlot = newTraceModelSlot;
	}
	
	@Override
	protected void checkConfigurationInternal(Issues issues) {
		super.checkConfigurationInternal(issues);
		if (diffModelSlot == null) {
			issues.addError("No diffModelSlot given. Cannot do incremental generation.");
		}
		if (oldTraceModelSlot == null) {
			issues.addError("No oldTraceModelSlot given. Cannot do incremental generation.");
		}
		if (newTraceModelSlot == null) {
			issues.addError("No newTraceModelSlot given. Cannot do incremental generation.");
		}		
	}
	
	@Override
	public void invokeInternal(WorkflowContext workflowContext, ProgressMonitor monitor, Issues issues) {
		diffModel = (EObject) workflowContext.get(diffModelSlot);
		if (diffModel == null) {
			issues.addWarning("No diffModel in slot " + diffModelSlot + ". Cannot do incremental generation.");
		} else {
			prepareChangedElements();
		}
		oldTraceModel = (Trace) workflowContext.get(oldTraceModelSlot);
		if (oldTraceModel == null) {
			issues.addWarning("No oldTraceModel in slot " + oldTraceModelSlot + ". Cannot do incremental generation.");
		}
		newTraceModel = TraceFactory.eINSTANCE.createTrace();
		workflowContext.set(newTraceModelSlot, newTraceModel);
	}
	
	/**
	 * Collects the relevant information out of the diff model. This speeds up later processing.
	 */
	private void prepareChangedElements() {
		List<EObject[]> elements = new ArrayList<EObject[]>();

		for (Iterator<EObject> i = diffModel.eAllContents(); i.hasNext();) {
			EObject diff = i.next();
			if (diff instanceof AttributeChange) {
				AttributeChange change = (AttributeChange) diff;
				elements.add(new EObject[] {change.getLeftElement(), change.getAttribute()});
			} else if (diff instanceof ReferenceChange) {
				ReferenceChange change = (ReferenceChange) diff;
				elements.add(new EObject[] {change.getLeftElement(), change.getReference()});
			} else if (diff instanceof ModelElementChangeLeftTarget) {
				ModelElementChangeLeftTarget change = (ModelElementChangeLeftTarget) diff;
				elements.add(new EObject[] {change.getLeftElement().eContainer(), change.getLeftElement().eContainingFeature()});				
			} else if (diff instanceof ModelElementChangeRightTarget) {
				ModelElementChangeRightTarget change = (ModelElementChangeRightTarget) diff;
				elements.add(new EObject[] {change.getLeftParent(), change.getRightElement().eContainingFeature()});
			}
		}
		
		changedElements = elements.toArray(new EObject[2][0]);
	}

	public boolean pre(SyntaxElement element, ExecutionContext ctx) {
		if (element instanceof FileStatement) {
			return handleFileStatement((FileStatement)element, ctx);
		}
		if (element instanceof FeatureCall) {
			return handleFeatureCall((FeatureCall)element, ctx);
		}
		return true;
	}

	private boolean handleFileStatement(FileStatement fileStatement, ExecutionContext ctx) {
		String fileName = fileStatement.getTargetFileName().evaluate(ctx).toString();
		String outletName = fileStatement.getOutletName();
		
		// sanity check:
		if (fileName == null) {
			return true;
		}

		// check if we have an existing trace for that file
		// and if so, was there a change that requires the file to be generated
		OutputFile oldFileTrace = getOldTrace(fileName, outletName);
		if (oldFileTrace == null || hasRelevantChangeForFile(oldFileTrace)) {
			// no old trace, or we found a relevant change => generate the file and create new trace for that
			currentOutputFile = TraceFactory.eINSTANCE.createOutputFile();
			currentOutputFile.setFileName(fileName);
			currentOutputFile.setOutlet(outletName);
			currentOutputFile.setTargetObject((EObject) ctx.getVariable(ExecutionContext.IMPLICIT_VARIABLE).getValue());
			newTraceModel.getOutputFiles().add(currentOutputFile);
			// yes, we definitely want to generate this file.
			return true;			
		} else {
			// it seems we don't have to generate this file
			// copy the trace information over into the new trace model
			Copier copier = new Copier();
			OutputFile copyOfFileTrace = (OutputFile) copier.copy(oldFileTrace);
			copier.copyReferences();
			newTraceModel.getOutputFiles().add(copyOfFileTrace);
			// now ignore upcoming features
			currentOutputFile = null;
			// and definitely don't generate the file
			return false;
		}
	}
	
	/**
	 * Checks if the changes contained in the diff imply that the given file
	 * has to be generated.
	 * 
	 * @param oldFileTrace The old trace information for the file to check. Must not be null.
	 * @return true if the file has to be generated, false if not.
	 */
	private boolean hasRelevantChangeForFile(OutputFile oldFileTrace) {
		// fast exit: no diff model ;-)
		if (changedElements == null) {
			return true;
		}
		
		for (EObject[] diff : changedElements) {
			for (InputElement input : oldFileTrace.getInputElements()) {			
				if (new EqualityHelper().equals(diff[0], input.getModelElement()) &&
						new EqualityHelper().equals(diff[1], input.getFeature())) {
					// abort at first change
					return true;
				}
			}
		}
		
		// no change found
		return false;
	}

	/**
	 * Finds an OutletFile in the old trace model for the given parameter.
	 * @param fileName The name of the file too look up. Must not be null.
	 * @param outletName The name of the outlet the file is located in. May be null.
	 * @return The requested OutletFile or null if none was found.
	 */
	private OutputFile getOldTrace(String fileName, String outletName) {
		// quick exit. no trace model ;-)
		if (oldTraceModel == null) {
			return null;
		}
		
		// now check each file in the trace
		for (OutputFile f : oldTraceModel.getOutputFiles()) {
			if (f.getFileName().equals(fileName) &&
					(outletName == null ? f.getOutlet() == null : outletName.equals(f.getOutlet()))) {
				return f;
			}
		}
		
		return null;
	}

	private boolean handleFeatureCall(FeatureCall featureCall, ExecutionContext ctx) {
		if (currentOutputFile != null) {
			Identifier currentFeature = featureCall.getName();

			// get target of feature call
			Object target = null;
			if (featureCall.getTarget() != null) {
				target = featureCall.getTarget().evaluate(ctx);
			}
			if (target == null && ctx.getVariable(ExecutionContext.IMPLICIT_VARIABLE) != null) { 
				target = ctx.getVariable(ExecutionContext.IMPLICIT_VARIABLE).getValue();
			}
			
			String featureName = currentFeature.getNameString(ctx);
			if (target instanceof EObject) {
				EObject targetObject = (EObject) target;
				addTraceForObject(featureName, targetObject);
			}
			if (target instanceof Collection<?>) {
				@SuppressWarnings("unchecked")
				Collection<EObject> targetCollection = (Collection<EObject>) target;
				for (EObject targetObject : targetCollection) {
					addTraceForObject(featureName, targetObject);
				}
			}
		}
		
		return true;
	}

	private void addTraceForObject(String featureName, EObject targetObject) {
		EStructuralFeature feature = targetObject.eClass().getEStructuralFeature(featureName);
		if (feature != null) {
			addInputElement(targetObject, feature);
		}
	}
	
	private void addInputElement(EObject target, EStructuralFeature feature) {
		// check for duplicates first
		for (InputElement e : currentOutputFile.getInputElements()) {
			if (e.getModelElement() == target && e.getFeature() == feature) {
				return;
			}
		}

		// okay, new element => add that
		InputElement inputElement = TraceFactory.eINSTANCE.createInputElement();
		inputElement.setModelElement(target);
		inputElement.setFeature(feature);
		currentOutputFile.getInputElements().add(inputElement);
	}

	public void post(SyntaxElement element, ExecutionContext ctx, Object expressionResult) {
		// don't register any subsequent changes for the file after the FILE statement has been processed
		if (element instanceof FileStatement) {
			currentOutputFile = null;
		}
	}
}
