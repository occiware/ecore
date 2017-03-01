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
import org.occiware.clouddesigner.occi.docker.impl.Machine_GenericImpl;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;

/**
 * This class implements executable Docker Machine on Generic.
 */
@SuppressWarnings("all")
public class ExecutableMachine_Generic extends Machine_GenericImpl {
  /**
   * The machine manager.
   */
  private final MachineManager manager = new MachineManager(this) {
    @Override
    public String getDriverName() {
      return "generic";
    }
    
    @Override
    public void appendDriverParameters(final StringBuilder sb) {
      String _string = Integer.valueOf(ExecutableMachine_Generic.this.engine_port).toString();
      boolean _isEmpty = StringUtils.isEmpty(_string);
      boolean _not = (!_isEmpty);
      if (_not) {
        StringBuilder _append = sb.append(" --generic-engine-port ");
        _append.append(ExecutableMachine_Generic.this.engine_port);
      }
      boolean _isEmpty_1 = StringUtils.isEmpty(ExecutableMachine_Generic.this.ip_address);
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        StringBuilder _append_1 = sb.append(" --generic-ip-address ");
        _append_1.append(ExecutableMachine_Generic.this.ip_address);
      }
      boolean _isEmpty_2 = StringUtils.isEmpty(ExecutableMachine_Generic.this.ssh_user);
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        StringBuilder _append_2 = sb.append(" --generic-ssh-user ");
        _append_2.append(ExecutableMachine_Generic.this.ssh_user);
      }
      String _string_1 = Integer.valueOf(ExecutableMachine_Generic.this.ssh_port).toString();
      boolean _isEmpty_3 = StringUtils.isEmpty(_string_1);
      boolean _not_3 = (!_isEmpty_3);
      if (_not_3) {
        StringBuilder _append_3 = sb.append(" --generic-ssh-user ");
        _append_3.append(ExecutableMachine_Generic.this.ssh_port);
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
