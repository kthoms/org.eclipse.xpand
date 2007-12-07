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
package org.eclipse.xtend.shared.ui.editor.search.view;

import java.text.MessageFormat;
import java.util.HashMap;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.search.internal.ui.text.NewTextSearchActionGroup;
import org.eclipse.search.ui.IContextMenuConstants;
import org.eclipse.search.ui.ISearchResultViewPart;
import org.eclipse.search.ui.NewSearchUI;
import org.eclipse.search.ui.text.AbstractTextSearchResult;
import org.eclipse.search.ui.text.AbstractTextSearchViewPage;
import org.eclipse.search.ui.text.Match;
import org.eclipse.search2.internal.ui.OpenSearchPreferencesAction;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionContext;
import org.eclipse.ui.actions.ActionGroup;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.part.IShowInTargetList;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.xtend.shared.ui.editor.search.query.OawSearchQuery;

/**
 * <code>OawSearchResultPage </code> displays the search results of an oAW
 * related query.
 * 
 * @author Peter Friese
 */
public class OawSearchResultPage extends AbstractTextSearchViewPage implements IAdaptable {

	public static class DecoratorIgnoringViewerSorter extends ViewerComparator {
		private final ILabelProvider labelProvider;

		public DecoratorIgnoringViewerSorter(ILabelProvider labelProvider) {
			this.labelProvider = labelProvider;
		}

		@Override
		public int category(Object element) {
			if (element instanceof IContainer) {
				return 1;
			}
			return 2;
		}

		@Override
		public int compare(Viewer viewer, Object e1, Object e2) {
			int cat1 = category(e1);
			int cat2 = category(e2);

			if (cat1 != cat2) {
				return cat1 - cat2;
			}

			String name1 = labelProvider.getText(e1);
			String name2 = labelProvider.getText(e2);
			if (name1 == null) {
				name1 = "";//$NON-NLS-1$
			}
			if (name2 == null) {
				name2 = "";//$NON-NLS-1$
			}
			return getComparator().compare(name1, name2);
		}
	}

	@SuppressWarnings("unused")
	private static final String KEY_SORTING = "org.eclipse.search.resultpage.sorting"; //$NON-NLS-1$

	private ActionGroup actionGroup;
	private OawTableContentProvider contentProvider;

	private final EditorOpener editorOpener = new EditorOpener();

	private static final String[] SHOW_IN_TARGETS = new String[] { IPageLayout.ID_RES_NAV };
	private static final IShowInTargetList SHOW_IN_TARGET_LIST = new IShowInTargetList() {
		public String[] getShowInTargetIds() {
			return OawSearchResultPage.SHOW_IN_TARGETS;
		}
	};

	public OawSearchResultPage() {
		super(AbstractTextSearchViewPage.FLAG_LAYOUT_FLAT);
	}

	@Override
	public StructuredViewer getViewer() {
		return super.getViewer();
	}

	private void addDragAdapters(StructuredViewer viewer) {
		// Transfer[] transfers = new Transfer[] { ResourceTransfer.getInstance() };
		// int ops = DND.DROP_COPY | DND.DROP_LINK;
		// viewer.addDragSupport(ops, transfers, new
		// ResourceTransferDragAdapter(viewer));
	}

	@Override
	protected void configureTableViewer(TableViewer viewer) {
		viewer.setUseHashlookup(true);
		WorkbenchLabelProvider innerLabelProvider = new WorkbenchLabelProvider();
		viewer.setLabelProvider(new DecoratingLabelProvider(innerLabelProvider, PlatformUI.getWorkbench()
				.getDecoratorManager().getLabelDecorator()));
		viewer.setContentProvider(new OawTableContentProvider(this));
		viewer.setComparator(new DecoratorIgnoringViewerSorter(innerLabelProvider));
		contentProvider = (OawTableContentProvider) viewer.getContentProvider();
		addDragAdapters(viewer);
	}

