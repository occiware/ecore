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

import com.google.common.base.Preconditions;
import org.apache.commons.lang.StringUtils;
import org.occiware.clouddesigner.occi.docker.connector.MachineManager;
import org.occiware.clouddesigner.occi.docker.impl.Machine_Digital_OceanImpl;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;

/**
 * This class implements executable Docker Machine on Digital Ocean.
 */
@SuppressWarnings("all")
public class ExecutableMachine_Digital_Ocean extends Machine_Digital_OceanImpl {
  /**
   * The machine manager.
   */
  private final MachineManager manager = new MachineManager(this) {
    public String getDriverName() {
      return "digitalocean";
    }
    
    public void appendDriverParameters(final StringBuilder sb) {
      Preconditions.<String>checkNotNull(ExecutableMachine_Digital_Ocean.this.access_token, "access_token is null");
      Preconditions.<String>checkNotNull(ExecutableMachine_Digital_Ocean.this.size, "size is null");
      boolean _isNotBlank = StringUtils.isNotBlank(ExecutableMachine_Digital_Ocean.this.access_token);
      if (_isNotBlank) {
        StringBuilder _append = sb.append(" --digitalocean-access-token ");
        _append.append(ExecutableMachine_Digital_Ocean.this.access_token);
      }
      boolean _isNotBlank_1 = StringUtils.isNotBlank(ExecutableMachine_Digital_Ocean.this.size);
      if (_isNotBlank_1) {
        StringBuilder _append_1 = sb.append(" --digitalocean-size ");
        _append_1.append(ExecutableMachine_Digital_Ocean.this.size);
      }
      boolean _isNotBlank_2 = StringUtils.isNotBlank(ExecutableMachine_Digital_Ocean.this.region);
      if (_isNotBlank_2) {
        StringBuilder _append_2 = sb.append(" --digitalocean-region ");
        _append_2.append(ExecutableMachine_Digital_Ocean.this.region);
      }
      boolean _isNotBlank_3 = StringUtils.isNotBlank(ExecutableMachine_Digital_Ocean.this.image);
      if (_isNotBlank_3) {
        StringBuilder _append_3 = sb.append(" --digitalocean-image ");
        _append_3.append(ExecutableMachine_Digital_Ocean.this.image);
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
