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
package org.occiware.clouddesigner.occi.cloud.connector;

import org.occiware.clouddesigner.occi.cloud.CloudFactory;
import org.occiware.clouddesigner.occi.cloud.CloudPackage;
import org.occiware.clouddesigner.occi.cloud.Machine;
import org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2;
import org.occiware.clouddesigner.occi.cloud.Machine_CloudSigma;
import org.occiware.clouddesigner.occi.cloud.Machine_GCE;
import org.occiware.clouddesigner.occi.cloud.Machine_Gogrid;
import org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion;
import org.occiware.clouddesigner.occi.cloud.Machine_OpenStack;
import org.occiware.clouddesigner.occi.cloud.Machine_ProfitBricks;
import org.occiware.clouddesigner.occi.cloud.Machine_RackSpace;
import org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer;
import org.occiware.clouddesigner.occi.cloud.connector.ExecutableMachine;
import org.occiware.clouddesigner.occi.cloud.connector.ExecutableMachine_Amazon_EC2;
import org.occiware.clouddesigner.occi.cloud.connector.ExecutableMachine_CloudSigma;
import org.occiware.clouddesigner.occi.cloud.connector.ExecutableMachine_GCE;
import org.occiware.clouddesigner.occi.cloud.connector.ExecutableMachine_Gogrid;
import org.occiware.clouddesigner.occi.cloud.connector.ExecutableMachine_Hp_Helion;
import org.occiware.clouddesigner.occi.cloud.connector.ExecutableMachine_OpenStack;
import org.occiware.clouddesigner.occi.cloud.connector.ExecutableMachine_ProfitBricks;
import org.occiware.clouddesigner.occi.cloud.connector.ExecutableMachine_RackSpace;
import org.occiware.clouddesigner.occi.cloud.connector.ExecutableMachine_SoftLayer;
import org.occiware.clouddesigner.occi.cloud.impl.CloudFactoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class overrides the generated EMF factory of the Docker package.
 * 
 * This factory creates instances of classes starting with Executable prefix
 * instead of instances of generated EMF classes suffixed by Impl.
 */
@SuppressWarnings("all")
public class ExecutableCloudFactory extends CloudFactoryImpl {
  private static Logger LOGGER = LoggerFactory.getLogger(ExecutableCloudFactory.class);
  
  /**
   * Initialize the ExecutableDockerFactory singleton.
   */
  public static CloudFactory init() {
    final ExecutableCloudFactory factory = new ExecutableCloudFactory();
    CloudPackage.eINSTANCE.setEFactoryInstance(factory);
    return factory;
  }
  
  /**
   * Create an executable Machine instance.
   */
  @Override
  public Machine createMachine() {
    ExecutableMachine _xblockexpression = null;
    {
      Class<? extends ExecutableCloudFactory> _class = this.getClass();
      String _name = _class.getName();
      String _plus = (_name + ":createMachine()");
      ExecutableCloudFactory.LOGGER.info(_plus);
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
      Class<? extends ExecutableCloudFactory> _class = this.getClass();
      String _name = _class.getName();
      String _plus = (_name + ":createMachine_Amazon_EC2()");
      ExecutableCloudFactory.LOGGER.info(_plus);
      _xblockexpression = new ExecutableMachine_Amazon_EC2();
    }
    return _xblockexpression;
  }
  
  /**
   * Create an executable CloudSigma instance.
   */
  @Override
  public Machine_CloudSigma createMachine_CloudSigma() {
    ExecutableMachine_CloudSigma _xblockexpression = null;
    {
      Class<? extends ExecutableCloudFactory> _class = this.getClass();
      String _name = _class.getName();
      String _plus = (_name + ":createMachine_CloudSigma()");
      ExecutableCloudFactory.LOGGER.info(_plus);
      _xblockexpression = new ExecutableMachine_CloudSigma();
    }
    return _xblockexpression;
  }
  
