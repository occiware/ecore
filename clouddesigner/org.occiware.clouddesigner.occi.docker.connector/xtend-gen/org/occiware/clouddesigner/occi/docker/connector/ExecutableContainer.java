/**
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	- Philippe MERLE
 * 	- Fawaz PARAISO
 */
package org.occiware.clouddesigner.occi.docker.connector;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.CreateContainerResponse;
import com.google.common.base.Objects;
import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.occiware.clouddesigner.OCCI.Resource;
import org.occiware.clouddesigner.occi.docker.Contains;
import org.occiware.clouddesigner.occi.docker.DockerFactory;
import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Link;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.connector.ComputeStateMachine;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.DockerContainerManager;
import org.occiware.clouddesigner.occi.docker.impl.ContainerImpl;
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus;
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
  
  private Map<DockerClient, CreateContainerResponse> map = null;
  
  /**
   * Docker containers have a state machine.
   */
  private final ComputeStateMachine<org.occiware.clouddesigner.occi.docker.Container> stateMachine = new ComputeStateMachine<org.occiware.clouddesigner.occi.docker.Container>(this) {
    /**
     * Start the Docker container.
     */
    public void start_execute() {
      ExecutableContainer.LOGGER.info("EXECUTE container start");
      final Machine machine = ExecutableContainer.this.getCurrentMachine();
      ComputeStatus _state = machine.getState();
      String _string = _state.toString();
      boolean _equalsIgnoreCase = _string.equalsIgnoreCase("active");
      if (_equalsIgnoreCase) {
        final DockerContainerManager dockerContainerManager = new DockerContainerManager();
        String _name = this.compute.getName();
        dockerContainerManager.startContainer(machine, _name);
      }
    }
    
    /**
     * Stop the Docker container.
     */
    public void stop_execute(final StopMethod method) {
      ExecutableContainer.LOGGER.info("EXECUTE container stop");
      final Machine machine = ExecutableContainer.this.getCurrentMachine();
      ComputeStatus _state = machine.getState();
      String _string = _state.toString();
      boolean _equalsIgnoreCase = _string.equalsIgnoreCase("active");
      if (_equalsIgnoreCase) {
        final DockerContainerManager dockerContainerManager = new DockerContainerManager();
        String _name = this.compute.getName();
        dockerContainerManager.startContainer(machine, _name);
      }
    }
    
    /**
     * Restart the Docker container.
     */
    public void restart_execute(final RestartMethod method) {
      ExecutableContainer.LOGGER.info("EXECUTE container restart");
      this.stop_execute(StopMethod.GRACEFUL);
      this.start_execute();
    }
    
    /**
     * Suspend the Docker container.
     */
    public void suspend_execute(final SuspendMethod method) {
      ExecutableContainer.LOGGER.info("EXECUTE container suspend");
    }
  };
  
  public void start() {
    this.stateMachine.start();
  }
  
  public void stop(final StopMethod method) {
    this.stateMachine.stop(method);
  }
  
  public void restart(final RestartMethod method) {
    this.stateMachine.restart(method);
  }
  
  public void suspend(final SuspendMethod method) {
    this.stateMachine.suspend(method);
  }
  
  public Map<DockerClient, CreateContainerResponse> createContainer(final Machine machine, final Multimap<String, String> containerDependency) {
    DockerContainerManager dockercontainerManager = new DockerContainerManager();
    Map<DockerClient, CreateContainerResponse> result = new HashMap<DockerClient, CreateContainerResponse>();
    dockercontainerManager.pullImage(machine, this.image);
    Map<DockerClient, CreateContainerResponse> _createContainer = dockercontainerManager.createContainer(machine, this, containerDependency);
    result = _createContainer;
    HashMap<DockerClient, CreateContainerResponse> _hashMap = new HashMap<DockerClient, CreateContainerResponse>(result);
    this.map = _hashMap;
    return result;
  }
  
  public void createContainer(final Machine machine) {
    DockerContainerManager dockercontainerManager = new DockerContainerManager();
    dockercontainerManager.pullImage(machine, this.image);
    dockercontainerManager.createContainer(machine, this);
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
    EList<org.occiware.clouddesigner.OCCI.Link> _links = machine.getLinks();
    _links.add(contains);
    return machine;
  }
  
  public Machine getCurrentMachine() {
    EList<EObject> _eContents = this.eContainer.eContents();
    for (final EObject eo : _eContents) {
      if ((eo instanceof Machine)) {
        final Machine machine = ((Machine) eo);
        EList<org.occiware.clouddesigner.OCCI.Link> _links = machine.getLinks();
        for (final org.occiware.clouddesigner.OCCI.Link l : _links) {
          Resource _target = l.getTarget();
          boolean _equals = Objects.equal(((ExecutableContainer) _target).id, this.id);
          if (_equals) {
            return machine;
          }
        }
      }
    }
    return null;
  }
}
