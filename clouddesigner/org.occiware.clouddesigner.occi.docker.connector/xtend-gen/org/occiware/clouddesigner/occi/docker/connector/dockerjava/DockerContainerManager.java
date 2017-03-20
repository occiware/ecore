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

import com.google.common.base.Objects;
import com.google.common.collect.Multimap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.Network;
import org.occiware.clouddesigner.occi.docker.NetworkLink;
import org.occiware.clouddesigner.occi.docker.Volumesfrom;
import org.occiware.clouddesigner.occi.docker.connector.EventCallBack;
import org.occiware.clouddesigner.occi.docker.preference.preferences.PreferenceValues;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class DockerContainerManager {
  private static /* DockerClient */Object dockerClient = null;
  
  private static String currentMachine = null;
  
  private Map<String, List<String>> images = new HashMap<String, List<String>>();
  
  private static Logger LOGGER = LoggerFactory.getLogger(DockerContainerManager.class);
  
  private PreferenceValues properties = new PreferenceValues();
  
  public DockerContainerManager() {
  }
  
  public DockerContainerManager(final Machine machine) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient");
  }
  
  public DockerContainerManager(final String machineName) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient");
  }
  
  public DockerContainerManager(final Machine machine, final EventCallBack event) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\neventsCmd cannot be resolved"
      + "\nexec cannot be resolved");
  }
  
  public /* Map<DockerClient, CreateContainerResponse> */Object createContainer(final Machine machine, final Container container) {
    throw new Error("Unresolved compilation problems:"
      + "\nDockerClient cannot be resolved to a type."
      + "\nCreateContainerResponse cannot be resolved to a type."
      + "\nDockerClient cannot be resolved to a type."
      + "\nCreateContainerResponse cannot be resolved to a type."
      + "\nCreateContainerResponse cannot be resolved to a type."
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe method containerFactory(Container, DockerClient) from the type DockerContainerManager refers to the missing type CreateContainerCmd"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\n== cannot be resolved"
      + "\nexec cannot be resolved"
      + "\nid cannot be resolved");
  }
  
  public /* Map<DockerClient, CreateContainerResponse> */Object createContainer(final Machine machine, final Container container, final Multimap<String, String> containerDependency) {
    throw new Error("Unresolved compilation problems:"
      + "\nDockerClient cannot be resolved to a type."
      + "\nCreateContainerResponse cannot be resolved to a type."
      + "\nDockerClient cannot be resolved to a type."
      + "\nCreateContainerResponse cannot be resolved to a type."
      + "\nCreateContainerResponse cannot be resolved to a type."
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe method containerFactory(Container, DockerClient, Multimap<String, String>) from the type DockerContainerManager refers to the missing type CreateContainerCmd"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\n== cannot be resolved"
      + "\nexec cannot be resolved"
      + "\nid cannot be resolved");
  }
  
  public Object createNetwork(final Machine machine, final Network network) {
    throw new Error("Unresolved compilation problems:"
      + "\nConfig cannot be resolved to a type."
      + "\ncom.github.dockerjava.api.model.Network.Ipam cannot be resolved to a type."
      + "\nCreateNetworkCmd cannot be resolved to a type."
      + "\nCreateNetworkResponse cannot be resolved to a type."
      + "\ncom.github.dockerjava.api.model.Network cannot be resolved to a type."
      + "\nInternalServerErrorException cannot be resolved to a type."
      + "\nThe method or field StringUtils is undefined"
      + "\ncom.github.dockerjava.api.model.Network.Ipam.Config cannot be resolved."
      + "\ncom.github.dockerjava.api.model.Network.Ipam.Config cannot be resolved."
      + "\nThe method or field StringUtils is undefined"
      + "\ncom.github.dockerjava.api.model.Network.Ipam.Config cannot be resolved."
      + "\nThe method or field StringUtils is undefined"
      + "\ncom.github.dockerjava.api.model.Network.Ipam.Config cannot be resolved."
      + "\ncom.github.dockerjava.api.model.Network cannot be resolved."
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\n== cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nwithSubnet cannot be resolved"
      + "\nwithSubnet cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nwithGateway cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nwithIpRange cannot be resolved"
      + "\nipam cannot be resolved"
      + "\nwithConfig cannot be resolved"
      + "\ncreateNetworkCmd cannot be resolved"
      + "\nwithIpam cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nwithName cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nwithDriver cannot be resolved"
      + "\nwithCheckDuplicate cannot be resolved"
      + "\nexec cannot be resolved"
      + "\nmessage cannot be resolved"
      + "\ninspectNetworkCmd cannot be resolved"
      + "\nwithNetworkId cannot be resolved"
      + "\nexec cannot be resolved"
      + "\nid cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nid cannot be resolved"
      + "\nid cannot be resolved");
  }
  
  public void connectToNetwork(final Machine machine, final Map<Container, Set<NetworkLink>> networks) {
    throw new Error("Unresolved compilation problems:"
      + "\nInternalServerErrorException cannot be resolved to a type."
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\n== cannot be resolved"
      + "\nconnectToNetworkCmd cannot be resolved"
      + "\nwithNetworkId cannot be resolved"
      + "\nwithContainerId cannot be resolved"
      + "\nexec cannot be resolved"
      + "\nmessage cannot be resolved");
  }
  
  public void removeContainer(final String machineName, final String containerId) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\n== cannot be resolved"
      + "\nremoveContainerCmd cannot be resolved"
      + "\nexec cannot be resolved");
  }
  
  public CreateContainerCmd containerFactory(final Container container, final /* DockerClient */Object dockerClient) {
    throw new Error("Unresolved compilation problems:"
      + "\nCreateContainerCmd cannot be resolved to a type."
      + "\nExposedPort cannot be resolved to a type."
      + "\nPorts cannot be resolved to a type."
      + "\nVolume cannot be resolved to a type."
      + "\nVolume cannot be resolved to a type."
      + "\nVolume cannot be resolved to a type."
      + "\nLxcConf cannot be resolved to a type."
      + "\nVolumesFrom cannot be resolved to a type."
      + "\nBind cannot be resolved to a type."
      + "\nVolume cannot be resolved to a type."
      + "\nVolume cannot be resolved to a type."
      + "\nVolume cannot be resolved to a type."
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
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field ExposedPort is undefined"
      + "\nPorts cannot be resolved."
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field Binding is undefined"
      + "\nThe method or field Binding is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nVolume cannot be resolved."
      + "\nThe method or field StringUtils is undefined"
      + "\nLxcConf cannot be resolved."
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field RestartPolicy is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nThe method or field StringUtils is undefined"
      + "\nVolumesFrom cannot be resolved."
      + "\nThe method or field StringUtils is undefined"
      + "\nVolume cannot be resolved."
      + "\nThe method or field StringUtils is undefined"
      + "\nBind cannot be resolved."
      + "\nisNotBlank cannot be resolved"
      + "\ncreateContainerCmd cannot be resolved"
      + "\ncreateContainerCmd cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\ndeleteWhitespace cannot be resolved"
      + "\nsplit cannot be resolved"
      + "\nwithCmd cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\n! cannot be resolved"
      + "\nwithCmd cannot be resolved"
      + "\nwithCpuShares cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nwithHostName cannot be resolved"
      + "\ndeleteWhitespace cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nwithCpusetCpus cannot be resolved"
      + "\ndeleteWhitespace cannot be resolved"
      + "\nwithPrivileged cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nwithDns cannot be resolved"
      + "\ndeleteWhitespace cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\ndeleteWhitespace cannot be resolved"
      + "\nsplit cannot be resolved"
      + "\nwithEnv cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\ntcp cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nbind cannot be resolved"
      + "\nbindPort cannot be resolved"
      + "\nbind cannot be resolved"
      + "\nbindPort cannot be resolved"
      + "\nwithExposedPorts cannot be resolved"
      + "\nwithPortBindings cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nwithName cannot be resolved"
      + "\ndeleteWhitespace cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nwithHostName cannot be resolved"
      + "\ndeleteWhitespace cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nwithNetworkMode cannot be resolved"
      + "\nwithPublishAllPorts cannot be resolved"
      + "\nwithStdInOnce cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nwithUser cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\ndeleteWhitespace cannot be resolved"
      + "\nsplit cannot be resolved"
      + "\nwithVolumes cannot be resolved"
      + "\nwithMemory cannot be resolved"
      + "\nwithMemory cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nwithLxcConf cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nwithDomainName cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nwithDnsSearch cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nwithEntrypoint cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nwithNetworkMode cannot be resolved"
      + "\ndeleteWhitespace cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nwithPidMode cannot be resolved"
      + "\ndeleteWhitespace cannot be resolved"
      + "\nwithPrivileged cannot be resolved"
      + "\nwithPublishAllPorts cannot be resolved"
      + "\nwithReadonlyRootfs cannot be resolved"
      + "\nwithTty cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nwithRestartPolicy cannot be resolved"
      + "\nparse cannot be resolved"
      + "\ndeleteWhitespace cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nwithWorkingDir cannot be resolved"
      + "\ndeleteWhitespace cannot be resolved"
      + "\ncpusetCpus cannot be resolved"
      + "\nwithVolumesFrom cannot be resolved"
      + "\nisBlank cannot be resolved"
      + "\n! cannot be resolved"
      + "\nisBlank cannot be resolved"
      + "\n! cannot be resolved"
      + "\nwithVolumes cannot be resolved"
      + "\nwithBinds cannot be resolved");
  }
  
  public CreateContainerCmd containerFactory(final Container container, final /* DockerClient */Object dockerClient, final Multimap<String, String> containerDependency) {
    throw new Error("Unresolved compilation problems:"
      + "\nCreateContainerCmd cannot be resolved to a type."
      + "\nExposedPort cannot be resolved to a type."
      + "\nPorts cannot be resolved to a type."
      + "\nVolume cannot be resolved to a type."
      + "\nVolume cannot be resolved to a type."
      + "\nVolume cannot be resolved to a type."
      + "\nLxcConf cannot be resolved to a type."
      + "\nLink cannot be resolved to a type."
      + "\nLink cannot be resolved to a type."
      + "\nLink cannot be resolved to a type."
      + "\nVolumesFrom cannot be resolved to a type."
      + "\nBind cannot be resolved to a type."
      + "\nVolume cannot be resolved to a type."
      + "\nVolume cannot be resolved to a type."
      + "\nVolume cannot be resolved to a type."
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
      + "\nThe method or field ExposedPort is undefined"
      + "\nPorts cannot be resolved."
      + "\nThe method or field Ports is undefined"
      + "\nThe method or field Ports is undefined"
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
      + "\nVolume cannot be resolved."
      + "\nThe method or field StringUtils is undefined"
      + "\nLxcConf cannot be resolved."
      + "\nLink cannot be resolved."
      + "\nVolumesFrom cannot be resolved."
      + "\nThe method or field StringUtils is undefined"
      + "\nVolume cannot be resolved."
      + "\nThe method or field StringUtils is undefined"
      + "\nBind cannot be resolved."
      + "\ncreateContainerCmd cannot be resolved"
      + "\ncreateContainerCmd cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\ndeleteWhitespace cannot be resolved"
      + "\nsplit cannot be resolved"
      + "\nwithCmd cannot be resolved"
      + "\nwithCmd cannot be resolved"
      + "\nwithCpuShares cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nwithHostName cannot be resolved"
      + "\ndeleteWhitespace cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\nwithCpusetCpus cannot be resolved"
      + "\ndeleteWhitespace cannot be resolved"
      + "\nwithPrivileged cannot be resolved"
      + "\nisBlank cannot be resolved"
      + "\n! cannot be resolved"
      + "\nwithDns cannot be resolved"
      + "\ndeleteWhitespace cannot be resolved"
      + "\nisBlank cannot be resolved"
      + "\n! cannot be resolved"
      + "\nwithEnv cannot be resolved"
      + "\ndeleteWhitespace cannot be resolved"
      + "\nisBlank cannot be resolved"
      + "\n! cannot be resolved"
      + "\ntcp cannot be resolved"
      + "\nbind cannot be resolved"
      + "\nBinding cannot be resolved"
      + "\nbindPort cannot be resolved"
      + "\nbind cannot be resolved"
      + "\nBinding cannot be resolved"
      + "\nbindPort cannot be resolved"
      + "\nwithPortBindings cannot be resolved"
      + "\nisBlank cannot be resolved"
      + "\n! cannot be resolved"
      + "\nwithName cannot be resolved"
      + "\ndeleteWhitespace cannot be resolved"
      + "\nisBlank cannot be resolved"
      + "\n! cannot be resolved"
      + "\nwithName cannot be resolved"
      + "\ndeleteWhitespace cannot be resolved"
      + "\nisBlank cannot be resolved"
      + "\n! cannot be resolved"
      + "\nwithNetworkMode cannot be resolved"
      + "\ndeleteWhitespace cannot be resolved"
      + "\nwithPublishAllPorts cannot be resolved"
      + "\nwithTty cannot be resolved"
      + "\nwithStdInOnce cannot be resolved"
      + "\nisBlank cannot be resolved"
      + "\n! cannot be resolved"
      + "\nwithUser cannot be resolved"
      + "\ndeleteWhitespace cannot be resolved"
      + "\nisBlank cannot be resolved"
      + "\n! cannot be resolved"
      + "\ndeleteWhitespace cannot be resolved"
      + "\nsplit cannot be resolved"
      + "\nwithVolumes cannot be resolved"
      + "\nwithMemory cannot be resolved"
      + "\nwithMemorySwap cannot be resolved"
      + "\nisBlank cannot be resolved"
      + "\n! cannot be resolved"
      + "\nwithLxcConf cannot be resolved"
      + "\nwithLinks cannot be resolved"
      + "\nwithLinks cannot be resolved"
      + "\nwithVolumesFrom cannot be resolved"
      + "\nisBlank cannot be resolved"
      + "\n! cannot be resolved"
      + "\nisBlank cannot be resolved"
      + "\n! cannot be resolved"
      + "\nwithVolumes cannot be resolved"
      + "\nwithBinds cannot be resolved");
  }
  
  public List<Resource> containersWithVolumes(final Container c) {
    ArrayList<Resource> containersFrom = new ArrayList<Resource>();
    EList<Link> _links = c.getLinks();
    for (final Link l : _links) {
      if ((l instanceof Volumesfrom)) {
        Resource _target = ((Volumesfrom)l).getTarget();
        containersFrom.add(_target);
      }
    }
    return containersFrom;
  }
  
  public /* InspectContainerResponse */Object inspectContainer(final /* Map<DockerClient, CreateContainerResponse> */Object map) {
    throw new Error("Unresolved compilation problems:"
      + "\nDockerClient cannot be resolved to a type."
      + "\nCreateContainerResponse cannot be resolved to a type."
      + "\nInspectContainerResponse cannot be resolved to a type."
      + "\ninspectContainerCmd cannot be resolved"
      + "\ngetId cannot be resolved"
      + "\nexec cannot be resolved");
  }
  
  public /* InspectContainerResponse */Object inspectContainer(final Machine machine, final String containerId) {
    throw new Error("Unresolved compilation problems:"
      + "\nInspectContainerResponse cannot be resolved to a type."
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\n== cannot be resolved"
      + "\ninspectContainerCmd cannot be resolved"
      + "\nexec cannot be resolved");
  }
  
  public Object startContainer(final Machine machine, final Container container) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\n!= cannot be resolved"
      + "\nstartContainerCmd cannot be resolved"
      + "\nexec cannot be resolved"
      + "\nstatsCmd cannot be resolved"
      + "\nexec cannot be resolved");
  }
  
  public Object startContainer(final Machine machine, final String containerId) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\n== cannot be resolved"
      + "\nstartContainerCmd cannot be resolved"
      + "\nexec cannot be resolved"
      + "\nstatsCmd cannot be resolved"
      + "\nexec cannot be resolved");
  }
  
  public Object stopContainer(final Machine machine, final Container container) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\n== cannot be resolved"
      + "\nstopContainerCmd cannot be resolved"
      + "\nexec cannot be resolved");
  }
  
  public Object stopContainer(final Machine machine, final String containerId) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\n== cannot be resolved"
      + "\nstopContainerCmd cannot be resolved"
      + "\nexec cannot be resolved");
  }
  
  public Object waitContainer(final Machine machine, final Container container) {
    throw new Error("Unresolved compilation problems:"
      + "\nWaitContainerResultCallback cannot be resolved."
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\n== cannot be resolved"
      + "\nwaitContainerCmd cannot be resolved"
      + "\nexec cannot be resolved"
      + "\nawaitStatusCode cannot be resolved");
  }
  
  public Object renameContainer(final Machine machine, final String containerId, final String newName) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\n== cannot be resolved"
      + "\nrenameContainerCmd cannot be resolved"
      + "\nwithName cannot be resolved"
      + "\nexec cannot be resolved");
  }
  
  public void removeContainer(final Machine machine, final String containerId) {
    String _name = machine.getName();
    this.removeContainer(_name, containerId);
  }
  
  public /* List<com.github.dockerjava.api.model.Container> */Object listContainer(final String machineName) {
    throw new Error("Unresolved compilation problems:"
      + "\ncom.github.dockerjava.api.model.Container cannot be resolved to a type."
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\n== cannot be resolved"
      + "\nlistContainersCmd cannot be resolved"
      + "\nwithShowAll cannot be resolved"
      + "\nexec cannot be resolved");
  }
  
  public DockerClient pullImage(final Machine machine, final String image) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field StringUtils is undefined"
      + "\nPullImageResultCallback cannot be resolved."
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe method setConfig(String, PreferenceValues) from the type DockerContainerManager refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\nThe field DockerContainerManager.dockerClient refers to the missing type DockerClient"
      + "\n== cannot be resolved"
      + "\nisNotBlank cannot be resolved"
      + "\n! cannot be resolved"
      + "\npullImageCmd cannot be resolved"
      + "\nwithTag cannot be resolved"
      + "\nexec cannot be resolved"
      + "\nawaitSuccess cannot be resolved");
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
  
  public /* DockerClient */Object setConfig(final String machine, final PreferenceValues properties) {
    throw new Error("Unresolved compilation problems:"
      + "\nDockerClientConfig cannot be resolved to a type."
      + "\nDockerClient cannot be resolved to a type."
      + "\nThe method or field DefaultDockerClientConfig is undefined"
      + "\nThe method or field DefaultDockerClientConfig is undefined"
      + "\nThe method or field DockerClientBuilder is undefined"
      + "\ncreateDefaultConfigBuilder cannot be resolved"
      + "\nwithApiVersion cannot be resolved"
      + "\nwithDockerHost cannot be resolved"
      + "\nwithDockerTlsVerify cannot be resolved"
      + "\nwithRegistryUsername cannot be resolved"
      + "\nwithRegistryPassword cannot be resolved"
      + "\nwithRegistryEmail cannot be resolved"
      + "\nwithRegistryUrl cannot be resolved"
      + "\nwithDockerCertPath cannot be resolved"
      + "\nwithDockerConfig cannot be resolved"
      + "\nbuild cannot be resolved"
      + "\ncreateDefaultConfigBuilder cannot be resolved"
      + "\nwithApiVersion cannot be resolved"
      + "\nwithDockerHost cannot be resolved"
      + "\nwithDockerTlsVerify cannot be resolved"
      + "\nwithRegistryUsername cannot be resolved"
      + "\nwithRegistryPassword cannot be resolved"
      + "\nwithRegistryEmail cannot be resolved"
      + "\nwithRegistryUrl cannot be resolved"
      + "\nwithDockerCertPath cannot be resolved"
      + "\nwithDockerConfig cannot be resolved"
      + "\nbuild cannot be resolved"
      + "\ngetInstance cannot be resolved"
      + "\nbuild cannot be resolved");
  }
  
  public void connect() {
    throw new Error("Unresolved compilation problems:"
      + "\nSession cannot be resolved to a type."
      + "\nJSchException cannot be resolved to a type."
      + "\nJSch cannot be resolved to a type."
      + "\nJSch cannot be resolved."
      + "\nsetKnownHosts cannot be resolved"
      + "\naddIdentity cannot be resolved"
      + "\nknownHosts cannot be resolved"
      + "\ngetSession cannot be resolved"
      + "\nconfig cannot be resolved"
      + "\nconnect cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\nprintStackTrace cannot be resolved");
  }
  
  public void connect(final String host, final String privateKey, final String command) {
    throw new Error("Unresolved compilation problems:"
      + "\nSession cannot be resolved to a type."
      + "\nJSchException cannot be resolved to a type."
      + "\nJSch cannot be resolved to a type."
      + "\nChannel cannot be resolved to a type."
      + "\nChannelExec cannot be resolved to a type."
      + "\nChannelExec cannot be resolved to a type."
      + "\nJSch cannot be resolved."
      + "\nknownHosts cannot be resolved"
      + "\nsetKnownHosts cannot be resolved"
      + "\naddIdentity cannot be resolved"
      + "\ngetSession cannot be resolved"
      + "\nsetConfig cannot be resolved"
      + "\nconnect cannot be resolved"
      + "\nopenChannel cannot be resolved"
      + "\nsetCommand cannot be resolved"
      + "\nsetErrStream cannot be resolved"
      + "\nconnect cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\ndisconnect cannot be resolved");
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