  /**
   * Create an executable Gogrid instance.
   */
  @Override
  public Machine_Gogrid createMachine_Gogrid() {
    ExecutableMachine_Gogrid _xblockexpression = null;
    {
      Class<? extends ExecutableCloudFactory> _class = this.getClass();
      String _name = _class.getName();
      String _plus = (_name + ":createMachine_Gogrid()");
      ExecutableCloudFactory.LOGGER.info(_plus);
      _xblockexpression = new ExecutableMachine_Gogrid();
    }
    return _xblockexpression;
  }
  
  /**
   * Create an executable HP Helion instance.
   */
  @Override
  public Machine_Hp_Helion createMachine_Hp_Helion() {
    ExecutableMachine_Hp_Helion _xblockexpression = null;
    {
      Class<? extends ExecutableCloudFactory> _class = this.getClass();
      String _name = _class.getName();
      String _plus = (_name + ":createMachine_Hp_Helion()");
      ExecutableCloudFactory.LOGGER.info(_plus);
      _xblockexpression = new ExecutableMachine_Hp_Helion();
    }
    return _xblockexpression;
  }
  
  /**
   * Create an executable Google Compute Engine instance.
   */
  @Override
  public Machine_GCE createMachine_GCE() {
    ExecutableMachine_GCE _xblockexpression = null;
    {
      Class<? extends ExecutableCloudFactory> _class = this.getClass();
      String _name = _class.getName();
      String _plus = (_name + ":createMachine_GCE()");
      ExecutableCloudFactory.LOGGER.info(_plus);
      _xblockexpression = new ExecutableMachine_GCE();
    }
    return _xblockexpression;
  }
  
  /**
   * Create an executable RackSpace instance.
   */
  @Override
  public Machine_RackSpace createMachine_RackSpace() {
    ExecutableMachine_RackSpace _xblockexpression = null;
    {
      Class<? extends ExecutableCloudFactory> _class = this.getClass();
      String _name = _class.getName();
      String _plus = (_name + ":createMachine_RackSpace()");
      ExecutableCloudFactory.LOGGER.info(_plus);
      _xblockexpression = new ExecutableMachine_RackSpace();
    }
    return _xblockexpression;
  }
  
  /**
   * Create an executable ProfitBrikcs instance.
   */
  @Override
  public Machine_ProfitBricks createMachine_ProfitBricks() {
    ExecutableMachine_ProfitBricks _xblockexpression = null;
    {
      Class<? extends ExecutableCloudFactory> _class = this.getClass();
      String _name = _class.getName();
      String _plus = (_name + ":createMachine_ProfitBricks()");
      ExecutableCloudFactory.LOGGER.info(_plus);
      _xblockexpression = new ExecutableMachine_ProfitBricks();
    }
    return _xblockexpression;
  }
  
  /**
   * Create an executable OpenStack instance.
   */
  @Override
  public Machine_OpenStack createMachine_OpenStack() {
    ExecutableMachine_OpenStack _xblockexpression = null;
    {
      Class<? extends ExecutableCloudFactory> _class = this.getClass();
      String _name = _class.getName();
      String _plus = (_name + ":createMachine_OpenStack()");
      ExecutableCloudFactory.LOGGER.info(_plus);
      _xblockexpression = new ExecutableMachine_OpenStack();
    }
    return _xblockexpression;
  }
  
  /**
   * Create an executable SoftLayer instance.
   */
  @Override
  public Machine_SoftLayer createMachine_SoftLayer() {
    ExecutableMachine_SoftLayer _xblockexpression = null;
    {
      Class<? extends ExecutableCloudFactory> _class = this.getClass();
      String _name = _class.getName();
      String _plus = (_name + ":createMachine_SoftLayer()");
      ExecutableCloudFactory.LOGGER.info(_plus);
      _xblockexpression = new ExecutableMachine_SoftLayer();
    }
    return _xblockexpression;
  }
}
