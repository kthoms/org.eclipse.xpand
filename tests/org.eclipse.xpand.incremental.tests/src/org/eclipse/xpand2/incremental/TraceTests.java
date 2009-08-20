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

import java.io.File;
import java.util.Collection;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.xpand.incremental.trace.InputElement;
import org.eclipse.xpand.incremental.trace.OutputFile;
import org.eclipse.xpand.incremental.trace.Trace;
import org.eclipse.xpand2.Generator;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;

public class TraceTests extends TestCase {
	private WorkflowContextDefaultImpl ctx;
	private Generator generator;
	private IncrementalGenerationCallback incrementalGenerationBroker;

	public void setUp() throws Exception {
		ctx = new WorkflowContextDefaultImpl();

		// load model
		Reader r = new Reader();
		r.setFirstElementOnly(true);
		r.setModelSlot("model");
		r.setUri("platform:/plugin/org.eclipse.xpand.incremental.tests/resources/model/old.ecore");
		r.invoke(ctx, new NullProgressMonitor(), new IssuesImpl());

		generator = new Generator();
		generator.addMetaModel(new EmfRegistryMetaModel());
		File outputPath = File.createTempFile("xpand", null);
		outputPath.delete();
		outputPath.mkdir();		
		generator.addOutlet(new Outlet(outputPath.getAbsolutePath()));
		generator.setExpand("templates::Test::Test FOR model");
		incrementalGenerationBroker = new IncrementalGenerationCallback();
		incrementalGenerationBroker.setDiffModelSlot("diffModel");
		incrementalGenerationBroker.setOldTraceModelSlot("oldTraceModel");
		incrementalGenerationBroker.setNewTraceModelSlot("newTraceModel");
		generator.setVetoableCallback(incrementalGenerationBroker);
	}
	
	public void testTrace() {
		// invoke generator
		Issues issues = new IssuesImpl();
		generator.checkConfiguration(issues);
		incrementalGenerationBroker.invoke(ctx, new NullProgressMonitor(), issues);
		generator.invoke(ctx, new NullProgressMonitor(), issues);
		
		// first of all: we don't accept errors. warnings due to missing diff and trace models are ok
		assertFalse(issues.hasErrors());
		assertTrue(issues.hasWarnings());
		
		// now we expect to have a new trace model with three output files
		Trace trace = (Trace)ctx.get("newTraceModel");
		assertNotNull(trace);
		assertEquals(8, trace.getOutputFiles().size());
		
		// okay, we have to check this...
		boolean foundOne = false;
		boolean foundTwo = false;
		boolean foundThree = false;
		boolean foundFour = false;
		boolean foundClassWithNewAttribute = false;
		boolean foundClassWithRemovedAttribute = false;
		boolean foundClassWithNewSuperType = false;
		boolean foundClassWithRemovedSuperType = false;
		for (OutputFile f : trace.getOutputFiles()) {
			assertNull(f.getOutlet());
			EObject targetObject = f.getTargetObject();
			assertTrue(targetObject instanceof EClass);
			
			if (f.getFileName().equals("FirstClass.java")) {
				foundOne = true;
				checkClassStuff(targetObject, f.getInputElements());
				checkAttributeStuff(targetObject, f.getInputElements());
				checkReferenceStuff(targetObject, f.getInputElements());
				checkNoDefaultValue(f.getInputElements());
			}
			if (f.getFileName().equals("SecondClass.java")) {
				foundTwo = true;
				checkClassStuff(targetObject, f.getInputElements());
				checkAttributeStuff(targetObject, f.getInputElements());
				checkNoDefaultValue(f.getInputElements());
			}
			if (f.getFileName().equals("ThirdClass.java")) {
				foundThree = true;
				checkClassStuff(targetObject, f.getInputElements());
				checkAttributeStuff(targetObject, f.getInputElements());
				checkNoDefaultValue(f.getInputElements());
			}
			if (f.getFileName().equals("UnchangedClass.java")) {
				foundFour = true;
				checkClassStuff(targetObject, f.getInputElements());
				checkAttributeStuff(targetObject, f.getInputElements());
				checkNoDefaultValue(f.getInputElements());
			}
			if (f.getFileName().equals("ClassWithNewAttribute.java")) {
				foundClassWithNewAttribute = true;
				checkClassStuff(targetObject, f.getInputElements());
				checkNoDefaultValue(f.getInputElements());
			}
			if (f.getFileName().equals("ClassWithRemovedAttribute.java")) {
				foundClassWithRemovedAttribute = true;
				checkClassStuff(targetObject, f.getInputElements());
				checkAttributeStuff(targetObject, f.getInputElements());
				checkNoDefaultValue(f.getInputElements());
			}
			if (f.getFileName().equals("ClassWithNewSuperType.java")) {
				foundClassWithNewSuperType = true;
				checkClassStuff(targetObject, f.getInputElements());
				checkNoDefaultValue(f.getInputElements());
			}
			if (f.getFileName().equals("ClassWithRemovedSuperType.java")) {
				foundClassWithRemovedSuperType = true;
				checkClassStuff(targetObject, f.getInputElements());
				checkNoDefaultValue(f.getInputElements());
			}
		}		
		assertTrue(foundOne);
		assertTrue(foundTwo);
		assertTrue(foundThree);
		assertTrue(foundFour);
		assertTrue(foundClassWithNewAttribute);
		assertTrue(foundClassWithRemovedAttribute);
		assertTrue(foundClassWithNewSuperType);
		assertTrue(foundClassWithRemovedSuperType);
	}
	
