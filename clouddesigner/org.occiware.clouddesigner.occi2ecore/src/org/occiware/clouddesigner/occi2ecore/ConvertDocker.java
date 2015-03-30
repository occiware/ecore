package org.occiware.clouddesigner.occi2ecore;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.occiware.clouddesigner.OCCI.Action;
import org.occiware.clouddesigner.OCCI.Attribute;
import org.occiware.clouddesigner.OCCI.Category;
import org.occiware.clouddesigner.OCCI.Extension;
import org.occiware.clouddesigner.OCCI.OCCIPackage;
import org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage;
import org.occiware.clouddesigner.occi2ecore.utils.ConverterUtils;
import org.occiware.clouddesigner.occi2ecore.utils.OCCIExtension2Ecore;

/*
 * Modifications de Docker.xmi pour ne pas interf�rer avec les �l�ments h�rit�s de OCCI et Infrastructure :
 - link renomm� en dockerLink 
 - supprim� l'attribut hostname de container
 - supprim� les actions start et stop de container
 - supprim� l'attribut memory de virtual box
 */
public class ConvertDocker extends OCCIExtension2Ecore {
	public static ResourceSet resourceSet = new ResourceSetImpl();

	static {
		resourceSet.getPackageRegistry().put(OCCIPackage.eNS_URI,
				OCCIPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(InfrastructurePackage.eNS_URI,
				InfrastructurePackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", new XMIResourceFactoryImpl());
	}

	public static void main(String[] args) throws IOException {
		Extension ext = (Extension) ConverterUtils.getRootElement(resourceSet,
				"input/docker/Docker.xmi");
		EPackage res = new ConvertDocker() {
			protected org.eclipse.emf.ecore.EAttribute convertAttribute(
					org.occiware.clouddesigner.OCCI.Attribute attribute) {
				if (isValid(attribute)) {
					return super.convertAttribute(attribute);
				}
				return null;
			};

			protected org.eclipse.emf.ecore.EOperation convertAction(
					org.occiware.clouddesigner.OCCI.Action action) {
				if (isValid(action)) {
					return super.convertAction(action);
				}
				return null;
			};

			protected EClass convertKind(
					org.occiware.clouddesigner.OCCI.Kind kind) {
				if (kind.getTerm().equals("link")) {
					kind.setTerm("dockerLink");
				}
				return super.convertKind(kind);
			};
		}.convertExtension(ext);
		res.setNsURI("http://schemas.ogf.org/occi/docker");
		ConverterUtils.save(resourceSet, res, "output/Docker.ecore");

		File current = new File(new File("").getAbsolutePath());
		fixMetamodelRefs(new File(current.getPath() + "/output/Docker.ecore"));
	}

	private static boolean isValid(Attribute attribute) {
		String containerName = ((Category) attribute.eContainer()).getTerm();
		if (containerName.equals("container")) {
			if (attribute.getName().equals("hostname")) {
				return false;
			}
		} else if (containerName.equals("machine_VirtualBox")) {
			if (attribute.getName().equals("memory")) {
				return false;
			}
		}
		return true;
	}

	private static boolean isValid(Action action) {
		String containerName = ((Category) action.eContainer()).getTerm();
		if (containerName.equals("container")) {
			if (action.getTerm().equals("start")
					|| action.getTerm().equals("stop")) {
				return false;
			}
		}
		return true;
	}

	public Map<String, EClass> initParentKindMappings() {
		Map<String, EClass> kindMappings = new HashMap<String, EClass>();
		kindMappings.put("resource", OCCIPackage.eINSTANCE.getResource());
		kindMappings.put("link", OCCIPackage.eINSTANCE.getLink());
		kindMappings.put("entity", OCCIPackage.eINSTANCE.getEntity());
		for (EClassifier infraType : InfrastructurePackage.eINSTANCE
				.getEClassifiers()) {
			if (infraType instanceof EClass) {
				kindMappings.put(infraType.getName().toLowerCase(),
						(EClass) infraType);
			}
		}
		return kindMappings;
	}
}
