/**
 */
package org.occiware.clouddesigner.occi.design.wizard;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.occiware.clouddesigner.occi.OCCIRegistry;
import org.occiware.clouddesigner.occi.design.Messages;
import org.occiware.clouddesigner.occi.design.utils.NewDiagramWizard;
import org.occiware.clouddesigner.occi.design.utils.NewFilePage;
import org.occiware.clouddesigner.occi.design.utils.WizardUtils;

/**
 * This is a simple wizard for creating a new model file.
 */
public class NewConfigurationWizard extends NewDiagramWizard {
	private static final String CONFIG_VIEWPOINT_URI = "viewpoint:/org.occiware.clouddesigner.occi.design/OCCI Configuration"; //$NON-NLS-1$
	private static final String CONFI_FILEEXT = "occic"; //$NON-NLS-1$
	private static final String CONFIG_DIAGRAM_NAME = "Configuration diagram"; //$NON-NLS-1$

	private CheckboxTableViewer refExtensionViewer;

	public NewConfigurationWizard() {
		super(CONFIG_VIEWPOINT_URI, CONFI_FILEEXT, CONFIG_DIAGRAM_NAME);
	}

	@Override
	protected void createInitialModel(Resource resource) {
		Configuration rootObject = OCCIFactory.eINSTANCE.createConfiguration();
		for (String scheme : WizardUtils.getRefExtensionSchemes(refExtensionViewer)) {
			String refExtensionURI = OCCIRegistry.getInstance().getExtensionURI(scheme);
			final Resource refExtensionResource = getResourceSet().getResource(URI.createURI(refExtensionURI, true),
					true);
			final Extension refExtension = (Extension) refExtensionResource.getContents().get(0);
			rootObject.getUse().add(refExtension);
		}
		resource.getContents().add(rootObject);
	}

	@Override
	protected WizardNewFileCreationPage createNewFilePage() {
		return new NewFilePage(getSelection(), fileExt) {
			@Override
			public void createControl(Composite parent) {
				super.createControl(parent);
				Composite control = (Composite) getControl();

				Composite extensionGroup = new Composite(control, SWT.NONE);
				GridLayout layout = new GridLayout();
				layout.numColumns = 2;
				extensionGroup.setLayout(layout);
				extensionGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

				Label refOccieLabel = new Label(extensionGroup, SWT.NONE);
				refOccieLabel.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, true));
				refOccieLabel.setText(Messages.NewExtensionWizard_RefExtensionLabel);
				refOccieLabel.setFont(parent.getFont());

				Composite composite = new Composite(extensionGroup, SWT.NULL);
				GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
				composite.setLayoutData(layoutData);
				TableColumnLayout tableLayout = new TableColumnLayout();
				composite.setLayout(tableLayout);

				Table table = new Table(composite,
						SWT.CHECK | SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION | SWT.H_SCROLL | SWT.V_SCROLL);
				refExtensionViewer = new CheckboxTableViewer(table);

				refExtensionViewer.setContentProvider(ArrayContentProvider.getInstance());

				Collection<String> registeredExtensions = new ArrayList<String>(
						OCCIRegistry.getInstance().getRegisteredExtensions());
				refExtensionViewer.setInput(registeredExtensions);
			}
		};
	}
}
