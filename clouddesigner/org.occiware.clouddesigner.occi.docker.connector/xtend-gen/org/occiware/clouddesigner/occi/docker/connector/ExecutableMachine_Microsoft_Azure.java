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
