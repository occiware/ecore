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

import java.io.Closeable;
import java.util.List;
import java.util.Random;
import org.occiware.clouddesigner.occi.cloud.Machine_OpenStack;
import org.occiware.clouddesigner.occi.cloud.connector.cloudproviders.IaaSHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class JcloudsOpenStack extends IaaSHandler implements Closeable {
  private static Logger LOGGER = LoggerFactory.getLogger(JcloudsOpenStack.class);
  
  private Machine_OpenStack machine;
  
  private /* ComputeServiceContext */Object context;
  
  private /* NovaApi */Object novaApi;
  
  public JcloudsOpenStack() {
  }
  
  public JcloudsOpenStack(final Machine_OpenStack machine) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field JcloudsOpenStack.context refers to the missing type ComputeServiceContext"
      + "\nThe method createContext() from the type JcloudsOpenStack refers to the missing type ComputeServiceContext");
  }
  
  /**
   * Initialize the context
   */
  public ComputeServiceContext createContext() {
    throw new Error("Unresolved compilation problems:"
      + "\nComputeServiceContext cannot be resolved to a type."
      + "\nComputeServiceContext cannot be resolved to a type."
      + "\nComputeServiceContext cannot be resolved to a type."
      + "\nSshjSshClientModule cannot be resolved."
      + "\nSLF4JLoggingModule cannot be resolved."
      + "\nThe method or field Providers is undefined"
      + "\nThe method or field Apis is undefined"
      + "\nThe method or field ContextBuilder is undefined"
      + "\nall cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\nall cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\nnewBuilder cannot be resolved"
      + "\ncredentials cannot be resolved"
      + "\nendpoint cannot be resolved"
      + "\nmodules cannot be resolved"
      + "\nbuildView cannot be resolved");
  }
  
  /**
   * Create a new machine on OpenStack
   */
  @Override
  public Object createMachine() {
    throw new Error("Unresolved compilation problems:"
      + "\nTemplateBuilder cannot be resolved to a type."
      + "\nTemplate cannot be resolved to a type."
      + "\nNodeMetadata cannot be resolved to a type."
      + "\nNodeMetadata cannot be resolved to a type."
      + "\nThe field JcloudsOpenStack.context refers to the missing type ComputeServiceContext"
      + "\nThe method listLocations() from the type JcloudsOpenStack refers to the missing type Location"
      + "\nThe method listHardware() from the type JcloudsOpenStack refers to the missing type Hardware"
      + "\nThe method listImages() from the type JcloudsOpenStack refers to the missing type Image"
      + "\nThe field JcloudsOpenStack.context refers to the missing type ComputeServiceContext"
      + "\ncomputeService cannot be resolved"
      + "\ntemplateBuilder cannot be resolved"
      + "\nminRam cannot be resolved"
      + "\nlocationId cannot be resolved"
      + "\nlocationId cannot be resolved"
      + "\nid cannot be resolved"
      + "\nhardwareId cannot be resolved"
      + "\nhardwareId cannot be resolved"
      + "\nid cannot be resolved"
      + "\nimageId cannot be resolved"
      + "\nfromImage cannot be resolved"
      + "\nbuild cannot be resolved"
      + "\ncomputeService cannot be resolved"
      + "\ncreateNodesInGroup cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nid cannot be resolved");
  }
  
  public String launchMachine() {
    throw new Error("Unresolved compilation problems:"
      + "\nNovaApi cannot be resolved to a type."
      + "\nCreateServerOptions cannot be resolved to a type."
      + "\nServerCreated cannot be resolved to a type."
      + "\nSLF4JLoggingModule cannot be resolved."
      + "\nThe method or field ContextBuilder is undefined"
      + "\nThe method or field CreateServerOptions is undefined"
      + "\nThe field JcloudsOpenStack.novaApi refers to the missing type NovaApi"
      + "\nThe method listLocations() from the type JcloudsOpenStack refers to the missing type Location"
      + "\nThe field JcloudsOpenStack.novaApi refers to the missing type NovaApi"
      + "\nThe method listImages() from the type JcloudsOpenStack refers to the missing type Image"
      + "\nThe field JcloudsOpenStack.novaApi refers to the missing type NovaApi"
      + "\nThe field JcloudsOpenStack.novaApi refers to the missing type NovaApi"
      + "\nnewBuilder cannot be resolved"
      + "\nendpoint cannot be resolved"
      + "\ncredentials cannot be resolved"
      + "\nmodules cannot be resolved"
      + "\nbuildApi cannot be resolved"
      + "\nid cannot be resolved"
      + "\nBuilder cannot be resolved"
      + "\nkeyPairName cannot be resolved"
      + "\nsecurityGroupNames cannot be resolved"
      + "\nmetadata cannot be resolved"
      + "\nnetworks cannot be resolved"
      + "\ngetServerApiForZone cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\ngetServerApiForZone cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\nid cannot be resolved"
      + "\ngetId cannot be resolved"
      + "\nclose cannot be resolved");
  }
  
  public String createMachines() {
    throw new Error("Unresolved compilation problems:"
      + "\nNovaApi cannot be resolved to a type."
      + "\nNovaApi cannot be resolved to a type."
      + "\nCreateServerOptions cannot be resolved to a type."
      + "\nServerCreated cannot be resolved to a type."
      + "\nSLF4JLoggingModule cannot be resolved."
      + "\nThe method or field ContextBuilder is undefined"
      + "\nThe method or field CreateServerOptions is undefined"
      + "\nnewBuilder cannot be resolved"
      + "\nendpoint cannot be resolved"
      + "\ncredentials cannot be resolved"
      + "\nmodules cannot be resolved"
      + "\nbuildApi cannot be resolved"
      + "\ngetConfiguredZones cannot be resolved"
      + "\niterator cannot be resolved"
      + "\nnext cannot be resolved"
      + "\nBuilder cannot be resolved"
      + "\nkeyPairName cannot be resolved"
      + "\nsecurityGroupNames cannot be resolved"
      + "\nmetadata cannot be resolved"
      + "\nnetworks cannot be resolved"
      + "\ngetServerApiForZone cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\ngetId cannot be resolved"
      + "\nclose cannot be resolved");
  }
  
  /**
   * List all images available on OpenStack
   */
  @Override
  public /* List<Image> */Object listImages() {
    throw new Error("Unresolved compilation problems:"
      + "\nImage cannot be resolved to a type."
      + "\nImage cannot be resolved to a type."
      + "\nImage cannot be resolved to a type."
      + "\nThe field JcloudsOpenStack.context refers to the missing type ComputeServiceContext"
      + "\ncomputeService cannot be resolved"
      + "\nlistImages cannot be resolved");
  }
  
  /**
   * List all images available on OpenStack
   */
  @Override
  public /* List<NodeMetadata> */Object listMachines() {
    throw new Error("Unresolved compilation problems:"
      + "\nComputeMetadata cannot be resolved to a type."
      + "\nNodeMetadata cannot be resolved to a type."
      + "\nNodeMetadata cannot be resolved to a type."
      + "\nComputeMetadata cannot be resolved to a type."
      + "\nNodeMetadata cannot be resolved to a type."
      + "\nThe field JcloudsOpenStack.context refers to the missing type ComputeServiceContext"
      + "\nThe field JcloudsOpenStack.context refers to the missing type ComputeServiceContext"
      + "\ncomputeService cannot be resolved"
      + "\nlistNodes cannot be resolved"
      + "\ncomputeService cannot be resolved"
      + "\ngetNodeMetadata cannot be resolved"
      + "\ngetId cannot be resolved");
  }
  
  /**
   * List all hardware/flavor available on OpenStack
   */
  @Override
  public /* List<Hardware> */Object listHardware() {
    throw new Error("Unresolved compilation problems:"
      + "\nHardware cannot be resolved to a type."
      + "\nHardware cannot be resolved to a type."
      + "\nHardware cannot be resolved to a type."
      + "\nThe field JcloudsOpenStack.context refers to the missing type ComputeServiceContext"
      + "\ncomputeService cannot be resolved"
      + "\nlistHardwareProfiles cannot be resolved");
  }
  
  /**
   * List all locations on a OpensStack
   */
  @Override
  public /* List<Location> */Object listLocations() {
    throw new Error("Unresolved compilation problems:"
      + "\nLocation cannot be resolved to a type."
      + "\nLocation cannot be resolved to a type."
      + "\nLocation cannot be resolved to a type."
      + "\nThe field JcloudsOpenStack.context refers to the missing type ComputeServiceContext"
      + "\ncomputeService cannot be resolved"
      + "\nlistAssignableLocations cannot be resolved");
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe field JcloudsOpenStack.context refers to the missing type ComputeServiceContext"
      + "\ncomputeService cannot be resolved"
      + "\nsuspendNode cannot be resolved");
  }
  
  @Override
  public void stopMachine(final String machineId) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field JcloudsOpenStack.context refers to the missing type ComputeServiceContext"
      + "\ncomputeService cannot be resolved"
      + "\nsuspendNode cannot be resolved");
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe field JcloudsOpenStack.context refers to the missing type ComputeServiceContext"
      + "\nThe field JcloudsOpenStack.novaApi refers to the missing type NovaApi");
  }
  
  /**
   * Create volume
   */
  @Override
  public Volume createVolume(final String volumeName, final Integer size) {
    throw new Error("Unresolved compilation problems:"
      + "\nVolumeApi cannot be resolved to a type."
      + "\nNovaApi cannot be resolved to a type."
      + "\nNovaApi cannot be resolved to a type."
      + "\nVolumeApi cannot be resolved to a type."
      + "\nVolume cannot be resolved to a type."
      + "\nThe method or field CreateVolumeOptions is undefined"
      + "\nThe field JcloudsOpenStack.context refers to the missing type ComputeServiceContext"
      + "\nunwrapApi cannot be resolved"
      + "\ngetVolumeExtensionForZone cannot be resolved"
      + "\nget cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\nBuilder cannot be resolved"
      + "\nname cannot be resolved"
      + "\ndescription cannot be resolved");
  }
  
  /**
   * Attach volume to a machine
   */
  @Override
  public void attachVolume(final String volumeId) {
    throw new Error("Unresolved compilation problems:"
      + "\nNovaApi cannot be resolved to a type."
      + "\nNovaApi cannot be resolved to a type."
      + "\nVolumeApi cannot be resolved to a type."
      + "\nVolumeAttachment cannot be resolved to a type."
      + "\nThe field JcloudsOpenStack.context refers to the missing type ComputeServiceContext"
      + "\nunwrapApi cannot be resolved"
      + "\ngetVolumeExtensionForZone cannot be resolved"
      + "\nget cannot be resolved"
      + "\nattachVolumeToServerAsDevice cannot be resolved");
  }
  
  /**
   * Detach volume from machine
   */
  @Override
  public void detachVolume(final String volumeId) {
    throw new Error("Unresolved compilation problems:"
      + "\nNovaApi cannot be resolved to a type."
      + "\nNovaApi cannot be resolved to a type."
      + "\nVolumeApi cannot be resolved to a type."
      + "\nThe field JcloudsOpenStack.context refers to the missing type ComputeServiceContext"
      + "\nunwrapApi cannot be resolved"
      + "\ngetVolumeExtensionForZone cannot be resolved"
      + "\nget cannot be resolved"
      + "\ndetachVolumeFromServer cannot be resolved");
  }
  
  /**
   * Delete volume from machine
   */
  @Override
  public void deleteVolume() {
    throw new Error("Unresolved compilation problems:"
      + "\nNovaApi cannot be resolved to a type."
      + "\nNovaApi cannot be resolved to a type."
      + "\nVolumeApi cannot be resolved to a type."
      + "\nThe field JcloudsOpenStack.context refers to the missing type ComputeServiceContext"
      + "\nunwrapApi cannot be resolved"
      + "\ngetVolumeExtensionForZone cannot be resolved"
      + "\nget cannot be resolved"
      + "\ndelete cannot be resolved");
  }
}
