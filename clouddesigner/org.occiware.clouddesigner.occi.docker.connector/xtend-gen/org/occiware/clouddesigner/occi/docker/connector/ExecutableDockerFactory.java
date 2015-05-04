/**
 * This file contains the OCCIware Docker connector.
 * 
 * This connector implements the causal link, i.e. synchronization, between Docker models and Docker engines.
 * 
 * Copyright 2015 - Inria
 * 
 * Contributors:
 * - Philippe Merle - Inria
 */
package org.occiware.clouddesigner.occi.docker.connector;

import org.occiware.clouddesigner.occi.docker.DockerFactory;
import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2;
import org.occiware.clouddesigner.occi.docker.Machine_Digital_Ocean;
import org.occiware.clouddesigner.occi.docker.Machine_Google_Compute_Engine;
import org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer;
import org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure;
import org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Hyper_V;
import org.occiware.clouddesigner.occi.docker.Machine_OpenStack;
import org.occiware.clouddesigner.occi.docker.Machine_Rackspace;
import org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion;
import org.occiware.clouddesigner.occi.docker.Machine_VMware_vCloud_Air;
import org.occiware.clouddesigner.occi.docker.Machine_VMware_vSphere;
import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableContainer;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableMachine;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableMachine_Amazon_EC2;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableMachine_Digital_Ocean;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableMachine_Google_Compute_Engine;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableMachine_IBM_SoftLayer;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableMachine_Microsoft_Azure;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableMachine_Microsoft_Hyper_V;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableMachine_OpenStack;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableMachine_Rackspace;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableMachine_VMware_Fusion;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableMachine_VMware_vCloud_Air;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableMachine_VMware_vSphere;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableMachine_VirtualBox;
import org.occiware.clouddesigner.occi.docker.impl.DockerFactoryImpl;

/**
 * This class overrides the generated EMF factory of the Docker package.
 * 
 * This factory creates instances of classes starting with Executable prefix
 * instead of instances of generated EMF classes suffixed by Impl.
 */
@SuppressWarnings("all")
public class ExecutableDockerFactory extends DockerFactoryImpl {
  /**
   * Initialize the ExecutableDockerFactory singleton.
   */
  public static DockerFactory init() {
    final ExecutableDockerFactory factory = new ExecutableDockerFactory();
    DockerPackage.eINSTANCE.setEFactoryInstance(factory);
    return factory;
  }
  
  /**
   * Create an executable Container instance.
   */
  @Override
  public org.occiware.clouddesigner.occi.docker.Container createContainer() {
    ExecutableContainer _xblockexpression = null;
    {
      Class<? extends ExecutableDockerFactory> _class = this.getClass();
      String _name = _class.getName();
      String _plus = (_name + ":createContainer()");
      System.out.println(_plus);
      _xblockexpression = new ExecutableContainer();
    }
    return _xblockexpression;
  }
  
  /**
   * Create an executable Machine instance.
   */
  @Override
  public Machine createMachine() {
    ExecutableMachine _xblockexpression = null;
    {
      Class<? extends ExecutableDockerFactory> _class = this.getClass();
      String _name = _class.getName();
      String _plus = (_name + ":createMachine()");
      System.out.println(_plus);
      _xblockexpression = new ExecutableMachine();
    }
    return _xblockexpression;
  }
  
  /**
   * Create an executable Machine_Amazon_EC2 instance.
   */
  @Override
  public Machine_Amazon_EC2 createMachine_Amazon_EC2() {
    ExecutableMachine_Amazon_EC2 _xblockexpression = null;
    {
      Class<? extends ExecutableDockerFactory> _class = this.getClass();
      String _name = _class.getName();
      String _plus = (_name + ":createMachine_Amazon_EC2()");
      System.out.println(_plus);
      _xblockexpression = new ExecutableMachine_Amazon_EC2();
    }
    return _xblockexpression;
  }
  
  /**
   * Create an executable Machine_Digital_Ocean instance.
   */
  @Override
  public Machine_Digital_Ocean createMachine_Digital_Ocean() {
    ExecutableMachine_Digital_Ocean _xblockexpression = null;
    {
      Class<? extends ExecutableDockerFactory> _class = this.getClass();
      String _name = _class.getName();
      String _plus = (_name + ":createMachine_Digital_Ocean()");
      System.out.println(_plus);
      _xblockexpression = new ExecutableMachine_Digital_Ocean();
    }
    return _xblockexpression;
  }
  
  /**
   * Create an executable Machine_Google_Compute_Engine instance.
   */
  @Override
  public Machine_Google_Compute_Engine createMachine_Google_Compute_Engine() {
    ExecutableMachine_Google_Compute_Engine _xblockexpression = null;
    {
      Class<? extends ExecutableDockerFactory> _class = this.getClass();
      String _name = _class.getName();
      String _plus = (_name + ":createMachine_Google_Compute_Engine()");
      System.out.println(_plus);
      _xblockexpression = new ExecutableMachine_Google_Compute_Engine();
    }
    return _xblockexpression;
  }
  
