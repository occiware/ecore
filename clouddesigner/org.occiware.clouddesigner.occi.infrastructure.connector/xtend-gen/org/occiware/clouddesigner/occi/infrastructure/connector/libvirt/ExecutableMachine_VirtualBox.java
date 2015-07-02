/**
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	- Fawaz PARAISO
 * 	- Philippe MERELE
 */
package org.occiware.clouddesigner.occi.infrastructure.connector.libvirt;

import hypervisor.impl.Machine_VirtualBoxImpl;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;
import org.occiware.clouddesigner.occi.infrastructure.connector.libvirt.LibvirtManager;

@SuppressWarnings("all")
public class ExecutableMachine_VirtualBox extends Machine_VirtualBoxImpl {
  protected String driver = "vbox";
  
  /**
   * The hypervisor manager.
   */
  private final LibvirtManager manager = new LibvirtManager(this) {
    @Override
    public String getDriver() {
      return "vbox";
    }
    
    @Override
    public void appendHypervisorParameters(final String sb) {
      throw new UnsupportedOperationException();
    }
  };
  
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
  
  public String getDriver() {
    return this.manager.getDriver();
  }
}
