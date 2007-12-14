/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.m2t.common.recipe.ui.shared.ctrl;


import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.m2t.common.recipe.ui.shared.iface.IViewControl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class ViewControlManager {
	private ViewControlManager() {
	}

	/**
	 * Creates a ViewControl.
	 * A ViewControl is dependent on an object.
	 * This implementation ignores a dependent object.
	 * Later implementation should consider this object
	 *
	 * @param 	anObject 		A dependent object
	 */
	public static IViewControl createViewControl(Object anObject) {
		IViewControl ctrl = new DefaultViewControl();

		return ctrl;
	}
}

class DefaultViewControl implements IViewControl {
	private IStatus ivStatus;

	public DefaultViewControl() {
		ivStatus = null;
	}
	public void setup(IStatus aStatus) {
		ivStatus = aStatus;
	}

	public void finish() {
		ExceptionDialog dialog = new ExceptionDialog(new Shell(), ivStatus);
		dialog.open();
	}
}

class ExceptionDialog extends Dialog {
	private Button detailsButton;
	private IStatus status;
	private boolean togle = true;

	private boolean textCreated = false;

	private static final int NUM_OF_LINES = 10;

	private Text text = null;

	public ExceptionDialog(Shell parentShell, IStatus aStatus) {
		super(parentShell);
		status = aStatus;

		setShellStyle(SWT.DIALOG_TRIM | SWT.RESIZE | SWT.APPLICATION_MODAL);
	}

	/**
	 *
	 */
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		shell.setText("Problems");
	}

	/**
	 *
	 */
	protected void buttonPressed(int id) {
		if (id == IDialogConstants.DETAILS_ID) {
			// was the details button pressed?
			toggleDetailsArea();
		} else {
			super.buttonPressed(id);
		}
	}

	/*
	 * Method declared on Dialog.
	 */
	protected void createButtonsForButtonBar(Composite parent) {
		// create OK and Details buttons
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		if (status.getException() != null)
			detailsButton =
				createButton(
					parent,
					IDialogConstants.DETAILS_ID,
					IDialogConstants.SHOW_DETAILS_LABEL,
					false);
	}

	/**
	 *
	 */
	protected Control createMessageArea(Composite composite) {
		// create image
		Image image = this.dialogArea.getDisplay().getSystemImage(SWT.ICON_ERROR);
		if (image != null) {
			Label label = new Label(composite, 0);
			image.setBackground(label.getBackground());
			label.setImage(image);
			label.setLayoutData(
				new GridData(GridData.HORIZONTAL_ALIGN_CENTER | GridData.VERTICAL_ALIGN_BEGINNING));
		}

		// create message
		Label label = new Label(composite, SWT.WRAP);
		label.setText(status.getMessage());
		GridData data =
			new GridData(
				GridData.GRAB_HORIZONTAL
					| GridData.HORIZONTAL_ALIGN_FILL
					| GridData.VERTICAL_ALIGN_CENTER);
		data.widthHint = convertHorizontalDLUsToPixels(IDialogConstants.MINIMUM_MESSAGE_AREA_WIDTH);

		label.setLayoutData(data);
		label.setFont(composite.getFont());

		return composite;
	}

	/**
	 *
	 */
	protected Control createButtonBar(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);

		// create a layout with spacing and margins appropriate for the font size.
		GridLayout layout = new GridLayout();
		layout.numColumns = 0; // this is incremented by createButton
		layout.makeColumnsEqualWidth = true;
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		layout.horizontalSpacing =
			convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
		layout.verticalSpacing = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_SPACING);

		composite.setLayout(layout);

		GridData data =
			new GridData(GridData.HORIZONTAL_ALIGN_END | GridData.VERTICAL_ALIGN_CENTER);
		data.horizontalSpan = 2;
		composite.setLayoutData(data);

		composite.setFont(parent.getFont());

		// Add the buttons to the button bar.
		createButtonsForButtonBar(composite);

		return composite;
	}

	/**
	 *
	 */
	protected Control createDialogArea(Composite parent) {
		createMessageArea(parent);

		// create a composite with standard margins and spacing
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.marginHeight = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
		layout.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
		layout.verticalSpacing = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_SPACING);
		layout.horizontalSpacing =
			convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
		layout.numColumns = 2;
		composite.setLayout(layout);
		GridData childData = new GridData(GridData.FILL_BOTH);
		childData.horizontalSpan = 2;
		composite.setLayoutData(childData);
		composite.setFont(parent.getFont());
		return composite;
	}

	/**
	 *
	 */
	protected Control createContents(Composite parent) {
		// initialize the dialog units
		initializeDialogUnits(parent);

		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		layout.marginHeight = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
		layout.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
		layout.verticalSpacing = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_SPACING);
		layout.horizontalSpacing =
			convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
		layout.makeColumnsEqualWidth = false;
		parent.setLayout(layout);
		parent.setLayoutData(new GridData(GridData.FILL_BOTH));

		// create the dialog area and button bar
		createDialogArea(parent);
		createButtonBar(parent);

		return parent;
	}

	/**
	 *
	 */
	protected Text createText(Composite parent) {
		// create the text
		text = new Text(parent, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.MULTI);

		// fill the text
		populateText(text);

		text.setEditable(false);

		GridData data =
			new GridData(
				GridData.HORIZONTAL_ALIGN_FILL
					| GridData.GRAB_HORIZONTAL
					| GridData.VERTICAL_ALIGN_FILL
					| GridData.GRAB_VERTICAL);
		data.heightHint = text.getLineHeight() * NUM_OF_LINES;
		data.horizontalSpan = 2;
		text.setLayoutData(data);
		textCreated = true;
		return text;
	}

	/**
	 *
	 */
	private void populateText(Text text) {
		java.io.StringWriter writer = new java.io.StringWriter();

		status.getException().printStackTrace(new java.io.PrintWriter(writer));
		text.append(writer.getBuffer().toString());
		// now, move the cursor position to the beginning of text
		text.setSelection(0, 0);
	}

	/**
	 *
	 */
	private void toggleDetailsArea() {
		Point windowSize = getShell().getSize();
		Point oldSize = getShell().computeSize(SWT.DEFAULT, SWT.DEFAULT);

		if (textCreated) {
			text.dispose();
			textCreated = false;
			detailsButton.setText(IDialogConstants.SHOW_DETAILS_LABEL);
		} else {
			text = createText((Composite) getContents());
			;
			detailsButton.setText(IDialogConstants.HIDE_DETAILS_LABEL);
		}

		Point newSize = getShell().computeSize(SWT.DEFAULT, SWT.DEFAULT);

		getShell().setSize(new Point(windowSize.x, windowSize.y + (newSize.y - oldSize.y)));

		togle = !togle;
	}
}
