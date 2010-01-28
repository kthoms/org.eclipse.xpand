/*******************************************************************************
 * Copyright (c) 2005 - 2007 committers of openArchitectureWare and others. All
 * rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: committers of openArchitectureWare - initial API and
 * implementation
 ******************************************************************************/
package org.eclipse.xtend.shared.ui.editor.navigation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.internal.xpand2.ast.ExtensionImportDeclaration;
import org.eclipse.internal.xpand2.ast.Template;
import org.eclipse.internal.xtend.expression.ast.DeclaredParameter;
import org.eclipse.internal.xtend.expression.parser.SyntaxConstants;
import org.eclipse.internal.xtend.xtend.XtendFile;
import org.eclipse.internal.xtend.xtend.ast.Extension;
import org.eclipse.internal.xtend.xtend.ast.ExtensionFile;
import org.eclipse.internal.xtend.xtend.ast.ExtensionImportStatement;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.jface.text.hyperlink.IHyperlinkDetector;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.core.IXtendXpandProject;
import org.eclipse.xtend.shared.ui.core.IXtendXpandResource;
import org.eclipse.xtend.shared.ui.core.search.SearchMatch;
import org.eclipse.xtend.shared.ui.core.search.XtendXpandSearchEngine;

/**
 * GenericHyperlinkDetector is used to detect hyperlinkable words inside Xtend
 * editors.
 * 
 * @author Darius Jockel
 * @author Peter Friese
 */
public abstract class AbstractHyperlinkDetector implements IHyperlinkDetector {

	protected final IEditorPart editor;

	public AbstractHyperlinkDetector(IEditorPart editor) {
		this.editor = editor;
	}

	/**
	 * {@inheritDoc}
	 */
	public IHyperlink[] detectHyperlinks(ITextViewer textViewer, IRegion region, boolean canShowMultipleHyperlinks) {
		if (region == null || textViewer == null) {
			return null;
		}

		// get hyperlinked region
		IRegion hyperlinkRegion = getHyperlinkRegion(textViewer, region.getOffset());
		if (hyperlinkRegion == null) {
			return null;
		}

		// get the word that is hyperlinked
		String hyperlinkedWord = textViewer.getDocument().get().substring(hyperlinkRegion.getOffset(),
				hyperlinkRegion.getOffset() + hyperlinkRegion.getLength());

		IXtendXpandProject project = getXtendXpandProject();
		if (project != null) {
			List<GenericHyperlink> links = computeMatchesAndHyperlinks(hyperlinkRegion, hyperlinkedWord, project);
			// must return null if no links found
			if (!links.isEmpty()) {
			if (canShowMultipleHyperlinks) {
				return links.toArray(new IHyperlink[links.size()]);
				} else {
				return new IHyperlink[] { links.get(0) };
			}
		}
		}
		return null;
	}

	/**
	 * Concrete classes have to implement strategies to compute hyperlinks. 
	 */
	abstract protected List<GenericHyperlink> computeMatchesAndHyperlinks(IRegion hyperlinkRegion, String hyperlinkedWord,
			IXtendXpandProject project);

	protected IWorkbenchPage getWorkbenchPage() {
		return editor.getSite().getWorkbenchWindow().getActivePage();
	}

	protected IXtendXpandProject getXtendXpandProject() {
		IFile file = getFile();
		if (file == null) {
			return null;
		}
		return Activator.getExtXptModelManager().findProject(file);
	}

	protected IFile getFile() {
		return (IFile) editor.getEditorInput().getAdapter(IFile.class);
	}

	/**
	 * Given a text viewer and an offset (i.e. the current cursor position),
	 * analyse the region around this location in order to find the word under
	 * the cursor.
	 * 
	 * @param textViewer
	 *            The underlying text viewer.
	 * @param offset
	 *            The cursor location.
	 * @return The document region defining the hyperlinked word.
	 */
	protected IRegion getHyperlinkRegion(ITextViewer textViewer, int offset) {
		String currDoc = textViewer.getDocument().get();

		// special handling if cursor is located at end of document
		if (offset == currDoc.length()) {
			return null;
		}

		// find word start
		int start = offset;
		while (start > -1 && WordDetector.isWordPart(currDoc.charAt(start))) {
			start--;
		}

		// find word end
		start++;
		int end = offset;
		while (end < currDoc.length() && WordDetector.isWordPart(currDoc.charAt(end))) {
			end++;
		}

		if (start < 0) {
			start = 0;
		}

		if (end < start) {
			end = start;
		}

		return new Region(start, end - start);
	}
	
	/**
	 * Provides a label for a extension or definition with given parameter list.
	 * 
	 * @param name
	 * 			The name of the element
	 * @param params 	
	 * 			A list of parameters declared by the element {@link org.eclipse.internal.xtend.expression.ast.DeclaredParameter DeclaredParameter}
	 * 
	 * @return 	A label: name(params,...) - FileName
	 */
	protected String computeHyperlinkLabel(String name, String typeName, List<DeclaredParameter> params,
			IXtendXpandResource xxresource) {
		StringBuffer label = new StringBuffer(name);
		if (!params.isEmpty()) {
			label.append("(");
			for (Iterator<DeclaredParameter> iter = params.iterator(); iter.hasNext();) {
				DeclaredParameter param = iter.next();
				label.append(param.getType().getValue());
				label.append(" "+param.getName().getValue());
				if (iter.hasNext()) label.append(", ");
				
			}
			label.append(")");
		}
		if (typeName != null)
			label.append(" : "+typeName);
		if (!xxresource.getUnderlyingStorage().equals(getFile()))
			label.append(" - " + xxresource.getUnderlyingStorage().getName().toString().replace("."+xxresource.getFileExtension(), ""));
		return label.toString();
	}
	
