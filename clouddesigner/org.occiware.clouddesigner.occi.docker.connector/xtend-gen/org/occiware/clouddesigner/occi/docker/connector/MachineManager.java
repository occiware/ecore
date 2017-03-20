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
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.Contains;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.Network;
import org.occiware.clouddesigner.occi.docker.NetworkLink;
import org.occiware.clouddesigner.occi.docker.connector.ComputeStateMachine;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.DockerContainerManager;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.graph.Graph;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.graph.GraphNode;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerMachineManager;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil;
import org.occiware.clouddesigner.occi.infrastructure.NetworkStatus;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class implements an abstract Docker machine manager.
 */
@SuppressWarnings("all")
public abstract class MachineManager extends ComputeStateMachine<Machine> {
  private static Logger LOGGER = LoggerFactory.getLogger(MachineManager.class);
  
  protected Multimap<String, String> containerDependency = ArrayListMultimap.<String, String>create();
  
  protected Machine machine;
  
  protected DockerContainerManager dockerContainerManager = new DockerContainerManager();
  
  private String dockerMachineCmd = DockerUtil.getDockerMachineCmd();
  
  /**
   * Construct a Docker machine manager for a given Docker machine.
   */
  public MachineManager(final Machine m) {
    super(m);
    this.machine = m;
  }
  
  /**
   * Return the Docker machine driver name.
   */
  public abstract String getDriverName();
  
  /**
   * Append specific Docker machine driver parameters.
   */
  public abstract void appendDriverParameters(final StringBuilder sb);
  
