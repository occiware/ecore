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
package org.occiware.clouddesigner.occi.cloud.connector.cloudproviders;

import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import com.google.common.io.Closeables;
import com.google.inject.Module;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.jclouds.ContextBuilder;
import org.jclouds.apis.ApiMetadata;
import org.jclouds.apis.Apis;
import org.jclouds.compute.ComputeService;
import org.jclouds.compute.ComputeServiceContext;
import org.jclouds.compute.domain.ComputeMetadata;
import org.jclouds.compute.domain.Hardware;
import org.jclouds.compute.domain.Image;
import org.jclouds.compute.domain.NodeMetadata;
import org.jclouds.compute.domain.Template;
import org.jclouds.compute.domain.TemplateBuilder;
import org.jclouds.domain.Location;
import org.jclouds.logging.slf4j.config.SLF4JLoggingModule;
import org.jclouds.openstack.nova.v2_0.NovaApi;
import org.jclouds.openstack.nova.v2_0.domain.ServerCreated;
import org.jclouds.openstack.nova.v2_0.domain.Volume;
import org.jclouds.openstack.nova.v2_0.domain.VolumeAttachment;
import org.jclouds.openstack.nova.v2_0.extensions.VolumeApi;
import org.jclouds.openstack.nova.v2_0.features.ServerApi;
import org.jclouds.openstack.nova.v2_0.options.CreateServerOptions;
import org.jclouds.openstack.nova.v2_0.options.CreateVolumeOptions;
import org.jclouds.providers.ProviderMetadata;
import org.jclouds.providers.Providers;
import org.jclouds.sshj.config.SshjSshClientModule;
import org.occiware.clouddesigner.occi.cloud.Machine_OpenStack;
import org.occiware.clouddesigner.occi.cloud.connector.cloudproviders.IaaSHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class JcloudsOpenStack extends IaaSHandler implements Closeable {
  private static Logger LOGGER = LoggerFactory.getLogger(JcloudsOpenStack.class);
  
  private Machine_OpenStack machine;
  
  private ComputeServiceContext context;
  
  private NovaApi novaApi;
  
  public JcloudsOpenStack() {
  }
  
  public JcloudsOpenStack(final Machine_OpenStack machine) {
    this.machine = machine;
    ComputeServiceContext _createContext = this.createContext();
    this.context = _createContext;
  }
  
  /**
   * Initialize the context
   */
  public ComputeServiceContext createContext() {
    SshjSshClientModule _sshjSshClientModule = new SshjSshClientModule();
    SLF4JLoggingModule _sLF4JLoggingModule = new SLF4JLoggingModule();
    final Iterable<Module> modules = ImmutableSet.<Module>of(_sshjSshClientModule, _sLF4JLoggingModule);
    Iterable<ProviderMetadata> p = Providers.all();
    String _string = p.toString();
    JcloudsOpenStack.LOGGER.info(_string);
    Iterable<ApiMetadata> apis = Apis.all();
    String _string_1 = apis.toString();
    JcloudsOpenStack.LOGGER.info(_string_1);
    String _provider = this.machine.getProvider();
    JcloudsOpenStack.LOGGER.info(_provider);
    String _string_2 = ComputeServiceContext.class.toString();
    JcloudsOpenStack.LOGGER.info(_string_2);
    ComputeServiceContext context = null;
    try {
      String _provider_1 = this.machine.getProvider();
      ContextBuilder _newBuilder = ContextBuilder.newBuilder(_provider_1);
      String _identity = this.identity();
      String _password = this.machine.getPassword();
      ContextBuilder _credentials = _newBuilder.credentials(_identity, _password);
      String _endpoint = this.machine.getEndpoint();
      ContextBuilder _endpoint_1 = _credentials.endpoint(_endpoint);
      ContextBuilder _modules = _endpoint_1.modules(modules);
      ComputeServiceContext _buildView = _modules.<ComputeServiceContext>buildView(
        ComputeServiceContext.class);
      context = _buildView;
      JcloudsOpenStack.LOGGER.info("The context is created Successfully ..");
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        String _message = e.getMessage();
        JcloudsOpenStack.LOGGER.error(_message);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return context;
  }
  
  /**
   * Create a new machine on OpenStack
   */
  @Override
  public Object createMachine() {
    try {
      JcloudsOpenStack.LOGGER.info("Creating machine ..");
      String groupName = "graphical";
      ComputeService _computeService = this.context.getComputeService();
      TemplateBuilder templateBuilder = _computeService.templateBuilder();
      String _security_group = this.machine.getSecurity_group();
      boolean _notEquals = (!Objects.equal(_security_group, null));
      if (_notEquals) {
        String _security_group_1 = this.machine.getSecurity_group();
        groupName = _security_group_1;
      }
      String _name = this.machine.getName();
      boolean _notEquals_1 = (!Objects.equal(_name, null));
      if (_notEquals_1) {
      }
      float _memory = this.machine.getMemory();
      boolean _greaterThan = (_memory > 0.0);
      if (_greaterThan) {
        float _memory_1 = this.machine.getMemory();
        int _intValue = Float.valueOf(_memory_1).intValue();
        templateBuilder.minRam(_intValue);
      }
      String _region = this.machine.getRegion();
      boolean _notEquals_2 = (!Objects.equal(_region, null));
      if (_notEquals_2) {
        String _region_1 = this.machine.getRegion();
        templateBuilder.locationId(_region_1);
      } else {
        List<Location> _listLocations = this.listLocations();
        Location location = this.<Location>getOneElement(_listLocations);
        String _id = location.getId();
        templateBuilder.locationId(_id);
      }
      String _flavor_id = this.machine.getFlavor_id();
      boolean _notEquals_3 = (!Objects.equal(_flavor_id, null));
      if (_notEquals_3) {
        String _flavor_id_1 = this.machine.getFlavor_id();
        templateBuilder.hardwareId(_flavor_id_1);
      } else {
        List<Hardware> _listHardware = this.listHardware();
        Hardware hardware = this.<Hardware>getOneElement(_listHardware);
        String _id_1 = hardware.getId();
        templateBuilder.hardwareId(_id_1);
      }
      String _image_id = this.machine.getImage_id();
      boolean _notEquals_4 = (!Objects.equal(_image_id, null));
      if (_notEquals_4) {
        String _image_id_1 = this.machine.getImage_id();
        templateBuilder.imageId(_image_id_1);
      } else {
        List<Image> _listImages = this.listImages();
        Image image = this.<Image>getOneElement(_listImages);
        templateBuilder.fromImage(image);
      }
      Template template = templateBuilder.build();
      JcloudsOpenStack.LOGGER.info((" >> Adding node to group = " + groupName));
      ComputeService _computeService_1 = this.context.getComputeService();
      Set<? extends NodeMetadata> nodes = _computeService_1.createNodesInGroup(groupName, 1, template);
      Iterator<? extends NodeMetadata> _iterator = nodes.iterator();
      NodeMetadata lastNodeMetadata = _iterator.next();
      String _id_2 = lastNodeMetadata.getId();
      this.machine.setId(_id_2);
      String _name_1 = lastNodeMetadata.getName();
      this.machine.setId(_name_1);
      JcloudsOpenStack.LOGGER.info("Machine is create ...");
      return lastNodeMetadata.getId();
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception exception = (Exception)_t;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return null;
  }
  
  public String launchMachine() {
    String _name = this.machine.getName();
    String _plus = ("Launching machine: " + _name);
    JcloudsOpenStack.LOGGER.info(_plus);
    SLF4JLoggingModule _sLF4JLoggingModule = new SLF4JLoggingModule();
    Iterable<Module> modules = ImmutableSet.<Module>of(_sLF4JLoggingModule);
    String _provider = this.machine.getProvider();
    ContextBuilder _newBuilder = ContextBuilder.newBuilder(_provider);
    String _endpoint = this.machine.getEndpoint();
    ContextBuilder _endpoint_1 = _newBuilder.endpoint(_endpoint);
    String _identity = this.identity();
    String _password = this.machine.getPassword();
    ContextBuilder _credentials = _endpoint_1.credentials(_identity, _password);
    ContextBuilder _modules = _credentials.modules(modules);
    NovaApi _buildApi = _modules.<NovaApi>buildApi(NovaApi.class);
    this.novaApi = _buildApi;
    List<Location> _listLocations = this.listLocations();
    Location location = this.<Location>getOneElement(_listLocations);
    final String anyZoneName = location.getId();
    Map<String, String> metadata = new HashMap<String, String>(3);
    String _name_1 = this.machine.getName();
    metadata.put("Server Name", _name_1);
    metadata.put("Root Instance Name", "rootInstanceName");
    metadata.put("Created by", "OCCIWARE Cloud Connector");
    try {
      CreateServerOptions options = null;
      ServerCreated server = null;
      String _keypair = this.machine.getKeypair();
      boolean _notEquals = (!Objects.equal(_keypair, null));
      if (_notEquals) {
        String _keypair_1 = this.machine.getKeypair();
        CreateServerOptions _keyPairName = CreateServerOptions.Builder.keyPairName(_keypair_1);
        options = _keyPairName;
      } else {
      }
      String _security_group = this.machine.getSecurity_group();
      boolean _notEquals_1 = (!Objects.equal(_security_group, null));
      if (_notEquals_1) {
        String _security_group_1 = this.machine.getSecurity_group();
        CreateServerOptions _securityGroupNames = options.securityGroupNames(_security_group_1);
        _securityGroupNames.metadata(metadata);
      } else {
      }
      String _network_id = this.machine.getNetwork_id();
      boolean _notEquals_2 = (!Objects.equal(_network_id, null));
      if (_notEquals_2) {
        String _network_id_1 = this.machine.getNetwork_id();
        options.networks(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(_network_id_1)));
      }
      String _flavor_id = this.machine.getFlavor_id();
      boolean _notEquals_3 = (!Objects.equal(_flavor_id, null));
      if (_notEquals_3) {
        String _image_id = this.machine.getImage_id();
        boolean _notEquals_4 = (!Objects.equal(_image_id, null));
        if (_notEquals_4) {
          ServerApi _serverApiForZone = this.novaApi.getServerApiForZone(anyZoneName);
          String _name_2 = this.machine.getName();
          String _image_id_1 = this.machine.getImage_id();
          String _flavor_id_1 = this.machine.getFlavor_id();
          ServerCreated _create = _serverApiForZone.create(_name_2, _image_id_1, _flavor_id_1, options);
          server = _create;
        } else {
          List<Image> _listImages = this.listImages();
          Image image = this.<Image>getOneElement(_listImages);
          ServerApi _serverApiForZone_1 = this.novaApi.getServerApiForZone(anyZoneName);
          String _name_3 = this.machine.getName();
          String _id = image.getId();
          String _flavor_id_2 = this.machine.getFlavor_id();
          ServerCreated _create_1 = _serverApiForZone_1.create(_name_3, _id, _flavor_id_2, options);
          server = _create_1;
        }
      } else {
      }
      final String machineId = server.getId();
      this.novaApi.close();
      this.machine.setId(machineId);
      String _id_1 = this.machine.getId();
      String _plus_1 = ("Machine id: " + _id_1);
      JcloudsOpenStack.LOGGER.info(_plus_1);
      return machineId;
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        String _message = e.getMessage();
        JcloudsOpenStack.LOGGER.error(_message);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return null;
  }
  
  public String createMachines() {
    String _name = this.machine.getName();
    String _plus = ("Creating machine: " + _name);
    JcloudsOpenStack.LOGGER.info(_plus);
    SLF4JLoggingModule _sLF4JLoggingModule = new SLF4JLoggingModule();
    Iterable<Module> modules = ImmutableSet.<Module>of(_sLF4JLoggingModule);
    String _provider = this.machine.getProvider();
    ContextBuilder _newBuilder = ContextBuilder.newBuilder(_provider);
    String _endpoint = this.machine.getEndpoint();
    ContextBuilder _endpoint_1 = _newBuilder.endpoint(_endpoint);
    String _identity = this.identity();
    String _password = this.machine.getPassword();
    ContextBuilder _credentials = _endpoint_1.credentials(_identity, _password);
    ContextBuilder _modules = _credentials.modules(modules);
    NovaApi novaApi = _modules.<NovaApi>buildApi(NovaApi.class);
    Set<String> _configuredZones = novaApi.getConfiguredZones();
    Iterator<String> _iterator = _configuredZones.iterator();
    final String anyZoneName = _iterator.next();
    Map<String, String> metadata = new HashMap<String, String>(3);
    String _name_1 = this.machine.getName();
    metadata.put("Application Name", _name_1);
    metadata.put("Root Instance Name", "rootInstanceName");
    metadata.put("Created by", "CloudConnector");
    try {
      String _keypair = this.machine.getKeypair();
      CreateServerOptions _keyPairName = CreateServerOptions.Builder.keyPairName(_keypair);
      String _security_group = this.machine.getSecurity_group();
      CreateServerOptions _securityGroupNames = _keyPairName.securityGroupNames(_security_group);
      CreateServerOptions _metadata = _securityGroupNames.metadata(metadata);
      String _network_id = this.machine.getNetwork_id();
      CreateServerOptions options = _metadata.networks(_network_id);
      ServerApi _serverApiForZone = novaApi.getServerApiForZone(anyZoneName);
      String _name_2 = this.machine.getName();
      String _image_id = this.machine.getImage_id();
      String _flavor_id = this.machine.getFlavor_id();
      ServerCreated server = _serverApiForZone.create(_name_2, _image_id, _flavor_id, options);
      final String machineId = server.getId();
      novaApi.close();
      this.machine.setId(machineId);
      return machineId;
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        String _message = e.getMessage();
        JcloudsOpenStack.LOGGER.error(_message);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return null;
  }
  
  /**
   * List all images available on OpenStack
   */
  @Override
  public List<Image> listImages() {
    ComputeService _computeService = this.context.getComputeService();
    Set<? extends Image> images = _computeService.listImages();
    boolean _notEquals = (!Objects.equal(images, null));
    if (_notEquals) {
      return new ArrayList<Image>(images);
    }
    return new ArrayList<Image>();
  }
  
  /**
   * List all images available on OpenStack
   */
  @Override
  public List<NodeMetadata> listMachines() {
    ComputeService _computeService = this.context.getComputeService();
    Set<? extends ComputeMetadata> nodes = _computeService.listNodes();
    List<NodeMetadata> instancesList = new ArrayList<NodeMetadata>();
    boolean _notEquals = (!Objects.equal(nodes, null));
    if (_notEquals) {
      for (final ComputeMetadata node : nodes) {
        {
          ComputeService _computeService_1 = this.context.getComputeService();
          String _id = node.getId();
          NodeMetadata metadata = _computeService_1.getNodeMetadata(_id);
          instancesList.add(metadata);
        }
      }
    }
    return instancesList;
  }
  
  /**
   * List all hardware/flavor available on OpenStack
   */
  @Override
  public List<Hardware> listHardware() {
    ComputeService _computeService = this.context.getComputeService();
    Set<? extends Hardware> flavors = _computeService.listHardwareProfiles();
    boolean _notEquals = (!Objects.equal(flavors, null));
    if (_notEquals) {
      return new ArrayList<Hardware>(flavors);
    }
    return new ArrayList<Hardware>();
  }
  
  /**
   * List all locations on a OpensStack
   */
  @Override
  public List<Location> listLocations() {
    List<Location> instancesList = new ArrayList<Location>();
    ComputeService _computeService = this.context.getComputeService();
    Set<? extends Location> listAssignableLocations = _computeService.listAssignableLocations();
    instancesList.addAll(listAssignableLocations);
    return instancesList;
  }
  
  public Object terminateMachine(final String machineId) {
    return null;
  }
  
  /**
   * Restart a machine
   */
  @Override
  public Object restartMachine() {
    return null;
  }
  
  /**
   * start a machine
   */
  @Override
  public Object startMachine() {
    return null;
  }
  
  /**
   * Stop machine
   */
  @Override
  public void stopMachine() {
    try {
      ComputeService _computeService = this.context.getComputeService();
      String _id = this.machine.getId();
      _computeService.suspendNode(_id);
      String _id_1 = this.machine.getId();
      String _plus = ("Stopping the machine: " + _id_1);
      JcloudsOpenStack.LOGGER.info(_plus);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  @Override
  public void stopMachine(final String machineId) {
    try {
      ComputeService _computeService = this.context.getComputeService();
      _computeService.suspendNode(machineId);
      String _id = this.machine.getId();
      String _plus = ("Stopping the machine: " + _id);
      JcloudsOpenStack.LOGGER.info(_plus);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  /**
   * Retrieve user identity
   */
  public String identity() {
    String _tenant = this.machine.getTenant();
    String _plus = (_tenant + ":");
    String _username = this.machine.getUsername();
    return (_plus + _username);
  }
  
  public <T extends Object> T getOneElement(final List<T> element) {
    Random _random = new Random();
    int _size = element.size();
    int _nextInt = _random.nextInt(_size);
    return element.get(_nextInt);
  }
  
  /**
   * Always close the service when no longer used.
   */
  @Override
  public void close() {
    try {
      Closeables.close(this.context, true);
      Closeables.close(this.novaApi, true);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Create volume
   */
  @Override
  public Volume createVolume(final String volumeName, final Integer size) {
    Optional<? extends VolumeApi> volumeTypeOption = null;
    NovaApi novaApi = this.context.<NovaApi>unwrapApi(NovaApi.class);
    Optional<? extends VolumeApi> _volumeExtensionForZone = novaApi.getVolumeExtensionForZone("siel");
    VolumeApi volumesApi = _volumeExtensionForZone.get();
    CreateVolumeOptions _name = CreateVolumeOptions.Builder.name(volumeName);
    CreateVolumeOptions _description = _name.description("OCCIware volume");
    Volume volume = volumesApi.create((size).intValue(), _description);
    return volume;
  }
  
  /**
   * Attach volume to a machine
   */
  @Override
  public void attachVolume(final String volumeId) {
    NovaApi novaApi = this.context.<NovaApi>unwrapApi(NovaApi.class);
    Optional<? extends VolumeApi> _volumeExtensionForZone = novaApi.getVolumeExtensionForZone("siel");
    VolumeApi volumesApi = _volumeExtensionForZone.get();
    String _id = this.machine.getId();
    VolumeAttachment result = volumesApi.attachVolumeToServerAsDevice(volumeId, _id, "/dev/vdc");
  }
  
  /**
   * Detach volume from machine
   */
  @Override
  public void detachVolume(final String volumeId) {
    NovaApi novaApi = this.context.<NovaApi>unwrapApi(NovaApi.class);
    Optional<? extends VolumeApi> _volumeExtensionForZone = novaApi.getVolumeExtensionForZone("siel");
    VolumeApi volumesApi = _volumeExtensionForZone.get();
    String _id = this.machine.getId();
    volumesApi.detachVolumeFromServer(volumeId, _id);
  }
  
  /**
   * Delete volume from machine
   */
  @Override
  public void deleteVolume() {
    NovaApi novaApi = this.context.<NovaApi>unwrapApi(NovaApi.class);
    Optional<? extends VolumeApi> _volumeExtensionForZone = novaApi.getVolumeExtensionForZone("siel");
    VolumeApi volumesApi = _volumeExtensionForZone.get();
    String _id = this.machine.getId();
    volumesApi.delete(_id);
  }
}
