/*******************************************************************************
 * Copyright (c) 2011, 2015 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.occiware.clouddesigner.occi.xtext.ui;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.presentation.EcoreEditor;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.xtext.base.utilities.ElementUtil;
import org.eclipse.ocl.xtext.basecs.ModelElementCS;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.validation.ValidatingEditorCallback;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Inject;

public class OCCIEditorCallback extends ValidatingEditorCallback
{
	@Inject
	private ILocationInFileProvider locationProvider;

	public final class XtextEditor_EcoreEditor_AdapterFactory implements IAdapterFactory
	{
		private XtextEditor editor;
		
		public XtextEditor_EcoreEditor_AdapterFactory(XtextEditor editor) {
			this.editor = editor;
		}

		@SuppressWarnings("unchecked")
		@Override
		public Object getAdapter(Object adaptableObject, @SuppressWarnings("rawtypes") Class adapterType) {
			if ((adapterType == EcoreEditor.class) && (adaptableObject instanceof XtextEditor)) {
				return new XtextEditor_EcoreEditor(editor);
			}
			return null;
		}

		@Override
		public Class<?>[] getAdapterList() {
			return new Class[] {EcoreEditor.class};
		}
	}


	public final class XtextEditor_EcoreEditor extends EcoreEditor
	{		
		public final class DummyEditingDomain extends AdapterFactoryEditingDomain
		{
			public DummyEditingDomain() {
				super(null, null);
			}

			@Override
			public ResourceSet getResourceSet() {
				return XtextEditor_EcoreEditor.this.getResourceSet();
			}
		}

		public final class DummyResourceSet extends ResourceSetImpl
		{
			@Override
			public EObject getEObject(URI uri, boolean loadOnDemand) {
				return XtextEditor_EcoreEditor.this.getEObject(uri, loadOnDemand);
			}
		}
		
		private XtextEditor editor;
		private EditingDomain editingDomain = new DummyEditingDomain();
		private ResourceSet resourceSet = new DummyResourceSet();
		
		public XtextEditor_EcoreEditor(XtextEditor editor) {
			this.editor = editor;
		}

		@Override
		public EditingDomain getEditingDomain() {
			return editingDomain;
		}
		
		private  EObject getEObject(final URI uri, boolean loadOnDemand) {
			IXtextDocument document = editor.getDocument();
			if (document == null) {		// Bug 348256 reports an unreproducible NPE. May be there is/was an editor start up
				return null;			//  race condition; just return no object rather than an NPE.
			}
			EObject eObject = document.readOnly(new IUnitOfWork<EObject, XtextResource>()
			{
				@Override
				public  EObject exec( XtextResource state) throws Exception {
					return state != null ? state.getEObject(uri.fragment()) : null;
				}
			});
			return eObject;
		}

		private ResourceSet getResourceSet() {
			return resourceSet;
		}
		
		@Override
		public void setSelectionToViewer(Collection<?> collection) {
			if (collection != null) {
				Iterator<?> iterator = collection.iterator();
				if (iterator.hasNext()) {
					Object object = iterator.next();
					if (object instanceof Element) {
						ModelElementCS csElement = ElementUtil.getCsElement((Element) object);
						if (csElement != null) {
							selectAndReveal(EcoreUtil.getURI(csElement), true);
						}
					}
				}
			}
		}
		protected void selectAndReveal(final URI uri, final boolean select) {
			if (uri.fragment() != null) {
				editor.getDocument().readOnly(new IUnitOfWork.Void<XtextResource>() {
					@Override
					public void process( XtextResource resource) throws Exception {
						if (resource != null) {
							EObject object = resource.getEObject(uri.fragment());
							if (object != null) {
								ITextRegion location = locationProvider.getSignificantTextRegion(object);
								if (select) {
									editor.selectAndReveal(location.getOffset(), location.getLength());
								} else {
									editor.reveal(location.getOffset(), location.getLength());
								}
							}
						}
					}
				});
			}
		}
	}

	@Override
	public void afterCreatePartControl(XtextEditor editor) {
		super.afterCreatePartControl(editor);
		IAdapterFactory factory = new XtextEditor_EcoreEditor_AdapterFactory(editor);
		Platform.getAdapterManager().registerAdapters(factory, XtextEditor.class);
	}
}
