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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

import junit.framework.TestCase;

import org.eclipse.emf.mwe.core.WorkflowFacade;
import org.eclipse.emf.mwe.core.issues.Issues;

public abstract class AbstractIncrementalTests extends TestCase {
	private static final String CLASS_WITH_REMOVED_SUPER_TYPE_JAVA = "ClassWithRemovedSuperType.java";
	private static final String CLASS_WITH_NEW_SUPER_TYPE_JAVA = "ClassWithNewSuperType.java";
	private static final String CLASS_WITH_REMOVED_ATTRIBUTE_JAVA = "ClassWithRemovedAttribute.java";
	private static final String CLASS_WITH_NEW_ATTRIBUTE_JAVA = "ClassWithNewAttribute.java";
	private static final String TEMP_PATH = "temp/";
	private static final String MODEL_ECORE = "model.ecore";
	private static final String UNCHANGED_CLASS_JAVA = "UnchangedClass.java";
	private static final String THIRD_CLASS_JAVA = "ThirdClass.java";
	private static final String FOURTH_CLASS_JAVA = "FourthClass.java";
	private static final String SECOND_CLASS_JAVA = "SecondClass.java";
	private static final String FIRST_CLASS_JAVA = "FirstClass.java";
	private static final String DIFF_EMFDIFF = "diff.emfdiff";
	private static final String TRACE_TRACE = "trace.trace";
	private static final String OLDMODEL_ECORE = "oldmodel.ecore";

	public void setUp() {
		// prepare temp dir
		File tempDir = new File(TEMP_PATH);
		if (!tempDir.exists() || tempDir.isFile()) {
			tempDir.delete();
			tempDir.mkdir();
		}
		
		// clean results of previous tests
		deleteFile(MODEL_ECORE);
		deleteFile(OLDMODEL_ECORE);
		deleteFile(TRACE_TRACE);
		deleteFile(DIFF_EMFDIFF);
		deleteFile(FIRST_CLASS_JAVA);
		deleteFile(SECOND_CLASS_JAVA);
		deleteFile(THIRD_CLASS_JAVA);
		deleteFile(FOURTH_CLASS_JAVA);
		deleteFile(UNCHANGED_CLASS_JAVA);
		deleteFile(CLASS_WITH_NEW_ATTRIBUTE_JAVA);
		deleteFile(CLASS_WITH_REMOVED_ATTRIBUTE_JAVA);
		deleteFile(CLASS_WITH_NEW_SUPER_TYPE_JAVA);
		deleteFile(CLASS_WITH_REMOVED_SUPER_TYPE_JAVA);
	}

	public void testInitialGeneration() throws Exception {
		// old.ecore is to be our initial model
		copyFile(new File("resources/model/old.ecore"), new File(TEMP_PATH + MODEL_ECORE));
	
		// now simply run workflow. remember date to check timestamps
		WorkflowFacade workflow = new WorkflowFacade(getWorkflowFileName());
		long timestamp = System.currentTimeMillis();
		// have to wait a second because the filesystem may round down file modification timestamps
		Thread.sleep(1000);
		Issues issues = workflow.run();
		
		// we must have no errors, but a couple of warnings because
		// we neither have an old model nor a trace model
		assertFalse("Found errors in workflow: " + issues, issues.hasErrors());
		assertTrue(issues.hasWarnings());
		
		// we must have created almost all files
		assertFile(FIRST_CLASS_JAVA, true, timestamp);
		assertFile(SECOND_CLASS_JAVA, true, timestamp);
		assertFile(THIRD_CLASS_JAVA, true, timestamp);
		assertFile(UNCHANGED_CLASS_JAVA, true, timestamp);
		assertFile(CLASS_WITH_NEW_ATTRIBUTE_JAVA, true, timestamp);
		assertFile(CLASS_WITH_NEW_SUPER_TYPE_JAVA, true, timestamp);
		assertFile(CLASS_WITH_REMOVED_ATTRIBUTE_JAVA, true, timestamp);
		assertFile(CLASS_WITH_REMOVED_SUPER_TYPE_JAVA, true, timestamp);
		assertFile(TRACE_TRACE, true, timestamp);
		assertFile(OLDMODEL_ECORE, true, timestamp);
		// except for model.ecore. this must remain unchanged
		assertFile(MODEL_ECORE, false, timestamp);
		// and except for the diff snapshot and the fourth class
		File diffFile = new File(TEMP_PATH + DIFF_EMFDIFF);
		assertFalse(diffFile.exists());
		File fourthClassFile = new File(TEMP_PATH + FOURTH_CLASS_JAVA);
		assertFalse(fourthClassFile.exists());
	}
	
