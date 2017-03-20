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
  private final MachineManager manager /* Skipped initializer because of errors */;
  
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
