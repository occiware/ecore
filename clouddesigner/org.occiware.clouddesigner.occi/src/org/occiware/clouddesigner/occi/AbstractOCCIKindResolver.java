package org.occiware.clouddesigner.occi;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;

public class AbstractOCCIKindResolver {
	private Map<String, Extension> extPerMMURI = new HashMap<String, Extension>();

	private Map<EClass, Kind> kindPerEClass = new HashMap<EClass, Kind>();

	public void addKind(Entity entity) throws CoreException {
		if (entity.getKind() == null) {
			Kind entityKind = kindPerEClass.get(entity.eClass());
			if (entityKind == null) {
				String metamodelURI = entity.eClass().getEPackage().getNsURI();
				Extension extension = extPerMMURI.get(metamodelURI);
				if (extension == null) {
					String scheme = metamodelURI + '#';
					String extensionURI = OCCIRegistry.getInstance()
							.getExtensionURI(scheme);
					org.eclipse.emf.ecore.resource.Resource extensionResource = entity
							.eResource().getResourceSet()
							.getResource(URI.createURI(extensionURI), true);
					extension = (Extension) extensionResource.getContents()
							.get(0);
					extPerMMURI.put(metamodelURI, extension);
				}
				for (Kind kind : extension.getKinds()) {
					String kindName = toU1Case(kind.getTerm());
					if (kindName.equals(entity.eClass().getName())) {
						entityKind = kind;
						kindPerEClass.put(entity.eClass(), kind);
						break;
					}
				}
			}
			entity.setKind(entityKind);
		}
		// add missing uses
		if (!((Configuration) entity.eContainer()).getUse().contains(
				entity.getKind().eContainer())) {
			((Configuration) entity.eContainer()).getUse().add(
					(Extension) entity.getKind().eContainer());
		}
	}

	private String toU1Case(String temp) {
		temp = temp.substring(0, 1).toUpperCase() + temp.substring(1);
		return temp;
	}
}
