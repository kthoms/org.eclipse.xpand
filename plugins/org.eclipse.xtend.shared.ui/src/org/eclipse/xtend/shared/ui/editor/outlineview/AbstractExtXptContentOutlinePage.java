/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.xtend.shared.ui.editor.outlineview;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IStorage;
import org.eclipse.internal.xtend.xtend.ast.ImportStatement;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.core.IXtendXpandResource;
import org.eclipse.xtend.shared.ui.core.i18n.Messages;
import org.eclipse.xtend.shared.ui.expression.editor.EditorImages;

public abstract class AbstractExtXptContentOutlinePage extends ContentOutlinePage {

	private final TextEditor editor;

	private IEditorInput input;

	public AbstractExtXptContentOutlinePage(final TextEditor editor) {
		this.editor = editor;
	}

	public void setInput(IEditorInput input) {
		this.input = input;
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		getTreeViewer().setContentProvider(getContentProvider());
		getTreeViewer().setLabelProvider(getLabelProvider());
		getTreeViewer().addSelectionChangedListener(this);
		Object r = parse();
		if (r != null)
			getTreeViewer().setInput(r);
	}

	private IXtendXpandResource parse() {
		if (input == null)
			return null;
		IStorage file = (IStorage) input.getAdapter(IStorage.class);
		return Activator.getExtXptModelManager().findExtXptResource(file);
	}

	private ILabelProvider getLabelProvider() {
		return new ILabelProvider() {

			public Image getImage(Object element) {
				if (element instanceof OutlineElement) {
					return ((OutlineElement) element).image;
				}
				return null;
			}

			public String getText(Object element) {
				if (element instanceof OutlineElement) {
					return ((OutlineElement) element).label;
				}
				return null;
			}

			public void addListener(ILabelProviderListener listener) {
			}

			public void dispose() {
			}

			public boolean isLabelProperty(Object element, String property) {
				return false;
			}

			public void removeListener(ILabelProviderListener listener) {
			}
		};
	}

	private ITreeContentProvider getContentProvider() {
		return new ITreeContentProvider() {

			public void dispose() {
				// do nothing
			}

			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
				// do nothing
			}

			public Object[] getChildren(Object parentElement) {
				return AbstractExtXptContentOutlinePage.this.getChildren(parentElement);
			}

			public Object getParent(Object element) {
				return null;
			}

			public boolean hasChildren(Object element) {
				return getChildren(element).length > 0;
			}

			public Object[] getElements(Object inputElement) {
				return getChildren(inputElement);
			}
		};
	}

	private ISelection selection;

	/**
	 * Notifies that the selection has changed.
	 * 
	 * @param event
	 *            event object describing the change
	 */
	@Override
	public final void selectionChanged(SelectionChangedEvent anEvent) {
		super.selectionChanged(anEvent);

		this.selection = anEvent.getSelection();

		this.updateHighlight();
	}

	private final void updateHighlight() {
		if (selection != null) {
			if (selection.isEmpty()) {
				editor.resetHighlightRange();
			} else {
				Object segment = ((IStructuredSelection) selection).getFirstElement();
				if (segment != null && segment instanceof OutlineElement) {
					OutlineElement ext = (OutlineElement) segment;
					int start = ext.start;
					int length = ext.length;
					if (start >= 0) {
						try {
							editor.setHighlightRange(start, length, true);
						} catch (IllegalArgumentException x) {
							editor.resetHighlightRange();
						}
					}
				}
			}
		}
	}

	public void refresh() {
		TreeViewer viewer = getTreeViewer();

		if (viewer != null) {
			Control control = viewer.getControl();

			if ((control != null) && !control.isDisposed()) {
				IXtendXpandResource res = null;
				try {
					res = parse();
				} catch (RuntimeException re) {
					// ignore
					return;
				}
				control.setRedraw(false);
				if (res != null)
					res.refresh();
				viewer.setInput(res);
				viewer.expandAll();
				control.setRedraw(true);
			}
		}
	}

	protected abstract OutlineElement[] getChildren(Object parentElement);

	protected List<OutlineElement> toOutlineElementsForNamespaceImports(List<ImportStatement> imports) {
		List<OutlineElement> l = new ArrayList<OutlineElement>();
		for (ImportStatement s : imports) {
			l.add(new OutlineElement(s.getImportedId().getValue(), s.getStart(), s.getEnd() - s.getStart(),
					EditorImages.getImage(EditorImages.NS_IMPORT), OutlineElement.IMPORT));
		}
		return l;
	}

	protected List<OutlineElement> toOutlineElementsForExtensionImports(List<ImportStatement> imports) {
		List<OutlineElement> l = new ArrayList<OutlineElement>();
		for (ImportStatement s : imports) {
			l.add(new OutlineElement(s.getImportedId().getValue(), s.getStart(), s.getEnd() - s.getStart(),
					EditorImages.getImage(EditorImages.EXT_IMPORT), OutlineElement.EXTENSION));
		}
		return l;
	}

	// intern class representing a very simple lexical sorting feature usABLE
	// (<at discretion) by subclasses...
	public class LexicalSortingAction extends Action {

		// bringed-here constants for dependencies shooting...:
		public static final String ID_PLUGIN = "org.eclipse.internal.xtend"; //$NON-NLS-1$
		public static final String PREFIX = ID_PLUGIN + '.';
		public static final String LEXICAL_SORTING_OUTLINE_ACTION = PREFIX + "lexical_sorting_outline_action"; //$NON-NLS-1$

		private OutlineElementComparator fComparator = new OutlineElementComparator();
		private ViewerComparator fSourcePositonComparator = new ViewerComparator() {
			// this "sorter" has the role not to sort anything, so outline
			// elements are displayed in the order they appear
			public int compare(Viewer viewer, Object e1, Object e2) {
				return 0;
			}
		};

		public LexicalSortingAction() {
			super();

			PlatformUI.getWorkbench().getHelpSystem().setHelp(this, LEXICAL_SORTING_OUTLINE_ACTION);
			setText(Messages.AbstractXtendXpandContentOutlinePage_1);

			this.setImageDescriptor(Activator.getImageDescriptor("icons/alphab_sort_co.gif")); //$NON-NLS-1$
			setToolTipText(Messages.AbstractXtendXpandContentOutlinePage_3);
			setDescription(Messages.AbstractXtendXpandContentOutlinePage_4);

			boolean checked = Activator.getDefault().getPreferenceStore().getBoolean("LexicalSortingAction.isChecked"); //$NON-NLS-1$
			valueChanged(checked, false);
		}

		// if the action is triggered
		public void run() {
			valueChanged(isChecked(), true);
		}

		// if the user decided to change the value of the sorting method
		private void valueChanged(final boolean on, boolean store) {
			setChecked(on);

			final TreeViewer fOutlineViewer = getTreeViewer();

			BusyIndicator.showWhile(fOutlineViewer.getControl().getDisplay(), new Runnable() {
				public void run() {
					if (on)
						fOutlineViewer.setComparator(fComparator);
					else
						fOutlineViewer.setComparator(fSourcePositonComparator);
				}
			});

			if (store)
				Activator.getDefault().getPreferenceStore().setValue("LexicalSortingAction.isChecked", on); //$NON-NLS-1$

		}
	}

}