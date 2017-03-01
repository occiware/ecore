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
import org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_Hyper_VImpl;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;

/**
 * This class implements executable Docker Machine on Microsoft Hyper V.
 */
@SuppressWarnings("all")
public class ExecutableMachine_Microsoft_Hyper_V extends Machine_Microsoft_Hyper_VImpl {
  /**
   * The machine manager.
   */
  private final MachineManager manager = new MachineManager(this) {
    @Override
    public String getDriverName() {
      return "hyperv";
    }
    
    @Override
    public void appendDriverParameters(final StringBuilder sb) {
      boolean _isNotBlank = StringUtils.isNotBlank(ExecutableMachine_Microsoft_Hyper_V.this.virtual_switch);
      if (_isNotBlank) {
        StringBuilder _append = sb.append(" --hyperv-virtual-switch ");
        _append.append(ExecutableMachine_Microsoft_Hyper_V.this.virtual_switch);
      }
      String _string = Integer.valueOf(ExecutableMachine_Microsoft_Hyper_V.this.disk_size).toString();
      boolean _isNotBlank_1 = StringUtils.isNotBlank(_string);
      if (_isNotBlank_1) {
        StringBuilder _append_1 = sb.append(" --hyperv-disk-size ");
        _append_1.append(ExecutableMachine_Microsoft_Hyper_V.this.disk_size);
      }
      String _string_1 = Float.valueOf(ExecutableMachine_Microsoft_Hyper_V.this.memory).toString();
      boolean _isNotBlank_2 = StringUtils.isNotBlank(_string_1);
      if (_isNotBlank_2) {
        StringBuilder _append_2 = sb.append(" --hyperv-memory ");
        _append_2.append(ExecutableMachine_Microsoft_Hyper_V.this.memory);
      }
      String _string_2 = Integer.valueOf(ExecutableMachine_Microsoft_Hyper_V.this.cores).toString();
      boolean _isNotBlank_3 = StringUtils.isNotBlank(_string_2);
      if (_isNotBlank_3) {
        StringBuilder _append_3 = sb.append(" --hyperv-cpu-count ");
        _append_3.append(ExecutableMachine_Microsoft_Hyper_V.this.cores);
      }
      boolean _isNotBlank_4 = StringUtils.isNotBlank(ExecutableMachine_Microsoft_Hyper_V.this.static_macaddress);
      if (_isNotBlank_4) {
        StringBuilder _append_4 = sb.append(" --hyperv-static-macaddress ");
        _append_4.append(ExecutableMachine_Microsoft_Hyper_V.this.static_macaddress);
      }
      boolean _isNotBlank_5 = StringUtils.isNotBlank(ExecutableMachine_Microsoft_Hyper_V.this.vlan_id);
      if (_isNotBlank_5) {
        StringBuilder _append_5 = sb.append(" --hyperv-vlan-id ");
        _append_5.append(ExecutableMachine_Microsoft_Hyper_V.this.vlan_id);
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
