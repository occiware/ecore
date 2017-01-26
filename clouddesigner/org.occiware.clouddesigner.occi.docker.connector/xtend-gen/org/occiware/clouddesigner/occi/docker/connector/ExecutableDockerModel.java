/**
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Fawaz PARAISO
 * - Philippe MERLE
 */
package org.occiware.clouddesigner.occi.docker.connector;

import com.google.common.base.Objects;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.docker.Container;
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
import org.occiware.clouddesigner.occi.docker.Network;
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
import org.occiware.clouddesigner.occi.docker.connector.ModelHandler;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class ExecutableDockerModel {
  private static Logger LOGGER = LoggerFactory.getLogger(ExecutableDockerModel.class);
  
  public Machine machine;
  
  public Container container;
  
  public Configuration configuration;
  
  public Machine_VirtualBox machine_VirtualBox;
  
  public Machine_Amazon_EC2 machine_Amazon_EC2;
  
  public Machine_Digital_Ocean machine_Digital_Ocean;
  
  public Machine_Google_Compute_Engine machine_Google_Compute_Engine;
  
  public Machine_IBM_SoftLayer machine_IBM_SoftLayer;
  
  public Machine_Microsoft_Azure machine_Microsoft_Azure;
  
  public Machine_Microsoft_Hyper_V machine_Microsoft_Hyper_V;
  
  public Machine_OpenStack machine_OpenStack;
  
  public Machine_Rackspace machine_Rackspace;
  
  public Machine_VMware_Fusion machine_VMware_Fusion;
  
  public Machine_VMware_vCloud_Air machine_VMware_vCloud_Air;
  
  public Machine_VMware_vSphere machine_VMware_vSphere;
  
  public Network network;
  
  public ExecutableDockerModel() {
  }
  
  public ExecutableDockerModel(final Machine machine) {
    this.machine = machine;
    if ((machine instanceof Machine_VirtualBox)) {
      this.machine_VirtualBox = ((Machine_VirtualBox)machine);
    } else {
      if ((machine instanceof Machine_Amazon_EC2)) {
        this.machine_Amazon_EC2 = ((Machine_Amazon_EC2)machine);
      } else {
        if ((machine instanceof Machine_Digital_Ocean)) {
          this.machine_Digital_Ocean = ((Machine_Digital_Ocean)machine);
        } else {
          if ((machine instanceof Machine_Google_Compute_Engine)) {
            this.machine_Google_Compute_Engine = ((Machine_Google_Compute_Engine)machine);
          } else {
            if ((machine instanceof Machine_IBM_SoftLayer)) {
              this.machine_IBM_SoftLayer = ((Machine_IBM_SoftLayer)machine);
            } else {
              if ((machine instanceof Machine_Microsoft_Azure)) {
                this.machine_Microsoft_Azure = ((Machine_Microsoft_Azure)machine);
              } else {
                if ((machine instanceof Machine_Microsoft_Hyper_V)) {
                  this.machine_Microsoft_Hyper_V = ((Machine_Microsoft_Hyper_V)machine);
                } else {
                  if ((machine instanceof Machine_OpenStack)) {
                    this.machine_OpenStack = ((Machine_OpenStack)machine);
                  } else {
                    if ((machine instanceof Machine_Rackspace)) {
                      this.machine_Rackspace = ((Machine_Rackspace)machine);
                    } else {
                      if ((machine instanceof Machine_VMware_Fusion)) {
                        this.machine_VMware_Fusion = ((Machine_VMware_Fusion)machine);
                      } else {
                        if ((machine instanceof Machine_VMware_vCloud_Air)) {
                          this.machine_VMware_vCloud_Air = ((Machine_VMware_vCloud_Air)machine);
                        } else {
                          if ((machine instanceof Machine_VMware_vSphere)) {
                            this.machine_VMware_vSphere = ((Machine_VMware_vSphere)machine);
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
      }
    }
  }
  
  public ExecutableDockerModel(final Configuration configuration) {
    this.configuration = configuration;
  }
  
  public ExecutableDockerModel(final Container container) {
    this.container = container;
  }
  
  public ExecutableDockerModel(final Network network) {
    this.network = network;
  }
  
  public void create() {
    return;
  }
  
  public void start() {
    boolean _notEquals = (!Objects.equal(this.machine_VirtualBox, null));
    if (_notEquals) {
      this.machine_VirtualBox.start();
      return;
    }
    boolean _notEquals_1 = (!Objects.equal(this.machine_Amazon_EC2, null));
    if (_notEquals_1) {
      this.machine_Amazon_EC2.start();
      return;
    }
    boolean _notEquals_2 = (!Objects.equal(this.machine_Digital_Ocean, null));
    if (_notEquals_2) {
      this.machine_Digital_Ocean.start();
      return;
    }
    boolean _notEquals_3 = (!Objects.equal(this.machine_Google_Compute_Engine, null));
    if (_notEquals_3) {
      this.machine_Google_Compute_Engine.start();
      return;
    }
    boolean _notEquals_4 = (!Objects.equal(this.machine_IBM_SoftLayer, null));
    if (_notEquals_4) {
      this.machine_IBM_SoftLayer.start();
      return;
    }
    boolean _notEquals_5 = (!Objects.equal(this.machine_Microsoft_Azure, null));
    if (_notEquals_5) {
      this.machine_Microsoft_Azure.start();
      return;
    }
    boolean _notEquals_6 = (!Objects.equal(this.machine_Microsoft_Hyper_V, null));
    if (_notEquals_6) {
      this.machine_Microsoft_Hyper_V.start();
      return;
    }
    boolean _notEquals_7 = (!Objects.equal(this.machine_OpenStack, null));
    if (_notEquals_7) {
      this.machine_OpenStack.start();
      return;
    }
    boolean _notEquals_8 = (!Objects.equal(this.machine_Rackspace, null));
    if (_notEquals_8) {
      this.machine_Rackspace.start();
      return;
    }
    boolean _notEquals_9 = (!Objects.equal(this.machine_VMware_Fusion, null));
    if (_notEquals_9) {
      this.machine_VMware_Fusion.start();
      return;
    }
    boolean _notEquals_10 = (!Objects.equal(this.machine_VMware_vCloud_Air, null));
    if (_notEquals_10) {
      this.machine_VMware_vCloud_Air.start();
      return;
    }
    boolean _notEquals_11 = (!Objects.equal(this.machine_VMware_vSphere, null));
    if (_notEquals_11) {
      this.machine_VMware_vSphere.start();
      return;
    }
  }
  
  public void startAll() {
    boolean _notEquals = (!Objects.equal(this.machine_VirtualBox, null));
    if (_notEquals) {
      ((ExecutableMachine_VirtualBox) this.machine_VirtualBox).startAll();
      return;
    }
    boolean _notEquals_1 = (!Objects.equal(this.machine_Amazon_EC2, null));
    if (_notEquals_1) {
      ((ExecutableMachine_Amazon_EC2) this.machine_Amazon_EC2).startAll();
      return;
    }
    boolean _notEquals_2 = (!Objects.equal(this.machine_Digital_Ocean, null));
    if (_notEquals_2) {
      ((ExecutableMachine_Digital_Ocean) this.machine_Digital_Ocean).startAll();
      return;
    }
    boolean _notEquals_3 = (!Objects.equal(this.machine_Google_Compute_Engine, null));
    if (_notEquals_3) {
      ((ExecutableMachine_Google_Compute_Engine) this.machine_Google_Compute_Engine).startAll();
      return;
    }
    boolean _notEquals_4 = (!Objects.equal(this.machine_IBM_SoftLayer, null));
    if (_notEquals_4) {
      ((ExecutableMachine_IBM_SoftLayer) this.machine_IBM_SoftLayer).startAll();
      return;
    }
    boolean _notEquals_5 = (!Objects.equal(this.machine_Microsoft_Azure, null));
    if (_notEquals_5) {
      ((ExecutableMachine_Microsoft_Azure) this.machine_Microsoft_Azure).startAll();
      return;
    }
    boolean _notEquals_6 = (!Objects.equal(this.machine_Microsoft_Hyper_V, null));
    if (_notEquals_6) {
      ((ExecutableMachine_Microsoft_Hyper_V) this.machine_Microsoft_Hyper_V).startAll();
      return;
    }
    boolean _notEquals_7 = (!Objects.equal(this.machine_OpenStack, null));
    if (_notEquals_7) {
      ((ExecutableMachine_OpenStack) this.machine_OpenStack).startAll();
      return;
    }
    boolean _notEquals_8 = (!Objects.equal(this.machine_Rackspace, null));
    if (_notEquals_8) {
      ((ExecutableMachine_Rackspace) this.machine_Rackspace).startAll();
      return;
    }
    boolean _notEquals_9 = (!Objects.equal(this.machine_VMware_Fusion, null));
    if (_notEquals_9) {
      ((ExecutableMachine_VMware_Fusion) this.machine_VMware_Fusion).startAll();
      return;
    }
    boolean _notEquals_10 = (!Objects.equal(this.machine_VMware_vCloud_Air, null));
    if (_notEquals_10) {
      ((ExecutableMachine_VMware_vCloud_Air) this.machine_VMware_vCloud_Air).startAll();
      return;
    }
    boolean _notEquals_11 = (!Objects.equal(this.machine_VMware_vSphere, null));
    if (_notEquals_11) {
      ((ExecutableMachine_VMware_vSphere) this.machine_VMware_vSphere).startAll();
      return;
    }
  }
  
  public void stop() {
    boolean _notEquals = (!Objects.equal(this.machine_VirtualBox, null));
    if (_notEquals) {
      ((ExecutableMachine_VirtualBox) this.machine_VirtualBox).stop(StopMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_1 = (!Objects.equal(this.machine_Amazon_EC2, null));
    if (_notEquals_1) {
      ((ExecutableMachine_Amazon_EC2) this.machine_Amazon_EC2).stop(StopMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_2 = (!Objects.equal(this.machine_Digital_Ocean, null));
    if (_notEquals_2) {
      ((ExecutableMachine_Digital_Ocean) this.machine_Digital_Ocean).stop(StopMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_3 = (!Objects.equal(this.machine_Google_Compute_Engine, null));
    if (_notEquals_3) {
      ((ExecutableMachine_Google_Compute_Engine) this.machine_Google_Compute_Engine).stop(StopMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_4 = (!Objects.equal(this.machine_IBM_SoftLayer, null));
    if (_notEquals_4) {
      ((ExecutableMachine_IBM_SoftLayer) this.machine_IBM_SoftLayer).stop(StopMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_5 = (!Objects.equal(this.machine_Microsoft_Azure, null));
    if (_notEquals_5) {
      ((ExecutableMachine_Microsoft_Azure) this.machine_Microsoft_Azure).stop(StopMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_6 = (!Objects.equal(this.machine_Microsoft_Hyper_V, null));
    if (_notEquals_6) {
      ((ExecutableMachine_Microsoft_Hyper_V) this.machine_Microsoft_Hyper_V).stop(StopMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_7 = (!Objects.equal(this.machine_OpenStack, null));
    if (_notEquals_7) {
      ((ExecutableMachine_OpenStack) this.machine_OpenStack).stop(StopMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_8 = (!Objects.equal(this.machine_Rackspace, null));
    if (_notEquals_8) {
      ((ExecutableMachine_Rackspace) this.machine_Rackspace).stop(StopMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_9 = (!Objects.equal(this.machine_VMware_Fusion, null));
    if (_notEquals_9) {
      ((ExecutableMachine_VMware_Fusion) this.machine_VMware_Fusion).stop(StopMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_10 = (!Objects.equal(this.machine_VMware_vCloud_Air, null));
    if (_notEquals_10) {
      ((ExecutableMachine_VMware_vCloud_Air) this.machine_VMware_vCloud_Air).stop(StopMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_11 = (!Objects.equal(this.machine_VMware_vSphere, null));
    if (_notEquals_11) {
      ((ExecutableMachine_VMware_vSphere) this.machine_VMware_vSphere).stop(StopMethod.GRACEFUL);
      return;
    }
  }
  
  public void restart() {
    boolean _notEquals = (!Objects.equal(this.machine_VirtualBox, null));
    if (_notEquals) {
      this.machine_VirtualBox.restart(RestartMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_1 = (!Objects.equal(this.machine_Amazon_EC2, null));
    if (_notEquals_1) {
      this.machine_Amazon_EC2.restart(RestartMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_2 = (!Objects.equal(this.machine_Digital_Ocean, null));
    if (_notEquals_2) {
      this.machine_Digital_Ocean.restart(RestartMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_3 = (!Objects.equal(this.machine_Google_Compute_Engine, null));
    if (_notEquals_3) {
      this.machine_Google_Compute_Engine.restart(RestartMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_4 = (!Objects.equal(this.machine_IBM_SoftLayer, null));
    if (_notEquals_4) {
      this.machine_IBM_SoftLayer.restart(RestartMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_5 = (!Objects.equal(this.machine_Microsoft_Azure, null));
    if (_notEquals_5) {
      this.machine_Microsoft_Azure.restart(RestartMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_6 = (!Objects.equal(this.machine_Microsoft_Hyper_V, null));
    if (_notEquals_6) {
      this.machine_Microsoft_Hyper_V.restart(RestartMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_7 = (!Objects.equal(this.machine_OpenStack, null));
    if (_notEquals_7) {
      this.machine_OpenStack.restart(RestartMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_8 = (!Objects.equal(this.machine_Rackspace, null));
    if (_notEquals_8) {
      this.machine_Rackspace.restart(RestartMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_9 = (!Objects.equal(this.machine_VMware_Fusion, null));
    if (_notEquals_9) {
      this.machine_VMware_Fusion.restart(RestartMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_10 = (!Objects.equal(this.machine_VMware_vCloud_Air, null));
    if (_notEquals_10) {
      this.machine_VMware_vCloud_Air.restart(RestartMethod.GRACEFUL);
      return;
    }
    boolean _notEquals_11 = (!Objects.equal(this.machine_VMware_vSphere, null));
    if (_notEquals_11) {
      this.machine_VMware_vSphere.restart(RestartMethod.GRACEFUL);
      return;
    }
  }
  
  public void synchronize() {
    if ((this.machine instanceof Machine_VirtualBox)) {
      ((ExecutableMachine_VirtualBox) this.machine_VirtualBox).synchronize();
    } else {
      if ((this.machine instanceof Machine_Amazon_EC2)) {
        ((ExecutableMachine_Amazon_EC2) this.machine_Amazon_EC2).synchronize();
      } else {
        if ((this.machine instanceof Machine_Digital_Ocean)) {
          ((ExecutableMachine_Digital_Ocean) this.machine_Digital_Ocean).synchronize();
        } else {
          if ((this.machine instanceof Machine_Google_Compute_Engine)) {
            ((ExecutableMachine_Google_Compute_Engine) this.machine_Google_Compute_Engine).synchronize();
          } else {
            if ((this.machine instanceof Machine_IBM_SoftLayer)) {
              ((ExecutableMachine_IBM_SoftLayer) this.machine_IBM_SoftLayer).synchronize();
            } else {
              if ((this.machine instanceof Machine_Microsoft_Azure)) {
                ((ExecutableMachine_Microsoft_Azure) this.machine_Microsoft_Azure).synchronize();
              } else {
                if ((this.machine instanceof Machine_Microsoft_Hyper_V)) {
                  ((ExecutableMachine_Microsoft_Hyper_V) this.machine_Microsoft_Hyper_V).synchronize();
                } else {
                  if ((this.machine instanceof Machine_OpenStack)) {
                    ((ExecutableMachine_OpenStack) this.machine_OpenStack).synchronize();
                  } else {
                    if ((this.machine instanceof Machine_Rackspace)) {
                      ((ExecutableMachine_Rackspace) this.machine_Rackspace).synchronize();
                    } else {
                      if ((this.machine instanceof Machine_VMware_Fusion)) {
                        ((ExecutableMachine_VMware_Fusion) this.machine_VMware_Fusion).synchronize();
                      } else {
                        if ((this.machine instanceof Machine_VMware_vCloud_Air)) {
                          ((ExecutableMachine_VMware_vCloud_Air) this.machine_VMware_vCloud_Air).synchronize();
                        } else {
                          if ((this.machine instanceof Machine_VMware_vSphere)) {
                            ((ExecutableMachine_VMware_vSphere) this.machine_VMware_vSphere).synchronize();
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
      }
    }
  }
  
  public void importModel() {
    final Map<String, String> hosts = DockerUtil.getHosts();
    final ModelHandler instanceMH = new ModelHandler();
    String _string = hosts.toString();
    ExecutableDockerModel.LOGGER.info(_string);
    Set<Map.Entry<String, String>> _entrySet = hosts.entrySet();
    for (final Map.Entry<String, String> entry : _entrySet) {
      {
        String _key = entry.getKey();
        final boolean machineExistInModeler = this.containMachine(_key);
        if ((!machineExistInModeler)) {
          String _key_1 = entry.getKey();
          String _value = entry.getValue();
          Machine machine = instanceMH.getModel(_key_1, _value, machineExistInModeler);
          EList<Resource> _resources = this.configuration.getResources();
          _resources.add(machine);
          EList<Link> _links = machine.getLinks();
          boolean _notEquals = (!Objects.equal(_links, null));
          if (_notEquals) {
            EList<Link> _links_1 = machine.getLinks();
            final Procedure1<Link> _function = new Procedure1<Link>() {
              @Override
              public void apply(final Link elt) {
                EList<Resource> _resources = ExecutableDockerModel.this.configuration.getResources();
                Resource _target = elt.getTarget();
                _resources.add(
                  ((Container) _target));
              }
            };
            IterableExtensions.<Link>forEach(_links_1, _function);
          }
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
  
  public boolean containNetwork(final String networkName) {
    EList<Resource> _resources = this.configuration.getResources();
    for (final Resource r : _resources) {
      if ((r instanceof Network)) {
        String _name = ((Network) r).getName();
        boolean _equals = Objects.equal(_name, networkName);
        if (_equals) {
          return true;
        }
      }
    }
    return false;
  }
}
