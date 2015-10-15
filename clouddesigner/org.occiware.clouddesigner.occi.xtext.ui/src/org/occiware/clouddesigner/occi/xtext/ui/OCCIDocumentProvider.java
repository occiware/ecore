package org.occiware.clouddesigner.occi.xtext.ui;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.text.IDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;
import org.occiware.clouddesigner.occi.OCCIPackage;
import org.occiware.clouddesigner.occi.xtext.OCCIStandaloneSetup;

public class OCCIDocumentProvider extends XtextDocumentProvider {
	static {
		OCCIStandaloneSetup.doSetup();
	}

	@Override
	protected void setDocumentContent(IDocument document, InputStream contentStream, String encoding)
			throws CoreException {
		ResourceSet resourceSet = createResourceSet();
		Resource xmiResource = resourceSet.createResource(URI.createURI("temp.xmi"));
		Resource xtextResource = resourceSet.createResource(URI.createURI("temp.occi"));
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		try {
			xmiResource.load(contentStream, Collections.emptyMap());
			xtextResource.getContents().addAll(xmiResource.getContents());
			xtextResource.save(os, Collections.EMPTY_MAP);
		} catch (IOException e) {
			throw new CoreException(
					new Status(IStatus.ERROR, "org.occiware.clouddesigner.occi.xtext.ui", "Failed to save", e));
		} finally {
			try {
				os.close();
				contentStream.close();
			} catch (IOException e) {
				throw new CoreException(
						new Status(IStatus.ERROR, "org.occiware.clouddesigner.occi.xtext.ui", "Failed to load", e));
			}
		}
		document.set(new String(os.toByteArray()));
	}

	@Override
	protected void doSaveDocument(IProgressMonitor monitor, Object element, IDocument document, boolean overwrite)
			throws CoreException {
		try {
			ResourceSet resourceSet = createResourceSet();
			XtextResource xtextResource = (XtextResource) resourceSet.createResource(URI.createURI("temp.occi"));
			InputStream is = new ByteArrayInputStream(document.get().getBytes());
			xtextResource.load(is, Collections.EMPTY_MAP);
			is.close();
			URI uri = URI.createPlatformResourceURI(
					((org.eclipse.ui.part.FileEditorInput) element).getFile().getFullPath().toString(), true);
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
			Resource xmiResource = resourceSet.getResource(uri, true);
			((XMLResource) xmiResource).getDefaultSaveOptions().put(XMLResource.OPTION_URI_HANDLER,
					new URIHandlerImpl.PlatformSchemeAware());
			xmiResource.getContents().clear();
			xmiResource.getContents().addAll(xtextResource.getContents());
			xmiResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			throw new CoreException(
					new Status(IStatus.ERROR, "org.occiware.clouddesigner.occi.xtext.ui", "Failed to save", e));
		}
	}

	private ResourceSet createResourceSet() {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(OCCIPackage.eNS_URI, OCCIPackage.eINSTANCE);
		return resourceSet;
	}

}
