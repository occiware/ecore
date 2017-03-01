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
import org.occiware.clouddesigner.occi.docker.impl.Machine_IBM_SoftLayerImpl;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;

/**
 * This class implements executable Docker Machine on IBM SoftLayer.
 */
@SuppressWarnings("all")
public class ExecutableMachine_IBM_SoftLayer extends Machine_IBM_SoftLayerImpl {
  /**
   * The machine manager.
   */
  private final MachineManager manager = new MachineManager(this) {
    @Override
    public String getDriverName() {
      return "softlayer";
    }
    
    @Override
    public void appendDriverParameters(final StringBuilder sb) {
      boolean _isNotBlank = StringUtils.isNotBlank(ExecutableMachine_IBM_SoftLayer.this.user);
      if (_isNotBlank) {
        StringBuilder _append = sb.append(" --softlayer-user ");
        _append.append(ExecutableMachine_IBM_SoftLayer.this.user);
      }
      boolean _isNotBlank_1 = StringUtils.isNotBlank(ExecutableMachine_IBM_SoftLayer.this.domain);
      if (_isNotBlank_1) {
        StringBuilder _append_1 = sb.append(" --softlayer-domain ");
        _append_1.append(ExecutableMachine_IBM_SoftLayer.this.domain);
      }
      boolean _isNotBlank_2 = StringUtils.isNotBlank(ExecutableMachine_IBM_SoftLayer.this.api_endpoint);
      if (_isNotBlank_2) {
        StringBuilder _append_2 = sb.append(" --softlayer-api-endpoint ");
        _append_2.append(ExecutableMachine_IBM_SoftLayer.this.api_endpoint);
      }
      boolean _isNotBlank_3 = StringUtils.isNotBlank(ExecutableMachine_IBM_SoftLayer.this.api_key);
      if (_isNotBlank_3) {
        StringBuilder _append_3 = sb.append(" --softlayer-api-key ");
        _append_3.append(ExecutableMachine_IBM_SoftLayer.this.api_key);
      }
      if ((ExecutableMachine_IBM_SoftLayer.this.cpu > 0)) {
        StringBuilder _append_4 = sb.append(" --softlayer-cpu ");
        _append_4.append(ExecutableMachine_IBM_SoftLayer.this.cpu);
      }
      if ((ExecutableMachine_IBM_SoftLayer.this.disk_size > 0)) {
        StringBuilder _append_5 = sb.append(" --softlayer-disk-size ");
        _append_5.append(ExecutableMachine_IBM_SoftLayer.this.disk_size);
      }
      if ((ExecutableMachine_IBM_SoftLayer.this.memory > 0)) {
        StringBuilder _append_6 = sb.append(" --softlayer-memory ");
        _append_6.append(ExecutableMachine_IBM_SoftLayer.this.memory);
      }
      boolean _isNotBlank_4 = StringUtils.isNotBlank(ExecutableMachine_IBM_SoftLayer.this.hostname);
      if (_isNotBlank_4) {
        StringBuilder _append_7 = sb.append(" --softlayer-hostname ");
        _append_7.append(ExecutableMachine_IBM_SoftLayer.this.hostname);
      }
      boolean _isNotBlank_5 = StringUtils.isNotBlank(ExecutableMachine_IBM_SoftLayer.this.image);
      if (_isNotBlank_5) {
        StringBuilder _append_8 = sb.append(" --softlayer-image ");
        _append_8.append(ExecutableMachine_IBM_SoftLayer.this.image);
      }
      boolean _isNotBlank_6 = StringUtils.isNotBlank(ExecutableMachine_IBM_SoftLayer.this.public_vlan_id);
      if (_isNotBlank_6) {
        StringBuilder _append_9 = sb.append(" --softlayer-public-vlan-id ");
        _append_9.append(ExecutableMachine_IBM_SoftLayer.this.public_vlan_id);
      }
      boolean _isNotBlank_7 = StringUtils.isNotBlank(ExecutableMachine_IBM_SoftLayer.this.private_vlan_id);
      if (_isNotBlank_7) {
        StringBuilder _append_10 = sb.append(" --softlayer-private-vlan-id ");
        _append_10.append(ExecutableMachine_IBM_SoftLayer.this.private_vlan_id);
      }
      boolean _isNotBlank_8 = StringUtils.isNotBlank(ExecutableMachine_IBM_SoftLayer.this.region);
      if (_isNotBlank_8) {
        StringBuilder _append_11 = sb.append(" --softlayer-region ");
        _append_11.append(ExecutableMachine_IBM_SoftLayer.this.region);
      }
      if (ExecutableMachine_IBM_SoftLayer.this.private_net_only) {
        StringBuilder _append_12 = sb.append(" --softlayer-private-net-only ");
        _append_12.append(ExecutableMachine_IBM_SoftLayer.this.private_net_only);
      }
      if (ExecutableMachine_IBM_SoftLayer.this.local_disk) {
        StringBuilder _append_13 = sb.append(" --softlayer-local-disk ");
        _append_13.append(ExecutableMachine_IBM_SoftLayer.this.local_disk);
      }
      if (ExecutableMachine_IBM_SoftLayer.this.private_net_only) {
        StringBuilder _append_14 = sb.append(" --softlayer-private-net-only ");
        _append_14.append(ExecutableMachine_IBM_SoftLayer.this.private_net_only);
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
