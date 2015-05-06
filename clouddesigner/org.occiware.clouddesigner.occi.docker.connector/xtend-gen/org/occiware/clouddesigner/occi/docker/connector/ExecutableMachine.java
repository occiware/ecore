/**
 * This file contains the OCCIware Docker connector.
 * 
 * This connector implements the causal link, i.e. synchronization, between Docker models and Docker engines.
 * 
 * Copyright 2015 - Inria
 * 
 * Contributors:
 * - Philippe Merle - Inria
 * - Fawaz PARAISO -Inria
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
