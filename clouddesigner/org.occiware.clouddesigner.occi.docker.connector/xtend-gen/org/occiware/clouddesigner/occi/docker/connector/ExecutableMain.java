/**
 * This file contains the OCCIware Docker connector.
 * 
 * This connector implements the causal link, i.e. synchronization, between Docker models and Docker engines.
 * 
 * Copyright 2015 - Inria
 * 
 * Contributors:
 * - Philippe Merle - Inria
 */
package org.occiware.clouddesigner.occi.docker.connector;

import org.eclipse.emf.common.util.EList;
import org.occiware.clouddesigner.OCCI.Link;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.Contains;
import org.occiware.clouddesigner.occi.docker.DockerFactory;
import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableDockerFactory;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;

@SuppressWarnings("all")
public class ExecutableMain {
  public static void main(final String[] args) {
    ExecutableDockerFactory.init();
    final DockerFactory factory = DockerPackage.eINSTANCE.getDockerFactory();
    final Machine_VirtualBox machine = factory.createMachine_VirtualBox();
    machine.setName("m1");
    machine.setMemory(2048.0f);
    final Container container = factory.createContainer();
    container.setName("m1");
    container.setImage("ubuntu");
    final Contains contains = factory.createContains();
    contains.setTarget(container);
    EList<Link> _links = machine.getLinks();
    _links.add(contains);
    machine.start();
    machine.stop(StopMethod.GRACEFUL);
    container.start();
    container.start();
    container.stop(StopMethod.GRACEFUL);
    container.stop(StopMethod.GRACEFUL);
  }
}
