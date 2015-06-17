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
import org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_vSphereImpl;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;

/**
 * This class implements executable Docker Machine on VMware vSphere.
 */
@SuppressWarnings("all")
public class ExecutableMachine_VMware_vSphere extends Machine_VMware_vSphereImpl {
  /**
   * The machine manager.
   */
  private final MachineManager manager = new MachineManager(this) {
    @Override
    public String getDriverName() {
      return "vmwarevsphere";
    }
    
    @Override
    public void appendDriverParameters(final StringBuilder sb) {
      boolean _isNotBlank = StringUtils.isNotBlank(ExecutableMachine_VMware_vSphere.this.username);
      if (_isNotBlank) {
        StringBuilder _append = sb.append(" --vmwarevsphere-username ");
        _append.append(ExecutableMachine_VMware_vSphere.this.username);
      }
      boolean _isNotBlank_1 = StringUtils.isNotBlank(ExecutableMachine_VMware_vSphere.this.password);
      if (_isNotBlank_1) {
        StringBuilder _append_1 = sb.append(" --vmwarevsphere-password ");
        _append_1.append(ExecutableMachine_VMware_vSphere.this.password);
      }
      boolean _isNotBlank_2 = StringUtils.isNotBlank(ExecutableMachine_VMware_vSphere.this.datacenter);
      if (_isNotBlank_2) {
        StringBuilder _append_2 = sb.append(" --vmwarevsphere-datacenter ");
        _append_2.append(ExecutableMachine_VMware_vSphere.this.datacenter);
      }
      boolean _isNotBlank_3 = StringUtils.isNotBlank(ExecutableMachine_VMware_vSphere.this.vcenter);
      if (_isNotBlank_3) {
        StringBuilder _append_3 = sb.append(" --vmwarevsphere-vcenter ");
        _append_3.append(ExecutableMachine_VMware_vSphere.this.vcenter);
      }
      boolean _isNotBlank_4 = StringUtils.isNotBlank(ExecutableMachine_VMware_vSphere.this.datastore);
      if (_isNotBlank_4) {
        StringBuilder _append_4 = sb.append(" --vmwarevsphere-datastore ");
        _append_4.append(ExecutableMachine_VMware_vSphere.this.datastore);
      }
      boolean _isNotBlank_5 = StringUtils.isNotBlank(ExecutableMachine_VMware_vSphere.this.network);
      if (_isNotBlank_5) {
        StringBuilder _append_5 = sb.append(" --vmwarevsphere-network ");
        _append_5.append(ExecutableMachine_VMware_vSphere.this.network);
      }
      boolean _isNotBlank_6 = StringUtils.isNotBlank(ExecutableMachine_VMware_vSphere.this.boot2docker_url);
      if (_isNotBlank_6) {
        StringBuilder _append_6 = sb.append(" --vmwarevsphere-boot2docker-url ");
        _append_6.append(ExecutableMachine_VMware_vSphere.this.boot2docker_url);
      }
      boolean _isNotBlank_7 = StringUtils.isNotBlank(ExecutableMachine_VMware_vSphere.this.compute_ip);
      if (_isNotBlank_7) {
        StringBuilder _append_7 = sb.append(" --vmwarevsphere-compute-ip ");
        _append_7.append(ExecutableMachine_VMware_vSphere.this.compute_ip);
      }
      boolean _isNotBlank_8 = StringUtils.isNotBlank(ExecutableMachine_VMware_vSphere.this.pool);
      if (_isNotBlank_8) {
        StringBuilder _append_8 = sb.append(" --vmwarevsphere-pool ");
        _append_8.append(ExecutableMachine_VMware_vSphere.this.pool);
      }
      if ((ExecutableMachine_VMware_vSphere.this.memory > 0)) {
        StringBuilder _append_9 = sb.append(" --vmwarevsphere-memory-size ");
        _append_9.append(ExecutableMachine_VMware_vSphere.this.memory);
      }
      if ((ExecutableMachine_VMware_vSphere.this.disk_size > 0)) {
        StringBuilder _append_10 = sb.append(" --vmwarevsphere-disk-size ");
        _append_10.append(ExecutableMachine_VMware_vSphere.this.disk_size);
      }
    }
  };
  
  public void startAll() {
    this.manager.startAll();
  }
  
  @Override
  public void start() {
    this.manager.start();
  }
  
  @Override
  public void stop(final StopMethod method) {
    this.manager.stop(method);
  }
  
  @Override
  public void restart(final RestartMethod method) {
    this.manager.restart(method);
  }
  
  @Override
  public void suspend(final SuspendMethod method) {
    this.manager.suspend(method);
  }
  
  public void synchronize() {
    this.manager.synchronize();
  }
}
