package org.occiware.clouddesigner.occi2ecore.docker;

import org.occiware.clouddesigner.OCCI.Action;
import org.occiware.clouddesigner.OCCI.Attribute;
import org.occiware.clouddesigner.OCCI.Category;
import org.occiware.clouddesigner.occi2ecore.utils.OCCIExtension2Ecore;

/*
 * Modifications de Docker.xmi pour ne pas interférer avec les éléments hérités de OCCI et Infrastructure :
 - link renommé en dockerLink 
 - supprimé l'attribut hostname de container
 - supprimé les actions start et stop de container
 - supprimé l'attribut memory de virtual box
 */
public class ConvertDocker extends OCCIExtension2Ecore {

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

	private static boolean isValid(Attribute attribute) {
		String containerName = ((Category) attribute.eContainer()).getTerm();
		if (containerName.equals("container")) {
			if (attribute.getName().equals("hostname")) {
				return false;
			}
		} else if (containerName.equals("machine_IBM_SoftLayer")) {
			if (attribute.getName().equals("memory")) {
				return false;
			} else if (attribute.getName().equals("hostname")) {
				return false;
			}
		} else if (containerName.equals("machine_VirtualBox")) {
			if (attribute.getName().equals("memory")) {
				return false;
			}
		} else if (containerName.equals("machine_VMware_vCloud_Air")) {
			if (attribute.getName().equals("name")) {
				return false;
			}
		} else if (containerName.equals("machine_Microsoft_Hyper_V")) {
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

}
