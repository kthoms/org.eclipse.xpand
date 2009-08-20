package org.eclipse.xpand2.incremental;

public class IncrementalCallbackTests extends AbstractIncrementalTests {
	@Override
	public String getWorkflowFileName() {
		return "resources/workflow/incrementalcallback.mwe";
	}
	
	@Override
	public boolean writesDiff() {
		return true;
	}
}
