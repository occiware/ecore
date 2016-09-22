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
import org.occiware.clouddesigner.occi.docker.connector.MachineManager;
import org.occiware.clouddesigner.occi.docker.impl.Machine_VMware_FusionImpl;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;

/**
 * This class implements executable Docker Machine on VMware Fusion.
 */
@SuppressWarnings("all")
public class ExecutableMachine_VMware_Fusion extends Machine_VMware_FusionImpl {
  /**
   * The machine manager.
   */
  private final MachineManager manager = new MachineManager(this) {
    @Override
    public String getDriverName() {
      return "vmwarefusion";
    }
    
    @Override
    public void appendDriverParameters(final StringBuilder sb) {
      if ((ExecutableMachine_VMware_Fusion.this.disk_size > 0)) {
        StringBuilder _append = sb.append(" --vmwarefusion-disk-size ");
        _append.append(ExecutableMachine_VMware_Fusion.this.disk_size);
      }
      if ((ExecutableMachine_VMware_Fusion.this.memory > 0.0F)) {
        StringBuilder _append_1 = sb.append(" --vmwarefusion-memory-size ");
        _append_1.append(ExecutableMachine_VMware_Fusion.this.memory);
      } else {
        if ((ExecutableMachine_VMware_Fusion.this.memory == 0.0F)) {
          StringBuilder _append_2 = sb.append(" --vmwarefusion-memory-size ");
          _append_2.append(1024.0);
        }
      }
      boolean _notEquals = (!Objects.equal(ExecutableMachine_VMware_Fusion.this.boot2docker_url, null));
      if (_notEquals) {
        StringBuilder _append_3 = sb.append(" --vmwarefusion-boot2docker-url ");
        _append_3.append(ExecutableMachine_VMware_Fusion.this.boot2docker_url);
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
