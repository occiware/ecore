/**
 * This file contains the OCCIware Docker connector.
 * 
 * This connector implements the causal link, i.e. synchronization, between Docker models and Docker engines.
 * 
 * Copyright 2015 - Inria
 * 
 * Contributors:
 * - Philippe Merle - Inria
 */
package org.occiware.clouddesigner.occi.docker.connector;

import org.occiware.clouddesigner.occi.docker.connector.ComputeStateMachine;
import org.occiware.clouddesigner.occi.docker.impl.ContainerImpl;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;

/**
 * This class implements an executable Docker container.
 */
@SuppressWarnings("all")
public class ExecutableContainer extends ContainerImpl {
  /**
   * Docker containers have a state machine.
   */
  private final ComputeStateMachine<org.occiware.clouddesigner.occi.docker.Container> stateMachine = new ComputeStateMachine<org.occiware.clouddesigner.occi.docker.Container>(this) {
    /**
     * Start the Docker container.
     */
    @Override
    public void start_execute() {
      System.out.println("EXECUTE container start");
    }
    
    /**
     * Stop the Docker container.
     */
    @Override
    public void stop_execute(final StopMethod method) {
      System.out.println("EXECUTE container stop");
    }
    
    /**
     * Restart the Docker container.
     */
    @Override
    public void restart_execute(final RestartMethod method) {
      System.out.println("EXECUTE container restart");
    }
    
    /**
     * Suspend the Docker container.
     */
    @Override
    public void suspend_execute(final SuspendMethod method) {
      System.out.println("EXECUTE container suspend");
    }
  };
  
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
