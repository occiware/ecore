/**
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Fawaz PARAISO
 * - Philippe MERLE
 */
package org.occiware.clouddesigner.occi.docker.connector;

import com.google.common.base.Objects;
import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.docker.Contains;
import org.occiware.clouddesigner.occi.docker.DockerFactory;
import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Link;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.connector.ComputeStateMachine;
import org.occiware.clouddesigner.occi.docker.connector.EventCallBack;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.DockerContainerManager;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerObserver;
import org.occiware.clouddesigner.occi.docker.impl.ContainerImpl;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class implements an executable Docker container.
 */
@SuppressWarnings("all")
public class ExecutableContainer extends ContainerImpl {
  private static Logger LOGGER = LoggerFactory.getLogger(ExecutableContainer.class);
  
  private /* Map<DockerClient, CreateContainerResponse> */Object map = null;
  
  protected static DockerContainerManager dockerContainerManager = null;
  
  protected static Map<String, Machine> listCurrentMachine = new HashMap<String, Machine>();
  
  private EventCallBack eventCallback = new EventCallBack(this);
  
  /**
   * Docker containers have a state machine.
   */
  private final ComputeStateMachine<org.occiware.clouddesigner.occi.docker.Container> stateMachine /* Skipped initializer because of errors */;
  
  @Override
  public void start() {
    this.stateMachine.start();
    final DockerObserver observer = new DockerObserver();
    final Machine machine = this.getCurrentMachine();
    observer.listener(this, machine);
  }
  
  @Override
  public void stop(final StopMethod method) {
    this.stateMachine.stop(method);
  }
  
  @Override
  public void restart(final RestartMethod method) {
    this.stateMachine.restart(method);
  }
  
  @Override
  public void suspend(final SuspendMethod method) {
    this.stateMachine.suspend(method);
  }
  
  public /* Map<DockerClient, CreateContainerResponse> */Object createContainer(final Machine machine, final Multimap<String, String> containerDependency) {
    throw new Error("Unresolved compilation problems:"
      + "\nDockerClient cannot be resolved to a type."
      + "\nCreateContainerResponse cannot be resolved to a type."
      + "\nDockerClient cannot be resolved to a type."
      + "\nCreateContainerResponse cannot be resolved to a type."
      + "\nDockerClient cannot be resolved to a type."
      + "\nCreateContainerResponse cannot be resolved to a type."
      + "\nThe method pullImage(Machine, String) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe method createContainer(Machine, Container, Multimap<String, String>) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field ExecutableContainer.map refers to the missing type DockerClient");
  }
  
  public void createContainer(final Machine machine) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method pullImage(Machine, String) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe method createContainer(Machine, Container) from the type DockerContainerManager refers to the missing type DockerClient");
  }
  
  public void removeContainer(final Machine machine) {
    boolean _equals = Objects.equal(ExecutableContainer.dockerContainerManager, null);
    if (_equals) {
      DockerContainerManager _dockerContainerManager = new DockerContainerManager(machine, this.eventCallback);
      ExecutableContainer.dockerContainerManager = _dockerContainerManager;
    }
    String _name = machine.getName();
    ExecutableContainer.dockerContainerManager.removeContainer(_name, this.name);
  }
  
  public org.occiware.clouddesigner.occi.docker.Container linkContainerToContainer(final org.occiware.clouddesigner.occi.docker.Container container) {
    DockerFactory _dockerFactory = DockerPackage.eINSTANCE.getDockerFactory();
    Link links = _dockerFactory.createLink();
    links.setTarget(container);
    this.links.add(links);
    return container;
  }
  
  public Machine linkContainerToMachine(final Machine machine) {
    DockerFactory _dockerFactory = DockerPackage.eINSTANCE.getDockerFactory();
    Contains contains = _dockerFactory.createContains();
    contains.setTarget(this);
    EList<org.occiware.clouddesigner.occi.Link> _links = machine.getLinks();
    _links.add(contains);
    return machine;
  }
  
  public Machine getCurrentMachine() {
    boolean _containsKey = ExecutableContainer.listCurrentMachine.containsKey(this.id);
    if (_containsKey) {
      return ExecutableContainer.listCurrentMachine.get(this.id);
    }
    EList<EObject> _eContents = this.eContainer.eContents();
    for (final EObject eo : _eContents) {
      if ((eo instanceof Machine)) {
        final Machine machine = ((Machine) eo);
        EList<org.occiware.clouddesigner.occi.Link> _links = machine.getLinks();
        for (final org.occiware.clouddesigner.occi.Link l : _links) {
          if ((l instanceof Contains)) {
            final Contains contains = ((Contains) l);
            Resource _target = contains.getTarget();
            if ((_target instanceof org.occiware.clouddesigner.occi.docker.Container)) {
              Resource _target_1 = ((Contains)l).getTarget();
              boolean _equals = Objects.equal(((ExecutableContainer) _target_1).id, this.id);
              if (_equals) {
                ExecutableContainer.listCurrentMachine.put(this.id, machine);
                return machine;
              }
            }
          }
        }
      }
    }
    return null;
  }
}
