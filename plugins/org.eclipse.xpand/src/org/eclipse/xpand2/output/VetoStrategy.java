package org.eclipse.xpand2.output;

public interface VetoStrategy {
	
	/**
	 * Called before the file will be written 
	 * and <b>after</b> beforeWriteAndClose() has been invoked on all post processors.
	 * @param impl A handle to the file that will be written
	 * @return if hasVeto returns true the file will not be written
	 */
	boolean hasVeto(FileHandle handle);
	
}
