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
import org.occiware.clouddesigner.occi.docker.impl.Machine_Microsoft_AzureImpl;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;

/**
 * This class implements executable Docker Machine on Microsoft Azure.
 */
@SuppressWarnings("all")
public class ExecutableMachine_Microsoft_Azure extends Machine_Microsoft_AzureImpl {
  /**
   * The machine manager.
   */
  private final MachineManager manager = new MachineManager(this) {
    @Override
    public String getDriverName() {
      return "azure";
    }
    
    @Override
    public void appendDriverParameters(final StringBuilder sb) {
      Preconditions.<String>checkNotNull(ExecutableMachine_Microsoft_Azure.this.subscription_id, "subscription_id is null");
      Preconditions.<String>checkNotNull(ExecutableMachine_Microsoft_Azure.this.subscription_cert, "subscription_cert is null");
      boolean _isNotBlank = StringUtils.isNotBlank(ExecutableMachine_Microsoft_Azure.this.subscription_id);
      if (_isNotBlank) {
        StringBuilder _append = sb.append(" --azure-subscription-id ");
        _append.append(ExecutableMachine_Microsoft_Azure.this.subscription_id);
      }
      boolean _isNotBlank_1 = StringUtils.isNotBlank(ExecutableMachine_Microsoft_Azure.this.subscription_cert);
      if (_isNotBlank_1) {
        StringBuilder _append_1 = sb.append(" --azure-subscription-cert ");
        _append_1.append(ExecutableMachine_Microsoft_Azure.this.subscription_cert);
      }
      boolean _isNotBlank_2 = StringUtils.isNotBlank(ExecutableMachine_Microsoft_Azure.this.environment);
      if (_isNotBlank_2) {
        StringBuilder _append_2 = sb.append(" --azure-environment ");
        _append_2.append(ExecutableMachine_Microsoft_Azure.this.environment);
      }
      boolean _isNotBlank_3 = StringUtils.isNotBlank(ExecutableMachine_Microsoft_Azure.this.image);
      if (_isNotBlank_3) {
        StringBuilder _append_3 = sb.append(" --azure-image ");
        _append_3.append(ExecutableMachine_Microsoft_Azure.this.image);
      }
      boolean _isNotBlank_4 = StringUtils.isNotBlank(ExecutableMachine_Microsoft_Azure.this.location);
      if (_isNotBlank_4) {
        StringBuilder _append_4 = sb.append(" --azure-location ");
        _append_4.append(ExecutableMachine_Microsoft_Azure.this.location);
      }
      boolean _isNotBlank_5 = StringUtils.isNotBlank(ExecutableMachine_Microsoft_Azure.this.resource_group);
      if (_isNotBlank_5) {
        StringBuilder _append_5 = sb.append(" --azure-resource-group ");
        _append_5.append(ExecutableMachine_Microsoft_Azure.this.resource_group);
      }
      boolean _isNotBlank_6 = StringUtils.isNotBlank(ExecutableMachine_Microsoft_Azure.this.size);
      if (_isNotBlank_6) {
        StringBuilder _append_6 = sb.append(" --azure-size ");
        _append_6.append(ExecutableMachine_Microsoft_Azure.this.size);
      }
      boolean _isNotBlank_7 = StringUtils.isNotBlank(ExecutableMachine_Microsoft_Azure.this.ssh_user);
      if (_isNotBlank_7) {
        StringBuilder _append_7 = sb.append(" --azure-ssh-user ");
        _append_7.append(ExecutableMachine_Microsoft_Azure.this.ssh_user);
      }
      boolean _isNotBlank_8 = StringUtils.isNotBlank(ExecutableMachine_Microsoft_Azure.this.vnet);
      if (_isNotBlank_8) {
        StringBuilder _append_8 = sb.append(" --azure-vnet ");
        _append_8.append(ExecutableMachine_Microsoft_Azure.this.vnet);
      }
      boolean _isNotBlank_9 = StringUtils.isNotBlank(ExecutableMachine_Microsoft_Azure.this.subnet);
      if (_isNotBlank_9) {
        StringBuilder _append_9 = sb.append(" --azure-subnet ");
        _append_9.append(ExecutableMachine_Microsoft_Azure.this.subnet);
      }
      boolean _isNotBlank_10 = StringUtils.isNotBlank(ExecutableMachine_Microsoft_Azure.this.subnet_prefix);
      if (_isNotBlank_10) {
        StringBuilder _append_10 = sb.append(" --azure-subnet-prefix ");
        _append_10.append(ExecutableMachine_Microsoft_Azure.this.subnet_prefix);
      }
      boolean _isNotBlank_11 = StringUtils.isNotBlank(ExecutableMachine_Microsoft_Azure.this.availability_set);
      if (_isNotBlank_11) {
        StringBuilder _append_11 = sb.append(" --azure-availability-set ");
        _append_11.append(ExecutableMachine_Microsoft_Azure.this.availability_set);
      }
      String _string = Integer.valueOf(ExecutableMachine_Microsoft_Azure.this.open_port).toString();
      boolean _isNotBlank_12 = StringUtils.isNotBlank(_string);
      if (_isNotBlank_12) {
        StringBuilder _append_12 = sb.append(" --azure-open-port ");
        _append_12.append(ExecutableMachine_Microsoft_Azure.this.open_port);
      }
      boolean _isNotBlank_13 = StringUtils.isNotBlank(ExecutableMachine_Microsoft_Azure.this.private_ip_address);
      if (_isNotBlank_13) {
        StringBuilder _append_13 = sb.append(" --azure-private-ip-address ");
        _append_13.append(ExecutableMachine_Microsoft_Azure.this.private_ip_address);
      }
      boolean _isNotBlank_14 = StringUtils.isNotBlank(ExecutableMachine_Microsoft_Azure.this.use_private_ip);
      if (_isNotBlank_14) {
        StringBuilder _append_14 = sb.append(" --azure-use-private-ip ");
        _append_14.append(ExecutableMachine_Microsoft_Azure.this.use_private_ip);
      }
      boolean _isNotBlank_15 = StringUtils.isNotBlank(ExecutableMachine_Microsoft_Azure.this.no_public_ip);
      if (_isNotBlank_15) {
        StringBuilder _append_15 = sb.append(" --azure-no-public-ip ");
        _append_15.append(ExecutableMachine_Microsoft_Azure.this.no_public_ip);
      }
      boolean _isNotBlank_16 = StringUtils.isNotBlank(ExecutableMachine_Microsoft_Azure.this.static_public_ip);
      if (_isNotBlank_16) {
        StringBuilder _append_16 = sb.append(" --azure-static-public-ip ");
        _append_16.append(ExecutableMachine_Microsoft_Azure.this.static_public_ip);
      }
      String _string_1 = ExecutableMachine_Microsoft_Azure.this.docker_port.toString();
      boolean _isNotBlank_17 = StringUtils.isNotBlank(_string_1);
      if (_isNotBlank_17) {
        StringBuilder _append_17 = sb.append(" --azure-docker-port ");
        _append_17.append(ExecutableMachine_Microsoft_Azure.this.docker_port);
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
