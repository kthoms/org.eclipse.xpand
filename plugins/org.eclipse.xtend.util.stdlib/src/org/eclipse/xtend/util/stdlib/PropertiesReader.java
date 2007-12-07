package org.eclipse.xtend.util.stdlib;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class PropertiesReader extends AbstractWorkflowComponent{

	
	
	private String propertiesFile;

	public void checkConfiguration(Issues issues) {
		if (propertiesFile==null || ! new File(propertiesFile).exists()){
			issues.addError("Propertiesfile not set or file does not exist: " + propertiesFile);
		}
	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		try {
			Properties p = new Properties();
			p.load(new FileInputStream(propertiesFile));
			PropertiesExtension.setProperties(p);
			
		} catch (Exception e) {
			issues.addError(e.getMessage(), e);
		}
		
	}
	
	public final void setPropertiesFile( String propertiesFile ) {
		this.propertiesFile = propertiesFile;
	}

}
