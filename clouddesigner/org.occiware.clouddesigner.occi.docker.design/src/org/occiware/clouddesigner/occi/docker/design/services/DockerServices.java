package org.occiware.clouddesigner.occi.docker.design.services;

import org.eclipse.emf.ecore.EObject;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.Machine;

public class DockerServices {

	public void start(EObject eo) {
		if (eo instanceof Machine) {
			System.err
					.println("TODO start machine " + ((Machine) eo).getName());
		} else if (eo instanceof Container) {
			System.err.println("TODO start container "
					+ ((Container) eo).getName());
		}
	}

	public void stop(EObject eo) {
		if (eo instanceof Machine) {
			System.err.println("TODO stop machine " + ((Machine) eo).getName());
		} else if (eo instanceof Container) {
			System.err.println("TODO stop container "
					+ ((Container) eo).getName());
		}
	}

}
