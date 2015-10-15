package org.occiware.clouddesigner.occi.xtext.scoping;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.linking.lazy.LazyLinker;
import org.eclipse.xtext.nodemodel.INode;
import org.occiware.clouddesigner.occi.OCCIPackage;

public class OCCILinker extends LazyLinker {
	@Override
	protected EObject createProxy(EObject obj, INode node, EReference eRef) {
		if (eRef.equals(OCCIPackage.eINSTANCE.getExtension_Import())) {
			EClass referenceType = getProxyType(obj, eRef);
			final EObject proxy = EcoreUtil.create(referenceType);
			((InternalEObject) proxy)
					.eSetProxyURI(URI.createURI(node.getText().replaceAll("'", "").replaceAll("\"", "")));

			return proxy;
		}
		return super.createProxy(obj, node, eRef);
	}
}
