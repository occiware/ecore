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
import org.occiware.clouddesigner.occi.docker.impl.Machine_Amazon_EC2Impl;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;

/**
 * This class implements executable Docker Machine on Amazon EC2.
 */
@SuppressWarnings("all")
public class ExecutableMachine_Amazon_EC2 extends Machine_Amazon_EC2Impl {
  /**
   * The machine manager.
   */
  private final MachineManager manager = new MachineManager(this) {
    public String getDriverName() {
      return "amazonec2";
    }
    
    public void appendDriverParameters(final StringBuilder sb) {
      Preconditions.<String>checkNotNull(ExecutableMachine_Amazon_EC2.this.access_key, "access_key is null");
      Preconditions.<String>checkNotNull(ExecutableMachine_Amazon_EC2.this.secret_key, "secret_key is null");
      Preconditions.<String>checkNotNull(ExecutableMachine_Amazon_EC2.this.vpc_id, "vpc_id is null");
      Preconditions.<String>checkNotNull(ExecutableMachine_Amazon_EC2.this.zone, "zone is null");
      boolean _isNotBlank = StringUtils.isNotBlank(ExecutableMachine_Amazon_EC2.this.access_key);
      if (_isNotBlank) {
        StringBuilder _append = sb.append(" --amazonec2-access-key ");
        _append.append(ExecutableMachine_Amazon_EC2.this.access_key);
      }
      boolean _isNotBlank_1 = StringUtils.isNotBlank(ExecutableMachine_Amazon_EC2.this.secret_key);
      if (_isNotBlank_1) {
        StringBuilder _append_1 = sb.append(" --amazonec2-secret-key ");
        _append_1.append(ExecutableMachine_Amazon_EC2.this.secret_key);
      }
      boolean _isNotBlank_2 = StringUtils.isNotBlank(ExecutableMachine_Amazon_EC2.this.vpc_id);
      if (_isNotBlank_2) {
        StringBuilder _append_2 = sb.append(" --amazonec2-vpc-id ");
        _append_2.append(ExecutableMachine_Amazon_EC2.this.vpc_id);
      }
      boolean _isNotBlank_3 = StringUtils.isNotBlank(ExecutableMachine_Amazon_EC2.this.zone);
      if (_isNotBlank_3) {
        StringBuilder _append_3 = sb.append(" --amazonec2-zone ");
        _append_3.append(ExecutableMachine_Amazon_EC2.this.zone);
      }
      boolean _isNotBlank_4 = StringUtils.isNotBlank(ExecutableMachine_Amazon_EC2.this.ami);
      if (_isNotBlank_4) {
        StringBuilder _append_4 = sb.append(" --amazonec2-ami ");
        _append_4.append(ExecutableMachine_Amazon_EC2.this.ami);
      }
      boolean _isNotBlank_5 = StringUtils.isNotBlank(ExecutableMachine_Amazon_EC2.this.region);
      if (_isNotBlank_5) {
        StringBuilder _append_5 = sb.append(" --amazonec2-region ");
        _append_5.append(ExecutableMachine_Amazon_EC2.this.region);
      }
      boolean _isNotBlank_6 = StringUtils.isNotBlank(ExecutableMachine_Amazon_EC2.this.instance_type);
      if (_isNotBlank_6) {
        StringBuilder _append_6 = sb.append(" --amazonec2-instance-type ");
        _append_6.append(ExecutableMachine_Amazon_EC2.this.instance_type);
      }
      if ((ExecutableMachine_Amazon_EC2.this.root_size > 0)) {
        StringBuilder _append_7 = sb.append(" --amazonec2-root-size ");
        _append_7.append(ExecutableMachine_Amazon_EC2.this.root_size);
      }
      boolean _isNotBlank_7 = StringUtils.isNotBlank(ExecutableMachine_Amazon_EC2.this.subnet_id);
      if (_isNotBlank_7) {
        StringBuilder _append_8 = sb.append(" --amazonec2-subnet-id ");
        _append_8.append(ExecutableMachine_Amazon_EC2.this.subnet_id);
      }
      boolean _isNotBlank_8 = StringUtils.isNotBlank(ExecutableMachine_Amazon_EC2.this.session_token);
      if (_isNotBlank_8) {
        StringBuilder _append_9 = sb.append(" --amazonec2-session-token ");
        _append_9.append(ExecutableMachine_Amazon_EC2.this.session_token);
      }
      boolean _isNotBlank_9 = StringUtils.isNotBlank(ExecutableMachine_Amazon_EC2.this.security_group);
      if (_isNotBlank_9) {
        StringBuilder _append_10 = sb.append(" --amazonec2-security-group ");
        _append_10.append(ExecutableMachine_Amazon_EC2.this.security_group);
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
