package org.eclipse.xtend.backend.ui.builder;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.xtend.backend.ui.compiler.BackendBuilder;

public class BackendNature implements IProjectNature {
	
	private final static Log _log = LogFactory.getLog (BackendNature.class);

	/**
	 * ID of this project nature
	 */
	public static final String NATURE_ID = "org.eclipse.xtend.backend.BackendNature";

	private IProject project;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#configure()
	 */
	public void configure() throws CoreException {
		IProjectDescription desc = project.getDescription();
		ICommand[] commands = desc.getBuildSpec();

		for (int i = 0; i < commands.length; ++i) {
			if (commands[i].getBuilderName().equals(BackendBuilder.BUILDER_ID)) {
				return;
			}
		}

		ICommand[] newCommands = new ICommand[commands.length + 1];
		System.arraycopy(commands, 0, newCommands, 0, commands.length);
		ICommand command = desc.newCommand();
		command.setBuilderName(BackendBuilder.BUILDER_ID);
		newCommands[newCommands.length - 1] = command;
		desc.setBuildSpec(newCommands);
		project.setDescription(desc, null);
		final IJavaProject jp = JavaCore.create(getProject());
		final IFolder backendGenFolder = getProject().getFolder (BackendBuilder.BACKEND_GEN_FOLDER);
		if (!backendGenFolder.exists()) {
			final IRunnableWithProgress op = new IRunnableWithProgress() {
				public void run(final IProgressMonitor monitor) throws InvocationTargetException {
					try {
						backendGenFolder.create(true, true, monitor);
					} catch (CoreException e) {
						_log.error ("Error creating folder " + backendGenFolder.getLocation().toOSString());
					}
					finally {
						monitor.done();
					}
				}
			};
		}
		IClasspathEntry srcEntry = JavaCore.newSourceEntry (new Path ("/" + getProject().getName() + "/" + BackendBuilder.BACKEND_GEN_FOLDER));
		List<IClasspathEntry> entries = Arrays.asList(jp.getRawClasspath()) ;
		boolean hasBackendGenClasspathEntry =  false;
		for (IClasspathEntry entry : entries) {
			if (entry.getPath().equals (srcEntry.getPath())) { 
				hasBackendGenClasspathEntry = true;
				break;
			}
		}
		if (!hasBackendGenClasspathEntry) {
			entries.add (srcEntry);
			final IClasspathEntry[] newClasspathEntries = (IClasspathEntry[]) entries.toArray(new IClasspathEntry[entries.size()]);
			final IRunnableWithProgress cpOp = new IRunnableWithProgress() {
				public void run(final IProgressMonitor monitor) throws InvocationTargetException {
					try {
						jp.setRawClasspath(newClasspathEntries, monitor);
					} catch (CoreException e) {
						_log.error ("Error adding " + backendGenFolder.getLocation().toOSString() + " to classpath");
					}
					finally {
						monitor.done();
					}
				}
			};
			
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#deconfigure()
	 */
	public void deconfigure() throws CoreException {
		IProjectDescription description = getProject().getDescription();
		ICommand[] commands = description.getBuildSpec();
		for (int i = 0; i < commands.length; ++i) {
			if (commands[i].getBuilderName().equals(BackendBuilder.BUILDER_ID)) {
				ICommand[] newCommands = new ICommand[commands.length - 1];
				System.arraycopy(commands, 0, newCommands, 0, i);
				System.arraycopy(commands, i + 1, newCommands, i,
						commands.length - i - 1);
				description.setBuildSpec(newCommands);
				project.setDescription(description, null);			
				return;
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#getProject()
	 */
	public IProject getProject() {
		return project;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#setProject(org.eclipse.core.resources.IProject)
	 */
	public void setProject(IProject project) {
		this.project = project;
	}

}
