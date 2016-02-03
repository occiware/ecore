package org.occiware.clouddesigner.occi.cloud.connector;

import org.occiware.clouddesigner.occi.cloud.Machine;
import org.occiware.clouddesigner.occi.cloud.connector.ComputeStateMachine;
import org.occiware.clouddesigner.occi.cloud.impl.MachineImpl;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;

/**
 * This class implements an executable Docker machine.
 */
@SuppressWarnings("all")
public class ExecutableMachine extends MachineImpl {
  private final ComputeStateMachine<Machine> stateMachine = new ComputeStateMachine<Machine>(this);
  
  @Override
  public void start() {
    this.stateMachine.start();
  }
  
  @Override
  public void stop(final StopMethod method) {
    this.stateMachine.stop(method);
  }
  
  @Override
  public void restart(final RestartMethod method) {
    this.stateMachine.restart(method);
  }
  
  @Override
  public void suspend(final SuspendMethod method) {
    this.stateMachine.suspend(method);
  }
}
