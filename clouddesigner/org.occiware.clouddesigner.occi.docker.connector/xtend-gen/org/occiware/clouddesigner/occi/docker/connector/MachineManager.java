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
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
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

/**
 * This class implements an abstract Docker machine manager.
 */
@SuppressWarnings("all")
public abstract class MachineManager extends ComputeStateMachine<Machine> {
  protected Multimap<String, String> containerDependency = ArrayListMultimap.<String, String>create();
  
  protected Machine machine;
  
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
          final Procedure1<Link> _function = new Procedure1<Link>() {
            public void apply(final Link elt) {
              Resource _target = elt.getTarget();
              ((ExecutableContainer) _target).createContainer(MachineManager.this.machine, MachineManager.this.containerDependency);
            }
          };
          IterableExtensions.<Link>forEach(_links_1, _function);
        } else {
          final Multimap<String, String> dependencies = this.containerDependency;
          List<Container> _deploymentOrder = this.deploymentOrder();
          final Procedure1<Container> _function_1 = new Procedure1<Container>() {
            public void apply(final Container c) {
              ((ExecutableContainer) c).createContainer(MachineManager.this.machine, dependencies);
            }
          };
          IterableExtensions.<Container>forEach(_deploymentOrder, _function_1);
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
            final Procedure1<Link> _function_2 = new Procedure1<Link>() {
              public void apply(final Link elt) {
                Resource _target = elt.getTarget();
                ((ExecutableContainer) _target).createContainer(MachineManager.this.compute, MachineManager.this.containerDependency);
              }
            };
            IterableExtensions.<Link>forEach(_links_3, _function_2);
          } else {
            List<Container> _deploymentOrder_1 = this.deploymentOrder();
            final Procedure1<Container> _function_3 = new Procedure1<Container>() {
              public void apply(final Container c) {
                ((ExecutableContainer) c).createContainer(MachineManager.this.compute, MachineManager.this.containerDependency);
              }
            };
            IterableExtensions.<Container>forEach(_deploymentOrder_1, _function_3);
          }
        }
      }
    }
    String _string_1 = command.toString();
    String _plus = ("EXECUTE COMMAND: " + _string_1);
    InputOutput.<String>println(_plus);
  }
  
  public void synchronize() {
    final Map<String, String> hosts = DockerUtil.getHosts();
    final ModelHandler instanceMH = new ModelHandler();
    final DockerContainerManager instance = new DockerContainerManager();
    String _name = this.compute.getName();
    String _name_1 = this.compute.getName();
    String _get = hosts.get(_name_1);
    final Machine machine = instanceMH.getModel(_name, _get);
    ComputeStatus _state = machine.getState();
    this.compute.setState(_state);
    ComputeStatus _state_1 = this.compute.getState();
    String _string = _state_1.toString();
    boolean _equalsIgnoreCase = _string.equalsIgnoreCase("active");
    if (_equalsIgnoreCase) {
      final List<com.github.dockerjava.api.model.Container> contains = instance.listContainer(machine);
      boolean _notEquals = (!Objects.equal(contains, null));
      if (_notEquals) {
        final List<Container> modelContainers = instanceMH.buildContainer(this.compute, contains);
        for (final Container container : modelContainers) {
          ((ExecutableContainer) container).linkContainerToMachine(this.compute);
        }
        EList<Link> _links = this.compute.getLinks();
        boolean _notEquals_1 = (!Objects.equal(_links, null));
        if (_notEquals_1) {
          EList<Link> _links_1 = this.compute.getLinks();
          for (final Link link : _links_1) {
            {
              EObject _eContainer = this.compute.eContainer();
              org.eclipse.emf.ecore.resource.Resource _eResource = _eContainer.eResource();
              TreeIterator<EObject> _allContents = _eResource.getAllContents();
              List<EObject> _list = IteratorExtensions.<EObject>toList(_allContents);
              _list.add(link);
              if ((link instanceof Link)) {
                final Contains c = ((Contains) link);
                Resource _target = c.getTarget();
                if ((_target instanceof Container)) {
                  EObject _eContainer_1 = this.compute.eContainer();
                  org.eclipse.emf.ecore.resource.Resource _eResource_1 = _eContainer_1.eResource();
                  TreeIterator<EObject> _allContents_1 = _eResource_1.getAllContents();
                  List<EObject> _list_1 = IteratorExtensions.<EObject>toList(_allContents_1);
                  Resource _target_1 = c.getTarget();
                  _list_1.add(((Container) _target_1));
                }
              }
            }
          }
        }
      }
    } else {
      EList<Link> _links_2 = this.compute.getLinks();
      int _size = _links_2.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        EList<Link> _links_3 = this.compute.getLinks();
        final Procedure1<Link> _function = new Procedure1<Link>() {
          public void apply(final Link elt) {
            Resource _target = elt.getTarget();
            ((ExecutableContainer) _target).stop(StopMethod.GRACEFUL);
          }
        };
        IterableExtensions.<Link>forEach(_links_3, _function);
      }
    }
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
        InputOutput.<String>println(("--->" + c.value));
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
        InputOutput.<String>println(_name);
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
    InputOutput.<String>println(_plus);
  }
  
  /**
   * Restart a Docker machine.
   */
  public void restart_execute(final RestartMethod method) {
    String _name = this.compute.getName();
    String _plus = ("EXECUTE COMMAND: docker machine restart " + _name);
    InputOutput.<String>println(_plus);
    this.stop_execute(StopMethod.GRACEFUL);
    this.start_execute();
  }
  
  /**
   * Suspend a Docker machine.
   */
  public void suspend_execute(final SuspendMethod method) {
    String _name = this.compute.getName();
    String _plus = ("EXECUTE COMMAND: docker machine suspend " + _name);
    InputOutput.<String>println(_plus);
  }
}
