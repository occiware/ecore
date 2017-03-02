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

import com.google.common.base.Objects;
import org.occiware.clouddesigner.occi.docker.Network;
import org.occiware.clouddesigner.occi.infrastructure.NetworkStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class implements the state machine of a Network resource.
 */
@SuppressWarnings("all")
public class NetworkStateMachine<T extends Network> {
  private static Logger LOGGER = LoggerFactory.getLogger(NetworkStateMachine.class);
  
  /**
   * Reference to the Network resource.
   */
  protected T network;
  
  /**
   * Construct a network state machine for a given Network resource.
   */
  public NetworkStateMachine(final T n) {
    this.network = n;
  }
  
  /**
   * Create OCCI Action.
   */
  public void create() {
    Class<? extends NetworkStateMachine> _class = this.getClass();
    String _name = _class.getName();
    String _plus = (_name + ":create() - current state is ");
    NetworkStatus _state = this.network.getState();
    String _plus_1 = (_plus + _state);
    NetworkStateMachine.LOGGER.info(_plus_1);
    NetworkStatus _state_1 = this.network.getState();
    boolean _equals = Objects.equal(_state_1, NetworkStatus.INACTIVE);
    if (_equals) {
      Class<? extends NetworkStateMachine> _class_1 = this.getClass();
      String _name_1 = _class_1.getName();
      String _plus_2 = (_name_1 + ":create() - move from inactive to active state");
      NetworkStateMachine.LOGGER.info(_plus_2);
      this.create_from_inactive_state();
      this.network.setState(NetworkStatus.ACTIVE);
    } else {
      NetworkStatus _state_2 = this.network.getState();
      boolean _equals_1 = Objects.equal(_state_2, NetworkStatus.ACTIVE);
      if (_equals_1) {
        Class<? extends NetworkStateMachine> _class_2 = this.getClass();
        String _name_2 = _class_2.getName();
        String _plus_3 = (_name_2 + ":create() - already active state");
        NetworkStateMachine.LOGGER.info(_plus_3);
        this.create_from_active_state();
      } else {
        NetworkStatus _state_3 = this.network.getState();
        boolean _equals_2 = Objects.equal(_state_3, NetworkStatus.ERROR);
        if (_equals_2) {
          Class<? extends NetworkStateMachine> _class_3 = this.getClass();
          String _name_3 = _class_3.getName();
          String _plus_4 = (_name_3 + ":create() - move from error to active state");
          NetworkStateMachine.LOGGER.info(_plus_4);
          this.create_from_error_state();
          this.network.setState(NetworkStatus.ACTIVE);
        } else {
          throw new RuntimeException("Must never happen!");
        }
      }
    }
    Class<? extends NetworkStateMachine> _class_4 = this.getClass();
    String _name_4 = _class_4.getName();
    String _plus_5 = (_name_4 + ":create() - final state is ");
    NetworkStatus _state_4 = this.network.getState();
    String _plus_6 = (_plus_5 + _state_4);
    NetworkStateMachine.LOGGER.info(_plus_6);
    NetworkStatus _state_5 = this.network.getState();
    boolean _notEquals = (!Objects.equal(_state_5, NetworkStatus.ACTIVE));
    if (_notEquals) {
      throw new RuntimeException("Must never happen!");
    }
  }
  
  /**
   * This method implements the transition from error state for the create action.
   * 
   * By default, this method calls the error_execute method.
   */
  public void create_from_error_state() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  /**
   * This method implements the transition from active state for the create action.
   * 
   * By default, this method calls the create_execute method.
   */
  public void create_from_active_state() {
    this.create_execute();
  }
  
  /**
   * This method implements the transition from inactive state for the create action.
   * 
   * By default, this method calls the create_execute method.
   */
  public void create_from_inactive_state() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void create_execute() {
    Class<? extends NetworkStateMachine> _class = this.getClass();
    String _name = _class.getName();
    String _plus = (_name + ":create_execute() - DO NOTHING");
    NetworkStateMachine.LOGGER.info(_plus);
  }
}
