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

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.List;
import org.occiware.clouddesigner.occi.docker.Container;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.MachineAspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* @Aspect() */@SuppressWarnings("all")
public class MachineVirtualBoxAspect extends MachineAspect {
  private static Logger LOGGER = LoggerFactory.getLogger(MachineVirtualBoxAspect.class);
  
  protected boolean isDeployed = false;
  
  protected Multimap<String, String> containerDependency = ArrayListMultimap.<String, String>create();
  
  /* @ReplaceAspectMethod
   */public void start() {
  }
  
  /* @OverrideAspectMethod
   */public String createMachineCommand() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nname cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nname cannot be resolved"
      + "\ndisk_size cannot be resolved"
      + "\n> cannot be resolved"
      + "\ndisk_size cannot be resolved"
      + "\nmemory cannot be resolved"
      + "\n> cannot be resolved"
      + "\nmemory cannot be resolved"
      + "\nmemory cannot be resolved"
      + "\n== cannot be resolved"
      + "\ncores cannot be resolved"
      + "\n> cannot be resolved"
      + "\ncores cannot be resolved"
      + "\ncores cannot be resolved"
      + "\n== cannot be resolved"
      + "\nboot2docker_url cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ndisk_size cannot be resolved"
      + "\nname cannot be resolved"
      + "\n== cannot be resolved");
  }
  
  public void machineStartAll() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method createContainer is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method target is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method createContainer is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method createContainer is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method target is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method createContainer is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nname cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nname cannot be resolved"
      + "\ncreateMachineCommand cannot be resolved"
      + "\nlinks cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved"
      + "\nlinkFound cannot be resolved"
      + "\n! cannot be resolved"
      + "\nlinks cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\ncontainerDependency cannot be resolved"
      + "\ncontainerDependency cannot be resolved"
      + "\ndeploymentOrder cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlinks cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved"
      + "\nlinkFound cannot be resolved"
      + "\n! cannot be resolved"
      + "\nlinks cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\ncontainerDependency cannot be resolved"
      + "\ndeploymentOrder cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\ncontainerDependency cannot be resolved"
      + "\nstate cannot be resolved"
      + "\nisDeployed cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  public void machineStart() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nname cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nname cannot be resolved"
      + "\ncreateMachineCommand cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nstate cannot be resolved"
      + "\nisDeployed cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  public void machineStop() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nname cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nname cannot be resolved"
      + "\nstate cannot be resolved");
  }
  
  public void machineRemove() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nname cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nname cannot be resolved"
      + "\nstate cannot be resolved"
      + "\nisDeployed cannot be resolved");
  }
  
  public void machineRestart() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nname cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nname cannot be resolved"
      + "\nstate cannot be resolved");
  }
  
  public void save() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect");
  }
  
  public List<Container> getContainers() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method target is undefined for the type MachineVirtualBoxAspect"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nlinks cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  public List<Container> leafContainers() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\ncontainers cannot be resolved");
  }
  
  public boolean linkFound() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\ncontainers cannot be resolved");
  }
  
  public List<Container> deploymentOrder() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nlinks cannot be resolved"
      + "\ncontainerDependency cannot be resolved"
      + "\nput cannot be resolved"
      + "\ncontainerDependency cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\nleafContainers cannot be resolved");
  }
  
  public void synchronize() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method linkContainerToMachine is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method target is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method or field _self is undefined for the type MachineVirtualBoxAspect"
      + "\nThe method target is undefined for the type MachineVirtualBoxAspect"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nstate cannot be resolved"
      + "\nstate cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\nequalsIgnoreCase cannot be resolved"
      + "\nlinks cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nlinks cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nlinks cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nallContents cannot be resolved"
      + "\ntoList cannot be resolved"
      + "\nadd cannot be resolved");
  }
}
