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

import com.google.common.base.Objects;
import org.occiware.clouddesigner.occi.docker.connector.MachineManager;
import org.occiware.clouddesigner.occi.docker.impl.Machine_VirtualBoxImpl;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;

/**
 * This class implements executable Docker Machine on VirtualBox.
 */
@SuppressWarnings("all")
public class ExecutableMachine_VirtualBox extends Machine_VirtualBoxImpl {
  /**
   * The machine manager.
   */
  private final MachineManager manager = new MachineManager(this) {
    @Override
    public String getDriverName() {
      return "virtualbox";
    }
    
    @Override
    public void appendDriverParameters(final StringBuilder sb) {
      if ((ExecutableMachine_VirtualBox.this.disk_size > 0)) {
        StringBuilder _append = sb.append(" --virtualbox-disk-size ");
        _append.append(ExecutableMachine_VirtualBox.this.disk_size);
      }
      if ((ExecutableMachine_VirtualBox.this.memory > 0.0F)) {
        StringBuilder _append_1 = sb.append(" --virtualbox-memory ");
        _append_1.append(ExecutableMachine_VirtualBox.this.memory);
      } else {
        if ((ExecutableMachine_VirtualBox.this.memory == 0.0F)) {
          StringBuilder _append_2 = sb.append(" --virtualbox-memory ");
          _append_2.append(1024.0);
        }
      }
      if ((ExecutableMachine_VirtualBox.this.cores > 0)) {
        StringBuilder _append_3 = sb.append(" --virtualbox-cpu-count ");
        _append_3.append(ExecutableMachine_VirtualBox.this.cores);
      } else {
        if ((ExecutableMachine_VirtualBox.this.cores == 0)) {
          StringBuilder _append_4 = sb.append(" --virtualbox-cpu-count ");
          _append_4.append((-1));
        }
      }
      boolean _notEquals = (!Objects.equal(ExecutableMachine_VirtualBox.this.boot2docker_url, null));
      if (_notEquals) {
        StringBuilder _append_5 = sb.append(" --virtualbox-boot2docker-url ");
        _append_5.append(ExecutableMachine_VirtualBox.this.boot2docker_url);
      }
    }
  };
  
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
}
