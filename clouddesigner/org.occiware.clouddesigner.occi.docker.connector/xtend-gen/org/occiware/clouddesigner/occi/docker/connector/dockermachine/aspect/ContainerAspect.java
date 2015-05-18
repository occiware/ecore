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
package org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.CreateContainerResponse;
import com.google.common.collect.Multimap;
import java.util.Map;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.Machine;

/* @Aspect() */@SuppressWarnings("all")
public class ContainerAspect {
  private Map<DockerClient, CreateContainerResponse> map = null;
  
  public Map<DockerClient, CreateContainerResponse> createContainer(final Machine machine, final Multimap<String, String> containerDependency) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined for the type ContainerAspect"
      + "\nThe method or field _self is undefined for the type ContainerAspect"
      + "\nThe method or field _self is undefined for the type ContainerAspect"
      + "\nimage cannot be resolved"
      + "\nmap cannot be resolved");
  }
  
  public Map<DockerClient, CreateContainerResponse> createContainer(final Container container) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined for the type ContainerAspect"
      + "\nThe method or field _self is undefined for the type ContainerAspect"
      + "\nThe method or field _self is undefined for the type ContainerAspect"
      + "\nimage cannot be resolved"
      + "\nmap cannot be resolved");
  }
  
  public Machine linkContainerToMachine(final Machine machine) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined for the type ContainerAspect");
  }
  
  public Container linkContainerToContainer(final Container container) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined for the type ContainerAspect"
      + "\nlinks cannot be resolved"
      + "\nadd cannot be resolved");
  }
  
  public void containerStart() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined for the type ContainerAspect"
      + "\nThe method or field _self is undefined for the type ContainerAspect"
      + "\ngetCurrentMachine cannot be resolved"
      + "\nstate cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\nequalsIgnoreCase cannot be resolved");
  }
  
  public void containerStop() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined for the type ContainerAspect"
      + "\nThe method or field _self is undefined for the type ContainerAspect"
      + "\ngetCurrentMachine cannot be resolved"
      + "\nisDeployed cannot be resolved");
  }
  
  public void containerWait() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined for the type ContainerAspect"
      + "\nThe method or field _self is undefined for the type ContainerAspect"
      + "\ngetCurrentMachine cannot be resolved"
      + "\nisDeployed cannot be resolved");
  }
  
  public void save() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined for the type ContainerAspect");
  }
  
  public Machine getCurrentMachine() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined for the type ContainerAspect"
      + "\nThe method or field _self is undefined for the type ContainerAspect"
      + "\neContainer cannot be resolved"
      + "\neContents cannot be resolved"
      + "\nid cannot be resolved");
  }
}
