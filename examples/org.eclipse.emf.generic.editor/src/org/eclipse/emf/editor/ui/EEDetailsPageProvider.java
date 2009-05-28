/**
 * <copyright> 
 *
 * Copyright (c) 2009 itemis AG and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   itemis AG - Initial API and implementation
 *
 * </copyright>
 *
 */
package org.eclipse.emf.editor.ui;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.editor.EEditor;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IDetailsPageProvider;


/**
 * @author Dennis Huebner
 * 
 */
public class EEDetailsPageProvider implements IDetailsPageProvider {
	private GenericDetailsPage page;
	private EEditor editor;

	public EEDetailsPageProvider(EEditor editor) {
		Assert.isNotNull(editor);
		this.editor = editor;
		// domain.getCommandStack().addCommandStackListener(this);
	}

	public IDetailsPage getPage(Object key) {
		EObject input = null;
		if (key instanceof EObject) {
			input =  (EObject) key;
		}
		page = new GenericDetailsPage(input, editor);
		page.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				editor.setSelection(event.getSelection());
			}
		});
		return page;
	}

	public Object getPageKey(Object object) {
		return object;
	}

}