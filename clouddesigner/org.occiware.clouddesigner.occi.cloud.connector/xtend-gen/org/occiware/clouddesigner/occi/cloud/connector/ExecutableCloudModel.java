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
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.jclouds.compute.domain.NodeMetadata;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Resource;
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
import org.occiware.clouddesigner.occi.cloud.connector.ExecutableMachine_Amazon_EC2;
import org.occiware.clouddesigner.occi.cloud.connector.ExecutableMachine_CloudSigma;
import org.occiware.clouddesigner.occi.cloud.connector.ExecutableMachine_GCE;
import org.occiware.clouddesigner.occi.cloud.connector.ExecutableMachine_Gogrid;
import org.occiware.clouddesigner.occi.cloud.connector.ExecutableMachine_Hp_Helion;
import org.occiware.clouddesigner.occi.cloud.connector.ExecutableMachine_OpenStack;
import org.occiware.clouddesigner.occi.cloud.connector.ExecutableMachine_ProfitBricks;
import org.occiware.clouddesigner.occi.cloud.connector.ExecutableMachine_RackSpace;
import org.occiware.clouddesigner.occi.cloud.connector.ExecutableMachine_SoftLayer;
import org.occiware.clouddesigner.occi.cloud.connector.ModelHandler;
import org.occiware.clouddesigner.occi.cloud.connector.cloudproviders.JcloudsOpenStack;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class ExecutableCloudModel {
  private static Logger LOGGER = LoggerFactory.getLogger(ExecutableCloudModel.class);
  
  public Machine machine;
  
  public Configuration configuration;
  
  public Machine_Amazon_EC2 machine_Amazon_EC2;
  
  public Machine_CloudSigma machine_CloudSigma;
  
  public Machine_GCE machine_GCE;
  
  public Machine_SoftLayer machine_SoftLayer;
  
  public Machine_Gogrid machine_Gogrid;
  
  public Machine_Hp_Helion machine_Hp_Helion;
  
  public Machine_OpenStack machine_OpenStack;
  
  public Machine_RackSpace machine_RackSpace;
  
  public Machine_ProfitBricks machine_ProfitBricks;
  
  public ExecutableCloudModel() {
  }
  
  public ExecutableCloudModel(final Machine machine) {
    this.machine = machine;
    if ((machine instanceof Machine_Amazon_EC2)) {
      this.machine_Amazon_EC2 = ((Machine_Amazon_EC2)machine);
    } else {
      if ((machine instanceof Machine_CloudSigma)) {
        this.machine_CloudSigma = ((Machine_CloudSigma)machine);
      } else {
        if ((machine instanceof Machine_GCE)) {
          this.machine_GCE = ((Machine_GCE)machine);
        } else {
          if ((machine instanceof Machine_SoftLayer)) {
            this.machine_SoftLayer = ((Machine_SoftLayer)machine);
          } else {
            if ((machine instanceof Machine_Gogrid)) {
              this.machine_Gogrid = ((Machine_Gogrid)machine);
            } else {
              if ((machine instanceof Machine_Hp_Helion)) {
                this.machine_Hp_Helion = ((Machine_Hp_Helion)machine);
              } else {
                if ((machine instanceof Machine_RackSpace)) {
                  this.machine_RackSpace = ((Machine_RackSpace)machine);
                } else {
                  if ((machine instanceof Machine_OpenStack)) {
                    this.machine_OpenStack = ((Machine_OpenStack)machine);
                  } else {
                    if ((machine instanceof Machine_ProfitBricks)) {
                      this.machine_ProfitBricks = ((Machine_ProfitBricks)machine);
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
  
  public ExecutableCloudModel(final Configuration configuration) {
    this.configuration = configuration;
  }
  
  public void start() {
    boolean _notEquals = (!Objects.equal(this.machine_Amazon_EC2, null));
    if (_notEquals) {
      this.machine_Amazon_EC2.start();
      return;
    }
    boolean _notEquals_1 = (!Objects.equal(this.machine_CloudSigma, null));
    if (_notEquals_1) {
      this.machine_CloudSigma.start();
      return;
    }
    boolean _notEquals_2 = (!Objects.equal(this.machine_GCE, null));
    if (_notEquals_2) {
      this.machine_GCE.start();
      return;
    }
    boolean _notEquals_3 = (!Objects.equal(this.machine_SoftLayer, null));
    if (_notEquals_3) {
      this.machine_SoftLayer.start();
      return;
    }
    boolean _notEquals_4 = (!Objects.equal(this.machine_Gogrid, null));
    if (_notEquals_4) {
      this.machine_Gogrid.start();
      return;
    }
    boolean _notEquals_5 = (!Objects.equal(this.machine_Hp_Helion, null));
    if (_notEquals_5) {
      this.machine_Hp_Helion.start();
      return;
    }
    boolean _notEquals_6 = (!Objects.equal(this.machine_RackSpace, null));
    if (_notEquals_6) {
      this.machine_RackSpace.start();
      return;
    }
    boolean _notEquals_7 = (!Objects.equal(this.machine_OpenStack, null));
    if (_notEquals_7) {
      this.machine_OpenStack.start();
      return;
    }
    boolean _notEquals_8 = (!Objects.equal(this.machine_ProfitBricks, null));
    if (_notEquals_8) {
      this.machine_ProfitBricks.start();
      return;
    }
  }
  
  public void stop() {
    boolean _notEquals = (!Objects.equal(this.machine_Amazon_EC2, null));
    if (_notEquals) {
      ((ExecutableMachine_Amazon_EC2) this.machine_Amazon_EC2).stop(StopMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_1 = (!Objects.equal(this.machine_CloudSigma, null));
    if (_notEquals_1) {
      ((ExecutableMachine_CloudSigma) this.machine_CloudSigma).stop(StopMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_2 = (!Objects.equal(this.machine_GCE, null));
    if (_notEquals_2) {
      ((ExecutableMachine_GCE) this.machine_GCE).stop(StopMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_3 = (!Objects.equal(this.machine_SoftLayer, null));
    if (_notEquals_3) {
      ((ExecutableMachine_SoftLayer) this.machine_SoftLayer).stop(StopMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_4 = (!Objects.equal(this.machine_Gogrid, null));
    if (_notEquals_4) {
      ((ExecutableMachine_Gogrid) this.machine_Gogrid).stop(StopMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_5 = (!Objects.equal(this.machine_Hp_Helion, null));
    if (_notEquals_5) {
      ((ExecutableMachine_Hp_Helion) this.machine_Hp_Helion).stop(StopMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_6 = (!Objects.equal(this.machine_RackSpace, null));
    if (_notEquals_6) {
      ((ExecutableMachine_RackSpace) this.machine_RackSpace).stop(StopMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_7 = (!Objects.equal(this.machine_OpenStack, null));
    if (_notEquals_7) {
      ((ExecutableMachine_OpenStack) this.machine_OpenStack).stop(StopMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_8 = (!Objects.equal(this.machine_ProfitBricks, null));
    if (_notEquals_8) {
      ((ExecutableMachine_ProfitBricks) this.machine_ProfitBricks).stop(StopMethod.GRACEFUL);
      return;
    }
  }
  
  public void restart() {
    boolean _notEquals = (!Objects.equal(this.machine_Amazon_EC2, null));
    if (_notEquals) {
      this.machine_Amazon_EC2.restart(RestartMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_1 = (!Objects.equal(this.machine_CloudSigma, null));
    if (_notEquals_1) {
      this.machine_CloudSigma.restart(RestartMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_2 = (!Objects.equal(this.machine_GCE, null));
    if (_notEquals_2) {
      this.machine_GCE.restart(RestartMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_3 = (!Objects.equal(this.machine_SoftLayer, null));
    if (_notEquals_3) {
      this.machine_SoftLayer.restart(RestartMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_4 = (!Objects.equal(this.machine_Gogrid, null));
    if (_notEquals_4) {
      this.machine_Gogrid.restart(RestartMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_5 = (!Objects.equal(this.machine_Hp_Helion, null));
    if (_notEquals_5) {
      this.machine_Hp_Helion.restart(RestartMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_6 = (!Objects.equal(this.machine_RackSpace, null));
    if (_notEquals_6) {
      this.machine_RackSpace.restart(RestartMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_7 = (!Objects.equal(this.machine_OpenStack, null));
    if (_notEquals_7) {
      this.machine_OpenStack.restart(RestartMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_8 = (!Objects.equal(this.machine_OpenStack, null));
    if (_notEquals_8) {
      this.machine_OpenStack.restart(RestartMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_9 = (!Objects.equal(this.machine_ProfitBricks, null));
    if (_notEquals_9) {
      this.machine_ProfitBricks.restart(RestartMethod.GRACEFUL);
      return;
    }
  }
  
  public void importModel() {
    ModelHandler instanceMH = new ModelHandler();
    List<Machine> machines = this.machinesInConfiguration();
    for (final Machine machine : machines) {
      {
        if ((machine instanceof Machine_OpenStack)) {
          Machine_OpenStack tmpMachine = ((Machine_OpenStack) machine);
          JcloudsOpenStack _jcloudsOpenStack = new JcloudsOpenStack(tmpMachine);
          List<NodeMetadata> listOfMachines = _jcloudsOpenStack.listMachines();
          for (final NodeMetadata instance : listOfMachines) {
            {
              String _name = instance.getName();
              final boolean machineExistInModeler = this.containMachine(_name);
              if ((!machineExistInModeler)) {
                String _provider = tmpMachine.getProvider();
                Machine machineOpenStak = instanceMH.getModel(instance, _provider);
                EList<Resource> _resources = this.configuration.getResources();
                _resources.add(machineOpenStak);
              }
            }
          }
          ExecutableCloudModel.LOGGER.info("Import inside the OpenStack environment is done ...");
        }
        if ((machine instanceof Machine_RackSpace)) {
          Machine_RackSpace tmpMachine_1 = ((Machine_RackSpace) machine);
          ExecutableCloudModel.LOGGER.info("Import inside the RackSpace environment is done  ...");
        }
        if ((machine instanceof Machine_Amazon_EC2)) {
          Machine_Amazon_EC2 tmpMachine_2 = ((Machine_Amazon_EC2) machine);
          ExecutableCloudModel.LOGGER.info("Import inside the Aamzon EC2 environment is done  ...");
        }
        if ((machine instanceof Machine_CloudSigma)) {
          Machine_CloudSigma tmpMachine_3 = ((Machine_CloudSigma) machine);
          ExecutableCloudModel.LOGGER.info("Import inside the CloudSigma environment is done  ...");
        }
        if ((machine instanceof Machine_GCE)) {
          Machine_GCE tmpMachine_4 = ((Machine_GCE) machine);
          ExecutableCloudModel.LOGGER.info("Import inside the Google CE environment is done  ...");
        }
        if ((machine instanceof Machine_Gogrid)) {
          Machine_Gogrid tmpMachine_5 = ((Machine_Gogrid) machine);
          ExecutableCloudModel.LOGGER.info("Import inside the Gogrid environment is done  ...");
        }
        if ((machine instanceof Machine_Hp_Helion)) {
          Machine_Hp_Helion tmpMachine_6 = ((Machine_Hp_Helion) machine);
          ExecutableCloudModel.LOGGER.info("Import inside the HP Helion environment is done  ...");
        }
        if ((machine instanceof Machine_ProfitBricks)) {
          Machine_ProfitBricks tmpMachine_7 = ((Machine_ProfitBricks) machine);
          ExecutableCloudModel.LOGGER.info("Import in ProfiBricks environment is done  ...");
        }
        if ((machine instanceof Machine_SoftLayer)) {
          Machine_SoftLayer tmpMachine_8 = ((Machine_SoftLayer) machine);
          ExecutableCloudModel.LOGGER.info("Import inside the Softlayer environment is done  ...");
        }
      }
    }
  }
  
  public boolean containMachine(final String machineName) {
    EList<Resource> _resources = this.configuration.getResources();
    for (final Resource r : _resources) {
      if ((r instanceof Machine)) {
        String _name = ((Machine) r).getName();
        boolean _equals = Objects.equal(_name, machineName);
        if (_equals) {
          return true;
        }
      }
    }
    return false;
  }
  
  public List<Machine> machinesInConfiguration() {
    List<Machine> machines = new ArrayList<Machine>();
    EList<Resource> _resources = this.configuration.getResources();
    for (final Resource r : _resources) {
      if ((r instanceof Machine)) {
        machines.add(((Machine) r));
      }
    }
    return machines;
  }
}
