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

import com.google.common.base.Preconditions;
import org.apache.commons.lang.StringUtils;
import org.occiware.clouddesigner.occi.docker.connector.MachineManager;
import org.occiware.clouddesigner.occi.docker.impl.Machine_RackspaceImpl;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;

/**
 * This class implements executable Docker Machine on Rackspace.
 */
@SuppressWarnings("all")
public class ExecutableMachine_Rackspace extends Machine_RackspaceImpl {
  /**
   * The machine manager.
   */
  private final MachineManager manager = new MachineManager(this) {
    @Override
    public String getDriverName() {
      return "rackspace";
    }
    
    @Override
    public void appendDriverParameters(final StringBuilder sb) {
      Preconditions.<String>checkNotNull(ExecutableMachine_Rackspace.this.api_key, "api_key is null");
      Preconditions.<String>checkNotNull(ExecutableMachine_Rackspace.this.username, "username is null");
      Preconditions.<String>checkNotNull(ExecutableMachine_Rackspace.this.region, "region is null");
      boolean _isNotBlank = StringUtils.isNotBlank(ExecutableMachine_Rackspace.this.api_key);
      if (_isNotBlank) {
        StringBuilder _append = sb.append(" --rackspace-api-key ");
        _append.append(ExecutableMachine_Rackspace.this.api_key);
      }
      boolean _isNotBlank_1 = StringUtils.isNotBlank(ExecutableMachine_Rackspace.this.username);
      if (_isNotBlank_1) {
        StringBuilder _append_1 = sb.append(" --rackspace-username ");
        _append_1.append(ExecutableMachine_Rackspace.this.username);
      }
      boolean _isNotBlank_2 = StringUtils.isNotBlank(ExecutableMachine_Rackspace.this.region);
      if (_isNotBlank_2) {
        StringBuilder _append_2 = sb.append(" --rackspace-region ");
        _append_2.append(ExecutableMachine_Rackspace.this.region);
      }
      boolean _isNotBlank_3 = StringUtils.isNotBlank(ExecutableMachine_Rackspace.this.endpoint_type);
      if (_isNotBlank_3) {
        StringBuilder _append_3 = sb.append(" --rackspace-endpoint-type ");
        _append_3.append(ExecutableMachine_Rackspace.this.endpoint_type);
      }
      boolean _isNotBlank_4 = StringUtils.isNotBlank(ExecutableMachine_Rackspace.this.ssh_user);
      if (_isNotBlank_4) {
        StringBuilder _append_4 = sb.append(" --rackspace-ssh-user ");
        _append_4.append(ExecutableMachine_Rackspace.this.ssh_user);
      }
      if ((ExecutableMachine_Rackspace.this.ssh_port > 0)) {
        StringBuilder _append_5 = sb.append(" --rackspace-ssh-port ");
        _append_5.append(ExecutableMachine_Rackspace.this.ssh_port);
      }
      boolean _isNotBlank_5 = StringUtils.isNotBlank(ExecutableMachine_Rackspace.this.flavor_id);
      if (_isNotBlank_5) {
        StringBuilder _append_6 = sb.append(" --rackspace-flavor-id ");
        _append_6.append(ExecutableMachine_Rackspace.this.flavor_id);
      }
      if ((!ExecutableMachine_Rackspace.this.docker_install)) {
        StringBuilder _append_7 = sb.append(" --rackspace-docker-install ");
        _append_7.append(ExecutableMachine_Rackspace.this.docker_install);
      }
    }
  };
  
  public void startAll() {
    this.manager.start();
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
