/*******************************************************************************
 * Copyright (c) 2017 Obeo
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 *******************************************************************************/
package org.occiware.clouddesigner.occi.examples.wizard;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.occiware.clouddesigner.occi.examples.Activator;
import org.occiware.clouddesigner.occi.examples.ExamplesRegistry;
import org.occiware.clouddesigner.occi.examples.IExample;
import org.occiware.clouddesigner.occi.examples.utils.ImageCanvas;

/**
 * The examples wizard page.
 *
 * @author William Piers
 *         <a href="mailto:william.piers@obeo.fr">william.piers@obeo.fr</a>
 */
public class ExamplesWizardPage extends WizardPage {
	private final class ExamplesContentProvider implements ITreeContentProvider {
		@Override
		public boolean hasChildren(Object element) {
			return false;
		}

		@Override
		public Object getParent(Object element) {
			return null;
		}

		@Override
		public Object[] getElements(Object inputElement) {
			return ArrayContentProvider.getInstance().getElements(inputElement);
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			return null;
		}
	}

	private final class ExamplesLabelProvider extends LabelProvider {
		private static final String EXAMPLE_IMAGE = "ModelingProject.gif"; //$NON-NLS-1$

		@Override
		public String getText(Object element) {
			if (element instanceof IExample) {
				return ((IExample) element).getName();
			}
			return super.getText(element);
		}

		@Override
		public Image getImage(Object element) {
			return Activator.getDefault().getImage(EXAMPLE_IMAGE);
		}
	}

	private IExample chosenExample;

	public ExamplesWizardPage(String pageName) {
		super(pageName);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		setControl(composite);
		composite.setLayout(new FillLayout());
		final SashForm mainSashForm = new SashForm(composite, SWT.HORIZONTAL);

		// Master
		final TreeViewer viewer = new TreeViewer(mainSashForm);
		viewer.setContentProvider(new ExamplesContentProvider());
		viewer.setLabelProvider(new ExamplesLabelProvider());
		viewer.setInput(ExamplesRegistry.getInstance().getRegisteredExamples());

		// Details
		Composite details = new Composite(mainSashForm, SWT.NULL);
		final FillLayout detailsLayout = new FillLayout(SWT.VERTICAL);
		detailsLayout.marginWidth = detailsLayout.spacing = 10;
		details.setLayout(detailsLayout);
		final SashForm detailsSashForm = new SashForm(details, SWT.VERTICAL);

		final ImageCanvas screenshotLabel = new ImageCanvas(detailsSashForm, SWT.BORDER);
		final Label descriptionLabel = new Label(detailsSashForm, SWT.NULL);

		// Selection behaviour
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent arg0) {
				chosenExample = (IExample) ((IStructuredSelection) viewer.getSelection()).getFirstElement();
				screenshotLabel.setImage(chosenExample.getScreenshot());
				descriptionLabel.setText(chosenExample.getDescription());
				setPageComplete(isPageComplete());
			}
		});

		// Sash weights
		mainSashForm.setWeights(new int[] { 1, 3, });
		detailsSashForm.setWeights(new int[] { 2, 1, });

	}

	public IExample getExample() {
		return chosenExample;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.WizardPage#isPageComplete()
	 */
	@Override
	public boolean isPageComplete() {
		return super.isPageComplete() && chosenExample != null && isValid(chosenExample);
	}

	private boolean isValid(IExample chosenExample) {
		boolean valid = !ResourcesPlugin.getWorkspace().getRoot().getProject(chosenExample.getProjectName()).exists();
		if (!valid) {
			setErrorMessage(Messages.ExamplesWizard_error_already_exists_message + chosenExample.getProjectName());
		}
		return valid;
	}
}