  /**
   * Start a Docker machine.
   */
  @Override
  public void start_execute() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nisNotBlank cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nisNotBlank cannot be resolved");
  }
  
  @Override
  public void startAll_execute() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method createContainer(Machine, Multimap<String, String>) from the type ExecutableContainer refers to the missing type DockerClient"
      + "\nThe method createContainer(Machine, Multimap<String, String>) from the type ExecutableContainer refers to the missing type DockerClient"
      + "\nThe method createContainer(Machine, Multimap<String, String>) from the type ExecutableContainer refers to the missing type DockerClient"
      + "\nisNotBlank cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nisNotBlank cannot be resolved");
  }
  
  /**
   * Connect container to all networks overlay.
   */
  public void connectToNetwork(final Machine machine, final Map<Container, Set<NetworkLink>> networks) {
    this.dockerContainerManager.connectToNetwork(this.compute, networks);
  }
  
  /**
   * Create and update the Id of all networks detected inside the machine
   */
  protected void createNetwork(final Map<Container, Set<NetworkLink>> networks) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createNetwork(Machine, Network) from the type DockerContainerManager refers to the missing type Object");
  }
  
  public void synchronize() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createContainer(Machine, Multimap<String, String>) from the type ExecutableContainer refers to the missing type DockerClient");
  }
  
  /**
   * Checks inside the machine model if any container has networkLink
   */
  public Map<Container, Set<NetworkLink>> detectNetworkLink() {
    Map<Container, Set<NetworkLink>> map_networkLinks = CollectionLiterals.<Container, Set<NetworkLink>>newLinkedHashMap();
    Set<NetworkLink> c_networkLinks = CollectionLiterals.<NetworkLink>newHashSet();
    EList<Link> _links = this.compute.getLinks();
    for (final Link l : _links) {
      {
        final Contains contains = ((Contains) l);
        Resource _target = contains.getTarget();
        if ((_target instanceof Container)) {
          Resource _target_1 = contains.getTarget();
          final Container container = ((Container) _target_1);
          EList<Link> _links_1 = container.getLinks();
          for (final Link cl : _links_1) {
            if (((cl instanceof NetworkLink) && 
              (cl.getTarget() instanceof Network))) {
              c_networkLinks.add(((NetworkLink) cl));
            }
          }
          Resource _target_2 = contains.getTarget();
          map_networkLinks.put(((Container) _target_2), c_networkLinks);
        }
      }
    }
    return map_networkLinks;
  }
  
  /**
   * Checks if there is a link between containers.
   */
  public boolean linkFound() {
    final List<Container> containers = this.getContainers();
    boolean link = false;
    for (final Container c : containers) {
      boolean _notEquals = (!Objects.equal(c, null));
      if (_notEquals) {
        EList<Link> _links = c.getLinks();
        int _size = _links.size();
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          link = true;
          return link;
        }
      }
    }
    return link;
  }
  
  /**
   * Provide the containers deployment order.
   */
  public List<Container> deploymentOrder() {
    final List<Container> containers = CollectionLiterals.<Container>newArrayList();
    Graph<Container> graph = new Graph<Container>();
    EList<Link> _links = this.compute.getLinks();
    for (final Link l : _links) {
      {
        final Contains contains = ((Contains) l);
        Resource _target = contains.getTarget();
        if ((_target instanceof Container)) {
          Resource _target_1 = contains.getTarget();
          final Container container = ((Container) _target_1);
          EList<Link> _links_1 = container.getLinks();
          for (final Link cl : _links_1) {
            Resource _target_2 = cl.getTarget();
            if ((_target_2 instanceof Container)) {
              Resource _target_3 = cl.getTarget();
              graph.addDependency(container, ((Container) _target_3));
              String _name = container.getName();
              Resource _target_4 = cl.getTarget();
              String _name_1 = ((Container) _target_4).getName();
              this.containerDependency.put(_name, _name_1);
            }
          }
        }
      }
    }
    MachineManager.LOGGER.info(("------------------- GRAPH : " + graph));
    try {
      List<GraphNode<Container>> _deploymentOrder = graph.deploymentOrder();
      boolean _notEquals = (!Objects.equal(_deploymentOrder, null));
      if (_notEquals) {
        List<GraphNode<Container>> _deploymentOrder_1 = graph.deploymentOrder();
        for (final GraphNode<Container> c : _deploymentOrder_1) {
          {
            containers.add(c.value);
            MachineManager.LOGGER.info(("--->" + c.value));
          }
        }
      }
    } catch (final Throwable _t) {
      if (_t instanceof NullPointerException) {
        final NullPointerException exception = (NullPointerException)_t;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    List<Container> _leafContainers = this.leafContainers();
    for (final Container standaloneContainer : _leafContainers) {
      boolean _contains = containers.contains(standaloneContainer);
      boolean _not = (!_contains);
      if (_not) {
        containers.add(standaloneContainer);
      }
    }
    final Consumer<Container> _function = (Container c_1) -> {
      String _name = c_1.getName();
      MachineManager.LOGGER.info(_name);
    };
    containers.forEach(_function);
    return containers;
  }
  
  /**
   * Retrieves all containers inside a given machine.
   */
  public List<Container> getContainers() {
    final List<Container> containers = CollectionLiterals.<Container>newArrayList();
    EList<Link> _links = this.compute.getLinks();
    for (final Link link : _links) {
      Resource _target = link.getTarget();
      if ((_target instanceof Container)) {
        Resource _target_1 = link.getTarget();
        containers.add(((Container) _target_1));
      }
    }
    Set<Object> _singleton = Collections.<Object>singleton(null);
    containers.removeAll(_singleton);
    return containers;
  }
  
  /**
   * Get all containers which has not a link to another container.
   */
  public List<Container> leafContainers() {
    final List<Container> containers = this.getContainers();
    final List<Container> leafContainers = new ArrayList<Container>();
    for (final Container c : containers) {
      EList<Link> _links = c.getLinks();
      int _size = _links.size();
      boolean _equals = (_size == 0);
      if (_equals) {
        leafContainers.add(c);
      } else {
        Boolean tagertContainerFound = Boolean.valueOf(false);
        EList<Link> _links_1 = c.getLinks();
        for (final Link l : _links_1) {
          Resource _target = l.getTarget();
          if ((_target instanceof Container)) {
            tagertContainerFound = Boolean.valueOf(true);
          }
        }
        if ((!(tagertContainerFound).booleanValue())) {
          leafContainers.add(c);
        }
      }
    }
    return leafContainers;
  }
  
  /**
   * Checks if the container is deployed.
   */
  public boolean containerIsDeployed(final String containerName, final Machine machine) {
    throw new Error("Unresolved compilation problems:"
      + "\ncom.github.dockerjava.api.model.Container cannot be resolved to a type."
      + "\nThe method listContainer(String) from the type DockerContainerManager refers to the missing type Container"
      + "\nnames cannot be resolved"
      + "\nget cannot be resolved"
      + "\nindexOf cannot be resolved"
      + "\n== cannot be resolved"
      + "\nreplaceAll cannot be resolved"
      + "\nsubstring cannot be resolved"
      + "\n+ cannot be resolved");
  }
  
  /**
   * Get all containers deployed inside a machine.
   */
  public List<String> containerInReal(final String machineName) {
    throw new Error("Unresolved compilation problems:"
      + "\ncom.github.dockerjava.api.model.Container cannot be resolved to a type."
      + "\nThe method listContainer(String) from the type DockerContainerManager refers to the missing type Container"
      + "\nnames cannot be resolved"
      + "\nget cannot be resolved"
      + "\nindexOf cannot be resolved"
      + "\n== cannot be resolved"
      + "\nreplaceAll cannot be resolved"
      + "\nsubstring cannot be resolved"
      + "\n+ cannot be resolved");
  }
  
  /**
   * Stop a Docker machine.
   */
  @Override
  public void stop_execute(final StopMethod method) {
    boolean _equals = Objects.equal(method, StopMethod.GRACEFUL);
    if (_equals) {
      EList<Link> _links = this.compute.getLinks();
      for (final Link link : _links) {
        if ((link instanceof Link)) {
          final Contains contains = ((Contains) link);
          Resource _target = contains.getTarget();
          if ((_target instanceof Container)) {
            Resource _target_1 = contains.getTarget();
            final Container container = ((Container) _target_1);
            container.stop(StopMethod.GRACEFUL);
          }
        }
      }
      Map<Container, Set<NetworkLink>> networks = this.detectNetworkLink();
      int _size = networks.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        Set<Map.Entry<Container, Set<NetworkLink>>> _entrySet = networks.entrySet();
        for (final Map.Entry<Container, Set<NetworkLink>> entry : _entrySet) {
          Set<NetworkLink> _value = entry.getValue();
          for (final NetworkLink net : _value) {
            {
              Resource _target_2 = net.getTarget();
              Network tmpNetwork = ((Network) _target_2);
              tmpNetwork.setState(NetworkStatus.INACTIVE);
            }
          }
        }
      }
      Runtime _runtime = Runtime.getRuntime();
      String _name = this.compute.getName();
      DockerMachineManager.stopCmd(_runtime, _name);
    }
    String _name_1 = this.compute.getName();
    String _plus = ("EXECUTE COMMAND: docker machine stop: " + _name_1);
    MachineManager.LOGGER.info(_plus);
  }
  
  /**
   * Restart a Docker machine.
   */
  @Override
  public void restart_execute(final RestartMethod method) {
    String _name = this.compute.getName();
    String _plus = ("EXECUTE COMMAND: docker machine restart " + _name);
    MachineManager.LOGGER.info(_plus);
    this.stop_execute(StopMethod.GRACEFUL);
    this.start_execute();
  }
  
  /**
   * Suspend a Docker machine.
   */
  @Override
  public void suspend_execute(final SuspendMethod method) {
    String _name = this.compute.getName();
    String _plus = ("EXECUTE COMMAND: docker machine suspend " + _name);
    MachineManager.LOGGER.info(_plus);
  }
}
