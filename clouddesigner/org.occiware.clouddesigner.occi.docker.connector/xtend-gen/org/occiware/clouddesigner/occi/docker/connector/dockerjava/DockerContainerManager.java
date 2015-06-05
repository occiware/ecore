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
import com.github.dockerjava.api.command.CreateContainerCmd;
import com.github.dockerjava.api.command.CreateContainerResponse;
import com.github.dockerjava.api.command.InspectContainerCmd;
import com.github.dockerjava.api.command.InspectContainerResponse;
import com.github.dockerjava.api.command.ListContainersCmd;
import com.github.dockerjava.api.command.PullImageCmd;
import com.github.dockerjava.api.command.RemoveContainerCmd;
import com.github.dockerjava.api.command.StartContainerCmd;
import com.github.dockerjava.api.command.StopContainerCmd;
import com.github.dockerjava.api.command.WaitContainerCmd;
import com.github.dockerjava.api.model.ExposedPort;
import com.github.dockerjava.api.model.Link;
import com.github.dockerjava.api.model.LxcConf;
import com.github.dockerjava.api.model.Ports;
import com.github.dockerjava.api.model.Volume;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientConfig;
import com.google.common.base.Objects;
import com.google.common.collect.Multimap;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.HostKey;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
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
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerMachineManager;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerConfig;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class DockerContainerManager {
  private static DockerClient dockerClient = null;
  
  private Map<String, List<String>> images = new HashMap<String, List<String>>();
  
  private static Logger LOGGER = LoggerFactory.getLogger(DockerContainerManager.class);
  
  public DockerContainerManager() {
  }
  
  public DockerContainerManager(final Machine machine) {
    String _name = machine.getName();
    DockerClient _setConfig = this.setConfig(_name);
    DockerContainerManager.dockerClient = _setConfig;
  }
  
  public DockerContainerManager(final String machineName) {
    DockerClient _setConfig = this.setConfig(machineName);
    DockerContainerManager.dockerClient = _setConfig;
  }
  
  public Map<DockerClient, CreateContainerResponse> createContainer(final Machine machine, final Container container) {
    boolean _equals = Objects.equal(DockerContainerManager.dockerClient, null);
    if (_equals) {
      String _name = machine.getName();
      DockerClient _setConfig = this.setConfig(_name);
      DockerContainerManager.dockerClient = _setConfig;
    }
    Map<DockerClient, CreateContainerResponse> result = new LinkedHashMap<DockerClient, CreateContainerResponse>();
    final CreateContainerCmd create = this.containerFactory(container, DockerContainerManager.dockerClient);
    final CreateContainerResponse rcontainer = create.exec();
    result.put(DockerContainerManager.dockerClient, rcontainer);
    return result;
  }
  
  public Map<DockerClient, CreateContainerResponse> createContainer(final Machine machine, final Container container, final Multimap<String, String> containerDependency) {
    boolean _equals = Objects.equal(DockerContainerManager.dockerClient, null);
    if (_equals) {
      String _name = machine.getName();
      DockerClient _setConfig = this.setConfig(_name);
      DockerContainerManager.dockerClient = _setConfig;
    }
    Map<DockerClient, CreateContainerResponse> result = new LinkedHashMap<DockerClient, CreateContainerResponse>();
    final CreateContainerCmd create = this.containerFactory(container, DockerContainerManager.dockerClient, containerDependency);
    final CreateContainerResponse rcontainer = create.exec();
    result.put(DockerContainerManager.dockerClient, rcontainer);
    return result;
  }
  
  public void removeContainer(final String machineName, final String containerId) {
    boolean _equals = Objects.equal(DockerContainerManager.dockerClient, null);
    if (_equals) {
      DockerClient _setConfig = this.setConfig(machineName);
      DockerContainerManager.dockerClient = _setConfig;
    }
    RemoveContainerCmd _removeContainerCmd = DockerContainerManager.dockerClient.removeContainerCmd(containerId);
    _removeContainerCmd.exec();
  }
  
  public CreateContainerCmd containerFactory(final Container container, final DockerClient dockerClient) {
    CreateContainerCmd create = null;
    String _image = container.getImage();
    boolean _notEquals = (!Objects.equal(_image, null));
    if (_notEquals) {
      String _image_1 = container.getImage();
      CreateContainerCmd _createContainerCmd = dockerClient.createContainerCmd(_image_1);
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
    boolean _notEquals_1 = (!Objects.equal(_command, null));
    if (_notEquals_1) {
      String _command_1 = container.getCommand();
      final String[] cmd = _command_1.split(",");
      create.withCmd(cmd);
    }
    int _cpu_shares = container.getCpu_shares();
    boolean _greaterThan = (_cpu_shares > 0);
    if (_greaterThan) {
      int _cpu_shares_1 = container.getCpu_shares();
      create.withCpuShares(_cpu_shares_1);
    }
    String _add_host = container.getAdd_host();
    boolean _notEquals_2 = (!Objects.equal(_add_host, null));
    if (_notEquals_2) {
      String _hostname = container.getHostname();
      create.withHostName(_hostname);
    }
    String _cpuset = container.getCpuset();
    boolean _notEquals_3 = (!Objects.equal(_cpuset, null));
    if (_notEquals_3) {
      String _cpuset_1 = container.getCpuset();
      create.withCpuset(_cpuset_1);
    }
    boolean _isPrivileged = container.isPrivileged();
    if (_isPrivileged) {
      boolean _isPrivileged_1 = container.isPrivileged();
      create.withPrivileged(_isPrivileged_1);
    }
    String _dns = container.getDns();
    boolean _notEquals_4 = (!Objects.equal(_dns, null));
    if (_notEquals_4) {
      String _dns_1 = container.getDns();
      create.withDns(_dns_1);
    }
    String _environment = container.getEnvironment();
    boolean _notEquals_5 = (!Objects.equal(_environment, null));
    if (_notEquals_5) {
      String _environment_1 = container.getEnvironment();
      create.withEnv(_environment_1);
    }
    String _ports = container.getPorts();
    boolean _notEquals_6 = (!Objects.equal(_ports, null));
    if (_notEquals_6) {
      String _ports_1 = container.getPorts();
      int _parseInt = Integer.parseInt(_ports_1);
      ExposedPort port = ExposedPort.tcp(_parseInt);
      final Ports portBindings = new Ports();
      Ports.Binding _Binding = Ports.Binding(Integer.valueOf(11022));
      portBindings.bind(port, _Binding);
      create.withPortBindings(portBindings);
    }
    String _name = container.getName();
    boolean _notEquals_7 = (!Objects.equal(_name, null));
    if (_notEquals_7) {
      String _name_1 = container.getName();
      create.withName(_name_1);
    }
    String _net = container.getNet();
    boolean _notEquals_8 = (!Objects.equal(_net, null));
    if (_notEquals_8) {
      String _net_1 = container.getNet();
      create.withNetworkMode(_net_1);
    }
    boolean _isPublish_all = container.isPublish_all();
    if (_isPublish_all) {
      boolean _isPublish_all_1 = container.isPublish_all();
      create.withPublishAllPorts(_isPublish_all_1);
    }
    boolean _isTty = container.isTty();
    if (_isTty) {
      boolean _isTty_1 = container.isTty();
      create.withTty(_isTty_1);
    }
    boolean _isStdin_open = container.isStdin_open();
    if (_isStdin_open) {
      boolean _isStdin_open_1 = container.isStdin_open();
      create.withStdInOnce(_isStdin_open_1);
    }
    String _user = container.getUser();
    boolean _notEquals_9 = (!Objects.equal(_user, null));
    if (_notEquals_9) {
      String _user_1 = container.getUser();
      create.withUser(_user_1);
    }
    String _volumes = container.getVolumes();
    boolean _notEquals_10 = (!Objects.equal(_volumes, null));
    if (_notEquals_10) {
      String _volumes_1 = container.getVolumes();
      Volume _volume = new Volume(_volumes_1);
      create.withVolumes(_volume);
    }
    int _mem_limit = container.getMem_limit();
    boolean _greaterThan_1 = (_mem_limit > 0);
    if (_greaterThan_1) {
      int _mem_limit_1 = container.getMem_limit();
      create.withMemoryLimit(_mem_limit_1);
    }
    int _memory_swap = container.getMemory_swap();
    boolean _greaterThan_2 = (_memory_swap > 0);
    if (_greaterThan_2) {
      int _memory_swap_1 = container.getMemory_swap();
      create.withMemorySwap(_memory_swap_1);
    }
    String _lxc_conf = container.getLxc_conf();
    boolean _notEquals_11 = (!Objects.equal(_lxc_conf, null));
    if (_notEquals_11) {
      final LxcConf lxcCon = new LxcConf("key", "value");
      create.withLxcConf(lxcCon);
    }
    int _cores = container.getCores();
    boolean _greaterThan_3 = (_cores > 0);
    if (_greaterThan_3) {
      int _cores_1 = container.getCores();
      String _valueOf = String.valueOf(_cores_1);
      create.withCpuset(_valueOf);
    }
    return create;
  }
  
  public CreateContainerCmd containerFactory(final Container container, final DockerClient dockerClient, final Multimap<String, String> containerDependency) {
    CreateContainerCmd create = null;
    String _image = container.getImage();
    boolean _notEquals = (!Objects.equal(_image, null));
    if (_notEquals) {
      String _image_1 = container.getImage();
      CreateContainerCmd _createContainerCmd = dockerClient.createContainerCmd(_image_1);
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
    boolean _notEquals_1 = (!Objects.equal(_command, null));
    if (_notEquals_1) {
      String _command_1 = container.getCommand();
      final String[] cmd = _command_1.split(",");
      create.withCmd(cmd);
    } else {
      String _command_2 = container.getCommand();
      boolean _equals_1 = Objects.equal(_command_2, null);
      if (_equals_1) {
        create.withCmd("sleep", "9999");
      }
    }
    int _cpu_shares = container.getCpu_shares();
    boolean _greaterThan = (_cpu_shares > 0);
    if (_greaterThan) {
      int _cpu_shares_1 = container.getCpu_shares();
      create.withCpuShares(_cpu_shares_1);
    }
    String _add_host = container.getAdd_host();
    boolean _notEquals_2 = (!Objects.equal(_add_host, null));
    if (_notEquals_2) {
      String _hostname = container.getHostname();
      create.withHostName(_hostname);
    }
    String _cpuset = container.getCpuset();
    boolean _notEquals_3 = (!Objects.equal(_cpuset, null));
    if (_notEquals_3) {
      String _cpuset_1 = container.getCpuset();
      create.withCpuset(_cpuset_1);
    }
    boolean _isPrivileged = container.isPrivileged();
    if (_isPrivileged) {
      boolean _isPrivileged_1 = container.isPrivileged();
      create.withPrivileged(_isPrivileged_1);
    }
    String _dns = container.getDns();
    boolean _notEquals_4 = (!Objects.equal(_dns, null));
    if (_notEquals_4) {
      String _dns_1 = container.getDns();
      create.withDns(_dns_1);
    }
    String _environment = container.getEnvironment();
    boolean _notEquals_5 = (!Objects.equal(_environment, null));
    if (_notEquals_5) {
      String _environment_1 = container.getEnvironment();
      create.withEnv(_environment_1);
    }
    String _ports = container.getPorts();
    boolean _notEquals_6 = (!Objects.equal(_ports, null));
    if (_notEquals_6) {
      String _ports_1 = container.getPorts();
      final String[] ports = _ports_1.split(":");
      String _get = ports[0];
      int _parseInt = Integer.parseInt(_get);
      ExposedPort port = ExposedPort.tcp(_parseInt);
      final Ports portBindings = new Ports();
      int _size = ((List<String>)Conversions.doWrapArray(ports)).size();
      boolean _equals_2 = (_size == 2);
      if (_equals_2) {
        String _get_1 = ports[1];
        int _parseInt_1 = Integer.parseInt(_get_1);
        Ports.Binding _Binding = Ports.Binding(Integer.valueOf(_parseInt_1));
        portBindings.bind(port, _Binding);
      } else {
        int _size_1 = ((List<String>)Conversions.doWrapArray(ports)).size();
        boolean _equals_3 = (_size_1 == 1);
        if (_equals_3) {
          String _get_2 = ports[0];
          int _parseInt_2 = Integer.parseInt(_get_2);
          Ports.Binding _Binding_1 = Ports.Binding(Integer.valueOf(_parseInt_2));
          portBindings.bind(port, _Binding_1);
        }
      }
      create.withPortBindings(portBindings);
    }
    String _name = container.getName();
    boolean _notEquals_7 = (!Objects.equal(_name, null));
    if (_notEquals_7) {
      String _name_1 = container.getName();
      create.withName(_name_1);
    }
    String _net = container.getNet();
    boolean _notEquals_8 = (!Objects.equal(_net, null));
    if (_notEquals_8) {
      String _net_1 = container.getNet();
      create.withNetworkMode(_net_1);
    }
    boolean _isPublish_all = container.isPublish_all();
    if (_isPublish_all) {
      boolean _isPublish_all_1 = container.isPublish_all();
      create.withPublishAllPorts(_isPublish_all_1);
    }
    boolean _isTty = container.isTty();
    if (_isTty) {
      boolean _isTty_1 = container.isTty();
      create.withTty(_isTty_1);
    }
    boolean _isStdin_open = container.isStdin_open();
    if (_isStdin_open) {
      boolean _isStdin_open_1 = container.isStdin_open();
      create.withStdInOnce(_isStdin_open_1);
    }
    String _user = container.getUser();
    boolean _notEquals_9 = (!Objects.equal(_user, null));
    if (_notEquals_9) {
      String _user_1 = container.getUser();
      create.withUser(_user_1);
    }
    String _volumes = container.getVolumes();
    boolean _notEquals_10 = (!Objects.equal(_volumes, null));
    if (_notEquals_10) {
      String _volumes_1 = container.getVolumes();
      Volume _volume = new Volume(_volumes_1);
      create.withVolumes(_volume);
    }
    int _mem_limit = container.getMem_limit();
    boolean _greaterThan_1 = (_mem_limit > 0);
    if (_greaterThan_1) {
      int _mem_limit_1 = container.getMem_limit();
      create.withMemoryLimit(_mem_limit_1);
    }
    int _memory_swap = container.getMemory_swap();
    boolean _greaterThan_2 = (_memory_swap > 0);
    if (_greaterThan_2) {
      int _memory_swap_1 = container.getMemory_swap();
      create.withMemorySwap(_memory_swap_1);
    }
    String _lxc_conf = container.getLxc_conf();
    boolean _notEquals_11 = (!Objects.equal(_lxc_conf, null));
    if (_notEquals_11) {
      final LxcConf lxcCon = new LxcConf("key", "value");
      create.withLxcConf(lxcCon);
    }
    int _cores = container.getCores();
    boolean _greaterThan_3 = (_cores > 0);
    if (_greaterThan_3) {
      int _cores_1 = container.getCores();
      String _valueOf = String.valueOf(_cores_1);
      create.withCpuset(_valueOf);
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
      boolean _greaterThan_4 = (_size_2 > 1);
      if (_greaterThan_4) {
        final List<Link> _converted_dockeClientlinks = (List<Link>)dockeClientlinks;
        create.withLinks(((Link[])Conversions.unwrapArray(_converted_dockeClientlinks, Link.class)));
      } else {
        int _size_3 = depdupeContainers.size();
        boolean _equals_4 = (_size_3 == 1);
        if (_equals_4) {
          create.withLinks(dockeClientlink);
        }
      }
    }
    return create;
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
    DockerClient dockerClient = null;
    boolean _equals = Objects.equal(dockerClient, null);
    if (_equals) {
      String _name = machine.getName();
      DockerClient _setConfig = this.setConfig(_name);
      dockerClient = _setConfig;
    }
    InspectContainerCmd _inspectContainerCmd = dockerClient.inspectContainerCmd(containerId);
    final InspectContainerResponse inspectContainerResponse = _inspectContainerCmd.exec();
    return inspectContainerResponse;
  }
  
  public Void startContainer(final Machine machine, final Container container) {
    Void _xblockexpression = null;
    {
      DockerClient dockerClient = null;
      boolean _notEquals = (!Objects.equal(DockerContainerManager.dockerClient, null));
      if (_notEquals) {
        dockerClient = DockerContainerManager.dockerClient;
      } else {
        String _name = machine.getName();
        DockerClient _setConfig = this.setConfig(_name);
        dockerClient = _setConfig;
      }
      String _id = container.getId();
      StartContainerCmd _startContainerCmd = dockerClient.startContainerCmd(_id);
      _xblockexpression = _startContainerCmd.exec();
    }
    return _xblockexpression;
  }
  
  public Void startContainer(final Machine machine, final String containerId) {
    Void _xblockexpression = null;
    {
      DockerClient dockerClient = null;
      boolean _equals = Objects.equal(dockerClient, null);
      if (_equals) {
        String _name = machine.getName();
        DockerClient _setConfig = this.setConfig(_name);
        dockerClient = _setConfig;
      }
      StartContainerCmd _startContainerCmd = dockerClient.startContainerCmd(containerId);
      _xblockexpression = _startContainerCmd.exec();
    }
    return _xblockexpression;
  }
  
  public Void stopContainer(final Machine machine, final Container container) {
    Void _xblockexpression = null;
    {
      DockerClient dockerClient = null;
      boolean _equals = Objects.equal(dockerClient, null);
      if (_equals) {
        String _name = machine.getName();
        DockerClient _setConfig = this.setConfig(_name);
        dockerClient = _setConfig;
      }
      String _id = container.getId();
      StopContainerCmd _stopContainerCmd = dockerClient.stopContainerCmd(_id);
      _xblockexpression = _stopContainerCmd.exec();
    }
    return _xblockexpression;
  }
  
  public Void stopContainer(final Machine machine, final String containerId) {
    Void _xblockexpression = null;
    {
      DockerClient dockerClient = null;
      boolean _equals = Objects.equal(dockerClient, null);
      if (_equals) {
        String _name = machine.getName();
        DockerClient _setConfig = this.setConfig(_name);
        dockerClient = _setConfig;
      }
      StopContainerCmd _stopContainerCmd = dockerClient.stopContainerCmd(containerId);
      _xblockexpression = _stopContainerCmd.exec();
    }
    return _xblockexpression;
  }
  
  public Integer waitContainer(final Machine machine, final Container container) {
    Integer _xblockexpression = null;
    {
      DockerClient dockerClient = null;
      boolean _equals = Objects.equal(dockerClient, null);
      if (_equals) {
        String _name = machine.getName();
        DockerClient _setConfig = this.setConfig(_name);
        dockerClient = _setConfig;
      }
      String _id = container.getId();
      WaitContainerCmd _waitContainerCmd = dockerClient.waitContainerCmd(_id);
      _xblockexpression = _waitContainerCmd.exec();
    }
    return _xblockexpression;
  }
  
  public List<com.github.dockerjava.api.model.Container> listContainer(final String machineName) {
    DockerClient dockerClient = null;
    boolean _equals = Objects.equal(dockerClient, null);
    if (_equals) {
      DockerClient _setConfig = this.setConfig(machineName);
      dockerClient = _setConfig;
    }
    ListContainersCmd _listContainersCmd = dockerClient.listContainersCmd();
    ListContainersCmd _withShowAll = _listContainersCmd.withShowAll(true);
    final List<com.github.dockerjava.api.model.Container> containers = _withShowAll.exec();
    return containers;
  }
  
  public DockerClient pullImage(final Machine machine, final String image) {
    DockerClient dockerClient = null;
    boolean _equals = Objects.equal(dockerClient, null);
    if (_equals) {
      String _name = machine.getName();
      DockerClient _setConfig = this.setConfig(_name);
      dockerClient = _setConfig;
    }
    String containerImage = image;
    boolean _isNotBlank = StringUtils.isNotBlank(containerImage);
    boolean _not = (!_isNotBlank);
    if (_not) {
      containerImage = "busybox";
      DockerContainerManager.LOGGER.info(("Use default image: " + containerImage));
    }
    String output = null;
    String _name_1 = machine.getName();
    boolean _machineContainsImage = this.machineContainsImage(_name_1, containerImage);
    boolean _not_1 = (!_machineContainsImage);
    if (_not_1) {
      DockerContainerManager.LOGGER.info(("Downloading image: ->" + containerImage));
      String _name_2 = machine.getName();
      this.addImageToMachine(_name_2, containerImage);
      PullImageCmd _pullImageCmd = dockerClient.pullImageCmd(containerImage);
      PullImageCmd _withTag = _pullImageCmd.withTag("latest");
      InputStream _exec = _withTag.exec();
      String _asString = DockerUtil.asString(_exec);
      output = _asString;
      DockerContainerManager.LOGGER.info(output);
      DockerContainerManager.LOGGER.info("Download is finished");
    }
    return dockerClient;
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
  
  public DockerClient setConfig(final String machine) {
    try {
      final DockerConfig lconfig = new DockerConfig();
      final Properties dockerClientconfig = lconfig.loadConfig();
      DockerContainerManager.LOGGER.info(("Connection inside docker-machine ---> " + machine));
      String port = null;
      Runtime _runtime = Runtime.getRuntime();
      String ENDPOINT = DockerMachineManager.urlCmd(_runtime, machine);
      final String certPath = DockerUtil.getEnv(machine);
      String _oS = DockerUtil.getOS();
      boolean _equals = _oS.equals("osx");
      if (_equals) {
        port = ":2376";
      } else {
        String _oS_1 = DockerUtil.getOS();
        boolean _equals_1 = _oS_1.equals("uni");
        if (_equals_1) {
          port = ":2375";
        }
      }
      final URL url = new URL(ENDPOINT);
      String _protocol = url.getProtocol();
      String _host = url.getHost();
      String _path = url.getPath();
      String _query = url.getQuery();
      final URI uri = new URI(_protocol, _host, _path, _query, null);
      String _string = uri.toString();
      final String dockerUri = (_string + port);
      String _string_1 = dockerUri.toString();
      String _plus = ((("Connection inside machine: " + machine) + " with uri: ") + _string_1);
      DockerContainerManager.LOGGER.info(_plus);
      DockerClientConfig.DockerClientConfigBuilder _createDefaultConfigBuilder = DockerClientConfig.createDefaultConfigBuilder();
      Object _get = dockerClientconfig.get("docker.version");
      String _string_2 = _get.toString();
      DockerClientConfig.DockerClientConfigBuilder _withVersion = _createDefaultConfigBuilder.withVersion(_string_2);
      DockerClientConfig.DockerClientConfigBuilder _withUri = _withVersion.withUri(dockerUri);
      Object _get_1 = dockerClientconfig.get("docker.username");
      String _string_3 = _get_1.toString();
      DockerClientConfig.DockerClientConfigBuilder _withUsername = _withUri.withUsername(_string_3);
      Object _get_2 = dockerClientconfig.get("docker.password");
      String _string_4 = _get_2.toString();
      DockerClientConfig.DockerClientConfigBuilder _withPassword = _withUsername.withPassword(_string_4);
      Object _get_3 = dockerClientconfig.get("docker.email");
      String _string_5 = _get_3.toString();
      DockerClientConfig.DockerClientConfigBuilder _withEmail = _withPassword.withEmail(_string_5);
      DockerClientConfig.DockerClientConfigBuilder _withServerAddress = _withEmail.withServerAddress("https://index.docker.io/v1/");
      DockerClientConfig.DockerClientConfigBuilder _withDockerCertPath = _withServerAddress.withDockerCertPath(certPath);
      final DockerClientConfig config = _withDockerCertPath.build();
      DockerClientBuilder _instance = DockerClientBuilder.getInstance(config);
      final DockerClient dockerClient = _instance.build();
      return dockerClient;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void connect() {
    Session session = null;
    final File test = new File("test");
    final String host = "192.168.99.100";
    try {
      final JSch jsc = new JSch();
      jsc.setKnownHosts("test");
      jsc.addIdentity("/Users/spirals/.docker/machine/machines/bingo/id_rsa");
      final String user = "docker";
      Session _session = jsc.getSession(user, host, 22);
      session = _session;
      session.connect();
    } catch (final Throwable _t) {
      if (_t instanceof JSchException) {
        final JSchException e = (JSchException)_t;
        String _string = e.toString();
        DockerContainerManager.LOGGER.info(_string);
        HostKey _hostKey = session.getHostKey();
        String _key = _hostKey.getKey();
        this.addHost(_key, host, "test");
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    try {
      final JSch jsc_1 = new JSch();
      jsc_1.setKnownHosts("test");
      jsc_1.addIdentity("/Users/spirals/.docker/machine/machines/bingo/id_rsa");
      final String user_1 = "docker";
      Session _session_1 = jsc_1.getSession(user_1, host, 22);
      session = _session_1;
      session.connect();
      final Channel channel = session.openChannel("shell");
      channel.setInputStream(System.in);
      channel.setOutputStream(System.out);
      channel.connect();
    } catch (final Throwable _t_1) {
      if (_t_1 instanceof JSchException) {
        final JSchException e_1 = (JSchException)_t_1;
        String _string_1 = e_1.toString();
        DockerContainerManager.LOGGER.info(_string_1);
      } else {
        throw Exceptions.sneakyThrow(_t_1);
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
        String _absolutePath = test.getAbsolutePath();
        jsc.setKnownHosts(_absolutePath);
        jsc.addIdentity(privateKey);
        Session _session = jsc.getSession(user, host, 22);
        session = _session;
        session.connect();
      } catch (final Throwable _t) {
        if (_t instanceof JSchException) {
          final JSchException e = (JSchException)_t;
          String _string = e.toString();
          DockerContainerManager.LOGGER.info(_string);
          HostKey _hostKey = session.getHostKey();
          String _key = _hostKey.getKey();
          String _plus_1 = (tempDir + "/hosts");
          this.addHost(_key, host, _plus_1);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      try {
        final JSch jsc_1 = new JSch();
        String _absolutePath_1 = test.getAbsolutePath();
        jsc_1.setKnownHosts(_absolutePath_1);
        jsc_1.addIdentity(privateKey);
        final String exCommand = ((("sudo sh -c " + "\"") + command) + "\"");
        DockerContainerManager.LOGGER.info(exCommand);
        Session _session_1 = jsc_1.getSession(user, host, 22);
        session = _session_1;
        session.connect();
        final Channel channel = session.openChannel("exec");
        ((ChannelExec) channel).setCommand(exCommand);
        ((ChannelExec) channel).setErrStream(System.err);
        channel.connect();
      } catch (final Throwable _t_1) {
        if (_t_1 instanceof JSchException) {
          final JSchException e_1 = (JSchException)_t_1;
          String _string_1 = e_1.toString();
          DockerContainerManager.LOGGER.info(_string_1);
        } else {
          throw Exceptions.sneakyThrow(_t_1);
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
  
  public static void main(final String[] args) {
    final DockerContainerManager main = new DockerContainerManager();
    main.listContainer("occiware");
  }
}
