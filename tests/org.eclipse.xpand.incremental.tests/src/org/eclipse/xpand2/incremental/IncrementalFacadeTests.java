package org.eclipse.xpand2.incremental;

public class IncrementalFacadeTests extends AbstractIncrementalTests {
	@Override
	public String getWorkflowFileName() {
		return "resources/workflow/incrementalfacade.mwe";
	}
	
	@Override
	public boolean writesDiff() {
		return false;
	}
}
