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
import com.google.common.base.Preconditions;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.Contains;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.Network;
import org.occiware.clouddesigner.occi.docker.NetworkLink;
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
    final Runtime runtime = Runtime.getRuntime();
    final StringBuilder command = new StringBuilder();
    String _name = this.compute.getName();
    Preconditions.<String>checkNotNull(_name, "Machine name is null");
    String _driverName = this.getDriverName();
    Preconditions.<String>checkNotNull(_driverName, "Driver name is null");
    final StringBuilder parameter = new StringBuilder();
    Map<Container, Set<NetworkLink>> networks = this.detectNetworkLink();
    boolean _isSwarm = this.compute.isSwarm();
    if (_isSwarm) {
      parameter.append(" --swarm");
    }
    boolean _isSwarm_master = this.compute.isSwarm_master();
    if (_isSwarm_master) {
      parameter.append(" --swarm-master");
    }
    String _swarm_discovery = this.compute.getSwarm_discovery();
    boolean _isNotBlank = StringUtils.isNotBlank(_swarm_discovery);
    if (_isNotBlank) {
      String _swarm_discovery_1 = this.compute.getSwarm_discovery();
      String _plus = (" --swarm-discovery=\"" + _swarm_discovery_1);
      String _plus_1 = (_plus + "\"");
      parameter.append(_plus_1);
    }
    String _swarm_addr = this.compute.getSwarm_addr();
    boolean _isNotBlank_1 = StringUtils.isNotBlank(_swarm_addr);
    if (_isNotBlank_1) {
      String _swarm_addr_1 = this.compute.getSwarm_addr();
      String _plus_2 = (" --swarm-addr=\"" + _swarm_addr_1);
      String _plus_3 = (_plus_2 + "\"");
      parameter.append(_plus_3);
    }
    String _swarm_experimental = this.compute.getSwarm_experimental();
    boolean _isNotBlank_2 = StringUtils.isNotBlank(_swarm_experimental);
    if (_isNotBlank_2) {
      String _swarm_experimental_1 = this.compute.getSwarm_experimental();
      String _plus_4 = (" --swarm-experimental=\"" + _swarm_experimental_1);
      String _plus_5 = (_plus_4 + "\"");
      parameter.append(_plus_5);
    }
    String _swarm_host = this.compute.getSwarm_host();
    boolean _isNotBlank_3 = StringUtils.isNotBlank(_swarm_host);
    if (_isNotBlank_3) {
      String _swarm_host_1 = this.compute.getSwarm_host();
      String _plus_6 = (" --swarm-host=\"" + _swarm_host_1);
      String _plus_7 = (_plus_6 + "\"");
      parameter.append(_plus_7);
    }
    String _swarm_image = this.compute.getSwarm_image();
    boolean _isNotBlank_4 = StringUtils.isNotBlank(_swarm_image);
    if (_isNotBlank_4) {
      String _swarm_image_1 = this.compute.getSwarm_image();
      String _plus_8 = (" --swarm-image=\"" + _swarm_image_1);
      String _plus_9 = (_plus_8 + "\"");
      parameter.append(_plus_9);
    }
    String _swarm_opt = this.compute.getSwarm_opt();
    boolean _isNotBlank_5 = StringUtils.isNotBlank(_swarm_opt);
    if (_isNotBlank_5) {
      String _swarm_opt_1 = this.compute.getSwarm_opt();
      String[] tab_swarm_opt = _swarm_opt_1.split(",");
      for (final String opt : tab_swarm_opt) {
        parameter.append(((" --swarm-opt=\"" + opt) + "\""));
      }
    }
    String _engine_env = this.compute.getEngine_env();
    boolean _isNotBlank_6 = StringUtils.isNotBlank(_engine_env);
    if (_isNotBlank_6) {
      String _engine_env_1 = this.compute.getEngine_env();
      String _plus_10 = (" --engine-env=\"" + _engine_env_1);
      String _plus_11 = (_plus_10 + "\"");
      parameter.append(_plus_11);
    }
    String _engine_insecure_registry = this.compute.getEngine_insecure_registry();
    boolean _isNotBlank_7 = StringUtils.isNotBlank(_engine_insecure_registry);
    if (_isNotBlank_7) {
      String _engine_insecure_registry_1 = this.compute.getEngine_insecure_registry();
      String _plus_12 = (" --engine-insecure-registry=\"" + _engine_insecure_registry_1);
      String _plus_13 = (_plus_12 + "\"");
      parameter.append(_plus_13);
    }
    String _engine_install_url = this.compute.getEngine_install_url();
    boolean _isNotBlank_8 = StringUtils.isNotBlank(_engine_install_url);
    if (_isNotBlank_8) {
      String _engine_install_url_1 = this.compute.getEngine_install_url();
      String _plus_14 = (" --engine-install-url=\"" + _engine_install_url_1);
      String _plus_15 = (_plus_14 + "\"");
      parameter.append(_plus_15);
    }
    String _engine_label = this.compute.getEngine_label();
    boolean _isNotBlank_9 = StringUtils.isNotBlank(_engine_label);
    if (_isNotBlank_9) {
      String _engine_label_1 = this.compute.getEngine_label();
      String _plus_16 = (" --engine-label=\"" + _engine_label_1);
      String _plus_17 = (_plus_16 + "\"");
      parameter.append(_plus_17);
    }
    String _engine_opt = this.compute.getEngine_opt();
    boolean _isNotBlank_10 = StringUtils.isNotBlank(_engine_opt);
    if (_isNotBlank_10) {
      String _engine_opt_1 = this.compute.getEngine_opt();
      String[] tab_engine_opt = _engine_opt_1.split(",");
      for (final String opt_1 : tab_engine_opt) {
        parameter.append(((" --engine-opt=\"" + opt_1) + "\""));
      }
    }
    String dockerMachineCMD = String.format("%s -D create --driver ", this.dockerMachineCmd);
    StringBuilder _append = command.append(dockerMachineCMD);
    String _driverName_1 = this.getDriverName();
    _append.append(_driverName_1);
    this.appendDriverParameters(command);
    StringBuilder _append_1 = command.append(" ");
    _append_1.append(parameter);
    StringBuilder _append_2 = command.append(" ");
    String _name_1 = this.compute.getName();
    _append_2.append(_name_1);
    String _string = command.toString();
    MachineManager.LOGGER.info("CMD : #{}", _string);
    final Map<String, String> activeHosts = DockerUtil.getActiveHosts();
    final Map<String, String> hosts = DockerUtil.getHosts();
    String _name_2 = this.compute.getName();
    boolean _containsKey = hosts.containsKey(_name_2);
    boolean _not = (!_containsKey);
    if (_not) {
      String _string_1 = command.toString();
      ProcessManager.runCommand(_string_1, runtime, true);
    } else {
      String _name_3 = this.compute.getName();
      boolean _containsKey_1 = activeHosts.containsKey(_name_3);
      boolean _not_1 = (!_containsKey_1);
      if (_not_1) {
        String _name_4 = this.compute.getName();
        DockerMachineManager.startCmd(runtime, _name_4);
        String _name_5 = this.compute.getName();
        DockerMachineManager.regenerateCert(runtime, _name_5);
      }
    }
    this.createNetwork(networks);
    this.connectToNetwork(this.compute, networks);
  }
  
  @Override
  public void startAll_execute() {
    final Runtime runtime = Runtime.getRuntime();
    final StringBuilder command = new StringBuilder();
    String _name = this.compute.getName();
    Preconditions.<String>checkNotNull(_name, "Machine name is null");
    String _driverName = this.getDriverName();
    Preconditions.<String>checkNotNull(_driverName, "Driver name is null");
    final StringBuilder parameter = new StringBuilder();
    Map<Container, Set<NetworkLink>> networks = this.detectNetworkLink();
    boolean _isSwarm = this.compute.isSwarm();
    if (_isSwarm) {
      parameter.append(" --swarm");
    }
    boolean _isSwarm_master = this.compute.isSwarm_master();
    if (_isSwarm_master) {
      parameter.append(" --swarm-master");
    }
    String _swarm_discovery = this.compute.getSwarm_discovery();
    boolean _isNotBlank = StringUtils.isNotBlank(_swarm_discovery);
    if (_isNotBlank) {
      String _swarm_discovery_1 = this.compute.getSwarm_discovery();
      String _plus = (" --swarm-discovery=\"" + _swarm_discovery_1);
      String _plus_1 = (_plus + "\"");
      parameter.append(_plus_1);
    }
    String _swarm_addr = this.compute.getSwarm_addr();
    boolean _isNotBlank_1 = StringUtils.isNotBlank(_swarm_addr);
    if (_isNotBlank_1) {
      String _swarm_addr_1 = this.compute.getSwarm_addr();
      String _plus_2 = (" --swarm-addr=\"" + _swarm_addr_1);
      String _plus_3 = (_plus_2 + "\"");
      parameter.append(_plus_3);
    }
    String _swarm_experimental = this.compute.getSwarm_experimental();
    boolean _isNotBlank_2 = StringUtils.isNotBlank(_swarm_experimental);
    if (_isNotBlank_2) {
      String _swarm_experimental_1 = this.compute.getSwarm_experimental();
      String _plus_4 = (" --swarm-experimental=\"" + _swarm_experimental_1);
      String _plus_5 = (_plus_4 + "\"");
      parameter.append(_plus_5);
    }
    String _swarm_host = this.compute.getSwarm_host();
    boolean _isNotBlank_3 = StringUtils.isNotBlank(_swarm_host);
    if (_isNotBlank_3) {
      String _swarm_host_1 = this.compute.getSwarm_host();
      String _plus_6 = (" --swarm-host=\"" + _swarm_host_1);
      String _plus_7 = (_plus_6 + "\"");
      parameter.append(_plus_7);
    }
    String _swarm_image = this.compute.getSwarm_image();
    boolean _isNotBlank_4 = StringUtils.isNotBlank(_swarm_image);
    if (_isNotBlank_4) {
      String _swarm_image_1 = this.compute.getSwarm_image();
      String _plus_8 = (" --swarm-image=\"" + _swarm_image_1);
      String _plus_9 = (_plus_8 + "\"");
      parameter.append(_plus_9);
    }
    String _swarm_opt = this.compute.getSwarm_opt();
    boolean _isNotBlank_5 = StringUtils.isNotBlank(_swarm_opt);
    if (_isNotBlank_5) {
      String _swarm_opt_1 = this.compute.getSwarm_opt();
      String[] tab_swarm_opt = _swarm_opt_1.split(",");
      for (final String opt : tab_swarm_opt) {
        parameter.append(((" --swarm-opt=\"" + opt) + "\""));
      }
    }
    String _engine_env = this.compute.getEngine_env();
    boolean _isNotBlank_6 = StringUtils.isNotBlank(_engine_env);
    if (_isNotBlank_6) {
      String _engine_env_1 = this.compute.getEngine_env();
      String _plus_10 = (" --engine-env=\"" + _engine_env_1);
      String _plus_11 = (_plus_10 + "\"");
      parameter.append(_plus_11);
    }
    String _engine_insecure_registry = this.compute.getEngine_insecure_registry();
    boolean _isNotBlank_7 = StringUtils.isNotBlank(_engine_insecure_registry);
    if (_isNotBlank_7) {
      String _engine_insecure_registry_1 = this.compute.getEngine_insecure_registry();
      String _plus_12 = (" --engine-insecure-registry=\"" + _engine_insecure_registry_1);
      String _plus_13 = (_plus_12 + "\"");
      parameter.append(_plus_13);
    }
    String _engine_install_url = this.compute.getEngine_install_url();
    boolean _isNotBlank_8 = StringUtils.isNotBlank(_engine_install_url);
    if (_isNotBlank_8) {
      String _engine_install_url_1 = this.compute.getEngine_install_url();
      String _plus_14 = (" --engine-install-url=\"" + _engine_install_url_1);
      String _plus_15 = (_plus_14 + "\"");
      parameter.append(_plus_15);
    }
    String _engine_label = this.compute.getEngine_label();
    boolean _isNotBlank_9 = StringUtils.isNotBlank(_engine_label);
    if (_isNotBlank_9) {
      String _engine_label_1 = this.compute.getEngine_label();
      String _plus_16 = (" --engine-label=\"" + _engine_label_1);
      String _plus_17 = (_plus_16 + "\"");
      parameter.append(_plus_17);
    }
    String _engine_opt = this.compute.getEngine_opt();
    boolean _isNotBlank_10 = StringUtils.isNotBlank(_engine_opt);
    if (_isNotBlank_10) {
      String _engine_opt_1 = this.compute.getEngine_opt();
      String[] tab_engine_opt = _engine_opt_1.split(",");
      for (final String opt_1 : tab_engine_opt) {
        parameter.append(((" --engine-opt=\"" + opt_1) + "\""));
      }
    }
    String dockerMachineCMD = String.format("%s -D create --driver ", this.dockerMachineCmd);
    StringBuilder _append = command.append(dockerMachineCMD);
    String _driverName_1 = this.getDriverName();
    _append.append(_driverName_1);
    this.appendDriverParameters(command);
    StringBuilder _append_1 = command.append(" ");
    _append_1.append(parameter);
    StringBuilder _append_2 = command.append(" ");
    String _name_1 = this.compute.getName();
    _append_2.append(_name_1);
    final Map<String, String> activeHosts = DockerUtil.getActiveHosts();
    final Map<String, String> hosts = DockerUtil.getHosts();
    String _name_2 = this.compute.getName();
    boolean _containsKey = hosts.containsKey(_name_2);
    boolean _not = (!_containsKey);
    if (_not) {
      String _string = command.toString();
      ProcessManager.runCommand(_string, runtime, true);
      this.compute.setState(ComputeStatus.ACTIVE);
      this.createNetwork(networks);
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
        String _name_5 = this.compute.getName();
        DockerMachineManager.regenerateCert(runtime, _name_5);
        this.compute.setState(ComputeStatus.ACTIVE);
        this.createNetwork(networks);
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
                    String _plus_18 = ("Creating the container: " + _name_7);
                    MachineManager.LOGGER.info(_plus_18);
                    con.createContainer(this.machine);
                    MachineManager.LOGGER.info("The container is created");
                    con.start();
                  } else {
                    String _name_8 = con.getName();
                    String _plus_19 = ("Trying to start container: " + _name_8);
                    MachineManager.LOGGER.info(_plus_19);
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
                  String _plus_18 = ("Trying to start container: " + _name_7);
                  MachineManager.LOGGER.info(_plus_18);
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
                    String _plus_18 = ("Trying to start container: " + _name_7);
                    MachineManager.LOGGER.info(_plus_18);
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
                  String _plus_18 = ("Trying to start container: " + _name_7);
                  MachineManager.LOGGER.info(_plus_18);
                  con.start();
                  MachineManager.LOGGER.info("Started ... ");
                } else {
                  String _name_8 = con.getName();
                  String _plus_19 = ("Trying to start container: " + _name_8);
                  MachineManager.LOGGER.info(_plus_19);
                  MachineManager.LOGGER.info("Started ... ");
                  con.start();
                }
              }
            }
          }
        }
      }
    }
    this.connectToNetwork(this.compute, networks);
    String _string_1 = command.toString();
    String _plus_18 = ("EXECUTE COMMAND: " + _string_1);
    MachineManager.LOGGER.info(_plus_18);
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
    boolean _isEmpty = networks.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      Set<String> createdNetworks = CollectionLiterals.<String>newHashSet();
      Set<Map.Entry<Container, Set<NetworkLink>>> _entrySet = networks.entrySet();
      for (final Map.Entry<Container, Set<NetworkLink>> entry : _entrySet) {
        Set<NetworkLink> _value = entry.getValue();
        for (final NetworkLink net : _value) {
          {
            Resource _target = net.getTarget();
            Network tmpNetwork = ((Network) _target);
            String _name = tmpNetwork.getName();
            boolean _contains = createdNetworks.contains(_name);
            boolean _not_1 = (!_contains);
            if (_not_1) {
              String _name_1 = tmpNetwork.getName();
              createdNetworks.add(_name_1);
              String networkId = this.dockerContainerManager.createNetwork(this.compute, tmpNetwork);
              tmpNetwork.setNetworkId(networkId);
              String _name_2 = tmpNetwork.getName();
              String _name_3 = this.compute.getName();
              MachineManager.LOGGER.info("Network name=#{} was created inside ---> machine #{}", _name_2, _name_3);
              tmpNetwork.setState(NetworkStatus.ACTIVE);
            }
          }
        }
      }
    }
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
  
  /**
   * Get all containers deployed inside a machine.
   */
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