	private void checkClassStuff(EObject targetObject, Collection<InputElement> inputElements) {
		boolean foundClassName = false;
		boolean foundClassInstanceTypeName = false;
		boolean foundClassInterface = false;
		boolean foundClassAttributes = false;
		boolean foundClassReferences = false;
		boolean foundClassSuperTypes = false;
		
		for (InputElement e : inputElements) {
			if (e.getModelElement() == targetObject &&
					e.getFeature() == EcorePackage.Literals.ENAMED_ELEMENT__NAME) {
				foundClassName = true;
			}
			if (e.getModelElement() == targetObject &&
					e.getFeature() == EcorePackage.Literals.ECLASSIFIER__INSTANCE_TYPE_NAME) {
				foundClassInstanceTypeName = true;
			}
			if (e.getModelElement() == targetObject &&
					e.getFeature() == EcorePackage.Literals.ECLASS__INTERFACE) {
				foundClassInterface = true;
			}
			if (e.getModelElement() == targetObject &&
					e.getFeature() == EcorePackage.Literals.ECLASS__EATTRIBUTES) {
				foundClassAttributes = true;
			}
			if (e.getModelElement() == targetObject &&
					e.getFeature() == EcorePackage.Literals.ECLASS__EREFERENCES) {
				foundClassReferences = true;
			}
			if (e.getModelElement() == targetObject &&
					e.getFeature() == EcorePackage.Literals.ECLASS__ESUPER_TYPES) {
				foundClassSuperTypes = true;
			}
		}
		
		assertTrue(foundClassName);
		assertTrue(foundClassInstanceTypeName);
		assertTrue(foundClassInterface);
		assertTrue(foundClassAttributes);
		assertTrue(foundClassReferences);
		assertTrue(foundClassSuperTypes);
	}

	private void checkAttributeStuff(EObject targetObject, Collection<InputElement> inputElements) {
		boolean foundAttributeName = false;
		boolean foundAttributeType = false;
		boolean foundAttributeTypeName = false;
		boolean foundAttributeTypeInstanceTypeName = false;
		
		for (InputElement e : inputElements) {
			if (e.getModelElement() instanceof EAttribute &&
					e.getFeature() == EcorePackage.Literals.ENAMED_ELEMENT__NAME) {
				foundAttributeName = true;
			}
			if (e.getModelElement() instanceof EAttribute &&
					e.getFeature() == EcorePackage.Literals.EATTRIBUTE__EATTRIBUTE_TYPE) {
				foundAttributeType = true;
			}
			if (e.getModelElement() != targetObject &&
					e.getFeature() == EcorePackage.Literals.ENAMED_ELEMENT__NAME) {
				foundAttributeTypeName = true;
			}
			if (e.getModelElement() != targetObject &&
					e.getFeature() == EcorePackage.Literals.ECLASSIFIER__INSTANCE_TYPE_NAME) {
				foundAttributeTypeInstanceTypeName = true;
			}
		}
		
		assertTrue(foundAttributeName);
		assertTrue(foundAttributeType);
		assertTrue(foundAttributeTypeName);
		assertTrue(foundAttributeTypeInstanceTypeName);
	}

	private void checkReferenceStuff(EObject targetObject, Collection<InputElement> inputElements) {
		boolean foundReferenceName = false;
		boolean foundReferenceType = false;
		boolean foundReferenceTypeName = false;
		boolean foundReferenceTypeInstanceTypeName = false;
		boolean foundReferenceTypeInterface = false;
		
		for (InputElement e : inputElements) {
			if (e.getModelElement() instanceof EReference &&
					e.getFeature() == EcorePackage.Literals.ENAMED_ELEMENT__NAME) {
				foundReferenceName = true;
			}
			if (e.getModelElement() instanceof EReference &&
					e.getFeature() == EcorePackage.Literals.EREFERENCE__EREFERENCE_TYPE) {
				foundReferenceType = true;
			}
			if (e.getModelElement() != targetObject &&
					e.getFeature() == EcorePackage.Literals.ENAMED_ELEMENT__NAME) {
				foundReferenceTypeName = true;
			}
			if (e.getModelElement() != targetObject &&
					e.getFeature() == EcorePackage.Literals.ECLASSIFIER__INSTANCE_TYPE_NAME) {
				foundReferenceTypeInstanceTypeName = true;
			}
			if (e.getModelElement() != targetObject &&
					e.getFeature() == EcorePackage.Literals.ECLASS__INTERFACE) {
				foundReferenceTypeInterface = true;
			}
		}
		assertTrue(foundReferenceName);
		assertTrue(foundReferenceType);
		assertTrue(foundReferenceTypeName);
		assertTrue(foundReferenceTypeInstanceTypeName);
		assertTrue(foundReferenceTypeInterface);
	}
	
	private void checkNoDefaultValue(Collection<InputElement> inputElements) {
		for (InputElement e : inputElements) {
			assertNotSame(EcorePackage.Literals.ECLASSIFIER__DEFAULT_VALUE, e.getFeature());
		}
	}
}