  /**
   * Create an executable Machine_IBM_SoftLayer instance.
   */
  @Override
  public Machine_IBM_SoftLayer createMachine_IBM_SoftLayer() {
    ExecutableMachine_IBM_SoftLayer _xblockexpression = null;
    {
      Class<? extends ExecutableDockerFactory> _class = this.getClass();
      String _name = _class.getName();
      String _plus = (_name + ":createMachine_IBM_SoftLayer()");
      System.out.println(_plus);
      _xblockexpression = new ExecutableMachine_IBM_SoftLayer();
    }
    return _xblockexpression;
  }
  
  /**
   * Create an executable Machine_Microsoft_Azure instance.
   */
  @Override
  public Machine_Microsoft_Azure createMachine_Microsoft_Azure() {
    ExecutableMachine_Microsoft_Azure _xblockexpression = null;
    {
      Class<? extends ExecutableDockerFactory> _class = this.getClass();
      String _name = _class.getName();
      String _plus = (_name + ":createMachine_Microsoft_Azure()");
      System.out.println(_plus);
      _xblockexpression = new ExecutableMachine_Microsoft_Azure();
    }
    return _xblockexpression;
  }
  
  /**
   * Create an executable Machine_Microsoft_Hyper_V instance.
   */
  @Override
  public Machine_Microsoft_Hyper_V createMachine_Microsoft_Hyper_V() {
    ExecutableMachine_Microsoft_Hyper_V _xblockexpression = null;
    {
      Class<? extends ExecutableDockerFactory> _class = this.getClass();
      String _name = _class.getName();
      String _plus = (_name + ":createMachine_Microsoft_Hyper_V()");
      System.out.println(_plus);
      _xblockexpression = new ExecutableMachine_Microsoft_Hyper_V();
    }
    return _xblockexpression;
  }
  
  /**
   * Create an executable Machine_OpenStack instance.
   */
  @Override
  public Machine_OpenStack createMachine_OpenStack() {
    ExecutableMachine_OpenStack _xblockexpression = null;
    {
      Class<? extends ExecutableDockerFactory> _class = this.getClass();
      String _name = _class.getName();
      String _plus = (_name + ":createMachine_OpenStack()");
      System.out.println(_plus);
      _xblockexpression = new ExecutableMachine_OpenStack();
    }
    return _xblockexpression;
  }
  
  /**
   * Create an executable Machine_Rackspace instance.
   */
  @Override
  public Machine_Rackspace createMachine_Rackspace() {
    ExecutableMachine_Rackspace _xblockexpression = null;
    {
      Class<? extends ExecutableDockerFactory> _class = this.getClass();
      String _name = _class.getName();
      String _plus = (_name + ":createMachine_Rackspace()");
      System.out.println(_plus);
      _xblockexpression = new ExecutableMachine_Rackspace();
    }
    return _xblockexpression;
  }
  
  /**
   * Create an executable Machine_VirtualBox instance.
   */
  @Override
  public Machine_VirtualBox createMachine_VirtualBox() {
    ExecutableMachine_VirtualBox _xblockexpression = null;
    {
      Class<? extends ExecutableDockerFactory> _class = this.getClass();
      String _name = _class.getName();
      String _plus = (_name + ":createMachine_VirtualBox()");
      System.out.println(_plus);
      _xblockexpression = new ExecutableMachine_VirtualBox();
    }
    return _xblockexpression;
  }
  
  /**
   * Create an executable Machine_VMware_Fusion instance.
   */
  @Override
  public Machine_VMware_Fusion createMachine_VMware_Fusion() {
    ExecutableMachine_VMware_Fusion _xblockexpression = null;
    {
      Class<? extends ExecutableDockerFactory> _class = this.getClass();
      String _name = _class.getName();
      String _plus = (_name + ":createMachine_VMware_Fusion()");
      System.out.println(_plus);
      _xblockexpression = new ExecutableMachine_VMware_Fusion();
    }
    return _xblockexpression;
  }
  
  /**
   * Create an executable Machine_VMware_vCloud_Air instance.
   */
  @Override
  public Machine_VMware_vCloud_Air createMachine_VMware_vCloud_Air() {
    ExecutableMachine_VMware_vCloud_Air _xblockexpression = null;
    {
      System.out.println("ExecutableDockerFactory:createMachine_VMware_vCloud_Air()");
      _xblockexpression = new ExecutableMachine_VMware_vCloud_Air();
    }
    return _xblockexpression;
  }
  
  /**
   * Create an executable Machine_VMware_vSphere instance.
   */
  @Override
  public Machine_VMware_vSphere createMachine_VMware_vSphere() {
    ExecutableMachine_VMware_vSphere _xblockexpression = null;
    {
      Class<? extends ExecutableDockerFactory> _class = this.getClass();
      String _name = _class.getName();
      String _plus = (_name + ":createMachine_VMware_vSphere()");
      System.out.println(_plus);
      _xblockexpression = new ExecutableMachine_VMware_vSphere();
    }
    return _xblockexpression;
  }
}
