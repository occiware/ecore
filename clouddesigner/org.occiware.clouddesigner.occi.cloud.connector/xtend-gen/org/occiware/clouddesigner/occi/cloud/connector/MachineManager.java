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

import com.google.common.base.Objects;
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
import org.occiware.clouddesigner.occi.cloud.connector.ComputeStateMachine;
import org.occiware.clouddesigner.occi.cloud.connector.cloudproviders.JcloudsOpenStack;
import org.occiware.clouddesigner.occi.cloud.connector.cloudproviders.JcloudsRackSpace;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class implements an abstract machine manager.
 */
@SuppressWarnings("all")
public abstract class MachineManager extends ComputeStateMachine<Machine> {
  private static Logger LOGGER = LoggerFactory.getLogger(MachineManager.class);
  
  protected Machine machine;
  
  /**
   * Construct a machine manager for a given machine.
   */
  public MachineManager(final Machine m) {
    super(m);
    this.machine = m;
  }
  
  /**
   * Return the machine provider name.
   */
  public abstract String getDriverName();
  
  /**
   * Start a Cloud machine.
   */
  @Override
  public void start_execute() {
    String _name = this.compute.getName();
    String _plus = ("STARTING MACHINE: " + _name);
    MachineManager.LOGGER.info(_plus);
    if ((this.compute instanceof Machine_OpenStack)) {
      JcloudsOpenStack provider = new JcloudsOpenStack(((Machine_OpenStack) this.compute));
      provider.launchMachine();
    } else {
      if ((this.compute instanceof Machine_Amazon_EC2)) {
      } else {
        if ((this.compute instanceof Machine_CloudSigma)) {
        } else {
          if ((this.compute instanceof Machine_GCE)) {
          } else {
            if ((this.compute instanceof Machine_SoftLayer)) {
            } else {
              if ((this.compute instanceof Machine_Gogrid)) {
              } else {
                if ((this.compute instanceof Machine_Hp_Helion)) {
                } else {
                  if ((this.compute instanceof Machine_RackSpace)) {
                    JcloudsRackSpace provider_1 = new JcloudsRackSpace(((Machine_RackSpace) this.compute));
                    provider_1.launchMachine();
                  } else {
                    if ((this.compute instanceof Machine_ProfitBricks)) {
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    String _name_1 = this.compute.getName();
    String _plus_1 = ("MACHINE: " + _name_1);
    String _plus_2 = (_plus_1 + " is started ...");
    MachineManager.LOGGER.info(_plus_2);
  }
  
  /**
   * Stop a Cloud machine.
   */
  @Override
  public void stop_execute(final StopMethod method) {
    boolean _equals = Objects.equal(method, StopMethod.GRACEFUL);
    if (_equals) {
      if ((this.compute instanceof Machine_OpenStack)) {
        JcloudsOpenStack provider = new JcloudsOpenStack();
        String _id = this.compute.getId();
        provider.stopMachine(_id);
      } else {
        if ((this.compute instanceof Machine_Amazon_EC2)) {
        } else {
          if ((this.compute instanceof Machine_CloudSigma)) {
          } else {
            if ((this.compute instanceof Machine_GCE)) {
            } else {
              if ((this.compute instanceof Machine_SoftLayer)) {
              } else {
                if ((this.compute instanceof Machine_Gogrid)) {
                } else {
                  if ((this.compute instanceof Machine_Hp_Helion)) {
                  } else {
                    if ((this.compute instanceof Machine_RackSpace)) {
                    } else {
                      if ((this.compute instanceof Machine_ProfitBricks)) {
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    String _name = this.compute.getName();
    String _plus = ("EXECUTE STOP COMMAND on: " + _name);
    MachineManager.LOGGER.info(_plus);
  }
  
  /**
   * Restart a Docker machine.
   */
  @Override
  public void restart_execute(final RestartMethod method) {
    String _name = this.compute.getName();
    String _plus = ("EXECUTE STOP COMMAND on: " + _name);
    MachineManager.LOGGER.info(_plus);
  }
  
  /**
   * Suspend a Docker machine.
   */
  @Override
  public void suspend_execute(final SuspendMethod method) {
    String _name = this.compute.getName();
    String _plus = ("EXECUTE COMMAND: docker machine suspend " + _name);
    MachineManager.LOGGER.info(_plus);
  }
}
