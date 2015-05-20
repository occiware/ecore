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

import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.connector.ComputeStateMachine;
import org.occiware.clouddesigner.occi.docker.impl.MachineImpl;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;

/**
 * This class implements an executable Docker machine.
 */
@SuppressWarnings("all")
public class ExecutableMachine extends MachineImpl {
  private final ComputeStateMachine<Machine> stateMachine = new ComputeStateMachine<Machine>(this);
  
  public void start() {
    this.stateMachine.start();
  }
  
  public void stop(final StopMethod method) {
    this.stateMachine.stop(method);
  }
  
  public void restart(final RestartMethod method) {
    this.stateMachine.restart(method);
  }
  
  public void suspend(final SuspendMethod method) {
    this.stateMachine.suspend(method);
  }
}
