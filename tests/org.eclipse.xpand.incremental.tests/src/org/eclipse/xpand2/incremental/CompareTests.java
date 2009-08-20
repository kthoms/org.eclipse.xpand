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

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.xpand2.incremental.compare.EmfCompare;

public class CompareTests extends TestCase {
	private WorkflowContext ctx;
	
	/**
	 * Creates new worfkflow context and loads old and new models into slots.
	 */
	public void setUp() {
		ctx = new WorkflowContextDefaultImpl();
		loadModel("old");
		loadModel("new");
	}
	
	private void loadModel(String name) {
		Reader r = new Reader();
		r.setFirstElementOnly(true);
		r.setModelSlot(name);
		r.setUri("platform:/plugin/org.eclipse.xpand.incremental.tests/resources/model/" + name + ".ecore");
		r.invoke(ctx, new NullProgressMonitor(), new IssuesImpl());
	}

	public void testCompareTwoModels() {
		// set up EMF compare component
		EmfCompare compare = new EmfCompare();
		compare.setOldModelSlot("old");
		compare.setNewModelSlot("new");
		compare.setDiffModelSlot("diff");
		compare.setSnapshotModelSlot("snapshot");
		
		// do comparison
		Issues issues = new IssuesImpl();
		compare.checkConfiguration(issues);
		compare.invoke(ctx, new NullProgressMonitor(), issues);
		
		// check existence of output models
		EObject diffModel = (EObject) ctx.get("diff");
		assertNotNull(diffModel);
		EObject snapshotModel = (EObject) ctx.get("snapshot");
		assertNotNull(snapshotModel);

		// no errros, please
		assertFalse(issues.hasErrors());
		assertFalse(issues.hasWarnings());
	}

	public void testCompareTwoModelsWithoutSnapshot() {
		// set up EMF compare component
		EmfCompare compare = new EmfCompare();
		compare.setOldModelSlot("old");
		compare.setNewModelSlot("new");
		compare.setDiffModelSlot("diff");
		
		// do comparison
		Issues issues = new IssuesImpl();
		compare.checkConfiguration(issues);
		compare.invoke(ctx, new NullProgressMonitor(), issues);
		
		// check existence of diff model, but not snapshot model
		EObject diffModel = (EObject) ctx.get("diff");
		assertNotNull(diffModel);
		EObject snapshotModel = (EObject) ctx.get("snapshot");
		assertNull(snapshotModel);
		
		// missing snapshot model slot must not cause an error or a warning
		assertFalse(issues.hasErrors());
		assertFalse(issues.hasWarnings());
	}

	public void testCompareOneModelWithNoOldModel() {
		// set up EMF compare component
		EmfCompare compare = new EmfCompare();
		compare.setOldModelSlot("doesnotexist");
		compare.setNewModelSlot("new");
		compare.setDiffModelSlot("diff");
		compare.setSnapshotModelSlot("snapshot");
		
		checkCompareOneModel(compare);
	}

	public void testCompareOneModelWithNoNewModel() {
		// set up EMF compare component
		EmfCompare compare = new EmfCompare();
		compare.setOldModelSlot("old");
		compare.setNewModelSlot("doesnotexist");
		compare.setDiffModelSlot("diff");
		compare.setSnapshotModelSlot("snapshot");
		
		checkCompareOneModel(compare);
	}

	private void checkCompareOneModel(EmfCompare compare) {
		// do comparison
		Issues issues = new IssuesImpl();
		compare.checkConfiguration(issues);
		compare.invoke(ctx, new NullProgressMonitor(), issues);
		
		// we have no diff or snapshot model 
		EObject diffModel = (EObject) ctx.get("diff");
		assertNull(diffModel);
		EObject snapshotModel = (EObject) ctx.get("snapshot");
		assertNull(snapshotModel);
		
		// we should have a warning about the missing model slot
		assertFalse(issues.hasErrors());
		assertTrue(issues.hasWarnings());
	}
	
	public void testConfigurationError1() {
		// set up EMF compare component, but don't set old model
		EmfCompare compare = new EmfCompare();
		compare.setNewModelSlot("new");
		compare.setDiffModelSlot("diff");
		compare.setSnapshotModelSlot("snapshot");
		
		checkConfigurationError(compare);
	}

	public void testConfigurationError2() {
		// set up EMF compare component, but don't set new model
		EmfCompare compare = new EmfCompare();
		compare.setOldModelSlot("old");
		compare.setDiffModelSlot("diff");
		compare.setSnapshotModelSlot("snapshot");
		
		checkConfigurationError(compare);
	}

	public void testConfigurationError3() {
		// set up EMF compare component, but don't set diff model
		EmfCompare compare = new EmfCompare();
		compare.setOldModelSlot("old");
		compare.setOldModelSlot("new");
		compare.setSnapshotModelSlot("snapshot");
		
		checkConfigurationError(compare);
	}

	private void checkConfigurationError(EmfCompare compare) {
		// do comparison
		Issues issues = new IssuesImpl();
		compare.checkConfiguration(issues);
		compare.invoke(ctx, new NullProgressMonitor(), issues);
		
		// we have no diff or snapshot model 
		EObject diffModel = (EObject) ctx.get("diff");
		assertNull(diffModel);
		EObject snapshotModel = (EObject) ctx.get("snapshot");
		assertNull(snapshotModel);
		
		// we should have a warning about the missing model slot
		assertTrue(issues.hasErrors());
	}
}