	protected IXtendXpandResource _xxresource = null;
	
	/**
	 * A cached getter for a {@link org.eclipse.xtend.shared.ui.core.IXtendXpandResource IXtendXpandResource}.
	 * 
	 * @param fqName 	
	 * 			The full qualified name of the resource
	 * @param extension	
	 * 			The kind of resource
	 * 
	 * @return The value of _xxresource if _xxresource is filled and the names are equal.
	 * Otherwise the  ModelManager tries to find that file. 
	 */
	protected IXtendXpandResource getXXResourceByName(String fqName, String extension) {
		if (_xxresource != null && _xxresource.getFileExtension().equals(extension) && _xxresource.getFullyQualifiedName().equals(fqName))
			return _xxresource;
		else
		{
			_xxresource = Activator.getExtXptModelManager().findXtendXpandResource(
				fqName.replaceAll(SyntaxConstants.NS_DELIM, "/"),extension);
			return _xxresource;
		}
	}
	
	/**
	 * Find an extension with name: <em>hyplerlinkedWord</em> in extension <em>xtendResource</em>. The extension and
	 * all (re)imported extensions are searched for.
	 */
	protected List<GenericHyperlink> findExtensionMatches(IRegion hyperlinkRegion, String hyperlinkedWord, IXtendXpandProject project,
			IXtendXpandResource xtendResource, List<GenericHyperlink> links, int paramListLength) {
		List<Extension> extmatches = XtendXpandSearchEngine.findExtensionsByNameInResourceAndImports(project, hyperlinkedWord, xtendResource);
		for (Extension ext : extmatches) {
			if ( ext.getFormalParameters().size() == paramListLength ||
					paramListLength+1 == ext.getFormalParameters().size() ) //implicit 'this' parameter
			{
			SearchMatch match = new SearchMatch(
					ext.getStart(), 
					ext.getEnd() - ext.getStart() + 1 /*
																	   * sorry
																	   * for
																 	   * the
																	   * "+1"-hack
																	   */, 
					getXXResourceByName(ext.getFileName(), XtendFile.FILE_EXTENSION).getUnderlyingStorage());
				GenericHyperlink genericHyperlink = new GenericHyperlink(
						getWorkbenchPage(), 
						match,
						hyperlinkRegion, 
						computeHyperlinkLabel(hyperlinkedWord, (ext.getReturnTypeIdentifier() == null) ? null : ext.getReturnTypeIdentifier().getValue(), ext.getFormalParameters(), getXXResourceByName(ext.getFileName(), XtendFile.FILE_EXTENSION))
						);
				
				links.add(genericHyperlink);
			}
		}
		return links;
	}
	
	protected List<GenericHyperlink> createHyperlinkToImportedExtensions(IXtendXpandResource resource, IRegion region, String hyperlinkedName) {
		List<GenericHyperlink> links = new ArrayList<GenericHyperlink>();
		IXtendXpandResource xxresource = null;
		if (resource.getExtXptResource() instanceof ExtensionFile)
		{
			ExtensionFile extensionFile = (ExtensionFile)resource.getExtXptResource();
			for (ExtensionImportStatement importStatement : extensionFile.getExtImports())
			{
				if (importStatement.getImportedId().getValue().contains(hyperlinkedName) && 
						importStatement.getStart() <= region.getOffset() &&
						importStatement.getEnd() >= region.getOffset()+region.getLength())
				{
					xxresource =Activator.getExtXptModelManager().findXtendXpandResource(importStatement.getImportedId().getValue(), XtendFile.FILE_EXTENSION);
					if (xxresource != null) 
					{
						GenericHyperlink genericHyperlink = new GenericHyperlink(
								getWorkbenchPage(), 
								new SearchMatch(0, 0, xxresource.getUnderlyingStorage()),
								new Region(importStatement.getImportedId().getStart(), importStatement.getImportedId().getEnd() - importStatement.getImportedId().getStart()+1), 
								importStatement.getImportedId().getValue()
						);
						links.add(genericHyperlink);
					}
				}
			}
		}
		if (resource.getExtXptResource() instanceof Template)
		{
			Template template = (Template)resource.getExtXptResource();
			for (ExtensionImportDeclaration importStatement : template.getExtensions())
			{
				if (importStatement.getImportString().getValue().contains(hyperlinkedName) && 
						importStatement.getStart() <= region.getOffset() &&
						importStatement.getEnd() >= region.getOffset()+region.getLength())
				{
					xxresource =Activator.getExtXptModelManager().findXtendXpandResource(importStatement.getImportString().getValue(), XtendFile.FILE_EXTENSION);
					if (xxresource != null) 
					{
						GenericHyperlink genericHyperlink = new GenericHyperlink(
								getWorkbenchPage(), 
								new SearchMatch(0, 0, xxresource.getUnderlyingStorage()),
								new Region(importStatement.getImportString().getStart(), importStatement.getImportString().getEnd() - importStatement.getImportString().getStart()+1), 
								importStatement.getImportString().getValue()
						);
						links.add(genericHyperlink);
					}
				}
			}
		}
		return links;
	}

}
