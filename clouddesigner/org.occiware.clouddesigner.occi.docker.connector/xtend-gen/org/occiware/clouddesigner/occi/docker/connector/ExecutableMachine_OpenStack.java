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
      boolean _isNotBlank = StringUtils.isNotBlank(ExecutableMachine_OpenStack.this.flavor_id);
      if (_isNotBlank) {
        StringBuilder _append_1 = sb.append(" --openstack-flavor-id ");
        _append_1.append(ExecutableMachine_OpenStack.this.flavor_id);
      }
      boolean _isNotBlank_1 = StringUtils.isNotBlank(ExecutableMachine_OpenStack.this.flavor_name);
      if (_isNotBlank_1) {
        StringBuilder _append_2 = sb.append(" --openstack-flavor-name ");
        _append_2.append(ExecutableMachine_OpenStack.this.flavor_name);
      }
      boolean _isNotBlank_2 = StringUtils.isNotBlank(ExecutableMachine_OpenStack.this.image_id);
      if (_isNotBlank_2) {
        StringBuilder _append_3 = sb.append(" --openstack-image-id ");
        _append_3.append(ExecutableMachine_OpenStack.this.image_id);
      }
      boolean _isNotBlank_3 = StringUtils.isNotBlank(ExecutableMachine_OpenStack.this.image_name);
      if (_isNotBlank_3) {
        StringBuilder _append_4 = sb.append(" --openstack-image-name ");
        _append_4.append(ExecutableMachine_OpenStack.this.image_name);
      }
      boolean _isNotBlank_4 = StringUtils.isNotBlank(ExecutableMachine_OpenStack.this.tenant_id);
      if (_isNotBlank_4) {
        StringBuilder _append_5 = sb.append(" --openstack-tenant-id ");
        _append_5.append(ExecutableMachine_OpenStack.this.tenant_id);
      }
      boolean _isNotBlank_5 = StringUtils.isNotBlank(ExecutableMachine_OpenStack.this.tenant_name);
      if (_isNotBlank_5) {
        StringBuilder _append_6 = sb.append(" --openstack-tenant-name ");
        _append_6.append(ExecutableMachine_OpenStack.this.tenant_name);
      }
      boolean _isNotBlank_6 = StringUtils.isNotBlank(ExecutableMachine_OpenStack.this.username);
      if (_isNotBlank_6) {
        StringBuilder _append_7 = sb.append(" --openstack-username ");
        _append_7.append(ExecutableMachine_OpenStack.this.username);
      }
      boolean _isNotBlank_7 = StringUtils.isNotBlank(ExecutableMachine_OpenStack.this.password);
      if (_isNotBlank_7) {
        StringBuilder _append_8 = sb.append(" --openstack-password ");
        _append_8.append(ExecutableMachine_OpenStack.this.password);
      }
      boolean _isNotBlank_8 = StringUtils.isNotBlank(ExecutableMachine_OpenStack.this.floatingip_pool);
      if (_isNotBlank_8) {
        StringBuilder _append_9 = sb.append(" --openstack-floatingip-pool ");
        _append_9.append(ExecutableMachine_OpenStack.this.floatingip_pool);
      }
      boolean _isNotBlank_9 = StringUtils.isNotBlank(ExecutableMachine_OpenStack.this.region);
      if (_isNotBlank_9) {
        StringBuilder _append_10 = sb.append(" --openstack-region ");
        _append_10.append(ExecutableMachine_OpenStack.this.region);
      }
      boolean _isNotBlank_10 = StringUtils.isNotBlank(ExecutableMachine_OpenStack.this.net_id);
      if (_isNotBlank_10) {
        StringBuilder _append_11 = sb.append(" --openstack-net-id ");
        _append_11.append(ExecutableMachine_OpenStack.this.net_id);
      }
      boolean _isNotBlank_11 = StringUtils.isNotBlank(ExecutableMachine_OpenStack.this.net_name);
      if (_isNotBlank_11) {
        StringBuilder _append_12 = sb.append(" --openstack-net-name ");
        _append_12.append(ExecutableMachine_OpenStack.this.net_name);
      }
      boolean _isNotBlank_12 = StringUtils.isNotBlank(ExecutableMachine_OpenStack.this.domain_id);
      if (_isNotBlank_12) {
        StringBuilder _append_13 = sb.append(" --openstack-domain-id ");
        _append_13.append(ExecutableMachine_OpenStack.this.domain_id);
      }
      boolean _isNotBlank_13 = StringUtils.isNotBlank(ExecutableMachine_OpenStack.this.domain_name);
      if (_isNotBlank_13) {
        StringBuilder _append_14 = sb.append(" --openstack-domain-name ");
        _append_14.append(ExecutableMachine_OpenStack.this.domain_name);
      }
      boolean _isNotBlank_14 = StringUtils.isNotBlank(ExecutableMachine_OpenStack.this.availability_zone);
      if (_isNotBlank_14) {
        StringBuilder _append_15 = sb.append(" --openstack-availability-zone ");
        _append_15.append(ExecutableMachine_OpenStack.this.availability_zone);
      }
      if ((ExecutableMachine_OpenStack.this.active_timeout != 200)) {
        StringBuilder _append_16 = sb.append(" --openstack-availability-zone ");
        _append_16.append(ExecutableMachine_OpenStack.this.active_timeout);
      }
      boolean _isNotBlank_15 = StringUtils.isNotBlank(ExecutableMachine_OpenStack.this.private_key_file);
      if (_isNotBlank_15) {
        StringBuilder _append_17 = sb.append(" --openstack-private-key-file ");
        _append_17.append(ExecutableMachine_OpenStack.this.private_key_file);
      }
      String _string = Integer.valueOf(ExecutableMachine_OpenStack.this.ssh_port).toString();
      boolean _isNotBlank_16 = StringUtils.isNotBlank(_string);
      if (_isNotBlank_16) {
        StringBuilder _append_18 = sb.append(" --openstack-ssh-port ");
        _append_18.append(ExecutableMachine_OpenStack.this.ssh_port);
      }
      boolean _isNotBlank_17 = StringUtils.isNotBlank(ExecutableMachine_OpenStack.this.ssh_user);
      if (_isNotBlank_17) {
        StringBuilder _append_19 = sb.append(" --openstack-ssh-user ");
        _append_19.append(ExecutableMachine_OpenStack.this.ssh_user);
      }
      if (ExecutableMachine_OpenStack.this.insecure) {
        StringBuilder _append_20 = sb.append(" --openstack-insecure ");
        _append_20.append(ExecutableMachine_OpenStack.this.insecure);
      }
      boolean _isNotBlank_18 = StringUtils.isNotBlank(ExecutableMachine_OpenStack.this.endpoint_type);
      if (_isNotBlank_18) {
        StringBuilder _append_21 = sb.append(" --openstack-endpoint-type ");
        _append_21.append(ExecutableMachine_OpenStack.this.endpoint_type);
      }
      boolean _isNotBlank_19 = StringUtils.isNotBlank(ExecutableMachine_OpenStack.this.sec_groups);
      if (_isNotBlank_19) {
        StringBuilder _append_22 = sb.append(" --openstack-sec-groups ");
        _append_22.append(ExecutableMachine_OpenStack.this.sec_groups);
      } else {
        StringBuilder _append_23 = sb.append(" --openstack-sec-groups ");
        _append_23.append("default");
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
