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

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.occiware.clouddesigner.OCCI.Link;
import org.occiware.clouddesigner.OCCI.Resource;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.Contains;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.connector.ComputeStateMachine;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableContainer;
import org.occiware.clouddesigner.occi.docker.connector.ModelHandler;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.DockerContainerManager;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.graph.Graph;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.graph.GraphNode;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerMachineManager;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.ProcessManager;
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus;
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
  public void start_execute() {
    final Runtime runtime = Runtime.getRuntime();
    final StringBuilder command = new StringBuilder();
    String _name = this.compute.getName();
    Preconditions.<String>checkNotNull(_name, "Machine name is null");
    String _driverName = this.getDriverName();
    Preconditions.<String>checkNotNull(_driverName, "Driver name is null");
    StringBuilder _append = command.append("docker-machine create --driver ");
    String _driverName_1 = this.getDriverName();
    StringBuilder _append_1 = _append.append(_driverName_1);
    StringBuilder _append_2 = _append_1.append(" ");
    String _name_1 = this.compute.getName();
    _append_2.append(_name_1);
    this.appendDriverParameters(command);
    final Map<String, String> activeHosts = DockerUtil.getActiveHosts();
    final Map<String, String> hosts = DockerUtil.getHosts();
    String _name_2 = this.compute.getName();
    boolean _containsKey = hosts.containsKey(_name_2);
    boolean _not = (!_containsKey);
    if (_not) {
      String _string = command.toString();
      ProcessManager.runCommand(_string, runtime, true);
    } else {
      String _name_3 = this.compute.getName();
      boolean _containsKey_1 = activeHosts.containsKey(_name_3);
      boolean _not_1 = (!_containsKey_1);
      if (_not_1) {
        String _name_4 = this.compute.getName();
        DockerMachineManager.startCmd(runtime, _name_4);
      }
    }
  }
  
  public void startAll_execute() {
    final Runtime runtime = Runtime.getRuntime();
    final StringBuilder command = new StringBuilder();
    String _name = this.compute.getName();
    Preconditions.<String>checkNotNull(_name, "Machine name is null");
    String _driverName = this.getDriverName();
    Preconditions.<String>checkNotNull(_driverName, "Driver name is null");
    StringBuilder _append = command.append("docker-machine create --driver ");
    String _driverName_1 = this.getDriverName();
    StringBuilder _append_1 = _append.append(_driverName_1);
    StringBuilder _append_2 = _append_1.append(" ");
    String _name_1 = this.compute.getName();
    _append_2.append(_name_1);
    this.appendDriverParameters(command);
    final Map<String, String> activeHosts = DockerUtil.getActiveHosts();
    final Map<String, String> hosts = DockerUtil.getHosts();
    String _name_2 = this.compute.getName();
    boolean _containsKey = hosts.containsKey(_name_2);
    boolean _not = (!_containsKey);
    if (_not) {
      String _string = command.toString();
      ProcessManager.runCommand(_string, runtime, true);
      this.compute.setState(ComputeStatus.ACTIVE);
      EList<Link> _links = this.compute.getLinks();
      int _size = _links.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        boolean _linkFound = this.linkFound();
        boolean _not_1 = (!_linkFound);
        if (_not_1) {
          EList<Link> _links_1 = this.compute.getLinks();
          for (final Link link : _links_1) {
            {
              Resource _target = link.getTarget();
              final ExecutableContainer con = ((ExecutableContainer) _target);
              String _name_3 = con.getName();
              boolean _containerIsDeployed = this.containerIsDeployed(_name_3, this.machine);
              boolean _not_2 = (!_containerIsDeployed);
              if (_not_2) {
                con.createContainer(this.machine);
                con.start();
              } else {
                con.start();
              }
            }
          }
        } else {
          final Multimap<String, String> dependencies = this.containerDependency;
          List<Container> _deploymentOrder = this.deploymentOrder();
          for (final Container c : _deploymentOrder) {
            {
              final ExecutableContainer con = ((ExecutableContainer) c);
              String _name_3 = con.getName();
              boolean _containerIsDeployed = this.containerIsDeployed(_name_3, this.compute);
              boolean _not_2 = (!_containerIsDeployed);
              if (_not_2) {
                con.createContainer(this.machine, dependencies);
                con.start();
              } else {
                con.start();
              }
            }
          }
        }
      }
    } else {
      String _name_3 = this.compute.getName();
      boolean _containsKey_1 = activeHosts.containsKey(_name_3);
      boolean _not_2 = (!_containsKey_1);
      if (_not_2) {
        String _name_4 = this.compute.getName();
        DockerMachineManager.startCmd(runtime, _name_4);
        this.compute.setState(ComputeStatus.ACTIVE);
        EList<Link> _links_2 = this.compute.getLinks();
        int _size_1 = _links_2.size();
        boolean _greaterThan_1 = (_size_1 > 0);
        if (_greaterThan_1) {
          boolean _linkFound_1 = this.linkFound();
          boolean _not_3 = (!_linkFound_1);
          if (_not_3) {
            EList<Link> _links_3 = this.compute.getLinks();
            for (final Link link_1 : _links_3) {
              {
                Resource _target = link_1.getTarget();
                final ExecutableContainer con = ((ExecutableContainer) _target);
                String _name_5 = con.getName();
                boolean _containerIsDeployed = this.containerIsDeployed(_name_5, this.machine);
                boolean _not_4 = (!_containerIsDeployed);
                if (_not_4) {
                  con.createContainer(this.machine);
                  con.start();
                } else {
                  con.start();
                }
              }
            }
          } else {
            List<Container> _deploymentOrder_1 = this.deploymentOrder();
            for (final Container c_1 : _deploymentOrder_1) {
              {
                final ExecutableContainer con = ((ExecutableContainer) c_1);
                String _name_5 = con.getName();
                boolean _containerIsDeployed = this.containerIsDeployed(_name_5, this.compute);
                boolean _not_4 = (!_containerIsDeployed);
                if (_not_4) {
                  con.createContainer(this.machine, this.containerDependency);
                  con.start();
                } else {
                  con.start();
                }
              }
            }
          }
        }
      }
    }
    String _string_1 = command.toString();
    String _plus = ("EXECUTE COMMAND: " + _string_1);
    MachineManager.LOGGER.info(_plus);
  }
  
  public void synchronize() {
    final Map<String, String> hosts = DockerUtil.getHosts();
    final ModelHandler instanceMH = new ModelHandler();
    final DockerContainerManager instance = new DockerContainerManager(this.compute);
    String _name = this.compute.getName();
    String _name_1 = this.compute.getName();
    String _get = hosts.get(_name_1);
    final Machine machine = instanceMH.getModel(_name, _get);
    ComputeStatus _state = machine.getState();
    this.compute.setState(_state);
  }
  
  public boolean linkFound() {
    final List<Container> containers = this.getContainers();
    boolean link = false;
    for (final Container c : containers) {
      EList<Link> _links = c.getLinks();
      int _size = _links.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        link = true;
        return link;
      }
    }
    return link;
  }
  
  public List<Container> deploymentOrder() {
    final List<Container> containers = CollectionLiterals.<Container>newArrayList();
    Graph<Container> graph = new Graph<Container>();
    EList<Link> _links = this.compute.getLinks();
    for (final Link l : _links) {
      {
        Resource _target = l.getTarget();
        final Container container = ((Container) _target);
        EList<Link> _links_1 = container.getLinks();
        boolean _isEmpty = _links_1.isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          EList<Link> _links_2 = container.getLinks();
          for (final Link cl : _links_2) {
            Resource _target_1 = cl.getTarget();
            if ((_target_1 instanceof Container)) {
              Resource _target_2 = cl.getTarget();
              graph.addDependency(container, ((Container) _target_2));
              String _name = container.getName();
              Resource _target_3 = cl.getTarget();
              String _name_1 = ((Container) _target_3).getName();
              this.containerDependency.put(_name, _name_1);
            }
          }
        }
      }
    }
    List<GraphNode<Container>> _deploymentOrder = graph.deploymentOrder();
    for (final GraphNode<Container> c : _deploymentOrder) {
      {
        containers.add(c.value);
        MachineManager.LOGGER.info(("--->" + c.value));
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
    final Procedure1<Container> _function = new Procedure1<Container>() {
      public void apply(final Container c) {
        String _name = c.getName();
        MachineManager.LOGGER.info(_name);
      }
    };
    IterableExtensions.<Container>forEach(containers, _function);
    return containers;
  }
  
  public List<Container> getContainers() {
    final List<Container> containers = CollectionLiterals.<Container>newArrayList();
    EList<Link> _links = this.compute.getLinks();
    final Procedure1<Link> _function = new Procedure1<Link>() {
      public void apply(final Link elt) {
        Resource _target = elt.getTarget();
        containers.add(((Container) _target));
      }
    };
    IterableExtensions.<Link>forEach(_links, _function);
    return containers;
  }
  
  public List<Container> leafContainers() {
    final List<Container> containers = this.getContainers();
    final List<Container> leafContainers = new ArrayList<Container>();
    for (final Container c : containers) {
      EList<Link> _links = c.getLinks();
      int _size = _links.size();
      boolean _equals = (_size == 0);
      if (_equals) {
        leafContainers.add(c);
      }
    }
    return leafContainers;
  }
  
  public boolean containerIsDeployed(final String containerName, final Machine machine) {
    final List<com.github.dockerjava.api.model.Container> listContainers = this.dockerContainerManager.listContainer(machine);
    for (final com.github.dockerjava.api.model.Container c : listContainers) {
      {
        String contName = null;
        String[] _names = c.getNames();
        final String name = _names[0];
        final String linkName = "LinkTo";
        final int index = name.indexOf(linkName);
        if ((index == (-1))) {
          String _replaceAll = name.replaceAll("/", "");
          contName = _replaceAll;
        } else {
          int _length = linkName.length();
          int _plus = (index + _length);
          String _substring = name.substring(_plus);
          contName = _substring;
        }
        boolean _equalsIgnoreCase = contName.equalsIgnoreCase(containerName);
        if (_equalsIgnoreCase) {
          return true;
        }
      }
    }
    return false;
  }
  
  /**
   * Stop a Docker machine.
   */
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
  public void suspend_execute(final SuspendMethod method) {
    String _name = this.compute.getName();
    String _plus = ("EXECUTE COMMAND: docker machine suspend " + _name);
    MachineManager.LOGGER.info(_plus);
  }
}
