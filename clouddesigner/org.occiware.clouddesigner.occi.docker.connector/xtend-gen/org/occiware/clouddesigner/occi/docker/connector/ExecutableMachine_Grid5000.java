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

import org.apache.commons.lang.StringUtils;
import org.occiware.clouddesigner.occi.docker.connector.MachineManager;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerObserver;
import org.occiware.clouddesigner.occi.docker.impl.Machine_Grid5000Impl;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;

/**
 * This class implements executable Docker Machine on Grid5000.
 */
@SuppressWarnings("all")
public class ExecutableMachine_Grid5000 extends Machine_Grid5000Impl {
  /**
   * The machine manager.
   */
  private final MachineManager manager = new MachineManager(this) {
    @Override
    public String getDriverName() {
      return "g5k";
    }
    
    @Override
    public void appendDriverParameters(final StringBuilder sb) {
      boolean _isEmpty = StringUtils.isEmpty(ExecutableMachine_Grid5000.this.username);
      boolean _not = (!_isEmpty);
      if (_not) {
        StringBuilder _append = sb.append(" --g5k-username ");
        _append.append(ExecutableMachine_Grid5000.this.username);
      }
      boolean _isEmpty_1 = StringUtils.isEmpty(ExecutableMachine_Grid5000.this.password);
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        StringBuilder _append_1 = sb.append(" --g5k-password ");
        _append_1.append(ExecutableMachine_Grid5000.this.password);
      }
      boolean _isEmpty_2 = StringUtils.isEmpty(ExecutableMachine_Grid5000.this.site);
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        StringBuilder _append_2 = sb.append(" --g5k-site ");
        _append_2.append(ExecutableMachine_Grid5000.this.site);
      }
      boolean _isEmpty_3 = StringUtils.isEmpty(ExecutableMachine_Grid5000.this.walltime);
      boolean _not_3 = (!_isEmpty_3);
      if (_not_3) {
        StringBuilder _append_3 = sb.append(" --g5k-walltime ");
        _append_3.append(ExecutableMachine_Grid5000.this.walltime);
      }
      boolean _isEmpty_4 = StringUtils.isEmpty(ExecutableMachine_Grid5000.this.ssh_private_key);
      boolean _not_4 = (!_isEmpty_4);
      if (_not_4) {
        StringBuilder _append_4 = sb.append(" --g5k-ssh-private-key ");
        _append_4.append(ExecutableMachine_Grid5000.this.ssh_private_key);
      }
      boolean _isEmpty_5 = StringUtils.isEmpty(ExecutableMachine_Grid5000.this.ssh_public_key);
      boolean _not_5 = (!_isEmpty_5);
      if (_not_5) {
        StringBuilder _append_5 = sb.append(" --g5k-ssh-public-key ");
        _append_5.append(ExecutableMachine_Grid5000.this.ssh_public_key);
      }
      boolean _isEmpty_6 = StringUtils.isEmpty(ExecutableMachine_Grid5000.this.image);
      boolean _not_6 = (!_isEmpty_6);
      if (_not_6) {
        StringBuilder _append_6 = sb.append(" --g5k-image ");
        _append_6.append(ExecutableMachine_Grid5000.this.image);
      }
      boolean _isEmpty_7 = StringUtils.isEmpty(ExecutableMachine_Grid5000.this.resource_properties);
      boolean _not_7 = (!_isEmpty_7);
      if (_not_7) {
        StringBuilder _append_7 = sb.append(" --g5k-resource-properties ");
        _append_7.append(ExecutableMachine_Grid5000.this.resource_properties);
      }
      boolean _isEmpty_8 = StringUtils.isEmpty(ExecutableMachine_Grid5000.this.use_job_reservation);
      boolean _not_8 = (!_isEmpty_8);
      if (_not_8) {
        StringBuilder _append_8 = sb.append(" --g5k-use-job-reservation ");
        _append_8.append(ExecutableMachine_Grid5000.this.use_job_reservation);
      }
      boolean _isEmpty_9 = StringUtils.isEmpty(ExecutableMachine_Grid5000.this.host_to_provision);
      boolean _not_9 = (!_isEmpty_9);
      if (_not_9) {
        StringBuilder _append_9 = sb.append(" --g5k-host-to-provision ");
        _append_9.append(ExecutableMachine_Grid5000.this.host_to_provision);
      }
    }
  };
  
  @Override
  public void start() {
    this.manager.start();
    final DockerObserver observer = new DockerObserver();
    observer.listener(this);
  }
  
  public void startAll() {
    this.manager.startAll();
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