	@Override
	protected void configureTreeViewer(TreeViewer viewer) {
		// viewer.setUseHashlookup(true);
		// FileLabelProvider innerLabelProvider = new FileLabelProvider(this,
		// FileLabelProvider.SHOW_LABEL);
		// viewer.setLabelProvider(new
		// DecoratingLabelProvider(innerLabelProvider, PlatformUI.getWorkbench()
		// .getDecoratorManager().getLabelDecorator()));
		// viewer.setContentProvider(new FileTreeContentProvider(this, viewer));
		// viewer.setComparator(new
		// DecoratorIgnoringViewerSorter(innerLabelProvider));
		// fContentProvider = (IFileSearchContentProvider)
		// viewer.getContentProvider();
		// addDragAdapters(viewer);
	}

	@Override
	protected void showMatch(Match match, int offset, int length, boolean activate) throws PartInitException {
		IFile file = (IFile) match.getElement();
		IEditorPart editor = editorOpener.open(file, activate);
		if (offset != 0 && length != 0) {
			if (editor instanceof ITextEditor) {
				ITextEditor textEditor = (ITextEditor) editor;
				textEditor.selectAndReveal(offset, length);
			} else if (editor != null) {
				showWithMarker(editor, file, offset, length);
			}
		}
	}

	private void showWithMarker(IEditorPart editor, IFile file, int offset, int length) throws PartInitException {
		IMarker marker = null;
		try {
			marker = file.createMarker(NewSearchUI.SEARCH_MARKER);
			HashMap<String, Integer> attributes = new HashMap<String, Integer>(4);
			attributes.put(IMarker.CHAR_START, new Integer(offset));
			attributes.put(IMarker.CHAR_END, new Integer(offset + length));
			marker.setAttributes(attributes);
			IDE.gotoMarker(editor, marker);
		} catch (CoreException e) {
			throw new PartInitException("Could not create marker", e);
		} finally {
			if (marker != null) {
				try {
					marker.delete();
				} catch (CoreException e) {
					// ignore
				}
			}
		}
	}

	@Override
	protected void fillContextMenu(IMenuManager mgr) {
		super.fillContextMenu(mgr);
		addSortActions(mgr);
		actionGroup.setContext(new ActionContext(getSite().getSelectionProvider().getSelection()));
		actionGroup.fillContextMenu(mgr);
		@SuppressWarnings("unused")
		OawSearchQuery query = (OawSearchQuery) getInput().getQuery();
	}

	private void addSortActions(IMenuManager mgr) {
		if (getLayout() != AbstractTextSearchViewPage.FLAG_LAYOUT_FLAT) {
			return;
		}
		MenuManager sortMenu = new MenuManager("Sort By");

		mgr.appendToGroup(IContextMenuConstants.GROUP_VIEWER_SETUP, sortMenu);
	}

	@SuppressWarnings("restriction")
	@Override
	public void setViewPart(ISearchResultViewPart part) {
		super.setViewPart(part);
		actionGroup = new NewTextSearchActionGroup(part);
	}

	@Override
	public void init(IPageSite site) {
		super.init(site);
		IMenuManager menuManager = site.getActionBars().getMenuManager();
		menuManager.appendToGroup(IContextMenuConstants.GROUP_PROPERTIES, new OpenSearchPreferencesAction());
	}

	@Override
	public void dispose() {
		actionGroup.dispose();
		super.dispose();
	}

	@Override
	protected void elementsChanged(Object[] objects) {
		if (contentProvider != null) {
			contentProvider.elementsChanged(objects);
		}
	}

	@Override
	protected void clear() {
		if (contentProvider != null) {
			contentProvider.clear();
		}
	}

	public Object getAdapter(Class adapter) {
		if (IShowInTargetList.class.equals(adapter)) {
			return OawSearchResultPage.SHOW_IN_TARGET_LIST;
		}
		return null;
	}

	@Override
	public String getLabel() {
		String label = super.getLabel();
		StructuredViewer viewer = getViewer();
		if (viewer instanceof TableViewer) {
			TableViewer tv = (TableViewer) viewer;

			AbstractTextSearchResult result = getInput();
			if (result != null) {
				int itemCount = ((IStructuredContentProvider) tv.getContentProvider()).getElements(getInput()).length;
				int fileCount = getInput().getElements().length;
				if (itemCount < fileCount) {
					String format = "{0} (showing {1} of {2} files)";
					MessageFormat
							.format(format, new Object[] { label, new Integer(itemCount), new Integer(fileCount) });
				}
			}
		}
		return label;
	}

}
