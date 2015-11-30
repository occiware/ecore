/**
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe MERLE
 * 	- Fawaz PARAISO
 */
package org.occiware.clouddesigner.occi.docker.connector;

import com.google.common.base.Preconditions;
import org.apache.commons.lang.StringUtils;
import org.occiware.clouddesigner.occi.docker.connector.MachineManager;
import org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;

/**
 * This class implements executable Docker Machine on OpenStack.
 */
@SuppressWarnings("all")
public class ExecutableMachine_OpenStack extends Machine_OpenStackImpl {
  /**
   * The machine manager.
   */
  private final MachineManager manager = new MachineManager(this) {
    @Override
    public String getDriverName() {
      return "openstack";
    }
    
    @Override
    public void appendDriverParameters(final StringBuilder sb) {
      Preconditions.<String>checkNotNull(ExecutableMachine_OpenStack.this.auth_url, "auth_url is null");
      Preconditions.<String>checkNotNull(ExecutableMachine_OpenStack.this.flavor_id, "flavor_id is null");
      Preconditions.<String>checkNotNull(ExecutableMachine_OpenStack.this.image_id, "image_id is null");
      Preconditions.<String>checkNotNull(ExecutableMachine_OpenStack.this.tenant_id, "tenant_id is null");
      Preconditions.<String>checkNotNull(ExecutableMachine_OpenStack.this.tenant_name, "tenant_name is null");
      Preconditions.<String>checkNotNull(ExecutableMachine_OpenStack.this.username, "username is null");
      Preconditions.<String>checkNotNull(ExecutableMachine_OpenStack.this.password, "password is null");
      Preconditions.<String>checkNotNull(ExecutableMachine_OpenStack.this.floatingip_pool, "floatingip_pool is null");
      boolean _isEmpty = ExecutableMachine_OpenStack.this.auth_url.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        StringBuilder _append = sb.append(" --openstack-auth-url ");
        _append.append(ExecutableMachine_OpenStack.this.auth_url);
      }
      boolean _isEmpty_1 = ExecutableMachine_OpenStack.this.flavor_id.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        StringBuilder _append_1 = sb.append(" --openstack-flavor-id ");
        _append_1.append(ExecutableMachine_OpenStack.this.flavor_id);
      }
      boolean _isEmpty_2 = ExecutableMachine_OpenStack.this.image_id.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        StringBuilder _append_2 = sb.append(" --openstack-image-id ");
        _append_2.append(ExecutableMachine_OpenStack.this.image_id);
      }
      boolean _isEmpty_3 = ExecutableMachine_OpenStack.this.tenant_id.isEmpty();
      boolean _not_3 = (!_isEmpty_3);
      if (_not_3) {
        StringBuilder _append_3 = sb.append(" --openstack-tenant-id ");
        _append_3.append(ExecutableMachine_OpenStack.this.tenant_id);
      }
      boolean _isEmpty_4 = ExecutableMachine_OpenStack.this.tenant_name.isEmpty();
      boolean _not_4 = (!_isEmpty_4);
      if (_not_4) {
        StringBuilder _append_4 = sb.append(" --openstack-tenant-name ");
        _append_4.append(ExecutableMachine_OpenStack.this.tenant_name);
      }
      boolean _isEmpty_5 = ExecutableMachine_OpenStack.this.username.isEmpty();
      boolean _not_5 = (!_isEmpty_5);
      if (_not_5) {
        StringBuilder _append_5 = sb.append(" --openstack-username ");
        _append_5.append(ExecutableMachine_OpenStack.this.username);
      }
      boolean _isEmpty_6 = ExecutableMachine_OpenStack.this.password.isEmpty();
      boolean _not_6 = (!_isEmpty_6);
      if (_not_6) {
        StringBuilder _append_6 = sb.append(" --openstack-password ");
        _append_6.append(ExecutableMachine_OpenStack.this.password);
      }
      boolean _isEmpty_7 = ExecutableMachine_OpenStack.this.floatingip_pool.isEmpty();
      boolean _not_7 = (!_isEmpty_7);
      if (_not_7) {
        StringBuilder _append_7 = sb.append(" --openstack-floatingip-pool ");
        _append_7.append(ExecutableMachine_OpenStack.this.floatingip_pool);
      }
      boolean _isNotBlank = StringUtils.isNotBlank(ExecutableMachine_OpenStack.this.region);
      if (_isNotBlank) {
        StringBuilder _append_8 = sb.append(" --openstack-region ");
        _append_8.append(ExecutableMachine_OpenStack.this.region);
      }
      boolean _isNotBlank_1 = StringUtils.isNotBlank(ExecutableMachine_OpenStack.this.net_id);
      if (_isNotBlank_1) {
        StringBuilder _append_9 = sb.append(" --openstack-net-id ");
        _append_9.append(ExecutableMachine_OpenStack.this.net_id);
      }
      boolean _isNotBlank_2 = StringUtils.isNotBlank(ExecutableMachine_OpenStack.this.sec_groups);
      if (_isNotBlank_2) {
        StringBuilder _append_10 = sb.append(" --openstack-sec-groups ");
        _append_10.append(ExecutableMachine_OpenStack.this.sec_groups);
      } else {
        StringBuilder _append_11 = sb.append(" --openstack-sec-groups ");
        _append_11.append("default");
      }
      StringBuilder _append_12 = sb.append(" --openstack-ssh-user ");
      _append_12.append("ubuntu");
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
