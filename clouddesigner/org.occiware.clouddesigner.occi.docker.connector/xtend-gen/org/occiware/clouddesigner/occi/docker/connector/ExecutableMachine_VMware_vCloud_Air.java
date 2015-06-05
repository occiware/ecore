/**
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	- Philippe MERLE
 * 	- Fawaz PARAISO
 */
package org.occiware.clouddesigner.occi.docker.connector;

import org.apache.commons.lang.StringUtils;
import org.occiware.clouddesigner.occi.docker.connector.MachineManager;
import org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vCloud_AirImpl;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;

/**
 * This class implements executable Docker Machine on VMware vCloud Air.
 */
@SuppressWarnings("all")
public class ExecutableMachine_VMware_vCloud_Air extends Machine_VMware_vCloud_AirImpl {
  /**
   * The machine manager.
   */
  private final MachineManager manager = new MachineManager(this) {
    public String getDriverName() {
      return "vmwarevcloudair";
    }
    
    public void appendDriverParameters(final StringBuilder sb) {
      boolean _isNotBlank = StringUtils.isNotBlank(ExecutableMachine_VMware_vCloud_Air.this.username);
      if (_isNotBlank) {
        StringBuilder _append = sb.append(" --vmwarevcloudair-username ");
        _append.append(ExecutableMachine_VMware_vCloud_Air.this.username);
      }
      boolean _isNotBlank_1 = StringUtils.isNotBlank(ExecutableMachine_VMware_vCloud_Air.this.password);
      if (_isNotBlank_1) {
        StringBuilder _append_1 = sb.append(" --vmwarevcloudair-password ");
        _append_1.append(ExecutableMachine_VMware_vCloud_Air.this.password);
      }
      boolean _isNotBlank_2 = StringUtils.isNotBlank(ExecutableMachine_VMware_vCloud_Air.this.computeid);
      if (_isNotBlank_2) {
        StringBuilder _append_2 = sb.append(" --vmwarevcloudair-computeid ");
        _append_2.append(ExecutableMachine_VMware_vCloud_Air.this.computeid);
      }
      if ((ExecutableMachine_VMware_vCloud_Air.this.cpu_count > 0)) {
        StringBuilder _append_3 = sb.append(" --vmwarevcloudair-computeid ");
        _append_3.append(ExecutableMachine_VMware_vCloud_Air.this.cpu_count);
      }
      boolean _isNotBlank_3 = StringUtils.isNotBlank(ExecutableMachine_VMware_vCloud_Air.this.catalog);
      if (_isNotBlank_3) {
        StringBuilder _append_4 = sb.append(" --vmwarevcloudair-catalog ");
        _append_4.append(ExecutableMachine_VMware_vCloud_Air.this.catalog);
      }
      if ((ExecutableMachine_VMware_vCloud_Air.this.docker_port > 0)) {
        StringBuilder _append_5 = sb.append(" --vmwarevcloudair-docker-port ");
        _append_5.append(ExecutableMachine_VMware_vCloud_Air.this.docker_port);
      }
      boolean _isNotBlank_4 = StringUtils.isNotBlank(ExecutableMachine_VMware_vCloud_Air.this.edgegateway);
      if (_isNotBlank_4) {
        StringBuilder _append_6 = sb.append(" --vmwarevcloudair-edgegateway ");
        _append_6.append(ExecutableMachine_VMware_vCloud_Air.this.edgegateway);
      }
      if ((ExecutableMachine_VMware_vCloud_Air.this.memory_size > 0)) {
        StringBuilder _append_7 = sb.append(" --vmwarevcloudair-edgegateway ");
        _append_7.append(ExecutableMachine_VMware_vCloud_Air.this.memory_size);
      }
      if (ExecutableMachine_VMware_vCloud_Air.this.provision) {
        StringBuilder _append_8 = sb.append(" --vmwarevcloudair-provision ");
        _append_8.append(ExecutableMachine_VMware_vCloud_Air.this.provision);
      }
      boolean _isNotBlank_5 = StringUtils.isNotBlank(ExecutableMachine_VMware_vCloud_Air.this.publicip);
      if (_isNotBlank_5) {
        StringBuilder _append_9 = sb.append(" --vmwarevcloudair-publicip ");
        _append_9.append(ExecutableMachine_VMware_vCloud_Air.this.publicip);
      }
      boolean _isNotBlank_6 = StringUtils.isNotBlank(ExecutableMachine_VMware_vCloud_Air.this.orgvdcnetwork);
      if (_isNotBlank_6) {
        StringBuilder _append_10 = sb.append(" --vmwarevcloudair-orgvdcnetwork ");
        _append_10.append(ExecutableMachine_VMware_vCloud_Air.this.orgvdcnetwork);
      }
      if ((ExecutableMachine_VMware_vCloud_Air.this.ssh_port > 0)) {
        StringBuilder _append_11 = sb.append(" --vmwarevcloudair-ssh-port ");
        _append_11.append(ExecutableMachine_VMware_vCloud_Air.this.ssh_port);
      }
      boolean _isNotBlank_7 = StringUtils.isNotBlank(ExecutableMachine_VMware_vCloud_Air.this.vdcid);
      if (_isNotBlank_7) {
        StringBuilder _append_12 = sb.append(" --vmwarevcloudair-vdcid ");
        _append_12.append(ExecutableMachine_VMware_vCloud_Air.this.vdcid);
      }
    }
  };
  
  public void startAll() {
    this.manager.startAll();
  }
  
  public void start() {
    this.manager.start();
  }
  
  public void stop(final StopMethod method) {
    this.manager.stop(method);
  }
  
  public void restart(final RestartMethod method) {
    this.manager.restart(method);
  }
  
  public void suspend(final SuspendMethod method) {
    this.manager.suspend(method);
  }
  
  public void synchronize() {
    this.manager.synchronize();
  }
}
