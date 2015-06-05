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
import org.occiware.clouddesigner.occi.docker.impl.Machine_Google_Compute_EngineImpl;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;

/**
 * This class implements executable Docker Machine on Google Compute Engine.
 */
@SuppressWarnings("all")
public class ExecutableMachine_Google_Compute_Engine extends Machine_Google_Compute_EngineImpl {
  /**
   * The machine manager.
   */
  private final MachineManager manager = new MachineManager(this) {
    public String getDriverName() {
      return "google";
    }
    
    public void appendDriverParameters(final StringBuilder sb) {
      Preconditions.<String>checkNotNull(ExecutableMachine_Google_Compute_Engine.this.project, "project is null");
      boolean _isNotBlank = StringUtils.isNotBlank(ExecutableMachine_Google_Compute_Engine.this.project);
      if (_isNotBlank) {
        StringBuilder _append = sb.append(" --google-project ");
        _append.append(ExecutableMachine_Google_Compute_Engine.this.project);
      }
      boolean _isNotBlank_1 = StringUtils.isNotBlank(ExecutableMachine_Google_Compute_Engine.this.username);
      if (_isNotBlank_1) {
        StringBuilder _append_1 = sb.append(" --google-username ");
        _append_1.append(ExecutableMachine_Google_Compute_Engine.this.username);
      }
      boolean _isNotBlank_2 = StringUtils.isNotBlank(ExecutableMachine_Google_Compute_Engine.this.machine_type);
      if (_isNotBlank_2) {
        StringBuilder _append_2 = sb.append(" --google-machine-type ");
        _append_2.append(ExecutableMachine_Google_Compute_Engine.this.machine_type);
      }
      boolean _isNotBlank_3 = StringUtils.isNotBlank(ExecutableMachine_Google_Compute_Engine.this.zone);
      if (_isNotBlank_3) {
        StringBuilder _append_3 = sb.append(" --google-zone ");
        _append_3.append(ExecutableMachine_Google_Compute_Engine.this.zone);
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
