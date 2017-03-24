/**
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	- Fawaz PARAISO
 */
package org.occiware.clouddesigner.occi.docker.connector.dockerjava;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.ConnectToNetworkCmd;
import com.github.dockerjava.api.command.CreateContainerCmd;
import com.github.dockerjava.api.command.CreateContainerResponse;
import com.github.dockerjava.api.command.CreateNetworkCmd;
import com.github.dockerjava.api.command.CreateNetworkResponse;
import com.github.dockerjava.api.command.EventsCmd;
import com.github.dockerjava.api.command.InspectContainerCmd;
import com.github.dockerjava.api.command.InspectContainerResponse;
import com.github.dockerjava.api.command.InspectNetworkCmd;
import com.github.dockerjava.api.command.ListContainersCmd;
import com.github.dockerjava.api.command.PullImageCmd;
import com.github.dockerjava.api.command.RemoveContainerCmd;
import com.github.dockerjava.api.command.RenameContainerCmd;
import com.github.dockerjava.api.command.StartContainerCmd;
import com.github.dockerjava.api.command.StatsCmd;
import com.github.dockerjava.api.command.StopContainerCmd;
import com.github.dockerjava.api.command.WaitContainerCmd;
import com.github.dockerjava.api.exception.InternalServerErrorException;
import com.github.dockerjava.api.model.Bind;
import com.github.dockerjava.api.model.ExposedPort;
import com.github.dockerjava.api.model.Link;
import com.github.dockerjava.api.model.LxcConf;
import com.github.dockerjava.api.model.Ports;
import com.github.dockerjava.api.model.RestartPolicy;
import com.github.dockerjava.api.model.Volume;
import com.github.dockerjava.api.model.VolumesFrom;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientConfig;
import com.github.dockerjava.core.command.PullImageResultCallback;
import com.github.dockerjava.core.command.WaitContainerResultCallback;
import com.google.common.base.Objects;
import com.google.common.collect.Multimap;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.Network;
import org.occiware.clouddesigner.occi.docker.NetworkLink;
import org.occiware.clouddesigner.occi.docker.Volumesfrom;
import org.occiware.clouddesigner.occi.docker.connector.EventCallBack;
import org.occiware.clouddesigner.occi.docker.connector.StatsCallback;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerMachineManager;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerConfig;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil;
import org.occiware.clouddesigner.occi.docker.preference.preferences.PreferenceValues;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class DockerContainerManager {
  private static DockerClient dockerClient = null;
  
  private static String currentMachine = null;
  
  private Map<String, List<String>> images = new HashMap<String, List<String>>();
  
  private static Logger LOGGER = LoggerFactory.getLogger(DockerContainerManager.class);
  
  private PreferenceValues properties = new PreferenceValues();
  
  public DockerContainerManager() {
  }
  
  public DockerContainerManager(final Machine machine) {
    String _name = machine.getName();
    DockerClient _setConfig = this.setConfig(_name, this.properties);
    DockerContainerManager.dockerClient = _setConfig;
  }
  
  public DockerContainerManager(final String machineName) {
    DockerClient _setConfig = this.setConfig(machineName, this.properties);
    DockerContainerManager.dockerClient = _setConfig;
  }
  
  public DockerContainerManager(final Machine machine, final EventCallBack event) {
    String _name = machine.getName();
    DockerClient _setConfig = this.setConfig(_name, this.properties);
    DockerContainerManager.dockerClient = _setConfig;
    EventsCmd _eventsCmd = DockerContainerManager.dockerClient.eventsCmd();
    _eventsCmd.<EventCallBack>exec(event);
  }
  
  public Map<DockerClient, CreateContainerResponse> createContainer(final Machine machine, final Container container) {
    boolean _equals = Objects.equal(DockerContainerManager.dockerClient, null);
    if (_equals) {
      String _name = machine.getName();
      DockerClient _setConfig = this.setConfig(_name, this.properties);
      DockerContainerManager.dockerClient = _setConfig;
    } else {
      String _name_1 = machine.getName();
      boolean _equalsIgnoreCase = DockerContainerManager.currentMachine.equalsIgnoreCase(_name_1);
      boolean _not = (!_equalsIgnoreCase);
      if (_not) {
        String _name_2 = machine.getName();
        DockerClient _setConfig_1 = this.setConfig(_name_2, this.properties);
        DockerContainerManager.dockerClient = _setConfig_1;
      }
    }
    Map<DockerClient, CreateContainerResponse> result = new LinkedHashMap<DockerClient, CreateContainerResponse>();
    final CreateContainerCmd create = this.containerFactory(container, DockerContainerManager.dockerClient);
    final CreateContainerResponse rcontainer = create.exec();
    String _id = rcontainer.getId();
    container.setContainerid(_id);
    String _containerid = container.getContainerid();
    DockerContainerManager.LOGGER.info("Created container: {}", _containerid);
    result.put(DockerContainerManager.dockerClient, rcontainer);
    return result;
  }
  
  public Map<DockerClient, CreateContainerResponse> createContainer(final Machine machine, final Container container, final Multimap<String, String> containerDependency) {
    boolean _equals = Objects.equal(DockerContainerManager.dockerClient, null);
    if (_equals) {
      String _name = machine.getName();
      DockerClient _setConfig = this.setConfig(_name, this.properties);
      DockerContainerManager.dockerClient = _setConfig;
    } else {
      String _name_1 = machine.getName();
      boolean _equalsIgnoreCase = DockerContainerManager.currentMachine.equalsIgnoreCase(_name_1);
      boolean _not = (!_equalsIgnoreCase);
      if (_not) {
        String _name_2 = machine.getName();
        DockerClient _setConfig_1 = this.setConfig(_name_2, this.properties);
        DockerContainerManager.dockerClient = _setConfig_1;
      }
    }
    Map<DockerClient, CreateContainerResponse> result = new LinkedHashMap<DockerClient, CreateContainerResponse>();
    final CreateContainerCmd create = this.containerFactory(container, DockerContainerManager.dockerClient, containerDependency);
    final CreateContainerResponse rcontainer = create.exec();
    String _id = rcontainer.getId();
    container.setContainerid(_id);
    String _containerid = container.getContainerid();
    DockerContainerManager.LOGGER.info("Created container: {}", _containerid);
    result.put(DockerContainerManager.dockerClient, rcontainer);
    return result;
  }
  
  public String createNetwork(final Machine machine, final Network network) {
    boolean _equals = Objects.equal(DockerContainerManager.dockerClient, null);
    if (_equals) {
      String _name = machine.getName();
      DockerClient _setConfig = this.setConfig(_name, this.properties);
      DockerContainerManager.dockerClient = _setConfig;
    } else {
      String _name_1 = machine.getName();
      boolean _equalsIgnoreCase = DockerContainerManager.currentMachine.equalsIgnoreCase(_name_1);
      boolean _not = (!_equalsIgnoreCase);
      if (_not) {
        String _name_2 = machine.getName();
        DockerClient _setConfig_1 = this.setConfig(_name_2, this.properties);
        DockerContainerManager.dockerClient = _setConfig_1;
      }
    }
    List<com.github.dockerjava.api.model.Network.Ipam.Config> ipamConfigs = CollectionLiterals.<com.github.dockerjava.api.model.Network.Ipam.Config>newArrayList();
    com.github.dockerjava.api.model.Network.Ipam ipam = null;
    String _subnet = network.getSubnet();
    boolean _isNotBlank = StringUtils.isNotBlank(_subnet);
    if (_isNotBlank) {
      com.github.dockerjava.api.model.Network.Ipam.Config _config = new com.github.dockerjava.api.model.Network.Ipam.Config();
      String _subnet_1 = network.getSubnet();
      com.github.dockerjava.api.model.Network.Ipam.Config _withSubnet = _config.withSubnet(_subnet_1);
      ipamConfigs.add(_withSubnet);
    } else {
      com.github.dockerjava.api.model.Network.Ipam.Config _config_1 = new com.github.dockerjava.api.model.Network.Ipam.Config();
      com.github.dockerjava.api.model.Network.Ipam.Config _withSubnet_1 = _config_1.withSubnet("10.67.79.0/24");
      ipamConfigs.add(_withSubnet_1);
    }
    String _gateway = network.getGateway();
    boolean _isNotBlank_1 = StringUtils.isNotBlank(_gateway);
    if (_isNotBlank_1) {
      com.github.dockerjava.api.model.Network.Ipam.Config _config_2 = new com.github.dockerjava.api.model.Network.Ipam.Config();
      String _gateway_1 = network.getGateway();
      com.github.dockerjava.api.model.Network.Ipam.Config _withGateway = _config_2.withGateway(_gateway_1);
      ipamConfigs.add(_withGateway);
    }
    String _ip_range = network.getIp_range();
    boolean _isNotBlank_2 = StringUtils.isNotBlank(_ip_range);
    if (_isNotBlank_2) {
      com.github.dockerjava.api.model.Network.Ipam.Config _config_3 = new com.github.dockerjava.api.model.Network.Ipam.Config();
      String _ip_range_1 = network.getIp_range();
      com.github.dockerjava.api.model.Network.Ipam.Config _withIpRange = _config_3.withIpRange(_ip_range_1);
      ipamConfigs.add(_withIpRange);
    }
    try {
      com.github.dockerjava.api.model.Network _network = new com.github.dockerjava.api.model.Network();
      com.github.dockerjava.api.model.Network.Ipam _ipam = _network.getIpam();
      com.github.dockerjava.api.model.Network.Ipam _withConfig = _ipam.withConfig(ipamConfigs);
      ipam = _withConfig;
    } catch (final Throwable _t) {
      if (_t instanceof InvocationTargetException) {
        final InvocationTargetException exception = (InvocationTargetException)_t;
        Throwable _cause = exception.getCause();
        String _message = _cause.getMessage();
        String _plus = (" InvocationTargetException: " + _message);
        DockerContainerManager.LOGGER.error(_plus);
      } else if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        String _message_1 = e.getMessage();
        String _plus_1 = ("Exception:" + _message_1);
        DockerContainerManager.LOGGER.error(_plus_1);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    CreateNetworkCmd _createNetworkCmd = DockerContainerManager.dockerClient.createNetworkCmd();
    CreateNetworkCmd createNetworkCmd = _createNetworkCmd.withIpam(ipam);
    String _name_3 = network.getName();
    boolean _isNotBlank_3 = StringUtils.isNotBlank(_name_3);
    if (_isNotBlank_3) {
      String _name_4 = network.getName();
      CreateNetworkCmd _withName = createNetworkCmd.withName(_name_4);
      createNetworkCmd = _withName;
    }
    String _driver = network.getDriver();
    boolean _isNotBlank_4 = StringUtils.isNotBlank(_driver);
    if (_isNotBlank_4) {
      String _driver_1 = network.getDriver();
      CreateNetworkCmd _withDriver = createNetworkCmd.withDriver(_driver_1);
      createNetworkCmd = _withDriver;
    }
    CreateNetworkResponse createNetworkResponse = null;
    com.github.dockerjava.api.model.Network updateNetwork = null;
    try {
      CreateNetworkCmd _withCheckDuplicate = createNetworkCmd.withCheckDuplicate(true);
      CreateNetworkResponse _exec = _withCheckDuplicate.exec();
      createNetworkResponse = _exec;
    } catch (final Throwable _t_1) {
      if (_t_1 instanceof InternalServerErrorException) {
        final InternalServerErrorException exception_1 = (InternalServerErrorException)_t_1;
        String _message_2 = exception_1.getMessage();
        DockerContainerManager.LOGGER.error(_message_2);
        createNetworkResponse = null;
        InspectNetworkCmd _inspectNetworkCmd = DockerContainerManager.dockerClient.inspectNetworkCmd();
        String _name_5 = network.getName();
        InspectNetworkCmd _withNetworkId = _inspectNetworkCmd.withNetworkId(_name_5);
        com.github.dockerjava.api.model.Network _exec_1 = _withNetworkId.exec();
        updateNetwork = _exec_1;
        updateNetwork.getId();
      } else {
        throw Exceptions.sneakyThrow(_t_1);
      }
    }
    boolean _notEquals = (!Objects.equal(createNetworkResponse, null));
    if (_notEquals) {
      return createNetworkResponse.getId();
    } else {
      return updateNetwork.getId();
    }
  }
  
  public void connectToNetwork(final Machine machine, final Map<Container, Set<NetworkLink>> networks) {
    boolean _equals = Objects.equal(DockerContainerManager.dockerClient, null);
    if (_equals) {
      String _name = machine.getName();
      DockerClient _setConfig = this.setConfig(_name, this.properties);
      DockerContainerManager.dockerClient = _setConfig;
    } else {
      String _name_1 = machine.getName();
      boolean _equalsIgnoreCase = DockerContainerManager.currentMachine.equalsIgnoreCase(_name_1);
      boolean _not = (!_equalsIgnoreCase);
      if (_not) {
        String _name_2 = machine.getName();
        DockerClient _setConfig_1 = this.setConfig(_name_2, this.properties);
        DockerContainerManager.dockerClient = _setConfig_1;
      }
    }
    int _size = networks.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      Set<Map.Entry<Container, Set<NetworkLink>>> _entrySet = networks.entrySet();
      for (final Map.Entry<Container, Set<NetworkLink>> entry : _entrySet) {
        Set<NetworkLink> _value = entry.getValue();
        for (final NetworkLink netLink : _value) {
          try {
            ConnectToNetworkCmd _connectToNetworkCmd = DockerContainerManager.dockerClient.connectToNetworkCmd();
            Resource _target = netLink.getTarget();
            String _networkId = ((Network) _target).getNetworkId();
            ConnectToNetworkCmd _withNetworkId = _connectToNetworkCmd.withNetworkId(_networkId);
            Container _key = entry.getKey();
            String _containerid = _key.getContainerid();
            ConnectToNetworkCmd _withContainerId = _withNetworkId.withContainerId(_containerid);
            _withContainerId.exec();
          } catch (final Throwable _t) {
            if (_t instanceof InternalServerErrorException) {
              final InternalServerErrorException exception = (InternalServerErrorException)_t;
              String _message = exception.getMessage();
              String _plus = ("InternalServerErrorException: " + _message);
              DockerContainerManager.LOGGER.error(_plus);
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        }
      }
    }
  }
  
  public void removeContainer(final String machineName, final String containerId) {
    boolean _equals = Objects.equal(DockerContainerManager.dockerClient, null);
    if (_equals) {
      DockerClient _setConfig = this.setConfig(machineName, this.properties);
      DockerContainerManager.dockerClient = _setConfig;
    } else {
      boolean _equalsIgnoreCase = DockerContainerManager.currentMachine.equalsIgnoreCase(machineName);
      boolean _not = (!_equalsIgnoreCase);
      if (_not) {
        DockerClient _setConfig_1 = this.setConfig(machineName, this.properties);
        DockerContainerManager.dockerClient = _setConfig_1;
      }
    }
    RemoveContainerCmd _removeContainerCmd = DockerContainerManager.dockerClient.removeContainerCmd(containerId);
    _removeContainerCmd.exec();
  }
  
  public CreateContainerCmd containerFactory(final Container container, final DockerClient dockerClient) {
    CreateContainerCmd create = null;
    String _image = container.getImage();
    boolean _isNotBlank = StringUtils.isNotBlank(_image);
    if (_isNotBlank) {
      String _image_1 = container.getImage();
      String _trim = _image_1.trim();
      CreateContainerCmd _createContainerCmd = dockerClient.createContainerCmd(_trim);
      create = _createContainerCmd;
    } else {
      CreateContainerCmd _createContainerCmd_1 = dockerClient.createContainerCmd("busybox");
      create = _createContainerCmd_1;
    }
    String _command = container.getCommand();
    boolean _isNotBlank_1 = StringUtils.isNotBlank(_command);
    if (_isNotBlank_1) {
      String _command_1 = container.getCommand();
      String _deleteWhitespace = StringUtils.deleteWhitespace(_command_1);
      String[] cmd = _deleteWhitespace.split(",");
      create.withCmd(cmd);
    } else {
      String _image_2 = container.getImage();
      boolean _isNotBlank_2 = StringUtils.isNotBlank(_image_2);
      boolean _not = (!_isNotBlank_2);
      if (_not) {
        create.withCmd("sleep", "9999");
      }
    }
    int _cpu_shares = container.getCpu_shares();
    boolean _greaterThan = (_cpu_shares > 0);
    if (_greaterThan) {
      int _cpu_shares_1 = container.getCpu_shares();
      create.withCpuShares(Integer.valueOf(_cpu_shares_1));
    }
    String _add_host = container.getAdd_host();
    boolean _isNotBlank_3 = StringUtils.isNotBlank(_add_host);
    if (_isNotBlank_3) {
      String _hostname = container.getHostname();
      String _deleteWhitespace_1 = StringUtils.deleteWhitespace(_hostname);
      create.withHostName(_deleteWhitespace_1);
    }
    String _cpuset = container.getCpuset();
    boolean _isNotBlank_4 = StringUtils.isNotBlank(_cpuset);
    if (_isNotBlank_4) {
      String _cpuset_1 = container.getCpuset();
      String _deleteWhitespace_2 = StringUtils.deleteWhitespace(_cpuset_1);
      create.withCpusetCpus(_deleteWhitespace_2);
    }
    boolean _isPrivileged = container.isPrivileged();
    if (_isPrivileged) {
      boolean _isPrivileged_1 = container.isPrivileged();
      create.withPrivileged(Boolean.valueOf(_isPrivileged_1));
    }
    String _dns = container.getDns();
    boolean _isNotBlank_5 = StringUtils.isNotBlank(_dns);
    if (_isNotBlank_5) {
      String _dns_1 = container.getDns();
      String _deleteWhitespace_3 = StringUtils.deleteWhitespace(_dns_1);
      create.withDns(_deleteWhitespace_3);
    }
    String _environment = container.getEnvironment();
    boolean _isNotBlank_6 = StringUtils.isNotBlank(_environment);
    if (_isNotBlank_6) {
      String _environment_1 = container.getEnvironment();
      String _deleteWhitespace_4 = StringUtils.deleteWhitespace(_environment_1);
      String[] env = _deleteWhitespace_4.split(",");
      create.withEnv(env);
    }
    String _ports = container.getPorts();
    String _plus = ("Container ports = " + _ports);
    DockerContainerManager.LOGGER.info(_plus);
    String _ports_1 = container.getPorts();
    boolean _isNotBlank_7 = StringUtils.isNotBlank(_ports_1);
    if (_isNotBlank_7) {
      String _ports_2 = container.getPorts();
      final String[] l_r_ports = _ports_2.split(":");
      String _get = l_r_ports[0];
      int _parseInt = Integer.parseInt(_get);
      ExposedPort tcp = ExposedPort.tcp(_parseInt);
      final Ports portBindings = new Ports();
      int _size = ((List<String>)Conversions.doWrapArray(l_r_ports)).size();
      boolean _equals = (_size == 2);
      if (_equals) {
        String _get_1 = l_r_ports[1];
        boolean _isNotBlank_8 = StringUtils.isNotBlank(_get_1);
        if (_isNotBlank_8) {
          String _get_2 = l_r_ports[1];
          int _parseInt_1 = Integer.parseInt(_get_2);
          Ports.Binding _bindPort = Ports.Binding.bindPort(_parseInt_1);
          portBindings.bind(tcp, _bindPort);
        } else {
          Ports.Binding _bindPort_1 = Ports.Binding.bindPort(32768);
          portBindings.bind(tcp, _bindPort_1);
        }
      }
      CreateContainerCmd _withExposedPorts = create.withExposedPorts(tcp);
      _withExposedPorts.withPortBindings(portBindings);
    }
    String _name = container.getName();
    boolean _isNotBlank_9 = StringUtils.isNotBlank(_name);
    if (_isNotBlank_9) {
      String _name_1 = container.getName();
      String _deleteWhitespace_5 = StringUtils.deleteWhitespace(_name_1);
      create.withName(_deleteWhitespace_5);
    }
    String _hostname_1 = container.getHostname();
    boolean _isNotBlank_10 = StringUtils.isNotBlank(_hostname_1);
    if (_isNotBlank_10) {
      String _hostname_2 = container.getHostname();
      String _deleteWhitespace_6 = StringUtils.deleteWhitespace(_hostname_2);
      create.withHostName(_deleteWhitespace_6);
    }
    String _net = container.getNet();
    boolean _isNotBlank_11 = StringUtils.isNotBlank(_net);
    if (_isNotBlank_11) {
      String _net_1 = container.getNet();
      create.withNetworkMode(_net_1);
    }
    boolean _isPublish_all = container.isPublish_all();
    if (_isPublish_all) {
      boolean _isPublish_all_1 = container.isPublish_all();
      create.withPublishAllPorts(Boolean.valueOf(_isPublish_all_1));
    }
    boolean _isStdin_open = container.isStdin_open();
    if (_isStdin_open) {
      boolean _isStdin_open_1 = container.isStdin_open();
      create.withStdInOnce(Boolean.valueOf(_isStdin_open_1));
    }
    String _user = container.getUser();
    boolean _isNotBlank_12 = StringUtils.isNotBlank(_user);
    if (_isNotBlank_12) {
      String _user_1 = container.getUser();
      create.withUser(_user_1);
    }
    String _volumes = container.getVolumes();
    boolean _isNotBlank_13 = StringUtils.isNotBlank(_volumes);
    if (_isNotBlank_13) {
      String _volumes_1 = container.getVolumes();
      String _deleteWhitespace_7 = StringUtils.deleteWhitespace(_volumes_1);
      String[] volumes = _deleteWhitespace_7.split(",");
      List<Volume> vs = new ArrayList<Volume>();
      for (final String v : volumes) {
        {
          Volume newVolume = new Volume(v);
          vs.add(newVolume);
        }
      }
      create.withVolumes(vs);
    }
    int _mem_limit = container.getMem_limit();
    boolean _greaterThan_1 = (_mem_limit > 0);
    if (_greaterThan_1) {
      int _mem_limit_1 = container.getMem_limit();
      Long _valueOf = Long.valueOf(_mem_limit_1);
      create.withMemory(_valueOf);
    }
    int _memory_swap = container.getMemory_swap();
    boolean _greaterThan_2 = (_memory_swap > 0);
    if (_greaterThan_2) {
      int _memory_swap_1 = container.getMemory_swap();
      Long _valueOf_1 = Long.valueOf(_memory_swap_1);
      create.withMemory(_valueOf_1);
    }
    String _lxc_conf = container.getLxc_conf();
    boolean _isNotBlank_14 = StringUtils.isNotBlank(_lxc_conf);
    if (_isNotBlank_14) {
      final LxcConf lxcCon = new LxcConf("key", "value");
      create.withLxcConf(lxcCon);
    }
    String _domainname = container.getDomainname();
    boolean _isNotBlank_15 = StringUtils.isNotBlank(_domainname);
    if (_isNotBlank_15) {
      String _domainname_1 = container.getDomainname();
      create.withDomainName(_domainname_1);
    }
    String _dns_search = container.getDns_search();
    boolean _isNotBlank_16 = StringUtils.isNotBlank(_dns_search);
    if (_isNotBlank_16) {
      String _dns_search_1 = container.getDns_search();
      String[] dnsSearch = _dns_search_1.split(",");
      create.withDnsSearch(dnsSearch);
    }
    String _entrypoint = container.getEntrypoint();
    boolean _isNotBlank_17 = StringUtils.isNotBlank(_entrypoint);
    if (_isNotBlank_17) {
      String _entrypoint_1 = container.getEntrypoint();
      String[] entrypoint = _entrypoint_1.split(",");
      create.withEntrypoint(entrypoint);
    }
    String _net_2 = container.getNet();
    boolean _isNotBlank_18 = StringUtils.isNotBlank(_net_2);
    if (_isNotBlank_18) {
      String _net_3 = container.getNet();
      String _deleteWhitespace_8 = StringUtils.deleteWhitespace(_net_3);
      create.withNetworkMode(_deleteWhitespace_8);
    }
    String _pid = container.getPid();
    boolean _isNotBlank_19 = StringUtils.isNotBlank(_pid);
    if (_isNotBlank_19) {
      String _pid_1 = container.getPid();
      String _deleteWhitespace_9 = StringUtils.deleteWhitespace(_pid_1);
      create.withPidMode(_deleteWhitespace_9);
    }
    boolean _isPrivileged_2 = container.isPrivileged();
    if (_isPrivileged_2) {
      boolean _isPrivileged_3 = container.isPrivileged();
      create.withPrivileged(Boolean.valueOf(_isPrivileged_3));
    }
    boolean _isPublish_all_2 = container.isPublish_all();
    if (_isPublish_all_2) {
      boolean _isPublish_all_3 = container.isPublish_all();
      create.withPublishAllPorts(Boolean.valueOf(_isPublish_all_3));
    }
    boolean _isRead_only = container.isRead_only();
    if (_isRead_only) {
      boolean _isRead_only_1 = container.isRead_only();
      create.withReadonlyRootfs(Boolean.valueOf(_isRead_only_1));
    }
    boolean _isTty = container.isTty();
    if (_isTty) {
      boolean _isTty_1 = container.isTty();
      create.withTty(Boolean.valueOf(_isTty_1));
    }
    String _restart = container.getRestart();
    boolean _isNotBlank_20 = StringUtils.isNotBlank(_restart);
    if (_isNotBlank_20) {
      String _restart_1 = container.getRestart();
      String _deleteWhitespace_10 = StringUtils.deleteWhitespace(_restart_1);
      RestartPolicy _parse = RestartPolicy.parse(_deleteWhitespace_10);
      create.withRestartPolicy(_parse);
    }
    String _working_dir = container.getWorking_dir();
    boolean _isNotBlank_21 = StringUtils.isNotBlank(_working_dir);
    if (_isNotBlank_21) {
      String _working_dir_1 = container.getWorking_dir();
      String _deleteWhitespace_11 = StringUtils.deleteWhitespace(_working_dir_1);
      create.withWorkingDir(_deleteWhitespace_11);
      create.getCpusetCpus();
    }
    List<Container> containersWithVolumes = new ArrayList<Container>();
    List<org.occiware.clouddesigner.occi.docker.Volume> volumesInsideHost = new ArrayList<org.occiware.clouddesigner.occi.docker.Volume>();
    List<Resource> _containersWithVolumes = this.containersWithVolumes(container);
    for (final Resource r : _containersWithVolumes) {
      {
        if ((r instanceof Container)) {
          containersWithVolumes.add(((Container) r));
        }
        if ((r instanceof org.occiware.clouddesigner.occi.docker.Volume)) {
          volumesInsideHost.add(((org.occiware.clouddesigner.occi.docker.Volume) r));
        }
      }
    }
    boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(containersWithVolumes);
    boolean _not_1 = (!_isNullOrEmpty);
    if (_not_1) {
      List<VolumesFrom> volumesFrom = new ArrayList<VolumesFrom>();
      for (final Container c : containersWithVolumes) {
        {
          String _name_2 = c.getName();
          VolumesFrom _volumesFrom = new VolumesFrom(_name_2);
          volumesFrom.add(_volumesFrom);
          String _name_3 = c.getName();
          DockerContainerManager.LOGGER.info(_name_3);
        }
      }
      create.withVolumesFrom(volumesFrom);
    }
    boolean _isNullOrEmpty_1 = IterableExtensions.isNullOrEmpty(volumesInsideHost);
    boolean _not_2 = (!_isNullOrEmpty_1);
    if (_not_2) {
      List<Bind> volumesBind = new ArrayList<Bind>();
      List<Volume> vs_1 = new ArrayList<Volume>();
      for (final org.occiware.clouddesigner.occi.docker.Volume v_1 : volumesInsideHost) {
        {
          Volume newVolume = null;
          String _destination = v_1.getDestination();
          boolean _isBlank = StringUtils.isBlank(_destination);
          boolean _not_3 = (!_isBlank);
          if (_not_3) {
            String _destination_1 = v_1.getDestination();
            Volume _volume = new Volume(_destination_1);
            newVolume = _volume;
            vs_1.add(newVolume);
          }
          String _source = v_1.getSource();
          boolean _isBlank_1 = StringUtils.isBlank(_source);
          boolean _not_4 = (!_isBlank_1);
          if (_not_4) {
            String _source_1 = v_1.getSource();
            Bind newBind = new Bind(_source_1, newVolume);
            volumesBind.add(newBind);
          }
        }
      }
      create.withVolumes(vs_1);
      create.withBinds(volumesBind);
    }
    return create;
  }
  
  public CreateContainerCmd containerFactory(final Container container, final DockerClient dockerClient, final Multimap<String, String> containerDependency) {
    CreateContainerCmd create = null;
    String _image = container.getImage();
    boolean _notEquals = (!Objects.equal(_image, null));
    if (_notEquals) {
      String _image_1 = container.getImage();
      String _trim = _image_1.trim();
      CreateContainerCmd _createContainerCmd = dockerClient.createContainerCmd(_trim);
      create = _createContainerCmd;
    } else {
      String _image_2 = container.getImage();
      boolean _equals = Objects.equal(_image_2, null);
      if (_equals) {
        CreateContainerCmd _createContainerCmd_1 = dockerClient.createContainerCmd("busybox");
        create = _createContainerCmd_1;
      }
    }
    String _command = container.getCommand();
    boolean _isNotBlank = StringUtils.isNotBlank(_command);
    if (_isNotBlank) {
      String _command_1 = container.getCommand();
      String _deleteWhitespace = StringUtils.deleteWhitespace(_command_1);
      final String[] cmd = _deleteWhitespace.split(",");
      create.withCmd(cmd);
    } else {
      create.withCmd("sleep", "9999");
    }
    int _cpu_shares = container.getCpu_shares();
    boolean _greaterThan = (_cpu_shares > 0);
    if (_greaterThan) {
      int _cpu_shares_1 = container.getCpu_shares();
      create.withCpuShares(Integer.valueOf(_cpu_shares_1));
    }
    String _add_host = container.getAdd_host();
    boolean _isNotBlank_1 = StringUtils.isNotBlank(_add_host);
    if (_isNotBlank_1) {
      String _hostname = container.getHostname();
      String _deleteWhitespace_1 = StringUtils.deleteWhitespace(_hostname);
      create.withHostName(_deleteWhitespace_1);
    }
    String _cpuset = container.getCpuset();
    boolean _isNotBlank_2 = StringUtils.isNotBlank(_cpuset);
    if (_isNotBlank_2) {
      String _cpuset_1 = container.getCpuset();
      String _deleteWhitespace_2 = StringUtils.deleteWhitespace(_cpuset_1);
      create.withCpusetCpus(_deleteWhitespace_2);
    }
    boolean _isPrivileged = container.isPrivileged();
    if (_isPrivileged) {
      boolean _isPrivileged_1 = container.isPrivileged();
      create.withPrivileged(Boolean.valueOf(_isPrivileged_1));
    }
    String _dns = container.getDns();
    boolean _isBlank = StringUtils.isBlank(_dns);
    boolean _not = (!_isBlank);
    if (_not) {
      String _dns_1 = container.getDns();
      String _deleteWhitespace_3 = StringUtils.deleteWhitespace(_dns_1);
      create.withDns(_deleteWhitespace_3);
    }
    String _environment = container.getEnvironment();
    boolean _isBlank_1 = StringUtils.isBlank(_environment);
    boolean _not_1 = (!_isBlank_1);
    if (_not_1) {
      String _environment_1 = container.getEnvironment();
      String _deleteWhitespace_4 = StringUtils.deleteWhitespace(_environment_1);
      create.withEnv(_deleteWhitespace_4);
    }
    String _ports = container.getPorts();
    boolean _isBlank_2 = StringUtils.isBlank(_ports);
    boolean _not_2 = (!_isBlank_2);
    if (_not_2) {
      String _ports_1 = container.getPorts();
      final String[] ports = _ports_1.split(":");
      String _get = ports[0];
      int _parseInt = Integer.parseInt(_get);
      ExposedPort port = ExposedPort.tcp(_parseInt);
      final Ports portBindings = new Ports();
      int _size = ((List<String>)Conversions.doWrapArray(ports)).size();
      boolean _equals_1 = (_size == 2);
      if (_equals_1) {
        String _get_1 = ports[1];
        int _parseInt_1 = Integer.parseInt(_get_1);
        Ports.Binding _bindPort = Ports.Binding.bindPort(_parseInt_1);
        portBindings.bind(port, _bindPort);
      } else {
        int _size_1 = ((List<String>)Conversions.doWrapArray(ports)).size();
        boolean _equals_2 = (_size_1 == 1);
        if (_equals_2) {
          String _get_2 = ports[0];
          int _parseInt_2 = Integer.parseInt(_get_2);
          Ports.Binding _bindPort_1 = Ports.Binding.bindPort(_parseInt_2);
          portBindings.bind(port, _bindPort_1);
        }
      }
      create.withPortBindings(portBindings);
    }
    String _name = container.getName();
    boolean _isBlank_3 = StringUtils.isBlank(_name);
    boolean _not_3 = (!_isBlank_3);
    if (_not_3) {
      String _name_1 = container.getName();
      String _deleteWhitespace_5 = StringUtils.deleteWhitespace(_name_1);
      create.withName(_deleteWhitespace_5);
    }
    String _hostname_1 = container.getHostname();
    boolean _isBlank_4 = StringUtils.isBlank(_hostname_1);
    boolean _not_4 = (!_isBlank_4);
    if (_not_4) {
      String _hostname_2 = container.getHostname();
      String _deleteWhitespace_6 = StringUtils.deleteWhitespace(_hostname_2);
      create.withName(_deleteWhitespace_6);
    }
    String _net = container.getNet();
    boolean _isBlank_5 = StringUtils.isBlank(_net);
    boolean _not_5 = (!_isBlank_5);
    if (_not_5) {
      String _net_1 = container.getNet();
      String _deleteWhitespace_7 = StringUtils.deleteWhitespace(_net_1);
      create.withNetworkMode(_deleteWhitespace_7);
    }
    boolean _isPublish_all = container.isPublish_all();
    if (_isPublish_all) {
      boolean _isPublish_all_1 = container.isPublish_all();
      create.withPublishAllPorts(Boolean.valueOf(_isPublish_all_1));
    }
    boolean _isTty = container.isTty();
    if (_isTty) {
      boolean _isTty_1 = container.isTty();
      create.withTty(Boolean.valueOf(_isTty_1));
    }
    boolean _isStdin_open = container.isStdin_open();
    if (_isStdin_open) {
      boolean _isStdin_open_1 = container.isStdin_open();
      create.withStdInOnce(Boolean.valueOf(_isStdin_open_1));
    }
    String _user = container.getUser();
    boolean _isBlank_6 = StringUtils.isBlank(_user);
    boolean _not_6 = (!_isBlank_6);
    if (_not_6) {
      String _user_1 = container.getUser();
      String _deleteWhitespace_8 = StringUtils.deleteWhitespace(_user_1);
      create.withUser(_deleteWhitespace_8);
    }
    String _volumes = container.getVolumes();
    boolean _isBlank_7 = StringUtils.isBlank(_volumes);
    boolean _not_7 = (!_isBlank_7);
    if (_not_7) {
      String _volumes_1 = container.getVolumes();
      String _deleteWhitespace_9 = StringUtils.deleteWhitespace(_volumes_1);
      String[] volumes = _deleteWhitespace_9.split(",");
      List<Volume> vs = new ArrayList<Volume>();
      for (final String v : volumes) {
        {
          Volume newVolume = new Volume(v);
          vs.add(newVolume);
        }
      }
      create.withVolumes(vs);
    }
    int _mem_limit = container.getMem_limit();
    boolean _greaterThan_1 = (_mem_limit > 0);
    if (_greaterThan_1) {
      int _mem_limit_1 = container.getMem_limit();
      Long _valueOf = Long.valueOf(_mem_limit_1);
      create.withMemory(_valueOf);
    }
    int _memory_swap = container.getMemory_swap();
    boolean _greaterThan_2 = (_memory_swap > 0);
    if (_greaterThan_2) {
      int _memory_swap_1 = container.getMemory_swap();
      Long _valueOf_1 = Long.valueOf(_memory_swap_1);
      create.withMemorySwap(_valueOf_1);
    }
    String _lxc_conf = container.getLxc_conf();
    boolean _isBlank_8 = StringUtils.isBlank(_lxc_conf);
    boolean _not_8 = (!_isBlank_8);
    if (_not_8) {
      final LxcConf lxcCon = new LxcConf("key", "value");
      create.withLxcConf(lxcCon);
    }
    String _name_2 = container.getName();
    boolean _containsKey = containerDependency.containsKey(_name_2);
    if (_containsKey) {
      String _name_3 = container.getName();
      Collection<String> _get_3 = containerDependency.get(_name_3);
      LinkedHashSet<String> _linkedHashSet = new LinkedHashSet<String>(_get_3);
      final List<String> depdupeContainers = new ArrayList<String>(_linkedHashSet);
      List<Link> dockeClientlinks = new ArrayList<Link>();
      Link dockeClientlink = null;
      for (final String entry : depdupeContainers) {
        {
          String _name_4 = container.getName();
          String _plus = (_name_4 + "LinkTo");
          String _plus_1 = (_plus + entry);
          Link _link = new Link(entry, _plus_1);
          dockeClientlink = _link;
          dockeClientlinks.add(dockeClientlink);
        }
      }
      int _size_2 = depdupeContainers.size();
      boolean _greaterThan_3 = (_size_2 > 1);
      if (_greaterThan_3) {
        create.withLinks(dockeClientlinks);
      } else {
        int _size_3 = depdupeContainers.size();
        boolean _equals_3 = (_size_3 == 1);
        if (_equals_3) {
          create.withLinks(dockeClientlink);
        }
      }
    }
    List<Container> containersWithVolumes = new ArrayList<Container>();
    List<org.occiware.clouddesigner.occi.docker.Volume> volumesInsideHost = new ArrayList<org.occiware.clouddesigner.occi.docker.Volume>();
    List<Resource> _containersWithVolumes = this.containersWithVolumes(container);
    for (final Resource r : _containersWithVolumes) {
      {
        if ((r instanceof Container)) {
          containersWithVolumes.add(((Container) r));
        }
        if ((r instanceof org.occiware.clouddesigner.occi.docker.Volume)) {
          volumesInsideHost.add(((org.occiware.clouddesigner.occi.docker.Volume) r));
        }
      }
    }
    boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(containersWithVolumes);
    boolean _not_9 = (!_isNullOrEmpty);
    if (_not_9) {
      List<VolumesFrom> volumesFrom = new ArrayList<VolumesFrom>();
      for (final Container c : containersWithVolumes) {
        {
          String _name_4 = c.getName();
          VolumesFrom _volumesFrom = new VolumesFrom(_name_4);
          volumesFrom.add(_volumesFrom);
          String _name_5 = c.getName();
          DockerContainerManager.LOGGER.info(_name_5);
        }
      }
      create.withVolumesFrom(volumesFrom);
    }
    boolean _isNullOrEmpty_1 = IterableExtensions.isNullOrEmpty(volumesInsideHost);
    boolean _not_10 = (!_isNullOrEmpty_1);
    if (_not_10) {
      List<Bind> volumesBind = new ArrayList<Bind>();
      List<Volume> vs_1 = new ArrayList<Volume>();
      for (final org.occiware.clouddesigner.occi.docker.Volume v_1 : volumesInsideHost) {
        {
          Volume newVolume = null;
          String _destination = v_1.getDestination();
          boolean _isBlank_9 = StringUtils.isBlank(_destination);
          boolean _not_11 = (!_isBlank_9);
          if (_not_11) {
            String _destination_1 = v_1.getDestination();
            Volume _volume = new Volume(_destination_1);
            newVolume = _volume;
            vs_1.add(newVolume);
          }
          String _source = v_1.getSource();
          boolean _isBlank_10 = StringUtils.isBlank(_source);
          boolean _not_12 = (!_isBlank_10);
          if (_not_12) {
            String _source_1 = v_1.getSource();
            Bind newBind = new Bind(_source_1, newVolume);
            volumesBind.add(newBind);
          }
        }
      }
      create.withVolumes(vs_1);
      create.withBinds(volumesBind);
    }
    return create;
  }
  
  public List<Resource> containersWithVolumes(final Container c) {
    ArrayList<Resource> containersFrom = new ArrayList<Resource>();
    EList<org.occiware.clouddesigner.occi.Link> _links = c.getLinks();
    for (final org.occiware.clouddesigner.occi.Link l : _links) {
      if ((l instanceof Volumesfrom)) {
        Resource _target = ((Volumesfrom)l).getTarget();
        containersFrom.add(_target);
      }
    }
    return containersFrom;
  }
  
  public InspectContainerResponse inspectContainer(final Map<DockerClient, CreateContainerResponse> map) {
    Set<DockerClient> _keySet = map.keySet();
    Iterator<DockerClient> _iterator = _keySet.iterator();
    DockerClient _next = _iterator.next();
    final DockerClient dockerClient = ((DockerClient) _next);
    CreateContainerResponse _get = map.get(dockerClient);
    final CreateContainerResponse createContainerResponse = ((CreateContainerResponse) _get);
    String _id = createContainerResponse.getId();
    InspectContainerCmd _inspectContainerCmd = dockerClient.inspectContainerCmd(_id);
    final InspectContainerResponse inspectContainerResponse = _inspectContainerCmd.exec();
    return inspectContainerResponse;
  }
  
  public InspectContainerResponse inspectContainer(final Machine machine, final String containerId) {
    boolean _equals = Objects.equal(DockerContainerManager.dockerClient, null);
    if (_equals) {
      String _name = machine.getName();
      DockerClient _setConfig = this.setConfig(_name, this.properties);
      DockerContainerManager.dockerClient = _setConfig;
    } else {
      String _name_1 = machine.getName();
      boolean _equalsIgnoreCase = DockerContainerManager.currentMachine.equalsIgnoreCase(_name_1);
      boolean _not = (!_equalsIgnoreCase);
      if (_not) {
        String _name_2 = machine.getName();
        DockerClient _setConfig_1 = this.setConfig(_name_2, this.properties);
        DockerContainerManager.dockerClient = _setConfig_1;
        String _name_3 = machine.getName();
        DockerContainerManager.currentMachine = _name_3;
      }
    }
    InspectContainerCmd _inspectContainerCmd = DockerContainerManager.dockerClient.inspectContainerCmd(containerId);
    final InspectContainerResponse inspectContainerResponse = _inspectContainerCmd.exec();
    return inspectContainerResponse;
  }
  
  public StatsCallback startContainer(final Machine machine, final Container container) {
    StatsCallback _xblockexpression = null;
    {
      boolean _notEquals = (!Objects.equal(DockerContainerManager.dockerClient, null));
      if (_notEquals) {
        DockerContainerManager.dockerClient = DockerContainerManager.dockerClient;
      } else {
        String _name = machine.getName();
        boolean _equalsIgnoreCase = DockerContainerManager.currentMachine.equalsIgnoreCase(_name);
        boolean _not = (!_equalsIgnoreCase);
        if (_not) {
          String _name_1 = machine.getName();
          DockerClient _setConfig = this.setConfig(_name_1, this.properties);
          DockerContainerManager.dockerClient = _setConfig;
        }
      }
      String _containerid = container.getContainerid();
      StartContainerCmd _startContainerCmd = DockerContainerManager.dockerClient.startContainerCmd(_containerid);
      _startContainerCmd.exec();
      StatsCallback _xifexpression = null;
      boolean _isMonitored = container.isMonitored();
      if (_isMonitored) {
        StatsCallback _xblockexpression_1 = null;
        {
          DockerContainerManager.LOGGER.info("Starting metrics collection");
          String _name_2 = machine.getName();
          DockerClient _setConfig_1 = this.setConfig(_name_2, this.properties);
          DockerContainerManager.dockerClient = _setConfig_1;
          String _containerid_1 = container.getContainerid();
          StatsCmd _statsCmd = DockerContainerManager.dockerClient.statsCmd(_containerid_1);
          StatsCallback _statsCallback = new StatsCallback(container);
          _xblockexpression_1 = _statsCmd.<StatsCallback>exec(_statsCallback);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public StatsCallback startContainer(final Machine machine, final String containerId) {
    StatsCallback _xblockexpression = null;
    {
      boolean _equals = Objects.equal(DockerContainerManager.dockerClient, null);
      if (_equals) {
        String _name = machine.getName();
        DockerClient _setConfig = this.setConfig(_name, this.properties);
        DockerContainerManager.dockerClient = _setConfig;
      } else {
        String _name_1 = machine.getName();
        boolean _equalsIgnoreCase = DockerContainerManager.currentMachine.equalsIgnoreCase(_name_1);
        boolean _not = (!_equalsIgnoreCase);
        if (_not) {
          String _name_2 = machine.getName();
          DockerClient _setConfig_1 = this.setConfig(_name_2, this.properties);
          DockerContainerManager.dockerClient = _setConfig_1;
        }
      }
      StartContainerCmd _startContainerCmd = DockerContainerManager.dockerClient.startContainerCmd(containerId);
      _startContainerCmd.exec();
      DockerContainerManager.LOGGER.info("Starting metrics collection");
      String _name_3 = machine.getName();
      DockerClient _setConfig_2 = this.setConfig(_name_3, this.properties);
      DockerContainerManager.dockerClient = _setConfig_2;
      StatsCmd _statsCmd = DockerContainerManager.dockerClient.statsCmd(containerId);
      StatsCallback _statsCallback = new StatsCallback(containerId);
      _xblockexpression = _statsCmd.<StatsCallback>exec(_statsCallback);
    }
    return _xblockexpression;
  }
  
  public Void stopContainer(final Machine machine, final Container container) {
    Void _xblockexpression = null;
    {
      boolean _equals = Objects.equal(DockerContainerManager.dockerClient, null);
      if (_equals) {
        String _name = machine.getName();
        DockerClient _setConfig = this.setConfig(_name, this.properties);
        DockerContainerManager.dockerClient = _setConfig;
      } else {
        String _name_1 = machine.getName();
        boolean _equalsIgnoreCase = DockerContainerManager.currentMachine.equalsIgnoreCase(_name_1);
        boolean _not = (!_equalsIgnoreCase);
        if (_not) {
          String _name_2 = machine.getName();
          DockerClient _setConfig_1 = this.setConfig(_name_2, this.properties);
          DockerContainerManager.dockerClient = _setConfig_1;
        }
      }
      String _id = container.getId();
      StopContainerCmd _stopContainerCmd = DockerContainerManager.dockerClient.stopContainerCmd(_id);
      _xblockexpression = _stopContainerCmd.exec();
    }
    return _xblockexpression;
  }
  
  public Void stopContainer(final Machine machine, final String containerId) {
    Void _xblockexpression = null;
    {
      boolean _equals = Objects.equal(DockerContainerManager.dockerClient, null);
      if (_equals) {
        String _name = machine.getName();
        DockerClient _setConfig = this.setConfig(_name, this.properties);
        DockerContainerManager.dockerClient = _setConfig;
      } else {
        String _name_1 = machine.getName();
        boolean _equalsIgnoreCase = DockerContainerManager.currentMachine.equalsIgnoreCase(_name_1);
        boolean _not = (!_equalsIgnoreCase);
        if (_not) {
          String _name_2 = machine.getName();
          DockerClient _setConfig_1 = this.setConfig(_name_2, this.properties);
          DockerContainerManager.dockerClient = _setConfig_1;
        }
      }
      StopContainerCmd _stopContainerCmd = DockerContainerManager.dockerClient.stopContainerCmd(containerId);
      _xblockexpression = _stopContainerCmd.exec();
    }
    return _xblockexpression;
  }
  
  public Integer waitContainer(final Machine machine, final Container container) {
    Integer _xblockexpression = null;
    {
      boolean _equals = Objects.equal(DockerContainerManager.dockerClient, null);
      if (_equals) {
        String _name = machine.getName();
        DockerClient _setConfig = this.setConfig(_name, this.properties);
        DockerContainerManager.dockerClient = _setConfig;
      } else {
        String _name_1 = machine.getName();
        boolean _equalsIgnoreCase = DockerContainerManager.currentMachine.equalsIgnoreCase(_name_1);
        boolean _not = (!_equalsIgnoreCase);
        if (_not) {
          String _name_2 = machine.getName();
          DockerClient _setConfig_1 = this.setConfig(_name_2, this.properties);
          DockerContainerManager.dockerClient = _setConfig_1;
        }
      }
      String _id = container.getId();
      WaitContainerCmd _waitContainerCmd = DockerContainerManager.dockerClient.waitContainerCmd(_id);
      WaitContainerResultCallback _waitContainerResultCallback = new WaitContainerResultCallback();
      WaitContainerResultCallback _exec = _waitContainerCmd.<WaitContainerResultCallback>exec(_waitContainerResultCallback);
      _xblockexpression = _exec.awaitStatusCode();
    }
    return _xblockexpression;
  }
  
  public Void renameContainer(final Machine machine, final String containerId, final String newName) {
    Void _xblockexpression = null;
    {
      boolean _equals = Objects.equal(DockerContainerManager.dockerClient, null);
      if (_equals) {
        String _name = machine.getName();
        DockerClient _setConfig = this.setConfig(_name, this.properties);
        DockerContainerManager.dockerClient = _setConfig;
      } else {
        String _name_1 = machine.getName();
        boolean _equalsIgnoreCase = DockerContainerManager.currentMachine.equalsIgnoreCase(_name_1);
        boolean _not = (!_equalsIgnoreCase);
        if (_not) {
          String _name_2 = machine.getName();
          DockerClient _setConfig_1 = this.setConfig(_name_2, this.properties);
          DockerContainerManager.dockerClient = _setConfig_1;
        }
      }
      RenameContainerCmd _renameContainerCmd = DockerContainerManager.dockerClient.renameContainerCmd(containerId);
      RenameContainerCmd _withName = _renameContainerCmd.withName(newName);
      _xblockexpression = _withName.exec();
    }
    return _xblockexpression;
  }
  
  public void removeContainer(final Machine machine, final String containerId) {
    String _name = machine.getName();
    this.removeContainer(_name, containerId);
  }
  
  public List<com.github.dockerjava.api.model.Container> listContainer(final String machineName) {
    boolean _equals = Objects.equal(DockerContainerManager.dockerClient, null);
    if (_equals) {
      DockerClient _setConfig = this.setConfig(machineName, this.properties);
      DockerContainerManager.dockerClient = _setConfig;
    } else {
      boolean _equalsIgnoreCase = DockerContainerManager.currentMachine.equalsIgnoreCase(machineName);
      boolean _not = (!_equalsIgnoreCase);
      if (_not) {
        DockerClient _setConfig_1 = this.setConfig(machineName, this.properties);
        DockerContainerManager.dockerClient = _setConfig_1;
      }
    }
    ListContainersCmd _listContainersCmd = DockerContainerManager.dockerClient.listContainersCmd();
    ListContainersCmd _withShowAll = _listContainersCmd.withShowAll(Boolean.valueOf(true));
    final List<com.github.dockerjava.api.model.Container> containers = _withShowAll.exec();
    return containers;
  }
  
  public DockerClient pullImage(final Machine machine, final String image) {
    boolean _equals = Objects.equal(DockerContainerManager.dockerClient, null);
    if (_equals) {
      String _name = machine.getName();
      DockerClient _setConfig = this.setConfig(_name, this.properties);
      DockerContainerManager.dockerClient = _setConfig;
    } else {
      String _name_1 = machine.getName();
      boolean _equalsIgnoreCase = DockerContainerManager.currentMachine.equalsIgnoreCase(_name_1);
      boolean _not = (!_equalsIgnoreCase);
      if (_not) {
        String _name_2 = machine.getName();
        DockerClient _setConfig_1 = this.setConfig(_name_2, this.properties);
        DockerContainerManager.dockerClient = _setConfig_1;
      }
    }
    String containerImage = image;
    boolean _isNotBlank = StringUtils.isNotBlank(containerImage);
    boolean _not_1 = (!_isNotBlank);
    if (_not_1) {
      containerImage = "busybox";
      DockerContainerManager.LOGGER.info("Use the default Docker Image: {}", containerImage);
    }
    String output = null;
    DockerContainerManager.LOGGER.info(("Downloading image: ->" + containerImage));
    try {
      PullImageCmd _pullImageCmd = DockerContainerManager.dockerClient.pullImageCmd(containerImage);
      PullImageCmd _withTag = _pullImageCmd.withTag("latest");
      PullImageResultCallback _pullImageResultCallback = new PullImageResultCallback();
      PullImageResultCallback _exec = _withTag.<PullImageResultCallback>exec(_pullImageResultCallback);
      _exec.awaitSuccess();
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        String _message = e.getMessage();
        DockerContainerManager.LOGGER.error(_message);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    DockerContainerManager.LOGGER.info(output);
    DockerContainerManager.LOGGER.info("Download is finished");
    return DockerContainerManager.dockerClient;
  }
  
  public boolean machineContainsImage(final String machine, final String image) {
    List<String> _get = this.images.get(machine);
    boolean _notEquals = (!Objects.equal(_get, null));
    if (_notEquals) {
      List<String> _get_1 = this.images.get(machine);
      return _get_1.contains(image);
    }
    return false;
  }
  
  public void addImageToMachine(final String machine, final String image) {
    boolean _containsKey = this.images.containsKey(machine);
    boolean _not = (!_containsKey);
    if (_not) {
      ArrayList<String> tempList = new ArrayList<String>();
      tempList.add(image);
      this.images.put(machine, tempList);
    } else {
      List<String> tempList_1 = this.images.get(machine);
      tempList_1.add(image);
      this.images.put(machine, tempList_1);
    }
  }
  
  public DockerClient setConfig(final String machine, final PreferenceValues properties) {
    DockerContainerManager.LOGGER.info(("Trying to connect inside machine ---> " + machine));
    String port = null;
    Runtime _runtime = Runtime.getRuntime();
    String ENDPOINT = DockerMachineManager.urlCmd(_runtime, machine);
    final String certPath = DockerUtil.getEnv(machine);
    DockerContainerManager.LOGGER.info(("DOCKER_CERT_PATH=" + certPath));
    DockerClientConfig config = null;
    final DockerConfig lconfig = new DockerConfig();
    Properties dockerProperties = lconfig.loadConfig();
    port = ":2376";
    DockerContainerManager.LOGGER.info(("ENDPOINT : " + ENDPOINT));
    String _xifexpression = null;
    if ((Objects.equal(ENDPOINT, null) || (ENDPOINT.trim().length() == 0))) {
      _xifexpression = ("tcp://127.0.0.1" + port);
    } else {
      _xifexpression = ENDPOINT.trim();
    }
    final String dockerHost = _xifexpression;
    String _string = dockerHost.toString();
    String _plus = ((("Connection inside machine: " + machine) + " with uri: ") + _string);
    DockerContainerManager.LOGGER.info(_plus);
    String _property = System.getProperty("user.home");
    String _plus_1 = (_property + File.separator);
    String dockerHome = (_plus_1 + ".docker");
    try {
      String _version = properties.getVersion();
      boolean _notEquals = (!Objects.equal(_version, null));
      if (_notEquals) {
        DefaultDockerClientConfig.Builder _createDefaultConfigBuilder = DefaultDockerClientConfig.createDefaultConfigBuilder();
        String _version_1 = properties.getVersion();
        String _trim = _version_1.trim();
        DefaultDockerClientConfig.Builder _withApiVersion = _createDefaultConfigBuilder.withApiVersion(_trim);
        DefaultDockerClientConfig.Builder _withDockerHost = _withApiVersion.withDockerHost(dockerHost);
        DefaultDockerClientConfig.Builder _withDockerTlsVerify = _withDockerHost.withDockerTlsVerify(Boolean.valueOf(true));
        String _username = properties.getUsername();
        String _trim_1 = _username.trim();
        DefaultDockerClientConfig.Builder _withRegistryUsername = _withDockerTlsVerify.withRegistryUsername(_trim_1);
        String _password = properties.getPassword();
        String _trim_2 = _password.trim();
        DefaultDockerClientConfig.Builder _withRegistryPassword = _withRegistryUsername.withRegistryPassword(_trim_2);
        String _email = properties.getEmail();
        String _trim_3 = _email.trim();
        DefaultDockerClientConfig.Builder _withRegistryEmail = _withRegistryPassword.withRegistryEmail(_trim_3);
        String _url = properties.getUrl();
        String _trim_4 = _url.trim();
        DefaultDockerClientConfig.Builder _withRegistryUrl = _withRegistryEmail.withRegistryUrl(_trim_4);
        DefaultDockerClientConfig.Builder _withDockerCertPath = _withRegistryUrl.withDockerCertPath(certPath);
        DefaultDockerClientConfig.Builder _withDockerConfig = _withDockerCertPath.withDockerConfig(dockerHome);
        DefaultDockerClientConfig _build = _withDockerConfig.build();
        config = _build;
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception exception = (Exception)_t;
        DockerContainerManager.LOGGER.error("Loading docker-java properties files ...");
        DefaultDockerClientConfig.Builder _createDefaultConfigBuilder_1 = DefaultDockerClientConfig.createDefaultConfigBuilder();
        Object _get = dockerProperties.get("api.version");
        String _string_1 = _get.toString();
        DefaultDockerClientConfig.Builder _withApiVersion_1 = _createDefaultConfigBuilder_1.withApiVersion(_string_1);
        DefaultDockerClientConfig.Builder _withDockerHost_1 = _withApiVersion_1.withDockerHost(dockerHost);
        DefaultDockerClientConfig.Builder _withDockerTlsVerify_1 = _withDockerHost_1.withDockerTlsVerify(Boolean.valueOf(true));
        Object _get_1 = dockerProperties.get("docker.username");
        String _string_2 = _get_1.toString();
        DefaultDockerClientConfig.Builder _withRegistryUsername_1 = _withDockerTlsVerify_1.withRegistryUsername(_string_2);
        Object _get_2 = dockerProperties.get("docker.password");
        String _string_3 = _get_2.toString();
        DefaultDockerClientConfig.Builder _withRegistryPassword_1 = _withRegistryUsername_1.withRegistryPassword(_string_3);
        Object _get_3 = dockerProperties.get("docker.email");
        String _string_4 = _get_3.toString();
        DefaultDockerClientConfig.Builder _withRegistryEmail_1 = _withRegistryPassword_1.withRegistryEmail(_string_4);
        Object _get_4 = dockerProperties.get("docker.url");
        String _string_5 = _get_4.toString();
        DefaultDockerClientConfig.Builder _withRegistryUrl_1 = _withRegistryEmail_1.withRegistryUrl(_string_5);
        DefaultDockerClientConfig.Builder _withDockerCertPath_1 = _withRegistryUrl_1.withDockerCertPath(certPath);
        DefaultDockerClientConfig.Builder _withDockerConfig_1 = _withDockerCertPath_1.withDockerConfig(dockerHome);
        DefaultDockerClientConfig _build_1 = _withDockerConfig_1.build();
        config = _build_1;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    DockerClientBuilder _instance = DockerClientBuilder.getInstance(config);
    final DockerClient dockerClient = _instance.build();
    DockerContainerManager.currentMachine = machine;
    return dockerClient;
  }
  
  public void connect() {
    Session session = null;
    final File test = new File("test");
    final String host = "192.168.99.100";
    final String user = "docker";
    final int port = 22;
    final String privatekey = "/Users/spirals/.docker/machine/machines/ghost/id_rsa";
    try {
      final JSch jsc = new JSch();
      jsc.setKnownHosts("/dev/null");
      jsc.addIdentity(privatekey);
      jsc.setKnownHosts("/dev/null");
      Properties config = new Properties();
      config.put("StrictHostKeyChecking", "no");
      Session _session = jsc.getSession(user, host, port);
      session = _session;
      session.setConfig(config);
      session.connect();
      InputOutput.<String>println("Connection successfully ...");
    } catch (final Throwable _t) {
      if (_t instanceof JSchException) {
        final JSchException e = (JSchException)_t;
        String _string = e.toString();
        DockerContainerManager.LOGGER.info(_string);
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public void connect(final String host, final String privateKey, final String command) {
    try {
      Session session = null;
      final String user = "docker";
      final File tempDir = this.createTempDir("knowHosts");
      String _plus = (tempDir + "/hosts");
      final File test = new File(_plus);
      boolean _exists = test.exists();
      boolean _not = (!_exists);
      if (_not) {
        test.createNewFile();
      }
      try {
        final JSch jsc = new JSch();
        jsc.setKnownHosts("/dev/null");
        Properties config = new Properties();
        config.put("StrictHostKeyChecking", "no");
        jsc.setKnownHosts("/dev/null");
        jsc.addIdentity(privateKey);
        DockerContainerManager.LOGGER.info("Identity added ..");
        final String exCommand = ((("sudo sh -c " + "\"") + command) + "\"");
        DockerContainerManager.LOGGER.info(exCommand);
        Session _session = jsc.getSession(user, host, 22);
        session = _session;
        DockerContainerManager.LOGGER.info("Session created ..");
        session.setConfig(config);
        DockerContainerManager.LOGGER.info("Session config ..");
        session.connect();
        DockerContainerManager.LOGGER.info("Session connected ..");
        final Channel channel = session.openChannel("exec");
        ((ChannelExec) channel).setCommand(exCommand);
        ((ChannelExec) channel).setErrStream(System.err);
        channel.connect();
      } catch (final Throwable _t) {
        if (_t instanceof JSchException) {
          final JSchException e = (JSchException)_t;
          String _string = e.toString();
          DockerContainerManager.LOGGER.info(_string);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      session.disconnect();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void addHost(final String key, final String ip, final String knowHosts) {
    try {
      final FileWriter tmpwriter = new FileWriter(knowHosts, true);
      final String newLine = (((ip + " ssh-rsa ") + key) + "\n");
      boolean _hostAlreadyExist = this.hostAlreadyExist(newLine, knowHosts);
      boolean _not = (!_hostAlreadyExist);
      if (_not) {
        tmpwriter.append(newLine);
        DockerContainerManager.LOGGER.info(((ip + " ssh-rsa ") + key));
        tmpwriter.flush();
        tmpwriter.close();
      }
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public boolean hostAlreadyExist(final String newLine, final String knowHosts) {
    try {
      final File hostFile = new File(knowHosts);
      FileReader _fileReader = new FileReader(hostFile);
      BufferedReader br = new BufferedReader(_fileReader);
      String line = null;
      while ((!Objects.equal((line = br.readLine()), null))) {
        String _trim = line.trim();
        String _trim_1 = newLine.trim();
        boolean _equalsIgnoreCase = _trim.equalsIgnoreCase(_trim_1);
        if (_equalsIgnoreCase) {
          return true;
        }
      }
      br.close();
      return false;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public File createTempDir(final String baseName) {
    String _property = System.getProperty("java.io.tmpdir");
    final File baseDir = new File(_property);
    File tempDir = new File(baseDir, baseName);
    boolean _exists = tempDir.exists();
    boolean _not = (!_exists);
    if (_not) {
      boolean _mkdir = tempDir.mkdir();
      if (_mkdir) {
        return tempDir;
      }
    } else {
      return tempDir;
    }
    return null;
  }
}
