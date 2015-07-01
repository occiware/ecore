package org.occiware.clouddesigner.occi.design.dialog;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.LoadResourceAction.LoadResourceDialog;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.OCCIRegistry;
import org.occiware.clouddesigner.occi.design.Messages;
import org.occiware.clouddesigner.occi.provider.OCCIEditPlugin;

public class LoadExtensionDialog extends LoadResourceDialog {
	protected Set<Extension> registeredPackages = new LinkedHashSet<Extension>();

	public LoadExtensionDialog(Shell parent, EditingDomain domain) {
		super(parent, domain);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		Composite buttonComposite = (Composite) composite.getChildren()[0];

		Button browseRegisteredExtensionsButton = new Button(buttonComposite,
				SWT.PUSH);
		browseRegisteredExtensionsButton
				.setText(Messages.LoadExtensionDialog_ExtensionRegistry);
		prepareBrowseRegisteredPackagesButton(browseRegisteredExtensionsButton);
		{
			FormData data = new FormData();
			Control[] children = buttonComposite.getChildren();
			data.right = new FormAttachment(children[0], -CONTROL_OFFSET);
			browseRegisteredExtensionsButton.setLayoutData(data);
		}

		return composite;
	}

	protected void prepareBrowseRegisteredPackagesButton(
			Button browseRegisteredPackagesButton) {
		browseRegisteredPackagesButton
				.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent event) {
						RegisteredExtensionsDialog registeredExtensionsDialog = new RegisteredExtensionsDialog(
								getShell());
						registeredExtensionsDialog.open();
						Object[] result = registeredExtensionsDialog
								.getResult();
						if (result != null) {
							StringBuffer schemes = new StringBuffer();
							for (int i = 0, length = result.length; i < length; i++) {
								schemes.append(OCCIRegistry.getInstance()
										.getExtensionURI(
												String.valueOf(result[i])));
								schemes.append("  "); //$NON-NLS-1$
							}
							uriField.setText((uriField.getText() + "  " + schemes //$NON-NLS-1$
									.toString()).trim());
						}
					}
				});
	}

	public static class RegisteredExtensionsDialog extends
			ElementListSelectionDialog {

		public RegisteredExtensionsDialog(Shell parent) {
			super(parent, new LabelProvider() {
				@Override
				public Image getImage(Object element) {
					return ExtendedImageRegistry.getInstance().getImage(
							OCCIEditPlugin.INSTANCE
									.getImage("full/obj16/Extension")); //$NON-NLS-1$
				}
			});

			setMultipleSelection(true);
			setMessage(Messages.LoadExtensionDialog_SelectRegisteredExtension);
			setFilter("*"); //$NON-NLS-1$
			setTitle(Messages.LoadExtensionDialog_SelectExtension);
		}

		protected void updateElements() {
			Object[] result = OCCIRegistry
					.getInstance()
					.getRegisteredExtensions()
					.toArray(
							new Object[OCCIRegistry.getInstance()
									.getRegisteredExtensions().size()]);
			Arrays.sort(result);
			setListElements(result);
		}

		@Override
		protected Control createDialogArea(Composite parent) {
			Composite result = (Composite) super.createDialogArea(parent);
			Composite buttonGroup = new Composite(result, SWT.NONE);
			GridLayout layout = new GridLayout();
			layout.numColumns = 2;
			buttonGroup.setLayout(layout);
			updateElements();
			return result;
		}
	}
}