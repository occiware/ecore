/**
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe MERLE
 * 	- Fawaz PARAISO
 */
package org.occiware.clouddesigner.occi.docker.connector;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Resource;
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
  @Override
  public void start_execute() {
    final Runtime runtime = Runtime.getRuntime();
    final StringBuilder command = new StringBuilder();
    String _name = this.compute.getName();
    Preconditions.<String>checkNotNull(_name, "Machine name is null");
    String _driverName = this.getDriverName();
    Preconditions.<String>checkNotNull(_driverName, "Driver name is null");
    StringBuilder _append = command.append("docker-machine -D create --driver ");
    String _driverName_1 = this.getDriverName();
    _append.append(_driverName_1);
    boolean _or = false;
    String _driverName_2 = this.getDriverName();
    boolean _equalsIgnoreCase = _driverName_2.equalsIgnoreCase("virtualbox");
    if (_equalsIgnoreCase) {
      _or = true;
    } else {
      String _driverName_3 = this.getDriverName();
      boolean _equalsIgnoreCase_1 = _driverName_3.equalsIgnoreCase("vmwarefusion");
      _or = _equalsIgnoreCase_1;
    }
    if (_or) {
      StringBuilder _append_1 = command.append(" ");
      String _name_1 = this.compute.getName();
      _append_1.append(_name_1);
      this.appendDriverParameters(command);
    } else {
      this.appendDriverParameters(command);
      StringBuilder _append_2 = command.append(" ");
      String _name_2 = this.compute.getName();
      _append_2.append(_name_2);
    }
    String _string = command.toString();
    MachineManager.LOGGER.info("CMD : #{}", _string);
    final Map<String, String> activeHosts = DockerUtil.getActiveHosts();
    final Map<String, String> hosts = DockerUtil.getHosts();
    String _name_3 = this.compute.getName();
    boolean _containsKey = hosts.containsKey(_name_3);
    boolean _not = (!_containsKey);
    if (_not) {
      String _string_1 = command.toString();
      ProcessManager.runCommand(_string_1, runtime, true);
    } else {
      String _name_4 = this.compute.getName();
      boolean _containsKey_1 = activeHosts.containsKey(_name_4);
      boolean _not_1 = (!_containsKey_1);
      if (_not_1) {
        String _name_5 = this.compute.getName();
        DockerMachineManager.startCmd(runtime, _name_5);
      }
    }
  }
  
  @Override
  public void startAll_execute() {
    final Runtime runtime = Runtime.getRuntime();
    final StringBuilder command = new StringBuilder();
    String _name = this.compute.getName();
    Preconditions.<String>checkNotNull(_name, "Machine name is null");
    String _driverName = this.getDriverName();
    Preconditions.<String>checkNotNull(_driverName, "Driver name is null");
    StringBuilder _append = command.append("docker-machine -D create --driver ");
    String _driverName_1 = this.getDriverName();
    _append.append(_driverName_1);
    boolean _or = false;
    String _driverName_2 = this.getDriverName();
    boolean _equalsIgnoreCase = _driverName_2.equalsIgnoreCase("virtualbox");
    if (_equalsIgnoreCase) {
      _or = true;
    } else {
      String _driverName_3 = this.getDriverName();
      boolean _equalsIgnoreCase_1 = _driverName_3.equalsIgnoreCase("vmwarefusion");
      _or = _equalsIgnoreCase_1;
    }
    if (_or) {
      StringBuilder _append_1 = command.append(" ");
      String _name_1 = this.compute.getName();
      _append_1.append(_name_1);
      this.appendDriverParameters(command);
    } else {
      this.appendDriverParameters(command);
      StringBuilder _append_2 = command.append(" ");
      String _name_2 = this.compute.getName();
      _append_2.append(_name_2);
    }
    final Map<String, String> activeHosts = DockerUtil.getActiveHosts();
    final Map<String, String> hosts = DockerUtil.getHosts();
    String _name_3 = this.compute.getName();
    boolean _containsKey = hosts.containsKey(_name_3);
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
              final Contains contains = ((Contains) link);
              Resource _target = contains.getTarget();
              if ((_target instanceof Container)) {
                Resource _target_1 = contains.getTarget();
                final ExecutableContainer con = ((ExecutableContainer) _target_1);
                String _name_4 = con.getName();
                boolean _containerIsDeployed = this.containerIsDeployed(_name_4, this.machine);
                boolean _not_2 = (!_containerIsDeployed);
                if (_not_2) {
                  con.createContainer(this.machine);
                  con.start();
                } else {
                  con.start();
                }
              }
            }
          }
        } else {
          final Multimap<String, String> dependencies = this.containerDependency;
          List<Container> _deploymentOrder = this.deploymentOrder();
          for (final Container c : _deploymentOrder) {
            {
              final ExecutableContainer con = ((ExecutableContainer) c);
              String _name_4 = con.getName();
              boolean _containerIsDeployed = this.containerIsDeployed(_name_4, this.compute);
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
      String _name_4 = this.compute.getName();
      boolean _containsKey_1 = activeHosts.containsKey(_name_4);
      boolean _not_2 = (!_containsKey_1);
      if (_not_2) {
        String _name_5 = this.compute.getName();
        DockerMachineManager.startCmd(runtime, _name_5);
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
                final Contains contains = ((Contains) link_1);
                Resource _target = contains.getTarget();
                if ((_target instanceof Container)) {
                  Resource _target_1 = contains.getTarget();
                  final ExecutableContainer con = ((ExecutableContainer) _target_1);
                  String _name_6 = con.getName();
                  boolean _containerIsDeployed = this.containerIsDeployed(_name_6, this.machine);
                  boolean _not_4 = (!_containerIsDeployed);
                  if (_not_4) {
                    String _name_7 = con.getName();
                    String _plus = ("Creating the container: " + _name_7);
                    MachineManager.LOGGER.info(_plus);
                    con.createContainer(this.machine);
                    MachineManager.LOGGER.info("The container is created");
                    con.start();
                  } else {
                    String _name_8 = con.getName();
                    String _plus_1 = ("Trying to start container: " + _name_8);
                    MachineManager.LOGGER.info(_plus_1);
                    con.start();
                    MachineManager.LOGGER.info("Started ...");
                  }
                }
              }
            }
          } else {
            List<Container> _deploymentOrder_1 = this.deploymentOrder();
            for (final Container c_1 : _deploymentOrder_1) {
              {
                final ExecutableContainer con = ((ExecutableContainer) c_1);
                String _name_6 = con.getName();
                boolean _containerIsDeployed = this.containerIsDeployed(_name_6, this.compute);
                boolean _not_4 = (!_containerIsDeployed);
                if (_not_4) {
                  con.createContainer(this.machine, this.containerDependency);
                  con.start();
                } else {
                  String _name_7 = con.getName();
                  String _plus = ("Trying to start container: " + _name_7);
                  MachineManager.LOGGER.info(_plus);
                  con.start();
                  MachineManager.LOGGER.info("Started ... ");
                }
              }
            }
          }
        }
      } else {
        EList<Link> _links_4 = this.compute.getLinks();
        int _size_2 = _links_4.size();
        boolean _greaterThan_2 = (_size_2 > 0);
        if (_greaterThan_2) {
          boolean _linkFound_2 = this.linkFound();
          boolean _not_4 = (!_linkFound_2);
          if (_not_4) {
            EList<Link> _links_5 = this.compute.getLinks();
            for (final Link link_2 : _links_5) {
              {
                final Contains contains = ((Contains) link_2);
                Resource _target = contains.getTarget();
                if ((_target instanceof Container)) {
                  Resource _target_1 = contains.getTarget();
                  final ExecutableContainer con = ((ExecutableContainer) _target_1);
                  String _name_6 = con.getName();
                  boolean _containerIsDeployed = this.containerIsDeployed(_name_6, this.machine);
                  boolean _not_5 = (!_containerIsDeployed);
                  if (_not_5) {
                    con.createContainer(this.machine);
                    con.start();
                  } else {
                    String _name_7 = con.getName();
                    String _plus = ("Trying to start container: " + _name_7);
                    MachineManager.LOGGER.info(_plus);
                    con.start();
                    MachineManager.LOGGER.info("Started ...");
                  }
                }
              }
            }
          } else {
            List<Container> _deploymentOrder_2 = this.deploymentOrder();
            for (final Container c_2 : _deploymentOrder_2) {
              {
                final ExecutableContainer con = ((ExecutableContainer) c_2);
                String _name_6 = con.getName();
                boolean _containerIsDeployed = this.containerIsDeployed(_name_6, this.compute);
                boolean _not_5 = (!_containerIsDeployed);
                if (_not_5) {
                  con.createContainer(this.machine, this.containerDependency);
                  String _name_7 = con.getName();
                  String _plus = ("Trying to start container: " + _name_7);
                  MachineManager.LOGGER.info(_plus);
                  con.start();
                  MachineManager.LOGGER.info("Started ... ");
                } else {
                  String _name_8 = con.getName();
                  String _plus_1 = ("Trying to start container: " + _name_8);
                  MachineManager.LOGGER.info(_plus_1);
                  MachineManager.LOGGER.info("Started ... ");
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
    final Machine machine = instanceMH.getModel(_name, _get, false);
    ComputeStatus _state = machine.getState();
    this.compute.setState(_state);
    ComputeStatus _state_1 = this.compute.getState();
    String _string = _state_1.toString();
    boolean _equalsIgnoreCase = _string.equalsIgnoreCase("active");
    if (_equalsIgnoreCase) {
      EList<Link> _links = this.compute.getLinks();
      int _size = _links.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        boolean _linkFound = this.linkFound();
        boolean _not = (!_linkFound);
        if (_not) {
          ArrayList<String> containersInModel = new ArrayList<String>();
          EList<Link> _links_1 = this.compute.getLinks();
          for (final Link link : _links_1) {
            {
              final Contains contains = ((Contains) link);
              Resource _target = contains.getTarget();
              if ((_target instanceof Container)) {
                Resource _target_1 = contains.getTarget();
                final ExecutableContainer con = ((ExecutableContainer) _target_1);
                String _name_2 = con.getName();
                containersInModel.add(_name_2);
                String _name_3 = con.getName();
                boolean _containerIsDeployed = this.containerIsDeployed(_name_3, this.machine);
                boolean _not_1 = (!_containerIsDeployed);
                if (_not_1) {
                  String _name_4 = con.getName();
                  String _plus = ("Creating the container: " + _name_4);
                  MachineManager.LOGGER.info(_plus);
                  con.createContainer(this.machine);
                  MachineManager.LOGGER.info("The container is created");
                }
              }
            }
          }
          String _name_2 = this.compute.getName();
          List<String> containersToRemove = this.containerInReal(_name_2);
          boolean _isEmpty = containersToRemove.isEmpty();
          boolean _not_1 = (!_isEmpty);
          if (_not_1) {
            containersToRemove.removeAll(containersInModel);
            for (final String id : containersToRemove) {
              String _name_3 = this.compute.getName();
              instance.removeContainer(_name_3, id);
            }
          }
        } else {
          ArrayList<String> containersInModel_1 = new ArrayList<String>();
          List<Container> _deploymentOrder = this.deploymentOrder();
          for (final Container c : _deploymentOrder) {
            {
              final ExecutableContainer con = ((ExecutableContainer) c);
              String _name_4 = c.getName();
              containersInModel_1.add(_name_4);
              String _name_5 = con.getName();
              boolean _containerIsDeployed = this.containerIsDeployed(_name_5, this.compute);
              boolean _not_2 = (!_containerIsDeployed);
              if (_not_2) {
                con.createContainer(this.machine, this.containerDependency);
              }
            }
          }
          String _name_4 = this.compute.getName();
          List<String> containersToRemove_1 = this.containerInReal(_name_4);
          boolean _isEmpty_1 = containersToRemove_1.isEmpty();
          boolean _not_2 = (!_isEmpty_1);
          if (_not_2) {
            containersToRemove_1.removeAll(containersInModel_1);
            for (final String id_1 : containersToRemove_1) {
              String _name_5 = this.compute.getName();
              instance.removeContainer(_name_5, id_1);
            }
          }
        }
      }
    } else {
      EList<Link> _links_2 = this.compute.getLinks();
      int _size_1 = _links_2.size();
      boolean _greaterThan_1 = (_size_1 > 0);
      if (_greaterThan_1) {
        EList<Link> _links_3 = this.compute.getLinks();
        final Procedure1<Link> _function = new Procedure1<Link>() {
          @Override
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
      @Override
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
      @Override
      public void apply(final Link elt) {
        Resource _target = elt.getTarget();
        containers.add(((Container) _target));
      }
    };
    IterableExtensions.<Link>forEach(_links, _function);
    Set<Object> _singleton = Collections.<Object>singleton(null);
    containers.removeAll(_singleton);
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
    String _name = machine.getName();
    final List<com.github.dockerjava.api.model.Container> listContainers = this.dockerContainerManager.listContainer(_name);
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
  
  public List<String> containerInReal(final String machineName) {
    ArrayList<String> containers = new ArrayList<String>();
    final List<com.github.dockerjava.api.model.Container> listContainers = this.dockerContainerManager.listContainer(machineName);
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
        containers.add(contName);
      }
    }
    return containers;
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