	public void testIncrementalGeneration() throws Exception {
		// first perform initial generation
		testInitialGeneration();
		
		// now new.ecore is to become our updated model
		copyFile(new File("resources/model/new.ecore"), new File(TEMP_PATH + MODEL_ECORE));
	
		// now simply run workflow. remember date to check timestamps
		WorkflowFacade workflow = new WorkflowFacade(getWorkflowFileName());
		long timestamp = System.currentTimeMillis();
		// have to wait a second because the filesystem may round down file modification timestamps
		Thread.sleep(1000);
		Issues issues = workflow.run();
		
		// we must have no errors and also no warnings this time
		assertFalse("Found errors in workflow: " + issues, issues.hasErrors());
		assertFalse("Found warnings in workflow: " + issues, issues.hasWarnings());

		// now we must have regenerated these files
		assertFile(FIRST_CLASS_JAVA, true, timestamp);
		assertFile(SECOND_CLASS_JAVA, true, timestamp);
		assertFile(CLASS_WITH_NEW_ATTRIBUTE_JAVA, true, timestamp);
		assertFile(CLASS_WITH_NEW_SUPER_TYPE_JAVA, true, timestamp);
		assertFile(CLASS_WITH_REMOVED_ATTRIBUTE_JAVA, true, timestamp);
		assertFile(CLASS_WITH_REMOVED_SUPER_TYPE_JAVA, true, timestamp);
		// and this one is new
		assertFile(FOURTH_CLASS_JAVA, true, timestamp);
		// but this must remain unchanged
		assertFile(UNCHANGED_CLASS_JAVA, false, timestamp);
		// this must have been deleted
		File thirdClassFile = new File(TEMP_PATH + THIRD_CLASS_JAVA);
		assertFalse(thirdClassFile.exists());
		// finally, trace, diff snapshot and oldmodel must be updated as well
		assertFile(TRACE_TRACE, true, timestamp);
		assertFile(OLDMODEL_ECORE, true, timestamp);
		if (writesDiff()) {
			assertFile(DIFF_EMFDIFF, true, timestamp);
		}
		// as usual: model.ecore. this must remain unchanged
		assertFile(MODEL_ECORE, false, timestamp);
	}
	
	private void assertFile(String name, boolean newerThan, long timestamp) {
		File f = new File(TEMP_PATH + name);
		assertTrue("File " + name + " does not exist", f.exists());
		if (newerThan) {
			// important to use "<=" instead of "<". I had cases when not a single millisecond(!)
			// has passed between taking the timestamp and the file being written to disk...			
			assertTrue("File " + name + " is written at " + f.lastModified() + ", but should be after " + timestamp,
					timestamp <= f.lastModified());
		} else {
			assertTrue("File " + name + " is written at " + f.lastModified() + ", but should be before " + timestamp,
					timestamp > f.lastModified());
		}
	}
	
	private void deleteFile(String name) {
		File f = new File(TEMP_PATH + name);
		if (f.exists()) {
			f.delete();
			assertFalse(f.exists());
		}
	}
	
	public static void copyFile(File sourceFile, File destFile) throws IOException {
		 if(!destFile.exists()) {
		  destFile.createNewFile();
		 }

		 FileChannel source = null;
		 FileChannel destination = null;
		 try {
		  source = new FileInputStream(sourceFile).getChannel();
		  destination = new FileOutputStream(destFile).getChannel();
		  destination.transferFrom(source, 0, source.size());
		 }
		 finally {
		  if(source != null) {
		   source.close();
		  }
		  if(destination != null) {
		   destination.close();
		  }
		 }
	}
	
	public abstract String getWorkflowFileName();
	
	public abstract boolean writesDiff();
}
