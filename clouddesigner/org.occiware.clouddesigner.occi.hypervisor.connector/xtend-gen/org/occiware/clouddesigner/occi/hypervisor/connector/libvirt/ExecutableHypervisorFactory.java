/**
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	- Fawaz PARAISO
 * 	- Philippe MERELE
 */
package org.occiware.clouddesigner.occi.hypervisor.connector.libvirt;

import org.eclipse.xtext.xbase.lib.InputOutput;
import org.occiware.clouddesigner.occi.hypervisor.HypervisorFactory;
import org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage;
import org.occiware.clouddesigner.occi.hypervisor.Machine;
import org.occiware.clouddesigner.occi.hypervisor.Machine_VirtualBox;
import org.occiware.clouddesigner.occi.hypervisor.connector.libvirt.ExecutableMachine;
import org.occiware.clouddesigner.occi.hypervisor.connector.libvirt.ExecutableMachine_VirtualBox;
import org.occiware.clouddesigner.occi.hypervisor.impl.HypervisorFactoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class overrides the generated EMF factory of the  package.
 * 
 * This factory creates instances of classes starting with Executable prefix
 * instead of instances of generated EMF classes suffixed by Impl.
 */
@SuppressWarnings("all")
public class ExecutableHypervisorFactory extends HypervisorFactoryImpl {
  private static Logger LOGGER = LoggerFactory.getLogger(ExecutableHypervisorFactory.class);
  
  /**
   * Initialize the ExecutableFactory singleton.
   */
  public static HypervisorFactory init() {
    final ExecutableHypervisorFactory factory = new ExecutableHypervisorFactory();
    HypervisorPackage.eINSTANCE.setEFactoryInstance(factory);
    return factory;
  }
  
  /**
   * Create an executable Machine instance.
   */
  @Override
  public Machine createMachine() {
    Class<? extends ExecutableHypervisorFactory> _class = this.getClass();
    String _name = _class.getName();
    String _plus = (_name + ":createCompute()");
    InputOutput.<String>println(_plus);
    return new ExecutableMachine();
  }
  
  /**
   * Create an executable Machine_VirtualBox instance.
   */
  @Override
  public Machine_VirtualBox createMachine_VirtualBox() {
    Class<? extends ExecutableHypervisorFactory> _class = this.getClass();
    String _name = _class.getName();
    String _plus = (_name + ":createMachine_VirtualBox()");
    InputOutput.<String>println(_plus);
    return new ExecutableMachine_VirtualBox();
  }
}
